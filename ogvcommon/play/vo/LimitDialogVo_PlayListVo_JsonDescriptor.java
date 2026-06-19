package com.bilibili.ogvcommon.play.vo;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import com.bilibili.ogvcommon.play.vo.LimitDialogVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/LimitDialogVo_PlayListVo_JsonDescriptor.class */
public final class LimitDialogVo_PlayListVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73324a = {new PojoPropertyDescriptor("season_id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("badge_info", (String[]) null, BangumiBadgeInfo.class, (Class) null, 5)};

    public LimitDialogVo_PlayListVo_JsonDescriptor() {
        super(LimitDialogVo.PlayListVo.class, f73324a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new LimitDialogVo.PlayListVo(l7 == null ? 0L : l7.longValue(), (String) objArr[1], (String) objArr[2], (String) objArr[3], (BangumiBadgeInfo) objArr[4]);
    }

    public final Object get(Object obj, int i7) {
        LimitDialogVo.PlayListVo playListVo = (LimitDialogVo.PlayListVo) obj;
        if (i7 == 0) {
            return Long.valueOf(playListVo.f73316a);
        }
        if (i7 == 1) {
            return playListVo.f73317b;
        }
        if (i7 == 2) {
            return playListVo.f73318c;
        }
        if (i7 == 3) {
            return playListVo.f73319d;
        }
        if (i7 != 4) {
            return null;
        }
        return playListVo.f73320e;
    }
}
