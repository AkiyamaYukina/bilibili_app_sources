package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityDialogVo;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityDialogVo_JsonDescriptor.class */
public final class OgvActivityDialogVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91377a = {new PojoPropertyDescriptor("win_id", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("bg_img", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("login", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("action", (String[]) null, ActivityDialogActionType.class, (Class) null, 0), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 3), new PojoPropertyDescriptor("showTime", (String[]) null, ActivityDialogShowOccasion.class, (Class) null, 7), new PojoPropertyDescriptor("function", (String[]) null, OgvActivityDialogVo.Entry.class, (Class) null, 0), new PojoPropertyDescriptor("rule", (String[]) null, OgvActivityDialogVo.Entry.class, (Class) null, 0), new PojoPropertyDescriptor("closeType", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("conditions", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 1)};

    public OgvActivityDialogVo_JsonDescriptor() {
        super(OgvActivityDialogVo.class, f91377a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Boolean bool = (Boolean) objArr[2];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        ActivityDialogActionType activityDialogActionType = (ActivityDialogActionType) objArr[3];
        String str3 = (String) objArr[4];
        Object obj = objArr[5];
        if (obj == null) {
            i7 = 32;
        }
        Map map = (Map) obj;
        Object obj2 = objArr[6];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 64;
        }
        return new OgvActivityDialogVo(str, str2, zBooleanValue, activityDialogActionType, str3, map, (ActivityDialogShowOccasion) obj2, (OgvActivityDialogVo.Entry) objArr[7], (OgvActivityDialogVo.Entry) objArr[8], (String) objArr[9], (Map) objArr[10], i8);
    }

    public final Object get(Object obj, int i7) {
        OgvActivityDialogVo ogvActivityDialogVo = (OgvActivityDialogVo) obj;
        switch (i7) {
            case 0:
                return ogvActivityDialogVo.a();
            case 1:
                return ogvActivityDialogVo.b();
            case 2:
                return Boolean.valueOf(ogvActivityDialogVo.getNeedLogin());
            case 3:
                return ogvActivityDialogVo.f91365d;
            case 4:
                return ogvActivityDialogVo.getLink();
            case 5:
                return ogvActivityDialogVo.f91367f;
            case 6:
                return ogvActivityDialogVo.c();
            case 7:
                return ogvActivityDialogVo.h;
            case 8:
                return ogvActivityDialogVo.f91369i;
            case 9:
                return ogvActivityDialogVo.f91370j;
            case 10:
                return ogvActivityDialogVo.f91371k;
            default:
                return null;
        }
    }
}
