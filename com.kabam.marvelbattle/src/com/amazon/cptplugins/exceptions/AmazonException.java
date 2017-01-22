package com.amazon.cptplugins.exceptions;

public class AmazonException
  extends RuntimeException
{
  public AmazonException() {}
  
  public AmazonException(String paramString)
  {
    super(paramString);
  }
  
  public AmazonException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public AmazonException(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\amazon\cptplugins\exceptions\AmazonException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */