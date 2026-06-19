package com.bilibili.lib.ui;

import Vf0.InterfaceC2943f;
import android.util.SparseArray;
import bolts.Task;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/J.class */
public final class J implements InterfaceC2943f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64785a;

    public J(int i7) {
        this.f64785a = i7;
    }

    @Override // Vf0.InterfaceC2943f
    public final void onCancel() {
        SparseArray<Task<Void>.TaskCompletionSource> sparseArray = PermissionsChecker.f64800a;
        int i7 = this.f64785a;
        Task<Void>.TaskCompletionSource taskCompletionSource = sparseArray.get(i7);
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetCancelled();
        }
        sparseArray.delete(i7);
        PermissionsChecker.f64801b.delete(i7);
    }

    @Override // Vf0.InterfaceC2943f
    public final void onConfirm() {
        SparseArray<Task<Void>.TaskCompletionSource> sparseArray = PermissionsChecker.f64800a;
        int i7 = this.f64785a;
        Task<Void>.TaskCompletionSource taskCompletionSource = sparseArray.get(i7);
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetResult(null);
        }
        sparseArray.delete(i7);
        PermissionsChecker.f64801b.delete(i7);
    }
}
