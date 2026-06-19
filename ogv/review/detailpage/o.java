package com.bilibili.ogv.review.detailpage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.review.widget.ReviewRatingBar;
import com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.ArrayList;
import java.util.Map;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.adapter.BaseAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/o.class */
@StabilityInferred(parameters = 0)
public final class o extends BaseViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f72368r = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f72369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f72370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final FragmentManager f72371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f72372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f72373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f72374g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f72375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f72376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f72377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f72378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f72379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f72380n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public ReviewItem f72381o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f72382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f72383q;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@NotNull View view, @Nullable BaseAdapter baseAdapter, @NotNull String str, @NotNull Map<String, String> map, @NotNull FragmentManager fragmentManager) {
        super(view, baseAdapter);
        this.f72369b = str;
        this.f72370c = map;
        this.f72371d = fragmentManager;
        Lazy lazy = LazyKt.lazy(new OS0.c(view, 3));
        this.f72372e = lazy;
        Lazy lazy2 = LazyKt.lazy(new Fx.e(view, 5));
        this.f72373f = lazy2;
        this.f72374g = LazyKt.lazy(new OS0.d(view, 4));
        this.h = LazyKt.lazy(new Fx.g(view, 6));
        this.f72375i = LazyKt.lazy(new OS0.e(view, 4));
        Lazy lazy3 = LazyKt.lazy(new J90.l(view, 7));
        this.f72376j = lazy3;
        this.f72377k = LazyKt.lazy(new J90.m(view, 4));
        this.f72378l = LazyKt.lazy(new KS0.b(view, 3));
        this.f72379m = LazyKt.lazy(new KS0.c(view, 6));
        Lazy lazy4 = LazyKt.lazy(new KS0.d(view, 5));
        this.f72380n = lazy4;
        ((BiliImageView) lazy.getValue()).setOnClickListener(this);
        ((TextView) lazy2.getValue()).setOnClickListener(this);
        ((TextView) lazy3.getValue()).setOnClickListener(this);
        this.itemView.setOnClickListener(this);
        ((View) lazy4.getValue()).setOnClickListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v96, types: [androidx.fragment.app.Fragment, com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet] */
    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        Author author;
        String str;
        RouteRequest routeRequest;
        Author author2;
        if (this.f72381o == null) {
            return;
        }
        Long lValueOf = null;
        if (view.getId() == 2131296796 || view.getId() == 2131304923) {
            Map<String, String> map = this.f72370c;
            ReviewItem reviewItem = this.f72381o;
            Neurons.reportClick(false, "pgc.pgc-video-detail.review-detail.long-up.click", MapsKt.plus(map, MapsKt.mapOf(TuplesKt.to(EditCustomizeSticker.TAG_MID, String.valueOf((reviewItem == null || (author = reviewItem.f72291e) == null) ? 0L : author.f72224a)))));
            ReviewItem reviewItem2 = this.f72381o;
            if ((reviewItem2 != null ? reviewItem2.f72291e : null) != null) {
                Context context = view.getContext();
                ReviewItem reviewItem3 = this.f72381o;
                long j7 = 0;
                if (reviewItem3 != null) {
                    Author author3 = reviewItem3.f72291e;
                    j7 = 0;
                    if (author3 != null) {
                        j7 = author3.f72224a;
                    }
                }
                String str2 = null;
                if (reviewItem3 != null) {
                    Author author4 = reviewItem3.f72291e;
                    str2 = null;
                    if (author4 != null) {
                        str2 = author4.f72225b;
                    }
                }
                Nl0.h.a(j7, str2, context);
                return;
            }
            return;
        }
        if (view.getId() != 2131307359) {
            Neurons.reportClick(false, "pgc.pgc-video-detail.review-detail.long-review.click", this.f72370c);
            String strA = G.p.a(this.f72369b, ".long-review.review-card.click");
            Map<String, String> map2 = this.f72370c;
            ReviewItem reviewItem4 = this.f72381o;
            if (reviewItem4 != null) {
                lValueOf = Long.valueOf(reviewItem4.h);
            }
            Neurons.reportClick(false, strA, MapsKt.plus(map2, MapsKt.mapOf(new Pair[]{TuplesKt.to("entity_id", String.valueOf(lValueOf)), TuplesKt.to("action_type", "turn")})));
            ReviewItem reviewItem5 = this.f72381o;
            if (reviewItem5 == null || (str = reviewItem5.f72297l) == null || (routeRequest = RouteRequestKt.toRouteRequest(str)) == null) {
                return;
            }
            Qj0.g.c(view.getContext(), routeRequest);
            return;
        }
        Context context2 = this.itemView.getContext();
        ReviewItem reviewItem6 = this.f72381o;
        Author author5 = null;
        if (reviewItem6 != null) {
            author5 = reviewItem6.f72291e;
        }
        boolean z6 = (author5 == null || reviewItem6 == null || (author2 = reviewItem6.f72291e) == null || author2.f72224a != com.bilibili.ogv.infra.account.a.f67852b.mid()) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (z6) {
            arrayList.add(new BangumiBottomSheet.SheetItem(88, context2.getString(2131857152), 2131239084));
        } else {
            arrayList.add(new BangumiBottomSheet.SheetItem(89, context2.getString(2131857143), 2131239088));
        }
        CollectionsKt.emptyList();
        n nVar = new n(context2, this);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("sheet_item_list", new ArrayList<>(arrayList));
        bundle.putBoolean("sheet_item_show_check_icon", false);
        bundle.putInt("sheet_item_show_current_sheet_item_id", -1);
        ?? bangumiBottomSheet = new BangumiBottomSheet();
        bangumiBottomSheet.setArguments(bundle);
        bangumiBottomSheet.f73184g = nVar;
        bangumiBottomSheet.show(this.f72371d, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(@Nullable ReviewItem reviewItem) {
        Vip vip;
        if (reviewItem == null) {
            return;
        }
        Context context = this.itemView.getContext();
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.itemView, reviewItem.f72299n);
        this.f72381o = reviewItem;
        ReviewLikeStat reviewLikeStat = reviewItem.f72288b;
        this.f72382p = reviewLikeStat.f72301a;
        this.f72383q = reviewLikeStat.f72302b;
        ImageRequestBuilder imageRequestBuilderWith = BiliImageLoader.INSTANCE.with(((BiliImageView) this.f72372e.getValue()).getContext());
        Author author = reviewItem.f72291e;
        imageRequestBuilderWith.url(author != null ? author.f72226c : null).into((BiliImageView) this.f72372e.getValue());
        ((TextView) this.f72373f.getValue()).setText(Cl0.a.b(context, author != null ? author.f72225b : null, (author == null || (vip = author.f72227d) == null) ? null : vip.f72317e));
        ((ImageView) this.f72374g.getValue()).setImageResource(Vl0.a.a(author != null ? author.f72228e : 0));
        ((TextView) this.h.getValue()).setText(Cl0.b.a(this.itemView.getContext(), reviewItem.f72293g * ((long) 1000), System.currentTimeMillis()));
        ((ReviewRatingBar) this.f72379m.getValue()).setRating(reviewItem.f72294i);
        TextView textView = (TextView) this.f72377k.getValue();
        String str = reviewItem.f72289c;
        textView.setText(str);
        ((TextView) this.f72377k.getValue()).setVisibility((str == null || str.length() == 0) ? 8 : 0);
        ((TextView) this.f72375i.getValue()).setText(reviewItem.f72295j);
        ((TextView) this.f72378l.getValue()).setText(reviewItem.f72296k);
        ((TextView) this.f72376j.getValue()).setText(NumberFormat_androidKt.format$default(Long.valueOf(this.f72382p), "", 0, 2, (Object) null));
        ((TextView) this.f72376j.getValue()).setActivated(this.f72383q);
    }
}
