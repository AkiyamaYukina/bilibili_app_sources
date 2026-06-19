package com.bilibili.pegasus.verticaltab.cards;

import H60.K;
import H60.V;
import LL.c;
import Tw.r;
import Tw.t;
import Up0.AbstractC2919h;
import Up0.B;
import Up0.C;
import Up0.D;
import Up0.E;
import Yp0.f;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.core.view.GravityCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.authorspace.api.BiliHeaderTag;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.LikeButtonItemV2;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineUGCHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineFullScreenWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineMuteWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.utils.ListConstKt;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.BiliContext;
import com.bilibili.bililive.room.ui.roomv3.tab.interaction.LiveRoomInteractionViewModel;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;
import com.bilibili.inline.plugin.DefaultCardPlayBehaviorWrap;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accountinfo.model.OfficialInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.lib.fasthybrid.biz.game.GameRecommendBean;
import com.bilibili.lib.fasthybrid.biz.game.GameRecommendItem;
import com.bilibili.lib.fasthybrid.container.O;
import com.bilibili.lib.fasthybrid.uimodule.widget.ConfigurationChangeLinerLayout;
import com.bilibili.lib.fasthybrid.uimodule.widget.dev.GameRecommendButton;
import com.bilibili.lib.fasthybrid.uimodule.widget.dev.VConsoleButton;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.opd.app.bizcommon.ui.widget.MallDialog;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.Avatar;
import com.bilibili.pegasus.api.modelv2.BasePlayerItem;
import com.bilibili.pegasus.card.base.H;
import com.bilibili.pegasus.card.base.clickprocessors.g;
import com.bilibili.pegasus.utils.I;
import com.bilibili.pegasus.utils.x;
import com.bilibili.pegasus.utils.z;
import com.bilibili.pegasus.verticaltab.VerticalTabFragment;
import com.bilibili.pegasus.verticaltab.api.model.VerticalLargeCoverV9Item;
import com.bilibili.pegasus.verticaltab.cards.VerticalLargeCoverV9Holder;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import com.bilibili.playerbizcommon.gesture.OnUpListener;
import com.mall.data.page.shop.call.RobSelLineBean;
import com.mall.data.page.shop.call.RobSelLineVoBean;
import com.mall.data.page.shop.call.RoomEvent;
import com.mall.ui.page.shop.call.BuyerFragment;
import com.mall.ui.page.shop.call.VideoCallFragment;
import com.mall.videodetail.vd.united.page.videoquality.MallVDPlayerQualitySwitchWidget;
import gl.F;
import gl.u;
import i60.y0;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kntr.common.ouro.common.ui.toolbar.ToolbarItem;
import kntr.common.ouro.common.ui.toolbar.ToolbarTrackEvent;
import kotlin.Lazy;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.ui.splash.ad.model.Splash;
import tv.danmaku.bili.ui.splash.ad.model.SplashGuideButton;
import tv.danmaku.bili.widget.PendantAvatarFrameLayout;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/cards/VerticalLargeCoverV9Holder.class */
@StabilityInferred(parameters = 0)
public final class VerticalLargeCoverV9Holder extends AbstractC2919h<VerticalLargeCoverV9Item, F, f> implements g<VerticalLargeCoverV9Item> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f78949s = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ViewStub f78950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ViewStub f78951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f78952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f78953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f78954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Ep0.b f78955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final D f78956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final E f78957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final a f78958r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/cards/VerticalLargeCoverV9Holder$a.class */
    public static final class a implements PanelDetachListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VerticalLargeCoverV9Holder f78959a;

        public a(VerticalLargeCoverV9Holder verticalLargeCoverV9Holder) {
            this.f78959a = verticalLargeCoverV9Holder;
        }

        public final void onDetach(InlinePanel inlinePanel) {
            InlineGestureSeekBarContainer inlineGestureSeekBarContainerT0 = this.f78959a.t0();
            inlineGestureSeekBarContainerT0.resetProgress();
            inlineGestureSeekBarContainerT0.setVisibility(8);
            inlinePanel.removeOnDetachListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VerticalLargeCoverV9Holder(@NotNull final F f7) {
        super(f7);
        x.a aVar = x.f78893a;
        this.f78950j = (ViewStub) this.itemView.findViewById(2131299661);
        this.f78951k = (ViewStub) this.itemView.findViewById(2131303685);
        this.f78952l = ListExtentionsKt.lazyUnsafe(new Function0(this, f7) { // from class: com.bilibili.pegasus.verticaltab.cards.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VerticalLargeCoverV9Holder f78962a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final F f78963b;

            {
                this.f78962a = this;
                this.f78963b = f7;
            }

            public final Object invoke() {
                x.a aVar2 = x.f78893a;
                g gVar = this.f78962a;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) gVar.itemView.findViewById(2131315642);
                u uVar = this.f78963b.c;
                TintImageView tintImageView = uVar.f;
                I i7 = new I(gVar);
                VerticalLargeCoverV9Holder$mInlineLikeButtonHelper$2$1 verticalLargeCoverV9Holder$mInlineLikeButtonHelper$2$1 = new VerticalLargeCoverV9Holder$mInlineLikeButtonHelper$2$1(gVar);
                VerticalTabFragment verticalTabFragment = gVar.f24825b;
                return new z(lottieAnimationView, tintImageView, uVar.g, i7, verticalLargeCoverV9Holder$mInlineLikeButtonHelper$2$1, verticalTabFragment != null ? verticalTabFragment.getLifecycle() : null);
            }
        });
        this.f78953m = ListExtentionsKt.lazyUnsafe(new B(this, 0));
        this.f78954n = ListExtentionsKt.lazyUnsafe(new C(this, 0));
        this.f78956p = new D(this, 0);
        this.f78957q = new E(this, 0);
        this.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: Up0.F

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VerticalLargeCoverV9Holder f24811a;

            {
                this.f24811a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Vp0.b.d(this.f24811a, false, false, 3);
            }
        });
        ListPlaceHolderImageView listPlaceHolderImageView = f7.b;
        final int i7 = 0;
        listPlaceHolderImageView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: Up0.G

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f24812a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f24813b;

            {
                this.f24812a = i7;
                this.f24813b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strO;
                switch (this.f24812a) {
                    case 0:
                        Vp0.b.d((VerticalLargeCoverV9Holder) this.f24813b, false, false, 3);
                        break;
                    default:
                        com.bilibili.lib.fasthybrid.container.B b7 = (com.bilibili.lib.fasthybrid.container.B) this.f24813b;
                        int i8 = VConsoleButton.$stable;
                        B80.d.a.getClass();
                        String strO2 = b7.o();
                        ConcurrentHashMap concurrentHashMap = B80.d.c;
                        B80.e eVar = (B80.e) concurrentHashMap.get(strO2);
                        if (eVar != null) {
                            if (eVar.getVisibility() != 0) {
                                FrameLayout frameLayoutZe = b7.ze();
                                if (frameLayoutZe != null && (strO = b7.o()) != null) {
                                    B80.e eVar2 = (B80.e) concurrentHashMap.get(strO);
                                    B80.e eVar3 = eVar2;
                                    if (eVar2 == null) {
                                        eVar3 = new B80.e(BiliContext.application(), 0);
                                        concurrentHashMap.put(strO, eVar3);
                                    }
                                    ViewParent parent = eVar3.getParent();
                                    if (parent == null || !(parent instanceof ViewGroup)) {
                                        if (parent == null) {
                                            frameLayoutZe.addView(eVar3);
                                        }
                                    } else if (frameLayoutZe != parent) {
                                        ((ViewGroup) parent).removeView(eVar3);
                                        frameLayoutZe.addView(eVar3);
                                    }
                                    eVar3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    eVar3.setVisibility(0);
                                    frameLayoutZe.requestLayout();
                                }
                            } else {
                                B80.d.a(b7);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        u uVar = f7.c;
        uVar.h.setOnClickListener(new c(this, 2));
        uVar.h.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: Up0.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VerticalLargeCoverV9Holder f24872a;

            {
                this.f24872a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Vp0.b.c(this.f24872a);
                return true;
            }
        });
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener(this) { // from class: Up0.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VerticalLargeCoverV9Holder f24873a;

            {
                this.f24873a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Vp0.b.c(this.f24873a);
                return true;
            }
        };
        listPlaceHolderImageView.setOnLongClickListener(onLongClickListener);
        this.itemView.setOnLongClickListener(onLongClickListener);
        r0().setOnLongClickListener(onLongClickListener);
        this.f78958r = new a(this);
    }

    public final void a(boolean z6) {
        IInlineControl iInlineControl;
        ICardPlayerContext cardPlayerContext;
        if (z6) {
            f fVar = (f) this.f24837f;
            if (((fVar == null || (cardPlayerContext = fVar.getCardPlayerContext()) == null) ? null : cardPlayerContext.getVideoEnvironment()) == VideoEnvironment.MOBILE_DATA) {
                PlayReason playReason = PlayReason.INLINE_MANUAL_PLAY;
                VerticalLargeCoverV9Item verticalLargeCoverV9Item = (VerticalLargeCoverV9Item) getData();
                PlayReason playReason2 = null;
                if (verticalLargeCoverV9Item != null) {
                    IInlineProperty cardPlayProperty = verticalLargeCoverV9Item.getCardPlayProperty();
                    playReason2 = null;
                    if (cardPlayProperty != null) {
                        playReason2 = cardPlayProperty.getPlayReason();
                    }
                }
                if (playReason == playReason2 || (iInlineControl = this.f24836e) == null) {
                    return;
                }
                iInlineControl.stopPlay(this);
            }
        }
    }

    public final void c(long j7, boolean z6) {
        VerticalLargeCoverV9Item verticalLargeCoverV9Item = (VerticalLargeCoverV9Item) getData();
        if (verticalLargeCoverV9Item != null && j7 == verticalLargeCoverV9Item.getAid()) {
            verticalLargeCoverV9Item.setFavorite(z6);
        }
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineUGCHistoryServiceV2) this.f78953m.getValue());
        InlineExtensionKt.addInlineBehavior(cardPlayTask, (DefaultCardPlayBehaviorWrap) this.f78954n.getValue());
        H.b(cardPlayTask, z6);
        cardPlayTask.setChronosEnable(true);
        VerticalLargeCoverV9Item verticalLargeCoverV9Item = (VerticalLargeCoverV9Item) getData();
        if (verticalLargeCoverV9Item != null) {
            Ep0.b bVar = new Ep0.b(verticalLargeCoverV9Item);
            bVar.setVideoStateCallback(this.f78956p);
            bVar.setFollowStateCallback(this.f78957q);
            cardPlayTask.setTaskRepository(bVar);
            this.f78955o = bVar;
        }
        return cardPlayTask;
    }

    public final boolean d() {
        VerticalLargeCoverV9Item verticalLargeCoverV9Item = (VerticalLargeCoverV9Item) getData();
        boolean z6 = false;
        if (verticalLargeCoverV9Item != null) {
            z6 = false;
            if (verticalLargeCoverV9Item.shareMenuEnable()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final BasePlayerItem getData() {
        return (VerticalLargeCoverV9Item) getData();
    }

    @NotNull
    public final Class<? extends f> getPanelType() {
        return f.class;
    }

    public final float getPlaySpeed() {
        ICardPlayerContext cardPlayerContext;
        f fVar = (f) this.f24837f;
        return (fVar == null || (cardPlayerContext = fVar.getCardPlayerContext()) == null) ? 1.0f : cardPlayerContext.getPlaySpeed();
    }

    public final int getPlayerState() {
        ICardPlayerContext cardPlayerContext;
        f fVar = (f) this.f24837f;
        return (fVar == null || (cardPlayerContext = fVar.getCardPlayerContext()) == null) ? 0 : cardPlayerContext.getPlayerState();
    }

    public final boolean isFavorite() {
        VerticalLargeCoverV9Item verticalLargeCoverV9Item = (VerticalLargeCoverV9Item) getData();
        boolean z6 = false;
        if (verticalLargeCoverV9Item != null) {
            z6 = false;
            if (verticalLargeCoverV9Item.isFavorite()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // Up0.AbstractC2919h
    public final void onBind(int i7, @NotNull List<? extends Object> list) {
        final LikeButtonItemV2 likeButtonItemV2;
        super.onBind(i7, list);
        final VerticalLargeCoverV9Item verticalLargeCoverV9Item = (VerticalLargeCoverV9Item) getData();
        if (verticalLargeCoverV9Item == null) {
            return;
        }
        x.g(p0().b, ((BasicIndexItem) verticalLargeCoverV9Item).cover, this.f78950j, 8);
        ((DefaultCardPlayBehaviorWrap) this.f78954n.getValue()).reset(this);
        ((InlineUGCHistoryServiceV2) this.f78953m.getValue()).reset(verticalLargeCoverV9Item.getUri());
        ListExtentionsKt.setTextWithIcon$default(p0().d.c.b, verticalLargeCoverV9Item.coverLeftText1, verticalLargeCoverV9Item.coverLeftIcon1, R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setTextWithIcon$default(p0().d.c.c, verticalLargeCoverV9Item.coverLeftText2, verticalLargeCoverV9Item.coverLeftIcon2, R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setText(p0().d.b, verticalLargeCoverV9Item.coverRightText);
        final int i8 = 0;
        x.j(p0().c.e, verticalLargeCoverV9Item.rcmdReasonStyle, ((BasicIndexItem) verticalLargeCoverV9Item).title, new Function0(i8, this, verticalLargeCoverV9Item) { // from class: Up0.x

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f24874a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f24875b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f24876c;

            {
                this.f24874a = i8;
                this.f24875b = this;
                this.f24876c = verticalLargeCoverV9Item;
            }

            public final Object invoke() {
                switch (this.f24874a) {
                    case 0:
                        ListExtentionsKt.setText(((VerticalLargeCoverV9Holder) this.f24875b).p0().c.e, ((BasicIndexItem) ((VerticalLargeCoverV9Item) this.f24876c)).title);
                        break;
                    default:
                        ((Function1) this.f24875b).invoke(ToolbarItem.Album);
                        ((Function1) this.f24876c).invoke(ToolbarTrackEvent.ALBUM);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, verticalLargeCoverV9Item.storyCardIcon, x.f78893a, 1656);
        x.t(p0().c.b, p0().c.d, verticalLargeCoverV9Item.multiplyDesc, verticalLargeCoverV9Item.desc);
        VerticalLargeCoverV9Item verticalLargeCoverV9Item2 = (VerticalLargeCoverV9Item) getData();
        if (verticalLargeCoverV9Item2 != null) {
            PendantAvatarFrameLayout pendantAvatarFrameLayout = p0().c.c;
            PendantAvatarFrameLayout.ShowParams showParams = new PendantAvatarFrameLayout.ShowParams();
            showParams.mode(1);
            showParams.defaultAvatar(2131237005);
            Avatar avatar = verticalLargeCoverV9Item2.avatar;
            showParams.avatarImgUrl(avatar != null ? avatar.cover : null);
            showParams.borderWidth(0.5f);
            showParams.borderColor(R$color.Ga2);
            showParams.mIsBadgeShow = Boolean.TRUE;
            showParams.badgeImgRes(ListConstKt.getIconRes(verticalLargeCoverV9Item2.isAtten ? 24 : verticalLargeCoverV9Item2.officialIconV2));
            pendantAvatarFrameLayout.show(showParams);
        }
        p0().c.c.setOnClickListener(new t(1, this, verticalLargeCoverV9Item));
        final VerticalLargeCoverV9Item verticalLargeCoverV9Item3 = (VerticalLargeCoverV9Item) getData();
        Lazy lazy = this.f78952l;
        if (verticalLargeCoverV9Item3 != null && (likeButtonItemV2 = ((BasePlayerItem) verticalLargeCoverV9Item3).likeButton) != null) {
            ((z) lazy.getValue()).c(likeButtonItemV2, verticalLargeCoverV9Item3, "main.composite-tab.0.0.pv", "main.composite-tab.0.0.pv", "7");
            final int i9 = 0;
            p0().c.f.setOnClickListener(new View.OnClickListener(this, i9, likeButtonItemV2, verticalLargeCoverV9Item3) { // from class: Up0.y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f24877a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f24878b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f24879c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f24880d;

                {
                    this.f24877a = i9;
                    this.f24878b = this;
                    this.f24879c = likeButtonItemV2;
                    this.f24880d = verticalLargeCoverV9Item3;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (this.f24877a) {
                        case 0:
                            com.bilibili.pegasus.utils.z.f((com.bilibili.pegasus.utils.z) ((VerticalLargeCoverV9Holder) this.f24878b).f78952l.getValue(), (LikeButtonItemV2) this.f24879c, (VerticalLargeCoverV9Item) this.f24880d, 4);
                            break;
                        case 1:
                            GameRecommendBean gameRecommendBean = (GameRecommendBean) this.f24878b;
                            O o7 = (O) this.f24879c;
                            Function1 function1 = (Function1) this.f24880d;
                            int i10 = GameRecommendButton.$stable;
                            List navigateAppList = gameRecommendBean.getNavigateAppList();
                            if (navigateAppList != null && navigateAppList.size() == 1) {
                                com.bilibili.lib.fasthybrid.report.a aVarC = com.bilibili.lib.fasthybrid.report.a.Companion.c(o7.o());
                                if (aVarC != null) {
                                    aVarC.c("mall.minigame-window.recommendation.0.click", new String[]{"origin_appid", o7.getAppInfo().getAppId(), "reco_appid", ((GameRecommendItem) navigateAppList.get(0)).getAppId()});
                                }
                                V v7 = V.a;
                                GameRecommendItem gameRecommendItem = (GameRecommendItem) navigateAppList.get(0);
                                D d7 = new D(function1, 1);
                                v7.getClass();
                                V.c(o7, gameRecommendItem, d7);
                            } else if (navigateAppList != null && navigateAppList.size() > 1) {
                                com.bilibili.lib.fasthybrid.report.a aVarC2 = com.bilibili.lib.fasthybrid.report.a.Companion.c(o7.o());
                                if (aVarC2 != null) {
                                    aVarC2.c("mall.minigame-window.recommendations.0.click", new String[]{"origin_appid", o7.getAppInfo().getAppId()});
                                }
                                K.a aVar = H60.K.Companion;
                                AppCompatActivity appCompatActivityV6 = o7.v6();
                                Context contextApplication = appCompatActivityV6;
                                if (appCompatActivityV6 == null) {
                                    contextApplication = BiliContext.application();
                                }
                                E e7 = new E(function1, 1);
                                aVar.getClass();
                                Lazy lazy2 = t90.p.a;
                                int i11 = StatusBarCompat.getDisplayRealSize(contextApplication).y;
                                int i12 = StatusBarCompat.getDisplayRealSize(contextApplication).x;
                                PopupWindow popupWindow = new PopupWindow();
                                H60.K.a = popupWindow;
                                if (i11 > i12) {
                                    popupWindow.setAnimationStyle(2131887433);
                                } else {
                                    popupWindow.setAnimationStyle(2131887432);
                                }
                                ConfigurationChangeLinerLayout configurationChangeLinerLayoutInflate = View.inflate(contextApplication, 2131499821, null);
                                configurationChangeLinerLayoutInflate.setNewConfigListener(new H60.H(0));
                                RecyclerView recyclerView = (RecyclerView) configurationChangeLinerLayoutInflate.findViewById(2131306595);
                                recyclerView.setLayoutManager(new GridLayoutManager(contextApplication, 2));
                                recyclerView.setAdapter(new V60.c(contextApplication, gameRecommendBean, o7, e7));
                                if (i11 < i12) {
                                    configurationChangeLinerLayoutInflate.setBackgroundResource(2131103591);
                                }
                                ((TextView) configurationChangeLinerLayoutInflate.findViewById(2131313758)).setOnClickListener(new H60.I(o7, 0));
                                H60.K.a.setFocusable(true);
                                H60.K.a.setTouchable(true);
                                H60.K.a.setOutsideTouchable(true);
                                H60.K.a.setWidth(i11 > i12 ? (int) (((double) i12) * 0.95d) : t90.p.g(355, contextApplication));
                                H60.K.a.setHeight(i11 > i12 ? t90.p.g(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_MULTI_SEGMENT_MAX_SIZE, contextApplication) : -1);
                                H60.K.a.setContentView(configurationChangeLinerLayoutInflate);
                                if (i11 > i12) {
                                    H60.K.a.showAtLocation(o7.o1(), 80, 0, t90.p.g(10, contextApplication));
                                } else {
                                    H60.K.a.showAtLocation(o7.o1(), GravityCompat.START, 0, 0);
                                }
                                H60.K.a.setOnDismissListener(new H60.J(o7));
                                o7.o1().setBackgroundResource(2131103688);
                                WindowManager.LayoutParams attributes = o7.v6().getWindow().getAttributes();
                                attributes.alpha = 0.5f;
                                o7.v6().getWindow().setAttributes(attributes);
                            } else {
                                function1.invoke(new y0(100, "game list is empty", (Object) null));
                            }
                            break;
                        case 2:
                            com.bilibili.app.authorspace.ui.headerinfo.i iVar = (com.bilibili.app.authorspace.ui.headerinfo.i) this.f24878b;
                            BiliHeaderTag biliHeaderTag = (BiliHeaderTag) this.f24879c;
                            String str = (String) this.f24880d;
                            long jC0 = iVar.a.C0();
                            String str2 = biliHeaderTag.brandReport;
                            HashMap map = new HashMap();
                            map.put("up_mid", String.valueOf(jC0));
                            if (str2 != null) {
                                map.put("report", str2);
                            }
                            Neurons.reportClick(false, "main.space.business-assemblies.0.click", map);
                            GAdBizKt.getGAdSpace().handleSpaceWidgetClick(iVar.b.getContext(), str);
                            break;
                        default:
                            ((hg1.d) this.f24878b).c((Splash) this.f24879c, (SplashGuideButton) this.f24880d);
                            break;
                    }
                }
            });
        }
        z zVar = (z) lazy.getValue();
        LikeButtonItemV2 likeButtonItemV22 = ((BasePlayerItem) verticalLargeCoverV9Item).likeButton;
        boolean zIsSelected = likeButtonItemV22 != null ? likeButtonItemV22.isSelected() : false;
        LikeButtonItemV2 likeButtonItemV23 = ((BasePlayerItem) verticalLargeCoverV9Item).likeButton;
        String formatCount = null;
        if (likeButtonItemV23 != null) {
            formatCount = likeButtonItemV23.getFormatCount();
        }
        zVar.e(formatCount, zIsSelected);
        p0().c.h.setVisibility(0);
        ListPlaceHolderImageView listPlaceHolderImageView = p0().b;
        PlayerArgs playerArgs = ((BasicIndexItem) verticalLargeCoverV9Item).playerArgs;
        boolean z6 = false;
        if (playerArgs != null) {
            z6 = playerArgs.hidePlayButton;
        }
        listPlaceHolderImageView.showPlaceHolderInnerDrawable(z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBindPanel(InlinePanel inlinePanel) {
        f fVar = (f) inlinePanel;
        s0(fVar);
        VerticalLargeCoverV9Item verticalLargeCoverV9Item = (VerticalLargeCoverV9Item) getData();
        if (verticalLargeCoverV9Item == null) {
            return;
        }
        InlineMuteWidgetV3 inlineMuteWidgetV3 = fVar.f29023n;
        InlineTask inlineTask = null;
        if (inlineMuteWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            inlineMuteWidgetV3 = null;
        }
        inlineMuteWidgetV3.setOnWidgetClickListener(new Fe1.E(this, 2));
        fVar.getDanmaku().setOnWidgetClickListener(new Vp0.c(this, 0));
        if (((BasePlayerItem) verticalLargeCoverV9Item).hideDanmakuSwitch) {
            fVar.getDanmaku().setVisible(false);
            fVar.getDanmaku().setVisibility(8);
        } else {
            fVar.getDanmaku().setVisible(true);
            fVar.getDanmaku().setVisibility(0);
        }
        VectorTextView vectorTextView = fVar.f29020k;
        if (vectorTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            vectorTextView = null;
        }
        H.c(vectorTextView, verticalLargeCoverV9Item.coverLeftText1, verticalLargeCoverV9Item.coverLeftIcon1);
        VectorTextView vectorTextView2 = fVar.f29021l;
        if (vectorTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            vectorTextView2 = null;
        }
        H.c(vectorTextView2, verticalLargeCoverV9Item.coverLeftText2, verticalLargeCoverV9Item.coverLeftIcon2);
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerT0 = t0();
        inlineGestureSeekBarContainerT0.setVisibility(0);
        inlineGestureSeekBarContainerT0.resetProgress();
        fVar.getGestureSeekWidget().setGestureSeekBarContainer(inlineGestureSeekBarContainerT0);
        InlineFullScreenWidgetV3 inlineFullScreenWidgetV3 = fVar.f29022m;
        if (inlineFullScreenWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fullScreen");
            inlineFullScreenWidgetV3 = null;
        }
        inlineFullScreenWidgetV3.setVisible(H.a());
        InlineFullScreenWidgetV3 inlineFullScreenWidgetV32 = fVar.f29022m;
        if (inlineFullScreenWidgetV32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fullScreen");
            inlineFullScreenWidgetV32 = null;
        }
        inlineFullScreenWidgetV32.setVisibility(ListExtentionsKt.toVisibility(H.a()));
        if (H.a()) {
            ImageView imageView = fVar.f29022m;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fullScreen");
                imageView = null;
            }
            imageView.setOnClickListener(new r(1, this));
        }
        final int i7 = 0;
        fVar.setOnClickListener(new Function1(this, i7) { // from class: Up0.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f24881a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f24882b;

            {
                this.f24881a = i7;
                this.f24882b = this;
            }

            public final Object invoke(Object obj) throws JSONException {
                MutableLiveData mutableLiveData;
                OfficialInfo officialInfo;
                OfficialInfo officialInfo2;
                switch (this.f24881a) {
                    case 0:
                        Vp0.b.d((VerticalLargeCoverV9Holder) this.f24882b, false, false, 3);
                        break;
                    case 1:
                        ((OnUpListener) obj).onUp((MotionEvent) this.f24882b);
                        break;
                    case 2:
                        RobSelLineVoBean robSelLineVoBean = (RobSelLineVoBean) obj;
                        BuyerFragment buyerFragment = (BuyerFragment) this.f24882b;
                        buyerFragment.R = robSelLineVoBean;
                        RobSelLineBean robSelLineBean = robSelLineVoBean.robSelLineBean;
                        if (robSelLineBean == null || robSelLineBean.busy != 0) {
                            buyerFragment.U = SystemClock.elapsedRealtime();
                            qQ0.b bVar = ((VideoCallFragment) buyerFragment).d;
                            if (bVar != null && (mutableLiveData = ((qQ0.l) bVar).k) != null) {
                                RobSelLineBean robSelLineBean2 = robSelLineVoBean.robSelLineBean;
                                mutableLiveData.setValue(new Triple(robSelLineBean2.merchantFace, robSelLineBean2.merchantFaceMark, robSelLineBean2.merchantNick));
                            }
                        } else {
                            List list = robSelLineBean.optionalMerchantAssistants;
                            if (list == null || list.isEmpty()) {
                                qQ0.b bVar2 = ((VideoCallFragment) buyerFragment).d;
                                if (bVar2 != null) {
                                    bVar2.L0("optionalMerchantAssistants");
                                }
                                qQ0.b bVar3 = ((VideoCallFragment) buyerFragment).d;
                                if (bVar3 != null) {
                                    bVar3.M0(true);
                                }
                                qQ0.b bVar4 = ((VideoCallFragment) buyerFragment).d;
                                if (bVar4 != null) {
                                    bVar4.R0(RoomEvent.BUYER_CANCEL_CALL);
                                }
                                MallDialog.a aVar = new MallDialog.a(buyerFragment.requireActivity());
                                aVar.f74667e = new String[]{buyerFragment.getString(2131831208), buyerFragment.getString(2131831207)};
                                aVar.f74663a = 2;
                                aVar.f74665c = 1;
                                MallDialog mallDialogA = aVar.a();
                                mallDialogA.setOneBtnText(buyerFragment.getString(2131831221));
                                mallDialogA.setCanceledOnTouchOutside(false);
                                mallDialogA.setDialogClickListener(new i60.G(buyerFragment));
                                mallDialogA.show();
                            } else {
                                KQ0.e.i(2131831063, 2131831060);
                                MallDialog.a aVar2 = new MallDialog.a(buyerFragment.requireActivity());
                                aVar2.f74667e = new String[]{buyerFragment.getString(2131831210), buyerFragment.getString(2131831209)};
                                aVar2.f74663a = 2;
                                aVar2.f74665c = 2;
                                MallDialog mallDialogA2 = aVar2.a();
                                mallDialogA2.setCanceledOnTouchOutside(false);
                                mallDialogA2.setTwoBtnText(buyerFragment.getString(2131831202), buyerFragment.getString(2131831203));
                                mallDialogA2.setDialogClickListener(new IC0.a(buyerFragment));
                                mallDialogA2.show();
                            }
                        }
                        break;
                    default:
                        JSONObject jSONObject = (JSONObject) obj;
                        AccountInfo accountInfo = (AccountInfo) this.f24882b;
                        jSONObject.put("role", (accountInfo == null || (officialInfo2 = accountInfo.getOfficialInfo()) == null) ? null : Integer.valueOf(officialInfo2.getRole()));
                        jSONObject.put("title", (accountInfo == null || (officialInfo = accountInfo.getOfficialInfo()) == null) ? null : officialInfo.getTitle());
                        String desc = null;
                        if (accountInfo != null) {
                            OfficialInfo officialInfo3 = accountInfo.getOfficialInfo();
                            desc = null;
                            if (officialInfo3 != null) {
                                desc = officialInfo3.getDesc();
                            }
                        }
                        jSONObject.put("desc", desc);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        final int i8 = 0;
        fVar.setOnLongClickListener(new Function1(this, i8) { // from class: Up0.A

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f24801a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f24802b;

            {
                this.f24801a = i8;
                this.f24802b = this;
            }

            public final Object invoke(Object obj) throws JSONException {
                VipUserInfo vipInfo;
                VipUserInfo vipInfo2;
                VipUserInfo vipInfo3;
                switch (this.f24801a) {
                    case 0:
                        Vp0.b.c((VerticalLargeCoverV9Holder) this.f24802b);
                        break;
                    case 1:
                        break;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        bool.booleanValue();
                        ((LiveRoomInteractionViewModel) this.f24802b).G.setValue(bool);
                        break;
                    case 3:
                        ((rW0.b) this.f24802b).injectMembers((MallVDPlayerQualitySwitchWidget) obj);
                        break;
                    case 4:
                        BuyerFragment buyerFragment = (BuyerFragment) this.f24802b;
                        buyerFragment.getClass();
                        BLog.d("MallVideoCall", "remoteJoin");
                        View view = (View) ((VideoCallFragment) buyerFragment).n.getValue();
                        if (view != null) {
                            view.setVisibility(8);
                        }
                        View view2 = (View) buyerFragment.L.getValue();
                        if (view2 != null) {
                            view2.setVisibility(8);
                        }
                        qQ0.b bVar = ((VideoCallFragment) buyerFragment).d;
                        if (bVar != null) {
                            bVar.I0();
                        }
                        break;
                    case 5:
                        JSONObject jSONObject = (JSONObject) obj;
                        AccountInfo accountInfo = (AccountInfo) this.f24802b;
                        jSONObject.put("vipType", (accountInfo == null || (vipInfo3 = accountInfo.getVipInfo()) == null) ? null : Integer.valueOf(vipInfo3.getVipType()));
                        jSONObject.put("vipStatus", (accountInfo == null || (vipInfo2 = accountInfo.getVipInfo()) == null) ? null : Integer.valueOf(vipInfo2.getVipStatus()));
                        jSONObject.put("vipDueDate", (accountInfo == null || (vipInfo = accountInfo.getVipInfo()) == null) ? null : Long.valueOf(vipInfo.getEndTime()));
                        Integer numValueOf = null;
                        if (accountInfo != null) {
                            VipUserInfo vipInfo4 = accountInfo.getVipInfo();
                            numValueOf = null;
                            if (vipInfo4 != null) {
                                numValueOf = Integer.valueOf(vipInfo4.getThemeType());
                            }
                        }
                        jSONObject.put("theme", numValueOf);
                        break;
                    default:
                        ((GraphicsLayerScope) obj).setAlpha(((Number) ((State) this.f24802b).getValue()).floatValue());
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        fVar.addOnDetachListener(this.f78958r);
        InlineTask inlineToastTask = new InlineToastTask(fVar);
        InlineTask inlineTask2 = fVar.f29027r;
        if (inlineTask2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
            inlineTask2 = null;
        }
        InlineTask inlineTask3 = fVar.f29026q;
        if (inlineTask3 != null) {
            inlineTask = inlineTask3;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("seekGuideWidget");
        }
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{inlineTask2, inlineTask, inlineToastTask})).execute();
    }

    public final void onScrollStateChanged(int i7) {
        f fVar;
        super/*Z7.c*/.onScrollStateChanged(i7);
        if (i7 != 1 || (fVar = (f) this.f24837f) == null) {
            return;
        }
        fVar.showWidgets();
    }

    @Override // Up0.C2912a
    public final void q0(@Nullable View view) {
        view.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPlaySpeed(float f7) {
        ICardPlayerContext cardPlayerContext;
        PromoToast.showMidToast(this.itemView.getContext(), f7 + "X");
        f fVar = (f) this.f24837f;
        if (fVar == null || (cardPlayerContext = fVar.getCardPlayerContext()) == null) {
            return;
        }
        cardPlayerContext.setPlaySpeed(f7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InlineGestureSeekBarContainer t0() {
        this.f78951k.setVisibility(0);
        x.a aVar = x.f78893a;
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerFindViewById = this.itemView.findViewById(2131303684);
        VerticalLargeCoverV9Item verticalLargeCoverV9Item = (VerticalLargeCoverV9Item) getData();
        inlineGestureSeekBarContainerFindViewById.setProgressBarData(verticalLargeCoverV9Item != null ? verticalLargeCoverV9Item.inlineProgressBar : null);
        return inlineGestureSeekBarContainerFindViewById;
    }
}
