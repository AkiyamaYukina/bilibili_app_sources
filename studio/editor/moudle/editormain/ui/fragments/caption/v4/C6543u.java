package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/u.class */
public final class C6543u extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorCaptionFontV4Fragment f106631a;

    public C6543u(BiliEditorCaptionFontV4Fragment biliEditorCaptionFontV4Fragment) {
        this.f106631a = biliEditorCaptionFontV4Fragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        super.onScrolled(recyclerView, i7, i8);
        BiliEditorCaptionFontV4Fragment biliEditorCaptionFontV4Fragment = this.f106631a;
        Fragment parentFragment = biliEditorCaptionFontV4Fragment.getParentFragment();
        BiliEditorCaptionSettingV4Fragment biliEditorCaptionSettingV4Fragment = parentFragment instanceof BiliEditorCaptionSettingV4Fragment ? (BiliEditorCaptionSettingV4Fragment) parentFragment : null;
        if (biliEditorCaptionSettingV4Fragment == null || biliEditorCaptionSettingV4Fragment.f106506M != 1) {
            return;
        }
        biliEditorCaptionFontV4Fragment.rf();
    }
}
