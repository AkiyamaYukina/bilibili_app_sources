package com.bilibili.search2.result.holder.comic;

import android.os.Bundle;
import com.bilibili.app.comm.supermenu.share.v2.ShareContentProvider;
import com.bilibili.search2.api.SearchComicItem;
import com.bilibili.search2.utils.t;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/m.class */
public final class m implements ShareContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f88110a;

    public m(k kVar) {
        this.f88110a = kVar;
    }

    public final Bundle getShareContent(String str) {
        return t.a(str, (SearchComicItem) this.f88110a.getData());
    }
}
