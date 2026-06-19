package com.bilibili.studio.videoeditor.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/BanNestScrollRecycleView.class */
public final class BanNestScrollRecycleView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f110272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f110273b;

    @JvmOverloads
    public BanNestScrollRecycleView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public BanNestScrollRecycleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public BanNestScrollRecycleView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f110272a = true;
        this.f110273b = true;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i7) {
        if (this.f110272a) {
            return true;
        }
        return super.canScrollHorizontally(i7);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i7) {
        if (this.f110273b) {
            return true;
        }
        return super.canScrollVertically(i7);
    }

    public final boolean getLimitHorizontalScroll() {
        return this.f110272a;
    }

    public final boolean getLimitVerticalScroll() {
        return this.f110273b;
    }

    public final void setLimitHorizontalScroll(boolean z6) {
        this.f110272a = z6;
    }

    public final void setLimitVerticalScroll(boolean z6) {
        this.f110273b = z6;
    }
}
