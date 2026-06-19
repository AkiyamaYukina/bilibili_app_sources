package com.bilibili.studio.editor.moudle.musicv3.logic;

import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/logic/BiliEditorMusicBaseLogicV2$applyMusicAfterMusicDownloadV2$3.class */
public final class BiliEditorMusicBaseLogicV2$applyMusicAfterMusicDownloadV2$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final BMusic $bMusic;
    final Bgm $downloadBgmInfo;
    int label;
    final BiliEditorMusicBaseLogicV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorMusicBaseLogicV2$applyMusicAfterMusicDownloadV2$3(BiliEditorMusicBaseLogicV2 biliEditorMusicBaseLogicV2, Bgm bgm, BMusic bMusic, Continuation<? super BiliEditorMusicBaseLogicV2$applyMusicAfterMusicDownloadV2$3> continuation) {
        super(2, continuation);
        this.this$0 = biliEditorMusicBaseLogicV2;
        this.$downloadBgmInfo = bgm;
        this.$bMusic = bMusic;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorMusicBaseLogicV2$applyMusicAfterMusicDownloadV2$3(this.this$0, this.$downloadBgmInfo, this.$bMusic, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BiliEditorMusicBaseLogicV2 biliEditorMusicBaseLogicV2 = this.this$0;
            Bgm bgm = this.$downloadBgmInfo;
            BgmMissionInfo bgmMissionInfoTransformationBgmMissionInfo = bgm.transformationBgmMissionInfo(bgm);
            BMusic bMusic = this.$bMusic;
            this.label = 1;
            if (BiliEditorMusicBaseLogicV2.b(biliEditorMusicBaseLogicV2, bgmMissionInfoTransformationBgmMissionInfo, bMusic, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
