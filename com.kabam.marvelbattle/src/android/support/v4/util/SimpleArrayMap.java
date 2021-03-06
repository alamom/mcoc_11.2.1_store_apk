package android.support.v4.util;

import java.util.Map;

public class SimpleArrayMap<K, V>
{
  private static final int BASE_SIZE = 4;
  private static final int CACHE_SIZE = 10;
  private static final boolean DEBUG = false;
  private static final String TAG = "ArrayMap";
  static Object[] mBaseCache;
  static int mBaseCacheSize;
  static Object[] mTwiceBaseCache;
  static int mTwiceBaseCacheSize;
  Object[] mArray;
  int[] mHashes;
  int mSize;
  
  public SimpleArrayMap()
  {
    this.mHashes = ContainerHelpers.EMPTY_INTS;
    this.mArray = ContainerHelpers.EMPTY_OBJECTS;
    this.mSize = 0;
  }
  
  public SimpleArrayMap(int paramInt)
  {
    if (paramInt == 0)
    {
      this.mHashes = ContainerHelpers.EMPTY_INTS;
      this.mArray = ContainerHelpers.EMPTY_OBJECTS;
    }
    for (;;)
    {
      this.mSize = 0;
      return;
      allocArrays(paramInt);
    }
  }
  
  public SimpleArrayMap(SimpleArrayMap paramSimpleArrayMap)
  {
    this();
    if (paramSimpleArrayMap != null) {
      putAll(paramSimpleArrayMap);
    }
  }
  
  private void allocArrays(int paramInt)
  {
    if (paramInt == 8) {}
    for (;;)
    {
      try
      {
        if (mTwiceBaseCache != null)
        {
          Object[] arrayOfObject1 = mTwiceBaseCache;
          this.mArray = arrayOfObject1;
          mTwiceBaseCache = (Object[])arrayOfObject1[0];
          this.mHashes = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          mTwiceBaseCacheSize -= 1;
          return;
        }
        this.mHashes = new int[paramInt];
        this.mArray = new Object[paramInt << 1];
        continue;
        if (paramInt != 4) {
          continue;
        }
      }
      finally {}
      try
      {
        if (mBaseCache != null)
        {
          Object[] arrayOfObject2 = mBaseCache;
          this.mArray = arrayOfObject2;
          mBaseCache = (Object[])arrayOfObject2[0];
          this.mHashes = ((int[])arrayOfObject2[1]);
          arrayOfObject2[1] = null;
          arrayOfObject2[0] = null;
          mBaseCacheSize -= 1;
          continue;
        }
      }
      finally {}
    }
  }
  
  private static void freeArrays(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {}
    for (;;)
    {
      try
      {
        if (mTwiceBaseCacheSize < 10)
        {
          paramArrayOfObject[0] = mTwiceBaseCache;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt = (paramInt << 1) - 1;
          if (paramInt >= 2)
          {
            paramArrayOfObject[paramInt] = null;
            paramInt--;
            continue;
          }
          mTwiceBaseCache = paramArrayOfObject;
          mTwiceBaseCacheSize += 1;
        }
        return;
      }
      finally {}
      if (paramArrayOfInt.length != 4) {
        continue;
      }
      try
      {
        if (mBaseCacheSize < 10)
        {
          paramArrayOfObject[0] = mBaseCache;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (paramInt = (paramInt << 1) - 1; paramInt >= 2; paramInt--) {
            paramArrayOfObject[paramInt] = null;
          }
          mBaseCache = paramArrayOfObject;
          mBaseCacheSize += 1;
        }
      }
      finally {}
    }
  }
  
  public void clear()
  {
    if (this.mSize != 0)
    {
      freeArrays(this.mHashes, this.mArray, this.mSize);
      this.mHashes = ContainerHelpers.EMPTY_INTS;
      this.mArray = ContainerHelpers.EMPTY_OBJECTS;
      this.mSize = 0;
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    if (indexOfKey(paramObject) >= 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean containsValue(Object paramObject)
  {
    if (indexOfValue(paramObject) >= 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void ensureCapacity(int paramInt)
  {
    if (this.mHashes.length < paramInt)
    {
      int[] arrayOfInt = this.mHashes;
      Object[] arrayOfObject = this.mArray;
      allocArrays(paramInt);
      if (this.mSize > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.mHashes, 0, this.mSize);
        System.arraycopy(arrayOfObject, 0, this.mArray, 0, this.mSize << 1);
      }
      freeArrays(arrayOfInt, arrayOfObject, this.mSize);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1;
    if (this == paramObject) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      if ((paramObject instanceof Map))
      {
        Map localMap = (Map)paramObject;
        if (size() != localMap.size())
        {
          bool1 = false;
        }
        else
        {
          int i = 0;
          bool1 = bool2;
          try
          {
            if (i >= this.mSize) {
              continue;
            }
            Object localObject2 = keyAt(i);
            Object localObject1 = valueAt(i);
            paramObject = localMap.get(localObject2);
            if (localObject1 == null)
            {
              if ((paramObject != null) || (!localMap.containsKey(localObject2))) {
                bool1 = false;
              }
            }
            else
            {
              bool1 = localObject1.equals(paramObject);
              if (!bool1)
              {
                bool1 = false;
                continue;
              }
            }
            i++;
          }
          catch (NullPointerException paramObject)
          {
            bool1 = false;
            continue;
          }
          catch (ClassCastException paramObject)
          {
            bool1 = false;
          }
        }
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public V get(Object paramObject)
  {
    int i = indexOfKey(paramObject);
    if (i >= 0) {}
    for (paramObject = this.mArray[((i << 1) + 1)];; paramObject = null) {
      return (V)paramObject;
    }
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = this.mHashes;
    Object[] arrayOfObject = this.mArray;
    int j = 0;
    int k = 0;
    int i = 1;
    int n = this.mSize;
    if (k < n)
    {
      Object localObject = arrayOfObject[i];
      int i1 = arrayOfInt[k];
      if (localObject == null) {}
      for (int m = 0;; m = localObject.hashCode())
      {
        j += (m ^ i1);
        k++;
        i += 2;
        break;
      }
    }
    return j;
  }
  
  int indexOf(Object paramObject, int paramInt)
  {
    int k = this.mSize;
    int i;
    if (k == 0) {
      i = -1;
    }
    for (;;)
    {
      return i;
      int j = ContainerHelpers.binarySearch(this.mHashes, k, paramInt);
      i = j;
      if (j >= 0)
      {
        i = j;
        if (!paramObject.equals(this.mArray[(j << 1)]))
        {
          for (i = j + 1;; i++)
          {
            if ((i >= k) || (this.mHashes[i] != paramInt)) {
              break label99;
            }
            if (paramObject.equals(this.mArray[(i << 1)])) {
              break;
            }
          }
          label99:
          j--;
          for (;;)
          {
            if ((j < 0) || (this.mHashes[j] != paramInt)) {
              break label146;
            }
            if (paramObject.equals(this.mArray[(j << 1)]))
            {
              i = j;
              break;
            }
            j--;
          }
          label146:
          i ^= 0xFFFFFFFF;
        }
      }
    }
  }
  
  public int indexOfKey(Object paramObject)
  {
    if (paramObject == null) {}
    for (int i = indexOfNull();; i = indexOf(paramObject, paramObject.hashCode())) {
      return i;
    }
  }
  
  int indexOfNull()
  {
    int k = this.mSize;
    int i;
    if (k == 0) {
      i = -1;
    }
    for (;;)
    {
      return i;
      int j = ContainerHelpers.binarySearch(this.mHashes, k, 0);
      i = j;
      if (j >= 0)
      {
        i = j;
        if (this.mArray[(j << 1)] != null)
        {
          for (i = j + 1;; i++)
          {
            if ((i >= k) || (this.mHashes[i] != 0)) {
              break label80;
            }
            if (this.mArray[(i << 1)] == null) {
              break;
            }
          }
          label80:
          j--;
          for (;;)
          {
            if ((j < 0) || (this.mHashes[j] != 0)) {
              break label118;
            }
            if (this.mArray[(j << 1)] == null)
            {
              i = j;
              break;
            }
            j--;
          }
          label118:
          i ^= 0xFFFFFFFF;
        }
      }
    }
  }
  
  int indexOfValue(Object paramObject)
  {
    int j = this.mSize * 2;
    Object[] arrayOfObject = this.mArray;
    int i;
    if (paramObject == null)
    {
      i = 1;
      if (i >= j) {
        break label74;
      }
      if (arrayOfObject[i] == null) {
        i >>= 1;
      }
    }
    for (;;)
    {
      return i;
      i += 2;
      break;
      for (i = 1;; i += 2)
      {
        if (i >= j) {
          break label74;
        }
        if (paramObject.equals(arrayOfObject[i]))
        {
          i >>= 1;
          break;
        }
      }
      label74:
      i = -1;
    }
  }
  
  public boolean isEmpty()
  {
    if (this.mSize <= 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public K keyAt(int paramInt)
  {
    return (K)this.mArray[(paramInt << 1)];
  }
  
  public V put(K paramK, V paramV)
  {
    int k = 8;
    int j;
    if (paramK == null) {
      j = 0;
    }
    for (int i = indexOfNull(); i >= 0; i = indexOf(paramK, j))
    {
      i = (i << 1) + 1;
      paramK = this.mArray[i];
      this.mArray[i] = paramV;
      return paramK;
      j = paramK.hashCode();
    }
    int m = i ^ 0xFFFFFFFF;
    if (this.mSize >= this.mHashes.length)
    {
      if (this.mSize < 8) {
        break label270;
      }
      i = this.mSize + (this.mSize >> 1);
    }
    for (;;)
    {
      int[] arrayOfInt = this.mHashes;
      Object[] arrayOfObject = this.mArray;
      allocArrays(i);
      if (this.mHashes.length > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.mHashes, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject, 0, this.mArray, 0, arrayOfObject.length);
      }
      freeArrays(arrayOfInt, arrayOfObject, this.mSize);
      if (m < this.mSize)
      {
        System.arraycopy(this.mHashes, m, this.mHashes, m + 1, this.mSize - m);
        System.arraycopy(this.mArray, m << 1, this.mArray, m + 1 << 1, this.mSize - m << 1);
      }
      this.mHashes[m] = j;
      this.mArray[(m << 1)] = paramK;
      this.mArray[((m << 1) + 1)] = paramV;
      this.mSize += 1;
      paramK = null;
      break;
      label270:
      i = k;
      if (this.mSize < 4) {
        i = 4;
      }
    }
  }
  
  public void putAll(SimpleArrayMap<? extends K, ? extends V> paramSimpleArrayMap)
  {
    int j = paramSimpleArrayMap.mSize;
    ensureCapacity(this.mSize + j);
    if (this.mSize == 0) {
      if (j > 0)
      {
        System.arraycopy(paramSimpleArrayMap.mHashes, 0, this.mHashes, 0, j);
        System.arraycopy(paramSimpleArrayMap.mArray, 0, this.mArray, 0, j << 1);
        this.mSize = j;
      }
    }
    for (;;)
    {
      return;
      for (int i = 0; i < j; i++) {
        put(paramSimpleArrayMap.keyAt(i), paramSimpleArrayMap.valueAt(i));
      }
    }
  }
  
  public V remove(Object paramObject)
  {
    int i = indexOfKey(paramObject);
    if (i >= 0) {}
    for (paramObject = removeAt(i);; paramObject = null) {
      return (V)paramObject;
    }
  }
  
  public V removeAt(int paramInt)
  {
    int i = 8;
    Object localObject = this.mArray[((paramInt << 1) + 1)];
    if (this.mSize <= 1)
    {
      freeArrays(this.mHashes, this.mArray, this.mSize);
      this.mHashes = ContainerHelpers.EMPTY_INTS;
      this.mArray = ContainerHelpers.EMPTY_OBJECTS;
      this.mSize = 0;
    }
    for (;;)
    {
      return (V)localObject;
      if ((this.mHashes.length > 8) && (this.mSize < this.mHashes.length / 3))
      {
        if (this.mSize > 8) {
          i = this.mSize + (this.mSize >> 1);
        }
        int[] arrayOfInt = this.mHashes;
        Object[] arrayOfObject = this.mArray;
        allocArrays(i);
        this.mSize -= 1;
        if (paramInt > 0)
        {
          System.arraycopy(arrayOfInt, 0, this.mHashes, 0, paramInt);
          System.arraycopy(arrayOfObject, 0, this.mArray, 0, paramInt << 1);
        }
        if (paramInt < this.mSize)
        {
          System.arraycopy(arrayOfInt, paramInt + 1, this.mHashes, paramInt, this.mSize - paramInt);
          System.arraycopy(arrayOfObject, paramInt + 1 << 1, this.mArray, paramInt << 1, this.mSize - paramInt << 1);
        }
      }
      else
      {
        this.mSize -= 1;
        if (paramInt < this.mSize)
        {
          System.arraycopy(this.mHashes, paramInt + 1, this.mHashes, paramInt, this.mSize - paramInt);
          System.arraycopy(this.mArray, paramInt + 1 << 1, this.mArray, paramInt << 1, this.mSize - paramInt << 1);
        }
        this.mArray[(this.mSize << 1)] = null;
        this.mArray[((this.mSize << 1) + 1)] = null;
      }
    }
  }
  
  public V setValueAt(int paramInt, V paramV)
  {
    paramInt = (paramInt << 1) + 1;
    Object localObject = this.mArray[paramInt];
    this.mArray[paramInt] = paramV;
    return (V)localObject;
  }
  
  public int size()
  {
    return this.mSize;
  }
  
  public String toString()
  {
    if (isEmpty()) {}
    for (Object localObject1 = "{}";; localObject1 = ((StringBuilder)localObject1).toString())
    {
      return (String)localObject1;
      localObject1 = new StringBuilder(this.mSize * 28);
      ((StringBuilder)localObject1).append('{');
      int i = 0;
      if (i < this.mSize)
      {
        if (i > 0) {
          ((StringBuilder)localObject1).append(", ");
        }
        Object localObject2 = keyAt(i);
        if (localObject2 != this)
        {
          ((StringBuilder)localObject1).append(localObject2);
          label72:
          ((StringBuilder)localObject1).append('=');
          localObject2 = valueAt(i);
          if (localObject2 == this) {
            break label112;
          }
          ((StringBuilder)localObject1).append(localObject2);
        }
        for (;;)
        {
          i++;
          break;
          ((StringBuilder)localObject1).append("(this Map)");
          break label72;
          label112:
          ((StringBuilder)localObject1).append("(this Map)");
        }
      }
      ((StringBuilder)localObject1).append('}');
    }
  }
  
  public V valueAt(int paramInt)
  {
    return (V)this.mArray[((paramInt << 1) + 1)];
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\android\support\v4\util\SimpleArrayMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */