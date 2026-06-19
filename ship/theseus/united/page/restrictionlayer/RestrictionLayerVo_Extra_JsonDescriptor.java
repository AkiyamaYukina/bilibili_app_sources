package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerVo_Extra_JsonDescriptor.class */
public final class RestrictionLayerVo_Extra_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102695a = {new PojoPropertyDescriptor("play_list_info", (String[]) null, PlayListVo.class, (Class) null, 4), new PojoPropertyDescriptor("banner", (String[]) null, BannerVo.class, (Class) null, 4), new PojoPropertyDescriptor("charging_ext", (String[]) null, ChargingExtVo.class, (Class) null, 4), new PojoPropertyDescriptor("qr_code", (String[]) null, QRCode.class, (Class) null, 4)};

    public RestrictionLayerVo_Extra_JsonDescriptor() {
        super(RestrictionLayerVo.Extra.class, f102695a);
    }

    public final Object constructWith(Object[] objArr) {
        return new RestrictionLayerVo.Extra((PlayListVo) objArr[0], (BannerVo) objArr[1], (ChargingExtVo) objArr[2], (QRCode) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        RestrictionLayerVo.Extra extra = (RestrictionLayerVo.Extra) obj;
        if (i7 == 0) {
            return extra.f102683a;
        }
        if (i7 == 1) {
            return extra.f102684b;
        }
        if (i7 == 2) {
            return extra.f102685c;
        }
        if (i7 != 3) {
            return null;
        }
        return extra.f102686d;
    }
}
