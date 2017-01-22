package android.support.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.TYPE})
public @interface BinderThread {}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\android\support\annotation\BinderThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */