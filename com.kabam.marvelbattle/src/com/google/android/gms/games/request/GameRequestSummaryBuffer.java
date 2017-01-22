package com.google.android.gms.games.request;

import com.google.android.gms.common.data.DataBuffer;

public final class GameRequestSummaryBuffer
  extends DataBuffer<GameRequestSummary>
{
  public GameRequestSummary dW(int paramInt)
  {
    return new GameRequestSummaryRef(this.II, paramInt);
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\games\request\GameRequestSummaryBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */