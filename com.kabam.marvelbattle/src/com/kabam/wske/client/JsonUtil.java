package com.kabam.wske.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtil
{
  public static Gson mapper = new GsonBuilder().setPrettyPrinting().create();
  
  public static Gson getJsonMapper()
  {
    return mapper;
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\kabam\wske\client\JsonUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */