package com.bilibili.music.podcast.utils.comment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/comment/MusicCommentBehavior.class */
public final class MusicCommentBehavior extends BottomSheetBehavior<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f66969a;

    public MusicCommentBehavior(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66969a = true;
    }

    public boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2, @NotNull View view3, int i7, int i8) {
        return !this.f66969a ? false : super.onStartNestedScroll(coordinatorLayout, view, view2, view3, i7, i8);
    }

    public final void setNestScrollEnable(boolean z6) {
        this.f66969a = z6;
    }
}
