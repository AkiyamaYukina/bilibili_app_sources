package com.bilibili.ship.theseus.cheese.player.layer;

import com.bilibili.lib.coroutineextension.j;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$keepCheeseCustomDanmakuClick$1.class */
final class CheeseLayerService$keepCheeseCustomDanmakuClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function0<Unit> $block;
    Object L$0;
    int label;
    final CheeseLayerService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$keepCheeseCustomDanmakuClick$1$a.class */
    public static final class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheeseLayerService f90610a;

        public a(CheeseLayerService cheeseLayerService) {
            this.f90610a = cheeseLayerService;
        }

        public final void invoke() {
            this.f90610a.f90596n.f99386w = null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseLayerService$keepCheeseCustomDanmakuClick$1(CheeseLayerService cheeseLayerService, Function0<Unit> function0, Continuation<? super CheeseLayerService$keepCheeseCustomDanmakuClick$1> continuation) {
        super(2, continuation);
        this.this$0 = cheeseLayerService;
        this.$block = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseLayerService$keepCheeseCustomDanmakuClick$1(this.this$0, this.$block, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        j aVar;
        j jVar;
        j jVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CheeseLayerService cheeseLayerService = this.this$0;
            cheeseLayerService.f90596n.f99386w = this.$block;
            aVar = new a(cheeseLayerService);
            try {
                this.L$0 = aVar;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                jVar = aVar;
                jVar.invoke();
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j jVar3 = (j) this.L$0;
            jVar2 = jVar3;
            try {
                ResultKt.throwOnFailure(obj);
                aVar = jVar3;
            } catch (Throwable th2) {
                jVar = jVar2;
                th = th2;
                jVar.invoke();
                throw th;
            }
        }
        j jVar4 = aVar;
        jVar2 = aVar;
        throw new KotlinNothingValueException();
    }
}
