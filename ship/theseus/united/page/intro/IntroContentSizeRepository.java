package com.bilibili.ship.theseus.united.page.intro;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.window.core.layout.WindowSizeClass;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroContentSizeRepository.class */
@StabilityInferred(parameters = 0)
public final class IntroContentSizeRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f100020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f100021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f100022c;

    @Inject
    public IntroContentSizeRepository(@NotNull CoroutineScope coroutineScope, @NotNull final com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        final StateFlow<WindowSizeClass> stateFlow = aVar.f102939c;
        Flow<Integer> flow = new Flow<Integer>(stateFlow, aVar) { // from class: com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f100023a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.bilibili.ship.theseus.united.page.screensize.a f100024b;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroContentSizeRepository$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f100025a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.page.screensize.a f100026b;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroContentSizeRepository$special$$inlined$map$1$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, com.bilibili.ship.theseus.united.page.screensize.a aVar) {
                    this.f100025a = flowCollector;
                    this.f100026b = aVar;
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
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$1$2$1
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
                        goto L8f
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
                        r1 = r5
                        com.bilibili.ship.theseus.united.page.screensize.a r1 = r1.f100026b
                        boolean r1 = r1.f()
                        r2 = 12
                        int r0 = com.bilibili.ship.theseus.united.page.intro.a.a(r0, r1, r2)
                        java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f100025a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L8f
                        r0 = r9
                        return r0
                    L8f:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f100023a = stateFlow;
                this.f100024b = aVar;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f100023a.collect(new AnonymousClass2(flowCollector, this.f100024b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.f100020a = FlowKt.stateIn(flow, coroutineScope, companion.getEagerly(), 12);
        final StateFlow<WindowSizeClass> stateFlow2 = aVar.f102939c;
        this.f100021b = FlowKt.stateIn(new Flow<Integer>(stateFlow2, aVar) { // from class: com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f100027a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.bilibili.ship.theseus.united.page.screensize.a f100028b;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroContentSizeRepository$special$$inlined$map$2$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f100029a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.page.screensize.a f100030b;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroContentSizeRepository$special$$inlined$map$2$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, com.bilibili.ship.theseus.united.page.screensize.a aVar) {
                    this.f100029a = flowCollector;
                    this.f100030b = aVar;
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
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$2$2$1 r0 = (com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$2$2$1 r0 = new com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$2$2$1
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
                        goto L8f
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
                        r1 = r5
                        com.bilibili.ship.theseus.united.page.screensize.a r1 = r1.f100030b
                        boolean r1 = r1.f()
                        r2 = 10
                        int r0 = com.bilibili.ship.theseus.united.page.intro.a.a(r0, r1, r2)
                        java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f100029a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L8f
                        r0 = r9
                        return r0
                    L8f:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f100027a = stateFlow2;
                this.f100028b = aVar;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f100027a.collect(new AnonymousClass2(flowCollector, this.f100028b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, coroutineScope, companion.getEagerly(), 10);
        this.f100022c = FlowKt.stateIn(new Flow<Boolean>(stateFlow2) { // from class: com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f100031a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$3$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroContentSizeRepository$special$$inlined$map$3$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f100032a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$3$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroContentSizeRepository$special$$inlined$map$3$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f100032a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$3$2$1 r0 = (com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        r11 = r0
                        r0 = r11
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r11
                        r1 = r8
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r11
                        r7 = r0
                        goto L33
                    L29:
                        com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$3$2$1 r0 = new com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$3$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r12 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r11 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r12
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto Lbd
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r12
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        androidx.window.core.layout.WindowSizeClass r0 = (androidx.window.core.layout.WindowSizeClass) r0
                        r6 = r0
                        boolean r0 = com.bilibili.ship.theseus.united.page.screensize.b.f102943b
                        r9 = r0
                        r0 = 0
                        r10 = r0
                        r0 = r9
                        if (r0 != 0) goto L7c
                        r0 = r10
                        r9 = r0
                        goto L9f
                    L7c:
                        r0 = r6
                        boolean r0 = com.bilibili.ship.theseus.united.page.screensize.b.c(r0)
                        if (r0 != 0) goto L8e
                        r0 = r10
                        r9 = r0
                        r0 = r6
                        boolean r0 = com.bilibili.ship.theseus.united.page.screensize.b.b(r0)
                        if (r0 == 0) goto L9f
                    L8e:
                        r0 = r10
                        r9 = r0
                        r0 = r6
                        int r0 = r0.getMinWidthDp()
                        r1 = 750(0x2ee, float:1.051E-42)
                        if (r0 < r1) goto L9f
                        r0 = 1
                        r9 = r0
                    L9f:
                        r0 = r9
                        java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f100032a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r11
                        if (r0 != r1) goto Lbd
                        r0 = r11
                        return r0
                    Lbd:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f100031a = stateFlow2;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f100031a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, coroutineScope, companion.getEagerly(), Boolean.FALSE);
    }
}
