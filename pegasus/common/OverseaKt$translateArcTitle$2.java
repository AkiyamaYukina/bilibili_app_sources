package com.bilibili.pegasus.common;

import com.bapis.bilibili.app.translation.v1.TranslationBusiness;
import com.bapis.bilibili.app.translation.v1.TranslationMoss;
import com.bapis.bilibili.app.translation.v1.TranslationSimpleReply;
import com.bapis.bilibili.app.translation.v1.TranslationSimpleReq;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.pegasus.common.inline.PlayerParamsBuilderKt;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/OverseaKt$translateArcTitle$2.class */
final class OverseaKt$translateArcTitle$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final Kn0.c $params;
    final String $title;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverseaKt$translateArcTitle$2(Kn0.c cVar, String str, Continuation<? super OverseaKt$translateArcTitle$2> continuation) {
        super(2, continuation);
        this.$params = cVar;
        this.$title = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OverseaKt$translateArcTitle$2(this.$params, this.$title, continuation);
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
        String str = this.$params.b;
        String translatedText = null;
        if (str != null) {
            if (str.length() == 0 || this.$params.a == TranslationBusiness.UNRECOGNIZED) {
                translatedText = null;
            } else {
                TranslationSimpleReply translationSimpleReplyExecuteTranslationSimple = new TranslationMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).executeTranslationSimple(TranslationSimpleReq.newBuilder().setBizType(this.$params.a).setBusinessId(this.$params.b).addAllFields(this.$params.c).addText(this.$title).setSpmid(PlayerParamsBuilderKt.SPMID_RECOMMEND).build());
                translatedText = null;
                if (translationSimpleReplyExecuteTranslationSimple != null) {
                    List resultsOrBuilderList = translationSimpleReplyExecuteTranslationSimple.getResultsOrBuilderList();
                    translatedText = null;
                    if (resultsOrBuilderList != null) {
                        com.bapis.bilibili.app.translation.v1.b bVar = (com.bapis.bilibili.app.translation.v1.b) CollectionsKt.getOrNull(resultsOrBuilderList, 0);
                        translatedText = null;
                        if (bVar != null) {
                            translatedText = bVar.getTranslatedText();
                        }
                    }
                }
            }
        }
        return translatedText;
    }
}
