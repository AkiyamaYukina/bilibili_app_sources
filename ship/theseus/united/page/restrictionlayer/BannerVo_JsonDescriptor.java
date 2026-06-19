package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/BannerVo_JsonDescriptor.class */
public final class BannerVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102512a = {new PojoPropertyDescriptor(GameDetailContent.DetailInfo.UI_TYPE_JUMP_LINK, (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("image_link", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("half_image_link", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 4)};

    public BannerVo_JsonDescriptor() {
        super(BannerVo.class, f102512a);
    }

    public final Object constructWith(Object[] objArr) {
        return new BannerVo((String) objArr[0], (String) objArr[1], (String) objArr[2], (ReportVo) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        BannerVo bannerVo = (BannerVo) obj;
        if (i7 == 0) {
            return bannerVo.f102508a;
        }
        if (i7 == 1) {
            return bannerVo.f102509b;
        }
        if (i7 == 2) {
            return bannerVo.f102510c;
        }
        if (i7 != 3) {
            return null;
        }
        return bannerVo.f102511d;
    }
}
