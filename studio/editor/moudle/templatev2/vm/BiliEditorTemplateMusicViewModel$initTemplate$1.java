package com.bilibili.studio.editor.moudle.templatev2.vm;

import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabBean;
import com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateMusicViewModel$initTemplate$1.class */
public final class BiliEditorTemplateMusicViewModel$initTemplate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final EditVideoInfo $editVideoInfo;
    final boolean $isRefresh;
    int label;
    final BiliEditorTemplateMusicViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTemplateMusicViewModel$initTemplate$1(EditVideoInfo editVideoInfo, boolean z6, BiliEditorTemplateMusicViewModel biliEditorTemplateMusicViewModel, Continuation<? super BiliEditorTemplateMusicViewModel$initTemplate$1> continuation) {
        super(2, continuation);
        this.$editVideoInfo = editVideoInfo;
        this.$isRefresh = z6;
        this.this$0 = biliEditorTemplateMusicViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorTemplateMusicViewModel$initTemplate$1(this.$editVideoInfo, this.$isRefresh, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int i7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            ResultKt.throwOnFailure(obj);
            EditVideoInfo editVideoInfo = this.$editVideoInfo;
            if ((editVideoInfo != null ? editVideoInfo.getIntelligenceInfo() : null) != null) {
                i7 = 1;
            } else {
                EditVideoInfo editVideoInfo2 = this.$editVideoInfo;
                String imageLabels = null;
                if (editVideoInfo2 != null) {
                    imageLabels = editVideoInfo2.getImageLabels();
                }
                i7 = (imageLabels == null || imageLabels.length() == 0) ? 2 : 3;
            }
            BiliEditorTemplateRepository biliEditorTemplateRepository = BiliEditorTemplateRepository.f108125a;
            EditVideoInfo editVideoInfo3 = this.$editVideoInfo;
            boolean z6 = this.$isRefresh;
            this.label = 1;
            Object objH = BiliEditorTemplateRepository.h(editVideoInfo3, i7, null, z6, this, 4);
            obj = objH;
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliEditorTemplateMusicViewModel biliEditorTemplateMusicViewModel = this.this$0;
        EditVideoInfo editVideoInfo4 = this.$editVideoInfo;
        List<? extends EditorTemplateTabBean> list = ((BiliEditorTemplateRepository.d) obj).f108144c;
        int i9 = BiliEditorTemplateMusicViewModel.f108113o;
        biliEditorTemplateMusicViewModel.P0(editVideoInfo4, list);
        return Unit.INSTANCE;
    }
}
