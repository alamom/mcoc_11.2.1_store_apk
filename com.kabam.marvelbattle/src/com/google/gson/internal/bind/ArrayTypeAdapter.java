package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal..Gson.Types;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

public final class ArrayTypeAdapter<E>
  extends TypeAdapter<Object>
{
  public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory()
  {
    public <T> TypeAdapter<T> create(Gson paramAnonymousGson, TypeToken<T> paramAnonymousTypeToken)
    {
      paramAnonymousTypeToken = paramAnonymousTypeToken.getType();
      if ((!(paramAnonymousTypeToken instanceof GenericArrayType)) && ((!(paramAnonymousTypeToken instanceof Class)) || (!((Class)paramAnonymousTypeToken).isArray()))) {}
      for (paramAnonymousGson = null;; paramAnonymousGson = new ArrayTypeAdapter(paramAnonymousGson, paramAnonymousGson.getAdapter(TypeToken.get(paramAnonymousTypeToken)), .Gson.Types.getRawType(paramAnonymousTypeToken)))
      {
        return paramAnonymousGson;
        paramAnonymousTypeToken = .Gson.Types.getArrayComponentType(paramAnonymousTypeToken);
      }
    }
  };
  private final Class<E> componentType;
  private final TypeAdapter<E> componentTypeAdapter;
  
  public ArrayTypeAdapter(Gson paramGson, TypeAdapter<E> paramTypeAdapter, Class<E> paramClass)
  {
    this.componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper(paramGson, paramTypeAdapter, paramClass);
    this.componentType = paramClass;
  }
  
  public Object read(JsonReader paramJsonReader)
    throws IOException
  {
    if (paramJsonReader.peek() == JsonToken.NULL)
    {
      paramJsonReader.nextNull();
      paramJsonReader = null;
      return paramJsonReader;
    }
    ArrayList localArrayList = new ArrayList();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext()) {
      localArrayList.add(this.componentTypeAdapter.read(paramJsonReader));
    }
    paramJsonReader.endArray();
    Object localObject = Array.newInstance(this.componentType, localArrayList.size());
    for (int i = 0;; i++)
    {
      paramJsonReader = (JsonReader)localObject;
      if (i >= localArrayList.size()) {
        break;
      }
      Array.set(localObject, i, localArrayList.get(i));
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject)
    throws IOException
  {
    if (paramObject == null) {
      paramJsonWriter.nullValue();
    }
    for (;;)
    {
      return;
      paramJsonWriter.beginArray();
      int i = 0;
      int j = Array.getLength(paramObject);
      while (i < j)
      {
        Object localObject = Array.get(paramObject, i);
        this.componentTypeAdapter.write(paramJsonWriter, localObject);
        i++;
      }
      paramJsonWriter.endArray();
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\gson\internal\bind\ArrayTypeAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */