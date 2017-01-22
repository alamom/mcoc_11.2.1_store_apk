package com.samsung.android.sdk.iap.lib.listener;

import com.samsung.android.sdk.iap.lib.vo.ErrorVo;
import com.samsung.android.sdk.iap.lib.vo.InboxVo;
import java.util.ArrayList;

public abstract interface OnGetInboxListener
{
  public abstract void onGetItemInbox(ErrorVo paramErrorVo, ArrayList<InboxVo> paramArrayList);
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\samsung\android\sdk\iap\lib\listener\OnGetInboxListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */