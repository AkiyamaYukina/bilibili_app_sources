package com.bilibili.tensorflow.data.common;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/common/a.class */
@Dao
public interface a {
    @Query("SELECT * FROM _tf_business_data WHERE _event_type = :eventType AND _type = :dataType AND _report_time_stamp = :reportTime AND _time_stamp >= :startTime AND _time_stamp <= :endTime")
    @Nullable
    Object a(long j7, long j8, @NotNull String str, @NotNull Continuation continuation);

    @Query("DELETE FROM _tf_business_data WHERE _id IN (SELECT _id FROM _tf_business_data WHERE _time_stamp <= :endTime AND  _type = :eventType)")
    @Nullable
    Object b(long j7, @NotNull Continuation continuation);

    @Query("SELECT * FROM _tf_business_data WHERE _event_type = :eventType AND _type = :dataType AND _time_stamp >= :startTime AND _time_stamp <= :endTime")
    @Nullable
    Object c(long j7, long j8, @NotNull String str, @NotNull ContinuationImpl continuationImpl);

    @Update(entity = h.class)
    @Nullable
    Object d(@NotNull h hVar, @NotNull Continuation<? super Unit> continuation);

    @Query("SELECT * FROM _tf_business_data WHERE _type = :dataType AND _report_time_stamp = :reportTime AND _time_stamp < :startTime ORDER BY _time_stamp DESC")
    @Nullable
    Object e(long j7, @NotNull Continuation continuation);

    @Insert
    @Nullable
    Object f(@NotNull h hVar, @NotNull Continuation<? super Long> continuation);
}
