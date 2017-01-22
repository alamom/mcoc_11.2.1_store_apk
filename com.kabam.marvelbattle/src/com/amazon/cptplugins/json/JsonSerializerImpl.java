package com.amazon.cptplugins.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;

public class JsonSerializerImpl
  implements JsonSerializer
{
  private final Gson gson;
  
  public JsonSerializerImpl()
  {
    GsonBuilder localGsonBuilder = new GsonBuilder();
    localGsonBuilder.registerTypeAdapter(Boolean.class, new BooleanDeserializer());
    this.gson = localGsonBuilder.create();
  }
  
  public <T> T fromJson(String paramString, Type paramType)
  {
    return (T)this.gson.fromJson(paramString, paramType);
  }
  
  public String toJson(Object paramObject)
  {
    return this.gson.toJson(paramObject);
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\amazon\cptplugins\json\JsonSerializerImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */