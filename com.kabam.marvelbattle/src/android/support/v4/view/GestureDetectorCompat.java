package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public class GestureDetectorCompat
{
  private final GestureDetectorCompatImpl mImpl;
  
  public GestureDetectorCompat(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener)
  {
    this(paramContext, paramOnGestureListener, null);
  }
  
  public GestureDetectorCompat(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
  {
    if (Build.VERSION.SDK_INT > 17) {}
    for (this.mImpl = new GestureDetectorCompatImplJellybeanMr2(paramContext, paramOnGestureListener, paramHandler);; this.mImpl = new GestureDetectorCompatImplBase(paramContext, paramOnGestureListener, paramHandler)) {
      return;
    }
  }
  
  public boolean isLongpressEnabled()
  {
    return this.mImpl.isLongpressEnabled();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.mImpl.onTouchEvent(paramMotionEvent);
  }
  
  public void setIsLongpressEnabled(boolean paramBoolean)
  {
    this.mImpl.setIsLongpressEnabled(paramBoolean);
  }
  
  public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
  {
    this.mImpl.setOnDoubleTapListener(paramOnDoubleTapListener);
  }
  
  static abstract interface GestureDetectorCompatImpl
  {
    public abstract boolean isLongpressEnabled();
    
    public abstract boolean onTouchEvent(MotionEvent paramMotionEvent);
    
    public abstract void setIsLongpressEnabled(boolean paramBoolean);
    
    public abstract void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener);
  }
  
  static class GestureDetectorCompatImplBase
    implements GestureDetectorCompat.GestureDetectorCompatImpl
  {
    private static final int DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
    private static final int LONGPRESS_TIMEOUT = ;
    private static final int LONG_PRESS = 2;
    private static final int SHOW_PRESS = 1;
    private static final int TAP = 3;
    private static final int TAP_TIMEOUT = ViewConfiguration.getTapTimeout();
    private boolean mAlwaysInBiggerTapRegion;
    private boolean mAlwaysInTapRegion;
    private MotionEvent mCurrentDownEvent;
    private boolean mDeferConfirmSingleTap;
    private GestureDetector.OnDoubleTapListener mDoubleTapListener;
    private int mDoubleTapSlopSquare;
    private float mDownFocusX;
    private float mDownFocusY;
    private final Handler mHandler;
    private boolean mInLongPress;
    private boolean mIsDoubleTapping;
    private boolean mIsLongpressEnabled;
    private float mLastFocusX;
    private float mLastFocusY;
    private final GestureDetector.OnGestureListener mListener;
    private int mMaximumFlingVelocity;
    private int mMinimumFlingVelocity;
    private MotionEvent mPreviousUpEvent;
    private boolean mStillDown;
    private int mTouchSlopSquare;
    private VelocityTracker mVelocityTracker;
    
    public GestureDetectorCompatImplBase(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
    {
      if (paramHandler != null) {}
      for (this.mHandler = new GestureHandler(paramHandler);; this.mHandler = new GestureHandler())
      {
        this.mListener = paramOnGestureListener;
        if ((paramOnGestureListener instanceof GestureDetector.OnDoubleTapListener)) {
          setOnDoubleTapListener((GestureDetector.OnDoubleTapListener)paramOnGestureListener);
        }
        init(paramContext);
        return;
      }
    }
    
    private void cancel()
    {
      this.mHandler.removeMessages(1);
      this.mHandler.removeMessages(2);
      this.mHandler.removeMessages(3);
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
      this.mIsDoubleTapping = false;
      this.mStillDown = false;
      this.mAlwaysInTapRegion = false;
      this.mAlwaysInBiggerTapRegion = false;
      this.mDeferConfirmSingleTap = false;
      if (this.mInLongPress) {
        this.mInLongPress = false;
      }
    }
    
    private void cancelTaps()
    {
      this.mHandler.removeMessages(1);
      this.mHandler.removeMessages(2);
      this.mHandler.removeMessages(3);
      this.mIsDoubleTapping = false;
      this.mAlwaysInTapRegion = false;
      this.mAlwaysInBiggerTapRegion = false;
      this.mDeferConfirmSingleTap = false;
      if (this.mInLongPress) {
        this.mInLongPress = false;
      }
    }
    
    private void dispatchLongPress()
    {
      this.mHandler.removeMessages(3);
      this.mDeferConfirmSingleTap = false;
      this.mInLongPress = true;
      this.mListener.onLongPress(this.mCurrentDownEvent);
    }
    
    private void init(Context paramContext)
    {
      if (paramContext == null) {
        throw new IllegalArgumentException("Context must not be null");
      }
      if (this.mListener == null) {
        throw new IllegalArgumentException("OnGestureListener must not be null");
      }
      this.mIsLongpressEnabled = true;
      paramContext = ViewConfiguration.get(paramContext);
      int j = paramContext.getScaledTouchSlop();
      int i = paramContext.getScaledDoubleTapSlop();
      this.mMinimumFlingVelocity = paramContext.getScaledMinimumFlingVelocity();
      this.mMaximumFlingVelocity = paramContext.getScaledMaximumFlingVelocity();
      this.mTouchSlopSquare = (j * j);
      this.mDoubleTapSlopSquare = (i * i);
    }
    
    private boolean isConsideredDoubleTap(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, MotionEvent paramMotionEvent3)
    {
      boolean bool2 = false;
      boolean bool1;
      if (!this.mAlwaysInBiggerTapRegion) {
        bool1 = bool2;
      }
      for (;;)
      {
        return bool1;
        bool1 = bool2;
        if (paramMotionEvent3.getEventTime() - paramMotionEvent2.getEventTime() <= DOUBLE_TAP_TIMEOUT)
        {
          int i = (int)paramMotionEvent1.getX() - (int)paramMotionEvent3.getX();
          int j = (int)paramMotionEvent1.getY() - (int)paramMotionEvent3.getY();
          bool1 = bool2;
          if (i * i + j * j < this.mDoubleTapSlopSquare) {
            bool1 = true;
          }
        }
      }
    }
    
    public boolean isLongpressEnabled()
    {
      return this.mIsLongpressEnabled;
    }
    
    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      int i1 = paramMotionEvent.getAction();
      if (this.mVelocityTracker == null) {
        this.mVelocityTracker = VelocityTracker.obtain();
      }
      this.mVelocityTracker.addMovement(paramMotionEvent);
      int i;
      int k;
      label53:
      float f2;
      float f1;
      int n;
      int m;
      if ((i1 & 0xFF) == 6)
      {
        i = 1;
        if (i == 0) {
          break label92;
        }
        k = MotionEventCompat.getActionIndex(paramMotionEvent);
        f2 = 0.0F;
        f1 = 0.0F;
        n = MotionEventCompat.getPointerCount(paramMotionEvent);
        m = 0;
        label66:
        if (m >= n) {
          break label119;
        }
        if (k != m) {
          break label98;
        }
      }
      for (;;)
      {
        m++;
        break label66;
        i = 0;
        break;
        label92:
        k = -1;
        break label53;
        label98:
        f2 += MotionEventCompat.getX(paramMotionEvent, m);
        f1 += MotionEventCompat.getY(paramMotionEvent, m);
      }
      label119:
      boolean bool4;
      boolean bool5;
      boolean bool3;
      boolean bool2;
      if (i != 0)
      {
        i = n - 1;
        f2 /= i;
        f1 /= i;
        k = 0;
        bool4 = false;
        bool5 = false;
        bool3 = false;
        bool2 = bool3;
        switch (i1 & 0xFF)
        {
        default: 
          bool2 = bool3;
        }
      }
      for (;;)
      {
        return bool2;
        i = n;
        break;
        this.mLastFocusX = f2;
        this.mDownFocusX = f2;
        this.mLastFocusY = f1;
        this.mDownFocusY = f1;
        cancelTaps();
        bool2 = bool3;
        continue;
        this.mLastFocusX = f2;
        this.mDownFocusX = f2;
        this.mLastFocusY = f1;
        this.mDownFocusY = f1;
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaximumFlingVelocity);
        k = MotionEventCompat.getActionIndex(paramMotionEvent);
        i = MotionEventCompat.getPointerId(paramMotionEvent, k);
        f2 = VelocityTrackerCompat.getXVelocity(this.mVelocityTracker, i);
        f1 = VelocityTrackerCompat.getYVelocity(this.mVelocityTracker, i);
        i = 0;
        bool2 = bool3;
        if (i < n)
        {
          if (i == k) {}
          do
          {
            i++;
            break;
            m = MotionEventCompat.getPointerId(paramMotionEvent, i);
          } while (f2 * VelocityTrackerCompat.getXVelocity(this.mVelocityTracker, m) + f1 * VelocityTrackerCompat.getYVelocity(this.mVelocityTracker, m) >= 0.0F);
          this.mVelocityTracker.clear();
          bool2 = bool3;
          continue;
          i = k;
          if (this.mDoubleTapListener != null)
          {
            bool2 = this.mHandler.hasMessages(3);
            if (bool2) {
              this.mHandler.removeMessages(3);
            }
            if ((this.mCurrentDownEvent == null) || (this.mPreviousUpEvent == null) || (!bool2) || (!isConsideredDoubleTap(this.mCurrentDownEvent, this.mPreviousUpEvent, paramMotionEvent))) {
              break label648;
            }
            this.mIsDoubleTapping = true;
          }
          for (boolean bool1 = false | this.mDoubleTapListener.onDoubleTap(this.mCurrentDownEvent) | this.mDoubleTapListener.onDoubleTapEvent(paramMotionEvent);; bool1 = k)
          {
            this.mLastFocusX = f2;
            this.mDownFocusX = f2;
            this.mLastFocusY = f1;
            this.mDownFocusY = f1;
            if (this.mCurrentDownEvent != null) {
              this.mCurrentDownEvent.recycle();
            }
            this.mCurrentDownEvent = MotionEvent.obtain(paramMotionEvent);
            this.mAlwaysInTapRegion = true;
            this.mAlwaysInBiggerTapRegion = true;
            this.mStillDown = true;
            this.mInLongPress = false;
            this.mDeferConfirmSingleTap = false;
            if (this.mIsLongpressEnabled)
            {
              this.mHandler.removeMessages(2);
              this.mHandler.sendEmptyMessageAtTime(2, this.mCurrentDownEvent.getDownTime() + TAP_TIMEOUT + LONGPRESS_TIMEOUT);
            }
            this.mHandler.sendEmptyMessageAtTime(1, this.mCurrentDownEvent.getDownTime() + TAP_TIMEOUT);
            bool2 = bool1 | this.mListener.onDown(paramMotionEvent);
            break;
            label648:
            this.mHandler.sendEmptyMessageDelayed(3, DOUBLE_TAP_TIMEOUT);
          }
          bool2 = bool3;
          if (!this.mInLongPress)
          {
            float f4 = this.mLastFocusX - f2;
            float f3 = this.mLastFocusY - f1;
            if (this.mIsDoubleTapping)
            {
              bool2 = false | this.mDoubleTapListener.onDoubleTapEvent(paramMotionEvent);
            }
            else
            {
              int j;
              if (this.mAlwaysInTapRegion)
              {
                j = (int)(f2 - this.mDownFocusX);
                k = (int)(f1 - this.mDownFocusY);
                j = j * j + k * k;
                bool3 = bool4;
                if (j > this.mTouchSlopSquare)
                {
                  bool3 = this.mListener.onScroll(this.mCurrentDownEvent, paramMotionEvent, f4, f3);
                  this.mLastFocusX = f2;
                  this.mLastFocusY = f1;
                  this.mAlwaysInTapRegion = false;
                  this.mHandler.removeMessages(3);
                  this.mHandler.removeMessages(1);
                  this.mHandler.removeMessages(2);
                }
                bool2 = bool3;
                if (j > this.mTouchSlopSquare)
                {
                  this.mAlwaysInBiggerTapRegion = false;
                  bool2 = bool3;
                }
              }
              else if (Math.abs(f4) < 1.0F)
              {
                bool2 = bool3;
                if (Math.abs(f3) < 1.0F) {}
              }
              else
              {
                bool2 = this.mListener.onScroll(this.mCurrentDownEvent, paramMotionEvent, f4, f3);
                this.mLastFocusX = f2;
                this.mLastFocusY = f1;
                continue;
                this.mStillDown = false;
                MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
                if (this.mIsDoubleTapping) {
                  bool2 = false | this.mDoubleTapListener.onDoubleTapEvent(paramMotionEvent);
                }
                for (;;)
                {
                  if (this.mPreviousUpEvent != null) {
                    this.mPreviousUpEvent.recycle();
                  }
                  this.mPreviousUpEvent = localMotionEvent;
                  if (this.mVelocityTracker != null)
                  {
                    this.mVelocityTracker.recycle();
                    this.mVelocityTracker = null;
                  }
                  this.mIsDoubleTapping = false;
                  this.mDeferConfirmSingleTap = false;
                  this.mHandler.removeMessages(1);
                  this.mHandler.removeMessages(2);
                  break;
                  if (this.mInLongPress)
                  {
                    this.mHandler.removeMessages(3);
                    this.mInLongPress = false;
                    bool2 = bool5;
                  }
                  else if (this.mAlwaysInTapRegion)
                  {
                    bool3 = this.mListener.onSingleTapUp(paramMotionEvent);
                    bool2 = bool3;
                    if (this.mDeferConfirmSingleTap)
                    {
                      bool2 = bool3;
                      if (this.mDoubleTapListener != null)
                      {
                        this.mDoubleTapListener.onSingleTapConfirmed(paramMotionEvent);
                        bool2 = bool3;
                      }
                    }
                  }
                  else
                  {
                    VelocityTracker localVelocityTracker = this.mVelocityTracker;
                    j = MotionEventCompat.getPointerId(paramMotionEvent, 0);
                    localVelocityTracker.computeCurrentVelocity(1000, this.mMaximumFlingVelocity);
                    f1 = VelocityTrackerCompat.getYVelocity(localVelocityTracker, j);
                    f2 = VelocityTrackerCompat.getXVelocity(localVelocityTracker, j);
                    if (Math.abs(f1) <= this.mMinimumFlingVelocity)
                    {
                      bool2 = bool5;
                      if (Math.abs(f2) <= this.mMinimumFlingVelocity) {}
                    }
                    else
                    {
                      bool2 = this.mListener.onFling(this.mCurrentDownEvent, paramMotionEvent, f2, f1);
                    }
                  }
                }
                cancel();
                bool2 = bool3;
              }
            }
          }
        }
      }
    }
    
    public void setIsLongpressEnabled(boolean paramBoolean)
    {
      this.mIsLongpressEnabled = paramBoolean;
    }
    
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
    {
      this.mDoubleTapListener = paramOnDoubleTapListener;
    }
    
    private class GestureHandler
      extends Handler
    {
      GestureHandler() {}
      
      GestureHandler(Handler paramHandler)
      {
        super();
      }
      
      public void handleMessage(Message paramMessage)
      {
        switch (paramMessage.what)
        {
        default: 
          throw new RuntimeException("Unknown message " + paramMessage);
        case 1: 
          GestureDetectorCompat.GestureDetectorCompatImplBase.this.mListener.onShowPress(GestureDetectorCompat.GestureDetectorCompatImplBase.this.mCurrentDownEvent);
        }
        for (;;)
        {
          return;
          GestureDetectorCompat.GestureDetectorCompatImplBase.this.dispatchLongPress();
          continue;
          if (GestureDetectorCompat.GestureDetectorCompatImplBase.this.mDoubleTapListener != null) {
            if (!GestureDetectorCompat.GestureDetectorCompatImplBase.this.mStillDown) {
              GestureDetectorCompat.GestureDetectorCompatImplBase.this.mDoubleTapListener.onSingleTapConfirmed(GestureDetectorCompat.GestureDetectorCompatImplBase.this.mCurrentDownEvent);
            } else {
              GestureDetectorCompat.GestureDetectorCompatImplBase.access$502(GestureDetectorCompat.GestureDetectorCompatImplBase.this, true);
            }
          }
        }
      }
    }
  }
  
  static class GestureDetectorCompatImplJellybeanMr2
    implements GestureDetectorCompat.GestureDetectorCompatImpl
  {
    private final GestureDetector mDetector;
    
    public GestureDetectorCompatImplJellybeanMr2(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
    {
      this.mDetector = new GestureDetector(paramContext, paramOnGestureListener, paramHandler);
    }
    
    public boolean isLongpressEnabled()
    {
      return this.mDetector.isLongpressEnabled();
    }
    
    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      return this.mDetector.onTouchEvent(paramMotionEvent);
    }
    
    public void setIsLongpressEnabled(boolean paramBoolean)
    {
      this.mDetector.setIsLongpressEnabled(paramBoolean);
    }
    
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
    {
      this.mDetector.setOnDoubleTapListener(paramOnDoubleTapListener);
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\android\support\v4\view\GestureDetectorCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */