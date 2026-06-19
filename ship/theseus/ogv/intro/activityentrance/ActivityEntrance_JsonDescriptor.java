package com.bilibili.ship.theseus.ogv.intro.activityentrance;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/activityentrance/ActivityEntrance_JsonDescriptor.class */
public final class ActivityEntrance_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92299a = {new PojoPropertyDescriptor("activity_cover", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("activity_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("activity_subtitle", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("word_tag", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("activity_link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("activity_type", (String[]) null, ActivityEntranceType.class, (Class) null, 7), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 1), new PojoPropertyDescriptor("order_report_params", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 7)};

    public ActivityEntrance_JsonDescriptor() {
        super(ActivityEntrance.class, f92299a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        String str5 = (String) objArr[4];
        Object obj = objArr[5];
        if (obj == null) {
            i7 = 32;
        }
        ActivityEntranceType activityEntranceType = (ActivityEntranceType) obj;
        Map map = (Map) objArr[6];
        Object obj2 = objArr[7];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 128;
        }
        return new ActivityEntrance(str, str2, str3, str4, str5, activityEntranceType, map, (Map) obj2, i8);
    }

    public final Object get(Object obj, int i7) {
        ActivityEntrance activityEntrance = (ActivityEntrance) obj;
        switch (i7) {
            case 0:
                return activityEntrance.c();
            case 1:
                return activityEntrance.f();
            case 2:
                return activityEntrance.e();
            case 3:
                return activityEntrance.g();
            case 4:
                return activityEntrance.a();
            case 5:
                return activityEntrance.b();
            case 6:
                return activityEntrance.f92298g;
            case 7:
                return activityEntrance.d();
            default:
                return null;
        }
    }
}
