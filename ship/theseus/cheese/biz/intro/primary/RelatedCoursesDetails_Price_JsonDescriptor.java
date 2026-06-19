package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.RelatedCoursesDetails;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/RelatedCoursesDetails_Price_JsonDescriptor.class */
public final class RelatedCoursesDetails_Price_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f89678a = {new PojoPropertyDescriptor("price", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("price_suffix_text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("price_unit", (String[]) null, String.class, (Class) null, 5)};

    public RelatedCoursesDetails_Price_JsonDescriptor() {
        super(RelatedCoursesDetails.Price.class, f89678a);
    }

    public final Object constructWith(Object[] objArr) {
        return new RelatedCoursesDetails.Price((String) objArr[0], (String) objArr[1], (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        RelatedCoursesDetails.Price price = (RelatedCoursesDetails.Price) obj;
        if (i7 == 0) {
            return price.f89673a;
        }
        if (i7 == 1) {
            return price.f89674b;
        }
        if (i7 != 2) {
            return null;
        }
        return price.f89675c;
    }
}
