package com.kabam.soda.wske;

public class NotAuthenticatedException
  extends Exception
{
  private static final long serialVersionUID = 5472508811782810119L;
  
  public NotAuthenticatedException() {}
  
  public NotAuthenticatedException(String paramString)
  {
    super(paramString);
  }
  
  public NotAuthenticatedException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public NotAuthenticatedException(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\kabam\soda\wske\NotAuthenticatedException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */