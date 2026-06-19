package com.bilibili.ogv.misc.timeline.ui.entity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/entity/BangumiTimeline_JsonDescriptor.class */
public final class BangumiTimeline_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69562a;

    static {
        Class cls = Long.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("season_id", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("square_cover", (String[]) null, String.class, (Class) null, 6);
        Class cls2 = Integer.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor5 = new PojoPropertyDescriptor("published", (String[]) null, cls2, (Class) null, 7);
        Class cls3 = Boolean.TYPE;
        f69562a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, pojoPropertyDescriptor5, new PojoPropertyDescriptor("follow", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("season_status", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("pub_index", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("pub_time", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("pub_index_show", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("pub_ts", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("delay", (String[]) null, cls3, (Class) null, 7), new PojoPropertyDescriptor("delay_id", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("delay_reason", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("delay_index", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("episode_id", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("season_type", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("tags", (String[]) null, Types.parameterizedType(List.class, new Type[]{BangumiTimeline.TimelineTag.class}), (Class) null, 23), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 6)};
    }

    public BangumiTimeline_JsonDescriptor() {
        super(BangumiTimeline.class, f69562a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiTimeline bangumiTimeline = new BangumiTimeline();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiTimeline.f69521a = ((Long) obj).longValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumiTimeline.f69522b = (String) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            bangumiTimeline.i((String) obj3);
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            bangumiTimeline.n((String) obj4);
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            bangumiTimeline.f69525e = ((Integer) obj5).intValue();
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            bangumiTimeline.f69526f = ((Boolean) obj6).booleanValue();
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            bangumiTimeline.f69527g = ((Integer) obj7).intValue();
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            bangumiTimeline.h = (String) obj8;
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            bangumiTimeline.f69528i = (String) obj9;
        }
        Object obj10 = objArr[9];
        if (obj10 != null) {
            bangumiTimeline.f69529j = (String) obj10;
        }
        Object obj11 = objArr[10];
        if (obj11 != null) {
            bangumiTimeline.f69530k = ((Long) obj11).longValue();
        }
        Object obj12 = objArr[11];
        if (obj12 != null) {
            bangumiTimeline.j(((Boolean) obj12).booleanValue());
        }
        Object obj13 = objArr[12];
        if (obj13 != null) {
            bangumiTimeline.f69532m = ((Integer) obj13).intValue();
        }
        Object obj14 = objArr[13];
        if (obj14 != null) {
            bangumiTimeline.f69533n = (String) obj14;
        }
        Object obj15 = objArr[14];
        if (obj15 != null) {
            bangumiTimeline.f69534o = (String) obj15;
        }
        Object obj16 = objArr[15];
        if (obj16 != null) {
            bangumiTimeline.m((String) obj16);
        }
        Object obj17 = objArr[16];
        if (obj17 != null) {
            bangumiTimeline.f69536q = (String) obj17;
        }
        Object obj18 = objArr[17];
        if (obj18 != null) {
            bangumiTimeline.f69537r = ((Integer) obj18).intValue();
        }
        Object obj19 = objArr[18];
        if (obj19 != null) {
            bangumiTimeline.f69538s = (List) obj19;
        }
        Object obj20 = objArr[19];
        if (obj20 != null) {
            bangumiTimeline.f69539t = (Map) obj20;
        }
        return bangumiTimeline;
    }

    public final Object get(Object obj, int i7) {
        BangumiTimeline bangumiTimeline = (BangumiTimeline) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(bangumiTimeline.f69521a);
            case 1:
                return bangumiTimeline.f69522b;
            case 2:
                return bangumiTimeline.a();
            case 3:
                return bangumiTimeline.d();
            case 4:
                return Integer.valueOf(bangumiTimeline.f69525e);
            case 5:
                return Boolean.valueOf(bangumiTimeline.f69526f);
            case 6:
                return Integer.valueOf(bangumiTimeline.f69527g);
            case 7:
                return bangumiTimeline.h;
            case 8:
                return bangumiTimeline.f69528i;
            case 9:
                return bangumiTimeline.f69529j;
            case 10:
                return Long.valueOf(bangumiTimeline.f69530k);
            case 11:
                return Boolean.valueOf(bangumiTimeline.h());
            case 12:
                return Integer.valueOf(bangumiTimeline.f69532m);
            case 13:
                return bangumiTimeline.f69533n;
            case 14:
                return bangumiTimeline.f69534o;
            case 15:
                return bangumiTimeline.b();
            case 16:
                return bangumiTimeline.f69536q;
            case 17:
                return Integer.valueOf(bangumiTimeline.f69537r);
            case 18:
                return bangumiTimeline.f69538s;
            case 19:
                return bangumiTimeline.f69539t;
            default:
                return null;
        }
    }
}
