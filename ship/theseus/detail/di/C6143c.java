package com.bilibili.ship.theseus.detail.di;

import Ua.U;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.ship.theseus.detail.UnitedBizDetailsActivity;
import dagger.Module;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import pu0.C8356b;
import pu0.C8357c;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.di.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/di/c.class */
@StabilityInferred(parameters = 0)
@Module
public final class C6143c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UnitedBizDetailsActivity f91004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f91005b = LazyKt.lazy(new U(this, 3));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f91006c = LazyKt.lazy(new com.bilibili.app.authorspace.header.banner.f(this, 2));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f91007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f91008e;

    public C6143c(@NotNull UnitedBizDetailsActivity unitedBizDetailsActivity) {
        this.f91004a = unitedBizDetailsActivity;
        com.bilibili.ship.theseus.united.page.screensize.a aVar = new com.bilibili.ship.theseus.united.page.screensize.a();
        this.f91007d = aVar;
        final StateFlow<WindowSizeClass> stateFlow = aVar.f102939c;
        this.f91008e = FlowKt.stateIn(FlowKt.distinctUntilChanged(new Flow<Boolean>(stateFlow, this) { // from class: com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StateFlow f90996a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C6143c f90997b;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/di/TheseusLayoutBackedModule$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f90998a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C6143c f90999b;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/di/TheseusLayoutBackedModule$special$$inlined$map$1$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    Object result;
                    final AnonymousClass2 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                        super(continuation);
                        this.this$0 = anonymousClass2;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, C6143c c6143c) {
                    this.f90998a = flowCollector;
                    this.f90999b = c6143c;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$special$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        r9 = r0
                        r0 = r9
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r9
                        r1 = r8
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r9
                        r7 = r0
                        goto L33
                    L29:
                        com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$special$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$special$$inlined$map$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L8e
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        androidx.window.core.layout.WindowSizeClass r0 = (androidx.window.core.layout.WindowSizeClass) r0
                        r6 = r0
                        r0 = r5
                        com.bilibili.ship.theseus.detail.di.c r0 = r0.f90999b
                        com.bilibili.ship.theseus.united.page.screensize.a r0 = r0.f91007d
                        boolean r0 = r0.f()
                        java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f90998a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L8e
                        r0 = r9
                        return r0
                    L8e:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f90996a = stateFlow;
                this.f90997b = this;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f90996a.collect(new AnonymousClass2(flowCollector, this.f90997b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), LifecycleOwnerKt.getLifecycleScope(unitedBizDetailsActivity), SharingStarted.Companion.getEagerly(), Boolean.FALSE);
    }

    public final C8357c a() {
        return (C8357c) this.f91005b.getValue();
    }

    public final C8356b b() {
        return (C8356b) this.f91006c.getValue();
    }
}
