package com.kabam.soda.unity;

import android.content.Intent;
import android.os.Bundle;
import com.unity3d.player.UnityPlayerNativeActivity;

public class KabamSODAPlayerNativeActivity
  extends UnityPlayerNativeActivity
{
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    KabamSODAActivityHelper.onActivityResult(this, paramInt1, paramInt2, paramIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  protected void onPause()
  {
    super.onPause();
    KabamSODAActivityHelper.onPause(this);
  }
  
  protected void onResume()
  {
    super.onResume();
    KabamSODAActivityHelper.onResume(this);
  }
  
  protected void onStop()
  {
    super.onStop();
    KabamSODAActivityHelper.onStop(this);
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\kabam\soda\unity\KabamSODAPlayerNativeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */