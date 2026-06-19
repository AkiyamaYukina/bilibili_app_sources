package com.bilibili.okretro.call.rxjava;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/rxjava/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public CompositeDisposable f73431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f73432b;

    public final void a(@NotNull Disposable disposable) {
        if (!this.f73432b) {
            disposable.dispose();
            return;
        }
        CompositeDisposable compositeDisposable = this.f73431a;
        CompositeDisposable compositeDisposable2 = compositeDisposable;
        if (compositeDisposable == null) {
            compositeDisposable2 = new CompositeDisposable();
            this.f73431a = compositeDisposable2;
        }
        compositeDisposable2.add(disposable);
    }

    public final void b() {
        this.f73432b = false;
        CompositeDisposable compositeDisposable = this.f73431a;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
        this.f73431a = null;
    }
}
