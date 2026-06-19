package com.bilibili.ship.theseus.cheese.player.layer;

import com.bilibili.lib.coroutineextension.j;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$showPayLayer$1.class */
public final class CheeseLayerService$showPayLayer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final CheeseLayerService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$showPayLayer$1$a.class */
    public static final class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheeseLayerService f90611a;

        public a(CheeseLayerService cheeseLayerService) {
            this.f90611a = cheeseLayerService;
        }

        public final void invoke() {
            CheeseLayerService cheeseLayerService = this.f90611a;
            cheeseLayerService.f90602t.c("CHEESE_LAYER_SUPPRESSION");
            cheeseLayerService.f90588e.setToastAvailable(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseLayerService$showPayLayer$1(CheeseLayerService cheeseLayerService, Continuation<? super CheeseLayerService$showPayLayer$1> continuation) {
        super(2, continuation);
        this.this$0 = cheeseLayerService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseLayerService$showPayLayer$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        j aVar;
        j jVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CheeseLayerService cheeseLayerService = this.this$0;
            cheeseLayerService.f90602t.a("CHEESE_LAYER_SUPPRESSION");
            cheeseLayerService.f90588e.setToastAvailable(false);
            aVar = new a(cheeseLayerService);
            try {
                this.L$0 = aVar;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                aVar.invoke();
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j jVar2 = (j) this.L$0;
            jVar = jVar2;
            try {
                ResultKt.throwOnFailure(obj);
                aVar = jVar2;
            } catch (Throwable th2) {
                aVar = jVar;
                th = th2;
                aVar.invoke();
                throw th;
            }
        }
        j jVar3 = aVar;
        jVar = aVar;
        throw new KotlinNothingValueException();
    }
}
