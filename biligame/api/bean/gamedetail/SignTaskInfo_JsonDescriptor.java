package com.bilibili.biligame.api.bean.gamedetail;

import com.bilibili.biligame.api.BiligameGiftDetail;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/SignTaskInfo_JsonDescriptor.class */
public final class SignTaskInfo_JsonDescriptor extends PojoClassDescriptor {
    private static final PojoPropertyDescriptor[] properties = createProperties();

    public SignTaskInfo_JsonDescriptor() {
        super(SignTaskInfo.class, properties);
    }

    private static PojoPropertyDescriptor[] createProperties() {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("task_id", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("sign_date", (String[]) null, Long.TYPE, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("activity_id", (String[]) null, String.class, (Class) null, 6);
        Class cls = Integer.TYPE;
        return new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, new PojoPropertyDescriptor("complete_status", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("award_grant_status", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("condition_type", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("required_sign_count", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("sign_gift_icon", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("gift_info", (String[]) null, BiligameGiftDetail.class, (Class) null, 6)};
    }

    public Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        String str = (String) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Long l7 = (Long) obj2;
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        String str2 = (String) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        Integer num = (Integer) obj4;
        int iIntValue2 = num == null ? 0 : num.intValue();
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        Integer num2 = (Integer) obj5;
        int iIntValue3 = num2 == null ? 0 : num2.intValue();
        Object obj6 = objArr[5];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 32;
        }
        Integer num3 = (Integer) obj6;
        int iIntValue4 = num3 == null ? 0 : num3.intValue();
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        Integer num4 = (Integer) obj7;
        if (num4 != null) {
            iIntValue = num4.intValue();
        }
        Object obj8 = objArr[7];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 128;
        }
        String str3 = (String) obj8;
        Object obj9 = objArr[8];
        if (obj9 == null) {
            i14 |= 256;
        }
        return new SignTaskInfo(str, jLongValue, str2, iIntValue2, iIntValue3, iIntValue4, iIntValue, str3, (BiligameGiftDetail) obj9, i14, null);
    }

    public Object get(Object obj, int i7) {
        SignTaskInfo signTaskInfo = (SignTaskInfo) obj;
        switch (i7) {
            case 0:
                return signTaskInfo.getTaskId();
            case 1:
                return Long.valueOf(signTaskInfo.getSignDate());
            case 2:
                return signTaskInfo.getActivityId();
            case 3:
                return Integer.valueOf(signTaskInfo.getCompleteStatus());
            case 4:
                return Integer.valueOf(signTaskInfo.getAwardGrantStatus());
            case 5:
                return Integer.valueOf(signTaskInfo.getConditionType());
            case 6:
                return Integer.valueOf(signTaskInfo.getRequiredSignCount());
            case 7:
                return signTaskInfo.getSignGiftIcon();
            case 8:
                return signTaskInfo.getGiftInfo();
            default:
                return null;
        }
    }
}
