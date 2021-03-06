package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;

public class k
  extends b<String>
{
  public k(String paramString, int paramInt)
  {
    super(paramString, Collections.singleton(paramString), Collections.emptySet(), paramInt);
  }
  
  public static final Collection<String> bk(String paramString)
    throws JSONException
  {
    if (paramString == null) {}
    ArrayList localArrayList;
    for (paramString = null;; paramString = Collections.unmodifiableCollection(localArrayList))
    {
      return paramString;
      localArrayList = new ArrayList();
      paramString = new JSONArray(paramString);
      for (int i = 0; i < paramString.length(); i++) {
        localArrayList.add(paramString.getString(i));
      }
    }
  }
  
  protected void a(Bundle paramBundle, Collection<String> paramCollection)
  {
    paramBundle.putStringArrayList(getName(), new ArrayList(paramCollection));
  }
  
  protected Collection<String> d(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    try
    {
      paramDataHolder = bk(paramDataHolder.c(getName(), paramInt1, paramInt2));
      return paramDataHolder;
    }
    catch (JSONException paramDataHolder)
    {
      throw new IllegalStateException("DataHolder supplied invalid JSON", paramDataHolder);
    }
  }
  
  protected Collection<String> l(Bundle paramBundle)
  {
    return paramBundle.getStringArrayList(getName());
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\drive\metadata\internal\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */