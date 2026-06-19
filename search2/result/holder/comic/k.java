package com.bilibili.search2.result.holder.comic;

import Bl.V;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
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
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.EpisodeNew;
import com.bilibili.search2.api.EpisodeSelectStyle;
import com.bilibili.search2.api.SearchComicItem;
import com.bilibili.search2.api.Tag;
import com.bilibili.search2.result.ogv.aggregate.subpage.SearchAggregateFragment;
import com.bilibili.search2.utils.B;
import com.bilibili.search2.utils.s;
import dt0.AbstractC6843f;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/k.class */
@StabilityInferred(parameters = 0)
public final class k extends AbstractC6843f<SearchComicItem> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final V f88101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public o<EpisodeNew> f88102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final b f88104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final c f88105e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/k$a.class */
    public static final class a implements com.bilibili.search2.share.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f88106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FragmentActivity f88107b;

        public a(k kVar, FragmentActivity fragmentActivity) {
            this.f88106a = kVar;
            this.f88107b = fragmentActivity;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
        /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
        @Override // com.bilibili.search2.share.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                Method dump skipped, instruction units count: 751
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.comic.k.a.a():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/k$b.class */
    public static final class b extends RecyclerView.ItemDecoration {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/k$c.class */
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.recyclerview.widget.RecyclerView$ItemDecoration, com.bilibili.search2.result.holder.comic.k$b] */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.recyclerview.widget.RecyclerView$ItemDecoration, com.bilibili.search2.result.holder.comic.k$c] */
    public k(@NotNull V v7) {
        super(v7.a);
        this.f88101a = v7;
        this.f88104d = new RecyclerView.ItemDecoration();
        this.f88105e = new RecyclerView.ItemDecoration();
        this.itemView.setOnClickListener(new Kq.n(this, 2));
        v7.d.setOnClickListener(new f(this, 0));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() throws NoWhenBranchMatchedException {
        String text;
        String strTakeIfNotBlank;
        V v7 = this.f88101a;
        s.c(v7.b, this.itemView.getContext(), null, true, false, true, 22);
        com.bilibili.search2.utils.extension.c.a(v7.b, ((SearchComicItem) getData()).getCover(), null, false, null, null, 0, 0, 254);
        v7.c.tagBuilder().setTagText(((SearchComicItem) getData()).getBadge()).applyToView(true);
        boolean z6 = false;
        CharSequence charSequenceDecode$default = ColorTagHandler.decode$default(this.itemView.getContext(), ((SearchComicItem) getData()).getTitle(), 0, 4, (Object) null);
        B.A(v7.h, charSequenceDecode$default);
        if (((SearchComicItem) getData()).getShareTitle() == null && charSequenceDecode$default != null) {
            ((SearchComicItem) getData()).setShareTitle(charSequenceDecode$default.toString());
        }
        String recText = ((SearchComicItem) getData()).getRecText();
        TintTextView tintTextView = v7.e;
        if (recText == null || (strTakeIfNotBlank = ListExtentionsKt.takeIfNotBlank(recText)) == null) {
            B.A(tintTextView, ColorTagHandler.decode$default(this.itemView.getContext(), ((SearchComicItem) getData()).getName(), 0, 4, (Object) null));
        } else {
            B.A(tintTextView, ColorTagHandler.decode$default(this.itemView.getContext(), strTakeIfNotBlank, 0, 4, (Object) null));
        }
        Tag recTag = ((SearchComicItem) getData()).getRecTag();
        TagSpanTextView tagSpanTextView = v7.g;
        if (recTag == null || (text = recTag.getText()) == null || StringsKt.isBlank(text)) {
            String style = ((SearchComicItem) getData()).getStyle();
            if (style == null || StringsKt.isBlank(style)) {
                ListExtentionsKt.gone(tagSpanTextView);
            } else {
                B.A(tagSpanTextView, ((SearchComicItem) getData()).getStyle());
            }
        } else {
            TagSpanTextView.TagBuilder tagBuilder = tagSpanTextView.tagBuilder();
            if (!TextUtils.isEmpty(recTag.getText())) {
                TagSpanTextView.TagBuilder.appendTag$default(tagBuilder.setTagText(recTag.getText()).setTagTextColor(recTag.getTextColor()).setTagNightTextColor(recTag.getTextColorNight()).setTagBackgroundColor(recTag.getBgColor()).setTagNightBackgroundColor(recTag.getBgColorNight()).setTagBorderColor(recTag.getBorderColor()).setTagNightBorderColor(recTag.getBorderColorNight()).setTagBackgroundStyle(recTag.getBgStyle()).setTagVerticalPadding(ListExtentionsKt.toPx(1)).setTagHorizontalPadding(ListExtentionsKt.toPx(2)).setTagCornerRadius(ListExtentionsKt.toPx(2)).setTagTextSize(ListExtentionsKt.toPx(10)).setTagRightSpacing(ListExtentionsKt.toPx(4)).setTagBorderWidth(NewPlayerUtilsKt.toFloatPx(0.5f)), false, false, 3, (Object) null);
                String style2 = ((SearchComicItem) getData()).getStyle();
                if (style2 != null) {
                    tagBuilder.appendText(style2);
                }
                tagBuilder.applyToView();
                ListExtentionsKt.visible(tagSpanTextView);
            }
        }
        List<EpisodeNew> episodesNew = ((SearchComicItem) getData()).getEpisodesNew();
        ConstraintLayout constraintLayout = v7.a;
        RecyclerView recyclerView = v7.f;
        if (episodesNew == null || !(!episodesNew.isEmpty())) {
            recyclerView.setVisibility(8);
            PaddingUtilsKt.setPaddingBottom(constraintLayout, ListExtentionsKt.toPx(12));
        } else {
            recyclerView.setLayoutManager(null);
            recyclerView.setAdapter(null);
            String selectionStyle = ((SearchComicItem) getData()).getSelectionStyle();
            if (Intrinsics.areEqual(selectionStyle, EpisodeSelectStyle.Grid.getValue())) {
                q0(false);
                o<EpisodeNew> oVar = this.f88102b;
                if (oVar != null) {
                    oVar.f88115d = new Function2(this) { // from class: com.bilibili.search2.result.holder.comic.h

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final k f88097a;

                        {
                            this.f88097a = this;
                        }

                        /* JADX WARN: Type inference failed for: r0v6, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.comic.k, dt0.f] */
                        public final Object invoke(Object obj, Object obj2) {
                            String param;
                            EpisodeNew episodeNew = (EpisodeNew) obj;
                            ((Integer) obj2).getClass();
                            ?? r02 = this.f88097a;
                            if (episodeNew != null && (param = episodeNew.getParam()) != null && !StringsKt.isBlank(param)) {
                                ((SearchComicItem) r02.getData()).clickEpisode(episodeNew.getParam());
                            }
                            q.a(r02.itemView.getContext(), (SearchComicItem) r02.getData(), episodeNew, ((SearchComicItem) r02.getData()).getClickEpisode());
                            r02.clickWithRefreshStatus();
                            return Unit.INSTANCE;
                        }
                    };
                }
                PaddingUtilsKt.setPaddingBottom(constraintLayout, ListExtentionsKt.toPx(12));
            } else if (Intrinsics.areEqual(selectionStyle, EpisodeSelectStyle.Horizontal.getValue())) {
                q0(true);
                o<EpisodeNew> oVar2 = this.f88102b;
                if (oVar2 != null) {
                    oVar2.f88115d = new Function2(this) { // from class: com.bilibili.search2.result.holder.comic.g

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final k f88096a;

                        {
                            this.f88096a = this;
                        }

                        /* JADX WARN: Type inference failed for: r0v6, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.comic.k, dt0.f] */
                        public final Object invoke(Object obj, Object obj2) {
                            EpisodeNew episodeNew = (EpisodeNew) obj;
                            ((Integer) obj2).getClass();
                            ?? r02 = this.f88096a;
                            if (episodeNew != null) {
                                String param = episodeNew.getParam();
                                if (param != null) {
                                    if (StringsKt.isBlank(param)) {
                                        param = null;
                                    }
                                    if (param != null) {
                                        ((SearchComicItem) r02.getData()).clickEpisode(episodeNew.getParam());
                                    }
                                }
                            }
                            q.b(r02.itemView.getContext(), (SearchComicItem) r02.getData(), episodeNew);
                            r02.clickWithRefreshStatus();
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                recyclerView.setVisibility(8);
                PaddingUtilsKt.setPaddingBottom(constraintLayout, ListExtentionsKt.toPx(12));
            }
        }
        ImageView imageView = v7.d;
        List<BaseSearchItem.ThreePointItem> threePoints = ((SearchComicItem) getData()).getThreePoints();
        if (threePoints == null || threePoints.isEmpty()) {
            z6 = true;
        }
        imageView.setVisibility(ListExtentionsKt.toVisibility(true ^ z6));
        ImageView imageView2 = v7.d;
        int px = ListExtentionsKt.toPx(9);
        B.j(imageView2, px, px, px, px);
    }

    @Override // dt0.AbstractC6839b
    public final void bindFragment(@Nullable Fragment fragment) {
        super.bindFragment(fragment);
        this.f88103c = fragment instanceof SearchAggregateFragment;
    }

    @Override // dt0.AbstractC6843f
    @Nullable
    public final View getClickStatusView() {
        return this.f88101a.h;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
        if (((SearchComicItem) getData()).isFromComicPage()) {
            String linkType = ((SearchComicItem) getData()).getLinkType();
            if (linkType == null) {
                linkType = "manga";
            }
            Xs0.b.k("search.comic-search.search-card.all.show", linkType, (BaseSearchItem) getData(), null, null, false, null, null, null, 1016);
            return;
        }
        if (this.f88103c) {
            String linkType2 = ((SearchComicItem) getData()).getLinkType();
            if (linkType2 == null) {
                linkType2 = "manga";
            }
            Xs0.b.h("search.ogv-search.search-card.all.show", linkType2, (BaseSearchItem) getData(), null, getFragment(), 248);
            return;
        }
        String linkType3 = ((SearchComicItem) getData()).getLinkType();
        if (linkType3 == null) {
            linkType3 = "manga";
        }
        Xs0.b.k("search.search-result.search-card.all.show", linkType3, (BaseSearchItem) getData(), null, null, false, null, null, null, 1016);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(boolean z6) {
        RecyclerView recyclerView = this.f88101a.f;
        b bVar = this.f88104d;
        recyclerView.removeItemDecoration(bVar);
        c cVar = this.f88105e;
        recyclerView.removeItemDecoration(cVar);
        if (((SearchComicItem) getData()).getEpisodesNew() == null || !(!r0.isEmpty())) {
            recyclerView.setVisibility(8);
            return;
        }
        Context context = this.itemView.getContext();
        recyclerView.setLayoutManager(z6 ? new LinearLayoutManager(context, 0, false) : new GridLayoutManager(context, 6));
        if (z6) {
            recyclerView.addItemDecoration(cVar);
        } else {
            recyclerView.addItemDecoration(bVar);
            List<EpisodeNew> episodesNew = ((SearchComicItem) getData()).getEpisodesNew();
            if ((episodesNew != null ? Integer.valueOf(episodesNew.size()) : null).intValue() > 6) {
                SearchComicItem searchComicItem = (SearchComicItem) getData();
                List<EpisodeNew> episodesNew2 = ((SearchComicItem) getData()).getEpisodesNew();
                List<EpisodeNew> listSubList = null;
                if (episodesNew2 != null) {
                    listSubList = episodesNew2.subList(0, 6);
                }
                searchComicItem.setEpisodesNew(listSubList);
            }
        }
        o<EpisodeNew> oVar = new o<>(z6 ? 2131494427 : 2131494426, new p(0));
        oVar.f88116e = z6;
        this.f88102b = oVar;
        List<EpisodeNew> episodesNew3 = ((SearchComicItem) getData()).getEpisodesNew();
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
        o<EpisodeNew> oVar2 = this.f88102b;
        if (oVar2 != null) {
            oVar2.N(((SearchComicItem) getData()).getEpisodesNew());
        }
        recyclerView.setAdapter(this.f88102b);
        recyclerView.setVisibility(0);
        if (z6) {
            ListExtentionsKt.scrollToPositionWithOffset(recyclerView, ((SearchComicItem) getData()).getScrollPosition(), ((SearchComicItem) getData()).getItemOffset());
        }
    }
}
