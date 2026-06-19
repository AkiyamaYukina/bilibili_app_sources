package com.bilibili.pegasus.page;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import tv.danmaku.bili.ui.garb.NftCardDialog;
import tv.danmaku.bili.ui.garb.b0;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/p.class */
public final class C5727p implements eY.e, b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f78431a;

    public /* synthetic */ C5727p(Object obj) {
        this.f78431a = obj;
    }

    public Rect a() {
        C5728q c5728q = (C5728q) this.f78431a;
        Rect rect = c5728q.f78433b;
        RecyclerView recyclerView = c5728q.f78432a;
        rect.set(0, 0, recyclerView.getWidth(), recyclerView.getHeight());
        return c5728q.f78433b;
    }

    public void b(int i7, long j7, long j8) {
        NftCardDialog nftCardDialog = (NftCardDialog) this.f78431a;
        nftCardDialog.dismiss();
        b0 b0Var = nftCardDialog.e;
        if (b0Var != null) {
            b0Var.b(i7, j7, j8);
        }
    }

    public void c() {
        ((NftCardDialog) this.f78431a).dismiss();
    }

    public void d() {
        NftCardDialog nftCardDialog = (NftCardDialog) this.f78431a;
        nftCardDialog.dismiss();
        b0 b0Var = nftCardDialog.e;
        if (b0Var != null) {
            b0Var.d();
        }
    }

    public void e(int i7, long j7, long j8) {
        NftCardDialog nftCardDialog = (NftCardDialog) this.f78431a;
        nftCardDialog.dismiss();
        b0 b0Var = nftCardDialog.e;
        if (b0Var != null) {
            b0Var.e(i7, j7, j8);
        }
    }
}
