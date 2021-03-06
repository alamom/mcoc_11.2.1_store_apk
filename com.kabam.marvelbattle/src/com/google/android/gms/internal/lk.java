package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;

public abstract interface lk
  extends IInterface
{
  public abstract void a(FitnessSensorServiceRequest paramFitnessSensorServiceRequest, kt paramkt)
    throws RemoteException;
  
  public abstract void a(lg paramlg, kn paramkn)
    throws RemoteException;
  
  public abstract void a(li paramli, kt paramkt)
    throws RemoteException;
  
  public static abstract class a
    extends Binder
    implements lk
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.fitness.internal.service.IFitnessSensorService");
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      Object localObject2 = null;
      Object localObject3 = null;
      Object localObject1 = null;
      boolean bool;
      switch (paramInt1)
      {
      default: 
        bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      for (;;)
      {
        return bool;
        paramParcel2.writeString("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
        bool = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
        paramParcel2 = (Parcel)localObject1;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (lg)lg.CREATOR.createFromParcel(paramParcel1);
        }
        a(paramParcel2, kn.a.aq(paramParcel1.readStrongBinder()));
        bool = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
        paramParcel2 = (Parcel)localObject2;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (FitnessSensorServiceRequest)FitnessSensorServiceRequest.CREATOR.createFromParcel(paramParcel1);
        }
        a(paramParcel2, kt.a.aw(paramParcel1.readStrongBinder()));
        bool = true;
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
        paramParcel2 = (Parcel)localObject3;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (li)li.CREATOR.createFromParcel(paramParcel1);
        }
        a(paramParcel2, kt.a.aw(paramParcel1.readStrongBinder()));
        bool = true;
      }
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\internal\lk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */