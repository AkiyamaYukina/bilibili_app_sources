package com.bilibili.sistersplayer.p2p.fragment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/fragment/Future.class */
public final class Future<T> {

    @NotNull
    private List<Function1<T, Unit>> callbacks = new ArrayList();
    private boolean completed;

    @Nullable
    private T result;

    public final boolean isResolved() {
        return this.completed;
    }

    public final void onResolved(@NotNull Function1<? super T, Unit> function1) {
        if (this.completed) {
            function1.invoke(this.result);
        } else {
            this.callbacks.add(function1);
        }
    }

    public final void setResult(@Nullable T t7) {
        this.result = t7;
        this.completed = true;
        if (!this.callbacks.isEmpty()) {
            Iterator<Function1<T, Unit>> it = this.callbacks.iterator();
            while (it.hasNext()) {
                it.next().invoke(this.result);
            }
        }
        this.callbacks.clear();
    }
}
