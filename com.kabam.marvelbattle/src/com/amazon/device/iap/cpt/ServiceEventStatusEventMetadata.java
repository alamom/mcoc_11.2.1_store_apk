package com.amazon.device.iap.cpt;

public class ServiceEventStatusEventMetadata
  extends StatusEventMetadata
{
  private final String eventType;
  
  public ServiceEventStatusEventMetadata(String paramString)
  {
    super(StatusEventType.EVENT);
    this.eventType = paramString;
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\amazon\device\iap\cpt\ServiceEventStatusEventMetadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */