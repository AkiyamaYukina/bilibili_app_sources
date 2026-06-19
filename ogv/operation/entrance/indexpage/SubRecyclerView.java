package com.bilibili.ogv.operation.entrance.indexpage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/SubRecyclerView.class */
@Deprecated(message = "作用不明")
@StabilityInferred(parameters = 0)
public final class SubRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f70166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f70167b;

    public SubRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.f70166a = motionEvent.getX();
            this.f70167b = motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.f70166a);
            float fAbs2 = Math.abs(motionEvent.getY() - this.f70167b);
            double d7 = fAbs;
            int iRound = Math.round((float) ((Math.asin(((double) fAbs2) / Math.sqrt((d7 * d7) + ((double) (fAbs2 * fAbs2)))) / 3.141592653589793d) * ((double) 180)));
            if (fAbs2 > fAbs && iRound > 60) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
