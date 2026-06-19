package com.bilibili.ship.theseus.united.page.translate;

import com.bapis.bilibili.app.translation.v1.TranslationMoss;
import com.bapis.bilibili.app.translation.v1.TranslationSimpleReply;
import com.bapis.bilibili.app.translation.v1.TranslationSimpleReq;
import com.bilibili.lib.moss.api.CallOptions;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import tb0.h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/translate/DetailPageTranslationServiceKt$translateTitle$2.class */
final class DetailPageTranslationServiceKt$translateTitle$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TranslationSimpleReply>>, Object> {
    final TranslationSimpleReq $req;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailPageTranslationServiceKt$translateTitle$2(TranslationSimpleReq translationSimpleReq, Continuation<? super DetailPageTranslationServiceKt$translateTitle$2> continuation) {
        super(2, continuation);
        this.$req = translationSimpleReq;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailPageTranslationServiceKt$translateTitle$2(this.$req, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<TranslationSimpleReply>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TranslationSimpleReq translationSimpleReq = this.$req;
        h hVar = c.f103471a;
        try {
            Result.Companion companion = Result.Companion;
            obj2 = Result.constructor-impl(new TranslationMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).executeTranslationSimple(translationSimpleReq));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        return Result.box-impl(obj2);
    }
}
