package com.bilibili.search2.result.holder.ugcinline;

import Bl.L0;
import Bl.Y;
import Ct0.C1527b;
import Ct0.d;
import Ct0.f;
import Ct0.g;
import Ct0.h;
import Ct0.i;
import Ct0.s;
import Ct0.u;
import Ct0.v;
import Ct0.w;
import Ct0.x;
import Ct0.y;
import Ct0.z;
import Dt0.e;
import Dt0.k;
import WQ.a1;
import aC.X;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.ad.adview.search.inline.card155.V;
import com.bilibili.ad.comm.widget.button.AdDownloadButton;
import com.bilibili.adcommon.basic.Motion;
import com.bilibili.app.comm.list.common.inline.InlineTripleGuideHelper;
import com.bilibili.app.comm.list.common.inline.InlineTripleLikeTask;
import com.bilibili.app.comm.list.common.inline.config.search.SearchAutoPlayUtilsKt;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineUGCHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.widget.p;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.gemini.player.widget.watchpoint.GeminiWatchpointTextWidget;
import com.bilibili.bililive.biz.interactionpanel.pk.widget.LivePkMatchHallWidget;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import com.bilibili.bililive.infra.util.view.PixelUtil;
import com.bilibili.bililive.listplayer.ListPlayerManager;
import com.bilibili.bililive.liveaudio.LiveAudioManager;
import com.bilibili.bililive.liveaudio.device.LiveAudioDeviceManager;
import com.bilibili.bililive.room.ui.roomv3.vertical.business.a0;
import com.bilibili.bplus.followinglist.page.opus.OpusDetailViewModel;
import com.bilibili.inline.biz.InlineBizUtilsKt;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.biz.repository.VideoChronosMessage;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;
import com.bilibili.inline.plugin.DefaultCardPlayBehaviorWrap;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.avatar.layers.LayerAvatarView;
import com.bilibili.lib.brouter.uri.Builder;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.OgvClusterInlineTitleStyle;
import com.bilibili.search2.api.SearchLikeButtonItem;
import com.bilibili.search2.api.SearchUgcInline;
import com.bilibili.search2.api.SearchVideoFullTextItem;
import com.bilibili.search2.api.UgcInline;
import com.bilibili.search2.panel.j;
import com.bilibili.search2.result.holder.ugcinline.SearchUgcInlineNewHolder;
import com.bilibili.search2.result.repo.SearchInlineRepository;
import com.bilibili.search2.share.r;
import com.bilibili.search2.utils.B;
import com.bilibili.search2.utils.q;
import com.bilibili.search2.widget.SearchPlayerContainerLayout;
import com.bilibili.search2.widget.SearchTagView;
import com.bilibili.video.story.player.quality.StoryQualityService;
import com.bililive.bililive.infra.hybrid.manager.LiveHybridManager;
import com.mall.logic.page.home.MallHomeFeedCardTrigger;
import com.mall.ui.page.home.view.N;
import com.mall.ui.page.home.view.T;
import dt0.AbstractC6840c;
import dt0.AbstractC6841d;
import dt0.AbstractC6842e;
import java.util.List;
import java.util.Map;
import kntr.app.search.aicard.container.a;
import kntr.common.router.UrisKt;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.FixedPopupAnchor;
import tv.danmaku.bili.widget.PriorityLinearLayout;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.DataRelationShipChain;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/ugcinline/SearchUgcInlineNewHolder.class */
@StabilityInferred(parameters = 0)
public final class SearchUgcInlineNewHolder extends AbstractC6842e<SearchUgcInline, j> {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f88223F = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f88224A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final b f88225B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final y f88226C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final C1527b f88227D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final TagSpanTextView[] f88228E;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final L0 f88229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ListPlaceHolderImageView f88230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final VectorTextView f88231g;

    @NotNull
    public final VectorTextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final VectorTextView f88232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final LayerAvatarView f88233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final TintImageView f88234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final TintTextView f88235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final TagSpanTextView f88236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final TextView f88237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ViewStub f88238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f88239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SearchPlayerContainerLayout f88240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final SearchTagView f88241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final PriorityLinearLayout f88242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final ConstraintLayout f88243t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Lazy f88244u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Lazy f88245v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Lazy f88246w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final c f88247x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public k<SearchUgcInline> f88248y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Lazy f88249z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/ugcinline/SearchUgcInlineNewHolder$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f88250a;

        static {
            int[] iArr = new int[OgvClusterInlineTitleStyle.values().length];
            try {
                iArr[OgvClusterInlineTitleStyle.INLINE_TITLE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[OgvClusterInlineTitleStyle.INLINE_TITLE_ONLY_TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[OgvClusterInlineTitleStyle.INLINE_TITLE_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[OgvClusterInlineTitleStyle.INLINE_TITLE_ORIGIN_TITLE.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f88250a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/ugcinline/SearchUgcInlineNewHolder$b.class */
    public static final class b implements k.a<SearchUgcInline> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchUgcInlineNewHolder f88251a;

        public b(SearchUgcInlineNewHolder searchUgcInlineNewHolder) {
            this.f88251a = searchUgcInlineNewHolder;
        }

        @Override // Dt0.k.a
        public final void a() {
            SearchLikeButtonItem likeButton;
            SearchUgcInlineNewHolder searchUgcInlineNewHolder = this.f88251a;
            UgcInline ugcInline = ((SearchUgcInline) searchUgcInlineNewHolder.getData()).getUgcInline();
            if (ugcInline == null || (likeButton = ugcInline.getLikeButton()) == null || likeButton.isSelected()) {
                return;
            }
            searchUgcInlineNewHolder.A0().e(likeButton);
        }

        @Override // Dt0.k.a
        public final void b(AbstractC6841d abstractC6841d) {
            SearchLikeButtonItem likeButton;
            SearchLikeButtonItem likeButton2;
            long aid = ((SearchUgcInline) abstractC6841d).getAid();
            SearchUgcInlineNewHolder searchUgcInlineNewHolder = this.f88251a;
            if (aid == ((SearchUgcInline) searchUgcInlineNewHolder.getData()).getAid()) {
                e eVarA0 = searchUgcInlineNewHolder.A0();
                UgcInline ugcInline = ((SearchUgcInline) searchUgcInlineNewHolder.getData()).getUgcInline();
                boolean zIsSelected = (ugcInline == null || (likeButton2 = ugcInline.getLikeButton()) == null) ? false : likeButton2.isSelected();
                UgcInline ugcInline2 = ((SearchUgcInline) searchUgcInlineNewHolder.getData()).getUgcInline();
                String formatCount = (ugcInline2 == null || (likeButton = ugcInline2.getLikeButton()) == null) ? null : likeButton.getFormatCount();
                TintTextView tintTextView = eVarA0.f3191c;
                ListExtentionsKt.setText(tintTextView, formatCount);
                eVarA0.f3190b.setSelected(zIsSelected);
                tintTextView.setSelected(zIsSelected);
            }
        }

        @Override // Dt0.k.a
        public final /* bridge */ /* synthetic */ void c(AbstractC6841d abstractC6841d) {
        }

        @Override // Dt0.k.a
        public final void d(AbstractC6841d abstractC6841d) {
            ((InlineTripleGuideHelper) this.f88251a.f88249z.getValue()).stopInlineTripleGuideAnim();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/ugcinline/SearchUgcInlineNewHolder$c.class */
    public static final class c implements PanelDetachListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchUgcInlineNewHolder f88252a;

        public c(SearchUgcInlineNewHolder searchUgcInlineNewHolder) {
            this.f88252a = searchUgcInlineNewHolder;
        }

        public final void onDetach(InlinePanel inlinePanel) {
            InlineGestureSeekBarContainer inlineGestureSeekBarContainerZ0 = this.f88252a.z0();
            inlineGestureSeekBarContainerZ0.resetProgress();
            inlineGestureSeekBarContainerZ0.setVisibility(8);
            inlinePanel.removeOnDetachListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.widget.FrameLayout, com.bilibili.search2.widget.SearchPlayerContainerLayout] */
    /* JADX WARN: Type inference failed for: r1v63, types: [Ct0.y] */
    public SearchUgcInlineNewHolder(@NotNull L0 l02) {
        super(l02.a);
        this.f88229e = l02;
        this.f88230f = this.itemView.findViewById(2131298941);
        this.f88231g = this.itemView.findViewById(2131299631);
        this.h = this.itemView.findViewById(2131299632);
        this.f88232i = this.itemView.findViewById(2131299649);
        LayerAvatarView layerAvatarViewFindViewById = this.itemView.findViewById(2131297877);
        this.f88233j = layerAvatarViewFindViewById;
        this.f88234k = (TintImageView) this.itemView.findViewById(2131304572);
        this.f88235l = (TintTextView) this.itemView.findViewById(2131315643);
        FixedPopupAnchor fixedPopupAnchorFindViewById = this.itemView.findViewById(2131315645);
        TagSpanTextView tagSpanTextViewFindViewById = this.itemView.findViewById(2131300005);
        this.f88236m = tagSpanTextViewFindViewById;
        this.f88237n = (TextView) this.itemView.findViewById(2131300000);
        this.f88238o = (ViewStub) this.itemView.findViewById(2131303685);
        final int i7 = 0;
        this.f88239p = ListExtentionsKt.lazyUnsafe(new Function0(this, i7) { // from class: Ct0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1748a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f1749b;

            {
                this.f1748a = i7;
                this.f1749b = this;
            }

            public final Object invoke() {
                switch (this.f1748a) {
                    case 0:
                        return (ViewStub) ((SearchUgcInlineNewHolder) this.f1749b).itemView.findViewById(2131313889);
                    case 1:
                        return new LiveHybridManager.c((LiveHybridManager) this.f1749b);
                    case 2:
                        a1 a1VarA1 = ((OpusDetailViewModel) this.f1749b).a1();
                        return StateFlowKt.MutableStateFlow(a1VarA1 != null ? new com.bilibili.bplus.followinglist.page.opus.bottom.i(a1VarA1) : null);
                    default:
                        return ((StoryQualityService) this.f1749b).h();
                }
            }
        });
        ?? r02 = (SearchPlayerContainerLayout) this.itemView.findViewWithTag(ListPlayerManager.AUTO_PLAY_VIEW_TAG);
        this.f88240q = r02;
        this.f88241r = (SearchTagView) this.itemView.findViewById(2131314171);
        PriorityLinearLayout priorityLinearLayoutFindViewById = this.itemView.findViewById(2131320262);
        this.f88242s = priorityLinearLayoutFindViewById;
        this.f88243t = l02.g.b;
        this.f88244u = ListExtentionsKt.lazyUnsafe(new Function0(this) { // from class: com.bilibili.search2.result.holder.ugcinline.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchUgcInlineNewHolder f88253a;

            {
                this.f88253a = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.ugcinline.SearchUgcInlineNewHolder, java.lang.Object] */
            public final Object invoke() {
                ?? r03 = this.f88253a;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) r03.itemView.findViewById(2131315642);
                SearchUgcInlineNewHolder$mInlineLikeButtonHelper$2$1 searchUgcInlineNewHolder$mInlineLikeButtonHelper$2$1 = new SearchUgcInlineNewHolder$mInlineLikeButtonHelper$2$1(r03);
                return new e(lottieAnimationView, r03.f88234k, r03.f88235l, searchUgcInlineNewHolder$mInlineLikeButtonHelper$2$1);
            }
        });
        this.f88245v = ListExtentionsKt.lazyUnsafe(new v(this, 0));
        this.f88246w = ListExtentionsKt.lazyUnsafe(new w(this, 0));
        this.f88247x = new c(this);
        this.f88249z = ListExtentionsKt.lazyUnsafe(new x(this, 0));
        this.f88225B = new b(this);
        this.f88226C = new Function1(this) { // from class: Ct0.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchUgcInlineNewHolder f1795a;

            {
                this.f1795a = this;
            }

            public final Object invoke(Object obj) {
                SearchLikeButtonItem likeButton;
                SearchLikeButtonItem likeButton2;
                VideoChronosMessage videoChronosMessage = (VideoChronosMessage) obj;
                long jLongValue = videoChronosMessage.getId().longValue();
                SearchUgcInlineNewHolder searchUgcInlineNewHolder = this.f1795a;
                if (jLongValue == ((SearchUgcInline) searchUgcInlineNewHolder.getData()).getAvId()) {
                    ((SearchUgcInline) searchUgcInlineNewHolder.getData()).updateByMsg(InlineBizUtilsKt.toVideoStatusMessage(videoChronosMessage));
                    Dt0.e eVarA0 = searchUgcInlineNewHolder.A0();
                    UgcInline ugcInline = ((SearchUgcInline) searchUgcInlineNewHolder.getData()).getUgcInline();
                    boolean zIsSelected = (ugcInline == null || (likeButton2 = ugcInline.getLikeButton()) == null) ? false : likeButton2.isSelected();
                    UgcInline ugcInline2 = ((SearchUgcInline) searchUgcInlineNewHolder.getData()).getUgcInline();
                    String formatCount = (ugcInline2 == null || (likeButton = ugcInline2.getLikeButton()) == null) ? null : likeButton.getFormatCount();
                    TintTextView tintTextView = eVarA0.f3191c;
                    ListExtentionsKt.setText(tintTextView, formatCount);
                    eVarA0.f3190b.setSelected(zIsSelected);
                    tintTextView.setSelected(zIsSelected);
                    SearchInlineRepository searchInlineRepository = searchUgcInlineNewHolder.f116703b;
                    if (searchInlineRepository != null) {
                        searchInlineRepository.updateRepositoryData((DataRelationShipChain) searchUgcInlineNewHolder.getData());
                    }
                }
                return Unit.INSTANCE;
            }
        };
        this.f88227D = new C1527b(this, 0);
        final int i8 = 0;
        B.f(fixedPopupAnchorFindViewById, new Function0(this, i8) { // from class: Ct0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1752a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f1753b;

            {
                this.f1752a = i8;
                this.f1753b = this;
            }

            public final Object invoke() {
                switch (this.f1752a) {
                    case 0:
                        ((SearchUgcInlineNewHolder) this.f1753b).x0("threepoint_click");
                        return Unit.INSTANCE;
                    case 1:
                        return new N(((T) this.f1753b).a);
                    default:
                        tK0.b bVar = (tK0.b) this.f1753b;
                        Map mutableMap = MapsKt.toMutableMap(bVar.b);
                        mutableMap.put("scene", "routine");
                        mutableMap.remove("hidesku");
                        Builder builderBuildUpon = UrisKt.toUri("activity://main/vip-buy").buildUpon();
                        for (Map.Entry entry : mutableMap.entrySet()) {
                            UrisKt.appendQueryDroppingNull(builderBuildUpon, (String) entry.getKey(), (String) entry.getValue());
                        }
                        bVar.c.launch(builderBuildUpon.build());
                        return Unit.INSTANCE;
                }
            }
        });
        Y y6 = l02.d;
        B.f(y6.c, new d(this, 0));
        final int i9 = 0;
        this.itemView.setOnClickListener(new View.OnClickListener(this, i9) { // from class: Ct0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1756a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f1757b;

            {
                this.f1756a = i9;
                this.f1757b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f1756a) {
                    case 0:
                        SearchUgcInlineNewHolder.C0((SearchUgcInlineNewHolder) this.f1757b, false, null, 3);
                        break;
                    case 1:
                        V.a aVar = (V.a) this.f1757b;
                        aVar.getClass();
                        Motion motion = new Motion();
                        AdDownloadButton adDownloadButton = aVar.a;
                        adDownloadButton.setMotion(motion);
                        adDownloadButton.getMClickExtraParams().plus(aVar.a());
                        break;
                    default:
                        GeminiWatchpointTextWidget.J((GeminiWatchpointTextWidget) this.f1757b);
                        break;
                }
            }
        });
        this.itemView.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: Ct0.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchUgcInlineNewHolder f1770a;

            {
                this.f1770a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                this.f1770a.x0("long_press");
                return true;
            }
        });
        priorityLinearLayoutFindViewById.setOnClickListener(new s(this, 0));
        r02.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: Ct0.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchUgcInlineNewHolder f1786a;

            {
                this.f1786a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                this.f1786a.x0("long_press");
                return true;
            }
        });
        layerAvatarViewFindViewById.setOnClickListener(new u(this, 0));
        this.f88228E = new TagSpanTextView[]{tagSpanTextViewFindViewById, y6.b};
    }

    public static void C0(SearchUgcInlineNewHolder searchUgcInlineNewHolder, boolean z6, String str, int i7) {
        SearchVideoFullTextItem fullText;
        SearchVideoFullTextItem fullText2;
        SearchVideoFullTextItem fullText3;
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        if ((i7 & 2) != 0) {
            str = "0";
        }
        searchUgcInlineNewHolder.clickWithRefreshStatusViews(searchUgcInlineNewHolder.f88228E);
        Map mapMapOf = (((SearchUgcInline) searchUgcInlineNewHolder.getData()).hasFullText() && (fullText3 = ((SearchUgcInline) searchUgcInlineNewHolder.getData()).getFullText()) != null && fullText3.isAsr()) ? MapsKt.mapOf(TuplesKt.to("jump_toast_text", "")) : null;
        boolean zAreEqual = Intrinsics.areEqual(str, "extra-link");
        SearchVideoFullTextItem fullText4 = ((SearchUgcInline) searchUgcInlineNewHolder.getData()).getFullText();
        q.b(searchUgcInlineNewHolder, (AbstractC6841d) searchUgcInlineNewHolder.getData(), z6, false, mapMapOf, (fullText4 != null && fullText4.isAsr()) || (zAreEqual && (((fullText = ((SearchUgcInline) searchUgcInlineNewHolder.getData()).getFullText()) != null && fullText.isNote()) || ((fullText2 = ((SearchUgcInline) searchUgcInlineNewHolder.getData()).getFullText()) != null && fullText2.isComment()))), null, 148);
        Xs0.b.i("search.search-result.search-card.all.click", null, searchUgcInlineNewHolder.getModuleType(), (BaseSearchItem) searchUgcInlineNewHolder.getData(), null, null, Xs0.b.b(searchUgcInlineNewHolder.getModuleType(), str), null, null, searchUgcInlineNewHolder.y0(), false, null, 6912);
    }

    public final e A0() {
        return (e) this.f88244u.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B0() {
        /*
            r10 = this;
            r0 = r10
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.api.oversea.a r0 = (com.bilibili.search2.api.oversea.a) r0
            boolean r0 = com.bilibili.search2.api.oversea.b.b(r0)
            if (r0 == 0) goto L1b
            r0 = r10
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.api.SearchUgcInline r0 = (com.bilibili.search2.api.SearchUgcInline) r0
            java.lang.String r0 = r0.getTranslatedTitle()
            r11 = r0
            goto L39
        L1b:
            r0 = r10
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.api.SearchUgcInline r0 = (com.bilibili.search2.api.SearchUgcInline) r0
            com.bilibili.search2.api.UgcInline r0 = r0.getUgcInline()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L35
            r0 = r11
            java.lang.String r0 = r0.getTitle()
            r12 = r0
            r0 = r12
            r11 = r0
            r0 = r12
            if (r0 != 0) goto L39
        L35:
            java.lang.String r0 = ""
            r11 = r0
        L39:
            r0 = r10
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.api.SearchUgcInline r0 = (com.bilibili.search2.api.SearchUgcInline) r0
            com.bilibili.search2.api.UgcInline r0 = r0.getUgcInline()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L50
            r0 = r12
            com.bilibili.search2.api.Tag r0 = r0.getTag()
            r12 = r0
            goto L52
        L50:
            r0 = 0
            r12 = r0
        L52:
            r0 = r10
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.api.SearchUgcInline r0 = (com.bilibili.search2.api.SearchUgcInline) r0
            com.bilibili.search2.api.UgcInline r0 = r0.getUgcInline()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L69
            r0 = r13
            com.bilibili.app.comm.list.common.data.StoryCardIcon r0 = r0.getStoryCardIcon()
            r13 = r0
            goto L6b
        L69:
            r0 = 0
            r13 = r0
        L6b:
            r0 = r10
            android.view.View r0 = r0.itemView
            android.content.Context r0 = r0.getContext()
            r1 = r11
            r2 = 0
            r3 = 4
            r4 = 0
            java.lang.CharSequence r0 = com.bilibili.app.comm.list.common.utils.ColorTagHandler.decode$default(r0, r1, r2, r3, r4)
            r14 = r0
            Ct0.r r0 = new Ct0.r
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3)
            r11 = r0
            r0 = r10
            com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView r0 = r0.f88236m
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r11
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 2032(0x7f0, float:2.847E-42)
            com.bilibili.search2.utils.B.i(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.ugcinline.SearchUgcInlineNewHolder.B0():void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /* JADX WARN: Type inference failed for: r0v129, types: [android.view.View, android.widget.TextView, com.bilibili.search2.widget.SearchTagView] */
    @Override // dt0.AbstractC6839b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind() throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.ugcinline.SearchUgcInlineNewHolder.bind():void");
    }

    @Override // dt0.AbstractC6843f, dt0.AbstractC6839b
    public final void bind(@NotNull List<Object> list) {
        super.bind(list);
        if (list.contains("PAYLOAD_UPDATE_TRANSLATE")) {
            B0();
        }
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        this.f88224A = z6;
        cardPlayTask.setNetworkAlertEnable(SearchAutoPlayUtilsKt.getEnableNetworkAlert(z6));
        InlineExtensionKt.addInlineBehavior(cardPlayTask, (DefaultCardPlayBehaviorWrap) this.f88245v.getValue());
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineUGCHistoryServiceV2) this.f88246w.getValue());
        cardPlayTask.setChronosEnable(true);
        SearchInlineRepository searchInlineRepository = new SearchInlineRepository((AbstractC6840c) getData(), SearchInlineRepository.SearchInlineType.UGC);
        searchInlineRepository.setVideoStateCallback(this.f88226C);
        searchInlineRepository.setFollowStateCallback(this.f88227D);
        cardPlayTask.setTaskRepository(searchInlineRepository);
        this.f116703b = searchInlineRepository;
        cardPlayTask.setMute(p.a);
        return cardPlayTask;
    }

    @Override // dt0.AbstractC6843f
    public final void followChange(boolean z6) {
        super.followChange(z6);
        o10.a avatarItem = ((SearchUgcInline) getData()).getAvatarItem();
        if (avatarItem != null) {
            LayerAvatarView.show$default(this.f88233j, avatarItem, (Map) null, 2, (Object) null);
        }
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final View[] getClickStatusViewArray() {
        return this.f88228E;
    }

    @Override // dt0.AbstractC6842e, dt0.AbstractC6843f
    @NotNull
    public final String getDefaultModuleType() {
        return "video";
    }

    @Nullable
    public final ViewGroup getInlineContainer() {
        return this.f88240q;
    }

    @NotNull
    public final Class<? extends j> getPanelType() {
        return j.class;
    }

    @Override // Os0.a
    public final void invisible() {
        ((InlineTripleGuideHelper) this.f88249z.getValue()).stopInlineTripleGuideAnim();
        k<SearchUgcInline> kVar = this.f88248y;
        k<SearchUgcInline> kVar2 = kVar;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tripleLikeHelper");
            kVar2 = null;
        }
        kVar2.f3210b.removeAllAnimatorListeners();
        kVar2.f3210b.cancelAnimation();
    }

    public final void on4GTipShown() {
    }

    public final void onClickCloseBtn() {
    }

    public final void onClickGotoFreeData() {
    }

    public final void onClickPlayWithMobileData() {
    }

    public final void onNetworkAlertShow() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6842e
    public final void q0(InlinePanel inlinePanel) {
        j jVar = (j) inlinePanel;
        jVar.o();
        jVar.setNetAlertEnable(SearchAutoPlayUtilsKt.getEnableNetworkAlert(this.f88224A));
        jVar.setOnLongClickListener(new f(this, 0));
        UgcInline ugcInline = ((SearchUgcInline) getData()).getUgcInline();
        if (ugcInline == null || !ugcInline.getHideDanmakuSwitch()) {
            jVar.getDanmaku().setVisible(true);
            jVar.getDanmaku().setVisibility(0);
        } else {
            jVar.getDanmaku().setVisible(false);
            jVar.getDanmaku().setVisibility(8);
        }
        jVar.getDanmaku().setOnWidgetClickListener(new g(0, this));
        jVar.n().setOnWidgetClickListener(new h(0, this));
        jVar.getGestureSeekWidget().setOnClickListener(new i(this, 0));
        jVar.getGestureSeekWidget().setSeekReportListener(new z(this));
        jVar.l().setVisible(Ct0.B.b());
        jVar.l().setVisibility(ListExtentionsKt.toVisibility(Ct0.B.b()));
        if (Ct0.B.b()) {
            final int i7 = 0;
            jVar.l().setOnClickListener(new View.OnClickListener(i7, this) { // from class: Ct0.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f1766a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final LifecycleOwner f1767b;

                {
                    this.f1766a = i7;
                    this.f1767b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (this.f1766a) {
                        case 0:
                            SearchUgcInlineNewHolder.C0((SearchUgcInlineNewHolder) this.f1767b, true, null, 2);
                            break;
                        default:
                            LivePkMatchHallWidget livePkMatchHallWidget = this.f1767b;
                            LivePkMatchHallWidget.Companion companion = LivePkMatchHallWidget.Companion;
                            LiveLog.Companion companion2 = LiveLog.Companion;
                            String logTag = livePkMatchHallWidget.getLogTag();
                            if (companion2.matchLevel(3)) {
                                String str = "user click select panel mask" == 0 ? "" : "user click select panel mask";
                                LiveLogDelegate logDelegate = companion2.getLogDelegate();
                                if (logDelegate != null) {
                                    LiveLogDelegate.onLog$default(logDelegate, 3, logTag, str, (Throwable) null, 8, (Object) null);
                                }
                                BLog.i(logTag, str);
                            }
                            livePkMatchHallWidget.h();
                            break;
                    }
                }
            });
        }
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerZ0 = z0();
        inlineGestureSeekBarContainerZ0.setVisibility(0);
        inlineGestureSeekBarContainerZ0.resetProgress();
        jVar.getGestureSeekWidget().setGestureSeekBarContainer(inlineGestureSeekBarContainerZ0);
        jVar.addOnDetachListener(this.f88247x);
        VectorTextView coverLeftText1 = jVar.getCoverLeftText1();
        UgcInline ugcInline2 = ((SearchUgcInline) getData()).getUgcInline();
        String coverLeftText12 = ugcInline2 != null ? ugcInline2.getCoverLeftText1() : null;
        UgcInline ugcInline3 = ((SearchUgcInline) getData()).getUgcInline();
        ListExtentionsKt.setTextWithIcon$default(coverLeftText1, coverLeftText12, ugcInline3 != null ? ugcInline3.getCoverLeftIcon1() : 0, 2131103591, 0.0f, 0.0f, 48, (Object) null);
        VectorTextView coverLeftText2 = jVar.getCoverLeftText2();
        UgcInline ugcInline4 = ((SearchUgcInline) getData()).getUgcInline();
        String coverLeftText22 = null;
        if (ugcInline4 != null) {
            coverLeftText22 = ugcInline4.getCoverLeftText2();
        }
        UgcInline ugcInline5 = ((SearchUgcInline) getData()).getUgcInline();
        ListExtentionsKt.setTextWithIcon$default(coverLeftText2, coverLeftText22, ugcInline5 != null ? ugcInline5.getCoverLeftIcon2() : 0, 2131103591, 0.0f, 0.0f, 48, (Object) null);
        InlineTask inlineToastTask = new InlineToastTask(jVar);
        final int i8 = 0;
        InlineTask inlineTripleLikeTask = new InlineTripleLikeTask(new Ct0.k(this, 0), new Function0(this, i8) { // from class: Ct0.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1771a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f1772b;

            {
                this.f1771a = i8;
                this.f1772b = this;
            }

            public final Object invoke() {
                switch (this.f1771a) {
                    case 0:
                        ((InlineTripleGuideHelper) ((SearchUgcInlineNewHolder) this.f1772b).f88249z.getValue()).stopInlineTripleGuideAnim();
                        return Unit.INSTANCE;
                    case 1:
                        return ((View) this.f1772b).findViewById(2131296722);
                    case 2:
                        LiveAudioManager liveAudioManager = (LiveAudioManager) this.f1772b;
                        liveAudioManager.i = null;
                        liveAudioManager.d.removeCallbacksAndMessages(null);
                        liveAudioManager.e.a.removeCallbacksAndMessages(null);
                        X x6 = liveAudioManager.f;
                        x6.f.a.clear();
                        x6.l();
                        BLog.i("LiveAudioSession", "releaseExternalAudioEncoder");
                        jC.b bVar = x6.e;
                        if (bVar != null) {
                            BLog.i("LiveAudioSession", "releaseExternalAudioEncoder encoderName:" + bVar.h + ", audioEncoder:" + bVar);
                            x6.s(bVar);
                            bVar.release();
                        }
                        x6.e = null;
                        x6.h = 1.0f;
                        x6.g = false;
                        LiveAudioDeviceManager liveAudioDeviceManager = liveAudioManager.h;
                        if (liveAudioDeviceManager != null) {
                            liveAudioDeviceManager.destroy();
                        }
                        return Unit.INSTANCE;
                    case 3:
                        return Integer.valueOf((int) PixelUtil.dp2FloatPx(((com.bilibili.bililive.room.ui.roomv3.base.view.c) ((a0) this.f1772b)).a.b, 30.0f));
                    case 4:
                        Function0 function0 = ((com.bilibili.video.story.player.quality.v) this.f1772b).d;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        BLog.i("StoryVipQualityTrialService", " onClickButton called");
                        return Unit.INSTANCE;
                    case 5:
                        return new MallHomeFeedCardTrigger(((com.mall.ui.page.home.view.X) this.f1772b).b);
                    default:
                        ((Function1) this.f1772b).invoke(a.g.a);
                        return Unit.INSTANCE;
                }
            }
        });
        inlineTripleLikeTask.setSupportDisableGuidance(false);
        ((InlineTripleGuideHelper) this.f88249z.getValue()).getTranslateAnim().setAnimationListener(inlineTripleLikeTask.getAnimationListener());
        InlineTask inlineTaskM = jVar.m();
        inlineTaskM.setManual(this.f88224A);
        Unit unit = Unit.INSTANCE;
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{inlineTripleLikeTask, inlineTaskM, jVar.getSeekGuideWidget(), inlineToastTask})).execute();
        jVar.m().setOnWidgetClickListener(this);
    }

    @Override // dt0.AbstractC6842e
    @Nullable
    public final Map<String, String> s0() {
        return y0();
    }

    @Override // Os0.a
    public final void startScroll() {
        j jVar = (j) this.f116702a;
        if (jVar != null) {
            jVar.showWidgets();
        }
    }

    @Override // dt0.AbstractC6843f
    public final void videoStatusChange() {
        SearchLikeButtonItem likeButton;
        super.videoStatusChange();
        UgcInline ugcInline = ((SearchUgcInline) getData()).getUgcInline();
        if (ugcInline == null || (likeButton = ugcInline.getLikeButton()) == null) {
            return;
        }
        A0().d(likeButton, (BaseSearchItem) getData());
    }

    @Override // dt0.AbstractC6842e
    public final void w0(boolean z6) {
        j jVar = (j) this.f116702a;
        if (jVar != null) {
            jVar.setNetAlertEnable(z6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6842e
    public final void x0(@NotNull String str) {
        r.l(r.f88699a, this, this.itemView.getContext(), null, true, 12);
        Xs0.b.i("search.search-result.search-card.all.click", null, getModuleType(), (BaseSearchItem) getData(), null, null, Xs0.b.d((BaseSearchItem) getData(), "threepoint", null, 2), str, null, null, false, null, 7936);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.String> y0() {
        /*
            r3 = this;
            r0 = r3
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.api.SearchUgcInline r0 = (com.bilibili.search2.api.SearchUgcInline) r0
            com.bilibili.search2.api.SearchVideoFullTextItem r0 = r0.getFullText()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L1d
            r0 = r4
            int r0 = r0.getType()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L21
        L1d:
            java.lang.String r0 = "0"
            r4 = r0
        L21:
            java.lang.String r0 = "text_type"
            r1 = r4
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.ugcinline.SearchUgcInlineNewHolder.y0():java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InlineGestureSeekBarContainer z0() {
        this.f88238o.setVisibility(0);
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerFindViewById = this.itemView.findViewById(2131303684);
        UgcInline ugcInline = ((SearchUgcInline) getData()).getUgcInline();
        inlineGestureSeekBarContainerFindViewById.setProgressBarData(ugcInline != null ? ugcInline.getInlineProgressBar() : null);
        return inlineGestureSeekBarContainerFindViewById;
    }
}
