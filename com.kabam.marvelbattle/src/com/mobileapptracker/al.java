package com.mobileapptracker;

import android.widget.Toast;

final class al
  implements Runnable
{
  al(MobileAppTracker paramMobileAppTracker) {}
  
  public final void run()
  {
    Toast.makeText(this.a.mContext, "MAT Debug Mode Enabled, do not release with this enabled!!", 1).show();
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\mobileapptracker\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */