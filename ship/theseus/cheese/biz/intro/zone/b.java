package com.bilibili.ship.theseus.cheese.biz.intro.zone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.image2.BiliImageLoader;
import fu0.U;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/b.class */
@StabilityInferred(parameters = 0)
public final class b implements UIComponent<n<U>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C0650b f90308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f90309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f90310c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/b$a.class */
    @StabilityInferred(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.zone.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/b$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0648a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final d f90311a;

            public C0648a(@NotNull d dVar) {
                this.f90311a = dVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0648a) && Intrinsics.areEqual(this.f90311a, ((C0648a) obj).f90311a);
            }

            public final int hashCode() {
                return this.f90311a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "OnClickItem(data=" + this.f90311a + ")";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.zone.b$a$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/b$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0649b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f90312a;

            public C0649b(int i7) {
                this.f90312a = i7;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0649b) && this.f90312a == ((C0649b) obj).f90312a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f90312a);
            }

            @NotNull
            public final String toString() {
                return C4277b.a(this.f90312a, ")", new StringBuilder("OnExposureReport(type="));
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.zone.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/b$b.class */
    @StabilityInferred(parameters = 0)
    public static final class C0650b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final c f90313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f90314b;

        public C0650b(@NotNull c cVar, @NotNull StateFlow<Integer> stateFlow) {
            this.f90313a = cVar;
            this.f90314b = stateFlow;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0650b)) {
                return false;
            }
            C0650b c0650b = (C0650b) obj;
            return Intrinsics.areEqual(this.f90313a, c0650b.f90313a) && Intrinsics.areEqual(this.f90314b, c0650b.f90314b);
        }

        public final int hashCode() {
            return this.f90314b.hashCode() + (this.f90313a.f90315a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "State(zone=" + this.f90313a + ", horizontalPaddingFlow=" + this.f90314b + ")";
        }
    }

    public b(@NotNull C0650b c0650b) {
        this.f90308a = c0650b;
        MutableSharedFlow<a> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, 3, BufferOverflow.DROP_OLDEST);
        this.f90309b = MutableSharedFlow;
        this.f90310c = FlowKt.asSharedFlow(MutableSharedFlow);
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        Object objCoroutineScope;
        U u7 = (U) ((n) viewEntry).a;
        Context context = u7.f119503a.getContext();
        d dVar = (d) CollectionsKt.firstOrNull(this.f90308a.f90313a.f90315a);
        if (dVar == null) {
            objCoroutineScope = Unit.INSTANCE;
        } else {
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(u7.f119503a, new ExposureEntry(com.bilibili.ship.theseus.cheese.biz.report.c.f90463a, new Xi.c(2, this, dVar)));
            BiliImageLoader.INSTANCE.with(context).url(dVar.f90316a).into(u7.f119505c);
            u7.f119508f.setText(dVar.f90318c);
            u7.f119507e.setText(dVar.f90319d);
            objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseSingleZoneComponent$bindToView$3(u7, this, dVar, null), continuation);
            if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCoroutineScope = Unit.INSTANCE;
            }
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new n(U.inflate(LayoutInflater.from(context), viewGroup, false));
    }
}
