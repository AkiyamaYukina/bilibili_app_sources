package com.bilibili.paycoin;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.riskcontrol.ActionValidateHelper;
import dq0.d;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/f.class */
public final class f implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5579c f74779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f74780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f74781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC5577a f74782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f74783e;

    public f(C5579c c5579c, m mVar, int i7, InterfaceC5577a interfaceC5577a, boolean z6) {
        this.f74779a = c5579c;
        this.f74780b = mVar;
        this.f74781c = i7;
        this.f74782d = interfaceC5577a;
        this.f74783e = z6;
    }

    @Override // dq0.d.a
    public final void a(String str, String str2, String str3, boolean z6, boolean z7) {
        FragmentActivity fragmentActivityFindFragmentActivityOrNull;
        m mVar = this.f74780b;
        if (str3 == null || StringsKt.isBlank(str3)) {
            C5579c.b(this.f74779a, z6, z7, str, str2, mVar.f74805b, this.f74781c, this.f74782d);
            return;
        }
        C5579c c5579c = this.f74779a;
        int i7 = this.f74781c;
        e eVar = new e(c5579c, mVar, i7, this.f74782d);
        ComponentActivity componentActivity = c5579c.f74761a;
        if (componentActivity == null || (fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(componentActivity)) == null) {
            return;
        }
        new ActionValidateHelper().checkAction(fragmentActivityFindFragmentActivityOrNull, str3, new C5580d(c5579c, i7, this.f74783e, mVar, eVar));
    }

    @Override // dq0.d.a
    public final boolean isCancel() {
        ComponentActivity componentActivity = this.f74779a.f74761a;
        boolean z6 = true;
        if (componentActivity != null) {
            z6 = componentActivity != null && componentActivity.isFinishing();
        }
        return z6;
    }

    @Override // dq0.d.a
    public final void onRequestFailed(Throwable th) {
        C5579c.a(this.f74779a, this.f74781c, th, this.f74782d);
    }
}
