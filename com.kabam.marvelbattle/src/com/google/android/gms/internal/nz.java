package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.Person.AgeRange;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Cover.CoverInfo;
import com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto;
import com.google.android.gms.plus.model.people.Person.Image;
import com.google.android.gms.plus.model.people.Person.Name;
import com.google.android.gms.plus.model.people.Person.Organizations;
import com.google.android.gms.plus.model.people.Person.PlacesLived;
import com.google.android.gms.plus.model.people.Person.Urls;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class nz
  extends jj
  implements Person
{
  public static final oa CREATOR = new oa();
  private static final HashMap<String, ji.a<?, ?>> amb = new HashMap();
  String BL;
  final int BR;
  String Fc;
  String NH;
  final Set<Integer> amc;
  String ana;
  a anb;
  String anc;
  String and;
  int ane;
  b anf;
  String ang;
  c anh;
  boolean ani;
  d anj;
  String ank;
  int anl;
  List<f> anm;
  List<g> ann;
  int ano;
  int anp;
  String anq;
  List<h> anr;
  boolean ans;
  int om;
  String uR;
  
  static
  {
    amb.put("aboutMe", ji.a.l("aboutMe", 2));
    amb.put("ageRange", ji.a.a("ageRange", 3, a.class));
    amb.put("birthday", ji.a.l("birthday", 4));
    amb.put("braggingRights", ji.a.l("braggingRights", 5));
    amb.put("circledByCount", ji.a.i("circledByCount", 6));
    amb.put("cover", ji.a.a("cover", 7, b.class));
    amb.put("currentLocation", ji.a.l("currentLocation", 8));
    amb.put("displayName", ji.a.l("displayName", 9));
    amb.put("gender", ji.a.a("gender", 12, new jf().h("male", 0).h("female", 1).h("other", 2), false));
    amb.put("id", ji.a.l("id", 14));
    amb.put("image", ji.a.a("image", 15, c.class));
    amb.put("isPlusUser", ji.a.k("isPlusUser", 16));
    amb.put("language", ji.a.l("language", 18));
    amb.put("name", ji.a.a("name", 19, d.class));
    amb.put("nickname", ji.a.l("nickname", 20));
    amb.put("objectType", ji.a.a("objectType", 21, new jf().h("person", 0).h("page", 1), false));
    amb.put("organizations", ji.a.b("organizations", 22, f.class));
    amb.put("placesLived", ji.a.b("placesLived", 23, g.class));
    amb.put("plusOneCount", ji.a.i("plusOneCount", 24));
    amb.put("relationshipStatus", ji.a.a("relationshipStatus", 25, new jf().h("single", 0).h("in_a_relationship", 1).h("engaged", 2).h("married", 3).h("its_complicated", 4).h("open_relationship", 5).h("widowed", 6).h("in_domestic_partnership", 7).h("in_civil_union", 8), false));
    amb.put("tagline", ji.a.l("tagline", 26));
    amb.put("url", ji.a.l("url", 27));
    amb.put("urls", ji.a.b("urls", 28, h.class));
    amb.put("verified", ji.a.k("verified", 29));
  }
  
  public nz()
  {
    this.BR = 1;
    this.amc = new HashSet();
  }
  
  public nz(String paramString1, String paramString2, c paramc, int paramInt, String paramString3)
  {
    this.BR = 1;
    this.amc = new HashSet();
    this.NH = paramString1;
    this.amc.add(Integer.valueOf(9));
    this.BL = paramString2;
    this.amc.add(Integer.valueOf(14));
    this.anh = paramc;
    this.amc.add(Integer.valueOf(15));
    this.anl = paramInt;
    this.amc.add(Integer.valueOf(21));
    this.uR = paramString3;
    this.amc.add(Integer.valueOf(27));
  }
  
  nz(Set<Integer> paramSet, int paramInt1, String paramString1, a parama, String paramString2, String paramString3, int paramInt2, b paramb, String paramString4, String paramString5, int paramInt3, String paramString6, c paramc, boolean paramBoolean1, String paramString7, d paramd, String paramString8, int paramInt4, List<f> paramList, List<g> paramList1, int paramInt5, int paramInt6, String paramString9, String paramString10, List<h> paramList2, boolean paramBoolean2)
  {
    this.amc = paramSet;
    this.BR = paramInt1;
    this.ana = paramString1;
    this.anb = parama;
    this.anc = paramString2;
    this.and = paramString3;
    this.ane = paramInt2;
    this.anf = paramb;
    this.ang = paramString4;
    this.NH = paramString5;
    this.om = paramInt3;
    this.BL = paramString6;
    this.anh = paramc;
    this.ani = paramBoolean1;
    this.Fc = paramString7;
    this.anj = paramd;
    this.ank = paramString8;
    this.anl = paramInt4;
    this.anm = paramList;
    this.ann = paramList1;
    this.ano = paramInt5;
    this.anp = paramInt6;
    this.anq = paramString9;
    this.uR = paramString10;
    this.anr = paramList2;
    this.ans = paramBoolean2;
  }
  
  public static nz i(byte[] paramArrayOfByte)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
    localParcel.setDataPosition(0);
    paramArrayOfByte = CREATOR.dd(localParcel);
    localParcel.recycle();
    return paramArrayOfByte;
  }
  
  protected boolean a(ji.a parama)
  {
    return this.amc.contains(Integer.valueOf(parama.hm()));
  }
  
  protected Object b(ji.a parama)
  {
    switch (parama.hm())
    {
    case 10: 
    case 11: 
    case 13: 
    case 17: 
    default: 
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.hm());
    case 2: 
      parama = this.ana;
    }
    for (;;)
    {
      return parama;
      parama = this.anb;
      continue;
      parama = this.anc;
      continue;
      parama = this.and;
      continue;
      parama = Integer.valueOf(this.ane);
      continue;
      parama = this.anf;
      continue;
      parama = this.ang;
      continue;
      parama = this.NH;
      continue;
      parama = Integer.valueOf(this.om);
      continue;
      parama = this.BL;
      continue;
      parama = this.anh;
      continue;
      parama = Boolean.valueOf(this.ani);
      continue;
      parama = this.Fc;
      continue;
      parama = this.anj;
      continue;
      parama = this.ank;
      continue;
      parama = Integer.valueOf(this.anl);
      continue;
      parama = this.anm;
      continue;
      parama = this.ann;
      continue;
      parama = Integer.valueOf(this.ano);
      continue;
      parama = Integer.valueOf(this.anp);
      continue;
      parama = this.anq;
      continue;
      parama = this.uR;
      continue;
      parama = this.anr;
      continue;
      parama = Boolean.valueOf(this.ans);
    }
  }
  
  public int describeContents()
  {
    oa localoa = CREATOR;
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (!(paramObject instanceof nz)) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      if (this == paramObject)
      {
        bool = true;
      }
      else
      {
        nz localnz = (nz)paramObject;
        paramObject = amb.values().iterator();
        for (;;)
        {
          if (((Iterator)paramObject).hasNext())
          {
            ji.a locala = (ji.a)((Iterator)paramObject).next();
            if (a(locala))
            {
              if (localnz.a(locala))
              {
                if (b(locala).equals(localnz.b(locala))) {
                  continue;
                }
                bool = false;
                break;
              }
              bool = false;
              break;
            }
            if (localnz.a(locala))
            {
              bool = false;
              break;
            }
          }
        }
        bool = true;
      }
    }
  }
  
  public String getAboutMe()
  {
    return this.ana;
  }
  
  public Person.AgeRange getAgeRange()
  {
    return this.anb;
  }
  
  public String getBirthday()
  {
    return this.anc;
  }
  
  public String getBraggingRights()
  {
    return this.and;
  }
  
  public int getCircledByCount()
  {
    return this.ane;
  }
  
  public Person.Cover getCover()
  {
    return this.anf;
  }
  
  public String getCurrentLocation()
  {
    return this.ang;
  }
  
  public String getDisplayName()
  {
    return this.NH;
  }
  
  public int getGender()
  {
    return this.om;
  }
  
  public String getId()
  {
    return this.BL;
  }
  
  public Person.Image getImage()
  {
    return this.anh;
  }
  
  public String getLanguage()
  {
    return this.Fc;
  }
  
  public Person.Name getName()
  {
    return this.anj;
  }
  
  public String getNickname()
  {
    return this.ank;
  }
  
  public int getObjectType()
  {
    return this.anl;
  }
  
  public List<Person.Organizations> getOrganizations()
  {
    return (ArrayList)this.anm;
  }
  
  public List<Person.PlacesLived> getPlacesLived()
  {
    return (ArrayList)this.ann;
  }
  
  public int getPlusOneCount()
  {
    return this.ano;
  }
  
  public int getRelationshipStatus()
  {
    return this.anp;
  }
  
  public String getTagline()
  {
    return this.anq;
  }
  
  public String getUrl()
  {
    return this.uR;
  }
  
  public List<Person.Urls> getUrls()
  {
    return (ArrayList)this.anr;
  }
  
  public boolean hasAboutMe()
  {
    return this.amc.contains(Integer.valueOf(2));
  }
  
  public boolean hasAgeRange()
  {
    return this.amc.contains(Integer.valueOf(3));
  }
  
  public boolean hasBirthday()
  {
    return this.amc.contains(Integer.valueOf(4));
  }
  
  public boolean hasBraggingRights()
  {
    return this.amc.contains(Integer.valueOf(5));
  }
  
  public boolean hasCircledByCount()
  {
    return this.amc.contains(Integer.valueOf(6));
  }
  
  public boolean hasCover()
  {
    return this.amc.contains(Integer.valueOf(7));
  }
  
  public boolean hasCurrentLocation()
  {
    return this.amc.contains(Integer.valueOf(8));
  }
  
  public boolean hasDisplayName()
  {
    return this.amc.contains(Integer.valueOf(9));
  }
  
  public boolean hasGender()
  {
    return this.amc.contains(Integer.valueOf(12));
  }
  
  public boolean hasId()
  {
    return this.amc.contains(Integer.valueOf(14));
  }
  
  public boolean hasImage()
  {
    return this.amc.contains(Integer.valueOf(15));
  }
  
  public boolean hasIsPlusUser()
  {
    return this.amc.contains(Integer.valueOf(16));
  }
  
  public boolean hasLanguage()
  {
    return this.amc.contains(Integer.valueOf(18));
  }
  
  public boolean hasName()
  {
    return this.amc.contains(Integer.valueOf(19));
  }
  
  public boolean hasNickname()
  {
    return this.amc.contains(Integer.valueOf(20));
  }
  
  public boolean hasObjectType()
  {
    return this.amc.contains(Integer.valueOf(21));
  }
  
  public boolean hasOrganizations()
  {
    return this.amc.contains(Integer.valueOf(22));
  }
  
  public boolean hasPlacesLived()
  {
    return this.amc.contains(Integer.valueOf(23));
  }
  
  public boolean hasPlusOneCount()
  {
    return this.amc.contains(Integer.valueOf(24));
  }
  
  public boolean hasRelationshipStatus()
  {
    return this.amc.contains(Integer.valueOf(25));
  }
  
  public boolean hasTagline()
  {
    return this.amc.contains(Integer.valueOf(26));
  }
  
  public boolean hasUrl()
  {
    return this.amc.contains(Integer.valueOf(27));
  }
  
  public boolean hasUrls()
  {
    return this.amc.contains(Integer.valueOf(28));
  }
  
  public boolean hasVerified()
  {
    return this.amc.contains(Integer.valueOf(29));
  }
  
  public int hashCode()
  {
    Iterator localIterator = amb.values().iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      ji.a locala = (ji.a)localIterator.next();
      if (!a(locala)) {
        break label68;
      }
      int j = locala.hm();
      i = b(locala).hashCode() + (i + j);
    }
    label68:
    for (;;)
    {
      break;
      return i;
    }
  }
  
  public HashMap<String, ji.a<?, ?>> hf()
  {
    return amb;
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public boolean isPlusUser()
  {
    return this.ani;
  }
  
  public boolean isVerified()
  {
    return this.ans;
  }
  
  public nz nu()
  {
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oa localoa = CREATOR;
    oa.a(this, paramParcel, paramInt);
  }
  
  public static final class a
    extends jj
    implements Person.AgeRange
  {
    public static final ob CREATOR = new ob();
    private static final HashMap<String, ji.a<?, ?>> amb = new HashMap();
    final int BR;
    final Set<Integer> amc;
    int ant;
    int anu;
    
    static
    {
      amb.put("max", ji.a.i("max", 2));
      amb.put("min", ji.a.i("min", 3));
    }
    
    public a()
    {
      this.BR = 1;
      this.amc = new HashSet();
    }
    
    a(Set<Integer> paramSet, int paramInt1, int paramInt2, int paramInt3)
    {
      this.amc = paramSet;
      this.BR = paramInt1;
      this.ant = paramInt2;
      this.anu = paramInt3;
    }
    
    protected boolean a(ji.a parama)
    {
      return this.amc.contains(Integer.valueOf(parama.hm()));
    }
    
    protected Object b(ji.a parama)
    {
      switch (parama.hm())
      {
      default: 
        throw new IllegalStateException("Unknown safe parcelable id=" + parama.hm());
      }
      for (parama = Integer.valueOf(this.ant);; parama = Integer.valueOf(this.anu)) {
        return parama;
      }
    }
    
    public int describeContents()
    {
      ob localob = CREATOR;
      return 0;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if (!(paramObject instanceof a)) {
        bool = false;
      }
      for (;;)
      {
        return bool;
        if (this == paramObject)
        {
          bool = true;
        }
        else
        {
          a locala1 = (a)paramObject;
          paramObject = amb.values().iterator();
          for (;;)
          {
            if (((Iterator)paramObject).hasNext())
            {
              ji.a locala = (ji.a)((Iterator)paramObject).next();
              if (a(locala))
              {
                if (locala1.a(locala))
                {
                  if (b(locala).equals(locala1.b(locala))) {
                    continue;
                  }
                  bool = false;
                  break;
                }
                bool = false;
                break;
              }
              if (locala1.a(locala))
              {
                bool = false;
                break;
              }
            }
          }
          bool = true;
        }
      }
    }
    
    public int getMax()
    {
      return this.ant;
    }
    
    public int getMin()
    {
      return this.anu;
    }
    
    public boolean hasMax()
    {
      return this.amc.contains(Integer.valueOf(2));
    }
    
    public boolean hasMin()
    {
      return this.amc.contains(Integer.valueOf(3));
    }
    
    public int hashCode()
    {
      Iterator localIterator = amb.values().iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        ji.a locala = (ji.a)localIterator.next();
        if (!a(locala)) {
          break label67;
        }
        int j = locala.hm();
        i = b(locala).hashCode() + (i + j);
      }
      label67:
      for (;;)
      {
        break;
        return i;
      }
    }
    
    public HashMap<String, ji.a<?, ?>> hf()
    {
      return amb;
    }
    
    public boolean isDataValid()
    {
      return true;
    }
    
    public a nv()
    {
      return this;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      ob localob = CREATOR;
      ob.a(this, paramParcel, paramInt);
    }
  }
  
  public static final class b
    extends jj
    implements Person.Cover
  {
    public static final oc CREATOR = new oc();
    private static final HashMap<String, ji.a<?, ?>> amb = new HashMap();
    final int BR;
    final Set<Integer> amc;
    a anv;
    b anw;
    int anx;
    
    static
    {
      amb.put("coverInfo", ji.a.a("coverInfo", 2, a.class));
      amb.put("coverPhoto", ji.a.a("coverPhoto", 3, b.class));
      amb.put("layout", ji.a.a("layout", 4, new jf().h("banner", 0), false));
    }
    
    public b()
    {
      this.BR = 1;
      this.amc = new HashSet();
    }
    
    b(Set<Integer> paramSet, int paramInt1, a parama, b paramb, int paramInt2)
    {
      this.amc = paramSet;
      this.BR = paramInt1;
      this.anv = parama;
      this.anw = paramb;
      this.anx = paramInt2;
    }
    
    protected boolean a(ji.a parama)
    {
      return this.amc.contains(Integer.valueOf(parama.hm()));
    }
    
    protected Object b(ji.a parama)
    {
      switch (parama.hm())
      {
      default: 
        throw new IllegalStateException("Unknown safe parcelable id=" + parama.hm());
      case 2: 
        parama = this.anv;
      }
      for (;;)
      {
        return parama;
        parama = this.anw;
        continue;
        parama = Integer.valueOf(this.anx);
      }
    }
    
    public int describeContents()
    {
      oc localoc = CREATOR;
      return 0;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if (!(paramObject instanceof b)) {
        bool = false;
      }
      for (;;)
      {
        return bool;
        if (this == paramObject)
        {
          bool = true;
        }
        else
        {
          b localb = (b)paramObject;
          paramObject = amb.values().iterator();
          for (;;)
          {
            if (((Iterator)paramObject).hasNext())
            {
              ji.a locala = (ji.a)((Iterator)paramObject).next();
              if (a(locala))
              {
                if (localb.a(locala))
                {
                  if (b(locala).equals(localb.b(locala))) {
                    continue;
                  }
                  bool = false;
                  break;
                }
                bool = false;
                break;
              }
              if (localb.a(locala))
              {
                bool = false;
                break;
              }
            }
          }
          bool = true;
        }
      }
    }
    
    public Person.Cover.CoverInfo getCoverInfo()
    {
      return this.anv;
    }
    
    public Person.Cover.CoverPhoto getCoverPhoto()
    {
      return this.anw;
    }
    
    public int getLayout()
    {
      return this.anx;
    }
    
    public boolean hasCoverInfo()
    {
      return this.amc.contains(Integer.valueOf(2));
    }
    
    public boolean hasCoverPhoto()
    {
      return this.amc.contains(Integer.valueOf(3));
    }
    
    public boolean hasLayout()
    {
      return this.amc.contains(Integer.valueOf(4));
    }
    
    public int hashCode()
    {
      Iterator localIterator = amb.values().iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        ji.a locala = (ji.a)localIterator.next();
        if (!a(locala)) {
          break label67;
        }
        int j = locala.hm();
        i = b(locala).hashCode() + (i + j);
      }
      label67:
      for (;;)
      {
        break;
        return i;
      }
    }
    
    public HashMap<String, ji.a<?, ?>> hf()
    {
      return amb;
    }
    
    public boolean isDataValid()
    {
      return true;
    }
    
    public b nw()
    {
      return this;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      oc localoc = CREATOR;
      oc.a(this, paramParcel, paramInt);
    }
    
    public static final class a
      extends jj
      implements Person.Cover.CoverInfo
    {
      public static final od CREATOR = new od();
      private static final HashMap<String, ji.a<?, ?>> amb = new HashMap();
      final int BR;
      final Set<Integer> amc;
      int any;
      int anz;
      
      static
      {
        amb.put("leftImageOffset", ji.a.i("leftImageOffset", 2));
        amb.put("topImageOffset", ji.a.i("topImageOffset", 3));
      }
      
      public a()
      {
        this.BR = 1;
        this.amc = new HashSet();
      }
      
      a(Set<Integer> paramSet, int paramInt1, int paramInt2, int paramInt3)
      {
        this.amc = paramSet;
        this.BR = paramInt1;
        this.any = paramInt2;
        this.anz = paramInt3;
      }
      
      protected boolean a(ji.a parama)
      {
        return this.amc.contains(Integer.valueOf(parama.hm()));
      }
      
      protected Object b(ji.a parama)
      {
        switch (parama.hm())
        {
        default: 
          throw new IllegalStateException("Unknown safe parcelable id=" + parama.hm());
        }
        for (parama = Integer.valueOf(this.any);; parama = Integer.valueOf(this.anz)) {
          return parama;
        }
      }
      
      public int describeContents()
      {
        od localod = CREATOR;
        return 0;
      }
      
      public boolean equals(Object paramObject)
      {
        boolean bool;
        if (!(paramObject instanceof a)) {
          bool = false;
        }
        for (;;)
        {
          return bool;
          if (this == paramObject)
          {
            bool = true;
          }
          else
          {
            paramObject = (a)paramObject;
            Iterator localIterator = amb.values().iterator();
            for (;;)
            {
              if (localIterator.hasNext())
              {
                ji.a locala = (ji.a)localIterator.next();
                if (a(locala))
                {
                  if (((a)paramObject).a(locala))
                  {
                    if (b(locala).equals(((a)paramObject).b(locala))) {
                      continue;
                    }
                    bool = false;
                    break;
                  }
                  bool = false;
                  break;
                }
                if (((a)paramObject).a(locala))
                {
                  bool = false;
                  break;
                }
              }
            }
            bool = true;
          }
        }
      }
      
      public int getLeftImageOffset()
      {
        return this.any;
      }
      
      public int getTopImageOffset()
      {
        return this.anz;
      }
      
      public boolean hasLeftImageOffset()
      {
        return this.amc.contains(Integer.valueOf(2));
      }
      
      public boolean hasTopImageOffset()
      {
        return this.amc.contains(Integer.valueOf(3));
      }
      
      public int hashCode()
      {
        Iterator localIterator = amb.values().iterator();
        int i = 0;
        if (localIterator.hasNext())
        {
          ji.a locala = (ji.a)localIterator.next();
          if (!a(locala)) {
            break label67;
          }
          int j = locala.hm();
          i = b(locala).hashCode() + (i + j);
        }
        label67:
        for (;;)
        {
          break;
          return i;
        }
      }
      
      public HashMap<String, ji.a<?, ?>> hf()
      {
        return amb;
      }
      
      public boolean isDataValid()
      {
        return true;
      }
      
      public a nx()
      {
        return this;
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        od localod = CREATOR;
        od.a(this, paramParcel, paramInt);
      }
    }
    
    public static final class b
      extends jj
      implements Person.Cover.CoverPhoto
    {
      public static final oe CREATOR = new oe();
      private static final HashMap<String, ji.a<?, ?>> amb = new HashMap();
      final int BR;
      final Set<Integer> amc;
      int lf;
      int lg;
      String uR;
      
      static
      {
        amb.put("height", ji.a.i("height", 2));
        amb.put("url", ji.a.l("url", 3));
        amb.put("width", ji.a.i("width", 4));
      }
      
      public b()
      {
        this.BR = 1;
        this.amc = new HashSet();
      }
      
      b(Set<Integer> paramSet, int paramInt1, int paramInt2, String paramString, int paramInt3)
      {
        this.amc = paramSet;
        this.BR = paramInt1;
        this.lg = paramInt2;
        this.uR = paramString;
        this.lf = paramInt3;
      }
      
      protected boolean a(ji.a parama)
      {
        return this.amc.contains(Integer.valueOf(parama.hm()));
      }
      
      protected Object b(ji.a parama)
      {
        switch (parama.hm())
        {
        default: 
          throw new IllegalStateException("Unknown safe parcelable id=" + parama.hm());
        case 2: 
          parama = Integer.valueOf(this.lg);
        }
        for (;;)
        {
          return parama;
          parama = this.uR;
          continue;
          parama = Integer.valueOf(this.lf);
        }
      }
      
      public int describeContents()
      {
        oe localoe = CREATOR;
        return 0;
      }
      
      public boolean equals(Object paramObject)
      {
        boolean bool;
        if (!(paramObject instanceof b)) {
          bool = false;
        }
        for (;;)
        {
          return bool;
          if (this == paramObject)
          {
            bool = true;
          }
          else
          {
            paramObject = (b)paramObject;
            Iterator localIterator = amb.values().iterator();
            for (;;)
            {
              if (localIterator.hasNext())
              {
                ji.a locala = (ji.a)localIterator.next();
                if (a(locala))
                {
                  if (((b)paramObject).a(locala))
                  {
                    if (b(locala).equals(((b)paramObject).b(locala))) {
                      continue;
                    }
                    bool = false;
                    break;
                  }
                  bool = false;
                  break;
                }
                if (((b)paramObject).a(locala))
                {
                  bool = false;
                  break;
                }
              }
            }
            bool = true;
          }
        }
      }
      
      public int getHeight()
      {
        return this.lg;
      }
      
      public String getUrl()
      {
        return this.uR;
      }
      
      public int getWidth()
      {
        return this.lf;
      }
      
      public boolean hasHeight()
      {
        return this.amc.contains(Integer.valueOf(2));
      }
      
      public boolean hasUrl()
      {
        return this.amc.contains(Integer.valueOf(3));
      }
      
      public boolean hasWidth()
      {
        return this.amc.contains(Integer.valueOf(4));
      }
      
      public int hashCode()
      {
        Iterator localIterator = amb.values().iterator();
        int i = 0;
        if (localIterator.hasNext())
        {
          ji.a locala = (ji.a)localIterator.next();
          if (!a(locala)) {
            break label68;
          }
          int j = locala.hm();
          i = b(locala).hashCode() + (i + j);
        }
        label68:
        for (;;)
        {
          break;
          return i;
        }
      }
      
      public HashMap<String, ji.a<?, ?>> hf()
      {
        return amb;
      }
      
      public boolean isDataValid()
      {
        return true;
      }
      
      public b ny()
      {
        return this;
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        oe localoe = CREATOR;
        oe.a(this, paramParcel, paramInt);
      }
    }
  }
  
  public static final class c
    extends jj
    implements Person.Image
  {
    public static final of CREATOR = new of();
    private static final HashMap<String, ji.a<?, ?>> amb = new HashMap();
    final int BR;
    final Set<Integer> amc;
    String uR;
    
    static
    {
      amb.put("url", ji.a.l("url", 2));
    }
    
    public c()
    {
      this.BR = 1;
      this.amc = new HashSet();
    }
    
    public c(String paramString)
    {
      this.amc = new HashSet();
      this.BR = 1;
      this.uR = paramString;
      this.amc.add(Integer.valueOf(2));
    }
    
    c(Set<Integer> paramSet, int paramInt, String paramString)
    {
      this.amc = paramSet;
      this.BR = paramInt;
      this.uR = paramString;
    }
    
    protected boolean a(ji.a parama)
    {
      return this.amc.contains(Integer.valueOf(parama.hm()));
    }
    
    protected Object b(ji.a parama)
    {
      switch (parama.hm())
      {
      default: 
        throw new IllegalStateException("Unknown safe parcelable id=" + parama.hm());
      }
      return this.uR;
    }
    
    public int describeContents()
    {
      of localof = CREATOR;
      return 0;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if (!(paramObject instanceof c)) {
        bool = false;
      }
      for (;;)
      {
        return bool;
        if (this == paramObject)
        {
          bool = true;
        }
        else
        {
          c localc = (c)paramObject;
          paramObject = amb.values().iterator();
          for (;;)
          {
            if (((Iterator)paramObject).hasNext())
            {
              ji.a locala = (ji.a)((Iterator)paramObject).next();
              if (a(locala))
              {
                if (localc.a(locala))
                {
                  if (b(locala).equals(localc.b(locala))) {
                    continue;
                  }
                  bool = false;
                  break;
                }
                bool = false;
                break;
              }
              if (localc.a(locala))
              {
                bool = false;
                break;
              }
            }
          }
          bool = true;
        }
      }
    }
    
    public String getUrl()
    {
      return this.uR;
    }
    
    public boolean hasUrl()
    {
      return this.amc.contains(Integer.valueOf(2));
    }
    
    public int hashCode()
    {
      Iterator localIterator = amb.values().iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        ji.a locala = (ji.a)localIterator.next();
        if (!a(locala)) {
          break label68;
        }
        int j = locala.hm();
        i = b(locala).hashCode() + (i + j);
      }
      label68:
      for (;;)
      {
        break;
        return i;
      }
    }
    
    public HashMap<String, ji.a<?, ?>> hf()
    {
      return amb;
    }
    
    public boolean isDataValid()
    {
      return true;
    }
    
    public c nz()
    {
      return this;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      of localof = CREATOR;
      of.a(this, paramParcel, paramInt);
    }
  }
  
  public static final class d
    extends jj
    implements Person.Name
  {
    public static final og CREATOR = new og();
    private static final HashMap<String, ji.a<?, ?>> amb = new HashMap();
    final int BR;
    String amA;
    String amD;
    final Set<Integer> amc;
    String anA;
    String anB;
    String anC;
    String anD;
    
    static
    {
      amb.put("familyName", ji.a.l("familyName", 2));
      amb.put("formatted", ji.a.l("formatted", 3));
      amb.put("givenName", ji.a.l("givenName", 4));
      amb.put("honorificPrefix", ji.a.l("honorificPrefix", 5));
      amb.put("honorificSuffix", ji.a.l("honorificSuffix", 6));
      amb.put("middleName", ji.a.l("middleName", 7));
    }
    
    public d()
    {
      this.BR = 1;
      this.amc = new HashSet();
    }
    
    d(Set<Integer> paramSet, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
    {
      this.amc = paramSet;
      this.BR = paramInt;
      this.amA = paramString1;
      this.anA = paramString2;
      this.amD = paramString3;
      this.anB = paramString4;
      this.anC = paramString5;
      this.anD = paramString6;
    }
    
    protected boolean a(ji.a parama)
    {
      return this.amc.contains(Integer.valueOf(parama.hm()));
    }
    
    protected Object b(ji.a parama)
    {
      switch (parama.hm())
      {
      default: 
        throw new IllegalStateException("Unknown safe parcelable id=" + parama.hm());
      case 2: 
        parama = this.amA;
      }
      for (;;)
      {
        return parama;
        parama = this.anA;
        continue;
        parama = this.amD;
        continue;
        parama = this.anB;
        continue;
        parama = this.anC;
        continue;
        parama = this.anD;
      }
    }
    
    public int describeContents()
    {
      og localog = CREATOR;
      return 0;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if (!(paramObject instanceof d)) {
        bool = false;
      }
      for (;;)
      {
        return bool;
        if (this == paramObject)
        {
          bool = true;
        }
        else
        {
          d locald = (d)paramObject;
          paramObject = amb.values().iterator();
          for (;;)
          {
            if (((Iterator)paramObject).hasNext())
            {
              ji.a locala = (ji.a)((Iterator)paramObject).next();
              if (a(locala))
              {
                if (locald.a(locala))
                {
                  if (b(locala).equals(locald.b(locala))) {
                    continue;
                  }
                  bool = false;
                  break;
                }
                bool = false;
                break;
              }
              if (locald.a(locala))
              {
                bool = false;
                break;
              }
            }
          }
          bool = true;
        }
      }
    }
    
    public String getFamilyName()
    {
      return this.amA;
    }
    
    public String getFormatted()
    {
      return this.anA;
    }
    
    public String getGivenName()
    {
      return this.amD;
    }
    
    public String getHonorificPrefix()
    {
      return this.anB;
    }
    
    public String getHonorificSuffix()
    {
      return this.anC;
    }
    
    public String getMiddleName()
    {
      return this.anD;
    }
    
    public boolean hasFamilyName()
    {
      return this.amc.contains(Integer.valueOf(2));
    }
    
    public boolean hasFormatted()
    {
      return this.amc.contains(Integer.valueOf(3));
    }
    
    public boolean hasGivenName()
    {
      return this.amc.contains(Integer.valueOf(4));
    }
    
    public boolean hasHonorificPrefix()
    {
      return this.amc.contains(Integer.valueOf(5));
    }
    
    public boolean hasHonorificSuffix()
    {
      return this.amc.contains(Integer.valueOf(6));
    }
    
    public boolean hasMiddleName()
    {
      return this.amc.contains(Integer.valueOf(7));
    }
    
    public int hashCode()
    {
      Iterator localIterator = amb.values().iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        ji.a locala = (ji.a)localIterator.next();
        if (!a(locala)) {
          break label67;
        }
        int j = locala.hm();
        i = b(locala).hashCode() + (i + j);
      }
      label67:
      for (;;)
      {
        break;
        return i;
      }
    }
    
    public HashMap<String, ji.a<?, ?>> hf()
    {
      return amb;
    }
    
    public boolean isDataValid()
    {
      return true;
    }
    
    public d nA()
    {
      return this;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      og localog = CREATOR;
      og.a(this, paramParcel, paramInt);
    }
  }
  
  public static class e
  {
    public static int ci(String paramString)
    {
      if (paramString.equals("person")) {}
      for (int i = 0;; i = 1)
      {
        return i;
        if (!paramString.equals("page")) {
          break;
        }
      }
      throw new IllegalArgumentException("Unknown objectType string: " + paramString);
    }
  }
  
  public static final class f
    extends jj
    implements Person.Organizations
  {
    public static final oh CREATOR = new oh();
    private static final HashMap<String, ji.a<?, ?>> amb = new HashMap();
    final int BR;
    int FD;
    String Nw;
    String Tr;
    String amP;
    final Set<Integer> amc;
    String amz;
    String anE;
    String anF;
    boolean anG;
    String mName;
    
    static
    {
      amb.put("department", ji.a.l("department", 2));
      amb.put("description", ji.a.l("description", 3));
      amb.put("endDate", ji.a.l("endDate", 4));
      amb.put("location", ji.a.l("location", 5));
      amb.put("name", ji.a.l("name", 6));
      amb.put("primary", ji.a.k("primary", 7));
      amb.put("startDate", ji.a.l("startDate", 8));
      amb.put("title", ji.a.l("title", 9));
      amb.put("type", ji.a.a("type", 10, new jf().h("work", 0).h("school", 1), false));
    }
    
    public f()
    {
      this.BR = 1;
      this.amc = new HashSet();
    }
    
    f(Set<Integer> paramSet, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean, String paramString6, String paramString7, int paramInt2)
    {
      this.amc = paramSet;
      this.BR = paramInt1;
      this.anE = paramString1;
      this.Tr = paramString2;
      this.amz = paramString3;
      this.anF = paramString4;
      this.mName = paramString5;
      this.anG = paramBoolean;
      this.amP = paramString6;
      this.Nw = paramString7;
      this.FD = paramInt2;
    }
    
    protected boolean a(ji.a parama)
    {
      return this.amc.contains(Integer.valueOf(parama.hm()));
    }
    
    protected Object b(ji.a parama)
    {
      switch (parama.hm())
      {
      default: 
        throw new IllegalStateException("Unknown safe parcelable id=" + parama.hm());
      case 2: 
        parama = this.anE;
      }
      for (;;)
      {
        return parama;
        parama = this.Tr;
        continue;
        parama = this.amz;
        continue;
        parama = this.anF;
        continue;
        parama = this.mName;
        continue;
        parama = Boolean.valueOf(this.anG);
        continue;
        parama = this.amP;
        continue;
        parama = this.Nw;
        continue;
        parama = Integer.valueOf(this.FD);
      }
    }
    
    public int describeContents()
    {
      oh localoh = CREATOR;
      return 0;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if (!(paramObject instanceof f)) {
        bool = false;
      }
      for (;;)
      {
        return bool;
        if (this == paramObject)
        {
          bool = true;
        }
        else
        {
          paramObject = (f)paramObject;
          Iterator localIterator = amb.values().iterator();
          for (;;)
          {
            if (localIterator.hasNext())
            {
              ji.a locala = (ji.a)localIterator.next();
              if (a(locala))
              {
                if (((f)paramObject).a(locala))
                {
                  if (b(locala).equals(((f)paramObject).b(locala))) {
                    continue;
                  }
                  bool = false;
                  break;
                }
                bool = false;
                break;
              }
              if (((f)paramObject).a(locala))
              {
                bool = false;
                break;
              }
            }
          }
          bool = true;
        }
      }
    }
    
    public String getDepartment()
    {
      return this.anE;
    }
    
    public String getDescription()
    {
      return this.Tr;
    }
    
    public String getEndDate()
    {
      return this.amz;
    }
    
    public String getLocation()
    {
      return this.anF;
    }
    
    public String getName()
    {
      return this.mName;
    }
    
    public String getStartDate()
    {
      return this.amP;
    }
    
    public String getTitle()
    {
      return this.Nw;
    }
    
    public int getType()
    {
      return this.FD;
    }
    
    public boolean hasDepartment()
    {
      return this.amc.contains(Integer.valueOf(2));
    }
    
    public boolean hasDescription()
    {
      return this.amc.contains(Integer.valueOf(3));
    }
    
    public boolean hasEndDate()
    {
      return this.amc.contains(Integer.valueOf(4));
    }
    
    public boolean hasLocation()
    {
      return this.amc.contains(Integer.valueOf(5));
    }
    
    public boolean hasName()
    {
      return this.amc.contains(Integer.valueOf(6));
    }
    
    public boolean hasPrimary()
    {
      return this.amc.contains(Integer.valueOf(7));
    }
    
    public boolean hasStartDate()
    {
      return this.amc.contains(Integer.valueOf(8));
    }
    
    public boolean hasTitle()
    {
      return this.amc.contains(Integer.valueOf(9));
    }
    
    public boolean hasType()
    {
      return this.amc.contains(Integer.valueOf(10));
    }
    
    public int hashCode()
    {
      Iterator localIterator = amb.values().iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        ji.a locala = (ji.a)localIterator.next();
        if (!a(locala)) {
          break label67;
        }
        int j = locala.hm();
        i = b(locala).hashCode() + (i + j);
      }
      label67:
      for (;;)
      {
        break;
        return i;
      }
    }
    
    public HashMap<String, ji.a<?, ?>> hf()
    {
      return amb;
    }
    
    public boolean isDataValid()
    {
      return true;
    }
    
    public boolean isPrimary()
    {
      return this.anG;
    }
    
    public f nB()
    {
      return this;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      oh localoh = CREATOR;
      oh.a(this, paramParcel, paramInt);
    }
  }
  
  public static final class g
    extends jj
    implements Person.PlacesLived
  {
    public static final oi CREATOR = new oi();
    private static final HashMap<String, ji.a<?, ?>> amb = new HashMap();
    final int BR;
    final Set<Integer> amc;
    boolean anG;
    String mValue;
    
    static
    {
      amb.put("primary", ji.a.k("primary", 2));
      amb.put("value", ji.a.l("value", 3));
    }
    
    public g()
    {
      this.BR = 1;
      this.amc = new HashSet();
    }
    
    g(Set<Integer> paramSet, int paramInt, boolean paramBoolean, String paramString)
    {
      this.amc = paramSet;
      this.BR = paramInt;
      this.anG = paramBoolean;
      this.mValue = paramString;
    }
    
    protected boolean a(ji.a parama)
    {
      return this.amc.contains(Integer.valueOf(parama.hm()));
    }
    
    protected Object b(ji.a parama)
    {
      switch (parama.hm())
      {
      default: 
        throw new IllegalStateException("Unknown safe parcelable id=" + parama.hm());
      }
      for (parama = Boolean.valueOf(this.anG);; parama = this.mValue) {
        return parama;
      }
    }
    
    public int describeContents()
    {
      oi localoi = CREATOR;
      return 0;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if (!(paramObject instanceof g)) {
        bool = false;
      }
      for (;;)
      {
        return bool;
        if (this == paramObject)
        {
          bool = true;
        }
        else
        {
          paramObject = (g)paramObject;
          Iterator localIterator = amb.values().iterator();
          for (;;)
          {
            if (localIterator.hasNext())
            {
              ji.a locala = (ji.a)localIterator.next();
              if (a(locala))
              {
                if (((g)paramObject).a(locala))
                {
                  if (b(locala).equals(((g)paramObject).b(locala))) {
                    continue;
                  }
                  bool = false;
                  break;
                }
                bool = false;
                break;
              }
              if (((g)paramObject).a(locala))
              {
                bool = false;
                break;
              }
            }
          }
          bool = true;
        }
      }
    }
    
    public String getValue()
    {
      return this.mValue;
    }
    
    public boolean hasPrimary()
    {
      return this.amc.contains(Integer.valueOf(2));
    }
    
    public boolean hasValue()
    {
      return this.amc.contains(Integer.valueOf(3));
    }
    
    public int hashCode()
    {
      Iterator localIterator = amb.values().iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        ji.a locala = (ji.a)localIterator.next();
        if (!a(locala)) {
          break label68;
        }
        int j = locala.hm();
        i = b(locala).hashCode() + (i + j);
      }
      label68:
      for (;;)
      {
        break;
        return i;
      }
    }
    
    public HashMap<String, ji.a<?, ?>> hf()
    {
      return amb;
    }
    
    public boolean isDataValid()
    {
      return true;
    }
    
    public boolean isPrimary()
    {
      return this.anG;
    }
    
    public g nC()
    {
      return this;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      oi localoi = CREATOR;
      oi.a(this, paramParcel, paramInt);
    }
  }
  
  public static final class h
    extends jj
    implements Person.Urls
  {
    public static final oj CREATOR = new oj();
    private static final HashMap<String, ji.a<?, ?>> amb = new HashMap();
    final int BR;
    int FD;
    final Set<Integer> amc;
    String anH;
    private final int anI = 4;
    String mValue;
    
    static
    {
      amb.put("label", ji.a.l("label", 5));
      amb.put("type", ji.a.a("type", 6, new jf().h("home", 0).h("work", 1).h("blog", 2).h("profile", 3).h("other", 4).h("otherProfile", 5).h("contributor", 6).h("website", 7), false));
      amb.put("value", ji.a.l("value", 4));
    }
    
    public h()
    {
      this.BR = 1;
      this.amc = new HashSet();
    }
    
    h(Set<Integer> paramSet, int paramInt1, String paramString1, int paramInt2, String paramString2, int paramInt3)
    {
      this.amc = paramSet;
      this.BR = paramInt1;
      this.anH = paramString1;
      this.FD = paramInt2;
      this.mValue = paramString2;
    }
    
    protected boolean a(ji.a parama)
    {
      return this.amc.contains(Integer.valueOf(parama.hm()));
    }
    
    protected Object b(ji.a parama)
    {
      switch (parama.hm())
      {
      default: 
        throw new IllegalStateException("Unknown safe parcelable id=" + parama.hm());
      case 5: 
        parama = this.anH;
      }
      for (;;)
      {
        return parama;
        parama = Integer.valueOf(this.FD);
        continue;
        parama = this.mValue;
      }
    }
    
    public int describeContents()
    {
      oj localoj = CREATOR;
      return 0;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if (!(paramObject instanceof h)) {
        bool = false;
      }
      for (;;)
      {
        return bool;
        if (this == paramObject)
        {
          bool = true;
        }
        else
        {
          paramObject = (h)paramObject;
          Iterator localIterator = amb.values().iterator();
          for (;;)
          {
            if (localIterator.hasNext())
            {
              ji.a locala = (ji.a)localIterator.next();
              if (a(locala))
              {
                if (((h)paramObject).a(locala))
                {
                  if (b(locala).equals(((h)paramObject).b(locala))) {
                    continue;
                  }
                  bool = false;
                  break;
                }
                bool = false;
                break;
              }
              if (((h)paramObject).a(locala))
              {
                bool = false;
                break;
              }
            }
          }
          bool = true;
        }
      }
    }
    
    public String getLabel()
    {
      return this.anH;
    }
    
    public int getType()
    {
      return this.FD;
    }
    
    public String getValue()
    {
      return this.mValue;
    }
    
    public boolean hasLabel()
    {
      return this.amc.contains(Integer.valueOf(5));
    }
    
    public boolean hasType()
    {
      return this.amc.contains(Integer.valueOf(6));
    }
    
    public boolean hasValue()
    {
      return this.amc.contains(Integer.valueOf(4));
    }
    
    public int hashCode()
    {
      Iterator localIterator = amb.values().iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        ji.a locala = (ji.a)localIterator.next();
        if (!a(locala)) {
          break label67;
        }
        int j = locala.hm();
        i = b(locala).hashCode() + (i + j);
      }
      label67:
      for (;;)
      {
        break;
        return i;
      }
    }
    
    public HashMap<String, ji.a<?, ?>> hf()
    {
      return amb;
    }
    
    public boolean isDataValid()
    {
      return true;
    }
    
    @Deprecated
    public int nD()
    {
      return 4;
    }
    
    public h nE()
    {
      return this;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      oj localoj = CREATOR;
      oj.a(this, paramParcel, paramInt);
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\internal\nz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */