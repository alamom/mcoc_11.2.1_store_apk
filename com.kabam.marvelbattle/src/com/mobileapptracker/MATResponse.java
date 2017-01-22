package com.mobileapptracker;

import org.json.JSONObject;

public abstract interface MATResponse
{
  public abstract void didFailWithError(JSONObject paramJSONObject);
  
  public abstract void didReceiveDeeplink(String paramString);
  
  public abstract void didSucceedWithData(JSONObject paramJSONObject);
  
  public abstract void enqueuedActionWithRefId(String paramString);
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\mobileapptracker\MATResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */