package com.bilibili.ogv.kmm.operation.listcontent;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import bl0.C5115a;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.kmm.operation.api.f;
import com.bilibili.ogv.kmm.operation.api.i;
import com.bilibili.ogv.kmm.operation.reservation.l;
import dk0.m;
import java.util.HashSet;
import java.util.Iterator;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.toast.Toaster;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/listcontent/PerLoadUiService.class */
@StabilityInferred(parameters = 0)
public final class PerLoadUiService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f68527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final m f68528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final KomponentScope<Unit> f68529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final l f68530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final i f68531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C5115a f68532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Toaster f68533g;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList f68534i = SnapshotStateKt.mutableStateListOf();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final UiComposableLike<Unit> f68535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final HashSet<String> f68536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final LazyListState f68537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f68538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableState f68539n;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.listcontent.PerLoadUiService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/listcontent/PerLoadUiService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PerLoadUiService this$0;

        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.listcontent.PerLoadUiService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/listcontent/PerLoadUiService$1$1.class */
        public static final class C04151 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final PerLoadUiService this$0;

            /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.listcontent.PerLoadUiService$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/listcontent/PerLoadUiService$1$1$1.class */
            public static final class C04161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private Object L$0;
                int label;
                final PerLoadUiService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04161(PerLoadUiService perLoadUiService, Continuation<? super C04161> continuation) {
                    super(2, continuation);
                    this.this$0 = perLoadUiService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C04161 c04161 = new C04161(this.this$0, continuation);
                    c04161.L$0 = obj;
                    return c04161;
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
                    PerLoadUiService perLoadUiService = this.this$0;
                    for (a aVar : perLoadUiService.f68534i) {
                        HashSet<String> hashSet = perLoadUiService.f68536k;
                        com.bilibili.ogv.kmm.operation.api.d dVar = aVar.f68543c;
                        if (CollectionsKt.contains(hashSet, dVar != null ? dVar.getType() : null)) {
                            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PerLoadUiService$1$1$1$1$1(perLoadUiService, aVar, null), 3, (Object) null);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04151(PerLoadUiService perLoadUiService, Continuation<? super C04151> continuation) {
                super(2, continuation);
                this.this$0 = perLoadUiService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04151(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C04161 c04161 = new C04161(this.this$0, null);
                    this.label = 1;
                    if (CoroutineScopeKt.coroutineScope(c04161, this) == coroutine_suspended) {
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
        public AnonymousClass1(PerLoadUiService perLoadUiService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = perLoadUiService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PerLoadUiService perLoadUiService = this.this$0;
                Iterator<T> it = perLoadUiService.f68527a.f67986a.iterator();
                while (it.hasNext()) {
                    perLoadUiService.f68534i.add(perLoadUiService.d((InterfaceC5118d) it.next()));
                }
                PerLoadUiService perLoadUiService2 = this.this$0;
                MutableSharedFlow<Unit> mutableSharedFlow = perLoadUiService2.f68528b.f116483a;
                C04151 c04151 = new C04151(perLoadUiService2, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableSharedFlow, c04151, this) == coroutine_suspended) {
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    @javax.inject.Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PerLoadUiService(@org.jetbrains.annotations.NotNull com.bilibili.ogv.kmm.operation.api.f r9, @org.jetbrains.annotations.NotNull dk0.m r10, @org.jetbrains.annotations.NotNull kntr.common.komponent.KomponentScope<? super kotlin.Unit> r11, @org.jetbrains.annotations.NotNull com.bilibili.ogv.kmm.operation.reservation.l r12, @org.jetbrains.annotations.NotNull com.bilibili.ogv.kmm.operation.api.i r13, @org.jetbrains.annotations.NotNull bl0.C5115a r14, @org.jetbrains.annotations.NotNull kntr.common.trio.toast.Toaster r15) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.listcontent.PerLoadUiService.<init>(com.bilibili.ogv.kmm.operation.api.f, dk0.m, kntr.common.komponent.KomponentScope, com.bilibili.ogv.kmm.operation.reservation.l, com.bilibili.ogv.kmm.operation.api.i, bl0.a, kntr.common.trio.toast.Toaster):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ogv.kmm.operation.listcontent.PerLoadUiService r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.listcontent.PerLoadUiService.b(com.bilibili.ogv.kmm.operation.listcontent.PerLoadUiService, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.ogv.kmm.operation.listcontent.PerLoadUiService r7, com.bilibili.ogv.kmm.operation.listcontent.a r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.listcontent.PerLoadUiService.c(com.bilibili.ogv.kmm.operation.listcontent.PerLoadUiService, com.bilibili.ogv.kmm.operation.listcontent.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.Nullable final androidx.compose.ui.Modifier r15, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r16, final int r17) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.listcontent.PerLoadUiService.a(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    public final a d(InterfaceC5118d interfaceC5118d) {
        com.bilibili.ogv.kmm.operation.api.d dVar = null;
        KomponentHostScope komponentHostScope__sub$default = KomponentHostScope.__sub$default(this.f68529c, (Function0) null, 1, (Object) null);
        UiComposableLike uiComposableLikeEmbed = komponentHostScope__sub$default.embed(this.f68532f.a(interfaceC5118d));
        if (interfaceC5118d instanceof com.bilibili.ogv.kmm.operation.api.d) {
            dVar = (com.bilibili.ogv.kmm.operation.api.d) interfaceC5118d;
        }
        return new a(uiComposableLikeEmbed, komponentHostScope__sub$default, dVar);
    }
}
