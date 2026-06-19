package com.bilibili.ship.theseus.ugc.intro.tools;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/a.class */
@StabilityInferred(parameters = 0)
public final class a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97207a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f97209c;

    public a(int i7, int i8) {
        this.f97208b = i7;
        this.f97209c = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i7 = this.f97207a;
        int i8 = childAdapterPosition % i7;
        int i9 = this.f97208b;
        rect.left = (i8 * i9) / i7;
        rect.right = i9 - (((i8 + 1) * i9) / i7);
        if (childAdapterPosition >= i7) {
            rect.top = this.f97209c;
        }
    }
}
