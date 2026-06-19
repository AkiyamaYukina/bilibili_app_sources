package com.bilibili.pegasus.holders.bannerv8;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/d.class */
public final /* synthetic */ class d implements Observer, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.biligame.ui.minev3.b f77732a;

    public d(com.bilibili.biligame.ui.minev3.b bVar) {
        this.f77732a = bVar;
    }

    public final boolean equals(@Nullable Object obj) {
        boolean zAreEqual = false;
        if (obj instanceof Observer) {
            zAreEqual = false;
            if (obj instanceof FunctionAdapter) {
                zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
        }
        return zAreEqual;
    }

    @NotNull
    public final Function<?> getFunctionDelegate() {
        return this.f77732a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.f77732a.invoke(obj);
    }
}
