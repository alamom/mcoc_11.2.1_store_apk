package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

class AccessibilityRecordCompatJellyBean
{
  public static void setSource(Object paramObject, View paramView, int paramInt)
  {
    ((AccessibilityRecord)paramObject).setSource(paramView, paramInt);
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\android\support\v4\view\accessibility\AccessibilityRecordCompatJellyBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */