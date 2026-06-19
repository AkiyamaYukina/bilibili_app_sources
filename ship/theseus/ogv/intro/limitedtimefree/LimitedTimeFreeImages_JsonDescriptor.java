package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/LimitedTimeFreeImages_JsonDescriptor.class */
public final class LimitedTimeFreeImages_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93228a = {new PojoPropertyDescriptor("code", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("url", (String[]) null, Types.parameterizedType(List.class, new Type[]{String.class}), (Class) null, 23)};

    public LimitedTimeFreeImages_JsonDescriptor() {
        super(LimitedTimeFreeImages.class, f93228a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        Object obj = objArr[1];
        if (obj == null) {
            i7 = 2;
        }
        return new LimitedTimeFreeImages(i7, str, (List) obj);
    }

    public final Object get(Object obj, int i7) {
        LimitedTimeFreeImages limitedTimeFreeImages = (LimitedTimeFreeImages) obj;
        if (i7 == 0) {
            return limitedTimeFreeImages.f93226a;
        }
        if (i7 != 1) {
            return null;
        }
        return limitedTimeFreeImages.a();
    }
}
