package com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition;

import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/BiliEditorTransitionViewModel$saveEditingTransition$1.class */
public final /* synthetic */ class BiliEditorTransitionViewModel$saveEditingTransition$1 extends FunctionReferenceImpl implements Function1<TransitionInfo, TransitionInfo> {
    public static final BiliEditorTransitionViewModel$saveEditingTransition$1 INSTANCE = new BiliEditorTransitionViewModel$saveEditingTransition$1();

    public BiliEditorTransitionViewModel$saveEditingTransition$1() {
        super(1, TransitionInfo.class, "clone", "clone()Lcom/bilibili/studio/videoeditor/ms/transition/TransitionInfo;", 0);
    }

    public final TransitionInfo invoke(TransitionInfo transitionInfo) {
        return transitionInfo.m10485clone();
    }
}
