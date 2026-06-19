package com.bilibili.ship.theseus.playlist.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/CoinExtra_JsonDescriptor.class */
public final class CoinExtra_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f95199a;

    static {
        Class cls = Integer.TYPE;
        f95199a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("max_num", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("coin_number", (String[]) null, cls, (Class) null, 7)};
    }

    public CoinExtra_JsonDescriptor() {
        super(CoinExtra.class, f95199a);
    }

    public final Object constructWith(Object[] objArr) {
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Integer num = (Integer) obj;
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Integer num2 = (Integer) obj2;
        return new CoinExtra(iIntValue, num2 == null ? 0 : num2.intValue(), i8);
    }

    public final Object get(Object obj, int i7) {
        CoinExtra coinExtra = (CoinExtra) obj;
        if (i7 == 0) {
            return Integer.valueOf(coinExtra.f95197a);
        }
        if (i7 != 1) {
            return null;
        }
        return Integer.valueOf(coinExtra.a());
    }
}
