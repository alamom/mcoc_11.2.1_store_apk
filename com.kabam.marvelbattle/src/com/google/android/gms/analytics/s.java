package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.hb;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

class s
  extends Thread
  implements f
{
  private static s yX;
  private volatile boolean mClosed = false;
  private final Context mContext;
  private final LinkedBlockingQueue<Runnable> yT = new LinkedBlockingQueue();
  private volatile boolean yU = false;
  private volatile List<hb> yV;
  private volatile String yW;
  private volatile af yY;
  
  private s(Context paramContext)
  {
    super("GAThread");
    if (paramContext != null) {}
    for (this.mContext = paramContext.getApplicationContext();; this.mContext = paramContext)
    {
      start();
      return;
    }
  }
  
  static s B(Context paramContext)
  {
    if (yX == null) {
      yX = new s(paramContext);
    }
    return yX;
  }
  
  static String C(Context paramContext)
  {
    localObject1 = null;
    for (;;)
    {
      try
      {
        localObject2 = paramContext.openFileInput("gaInstallData");
        localObject3 = new byte[' '];
        i = ((FileInputStream)localObject2).read((byte[])localObject3, 0, 8192);
        if (((FileInputStream)localObject2).available() <= 0) {
          continue;
        }
        z.T("Too much campaign data, ignoring it.");
        ((FileInputStream)localObject2).close();
        paramContext.deleteFile("gaInstallData");
        paramContext = (Context)localObject1;
      }
      catch (FileNotFoundException paramContext)
      {
        int i;
        z.U("No campaign data found.");
        paramContext = (Context)localObject1;
        continue;
        Object localObject2 = new java/lang/String;
        ((String)localObject2).<init>((byte[])localObject3, 0, i);
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        z.U("Campaign found: " + (String)localObject2);
        paramContext = (Context)localObject2;
        continue;
      }
      catch (IOException localIOException)
      {
        z.T("Error reading campaign data.");
        paramContext.deleteFile("gaInstallData");
        paramContext = (Context)localObject1;
        continue;
      }
      return paramContext;
      ((FileInputStream)localObject2).close();
      paramContext.deleteFile("gaInstallData");
      if (i > 0) {
        continue;
      }
      z.W("Campaign file is empty.");
      paramContext = (Context)localObject1;
    }
  }
  
  static int ah(String paramString)
  {
    int k = 1;
    if (!TextUtils.isEmpty(paramString))
    {
      int j = paramString.length();
      int i = 0;
      j--;
      for (;;)
      {
        k = i;
        if (j < 0) {
          break;
        }
        k = paramString.charAt(j);
        k = (i << 6 & 0xFFFFFFF) + k + (k << 14);
        int m = 0xFE00000 & k;
        i = k;
        if (m != 0) {
          i = k ^ m >> 21;
        }
        j--;
      }
    }
    return k;
  }
  
  private String g(Throwable paramThrowable)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
    paramThrowable.printStackTrace(localPrintStream);
    localPrintStream.flush();
    return new String(localByteArrayOutputStream.toByteArray());
  }
  
  private String v(Map<String, String> paramMap)
  {
    if (paramMap.containsKey("useSecure")) {
      if (aj.e((String)paramMap.get("useSecure"), true)) {
        paramMap = "https:";
      }
    }
    for (;;)
    {
      return paramMap;
      paramMap = "http:";
      continue;
      paramMap = "https:";
    }
  }
  
  private boolean w(Map<String, String> paramMap)
  {
    boolean bool;
    if (paramMap.get("&sf") == null) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      double d = aj.a((String)paramMap.get("&sf"), 100.0D);
      if (d >= 100.0D)
      {
        bool = false;
      }
      else
      {
        if (ah((String)paramMap.get("&cid")) % 10000 >= d * 100.0D)
        {
          if (paramMap.get("&t") == null) {}
          for (paramMap = "unknown";; paramMap = (String)paramMap.get("&t"))
          {
            z.V(String.format("%s hit sampled out", new Object[] { paramMap }));
            bool = true;
            break;
          }
        }
        bool = false;
      }
    }
  }
  
  private void x(Map<String, String> paramMap)
  {
    l locall = a.w(this.mContext);
    aj.a(paramMap, "&adid", locall);
    aj.a(paramMap, "&ate", locall);
  }
  
  private void y(Map<String, String> paramMap)
  {
    g localg = g.dP();
    aj.a(paramMap, "&an", localg);
    aj.a(paramMap, "&av", localg);
    aj.a(paramMap, "&aid", localg);
    aj.a(paramMap, "&aiid", localg);
    paramMap.put("&v", "1");
  }
  
  void b(Runnable paramRunnable)
  {
    this.yT.add(paramRunnable);
  }
  
  public void dH()
  {
    b(new Runnable()
    {
      public void run()
      {
        s.d(s.this).dH();
      }
    });
  }
  
  public void dN()
  {
    b(new Runnable()
    {
      public void run()
      {
        s.d(s.this).dN();
      }
    });
  }
  
  public LinkedBlockingQueue<Runnable> dO()
  {
    return this.yT;
  }
  
  public void dispatch()
  {
    b(new Runnable()
    {
      public void run()
      {
        s.d(s.this).dispatch();
      }
    });
  }
  
  public Thread getThread()
  {
    return this;
  }
  
  protected void init()
  {
    this.yY.eg();
    this.yV = new ArrayList();
    this.yV.add(new hb("appendVersion", "&_v".substring(1), "ma4.0.3"));
    this.yV.add(new hb("appendQueueTime", "&qt".substring(1), null));
    this.yV.add(new hb("appendCacheBuster", "&z".substring(1), null));
  }
  
  public void run()
  {
    Process.setThreadPriority(10);
    try
    {
      Thread.sleep(5000L);
      for (;;)
      {
        try
        {
          if (this.yY == null)
          {
            localObject = new com/google/android/gms/analytics/r;
            ((r)localObject).<init>(this.mContext, this);
            this.yY = ((af)localObject);
          }
          init();
          this.yW = C(this.mContext);
          z.V("Initialized GA Thread");
        }
        catch (Throwable localThrowable2)
        {
          Object localObject;
          z.T("Error initializing the GAThread: " + g(localThrowable2));
          z.T("Google Analytics will not start up.");
          this.yU = true;
          continue;
        }
        if (this.mClosed) {
          return;
        }
        try
        {
          localObject = (Runnable)this.yT.take();
          if (!this.yU) {
            ((Runnable)localObject).run();
          }
        }
        catch (InterruptedException localInterruptedException1)
        {
          z.U(localInterruptedException1.toString());
        }
        catch (Throwable localThrowable1)
        {
          z.T("Error on GAThread: " + g(localThrowable1));
          z.T("Google Analytics is shutting down.");
          this.yU = true;
        }
      }
    }
    catch (InterruptedException localInterruptedException2)
    {
      for (;;)
      {
        z.W("sleep interrupted in GAThread initialize");
      }
    }
  }
  
  public void u(Map<String, String> paramMap)
  {
    final HashMap localHashMap = new HashMap(paramMap);
    String str = (String)paramMap.get("&ht");
    paramMap = str;
    if (str != null) {}
    try
    {
      Long.valueOf(str);
      paramMap = str;
    }
    catch (NumberFormatException paramMap)
    {
      for (;;)
      {
        paramMap = null;
      }
    }
    if (paramMap == null) {
      localHashMap.put("&ht", Long.toString(System.currentTimeMillis()));
    }
    b(new Runnable()
    {
      public void run()
      {
        s.a(s.this, localHashMap);
        if (TextUtils.isEmpty((CharSequence)localHashMap.get("&cid"))) {
          localHashMap.put("&cid", h.dQ().getValue("&cid"));
        }
        if ((GoogleAnalytics.getInstance(s.a(s.this)).getAppOptOut()) || (s.b(s.this, localHashMap))) {}
        for (;;)
        {
          return;
          if (!TextUtils.isEmpty(s.b(s.this)))
          {
            t.ep().B(true);
            localHashMap.putAll(new HitBuilders.HitBuilder().setCampaignParamsFromUrl(s.b(s.this)).build());
            t.ep().B(false);
            s.a(s.this, null);
          }
          s.c(s.this, localHashMap);
          Map localMap = x.z(localHashMap);
          s.d(s.this).b(localMap, Long.valueOf((String)localHashMap.get("&ht")).longValue(), s.d(s.this, localHashMap), s.c(s.this));
        }
      }
    });
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\analytics\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */