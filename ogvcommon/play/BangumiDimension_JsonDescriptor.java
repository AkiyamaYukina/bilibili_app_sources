package com.bilibili.ogvcommon.play;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/BangumiDimension_JsonDescriptor.class */
public final class BangumiDimension_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73201a;

    static {
        Class cls = Integer.TYPE;
        f73201a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("width", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("height", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("rotate", (String[]) null, Boolean.TYPE, (Class) null, 1)};
    }

    public BangumiDimension_JsonDescriptor() {
        super(BangumiDimension.class, f73201a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Integer num = (Integer) objArr[0];
        int iIntValue = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[1];
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Boolean bool = (Boolean) objArr[2];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new BangumiDimension(iIntValue, iIntValue2, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        BangumiDimension bangumiDimension = (BangumiDimension) obj;
        if (i7 == 0) {
            return Integer.valueOf(bangumiDimension.f73198a);
        }
        if (i7 == 1) {
            return Integer.valueOf(bangumiDimension.f73199b);
        }
        if (i7 != 2) {
            return null;
        }
        return Boolean.valueOf(bangumiDimension.f73200c);
    }
}
