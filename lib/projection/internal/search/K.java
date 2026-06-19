package com.bilibili.lib.projection.internal.search;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/K.class */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Group f63541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Group f63542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Group f63543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ImageView f63544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f63545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f63546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public TextView f63547g;

    @Nullable
    public TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public TextView f63548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public RecyclerView f63549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public LinearLayout f63550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public com.bilibili.lib.projection.internal.widget.a f63551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public PageState f63552m;

    public final void a(@NotNull PageState pageState, boolean z6) {
        PageState pageState2;
        TextView textView;
        PageState pageState3 = PageState.SHOW;
        if (pageState == pageState3 && this.f63552m != pageState3) {
            TextView textView2 = this.f63547g;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.h;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            Group group = this.f63541a;
            if (group != null) {
                group.setVisibility(0);
            }
            this.f63552m = pageState;
            return;
        }
        PageState pageState4 = PageState.DISMISS;
        if (pageState == pageState4 && this.f63552m != pageState4) {
            TextView textView4 = this.f63547g;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            TextView textView5 = this.h;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            Group group2 = this.f63541a;
            if (group2 != null) {
                group2.setVisibility(8);
            }
            Group group3 = this.f63542b;
            if (group3 != null) {
                group3.setVisibility(8);
            }
            RecyclerView recyclerView = this.f63549j;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            Group group4 = this.f63543c;
            if (group4 != null) {
                group4.setVisibility(8);
            }
            this.f63552m = pageState;
            return;
        }
        PageState pageState5 = PageState.SEARCHING;
        if (pageState == pageState5 && this.f63552m != pageState5) {
            ImageView imageView = this.f63544d;
            if (imageView != null) {
                imageView.setImageResource(2131238611);
            }
            TextView textView6 = this.f63547g;
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
            TextView textView7 = this.h;
            if (textView7 != null) {
                textView7.setVisibility(0);
            }
            Group group5 = this.f63542b;
            if (group5 != null) {
                group5.setVisibility(0);
            }
            RecyclerView recyclerView2 = this.f63549j;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(8);
            }
            Group group6 = this.f63543c;
            if (group6 != null) {
                group6.setVisibility(8);
            }
            this.f63552m = pageState;
            return;
        }
        PageState pageState6 = PageState.FOUND;
        if (pageState == pageState6 && this.f63552m != pageState6) {
            ImageView imageView2 = this.f63544d;
            if (imageView2 != null) {
                imageView2.setImageResource(2131238611);
            }
            TextView textView8 = this.f63547g;
            if (textView8 != null) {
                textView8.setVisibility(0);
            }
            TextView textView9 = this.h;
            if (textView9 != null) {
                textView9.setVisibility(0);
            }
            Group group7 = this.f63542b;
            if (group7 != null) {
                group7.setVisibility(8);
            }
            RecyclerView recyclerView3 = this.f63549j;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(0);
            }
            Group group8 = this.f63543c;
            if (group8 != null) {
                group8.setVisibility(8);
            }
            this.f63552m = pageState;
            return;
        }
        PageState pageState7 = PageState.CONNECTED;
        if (pageState != pageState7 || (pageState2 = this.f63552m) == pageState7) {
            return;
        }
        boolean z7 = pageState2 == pageState6;
        ImageView imageView3 = this.f63544d;
        if (imageView3 != null) {
            imageView3.setImageResource(2131238616);
        }
        TextView textView10 = this.f63547g;
        if (textView10 != null) {
            textView10.setVisibility(8);
        }
        TextView textView11 = this.h;
        if (textView11 != null) {
            textView11.setVisibility(8);
        }
        Group group9 = this.f63542b;
        if (group9 != null) {
            group9.setVisibility(8);
        }
        RecyclerView recyclerView4 = this.f63549j;
        if (recyclerView4 != null) {
            recyclerView4.setVisibility(8);
        }
        Group group10 = this.f63543c;
        if (group10 != null) {
            group10.setVisibility(0);
        }
        if (z7) {
            com.bilibili.lib.projection.internal.widget.a aVar = this.f63551l;
            Animation animation = aVar.f63869i;
            if (animation != null) {
                View view = aVar.f63862a;
                if (view != null) {
                    view.startAnimation(animation);
                }
                LottieAnimationView lottieAnimationView = aVar.f63863b;
                if (lottieAnimationView != null) {
                    lottieAnimationView.startAnimation(aVar.f63869i);
                }
                TextView textView12 = aVar.f63864c;
                if (textView12 != null) {
                    textView12.startAnimation(aVar.f63869i);
                }
                TextView textView13 = aVar.f63865d;
                if (textView13 != null) {
                    textView13.startAnimation(aVar.f63869i);
                }
                TextView textView14 = aVar.f63866e;
                if (textView14 != null) {
                    textView14.startAnimation(aVar.f63869i);
                }
            }
            Animation animation2 = aVar.f63871k;
            if (animation2 != null && (textView = aVar.f63867f) != null) {
                textView.startAnimation(animation2);
            }
            Animation animation3 = aVar.f63870j;
            if (animation3 != null) {
                TextView textView15 = aVar.f63868g;
                if (textView15 != null) {
                    textView15.startAnimation(animation3);
                }
                TextView textView16 = aVar.h;
                if (textView16 != null) {
                    textView16.startAnimation(animation3);
                }
            }
        }
        this.f63552m = pageState;
    }
}
