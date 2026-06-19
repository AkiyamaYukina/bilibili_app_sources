package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService;
import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$2;
import com.bilibili.ship.theseus.united.page.interactvideo.model.InteractiveVideoPreSelectionNode$Request;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$runNode$2$8$2.class */
public final class TheseusInteractVideoService$runNode$2$8$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final TheseusInteractVideoService.a $action;
    final TheseusInteractVideoService$runNode$2.a $playable;
    int label;
    final TheseusInteractVideoService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$2$8$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$runNode$2$8$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Boolean>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Boolean> continuation) {
            return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((PlayerAvailability) this.L$0) == PlayerAvailability.COMPLETED);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusInteractVideoService$runNode$2$8$2(TheseusInteractVideoService$runNode$2.a aVar, TheseusInteractVideoService.a aVar2, TheseusInteractVideoService theseusInteractVideoService, Continuation<? super TheseusInteractVideoService$runNode$2$8$2> continuation) {
        super(2, continuation);
        this.$playable = aVar;
        this.$action = aVar2;
        this.this$0 = theseusInteractVideoService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusInteractVideoService$runNode$2$8$2(this.$playable, this.$action, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<PlayerAvailability> flowD = this.$playable.f99945a.d();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (FlowKt.first(flowD, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        InteractiveVideoPreSelectionNode$Request interactiveVideoPreSelectionNode$Request = ((TheseusInteractVideoService.a.g) this.$action).f99918a;
        Long longOrNull = StringsKt.toLongOrNull(interactiveVideoPreSelectionNode$Request.getEdgeId());
        long jLongValue = 0;
        long jLongValue2 = longOrNull != null ? longOrNull.longValue() : 0L;
        Long longOrNull2 = StringsKt.toLongOrNull(interactiveVideoPreSelectionNode$Request.getCid());
        if (longOrNull2 != null) {
            jLongValue = longOrNull2.longValue();
        }
        String choices = interactiveVideoPreSelectionNode$Request.getChoices();
        String str = choices;
        if (choices == null) {
            str = "";
        }
        TheseusInteractVideoService.c(this.this$0, jLongValue2, jLongValue, str);
        return Unit.INSTANCE;
    }
}
