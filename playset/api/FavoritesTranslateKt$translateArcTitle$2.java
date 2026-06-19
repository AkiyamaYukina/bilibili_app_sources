package com.bilibili.playset.api;

import com.bapis.bilibili.app.translation.v1.TranslationMoss;
import com.bapis.bilibili.app.translation.v1.TranslationSimpleReply;
import com.bapis.bilibili.app.translation.v1.TranslationSimpleReq;
import com.bilibili.lib.moss.api.CallOptions;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/FavoritesTranslateKt$translateArcTitle$2.class */
final class FavoritesTranslateKt$translateArcTitle$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final u $data;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoritesTranslateKt$translateArcTitle$2(u uVar, Continuation<? super FavoritesTranslateKt$translateArcTitle$2> continuation) {
        super(2, continuation);
        this.$data = uVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FavoritesTranslateKt$translateArcTitle$2(this.$data, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List resultsOrBuilderList;
        com.bapis.bilibili.app.translation.v1.b bVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TranslationSimpleReply translationSimpleReplyExecuteTranslationSimple = new TranslationMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).executeTranslationSimple(TranslationSimpleReq.newBuilder().setBizType(this.$data.getBizType()).setBusinessId(this.$data.getBizId()).addAllFields(CollectionsKt.listOf("title")).addText(this.$data.a()).setSpmid("main.my-fav.0.0").build());
        return (translationSimpleReplyExecuteTranslationSimple == null || (resultsOrBuilderList = translationSimpleReplyExecuteTranslationSimple.getResultsOrBuilderList()) == null || (bVar = (com.bapis.bilibili.app.translation.v1.b) CollectionsKt.getOrNull(resultsOrBuilderList, 0)) == null) ? null : bVar.getTranslatedText();
    }
}
