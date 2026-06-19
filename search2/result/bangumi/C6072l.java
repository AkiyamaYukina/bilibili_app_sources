package com.bilibili.search2.result.bangumi;

import Bl.x0;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.common.utils.share.ListShareHelper;
import com.bilibili.app.comm.list.widget.tag.TagView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.app.comm.supermenu.share.v2.SharePanelWrapper;
import com.bilibili.lib.sharewrapper.online.ShareOnlineParams;
import com.bilibili.lib.sharewrapper.util.SessionManager;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.EpisodeNew;
import com.bilibili.search2.api.EpisodeSelectStyle;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.search2.api.Tag;
import com.bilibili.search2.ogv.OgvSearchResultFragment;
import com.bilibili.search2.result.ogv.aggregate.subpage.SearchAggregateFragment;
import dt0.AbstractC6843f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kntr.base.localization.NumberFormat_androidKt;
import kntr.common.share.common.SharePanelStyle;
import kntr.common.share.domain.model.ShareParams;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PriorityLinearLayout;

/* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/l.class */
@StabilityInferred(parameters = 0)
public final class C6072l extends AbstractC6843f<SearchBangumiItem> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final x0 f87435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f87436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f87437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public r<EpisodeNew> f87438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final c f87439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final d f87440f;

    /* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.l$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/l$a.class */
    public static final class a implements com.bilibili.search2.share.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6072l f87441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FragmentActivity f87442b;

        public a(FragmentActivity fragmentActivity, C6072l c6072l) {
            this.f87441a = c6072l;
            this.f87442b = fragmentActivity;
        }

        @Override // com.bilibili.search2.share.a
        public final void a() {
            BaseSearchItem.OgvShare ogvShare;
            C6072l c6072l = this.f87441a;
            BaseSearchItem.Share share = ((SearchBangumiItem) c6072l.getData()).getShare();
            if (share == null || share.getOgvShare() == null) {
                return;
            }
            boolean zA = com.bilibili.search2.component.a.a();
            FragmentActivity fragmentActivity = this.f87442b;
            if (!zA) {
                SharePanelWrapper.Companion.with(fragmentActivity).shareOnlineParams(com.bilibili.search2.utils.t.d((SearchBangumiItem) c6072l.getData())).shareContentProvider(new C6074n(fragmentActivity, c6072l)).show();
                return;
            }
            ShareOnlineParams shareOnlineParamsD = com.bilibili.search2.utils.t.d((SearchBangumiItem) c6072l.getData());
            String str = shareOnlineParamsD.shareId;
            if (str == null) {
                str = "";
            }
            String str2 = shareOnlineParamsD.oid;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = shareOnlineParamsD.shareOrigin;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = shareOnlineParamsD.sid;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = shareOnlineParamsD.spmId;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = shareOnlineParamsD.tag;
            if (str6 == null) {
                str6 = "";
            }
            kntr.common.share.domain.model.h hVar = new kntr.common.share.domain.model.h(new ShareParams(str, str2, str3, str4, new ShareParams.PageInfo(str5, (String) null, (String) null, (String) null, str6, 14, (DefaultConstructorMarker) null), (List) null, 32, (DefaultConstructorMarker) null), (String) null, 6);
            SessionManager.INSTANCE.generateSessionId();
            kntr.common.share.api.k kVar = kntr.common.share.api.k.a;
            C6073m c6073m = new C6073m((SearchBangumiItem) c6072l.getData(), c6072l);
            ListShareHelper listShareHelper = ListShareHelper.INSTANCE;
            BaseSearchItem.Share share2 = ((SearchBangumiItem) c6072l.getData()).getShare();
            long seasonId = (share2 == null || (ogvShare = share2.getOgvShare()) == null) ? 0L : ogvShare.getSeasonId();
            BaseSearchItem.Share share3 = ((SearchBangumiItem) c6072l.getData()).getShare();
            long epId = 0;
            if (share3 != null) {
                BaseSearchItem.OgvShare ogvShare2 = share3.getOgvShare();
                epId = 0;
                if (ogvShare2 != null) {
                    epId = ogvShare2.getEpId();
                }
            }
            kntr.common.share.domain.model.c cVar = new kntr.common.share.domain.model.c(ListShareHelper.getKShareContent$default(listShareHelper, fragmentActivity, c6073m, "ogv_video_detail_action_normal_share", 0, (String) null, (Integer) null, Long.valueOf(seasonId), false, false, false, 0, false, "18", String.valueOf(epId), 4024, (Object) null), (Function1) null, (Function1) null, 14);
            v71.e eVar = new v71.e();
            eVar.c = new C6071k(0, fragmentActivity, c6072l);
            eVar.a = new com.bilibili.bililive.biz.rank.poprank.c(1);
            Unit unit = Unit.INSTANCE;
            kntr.common.share.api.k.d(kVar, hVar, cVar, eVar, (SharePanelStyle) null, 24);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.l$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/l$b.class */
    public static final class b extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6072l f87443a;

        public b(C6072l c6072l) {
            this.f87443a = c6072l;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            int left;
            super.onScrollStateChanged(recyclerView, i7);
            if (i7 == 0) {
                View childAt = recyclerView.getChildAt(0);
                int bindingAdapterPosition = recyclerView.getChildViewHolder(childAt).getBindingAdapterPosition();
                C6072l c6072l = this.f87443a;
                SearchBangumiItem searchBangumiItem = (SearchBangumiItem) c6072l.getData();
                if (childAt.getLeft() < 0) {
                    bindingAdapterPosition++;
                }
                searchBangumiItem.setScrollPosition(bindingAdapterPosition);
                SearchBangumiItem searchBangumiItem2 = (SearchBangumiItem) c6072l.getData();
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

    /* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.l$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/l$c.class */
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

    /* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.l$d */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/l$d.class */
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
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.recyclerview.widget.RecyclerView$ItemDecoration, com.bilibili.search2.result.bangumi.l$c] */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.recyclerview.widget.RecyclerView$ItemDecoration, com.bilibili.search2.result.bangumi.l$d] */
    public C6072l(@NotNull x0 x0Var) {
        super(x0Var.a);
        this.f87435a = x0Var;
        this.itemView.setOnClickListener(new OS0.A(this, 1));
        x0Var.f.setOnClickListener(new OS0.B(this, 1));
        x0Var.i.addOnScrollListener(new b(this));
        this.f87439e = new RecyclerView.ItemDecoration();
        this.f87440f = new RecyclerView.ItemDecoration();
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
        String text;
        String text2;
        this.itemView.setTag(getData());
        x0 x0Var = this.f87435a;
        com.bilibili.search2.utils.s.c(x0Var.d, this.itemView.getContext(), null, true, false, true, 22);
        com.bilibili.search2.utils.extension.c.a(x0Var.d, ((SearchBangumiItem) getData()).getCover(), null, false, null, null, 0, 0, 254);
        List<Tag> badgesV2 = ((SearchBangumiItem) getData()).getBadgesV2();
        TagView tagView = x0Var.e;
        boolean z6 = true;
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
        Context context = this.itemView.getContext();
        String title = ((SearchBangumiItem) getData()).getTitle();
        String str = title;
        if (title == null) {
            str = "";
        }
        CharSequence charSequenceDecode$default = ColorTagHandler.decode$default(context, str, 0, 4, (Object) null);
        x0Var.o.setText(charSequenceDecode$default);
        if (((SearchBangumiItem) getData()).getShareTitle() == null && charSequenceDecode$default != null) {
            ((SearchBangumiItem) getData()).setShareTitle(charSequenceDecode$default.toString());
        }
        String stylesV2 = ((SearchBangumiItem) getData()).getStylesV2();
        TintTextView tintTextView = x0Var.l;
        if (stylesV2 == null || StringsKt.isBlank(stylesV2)) {
        } else {
            tintTextView.setText(((SearchBangumiItem) getData()).getStylesV2());
        }
        Tag styleLabel = ((SearchBangumiItem) getData()).getStyleLabel();
        TagView tagView2 = x0Var.k;
        if (styleLabel == null || (text = styleLabel.getText()) == null || StringsKt.isBlank(text)) {
            ListExtentionsKt.gone(tagView2);
        } else {
            tagView2.tagBuilder().setTagText(styleLabel.getText()).setTagTextColor(styleLabel.getTextColor()).setTagNightTextColor(styleLabel.getTextColorNight()).setTagBackgroundColor(styleLabel.getBgColor()).setTagNightBackgroundColor(styleLabel.getBgColorNight()).setTagBorderColor(styleLabel.getBorderColor()).setTagNightBorderColor(styleLabel.getBorderColorNight()).setTagBackgroundStyle(styleLabel.getBgStyle()).applyToView();
            tagView2.setVisibility(0);
        }
        if (tintTextView.getVisibility() == 8 && tagView2.getVisibility() == 8) {
        }
        String label = ((SearchBangumiItem) getData()).getLabel();
        TintTextView tintTextView2 = x0Var.n;
        if (label == null || StringsKt.isBlank(label)) {
            tintTextView2.setVisibility(8);
        } else {
            Context context2 = this.itemView.getContext();
            String label2 = ((SearchBangumiItem) getData()).getLabel();
            if (label2 == null) {
                label2 = "";
            }
            tintTextView2.setText(ColorTagHandler.decode$default(context2, label2, 0, 4, (Object) null));
            tintTextView2.setVisibility(0);
        }
        double rating = ((SearchBangumiItem) getData()).getRating();
        PriorityLinearLayout priorityLinearLayout = x0Var.b;
        if (rating > 0.0d) {
            priorityLinearLayout.setVisibility(0);
            x0Var.j.setText(String.valueOf(((SearchBangumiItem) getData()).getRating()));
            x0Var.c.setText(this.itemView.getResources().getQuantityString(2131689729, ((SearchBangumiItem) getData()).getVote(), NumberFormat_androidKt.format$default(Integer.valueOf(((SearchBangumiItem) getData()).getVote()), (String) null, 0, 3, (Object) null)));
        } else {
            priorityLinearLayout.setVisibility(8);
        }
        boolean zIsShowEpisodesSelectLayout = ((SearchBangumiItem) getData()).isShowEpisodesSelectLayout();
        ConstraintLayout constraintLayout = x0Var.g;
        RecyclerView recyclerView = x0Var.i;
        if (zIsShowEpisodesSelectLayout) {
            recyclerView.setLayoutManager(null);
            recyclerView.setAdapter(null);
            String selectionStyle = ((SearchBangumiItem) getData()).getSelectionStyle();
            if (Intrinsics.areEqual(selectionStyle, EpisodeSelectStyle.Grid.getValue())) {
                u0(false);
                final String strR0 = r0(true, (SearchBangumiItem) getData());
                final Map<String, String> mapT0 = t0((SearchBangumiItem) getData());
                r<EpisodeNew> rVar = this.f87438d;
                if (rVar != null) {
                    final int i7 = 0;
                    rVar.f87458d = new Function2(this, i7, strR0, mapT0) { // from class: com.bilibili.search2.result.bangumi.i

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f87425a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f87426b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Object f87427c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final Object f87428d;

                        {
                            this.f87425a = i7;
                            this.f87426b = this;
                            this.f87427c = strR0;
                            this.f87428d = mapT0;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:34:0x02bf  */
                        /* JADX WARN: Type inference failed for: r0v16, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.bangumi.l, dt0.f] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                            /*
                                Method dump skipped, instruction units count: 1205
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.bangumi.C6069i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    };
                }
                PaddingUtilsKt.setPaddingBottom(constraintLayout, ListExtentionsKt.toPx(12));
            } else if (Intrinsics.areEqual(selectionStyle, EpisodeSelectStyle.Horizontal.getValue())) {
                u0(true);
                final String strR02 = r0(true, (SearchBangumiItem) getData());
                final Map<String, String> mapT02 = t0((SearchBangumiItem) getData());
                r<EpisodeNew> rVar2 = this.f87438d;
                if (rVar2 != null) {
                    rVar2.f87458d = new Function2(this, strR02, mapT02) { // from class: com.bilibili.search2.result.bangumi.j

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final C6072l f87429a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final String f87430b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Map f87431c;

                        {
                            this.f87429a = this;
                            this.f87430b = strR02;
                            this.f87431c = mapT02;
                        }

                        /* JADX WARN: Type inference failed for: r0v8, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.bangumi.l, dt0.f] */
                        public final Object invoke(Object obj, Object obj2) {
                            Map map = this.f87431c;
                            EpisodeNew episodeNew = (EpisodeNew) obj;
                            ((Integer) obj2).getClass();
                            ?? r02 = this.f87429a;
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
                            t.b(r02.itemView.getContext(), (SearchBangumiItem) r02.getData(), episodeNew, r02.f87436b, this.f87430b, map, r02.q0((BaseSearchItem) r02.getData()), C6072l.s0((SearchBangumiItem) r02.getData()), r02.t0((SearchBangumiItem) r02.getData()));
                            r02.clickWithRefreshStatus();
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                recyclerView.setVisibility(8);
                PaddingUtilsKt.setPaddingBottom(constraintLayout, ListExtentionsKt.toPx(12));
            }
        } else {
            recyclerView.setVisibility(8);
            PaddingUtilsKt.setPaddingBottom(constraintLayout, ListExtentionsKt.toPx(12));
        }
        com.bilibili.search2.utils.B.d(((SearchBangumiItem) getData()).getSaleInfo(), x0Var.h, this.itemView.getContext(), (BaseSearchItem) getData());
        ImageView imageView = x0Var.f;
        if (((SearchBangumiItem) getData()).getThreePoints() == null || !(!r0.isEmpty())) {
            z6 = false;
        }
        imageView.setVisibility(ListExtentionsKt.toVisibility(z6));
        ImageView imageView2 = x0Var.f;
        int px = ListExtentionsKt.toPx(9);
        com.bilibili.search2.utils.B.j(imageView2, px, px, px, px);
    }

    @Override // dt0.AbstractC6839b
    public final void bindFragment(@Nullable Fragment fragment) {
        super.bindFragment(fragment);
        this.f87436b = fragment instanceof OgvSearchResultFragment;
        this.f87437c = fragment instanceof SearchAggregateFragment;
    }

    @Override // dt0.AbstractC6843f
    @Nullable
    public final View getClickStatusView() {
        return this.f87435a.o;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
        Map<String, String> mapT0 = t0((SearchBangumiItem) getData());
        String strR0 = r0(false, (SearchBangumiItem) getData());
        if (this.f87437c) {
            Xs0.b.h(strR0, q0((BaseSearchItem) getData()), (BaseSearchItem) getData(), mapT0, getFragment(), 232);
        } else {
            Xs0.b.k(strR0, q0((BaseSearchItem) getData()), (BaseSearchItem) getData(), null, mapT0, !this.f87436b, null, null, null, 936);
        }
        com.bilibili.search2.api.b saleInfo = ((SearchBangumiItem) getData()).getSaleInfo();
        if (saleInfo != null) {
            Xs0.b.n((BaseSearchItem) getData(), saleInfo);
        }
    }

    @NotNull
    public final String q0(@NotNull BaseSearchItem baseSearchItem) {
        String str;
        if (this.f87436b) {
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
        if (this.f87436b) {
            SearchBangumiItem.a aVar = SearchBangumiItem.Companion;
            int mediaType = searchBangumiItem.getMediaType();
            aVar.getClass();
            str = SearchBangumiItem.a.a(mediaType) ? z6 ? "pgc.bangumi-search.search-card.all.click" : "pgc.bangumi-search.search-card.all.show" : z6 ? "pgc.cinema-search.search-card.all.click" : "pgc.cinema-search.search-card.all.show";
        } else {
            str = this.f87437c ? z6 ? "search.ogv-search.search-card.all.click" : "search.ogv-search.search-card.all.show" : z6 ? "search.search-result.search-card.all.click" : "search.search-result.search-card.all.show";
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
            if (r0 != 0) goto L24
        L21:
            java.lang.String r0 = ""
            r7 = r0
        L24:
            r0 = 1
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "badges"
            r4 = r7
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r1[r2] = r3
            java.util.Map r0 = kotlin.collections.MapsKt.mutableMapOf(r0)
            r7 = r0
            r0 = r6
            boolean r0 = r0.f87436b
            if (r0 == 0) goto L5d
            r0 = r7
            java.lang.String r1 = "is_recall"
            java.lang.String r2 = "1"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            java.lang.String r1 = "server_page_pos"
            r2 = r6
            int r2 = r2.getBindingAdapterPosition()
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
        L5d:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.bangumi.C6072l.t0(com.bilibili.search2.api.SearchBangumiItem):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(boolean z6) {
        RecyclerView recyclerView = this.f87435a.i;
        c cVar = this.f87439e;
        recyclerView.removeItemDecoration(cVar);
        d dVar = this.f87440f;
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
        r<EpisodeNew> rVar = new r<>(z6 ? 2131494427 : 2131494426, new E91.b(this.f87436b));
        rVar.f87459e = z6;
        this.f87438d = rVar;
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
        r<EpisodeNew> rVar2 = this.f87438d;
        if (rVar2 != null) {
            rVar2.N(((SearchBangumiItem) getData()).getEpisodesNew());
        }
        recyclerView.setAdapter(this.f87438d);
        recyclerView.setVisibility(0);
        if (z6) {
            ListExtentionsKt.scrollToPositionWithOffset(recyclerView, ((SearchBangumiItem) getData()).getScrollPosition(), ((SearchBangumiItem) getData()).getItemOffset());
        }
    }
}
