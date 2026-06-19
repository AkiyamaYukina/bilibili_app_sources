package com.bilibili.pegasus.components.interestv2.host;

import androidx.activity.OnBackPressedCallback;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/host/i.class */
public final class i extends OnBackPressedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f77057a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(false);
        this.f77057a = jVar;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        this.f77057a.f77061d.invoke("gesture");
    }
}
