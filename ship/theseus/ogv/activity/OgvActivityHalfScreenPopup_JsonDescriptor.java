package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityHalfScreenPopup_JsonDescriptor.class */
public final class OgvActivityHalfScreenPopup_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91380a = {new PojoPropertyDescriptor("h5url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("win_id", (String[]) null, String.class, (Class) null, 5)};

    public OgvActivityHalfScreenPopup_JsonDescriptor() {
        super(OgvActivityHalfScreenPopup.class, f91380a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvActivityHalfScreenPopup((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        OgvActivityHalfScreenPopup ogvActivityHalfScreenPopup = (OgvActivityHalfScreenPopup) obj;
        if (i7 == 0) {
            return ogvActivityHalfScreenPopup.b();
        }
        if (i7 != 1) {
            return null;
        }
        return ogvActivityHalfScreenPopup.a();
    }
}
