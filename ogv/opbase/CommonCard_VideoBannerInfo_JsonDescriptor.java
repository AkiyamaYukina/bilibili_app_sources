package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.opbase.CommonCard;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/CommonCard_VideoBannerInfo_JsonDescriptor.class */
public final class CommonCard_VideoBannerInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69816a = {new PojoPropertyDescriptor("bg_img", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("button_img", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5)};

    public CommonCard_VideoBannerInfo_JsonDescriptor() {
        super(CommonCard.VideoBannerInfo.class, f69816a);
    }

    public final Object constructWith(Object[] objArr) {
        return new CommonCard.VideoBannerInfo((String) objArr[0], (String) objArr[1], (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        CommonCard.VideoBannerInfo videoBannerInfo = (CommonCard.VideoBannerInfo) obj;
        if (i7 == 0) {
            return videoBannerInfo.f69811a;
        }
        if (i7 == 1) {
            return videoBannerInfo.f69812b;
        }
        if (i7 != 2) {
            return null;
        }
        return videoBannerInfo.f69813c;
    }
}
