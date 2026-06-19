package com.bilibili.ogv.operation3.module.switchit;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.Iterator;
import java.util.List;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/switchit/CreateSwitchableModel$invoke$1.class */
public final class CreateSwitchableModel$invoke$1 implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableSharedFlow<List<com.bilibili.ogv.operation3.module.operablecard.a>> f71419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f71420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<com.bilibili.ogv.operation3.module.operablecard.a> f71421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedFlow<List<com.bilibili.ogv.operation3.module.operablecard.a>> f71422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableState f71423e;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.switchit.CreateSwitchableModel$invoke$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/switchit/CreateSwitchableModel$invoke$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<Iterator<List<com.bilibili.ogv.operation3.module.operablecard.a>>> $cyclicCards;
        int label;
        final CreateSwitchableModel$invoke$1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<Iterator<List<com.bilibili.ogv.operation3.module.operablecard.a>>> objectRef, CreateSwitchableModel$invoke$1 createSwitchableModel$invoke$1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cyclicCards = objectRef;
            this.this$0 = createSwitchableModel$invoke$1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$cyclicCards, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (((Iterator) this.$cyclicCards.element).hasNext()) {
                    MutableSharedFlow<List<com.bilibili.ogv.operation3.module.operablecard.a>> mutableSharedFlow = this.this$0.f71419a;
                    Object next = ((Iterator) this.$cyclicCards.element).next();
                    this.label = 1;
                    if (mutableSharedFlow.emit(next, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public CreateSwitchableModel$invoke$1(KomponentScope<?> komponentScope, List<com.bilibili.ogv.operation3.module.operablecard.a> list, Ref.ObjectRef<Iterator<List<com.bilibili.ogv.operation3.module.operablecard.a>>> objectRef, g gVar, b bVar, Toaster toaster) {
        MutableSharedFlow<List<com.bilibili.ogv.operation3.module.operablecard.a>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, (BufferOverflow) null, 6, (Object) null);
        this.f71419a = mutableSharedFlowMutableSharedFlow$default;
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(objectRef, this, null), 3, (Object) null);
        this.f71420b = new a(gVar, this, komponentScope, bVar, objectRef, toaster);
        this.f71421c = list;
        this.f71422d = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.f71423e = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.ogv.operation3.module.switchit.h
    public final boolean a() {
        return ((Boolean) this.f71423e.getValue()).booleanValue();
    }

    @Override // com.bilibili.ogv.operation3.module.switchit.h
    public final SharedFlow<List<com.bilibili.ogv.operation3.module.operablecard.a>> b() {
        return this.f71422d;
    }

    @Override // com.bilibili.ogv.operation3.module.switchit.h
    public final a c() {
        return this.f71420b;
    }
}
