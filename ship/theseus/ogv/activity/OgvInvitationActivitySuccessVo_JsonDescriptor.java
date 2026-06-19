package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvInvitationActivitySuccessVo_JsonDescriptor.class */
public final class OgvInvitationActivitySuccessVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91480a = {new PojoPropertyDescriptor("component_id", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("bg_img", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("face", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("invitee_face", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, OgvActivityTextVo.class, (Class) null, 5), new PojoPropertyDescriptor("subtitle", (String[]) null, OgvActivityTextVo.class, (Class) null, 5), new PojoPropertyDescriptor("subtitle_tip", (String[]) null, OgvActivityTextVo.class, (Class) null, 5)};

    public OgvInvitationActivitySuccessVo_JsonDescriptor() {
        super(OgvInvitationActivitySuccessVo.class, f91480a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvInvitationActivitySuccessVo((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (OgvActivityTextVo) objArr[4], (OgvActivityTextVo) objArr[5], (OgvActivityTextVo) objArr[6]);
    }

    public final Object get(Object obj, int i7) {
        OgvInvitationActivitySuccessVo ogvInvitationActivitySuccessVo = (OgvInvitationActivitySuccessVo) obj;
        switch (i7) {
            case 0:
                return ogvInvitationActivitySuccessVo.f91473a;
            case 1:
                return ogvInvitationActivitySuccessVo.b();
            case 2:
                return ogvInvitationActivitySuccessVo.a();
            case 3:
                return ogvInvitationActivitySuccessVo.c();
            case 4:
                return ogvInvitationActivitySuccessVo.f91477e;
            case 5:
                return ogvInvitationActivitySuccessVo.f91478f;
            case 6:
                return ogvInvitationActivitySuccessVo.f91479g;
            default:
                return null;
        }
    }
}
