package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.lib.sharewrapper.basic.BiliExtraBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvInvitationActivityBackgroundVo_JsonDescriptor.class */
public final class OgvInvitationActivityBackgroundVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91455a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("component_id", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("bg_img", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("rule_link", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("face", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor5 = new PojoPropertyDescriptor("title", (String[]) null, OgvActivityTextVo.class, (Class) null, 5);
        Class cls = Integer.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor6 = new PojoPropertyDescriptor("used_times", (String[]) null, cls, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor7 = new PojoPropertyDescriptor("max_times", (String[]) null, cls, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor8 = new PojoPropertyDescriptor("countdown_cost", (String[]) null, cls, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor9 = new PojoPropertyDescriptor("countdown_duration", (String[]) null, cls, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor10 = new PojoPropertyDescriptor("share_link", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor11 = new PojoPropertyDescriptor(BiliExtraBuilder.SHARE_TITLE, (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor12 = new PojoPropertyDescriptor("share_subtitle", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor13 = new PojoPropertyDescriptor("share_image", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor14 = new PojoPropertyDescriptor("invitee_limit", (String[]) null, cls, (Class) null, 5);
        Class cls2 = Boolean.TYPE;
        f91455a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, pojoPropertyDescriptor5, pojoPropertyDescriptor6, pojoPropertyDescriptor7, pojoPropertyDescriptor8, pojoPropertyDescriptor9, pojoPropertyDescriptor10, pojoPropertyDescriptor11, pojoPropertyDescriptor12, pojoPropertyDescriptor13, pojoPropertyDescriptor14, new PojoPropertyDescriptor("qq_share_type", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("wechat_share_type", (String[]) null, cls2, (Class) null, 5)};
    }

    public OgvInvitationActivityBackgroundVo_JsonDescriptor() {
        super(OgvInvitationActivityBackgroundVo.class, f91455a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        OgvActivityTextVo ogvActivityTextVo = (OgvActivityTextVo) objArr[4];
        Integer num = (Integer) objArr[5];
        int iIntValue = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[6];
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Integer num3 = (Integer) objArr[7];
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        Integer num4 = (Integer) objArr[8];
        int iIntValue4 = num4 == null ? 0 : num4.intValue();
        String str5 = (String) objArr[9];
        String str6 = (String) objArr[10];
        String str7 = (String) objArr[11];
        String str8 = (String) objArr[12];
        Integer num5 = (Integer) objArr[13];
        int iIntValue5 = num5 == null ? 0 : num5.intValue();
        Boolean bool = (Boolean) objArr[14];
        boolean zBooleanValue2 = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[15];
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        }
        return new OgvInvitationActivityBackgroundVo(str, str2, str3, str4, ogvActivityTextVo, iIntValue, iIntValue2, iIntValue3, iIntValue4, str5, str6, str7, str8, iIntValue5, zBooleanValue2, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        boolean zD;
        OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVo = (OgvInvitationActivityBackgroundVo) obj;
        switch (i7) {
            case 0:
                return ogvInvitationActivityBackgroundVo.c();
            case 1:
                return ogvInvitationActivityBackgroundVo.b();
            case 2:
                return ogvInvitationActivityBackgroundVo.f();
            case 3:
                return ogvInvitationActivityBackgroundVo.a();
            case 4:
                return ogvInvitationActivityBackgroundVo.f91444e;
            case 5:
                return Integer.valueOf(ogvInvitationActivityBackgroundVo.f91445f);
            case 6:
                return Integer.valueOf(ogvInvitationActivityBackgroundVo.f91446g);
            case 7:
                return Integer.valueOf(ogvInvitationActivityBackgroundVo.h);
            case 8:
                return Integer.valueOf(ogvInvitationActivityBackgroundVo.f91447i);
            case 9:
                return ogvInvitationActivityBackgroundVo.f91448j;
            case 10:
                return ogvInvitationActivityBackgroundVo.f91449k;
            case 11:
                return ogvInvitationActivityBackgroundVo.f91450l;
            case 12:
                return ogvInvitationActivityBackgroundVo.f91451m;
            case 13:
                return Integer.valueOf(ogvInvitationActivityBackgroundVo.f91452n);
            case 14:
                zD = ogvInvitationActivityBackgroundVo.d();
                break;
            case 15:
                zD = ogvInvitationActivityBackgroundVo.e();
                break;
            default:
                return null;
        }
        return Boolean.valueOf(zD);
    }
}
