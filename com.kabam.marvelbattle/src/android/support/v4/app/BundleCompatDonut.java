package android.support.v4.app;

import java.lang.reflect.Method;

class BundleCompatDonut
{
  private static final String TAG = "BundleCompatDonut";
  private static Method sGetIBinderMethod;
  private static boolean sGetIBinderMethodFetched;
  private static Method sPutIBinderMethod;
  private static boolean sPutIBinderMethodFetched;
  
  /* Error */
  public static android.os.IBinder getBinder(android.os.Bundle paramBundle, String paramString)
  {
    // Byte code:
    //   0: getstatic 31	android/support/v4/app/BundleCompatDonut:sGetIBinderMethodFetched	Z
    //   3: ifne +33 -> 36
    //   6: ldc 33
    //   8: ldc 35
    //   10: iconst_1
    //   11: anewarray 37	java/lang/Class
    //   14: dup
    //   15: iconst_0
    //   16: ldc 39
    //   18: aastore
    //   19: invokevirtual 43	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   22: putstatic 45	android/support/v4/app/BundleCompatDonut:sGetIBinderMethod	Ljava/lang/reflect/Method;
    //   25: getstatic 45	android/support/v4/app/BundleCompatDonut:sGetIBinderMethod	Ljava/lang/reflect/Method;
    //   28: iconst_1
    //   29: invokevirtual 51	java/lang/reflect/Method:setAccessible	(Z)V
    //   32: iconst_1
    //   33: putstatic 31	android/support/v4/app/BundleCompatDonut:sGetIBinderMethodFetched	Z
    //   36: getstatic 45	android/support/v4/app/BundleCompatDonut:sGetIBinderMethod	Ljava/lang/reflect/Method;
    //   39: ifnull +51 -> 90
    //   42: getstatic 45	android/support/v4/app/BundleCompatDonut:sGetIBinderMethod	Ljava/lang/reflect/Method;
    //   45: aload_0
    //   46: iconst_1
    //   47: anewarray 4	java/lang/Object
    //   50: dup
    //   51: iconst_0
    //   52: aload_1
    //   53: aastore
    //   54: invokevirtual 55	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   57: checkcast 57	android/os/IBinder
    //   60: astore_0
    //   61: aload_0
    //   62: areturn
    //   63: astore_2
    //   64: ldc 8
    //   66: ldc 59
    //   68: aload_2
    //   69: invokestatic 65	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   72: pop
    //   73: goto -41 -> 32
    //   76: astore_0
    //   77: ldc 8
    //   79: ldc 67
    //   81: aload_0
    //   82: invokestatic 65	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   85: pop
    //   86: aconst_null
    //   87: putstatic 45	android/support/v4/app/BundleCompatDonut:sGetIBinderMethod	Ljava/lang/reflect/Method;
    //   90: aconst_null
    //   91: astore_0
    //   92: goto -31 -> 61
    //   95: astore_0
    //   96: goto -19 -> 77
    //   99: astore_0
    //   100: goto -23 -> 77
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	paramBundle	android.os.Bundle
    //   0	103	1	paramString	String
    //   63	6	2	localNoSuchMethodException	NoSuchMethodException
    // Exception table:
    //   from	to	target	type
    //   6	32	63	java/lang/NoSuchMethodException
    //   42	61	76	java/lang/IllegalAccessException
    //   42	61	95	java/lang/IllegalArgumentException
    //   42	61	99	java/lang/reflect/InvocationTargetException
  }
  
  /* Error */
  public static void putBinder(android.os.Bundle paramBundle, String paramString, android.os.IBinder paramIBinder)
  {
    // Byte code:
    //   0: getstatic 71	android/support/v4/app/BundleCompatDonut:sPutIBinderMethodFetched	Z
    //   3: ifne +38 -> 41
    //   6: ldc 33
    //   8: ldc 73
    //   10: iconst_2
    //   11: anewarray 37	java/lang/Class
    //   14: dup
    //   15: iconst_0
    //   16: ldc 39
    //   18: aastore
    //   19: dup
    //   20: iconst_1
    //   21: ldc 57
    //   23: aastore
    //   24: invokevirtual 43	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   27: putstatic 75	android/support/v4/app/BundleCompatDonut:sPutIBinderMethod	Ljava/lang/reflect/Method;
    //   30: getstatic 75	android/support/v4/app/BundleCompatDonut:sPutIBinderMethod	Ljava/lang/reflect/Method;
    //   33: iconst_1
    //   34: invokevirtual 51	java/lang/reflect/Method:setAccessible	(Z)V
    //   37: iconst_1
    //   38: putstatic 71	android/support/v4/app/BundleCompatDonut:sPutIBinderMethodFetched	Z
    //   41: getstatic 75	android/support/v4/app/BundleCompatDonut:sPutIBinderMethod	Ljava/lang/reflect/Method;
    //   44: ifnull +23 -> 67
    //   47: getstatic 75	android/support/v4/app/BundleCompatDonut:sPutIBinderMethod	Ljava/lang/reflect/Method;
    //   50: aload_0
    //   51: iconst_2
    //   52: anewarray 4	java/lang/Object
    //   55: dup
    //   56: iconst_0
    //   57: aload_1
    //   58: aastore
    //   59: dup
    //   60: iconst_1
    //   61: aload_2
    //   62: aastore
    //   63: invokevirtual 55	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   66: pop
    //   67: return
    //   68: astore_3
    //   69: ldc 8
    //   71: ldc 77
    //   73: aload_3
    //   74: invokestatic 65	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   77: pop
    //   78: goto -41 -> 37
    //   81: astore_0
    //   82: ldc 8
    //   84: ldc 79
    //   86: aload_0
    //   87: invokestatic 65	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   90: pop
    //   91: aconst_null
    //   92: putstatic 75	android/support/v4/app/BundleCompatDonut:sPutIBinderMethod	Ljava/lang/reflect/Method;
    //   95: goto -28 -> 67
    //   98: astore_0
    //   99: goto -17 -> 82
    //   102: astore_0
    //   103: goto -21 -> 82
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	paramBundle	android.os.Bundle
    //   0	106	1	paramString	String
    //   0	106	2	paramIBinder	android.os.IBinder
    //   68	6	3	localNoSuchMethodException	NoSuchMethodException
    // Exception table:
    //   from	to	target	type
    //   6	37	68	java/lang/NoSuchMethodException
    //   47	67	81	java/lang/IllegalAccessException
    //   47	67	98	java/lang/IllegalArgumentException
    //   47	67	102	java/lang/reflect/InvocationTargetException
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\android\support\v4\app\BundleCompatDonut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */