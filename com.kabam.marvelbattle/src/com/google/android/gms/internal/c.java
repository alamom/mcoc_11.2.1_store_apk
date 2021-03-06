package com.google.android.gms.internal;

import java.io.IOException;

public abstract interface c
{
  public static final class a
    extends ph<a>
  {
    public int fn;
    public int fo;
    public int level;
    
    public a()
    {
      b();
    }
    
    public a a(pf parampf)
      throws IOException
    {
      for (;;)
      {
        int i = parampf.qi();
        switch (i)
        {
        default: 
          if (a(parampf, i)) {}
          break;
        case 0: 
          return this;
        case 8: 
          i = parampf.ql();
          switch (i)
          {
          default: 
            break;
          case 1: 
          case 2: 
          case 3: 
            this.level = i;
          }
          break;
        case 16: 
          this.fn = parampf.ql();
          break;
        case 24: 
          this.fo = parampf.ql();
        }
      }
    }
    
    public void a(pg parampg)
      throws IOException
    {
      if (this.level != 1) {
        parampg.s(1, this.level);
      }
      if (this.fn != 0) {
        parampg.s(2, this.fn);
      }
      if (this.fo != 0) {
        parampg.s(3, this.fo);
      }
      super.a(parampg);
    }
    
    public a b()
    {
      this.level = 1;
      this.fn = 0;
      this.fo = 0;
      this.awJ = null;
      this.awU = -1;
      return this;
    }
    
    protected int c()
    {
      int j = super.c();
      int i = j;
      if (this.level != 1) {
        i = j + pg.u(1, this.level);
      }
      j = i;
      if (this.fn != 0) {
        j = i + pg.u(2, this.fn);
      }
      i = j;
      if (this.fo != 0) {
        i = j + pg.u(3, this.fo);
      }
      return i;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool2 = false;
      boolean bool1;
      if (paramObject == this) {
        bool1 = true;
      }
      for (;;)
      {
        return bool1;
        bool1 = bool2;
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          bool1 = bool2;
          if (this.level == ((a)paramObject).level)
          {
            bool1 = bool2;
            if (this.fn == ((a)paramObject).fn)
            {
              bool1 = bool2;
              if (this.fo == ((a)paramObject).fo) {
                bool1 = a((ph)paramObject);
              }
            }
          }
        }
      }
    }
    
    public int hashCode()
    {
      return (((this.level + 527) * 31 + this.fn) * 31 + this.fo) * 31 + qz();
    }
  }
  
  public static final class b
    extends ph<b>
  {
    private static volatile b[] fp;
    public int[] fq;
    public int fr;
    public boolean fs;
    public boolean ft;
    public int name;
    
    public b()
    {
      e();
    }
    
    public static b[] d()
    {
      if (fp == null) {}
      synchronized (pl.awT)
      {
        if (fp == null) {
          fp = new b[0];
        }
        return fp;
      }
    }
    
    public void a(pg parampg)
      throws IOException
    {
      if (this.ft) {
        parampg.b(1, this.ft);
      }
      parampg.s(2, this.fr);
      if ((this.fq != null) && (this.fq.length > 0)) {
        for (int i = 0; i < this.fq.length; i++) {
          parampg.s(3, this.fq[i]);
        }
      }
      if (this.name != 0) {
        parampg.s(4, this.name);
      }
      if (this.fs) {
        parampg.b(6, this.fs);
      }
      super.a(parampg);
    }
    
    protected int c()
    {
      int j = 0;
      int k = super.c();
      int i = k;
      if (this.ft) {
        i = k + pg.c(1, this.ft);
      }
      k = pg.u(2, this.fr) + i;
      if ((this.fq != null) && (this.fq.length > 0)) {
        for (i = 0; i < this.fq.length; i++) {
          j += pg.gw(this.fq[i]);
        }
      }
      for (j = k + j + this.fq.length * 1;; j = k)
      {
        i = j;
        if (this.name != 0) {
          i = j + pg.u(4, this.name);
        }
        j = i;
        if (this.fs) {
          j = i + pg.c(6, this.fs);
        }
        return j;
      }
    }
    
    public b c(pf parampf)
      throws IOException
    {
      for (;;)
      {
        int i = parampf.qi();
        int j;
        int[] arrayOfInt;
        switch (i)
        {
        default: 
          if (a(parampf, i)) {}
          break;
        case 0: 
          return this;
        case 8: 
          this.ft = parampf.qm();
          break;
        case 16: 
          this.fr = parampf.ql();
          break;
        case 24: 
          j = pq.b(parampf, 24);
          if (this.fq == null) {}
          for (i = 0;; i = this.fq.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fq, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length - 1; j++)
            {
              arrayOfInt[j] = parampf.ql();
              parampf.qi();
            }
          }
          arrayOfInt[j] = parampf.ql();
          this.fq = arrayOfInt;
          break;
        case 26: 
          int k = parampf.gp(parampf.qp());
          i = parampf.getPosition();
          for (j = 0; parampf.qu() > 0; j++) {
            parampf.ql();
          }
          parampf.gr(i);
          if (this.fq == null) {}
          for (i = 0;; i = this.fq.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fq, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length; j++) {
              arrayOfInt[j] = parampf.ql();
            }
          }
          this.fq = arrayOfInt;
          parampf.gq(k);
          break;
        case 32: 
          this.name = parampf.ql();
          break;
        case 48: 
          this.fs = parampf.qm();
        }
      }
    }
    
    public b e()
    {
      this.fq = pq.awW;
      this.fr = 0;
      this.name = 0;
      this.fs = false;
      this.ft = false;
      this.awJ = null;
      this.awU = -1;
      return this;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool2 = false;
      boolean bool1;
      if (paramObject == this) {
        bool1 = true;
      }
      for (;;)
      {
        return bool1;
        bool1 = bool2;
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          bool1 = bool2;
          if (pl.equals(this.fq, ((b)paramObject).fq))
          {
            bool1 = bool2;
            if (this.fr == ((b)paramObject).fr)
            {
              bool1 = bool2;
              if (this.name == ((b)paramObject).name)
              {
                bool1 = bool2;
                if (this.fs == ((b)paramObject).fs)
                {
                  bool1 = bool2;
                  if (this.ft == ((b)paramObject).ft) {
                    bool1 = a((ph)paramObject);
                  }
                }
              }
            }
          }
        }
      }
    }
    
    public int hashCode()
    {
      int j = 1231;
      int n = pl.hashCode(this.fq);
      int m = this.fr;
      int k = this.name;
      int i;
      if (this.fs)
      {
        i = 1231;
        if (!this.ft) {
          break label85;
        }
      }
      for (;;)
      {
        return ((i + (((n + 527) * 31 + m) * 31 + k) * 31) * 31 + j) * 31 + qz();
        i = 1237;
        break;
        label85:
        j = 1237;
      }
    }
  }
  
  public static final class c
    extends ph<c>
  {
    private static volatile c[] fu;
    public String fv;
    public long fw;
    public long fx;
    public boolean fy;
    public long fz;
    
    public c()
    {
      g();
    }
    
    public static c[] f()
    {
      if (fu == null) {}
      synchronized (pl.awT)
      {
        if (fu == null) {
          fu = new c[0];
        }
        return fu;
      }
    }
    
    public void a(pg parampg)
      throws IOException
    {
      if (!this.fv.equals("")) {
        parampg.b(1, this.fv);
      }
      if (this.fw != 0L) {
        parampg.b(2, this.fw);
      }
      if (this.fx != 2147483647L) {
        parampg.b(3, this.fx);
      }
      if (this.fy) {
        parampg.b(4, this.fy);
      }
      if (this.fz != 0L) {
        parampg.b(5, this.fz);
      }
      super.a(parampg);
    }
    
    protected int c()
    {
      int i = super.c();
      int j = i;
      if (!this.fv.equals("")) {
        j = i + pg.j(1, this.fv);
      }
      i = j;
      if (this.fw != 0L) {
        i = j + pg.d(2, this.fw);
      }
      j = i;
      if (this.fx != 2147483647L) {
        j = i + pg.d(3, this.fx);
      }
      i = j;
      if (this.fy) {
        i = j + pg.c(4, this.fy);
      }
      j = i;
      if (this.fz != 0L) {
        j = i + pg.d(5, this.fz);
      }
      return j;
    }
    
    public c d(pf parampf)
      throws IOException
    {
      for (;;)
      {
        int i = parampf.qi();
        switch (i)
        {
        default: 
          if (a(parampf, i)) {}
          break;
        case 0: 
          return this;
        case 10: 
          this.fv = parampf.readString();
          break;
        case 16: 
          this.fw = parampf.qk();
          break;
        case 24: 
          this.fx = parampf.qk();
          break;
        case 32: 
          this.fy = parampf.qm();
          break;
        case 40: 
          this.fz = parampf.qk();
        }
      }
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool2 = false;
      boolean bool1;
      if (paramObject == this) {
        bool1 = true;
      }
      for (;;)
      {
        return bool1;
        bool1 = bool2;
        if ((paramObject instanceof c))
        {
          paramObject = (c)paramObject;
          if (this.fv == null)
          {
            bool1 = bool2;
            if (((c)paramObject).fv != null) {}
          }
          else
          {
            while (this.fv.equals(((c)paramObject).fv))
            {
              bool1 = bool2;
              if (this.fw != ((c)paramObject).fw) {
                break;
              }
              bool1 = bool2;
              if (this.fx != ((c)paramObject).fx) {
                break;
              }
              bool1 = bool2;
              if (this.fy != ((c)paramObject).fy) {
                break;
              }
              bool1 = bool2;
              if (this.fz != ((c)paramObject).fz) {
                break;
              }
              bool1 = a((ph)paramObject);
              break;
            }
            bool1 = bool2;
          }
        }
      }
    }
    
    public c g()
    {
      this.fv = "";
      this.fw = 0L;
      this.fx = 2147483647L;
      this.fy = false;
      this.fz = 0L;
      this.awJ = null;
      this.awU = -1;
      return this;
    }
    
    public int hashCode()
    {
      int i;
      int k;
      int m;
      if (this.fv == null)
      {
        i = 0;
        k = (int)(this.fw ^ this.fw >>> 32);
        m = (int)(this.fx ^ this.fx >>> 32);
        if (!this.fy) {
          break label107;
        }
      }
      label107:
      for (int j = 1231;; j = 1237)
      {
        return ((j + (((i + 527) * 31 + k) * 31 + m) * 31) * 31 + (int)(this.fz ^ this.fz >>> 32)) * 31 + qz();
        i = this.fv.hashCode();
        break;
      }
    }
  }
  
  public static final class d
    extends ph<d>
  {
    public d.a[] fA;
    public d.a[] fB;
    public c.c[] fC;
    
    public d()
    {
      h();
    }
    
    public void a(pg parampg)
      throws IOException
    {
      int j = 0;
      int i;
      Object localObject;
      if ((this.fA != null) && (this.fA.length > 0)) {
        for (i = 0; i < this.fA.length; i++)
        {
          localObject = this.fA[i];
          if (localObject != null) {
            parampg.a(1, (pn)localObject);
          }
        }
      }
      if ((this.fB != null) && (this.fB.length > 0)) {
        for (i = 0; i < this.fB.length; i++)
        {
          localObject = this.fB[i];
          if (localObject != null) {
            parampg.a(2, (pn)localObject);
          }
        }
      }
      if ((this.fC != null) && (this.fC.length > 0)) {
        for (i = j; i < this.fC.length; i++)
        {
          localObject = this.fC[i];
          if (localObject != null) {
            parampg.a(3, (pn)localObject);
          }
        }
      }
      super.a(parampg);
    }
    
    protected int c()
    {
      int m = 0;
      int i = super.c();
      int j = i;
      Object localObject;
      if (this.fA != null)
      {
        j = i;
        if (this.fA.length > 0)
        {
          j = 0;
          while (j < this.fA.length)
          {
            localObject = this.fA[j];
            k = i;
            if (localObject != null) {
              k = i + pg.c(1, (pn)localObject);
            }
            j++;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (this.fB != null)
      {
        i = j;
        if (this.fB.length > 0)
        {
          i = j;
          j = 0;
          while (j < this.fB.length)
          {
            localObject = this.fB[j];
            k = i;
            if (localObject != null) {
              k = i + pg.c(2, (pn)localObject);
            }
            j++;
            i = k;
          }
        }
      }
      int k = i;
      if (this.fC != null)
      {
        k = i;
        if (this.fC.length > 0)
        {
          j = m;
          for (;;)
          {
            k = i;
            if (j >= this.fC.length) {
              break;
            }
            localObject = this.fC[j];
            k = i;
            if (localObject != null) {
              k = i + pg.c(3, (pn)localObject);
            }
            j++;
            i = k;
          }
        }
      }
      return k;
    }
    
    public d e(pf parampf)
      throws IOException
    {
      for (;;)
      {
        int i = parampf.qi();
        int j;
        Object localObject;
        switch (i)
        {
        default: 
          if (a(parampf, i)) {}
          break;
        case 0: 
          return this;
        case 10: 
          j = pq.b(parampf, 10);
          if (this.fA == null) {}
          for (i = 0;; i = this.fA.length)
          {
            localObject = new d.a[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fA, 0, localObject, 0, i);
            }
            for (j = i; j < localObject.length - 1; j++)
            {
              localObject[j] = new d.a();
              parampf.a(localObject[j]);
              parampf.qi();
            }
          }
          localObject[j] = new d.a();
          parampf.a(localObject[j]);
          this.fA = ((d.a[])localObject);
          break;
        case 18: 
          j = pq.b(parampf, 18);
          if (this.fB == null) {}
          for (i = 0;; i = this.fB.length)
          {
            localObject = new d.a[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fB, 0, localObject, 0, i);
            }
            for (j = i; j < localObject.length - 1; j++)
            {
              localObject[j] = new d.a();
              parampf.a(localObject[j]);
              parampf.qi();
            }
          }
          localObject[j] = new d.a();
          parampf.a(localObject[j]);
          this.fB = ((d.a[])localObject);
          break;
        case 26: 
          j = pq.b(parampf, 26);
          if (this.fC == null) {}
          for (i = 0;; i = this.fC.length)
          {
            localObject = new c.c[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fC, 0, localObject, 0, i);
            }
            for (j = i; j < localObject.length - 1; j++)
            {
              localObject[j] = new c.c();
              parampf.a(localObject[j]);
              parampf.qi();
            }
          }
          localObject[j] = new c.c();
          parampf.a(localObject[j]);
          this.fC = ((c.c[])localObject);
        }
      }
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool2 = false;
      boolean bool1;
      if (paramObject == this) {
        bool1 = true;
      }
      for (;;)
      {
        return bool1;
        bool1 = bool2;
        if ((paramObject instanceof d))
        {
          paramObject = (d)paramObject;
          bool1 = bool2;
          if (pl.equals(this.fA, ((d)paramObject).fA))
          {
            bool1 = bool2;
            if (pl.equals(this.fB, ((d)paramObject).fB))
            {
              bool1 = bool2;
              if (pl.equals(this.fC, ((d)paramObject).fC)) {
                bool1 = a((ph)paramObject);
              }
            }
          }
        }
      }
    }
    
    public d h()
    {
      this.fA = d.a.r();
      this.fB = d.a.r();
      this.fC = c.c.f();
      this.awJ = null;
      this.awU = -1;
      return this;
    }
    
    public int hashCode()
    {
      return (((pl.hashCode(this.fA) + 527) * 31 + pl.hashCode(this.fB)) * 31 + pl.hashCode(this.fC)) * 31 + qz();
    }
  }
  
  public static final class e
    extends ph<e>
  {
    private static volatile e[] fD;
    public int key;
    public int value;
    
    public e()
    {
      j();
    }
    
    public static e[] i()
    {
      if (fD == null) {}
      synchronized (pl.awT)
      {
        if (fD == null) {
          fD = new e[0];
        }
        return fD;
      }
    }
    
    public void a(pg parampg)
      throws IOException
    {
      parampg.s(1, this.key);
      parampg.s(2, this.value);
      super.a(parampg);
    }
    
    protected int c()
    {
      return super.c() + pg.u(1, this.key) + pg.u(2, this.value);
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool2 = false;
      boolean bool1;
      if (paramObject == this) {
        bool1 = true;
      }
      for (;;)
      {
        return bool1;
        bool1 = bool2;
        if ((paramObject instanceof e))
        {
          paramObject = (e)paramObject;
          bool1 = bool2;
          if (this.key == ((e)paramObject).key)
          {
            bool1 = bool2;
            if (this.value == ((e)paramObject).value) {
              bool1 = a((ph)paramObject);
            }
          }
        }
      }
    }
    
    public e f(pf parampf)
      throws IOException
    {
      for (;;)
      {
        int i = parampf.qi();
        switch (i)
        {
        default: 
          if (a(parampf, i)) {}
          break;
        case 0: 
          return this;
        case 8: 
          this.key = parampf.ql();
          break;
        case 16: 
          this.value = parampf.ql();
        }
      }
    }
    
    public int hashCode()
    {
      return ((this.key + 527) * 31 + this.value) * 31 + qz();
    }
    
    public e j()
    {
      this.key = 0;
      this.value = 0;
      this.awJ = null;
      this.awU = -1;
      return this;
    }
  }
  
  public static final class f
    extends ph<f>
  {
    public String[] fE;
    public String[] fF;
    public d.a[] fG;
    public c.e[] fH;
    public c.b[] fI;
    public c.b[] fJ;
    public c.b[] fK;
    public c.g[] fL;
    public String fM;
    public String fN;
    public String fO;
    public c.a fP;
    public float fQ;
    public boolean fR;
    public String[] fS;
    public int fT;
    public String version;
    
    public f()
    {
      k();
    }
    
    public static f a(byte[] paramArrayOfByte)
      throws pm
    {
      return (f)pn.a(new f(), paramArrayOfByte);
    }
    
    public void a(pg parampg)
      throws IOException
    {
      int j = 0;
      int i;
      Object localObject;
      if ((this.fF != null) && (this.fF.length > 0)) {
        for (i = 0; i < this.fF.length; i++)
        {
          localObject = this.fF[i];
          if (localObject != null) {
            parampg.b(1, (String)localObject);
          }
        }
      }
      if ((this.fG != null) && (this.fG.length > 0)) {
        for (i = 0; i < this.fG.length; i++)
        {
          localObject = this.fG[i];
          if (localObject != null) {
            parampg.a(2, (pn)localObject);
          }
        }
      }
      if ((this.fH != null) && (this.fH.length > 0)) {
        for (i = 0; i < this.fH.length; i++)
        {
          localObject = this.fH[i];
          if (localObject != null) {
            parampg.a(3, (pn)localObject);
          }
        }
      }
      if ((this.fI != null) && (this.fI.length > 0)) {
        for (i = 0; i < this.fI.length; i++)
        {
          localObject = this.fI[i];
          if (localObject != null) {
            parampg.a(4, (pn)localObject);
          }
        }
      }
      if ((this.fJ != null) && (this.fJ.length > 0)) {
        for (i = 0; i < this.fJ.length; i++)
        {
          localObject = this.fJ[i];
          if (localObject != null) {
            parampg.a(5, (pn)localObject);
          }
        }
      }
      if ((this.fK != null) && (this.fK.length > 0)) {
        for (i = 0; i < this.fK.length; i++)
        {
          localObject = this.fK[i];
          if (localObject != null) {
            parampg.a(6, (pn)localObject);
          }
        }
      }
      if ((this.fL != null) && (this.fL.length > 0)) {
        for (i = 0; i < this.fL.length; i++)
        {
          localObject = this.fL[i];
          if (localObject != null) {
            parampg.a(7, (pn)localObject);
          }
        }
      }
      if (!this.fM.equals("")) {
        parampg.b(9, this.fM);
      }
      if (!this.fN.equals("")) {
        parampg.b(10, this.fN);
      }
      if (!this.fO.equals("0")) {
        parampg.b(12, this.fO);
      }
      if (!this.version.equals("")) {
        parampg.b(13, this.version);
      }
      if (this.fP != null) {
        parampg.a(14, this.fP);
      }
      if (Float.floatToIntBits(this.fQ) != Float.floatToIntBits(0.0F)) {
        parampg.b(15, this.fQ);
      }
      if ((this.fS != null) && (this.fS.length > 0)) {
        for (i = 0; i < this.fS.length; i++)
        {
          localObject = this.fS[i];
          if (localObject != null) {
            parampg.b(16, (String)localObject);
          }
        }
      }
      if (this.fT != 0) {
        parampg.s(17, this.fT);
      }
      if (this.fR) {
        parampg.b(18, this.fR);
      }
      if ((this.fE != null) && (this.fE.length > 0)) {
        for (i = j; i < this.fE.length; i++)
        {
          localObject = this.fE[i];
          if (localObject != null) {
            parampg.b(19, (String)localObject);
          }
        }
      }
      super.a(parampg);
    }
    
    protected int c()
    {
      int i2 = 0;
      int i1 = super.c();
      int m;
      int i;
      Object localObject;
      int n;
      int k;
      if ((this.fF != null) && (this.fF.length > 0))
      {
        m = 0;
        j = 0;
        for (i = 0; m < this.fF.length; i = k)
        {
          localObject = this.fF[m];
          n = j;
          k = i;
          if (localObject != null)
          {
            k = i + 1;
            n = j + pg.di((String)localObject);
          }
          m++;
          j = n;
        }
      }
      for (int j = i1 + j + i * 1;; j = i1)
      {
        i = j;
        if (this.fG != null)
        {
          i = j;
          if (this.fG.length > 0)
          {
            i = j;
            j = 0;
            while (j < this.fG.length)
            {
              localObject = this.fG[j];
              k = i;
              if (localObject != null) {
                k = i + pg.c(2, (pn)localObject);
              }
              j++;
              i = k;
            }
          }
        }
        j = i;
        if (this.fH != null)
        {
          j = i;
          if (this.fH.length > 0)
          {
            j = 0;
            while (j < this.fH.length)
            {
              localObject = this.fH[j];
              k = i;
              if (localObject != null) {
                k = i + pg.c(3, (pn)localObject);
              }
              j++;
              i = k;
            }
            j = i;
          }
        }
        i = j;
        if (this.fI != null)
        {
          i = j;
          if (this.fI.length > 0)
          {
            i = j;
            j = 0;
            while (j < this.fI.length)
            {
              localObject = this.fI[j];
              k = i;
              if (localObject != null) {
                k = i + pg.c(4, (pn)localObject);
              }
              j++;
              i = k;
            }
          }
        }
        j = i;
        if (this.fJ != null)
        {
          j = i;
          if (this.fJ.length > 0)
          {
            j = 0;
            while (j < this.fJ.length)
            {
              localObject = this.fJ[j];
              k = i;
              if (localObject != null) {
                k = i + pg.c(5, (pn)localObject);
              }
              j++;
              i = k;
            }
            j = i;
          }
        }
        i = j;
        if (this.fK != null)
        {
          i = j;
          if (this.fK.length > 0)
          {
            i = j;
            j = 0;
            while (j < this.fK.length)
            {
              localObject = this.fK[j];
              k = i;
              if (localObject != null) {
                k = i + pg.c(6, (pn)localObject);
              }
              j++;
              i = k;
            }
          }
        }
        j = i;
        if (this.fL != null)
        {
          j = i;
          if (this.fL.length > 0)
          {
            k = 0;
            while (k < this.fL.length)
            {
              localObject = this.fL[k];
              j = i;
              if (localObject != null) {
                j = i + pg.c(7, (pn)localObject);
              }
              k++;
              i = j;
            }
            j = i;
          }
        }
        i = j;
        if (!this.fM.equals("")) {
          i = j + pg.j(9, this.fM);
        }
        j = i;
        if (!this.fN.equals("")) {
          j = i + pg.j(10, this.fN);
        }
        i = j;
        if (!this.fO.equals("0")) {
          i = j + pg.j(12, this.fO);
        }
        k = i;
        if (!this.version.equals("")) {
          k = i + pg.j(13, this.version);
        }
        j = k;
        if (this.fP != null) {
          j = k + pg.c(14, this.fP);
        }
        i = j;
        if (Float.floatToIntBits(this.fQ) != Float.floatToIntBits(0.0F)) {
          i = j + pg.c(15, this.fQ);
        }
        j = i;
        if (this.fS != null)
        {
          j = i;
          if (this.fS.length > 0)
          {
            n = 0;
            m = 0;
            for (k = 0; n < this.fS.length; k = j)
            {
              localObject = this.fS[n];
              i1 = m;
              j = k;
              if (localObject != null)
              {
                j = k + 1;
                i1 = m + pg.di((String)localObject);
              }
              n++;
              m = i1;
            }
            j = i + m + k * 2;
          }
        }
        k = j;
        if (this.fT != 0) {
          k = j + pg.u(17, this.fT);
        }
        i = k;
        if (this.fR) {
          i = k + pg.c(18, this.fR);
        }
        j = i;
        if (this.fE != null)
        {
          j = i;
          if (this.fE.length > 0)
          {
            m = 0;
            k = 0;
            j = i2;
            while (j < this.fE.length)
            {
              localObject = this.fE[j];
              i1 = m;
              n = k;
              if (localObject != null)
              {
                n = k + 1;
                i1 = m + pg.di((String)localObject);
              }
              j++;
              m = i1;
              k = n;
            }
            j = i + m + k * 2;
          }
        }
        return j;
      }
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool2 = false;
      boolean bool1;
      if (paramObject == this) {
        bool1 = true;
      }
      for (;;)
      {
        return bool1;
        bool1 = bool2;
        if ((paramObject instanceof f))
        {
          paramObject = (f)paramObject;
          bool1 = bool2;
          if (pl.equals(this.fE, ((f)paramObject).fE))
          {
            bool1 = bool2;
            if (pl.equals(this.fF, ((f)paramObject).fF))
            {
              bool1 = bool2;
              if (pl.equals(this.fG, ((f)paramObject).fG))
              {
                bool1 = bool2;
                if (pl.equals(this.fH, ((f)paramObject).fH))
                {
                  bool1 = bool2;
                  if (pl.equals(this.fI, ((f)paramObject).fI))
                  {
                    bool1 = bool2;
                    if (pl.equals(this.fJ, ((f)paramObject).fJ))
                    {
                      bool1 = bool2;
                      if (pl.equals(this.fK, ((f)paramObject).fK))
                      {
                        bool1 = bool2;
                        if (pl.equals(this.fL, ((f)paramObject).fL))
                        {
                          if (this.fM == null)
                          {
                            bool1 = bool2;
                            if (((f)paramObject).fM != null) {
                              continue;
                            }
                            label169:
                            if (this.fN != null) {
                              break label322;
                            }
                            bool1 = bool2;
                            if (((f)paramObject).fN != null) {
                              continue;
                            }
                            label185:
                            if (this.fO != null) {
                              break label341;
                            }
                            bool1 = bool2;
                            if (((f)paramObject).fO != null) {
                              continue;
                            }
                            label201:
                            if (this.version != null) {
                              break label360;
                            }
                            bool1 = bool2;
                            if (((f)paramObject).version != null) {
                              continue;
                            }
                            label217:
                            if (this.fP != null) {
                              break label379;
                            }
                            bool1 = bool2;
                            if (((f)paramObject).fP != null) {
                              continue;
                            }
                          }
                          label322:
                          label341:
                          label360:
                          label379:
                          while (this.fP.equals(((f)paramObject).fP))
                          {
                            bool1 = bool2;
                            if (Float.floatToIntBits(this.fQ) != Float.floatToIntBits(((f)paramObject).fQ)) {
                              break;
                            }
                            bool1 = bool2;
                            if (this.fR != ((f)paramObject).fR) {
                              break;
                            }
                            bool1 = bool2;
                            if (!pl.equals(this.fS, ((f)paramObject).fS)) {
                              break;
                            }
                            bool1 = bool2;
                            if (this.fT != ((f)paramObject).fT) {
                              break;
                            }
                            bool1 = a((ph)paramObject);
                            break;
                            if (this.fM.equals(((f)paramObject).fM)) {
                              break label169;
                            }
                            bool1 = bool2;
                            break;
                            if (this.fN.equals(((f)paramObject).fN)) {
                              break label185;
                            }
                            bool1 = bool2;
                            break;
                            if (this.fO.equals(((f)paramObject).fO)) {
                              break label201;
                            }
                            bool1 = bool2;
                            break;
                            if (this.version.equals(((f)paramObject).version)) {
                              break label217;
                            }
                            bool1 = bool2;
                            break;
                          }
                          bool1 = bool2;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    
    public f g(pf parampf)
      throws IOException
    {
      for (;;)
      {
        int i = parampf.qi();
        int j;
        Object localObject;
        switch (i)
        {
        default: 
          if (a(parampf, i)) {}
          break;
        case 0: 
          return this;
        case 10: 
          j = pq.b(parampf, 10);
          if (this.fF == null) {}
          for (i = 0;; i = this.fF.length)
          {
            localObject = new String[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fF, 0, localObject, 0, i);
            }
            for (j = i; j < localObject.length - 1; j++)
            {
              localObject[j] = parampf.readString();
              parampf.qi();
            }
          }
          localObject[j] = parampf.readString();
          this.fF = ((String[])localObject);
          break;
        case 18: 
          j = pq.b(parampf, 18);
          if (this.fG == null) {}
          for (i = 0;; i = this.fG.length)
          {
            localObject = new d.a[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fG, 0, localObject, 0, i);
            }
            for (j = i; j < localObject.length - 1; j++)
            {
              localObject[j] = new d.a();
              parampf.a(localObject[j]);
              parampf.qi();
            }
          }
          localObject[j] = new d.a();
          parampf.a(localObject[j]);
          this.fG = ((d.a[])localObject);
          break;
        case 26: 
          j = pq.b(parampf, 26);
          if (this.fH == null) {}
          for (i = 0;; i = this.fH.length)
          {
            localObject = new c.e[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fH, 0, localObject, 0, i);
            }
            for (j = i; j < localObject.length - 1; j++)
            {
              localObject[j] = new c.e();
              parampf.a(localObject[j]);
              parampf.qi();
            }
          }
          localObject[j] = new c.e();
          parampf.a(localObject[j]);
          this.fH = ((c.e[])localObject);
          break;
        case 34: 
          j = pq.b(parampf, 34);
          if (this.fI == null) {}
          for (i = 0;; i = this.fI.length)
          {
            localObject = new c.b[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fI, 0, localObject, 0, i);
            }
            for (j = i; j < localObject.length - 1; j++)
            {
              localObject[j] = new c.b();
              parampf.a(localObject[j]);
              parampf.qi();
            }
          }
          localObject[j] = new c.b();
          parampf.a(localObject[j]);
          this.fI = ((c.b[])localObject);
          break;
        case 42: 
          j = pq.b(parampf, 42);
          if (this.fJ == null) {}
          for (i = 0;; i = this.fJ.length)
          {
            localObject = new c.b[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fJ, 0, localObject, 0, i);
            }
            for (j = i; j < localObject.length - 1; j++)
            {
              localObject[j] = new c.b();
              parampf.a(localObject[j]);
              parampf.qi();
            }
          }
          localObject[j] = new c.b();
          parampf.a(localObject[j]);
          this.fJ = ((c.b[])localObject);
          break;
        case 50: 
          j = pq.b(parampf, 50);
          if (this.fK == null) {}
          for (i = 0;; i = this.fK.length)
          {
            localObject = new c.b[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fK, 0, localObject, 0, i);
            }
            for (j = i; j < localObject.length - 1; j++)
            {
              localObject[j] = new c.b();
              parampf.a(localObject[j]);
              parampf.qi();
            }
          }
          localObject[j] = new c.b();
          parampf.a(localObject[j]);
          this.fK = ((c.b[])localObject);
          break;
        case 58: 
          j = pq.b(parampf, 58);
          if (this.fL == null) {}
          for (i = 0;; i = this.fL.length)
          {
            localObject = new c.g[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fL, 0, localObject, 0, i);
            }
            for (j = i; j < localObject.length - 1; j++)
            {
              localObject[j] = new c.g();
              parampf.a(localObject[j]);
              parampf.qi();
            }
          }
          localObject[j] = new c.g();
          parampf.a(localObject[j]);
          this.fL = ((c.g[])localObject);
          break;
        case 74: 
          this.fM = parampf.readString();
          break;
        case 82: 
          this.fN = parampf.readString();
          break;
        case 98: 
          this.fO = parampf.readString();
          break;
        case 106: 
          this.version = parampf.readString();
          break;
        case 114: 
          if (this.fP == null) {
            this.fP = new c.a();
          }
          parampf.a(this.fP);
          break;
        case 125: 
          this.fQ = parampf.readFloat();
          break;
        case 130: 
          j = pq.b(parampf, 130);
          if (this.fS == null) {}
          for (i = 0;; i = this.fS.length)
          {
            localObject = new String[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fS, 0, localObject, 0, i);
            }
            for (j = i; j < localObject.length - 1; j++)
            {
              localObject[j] = parampf.readString();
              parampf.qi();
            }
          }
          localObject[j] = parampf.readString();
          this.fS = ((String[])localObject);
          break;
        case 136: 
          this.fT = parampf.ql();
          break;
        case 144: 
          this.fR = parampf.qm();
          break;
        case 154: 
          j = pq.b(parampf, 154);
          if (this.fE == null) {}
          for (i = 0;; i = this.fE.length)
          {
            localObject = new String[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fE, 0, localObject, 0, i);
            }
            for (j = i; j < localObject.length - 1; j++)
            {
              localObject[j] = parampf.readString();
              parampf.qi();
            }
          }
          localObject[j] = parampf.readString();
          this.fE = ((String[])localObject);
        }
      }
    }
    
    public int hashCode()
    {
      int n = 0;
      int i8 = pl.hashCode(this.fE);
      int i7 = pl.hashCode(this.fF);
      int i9 = pl.hashCode(this.fG);
      int i2 = pl.hashCode(this.fH);
      int i6 = pl.hashCode(this.fI);
      int i3 = pl.hashCode(this.fJ);
      int i5 = pl.hashCode(this.fK);
      int i4 = pl.hashCode(this.fL);
      int i;
      int j;
      label93:
      int k;
      label102:
      int m;
      label112:
      label119:
      int i10;
      if (this.fM == null)
      {
        i = 0;
        if (this.fN != null) {
          break label266;
        }
        j = 0;
        if (this.fO != null) {
          break label277;
        }
        k = 0;
        if (this.version != null) {
          break label288;
        }
        m = 0;
        if (this.fP != null) {
          break label300;
        }
        i10 = Float.floatToIntBits(this.fQ);
        if (!this.fR) {
          break label312;
        }
      }
      label266:
      label277:
      label288:
      label300:
      label312:
      for (int i1 = 1231;; i1 = 1237)
      {
        return (((i1 + (((m + (k + (j + (i + ((((((((i8 + 527) * 31 + i7) * 31 + i9) * 31 + i2) * 31 + i6) * 31 + i3) * 31 + i5) * 31 + i4) * 31) * 31) * 31) * 31) * 31 + n) * 31 + i10) * 31) * 31 + pl.hashCode(this.fS)) * 31 + this.fT) * 31 + qz();
        i = this.fM.hashCode();
        break;
        j = this.fN.hashCode();
        break label93;
        k = this.fO.hashCode();
        break label102;
        m = this.version.hashCode();
        break label112;
        n = this.fP.hashCode();
        break label119;
      }
    }
    
    public f k()
    {
      this.fE = pq.axb;
      this.fF = pq.axb;
      this.fG = d.a.r();
      this.fH = c.e.i();
      this.fI = c.b.d();
      this.fJ = c.b.d();
      this.fK = c.b.d();
      this.fL = c.g.l();
      this.fM = "";
      this.fN = "";
      this.fO = "0";
      this.version = "";
      this.fP = null;
      this.fQ = 0.0F;
      this.fR = false;
      this.fS = pq.axb;
      this.fT = 0;
      this.awJ = null;
      this.awU = -1;
      return this;
    }
  }
  
  public static final class g
    extends ph<g>
  {
    private static volatile g[] fU;
    public int[] fV;
    public int[] fW;
    public int[] fX;
    public int[] fY;
    public int[] fZ;
    public int[] ga;
    public int[] gb;
    public int[] gc;
    public int[] gd;
    public int[] ge;
    
    public g()
    {
      m();
    }
    
    public static g[] l()
    {
      if (fU == null) {}
      synchronized (pl.awT)
      {
        if (fU == null) {
          fU = new g[0];
        }
        return fU;
      }
    }
    
    public void a(pg parampg)
      throws IOException
    {
      int j = 0;
      int i;
      if ((this.fV != null) && (this.fV.length > 0)) {
        for (i = 0; i < this.fV.length; i++) {
          parampg.s(1, this.fV[i]);
        }
      }
      if ((this.fW != null) && (this.fW.length > 0)) {
        for (i = 0; i < this.fW.length; i++) {
          parampg.s(2, this.fW[i]);
        }
      }
      if ((this.fX != null) && (this.fX.length > 0)) {
        for (i = 0; i < this.fX.length; i++) {
          parampg.s(3, this.fX[i]);
        }
      }
      if ((this.fY != null) && (this.fY.length > 0)) {
        for (i = 0; i < this.fY.length; i++) {
          parampg.s(4, this.fY[i]);
        }
      }
      if ((this.fZ != null) && (this.fZ.length > 0)) {
        for (i = 0; i < this.fZ.length; i++) {
          parampg.s(5, this.fZ[i]);
        }
      }
      if ((this.ga != null) && (this.ga.length > 0)) {
        for (i = 0; i < this.ga.length; i++) {
          parampg.s(6, this.ga[i]);
        }
      }
      if ((this.gb != null) && (this.gb.length > 0)) {
        for (i = 0; i < this.gb.length; i++) {
          parampg.s(7, this.gb[i]);
        }
      }
      if ((this.gc != null) && (this.gc.length > 0)) {
        for (i = 0; i < this.gc.length; i++) {
          parampg.s(8, this.gc[i]);
        }
      }
      if ((this.gd != null) && (this.gd.length > 0)) {
        for (i = 0; i < this.gd.length; i++) {
          parampg.s(9, this.gd[i]);
        }
      }
      if ((this.ge != null) && (this.ge.length > 0)) {
        for (i = j; i < this.ge.length; i++) {
          parampg.s(10, this.ge[i]);
        }
      }
      super.a(parampg);
    }
    
    protected int c()
    {
      int m = 0;
      int k = super.c();
      int i;
      if ((this.fV != null) && (this.fV.length > 0))
      {
        j = 0;
        i = 0;
        while (j < this.fV.length)
        {
          i += pg.gw(this.fV[j]);
          j++;
        }
      }
      for (int j = k + i + this.fV.length * 1;; j = k)
      {
        i = j;
        if (this.fW != null)
        {
          i = j;
          if (this.fW.length > 0)
          {
            i = 0;
            k = 0;
            while (i < this.fW.length)
            {
              k += pg.gw(this.fW[i]);
              i++;
            }
            i = j + k + this.fW.length * 1;
          }
        }
        j = i;
        if (this.fX != null)
        {
          j = i;
          if (this.fX.length > 0)
          {
            j = 0;
            k = 0;
            while (j < this.fX.length)
            {
              k += pg.gw(this.fX[j]);
              j++;
            }
            j = i + k + this.fX.length * 1;
          }
        }
        i = j;
        if (this.fY != null)
        {
          i = j;
          if (this.fY.length > 0)
          {
            i = 0;
            k = 0;
            while (i < this.fY.length)
            {
              k += pg.gw(this.fY[i]);
              i++;
            }
            i = j + k + this.fY.length * 1;
          }
        }
        j = i;
        if (this.fZ != null)
        {
          j = i;
          if (this.fZ.length > 0)
          {
            j = 0;
            k = 0;
            while (j < this.fZ.length)
            {
              k += pg.gw(this.fZ[j]);
              j++;
            }
            j = i + k + this.fZ.length * 1;
          }
        }
        i = j;
        if (this.ga != null)
        {
          i = j;
          if (this.ga.length > 0)
          {
            i = 0;
            k = 0;
            while (i < this.ga.length)
            {
              k += pg.gw(this.ga[i]);
              i++;
            }
            i = j + k + this.ga.length * 1;
          }
        }
        j = i;
        if (this.gb != null)
        {
          j = i;
          if (this.gb.length > 0)
          {
            k = 0;
            j = 0;
            while (k < this.gb.length)
            {
              j += pg.gw(this.gb[k]);
              k++;
            }
            j = i + j + this.gb.length * 1;
          }
        }
        i = j;
        if (this.gc != null)
        {
          i = j;
          if (this.gc.length > 0)
          {
            k = 0;
            i = 0;
            while (k < this.gc.length)
            {
              i += pg.gw(this.gc[k]);
              k++;
            }
            i = j + i + this.gc.length * 1;
          }
        }
        j = i;
        if (this.gd != null)
        {
          j = i;
          if (this.gd.length > 0)
          {
            k = 0;
            j = 0;
            while (k < this.gd.length)
            {
              j += pg.gw(this.gd[k]);
              k++;
            }
            j = i + j + this.gd.length * 1;
          }
        }
        i = j;
        if (this.ge != null)
        {
          i = j;
          if (this.ge.length > 0)
          {
            k = 0;
            for (i = m; i < this.ge.length; i++) {
              k += pg.gw(this.ge[i]);
            }
            i = j + k + this.ge.length * 1;
          }
        }
        return i;
      }
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool2 = false;
      boolean bool1;
      if (paramObject == this) {
        bool1 = true;
      }
      for (;;)
      {
        return bool1;
        bool1 = bool2;
        if ((paramObject instanceof g))
        {
          paramObject = (g)paramObject;
          bool1 = bool2;
          if (pl.equals(this.fV, ((g)paramObject).fV))
          {
            bool1 = bool2;
            if (pl.equals(this.fW, ((g)paramObject).fW))
            {
              bool1 = bool2;
              if (pl.equals(this.fX, ((g)paramObject).fX))
              {
                bool1 = bool2;
                if (pl.equals(this.fY, ((g)paramObject).fY))
                {
                  bool1 = bool2;
                  if (pl.equals(this.fZ, ((g)paramObject).fZ))
                  {
                    bool1 = bool2;
                    if (pl.equals(this.ga, ((g)paramObject).ga))
                    {
                      bool1 = bool2;
                      if (pl.equals(this.gb, ((g)paramObject).gb))
                      {
                        bool1 = bool2;
                        if (pl.equals(this.gc, ((g)paramObject).gc))
                        {
                          bool1 = bool2;
                          if (pl.equals(this.gd, ((g)paramObject).gd))
                          {
                            bool1 = bool2;
                            if (pl.equals(this.ge, ((g)paramObject).ge)) {
                              bool1 = a((ph)paramObject);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    
    public g h(pf parampf)
      throws IOException
    {
      for (;;)
      {
        int i = parampf.qi();
        int j;
        int[] arrayOfInt;
        int k;
        switch (i)
        {
        default: 
          if (a(parampf, i)) {}
          break;
        case 0: 
          return this;
        case 8: 
          j = pq.b(parampf, 8);
          if (this.fV == null) {}
          for (i = 0;; i = this.fV.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fV, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length - 1; j++)
            {
              arrayOfInt[j] = parampf.ql();
              parampf.qi();
            }
          }
          arrayOfInt[j] = parampf.ql();
          this.fV = arrayOfInt;
          break;
        case 10: 
          k = parampf.gp(parampf.qp());
          i = parampf.getPosition();
          for (j = 0; parampf.qu() > 0; j++) {
            parampf.ql();
          }
          parampf.gr(i);
          if (this.fV == null) {}
          for (i = 0;; i = this.fV.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fV, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length; j++) {
              arrayOfInt[j] = parampf.ql();
            }
          }
          this.fV = arrayOfInt;
          parampf.gq(k);
          break;
        case 16: 
          j = pq.b(parampf, 16);
          if (this.fW == null) {}
          for (i = 0;; i = this.fW.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fW, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length - 1; j++)
            {
              arrayOfInt[j] = parampf.ql();
              parampf.qi();
            }
          }
          arrayOfInt[j] = parampf.ql();
          this.fW = arrayOfInt;
          break;
        case 18: 
          k = parampf.gp(parampf.qp());
          i = parampf.getPosition();
          for (j = 0; parampf.qu() > 0; j++) {
            parampf.ql();
          }
          parampf.gr(i);
          if (this.fW == null) {}
          for (i = 0;; i = this.fW.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fW, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length; j++) {
              arrayOfInt[j] = parampf.ql();
            }
          }
          this.fW = arrayOfInt;
          parampf.gq(k);
          break;
        case 24: 
          j = pq.b(parampf, 24);
          if (this.fX == null) {}
          for (i = 0;; i = this.fX.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fX, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length - 1; j++)
            {
              arrayOfInt[j] = parampf.ql();
              parampf.qi();
            }
          }
          arrayOfInt[j] = parampf.ql();
          this.fX = arrayOfInt;
          break;
        case 26: 
          k = parampf.gp(parampf.qp());
          i = parampf.getPosition();
          for (j = 0; parampf.qu() > 0; j++) {
            parampf.ql();
          }
          parampf.gr(i);
          if (this.fX == null) {}
          for (i = 0;; i = this.fX.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fX, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length; j++) {
              arrayOfInt[j] = parampf.ql();
            }
          }
          this.fX = arrayOfInt;
          parampf.gq(k);
          break;
        case 32: 
          j = pq.b(parampf, 32);
          if (this.fY == null) {}
          for (i = 0;; i = this.fY.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fY, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length - 1; j++)
            {
              arrayOfInt[j] = parampf.ql();
              parampf.qi();
            }
          }
          arrayOfInt[j] = parampf.ql();
          this.fY = arrayOfInt;
          break;
        case 34: 
          k = parampf.gp(parampf.qp());
          i = parampf.getPosition();
          for (j = 0; parampf.qu() > 0; j++) {
            parampf.ql();
          }
          parampf.gr(i);
          if (this.fY == null) {}
          for (i = 0;; i = this.fY.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fY, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length; j++) {
              arrayOfInt[j] = parampf.ql();
            }
          }
          this.fY = arrayOfInt;
          parampf.gq(k);
          break;
        case 40: 
          j = pq.b(parampf, 40);
          if (this.fZ == null) {}
          for (i = 0;; i = this.fZ.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fZ, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length - 1; j++)
            {
              arrayOfInt[j] = parampf.ql();
              parampf.qi();
            }
          }
          arrayOfInt[j] = parampf.ql();
          this.fZ = arrayOfInt;
          break;
        case 42: 
          k = parampf.gp(parampf.qp());
          i = parampf.getPosition();
          for (j = 0; parampf.qu() > 0; j++) {
            parampf.ql();
          }
          parampf.gr(i);
          if (this.fZ == null) {}
          for (i = 0;; i = this.fZ.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.fZ, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length; j++) {
              arrayOfInt[j] = parampf.ql();
            }
          }
          this.fZ = arrayOfInt;
          parampf.gq(k);
          break;
        case 48: 
          j = pq.b(parampf, 48);
          if (this.ga == null) {}
          for (i = 0;; i = this.ga.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.ga, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length - 1; j++)
            {
              arrayOfInt[j] = parampf.ql();
              parampf.qi();
            }
          }
          arrayOfInt[j] = parampf.ql();
          this.ga = arrayOfInt;
          break;
        case 50: 
          k = parampf.gp(parampf.qp());
          i = parampf.getPosition();
          for (j = 0; parampf.qu() > 0; j++) {
            parampf.ql();
          }
          parampf.gr(i);
          if (this.ga == null) {}
          for (i = 0;; i = this.ga.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.ga, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length; j++) {
              arrayOfInt[j] = parampf.ql();
            }
          }
          this.ga = arrayOfInt;
          parampf.gq(k);
          break;
        case 56: 
          j = pq.b(parampf, 56);
          if (this.gb == null) {}
          for (i = 0;; i = this.gb.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.gb, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length - 1; j++)
            {
              arrayOfInt[j] = parampf.ql();
              parampf.qi();
            }
          }
          arrayOfInt[j] = parampf.ql();
          this.gb = arrayOfInt;
          break;
        case 58: 
          k = parampf.gp(parampf.qp());
          i = parampf.getPosition();
          for (j = 0; parampf.qu() > 0; j++) {
            parampf.ql();
          }
          parampf.gr(i);
          if (this.gb == null) {}
          for (i = 0;; i = this.gb.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.gb, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length; j++) {
              arrayOfInt[j] = parampf.ql();
            }
          }
          this.gb = arrayOfInt;
          parampf.gq(k);
          break;
        case 64: 
          j = pq.b(parampf, 64);
          if (this.gc == null) {}
          for (i = 0;; i = this.gc.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.gc, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length - 1; j++)
            {
              arrayOfInt[j] = parampf.ql();
              parampf.qi();
            }
          }
          arrayOfInt[j] = parampf.ql();
          this.gc = arrayOfInt;
          break;
        case 66: 
          k = parampf.gp(parampf.qp());
          i = parampf.getPosition();
          for (j = 0; parampf.qu() > 0; j++) {
            parampf.ql();
          }
          parampf.gr(i);
          if (this.gc == null) {}
          for (i = 0;; i = this.gc.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.gc, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length; j++) {
              arrayOfInt[j] = parampf.ql();
            }
          }
          this.gc = arrayOfInt;
          parampf.gq(k);
          break;
        case 72: 
          j = pq.b(parampf, 72);
          if (this.gd == null) {}
          for (i = 0;; i = this.gd.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.gd, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length - 1; j++)
            {
              arrayOfInt[j] = parampf.ql();
              parampf.qi();
            }
          }
          arrayOfInt[j] = parampf.ql();
          this.gd = arrayOfInt;
          break;
        case 74: 
          k = parampf.gp(parampf.qp());
          i = parampf.getPosition();
          for (j = 0; parampf.qu() > 0; j++) {
            parampf.ql();
          }
          parampf.gr(i);
          if (this.gd == null) {}
          for (i = 0;; i = this.gd.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.gd, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length; j++) {
              arrayOfInt[j] = parampf.ql();
            }
          }
          this.gd = arrayOfInt;
          parampf.gq(k);
          break;
        case 80: 
          j = pq.b(parampf, 80);
          if (this.ge == null) {}
          for (i = 0;; i = this.ge.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.ge, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length - 1; j++)
            {
              arrayOfInt[j] = parampf.ql();
              parampf.qi();
            }
          }
          arrayOfInt[j] = parampf.ql();
          this.ge = arrayOfInt;
          break;
        case 82: 
          k = parampf.gp(parampf.qp());
          i = parampf.getPosition();
          for (j = 0; parampf.qu() > 0; j++) {
            parampf.ql();
          }
          parampf.gr(i);
          if (this.ge == null) {}
          for (i = 0;; i = this.ge.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.ge, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length; j++) {
              arrayOfInt[j] = parampf.ql();
            }
          }
          this.ge = arrayOfInt;
          parampf.gq(k);
        }
      }
    }
    
    public int hashCode()
    {
      return ((((((((((pl.hashCode(this.fV) + 527) * 31 + pl.hashCode(this.fW)) * 31 + pl.hashCode(this.fX)) * 31 + pl.hashCode(this.fY)) * 31 + pl.hashCode(this.fZ)) * 31 + pl.hashCode(this.ga)) * 31 + pl.hashCode(this.gb)) * 31 + pl.hashCode(this.gc)) * 31 + pl.hashCode(this.gd)) * 31 + pl.hashCode(this.ge)) * 31 + qz();
    }
    
    public g m()
    {
      this.fV = pq.awW;
      this.fW = pq.awW;
      this.fX = pq.awW;
      this.fY = pq.awW;
      this.fZ = pq.awW;
      this.ga = pq.awW;
      this.gb = pq.awW;
      this.gc = pq.awW;
      this.gd = pq.awW;
      this.ge = pq.awW;
      this.awJ = null;
      this.awU = -1;
      return this;
    }
  }
  
  public static final class h
    extends ph<h>
  {
    public static final pi<d.a, h> gf = pi.a(11, h.class, 810);
    private static final h[] gg = new h[0];
    public int[] gh;
    public int[] gi;
    public int[] gj;
    public int gk;
    public int[] gl;
    public int gm;
    public int gn;
    
    public h()
    {
      n();
    }
    
    public void a(pg parampg)
      throws IOException
    {
      int j = 0;
      int i;
      if ((this.gh != null) && (this.gh.length > 0)) {
        for (i = 0; i < this.gh.length; i++) {
          parampg.s(1, this.gh[i]);
        }
      }
      if ((this.gi != null) && (this.gi.length > 0)) {
        for (i = 0; i < this.gi.length; i++) {
          parampg.s(2, this.gi[i]);
        }
      }
      if ((this.gj != null) && (this.gj.length > 0)) {
        for (i = 0; i < this.gj.length; i++) {
          parampg.s(3, this.gj[i]);
        }
      }
      if (this.gk != 0) {
        parampg.s(4, this.gk);
      }
      if ((this.gl != null) && (this.gl.length > 0)) {
        for (i = j; i < this.gl.length; i++) {
          parampg.s(5, this.gl[i]);
        }
      }
      if (this.gm != 0) {
        parampg.s(6, this.gm);
      }
      if (this.gn != 0) {
        parampg.s(7, this.gn);
      }
      super.a(parampg);
    }
    
    protected int c()
    {
      int m = 0;
      int k = super.c();
      int i;
      if ((this.gh != null) && (this.gh.length > 0))
      {
        i = 0;
        j = 0;
        while (i < this.gh.length)
        {
          j += pg.gw(this.gh[i]);
          i++;
        }
      }
      for (int j = k + j + this.gh.length * 1;; j = k)
      {
        i = j;
        if (this.gi != null)
        {
          i = j;
          if (this.gi.length > 0)
          {
            i = 0;
            k = 0;
            while (i < this.gi.length)
            {
              k += pg.gw(this.gi[i]);
              i++;
            }
            i = j + k + this.gi.length * 1;
          }
        }
        j = i;
        if (this.gj != null)
        {
          j = i;
          if (this.gj.length > 0)
          {
            j = 0;
            k = 0;
            while (j < this.gj.length)
            {
              k += pg.gw(this.gj[j]);
              j++;
            }
            j = i + k + this.gj.length * 1;
          }
        }
        i = j;
        if (this.gk != 0) {
          i = j + pg.u(4, this.gk);
        }
        j = i;
        if (this.gl != null)
        {
          j = i;
          if (this.gl.length > 0)
          {
            j = 0;
            for (k = m; k < this.gl.length; k++) {
              j += pg.gw(this.gl[k]);
            }
            j = i + j + this.gl.length * 1;
          }
        }
        i = j;
        if (this.gm != 0) {
          i = j + pg.u(6, this.gm);
        }
        j = i;
        if (this.gn != 0) {
          j = i + pg.u(7, this.gn);
        }
        return j;
      }
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool2 = false;
      boolean bool1;
      if (paramObject == this) {
        bool1 = true;
      }
      for (;;)
      {
        return bool1;
        bool1 = bool2;
        if ((paramObject instanceof h))
        {
          paramObject = (h)paramObject;
          bool1 = bool2;
          if (pl.equals(this.gh, ((h)paramObject).gh))
          {
            bool1 = bool2;
            if (pl.equals(this.gi, ((h)paramObject).gi))
            {
              bool1 = bool2;
              if (pl.equals(this.gj, ((h)paramObject).gj))
              {
                bool1 = bool2;
                if (this.gk == ((h)paramObject).gk)
                {
                  bool1 = bool2;
                  if (pl.equals(this.gl, ((h)paramObject).gl))
                  {
                    bool1 = bool2;
                    if (this.gm == ((h)paramObject).gm)
                    {
                      bool1 = bool2;
                      if (this.gn == ((h)paramObject).gn) {
                        bool1 = a((ph)paramObject);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    
    public int hashCode()
    {
      return (((((((pl.hashCode(this.gh) + 527) * 31 + pl.hashCode(this.gi)) * 31 + pl.hashCode(this.gj)) * 31 + this.gk) * 31 + pl.hashCode(this.gl)) * 31 + this.gm) * 31 + this.gn) * 31 + qz();
    }
    
    public h i(pf parampf)
      throws IOException
    {
      for (;;)
      {
        int i = parampf.qi();
        int j;
        int[] arrayOfInt;
        int k;
        switch (i)
        {
        default: 
          if (a(parampf, i)) {}
          break;
        case 0: 
          return this;
        case 8: 
          j = pq.b(parampf, 8);
          if (this.gh == null) {}
          for (i = 0;; i = this.gh.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.gh, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length - 1; j++)
            {
              arrayOfInt[j] = parampf.ql();
              parampf.qi();
            }
          }
          arrayOfInt[j] = parampf.ql();
          this.gh = arrayOfInt;
          break;
        case 10: 
          k = parampf.gp(parampf.qp());
          i = parampf.getPosition();
          for (j = 0; parampf.qu() > 0; j++) {
            parampf.ql();
          }
          parampf.gr(i);
          if (this.gh == null) {}
          for (i = 0;; i = this.gh.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.gh, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length; j++) {
              arrayOfInt[j] = parampf.ql();
            }
          }
          this.gh = arrayOfInt;
          parampf.gq(k);
          break;
        case 16: 
          j = pq.b(parampf, 16);
          if (this.gi == null) {}
          for (i = 0;; i = this.gi.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.gi, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length - 1; j++)
            {
              arrayOfInt[j] = parampf.ql();
              parampf.qi();
            }
          }
          arrayOfInt[j] = parampf.ql();
          this.gi = arrayOfInt;
          break;
        case 18: 
          k = parampf.gp(parampf.qp());
          i = parampf.getPosition();
          for (j = 0; parampf.qu() > 0; j++) {
            parampf.ql();
          }
          parampf.gr(i);
          if (this.gi == null) {}
          for (i = 0;; i = this.gi.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.gi, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length; j++) {
              arrayOfInt[j] = parampf.ql();
            }
          }
          this.gi = arrayOfInt;
          parampf.gq(k);
          break;
        case 24: 
          j = pq.b(parampf, 24);
          if (this.gj == null) {}
          for (i = 0;; i = this.gj.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.gj, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length - 1; j++)
            {
              arrayOfInt[j] = parampf.ql();
              parampf.qi();
            }
          }
          arrayOfInt[j] = parampf.ql();
          this.gj = arrayOfInt;
          break;
        case 26: 
          k = parampf.gp(parampf.qp());
          i = parampf.getPosition();
          for (j = 0; parampf.qu() > 0; j++) {
            parampf.ql();
          }
          parampf.gr(i);
          if (this.gj == null) {}
          for (i = 0;; i = this.gj.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.gj, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length; j++) {
              arrayOfInt[j] = parampf.ql();
            }
          }
          this.gj = arrayOfInt;
          parampf.gq(k);
          break;
        case 32: 
          this.gk = parampf.ql();
          break;
        case 40: 
          j = pq.b(parampf, 40);
          if (this.gl == null) {}
          for (i = 0;; i = this.gl.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.gl, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length - 1; j++)
            {
              arrayOfInt[j] = parampf.ql();
              parampf.qi();
            }
          }
          arrayOfInt[j] = parampf.ql();
          this.gl = arrayOfInt;
          break;
        case 42: 
          k = parampf.gp(parampf.qp());
          i = parampf.getPosition();
          for (j = 0; parampf.qu() > 0; j++) {
            parampf.ql();
          }
          parampf.gr(i);
          if (this.gl == null) {}
          for (i = 0;; i = this.gl.length)
          {
            arrayOfInt = new int[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.gl, 0, arrayOfInt, 0, i);
            }
            for (j = i; j < arrayOfInt.length; j++) {
              arrayOfInt[j] = parampf.ql();
            }
          }
          this.gl = arrayOfInt;
          parampf.gq(k);
          break;
        case 48: 
          this.gm = parampf.ql();
          break;
        case 56: 
          this.gn = parampf.ql();
        }
      }
    }
    
    public h n()
    {
      this.gh = pq.awW;
      this.gi = pq.awW;
      this.gj = pq.awW;
      this.gk = 0;
      this.gl = pq.awW;
      this.gm = 0;
      this.gn = 0;
      this.awJ = null;
      this.awU = -1;
      return this;
    }
  }
  
  public static final class i
    extends ph<i>
  {
    private static volatile i[] go;
    public d.a gp;
    public c.d gq;
    public String name;
    
    public i()
    {
      p();
    }
    
    public static i[] o()
    {
      if (go == null) {}
      synchronized (pl.awT)
      {
        if (go == null) {
          go = new i[0];
        }
        return go;
      }
    }
    
    public void a(pg parampg)
      throws IOException
    {
      if (!this.name.equals("")) {
        parampg.b(1, this.name);
      }
      if (this.gp != null) {
        parampg.a(2, this.gp);
      }
      if (this.gq != null) {
        parampg.a(3, this.gq);
      }
      super.a(parampg);
    }
    
    protected int c()
    {
      int i = super.c();
      int j = i;
      if (!this.name.equals("")) {
        j = i + pg.j(1, this.name);
      }
      i = j;
      if (this.gp != null) {
        i = j + pg.c(2, this.gp);
      }
      j = i;
      if (this.gq != null) {
        j = i + pg.c(3, this.gq);
      }
      return j;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool2 = false;
      boolean bool1;
      if (paramObject == this) {
        bool1 = true;
      }
      for (;;)
      {
        return bool1;
        bool1 = bool2;
        if ((paramObject instanceof i))
        {
          paramObject = (i)paramObject;
          if (this.name == null)
          {
            bool1 = bool2;
            if (((i)paramObject).name != null) {
              continue;
            }
            label41:
            if (this.gp != null) {
              break label101;
            }
            bool1 = bool2;
            if (((i)paramObject).gp != null) {
              continue;
            }
            label57:
            if (this.gq != null) {
              break label120;
            }
            bool1 = bool2;
            if (((i)paramObject).gq != null) {
              continue;
            }
          }
          label101:
          label120:
          while (this.gq.equals(((i)paramObject).gq))
          {
            bool1 = a((ph)paramObject);
            break;
            if (this.name.equals(((i)paramObject).name)) {
              break label41;
            }
            bool1 = bool2;
            break;
            if (this.gp.equals(((i)paramObject).gp)) {
              break label57;
            }
            bool1 = bool2;
            break;
          }
          bool1 = bool2;
        }
      }
    }
    
    public int hashCode()
    {
      int k = 0;
      int i;
      int j;
      if (this.name == null)
      {
        i = 0;
        if (this.gp != null) {
          break label62;
        }
        j = 0;
        label20:
        if (this.gq != null) {
          break label73;
        }
      }
      for (;;)
      {
        return ((j + (i + 527) * 31) * 31 + k) * 31 + qz();
        i = this.name.hashCode();
        break;
        label62:
        j = this.gp.hashCode();
        break label20;
        label73:
        k = this.gq.hashCode();
      }
    }
    
    public i j(pf parampf)
      throws IOException
    {
      for (;;)
      {
        int i = parampf.qi();
        switch (i)
        {
        default: 
          if (a(parampf, i)) {}
          break;
        case 0: 
          return this;
        case 10: 
          this.name = parampf.readString();
          break;
        case 18: 
          if (this.gp == null) {
            this.gp = new d.a();
          }
          parampf.a(this.gp);
          break;
        case 26: 
          if (this.gq == null) {
            this.gq = new c.d();
          }
          parampf.a(this.gq);
        }
      }
    }
    
    public i p()
    {
      this.name = "";
      this.gp = null;
      this.gq = null;
      this.awJ = null;
      this.awU = -1;
      return this;
    }
  }
  
  public static final class j
    extends ph<j>
  {
    public c.i[] gr;
    public c.f gs;
    public String gt;
    
    public j()
    {
      q();
    }
    
    public static j b(byte[] paramArrayOfByte)
      throws pm
    {
      return (j)pn.a(new j(), paramArrayOfByte);
    }
    
    public void a(pg parampg)
      throws IOException
    {
      if ((this.gr != null) && (this.gr.length > 0)) {
        for (int i = 0; i < this.gr.length; i++)
        {
          c.i locali = this.gr[i];
          if (locali != null) {
            parampg.a(1, locali);
          }
        }
      }
      if (this.gs != null) {
        parampg.a(2, this.gs);
      }
      if (!this.gt.equals("")) {
        parampg.b(3, this.gt);
      }
      super.a(parampg);
    }
    
    protected int c()
    {
      int i = super.c();
      int j = i;
      if (this.gr != null)
      {
        j = i;
        if (this.gr.length > 0)
        {
          int k = 0;
          for (;;)
          {
            j = i;
            if (k >= this.gr.length) {
              break;
            }
            c.i locali = this.gr[k];
            j = i;
            if (locali != null) {
              j = i + pg.c(1, locali);
            }
            k++;
            i = j;
          }
        }
      }
      i = j;
      if (this.gs != null) {
        i = j + pg.c(2, this.gs);
      }
      j = i;
      if (!this.gt.equals("")) {
        j = i + pg.j(3, this.gt);
      }
      return j;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool2 = false;
      boolean bool1;
      if (paramObject == this) {
        bool1 = true;
      }
      for (;;)
      {
        return bool1;
        bool1 = bool2;
        if ((paramObject instanceof j))
        {
          paramObject = (j)paramObject;
          bool1 = bool2;
          if (pl.equals(this.gr, ((j)paramObject).gr))
          {
            if (this.gs == null)
            {
              bool1 = bool2;
              if (((j)paramObject).gs != null) {
                continue;
              }
              label57:
              if (this.gt != null) {
                break label101;
              }
              bool1 = bool2;
              if (((j)paramObject).gt != null) {
                continue;
              }
            }
            label101:
            while (this.gt.equals(((j)paramObject).gt))
            {
              bool1 = a((ph)paramObject);
              break;
              if (this.gs.equals(((j)paramObject).gs)) {
                break label57;
              }
              bool1 = bool2;
              break;
            }
            bool1 = bool2;
          }
        }
      }
    }
    
    public int hashCode()
    {
      int j = 0;
      int k = pl.hashCode(this.gr);
      int i;
      if (this.gs == null)
      {
        i = 0;
        if (this.gt != null) {
          break label61;
        }
      }
      for (;;)
      {
        return ((i + (k + 527) * 31) * 31 + j) * 31 + qz();
        i = this.gs.hashCode();
        break;
        label61:
        j = this.gt.hashCode();
      }
    }
    
    public j k(pf parampf)
      throws IOException
    {
      for (;;)
      {
        int i = parampf.qi();
        switch (i)
        {
        default: 
          if (a(parampf, i)) {}
          break;
        case 0: 
          return this;
        case 10: 
          int j = pq.b(parampf, 10);
          if (this.gr == null) {}
          c.i[] arrayOfi;
          for (i = 0;; i = this.gr.length)
          {
            arrayOfi = new c.i[j + i];
            j = i;
            if (i != 0) {
              System.arraycopy(this.gr, 0, arrayOfi, 0, i);
            }
            for (j = i; j < arrayOfi.length - 1; j++)
            {
              arrayOfi[j] = new c.i();
              parampf.a(arrayOfi[j]);
              parampf.qi();
            }
          }
          arrayOfi[j] = new c.i();
          parampf.a(arrayOfi[j]);
          this.gr = arrayOfi;
          break;
        case 18: 
          if (this.gs == null) {
            this.gs = new c.f();
          }
          parampf.a(this.gs);
          break;
        case 26: 
          this.gt = parampf.readString();
        }
      }
    }
    
    public j q()
    {
      this.gr = c.i.o();
      this.gs = null;
      this.gt = "";
      this.awJ = null;
      this.awU = -1;
      return this;
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\internal\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */