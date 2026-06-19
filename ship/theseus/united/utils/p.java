package com.bilibili.ship.theseus.united.utils;

import androidx.room.RoomDatabase;
import com.bilibili.base.util.NumberFormat;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/p.class */
public final class p {
    @NotNull
    public static final String a(long j7) {
        Duration.Companion companion = Duration.Companion;
        Duration.plus-LRDsOJo(j7, DurationKt.toDuration(RoomDatabase.MAX_BIND_PARAMETER_CNT, DurationUnit.MILLISECONDS));
        return NumberFormat.formatPlayTime(Duration.getInWholeMilliseconds-impl(j7), false, false);
    }
}
