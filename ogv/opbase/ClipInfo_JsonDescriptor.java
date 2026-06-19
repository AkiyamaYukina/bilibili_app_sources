package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.infra.gson.DurationFromSecondsTypeAdapter;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/ClipInfo_JsonDescriptor.class */
public final class ClipInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69693a = {new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("start", (String[]) null, Duration.class, DurationFromSecondsTypeAdapter.class, 13), new PojoPropertyDescriptor("end", (String[]) null, Duration.class, DurationFromSecondsTypeAdapter.class, 13)};

    public ClipInfo_JsonDescriptor() {
        super(ClipInfo.class, f69693a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new ClipInfo(l7 == null ? 0L : l7.longValue(), ((Duration) objArr[1]).unbox-impl(), ((Duration) objArr[2]).unbox-impl());
    }

    public final Object get(Object obj, int i7) {
        ClipInfo clipInfo = (ClipInfo) obj;
        if (i7 == 0) {
            return Long.valueOf(clipInfo.f69690a);
        }
        if (i7 == 1) {
            return Duration.box-impl(clipInfo.f69691b);
        }
        if (i7 != 2) {
            return null;
        }
        return Duration.box-impl(clipInfo.f69692c);
    }
}
