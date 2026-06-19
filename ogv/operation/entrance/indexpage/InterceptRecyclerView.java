package com.bilibili.ogv.operation.entrance.indexpage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/InterceptRecyclerView.class */
@Deprecated(message = "作用不明")
@StabilityInferred(parameters = 0)
public final class InterceptRecyclerView extends RecyclerView {
    public InterceptRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        return (numValueOf != null && numValueOf.intValue() == 0) ? super.onInterceptTouchEvent(motionEvent) : true;
    }
}
