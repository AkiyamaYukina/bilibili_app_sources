package com.bilibili.ogv.pub.sponsor;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/sponsor/BangumiPendant_JsonDescriptor.class */
public final class BangumiPendant_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71786a = {new PojoPropertyDescriptor("pid", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("image", (String[]) null, String.class, (Class) null, 2)};

    public BangumiPendant_JsonDescriptor() {
        super(BangumiPendant.class, f71786a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        String str = (String) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        String str2 = (String) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        return new BangumiPendant(str, str2, (String) obj3, i9);
    }

    public final Object get(Object obj, int i7) {
        BangumiPendant bangumiPendant = (BangumiPendant) obj;
        if (i7 == 0) {
            return bangumiPendant.f71783a;
        }
        if (i7 == 1) {
            return bangumiPendant.f71784b;
        }
        if (i7 != 2) {
            return null;
        }
        return bangumiPendant.f71785c;
    }
}
