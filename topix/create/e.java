package com.bilibili.topix.create;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/e.class */
public final /* synthetic */ class e implements Observer, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f112595a;

    public e(Function1 function1) {
        this.f112595a = function1;
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
        return this.f112595a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.f112595a.invoke(obj);
    }
}
