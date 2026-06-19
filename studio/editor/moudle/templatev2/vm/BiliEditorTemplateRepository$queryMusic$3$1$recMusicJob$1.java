package com.bilibili.studio.editor.moudle.templatev2.vm;

import com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository$queryMusic$3$1$recMusicJob$1.class */
public final class BiliEditorTemplateRepository$queryMusic$3$1$recMusicJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BiliEditorTemplateRepository.a>, Object> {
    final String $recMusicSids;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTemplateRepository$queryMusic$3$1$recMusicJob$1(String str, Continuation<? super BiliEditorTemplateRepository$queryMusic$3$1$recMusicJob$1> continuation) {
        super(2, continuation);
        this.$recMusicSids = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorTemplateRepository$queryMusic$3$1$recMusicJob$1(this.$recMusicSids, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BiliEditorTemplateRepository.a> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BiliEditorTemplateRepository biliEditorTemplateRepository = BiliEditorTemplateRepository.f108125a;
            String str = this.$recMusicSids;
            this.label = 1;
            Object objA = BiliEditorTemplateRepository.a(biliEditorTemplateRepository, str, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
