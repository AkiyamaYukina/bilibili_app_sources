package com.bilibili.playset;

import android.util.Log;
import androidx.annotation.MainThread;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/Q0.class */
@StabilityInferred(parameters = 0)
public final class Q0<T> extends MutableLiveData<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f84020l = new AtomicBoolean(false);

    @Override // androidx.lifecycle.LiveData
    @MainThread
    public final void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Observer<? super T> observer) {
        if (hasActiveObservers()) {
            Log.w("SingleLiveData", "Multiple observers registered but only one will be notified of changes.");
        }
        super.observe(lifecycleOwner, new Observer(this, observer) { // from class: com.bilibili.playset.P0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Q0 f83997a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Observer f83998b;

            {
                this.f83997a = this;
                this.f83998b = observer;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (this.f83997a.f84020l.compareAndSet(true, false)) {
                    this.f83998b.onChanged(obj);
                }
            }
        });
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    @MainThread
    public final void setValue(@Nullable T t7) {
        this.f84020l.set(true);
        super.setValue(t7);
    }
}
