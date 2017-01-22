package com.kabam.soda.wske;

public abstract interface WSKECallback<Result>
{
  public abstract void onError(String paramString, Throwable paramThrowable, int paramInt);
  
  public abstract void onSuccess(Result paramResult);
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\kabam\soda\wske\WSKECallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */