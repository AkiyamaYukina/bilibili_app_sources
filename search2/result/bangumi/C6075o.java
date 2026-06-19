package com.bilibili.search2.result.bangumi;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.supermenu.share.v2.ShareContentProvider;
import com.bilibili.search2.api.SearchBangumiItem;

/* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/o.class */
public final class C6075o implements ShareContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentActivity f87448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6072l f87449b;

    public C6075o(FragmentActivity fragmentActivity, C6072l c6072l) {
        this.f87448a = fragmentActivity;
        this.f87449b = c6072l;
    }

    public final Bundle getShareContent(String str) {
        return com.bilibili.search2.utils.t.c(this.f87448a, str, (SearchBangumiItem) this.f87449b.getData());
    }
}
