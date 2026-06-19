package com.bilibili.paycoin;

import androidx.activity.ComponentActivity;
import com.bilibili.lib.riskcontrol.ActionValidateHelper;
import dq0.d;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/B.class */
public final class B implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.playerbizcommonv2.widget.coin.c f74703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<ComponentActivity> f74704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f74705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d.b f74706d;

    public B(com.bilibili.playerbizcommonv2.widget.coin.c cVar, WeakReference weakReference, A a7, d.b bVar) {
        this.f74703a = cVar;
        this.f74704b = weakReference;
        this.f74705c = a7;
        this.f74706d = bVar;
    }

    @Override // dq0.d.a
    public final void a(String str, String str2, String str3, boolean z6, boolean z7) {
        com.bilibili.playerbizcommonv2.widget.coin.c cVar = this.f74703a;
        if (str3 == null || str3.length() == 0) {
            cVar.a(str, str2, null, z6, z7);
            return;
        }
        ComponentActivity componentActivity = this.f74704b.get();
        if (componentActivity == null || componentActivity.isFinishing() || componentActivity.isDestroyed()) {
            return;
        }
        D d7 = new D(cVar);
        new ActionValidateHelper().checkAction(componentActivity, str3, new C(componentActivity, this.f74705c, this.f74706d, d7));
    }

    @Override // dq0.d.a
    public final boolean isCancel() {
        return this.f74703a.isCancel();
    }

    @Override // dq0.d.a
    public final void onRequestFailed(Throwable th) {
        this.f74703a.onRequestFailed(th);
    }

    @Override // dq0.d.a
    public final void onResponseIllegal() {
    }
}
