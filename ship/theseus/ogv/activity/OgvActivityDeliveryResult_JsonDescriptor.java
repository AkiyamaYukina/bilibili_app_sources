package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityDeliveryResult;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityDeliveryResult_JsonDescriptor.class */
public final class OgvActivityDeliveryResult_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91360a = {new PojoPropertyDescriptor("independent_win", (String[]) null, OgvActivityDialogVo.class, (Class) null, 0), new PojoPropertyDescriptor("action_results", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 1), new PojoPropertyDescriptor("play_view_toast", (String[]) null, OgvActivityDeliveryResult.PlayAreaToast.class, (Class) null, 0), new PojoPropertyDescriptor("after_action", (String[]) null, OgvActivityDeliveryResult.Action.class, (Class) null, 4)};

    public OgvActivityDeliveryResult_JsonDescriptor() {
        super(OgvActivityDeliveryResult.class, f91360a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvActivityDeliveryResult((OgvActivityDialogVo) objArr[0], (Map) objArr[1], (OgvActivityDeliveryResult.PlayAreaToast) objArr[2], (OgvActivityDeliveryResult.Action) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        OgvActivityDeliveryResult ogvActivityDeliveryResult = (OgvActivityDeliveryResult) obj;
        if (i7 == 0) {
            return ogvActivityDeliveryResult.f91345a;
        }
        if (i7 == 1) {
            return ogvActivityDeliveryResult.f91346b;
        }
        if (i7 == 2) {
            return ogvActivityDeliveryResult.f91347c;
        }
        if (i7 != 3) {
            return null;
        }
        return ogvActivityDeliveryResult.a();
    }
}
