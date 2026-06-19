package com.bilibili.playset.detail.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

/* JADX INFO: renamed from: com.bilibili.playset.detail.compose.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/compose/c.class */
public final class C5904c implements DisposableEffectResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentManager f84392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fragment f84393b;

    public C5904c(FragmentManager fragmentManager, Fragment fragment) {
        this.f84392a = fragmentManager;
        this.f84393b = fragment;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        try {
            FragmentTransaction fragmentTransactionBeginTransaction = this.f84392a.beginTransaction();
            fragmentTransactionBeginTransaction.remove(this.f84393b);
            fragmentTransactionBeginTransaction.commitNow();
        } catch (IllegalStateException e7) {
        }
    }
}
