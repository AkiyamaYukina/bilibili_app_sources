package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.pub.community.BangumiBadgeInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/PlayListItemVo_JsonDescriptor.class */
public final class PlayListItemVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102621a = {new PojoPropertyDescriptor("season_id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("badge_info", (String[]) null, BangumiBadgeInfo.class, (Class) null, 5)};

    public PlayListItemVo_JsonDescriptor() {
        super(PlayListItemVo.class, f102621a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new PlayListItemVo(l7 == null ? 0L : l7.longValue(), (String) objArr[1], (String) objArr[2], (String) objArr[3], (BangumiBadgeInfo) objArr[4]);
    }

    public final Object get(Object obj, int i7) {
        PlayListItemVo playListItemVo = (PlayListItemVo) obj;
        if (i7 == 0) {
            return Long.valueOf(playListItemVo.f102616a);
        }
        if (i7 == 1) {
            return playListItemVo.f102617b;
        }
        if (i7 == 2) {
            return playListItemVo.f102618c;
        }
        if (i7 == 3) {
            return playListItemVo.f102619d;
        }
        if (i7 != 4) {
            return null;
        }
        return playListItemVo.f102620e;
    }
}
