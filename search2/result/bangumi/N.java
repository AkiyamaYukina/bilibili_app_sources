package com.bilibili.search2.result.bangumi;

import android.os.Bundle;
import com.bilibili.app.comm.supermenu.share.v2.ShareContentProvider;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchOgvChannelItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/N.class */
public final class N implements ShareContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f87356a;

    public N(L l7) {
        this.f87356a = l7;
    }

    public final Bundle getShareContent(String str) {
        BaseSearchItem.H5Share h52;
        L l7 = this.f87356a;
        BaseSearchItem.Share share = ((SearchOgvChannelItem) l7.getData()).getShare();
        return com.bilibili.search2.utils.t.b(str, (share == null || (h52 = share.getH5()) == null) ? null : h52.getOid(), (SearchOgvChannelItem) l7.getData());
    }
}
