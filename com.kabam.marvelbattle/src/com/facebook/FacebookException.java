package com.facebook;

public class FacebookException
  extends RuntimeException
{
  static final long serialVersionUID = 1L;
  
  public FacebookException() {}
  
  public FacebookException(String paramString)
  {
    super(paramString);
  }
  
  public FacebookException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public FacebookException(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\facebook\FacebookException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */