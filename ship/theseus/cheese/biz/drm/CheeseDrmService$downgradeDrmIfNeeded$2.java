package com.bilibili.ship.theseus.cheese.biz.drm;

import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ogv.infra.coroutine.c;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/drm/CheeseDrmService$downgradeDrmIfNeeded$2.class */
final class CheeseDrmService$downgradeDrmIfNeeded$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final CheeseDrmService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.drm.CheeseDrmService$downgradeDrmIfNeeded$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/drm/CheeseDrmService$downgradeDrmIfNeeded$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
        boolean Z$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.Z$0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseDrmService$downgradeDrmIfNeeded$2(CheeseDrmService cheeseDrmService, Continuation<? super CheeseDrmService$downgradeDrmIfNeeded$2> continuation) {
        super(2, continuation);
        this.this$0 = cheeseDrmService;
    }

    private static final Unit invokeSuspend$lambda$0(CheeseDrmService cheeseDrmService, c cVar) {
        cVar.b(new CheeseDrmService$downgradeDrmIfNeeded$2$2$1(cheeseDrmService, null));
        cVar.b(new CheeseDrmService$downgradeDrmIfNeeded$2$2$2(cheeseDrmService, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseDrmService$downgradeDrmIfNeeded$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Boolean> flowB = CompoundPlayStateProviderKt.b(this.this$0.f89260d);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (FlowKt.first(flowB, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        CheeseDrmService cheeseDrmService = this.this$0;
        this.label = 2;
        ArrayList arrayList = new ArrayList();
        invokeSuspend$lambda$0(cheeseDrmService, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
        if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
