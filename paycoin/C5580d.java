package com.bilibili.paycoin;

import androidx.activity.ComponentActivity;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.riskcontrol.IActionValidateResult;
import dq0.d;

/* JADX INFO: renamed from: com.bilibili.paycoin.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/d.class */
public final class C5580d implements IActionValidateResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5579c f74769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f74770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f74771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f74772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f74773e;

    /* JADX INFO: renamed from: com.bilibili.paycoin.d$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/d$a.class */
    public static final class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f74774a;

        public a(e eVar) {
            this.f74774a = eVar;
        }

        @Override // dq0.d.a
        public final void a(String str, String str2, String str3, boolean z6, boolean z7) {
            e eVar = this.f74774a;
            C5579c.b(eVar.f74775a, z6, z7, str, str2, eVar.f74776b.f74805b, eVar.f74777c, eVar.f74778d);
        }

        @Override // dq0.d.a
        public final boolean isCancel() {
            ComponentActivity componentActivity = this.f74774a.f74775a.f74761a;
            boolean z6 = true;
            if (componentActivity != null) {
                z6 = componentActivity != null && componentActivity.isFinishing();
            }
            return z6;
        }

        @Override // dq0.d.a
        public final void onRequestFailed(Throwable th) {
            e eVar = this.f74774a;
            C5579c.a(eVar.f74775a, eVar.f74777c, th, eVar.f74778d);
        }
    }

    public C5580d(C5579c c5579c, int i7, boolean z6, m mVar, e eVar) {
        this.f74769a = c5579c;
        this.f74770b = i7;
        this.f74771c = z6;
        this.f74772d = mVar;
        this.f74773e = eVar;
    }

    @Override // com.bilibili.lib.riskcontrol.IActionValidateResult
    public final void onBlock(String str) {
        ToastHelper.showToast(this.f74769a.f74761a, str, 0, 17);
    }

    @Override // com.bilibili.lib.riskcontrol.IActionValidateResult
    public final void onPass(String str) {
        a aVar = new a(this.f74773e);
        this.f74769a.c(this.f74770b, this.f74771c, str, this.f74772d, aVar);
    }
}
