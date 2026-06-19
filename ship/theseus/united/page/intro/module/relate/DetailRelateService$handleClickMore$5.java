package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.content.Context;
import android.graphics.Rect;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$handleClickMore$5.class */
public final class DetailRelateService$handleClickMore$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Rect $anchorRect;
    int label;
    final DetailRelateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRelateService$handleClickMore$5(DetailRelateService detailRelateService, Rect rect, Continuation<? super DetailRelateService$handleClickMore$5> continuation) {
        super(2, continuation);
        this.this$0 = detailRelateService;
        this.$anchorRect = rect;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailRelateService$handleClickMore$5(this.this$0, this.$anchorRect, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.f100868c.isFinishing() || this.this$0.f100868c.isDestroyed()) {
                BLog.i("DetailRelateService$handleClickMore$5-invokeSuspend", "[theseus-united-DetailRelateService$handleClickMore$5-invokeSuspend] activity is finishing");
                return Unit.INSTANCE;
            }
            DetailRelateService detailRelateService = this.this$0;
            K0 k02 = detailRelateService.f100877m;
            Context context = detailRelateService.f100867b;
            Rect rect = this.$anchorRect;
            this.label = 1;
            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new TheseusDetailRelateMenuService$show$2(k02, context, rect, null), this);
            if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCoroutineScope = Unit.INSTANCE;
            }
            if (objCoroutineScope == coroutine_suspended) {
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
