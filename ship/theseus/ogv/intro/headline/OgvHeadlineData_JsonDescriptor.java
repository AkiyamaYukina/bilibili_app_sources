package com.bilibili.ship.theseus.ogv.intro.headline;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.ogv.playviewextra.OgvBadgeInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/OgvHeadlineData_JsonDescriptor.class */
public final class OgvHeadlineData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93120a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("badge_info", (String[]) null, OgvBadgeInfo.class, (Class) null, 4), new PojoPropertyDescriptor("is_show_btn_animation", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("title_delivery_button", (String[]) null, DeliveryButton.class, (Class) null, 4), new PojoPropertyDescriptor("channel_redirect_entry_button", (String[]) null, GuideButton.class, (Class) null, 4), new PojoPropertyDescriptor("title_img", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("title_img_night", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("webp_dynamic_pic_title_cycle_num", (String[]) null, Integer.TYPE, (Class) null, 5)};

    public OgvHeadlineData_JsonDescriptor() {
        super(OgvHeadlineData.class, f93120a);
    }

    public final Object constructWith(Object[] objArr) {
        String str = (String) objArr[0];
        OgvBadgeInfo ogvBadgeInfo = (OgvBadgeInfo) objArr[1];
        Boolean bool = (Boolean) objArr[2];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        DeliveryButton deliveryButton = (DeliveryButton) objArr[3];
        GuideButton guideButton = (GuideButton) objArr[4];
        String str2 = (String) objArr[5];
        String str3 = (String) objArr[6];
        Integer num = (Integer) objArr[7];
        return new OgvHeadlineData(str, ogvBadgeInfo, zBooleanValue, deliveryButton, guideButton, str2, str3, num == null ? 0 : num.intValue());
    }

    public final Object get(Object obj, int i7) {
        OgvHeadlineData ogvHeadlineData = (OgvHeadlineData) obj;
        switch (i7) {
            case 0:
                return ogvHeadlineData.f93113a;
            case 1:
                return ogvHeadlineData.f93114b;
            case 2:
                return Boolean.valueOf(ogvHeadlineData.c());
            case 3:
                return ogvHeadlineData.a();
            case 4:
                return ogvHeadlineData.b();
            case 5:
                return ogvHeadlineData.f93118f;
            case 6:
                return ogvHeadlineData.f93119g;
            case 7:
                return Integer.valueOf(ogvHeadlineData.d());
            default:
                return null;
        }
    }
}
