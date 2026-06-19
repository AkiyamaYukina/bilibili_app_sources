package com.bilibili.playerbizcommonv2.view;

import Ir0.h;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/view/VerticalLinearLayoutManager.class */
@StabilityInferred(parameters = 0)
public final class VerticalLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final h f82091a;

    public VerticalLinearLayoutManager(@NotNull h hVar, @NotNull Context context) {
        super(context, 1, false);
        this.f82091a = hVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(@NotNull RecyclerView.State state, @NotNull int[] iArr) {
        h hVar = this.f82091a;
        int offscreenPageLimit = hVar.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.calculateExtraLayoutSpace(state, iArr);
            return;
        }
        RecyclerView recyclerView = hVar.getRecyclerView();
        int height = ((recyclerView.getHeight() - recyclerView.getPaddingTop()) - recyclerView.getPaddingBottom()) * offscreenPageLimit;
        iArr[0] = height;
        iArr[1] = height;
    }
}
