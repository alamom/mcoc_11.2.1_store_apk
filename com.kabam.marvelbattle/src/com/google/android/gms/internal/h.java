package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public abstract class h
  implements g
{
  protected MotionEvent kw;
  protected DisplayMetrics kx;
  protected m ky;
  private n kz;
  
  protected h(Context paramContext, m paramm, n paramn)
  {
    this.ky = paramm;
    this.kz = paramn;
    try
    {
      this.kx = paramContext.getResources().getDisplayMetrics();
      return;
    }
    catch (UnsupportedOperationException paramContext)
    {
      for (;;)
      {
        this.kx = new DisplayMetrics();
        this.kx.density = 1.0F;
      }
    }
  }
  
  /* Error */
  private String a(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 58	com/google/android/gms/internal/h:t	()V
    //   6: iload_3
    //   7: ifeq +27 -> 34
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual 62	com/google/android/gms/internal/h:c	(Landroid/content/Context;)V
    //   15: aload_0
    //   16: invokespecial 66	com/google/android/gms/internal/h:u	()[B
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: arraylength
    //   24: ifne +33 -> 57
    //   27: iconst_5
    //   28: invokestatic 72	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   31: astore_1
    //   32: aload_1
    //   33: areturn
    //   34: aload_0
    //   35: aload_1
    //   36: invokevirtual 75	com/google/android/gms/internal/h:b	(Landroid/content/Context;)V
    //   39: goto -24 -> 15
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    //   47: astore_1
    //   48: bipush 7
    //   50: invokestatic 72	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   53: astore_1
    //   54: goto -22 -> 32
    //   57: aload_0
    //   58: aload_1
    //   59: aload_2
    //   60: invokevirtual 78	com/google/android/gms/internal/h:a	([BLjava/lang/String;)Ljava/lang/String;
    //   63: astore_1
    //   64: goto -32 -> 32
    //   67: astore_1
    //   68: bipush 7
    //   70: invokestatic 72	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   73: astore_1
    //   74: goto -42 -> 32
    //   77: astore_1
    //   78: iconst_3
    //   79: invokestatic 72	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   82: astore_1
    //   83: goto -51 -> 32
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	h
    //   0	86	1	paramContext	Context
    //   0	86	2	paramString	String
    //   0	86	3	paramBoolean	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	42	finally
    //   10	15	42	finally
    //   15	22	42	finally
    //   34	39	42	finally
    //   43	45	42	finally
    //   0	2	47	java/security/NoSuchAlgorithmException
    //   22	32	47	java/security/NoSuchAlgorithmException
    //   45	47	47	java/security/NoSuchAlgorithmException
    //   57	64	47	java/security/NoSuchAlgorithmException
    //   0	2	67	java/io/UnsupportedEncodingException
    //   22	32	67	java/io/UnsupportedEncodingException
    //   45	47	67	java/io/UnsupportedEncodingException
    //   57	64	67	java/io/UnsupportedEncodingException
    //   0	2	77	java/io/IOException
    //   22	32	77	java/io/IOException
    //   45	47	77	java/io/IOException
    //   57	64	77	java/io/IOException
  }
  
  private void t()
  {
    this.kz.reset();
  }
  
  private byte[] u()
    throws IOException
  {
    return this.kz.A();
  }
  
  public String a(Context paramContext)
  {
    return a(paramContext, null, false);
  }
  
  public String a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, true);
  }
  
  String a(byte[] paramArrayOfByte, String paramString)
    throws NoSuchAlgorithmException, UnsupportedEncodingException, IOException
  {
    Object localObject = paramArrayOfByte;
    if (paramArrayOfByte.length > 239)
    {
      t();
      a(20, 1L);
      localObject = u();
    }
    if (localObject.length < 239)
    {
      paramArrayOfByte = new byte[239 - localObject.length];
      new SecureRandom().nextBytes(paramArrayOfByte);
    }
    for (paramArrayOfByte = ByteBuffer.allocate(240).put((byte)localObject.length).put((byte[])localObject).put(paramArrayOfByte).array();; paramArrayOfByte = ByteBuffer.allocate(240).put((byte)localObject.length).put((byte[])localObject).array())
    {
      localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramArrayOfByte);
      localObject = ((MessageDigest)localObject).digest();
      localObject = ByteBuffer.allocate(256).put((byte[])localObject).put(paramArrayOfByte).array();
      paramArrayOfByte = new byte['Ā'];
      new f().a((byte[])localObject, paramArrayOfByte);
      if ((paramString != null) && (paramString.length() > 0)) {
        a(paramString, paramArrayOfByte);
      }
      return this.ky.a(paramArrayOfByte, true);
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.kw != null) {
      this.kw.recycle();
    }
    this.kw = MotionEvent.obtain(0L, paramInt3, 1, paramInt1 * this.kx.density, paramInt2 * this.kx.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
  }
  
  protected void a(int paramInt, long paramLong)
    throws IOException
  {
    this.kz.b(paramInt, paramLong);
  }
  
  protected void a(int paramInt, String paramString)
    throws IOException
  {
    this.kz.b(paramInt, paramString);
  }
  
  public void a(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 1)
    {
      if (this.kw != null) {
        this.kw.recycle();
      }
      this.kw = MotionEvent.obtain(paramMotionEvent);
    }
  }
  
  void a(String paramString, byte[] paramArrayOfByte)
    throws UnsupportedEncodingException
  {
    String str = paramString;
    if (paramString.length() > 32) {
      str = paramString.substring(0, 32);
    }
    new pe(str.getBytes("UTF-8")).o(paramArrayOfByte);
  }
  
  protected abstract void b(Context paramContext);
  
  protected abstract void c(Context paramContext);
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\internal\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */