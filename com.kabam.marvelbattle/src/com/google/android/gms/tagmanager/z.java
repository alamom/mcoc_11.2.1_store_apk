package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.internal.a;
import com.google.android.gms.internal.d.a;
import java.util.Map;

class z
  extends aj
{
  private static final String ID = a.Z.toString();
  private final Context mContext;
  
  public z(Context paramContext)
  {
    super(ID, new String[0]);
    this.mContext = paramContext;
  }
  
  public d.a C(Map<String, d.a> paramMap)
  {
    paramMap = Y(this.mContext);
    if (paramMap == null) {}
    for (paramMap = di.pK();; paramMap = di.u(paramMap)) {
      return paramMap;
    }
  }
  
  protected String Y(Context paramContext)
  {
    return Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
  }
  
  public boolean nN()
  {
    return true;
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\tagmanager\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */