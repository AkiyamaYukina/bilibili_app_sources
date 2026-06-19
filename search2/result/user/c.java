package com.bilibili.search2.result.user;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.search2.utils.B;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/user/c.class */
@StabilityInferred(parameters = 0)
public final class c extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88541a = B.C(12.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88542b = B.C(8.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88543c = B.C(8.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f88544d = B.C(16.0f);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            rect.top = childAdapterPosition == 0 ? this.f88541a : this.f88542b;
            rect.bottom = childAdapterPosition == itemCount - 1 ? this.f88544d : this.f88543c;
        }
    }
}
