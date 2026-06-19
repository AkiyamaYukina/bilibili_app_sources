package com.bilibili.playset.detail;

import F3.C1762j5;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.playset.detail.data.j;
import com.bilibili.playset.detail.data.q;
import fs0.InterfaceC7170a;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailViewModel.class */
@StabilityInferred(parameters = 0)
public final class MultiTypeListDetailViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final q f84271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playset.detail.data.b f84272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC7170a f84273c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f84276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f84277g;

    @Nullable
    public Job h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f84274d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f84275e = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f84278i = LazyKt.lazy(new C1762j5(5));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f84279j = LazyKt.lazy(new U70.d(this, 5));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<com.bilibili.playset.detail.data.g> f84280k = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f84281l = LazyKt.lazy(new U70.e(this, 4));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Channel<com.bilibili.playset.detail.data.f> f84282m = ChannelKt.Channel$default(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);

    /* JADX INFO: renamed from: com.bilibili.playset.detail.MultiTypeListDetailViewModel$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailViewModel$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MultiTypeListDetailViewModel this$0;

        /* JADX INFO: renamed from: com.bilibili.playset.detail.MultiTypeListDetailViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailViewModel$1$1.class */
        public static final class C05661 extends SuspendLambda implements Function2<com.bilibili.playset.detail.data.f, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final MultiTypeListDetailViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05661(MultiTypeListDetailViewModel multiTypeListDetailViewModel, Continuation<? super C05661> continuation) {
                super(2, continuation);
                this.this$0 = multiTypeListDetailViewModel;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05661 c05661 = new C05661(this.this$0, continuation);
                c05661.L$0 = obj;
                return c05661;
            }

            public final Object invoke(com.bilibili.playset.detail.data.f fVar, Continuation<? super Unit> continuation) {
                return create(fVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                com.bilibili.playset.detail.data.f fVar = (com.bilibili.playset.detail.data.f) this.L$0;
                MultiTypeListDetailViewModel multiTypeListDetailViewModel = this.this$0;
                multiTypeListDetailViewModel.f84272b.a(fVar, (com.bilibili.playset.detail.data.h) multiTypeListDetailViewModel.getState().getValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MultiTypeListDetailViewModel multiTypeListDetailViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = multiTypeListDetailViewModel;
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
                Flow flowConsumeAsFlow = FlowKt.consumeAsFlow(this.this$0.f84282m);
                C05661 c05661 = new C05661(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowConsumeAsFlow, c05661, this) == coroutine_suspended) {
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

    @Inject
    public MultiTypeListDetailViewModel(@NotNull q qVar, @NotNull com.bilibili.playset.detail.data.b bVar, @NotNull InterfaceC7170a interfaceC7170a) {
        this.f84271a = qVar;
        this.f84272b = bVar;
        this.f84273c = interfaceC7170a;
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        bVar.f84456c = this;
        bVar.f84457d = viewModelScope;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object I0(long r6, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.playset.detail.MultiTypeListDetailViewModel$cleanInvalid$1
            if (r0 == 0) goto L2c
            r0 = r8
            com.bilibili.playset.detail.MultiTypeListDetailViewModel$cleanInvalid$1 r0 = (com.bilibili.playset.detail.MultiTypeListDetailViewModel$cleanInvalid$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L36
        L2c:
            com.bilibili.playset.detail.MultiTypeListDetailViewModel$cleanInvalid$1 r0 = new com.bilibili.playset.detail.MultiTypeListDetailViewModel$cleanInvalid$1
            r1 = r0
            r2 = r5
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L36:
            r0 = r8
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L64
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L5a
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L96
            goto L85
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L64:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            fs0.a r0 = r0.f84273c     // Catch: java.lang.Throwable -> L96
            r11 = r0
            r0 = r8
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L96
            r0 = r11
            r1 = r6
            r2 = r8
            java.lang.Object r0 = r0.e(r1, r2)     // Catch: java.lang.Throwable -> L96
            r1 = r10
            if (r0 != r1) goto L85
            r0 = r10
            return r0
        L85:
            com.bilibili.playset.detail.MultiTypeListDetailViewModel$cleanInvalid$2 r0 = new com.bilibili.playset.detail.MultiTypeListDetailViewModel$cleanInvalid$2     // Catch: java.lang.Throwable -> L96
            r8 = r0
            r0 = r8
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L96
            r0 = r5
            r1 = r8
            r0.N0(r1)     // Catch: java.lang.Throwable -> L96
            goto La3
        L96:
            r8 = move-exception
            r0 = r5
            com.bilibili.playset.detail.MultiTypeListDetailViewModel$cleanInvalid$4 r1 = new com.bilibili.playset.detail.MultiTypeListDetailViewModel$cleanInvalid$4
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            r0.N0(r1)
        La3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.MultiTypeListDetailViewModel.I0(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object J0(com.bilibili.playset.api.c r6, java.lang.Long r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.MultiTypeListDetailViewModel.J0(com.bilibili.playset.api.c, java.lang.Long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K0(com.bilibili.playset.api.c r7, long r8, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.MultiTypeListDetailViewModel.K0(com.bilibili.playset.api.c, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object L0(long r9, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.MultiTypeListDetailViewModel.L0(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void M0(@NotNull com.bilibili.playset.detail.data.f fVar) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new MultiTypeListDetailViewModel$dispatch$1(this, fVar, null), 3, (Object) null);
    }

    public final void N0(@NotNull Function1<? super Continuation<? super com.bilibili.playset.detail.data.g>, ? extends Object> function1) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new MultiTypeListDetailViewModel$emitEvent$1(function1, this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O0(long r9, java.lang.String r11, java.lang.String r12, java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.MultiTypeListDetailViewModel.O0(long, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final MutableStateFlow<com.bilibili.playset.detail.data.h> P0() {
        return (MutableStateFlow) this.f84278i.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Q0(long r27, int r29, long r30, java.lang.String r32, java.lang.String r33, java.lang.String r34, kotlin.coroutines.jvm.internal.ContinuationImpl r35) {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.MultiTypeListDetailViewModel.Q0(long, int, long, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Unit R0(long j7, boolean z6) {
        Object value;
        if (((com.bilibili.playset.detail.data.h) getState().getValue()).f84528q || z6) {
            this.f84274d = z6 ? 1 : this.f84274d;
            this.f84275e = z6 ? 1 : this.f84275e;
            if (z6) {
                MutableStateFlow<com.bilibili.playset.detail.data.h> mutableStateFlowP0 = P0();
                do {
                    value = mutableStateFlowP0.getValue();
                } while (!mutableStateFlowP0.compareAndSet(value, com.bilibili.playset.detail.data.h.a((com.bilibili.playset.detail.data.h) P0().getValue(), 0L, 0L, null, null, null, false, false, false, false, false, false, false, j.c.f84537a, false, false, false, false, 0, 0, 4180735)));
            }
            if (z6) {
                if (!this.f84276f) {
                    this.f84276f = true;
                    BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new MultiTypeListDetailViewModel$getResourcesFullInfo$1(this, j7, true, null), 3, (Object) null);
                }
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new MultiTypeListDetailViewModel$getPlaylistBasicInfo$1(this, j7, null), 3, (Object) null);
            } else if (!this.f84276f) {
                this.f84276f = true;
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new MultiTypeListDetailViewModel$getResourcesFullInfo$1(this, j7, false, null), 3, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object S0(@NotNull com.bilibili.playset.api.c cVar, @Nullable Long l7, @NotNull SuspendLambda suspendLambda) {
        Object objJ0 = J0(cVar, l7, suspendLambda);
        return objJ0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ0 : Unit.INSTANCE;
    }

    @Nullable
    public final Unit T0(long j7) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new MultiTypeListDetailViewModel$reportShareCount$1(this, j7, null), 3, (Object) null);
        com.bilibili.playset.playlist.helper.b.a(j7, BiliAccounts.get(BiliContext.application()).mid());
        Y0(new Lr0.d(this, 3));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object U0(long r10, java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.MultiTypeListDetailViewModel.U0(long, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object V0(long r7, kotlin.coroutines.jvm.internal.ContinuationImpl r9, boolean r10) {
        /*
            r6 = this;
            r0 = r9
            boolean r0 = r0 instanceof com.bilibili.playset.detail.MultiTypeListDetailViewModel$toTop$1
            if (r0 == 0) goto L2c
            r0 = r9
            com.bilibili.playset.detail.MultiTypeListDetailViewModel$toTop$1 r0 = (com.bilibili.playset.detail.MultiTypeListDetailViewModel$toTop$1) r0
            r12 = r0
            r0 = r12
            int r0 = r0.label
            r11 = r0
            r0 = r11
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r12
            r1 = r11
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r12
            r9 = r0
            goto L36
        L2c:
            com.bilibili.playset.detail.MultiTypeListDetailViewModel$toTop$1 r0 = new com.bilibili.playset.detail.MultiTypeListDetailViewModel$toTop$1
            r1 = r0
            r2 = r6
            r3 = r9
            r1.<init>(r2, r3)
            r9 = r0
        L36:
            r0 = r9
            java.lang.Object r0 = r0.result
            r13 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r12 = r0
            r0 = r9
            int r0 = r0.label
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L64
            r0 = r11
            r1 = 1
            if (r0 != r1) goto L5a
            r0 = r13
            kotlin.ResultKt.throwOnFailure(r0)
            goto L83
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L64:
            r0 = r13
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            r1 = 1
            r0.label = r1
            r0 = r6
            fs0.a r0 = r0.f84273c
            r1 = r7
            r2 = r10
            r3 = r9
            java.lang.Object r0 = r0.h(r1, r2, r3)
            r1 = r12
            if (r0 != r1) goto L83
            r0 = r12
            return r0
        L83:
            r0 = r6
            com.bilibili.playset.detail.MultiTypeListDetailViewModel$toTop$2 r1 = new com.bilibili.playset.detail.MultiTypeListDetailViewModel$toTop$2
            r2 = r1
            r3 = 0
            r2.<init>(r3)
            r0.N0(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.MultiTypeListDetailViewModel.V0(long, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object X0(long r9, java.lang.String r11, java.lang.String r12, java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.MultiTypeListDetailViewModel.X0(long, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void Y0(@NotNull Function1<? super com.bilibili.playset.detail.data.h, com.bilibili.playset.detail.data.h> function1) {
        Object value;
        MutableStateFlow<com.bilibili.playset.detail.data.h> mutableStateFlowP0 = P0();
        do {
            value = mutableStateFlowP0.getValue();
        } while (!mutableStateFlowP0.compareAndSet(value, (com.bilibili.playset.detail.data.h) function1.invoke(P0().getValue())));
    }

    @NotNull
    public final StateFlow<com.bilibili.playset.detail.data.h> getState() {
        return (StateFlow) this.f84279j.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        com.bilibili.playset.detail.data.b bVar = this.f84272b;
        bVar.f84456c = null;
        bVar.f84457d = null;
    }
}
