package com.bilibili.ship.theseus.cheese.biz.intro.zone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import fu0.T;
import kotlin.Unit;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/a.class */
@StabilityInferred(parameters = 0)
public final class a implements UIComponent<n<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b f90301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<AbstractC0646a> f90302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<AbstractC0646a> f90303c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.zone.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/a$a.class */
    @StabilityInferred(parameters = 1)
    public static abstract class AbstractC0646a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.zone.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/a$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0647a extends AbstractC0646a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final d f90304a;

            public C0647a(@NotNull d dVar) {
                this.f90304a = dVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0647a) && Intrinsics.areEqual(this.f90304a, ((C0647a) obj).f90304a);
            }

            public final int hashCode() {
                return this.f90304a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "OnClickItem(data=" + this.f90304a + ")";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.zone.a$a$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/a$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends AbstractC0646a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f90305a = new AbstractC0646a();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/a$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final c f90306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f90307b;

        public b(@NotNull c cVar, @NotNull StateFlow<Integer> stateFlow) {
            this.f90306a = cVar;
            this.f90307b = stateFlow;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f90306a, bVar.f90306a) && Intrinsics.areEqual(this.f90307b, bVar.f90307b);
        }

        public final int hashCode() {
            return this.f90307b.hashCode() + (this.f90306a.f90315a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "State(zone=" + this.f90306a + ", horizontalPaddingFlow=" + this.f90307b + ")";
        }
    }

    public a(@NotNull b bVar) {
        this.f90301a = bVar;
        MutableSharedFlow<AbstractC0646a> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, 3, BufferOverflow.DROP_OLDEST);
        this.f90302b = MutableSharedFlow;
        this.f90303c = FlowKt.asSharedFlow(MutableSharedFlow);
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        T t7 = (T) ((n) viewEntry).a;
        Context context = t7.f119494a.getContext();
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(t7.f119494a, new ExposureEntry(com.bilibili.ship.theseus.cheese.biz.report.c.f90463a, new Md0.b(this, 6)));
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseMulZoneComponent$bindToView$3(this, t7, context, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new n(T.inflate(LayoutInflater.from(context), viewGroup, false));
    }
}
