package com.bilibili.pegasus.page;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/GraduationRecyclerView.class */
@StabilityInferred(parameters = 0)
public final class GraduationRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78287a;

    @JvmOverloads
    public GraduationRecyclerView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public GraduationRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public GraduationRecyclerView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i7, int i8) {
        int i9 = this.f78287a;
        int i10 = i8;
        if (i9 != 0) {
            boolean z6 = false;
            boolean z7 = i9 > 0;
            if (i8 > 0) {
                z6 = true;
            }
            i10 = i8;
            if (z7 != z6) {
                i10 = -i8;
            }
        }
        return super.fling(i7, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrollStateChanged(int i7) {
        super.onScrollStateChanged(i7);
        if (i7 == 1) {
            this.f78287a = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrolled(int i7, int i8) {
        super.onScrolled(i7, i8);
        if (getScrollState() != 1 || i8 == 0) {
            return;
        }
        this.f78287a = i8;
    }
}
