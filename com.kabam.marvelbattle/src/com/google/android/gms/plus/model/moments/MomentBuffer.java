package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.ny;

public final class MomentBuffer
  extends DataBuffer<Moment>
{
  public MomentBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public Moment get(int paramInt)
  {
    return new ny(this.II, paramInt);
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\plus\model\moments\MomentBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */