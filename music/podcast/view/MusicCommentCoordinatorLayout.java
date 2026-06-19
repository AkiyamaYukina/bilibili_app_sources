package com.bilibili.music.podcast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicCommentCoordinatorLayout.class */
public final class MusicCommentCoordinatorLayout extends CoordinatorLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public a f67054a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicCommentCoordinatorLayout$a.class */
    public interface a {
        boolean a();
    }

    public MusicCommentCoordinatorLayout(@NotNull Context context) {
        this(context, null);
    }

    public MusicCommentCoordinatorLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        a aVar;
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            a aVar2 = this.f67054a;
            if (aVar2 != null && aVar2.a()) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            a aVar3 = this.f67054a;
            if (aVar3 != null && aVar3.a()) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 1 && (aVar = this.f67054a) != null && aVar.a()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setMusicStateCallback(@NotNull a aVar) {
        this.f67054a = aVar;
    }
}
