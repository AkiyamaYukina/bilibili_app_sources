package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityDeliveryResult;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityDeliveryResult_Button_JsonDescriptor.class */
public final class OgvActivityDeliveryResult_Button_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91359a = {new PojoPropertyDescriptor("text", (String[]) null, OgvActivityTextVo.class, (Class) null, 1), new PojoPropertyDescriptor("action", (String[]) null, ActivityDialogActionType.class, (Class) null, 0), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("code", (String[]) null, String.class, (Class) null, 0)};

    public OgvActivityDeliveryResult_Button_JsonDescriptor() {
        super(OgvActivityDeliveryResult.Button.class, f91359a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvActivityDeliveryResult.Button((ActivityDialogActionType) objArr[1], (OgvActivityTextVo) objArr[0], (String) objArr[2], (String) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        OgvActivityDeliveryResult.Button button = (OgvActivityDeliveryResult.Button) obj;
        if (i7 == 0) {
            return button.f91351a;
        }
        if (i7 == 1) {
            return button.f91352b;
        }
        if (i7 == 2) {
            return button.f91353c;
        }
        if (i7 != 3) {
            return null;
        }
        return button.f91354d;
    }
}
