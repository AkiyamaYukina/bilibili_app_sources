package com.bilibili.ogv.community.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/bean/BangumiPraiseTriple_JsonDescriptor.class */
public final class BangumiPraiseTriple_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f67519a;

    static {
        Class cls = Boolean.TYPE;
        f67519a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor(IVideoLikeRouteService.ACTION_LIKE, (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("coin", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("follow", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("coin_number", (String[]) null, Integer.TYPE, (Class) null, 7), new PojoPropertyDescriptor("favorite", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("relation", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("fmid", (String[]) null, Long.TYPE, (Class) null, 7)};
    }

    public BangumiPraiseTriple_JsonDescriptor() {
        super(BangumiPraiseTriple.class, f67519a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiPraiseTriple bangumiPraiseTriple = new BangumiPraiseTriple();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiPraiseTriple.f67512a = ((Boolean) obj).booleanValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumiPraiseTriple.f67513b = ((Boolean) obj2).booleanValue();
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            bangumiPraiseTriple.f67514c = ((Boolean) obj3).booleanValue();
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            bangumiPraiseTriple.f67515d = ((Integer) obj4).intValue();
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            bangumiPraiseTriple.f67516e = ((Boolean) obj5).booleanValue();
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            bangumiPraiseTriple.f67517f = ((Boolean) obj6).booleanValue();
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            bangumiPraiseTriple.f67518g = ((Long) obj7).longValue();
        }
        return bangumiPraiseTriple;
    }

    public final Object get(Object obj, int i7) {
        BangumiPraiseTriple bangumiPraiseTriple = (BangumiPraiseTriple) obj;
        switch (i7) {
            case 0:
                return Boolean.valueOf(bangumiPraiseTriple.f67512a);
            case 1:
                return Boolean.valueOf(bangumiPraiseTriple.f67513b);
            case 2:
                return Boolean.valueOf(bangumiPraiseTriple.f67514c);
            case 3:
                return Integer.valueOf(bangumiPraiseTriple.f67515d);
            case 4:
                return Boolean.valueOf(bangumiPraiseTriple.f67516e);
            case 5:
                return Boolean.valueOf(bangumiPraiseTriple.f67517f);
            case 6:
                return Long.valueOf(bangumiPraiseTriple.f67518g);
            default:
                return null;
        }
    }
}
