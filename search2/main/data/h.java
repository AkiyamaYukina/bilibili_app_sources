package com.bilibili.search2.main.data;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/h.class */
public final class h {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/h$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f86819a;

        public a(Function1 function1) {
            this.f86819a = function1;
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
            return this.f86819a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f86819a.invoke(obj);
        }
    }

    public static final void a(@NotNull MutableLiveData mutableLiveData, @NotNull Lifecycle lifecycle, @NotNull Observer observer) {
        m mVar = new m(observer);
        mutableLiveData.observeForever(mVar);
        mVar.f86828b = true;
        lifecycle.addObserver(new g(mutableLiveData, mVar, lifecycle));
    }
}
