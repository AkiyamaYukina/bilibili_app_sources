package com.bilibili.pegasus.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/LoadMoreRecyclerView.class */
@StabilityInferred(parameters = 0)
public final class LoadMoreRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f79180b;

    @JvmOverloads
    public LoadMoreRecyclerView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public LoadMoreRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public LoadMoreRecyclerView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f79179a = 3;
    }

    @Nullable
    public final Function0<Unit> getOnLoadMoreListener() {
        return this.f79180b;
    }

    public final int getPrefetchDistance() {
        return this.f79179a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onChildAttachedToWindow(@NotNull View view) {
        super.onChildAttachedToWindow(view);
        if (getAdapter() == null || this.f79180b == null || getChildAdapterPosition(view) < (getAdapter().getItemCount() - 1) - this.f79179a) {
            return;
        }
        this.f79180b.invoke();
    }

    public final void setOnLoadMoreListener(@Nullable Function0<Unit> function0) {
        this.f79180b = function0;
    }

    public final void setPrefetchDistance(int i7) {
        this.f79179a = i7;
    }
}
