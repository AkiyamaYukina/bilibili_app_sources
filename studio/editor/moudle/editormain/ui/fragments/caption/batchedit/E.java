package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit;

import android.text.Editable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/E.class */
public final class E extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorStickerBatchEditFragmentV3 f106378a;

    public E(BiliEditorStickerBatchEditFragmentV3 biliEditorStickerBatchEditFragmentV3) {
        this.f106378a = biliEditorStickerBatchEditFragmentV3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        CaptionEditText captionEditText;
        super.onScrolled(recyclerView, i7, i8);
        BiliEditorStickerBatchEditFragmentV3 biliEditorStickerBatchEditFragmentV3 = this.f106378a;
        if (biliEditorStickerBatchEditFragmentV3.f106358o) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            int i9 = biliEditorStickerBatchEditFragmentV3.f106364u;
            if (iFindFirstVisibleItemPosition > i9 || i9 > iFindLastVisibleItemPosition || (captionEditText = biliEditorStickerBatchEditFragmentV3.f106363t) == null || captionEditText.hasFocus()) {
                int i10 = biliEditorStickerBatchEditFragmentV3.f106364u;
                if (iFindFirstVisibleItemPosition > i10 || i10 > iFindLastVisibleItemPosition) {
                    biliEditorStickerBatchEditFragmentV3.pf();
                    return;
                }
                return;
            }
            CaptionEditText captionEditText2 = biliEditorStickerBatchEditFragmentV3.f106363t;
            if (captionEditText2 == null) {
                captionEditText2 = null;
            }
            if (captionEditText2 != null) {
                int i11 = biliEditorStickerBatchEditFragmentV3.f106365v;
                Editable text = captionEditText2.getText();
                if (i11 <= (text != null ? text.length() : 0)) {
                    captionEditText2.setSelection(biliEditorStickerBatchEditFragmentV3.f106365v);
                    captionEditText2.requestFocus();
                }
            }
        }
    }
}
