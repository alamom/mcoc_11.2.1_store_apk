package com.google.android.gms.internal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class pg
{
  private final int awI;
  private final byte[] buffer;
  private int position;
  
  private pg(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.buffer = paramArrayOfByte;
    this.position = paramInt1;
    this.awI = (paramInt1 + paramInt2);
  }
  
  public static int D(long paramLong)
  {
    return G(paramLong);
  }
  
  public static int E(long paramLong)
  {
    return G(I(paramLong));
  }
  
  public static int G(long paramLong)
  {
    int i;
    if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L) {
      i = 1;
    }
    for (;;)
    {
      return i;
      if ((0xFFFFFFFFFFFFC000 & paramLong) == 0L) {
        i = 2;
      } else if ((0xFFFFFFFFFFE00000 & paramLong) == 0L) {
        i = 3;
      } else if ((0xFFFFFFFFF0000000 & paramLong) == 0L) {
        i = 4;
      } else if ((0xFFFFFFF800000000 & paramLong) == 0L) {
        i = 5;
      } else if ((0xFFFFFC0000000000 & paramLong) == 0L) {
        i = 6;
      } else if ((0xFFFE000000000000 & paramLong) == 0L) {
        i = 7;
      } else if ((0xFF00000000000000 & paramLong) == 0L) {
        i = 8;
      } else if ((0x8000000000000000 & paramLong) == 0L) {
        i = 9;
      } else {
        i = 10;
      }
    }
  }
  
  public static long I(long paramLong)
  {
    return paramLong << 1 ^ paramLong >> 63;
  }
  
  public static int V(boolean paramBoolean)
  {
    return 1;
  }
  
  public static int b(int paramInt, double paramDouble)
  {
    return gz(paramInt) + f(paramDouble);
  }
  
  public static int b(int paramInt, pn parampn)
  {
    return gz(paramInt) * 2 + d(parampn);
  }
  
  public static int b(int paramInt, byte[] paramArrayOfByte)
  {
    return gz(paramInt) + s(paramArrayOfByte);
  }
  
  public static pg b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new pg(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static int c(int paramInt, float paramFloat)
  {
    return gz(paramInt) + e(paramFloat);
  }
  
  public static int c(int paramInt, pn parampn)
  {
    return gz(paramInt) + e(parampn);
  }
  
  public static int c(int paramInt, boolean paramBoolean)
  {
    return gz(paramInt) + V(paramBoolean);
  }
  
  public static int d(int paramInt, long paramLong)
  {
    return gz(paramInt) + D(paramLong);
  }
  
  public static int d(pn parampn)
  {
    return parampn.qI();
  }
  
  public static int di(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("UTF-8");
      int i = gB(paramString.length);
      int j = paramString.length;
      return j + i;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException("UTF-8 not supported.");
    }
  }
  
  public static int e(float paramFloat)
  {
    return 4;
  }
  
  public static int e(int paramInt, long paramLong)
  {
    return gz(paramInt) + E(paramLong);
  }
  
  public static int e(pn parampn)
  {
    int i = parampn.qI();
    return i + gB(i);
  }
  
  public static int f(double paramDouble)
  {
    return 8;
  }
  
  public static int gB(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      paramInt = 1;
    }
    for (;;)
    {
      return paramInt;
      if ((paramInt & 0xC000) == 0) {
        paramInt = 2;
      } else if ((0xFFE00000 & paramInt) == 0) {
        paramInt = 3;
      } else if ((0xF0000000 & paramInt) == 0) {
        paramInt = 4;
      } else {
        paramInt = 5;
      }
    }
  }
  
  public static int gD(int paramInt)
  {
    return paramInt << 1 ^ paramInt >> 31;
  }
  
  public static int gw(int paramInt)
  {
    if (paramInt >= 0) {}
    for (paramInt = gB(paramInt);; paramInt = 10) {
      return paramInt;
    }
  }
  
  public static int gx(int paramInt)
  {
    return gB(gD(paramInt));
  }
  
  public static int gz(int paramInt)
  {
    return gB(pq.x(paramInt, 0));
  }
  
  public static int j(int paramInt, String paramString)
  {
    return gz(paramInt) + di(paramString);
  }
  
  public static pg q(byte[] paramArrayOfByte)
  {
    return b(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static int s(byte[] paramArrayOfByte)
  {
    return gB(paramArrayOfByte.length) + paramArrayOfByte.length;
  }
  
  public static int u(int paramInt1, int paramInt2)
  {
    return gz(paramInt1) + gw(paramInt2);
  }
  
  public static int v(int paramInt1, int paramInt2)
  {
    return gz(paramInt1) + gx(paramInt2);
  }
  
  public void B(long paramLong)
    throws IOException
  {
    F(paramLong);
  }
  
  public void C(long paramLong)
    throws IOException
  {
    F(I(paramLong));
  }
  
  public void F(long paramLong)
    throws IOException
  {
    for (;;)
    {
      if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      {
        gy((int)paramLong);
        return;
      }
      gy((int)paramLong & 0x7F | 0x80);
      paramLong >>>= 7;
    }
  }
  
  public void H(long paramLong)
    throws IOException
  {
    gy((int)paramLong & 0xFF);
    gy((int)(paramLong >> 8) & 0xFF);
    gy((int)(paramLong >> 16) & 0xFF);
    gy((int)(paramLong >> 24) & 0xFF);
    gy((int)(paramLong >> 32) & 0xFF);
    gy((int)(paramLong >> 40) & 0xFF);
    gy((int)(paramLong >> 48) & 0xFF);
    gy((int)(paramLong >> 56) & 0xFF);
  }
  
  public void U(boolean paramBoolean)
    throws IOException
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      gy(i);
      return;
    }
  }
  
  public void a(int paramInt, double paramDouble)
    throws IOException
  {
    w(paramInt, 1);
    e(paramDouble);
  }
  
  public void a(int paramInt, pn parampn)
    throws IOException
  {
    w(paramInt, 2);
    c(parampn);
  }
  
  public void a(int paramInt, byte[] paramArrayOfByte)
    throws IOException
  {
    w(paramInt, 2);
    r(paramArrayOfByte);
  }
  
  public void b(byte paramByte)
    throws IOException
  {
    if (this.position == this.awI) {
      throw new a(this.position, this.awI);
    }
    byte[] arrayOfByte = this.buffer;
    int i = this.position;
    this.position = (i + 1);
    arrayOfByte[i] = paramByte;
  }
  
  public void b(int paramInt, float paramFloat)
    throws IOException
  {
    w(paramInt, 5);
    d(paramFloat);
  }
  
  public void b(int paramInt, long paramLong)
    throws IOException
  {
    w(paramInt, 0);
    B(paramLong);
  }
  
  public void b(int paramInt, String paramString)
    throws IOException
  {
    w(paramInt, 2);
    dh(paramString);
  }
  
  public void b(int paramInt, boolean paramBoolean)
    throws IOException
  {
    w(paramInt, 0);
    U(paramBoolean);
  }
  
  public void b(pn parampn)
    throws IOException
  {
    parampn.a(this);
  }
  
  public void c(int paramInt, long paramLong)
    throws IOException
  {
    w(paramInt, 0);
    C(paramLong);
  }
  
  public void c(pn parampn)
    throws IOException
  {
    gA(parampn.qH());
    parampn.a(this);
  }
  
  public void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (this.awI - this.position >= paramInt2)
    {
      System.arraycopy(paramArrayOfByte, paramInt1, this.buffer, this.position, paramInt2);
      this.position += paramInt2;
      return;
    }
    throw new a(this.position, this.awI);
  }
  
  public void d(float paramFloat)
    throws IOException
  {
    gC(Float.floatToIntBits(paramFloat));
  }
  
  public void dh(String paramString)
    throws IOException
  {
    paramString = paramString.getBytes("UTF-8");
    gA(paramString.length);
    t(paramString);
  }
  
  public void e(double paramDouble)
    throws IOException
  {
    H(Double.doubleToLongBits(paramDouble));
  }
  
  public void gA(int paramInt)
    throws IOException
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        gy(paramInt);
        return;
      }
      gy(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
  }
  
  public void gC(int paramInt)
    throws IOException
  {
    gy(paramInt & 0xFF);
    gy(paramInt >> 8 & 0xFF);
    gy(paramInt >> 16 & 0xFF);
    gy(paramInt >> 24 & 0xFF);
  }
  
  public void gu(int paramInt)
    throws IOException
  {
    if (paramInt >= 0) {
      gA(paramInt);
    }
    for (;;)
    {
      return;
      F(paramInt);
    }
  }
  
  public void gv(int paramInt)
    throws IOException
  {
    gA(gD(paramInt));
  }
  
  public void gy(int paramInt)
    throws IOException
  {
    b((byte)paramInt);
  }
  
  public int qx()
  {
    return this.awI - this.position;
  }
  
  public void qy()
  {
    if (qx() != 0) {
      throw new IllegalStateException("Did not write as much data as expected.");
    }
  }
  
  public void r(byte[] paramArrayOfByte)
    throws IOException
  {
    gA(paramArrayOfByte.length);
    t(paramArrayOfByte);
  }
  
  public void s(int paramInt1, int paramInt2)
    throws IOException
  {
    w(paramInt1, 0);
    gu(paramInt2);
  }
  
  public void t(int paramInt1, int paramInt2)
    throws IOException
  {
    w(paramInt1, 0);
    gv(paramInt2);
  }
  
  public void t(byte[] paramArrayOfByte)
    throws IOException
  {
    c(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void w(int paramInt1, int paramInt2)
    throws IOException
  {
    gA(pq.x(paramInt1, paramInt2));
  }
  
  public static class a
    extends IOException
  {
    a(int paramInt1, int paramInt2)
    {
      super();
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\internal\pg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */