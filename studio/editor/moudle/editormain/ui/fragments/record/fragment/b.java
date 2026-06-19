package com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment;

import TB0.j0;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.DimenUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/fragment/b.class */
public final class b extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorRecordVoiceFragment f106924a;

    public b(BiliEditorRecordVoiceFragment biliEditorRecordVoiceFragment) {
        this.f106924a = biliEditorRecordVoiceFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        RecyclerView recyclerView2;
        RecyclerView.LayoutManager layoutManager;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            rect.left = DimenUtilsKt.dpToPx(11.0f);
            return;
        }
        j0 j0Var = this.f106924a.f106887g;
        if (childAdapterPosition == ((j0Var == null || (recyclerView2 = j0Var.f23839i) == null || (layoutManager = recyclerView2.getLayoutManager()) == null) ? 0 : layoutManager.getItemCount()) - 1) {
            rect.right = DimenUtilsKt.dpToPx(11.0f);
        } else {
            rect.left = DimenUtilsKt.dpToPx(2.0f);
            rect.right = DimenUtilsKt.dpToPx(2.0f);
        }
    }
}
