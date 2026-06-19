package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6081b;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/n.class */
public final class C6093n extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6081b f89747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f89749c;

    public C6093n(C6081b c6081b, String str, Context context) {
        this.f89747a = c6081b;
        this.f89748b = str;
        this.f89749c = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f89747a.f89713b.tryEmit(C6081b.a.C0618b.f89716a);
        if (this.f89748b.length() > 0) {
            BLRouter.routeTo(new RouteRequest.Builder(this.f89748b).build(), this.f89749c);
        }
    }
}
