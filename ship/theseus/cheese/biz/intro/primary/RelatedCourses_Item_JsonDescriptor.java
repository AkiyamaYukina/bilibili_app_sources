package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.RelatedCourses;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/RelatedCourses_Item_JsonDescriptor.class */
public final class RelatedCourses_Item_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f89679a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("season_id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("selected", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5)};

    public RelatedCourses_Item_JsonDescriptor() {
        super(RelatedCourses.Item.class, f89679a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        String str = (String) objArr[0];
        Long l7 = (Long) objArr[1];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Boolean bool = (Boolean) objArr[2];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new RelatedCourses.Item(str, jLongValue, zBooleanValue, (Map) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        RelatedCourses.Item item = (RelatedCourses.Item) obj;
        if (i7 == 0) {
            return item.f89657a;
        }
        if (i7 == 1) {
            return Long.valueOf(item.f89658b);
        }
        if (i7 == 2) {
            return Boolean.valueOf(item.f89659c);
        }
        if (i7 != 3) {
            return null;
        }
        return item.f89660d;
    }
}
