package com.bilibili.search2.main.data;

import androidx.lifecycle.Observer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/m.class */
public final class m<T> implements Observer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Observer<T> f86827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f86828b;

    public m(@NotNull Observer<T> observer) {
        this.f86827a = observer;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t7) {
        if (this.f86828b) {
            this.f86827a.onChanged(t7);
        }
    }
}
