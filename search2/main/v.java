package com.bilibili.search2.main;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import dagger.hilt.internal.UnsafeCasts;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/v.class */
public final class v implements OnContextAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f86935a;

    public v(w wVar) {
        this.f86935a = wVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        w wVar = this.f86935a;
        if (wVar.f86939E) {
            return;
        }
        wVar.f86939E = true;
        ((InterfaceC6039f) wVar.generatedComponent()).f((BiliMainSearchActivity) UnsafeCasts.unsafeCast(wVar));
    }
}
