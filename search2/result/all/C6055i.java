package com.bilibili.search2.result.all;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.search2.result.all.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/i.class */
@StabilityInferred(parameters = 0)
public final class C6055i implements ReadWriteProperty<Object, Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Long f87292a;

    @NotNull
    public final Long a() {
        Long l7 = this.f87292a;
        return Long.valueOf(l7 != null ? l7.longValue() : 0L);
    }

    public final void b(long j7) {
        Long l7 = this.f87292a;
        if (l7 == null || l7.longValue() == 0) {
            this.f87292a = Long.valueOf(j7);
        } else {
            BLog.d(C6055i.class.getSimpleName(), "setValue abort");
        }
    }

    public final /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return a();
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
        b(((Number) obj2).longValue());
    }
}
