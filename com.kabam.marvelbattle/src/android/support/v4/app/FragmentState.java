package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

final class FragmentState
  implements Parcelable
{
  public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator()
  {
    public FragmentState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new FragmentState(paramAnonymousParcel);
    }
    
    public FragmentState[] newArray(int paramAnonymousInt)
    {
      return new FragmentState[paramAnonymousInt];
    }
  };
  final Bundle mArguments;
  final String mClassName;
  final int mContainerId;
  final boolean mDetached;
  final int mFragmentId;
  final boolean mFromLayout;
  final int mIndex;
  Fragment mInstance;
  final boolean mRetainInstance;
  Bundle mSavedFragmentState;
  final String mTag;
  
  public FragmentState(Parcel paramParcel)
  {
    this.mClassName = paramParcel.readString();
    this.mIndex = paramParcel.readInt();
    if (paramParcel.readInt() != 0)
    {
      bool1 = true;
      this.mFromLayout = bool1;
      this.mFragmentId = paramParcel.readInt();
      this.mContainerId = paramParcel.readInt();
      this.mTag = paramParcel.readString();
      if (paramParcel.readInt() == 0) {
        break label110;
      }
      bool1 = true;
      label69:
      this.mRetainInstance = bool1;
      if (paramParcel.readInt() == 0) {
        break label115;
      }
    }
    label110:
    label115:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.mDetached = bool1;
      this.mArguments = paramParcel.readBundle();
      this.mSavedFragmentState = paramParcel.readBundle();
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label69;
    }
  }
  
  public FragmentState(Fragment paramFragment)
  {
    this.mClassName = paramFragment.getClass().getName();
    this.mIndex = paramFragment.mIndex;
    this.mFromLayout = paramFragment.mFromLayout;
    this.mFragmentId = paramFragment.mFragmentId;
    this.mContainerId = paramFragment.mContainerId;
    this.mTag = paramFragment.mTag;
    this.mRetainInstance = paramFragment.mRetainInstance;
    this.mDetached = paramFragment.mDetached;
    this.mArguments = paramFragment.mArguments;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Fragment instantiate(FragmentHostCallback paramFragmentHostCallback, Fragment paramFragment)
  {
    if (this.mInstance != null) {}
    for (paramFragmentHostCallback = this.mInstance;; paramFragmentHostCallback = this.mInstance)
    {
      return paramFragmentHostCallback;
      Context localContext = paramFragmentHostCallback.getContext();
      if (this.mArguments != null) {
        this.mArguments.setClassLoader(localContext.getClassLoader());
      }
      this.mInstance = Fragment.instantiate(localContext, this.mClassName, this.mArguments);
      if (this.mSavedFragmentState != null)
      {
        this.mSavedFragmentState.setClassLoader(localContext.getClassLoader());
        this.mInstance.mSavedFragmentState = this.mSavedFragmentState;
      }
      this.mInstance.setIndex(this.mIndex, paramFragment);
      this.mInstance.mFromLayout = this.mFromLayout;
      this.mInstance.mRestored = true;
      this.mInstance.mFragmentId = this.mFragmentId;
      this.mInstance.mContainerId = this.mContainerId;
      this.mInstance.mTag = this.mTag;
      this.mInstance.mRetainInstance = this.mRetainInstance;
      this.mInstance.mDetached = this.mDetached;
      this.mInstance.mFragmentManager = paramFragmentHostCallback.mFragmentManager;
      if (FragmentManagerImpl.DEBUG) {
        Log.v("FragmentManager", "Instantiated fragment " + this.mInstance);
      }
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(this.mClassName);
    paramParcel.writeInt(this.mIndex);
    if (this.mFromLayout)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.mFragmentId);
      paramParcel.writeInt(this.mContainerId);
      paramParcel.writeString(this.mTag);
      if (!this.mRetainInstance) {
        break label106;
      }
      paramInt = 1;
      label65:
      paramParcel.writeInt(paramInt);
      if (!this.mDetached) {
        break label111;
      }
    }
    label106:
    label111:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeBundle(this.mArguments);
      paramParcel.writeBundle(this.mSavedFragmentState);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label65;
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\android\support\v4\app\FragmentState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */