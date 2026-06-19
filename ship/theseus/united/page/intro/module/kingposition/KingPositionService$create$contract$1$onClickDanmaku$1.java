package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$contract$1$onClickDanmaku$1.class */
final class KingPositionService$create$contract$1$onClickDanmaku$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<InterfaceC6295i> $danmakuView;
    int label;
    final KingPositionService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService$create$contract$1$onClickDanmaku$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$create$contract$1$onClickDanmaku$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<InterfaceC6295i> $danmakuView;
        boolean Z$0;
        int label;
        final KingPositionService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<InterfaceC6295i> objectRef, KingPositionService kingPositionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$danmakuView = objectRef;
            this.this$0 = kingPositionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$danmakuView, this.this$0, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i7 = this.Z$0 ? 2131847051 : 2131847478;
            InterfaceC6295i interfaceC6295i = (InterfaceC6295i) this.$danmakuView.element;
            if (interfaceC6295i != null) {
                interfaceC6295i.a(this.this$0.f100372b.getString(i7));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KingPositionService$create$contract$1$onClickDanmaku$1(KingPositionService kingPositionService, Ref.ObjectRef<InterfaceC6295i> objectRef, Continuation<? super KingPositionService$create$contract$1$onClickDanmaku$1> continuation) {
        super(2, continuation);
        this.this$0 = kingPositionService;
        this.$danmakuView = objectRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KingPositionService$create$contract$1$onClickDanmaku$1(this.this$0, this.$danmakuView, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            KingPositionService kingPositionService = this.this$0;
            MutableStateFlow<Boolean> mutableStateFlow = kingPositionService.f100391v.f99440B;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$danmakuView, kingPositionService, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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
