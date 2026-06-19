package com.bilibili.lib.resmanager.core;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/c.class */
@Dao
public interface c {
    @Query("select * from res_cache")
    @NotNull
    List<g> a();

    @Query("delete from res_cache where _file_key in (:keys)")
    void b(@NotNull List<String> list);

    @Insert(onConflict = 1)
    void c(@NotNull List<g> list);
}
