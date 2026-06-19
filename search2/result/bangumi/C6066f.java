package com.bilibili.search2.result.bangumi;

import Bl.y0;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.tag.TagView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.droid.TypeFaceHelper;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.EpisodeNew;
import com.bilibili.search2.api.EpisodeSelectStyle;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.search2.api.Tag;
import com.bilibili.search2.ogv.OgvSearchResultFragment;
import com.bilibili.search2.result.ogv.aggregate.subpage.SearchAggregateFragment;
import com.bilibili.search2.utils.CoverAspectRatio;
import dt0.AbstractC6843f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/f.class */
@StabilityInferred(parameters = 0)
public final class C6066f extends AbstractC6843f<SearchBangumiItem> {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f87397x = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final y0 f87398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f87399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f87400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ViewGroup f87401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BiliImageView f87402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TextView f87403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ViewGroup f87404g;

    @NotNull
    public final TagView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TintTextView f87405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TextView f87406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final TextView f87407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Group f87408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final TextView f87409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final TextView f87410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final TextView f87411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ViewGroup f87412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final RecyclerView f87413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TagView f87414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final BiliImageView f87415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public r<EpisodeNew> f87416t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f87417u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final c f87418v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final d f87419w;

    /* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.f$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/f$a.class */
    public static final class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6066f f87420a;

        public a(C6066f c6066f) {
            this.f87420a = c6066f;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            int left;
            super.onScrollStateChanged(recyclerView, i7);
            if (i7 == 0) {
                View childAt = recyclerView.getChildAt(0);
                int bindingAdapterPosition = recyclerView.getChildViewHolder(childAt).getBindingAdapterPosition();
                C6066f c6066f = this.f87420a;
                SearchBangumiItem searchBangumiItem = (SearchBangumiItem) c6066f.getData();
                if (childAt.getLeft() < 0) {
                    bindingAdapterPosition++;
                }
                searchBangumiItem.setScrollPosition(bindingAdapterPosition);
                SearchBangumiItem searchBangumiItem2 = (SearchBangumiItem) c6066f.getData();
                if (childAt.getLeft() >= 0) {
                    left = childAt.getLeft();
                } else {
                    View childAt2 = recyclerView.getChildAt(1);
                    left = 0;
                    if (childAt2 != null) {
                        left = childAt2.getLeft();
                    }
                }
                searchBangumiItem2.setItemOffset(left);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.f$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/f$b.class */
    public static final class b {
        public static Uri a(int i7, String str, String str2) {
            int i8 = C6066f.f87397x;
            if ((i7 & 4) != 0) {
                str2 = "search.search-result.0.0";
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("intentFrom", "5").appendQueryParameter("from_spmid", str2).build();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.f$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/f$c.class */
    public static final class c extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int px = ListExtentionsKt.toPx(4);
            int px2 = ListExtentionsKt.toPx(4);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                px = 0;
            }
            if (childAdapterPosition == state.getItemCount() - 1) {
                px2 = 0;
            }
            rect.set(px, 0, px2, 0);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.f$d */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/f$d.class */
    public static final class d extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int px = ListExtentionsKt.toPx(4);
            int px2 = ListExtentionsKt.toPx(4);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                px = 0;
            }
            if (childAdapterPosition == state.getItemCount() - 1) {
                px2 = 0;
            }
            rect.set(px, 0, px2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v61, types: [androidx.recyclerview.widget.RecyclerView$ItemDecoration, com.bilibili.search2.result.bangumi.f$c] */
    /* JADX WARN: Type inference failed for: r1v62, types: [androidx.recyclerview.widget.RecyclerView$ItemDecoration, com.bilibili.search2.result.bangumi.f$d] */
    public C6066f(@NotNull y0 y0Var) {
        super(y0Var.a);
        this.f87398a = y0Var;
        this.f87401d = (ViewGroup) this.itemView.findViewById(2131308195);
        this.f87402e = this.itemView.findViewById(2131298941);
        this.f87403f = (TextView) this.itemView.findViewById(2131308958);
        this.f87404g = (ViewGroup) this.itemView.findViewById(2131312497);
        this.h = this.itemView.findViewById(2131312492);
        this.f87405i = (TintTextView) this.itemView.findViewById(2131312496);
        this.f87406j = (TextView) this.itemView.findViewById(2131308551);
        TextView textView = (TextView) this.itemView.findViewById(2131308935);
        this.f87407k = textView;
        this.f87408l = (Group) this.itemView.findViewById(2131310829);
        this.f87409m = (TextView) this.itemView.findViewById(2131310821);
        this.f87410n = (TextView) this.itemView.findViewById(2131299492);
        this.f87411o = (TextView) this.itemView.findViewById(2131301788);
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(2131301790);
        this.f87412p = viewGroup;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(2131310063);
        this.f87413q = recyclerView;
        this.f87414r = this.itemView.findViewById(2131299604);
        this.f87415s = this.itemView.findViewById(2131304231);
        ListExtentionsKt.toPx(8);
        ListExtentionsKt.toPx(0);
        this.f87418v = new RecyclerView.ItemDecoration();
        this.f87419w = new RecyclerView.ItemDecoration();
        this.itemView.setOnClickListener(new KS0.w(this, 2));
        viewGroup.setOnClickListener(new com.bilibili.bplus.following.event.ui.share.b(this, 1));
        textView.setOnClickListener(new ViewOnClickListenerC6065e(this, 0));
        recyclerView.addOnScrollListener(new a(this));
    }

    public static String s0(SearchBangumiItem searchBangumiItem) {
        String str;
        if (searchBangumiItem != null) {
            SearchBangumiItem.a aVar = SearchBangumiItem.Companion;
            int mediaType = searchBangumiItem.getMediaType();
            aVar.getClass();
            str = SearchBangumiItem.a.a(mediaType) ? "pgc.bangumi-search.0.0" : "pgc.cinema-search.0.0";
        } else {
            str = "0.0.0.0";
        }
        return str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() throws NoWhenBranchMatchedException {
        String strG;
        String strC;
        String text;
        String text2;
        this.itemView.setTag(getData());
        if (this.f87399b) {
            com.bilibili.search2.utils.s.e(this.f87402e, this.itemView.getContext(), new Pair(Integer.valueOf(ListExtentionsKt.toPx(82)), Integer.valueOf(ListExtentionsKt.toPx(109))), new Pair(Integer.valueOf(ListExtentionsKt.toPx(133)), Integer.valueOf(ListExtentionsKt.toPx(177))));
        } else {
            com.bilibili.search2.utils.s.c(this.f87402e, this.itemView.getContext(), CoverAspectRatio.RATIO_3_4, false, true, true, 10);
        }
        com.bilibili.search2.utils.extension.c.a(this.f87402e, ((SearchBangumiItem) getData()).getCover(), null, false, null, null, 0, 0, 254);
        List<Tag> badgesV2 = ((SearchBangumiItem) getData()).getBadgesV2();
        TagView tagView = this.f87414r;
        if (badgesV2 == null || !(!badgesV2.isEmpty())) {
            tagView.setVisibility(8);
        } else {
            List<Tag> badgesV22 = ((SearchBangumiItem) getData()).getBadgesV2();
            Tag tag = badgesV22 != null ? (Tag) CollectionsKt.getOrNull(badgesV22, 0) : null;
            if (tag == null || (text2 = tag.getText()) == null || StringsKt.isBlank(text2)) {
                tagView.setVisibility(8);
            } else {
                tagView.tagBuilder().setTagText(tag.getText()).setTagTextColor(tag.getTextColor()).setTagNightTextColor(tag.getTextColorNight()).setTagBackgroundColor(tag.getBgColor()).setTagNightBackgroundColor(tag.getBgColorNight()).setTagBorderColor(tag.getBorderColor()).setTagNightBorderColor(tag.getBorderColorNight()).setTagBackgroundStyle(tag.getBgStyle()).applyToView();
                tagView.setVisibility(0);
            }
        }
        TextView textView = this.f87403f;
        Context context = this.itemView.getContext();
        String title = ((SearchBangumiItem) getData()).getTitle();
        String str = title;
        if (title == null) {
            str = "";
        }
        textView.setText(ColorTagHandler.decode$default(context, str, 0, 4, (Object) null));
        String stylesV2 = ((SearchBangumiItem) getData()).getStylesV2();
        TintTextView tintTextView = this.f87405i;
        if (stylesV2 == null || StringsKt.isBlank(stylesV2)) {
        } else {
            tintTextView.setText(((SearchBangumiItem) getData()).getStylesV2());
        }
        Tag styleLabel = ((SearchBangumiItem) getData()).getStyleLabel();
        TagView tagView2 = this.h;
        if (styleLabel == null || (text = styleLabel.getText()) == null || StringsKt.isBlank(text)) {
            ListExtentionsKt.gone(tagView2);
        } else {
            tagView2.tagBuilder().setTagText(styleLabel.getText()).setTagTextColor(styleLabel.getTextColor()).setTagNightTextColor(styleLabel.getTextColorNight()).setTagBackgroundColor(styleLabel.getBgColor()).setTagNightBackgroundColor(styleLabel.getBgColorNight()).setTagBorderColor(styleLabel.getBorderColor()).setTagNightBorderColor(styleLabel.getBorderColorNight()).setTagBackgroundStyle(styleLabel.getBgStyle()).applyToView();
            tagView2.setVisibility(0);
        }
        if (tintTextView.getVisibility() == 8 && tagView2.getVisibility() == 8) {
        }
        String label = ((SearchBangumiItem) getData()).getLabel();
        if (label == null || StringsKt.isBlank(label)) {
            this.f87406j.setVisibility(8);
        } else {
            TextView textView2 = this.f87406j;
            Context context2 = this.itemView.getContext();
            String label2 = ((SearchBangumiItem) getData()).getLabel();
            if (label2 == null) {
                label2 = "";
            }
            textView2.setText(ColorTagHandler.decode$default(context2, label2, 0, 4, (Object) null));
            this.f87406j.setVisibility(0);
        }
        if (((SearchBangumiItem) getData()).getWatchButton() == null || (strG = ((SearchBangumiItem) getData()).getWatchButton().g()) == null || StringsKt.isBlank(strG) || (strC = ((SearchBangumiItem) getData()).getWatchButton().c()) == null || StringsKt.isBlank(strC)) {
            this.f87407k.setVisibility(8);
        } else {
            this.f87407k.setText(((SearchBangumiItem) getData()).getWatchButton().g());
            this.f87407k.setVisibility(0);
        }
        if (((SearchBangumiItem) getData()).getPlayState() == 0) {
            w0();
        } else {
            this.f87412p.setVisibility(8);
        }
        double rating = ((SearchBangumiItem) getData()).getRating();
        Group group = this.f87408l;
        if (rating > 0.0d) {
            this.f87409m.setTypeface(TypeFaceHelper.createFromAsset(this.itemView.getContext(), "xx-DIN-Regular.ttf"));
            group.setVisibility(0);
            this.f87409m.setText(String.valueOf(((SearchBangumiItem) getData()).getRating()));
            this.f87410n.setText(this.itemView.getResources().getQuantityString(2131689729, ((SearchBangumiItem) getData()).getVote(), NumberFormat_androidKt.format$default(Integer.valueOf(((SearchBangumiItem) getData()).getVote()), (String) null, 0, 3, (Object) null)));
        } else {
            group.setVisibility(8);
        }
        boolean zIsShowEpisodesSelectLayout = ((SearchBangumiItem) getData()).isShowEpisodesSelectLayout();
        RecyclerView recyclerView = this.f87413q;
        if (zIsShowEpisodesSelectLayout) {
            recyclerView.setLayoutManager(null);
            recyclerView.setAdapter(null);
            String selectionStyle = ((SearchBangumiItem) getData()).getSelectionStyle();
            if (Intrinsics.areEqual(selectionStyle, EpisodeSelectStyle.Grid.getValue())) {
                v0(false);
                final String strR0 = r0(true, (SearchBangumiItem) getData());
                final Map<String, String> mapT0 = t0((SearchBangumiItem) getData());
                r<EpisodeNew> rVar = this.f87416t;
                if (rVar != null) {
                    rVar.f87458d = new Function2(this, strR0, mapT0) { // from class: com.bilibili.search2.result.bangumi.d

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final C6066f f87392a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final String f87393b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Map f87394c;

                        {
                            this.f87392a = this;
                            this.f87393b = strR0;
                            this.f87394c = mapT0;
                        }

                        /* JADX WARN: Type inference failed for: r0v8, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.bangumi.f, dt0.f] */
                        public final Object invoke(Object obj, Object obj2) {
                            String param;
                            Map map = this.f87394c;
                            EpisodeNew episodeNew = (EpisodeNew) obj;
                            ((Integer) obj2).getClass();
                            ?? r02 = this.f87392a;
                            if (episodeNew != null && (param = episodeNew.getParam()) != null && !StringsKt.isBlank(param) && !r02.f87399b) {
                                ((SearchBangumiItem) r02.getData()).clickEpisode(episodeNew.getParam());
                            }
                            t.a(r02.itemView.getContext(), (SearchBangumiItem) r02.getData(), episodeNew, ((SearchBangumiItem) r02.getData()).getClickEpisode(), r02.f87399b, this.f87393b, map, r02.q0((BaseSearchItem) r02.getData()), C6066f.s0((SearchBangumiItem) r02.getData()));
                            r02.clickWithRefreshStatus();
                            return Unit.INSTANCE;
                        }
                    };
                }
                PaddingUtilsKt.setPaddingBottom(this.f87401d, ListExtentionsKt.toPx(12));
            } else if (Intrinsics.areEqual(selectionStyle, EpisodeSelectStyle.Horizontal.getValue())) {
                v0(true);
                final String strR02 = r0(true, (SearchBangumiItem) getData());
                final Map<String, String> mapT02 = t0((SearchBangumiItem) getData());
                r<EpisodeNew> rVar2 = this.f87416t;
                if (rVar2 != null) {
                    rVar2.f87458d = new Function2(this, strR02, mapT02) { // from class: com.bilibili.search2.result.bangumi.c

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final C6066f f87389a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final String f87390b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Map f87391c;

                        {
                            this.f87389a = this;
                            this.f87390b = strR02;
                            this.f87391c = mapT02;
                        }

                        /* JADX WARN: Type inference failed for: r0v8, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.bangumi.f, dt0.f] */
                        public final Object invoke(Object obj, Object obj2) {
                            Map map = this.f87391c;
                            EpisodeNew episodeNew = (EpisodeNew) obj;
                            ((Integer) obj2).getClass();
                            ?? r02 = this.f87389a;
                            if (episodeNew != null) {
                                String param = episodeNew.getParam();
                                if (param != null) {
                                    if (StringsKt.isBlank(param)) {
                                        param = null;
                                    }
                                    if (param != null) {
                                        ((SearchBangumiItem) r02.getData()).clickEpisode(episodeNew.getParam());
                                    }
                                }
                            }
                            t.b(r02.itemView.getContext(), (SearchBangumiItem) r02.getData(), episodeNew, r02.f87399b, this.f87390b, map, r02.q0((BaseSearchItem) r02.getData()), C6066f.s0((SearchBangumiItem) r02.getData()), r02.t0((SearchBangumiItem) r02.getData()));
                            r02.clickWithRefreshStatus();
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                recyclerView.setVisibility(8);
                PaddingUtilsKt.setPaddingBottom(this.f87401d, ListExtentionsKt.toPx(12));
            }
        } else {
            recyclerView.setVisibility(8);
            PaddingUtilsKt.setPaddingBottom(this.f87401d, ListExtentionsKt.toPx(12));
        }
        com.bilibili.search2.utils.B.d(((SearchBangumiItem) getData()).getSaleInfo(), this.f87398a.b, this.itemView.getContext(), (BaseSearchItem) getData());
    }

    @Override // dt0.AbstractC6839b
    public final void bindFragment(@Nullable Fragment fragment) {
        super.bindFragment(fragment);
        this.f87399b = fragment instanceof OgvSearchResultFragment;
        this.f87400c = fragment instanceof SearchAggregateFragment;
    }

    @Override // dt0.AbstractC6843f
    @Nullable
    public final View getClickStatusView() {
        return this.f87403f;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
        if (!((SearchBangumiItem) getData()).isExposed()) {
            SearchBangumiItem searchBangumiItem = (SearchBangumiItem) getData();
            RecyclerView recyclerView = getRecyclerView();
            searchBangumiItem.setAtFirstScreen((recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0) == 0);
        }
        Map<String, String> mapT0 = t0((SearchBangumiItem) getData());
        String strR0 = r0(false, (SearchBangumiItem) getData());
        if (this.f87400c) {
            Xs0.b.h(strR0, q0((BaseSearchItem) getData()), (BaseSearchItem) getData(), mapT0, getFragment(), 232);
        } else {
            Xs0.b.k(strR0, q0((BaseSearchItem) getData()), (BaseSearchItem) getData(), null, mapT0, !this.f87399b, null, null, null, 936);
        }
        com.bilibili.search2.api.b saleInfo = ((SearchBangumiItem) getData()).getSaleInfo();
        if (saleInfo != null) {
            Xs0.b.n((BaseSearchItem) getData(), saleInfo);
        }
    }

    @NotNull
    public final String q0(@NotNull BaseSearchItem baseSearchItem) {
        String str;
        if (this.f87399b) {
            String goTo = baseSearchItem.getGoTo();
            str = goTo;
            if (goTo == null) {
                str = "";
            }
        } else {
            String linkType = baseSearchItem.getLinkType();
            str = linkType;
            if (linkType == null) {
                str = "";
            }
        }
        return str;
    }

    @NotNull
    public final String r0(boolean z6, @NotNull SearchBangumiItem searchBangumiItem) {
        String str;
        if (this.f87399b) {
            SearchBangumiItem.a aVar = SearchBangumiItem.Companion;
            int mediaType = searchBangumiItem.getMediaType();
            aVar.getClass();
            str = SearchBangumiItem.a.a(mediaType) ? z6 ? "pgc.bangumi-search.search-card.all.click" : "pgc.bangumi-search.search-card.all.show" : z6 ? "pgc.cinema-search.search-card.all.click" : "pgc.cinema-search.search-card.all.show";
        } else {
            str = this.f87400c ? z6 ? "search.ogv-search.search-card.all.click" : "search.ogv-search.search-card.all.show" : z6 ? "search.search-result.search-card.all.click" : "search.search-result.search-card.all.show";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.String> t0(com.bilibili.search2.api.SearchBangumiItem r7) {
        /*
            r6 = this;
            r0 = r7
            java.util.List r0 = r0.getBadges()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L21
            r0 = r7
            r1 = 0
            java.lang.Object r0 = kotlin.collections.CollectionsKt.getOrNull(r0, r1)
            com.bilibili.search2.api.Tag r0 = (com.bilibili.search2.api.Tag) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L21
            r0 = r7
            java.lang.String r0 = r0.getText()
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L25
        L21:
            java.lang.String r0 = ""
            r7 = r0
        L25:
            r0 = 1
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "badges"
            r4 = r7
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r1[r2] = r3
            java.util.Map r0 = kotlin.collections.MapsKt.mutableMapOf(r0)
            r8 = r0
            r0 = r6
            boolean r0 = r0.f87399b
            if (r0 == 0) goto L6e
            r0 = r6
            boolean r0 = r0.f87417u
            if (r0 == 0) goto L4c
            java.lang.String r0 = "0"
            r7 = r0
            goto L50
        L4c:
            java.lang.String r0 = "1"
            r7 = r0
        L50:
            r0 = r8
            java.lang.String r1 = "is_recall"
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r8
            java.lang.String r1 = "server_page_pos"
            r2 = r6
            int r2 = r2.getBindingAdapterPosition()
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
        L6e:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.bangumi.C6066f.t0(com.bilibili.search2.api.SearchBangumiItem):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x021a  */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.bilibili.okretro.converter.IParser, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [com.bilibili.okretro.converter.IParser, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.bangumi.C6066f.u0(android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0(boolean z6) {
        RecyclerView recyclerView = this.f87413q;
        c cVar = this.f87418v;
        recyclerView.removeItemDecoration(cVar);
        d dVar = this.f87419w;
        recyclerView.removeItemDecoration(dVar);
        if (((SearchBangumiItem) getData()).getEpisodesNew() == null || !(!r0.isEmpty())) {
            recyclerView.setVisibility(8);
            return;
        }
        Context context = this.itemView.getContext();
        recyclerView.setLayoutManager(z6 ? new LinearLayoutManager(context, 0, false) : new GridLayoutManager(context, 6));
        if (z6) {
            recyclerView.addItemDecoration(dVar);
        } else {
            recyclerView.addItemDecoration(cVar);
            List<EpisodeNew> episodesNew = ((SearchBangumiItem) getData()).getEpisodesNew();
            if ((episodesNew != null ? Integer.valueOf(episodesNew.size()) : null).intValue() > 6) {
                SearchBangumiItem searchBangumiItem = (SearchBangumiItem) getData();
                List<EpisodeNew> episodesNew2 = ((SearchBangumiItem) getData()).getEpisodesNew();
                List<EpisodeNew> listSubList = null;
                if (episodesNew2 != null) {
                    listSubList = episodesNew2.subList(0, 6);
                }
                searchBangumiItem.setEpisodesNew(listSubList);
            }
        }
        r<EpisodeNew> rVar = new r<>(z6 ? 2131494427 : 2131494426, new E91.b(this.f87399b));
        rVar.f87459e = z6;
        this.f87416t = rVar;
        List<EpisodeNew> episodesNew3 = ((SearchBangumiItem) getData()).getEpisodesNew();
        if (episodesNew3 != null) {
            Iterator<T> it = episodesNew3.iterator();
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int i9 = i8;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int i10 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                EpisodeNew episodeNew = (EpisodeNew) next;
                episodeNew.setPosForNeuron(i10);
                int i11 = i9;
                if (episodeNew.getType() == 0) {
                    episodeNew.setPosition(i9);
                    i11 = i9 + 1;
                }
                i7 = i10;
                i8 = i11;
            }
        }
        r<EpisodeNew> rVar2 = this.f87416t;
        if (rVar2 != null) {
            rVar2.N(((SearchBangumiItem) getData()).getEpisodesNew());
        }
        recyclerView.setAdapter(this.f87416t);
        recyclerView.setVisibility(0);
        if (z6) {
            ListExtentionsKt.scrollToPositionWithOffset(recyclerView, ((SearchBangumiItem) getData()).getScrollPosition(), ((SearchBangumiItem) getData()).getItemOffset());
        }
    }

    public final void w0() {
        boolean z6 = true;
        if (((SearchBangumiItem) getData()).isAtten() != 1) {
            z6 = false;
        }
        int i7 = C6062b.f87387a;
        C6062b.c(this.f87412p, this.f87411o, z6, (SearchBangumiItem) getData(), 2131240002, 2131239921);
        SearchBangumiItem.FollowButton followButton = ((SearchBangumiItem) getData()).getFollowButton();
        C6062b.b(this.f87415s, followButton != null ? followButton.getIcon() : null, z6);
    }
}
