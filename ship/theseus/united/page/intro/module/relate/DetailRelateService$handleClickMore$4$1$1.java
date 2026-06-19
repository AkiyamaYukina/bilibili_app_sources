package com.bilibili.ship.theseus.united.page.intro.module.relate;

import com.bapis.bilibili.app.viewunite.common.TranslateButton;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$handleClickMore$4$1$1.class */
public final class DetailRelateService$handleClickMore$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final o0 $card;
    final Function2<TranslateButton, Continuation<? super Unit>, Object> $onClickTranslate;
    final String $reportString;
    final TranslateButton $this_run;
    int label;
    final DetailRelateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRelateService$handleClickMore$4$1$1(Function2<? super TranslateButton, ? super Continuation<? super Unit>, ? extends Object> function2, TranslateButton translateButton, DetailRelateService detailRelateService, o0 o0Var, String str, Continuation<? super DetailRelateService$handleClickMore$4$1$1> continuation) {
        super(2, continuation);
        this.$onClickTranslate = function2;
        this.$this_run = translateButton;
        this.this$0 = detailRelateService;
        this.$card = o0Var;
        this.$reportString = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailRelateService$handleClickMore$4$1$1(this.$onClickTranslate, this.$this_run, this.this$0, this.$card, this.$reportString, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Function2<TranslateButton, Continuation<? super Unit>, Object> function2 = this.$onClickTranslate;
            if (function2 != null) {
                TranslateButton translateButton = this.$this_run;
                this.label = 1;
                if (function2.invoke(translateButton, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.t(this.$card, this.$reportString);
        return Unit.INSTANCE;
    }
}
