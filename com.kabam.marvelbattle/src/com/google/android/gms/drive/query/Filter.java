package com.google.android.gms.drive.query;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.f;

public abstract interface Filter
  extends SafeParcelable
{
  public abstract <T> T a(f<T> paramf);
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\drive\query\Filter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */