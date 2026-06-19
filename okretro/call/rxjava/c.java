package com.bilibili.okretro.call.rxjava;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import io.reactivex.rxjava3.disposables.Disposable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/rxjava/c.class */
public final class c {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/rxjava/c$a.class */
    public static final class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f73433a;

        public a(b bVar) {
            this.f73433a = bVar;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onCreate(LifecycleOwner lifecycleOwner) {
            this.f73433a.f73432b = true;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            this.f73433a.b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bilibili.okretro.call.rxjava.b, java.lang.Object] */
    public static final void a(@NotNull Disposable disposable, @Nullable Lifecycle lifecycle) {
        if (lifecycle == null) {
            return;
        }
        ?? obj = new Object();
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            obj.f73432b = true;
        }
        lifecycle.addObserver(new a(obj));
        obj.a(disposable);
    }
}
