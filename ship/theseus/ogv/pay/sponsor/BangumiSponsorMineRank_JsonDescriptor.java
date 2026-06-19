package com.bilibili.ship.theseus.ogv.pay.sponsor;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/BangumiSponsorMineRank_JsonDescriptor.class */
public final class BangumiSponsorMineRank_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94207a = {new PojoPropertyDescriptor("count", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor(EditCustomizeSticker.TAG_RANK, (String[]) null, Integer.TYPE, (Class) null, 1)};

    public BangumiSponsorMineRank_JsonDescriptor() {
        super(BangumiSponsorMineRank.class, f94207a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        String str = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new BangumiSponsorMineRank(str, iIntValue);
    }

    public final Object get(Object obj, int i7) {
        BangumiSponsorMineRank bangumiSponsorMineRank = (BangumiSponsorMineRank) obj;
        if (i7 == 0) {
            return bangumiSponsorMineRank.f94205a;
        }
        if (i7 != 1) {
            return null;
        }
        return Integer.valueOf(bangumiSponsorMineRank.f94206b);
    }
}
