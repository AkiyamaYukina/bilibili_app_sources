package com.bilibili.ogv.misc.sponsor;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.misc.sponsor.BangumiCategoryIndex;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiCategoryIndex_Bangumi_JsonDescriptor.class */
public final class BangumiCategoryIndex_Bangumi_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69324a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 2);
        Class cls = Integer.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("favorites", (String[]) null, cls, (Class) null, 3);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("is_finish", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("newest_ep_index", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor5 = new PojoPropertyDescriptor("season_id", (String[]) null, String.class, (Class) null, 6);
        Class cls2 = Long.TYPE;
        f69324a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, pojoPropertyDescriptor5, new PojoPropertyDescriptor("pub_time", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("update_time", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("total_count", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("badge", (String[]) null, String.class, (Class) null, 2)};
    }

    public BangumiCategoryIndex_Bangumi_JsonDescriptor() {
        super(BangumiCategoryIndex.Bangumi.class, f69324a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiCategoryIndex.Bangumi bangumi = new BangumiCategoryIndex.Bangumi();
        Object obj = objArr[0];
        if (obj != null) {
            bangumi.f69315a = (String) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumi.f69316b = ((Integer) obj2).intValue();
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            bangumi.f69317c = ((Integer) obj3).intValue();
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            bangumi.f69318d = (String) obj4;
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            bangumi.f69319e = (String) obj5;
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            bangumi.f69320f = ((Long) obj6).longValue();
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            bangumi.f69321g = ((Long) obj7).longValue();
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            bangumi.h = (String) obj8;
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            bangumi.f69322i = (String) obj9;
        }
        Object obj10 = objArr[9];
        if (obj10 != null) {
            bangumi.f69323j = (String) obj10;
        }
        return bangumi;
    }

    public final Object get(Object obj, int i7) {
        BangumiCategoryIndex.Bangumi bangumi = (BangumiCategoryIndex.Bangumi) obj;
        switch (i7) {
            case 0:
                return bangumi.f69315a;
            case 1:
                return Integer.valueOf(bangumi.f69316b);
            case 2:
                return Integer.valueOf(bangumi.f69317c);
            case 3:
                return bangumi.f69318d;
            case 4:
                return bangumi.f69319e;
            case 5:
                return Long.valueOf(bangumi.f69320f);
            case 6:
                return Long.valueOf(bangumi.f69321g);
            case 7:
                return bangumi.h;
            case 8:
                return bangumi.f69322i;
            case 9:
                return bangumi.f69323j;
            default:
                return null;
        }
    }
}
