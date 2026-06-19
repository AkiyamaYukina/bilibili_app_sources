package com.bilibili.ship.theseus.playlist.util;

import com.bilibili.videodownloader.model.OfflinePermissionCode;
import video.biz.offline.base.model.entity.OfflineVideoEntity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/util/a.class */
public final class a implements com.bilibili.videodownloader.model.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f96121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OfflineVideoEntity f96122b;

    public a(OfflineVideoEntity offlineVideoEntity) {
        this.f96122b = offlineVideoEntity;
        this.f96121a = offlineVideoEntity.h();
    }

    public final boolean a() {
        return this.f96121a;
    }

    public final boolean b() {
        return this.f96122b.Q == 0;
    }

    public final OfflinePermissionCode c() {
        return com.bilibili.videodownloader.model.d.a(this.f96122b.Q);
    }

    public final int version() {
        return this.f96122b.O;
    }
}
