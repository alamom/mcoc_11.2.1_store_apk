package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import com.google.android.gms.internal.d.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class i
  extends dg
{
  private static final String ID = a.ay.toString();
  private static final String URL = b.eX.toString();
  private static final String anV = b.bl.toString();
  private static final String anW = b.eW.toString();
  static final String anX = "gtm_" + ID + "_unrepeatable";
  private static final Set<String> anY = new HashSet();
  private final a anZ;
  private final Context mContext;
  
  public i(Context paramContext)
  {
    this(paramContext, new a()
    {
      public aq nO()
      {
        return y.X(i.this);
      }
    });
  }
  
  i(Context paramContext, a parama)
  {
    super(ID, new String[] { URL });
    this.anZ = parama;
    this.mContext = paramContext;
  }
  
  private boolean cj(String paramString)
  {
    boolean bool1 = true;
    for (;;)
    {
      try
      {
        boolean bool2 = cl(paramString);
        if (bool2) {
          return bool1;
        }
        if (ck(paramString)) {
          anY.add(paramString);
        } else {
          bool1 = false;
        }
      }
      finally {}
    }
  }
  
  public void E(Map<String, d.a> paramMap)
  {
    String str;
    if (paramMap.get(anW) != null)
    {
      str = di.j((d.a)paramMap.get(anW));
      if ((str == null) || (!cj(str))) {
        break label46;
      }
    }
    for (;;)
    {
      return;
      str = null;
      break;
      label46:
      Uri.Builder localBuilder = Uri.parse(di.j((d.a)paramMap.get(URL))).buildUpon();
      paramMap = (d.a)paramMap.get(anV);
      if (paramMap != null)
      {
        paramMap = di.o(paramMap);
        if (!(paramMap instanceof List))
        {
          bh.T("ArbitraryPixel: additional params not a list: not sending partial hit: " + localBuilder.build().toString());
          continue;
        }
        paramMap = ((List)paramMap).iterator();
        for (;;)
        {
          if (!paramMap.hasNext()) {
            break label261;
          }
          Object localObject = paramMap.next();
          if (!(localObject instanceof Map))
          {
            bh.T("ArbitraryPixel: additional params contains non-map: not sending partial hit: " + localBuilder.build().toString());
            break;
          }
          Iterator localIterator = ((Map)localObject).entrySet().iterator();
          while (localIterator.hasNext())
          {
            localObject = (Map.Entry)localIterator.next();
            localBuilder.appendQueryParameter(((Map.Entry)localObject).getKey().toString(), ((Map.Entry)localObject).getValue().toString());
          }
        }
      }
      label261:
      paramMap = localBuilder.build().toString();
      this.anZ.nO().cz(paramMap);
      bh.V("ArbitraryPixel: url = " + paramMap);
      if (str == null) {
        continue;
      }
      try
      {
        anY.add(str);
        cz.a(this.mContext, anX, str, "true");
      }
      finally {}
    }
  }
  
  boolean ck(String paramString)
  {
    return this.mContext.getSharedPreferences(anX, 0).contains(paramString);
  }
  
  boolean cl(String paramString)
  {
    return anY.contains(paramString);
  }
  
  public static abstract interface a
  {
    public abstract aq nO();
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\tagmanager\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */