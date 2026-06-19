package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/o.class */
public final class C6538o extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorCaptionFlowerV4Fragment f106627a;

    public C6538o(BiliEditorCaptionFlowerV4Fragment biliEditorCaptionFlowerV4Fragment) {
        this.f106627a = biliEditorCaptionFlowerV4Fragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        super.onScrolled(recyclerView, i7, i8);
        BiliEditorCaptionFlowerV4Fragment biliEditorCaptionFlowerV4Fragment = this.f106627a;
        Fragment parentFragment = biliEditorCaptionFlowerV4Fragment.getParentFragment();
        BiliEditorCaptionSettingV4Fragment biliEditorCaptionSettingV4Fragment = parentFragment instanceof BiliEditorCaptionSettingV4Fragment ? (BiliEditorCaptionSettingV4Fragment) parentFragment : null;
        if (biliEditorCaptionSettingV4Fragment == null || biliEditorCaptionSettingV4Fragment.f106506M != 3) {
            return;
        }
        biliEditorCaptionFlowerV4Fragment.rf();
    }
}
