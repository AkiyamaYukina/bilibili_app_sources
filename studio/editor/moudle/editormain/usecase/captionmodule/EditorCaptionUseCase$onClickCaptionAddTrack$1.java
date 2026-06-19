package com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule;

import Ly0.C2543b;
import Oy0.d;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/captionmodule/EditorCaptionUseCase$onClickCaptionAddTrack$1.class */
public final /* synthetic */ class EditorCaptionUseCase$onClickCaptionAddTrack$1 extends FunctionReferenceImpl implements Function1<CaptionInfo, Unit> {
    public EditorCaptionUseCase$onClickCaptionAddTrack$1(Object obj) {
        super(1, obj, C2543b.class, "onAsrRecognitionSuccess", "onAsrRecognitionSuccess(Lcom/bilibili/studio/editor/moudle/caption/v1/CaptionInfo;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CaptionInfo) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(CaptionInfo captionInfo) {
        d.a(((C2543b) ((CallableReference) this).receiver).f14921d, captionInfo);
    }
}
