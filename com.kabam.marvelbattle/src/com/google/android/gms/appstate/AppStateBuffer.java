package com.google.android.gms.appstate;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class AppStateBuffer
  extends DataBuffer<AppState>
{
  public AppStateBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public AppState get(int paramInt)
  {
    return new b(this.II, paramInt);
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\appstate\AppStateBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */