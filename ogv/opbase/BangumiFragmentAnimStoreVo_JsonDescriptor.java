package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/BangumiFragmentAnimStoreVo_JsonDescriptor.class */
public final class BangumiFragmentAnimStoreVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69676a = {new PojoPropertyDescriptor("firstCurrentTimeMillis", (String[]) null, Long.class, (Class) null, 2), new PojoPropertyDescriptor("showTimeMillis", (String[]) null, Long.class, (Class) null, 2), new PojoPropertyDescriptor("times", (String[]) null, Integer.TYPE, (Class) null, 3)};

    public BangumiFragmentAnimStoreVo_JsonDescriptor() {
        super(BangumiFragmentAnimStoreVo.class, f69676a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiFragmentAnimStoreVo bangumiFragmentAnimStoreVo = new BangumiFragmentAnimStoreVo();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiFragmentAnimStoreVo.f69673a = (Long) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumiFragmentAnimStoreVo.f69674b = (Long) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            bangumiFragmentAnimStoreVo.f69675c = ((Integer) obj3).intValue();
        }
        return bangumiFragmentAnimStoreVo;
    }

    public final Object get(Object obj, int i7) {
        BangumiFragmentAnimStoreVo bangumiFragmentAnimStoreVo = (BangumiFragmentAnimStoreVo) obj;
        if (i7 == 0) {
            return bangumiFragmentAnimStoreVo.f69673a;
        }
        if (i7 == 1) {
            return bangumiFragmentAnimStoreVo.f69674b;
        }
        if (i7 != 2) {
            return null;
        }
        return Integer.valueOf(bangumiFragmentAnimStoreVo.f69675c);
    }
}
