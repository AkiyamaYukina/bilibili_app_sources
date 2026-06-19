package com.bilibili.pegasus.channelv2.home.center;

import androidx.lifecycle.Observer;
import com.bilibili.bililive.room.ui.roomv3.ranks.A;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/d.class */
public final /* synthetic */ class d implements Observer, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f75274a;

    public d(A a7) {
        this.f75274a = a7;
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
        return this.f75274a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.f75274a.invoke(obj);
    }
}
