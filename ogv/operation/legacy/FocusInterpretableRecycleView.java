package com.bilibili.ogv.operation.legacy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/legacy/FocusInterpretableRecycleView.class */
@StabilityInferred(parameters = 0)
public final class FocusInterpretableRecycleView extends RecyclerView {
    public FocusInterpretableRecycleView(@NotNull Context context) {
        super(context);
    }

    public FocusInterpretableRecycleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(@NotNull View view, @Nullable View view2) {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup) || ((ViewGroup) parent).getDescendantFocusability() == 393216) {
            return;
        }
        super.requestChildFocus(view, view2);
    }
}
