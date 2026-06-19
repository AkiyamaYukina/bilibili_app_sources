package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvInvitationActivityGuestVo_JsonDescriptor.class */
public final class OgvInvitationActivityGuestVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91467a = {new PojoPropertyDescriptor("component_id", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("bg_img", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("face", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("inviter_face", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, OgvActivityTextVo.class, (Class) null, 5)};

    public OgvInvitationActivityGuestVo_JsonDescriptor() {
        super(OgvInvitationActivityGuestVo.class, f91467a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvInvitationActivityGuestVo((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (OgvActivityTextVo) objArr[4]);
    }

    public final Object get(Object obj, int i7) {
        OgvInvitationActivityGuestVo ogvInvitationActivityGuestVo = (OgvInvitationActivityGuestVo) obj;
        if (i7 == 0) {
            return ogvInvitationActivityGuestVo.f91462a;
        }
        if (i7 == 1) {
            return ogvInvitationActivityGuestVo.b();
        }
        if (i7 == 2) {
            return ogvInvitationActivityGuestVo.a();
        }
        if (i7 == 3) {
            return ogvInvitationActivityGuestVo.c();
        }
        if (i7 != 4) {
            return null;
        }
        return ogvInvitationActivityGuestVo.f91466e;
    }
}
