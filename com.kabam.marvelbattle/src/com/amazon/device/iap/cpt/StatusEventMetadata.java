package com.amazon.device.iap.cpt;

public abstract class StatusEventMetadata
{
  private final String type;
  
  public StatusEventMetadata(StatusEventType paramStatusEventType)
  {
    this.type = paramStatusEventType.getValue();
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\amazon\device\iap\cpt\StatusEventMetadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */