package com.bilibili.lib.projection.internal.search;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.bilibili.lib.image2.view.BiliImageView;
import ie0.C7564c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.lib.projection.internal.search.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/a.class */
public final class C5322a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ImageView f63706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Group f63707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Group f63708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ImageView f63709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f63710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f63711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public TextView f63712g;

    @Nullable
    public BiliImageView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public TextView f63713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public TextView f63714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public PageState f63715k;

    public final void a(@NotNull PageState pageState, boolean z6) {
        PageState pageState2;
        PageState pageState3 = PageState.SHOW;
        if ((pageState == pageState3 && this.f63715k != pageState3) || ((pageState == (pageState2 = PageState.LINK_GUIDE) && this.f63715k != pageState2) || (pageState == pageState3 && z6))) {
            ImageView imageView = this.f63706a;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f63709d;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            Group group = this.f63707b;
            if (group != null) {
                group.setVisibility(0);
            }
            Group group2 = this.f63708c;
            if (group2 != null) {
                group2.setVisibility(8);
            }
            he0.j.e("main.global-screencast.new-user-guide.1.show", null, null, C7564c.f121634k.f63524a, null, 16);
            this.f63715k = pageState;
            return;
        }
        PageState pageState4 = PageState.INSTALL_TIP;
        if (pageState == pageState4 && this.f63715k != pageState4) {
            ImageView imageView3 = this.f63706a;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            ImageView imageView4 = this.f63709d;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
            Group group3 = this.f63708c;
            if (group3 != null) {
                group3.setVisibility(0);
            }
            Group group4 = this.f63707b;
            if (group4 != null) {
                group4.setVisibility(8);
            }
            he0.j.e("main.global-screencast.new-user-guide.2.show", null, null, C7564c.f121634k.f63524a, null, 16);
            this.f63715k = pageState;
            return;
        }
        PageState pageState5 = PageState.DISMISS;
        if ((pageState != pageState5 || this.f63715k == pageState5) && !(pageState == pageState5 && z6)) {
            return;
        }
        ImageView imageView5 = this.f63706a;
        if (imageView5 != null) {
            imageView5.setVisibility(8);
        }
        ImageView imageView6 = this.f63709d;
        if (imageView6 != null) {
            imageView6.setVisibility(8);
        }
        Group group5 = this.f63707b;
        if (group5 != null) {
            group5.setVisibility(8);
        }
        Group group6 = this.f63708c;
        if (group6 != null) {
            group6.setVisibility(8);
        }
        this.f63715k = pageState;
    }
}
