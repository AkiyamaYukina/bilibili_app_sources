package com.bilibili.ship.theseus.ugc.weblayer;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$showNoteGuestPanel$2$1.class */
final class NoteFloatLayerService$showNoteGuestPanel$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final TheseusWebUIComponent $uiComponent;
    int label;
    final NoteFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFloatLayerService$showNoteGuestPanel$2$1(NoteFloatLayerService noteFloatLayerService, TheseusWebUIComponent theseusWebUIComponent, Continuation<? super NoteFloatLayerService$showNoteGuestPanel$2$1> continuation) {
        super(1, continuation);
        this.this$0 = noteFloatLayerService;
        this.$uiComponent = theseusWebUIComponent;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new NoteFloatLayerService$showNoteGuestPanel$2$1(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TheseusFloatLayerService theseusFloatLayerService = this.this$0.f98610p;
            TheseusWebUIComponent theseusWebUIComponent = this.$uiComponent;
            TheseusFloatLayerService.a aVar = new TheseusFloatLayerService.a(0, 0, null, 16);
            this.label = 1;
            if (theseusFloatLayerService.h(theseusWebUIComponent, aVar, this) == coroutine_suspended) {
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
