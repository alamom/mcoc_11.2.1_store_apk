package com.google.android.gms.games.internal.constants;

public final class LeaderboardCollection
{
  public static String dH(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Unknown leaderboard collection: " + paramInt);
    }
    for (String str = "PUBLIC";; str = "SOCIAL") {
      return str;
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\games\internal\constants\LeaderboardCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */