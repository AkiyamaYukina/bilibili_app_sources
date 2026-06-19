package com.bilibili.studio.editor.moudle.templatev2.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/ui/g.class */
public final class g extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorTemplateMusicFragment f108109a;

    public g(BiliEditorTemplateMusicFragment biliEditorTemplateMusicFragment) {
        this.f108109a = biliEditorTemplateMusicFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = (Rect) CollectionsKt.getOrNull(this.f108109a.f108094i, recyclerView.getChildAdapterPosition(view));
        if (rect2 != null) {
            rect.set(rect2);
        }
    }
}
