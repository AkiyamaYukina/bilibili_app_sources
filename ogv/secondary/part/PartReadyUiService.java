package com.bilibili.ogv.secondary.part;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.P;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import bl0.C5115a;
import com.bilibili.ogv.operation3.module.list.MoreLoadingState;
import com.bilibili.ogv.secondary.part.PartReadyUiService;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/PartReadyUiService.class */
@StabilityInferred(parameters = 0)
public final class PartReadyUiService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KomponentScope<Unit> f72795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.secondary.api.c f72796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C5115a f72797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final q f72798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PartReadyLoadMoreService f72799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Fl0.c f72800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<y> f72801g = SnapshotStateKt.mutableStateListOf();

    @NotNull
    public final LazyListState h = new LazyListState(0, 0, 3, null);

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.PartReadyUiService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/PartReadyUiService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final PartReadyUiService this$0;

        /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.PartReadyUiService$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/PartReadyUiService$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final PartReadyUiService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PartReadyUiService partReadyUiService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = partReadyUiService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.this$0.f72796b.f72636a.size() < 5) {
                        PartReadyLoadMoreService partReadyLoadMoreService = this.this$0.f72799e;
                        this.label = 1;
                        MutableState mutableState = partReadyLoadMoreService.f72791b;
                        Object objEmptyList = (((MoreLoadingState) mutableState.getValue()) == MoreLoadingState.NO_MORE || ((MoreLoadingState) mutableState.getValue()) == MoreLoadingState.LOADING) ? CollectionsKt.emptyList() : partReadyLoadMoreService.f72792c.b(this);
                        obj2 = objEmptyList;
                        if (objEmptyList == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                PartReadyUiService partReadyUiService = this.this$0;
                SnapshotStateList<y> snapshotStateList = partReadyUiService.f72801g;
                Iterator it = ((Iterable) obj2).iterator();
                while (it.hasNext()) {
                    snapshotStateList.add(PartReadyUiService.b(partReadyUiService, (z) it.next()));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.PartReadyUiService$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/PartReadyUiService$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final PartReadyUiService this$0;

            /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.PartReadyUiService$1$3$3, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/PartReadyUiService$1$3$3.class */
            public static final class C04583<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PartReadyUiService f72802a;

                public C04583(PartReadyUiService partReadyUiService) {
                    this.f72802a = partReadyUiService;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object a(boolean r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                    /*
                        Method dump skipped, instruction units count: 265
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.secondary.part.PartReadyUiService.AnonymousClass1.AnonymousClass3.C04583.a(boolean, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return a(((Boolean) obj).booleanValue(), continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(PartReadyUiService partReadyUiService, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = partReadyUiService;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0(PartReadyUiService partReadyUiService) {
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) P.a(partReadyUiService.h);
                return lazyListItemInfo != null && lazyListItemInfo.getIndex() >= partReadyUiService.h.getLayoutInfo().getTotalItemsCount() - 2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final PartReadyUiService partReadyUiService = this.this$0;
                    final Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0(partReadyUiService) { // from class: com.bilibili.ogv.secondary.part.J

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final PartReadyUiService f72782a;

                        {
                            this.f72782a = partReadyUiService;
                        }

                        public final Object invoke() {
                            return Boolean.valueOf(PartReadyUiService.AnonymousClass1.AnonymousClass3.invokeSuspend$lambda$0(this.f72782a));
                        }
                    });
                    Flow flowConflate = FlowKt.conflate(new Flow<Boolean>(flowSnapshotFlow) { // from class: com.bilibili.ogv.secondary.part.PartReadyUiService$1$3$invokeSuspend$$inlined$filter$1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final Flow f72803a;

                        /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.PartReadyUiService$1$3$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/PartReadyUiService$1$3$invokeSuspend$$inlined$filter$1$2.class */
                        public static final class AnonymousClass2<T> implements FlowCollector {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final FlowCollector f72804a;

                            /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.PartReadyUiService$1$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/PartReadyUiService$1$3$invokeSuspend$$inlined$filter$1$2$1.class */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                int I$0;
                                Object L$0;
                                Object L$1;
                                Object L$2;
                                Object L$3;
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
                                this.f72804a = flowCollector;
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
                                    boolean r0 = r0 instanceof com.bilibili.ogv.secondary.part.PartReadyUiService$1$3$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L29
                                    r0 = r7
                                    com.bilibili.ogv.secondary.part.PartReadyUiService$1$3$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.bilibili.ogv.secondary.part.PartReadyUiService$1$3$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
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
                                    com.bilibili.ogv.secondary.part.PartReadyUiService$1$3$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.bilibili.ogv.secondary.part.PartReadyUiService$1$3$invokeSuspend$$inlined$filter$1$2$1
                                    r1 = r0
                                    r2 = r5
                                    r3 = r7
                                    r1.<init>(r2, r3)
                                    r7 = r0
                                L33:
                                    r0 = r7
                                    java.lang.Object r0 = r0.result
                                    r9 = r0
                                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    r10 = r0
                                    r0 = r7
                                    int r0 = r0.label
                                    r8 = r0
                                    r0 = r8
                                    if (r0 == 0) goto L6e
                                    r0 = r8
                                    r1 = 1
                                    if (r0 != r1) goto L64
                                    r0 = r7
                                    java.lang.Object r0 = r0.L$3
                                    kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                                    r6 = r0
                                    r0 = r7
                                    java.lang.Object r0 = r0.L$1
                                    com.bilibili.ogv.secondary.part.PartReadyUiService$1$3$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.bilibili.ogv.secondary.part.PartReadyUiService$1$3$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                    r6 = r0
                                    r0 = r9
                                    kotlin.ResultKt.throwOnFailure(r0)
                                    goto Lbf
                                L64:
                                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                    r1 = r0
                                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                    r1.<init>(r2)
                                    throw r0
                                L6e:
                                    r0 = r9
                                    kotlin.ResultKt.throwOnFailure(r0)
                                    r0 = r6
                                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                                    boolean r0 = r0.booleanValue()
                                    if (r0 == 0) goto Lbf
                                    r0 = r7
                                    r1 = r6
                                    java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
                                    r0.L$0 = r1
                                    r0 = r7
                                    r1 = r7
                                    java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
                                    r0.L$1 = r1
                                    r0 = r7
                                    r1 = r6
                                    java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
                                    r0.L$2 = r1
                                    r0 = r5
                                    kotlinx.coroutines.flow.FlowCollector r0 = r0.f72804a
                                    r9 = r0
                                    r0 = r7
                                    r1 = r9
                                    java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
                                    r0.L$3 = r1
                                    r0 = r7
                                    r1 = 0
                                    r0.I$0 = r1
                                    r0 = r7
                                    r1 = 1
                                    r0.label = r1
                                    r0 = r9
                                    r1 = r6
                                    r2 = r7
                                    java.lang.Object r0 = r0.emit(r1, r2)
                                    r1 = r10
                                    if (r0 != r1) goto Lbf
                                    r0 = r10
                                    return r0
                                Lbf:
                                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.secondary.part.PartReadyUiService$1$3$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }
                        }

                        {
                            this.f72803a = flowSnapshotFlow;
                        }

                        public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                            Object objCollect = this.f72803a.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    });
                    C04583 c04583 = new C04583(this.this$0);
                    this.label = 1;
                    if (flowConflate.collect(c04583, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PartReadyUiService partReadyUiService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = partReadyUiService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PartReadyUiService partReadyUiService = this.this$0;
            List<z> listA = O.a(partReadyUiService.f72796b.f72636a, partReadyUiService.f72797c, partReadyUiService.f72798d, partReadyUiService.f72800f);
            PartReadyUiService partReadyUiService2 = this.this$0;
            SnapshotStateList<y> snapshotStateList = partReadyUiService2.f72801g;
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                snapshotStateList.add(PartReadyUiService.b(partReadyUiService2, (z) it.next()));
            }
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public PartReadyUiService(@NotNull KomponentScope<? super Unit> komponentScope, @NotNull com.bilibili.ogv.secondary.api.c cVar, @NotNull C5115a c5115a, @NotNull q qVar, @NotNull PartReadyLoadMoreService partReadyLoadMoreService, @NotNull Fl0.c cVar2) {
        this.f72795a = komponentScope;
        this.f72796b = cVar;
        this.f72797c = c5115a;
        this.f72798d = qVar;
        this.f72799e = partReadyLoadMoreService;
        this.f72800f = cVar2;
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static final y b(PartReadyUiService partReadyUiService, z zVar) {
        KomponentHostScope komponentHostScope__sub$default = KomponentHostScope.__sub$default(partReadyUiService.f72795a, (Function0) null, 1, (Object) null);
        return new y(komponentHostScope__sub$default.embed(zVar.f72920a), komponentHostScope__sub$default, zVar.f72921b);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r15, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r16, final int r17) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.secondary.part.PartReadyUiService.a(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }
}
