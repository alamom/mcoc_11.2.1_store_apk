package com.amazon.cptplugins.json;

import java.lang.reflect.Type;

public abstract interface JsonSerializer
{
  public abstract <T> T fromJson(String paramString, Type paramType);
  
  public abstract String toJson(Object paramObject);
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\amazon\cptplugins\json\JsonSerializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */