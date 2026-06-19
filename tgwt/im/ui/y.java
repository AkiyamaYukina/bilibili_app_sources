package com.bilibili.tgwt.im.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.UIComponent;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/y.class */
public final class y extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f111329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TogetherWatchChangeRoomFragment f111330b;

    public y(RecyclerView recyclerView, TogetherWatchChangeRoomFragment togetherWatchChangeRoomFragment) {
        this.f111329a = recyclerView;
        this.f111330b = togetherWatchChangeRoomFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        RecyclerView recyclerView2 = this.f111329a;
        int iB = Uj0.c.b(12.0f, recyclerView2.getContext());
        TogetherWatchChangeRoomFragment togetherWatchChangeRoomFragment = this.f111330b;
        UIComponent<?> uIComponent = togetherWatchChangeRoomFragment.f111279e.get(childViewHolder.getBindingAdapterPosition());
        if (!(uIComponent instanceof com.bilibili.tgwt.square.r)) {
            if (uIComponent instanceof com.bilibili.tgwt.square.i) {
                rect.top = Uj0.c.b(12, recyclerView2.getContext());
                rect.bottom = Uj0.c.b(54, recyclerView2.getContext());
                return;
            }
            return;
        }
        int iB2 = Uj0.c.b(4.0f, recyclerView2.getContext());
        rect.bottom = Uj0.c.b(8.0f, recyclerView2.getContext());
        int bindingAdapterPosition = childViewHolder.getBindingAdapterPosition();
        Iterator<UIComponent<?>> it = togetherWatchChangeRoomFragment.f111279e.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getClass(), uIComponent.getClass())) {
                break;
            } else {
                i7++;
            }
        }
        if ((bindingAdapterPosition - i7) % 2 == 0) {
            rect.left = iB;
            rect.right = iB2;
        } else {
            rect.left = iB2;
            rect.right = iB;
        }
    }
}
