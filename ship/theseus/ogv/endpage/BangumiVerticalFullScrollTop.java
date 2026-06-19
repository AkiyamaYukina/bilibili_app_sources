package com.bilibili.ship.theseus.ogv.endpage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.animation.n;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.image2.view.BiliImageView;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/BangumiVerticalFullScrollTop.class */
@StabilityInferred(parameters = 0)
public final class BangumiVerticalFullScrollTop extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BiliImageView f91910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RelativeLayout f91911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f91912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f91913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f91914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BiliImageView f91915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f91916g;
    public LinearLayout h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f91917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f91918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f91919k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f91920l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f91921m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f91922n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final a f91923o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/BangumiVerticalFullScrollTop$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return Float.compare(60.0f, 60.0f) == 0 && Float.compare(60.0f, 60.0f) == 0 && Float.compare(12.0f, 12.0f) == 0 && Float.compare(34.0f, 34.0f) == 0 && Float.compare(34.0f, 34.0f) == 0 && Float.compare(8.0f, 8.0f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(8.0f) + n.a(34.0f, n.a(34.0f, n.a(12.0f, n.a(60.0f, Float.hashCode(60.0f) * 31, 31), 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            return "VerticalFullScrollTopParams(defaultCoverWidth=60.0, defaultCoverHeight=60.0, defaultCoverRightMargin=12.0, collapseCoverWidth=34.0, collapseCoverHeight=34.0, collapseCoverRightMargin=8.0)";
        }
    }

    @JvmOverloads
    public BangumiVerticalFullScrollTop(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public BangumiVerticalFullScrollTop(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.bilibili.ship.theseus.ogv.endpage.BangumiVerticalFullScrollTop$a, java.lang.Object] */
    public BangumiVerticalFullScrollTop(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f91919k = true;
        this.f91923o = new Object();
    }

    public final void a(boolean z6) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLlfollow().getLayoutParams();
        if (z6) {
            layoutParams.removeRule(3);
            layoutParams.removeRule(5);
            layoutParams.addRule(1, getTitle().getId());
            layoutParams.addRule(11);
            layoutParams.rightMargin = Uj0.c.b(12.0f, getContext());
            return;
        }
        layoutParams.rightMargin = Uj0.c.b(0.0f, getContext());
        layoutParams.removeRule(1);
        layoutParams.removeRule(11);
        layoutParams.addRule(3, getInfoLl().getId());
        layoutParams.addRule(5, getInfoLl().getId());
    }

    @NotNull
    public final View getAction() {
        View view = this.f91918j;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("action");
        return null;
    }

    @NotNull
    public final BiliImageView getCover() {
        BiliImageView biliImageView = this.f91910a;
        if (biliImageView != null) {
            return biliImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cover");
        return null;
    }

    public final boolean getExpanded() {
        return this.f91919k;
    }

    @NotNull
    public final TextView getFollow() {
        TextView textView = this.f91913d;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("follow");
        return null;
    }

    @NotNull
    public final RelativeLayout getInfoLayout() {
        RelativeLayout relativeLayout = this.f91911b;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("infoLayout");
        return null;
    }

    @NotNull
    public final View getInfoLl() {
        View view = this.f91917i;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("infoLl");
        return null;
    }

    @NotNull
    public final BiliImageView getIvFollow() {
        BiliImageView biliImageView = this.f91915f;
        if (biliImageView != null) {
            return biliImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ivFollow");
        return null;
    }

    @NotNull
    public final View getLlfollow() {
        View view = this.f91914e;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llfollow");
        return null;
    }

    @NotNull
    public final LinearLayout getReplay() {
        LinearLayout linearLayout = this.f91916g;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("replay");
        return null;
    }

    @NotNull
    public final LinearLayout getShare() {
        LinearLayout linearLayout = this.h;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("share");
        return null;
    }

    @NotNull
    public final TextView getTitle() {
        TextView textView = this.f91912c;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("title");
        return null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setCover((BiliImageView) findViewById(2131310971));
        setInfoLayout((RelativeLayout) findViewById(2131302086));
        setTitle((TextView) findViewById(2131310998));
        setFollow((TextView) findViewById(2131301778));
        setLlfollow(findViewById(2131305570));
        setIvFollow((BiliImageView) findViewById(2131304231));
        setReplay((LinearLayout) findViewById(2131310129));
        setShare((LinearLayout) findViewById(2131311173));
        setInfoLl(findViewById(2131305601));
        setAction(findViewById(2131297178));
        Uj0.c.b(89.0f, getContext());
        this.f91922n = Uj0.c.b(10.0f, getContext());
        this.f91923o.getClass();
        this.f91920l = Uj0.c.b(60.0f, getContext());
        this.f91923o.getClass();
        this.f91921m = Uj0.c.b(60.0f, getContext());
        this.f91923o.getClass();
        this.f91922n = Uj0.c.b(12.0f, getContext());
    }

    public final void setAction(@NotNull View view) {
        this.f91918j = view;
    }

    public final void setCover(@NotNull BiliImageView biliImageView) {
        this.f91910a = biliImageView;
    }

    public final void setFollow(@NotNull TextView textView) {
        this.f91913d = textView;
    }

    public final void setInfoLayout(@NotNull RelativeLayout relativeLayout) {
        this.f91911b = relativeLayout;
    }

    public final void setInfoLl(@NotNull View view) {
        this.f91917i = view;
    }

    public final void setIvFollow(@NotNull BiliImageView biliImageView) {
        this.f91915f = biliImageView;
    }

    public final void setLlfollow(@NotNull View view) {
        this.f91914e = view;
    }

    public final void setReplay(@NotNull LinearLayout linearLayout) {
        this.f91916g = linearLayout;
    }

    public final void setShare(@NotNull LinearLayout linearLayout) {
        this.h = linearLayout;
    }

    public final void setTitle(@NotNull TextView textView) {
        this.f91912c = textView;
    }
}
