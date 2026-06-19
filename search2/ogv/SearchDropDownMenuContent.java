package com.bilibili.search2.ogv;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.dropdownmenu.DropDownMenuContent;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/ogv/SearchDropDownMenuContent.class */
@StabilityInferred(parameters = 0)
public final class SearchDropDownMenuContent extends DropDownMenuContent {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f86947i = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final View f86948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Animation f86949g;

    @NotNull
    public final Animation h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/ogv/SearchDropDownMenuContent$a.class */
    public static final class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchDropDownMenuContent f86950a;

        public a(SearchDropDownMenuContent searchDropDownMenuContent) {
            this.f86950a = searchDropDownMenuContent;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SearchDropDownMenuContent searchDropDownMenuContent = this.f86950a;
            int i7 = SearchDropDownMenuContent.f86947i;
            searchDropDownMenuContent.getClass();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            SearchDropDownMenuContent searchDropDownMenuContent = this.f86950a;
            int i7 = SearchDropDownMenuContent.f86947i;
            searchDropDownMenuContent.getClass();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/ogv/SearchDropDownMenuContent$b.class */
    public static final class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchDropDownMenuContent f86951a;

        public b(SearchDropDownMenuContent searchDropDownMenuContent) {
            this.f86951a = searchDropDownMenuContent;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SearchDropDownMenuContent searchDropDownMenuContent = this.f86951a;
            int i7 = SearchDropDownMenuContent.f86947i;
            searchDropDownMenuContent.getClass();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            SearchDropDownMenuContent searchDropDownMenuContent = this.f86951a;
            int i7 = SearchDropDownMenuContent.f86947i;
            searchDropDownMenuContent.getClass();
        }
    }

    @JvmOverloads
    public SearchDropDownMenuContent(@Nullable Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public SearchDropDownMenuContent(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchDropDownMenuContent(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f86948f = findViewById(2131306619);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setDuration(300L);
        translateAnimation.setFillAfter(false);
        this.f86949g = translateAnimation;
        translateAnimation.setAnimationListener(new a(this));
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation2.setDuration(200L);
        translateAnimation2.setFillAfter(false);
        this.h = translateAnimation2;
        translateAnimation2.setAnimationListener(new b(this));
    }

    public final int getLayoutColor() {
        return ((DropDownMenuContent) this).e;
    }
}
