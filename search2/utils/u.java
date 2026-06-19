package com.bilibili.search2.utils;

import com.bilibili.app.comm.list.common.utils.share.IListShare;
import com.bilibili.search2.api.SearchVideoItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/u.class */
public final class u implements IListShare {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f88852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f88853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f88854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f88855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f88856g;
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f88857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f88858j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SearchVideoItem f88859k;

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u(com.bilibili.search2.api.BaseSearchItem.Share r5, com.bilibili.search2.api.SearchVideoItem r6) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.utils.u.<init>(com.bilibili.search2.api.BaseSearchItem$Share, com.bilibili.search2.api.SearchVideoItem):void");
    }

    public final String getAuthor() {
        return this.f88857i;
    }

    public final String getAuthorFace() {
        return this.f88859k.getFace();
    }

    public final long getAvId() {
        return this.f88853d;
    }

    public final String getBvid() {
        return this.f88850a;
    }

    public final String getCover() {
        return this.f88851b;
    }

    public final String getDescription() {
        return this.f88855f;
    }

    public final long getMid() {
        return this.f88852c;
    }

    public final String getPlayNumber() {
        return this.h;
    }

    public final String getShareShortLink() {
        return this.f88854e;
    }

    public final String getShareSubtitle() {
        return this.f88858j;
    }

    public final String getTitle() {
        return this.f88856g;
    }
}
