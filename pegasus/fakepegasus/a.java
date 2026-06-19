package com.bilibili.pegasus.fakepegasus;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.DimenUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/a.class */
@StabilityInferred(parameters = 0)
public final class a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f77446a;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        int iDpToPx = DimenUtilsKt.dpToPx(this.f77446a);
        int i7 = iDpToPx / 2;
        rect.left = i7;
        rect.right = i7;
        rect.top = iDpToPx;
        rect.bottom = 0;
    }
}
