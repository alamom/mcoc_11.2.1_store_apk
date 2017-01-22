package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.DataBuffer;

public final class ParticipantBuffer
  extends DataBuffer<Participant>
{
  public Participant get(int paramInt)
  {
    return new ParticipantRef(this.II, paramInt);
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\games\multiplayer\ParticipantBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */