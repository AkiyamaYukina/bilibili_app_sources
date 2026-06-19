package com.bilibili.paycoin;

import androidx.activity.ComponentActivity;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.riskcontrol.IActionValidateResult;
import dq0.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/C.class */
public final class C implements IActionValidateResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentActivity f74707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f74708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d.b f74709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D f74710d;

    public C(ComponentActivity componentActivity, A a7, d.b bVar, D d7) {
        this.f74707a = componentActivity;
        this.f74708b = a7;
        this.f74709c = bVar;
        this.f74710d = d7;
    }

    @Override // com.bilibili.lib.riskcontrol.IActionValidateResult
    public final void onBlock(String str) {
        ToastHelper.showToast(this.f74707a, str, 0, 17);
    }

    @Override // com.bilibili.lib.riskcontrol.IActionValidateResult
    public final void onPass(String str) {
        d.b bVar = this.f74709c;
        this.f74708b.a(new d.b(bVar.f116609a, bVar.f116610b, bVar.f116611c, bVar.f116612d, bVar.f116613e, bVar.f116614f, bVar.f116615g, bVar.h, bVar.f116616i, bVar.f116617j, bVar.f116618k, str, bVar.f116620m), this.f74710d);
    }
}
