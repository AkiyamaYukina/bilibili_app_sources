package com.bilibili.search2.result.ogv.aggregate;

import Bl.Y;
import Bl.o0;
import ES0.i0;
import ES0.j0;
import ES0.u0;
import ES0.v0;
import Ps0.L;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.foundation.text.C3776v;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.PlayerWidget;
import com.bilibili.app.comm.list.common.inline.config.search.SearchAutoPlayUtilsKt;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineOGVHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineMuteWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.inline.widgetV3.OnSeekReportListener;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.bililive.listplayer.ListPlayerManager;
import com.bilibili.bililive.room.ui.roomv3.player.LiveRoomPlayerViewModel;
import com.bilibili.bililive.room.ui.roomv3.setting.LiveColorRenderPanel;
import com.bilibili.bplus.followingcard.widget.D;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.OgvClusterInlineTitleStyle;
import com.bilibili.search2.api.OgvInline;
import com.bilibili.search2.api.SearchOgvClipInfo;
import com.bilibili.search2.api.SearchOgvInline;
import com.bilibili.search2.panel.i;
import com.bilibili.search2.result.repo.SearchInlineRepository;
import com.bilibili.search2.utils.B;
import com.bilibili.search2.widget.SearchPlayerContainerLayout;
import dt0.AbstractC6840c;
import dt0.AbstractC6841d;
import dt0.AbstractC6842e;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.FixedPopupAnchor;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.ijk.media.player.render.tools.BiliDaltonizer;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/o.class */
@StabilityInferred(parameters = 0)
public final class o extends AbstractC6842e<SearchOgvInline, com.bilibili.search2.panel.i> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final u0 f88368A;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final o0 f88369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public com.bilibili.search2.api.g f88370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ListPlaceHolderImageView f88371g;

    @NotNull
    public final VectorTextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final VectorTextView f88372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final VectorTextView f88373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final BiliImageView f88374k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final TagSpanTextView f88375l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final TextView f88376m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final TagSpanTextView f88377n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final ViewStub f88378o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SearchPlayerContainerLayout f88379p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final c f88380q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final TextView f88381r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final View f88382s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final TextView f88383t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final View f88384u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final TagSpanTextView[] f88385v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f88386w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Lazy f88387x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Lazy f88388y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Hr.b f88389z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/o$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f88390a;

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
            f88390a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/o$b.class */
    public static final class b implements OnSeekReportListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f88391a;

        public b(o oVar) {
            this.f88391a = oVar;
        }

        public final void onSeekStart(int i7) {
            o oVar = this.f88391a;
            Xs0.b.i("search.search-result.search-card.all.click", null, oVar.getModuleType(), (BaseSearchItem) oVar.getData(), null, null, Xs0.b.b(oVar.getModuleType(), "seek"), i7 != 1 ? i7 != 3 ? "" : "video_slide" : NotificationCompat.CATEGORY_PROGRESS, null, oVar.r0(), false, null, 6912);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/o$c.class */
    public static final class c implements PanelDetachListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f88392a;

        public c(o oVar) {
            this.f88392a = oVar;
        }

        public final void onDetach(InlinePanel inlinePanel) {
            InlineGestureSeekBarContainer inlineGestureSeekBarContainerZ0 = this.f88392a.z0();
            inlineGestureSeekBarContainerZ0.resetProgress();
            inlineGestureSeekBarContainerZ0.setVisibility(8);
            inlinePanel.removeOnDetachListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [android.widget.FrameLayout, com.bilibili.search2.widget.SearchPlayerContainerLayout] */
    public o(@NotNull o0 o0Var) {
        super(o0Var.a);
        this.f88369e = o0Var;
        this.f88371g = this.itemView.findViewById(2131298941);
        this.h = this.itemView.findViewById(2131299631);
        this.f88372i = this.itemView.findViewById(2131299632);
        this.f88373j = this.itemView.findViewById(2131299649);
        this.f88374k = this.itemView.findViewById(2131297877);
        FixedPopupAnchor fixedPopupAnchorFindViewById = this.itemView.findViewById(2131308214);
        TagSpanTextView tagSpanTextViewFindViewById = this.itemView.findViewById(2131300005);
        this.f88375l = tagSpanTextViewFindViewById;
        this.f88376m = (TextView) this.itemView.findViewById(2131300000);
        this.f88377n = this.itemView.findViewById(2131303679);
        this.f88378o = (ViewStub) this.itemView.findViewById(2131303685);
        ?? r02 = (SearchPlayerContainerLayout) this.itemView.findViewWithTag(ListPlayerManager.AUTO_PLAY_VIEW_TAG);
        this.f88379p = r02;
        this.f88380q = new c(this);
        TextView textView = (TextView) this.itemView.findViewById(2131298162);
        this.f88381r = textView;
        this.f88382s = this.itemView.findViewById(2131309862);
        this.f88383t = (TextView) this.itemView.findViewById(2131315081);
        this.f88384u = this.itemView.findViewById(2131310592);
        B.f(fixedPopupAnchorFindViewById, new C3776v(this, 4));
        B.f(o0Var.c.d, new v0(this, 4));
        Y y6 = o0Var.d;
        B.f(y6.c, new Ji.f(this, 1));
        this.itemView.setOnClickListener(new l(0, this));
        this.itemView.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.search2.result.ogv.aggregate.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o f88366a;

            {
                this.f88366a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                this.f88366a.x0("long_press");
                return true;
            }
        });
        r02.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.search2.result.ogv.aggregate.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o f88367a;

            {
                this.f88367a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                this.f88367a.x0("long_press");
                return true;
            }
        });
        textView.setOnClickListener(new cl.h(this, 2));
        this.f88385v = new TagSpanTextView[]{tagSpanTextViewFindViewById, y6.b};
        this.f88387x = ListExtentionsKt.lazyUnsafe(new i0(this, 5));
        this.f88388y = ListExtentionsKt.lazyUnsafe(new j0(this, 1));
        this.f88389z = new Hr.b(this, 4);
        this.f88368A = new u0(this, 4);
    }

    public static void B0(o oVar, boolean z6, boolean z7, boolean z8, int i7) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        if ((i7 & 4) != 0) {
            z8 = false;
        }
        oVar.clickWithRefreshStatusViews(oVar.f88385v);
        com.bilibili.search2.utils.q.b(oVar, (AbstractC6841d) oVar.getData(), z6, z7, null, false, null, 228);
        Xs0.b.i("search.search-result.search-card.all.click", null, oVar.getModuleType(), (BaseSearchItem) oVar.getData(), null, null, Xs0.b.b(oVar.getModuleType(), z8 ? "inline" : "0"), null, null, oVar.r0(), false, null, 6912);
    }

    public final Map<String, String> A0(SearchOgvInline searchOgvInline) {
        String str;
        String param;
        Map<String, String> mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("module_pos", "1")});
        com.bilibili.search2.api.g gVar = this.f88370f;
        if (gVar != null && (param = gVar.getParam()) != null) {
            mapMutableMapOf.put("moduleid", param);
        }
        com.bilibili.search2.api.g gVar2 = this.f88370f;
        if (gVar2 != null && (str = gVar2.f86345l) != null) {
            mapMutableMapOf.put("moduletype", str);
        }
        String param2 = searchOgvInline.getParam();
        if (param2 != null) {
            mapMutableMapOf.put("sub_moduleid", param2);
        }
        String goTo = searchOgvInline.getGoTo();
        if (goTo != null) {
            mapMutableMapOf.put("sub_moduletype", goTo);
        }
        return mapMutableMapOf;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // dt0.AbstractC6839b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind() throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ogv.aggregate.o.bind():void");
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        PlayerArgs playerArgs;
        this.f88386w = z6;
        cardPlayTask.setNetworkAlertEnable(SearchAutoPlayUtilsKt.getEnableNetworkAlert(z6));
        InlineExtensionKt.addInlineBehavior(cardPlayTask, (Dt0.m) this.f88387x.getValue());
        Lazy lazy = this.f88388y;
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineOGVHistoryServiceV2) lazy.getValue());
        cardPlayTask.setChronosEnable(true);
        OgvInline ogvInline = ((SearchOgvInline) getData()).getOgvInline();
        if (ogvInline != null && (playerArgs = ogvInline.getPlayerArgs()) != null) {
            cardPlayTask.setCustomFakeDuration(((long) playerArgs.fakeDuration) * 1000);
        }
        SearchInlineRepository searchInlineRepository = new SearchInlineRepository((AbstractC6840c) getData(), SearchInlineRepository.SearchInlineType.OGV);
        searchInlineRepository.setVideoStateCallback(this.f88389z);
        searchInlineRepository.setFollowStateCallback(this.f88368A);
        cardPlayTask.setTaskRepository(searchInlineRepository);
        this.f116703b = searchInlineRepository;
        cardPlayTask.setMute(com.bilibili.app.comm.list.common.widget.p.a);
        SearchOgvClipInfo searchOgvClipInfoHasOgvClip = ((SearchOgvInline) getData()).hasOgvClip();
        Long lValueOf = searchOgvClipInfoHasOgvClip != null ? Long.valueOf(searchOgvClipInfoHasOgvClip.getStartTimeMills()) : null;
        if (lValueOf != null && !((InlineOGVHistoryServiceV2) lazy.getValue()).hasSavedPosition(L.a((SearchOgvInline) getData()))) {
            cardPlayTask.setStartPosition(lValueOf.longValue());
        }
        return cardPlayTask;
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final View[] getClickStatusViewArray() {
        return this.f88385v;
    }

    @Nullable
    public final ViewGroup getInlineContainer() {
        return this.f88379p;
    }

    @NotNull
    public final Class<? extends com.bilibili.search2.panel.i> getPanelType() {
        return com.bilibili.search2.panel.i.class;
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

    @Override // dt0.AbstractC6842e
    @NotNull
    public final Map<String, String> r0() {
        return A0((SearchOgvInline) getData());
    }

    @Override // dt0.AbstractC6842e
    @NotNull
    public final Map<String, String> s0() {
        return A0((SearchOgvInline) getData());
    }

    @Override // Os0.a
    public final void startScroll() {
        com.bilibili.search2.panel.i iVar = (com.bilibili.search2.panel.i) this.f116702a;
        if (iVar != null) {
            iVar.showWidgets();
        }
    }

    @Override // dt0.AbstractC6842e
    public final void w0(boolean z6) {
        ICardPlayerContext cardPlayerContext;
        com.bilibili.search2.panel.i iVar = (com.bilibili.search2.panel.i) this.f116702a;
        if (iVar == null || (cardPlayerContext = iVar.getCardPlayerContext()) == null) {
            return;
        }
        cardPlayerContext.setNetworkAlertEnable(z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6842e
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public final void q0(@NotNull com.bilibili.search2.panel.i iVar) {
        PlayerWidget playerWidget;
        PlayerWidget playerWidget2;
        PlayerWidget playerWidget3;
        PlayerWidget playerWidget4;
        iVar.p();
        boolean enableNetworkAlert = SearchAutoPlayUtilsKt.getEnableNetworkAlert(this.f88386w);
        ICardPlayerContext cardPlayerContext = iVar.getCardPlayerContext();
        if (cardPlayerContext != null) {
            cardPlayerContext.setNetworkAlertEnable(enableNetworkAlert);
        }
        iVar.setOnLongClickListener(new Hr.c(this, 2));
        iVar.setOnLongClickListener(new Hr.d(this, 4));
        OgvInline ogvInline = ((SearchOgvInline) getData()).getOgvInline();
        if (ogvInline == null || !ogvInline.getHideDanmakuSwitch()) {
            iVar.getDanmaku().setVisible(true);
            iVar.getDanmaku().setVisibility(0);
        } else {
            iVar.getDanmaku().setVisible(false);
            iVar.getDanmaku().setVisibility(8);
        }
        OgvInline ogvInline2 = ((SearchOgvInline) getData()).getOgvInline();
        String str = (ogvInline2 == null || (playerWidget4 = ogvInline2.getPlayerWidget()) == null) ? null : playerWidget4.title;
        if (str != null && !StringsKt.isBlank(str)) {
            TintTextView tintTextView = iVar.f87015r;
            if (tintTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endViewText");
                tintTextView = null;
            }
            OgvInline ogvInline3 = ((SearchOgvInline) getData()).getOgvInline();
            tintTextView.setText((ogvInline3 == null || (playerWidget3 = ogvInline3.getPlayerWidget()) == null) ? null : playerWidget3.title);
        }
        OgvInline ogvInline4 = ((SearchOgvInline) getData()).getOgvInline();
        String str2 = (ogvInline4 == null || (playerWidget2 = ogvInline4.getPlayerWidget()) == null) ? null : playerWidget2.desc;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            TintTextView tintTextView2 = iVar.f87016s;
            if (tintTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endViewGoDetail");
                tintTextView2 = null;
            }
            OgvInline ogvInline5 = ((SearchOgvInline) getData()).getOgvInline();
            tintTextView2.setText((ogvInline5 == null || (playerWidget = ogvInline5.getPlayerWidget()) == null) ? null : playerWidget.desc);
        }
        iVar.getDanmaku().setOnWidgetClickListener(new Function2(this) { // from class: com.bilibili.search2.result.ogv.aggregate.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o f88361a;

            {
                this.f88361a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                o oVar = this.f88361a;
                Xs0.b.i("search.search-result.search-card.all.click", null, oVar.getModuleType(), (BaseSearchItem) oVar.getData(), null, null, Xs0.b.b(oVar.getModuleType(), "danmu"), zBooleanValue ? "danmu_on" : "danmu_off", null, oVar.r0(), false, null, 6912);
                return Unit.INSTANCE;
            }
        });
        InlineMuteWidgetV3 inlineMuteWidgetV3 = iVar.f87010m;
        if (inlineMuteWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            inlineMuteWidgetV3 = null;
        }
        inlineMuteWidgetV3.setOnWidgetClickListener(new Hr.f(this, 5));
        iVar.n().setSeekReportListener(new b(this));
        final int i7 = 0;
        iVar.n().setOnClickListener(new View.OnClickListener(i7, this) { // from class: com.bilibili.search2.result.ogv.aggregate.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f88362a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LifecycleOwner f88363b;

            {
                this.f88362a = i7;
                this.f88363b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f88362a) {
                    case 0:
                        o.B0((o) this.f88363b, false, false, true, 3);
                        break;
                    case 1:
                        this.f88363b.dismissAllowingStateLoss();
                        break;
                    default:
                        LiveColorRenderPanel liveColorRenderPanel = this.f88363b;
                        if (liveColorRenderPanel.if() == 0) {
                            LinearLayout linearLayout = liveColorRenderPanel.g;
                            if (linearLayout != null) {
                                LiveColorRenderPanel.kf(linearLayout);
                            }
                            LiveColorRenderPanel.lf(view);
                            liveColorRenderPanel.mf(BiliDaltonizer.ColorBlindnessType.Deuteranomaly, true);
                            liveColorRenderPanel.dismissAllowingStateLoss();
                        } else {
                            LiveRoomPlayerViewModel liveRoomPlayerViewModel = liveColorRenderPanel.k;
                            if (liveRoomPlayerViewModel != null) {
                                liveRoomPlayerViewModel.I(2131853699);
                            }
                            liveColorRenderPanel.dismissAllowingStateLoss();
                        }
                        break;
                }
            }
        });
        iVar.m().setVisible(Ct0.B.b());
        iVar.m().setVisibility(ListExtentionsKt.toVisibility(Ct0.B.b()));
        if (Ct0.B.b()) {
            iVar.m().setOnClickListener(new Sv.c(this, 2));
        }
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerZ0 = z0();
        inlineGestureSeekBarContainerZ0.setVisibility(0);
        inlineGestureSeekBarContainerZ0.resetProgress();
        iVar.f87014q.setOnClickListener(new D(this, 1));
        boolean zIsPreview = ((SearchOgvInline) getData()).isPreview();
        i.a aVar = iVar.f87005A;
        iVar.removeCardPlayStateChangedCallback(aVar);
        if (zIsPreview) {
            iVar.addCardPlayStateChangedCallback(aVar);
        }
        iVar.n().setGestureSeekBarContainer(inlineGestureSeekBarContainerZ0);
        iVar.l(((SearchOgvInline) getData()).hasOgvClip());
        iVar.addOnDetachListener(this.f88380q);
        VectorTextView vectorTextView = iVar.f87007j;
        if (vectorTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            vectorTextView = null;
        }
        OgvInline ogvInline6 = ((SearchOgvInline) getData()).getOgvInline();
        String coverLeftText1 = ogvInline6 != null ? ogvInline6.getCoverLeftText1() : null;
        OgvInline ogvInline7 = ((SearchOgvInline) getData()).getOgvInline();
        ListExtentionsKt.setTextWithIcon$default(vectorTextView, coverLeftText1, ogvInline7 != null ? ogvInline7.getCoverLeftIcon1() : 0, 2131103591, 0.0f, 0.0f, 48, (Object) null);
        VectorTextView vectorTextView2 = iVar.f87008k;
        if (vectorTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            vectorTextView2 = null;
        }
        OgvInline ogvInline8 = ((SearchOgvInline) getData()).getOgvInline();
        String coverLeftText2 = null;
        if (ogvInline8 != null) {
            coverLeftText2 = ogvInline8.getCoverLeftText2();
        }
        OgvInline ogvInline9 = ((SearchOgvInline) getData()).getOgvInline();
        ListExtentionsKt.setTextWithIcon$default(vectorTextView2, coverLeftText2, ogvInline9 != null ? ogvInline9.getCoverLeftIcon2() : 0, 2131103591, 0.0f, 0.0f, 48, (Object) null);
        InlineTask inlineToastTask = new InlineToastTask(iVar);
        InlineTask inlineTaskO = iVar.o();
        inlineTaskO.setManual(this.f88386w);
        Unit unit = Unit.INSTANCE;
        InlineTaskScheduler inlineTaskScheduler = new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{inlineTaskO, iVar.getSeekGuideWidget(), inlineToastTask}));
        iVar.o().setOnWidgetClickListener(this);
        inlineTaskScheduler.execute();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InlineGestureSeekBarContainer z0() {
        ViewStub viewStub;
        ViewStub viewStub2 = this.f88378o;
        if ((viewStub2 == null || viewStub2.getVisibility() != 0) && (viewStub = this.f88378o) != null) {
            viewStub.setVisibility(0);
        }
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerFindViewById = this.itemView.findViewById(2131303684);
        OgvInline ogvInline = ((SearchOgvInline) getData()).getOgvInline();
        inlineGestureSeekBarContainerFindViewById.setProgressBarData(ogvInline != null ? ogvInline.getInlineProgressBar() : null);
        return inlineGestureSeekBarContainerFindViewById;
    }
}
