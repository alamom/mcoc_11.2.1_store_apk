package com.google.android.gms.ads.purchase;

import android.content.Intent;

public abstract interface InAppPurchaseResult
{
  public abstract void finishPurchase();
  
  public abstract String getProductId();
  
  public abstract Intent getPurchaseData();
  
  public abstract int getResultCode();
  
  public abstract boolean isVerified();
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\ads\purchase\InAppPurchaseResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */