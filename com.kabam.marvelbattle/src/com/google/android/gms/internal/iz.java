package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.n;

public final class iz
  extends ja<a, Drawable>
{
  public iz()
  {
    super(10);
  }
  
  public static final class a
  {
    public final int Lp;
    public final int Lq;
    
    public a(int paramInt1, int paramInt2)
    {
      this.Lp = paramInt1;
      this.Lq = paramInt2;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool2 = true;
      boolean bool1;
      if (!(paramObject instanceof a)) {
        bool1 = false;
      }
      for (;;)
      {
        return bool1;
        bool1 = bool2;
        if (this != paramObject)
        {
          paramObject = (a)paramObject;
          if (((a)paramObject).Lp == this.Lp)
          {
            bool1 = bool2;
            if (((a)paramObject).Lq == this.Lq) {}
          }
          else
          {
            bool1 = false;
          }
        }
      }
    }
    
    public int hashCode()
    {
      return n.hashCode(new Object[] { Integer.valueOf(this.Lp), Integer.valueOf(this.Lq) });
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\internal\iz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */