package com.bilibili.studio.editor.moudle.editormain.usecase.musicmodule;

import com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/musicmodule/MusicModuleUseCase$updateMaterialFoldTrack$1.class */
public final /* synthetic */ class MusicModuleUseCase$updateMaterialFoldTrack$1 extends FunctionReferenceImpl implements Function1<BiliEditorMaterialMultiInfo, Unit> {
    public MusicModuleUseCase$updateMaterialFoldTrack$1(Object obj) {
        super(1, obj, MusicModuleUseCase.class, "onClickFoldTrackClip", "onClickFoldTrackClip(Lcom/bilibili/studio/editor/moudle/editormain/track/beans/BiliEditorMaterialMultiInfo;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BiliEditorMaterialMultiInfo) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo) {
        ((MusicModuleUseCase) ((CallableReference) this).receiver).getClass();
    }
}
