package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.RelatedCoursesDetails;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/RelatedCoursesDetails_JsonDescriptor.class */
public final class RelatedCoursesDetails_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f89677a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("combine_list", (String[]) null, Types.parameterizedType(List.class, new Type[]{RelatedCoursesDetails.Item.class}), (Class) null, 21)};

    public RelatedCoursesDetails_JsonDescriptor() {
        super(RelatedCoursesDetails.class, f89677a);
    }

    public final Object constructWith(Object[] objArr) {
        return new RelatedCoursesDetails((String) objArr[0], (List) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        RelatedCoursesDetails relatedCoursesDetails = (RelatedCoursesDetails) obj;
        if (i7 == 0) {
            return relatedCoursesDetails.f89661a;
        }
        if (i7 != 1) {
            return null;
        }
        return relatedCoursesDetails.f89662b;
    }
}
