package com.bilibili.biligame.api.bean.gamedetail;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/UserSignInfo_JsonDescriptor.class */
public final class UserSignInfo_JsonDescriptor extends PojoClassDescriptor {
    private static final PojoPropertyDescriptor[] properties = createProperties();

    public UserSignInfo_JsonDescriptor() {
        super(UserSignInfo.class, properties);
    }

    private static PojoPropertyDescriptor[] createProperties() {
        Class cls = Boolean.TYPE;
        return new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("has_finish_sign_activity", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("signed_today", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("total_sign_count", (String[]) null, Integer.TYPE, (Class) null, 7)};
    }

    public Object constructWith(Object[] objArr) {
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Boolean bool2 = (Boolean) obj2;
        boolean zBooleanValue2 = bool2 == null ? false : bool2.booleanValue();
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        Integer num = (Integer) obj3;
        return new UserSignInfo(zBooleanValue, zBooleanValue2, num == null ? 0 : num.intValue(), i9, null);
    }

    public Object get(Object obj, int i7) {
        UserSignInfo userSignInfo = (UserSignInfo) obj;
        if (i7 == 0) {
            return Boolean.valueOf(userSignInfo.getHasFinishSignActivity());
        }
        if (i7 == 1) {
            return Boolean.valueOf(userSignInfo.getSignedToday());
        }
        if (i7 != 2) {
            return null;
        }
        return Integer.valueOf(userSignInfo.getTotalSignCount());
    }
}
