package com.bilibili.music.podcast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.recyclerview.widget.RecyclerView;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicContributeContainer.class */
public class MusicContributeContainer extends FrameLayout implements NestedScrollingParent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f67055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f67056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f67057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NestedScrollingParentHelper f67058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewPropertyAnimator f67059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f67060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f67061g;
    public final a h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicContributeContainer$a.class */
    public final class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicContributeContainer f67062a;

        public a(MusicContributeContainer musicContributeContainer) {
            this.f67062a = musicContributeContainer;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            super.onScrolled(recyclerView, i7, i8);
            MusicContributeContainer musicContributeContainer = this.f67062a;
            int measuredHeight = musicContributeContainer.f67055a.getMeasuredHeight();
            int i9 = measuredHeight / 2;
            int i10 = musicContributeContainer.f67060f + i8;
            musicContributeContainer.f67060f = i10;
            if (i10 > i9) {
                MusicContributeContainer.a(musicContributeContainer, -measuredHeight);
                musicContributeContainer.f67060f = 0;
            } else if (i10 < (-i9)) {
                MusicContributeContainer.a(musicContributeContainer, 0);
                musicContributeContainer.f67060f = 0;
            }
        }
    }

    public MusicContributeContainer(Context context) {
        super(context, null);
        this.h = new a(this);
    }

    public MusicContributeContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.h = new a(this);
    }

    public static void a(MusicContributeContainer musicContributeContainer, int i7) {
        if (musicContributeContainer.f67055a == null || musicContributeContainer.f67061g == i7) {
            return;
        }
        musicContributeContainer.f67061g = i7;
        ViewPropertyAnimator viewPropertyAnimator = musicContributeContainer.f67059e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimatorTranslationY = musicContributeContainer.f67055a.animate().setDuration(250L).setInterpolator(new AccelerateInterpolator()).translationY(i7);
        musicContributeContainer.f67059e = viewPropertyAnimatorTranslationY;
        viewPropertyAnimatorTranslationY.start();
    }

    private NestedScrollingParentHelper getParentHelper() {
        if (this.f67058d == null) {
            this.f67058d = new NestedScrollingParentHelper(this);
        }
        return this.f67058d;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return super.getNestedScrollAxes();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f67055a = findViewById(2131308293);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131310064);
        this.f67057c = recyclerView;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) this.f67055a.getLayoutParams()).topMargin + ((int) DpUtils.dp2px(getContext(), 40.0f)), this.f67057c.getPaddingRight(), this.f67057c.getPaddingBottom());
        this.f67057c.setClipToPadding(false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if (this.f67056b != view2) {
            this.f67056b = view2;
            RecyclerView recyclerView = this.f67057c;
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener(this.h);
            }
            View view3 = this.f67055a;
            if (view3 != null) {
                view3.setTranslationY(0.0f);
            }
            this.f67061g = 0;
            this.f67060f = 0;
        }
        RecyclerView recyclerView2 = this.f67057c;
        if (recyclerView2 == null) {
            return false;
        }
        recyclerView2.removeOnScrollListener(this.h);
        this.f67057c.addOnScrollListener(this.h);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onStopNestedScroll(View view) {
        super.onStopNestedScroll(view);
        RecyclerView recyclerView = this.f67057c;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.h);
        }
    }
}
