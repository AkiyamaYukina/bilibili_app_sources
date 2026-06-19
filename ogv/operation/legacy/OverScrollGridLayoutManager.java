package com.bilibili.ogv.operation.legacy;

import Pk0.j;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/legacy/OverScrollGridLayoutManager.class */
@StabilityInferred(parameters = 0)
public final class OverScrollGridLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public j f70296a;

    public OverScrollGridLayoutManager(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i7, @Nullable RecyclerView.Recycler recycler, @Nullable RecyclerView.State state) {
        int iScrollVerticallyBy = super.scrollVerticallyBy(i7, recycler, state);
        int i8 = i7 - iScrollVerticallyBy;
        if (i8 > 0) {
            if (this.f70296a != null) {
                Math.abs(i8);
            }
        } else if (i8 < 0 && this.f70296a != null) {
            Math.abs(i8);
        }
        return iScrollVerticallyBy;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i7, @Nullable RecyclerView.Recycler recycler, @Nullable RecyclerView.State state) {
        int iScrollVerticallyBy = super.scrollVerticallyBy(i7, recycler, state);
        int i8 = i7 - iScrollVerticallyBy;
        if (i8 > 0) {
            j jVar = this.f70296a;
            if (jVar != null) {
                Math.abs(i8);
                jVar.f17273c = jVar.f17272b ? findLastVisibleItemPosition() : findLastCompletelyVisibleItemPosition();
                int childCount = getChildCount();
                int itemCount = getItemCount();
                if (childCount > 0 && jVar.f17273c >= itemCount - jVar.f17271a) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (jElapsedRealtime - jVar.f17274d >= 500) {
                        jVar.f17274d = jElapsedRealtime;
                        jVar.f18967e.g2();
                    }
                }
            }
        } else if (i8 < 0 && this.f70296a != null) {
            Math.abs(i8);
        }
        return iScrollVerticallyBy;
    }
}
