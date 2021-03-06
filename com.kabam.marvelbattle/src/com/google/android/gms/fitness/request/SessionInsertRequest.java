package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.kj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionInsertRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<SessionInsertRequest> CREATOR = new s();
  private final int BR;
  private final List<DataSet> SD;
  private final Session St;
  private final List<DataPoint> UL;
  
  SessionInsertRequest(int paramInt, Session paramSession, List<DataSet> paramList, List<DataPoint> paramList1)
  {
    this.BR = paramInt;
    this.St = paramSession;
    this.SD = Collections.unmodifiableList(paramList);
    this.UL = Collections.unmodifiableList(paramList1);
  }
  
  private SessionInsertRequest(Builder paramBuilder)
  {
    this.BR = 1;
    this.St = Builder.a(paramBuilder);
    this.SD = Collections.unmodifiableList(Builder.b(paramBuilder));
    this.UL = Collections.unmodifiableList(Builder.c(paramBuilder));
  }
  
  private boolean a(SessionInsertRequest paramSessionInsertRequest)
  {
    if ((n.equal(this.St, paramSessionInsertRequest.St)) && (n.equal(this.SD, paramSessionInsertRequest.SD)) && (n.equal(this.UL, paramSessionInsertRequest.UL))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject == this) || (((paramObject instanceof SessionInsertRequest)) && (a((SessionInsertRequest)paramObject)))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public List<DataPoint> getAggregateDataPoints()
  {
    return this.UL;
  }
  
  public List<DataSet> getDataSets()
  {
    return this.SD;
  }
  
  public Session getSession()
  {
    return this.St;
  }
  
  int getVersionCode()
  {
    return this.BR;
  }
  
  public int hashCode()
  {
    return n.hashCode(new Object[] { this.St, this.SD, this.UL });
  }
  
  public String toString()
  {
    return n.h(this).a("session", this.St).a("dataSets", this.SD).a("aggregateDataPoints", this.UL).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    s.a(this, paramParcel, paramInt);
  }
  
  public static class Builder
  {
    private List<DataSet> SD = new ArrayList();
    private Session St;
    private List<DataPoint> UL = new ArrayList();
    private List<DataSource> UM = new ArrayList();
    
    private void d(DataPoint paramDataPoint)
    {
      f(paramDataPoint);
      e(paramDataPoint);
    }
    
    private void e(DataPoint paramDataPoint)
    {
      long l3 = this.St.getStartTime(TimeUnit.NANOSECONDS);
      long l5 = this.St.getEndTime(TimeUnit.NANOSECONDS);
      long l4 = paramDataPoint.getStartTime(TimeUnit.NANOSECONDS);
      long l2 = paramDataPoint.getEndTime(TimeUnit.NANOSECONDS);
      TimeUnit localTimeUnit;
      long l1;
      if ((l4 != 0L) && (l2 != 0L))
      {
        localTimeUnit = TimeUnit.MILLISECONDS;
        l1 = l2;
        if (l2 > l5) {
          l1 = kj.a(l2, TimeUnit.NANOSECONDS, localTimeUnit);
        }
        if ((l4 < l3) || (l1 > l5)) {
          break label196;
        }
      }
      label196:
      for (boolean bool = true;; bool = false)
      {
        o.a(bool, "Data point %s has start and end times outside session interval [%d, %d]", new Object[] { paramDataPoint, Long.valueOf(l3), Long.valueOf(l5) });
        if (l1 != paramDataPoint.getEndTime(TimeUnit.NANOSECONDS))
        {
          Log.w("Fitness", String.format("Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[] { Long.valueOf(paramDataPoint.getEndTime(TimeUnit.NANOSECONDS)), Long.valueOf(l1), localTimeUnit }));
          paramDataPoint.setTimeInterval(l4, l1, TimeUnit.NANOSECONDS);
        }
        return;
      }
    }
    
    private void f(DataPoint paramDataPoint)
    {
      long l4 = this.St.getStartTime(TimeUnit.NANOSECONDS);
      long l3 = this.St.getEndTime(TimeUnit.NANOSECONDS);
      long l2 = paramDataPoint.getTimestamp(TimeUnit.NANOSECONDS);
      TimeUnit localTimeUnit;
      long l1;
      if (l2 != 0L)
      {
        localTimeUnit = TimeUnit.MILLISECONDS;
        if (l2 >= l4)
        {
          l1 = l2;
          if (l2 <= l3) {}
        }
        else
        {
          l1 = kj.a(l2, TimeUnit.NANOSECONDS, localTimeUnit);
        }
        if ((l1 < l4) || (l1 > l3)) {
          break label185;
        }
      }
      label185:
      for (boolean bool = true;; bool = false)
      {
        o.a(bool, "Data point %s has time stamp outside session interval [%d, %d]", new Object[] { paramDataPoint, Long.valueOf(l4), Long.valueOf(l3) });
        if (paramDataPoint.getTimestamp(TimeUnit.NANOSECONDS) != l1)
        {
          Log.w("Fitness", String.format("Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[] { Long.valueOf(paramDataPoint.getTimestamp(TimeUnit.NANOSECONDS)), Long.valueOf(l1), localTimeUnit }));
          paramDataPoint.setTimestamp(l1, TimeUnit.NANOSECONDS);
        }
        return;
      }
    }
    
    private void jy()
    {
      Iterator localIterator1 = this.SD.iterator();
      while (localIterator1.hasNext())
      {
        Iterator localIterator2 = ((DataSet)localIterator1.next()).getDataPoints().iterator();
        while (localIterator2.hasNext()) {
          d((DataPoint)localIterator2.next());
        }
      }
      localIterator1 = this.UL.iterator();
      while (localIterator1.hasNext()) {
        d((DataPoint)localIterator1.next());
      }
    }
    
    public Builder addAggregateDataPoint(DataPoint paramDataPoint)
    {
      label48:
      DataSource localDataSource;
      if (paramDataPoint != null)
      {
        bool = true;
        o.b(bool, "Must specify a valid aggregate data point.");
        long l2 = paramDataPoint.getStartTime(TimeUnit.NANOSECONDS);
        long l1 = paramDataPoint.getEndTime(TimeUnit.NANOSECONDS);
        if ((l2 <= 0L) || (l1 <= l2)) {
          break label133;
        }
        bool = true;
        o.b(bool, "Aggregate data point should have valid start and end times: %s", new Object[] { paramDataPoint });
        localDataSource = paramDataPoint.getDataSource();
        if (this.UM.contains(localDataSource)) {
          break label139;
        }
      }
      label133:
      label139:
      for (boolean bool = true;; bool = false)
      {
        o.a(bool, "Data set/Aggregate data point for this data source %s is already added.", new Object[] { localDataSource });
        this.UM.add(localDataSource);
        this.UL.add(paramDataPoint);
        return this;
        bool = false;
        break;
        bool = false;
        break label48;
      }
    }
    
    public Builder addDataSet(DataSet paramDataSet)
    {
      boolean bool2 = true;
      DataSource localDataSource;
      if (paramDataSet != null)
      {
        bool1 = true;
        o.b(bool1, "Must specify a valid data set.");
        localDataSource = paramDataSet.getDataSource();
        if (this.UM.contains(localDataSource)) {
          break label101;
        }
        bool1 = true;
        label36:
        o.a(bool1, "Data set for this data source %s is already added.", new Object[] { localDataSource });
        if (paramDataSet.getDataPoints().isEmpty()) {
          break label106;
        }
      }
      label101:
      label106:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        o.b(bool1, "No data points specified in the input data set.");
        this.UM.add(localDataSource);
        this.SD.add(paramDataSet);
        return this;
        bool1 = false;
        break;
        bool1 = false;
        break label36;
      }
    }
    
    public SessionInsertRequest build()
    {
      boolean bool2 = true;
      if (this.St != null)
      {
        bool1 = true;
        o.a(bool1, "Must specify a valid session.");
        if (this.St.getEndTime(TimeUnit.MILLISECONDS) == 0L) {
          break label59;
        }
      }
      label59:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        o.a(bool1, "Must specify a valid end time, cannot insert a continuing session.");
        jy();
        return new SessionInsertRequest(this, null);
        bool1 = false;
        break;
      }
    }
    
    public Builder setSession(Session paramSession)
    {
      this.St = paramSession;
      return this;
    }
  }
}


/* Location:              C:\tools\androidhack\com.kabam.marvelbattle\classes.jar!\com\google\android\gms\fitness\request\SessionInsertRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */