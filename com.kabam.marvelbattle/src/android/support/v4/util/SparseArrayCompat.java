package android.support.v4.util;

public class SparseArrayCompat<E>
  implements Cloneable
{
  private static final Object DELETED = new Object();
  private boolean mGarbage = false;
  private int[] mKeys;
  private int mSize;
  private Object[] mValues;
  
  public SparseArrayCompat()
  {
    this(10);
  }
  
  public SparseArrayCompat(int paramInt)
  {
    if (paramInt == 0) {
      this.mKeys = ContainerHelpers.EMPTY_INTS;
    }
    for (this.mValues = ContainerHelpers.EMPTY_OBJECTS;; this.mValues = new Object[paramInt])
    {
      this.mSize = 0;
      return;
      paramInt = ContainerHelpers.idealIntArraySize(paramInt);
      this.mKeys = new int[paramInt];
    }
  }
  
  private void gc()
  {
    int m = this.mSize;
    int k = 0;
    int[] arrayOfInt = this.mKeys;
    Object[] arrayOfObject = this.mValues;
    int j = 0;
    while (j < m)
    {
      Object localObject = arrayOfObject[j];
      int i = k;
      if (localObject != DELETED)
      {
        if (j != k)
        {
          arrayOfInt[k] = arrayOfInt[j];
          arrayOfObject[k] = localObject;
          arrayOfObject[j] = null;
        }
        i = k + 1;
      }
      j++;
      k = i;
    }
    this.mGarbage = false;
    this.mSize = k;
  }
  
  public void append(int paramInt, E paramE)
  {
    if ((this.mSize != 0) && (paramInt <= this.mKeys[(this.mSize - 1)])) {
      put(paramInt, paramE);
    }
    for (;;)
    {
      return;
      if ((this.mGarbage) && (this.mSize >= this.mKeys.length)) {
        gc();
      }
      int j = this.mSize;
      if (j >= this.mKeys.length)
      {
        int i = ContainerHelpers.idealIntArraySize(j + 1);
        int[] arrayOfInt = new int[i];
        Object[] arrayOfObject = new Object[i];
        System.arraycopy(this.mKeys, 0, arrayOfInt, 0, this.mKeys.length);
        System.arraycopy(this.mValues, 0, arrayOfObject, 0, this.mValues.length);
        this.mKeys = arrayOfInt;
        this.mValues = arrayOfObject;
      }
      this.mKeys[j] = paramInt;
      this.mValues[j] = paramE;
      this.mSize = (j + 1);
    }
  }
  
  public void clear()
  {
    int j = this.mSize;
    Object[] arrayOfObject = this.mValues;
    for (int i = 0; i < j; i++) {
      arrayOfObject[i] = null;
    }
    this.mSize = 0;
    this.mGarbage = false;
  }
  
  public SparseArrayCompat<E> clone()
  {
    Object localObject = null;
    try
    {
      SparseArrayCompat localSparseArrayCompat = (SparseArrayCompat)super.clone();
      localObject = localSparseArrayCompat;
      localSparseArrayCompat.mKeys = ((int[])this.mKeys.clone());
      localObject = localSparseArrayCompat;
      localSparseArrayCompat.mValues = ((Object[])this.mValues.clone());
      localObject = localSparseArrayCompat;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      for (;;) {}
    }
    return (SparseArrayCompat<E>)localObject;
  }
  
  public void delete(int paramInt)
  {
    paramInt = ContainerHelpers.binarySearch(this.mKeys, this.mSize, paramInt);
    if ((paramInt >= 0) && (this.mValues[paramInt] != DELETED))
    {
      this.mValues[paramInt] = DELETED;
      this.mGarbage = true;
    }
  }
  
  public E get(int paramInt)
  {
    return (E)get(paramInt, null);
  }
  
  public E get(int paramInt, E paramE)
  {
    paramInt = ContainerHelpers.binarySearch(this.mKeys, this.mSize, paramInt);
    Object localObject = paramE;
    if (paramInt >= 0) {
      if (this.mValues[paramInt] != DELETED) {
        break label35;
      }
    }
    label35:
    for (localObject = paramE;; localObject = this.mValues[paramInt]) {
      return (E)localObject;
    }
  }
  
  public int indexOfKey(int paramInt)
  {
    if (this.mGarbage) {
      gc();
    }
    return ContainerHelpers.binarySearch(this.mKeys, this.mSize, paramInt);
  }
  
  public int indexOfValue(E paramE)
  {
    if (this.mGarbage) {
      gc();
    }
    int i = 0;
    if (i < this.mSize) {
      if (this.mValues[i] != paramE) {}
    }
    for (;;)
    {
      return i;
      i++;
      break;
      i = -1;
    }
  }
  
  public int keyAt(int paramInt)
  {
    if (this.mGarbage) {
      gc();
    }
    return this.mKeys[paramInt];
  }
  
  public void put(int paramInt, E paramE)
  {
    int i = ContainerHelpers.binarySearch(this.mKeys, this.mSize, paramInt);
    if (i >= 0) {
      this.mValues[i] = paramE;
    }
    for (;;)
    {
      return;
      int j = i ^ 0xFFFFFFFF;
      if ((j < this.mSize) && (this.mValues[j] == DELETED))
      {
        this.mKeys[j] = paramInt;
        this.mValues[j] = paramE;
      }
      else
      {
        i = j;
        if (this.mGarbage)
        {
          i = j;
          if (this.mSize >= this.mKeys.length)
          {
            gc();
            i = ContainerHelpers.binarySearch(this.mKeys, this.mSize, paramInt) ^ 0xFFFFFFFF;
          }
        }
        if (this.mSize >= this.mKeys.length)
        {
          j = ContainerHelpers.idealIntArraySize(this.mSize + 1);
          int[] arrayOfInt = new int[j];
          Object[] arrayOfObject = new Object[j];
          System.arraycopy(this.mKeys, 0, arrayOfInt, 0, this.mKeys.length);
          System.arraycopy(this.mValues, 0, arrayOfObject, 0, this.mValues.length);
          this.mKeys = arrayOfInt;
          this.mValues = arrayOfObject;
        }
        if (this.mSize - i != 0)
        {
          System.arraycopy(this.mKeys, i, this.mKeys, i + 1, this.mSize - i);
          System.arraycopy(this.mValues, i, this.mValues, i + 1, this.mSize - i);
        }
        this.mKeys[i] = paramInt;
        this.mValues[i] = paramE;
        this.mSize += 1;
      }
    }
  }
  
  public void remove(int paramInt)
  {
    delete(paramInt);
  }
  
  public void removeAt(int paramInt)
  {
    if (this.mValues[paramInt] != DELETED)
    {
      this.mValues[paramInt] = DELETED;
      this.mGarbage = true;
    }
  }
  
  public void removeAtRange(int paramInt1, int paramInt2)
  {
    paramInt2 = Math.min(this.mSize, paramInt1 + paramInt2);
    while (paramInt1 < paramInt2)
    {
      removeAt(paramInt1);
      paramInt1++;
    }
  }
  
  public void setValueAt(int paramInt, E paramE)
  {
    if (this.mGarbage) {
      gc();
    }
    this.mValues[paramInt] = paramE;
  }
  
  public int size()
  {
    if (this.mGarbage) {
      gc();
    }
    return this.mSize;
  }
  
  public String toString()
  {
    if (size() <= 0) {}
    StringBuilder localStringBuilder;
    for (Object localObject = "{}";; localObject = localStringBuilder.toString())
    {
      return (String)localObject;
      localStringBuilder = new StringBuilder(this.mSize * 28);
      localStringBuilder.append('{');
      int i = 0;
      if (i < this.mSize)
      {
        if (i > 0) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append(keyAt(i));
        localStringBuilder.append('=');
        localObject = valueAt(i);
        if (localObject != this) {
          localStringBuilder.append(localObject);
        }
        for (;;)
        {
          i++;
          break;
          localStringBuilder.append("(this Map)");
        }
      }
      localStringBuilder.append('}');
    }
  }
  
  public E valueAt(int paramInt)
  {
    if (this.mGarbage) {
      gc();
    }
    return (E)this.mValues[paramInt];
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\android\support\v4\util\SparseArrayCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */