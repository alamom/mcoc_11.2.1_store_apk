package com.google.ads.mediation;

@Deprecated
public abstract interface MediationAdapter<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends MediationServerParameters>
{
  public abstract void destroy();
  
  public abstract Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();
  
  public abstract Class<SERVER_PARAMETERS> getServerParametersType();
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\ads\mediation\MediationAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */