package com.bilibili.biligame.api.bean.gamedetail;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameSign_JsonDescriptor.class */
public final class GameSign_JsonDescriptor extends PojoClassDescriptor {
    private static final PojoPropertyDescriptor[] properties = createProperties();

    public GameSign_JsonDescriptor() {
        super(GameSign.class, properties);
    }

    private static PojoPropertyDescriptor[] createProperties() {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("activity_id", (String[]) null, String.class, (Class) null, 6);
        Class cls = Long.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("start_time", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("end_time", (String[]) null, cls, (Class) null, 7);
        Class cls2 = Integer.TYPE;
        return new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, new PojoPropertyDescriptor("activity_type", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("activity_status", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("game_base_id", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("max_sign_times", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("sign_task_info_list", (String[]) null, Types.parameterizedType(List.class, new Type[]{SignTaskInfo.class}), (Class) null, 22), new PojoPropertyDescriptor("user_sign_info", (String[]) null, UserSignInfo.class, (Class) null, 6)};
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
        long jLongValue = 0;
        long jLongValue2 = l7 == null ? 0L : l7.longValue();
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        Long l8 = (Long) obj3;
        if (l8 != null) {
            jLongValue = l8.longValue();
        }
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
        String str2 = (String) obj6;
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        Integer num3 = (Integer) obj7;
        int iIntValue4 = num3 == null ? 0 : num3.intValue();
        Object obj8 = objArr[7];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 128;
        }
        Integer num4 = (Integer) obj8;
        if (num4 != null) {
            iIntValue = num4.intValue();
        }
        Object obj9 = objArr[8];
        int i15 = i14;
        if (obj9 == null) {
            i15 = i14 | 256;
        }
        List list = (List) obj9;
        Object obj10 = objArr[9];
        if (obj10 == null) {
            i15 |= 512;
        }
        return new GameSign(str, jLongValue2, jLongValue, iIntValue2, iIntValue3, str2, iIntValue4, iIntValue, list, (UserSignInfo) obj10, i15, null);
    }

    public Object get(Object obj, int i7) {
        GameSign gameSign = (GameSign) obj;
        switch (i7) {
            case 0:
                return gameSign.getActivityId();
            case 1:
                return Long.valueOf(gameSign.getStartTime());
            case 2:
                return Long.valueOf(gameSign.getEndTime());
            case 3:
                return Integer.valueOf(gameSign.getActivityType());
            case 4:
                return Integer.valueOf(gameSign.getActivityStatus());
            case 5:
                return gameSign.getTitle();
            case 6:
                return Integer.valueOf(gameSign.getGameBaseId());
            case 7:
                return Integer.valueOf(gameSign.getMaxSignTimes());
            case 8:
                return gameSign.getSignTaskInfoList();
            case 9:
                return gameSign.getUserSignInfo();
            default:
                return null;
        }
    }
}
