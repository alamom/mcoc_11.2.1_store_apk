package com.google.android.vending.expansion.downloader;

import android.content.Context;
import android.os.Messenger;

public abstract interface IStub
{
  public abstract void connect(Context paramContext);
  
  public abstract void disconnect(Context paramContext);
  
  public abstract Messenger getMessenger();
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\vending\expansion\downloader\IStub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */