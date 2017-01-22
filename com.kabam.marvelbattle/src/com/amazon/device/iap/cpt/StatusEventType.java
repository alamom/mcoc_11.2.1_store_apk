package com.amazon.device.iap.cpt;

public enum StatusEventType
{
  ASYNC_OPERATION_RESPONSE("ASYNC_OPERATION_RESPONSE"),  EVENT("EVENT");
  
  private final String value;
  
  private StatusEventType(String paramString)
  {
    this.value = paramString;
  }
  
  public String getValue()
  {
    return this.value;
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\amazon\device\iap\cpt\StatusEventType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */