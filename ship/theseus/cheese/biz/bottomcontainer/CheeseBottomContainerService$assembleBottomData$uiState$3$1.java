package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import androidx.compose.ui.text.font.C4496a;
import au0.C4911a;
import com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$assembleBottomData$uiState$3$1.class */
final class CheeseBottomContainerService$assembleBottomData$uiState$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final CheeseBottomContainerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService$assembleBottomData$uiState$3$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$assembleBottomData$uiState$3$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseBottomContainerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseBottomContainerService cheeseBottomContainerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseBottomContainerService;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CheeseBottomContainerService.a aVar = (CheeseBottomContainerService.a) this.this$0.f89019C.getValue();
                    C4911a c4911a = this.this$0.f89029f;
                    String str = c4911a.f54238b;
                    String str2 = c4911a.f54247l;
                    long j7 = c4911a.f54237a;
                    this.label = 1;
                    if (aVar.cheeseConsult(str, str2, String.valueOf(j7), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e7) {
                com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-cheese-CheeseBottomContainerService$assembleBottomData$uiState$3$1$1-invokeSuspend] ", C4496a.a("consultServiceUnavailable, ", e7.getMessage()), "CheeseBottomContainerService$assembleBottomData$uiState$3$1$1-invokeSuspend", (Throwable) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseBottomContainerService$assembleBottomData$uiState$3$1(CheeseBottomContainerService cheeseBottomContainerService, Continuation<? super CheeseBottomContainerService$assembleBottomData$uiState$3$1> continuation) {
        super(2, continuation);
        this.this$0 = cheeseBottomContainerService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseBottomContainerService$assembleBottomData$uiState$3$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
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
