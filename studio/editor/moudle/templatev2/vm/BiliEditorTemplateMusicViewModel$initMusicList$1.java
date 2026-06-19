package com.bilibili.studio.editor.moudle.templatev2.vm;

import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateMusicViewModel$initMusicList$1.class */
final class BiliEditorTemplateMusicViewModel$initMusicList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final EditVideoInfo $editVideoInfo;
    final boolean $isRefresh;
    int label;
    final BiliEditorTemplateMusicViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTemplateMusicViewModel$initMusicList$1(EditVideoInfo editVideoInfo, boolean z6, BiliEditorTemplateMusicViewModel biliEditorTemplateMusicViewModel, Continuation<? super BiliEditorTemplateMusicViewModel$initMusicList$1> continuation) {
        super(2, continuation);
        this.$editVideoInfo = editVideoInfo;
        this.$isRefresh = z6;
        this.this$0 = biliEditorTemplateMusicViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorTemplateMusicViewModel$initMusicList$1(this.$editVideoInfo, this.$isRefresh, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BiliEditorTemplateRepository biliEditorTemplateRepository = BiliEditorTemplateRepository.f108125a;
            EditVideoInfo editVideoInfo = this.$editVideoInfo;
            boolean z6 = this.$isRefresh;
            this.label = 1;
            Object objG = biliEditorTemplateRepository.g(editVideoInfo, z6, this);
            obj = objG;
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Pair pair = (Pair) obj;
        BiliEditorTemplateRepository.c cVar = (BiliEditorTemplateRepository.c) pair.component1();
        BiliEditorTemplateRepository.a aVar = (BiliEditorTemplateRepository.a) pair.component2();
        BiliEditorTemplateMusicViewModel biliEditorTemplateMusicViewModel = this.this$0;
        EditVideoInfo editVideoInfo2 = this.$editVideoInfo;
        List<EditorMusicItem> list = cVar.f108141b;
        List<EditorMusicItem> list2 = aVar.f108135b;
        int i8 = BiliEditorTemplateMusicViewModel.f108113o;
        biliEditorTemplateMusicViewModel.O0(editVideoInfo2, list, list2);
        return Unit.INSTANCE;
    }
}
