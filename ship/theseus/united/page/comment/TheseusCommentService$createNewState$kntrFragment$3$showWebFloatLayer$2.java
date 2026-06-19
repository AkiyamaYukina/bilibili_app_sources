package com.bilibili.ship.theseus.united.page.comment;

import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.playerbizcommonv2.utils.k;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$kntrFragment$3$showWebFloatLayer$2.class */
final class TheseusCommentService$createNewState$kntrFragment$3$showWebFloatLayer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $url;
    Object L$0;
    Object L$1;
    int label;
    final TheseusCommentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusCommentService$createNewState$kntrFragment$3$showWebFloatLayer$2(String str, TheseusCommentService theseusCommentService, Continuation<? super TheseusCommentService$createNewState$kntrFragment$3$showWebFloatLayer$2> continuation) {
        super(2, continuation);
        this.$url = str;
        this.this$0 = theseusCommentService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusCommentService$createNewState$kntrFragment$3$showWebFloatLayer$2(this.$url, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        TheseusCommentService theseusCommentService;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
        TheseusCommentService theseusCommentService2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean zB = k.b(this.$url);
                theseusCommentService = this.this$0;
                gVar2 = theseusCommentService.f99247t;
                String str = this.$url;
                gVar2.f(theseusCommentService);
                try {
                    WebFloatLayerService webFloatLayerService = theseusCommentService.f99240m;
                    TheseusWebUIComponent.a aVar = new TheseusWebUIComponent.a(zB, "", 0, 0, 0, !zB && k.a(str), 0, false, 0, DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.contentWebViewMaxWith$default(theseusCommentService.f99251x.b(), 0, 1, (Object) null)), false, false, null, 1015740);
                    this.L$0 = gVar2;
                    this.L$1 = theseusCommentService;
                    this.label = 1;
                    theseusCommentService2 = theseusCommentService;
                    gVar = gVar2;
                    if (webFloatLayerService.d(str, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    gVar = gVar2;
                    th = th;
                    gVar.j(theseusCommentService);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                TheseusCommentService theseusCommentService3 = (TheseusCommentService) this.L$1;
                gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
                theseusCommentService2 = theseusCommentService3;
                gVar = gVar2;
                ResultKt.throwOnFailure(obj);
                theseusCommentService = theseusCommentService3;
            }
            gVar2.j(theseusCommentService);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            theseusCommentService = theseusCommentService2;
        }
    }
}
