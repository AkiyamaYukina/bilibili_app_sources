package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit;

import android.text.Editable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/k.class */
public final class k extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorCaptionEditFragmentV3 f106421a;

    public k(BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3) {
        this.f106421a = biliEditorCaptionEditFragmentV3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        CaptionEditText captionEditText;
        super.onScrolled(recyclerView, i7, i8);
        BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3 = this.f106421a;
        if (biliEditorCaptionEditFragmentV3.f106325n) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            int i9 = biliEditorCaptionEditFragmentV3.f106331t;
            if (iFindFirstVisibleItemPosition > i9 || i9 > iFindLastVisibleItemPosition || (captionEditText = biliEditorCaptionEditFragmentV3.f106330s) == null || captionEditText.hasFocus()) {
                int i10 = biliEditorCaptionEditFragmentV3.f106331t;
                if (iFindFirstVisibleItemPosition > i10 || i10 > iFindLastVisibleItemPosition) {
                    biliEditorCaptionEditFragmentV3.sf();
                    return;
                }
                return;
            }
            CaptionEditText captionEditText2 = biliEditorCaptionEditFragmentV3.f106330s;
            if (captionEditText2 == null) {
                captionEditText2 = null;
            }
            if (captionEditText2 != null) {
                int i11 = biliEditorCaptionEditFragmentV3.f106332u;
                Editable text = captionEditText2.getText();
                if (i11 <= (text != null ? text.length() : 0)) {
                    captionEditText2.setSelection(biliEditorCaptionEditFragmentV3.f106332u);
                    captionEditText2.requestFocus();
                }
            }
        }
    }
}
