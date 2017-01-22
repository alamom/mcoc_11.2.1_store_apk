package com.google.android.gms.auth;

import android.content.Intent;

public class UserRecoverableAuthException
  extends GoogleAuthException
{
  private final Intent mIntent;
  
  public UserRecoverableAuthException(String paramString, Intent paramIntent)
  {
    super(paramString);
    this.mIntent = paramIntent;
  }
  
  public Intent getIntent()
  {
    if (this.mIntent == null) {}
    for (Intent localIntent = null;; localIntent = new Intent(this.mIntent)) {
      return localIntent;
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\auth\UserRecoverableAuthException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */