package android.support.v4.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

class ConnectivityManagerCompatGingerbread
{
  public static boolean isActiveNetworkMetered(ConnectivityManager paramConnectivityManager)
  {
    boolean bool2 = true;
    paramConnectivityManager = paramConnectivityManager.getActiveNetworkInfo();
    boolean bool1;
    if (paramConnectivityManager == null) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      bool1 = bool2;
      switch (paramConnectivityManager.getType())
      {
      case 0: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      default: 
        bool1 = bool2;
        break;
      case 1: 
        bool1 = false;
      }
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\android\support\v4\net\ConnectivityManagerCompatGingerbread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */