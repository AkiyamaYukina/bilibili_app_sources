package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityDeliveryResult;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityDeliveryResult_PlayAreaToast_JsonDescriptor.class */
public final class OgvActivityDeliveryResult_PlayAreaToast_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91361a = {new PojoPropertyDescriptor("text", (String[]) null, OgvActivityTextVo.class, (Class) null, 1), new PojoPropertyDescriptor("button", (String[]) null, OgvActivityDeliveryResult.Button.class, (Class) null, 1), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 1)};

    public OgvActivityDeliveryResult_PlayAreaToast_JsonDescriptor() {
        super(OgvActivityDeliveryResult.PlayAreaToast.class, f91361a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvActivityDeliveryResult.PlayAreaToast((OgvActivityTextVo) objArr[0], (OgvActivityDeliveryResult.Button) objArr[1], (Map) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        OgvActivityDeliveryResult.PlayAreaToast playAreaToast = (OgvActivityDeliveryResult.PlayAreaToast) obj;
        if (i7 == 0) {
            return playAreaToast.f91355a;
        }
        if (i7 == 1) {
            return playAreaToast.f91356b;
        }
        if (i7 != 2) {
            return null;
        }
        return playAreaToast.f91357c;
    }
}
