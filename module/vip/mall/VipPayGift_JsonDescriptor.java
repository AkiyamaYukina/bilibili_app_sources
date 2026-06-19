package com.bilibili.module.vip.mall;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPayGift_JsonDescriptor.class */
public final class VipPayGift_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f66227a = {new PojoPropertyDescriptor(ThirdPartyExtraBuilder.SHARE_PARAMS_IMAGE_URL, (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("sub_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("prize_id", (String[]) null, String.class, (Class) null, 5)};

    public VipPayGift_JsonDescriptor() {
        super(VipPayGift.class, f66227a);
    }

    public final Object constructWith(Object[] objArr) {
        return new VipPayGift((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        VipPayGift vipPayGift = (VipPayGift) obj;
        if (i7 == 0) {
            return vipPayGift.a();
        }
        if (i7 == 1) {
            return vipPayGift.d();
        }
        if (i7 == 2) {
            return vipPayGift.c();
        }
        if (i7 != 3) {
            return null;
        }
        return vipPayGift.b();
    }
}
