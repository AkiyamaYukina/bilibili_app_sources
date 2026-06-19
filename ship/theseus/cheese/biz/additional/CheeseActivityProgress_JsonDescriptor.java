package com.bilibili.ship.theseus.cheese.biz.additional;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/additional/CheeseActivityProgress_JsonDescriptor.class */
public final class CheeseActivityProgress_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f88990a = {new PojoPropertyDescriptor("complete_query_interval", (String[]) null, Long.TYPE, (Class) null, 7), new PojoPropertyDescriptor("complete_activity_msg", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("view_progress_msg", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("complete_notified", (String[]) null, Boolean.TYPE, (Class) null, 7), new PojoPropertyDescriptor("start_activity_msg", (String[]) null, String.class, (Class) null, 7)};

    public CheeseActivityProgress_JsonDescriptor() {
        super(CheeseActivityProgress.class, f88990a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Long l7 = (Long) obj;
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        String str = (String) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        String str2 = (String) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        Boolean bool = (Boolean) obj4;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        Object obj5 = objArr[4];
        return new CheeseActivityProgress(str, obj5 == null ? i10 | 16 : i10, jLongValue, str2, zBooleanValue, (String) obj5);
    }

    public final Object get(Object obj, int i7) {
        CheeseActivityProgress cheeseActivityProgress = (CheeseActivityProgress) obj;
        if (i7 == 0) {
            return Long.valueOf(cheeseActivityProgress.c());
        }
        if (i7 == 1) {
            return cheeseActivityProgress.a();
        }
        if (i7 == 2) {
            return cheeseActivityProgress.e();
        }
        if (i7 == 3) {
            return Boolean.valueOf(cheeseActivityProgress.b());
        }
        if (i7 != 4) {
            return null;
        }
        return cheeseActivityProgress.d();
    }
}
