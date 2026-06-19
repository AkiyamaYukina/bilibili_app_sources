package com.bilibili.search2.result.holder.comic;

import Bl.U;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.compose.animation.core.C3337p;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.EpisodeNew;
import com.bilibili.search2.api.EpisodeSelectStyle;
import com.bilibili.search2.api.FollowButtonV2;
import com.bilibili.search2.api.SearchComicItem;
import com.bilibili.search2.api.Tag;
import com.bilibili.search2.result.holder.comic.ComicNewHolder;
import com.bilibili.search2.result.ogv.aggregate.subpage.SearchAggregateFragment;
import com.bilibili.search2.utils.B;
import com.bilibili.search2.utils.CoverAspectRatio;
import com.bilibili.search2.utils.s;
import dt0.AbstractC6843f;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/ComicNewHolder.class */
@StabilityInferred(parameters = 0)
public final class ComicNewHolder extends AbstractC6843f<SearchComicItem> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Companion f88082f = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final U f88083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public o<EpisodeNew> f88084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f88086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b f88087e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/ComicNewHolder$Companion.class */
    public static final class Companion {
        @JvmStatic
        @Keep
        @NotNull
        public final ComicNewHolder create(@NotNull ViewGroup viewGroup) {
            return new ComicNewHolder(U.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/ComicNewHolder$a.class */
    public static final class a extends RecyclerView.ItemDecoration {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/ComicNewHolder$b.class */
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

    static {
        ListExtentionsKt.toPx(8);
        ListExtentionsKt.toPx(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.recyclerview.widget.RecyclerView$ItemDecoration, com.bilibili.search2.result.holder.comic.ComicNewHolder$a] */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.recyclerview.widget.RecyclerView$ItemDecoration, com.bilibili.search2.result.holder.comic.ComicNewHolder$b] */
    public ComicNewHolder(@NotNull U u7) {
        super(u7.a);
        this.f88083a = u7;
        this.f88086d = new RecyclerView.ItemDecoration();
        this.f88087e = new RecyclerView.ItemDecoration();
        u7.g.setOnClickListener(new QG0.e(2, this));
        this.itemView.setOnClickListener(new QG0.f(this, 2));
        u7.d.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.search2.result.holder.comic.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ComicNewHolder f88091a;

            {
                this.f88091a = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.comic.ComicNewHolder, dt0.b] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LifecycleOwner viewLifecycleOwner;
                LifecycleCoroutineScope lifecycleScope;
                LifecycleOwner viewLifecycleOwner2;
                LifecycleCoroutineScope lifecycleScope2;
                ?? r02 = this.f88091a;
                ComicNewHolder.Companion companion = ComicNewHolder.f88082f;
                long cid = ((SearchComicItem) r02.getData()).getCid();
                if (!C3337p.c(r02.itemView)) {
                    Os0.e.f18030a.d(r02.itemView.getContext());
                    return;
                }
                if (((SearchComicItem) r02.getData()).isAttended()) {
                    Fragment fragment = r02.getFragment();
                    if (fragment != null && (viewLifecycleOwner2 = fragment.getViewLifecycleOwner()) != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2)) != null) {
                        BuildersKt.launch$default(lifecycleScope2, (CoroutineContext) null, (CoroutineStart) null, new ComicNewHolder$onFollowClick$1(cid, r02, null), 3, (Object) null);
                    }
                } else {
                    Fragment fragment2 = r02.getFragment();
                    if (fragment2 != null && (viewLifecycleOwner = fragment2.getViewLifecycleOwner()) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) != null) {
                        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new ComicNewHolder$onFollowClick$2(cid, r02, null), 3, (Object) null);
                    }
                }
                String str = ((SearchComicItem) r02.getData()).isAttended() ? "unfocus" : "focus";
                if (((SearchComicItem) r02.getData()).isFromComicPage()) {
                    String linkType = ((SearchComicItem) r02.getData()).getLinkType();
                    if (linkType == null) {
                        linkType = "manga";
                    }
                    Xs0.b.i("search.comic-search.search-card.all.click", str, linkType, (BaseSearchItem) r02.getData(), null, null, Xs0.b.b(((SearchComicItem) r02.getData()).getLinkType(), str), null, null, null, false, null, 8112);
                    return;
                }
                if (r02.f88085c) {
                    String linkType2 = ((SearchComicItem) r02.getData()).getLinkType();
                    if (linkType2 == null) {
                        linkType2 = "manga";
                    }
                    Xs0.b.g("search.ogv-search.search-card.all.click", str, linkType2, (BaseSearchItem) r02.getData(), Xs0.b.b(((SearchComicItem) r02.getData()).getLinkType(), str), null, r02.getFragment(), 1968);
                }
            }
        });
    }

    @JvmStatic
    @Keep
    @NotNull
    public static final ComicNewHolder create(@NotNull ViewGroup viewGroup) {
        return f88082f.create(viewGroup);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() throws NoWhenBranchMatchedException {
        String text;
        U u7 = this.f88083a;
        s.c(u7.b, this.itemView.getContext(), CoverAspectRatio.RATIO_3_4, false, true, true, 10);
        com.bilibili.search2.utils.extension.c.a(u7.b, ((SearchComicItem) getData()).getCover(), null, false, null, null, 0, 0, 254);
        u7.c.tagBuilder().setTagText(((SearchComicItem) getData()).getBadge()).applyToView(true);
        B.A(u7.k, ColorTagHandler.decode$default(this.itemView.getContext(), ((SearchComicItem) getData()).getTitle(), 0, 4, (Object) null));
        String recText = ((SearchComicItem) getData()).getRecText();
        TintTextView tintTextView = u7.h;
        if (recText == null || ListExtentionsKt.takeIfNotBlank(recText) == null) {
            B.A(tintTextView, ColorTagHandler.decode$default(this.itemView.getContext(), ((SearchComicItem) getData()).getName(), 0, 4, (Object) null));
        } else {
            B.A(tintTextView, ColorTagHandler.decode$default(this.itemView.getContext(), ((SearchComicItem) getData()).getRecText(), 0, 4, (Object) null));
        }
        Tag recTag = ((SearchComicItem) getData()).getRecTag();
        TagSpanTextView tagSpanTextView = u7.j;
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
        ConstraintLayout constraintLayout = u7.a;
        RecyclerView recyclerView = u7.i;
        if (episodesNew == null || !(!episodesNew.isEmpty())) {
            recyclerView.setVisibility(8);
            PaddingUtilsKt.setPaddingBottom(constraintLayout, ListExtentionsKt.toPx(12));
        } else {
            recyclerView.setLayoutManager(null);
            recyclerView.setAdapter(null);
            String selectionStyle = ((SearchComicItem) getData()).getSelectionStyle();
            if (Intrinsics.areEqual(selectionStyle, EpisodeSelectStyle.Grid.getValue())) {
                q0(false);
                o<EpisodeNew> oVar = this.f88084b;
                if (oVar != null) {
                    oVar.f88115d = new Function2(this) { // from class: com.bilibili.search2.result.holder.comic.e

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final ComicNewHolder f88093a;

                        {
                            this.f88093a = this;
                        }

                        /* JADX WARN: Type inference failed for: r0v7, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.comic.ComicNewHolder, dt0.f] */
                        public final Object invoke(Object obj, Object obj2) {
                            String param;
                            EpisodeNew episodeNew = (EpisodeNew) obj;
                            ((Integer) obj2).getClass();
                            ComicNewHolder.Companion companion = ComicNewHolder.f88082f;
                            ?? r02 = this.f88093a;
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
                o<EpisodeNew> oVar2 = this.f88084b;
                if (oVar2 != null) {
                    oVar2.f88115d = new Function2(this) { // from class: com.bilibili.search2.result.holder.comic.d

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final ComicNewHolder f88092a;

                        {
                            this.f88092a = this;
                        }

                        /* JADX WARN: Type inference failed for: r0v7, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.comic.ComicNewHolder, dt0.f] */
                        public final Object invoke(Object obj, Object obj2) {
                            EpisodeNew episodeNew = (EpisodeNew) obj;
                            ((Integer) obj2).getClass();
                            ComicNewHolder.Companion companion = ComicNewHolder.f88082f;
                            ?? r02 = this.f88092a;
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
        r0();
    }

    @Override // dt0.AbstractC6839b
    public final void bindFragment(@Nullable Fragment fragment) {
        super.bindFragment(fragment);
        this.f88085c = fragment instanceof SearchAggregateFragment;
    }

    @Override // dt0.AbstractC6843f
    @Nullable
    public final View getClickStatusView() {
        return this.f88083a.k;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
        if (!((SearchComicItem) getData()).isExposed()) {
            SearchComicItem searchComicItem = (SearchComicItem) getData();
            RecyclerView recyclerView = getRecyclerView();
            boolean z6 = false;
            if ((recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0) == 0) {
                z6 = true;
            }
            searchComicItem.setAtFirstScreen(z6);
        }
        if (((SearchComicItem) getData()).isFromComicPage()) {
            String linkType = ((SearchComicItem) getData()).getLinkType();
            if (linkType == null) {
                linkType = "manga";
            }
            Xs0.b.k("search.comic-search.search-card.all.show", linkType, (BaseSearchItem) getData(), null, null, false, null, null, null, 1016);
            return;
        }
        if (this.f88085c) {
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
        RecyclerView recyclerView = this.f88083a.i;
        a aVar = this.f88086d;
        recyclerView.removeItemDecoration(aVar);
        b bVar = this.f88087e;
        recyclerView.removeItemDecoration(bVar);
        if (((SearchComicItem) getData()).getEpisodesNew() == null || !(!r0.isEmpty())) {
            recyclerView.setVisibility(8);
            return;
        }
        Context context = this.itemView.getContext();
        recyclerView.setLayoutManager(z6 ? new LinearLayoutManager(context, 0, false) : new GridLayoutManager(context, 6));
        if (z6) {
            recyclerView.addItemDecoration(bVar);
        } else {
            recyclerView.addItemDecoration(aVar);
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
        this.f88084b = oVar;
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
        o<EpisodeNew> oVar2 = this.f88084b;
        if (oVar2 != null) {
            oVar2.N(((SearchComicItem) getData()).getEpisodesNew());
        }
        recyclerView.setAdapter(this.f88084b);
        recyclerView.setVisibility(0);
        if (z6) {
            ListExtentionsKt.scrollToPositionWithOffset(recyclerView, ((SearchComicItem) getData()).getScrollPosition(), ((SearchComicItem) getData()).getItemOffset());
        }
    }

    public final void r0() {
        boolean zIsAttended = ((SearchComicItem) getData()).isAttended();
        U u7 = this.f88083a;
        if (zIsAttended) {
            u7.d.setHorizontalGravity(17);
        } else {
            u7.d.setHorizontalGravity(3);
        }
        com.bilibili.search2.result.holder.comic.b.b(u7.d, u7.f, zIsAttended, (SearchComicItem) getData(), 2131240002, R$color.Brand_pink, 2131239997, R$color.Graph_bg_thick);
        BiliImageView biliImageView = u7.e;
        FollowButtonV2 followButton = ((SearchComicItem) getData()).getFollowButton();
        com.bilibili.search2.result.holder.comic.b.a(R$color.Brand_pink, biliImageView, followButton != null ? followButton.getIcon() : null, zIsAttended);
    }
}
