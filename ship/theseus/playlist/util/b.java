package com.bilibili.ship.theseus.playlist.util;

import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.videodownloader.model.OfflinePermissionCode;
import video.biz.offline.base.model.entity.OfflineVideoEntity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/util/b.class */
public final class b implements com.bilibili.videodownloader.model.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f96123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OfflineVideoEntity f96124b;

    public b(OfflineVideoEntity offlineVideoEntity) {
        this.f96124b = offlineVideoEntity;
        this.f96123a = offlineVideoEntity.h();
    }

    public final boolean a() {
        return this.f96123a;
    }

    public final boolean b() {
        if (BiliAccountInfo.Companion.get().isEffectiveVip()) {
            return true;
        }
        long j7 = this.f96124b.p;
        if (j7 == 0 || BiliAccounts.get(FoundationAlias.getFapp()).mid() != j7) {
            return !Bj1.c.a().contains(Integer.valueOf(r0.w));
        }
        return true;
    }

    public final OfflinePermissionCode c() {
        return com.bilibili.videodownloader.model.d.a(this.f96124b.Q);
    }

    public final int version() {
        return this.f96124b.O;
    }
}
