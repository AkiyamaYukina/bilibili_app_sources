package com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule;

import Ly0.C2543b;
import Xz0.d;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.extension.f;
import com.bilibili.studio.videoeditor.extension.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/captionmodule/EditorCaptionUseCase$showMaterialTopFoldOrAddTrack$1.class */
public final /* synthetic */ class EditorCaptionUseCase$showMaterialTopFoldOrAddTrack$1 extends FunctionReferenceImpl implements Function1<BiliEditorMaterialMultiInfo, Unit> {
    public EditorCaptionUseCase$showMaterialTopFoldOrAddTrack$1(Object obj) {
        super(1, obj, EditorCaptionUseCase.class, "onClickCaptionFoldTrackClip", "onClickCaptionFoldTrackClip(Lcom/bilibili/studio/editor/moudle/editormain/track/beans/BiliEditorMaterialMultiInfo;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BiliEditorMaterialMultiInfo) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo) {
        EditorCaptionUseCase editorCaptionUseCase = (EditorCaptionUseCase) ((CallableReference) this).receiver;
        editorCaptionUseCase.getClass();
        BLog.e("MainPanelCaptionUseCase", "onClickCaptionFoldTrackClip fxInfo=" + biliEditorMaterialMultiInfo);
        EditVideoInfo editVideoInfo = editorCaptionUseCase.f107131a.f4806b;
        d dVar = d.f28458a;
        String strS = f.s(editVideoInfo);
        String strE = l.e(editVideoInfo);
        dVar.getClass();
        d.T("文字", strS, strE);
        C2543b c2543b = editorCaptionUseCase.h;
        c2543b.getClass();
        Oy0.d.a(c2543b.f14921d, (CaptionInfo) (biliEditorMaterialMultiInfo != null ? biliEditorMaterialMultiInfo.getAttachObj("key_caption_info") : null));
    }
}
