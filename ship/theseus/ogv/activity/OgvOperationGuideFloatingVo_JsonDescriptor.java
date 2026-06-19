package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityDeliveryResult;
import com.bilibili.ship.theseus.ogv.activity.OgvOperationGuideFloatingVo;
import com.bilibili.ship.theseus.ogv.intro.limitedtimefree.LimitedTimeFreeImageInfo;
import com.bilibili.ship.theseus.ogv.intro.limitedtimefree.LimitedTimeFreeImages;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvOperationGuideFloatingVo_JsonDescriptor.class */
public final class OgvOperationGuideFloatingVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91493a = {new PojoPropertyDescriptor("win_id", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("images", (String[]) null, LimitedTimeFreeImages.class, (Class) null, 1), new PojoPropertyDescriptor("countdown", (String[]) null, OgvOperationGuideFloatingVo.Countdown.class, (Class) null, 0), new PojoPropertyDescriptor("closeType", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("img_title", (String[]) null, LimitedTimeFreeImageInfo.class, (Class) null, 0), new PojoPropertyDescriptor("button", (String[]) null, OgvActivityDeliveryResult.Button.class, (Class) null, 1), new PojoPropertyDescriptor("login", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("action", (String[]) null, ActivityDialogActionType.class, (Class) null, 0), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 3), new PojoPropertyDescriptor("showTime", (String[]) null, ActivityDialogShowOccasion.class, (Class) null, 7)};

    public OgvOperationGuideFloatingVo_JsonDescriptor() {
        super(OgvOperationGuideFloatingVo.class, f91493a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        LimitedTimeFreeImages limitedTimeFreeImages = (LimitedTimeFreeImages) objArr[1];
        OgvOperationGuideFloatingVo.Countdown countdown = (OgvOperationGuideFloatingVo.Countdown) objArr[2];
        String str2 = (String) objArr[3];
        LimitedTimeFreeImageInfo limitedTimeFreeImageInfo = (LimitedTimeFreeImageInfo) objArr[4];
        OgvActivityDeliveryResult.Button button = (OgvActivityDeliveryResult.Button) objArr[5];
        Boolean bool = (Boolean) objArr[6];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        ActivityDialogActionType activityDialogActionType = (ActivityDialogActionType) objArr[7];
        Object obj = objArr[8];
        if (obj == null) {
            i7 = 256;
        }
        Map map = (Map) obj;
        Object obj2 = objArr[9];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 512;
        }
        return new OgvOperationGuideFloatingVo(str, limitedTimeFreeImages, countdown, str2, limitedTimeFreeImageInfo, button, zBooleanValue, activityDialogActionType, map, (ActivityDialogShowOccasion) obj2, i8);
    }

    public final Object get(Object obj, int i7) {
        OgvOperationGuideFloatingVo ogvOperationGuideFloatingVo = (OgvOperationGuideFloatingVo) obj;
        switch (i7) {
            case 0:
                return ogvOperationGuideFloatingVo.a();
            case 1:
                return ogvOperationGuideFloatingVo.f91482b;
            case 2:
                return ogvOperationGuideFloatingVo.f91483c;
            case 3:
                return ogvOperationGuideFloatingVo.f91484d;
            case 4:
                return ogvOperationGuideFloatingVo.f91485e;
            case 5:
                return ogvOperationGuideFloatingVo.f91486f;
            case 6:
                return Boolean.valueOf(ogvOperationGuideFloatingVo.getNeedLogin());
            case 7:
                return ogvOperationGuideFloatingVo.h;
            case 8:
                return ogvOperationGuideFloatingVo.f91488i;
            case 9:
                return ogvOperationGuideFloatingVo.b();
            default:
                return null;
        }
    }
}
