package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsRequestCreator;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.AccountChangeEventsResponseCreator;

public abstract interface r
  extends IInterface
{
  public abstract Bundle a(String paramString, Bundle paramBundle)
    throws RemoteException;
  
  public abstract Bundle a(String paramString1, String paramString2, Bundle paramBundle)
    throws RemoteException;
  
  public abstract AccountChangeEventsResponse a(AccountChangeEventsRequest paramAccountChangeEventsRequest)
    throws RemoteException;
  
  public static abstract class a
    extends Binder
    implements r
  {
    public static r a(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        paramIBinder = null;
      }
      for (;;)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if ((localIInterface != null) && ((localIInterface instanceof r))) {
          paramIBinder = (r)localIInterface;
        } else {
          paramIBinder = new a(paramIBinder);
        }
      }
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      String str1 = null;
      String str2 = null;
      Object localObject = null;
      boolean bool;
      switch (paramInt1)
      {
      default: 
      case 1598968902: 
        for (bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = true)
        {
          return bool;
          paramParcel2.writeString("com.google.android.auth.IAuthManagerService");
        }
      case 1: 
        paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
        str2 = paramParcel1.readString();
        str1 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {
          localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        paramParcel1 = a(str2, str1, (Bundle)localObject);
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          bool = true;
          break;
          paramParcel2.writeInt(0);
        }
      case 2: 
        paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
        str2 = paramParcel1.readString();
        localObject = str1;
        if (paramParcel1.readInt() != 0) {
          localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        paramParcel1 = a(str2, (Bundle)localObject);
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
        }
        for (;;)
        {
          bool = true;
          break;
          paramParcel2.writeInt(0);
        }
      }
      paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
      localObject = str2;
      if (paramParcel1.readInt() != 0) {
        localObject = AccountChangeEventsRequest.CREATOR.createFromParcel(paramParcel1);
      }
      paramParcel1 = a((AccountChangeEventsRequest)localObject);
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        bool = true;
        break;
        paramParcel2.writeInt(0);
      }
    }
    
    private static class a
      implements r
    {
      private IBinder lb;
      
      a(IBinder paramIBinder)
      {
        this.lb = paramIBinder;
      }
      
      public Bundle a(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel2 = Parcel.obtain();
        Parcel localParcel1 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel2.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
            localParcel2.writeString(paramString);
            if (paramBundle != null)
            {
              localParcel2.writeInt(1);
              paramBundle.writeToParcel(localParcel2, 0);
              this.lb.transact(2, localParcel2, localParcel1, 0);
              localParcel1.readException();
              if (localParcel1.readInt() != 0)
              {
                paramString = (Bundle)Bundle.CREATOR.createFromParcel(localParcel1);
                return paramString;
              }
            }
            else
            {
              localParcel2.writeInt(0);
              continue;
            }
            paramString = null;
          }
          finally
          {
            localParcel1.recycle();
            localParcel2.recycle();
          }
        }
      }
      
      public Bundle a(String paramString1, String paramString2, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
            localParcel1.writeString(paramString1);
            localParcel1.writeString(paramString2);
            if (paramBundle != null)
            {
              localParcel1.writeInt(1);
              paramBundle.writeToParcel(localParcel1, 0);
              this.lb.transact(1, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                paramString1 = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
                return paramString1;
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            paramString1 = null;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      public AccountChangeEventsResponse a(AccountChangeEventsRequest paramAccountChangeEventsRequest)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.auth.IAuthManagerService");
            if (paramAccountChangeEventsRequest != null)
            {
              localParcel1.writeInt(1);
              paramAccountChangeEventsRequest.writeToParcel(localParcel1, 0);
              this.lb.transact(3, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                paramAccountChangeEventsRequest = AccountChangeEventsResponse.CREATOR.createFromParcel(localParcel2);
                return paramAccountChangeEventsRequest;
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            paramAccountChangeEventsRequest = null;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      public IBinder asBinder()
      {
        return this.lb;
      }
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\internal\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */