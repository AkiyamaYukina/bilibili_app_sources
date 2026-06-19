package com.bilibili.ogv.misc.follow.api.entity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/Progress_JsonDescriptor.class */
public final class Progress_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69150a;

    static {
        Class cls = Long.TYPE;
        f69150a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("last_ep_id", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("last_time", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("index_show", (String[]) null, String.class, (Class) null, 6)};
    }

    public Progress_JsonDescriptor() {
        super(Progress.class, f69150a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        Long l7 = (Long) obj;
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Long l8 = (Long) obj2;
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        return new Progress(i9, jLongValue, jLongValue2, (String) obj3);
    }

    public final Object get(Object obj, int i7) {
        long jB;
        Progress progress = (Progress) obj;
        if (i7 == 0) {
            jB = progress.b();
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                return progress.a();
            }
            jB = progress.c();
        }
        return Long.valueOf(jB);
    }
}
