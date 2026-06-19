package com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment;

import com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.bean.RecordVoiceCategory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/fragment/BiliEditorRecordVoiceFragment$initCategoryRecycleView$1.class */
final /* synthetic */ class BiliEditorRecordVoiceFragment$initCategoryRecycleView$1 extends AdaptedFunctionReference implements Function1<RecordVoiceCategory, Unit> {
    public BiliEditorRecordVoiceFragment$initCategoryRecycleView$1(Object obj) {
        super(1, obj, BiliEditorRecordVoiceFragment.class, "onCategoryItemClick", "onCategoryItemClick(Lcom/bilibili/studio/editor/moudle/editormain/ui/fragments/record/bean/RecordVoiceCategory;Ljava/lang/String;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RecordVoiceCategory) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(RecordVoiceCategory recordVoiceCategory) {
        ((BiliEditorRecordVoiceFragment) ((AdaptedFunctionReference) this).receiver).lf(recordVoiceCategory, "");
    }
}
