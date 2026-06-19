package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.RelatedCourses;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/RelatedCourses_JsonDescriptor.class */
public final class RelatedCourses_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f89680a = {new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("items", (String[]) null, Types.parameterizedType(List.class, new Type[]{RelatedCourses.Item.class}), (Class) null, 21)};

    public RelatedCourses_JsonDescriptor() {
        super(RelatedCourses.class, f89680a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new RelatedCourses(l7 == null ? 0L : l7.longValue(), (List) objArr[2], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        RelatedCourses relatedCourses = (RelatedCourses) obj;
        if (i7 == 0) {
            return Long.valueOf(relatedCourses.f89654a);
        }
        if (i7 == 1) {
            return relatedCourses.f89655b;
        }
        if (i7 != 2) {
            return null;
        }
        return relatedCourses.f89656c;
    }
}
