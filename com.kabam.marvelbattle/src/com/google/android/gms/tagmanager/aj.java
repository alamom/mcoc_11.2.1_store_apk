package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.d.a;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class aj
{
  private final Set<String> apj;
  private final String apk;
  
  public aj(String paramString, String... paramVarArgs)
  {
    this.apk = paramString;
    this.apj = new HashSet(paramVarArgs.length);
    int j = paramVarArgs.length;
    for (int i = 0; i < j; i++)
    {
      paramString = paramVarArgs[i];
      this.apj.add(paramString);
    }
  }
  
  public abstract d.a C(Map<String, d.a> paramMap);
  
  boolean a(Set<String> paramSet)
  {
    return paramSet.containsAll(this.apj);
  }
  
  public abstract boolean nN();
  
  public String or()
  {
    return this.apk;
  }
  
  public Set<String> os()
  {
    return this.apj;
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\tagmanager\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */