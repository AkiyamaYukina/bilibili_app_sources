package com.bilibili.ogv.misc.timeline.ui.entity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/entity/BangumiTimelineDay_JsonDescriptor.class */
public final class BangumiTimelineDay_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69551a = {new PojoPropertyDescriptor("date", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("date_ts", (String[]) null, Long.TYPE, (Class) null, 7), new PojoPropertyDescriptor("day_of_week", (String[]) null, Integer.TYPE, (Class) null, 7), new PojoPropertyDescriptor("is_today", (String[]) null, Boolean.TYPE, (Class) null, 7), new PojoPropertyDescriptor("day_update_text", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("episodes", (String[]) null, Types.parameterizedType(List.class, new Type[]{BangumiTimeline.class}), (Class) null, 6)};

    public BangumiTimelineDay_JsonDescriptor() {
        super(BangumiTimelineDay.class, f69551a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiTimelineDay bangumiTimelineDay = new BangumiTimelineDay();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiTimelineDay.o((String) obj);
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumiTimelineDay.q(((Long) obj2).longValue());
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            bangumiTimelineDay.r(((Integer) obj3).intValue());
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            bangumiTimelineDay.v(((Boolean) obj4).booleanValue());
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            bangumiTimelineDay.s((String) obj5);
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            bangumiTimelineDay.u((List) obj6);
        }
        return bangumiTimelineDay;
    }

    public final Object get(Object obj, int i7) {
        BangumiTimelineDay bangumiTimelineDay = (BangumiTimelineDay) obj;
        if (i7 == 0) {
            return bangumiTimelineDay.c();
        }
        if (i7 == 1) {
            return Long.valueOf(bangumiTimelineDay.d());
        }
        if (i7 == 2) {
            return Integer.valueOf(bangumiTimelineDay.i());
        }
        if (i7 == 3) {
            return Boolean.valueOf(bangumiTimelineDay.n());
        }
        if (i7 == 4) {
            return bangumiTimelineDay.j();
        }
        if (i7 != 5) {
            return null;
        }
        return bangumiTimelineDay.m();
    }
}
