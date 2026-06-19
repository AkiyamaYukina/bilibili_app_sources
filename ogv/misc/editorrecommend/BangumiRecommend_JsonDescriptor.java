package com.bilibili.ogv.misc.editorrecommend;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/editorrecommend/BangumiRecommend_JsonDescriptor.class */
public final class BangumiRecommend_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f68999a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("id", (String[]) null, Integer.TYPE, (Class) null, 3);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("cursor", (String[]) null, Long.TYPE, (Class) null, 3);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 2);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 2);
        PojoPropertyDescriptor pojoPropertyDescriptor5 = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2);
        Class cls = Boolean.TYPE;
        f68999a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, pojoPropertyDescriptor5, new PojoPropertyDescriptor("is_new", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("is_auto", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("wid", (String[]) null, String.class, (Class) null, 2)};
    }

    public BangumiRecommend_JsonDescriptor() {
        super(BangumiRecommend.class, f68999a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiRecommend bangumiRecommend = new BangumiRecommend();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiRecommend.f68991a = ((Integer) obj).intValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumiRecommend.f68992b = ((Long) obj2).longValue();
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            bangumiRecommend.f68993c = (String) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            bangumiRecommend.f68994d = (String) obj4;
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            bangumiRecommend.f68995e = (String) obj5;
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            bangumiRecommend.f68996f = ((Boolean) obj6).booleanValue();
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            bangumiRecommend.f68997g = (String) obj7;
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            bangumiRecommend.h = ((Boolean) obj8).booleanValue();
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            bangumiRecommend.f68998i = (String) obj9;
        }
        return bangumiRecommend;
    }

    public final Object get(Object obj, int i7) {
        BangumiRecommend bangumiRecommend = (BangumiRecommend) obj;
        switch (i7) {
            case 0:
                return Integer.valueOf(bangumiRecommend.f68991a);
            case 1:
                return Long.valueOf(bangumiRecommend.f68992b);
            case 2:
                return bangumiRecommend.f68993c;
            case 3:
                return bangumiRecommend.f68994d;
            case 4:
                return bangumiRecommend.f68995e;
            case 5:
                return Boolean.valueOf(bangumiRecommend.f68996f);
            case 6:
                return bangumiRecommend.f68997g;
            case 7:
                return Boolean.valueOf(bangumiRecommend.h);
            case 8:
                return bangumiRecommend.f68998i;
            default:
                return null;
        }
    }
}
