package com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.adapter;

import com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.adapter.b;
import com.bilibili.studio.videoeditor.ms.transition.TransitionSelectItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/adapter/BiliEditorTransItemAdapter$onBindViewHolder$2$1.class */
final /* synthetic */ class BiliEditorTransItemAdapter$onBindViewHolder$2$1 extends FunctionReferenceImpl implements Function2<TransitionSelectItem, Integer, Unit> {
    public BiliEditorTransItemAdapter$onBindViewHolder$2$1(Object obj) {
        super(2, obj, b.C1191b.class, "refreshDownloadProgress", "refreshDownloadProgress(Lcom/bilibili/studio/videoeditor/ms/transition/TransitionSelectItem;I)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((TransitionSelectItem) obj, ((Number) obj2).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(TransitionSelectItem transitionSelectItem, int i7) {
        ((b.C1191b) ((CallableReference) this).receiver).p0(transitionSelectItem, i7);
    }
}
