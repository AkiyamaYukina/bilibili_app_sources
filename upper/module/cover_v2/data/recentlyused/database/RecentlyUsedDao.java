package com.bilibili.upper.module.cover_v2.data.recentlyused.database;

import androidx.annotation.Keep;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/recentlyused/database/RecentlyUsedDao.class */
@Dao
@Keep
public interface RecentlyUsedDao {
    @Query("DELETE FROM recently_used WHERE type = :type AND timestamp < :lastTimestamp")
    int deleteExcessDataByType(int i7, long j7);

    @Query("DELETE FROM recently_used WHERE resource_id in (:resIdList)")
    int deleteRecentlyUsedListByIds(@NotNull List<String> list);

    @Query("DELETE FROM recently_used WHERE type = :type AND resource_id in (:resIdList)")
    int deleteRecentlyUsedListByType(int i7, @NotNull List<String> list);

    @Insert(onConflict = 1)
    @NotNull
    List<Long> insertRecentlyUsedList(@NotNull List<RecentlyUsedEntity> list);

    @Query("SELECT resource_id FROM recently_used")
    @NotNull
    List<String> queryRecentlyUsedIds();

    @Query("SELECT * FROM recently_used WHERE type = :type ORDER BY timestamp DESC LIMIT :limit")
    @NotNull
    List<RecentlyUsedEntity> queryRecentlyUsedListByType(int i7, int i8);
}
