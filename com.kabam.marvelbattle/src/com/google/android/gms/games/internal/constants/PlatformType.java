package com.google.android.gms.games.internal.constants;

public final class PlatformType
{
  public static String dH(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Unknown platform type: " + paramInt);
    case 0: 
      str = "ANDROID";
    }
    for (;;)
    {
      return str;
      str = "IOS";
      continue;
      str = "WEB_APP";
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\games\internal\constants\PlatformType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */