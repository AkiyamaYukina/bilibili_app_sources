package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import androidx.window.core.layout.WindowSizeClass;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import nu0.C8143b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/i.class */
@StabilityInferred(parameters = 0)
public final class i extends com.bilibili.app.gemini.ui.m<fu0.F> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f89866b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f89867a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/i$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final CheesePublisherService$createPublisherOwner$$inlined$map$1 f89868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f89869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StateFlow<Boolean> f89870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final StateFlow<WindowSizeClass> f89871d;

        public a(@NotNull CheesePublisherService$createPublisherOwner$$inlined$map$1 cheesePublisherService$createPublisherOwner$$inlined$map$1, @NotNull StateFlow stateFlow, @NotNull StateFlow stateFlow2, @NotNull StateFlow stateFlow3) {
            this.f89868a = cheesePublisherService$createPublisherOwner$$inlined$map$1;
            this.f89869b = stateFlow;
            this.f89870c = stateFlow2;
            this.f89871d = stateFlow3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f89868a, aVar.f89868a) && Intrinsics.areEqual(this.f89869b, aVar.f89869b) && Intrinsics.areEqual(this.f89870c, aVar.f89870c) && Intrinsics.areEqual(this.f89871d, aVar.f89871d);
        }

        public final int hashCode() {
            return this.f89871d.hashCode() + androidx.core.content.b.a(this.f89870c, androidx.core.content.b.a(this.f89869b, hashCode() * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            return "State(stateFlow=" + this.f89868a + ", horizontalPaddingFlow=" + this.f89869b + ", isDoubleRelate=" + this.f89870c + ", windowSize=" + this.f89871d + ")";
        }
    }

    public i(@NotNull a aVar) {
        this.f89867a = aVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheesePublisherComponent$bind$2(this, (fu0.F) viewBinding, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        fu0.F fInflate = fu0.F.inflate(layoutInflater, viewGroup, false);
        fInflate.f119437i.addItemDecoration(new C8143b(0, (int) DpUtils.dp2px(context, 8.0f), (int) DpUtils.dp2px(context, 10.0f)));
        return fInflate;
    }
}
