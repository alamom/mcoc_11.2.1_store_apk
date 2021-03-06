package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.c.i;
import com.google.android.gms.internal.d.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class ct
{
  private static final bz<d.a> aqS = new bz(di.pK(), true);
  private final DataLayer aod;
  private final cr.c aqT;
  private final ag aqU;
  private final Map<String, aj> aqV;
  private final Map<String, aj> aqW;
  private final Map<String, aj> aqX;
  private final k<cr.a, bz<d.a>> aqY;
  private final k<String, b> aqZ;
  private final Set<cr.e> ara;
  private final Map<String, c> arb;
  private volatile String arc;
  private int ard;
  
  public ct(Context paramContext, cr.c paramc, DataLayer paramDataLayer, s.a parama1, s.a parama2, ag paramag)
  {
    if (paramc == null) {
      throw new NullPointerException("resource cannot be null");
    }
    this.aqT = paramc;
    this.ara = new HashSet(paramc.oY());
    this.aod = paramDataLayer;
    this.aqU = paramag;
    paramc = new l.a()
    {
      public int a(cr.a paramAnonymousa, bz<d.a> paramAnonymousbz)
      {
        return ((d.a)paramAnonymousbz.getObject()).qH();
      }
    };
    this.aqY = new l().a(1048576, paramc);
    paramc = new l.a()
    {
      public int a(String paramAnonymousString, ct.b paramAnonymousb)
      {
        return paramAnonymousString.length() + paramAnonymousb.getSize();
      }
    };
    this.aqZ = new l().a(1048576, paramc);
    this.aqV = new HashMap();
    b(new i(paramContext));
    b(new s(parama2));
    b(new w(paramDataLayer));
    b(new dj(paramContext, paramDataLayer));
    this.aqW = new HashMap();
    c(new q());
    c(new ad());
    c(new ae());
    c(new al());
    c(new am());
    c(new bd());
    c(new be());
    c(new ci());
    c(new dc());
    this.aqX = new HashMap();
    a(new b(paramContext));
    a(new c(paramContext));
    a(new e(paramContext));
    a(new f(paramContext));
    a(new g(paramContext));
    a(new h(paramContext));
    a(new m());
    a(new p(this.aqT.getVersion()));
    a(new s(parama1));
    a(new u(paramDataLayer));
    a(new z(paramContext));
    a(new aa());
    a(new ac());
    a(new ah(this));
    a(new an());
    a(new ao());
    a(new ax(paramContext));
    a(new az());
    a(new bc());
    a(new bj());
    a(new bl(paramContext));
    a(new ca());
    a(new cc());
    a(new cf());
    a(new ch());
    a(new cj(paramContext));
    a(new cu());
    a(new cv());
    a(new de());
    a(new dk());
    this.arb = new HashMap();
    parama1 = this.ara.iterator();
    while (parama1.hasNext())
    {
      paramDataLayer = (cr.e)parama1.next();
      if (paramag.oq())
      {
        a(paramDataLayer.pg(), paramDataLayer.ph(), "add macro");
        a(paramDataLayer.pl(), paramDataLayer.pi(), "remove macro");
        a(paramDataLayer.pe(), paramDataLayer.pj(), "add tag");
        a(paramDataLayer.pf(), paramDataLayer.pk(), "remove tag");
      }
      for (int i = 0; i < paramDataLayer.pg().size(); i++)
      {
        parama2 = (cr.a)paramDataLayer.pg().get(i);
        paramc = "Unknown";
        paramContext = paramc;
        if (paramag.oq())
        {
          paramContext = paramc;
          if (i < paramDataLayer.ph().size()) {
            paramContext = (String)paramDataLayer.ph().get(i);
          }
        }
        paramc = e(this.arb, h(parama2));
        paramc.b(paramDataLayer);
        paramc.a(paramDataLayer, parama2);
        paramc.a(paramDataLayer, paramContext);
      }
      for (i = 0; i < paramDataLayer.pl().size(); i++)
      {
        parama2 = (cr.a)paramDataLayer.pl().get(i);
        paramc = "Unknown";
        paramContext = paramc;
        if (paramag.oq())
        {
          paramContext = paramc;
          if (i < paramDataLayer.pi().size()) {
            paramContext = (String)paramDataLayer.pi().get(i);
          }
        }
        paramc = e(this.arb, h(parama2));
        paramc.b(paramDataLayer);
        paramc.b(paramDataLayer, parama2);
        paramc.b(paramDataLayer, paramContext);
      }
    }
    paramc = this.aqT.oZ().entrySet().iterator();
    while (paramc.hasNext())
    {
      parama1 = (Map.Entry)paramc.next();
      paramDataLayer = ((List)parama1.getValue()).iterator();
      while (paramDataLayer.hasNext())
      {
        paramContext = (cr.a)paramDataLayer.next();
        if (!di.n((d.a)paramContext.oU().get(com.google.android.gms.internal.b.dG.toString())).booleanValue()) {
          e(this.arb, (String)parama1.getKey()).i(paramContext);
        }
      }
    }
  }
  
  private bz<d.a> a(d.a parama, Set<String> paramSet, dl paramdl)
  {
    if (!parama.gF) {
      parama = new bz(parama, true);
    }
    for (;;)
    {
      return parama;
      Object localObject1;
      int i;
      Object localObject2;
      switch (parama.type)
      {
      case 5: 
      case 6: 
      default: 
        bh.T("Unknown type: " + parama.type);
        parama = aqS;
        break;
      case 2: 
        localObject1 = cr.g(parama);
        ((d.a)localObject1).gw = new d.a[parama.gw.length];
        for (i = 0;; i++)
        {
          if (i >= parama.gw.length) {
            break label184;
          }
          localObject2 = a(parama.gw[i], paramSet, paramdl.fi(i));
          if (localObject2 == aqS)
          {
            parama = aqS;
            break;
          }
          ((d.a)localObject1).gw[i] = ((d.a)((bz)localObject2).getObject());
        }
        parama = new bz(localObject1, false);
        break;
      case 3: 
        localObject2 = cr.g(parama);
        if (parama.gx.length != parama.gy.length)
        {
          bh.T("Invalid serving value: " + parama.toString());
          parama = aqS;
        }
        else
        {
          ((d.a)localObject2).gx = new d.a[parama.gx.length];
          ((d.a)localObject2).gy = new d.a[parama.gx.length];
          for (i = 0;; i++)
          {
            if (i >= parama.gx.length) {
              break label394;
            }
            localObject1 = a(parama.gx[i], paramSet, paramdl.fj(i));
            bz localbz = a(parama.gy[i], paramSet, paramdl.fk(i));
            if ((localObject1 == aqS) || (localbz == aqS))
            {
              parama = aqS;
              break;
            }
            ((d.a)localObject2).gx[i] = ((d.a)((bz)localObject1).getObject());
            ((d.a)localObject2).gy[i] = ((d.a)localbz.getObject());
          }
          parama = new bz(localObject2, false);
        }
        break;
      case 4: 
        if (paramSet.contains(parama.gz))
        {
          bh.T("Macro cycle detected.  Current macro reference: " + parama.gz + "." + "  Previous macro references: " + paramSet.toString() + ".");
          parama = aqS;
        }
        else
        {
          paramSet.add(parama.gz);
          paramdl = dm.a(a(parama.gz, paramSet, paramdl.oF()), parama.gE);
          paramSet.remove(parama.gz);
          parama = paramdl;
        }
        break;
      case 7: 
        label184:
        label394:
        localObject2 = cr.g(parama);
        ((d.a)localObject2).gD = new d.a[parama.gD.length];
        for (i = 0;; i++)
        {
          if (i >= parama.gD.length) {
            break label620;
          }
          localObject1 = a(parama.gD[i], paramSet, paramdl.fl(i));
          if (localObject1 == aqS)
          {
            parama = aqS;
            break;
          }
          ((d.a)localObject2).gD[i] = ((d.a)((bz)localObject1).getObject());
        }
        label620:
        parama = new bz(localObject2, false);
      }
    }
  }
  
  private bz<d.a> a(String paramString, Set<String> paramSet, bk parambk)
  {
    this.ard += 1;
    Object localObject = (b)this.aqZ.get(paramString);
    if ((localObject != null) && (!this.aqU.oq()))
    {
      a(((b)localObject).oV(), paramSet);
      this.ard -= 1;
    }
    for (paramString = ((b)localObject).pp();; paramString = aqS)
    {
      return paramString;
      localObject = (c)this.arb.get(paramString);
      if (localObject != null) {
        break;
      }
      bh.T(po() + "Invalid macro: " + paramString);
      this.ard -= 1;
    }
    bz localbz = a(paramString, ((c)localObject).pq(), ((c)localObject).pr(), ((c)localObject).ps(), ((c)localObject).pu(), ((c)localObject).pt(), paramSet, parambk.oh());
    if (((Set)localbz.getObject()).isEmpty()) {}
    for (localObject = ((c)localObject).pv();; localObject = (cr.a)((Set)localbz.getObject()).iterator().next())
    {
      if (localObject != null) {
        break label294;
      }
      this.ard -= 1;
      paramString = aqS;
      break;
      if (((Set)localbz.getObject()).size() > 1) {
        bh.W(po() + "Multiple macros active for macroName " + paramString);
      }
    }
    label294:
    parambk = a(this.aqX, (cr.a)localObject, paramSet, parambk.ow());
    boolean bool;
    if ((localbz.oG()) && (parambk.oG()))
    {
      bool = true;
      label330:
      if (parambk != aqS) {
        break label403;
      }
    }
    label403:
    for (parambk = aqS;; parambk = new bz(parambk.getObject(), bool))
    {
      localObject = ((cr.a)localObject).oV();
      if (parambk.oG()) {
        this.aqZ.e(paramString, new b(parambk, (d.a)localObject));
      }
      a((d.a)localObject, paramSet);
      this.ard -= 1;
      paramString = parambk;
      break;
      bool = false;
      break label330;
    }
  }
  
  private bz<d.a> a(Map<String, aj> paramMap, cr.a parama, Set<String> paramSet, ck paramck)
  {
    boolean bool = true;
    Object localObject1 = (d.a)parama.oU().get(com.google.android.gms.internal.b.cU.toString());
    if (localObject1 == null)
    {
      bh.T("No function id in properties");
      paramMap = aqS;
    }
    aj localaj;
    HashMap localHashMap;
    int i;
    for (;;)
    {
      return paramMap;
      localObject1 = ((d.a)localObject1).gA;
      localaj = (aj)paramMap.get(localObject1);
      if (localaj == null)
      {
        bh.T((String)localObject1 + " has no backing implementation.");
        paramMap = aqS;
      }
      else
      {
        paramMap = (bz)this.aqY.get(parama);
        if ((paramMap == null) || (this.aqU.oq()))
        {
          localHashMap = new HashMap();
          Iterator localIterator = parama.oU().entrySet().iterator();
          i = 1;
          if (localIterator.hasNext())
          {
            paramMap = (Map.Entry)localIterator.next();
            Object localObject2 = paramck.cH((String)paramMap.getKey());
            localObject2 = a((d.a)paramMap.getValue(), paramSet, ((cm)localObject2).e((d.a)paramMap.getValue()));
            if (localObject2 == aqS)
            {
              paramMap = aqS;
            }
            else
            {
              if (((bz)localObject2).oG()) {
                parama.a((String)paramMap.getKey(), (d.a)((bz)localObject2).getObject());
              }
              for (;;)
              {
                localHashMap.put(paramMap.getKey(), ((bz)localObject2).getObject());
                break;
                i = 0;
              }
            }
          }
          else
          {
            if (localaj.a(localHashMap.keySet())) {
              break;
            }
            bh.T("Incorrect keys for function " + (String)localObject1 + " required " + localaj.os() + " had " + localHashMap.keySet());
            paramMap = aqS;
          }
        }
      }
    }
    if ((i != 0) && (localaj.nN())) {}
    for (;;)
    {
      paramMap = new bz(localaj.C(localHashMap), bool);
      if (bool) {
        this.aqY.e(parama, paramMap);
      }
      paramck.d((d.a)paramMap.getObject());
      break;
      bool = false;
    }
  }
  
  private bz<Set<cr.a>> a(Set<cr.e> paramSet, Set<String> paramSet1, a parama, cs paramcs)
  {
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    Iterator localIterator = paramSet.iterator();
    boolean bool = true;
    if (localIterator.hasNext())
    {
      cr.e locale = (cr.e)localIterator.next();
      cn localcn = paramcs.oE();
      paramSet = a(locale, paramSet1, localcn);
      if (((Boolean)paramSet.getObject()).booleanValue()) {
        parama.a(locale, localHashSet1, localHashSet2, localcn);
      }
      if ((bool) && (paramSet.oG())) {}
      for (bool = true;; bool = false) {
        break;
      }
    }
    localHashSet1.removeAll(localHashSet2);
    paramcs.b(localHashSet1);
    return new bz(localHashSet1, bool);
  }
  
  private void a(d.a parama, Set<String> paramSet)
  {
    if (parama == null) {}
    for (;;)
    {
      return;
      parama = a(parama, paramSet, new bx());
      if (parama != aqS)
      {
        parama = di.o((d.a)parama.getObject());
        if ((parama instanceof Map))
        {
          parama = (Map)parama;
          this.aod.push(parama);
        }
        else if ((parama instanceof List))
        {
          parama = ((List)parama).iterator();
          while (parama.hasNext())
          {
            paramSet = parama.next();
            if ((paramSet instanceof Map))
            {
              paramSet = (Map)paramSet;
              this.aod.push(paramSet);
            }
            else
            {
              bh.W("pushAfterEvaluate: value not a Map");
            }
          }
        }
        else
        {
          bh.W("pushAfterEvaluate: value not a Map or List");
        }
      }
    }
  }
  
  private static void a(List<cr.a> paramList, List<String> paramList1, String paramString)
  {
    if (paramList.size() != paramList1.size()) {
      bh.U("Invalid resource: imbalance of rule names of functions for " + paramString + " operation. Using default rule name instead");
    }
  }
  
  private static void a(Map<String, aj> paramMap, aj paramaj)
  {
    if (paramMap.containsKey(paramaj.or())) {
      throw new IllegalArgumentException("Duplicate function type name: " + paramaj.or());
    }
    paramMap.put(paramaj.or(), paramaj);
  }
  
  private static c e(Map<String, c> paramMap, String paramString)
  {
    c localc2 = (c)paramMap.get(paramString);
    c localc1 = localc2;
    if (localc2 == null)
    {
      localc1 = new c();
      paramMap.put(paramString, localc1);
    }
    return localc1;
  }
  
  private static String h(cr.a parama)
  {
    return di.j((d.a)parama.oU().get(com.google.android.gms.internal.b.df.toString()));
  }
  
  private String po()
  {
    if (this.ard <= 1) {}
    for (Object localObject = "";; localObject = ((StringBuilder)localObject).toString())
    {
      return (String)localObject;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(Integer.toString(this.ard));
      for (int i = 2; i < this.ard; i++) {
        ((StringBuilder)localObject).append(' ');
      }
      ((StringBuilder)localObject).append(": ");
    }
  }
  
  bz<Boolean> a(cr.a parama, Set<String> paramSet, ck paramck)
  {
    paramSet = a(this.aqW, parama, paramSet, paramck);
    parama = di.n((d.a)paramSet.getObject());
    paramck.d(di.u(parama));
    return new bz(parama, paramSet.oG());
  }
  
  bz<Boolean> a(cr.e parame, Set<String> paramSet, cn paramcn)
  {
    Iterator localIterator = parame.pd().iterator();
    boolean bool = true;
    Object localObject;
    if (localIterator.hasNext())
    {
      localObject = a((cr.a)localIterator.next(), paramSet, paramcn.oy());
      if (((Boolean)((bz)localObject).getObject()).booleanValue())
      {
        paramcn.f(di.u(Boolean.valueOf(false)));
        parame = new bz(Boolean.valueOf(false), ((bz)localObject).oG());
      }
    }
    for (;;)
    {
      return parame;
      if ((bool) && (((bz)localObject).oG())) {}
      for (bool = true;; bool = false) {
        break;
      }
      localObject = parame.pc().iterator();
      for (;;)
      {
        if (!((Iterator)localObject).hasNext()) {
          break label230;
        }
        parame = a((cr.a)((Iterator)localObject).next(), paramSet, paramcn.oz());
        if (!((Boolean)parame.getObject()).booleanValue())
        {
          paramcn.f(di.u(Boolean.valueOf(false)));
          parame = new bz(Boolean.valueOf(false), parame.oG());
          break;
        }
        if ((bool) && (parame.oG())) {
          bool = true;
        } else {
          bool = false;
        }
      }
      label230:
      paramcn.f(di.u(Boolean.valueOf(true)));
      parame = new bz(Boolean.valueOf(true), bool);
    }
  }
  
  bz<Set<cr.a>> a(String paramString, Set<cr.e> paramSet, final Map<cr.e, List<cr.a>> paramMap1, final Map<cr.e, List<String>> paramMap2, final Map<cr.e, List<cr.a>> paramMap3, final Map<cr.e, List<String>> paramMap4, Set<String> paramSet1, cs paramcs)
  {
    a(paramSet, paramSet1, new a()
    {
      public void a(cr.e paramAnonymouse, Set<cr.a> paramAnonymousSet1, Set<cr.a> paramAnonymousSet2, cn paramAnonymouscn)
      {
        List localList2 = (List)paramMap1.get(paramAnonymouse);
        List localList1 = (List)paramMap2.get(paramAnonymouse);
        if (localList2 != null)
        {
          paramAnonymousSet1.addAll(localList2);
          paramAnonymouscn.oA().c(localList2, localList1);
        }
        paramAnonymousSet1 = (List)paramMap3.get(paramAnonymouse);
        paramAnonymouse = (List)paramMap4.get(paramAnonymouse);
        if (paramAnonymousSet1 != null)
        {
          paramAnonymousSet2.addAll(paramAnonymousSet1);
          paramAnonymouscn.oB().c(paramAnonymousSet1, paramAnonymouse);
        }
      }
    }, paramcs);
  }
  
  bz<Set<cr.a>> a(Set<cr.e> paramSet, cs paramcs)
  {
    a(paramSet, new HashSet(), new a()
    {
      public void a(cr.e paramAnonymouse, Set<cr.a> paramAnonymousSet1, Set<cr.a> paramAnonymousSet2, cn paramAnonymouscn)
      {
        paramAnonymousSet1.addAll(paramAnonymouse.pe());
        paramAnonymousSet2.addAll(paramAnonymouse.pf());
        paramAnonymouscn.oC().c(paramAnonymouse.pe(), paramAnonymouse.pj());
        paramAnonymouscn.oD().c(paramAnonymouse.pf(), paramAnonymouse.pk());
      }
    }, paramcs);
  }
  
  void a(aj paramaj)
  {
    a(this.aqX, paramaj);
  }
  
  void b(aj paramaj)
  {
    a(this.aqV, paramaj);
  }
  
  void c(aj paramaj)
  {
    a(this.aqW, paramaj);
  }
  
  public bz<d.a> cR(String paramString)
  {
    this.ard = 0;
    af localaf = this.aqU.cA(paramString);
    paramString = a(paramString, new HashSet(), localaf.on());
    localaf.op();
    return paramString;
  }
  
  void cS(String paramString)
  {
    try
    {
      this.arc = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void cp(String paramString)
  {
    try
    {
      cS(paramString);
      af localaf = this.aqU.cB(paramString);
      t localt = localaf.oo();
      Iterator localIterator = ((Set)a(this.ara, localt.oh()).getObject()).iterator();
      while (localIterator.hasNext())
      {
        cr.a locala = (cr.a)localIterator.next();
        Map localMap = this.aqV;
        paramString = new java/util/HashSet;
        paramString.<init>();
        a(localMap, locala, paramString, localt.og());
      }
      localaf.op();
    }
    finally {}
    cS(null);
  }
  
  public void k(List<c.i> paramList)
  {
    for (;;)
    {
      try
      {
        paramList = paramList.iterator();
        if (!paramList.hasNext()) {
          break;
        }
        c.i locali = (c.i)paramList.next();
        if ((locali.name == null) || (!locali.name.startsWith("gaExperiment:")))
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          bh.V("Ignored supplemental: " + locali);
        }
        else
        {
          ai.a(this.aod, locali);
        }
      }
      finally {}
    }
  }
  
  String pn()
  {
    try
    {
      String str = this.arc;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  static abstract interface a
  {
    public abstract void a(cr.e parame, Set<cr.a> paramSet1, Set<cr.a> paramSet2, cn paramcn);
  }
  
  private static class b
  {
    private d.a aqE;
    private bz<d.a> arj;
    
    public b(bz<d.a> parambz, d.a parama)
    {
      this.arj = parambz;
      this.aqE = parama;
    }
    
    public int getSize()
    {
      int j = ((d.a)this.arj.getObject()).qH();
      if (this.aqE == null) {}
      for (int i = 0;; i = this.aqE.qH()) {
        return i + j;
      }
    }
    
    public d.a oV()
    {
      return this.aqE;
    }
    
    public bz<d.a> pp()
    {
      return this.arj;
    }
  }
  
  private static class c
  {
    private final Set<cr.e> ara = new HashSet();
    private final Map<cr.e, List<cr.a>> ark = new HashMap();
    private final Map<cr.e, List<cr.a>> arl = new HashMap();
    private final Map<cr.e, List<String>> arm = new HashMap();
    private final Map<cr.e, List<String>> arn = new HashMap();
    private cr.a aro;
    
    public void a(cr.e parame, cr.a parama)
    {
      List localList = (List)this.ark.get(parame);
      Object localObject = localList;
      if (localList == null)
      {
        localObject = new ArrayList();
        this.ark.put(parame, localObject);
      }
      ((List)localObject).add(parama);
    }
    
    public void a(cr.e parame, String paramString)
    {
      List localList = (List)this.arm.get(parame);
      Object localObject = localList;
      if (localList == null)
      {
        localObject = new ArrayList();
        this.arm.put(parame, localObject);
      }
      ((List)localObject).add(paramString);
    }
    
    public void b(cr.e parame)
    {
      this.ara.add(parame);
    }
    
    public void b(cr.e parame, cr.a parama)
    {
      List localList = (List)this.arl.get(parame);
      Object localObject = localList;
      if (localList == null)
      {
        localObject = new ArrayList();
        this.arl.put(parame, localObject);
      }
      ((List)localObject).add(parama);
    }
    
    public void b(cr.e parame, String paramString)
    {
      List localList = (List)this.arn.get(parame);
      Object localObject = localList;
      if (localList == null)
      {
        localObject = new ArrayList();
        this.arn.put(parame, localObject);
      }
      ((List)localObject).add(paramString);
    }
    
    public void i(cr.a parama)
    {
      this.aro = parama;
    }
    
    public Set<cr.e> pq()
    {
      return this.ara;
    }
    
    public Map<cr.e, List<cr.a>> pr()
    {
      return this.ark;
    }
    
    public Map<cr.e, List<String>> ps()
    {
      return this.arm;
    }
    
    public Map<cr.e, List<String>> pt()
    {
      return this.arn;
    }
    
    public Map<cr.e, List<cr.a>> pu()
    {
      return this.arl;
    }
    
    public cr.a pv()
    {
      return this.aro;
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\tagmanager\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */