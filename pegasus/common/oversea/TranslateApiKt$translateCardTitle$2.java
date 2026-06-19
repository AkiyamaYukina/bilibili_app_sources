package com.bilibili.pegasus.common.oversea;

import com.bapis.bilibili.app.translation.v1.TranslationBusiness;
import com.bapis.bilibili.app.translation.v1.TranslationMoss;
import com.bapis.bilibili.app.translation.v1.TranslationSimpleReply;
import com.bapis.bilibili.app.translation.v1.TranslationSimpleReq;
import com.bapis.bilibili.app.translation.v1.b;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.pegasus.common.inline.PlayerParamsBuilderKt;
import ip0.g;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/oversea/TranslateApiKt$translateCardTitle$2.class */
final class TranslateApiKt$translateCardTitle$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final g $params;
    final String $title;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslateApiKt$translateCardTitle$2(g gVar, String str, Continuation<? super TranslateApiKt$translateCardTitle$2> continuation) {
        super(2, continuation);
        this.$params = gVar;
        this.$title = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TranslateApiKt$translateCardTitle$2(this.$params, this.$title, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$params.f122186b.length() == 0 || this.$params.f122185a == TranslationBusiness.UNRECOGNIZED) {
            return null;
        }
        TranslationSimpleReply translationSimpleReplyExecuteTranslationSimple = new TranslationMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).executeTranslationSimple(TranslationSimpleReq.newBuilder().setBizType(this.$params.f122185a).setBusinessId(this.$params.f122186b).addFields("title").addText(this.$title).setSpmid(PlayerParamsBuilderKt.SPMID_RECOMMEND).build());
        String translatedText = null;
        if (translationSimpleReplyExecuteTranslationSimple != null) {
            List resultsOrBuilderList = translationSimpleReplyExecuteTranslationSimple.getResultsOrBuilderList();
            translatedText = null;
            if (resultsOrBuilderList != null) {
                b bVar = (b) CollectionsKt.getOrNull(resultsOrBuilderList, 0);
                translatedText = null;
                if (bVar != null) {
                    translatedText = bVar.getTranslatedText();
                }
            }
        }
        return translatedText;
    }
}
