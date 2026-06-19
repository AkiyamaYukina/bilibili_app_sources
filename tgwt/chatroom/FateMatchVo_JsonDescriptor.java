package com.bilibili.tgwt.chatroom;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/FateMatchVo_JsonDescriptor.class */
public final class FateMatchVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110957a;

    static {
        Class cls = Long.TYPE;
        f110957a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("delay", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("timeout", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("match_id", (String[]) null, String.class, (Class) null, 5)};
    }

    public FateMatchVo_JsonDescriptor() {
        super(FateMatchVo.class, f110957a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Long l8 = (Long) objArr[1];
        return new FateMatchVo(jLongValue, l8 == null ? 0L : l8.longValue(), (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        long jA;
        FateMatchVo fateMatchVo = (FateMatchVo) obj;
        if (i7 == 0) {
            jA = fateMatchVo.a();
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    return null;
                }
                return fateMatchVo.b();
            }
            jA = fateMatchVo.c();
        }
        return Long.valueOf(jA);
    }
}
