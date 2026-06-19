package com.bilibili.ogv.pub.review.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/UserVip_JsonDescriptor.class */
public final class UserVip_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71773a;

    static {
        Class cls = Integer.TYPE;
        f71773a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("vipStatus", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("vipType", (String[]) null, cls, (Class) null, 7)};
    }

    public UserVip_JsonDescriptor() {
        super(UserVip.class, f71773a);
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
        return new UserVip(iIntValue, num2 == null ? 0 : num2.intValue(), i8);
    }

    public final Object get(Object obj, int i7) {
        int i8;
        UserVip userVip = (UserVip) obj;
        if (i7 == 0) {
            i8 = userVip.f71771a;
        } else {
            if (i7 != 1) {
                return null;
            }
            i8 = userVip.f71772b;
        }
        return Integer.valueOf(i8);
    }
}
