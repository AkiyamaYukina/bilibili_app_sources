package com.bilibili.search2.result.all;

import Bl.j0;
import android.graphics.drawable.GradientDrawable;
import android.util.Pair;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.adcommon.utils.ext.AdExtensions;
import com.bilibili.app.comm.list.common.inline.view.InlineLiveBadgeWidget;
import com.bilibili.app.comm.list.common.inline.view.InlineLiveBadgeWidgetKt;
import com.bilibili.app.comm.list.common.inline.view.LiveBadgeWidget;
import com.bilibili.app.comm.list.common.inline.view.RightTopLiveBadge;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.commons.StringUtils;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchLiveItem;
import com.bilibili.search2.utils.CoverAspectRatio;
import dt0.AbstractC6843f;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.FixedPopupAnchor;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.bili.widget.text.TintFixedLineSpacingTextView;

/* JADX INFO: renamed from: com.bilibili.search2.result.all.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/h.class */
@StabilityInferred(parameters = 0)
public final class ViewOnClickListenerC6054h extends AbstractC6843f<SearchLiveItem> implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ListPlaceHolderImageView f87284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TintFixedLineSpacingTextView f87285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final VectorTextView f87286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final VectorTextView f87287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TintTextView f87288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final InlineLiveBadgeWidget f87289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TintTextView f87290g;

    @NotNull
    public final FixedPopupAnchor h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TintTextView f87291i;

    public ViewOnClickListenerC6054h(@NotNull j0 j0Var) {
        super(j0Var.a);
        this.f87284a = j0Var.b;
        this.f87285b = j0Var.g;
        this.f87286c = j0Var.j;
        this.f87287d = j0Var.e;
        this.f87288e = j0Var.f;
        this.f87289f = j0Var.c;
        this.f87290g = j0Var.i;
        this.h = j0Var.d;
        this.f87291i = j0Var.h;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() throws NoWhenBranchMatchedException {
        List<BaseSearchItem.ThreePointItem> threePoints;
        String text;
        int colorWithAlpha;
        String alphaNight;
        Float floatOrNull;
        String alphaLight;
        Float floatOrNull2;
        this.itemView.setOnClickListener(this);
        com.bilibili.search2.utils.s.c(this.f87284a, this.itemView.getContext(), CoverAspectRatio.RATIO_16_9, true, false, true, 18);
        com.bilibili.search2.utils.extension.c.a(this.f87284a, ((SearchLiveItem) getData()).getCover(), null, false, null, null, 0, 0, 254);
        this.f87286c.setText(ColorTagHandler.decode$default(this.itemView.getContext(), ((SearchLiveItem) getData()).getName(), 0, 4, (Object) null));
        this.f87287d.setVisibility(0);
        ListExtentionsKt.setTextWithIcon$default(this.f87287d, ((SearchLiveItem) getData()).getCardLeftText(), ((SearchLiveItem) getData()).getCardLeftIcon(), R$color.Ga5, 0.0f, 0.0f, 48, (Object) null);
        this.f87291i.setText(ColorTagHandler.decode$default(this.itemView.getContext(), ((SearchLiveItem) getData()).getShowCardDesc2(), 0, 4, (Object) null));
        this.f87288e.setVisibility(8);
        this.f87285b.setText(ColorTagHandler.decode$default(this.itemView.getContext(), com.bilibili.search2.api.oversea.b.a((com.bilibili.search2.api.oversea.a) getData()), 0, 4, (Object) null));
        this.f87289f.setVisibility(8);
        this.f87290g.setVisibility(8);
        RightTopLiveBadge rightTopLiveBadge = ((SearchLiveItem) getData()).getRightTopLiveBadge();
        if (rightTopLiveBadge != null) {
            if (rightTopLiveBadge.getLiveStatus() == 1 || rightTopLiveBadge.getShowAnimation()) {
                this.f87289f.setVisibility(0);
                InlineLiveBadgeWidgetKt.displayBadge(this.f87289f, ((SearchLiveItem) getData()).getRightTopLiveBadge(), false, true, rightTopLiveBadge.getShowAnimation());
            } else {
                LiveBadgeWidget inLive = rightTopLiveBadge.getInLive();
                if (inLive != null && (text = inLive.getText()) != null) {
                    this.f87290g.setVisibility(0);
                    this.f87290g.setText(text);
                    TintTextView tintTextView = this.f87290g;
                    LiveBadgeWidget inLive2 = rightTopLiveBadge.getInLive();
                    tintTextView.setTextColor(ListExtentionsKt.toColorInt$default(inLive2 != null ? inLive2.getFontColor() : null, 0, 1, (Object) null));
                    TintTextView tintTextView2 = this.f87290g;
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(AdExtensions.getToPx(2.0f));
                    if (MultipleThemeUtils.isNightTheme(this.itemView.getContext())) {
                        LiveBadgeWidget inLive3 = rightTopLiveBadge.getInLive();
                        int colorInt$default = ListExtentionsKt.toColorInt$default(inLive3 != null ? inLive3.getBackgroundColorNight() : null, 0, 1, (Object) null);
                        LiveBadgeWidget inLive4 = rightTopLiveBadge.getInLive();
                        colorWithAlpha = ListExtentionsKt.getColorWithAlpha(colorInt$default, ((inLive4 == null || (alphaNight = inLive4.getAlphaNight()) == null || (floatOrNull = StringsKt.toFloatOrNull(alphaNight)) == null) ? 100.0f : floatOrNull.floatValue()) / 100.0f);
                    } else {
                        LiveBadgeWidget inLive5 = rightTopLiveBadge.getInLive();
                        int colorInt$default2 = ListExtentionsKt.toColorInt$default(inLive5 != null ? inLive5.getBackgroundColorLight() : null, 0, 1, (Object) null);
                        LiveBadgeWidget inLive6 = rightTopLiveBadge.getInLive();
                        colorWithAlpha = ListExtentionsKt.getColorWithAlpha(colorInt$default2, ((inLive6 == null || (alphaLight = inLive6.getAlphaLight()) == null || (floatOrNull2 = StringsKt.toFloatOrNull(alphaLight)) == null) ? 100.0f : floatOrNull2.floatValue()) / 100.0f);
                    }
                    gradientDrawable.setColor(colorWithAlpha);
                    tintTextView2.setBackground(gradientDrawable);
                }
            }
        }
        com.bilibili.search2.share.r rVar = com.bilibili.search2.share.r.f88699a;
        BaseSearchItem.Feedback feedback = ((SearchLiveItem) getData()).getFeedback();
        rVar.getClass();
        if (com.bilibili.search2.share.r.e(feedback) || !((threePoints = ((SearchLiveItem) getData()).getThreePoints()) == null || threePoints.isEmpty())) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        this.h.setOnClickListener(new com.bilibili.bangumi.ui.page.detail.playerV2.widget.quality.p(this, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6843f, dt0.AbstractC6839b
    public final void bind(@NotNull List<Object> list) {
        super.bind(list);
        if (list.contains("PAYLOAD_UPDATE_TRANSLATE")) {
            this.f87285b.setText(ColorTagHandler.decode$default(this.itemView.getContext(), com.bilibili.search2.api.oversea.b.a((com.bilibili.search2.api.oversea.a) getData()), 0, 4, (Object) null));
        }
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final View getClickStatusView() {
        return this.f87285b;
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final String getDefaultModuleType() {
        return "search-live";
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
        if (!((SearchLiveItem) getData()).isExposed()) {
            SearchLiveItem searchLiveItem = (SearchLiveItem) getData();
            RecyclerView recyclerView = getRecyclerView();
            boolean z6 = false;
            if ((recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0) == 0) {
                z6 = true;
            }
            searchLiveItem.setAtFirstScreen(z6);
        }
        String linkType = ((SearchLiveItem) getData()).getLinkType();
        String str = linkType;
        if (linkType == null) {
            str = "search-live";
        }
        BaseSearchItem baseSearchItem = (BaseSearchItem) getData();
        RightTopLiveBadge rightTopLiveBadge = ((SearchLiveItem) getData()).getRightTopLiveBadge();
        Xs0.b.k("search.search-result.search-card.all.show", str, baseSearchItem, null, MapsKt.mapOf(TuplesKt.to("live_status", rightTopLiveBadge != null ? String.valueOf(rightTopLiveBadge.getLiveStatus()) : null)), false, null, null, null, 1000);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (StringUtils.isBlank(((SearchLiveItem) getData()).getJumpUri())) {
            return;
        }
        Os0.e.g(Os0.e.f18030a, view.getContext(), ListExtentionsKt.appendUrlParamsIfAbsent(((SearchLiveItem) getData()).getJumpUri(), new Pair[]{Pair.create("from_spmid", "search.search-result.0.0"), Pair.create("session_id", ((SearchLiveItem) getData()).getTrackId()), Pair.create("launch_id", ((SearchLiveItem) getData()).getKeyword()), Pair.create("extra_jump_from", "23013"), Pair.create("extra_search_abtest_id", ((SearchLiveItem) getData()).getExpStr())}));
        String linkType = ((SearchLiveItem) getData()).getLinkType();
        String str = linkType;
        if (linkType == null) {
            str = "search-live";
        }
        BaseSearchItem baseSearchItem = (BaseSearchItem) getData();
        RightTopLiveBadge rightTopLiveBadge = ((SearchLiveItem) getData()).getRightTopLiveBadge();
        Xs0.b.i("search.search-result.search-card.all.click", null, str, baseSearchItem, null, null, null, null, null, MapsKt.mapOf(TuplesKt.to("live_status", rightTopLiveBadge != null ? String.valueOf(rightTopLiveBadge.getLiveStatus()) : null)), false, null, 7104);
        clickWithRefreshStatus();
    }
}
