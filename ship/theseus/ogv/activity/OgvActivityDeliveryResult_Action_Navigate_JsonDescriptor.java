package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityDeliveryResult;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityDeliveryResult_Action_Navigate_JsonDescriptor.class */
public final class OgvActivityDeliveryResult_Action_Navigate_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91358a = {new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 1)};

    public OgvActivityDeliveryResult_Action_Navigate_JsonDescriptor() {
        super(OgvActivityDeliveryResult.Action.Navigate.class, f91358a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvActivityDeliveryResult.Action.Navigate((String) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        OgvActivityDeliveryResult.Action.Navigate navigate = (OgvActivityDeliveryResult.Action.Navigate) obj;
        if (i7 != 0) {
            return null;
        }
        return navigate.f91350a;
    }
}
