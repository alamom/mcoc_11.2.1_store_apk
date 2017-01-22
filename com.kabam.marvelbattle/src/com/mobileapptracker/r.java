package com.mobileapptracker;

final class r
  implements Runnable
{
  r(MobileAppTracker paramMobileAppTracker, boolean paramBoolean) {}
  
  public final void run()
  {
    if (this.a) {
      this.b.params.setIsPayingUser(Integer.toString(1));
    }
    for (;;)
    {
      return;
      this.b.params.setIsPayingUser(Integer.toString(0));
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\mobileapptracker\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */