package com.bilibili.ogvcommon.play.resolver;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.infra.gson.DurationFromMillisTypeAdapter;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/SeasonWatchProgress_JsonDescriptor.class */
public final class SeasonWatchProgress_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73227a;

    static {
        Class cls = Long.TYPE;
        f73227a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("lastEpId", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("lastEpIndex", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_PROGRESS, (String[]) null, Duration.class, DurationFromMillisTypeAdapter.class, 9), new PojoPropertyDescriptor("lastPlayedCid", (String[]) null, cls, (Class) null, 1)};
    }

    public SeasonWatchProgress_JsonDescriptor() {
        super(SeasonWatchProgress.class, f73227a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        String str = (String) objArr[1];
        long j7 = ((Duration) objArr[2]).unbox-impl();
        Long l8 = (Long) objArr[3];
        return new SeasonWatchProgress(jLongValue, str, j7, l8 == null ? 0L : l8.longValue());
    }

    public final Object get(Object obj, int i7) {
        SeasonWatchProgress seasonWatchProgress = (SeasonWatchProgress) obj;
        if (i7 == 0) {
            return Long.valueOf(seasonWatchProgress.f73223a);
        }
        if (i7 == 1) {
            return seasonWatchProgress.f73224b;
        }
        if (i7 == 2) {
            return Duration.box-impl(seasonWatchProgress.f73225c);
        }
        if (i7 != 3) {
            return null;
        }
        return Long.valueOf(seasonWatchProgress.f73226d);
    }
}
