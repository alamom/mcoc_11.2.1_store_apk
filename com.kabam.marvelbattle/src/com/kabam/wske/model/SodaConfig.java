package com.kabam.wske.model;

import com.google.gson.annotations.SerializedName;

public class SodaConfig
{
  @SerializedName("httpRequestTimeout")
  private Integer httpRequestTimeout = null;
  
  public Integer getHttpRequestTimeout()
  {
    return this.httpRequestTimeout;
  }
  
  public void setHttpRequestTimeout(Integer paramInteger)
  {
    this.httpRequestTimeout = paramInteger;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("class SodaConfig {\n");
    localStringBuilder.append("  httpRequestTimeout: ").append(this.httpRequestTimeout).append("\n");
    localStringBuilder.append("}\n");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\kabam\wske\model\SodaConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */