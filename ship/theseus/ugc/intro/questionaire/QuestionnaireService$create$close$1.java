package com.bilibili.ship.theseus.ugc.intro.questionaire;

import androidx.compose.runtime.MutableState;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/questionaire/QuestionnaireService$create$close$1.class */
final class QuestionnaireService$create$close$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final c $component;
    final Ref.BooleanRef $needShow;
    final MutableState<Boolean> $visible;
    int label;
    final QuestionnaireService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionnaireService$create$close$1(Ref.BooleanRef booleanRef, MutableState<Boolean> mutableState, QuestionnaireService questionnaireService, c cVar, Continuation<? super QuestionnaireService$create$close$1> continuation) {
        super(2, continuation);
        this.$needShow = booleanRef;
        this.$visible = mutableState;
        this.this$0 = questionnaireService;
        this.$component = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuestionnaireService$create$close$1(this.$needShow, this.$visible, this.this$0, this.$component, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.$needShow.element = false;
            this.label = 1;
            if (DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((IntroRecycleViewService) this.this$0.f97143c.get()).d(this.$component);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$visible.setValue(Boxing.boxBoolean(false));
        this.label = 2;
        if (DelayKt.delay(500L, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        ((IntroRecycleViewService) this.this$0.f97143c.get()).d(this.$component);
        return Unit.INSTANCE;
    }
}
