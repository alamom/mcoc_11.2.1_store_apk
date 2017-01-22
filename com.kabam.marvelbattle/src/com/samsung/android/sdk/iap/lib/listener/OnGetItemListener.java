package com.samsung.android.sdk.iap.lib.listener;

import com.samsung.android.sdk.iap.lib.vo.ErrorVo;
import com.samsung.android.sdk.iap.lib.vo.ItemVo;
import java.util.ArrayList;

public abstract interface OnGetItemListener
{
  public abstract void onGetItem(ErrorVo paramErrorVo, ArrayList<ItemVo> paramArrayList);
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\samsung\android\sdk\iap\lib\listener\OnGetItemListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */