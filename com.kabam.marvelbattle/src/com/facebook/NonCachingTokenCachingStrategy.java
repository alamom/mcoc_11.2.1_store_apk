package com.facebook;

import android.os.Bundle;

public class NonCachingTokenCachingStrategy
  extends TokenCachingStrategy
{
  public void clear() {}
  
  public Bundle load()
  {
    return null;
  }
  
  public void save(Bundle paramBundle) {}
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\facebook\NonCachingTokenCachingStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */