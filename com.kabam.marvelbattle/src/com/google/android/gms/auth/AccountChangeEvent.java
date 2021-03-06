package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AccountChangeEvent
  implements SafeParcelable
{
  public static final AccountChangeEventCreator CREATOR = new AccountChangeEventCreator();
  final String Dd;
  final int Di;
  final long Dj;
  final int Dk;
  final int Dl;
  final String Dm;
  
  AccountChangeEvent(int paramInt1, long paramLong, String paramString1, int paramInt2, int paramInt3, String paramString2)
  {
    this.Di = paramInt1;
    this.Dj = paramLong;
    this.Dd = ((String)o.i(paramString1));
    this.Dk = paramInt2;
    this.Dl = paramInt3;
    this.Dm = paramString2;
  }
  
  public AccountChangeEvent(long paramLong, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    this.Di = 1;
    this.Dj = paramLong;
    this.Dd = ((String)o.i(paramString1));
    this.Dk = paramInt1;
    this.Dl = paramInt2;
    this.Dm = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool;
      if ((paramObject instanceof AccountChangeEvent))
      {
        paramObject = (AccountChangeEvent)paramObject;
        if ((this.Di != ((AccountChangeEvent)paramObject).Di) || (this.Dj != ((AccountChangeEvent)paramObject).Dj) || (!n.equal(this.Dd, ((AccountChangeEvent)paramObject).Dd)) || (this.Dk != ((AccountChangeEvent)paramObject).Dk) || (this.Dl != ((AccountChangeEvent)paramObject).Dl) || (!n.equal(this.Dm, ((AccountChangeEvent)paramObject).Dm))) {
          bool = false;
        }
      }
      else
      {
        bool = false;
      }
    }
  }
  
  public String getAccountName()
  {
    return this.Dd;
  }
  
  public String getChangeData()
  {
    return this.Dm;
  }
  
  public int getChangeType()
  {
    return this.Dk;
  }
  
  public int getEventIndex()
  {
    return this.Dl;
  }
  
  public int hashCode()
  {
    return n.hashCode(new Object[] { Integer.valueOf(this.Di), Long.valueOf(this.Dj), this.Dd, Integer.valueOf(this.Dk), Integer.valueOf(this.Dl), this.Dm });
  }
  
  public String toString()
  {
    String str = "UNKNOWN";
    switch (this.Dk)
    {
    }
    for (;;)
    {
      return "AccountChangeEvent {accountName = " + this.Dd + ", changeType = " + str + ", changeData = " + this.Dm + ", eventIndex = " + this.Dl + "}";
      str = "ADDED";
      continue;
      str = "REMOVED";
      continue;
      str = "RENAMED_TO";
      continue;
      str = "RENAMED_FROM";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AccountChangeEventCreator.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\auth\AccountChangeEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */