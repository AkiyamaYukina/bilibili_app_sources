package com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/material/foldetrack/BiliEditorMaterialFoldTrackView$eventControl$1.class */
public final /* synthetic */ class BiliEditorMaterialFoldTrackView$eventControl$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public BiliEditorMaterialFoldTrackView$eventControl$1(Object obj) {
        super(0, obj, BiliEditorMaterialFoldTrackView.class, "updateView", "updateView()V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m9912invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m9912invoke() {
        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView = (BiliEditorMaterialFoldTrackView) ((CallableReference) this).receiver;
        int i7 = BiliEditorMaterialFoldTrackView.h;
        biliEditorMaterialFoldTrackView.d();
    }
}
