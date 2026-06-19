package com.bilibili.ship.theseus.cheese.biz.intro.recommend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import fu0.L;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/p.class */
@StabilityInferred(parameters = 0)
public final class p extends com.bilibili.app.gemini.ui.m<L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f89988a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/p$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f89989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f89990b;

        public a(@NotNull MutableStateFlow mutableStateFlow, @NotNull StateFlow stateFlow) {
            this.f89989a = mutableStateFlow;
            this.f89990b = stateFlow;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f89989a, aVar.f89989a) && Intrinsics.areEqual(this.f89990b, aVar.f89990b);
        }

        public final int hashCode() {
            return this.f89990b.hashCode() + (this.f89989a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "State(stateFlow=" + this.f89989a + ", horizontalPaddingFlow=" + this.f89990b + ")";
        }
    }

    public p(@NotNull a aVar) {
        this.f89988a = aVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseRecommendSingleComponent$bind$2(this, (L) viewBinding, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return L.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}
