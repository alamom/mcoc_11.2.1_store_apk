package com.kabam.wske.model;

import com.google.gson.annotations.SerializedName;

public class AuthenticatedNetworkResource
{
  @SerializedName("network")
  private String network = null;
  
  public String getNetwork()
  {
    return this.network;
  }
  
  public void setNetwork(String paramString)
  {
    this.network = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("class AuthenticatedNetworkResource {\n");
    localStringBuilder.append("  network: ").append(this.network).append("\n");
    localStringBuilder.append("}\n");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\kabam\wske\model\AuthenticatedNetworkResource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */