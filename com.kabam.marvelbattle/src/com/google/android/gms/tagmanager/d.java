package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

class d
  implements DataLayer.b
{
  private final Context lB;
  
  public d(Context paramContext)
  {
    this.lB = paramContext;
  }
  
  public void D(Map<String, Object> paramMap)
  {
    Object localObject = paramMap.get("gtm.url");
    if (localObject == null)
    {
      paramMap = paramMap.get("gtm");
      if ((paramMap == null) || (!(paramMap instanceof Map))) {}
    }
    for (paramMap = ((Map)paramMap).get("url");; paramMap = (Map<String, Object>)localObject)
    {
      if ((paramMap == null) || (!(paramMap instanceof String))) {}
      for (;;)
      {
        return;
        paramMap = Uri.parse((String)paramMap).getQueryParameter("referrer");
        if (paramMap != null) {
          ay.f(this.lB, paramMap);
        }
      }
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\tagmanager\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */