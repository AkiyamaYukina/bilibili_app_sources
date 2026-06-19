package com.bilibili.search2.result.holder.author;

import Bl.P;
import G3.Q;
import G3.S;
import G3.T;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.foundation.lazy.grid.b0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import bilibili.live.app.service.constant.CardTypeKt;
import bilibili.live.app.service.provider.LivePlayerDataTracker;
import com.bilibili.app.comm.list.common.inline.config.search.SearchAutoPlayUtilsKt;
import com.bilibili.app.comm.list.common.inline.config.search.SearchInlineNetStatus;
import com.bilibili.app.comm.list.common.inline.view.RightTopLiveBadge;
import com.bilibili.app.comm.list.common.inline.widgetV3.Inline4GWarningWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.router.ListCommonRouter;
import com.bilibili.app.comm.list.common.utils.AutoPlayHelperKt;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.base.connectivity.Connectivity;
import com.bilibili.bililive.room.ui.roomv3.gift.U;
import com.bilibili.bus.Violet;
import com.bilibili.inline.biz.InlineBizUtilsKt;
import com.bilibili.inline.biz.InlinePlayerTrackerCallbackKt;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.biz.live.LiveContainer;
import com.bilibili.inline.biz.live.LiveInlineBufferingCallback;
import com.bilibili.inline.biz.live.LiveInlineTrackerCallback;
import com.bilibili.inline.card.IInlineCard;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.avatar.layers.LayerAvatarView;
import com.bilibili.lib.crashreport.CrashReporter;
import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.relation.widget.FollowButton;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.PrInfo;
import com.bilibili.search2.api.SearchAuthorNew;
import com.bilibili.search2.inline.Args;
import com.bilibili.search2.inline.InlineLive;
import com.bilibili.search2.inline.TrafficConfig;
import com.bilibili.search2.utils.B;
import com.bilibili.search2.widget.SearchPlayerContainerLayout;
import dt0.AbstractC6843f;
import e4.C6914b;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/g.class */
@StabilityInferred(parameters = 0)
public final class g extends AbstractC6843f<SearchAuthorNew> implements IInlineCard<com.bilibili.search2.panel.b>, Os0.a, View.OnClickListener, LiveContainer, Inline4GWarningWidgetV3.Inline4GWarningListener, Et0.d {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f87825N = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public LiveInlineBufferingCallback f87826A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final Lazy f87827B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final ViewStub f87828C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public View f87829D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public View f87830E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final Lazy f87831F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final Lazy f87832G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final Lazy f87833H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final Lazy f87834I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final Lazy f87835J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f87836K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final b0 f87837L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public final JS0.o f87838M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayerAvatarView f87839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TintTextView f87840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TintTextView f87841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f87842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TintTextView f87843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BiliImageView f87844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FollowButton f87845g;
    public final ViewStub h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final BiliImageView f87846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BiliImageView f87847j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public RecyclerView f87848k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ViewGroup f87849l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TintTextView f87850m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ViewGroup f87851n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f87852o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public com.bilibili.search2.panel.b f87853p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f87854q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f87855r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public u f87856s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final n f87857t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final ViewStub f87858u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Lazy f87859v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Lazy f87860w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Lazy f87861x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Lazy f87862y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Lazy f87863z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/g$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f87864a;

        static {
            int[] iArr = new int[SearchInlineNetStatus.values().length];
            try {
                iArr[SearchInlineNetStatus.WIFI_4G.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SearchInlineNetStatus.WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[SearchInlineNetStatus.CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f87864a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/g$b.class */
    public static final class b implements ICardPlaySateChangedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f87865a;

        public b(g gVar) {
            this.f87865a = gVar;
        }

        public final void onError(ICardPlayerContext iCardPlayerContext) {
            IInlineControl iInlineControlFindInlineControl = InlineExtensionKt.findInlineControl(this.f87865a.getFragment());
            if (iInlineControlFindInlineControl != null) {
                iInlineControlFindInlineControl.stopPlay();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/g$c.class */
    public static final class c implements ImageLoadingListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f87866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f87867b;

        public c(g gVar, int i7) {
            this.f87866a = gVar;
            this.f87867b = i7;
        }

        public final void onImageSet(ImageInfo imageInfo) {
            if (imageInfo != null && imageInfo.getWidth() > 0 && imageInfo.getHeight() > 0) {
                g gVar = this.f87866a;
                Integer numValueOf = Integer.valueOf(gVar.f87846i.getHeight());
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                int iIntValue = (int) (((numValueOf != null ? numValueOf.intValue() : this.f87867b) * imageInfo.getWidth()) / imageInfo.getHeight());
                BiliImageView biliImageView = gVar.f87846i;
                ViewGroup.LayoutParams layoutParams = biliImageView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = iIntValue;
                biliImageView.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/g$d.class */
    public static final class d extends com.bilibili.search2.utils.i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final g f87868e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g gVar, Context context, FollowButton followButton, boolean z6, EH0.m mVar) {
            super(context, followButton, z6, mVar);
            this.f87868e = gVar;
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public final boolean isCancel() {
            Fragment fragment = this.f87868e.getFragment();
            return (fragment != null ? fragment.p3() : null) == null;
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public final void onFollowStart() {
            super.onFollowStart();
            g gVar = this.f87868e;
            String linkType = ((SearchAuthorNew) gVar.getData()).getLinkType();
            String str = linkType;
            if (linkType == null) {
                str = "app_user";
            }
            Xs0.b.i("search.search-result.search-card.all.click", null, str, (BaseSearchItem) gVar.getData(), null, null, "search.search-result.app-user.follow", "interaction_follow", null, MapsKt.mapOf(new Pair("is_show_live_card", String.valueOf(((SearchAuthorNew) gVar.getData()).isInlineLive()))), false, null, 6912);
        }

        @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
        public final void onUnFollowStart() {
            super.onUnFollowStart();
            g gVar = this.f87868e;
            String linkType = ((SearchAuthorNew) gVar.getData()).getLinkType();
            String str = linkType;
            if (linkType == null) {
                str = "app_user";
            }
            Xs0.b.i("search.search-result.search-card.all.click", null, str, (BaseSearchItem) gVar.getData(), null, null, "search.search-result.app-user.follow", "interaction_unfollow", null, MapsKt.mapOf(new Pair("is_show_live_card", String.valueOf(((SearchAuthorNew) gVar.getData()).isInlineLive()))), false, null, 6912);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull P p7) {
        super(p7.a);
        this.f87839a = this.itemView.findViewById(2131296823);
        this.f87840b = (TintTextView) this.itemView.findViewById(2131311304);
        this.f87841c = (TintTextView) this.itemView.findViewById(2131311305);
        this.f87842d = (ViewGroup) this.itemView.findViewById(2131315958);
        this.f87843e = (TintTextView) this.itemView.findViewById(2131315715);
        this.f87844f = this.itemView.findViewById(2131315971);
        this.f87845g = (FollowButton) this.itemView.findViewById(2131301778);
        this.h = (ViewStub) this.itemView.findViewById(2131316192);
        this.f87846i = this.itemView.findViewById(2131297481);
        this.f87847j = this.itemView.findViewById(2131301529);
        this.f87849l = (ViewGroup) this.itemView.findViewById(2131316181);
        this.f87850m = (TintTextView) this.itemView.findViewById(2131307610);
        this.f87851n = (ViewGroup) this.itemView.findViewById(2131307611);
        this.f87852o = this.itemView.findViewById(2131307573);
        this.f87857t = new n(this.itemView.getContext());
        this.f87858u = (ViewStub) this.itemView.findViewById(2131305146);
        this.f87859v = ListExtentionsKt.lazyUnsafe(new com.bilibili.biligame.ui.pointmall.address.dialog.i(this, 1));
        this.f87860w = ListExtentionsKt.lazyUnsafe(new com.bilibili.bililive.compose.businesscoupon.b(this, 1));
        this.f87861x = ListExtentionsKt.lazyUnsafe(new com.bilibili.bilibililive.streaming.pandora.core.whip.a(this, 3));
        this.f87862y = ListExtentionsKt.lazyUnsafe(new com.bilibili.ogvvega.tunnel.d(this, 1));
        this.f87863z = ListExtentionsKt.lazyUnsafe(new BJ.c(this, 2));
        this.f87827B = ListExtentionsKt.lazyUnsafe(new EG.e(this, 2));
        this.f87828C = (ViewStub) this.itemView.findViewById(2131310877);
        this.f87831F = LazyKt.lazy(new G3.P(8));
        this.f87832G = LazyKt.lazy(new Q(7));
        this.f87833H = LazyKt.lazy(new S(7));
        this.f87834I = LazyKt.lazy(new T(9));
        this.f87835J = LazyKt.lazy(new f(this, 0));
        this.f87837L = new b0(this, 2);
        this.f87838M = new JS0.o(this, 3);
    }

    public static void w0(int i7, View view) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(i7);
            marginLayoutParams.setMarginEnd(i7);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // Os0.a
    public final void attach() {
        y0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05a6  */
    @Override // dt0.AbstractC6839b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind() throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 2552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.author.g.bind():void");
    }

    @Override // dt0.AbstractC6843f, dt0.AbstractC6839b
    public final void bind(@NotNull List<Object> list) {
        super.bind(list);
        if (list.contains("PAYLOAD_UPDATE_TRANSLATE")) {
            r0();
            u uVar = this.f87856s;
            if (uVar != null) {
                List<SearchAuthorNew.AvItem> avItems = ((SearchAuthorNew) getData()).getAvItems();
                uVar.notifyItemRangeChanged(0, avItems != null ? avItems.size() : 0, "PAYLOAD_UPDATE_TRANSLATE");
            }
        }
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        Args args;
        SearchAuthorNew searchAuthorNew = (SearchAuthorNew) getData();
        long liveRoomId = searchAuthorNew.getLiveRoomId();
        long mid = searchAuthorNew.getMid();
        InlineLive inlineLive = searchAuthorNew.getInlineLive();
        long tid = (inlineLive == null || (args = inlineLive.getArgs()) == null) ? 0L : args.getTid();
        InlineLive inlineLive2 = searchAuthorNew.getInlineLive();
        long rid = 0;
        if (inlineLive2 != null) {
            Args args2 = inlineLive2.getArgs();
            rid = 0;
            if (args2 != null) {
                rid = args2.getRid();
            }
        }
        String uri = searchAuthorNew.getUri();
        String str = uri;
        if (uri == null) {
            str = "";
        }
        InlinePlayerTrackerCallbackKt.addInlineTrackerCallback(cardPlayTask, new LiveInlineTrackerCallback(new LivePlayerDataTracker.TrackerRawData(liveRoomId, mid, tid, rid, str, CardTypeKt.getCARD_TYPE_SEARCH_INLINE(), 5, null, 128, null)));
        cardPlayTask.setLiveSocketScene("searchlive");
        this.f87836K = z6;
        cardPlayTask.setNetworkAlertEnable(SearchAutoPlayUtilsKt.getEnableNetworkAlert(z6));
        cardPlayTask.setMute(com.bilibili.app.comm.list.common.widget.p.a);
        cardPlayTask.setChronosEnable(true);
        LiveInlineBufferingCallback liveInlineBufferingCallback = this.f87826A;
        if (liveInlineBufferingCallback != null) {
            cardPlayTask.addPlayerBufferingCallback(liveInlineBufferingCallback);
        }
        cardPlayTask.addPlayerStateChangedCallback(new b(this));
        return cardPlayTask;
    }

    @Override // Os0.a
    public final void detach() {
        IInlineControl iInlineControlFindInlineControl = InlineExtensionKt.findInlineControl(getFragment());
        if (iInlineControlFindInlineControl != null) {
            iInlineControlFindInlineControl.stopPlay(this);
        }
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final View[] getClickStatusViewArray() {
        return new View[]{this.f87843e, null};
    }

    @Nullable
    public final ViewGroup getInlineContainer() {
        return t0();
    }

    @NotNull
    public final Class<? extends com.bilibili.search2.panel.b> getPanelType() {
        return com.bilibili.search2.panel.b.class;
    }

    @Override // Et0.d
    public final boolean needWideScreenMargin() {
        SearchAuthorNew.Background background = ((SearchAuthorNew) getData()).getBackground();
        boolean z6 = false;
        if (background != null) {
            z6 = false;
            if (background.getShow() == 1) {
                z6 = true;
            }
        }
        return !z6;
    }

    public final void on4GTipShown() {
        String linkType = ((SearchAuthorNew) getData()).getLinkType();
        String str = linkType;
        if (linkType == null) {
            str = "app_user";
        }
        Xs0.b.k("search.search-result.search-card.all.show", str, (BaseSearchItem) getData(), Xs0.b.b("app-user", "strongremind"), MapsKt.mapOf(new Pair("is_show_live_card", String.valueOf(((SearchAuthorNew) getData()).isInlineLive()))), false, null, null, null, 960);
    }

    public final void onBindPanel(InlinePanel inlinePanel) {
        String coverLeftText1;
        com.bilibili.search2.panel.b bVar = (com.bilibili.search2.panel.b) inlinePanel;
        bVar.setNetAlertEnable(SearchAutoPlayUtilsKt.getEnableNetworkAlert(this.f87836K));
        bVar.setOnClickListener(new U(this, 1));
        bVar.setOnLongClickListener(new BE.c(this, 4));
        VectorTextView coverLeftText12 = bVar.getCoverLeftText1();
        InlineLive inlineLive = ((SearchAuthorNew) getData()).getInlineLive();
        String coverLeftText2 = null;
        String coverLeftText13 = inlineLive != null ? inlineLive.getCoverLeftText1() : null;
        InlineLive inlineLive2 = ((SearchAuthorNew) getData()).getInlineLive();
        ListExtentionsKt.setTextWithIcon$default(coverLeftText12, coverLeftText13, inlineLive2 != null ? inlineLive2.getCoverLeftIcon1() : 0, 2131103591, 0.0f, 0.0f, 48, (Object) null);
        InlineLive inlineLive3 = ((SearchAuthorNew) getData()).getInlineLive();
        if (inlineLive3 == null || (coverLeftText1 = inlineLive3.getCoverLeftText1()) == null || StringsKt.isBlank(coverLeftText1)) {
            bVar.m(bVar.getCoverLeftText1());
        }
        InlineLive inlineLive4 = ((SearchAuthorNew) getData()).getInlineLive();
        if (inlineLive4 == null || !inlineLive4.getHideDanmakuSwitch()) {
            bVar.getDanmaku().setVisible(true);
            ListExtentionsKt.visible(bVar.getDanmaku());
        } else {
            bVar.getDanmaku().setVisible(false);
            ListExtentionsKt.gone(bVar.getDanmaku());
        }
        bVar.getDanmaku().setOnWidgetClickListener(new Function2(this) { // from class: com.bilibili.search2.result.holder.author.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f87816a;

            {
                this.f87816a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                g gVar = this.f87816a;
                Xs0.b.i("search.search-result.search-card.all.click", null, gVar.getModuleType(), (BaseSearchItem) gVar.getData(), null, null, Xs0.b.b(gVar.getModuleType(), "danmu"), zBooleanValue ? "danmu_on" : "danmu_off", null, null, false, null, 7936);
                return Unit.INSTANCE;
            }
        });
        View view = bVar.f86960n;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveBadge");
            view = null;
        }
        ListExtentionsKt.gone(view);
        TextView textView = bVar.f86957k;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            textView = null;
        }
        InlineLive inlineLive5 = ((SearchAuthorNew) getData()).getInlineLive();
        if (inlineLive5 != null) {
            coverLeftText2 = inlineLive5.getCoverLeftText2();
        }
        textView.setText(coverLeftText2);
        bVar.getAvatar().displayAvatar(((SearchAuthorNew) getData()).getPendantAvatar());
        this.f87853p = bVar;
        InlineTask inlineToastTask = new InlineToastTask(bVar);
        InlineTask inlineTaskL = bVar.l();
        inlineTaskL.setManual(this.f87836K);
        Unit unit = Unit.INSTANCE;
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{inlineTaskL, inlineToastTask})).execute();
        bVar.l().setOnWidgetClickListener(this);
        LiveInlineBufferingCallback liveInlineBufferingCallback = this.f87826A;
        if (liveInlineBufferingCallback != null) {
            liveInlineBufferingCallback.checkLiveCanPlay(((SearchAuthorNew) getData()).getLiveRoomId());
        }
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
        String strValueOf;
        if (!((SearchAuthorNew) getData()).isExposed()) {
            SearchAuthorNew searchAuthorNew = (SearchAuthorNew) getData();
            RecyclerView recyclerView = getRecyclerView();
            boolean z6 = false;
            if ((recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0) == 0) {
                z6 = true;
            }
            searchAuthorNew.setAtFirstScreen(z6);
        }
        String linkType = ((SearchAuthorNew) getData()).getLinkType();
        String str = linkType;
        if (linkType == null) {
            str = "app_user";
        }
        BaseSearchItem baseSearchItem = (BaseSearchItem) getData();
        Pair pair = new Pair("is_show_live_card", String.valueOf(((SearchAuthorNew) getData()).isInlineLive()));
        Pair pair2 = new Pair("live_status", String.valueOf(((SearchAuthorNew) getData()).getLiveStatus()));
        if (this.f87855r) {
            PrInfo notice = ((SearchAuthorNew) getData()).getNotice();
            strValueOf = String.valueOf(notice != null ? Long.valueOf(notice.getNoticeId()) : null);
        } else {
            strValueOf = "";
        }
        Xs0.b.k("search.search-result.search-card.all.show", str, baseSearchItem, "search.search-result.app-user.0", MapsKt.mapOf(new Pair[]{pair, pair2, new Pair("pr_id", strValueOf)}), false, null, null, null, 992);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (view.getId() == 2131303656) {
            if (!ListCommonRouter.isLiveFloatWindowShow() && !ListCommonRouter.isVideoFloatWindowShow()) {
                q0();
                return;
            }
            if (!Connectivity.isConnected(Connectivity.getWifiNetworkInfo(this.itemView.getContext()))) {
                q0();
                return;
            }
            IInlineControl iInlineControlFindInlineControl = InlineExtensionKt.findInlineControl(getFragment());
            if (iInlineControlFindInlineControl != null) {
                iInlineControlFindInlineControl.startPlay(this, true);
            }
        }
    }

    public final void onClickCloseBtn() {
        String linkType = ((SearchAuthorNew) getData()).getLinkType();
        String str = linkType;
        if (linkType == null) {
            str = "app_user";
        }
        Xs0.b.i("search.search-result.search-card.all.click", null, str, (BaseSearchItem) getData(), null, null, Xs0.b.b("app-user", "strongremind"), "strongremind_close", null, MapsKt.mapOf(new Pair("is_show_live_card", String.valueOf(((SearchAuthorNew) getData()).isInlineLive()))), false, null, 6912);
    }

    public final void onClickGotoFreeData() {
    }

    public final void onClickNotUseBtn() {
        String linkType = ((SearchAuthorNew) getData()).getLinkType();
        String str = linkType;
        if (linkType == null) {
            str = "app_user";
        }
        Xs0.b.i("search.search-result.search-card.all.click", null, str, (BaseSearchItem) getData(), null, null, Xs0.b.b("app-user", "strongremind"), "stop_using", null, MapsKt.mapOf(new Pair("is_show_live_card", String.valueOf(((SearchAuthorNew) getData()).isInlineLive()))), false, null, 6912);
        Violet.INSTANCE.setValue(SearchInlineNetStatus.WIFI);
        IInlineControl iInlineControlFindInlineControl = InlineExtensionKt.findInlineControl(getFragment());
        if (iInlineControlFindInlineControl != null) {
            iInlineControlFindInlineControl.stopPlay(this);
        }
    }

    public final void onClickPlayWithMobileData() {
    }

    public final void onNetworkAlertShow() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0() {
        long liveRoomId = ((SearchAuthorNew) getData()).getLiveRoomId();
        Os0.e eVar = Os0.e.f18030a;
        Context context = this.itemView.getContext();
        C6914b liveLinkProvider = InlineBizUtilsKt.getLiveLinkProvider();
        InlineLive inlineLive = ((SearchAuthorNew) getData()).getInlineLive();
        Os0.e.g(eVar, context, C6914b.b(liveLinkProvider, liveRoomId, inlineLive != null ? inlineLive.getUri() : null, 23016));
        String linkType = ((SearchAuthorNew) getData()).getLinkType();
        String str = linkType;
        if (linkType == null) {
            str = "app_user";
        }
        Xs0.b.i("search.search-result.search-card.all.click", null, str, (BaseSearchItem) getData(), null, null, "search.search-result.app-user.live-inline", null, null, MapsKt.mapOf(new Pair("is_show_live_card", String.valueOf(((SearchAuthorNew) getData()).isInlineLive()))), false, null, 6912);
    }

    public final void r0() {
        if (((SearchAuthorNew) getData()).getInlineLive() != null) {
            TintTextView tintTextView = (TintTextView) this.f87860w.getValue();
            InlineLive inlineLive = ((SearchAuthorNew) getData()).getInlineLive();
            tintTextView.setText(inlineLive != null ? com.bilibili.search2.api.oversea.b.a(inlineLive) : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.bilibili.search2.result.holder.author.t, java.lang.Object] */
    public final void s0() {
        if (((SearchAuthorNew) getData()).getBackground() == null) {
            ListExtentionsKt.gone(this.f87846i);
            ListExtentionsKt.gone(this.f87847j);
            return;
        }
        SearchAuthorNew.Background background = ((SearchAuthorNew) getData()).getBackground();
        if (background != null) {
            if (background.getShow() != 1) {
                ListExtentionsKt.gone(this.f87846i);
                ListExtentionsKt.gone(this.f87847j);
                return;
            }
            ListExtentionsKt.visible(this.f87846i);
            ListExtentionsKt.visible(this.f87847j);
            if (com.bilibili.search2.component.e.g(this.itemView.getContext())) {
                int px = ListExtentionsKt.toPx(80.0f);
                BiliImageView biliImageView = this.f87846i;
                ViewGroup.LayoutParams layoutParams = biliImageView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                layoutParams2.constrainedWidth = true;
                layoutParams2.horizontalBias = 1.0f;
                biliImageView.setLayoutParams(layoutParams2);
                com.bilibili.search2.utils.extension.c.a(this.f87846i, background.getBgPicUrl(), null, false, new c(this, px), null, 0, 0, 246);
            } else {
                BiliImageView biliImageView2 = this.f87846i;
                ViewGroup.LayoutParams layoutParams3 = biliImageView2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                ((ViewGroup.MarginLayoutParams) layoutParams4).width = 0;
                layoutParams4.constrainedWidth = false;
                layoutParams4.horizontalBias = 0.5f;
                biliImageView2.setLayoutParams(layoutParams4);
                com.bilibili.search2.utils.extension.c.a(this.f87846i, background.getBgPicUrl(), null, false, null, null, 0, 0, 254);
            }
            com.bilibili.search2.utils.extension.c.a(this.f87847j, background.getFgPicUrl(), null, false, null, new Object(), 0, 0, 238);
        }
    }

    @Override // Os0.a
    public final void startScroll() {
        com.bilibili.search2.panel.b bVar = this.f87853p;
        if (bVar != null) {
            bVar.showWidgets();
        }
    }

    @Override // Os0.a
    public final void stopScroll() {
        IInlineControl iInlineControlFindInlineControl;
        if (!AutoPlayHelperKt.isViewHalfVisible$default(t0(), 0, 0, 6, (Object) null) && (iInlineControlFindInlineControl = InlineExtensionKt.findInlineControl(getFragment())) != null) {
            iInlineControlFindInlineControl.stopPlay(this);
        }
        y0();
    }

    public final SearchPlayerContainerLayout t0() {
        return (SearchPlayerContainerLayout) this.f87859v.getValue();
    }

    public final void u0(String str) {
        String linkType = ((SearchAuthorNew) getData()).getLinkType();
        String str2 = linkType;
        if (linkType == null) {
            str2 = "app_user";
        }
        Xs0.b.i("search.search-result.search-card.all.click", null, str2, (BaseSearchItem) getData(), null, null, Xs0.b.b("app-user", "threepoint-content"), str, null, MapsKt.mapOf(new Pair("is_show_live_card", String.valueOf(((SearchAuthorNew) getData()).isInlineLive()))), false, null, 6912);
    }

    public final void updateCardLive(boolean z6) {
        RightTopLiveBadge rightTopLiveBadge;
        InlineLive inlineLive = ((SearchAuthorNew) getData()).getInlineLive();
        if (inlineLive == null || (rightTopLiveBadge = inlineLive.getRightTopLiveBadge()) == null) {
            return;
        }
        rightTopLiveBadge.setLiveStatus(z6 ? 1 : 0);
    }

    public final void v0() {
        String linkType = ((SearchAuthorNew) getData()).getLinkType();
        String str = linkType;
        if (linkType == null) {
            str = "app_user";
        }
        Xs0.b.i("search.search-result.search-card.all.click", null, str, (BaseSearchItem) getData(), null, null, Xs0.b.b("app-user", "threepoint"), "threepoint_click", null, MapsKt.mapOf(new Pair("is_show_live_card", String.valueOf(((SearchAuthorNew) getData()).isInlineLive()))), false, null, 6912);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Os0.a
    public final void visible() {
        Rh.a aVar = Rh.a.a;
        if (Rh.a.c(this.itemView.getContext())) {
            return;
        }
        String linkType = ((SearchAuthorNew) getData()).getLinkType();
        String str = linkType;
        if (linkType == null) {
            str = "app_user";
        }
        Xs0.b.k("search.search-result.search-card.all.show", str, (BaseSearchItem) getData(), Xs0.b.b("app-user", "startplay"), MapsKt.mapOf(new Pair("is_show_live_card", String.valueOf(((SearchAuthorNew) getData()).isInlineLive()))), false, null, null, null, 960);
    }

    public final void x0() {
        TrafficConfig trafficConfig;
        InlineLive inlineLive = ((SearchAuthorNew) getData()).getInlineLive();
        if (inlineLive == null || (trafficConfig = inlineLive.getTrafficConfig()) == null) {
            return;
        }
        B.B(getFragment(), trafficConfig, this.f87837L, this.f87838M);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0() {
        final Fragment fragment = getFragment();
        if (fragment != null && getAbsoluteAdapterPosition() == 0) {
            ViewParent parent = this.itemView.getParent();
            RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
            if (recyclerView == null || recyclerView.getScrollState() != 0) {
                return;
            }
            final n nVar = this.f87857t;
            final View view = this.f87852o;
            final int px = ListExtentionsKt.toPx(10);
            final int px2 = ListExtentionsKt.toPx(6);
            final HT0.f fVar = new HT0.f(this, 2);
            nVar.getClass();
            SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
            if (Intrinsics.areEqual(bLKVSharedPreference != null ? Boolean.valueOf(bLKVSharedPreference.getBoolean("has_show_author_share_guide_key", false)) : null, Boolean.FALSE)) {
                SearchAuthorShareGuide searchAuthorShareGuide = nVar.f87884d;
                if (searchAuthorShareGuide.canAuthorShareGuideShow()) {
                    try {
                        PopupWindow popupWindow = new PopupWindow(nVar.f87881a);
                        String authorShareGuideContent = searchAuthorShareGuide.getAuthorShareGuideContent(nVar.f87881a);
                        View viewInflate = LayoutInflater.from(nVar.f87881a).inflate(2131494365, (ViewGroup) null);
                        TextView textView = (TextView) viewInflate.findViewById(2131302502);
                        if (!Intrinsics.areEqual(textView.getText(), authorShareGuideContent)) {
                            textView.setText(authorShareGuideContent);
                        }
                        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                        popupWindow.setInputMethodMode(1);
                        popupWindow.setFocusable(true);
                        popupWindow.setTouchable(true);
                        popupWindow.setContentView(viewInflate);
                        nVar.f87882b = popupWindow;
                        view.post(new Runnable(fragment, nVar, view, px, px2, fVar) { // from class: com.bilibili.search2.result.holder.author.l

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final Fragment f87874a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final n f87875b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final View f87876c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final int f87877d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final int f87878e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            public final HT0.f f87879f;

                            {
                                this.f87874a = fragment;
                                this.f87875b = nVar;
                                this.f87876c = view;
                                this.f87877d = px;
                                this.f87878e = px2;
                                this.f87879f = fVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                Fragment fragment2 = this.f87874a;
                                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment2), (CoroutineContext) null, (CoroutineStart) null, new AuthorShareGuidePopWindow$tryStartGuideAnimation$1$1(fragment2, this.f87875b, this.f87876c, this.f87877d, this.f87878e, this.f87879f, null), 3, (Object) null);
                            }
                        });
                    } catch (Exception e7) {
                        CrashReporter.INSTANCE.postCaughtException(e7);
                    }
                }
            }
        }
    }
}
