package com.bilibili.ogv.pub.reserve;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/f.class */
@Dao
public interface f {
    @Query("SELECT * FROM vip_reserve_cache")
    @NotNull
    List<l> a();

    @Delete
    void b(@NotNull List<l> list);

    @Insert(onConflict = 1)
    void c(@NotNull l lVar);

    @Query("SELECT * FROM vip_reserve_cache WHERE ep_id=:epId")
    @Nullable
    List<l> d(long j7);

    @Update
    void e(@NotNull List<l> list);

    @Query("SELECT * FROM vip_reserve_cache")
    @NotNull
    List<l> f();

    @Query("SELECT * FROM vip_reserve_cache WHERE is_reserve=:isReverse")
    @NotNull
    List g();

    @Query("SELECT * FROM vip_reserve_cache WHERE is_reserve=:isReverse ORDER BY CASE WHEN :isAsc = 1 THEN pub_time END ASC,CASE WHEN :isAsc = 0 THEN pub_time END DESC")
    @NotNull
    List h(boolean z6);

    @Query("SELECT * FROM vip_reserve_cache")
    @NotNull
    FlowUtil$createFlow$$inlined$map$1 i();
}
