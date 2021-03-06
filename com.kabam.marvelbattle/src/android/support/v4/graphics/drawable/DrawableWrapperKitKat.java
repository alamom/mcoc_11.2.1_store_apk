package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

class DrawableWrapperKitKat
  extends DrawableWrapperHoneycomb
{
  DrawableWrapperKitKat(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  public boolean isAutoMirrored()
  {
    return this.mDrawable.isAutoMirrored();
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    this.mDrawable.setAutoMirrored(paramBoolean);
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\android\support\v4\graphics\drawable\DrawableWrapperKitKat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */