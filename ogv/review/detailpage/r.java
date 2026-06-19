package com.bilibili.ogv.review.detailpage;

import E80.m0;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.bilibili.droid.ToastHelper;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.ogv.review.data.BangumiReviewApiService;
import com.bilibili.ogv.review.widget.ReviewRatingBar;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Map;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.adapter.BaseAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;
import zl0.C9206e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/r.class */
@StabilityInferred(parameters = 0)
public final class r extends BaseViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f72392w = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BangumiReviewFragment f72393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f72394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f72395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final FragmentManager f72396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f72397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f72398g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f72399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f72400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f72401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f72402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f72403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f72404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f72405o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f72406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f72407q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public ReviewItem f72408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f72409s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f72410t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f72411u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f72412v;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/r$a.class */
    public static final class a<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f72413a;

        public a(r rVar) {
            this.f72413a = rVar;
        }

        public final void accept(Object obj) {
            r rVar = this.f72413a;
            rVar.f72411u = false;
            boolean zAreEqual = Intrinsics.areEqual("1", ((ReviewLikeStatus) obj).f72304a);
            if (rVar.f72410t != zAreEqual) {
                rVar.f72410t = zAreEqual;
                if (zAreEqual) {
                    rVar.f72409s++;
                    rVar.p0().setText(NumberFormat_androidKt.format$default(Long.valueOf(rVar.f72409s), "", 0, 2, (Object) null));
                    rVar.p0().setActivated(true);
                } else {
                    rVar.f72409s--;
                    rVar.p0().setText(NumberFormat_androidKt.format$default(Long.valueOf(rVar.f72409s), "", 0, 2, (Object) null));
                    rVar.p0().setActivated(false);
                }
            }
            if (rVar.f72412v) {
                rVar.q0();
                rVar.f72412v = false;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/r$b.class */
    public static final class b<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f72414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Activity f72415b;

        public b(r rVar, Activity activity) {
            this.f72414a = rVar;
            this.f72415b = activity;
        }

        public final void accept(Object obj) {
            Throwable th = (Throwable) obj;
            r rVar = this.f72414a;
            rVar.f72411u = false;
            rVar.f72412v = false;
            Activity activity = this.f72415b;
            if (Cl0.a.a(activity, th)) {
                return;
            }
            String message = th.getMessage();
            if (message == null || message.length() == 0) {
                ToastHelper.showToastShort(activity, 2131857127);
            } else {
                ToastHelper.showToastShort(activity, th.getMessage());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(@NotNull View view, @Nullable BaseAdapter baseAdapter, @NotNull BangumiReviewFragment bangumiReviewFragment, @NotNull String str, @NotNull Map map, @NotNull FragmentManager fragmentManager, int i7, @NotNull String str2) {
        super(view, baseAdapter);
        this.f72393b = bangumiReviewFragment;
        this.f72394c = str;
        this.f72395d = map;
        this.f72396e = fragmentManager;
        this.f72397f = i7;
        this.f72398g = str2;
        Lazy lazy = LazyKt.lazy(new OS0.j(view, 3));
        this.h = lazy;
        Lazy lazy2 = LazyKt.lazy(new m0(view, 4));
        this.f72399i = lazy2;
        this.f72400j = LazyKt.lazy(new OS0.k(view, 2));
        this.f72401k = LazyKt.lazy(new Ax.e(view, 2));
        this.f72402l = LazyKt.lazy(new Ax.f(view, 3));
        this.f72403m = LazyKt.lazy(new Ax.g(view, 3));
        this.f72404n = LazyKt.lazy(new Ax.h(view, 5));
        Lazy lazy3 = LazyKt.lazy(new Fy.b(view, 3));
        this.f72405o = lazy3;
        this.f72406p = LazyKt.lazy(new q(view, 0));
        Lazy lazy4 = LazyKt.lazy(new OS0.s(view, 2));
        this.f72407q = lazy4;
        ((BiliImageView) lazy.getValue()).setOnClickListener(this);
        ((TextView) lazy2.getValue()).setOnClickListener(this);
        p0().setOnClickListener(this);
        ((ImageView) lazy3.getValue()).setOnClickListener(this);
        this.itemView.setOnClickListener(this);
        ((View) lazy4.getValue()).setOnClickListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03a3  */
    /* JADX WARN: Type inference failed for: r0v167, types: [androidx.fragment.app.Fragment, com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(@org.jetbrains.annotations.NotNull android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 1334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.detailpage.r.onClick(android.view.View):void");
    }

    public final TextView p0() {
        return (TextView) this.f72404n.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0() {
        if (this.f72411u) {
            this.f72412v = !this.f72412v;
            return;
        }
        this.f72411u = true;
        this.f72412v = false;
        Activity activityRequireActivity = ContextUtilKt.requireActivity(this.itemView.getContext());
        BangumiReviewApiService bangumiReviewApiService = C9206e.f130331a;
        ReviewItem reviewItem = this.f72408r;
        long j7 = 0;
        long j8 = reviewItem != null ? reviewItem.f72298m : 0L;
        if (reviewItem != null) {
            j7 = reviewItem.h;
        }
        C9206e.f130332b.likeReview(j8, j7, 2).subscribe(new a(this), new b(this, activityRequireActivity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0(@Nullable ReviewItem reviewItem) {
        Vip vip;
        if (reviewItem == null) {
            return;
        }
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.itemView, reviewItem.f72299n);
        Context context = this.itemView.getContext();
        this.f72408r = reviewItem;
        ReviewLikeStat reviewLikeStat = reviewItem.f72288b;
        this.f72409s = reviewLikeStat.f72301a;
        this.f72410t = reviewLikeStat.f72302b;
        ImageRequestBuilder imageRequestBuilderWith = BiliImageLoader.INSTANCE.with(((BiliImageView) this.h.getValue()).getContext());
        Author author = reviewItem.f72291e;
        imageRequestBuilderWith.url(author != null ? author.f72226c : null).into((BiliImageView) this.h.getValue());
        ((TextView) this.f72399i.getValue()).setText(Cl0.a.b(context, author != null ? author.f72225b : null, (author == null || (vip = author.f72227d) == null) ? null : vip.f72317e));
        ((ImageView) this.f72400j.getValue()).setImageResource(Vl0.a.a(author != null ? author.f72228e : 0));
        ((TextView) this.f72401k.getValue()).setText(Cl0.b.a(context, reviewItem.f72293g * ((long) 1000), System.currentTimeMillis()));
        ((ReviewRatingBar) this.f72406p.getValue()).setRating(reviewItem.f72294i);
        String str = reviewItem.f72289c;
        if (str == null || str.length() == 0) {
            ((TextView) this.f72403m.getValue()).setVisibility(8);
        } else {
            ((TextView) this.f72403m.getValue()).setText(str);
            ((TextView) this.f72403m.getValue()).setVisibility(0);
        }
        ((TextView) this.f72402l.getValue()).setText(reviewItem.f72296k);
        p0().setText(NumberFormat_androidKt.format$default(Long.valueOf(this.f72409s), "", 0, 2, (Object) null));
        p0().setActivated(this.f72410t);
    }
}
