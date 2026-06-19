package com.bilibili.upper.module.draft.vm;

import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.upper.module.draft.bean.DraftItemBean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/draft/vm/DraftViewModel$deleteDraft$1.class */
public final class DraftViewModel$deleteDraft$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final DraftItemBean $item;
    int label;
    final DraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraftViewModel$deleteDraft$1(DraftViewModel draftViewModel, DraftItemBean draftItemBean, Continuation<? super DraftViewModel$deleteDraft$1> continuation) {
        super(2, continuation);
        this.this$0 = draftViewModel;
        this.$item = draftItemBean;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DraftViewModel$deleteDraft$1(this.this$0, this.$item, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BiliTemplateEngineManager biliTemplateEngineManager = this.this$0.f113120c;
            if (biliTemplateEngineManager != null) {
                String str = this.$item.bCutDraftId;
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                this.label = 1;
                Object objF = biliTemplateEngineManager.f(str2, this);
                obj = objF;
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
