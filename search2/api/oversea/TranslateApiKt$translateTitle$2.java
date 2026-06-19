package com.bilibili.search2.api.oversea;

import com.bapis.bilibili.app.translation.v1.TranslatedField;
import com.bapis.bilibili.app.translation.v1.TranslationBatchReply;
import com.bapis.bilibili.app.translation.v1.TranslationBatchReq;
import com.bapis.bilibili.app.translation.v1.TranslationMoss;
import com.bapis.bilibili.app.translation.v1.TranslationSimpleReq;
import com.bapis.bilibili.app.translation.v1.f;
import com.bilibili.lib.moss.api.CallOptions;
import java.util.ArrayList;
import java.util.Iterator;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/oversea/TranslateApiKt$translateTitle$2.class */
public final class TranslateApiKt$translateTitle$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends String>>, Object> {
    final List<a> $list;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TranslateApiKt$translateTitle$2(List<? extends a> list, Continuation<? super TranslateApiKt$translateTitle$2> continuation) {
        super(2, continuation);
        this.$list = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TranslateApiKt$translateTitle$2(this.$list, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objEmptyList;
        List resultsOrBuilderList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        TranslationBatchReq.b bVarNewBuilder = TranslationBatchReq.newBuilder();
        List<a> list = this.$list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (a aVar : list) {
            arrayList.add(TranslationSimpleReq.newBuilder().setBizType(aVar.getTranslateRequestParam().f86366a).setBusinessId(aVar.getTranslateRequestParam().f86367b).setSpmid(aVar.getTranslateRequestParam().f86369d).addFields(aVar.getTranslateRequestParam().f86368c).build());
        }
        TranslationBatchReply translationBatchReplyExecuteTranslationBatch = new TranslationMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).executeTranslationBatch(bVarNewBuilder.addAllItems(arrayList).build());
        if (translationBatchReplyExecuteTranslationBatch == null || (resultsOrBuilderList = translationBatchReplyExecuteTranslationBatch.getResultsOrBuilderList()) == null) {
            objEmptyList = CollectionsKt.emptyList();
        } else {
            List list2 = resultsOrBuilderList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (true) {
                objEmptyList = arrayList2;
                if (!it.hasNext()) {
                    break;
                }
                TranslatedField translatedField = (TranslatedField) CollectionsKt.firstOrNull(((f) it.next()).getResultsList());
                arrayList2.add(translatedField != null ? translatedField.getTranslatedText() : null);
            }
        }
        return objEmptyList;
    }
}
