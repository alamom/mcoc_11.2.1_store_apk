package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class q
  implements SafeParcelable
{
  public static final Parcelable.Creator<q> CREATOR = new r();
  final int BR;
  private final Session St;
  private final DataSet Ts;
  
  q(int paramInt, Session paramSession, DataSet paramDataSet)
  {
    this.BR = paramInt;
    this.St = paramSession;
    this.Ts = paramDataSet;
  }
  
  private boolean a(q paramq)
  {
    if ((n.equal(this.St, paramq.St)) && (n.equal(this.Ts, paramq.Ts))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject == this) || (((paramObject instanceof q)) && (a((q)paramObject)))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public Session getSession()
  {
    return this.St;
  }
  
  public int hashCode()
  {
    return n.hashCode(new Object[] { this.St, this.Ts });
  }
  
  public DataSet iW()
  {
    return this.Ts;
  }
  
  public String toString()
  {
    return n.h(this).a("session", this.St).a("dataSet", this.Ts).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    r.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\fitness\data\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */