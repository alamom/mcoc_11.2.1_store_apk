package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class ExperienceEventBuffer
  extends DataBuffer<ExperienceEvent>
{
  public ExperienceEventBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public ExperienceEvent dI(int paramInt)
  {
    return new ExperienceEventRef(this.II, paramInt);
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\games\internal\experience\ExperienceEventBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */