package com.google.android.gms.internal;

import java.io.IOException;

public final class pq
{
  public static final int[] awW = new int[0];
  public static final long[] awX = new long[0];
  public static final float[] awY = new float[0];
  public static final double[] awZ = new double[0];
  public static final boolean[] axa = new boolean[0];
  public static final String[] axb = new String[0];
  public static final byte[][] axc = new byte[0][];
  public static final byte[] axd = new byte[0];
  
  public static final int b(pf parampf, int paramInt)
    throws IOException
  {
    int i = 1;
    int j = parampf.getPosition();
    parampf.gn(paramInt);
    while (parampf.qi() == paramInt)
    {
      parampf.gn(paramInt);
      i++;
    }
    parampf.gr(j);
    return i;
  }
  
  static int gH(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  public static int gI(int paramInt)
  {
    return paramInt >>> 3;
  }
  
  static int x(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\internal\pq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */