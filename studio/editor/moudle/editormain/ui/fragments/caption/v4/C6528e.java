package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/e.class */
public final class C6528e extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorCaptionAnimationListV4Fragment f106618a;

    public C6528e(BiliEditorCaptionAnimationListV4Fragment biliEditorCaptionAnimationListV4Fragment) {
        this.f106618a = biliEditorCaptionAnimationListV4Fragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        super.onScrolled(recyclerView, i7, i8);
        BiliEditorCaptionAnimationListV4Fragment biliEditorCaptionAnimationListV4Fragment = this.f106618a;
        Fragment parentFragment = biliEditorCaptionAnimationListV4Fragment.getParentFragment();
        BiliEditorCaptionAnimationV4Fragment biliEditorCaptionAnimationV4Fragment = parentFragment instanceof BiliEditorCaptionAnimationV4Fragment ? (BiliEditorCaptionAnimationV4Fragment) parentFragment : null;
        if (biliEditorCaptionAnimationV4Fragment != null) {
            Fragment parentFragment2 = biliEditorCaptionAnimationV4Fragment.getParentFragment();
            BiliEditorCaptionSettingV4Fragment biliEditorCaptionSettingV4Fragment = null;
            if (parentFragment2 instanceof BiliEditorCaptionSettingV4Fragment) {
                biliEditorCaptionSettingV4Fragment = (BiliEditorCaptionSettingV4Fragment) parentFragment2;
            }
            if (biliEditorCaptionSettingV4Fragment == null || biliEditorCaptionSettingV4Fragment.f106506M != 4) {
                return;
            }
            biliEditorCaptionAnimationListV4Fragment.sf();
        }
    }
}
