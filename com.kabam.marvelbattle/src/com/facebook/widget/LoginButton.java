package com.facebook.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.facebook.AppEventsLogger;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.Request;
import com.facebook.Request.GraphUserCallback;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.Session.Builder;
import com.facebook.Session.OpenRequest;
import com.facebook.Session.StatusCallback;
import com.facebook.SessionDefaultAudience;
import com.facebook.SessionLoginBehavior;
import com.facebook.SessionState;
import com.facebook.android.R.color;
import com.facebook.android.R.dimen;
import com.facebook.android.R.drawable;
import com.facebook.android.R.string;
import com.facebook.android.R.styleable;
import com.facebook.internal.SessionAuthorizationType;
import com.facebook.internal.SessionTracker;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.FetchedAppSettings;
import com.facebook.model.GraphUser;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LoginButton
  extends Button
{
  private static final String TAG = LoginButton.class.getName();
  private String applicationId = null;
  private boolean confirmLogout;
  private boolean fetchUserInfo;
  private View.OnClickListener listenerCallback;
  private String loginLogoutEventName = "fb_login_view_usage";
  private String loginText;
  private String logoutText;
  private boolean nuxChecked;
  private long nuxDisplayTime = 6000L;
  private ToolTipMode nuxMode = ToolTipMode.DEFAULT;
  private ToolTipPopup nuxPopup;
  private ToolTipPopup.Style nuxStyle = ToolTipPopup.Style.BLUE;
  private Fragment parentFragment;
  private LoginButtonProperties properties = new LoginButtonProperties();
  private SessionTracker sessionTracker;
  private GraphUser user = null;
  private UserInfoChangedCallback userInfoChangedCallback;
  private Session userInfoSession = null;
  
  public LoginButton(Context paramContext)
  {
    super(paramContext);
    initializeActiveSessionWithCachedToken(paramContext);
    finishInit();
  }
  
  public LoginButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (paramAttributeSet.getStyleAttribute() == 0)
    {
      setGravity(17);
      setTextColor(getResources().getColor(R.color.com_facebook_loginview_text_color));
      setTextSize(0, getResources().getDimension(R.dimen.com_facebook_loginview_text_size));
      setTypeface(Typeface.DEFAULT_BOLD);
      if (!isInEditMode()) {
        break label156;
      }
      setBackgroundColor(getResources().getColor(R.color.com_facebook_blue));
      this.loginText = "Log in with Facebook";
    }
    for (;;)
    {
      parseAttributes(paramAttributeSet);
      if (!isInEditMode()) {
        initializeActiveSessionWithCachedToken(paramContext);
      }
      return;
      label156:
      setBackgroundResource(R.drawable.com_facebook_button_blue);
      setCompoundDrawablesWithIntrinsicBounds(R.drawable.com_facebook_inverse_icon, 0, 0, 0);
      setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.com_facebook_loginview_compound_drawable_padding));
      setPadding(getResources().getDimensionPixelSize(R.dimen.com_facebook_loginview_padding_left), getResources().getDimensionPixelSize(R.dimen.com_facebook_loginview_padding_top), getResources().getDimensionPixelSize(R.dimen.com_facebook_loginview_padding_right), getResources().getDimensionPixelSize(R.dimen.com_facebook_loginview_padding_bottom));
    }
  }
  
  public LoginButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    parseAttributes(paramAttributeSet);
    initializeActiveSessionWithCachedToken(paramContext);
  }
  
  private void checkNuxSettings()
  {
    if (this.nuxMode == ToolTipMode.DISPLAY_ALWAYS) {
      displayNux(getResources().getString(R.string.com_facebook_tooltip_default));
    }
    for (;;)
    {
      return;
      new AsyncTask()
      {
        protected Utility.FetchedAppSettings doInBackground(Void... paramAnonymousVarArgs)
        {
          return Utility.queryAppSettings(this.val$appId, false);
        }
        
        protected void onPostExecute(Utility.FetchedAppSettings paramAnonymousFetchedAppSettings)
        {
          LoginButton.this.showNuxPerSettings(paramAnonymousFetchedAppSettings);
        }
      }.execute((Void[])null);
    }
  }
  
  private void displayNux(String paramString)
  {
    this.nuxPopup = new ToolTipPopup(paramString, this);
    this.nuxPopup.setStyle(this.nuxStyle);
    this.nuxPopup.setNuxDisplayTime(this.nuxDisplayTime);
    this.nuxPopup.show();
  }
  
  private void fetchUserInfo()
  {
    if (this.fetchUserInfo)
    {
      final Session localSession = this.sessionTracker.getOpenSession();
      if (localSession == null) {
        break label57;
      }
      if (localSession != this.userInfoSession)
      {
        Request.executeBatchAsync(new Request[] { Request.newMeRequest(localSession, new Request.GraphUserCallback()
        {
          public void onCompleted(GraphUser paramAnonymousGraphUser, Response paramAnonymousResponse)
          {
            if (localSession == LoginButton.this.sessionTracker.getOpenSession())
            {
              LoginButton.access$502(LoginButton.this, paramAnonymousGraphUser);
              if (LoginButton.this.userInfoChangedCallback != null) {
                LoginButton.this.userInfoChangedCallback.onUserInfoFetched(LoginButton.this.user);
              }
            }
            if (paramAnonymousResponse.getError() != null) {
              LoginButton.this.handleError(paramAnonymousResponse.getError().getException());
            }
          }
        }) });
        this.userInfoSession = localSession;
      }
    }
    for (;;)
    {
      return;
      label57:
      this.user = null;
      if (this.userInfoChangedCallback != null) {
        this.userInfoChangedCallback.onUserInfoFetched(this.user);
      }
    }
  }
  
  private void finishInit()
  {
    super.setOnClickListener(new LoginClickListener(null));
    setButtonText();
    if (!isInEditMode())
    {
      this.sessionTracker = new SessionTracker(getContext(), new LoginButtonCallback(null), null, false);
      fetchUserInfo();
    }
  }
  
  private boolean initializeActiveSessionWithCachedToken(Context paramContext)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramContext == null) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      Session localSession = Session.getActiveSession();
      if (localSession != null)
      {
        bool1 = localSession.isOpened();
      }
      else
      {
        bool1 = bool2;
        if (Utility.getMetadataApplicationId(paramContext) != null)
        {
          bool1 = bool2;
          if (Session.openActiveSessionFromCache(paramContext) != null) {
            bool1 = true;
          }
        }
      }
    }
  }
  
  private void parseAttributes(AttributeSet paramAttributeSet)
  {
    paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.com_facebook_login_view);
    this.confirmLogout = paramAttributeSet.getBoolean(R.styleable.com_facebook_login_view_confirm_logout, true);
    this.fetchUserInfo = paramAttributeSet.getBoolean(R.styleable.com_facebook_login_view_fetch_user_info, true);
    this.loginText = paramAttributeSet.getString(R.styleable.com_facebook_login_view_login_text);
    this.logoutText = paramAttributeSet.getString(R.styleable.com_facebook_login_view_logout_text);
    paramAttributeSet.recycle();
  }
  
  private void setButtonText()
  {
    if ((this.sessionTracker != null) && (this.sessionTracker.getOpenSession() != null))
    {
      if (this.logoutText != null) {}
      for (str = this.logoutText;; str = getResources().getString(R.string.com_facebook_loginview_log_out_button))
      {
        setText(str);
        return;
      }
    }
    if (this.loginText != null) {}
    for (String str = this.loginText;; str = getResources().getString(R.string.com_facebook_loginview_log_in_button))
    {
      setText(str);
      break;
    }
  }
  
  private void showNuxPerSettings(Utility.FetchedAppSettings paramFetchedAppSettings)
  {
    if ((paramFetchedAppSettings != null) && (paramFetchedAppSettings.getNuxEnabled()) && (getVisibility() == 0)) {
      displayNux(paramFetchedAppSettings.getNuxContent());
    }
  }
  
  public void clearPermissions()
  {
    this.properties.clearPermissions();
  }
  
  public void dismissToolTip()
  {
    if (this.nuxPopup != null)
    {
      this.nuxPopup.dismiss();
      this.nuxPopup = null;
    }
  }
  
  public SessionDefaultAudience getDefaultAudience()
  {
    return this.properties.getDefaultAudience();
  }
  
  public SessionLoginBehavior getLoginBehavior()
  {
    return this.properties.getLoginBehavior();
  }
  
  public OnErrorListener getOnErrorListener()
  {
    return this.properties.getOnErrorListener();
  }
  
  List<String> getPermissions()
  {
    return this.properties.getPermissions();
  }
  
  public Session.StatusCallback getSessionStatusCallback()
  {
    return this.properties.getSessionStatusCallback();
  }
  
  public long getToolTipDisplayTime()
  {
    return this.nuxDisplayTime;
  }
  
  public ToolTipMode getToolTipMode()
  {
    return this.nuxMode;
  }
  
  public UserInfoChangedCallback getUserInfoChangedCallback()
  {
    return this.userInfoChangedCallback;
  }
  
  void handleError(Exception paramException)
  {
    if (this.properties.onErrorListener != null)
    {
      if (!(paramException instanceof FacebookException)) {
        break label34;
      }
      this.properties.onErrorListener.onError((FacebookException)paramException);
    }
    for (;;)
    {
      return;
      label34:
      this.properties.onErrorListener.onError(new FacebookException(paramException));
    }
  }
  
  public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Session localSession = this.sessionTracker.getSession();
    if (localSession != null) {}
    for (boolean bool = localSession.onActivityResult((Activity)getContext(), paramInt1, paramInt2, paramIntent);; bool = false) {
      return bool;
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if ((this.sessionTracker != null) && (!this.sessionTracker.isTracking()))
    {
      this.sessionTracker.startTracking();
      fetchUserInfo();
      setButtonText();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.sessionTracker != null) {
      this.sessionTracker.stopTracking();
    }
    dismissToolTip();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((!this.nuxChecked) && (this.nuxMode != ToolTipMode.NEVER_DISPLAY) && (!isInEditMode()))
    {
      this.nuxChecked = true;
      checkNuxSettings();
    }
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    finishInit();
  }
  
  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    if (paramInt != 0) {
      dismissToolTip();
    }
  }
  
  public void setApplicationId(String paramString)
  {
    this.applicationId = paramString;
  }
  
  public void setDefaultAudience(SessionDefaultAudience paramSessionDefaultAudience)
  {
    this.properties.setDefaultAudience(paramSessionDefaultAudience);
  }
  
  public void setFragment(Fragment paramFragment)
  {
    this.parentFragment = paramFragment;
  }
  
  public void setLoginBehavior(SessionLoginBehavior paramSessionLoginBehavior)
  {
    this.properties.setLoginBehavior(paramSessionLoginBehavior);
  }
  
  void setLoginLogoutEventName(String paramString)
  {
    this.loginLogoutEventName = paramString;
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.listenerCallback = paramOnClickListener;
  }
  
  public void setOnErrorListener(OnErrorListener paramOnErrorListener)
  {
    this.properties.setOnErrorListener(paramOnErrorListener);
  }
  
  void setProperties(LoginButtonProperties paramLoginButtonProperties)
  {
    this.properties = paramLoginButtonProperties;
  }
  
  public void setPublishPermissions(List<String> paramList)
  {
    this.properties.setPublishPermissions(paramList, this.sessionTracker.getSession());
  }
  
  public void setPublishPermissions(String... paramVarArgs)
  {
    this.properties.setPublishPermissions(Arrays.asList(paramVarArgs), this.sessionTracker.getSession());
  }
  
  public void setReadPermissions(List<String> paramList)
  {
    this.properties.setReadPermissions(paramList, this.sessionTracker.getSession());
  }
  
  public void setReadPermissions(String... paramVarArgs)
  {
    this.properties.setReadPermissions(Arrays.asList(paramVarArgs), this.sessionTracker.getSession());
  }
  
  public void setSession(Session paramSession)
  {
    this.sessionTracker.setSession(paramSession);
    fetchUserInfo();
    setButtonText();
  }
  
  public void setSessionStatusCallback(Session.StatusCallback paramStatusCallback)
  {
    this.properties.setSessionStatusCallback(paramStatusCallback);
  }
  
  public void setToolTipDisplayTime(long paramLong)
  {
    this.nuxDisplayTime = paramLong;
  }
  
  public void setToolTipMode(ToolTipMode paramToolTipMode)
  {
    this.nuxMode = paramToolTipMode;
  }
  
  public void setToolTipStyle(ToolTipPopup.Style paramStyle)
  {
    this.nuxStyle = paramStyle;
  }
  
  public void setUserInfoChangedCallback(UserInfoChangedCallback paramUserInfoChangedCallback)
  {
    this.userInfoChangedCallback = paramUserInfoChangedCallback;
  }
  
  private class LoginButtonCallback
    implements Session.StatusCallback
  {
    private LoginButtonCallback() {}
    
    public void call(Session paramSession, SessionState paramSessionState, Exception paramException)
    {
      LoginButton.this.fetchUserInfo();
      LoginButton.this.setButtonText();
      if (LoginButton.LoginButtonProperties.access$1900(LoginButton.this.properties) != null) {
        LoginButton.LoginButtonProperties.access$1900(LoginButton.this.properties).call(paramSession, paramSessionState, paramException);
      }
      for (;;)
      {
        return;
        if (paramException != null) {
          LoginButton.this.handleError(paramException);
        }
      }
    }
  }
  
  static class LoginButtonProperties
  {
    private SessionAuthorizationType authorizationType = null;
    private SessionDefaultAudience defaultAudience = SessionDefaultAudience.FRIENDS;
    private SessionLoginBehavior loginBehavior = SessionLoginBehavior.SSO_WITH_FALLBACK;
    private LoginButton.OnErrorListener onErrorListener;
    private List<String> permissions = Collections.emptyList();
    private Session.StatusCallback sessionStatusCallback;
    
    private boolean validatePermissions(List<String> paramList, SessionAuthorizationType paramSessionAuthorizationType, Session paramSession)
    {
      if ((SessionAuthorizationType.PUBLISH.equals(paramSessionAuthorizationType)) && (Utility.isNullOrEmpty(paramList))) {
        throw new IllegalArgumentException("Permissions for publish actions cannot be null or empty.");
      }
      if ((paramSession != null) && (paramSession.isOpened()) && (!Utility.isSubset(paramList, paramSession.getPermissions()))) {
        Log.e(LoginButton.TAG, "Cannot set additional permissions when session is already open.");
      }
      for (boolean bool = false;; bool = true) {
        return bool;
      }
    }
    
    public void clearPermissions()
    {
      this.permissions = null;
      this.authorizationType = null;
    }
    
    public SessionDefaultAudience getDefaultAudience()
    {
      return this.defaultAudience;
    }
    
    public SessionLoginBehavior getLoginBehavior()
    {
      return this.loginBehavior;
    }
    
    public LoginButton.OnErrorListener getOnErrorListener()
    {
      return this.onErrorListener;
    }
    
    List<String> getPermissions()
    {
      return this.permissions;
    }
    
    public Session.StatusCallback getSessionStatusCallback()
    {
      return this.sessionStatusCallback;
    }
    
    public void setDefaultAudience(SessionDefaultAudience paramSessionDefaultAudience)
    {
      this.defaultAudience = paramSessionDefaultAudience;
    }
    
    public void setLoginBehavior(SessionLoginBehavior paramSessionLoginBehavior)
    {
      this.loginBehavior = paramSessionLoginBehavior;
    }
    
    public void setOnErrorListener(LoginButton.OnErrorListener paramOnErrorListener)
    {
      this.onErrorListener = paramOnErrorListener;
    }
    
    public void setPublishPermissions(List<String> paramList, Session paramSession)
    {
      if (SessionAuthorizationType.READ.equals(this.authorizationType)) {
        throw new UnsupportedOperationException("Cannot call setPublishPermissions after setReadPermissions has been called.");
      }
      if (validatePermissions(paramList, SessionAuthorizationType.PUBLISH, paramSession))
      {
        this.permissions = paramList;
        this.authorizationType = SessionAuthorizationType.PUBLISH;
      }
    }
    
    public void setReadPermissions(List<String> paramList, Session paramSession)
    {
      if (SessionAuthorizationType.PUBLISH.equals(this.authorizationType)) {
        throw new UnsupportedOperationException("Cannot call setReadPermissions after setPublishPermissions has been called.");
      }
      if (validatePermissions(paramList, SessionAuthorizationType.READ, paramSession))
      {
        this.permissions = paramList;
        this.authorizationType = SessionAuthorizationType.READ;
      }
    }
    
    public void setSessionStatusCallback(Session.StatusCallback paramStatusCallback)
    {
      this.sessionStatusCallback = paramStatusCallback;
    }
  }
  
  private class LoginClickListener
    implements View.OnClickListener
  {
    private LoginClickListener() {}
    
    public void onClick(View paramView)
    {
      Object localObject3 = LoginButton.this.getContext();
      final Session localSession = LoginButton.this.sessionTracker.getOpenSession();
      Object localObject2;
      Object localObject1;
      if (localSession != null) {
        if (LoginButton.this.confirmLogout)
        {
          String str = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_log_out_action);
          localObject2 = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_cancel_action);
          if ((LoginButton.this.user != null) && (LoginButton.this.user.getName() != null))
          {
            localObject1 = String.format(LoginButton.this.getResources().getString(R.string.com_facebook_loginview_logged_in_as), new Object[] { LoginButton.this.user.getName() });
            localObject3 = new AlertDialog.Builder((Context)localObject3);
            ((AlertDialog.Builder)localObject3).setMessage((CharSequence)localObject1).setCancelable(true).setPositiveButton(str, new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                localSession.closeAndClearTokenInformation();
              }
            }).setNegativeButton((CharSequence)localObject2, null);
            ((AlertDialog.Builder)localObject3).create().show();
            label178:
            localObject1 = AppEventsLogger.newLogger(LoginButton.this.getContext());
            localObject2 = new Bundle();
            if (localSession == null) {
              break label489;
            }
          }
        }
      }
      label478:
      label480:
      label489:
      for (int i = 0;; i = 1)
      {
        ((Bundle)localObject2).putInt("logging_in", i);
        ((AppEventsLogger)localObject1).logSdkEvent(LoginButton.this.loginLogoutEventName, null, (Bundle)localObject2);
        if (LoginButton.this.listenerCallback != null) {
          LoginButton.this.listenerCallback.onClick(paramView);
        }
        return;
        localObject1 = LoginButton.this.getResources().getString(R.string.com_facebook_loginview_logged_in_using_facebook);
        break;
        localSession.closeAndClearTokenInformation();
        break label178;
        localObject1 = LoginButton.this.sessionTracker.getSession();
        if (localObject1 != null)
        {
          localObject2 = localObject1;
          if (!((Session)localObject1).getState().isClosed()) {}
        }
        else
        {
          LoginButton.this.sessionTracker.setSession(null);
          localObject2 = new Session.Builder((Context)localObject3).setApplicationId(LoginButton.this.applicationId).build();
          Session.setActiveSession((Session)localObject2);
        }
        if (((Session)localObject2).isOpened()) {
          break label178;
        }
        localObject1 = null;
        if (LoginButton.this.parentFragment != null) {
          localObject1 = new Session.OpenRequest(LoginButton.this.parentFragment);
        }
        for (;;)
        {
          if (localObject1 == null) {
            break label478;
          }
          ((Session.OpenRequest)localObject1).setDefaultAudience(LoginButton.access$1000(LoginButton.this).defaultAudience);
          ((Session.OpenRequest)localObject1).setPermissions(LoginButton.access$1000(LoginButton.this).permissions);
          ((Session.OpenRequest)localObject1).setLoginBehavior(LoginButton.access$1000(LoginButton.this).loginBehavior);
          if (!SessionAuthorizationType.PUBLISH.equals(LoginButton.access$1000(LoginButton.this).authorizationType)) {
            break label480;
          }
          ((Session)localObject2).openForPublish((Session.OpenRequest)localObject1);
          break;
          if ((localObject3 instanceof Activity)) {
            localObject1 = new Session.OpenRequest((Activity)localObject3);
          }
        }
        break label178;
        ((Session)localObject2).openForRead((Session.OpenRequest)localObject1);
        break label178;
      }
    }
  }
  
  public static abstract interface OnErrorListener
  {
    public abstract void onError(FacebookException paramFacebookException);
  }
  
  public static enum ToolTipMode
  {
    DEFAULT,  DISPLAY_ALWAYS,  NEVER_DISPLAY;
    
    private ToolTipMode() {}
  }
  
  public static abstract interface UserInfoChangedCallback
  {
    public abstract void onUserInfoFetched(GraphUser paramGraphUser);
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\facebook\widget\LoginButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */