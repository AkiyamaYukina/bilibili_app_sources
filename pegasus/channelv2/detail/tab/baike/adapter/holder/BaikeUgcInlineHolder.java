package com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.holder;

import EJ.f;
import OH.e;
import Pb1.n;
import W.d;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.compose.foundation.N;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.LikeButtonItemV2;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineUGCHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineFullScreenWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.utils.ListConstKt;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.restrict.RestrictedMode;
import com.bilibili.app.comm.restrict.RestrictedType;
import com.bilibili.biligame.api.BiligameHotComment;
import com.bilibili.biligame.report.ReportHelper;
import com.bilibili.biligame.router.BiligameRouterHelper;
import com.bilibili.biligame.ui.comment.hot.HotCommentListFragment;
import com.bilibili.bplus.followingpublish.fragments.BasePublishFragmentV2;
import com.bilibili.bplus.followingpublish.fragments.share.ShareFragmentV2;
import com.bilibili.column.ui.manager.draft.D;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;
import com.bilibili.inline.plugin.DefaultCardPlayBehaviorWrap;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.fasthybrid.biz.debug.s;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.Avatar;
import com.bilibili.pegasus.api.modelv2.BasePlayerItem;
import com.bilibili.pegasus.card.base.H;
import com.bilibili.pegasus.card.base.clickprocessors.g;
import com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeViewModel;
import com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.holder.BaikeUgcInlineHolder;
import com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.model.ChannelLargeCoverSingleV9Item;
import com.bilibili.pegasus.channelv2.detail.tab.baike.inline.ChannelBaikeInlineMuteWidget;
import com.bilibili.pegasus.channelv2.detail.tab.baike.inline.k;
import com.bilibili.pegasus.utils.o;
import com.bilibili.pegasus.utils.x;
import com.bilibili.pegasus.utils.z;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import com.bilibili.teenagersmode.TeenagersMode;
import com.bilibili.upper.module.contribute.up.dialog.UpperSimpleDialogFragment;
import com.mall.data.page.collect.workshop.bean.MallWorkShopGoodBean;
import com.mall.ui.page.collect.workshop.MallWorkShopFragment;
import com.mall.ui.page.ip.view.IPFragmentV2;
import do0.j;
import do0.m;
import eo0.AbstractC6962a;
import gl.u;
import gl.v;
import go0.C7367e;
import go0.C7368f;
import go0.C7369g;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.auth.helper.SceneType;
import tv.danmaku.bili.auth.modify.BiliAuthModifyOriginalPersonFragment;
import tv.danmaku.bili.auth.modify.BiliAuthModifyPersonFragment;
import tv.danmaku.bili.ui.main2.W;
import tv.danmaku.bili.widget.PendantAvatarFrameLayout;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/adapter/holder/BaikeUgcInlineHolder.class */
@StabilityInferred(parameters = 0)
public final class BaikeUgcInlineHolder extends j<ChannelLargeCoverSingleV9Item, v, k> implements g<ChannelLargeCoverSingleV9Item>, m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f75121s = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ViewStub f75122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ViewStub f75123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f75124k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f75125l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f75126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final a f75127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.channelv2.detail.tab.baike.inline.g f75128o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final d f75129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final N f75130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final b f75131r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/adapter/holder/BaikeUgcInlineHolder$a.class */
    public static final class a implements o.a<ChannelLargeCoverSingleV9Item> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaikeUgcInlineHolder f75132a;

        public a(BaikeUgcInlineHolder baikeUgcInlineHolder) {
            this.f75132a = baikeUgcInlineHolder;
        }

        @Override // com.bilibili.pegasus.utils.o.a
        public final void a() {
            LikeButtonItemV2 likeButtonItemV2;
            BaikeUgcInlineHolder baikeUgcInlineHolder = this.f75132a;
            ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item = (ChannelLargeCoverSingleV9Item) baikeUgcInlineHolder.getData();
            if (channelLargeCoverSingleV9Item == null || (likeButtonItemV2 = ((BasePlayerItem) channelLargeCoverSingleV9Item).likeButton) == null || likeButtonItemV2.isSelected()) {
                return;
            }
            z.f(baikeUgcInlineHolder.t0(), likeButtonItemV2, (BasicIndexItem) baikeUgcInlineHolder.getData(), 4);
        }

        @Override // com.bilibili.pegasus.utils.o.a
        public final /* bridge */ /* synthetic */ void b(ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item) {
        }

        @Override // com.bilibili.pegasus.utils.o.a
        public final void c(ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item) {
            C7369g.e(this.f75132a, IVideoLikeRouteService.ACTION_TRIPLE_LIKE);
        }

        @Override // com.bilibili.pegasus.utils.o.a
        public final void d(ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item) {
            com.bilibili.pegasus.channelv2.detail.tab.baike.inline.g gVar;
            LikeButtonItemV2 likeButtonItemV2;
            LikeButtonItemV2 likeButtonItemV22;
            BaikeUgcInlineHolder baikeUgcInlineHolder = this.f75132a;
            ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item2 = (ChannelLargeCoverSingleV9Item) baikeUgcInlineHolder.getData();
            if (channelLargeCoverSingleV9Item2 == null || channelLargeCoverSingleV9Item.getAid() != channelLargeCoverSingleV9Item2.getAid()) {
                return;
            }
            z zVarT0 = baikeUgcInlineHolder.t0();
            ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item3 = (ChannelLargeCoverSingleV9Item) baikeUgcInlineHolder.getData();
            boolean zIsSelected = (channelLargeCoverSingleV9Item3 == null || (likeButtonItemV22 = ((BasePlayerItem) channelLargeCoverSingleV9Item3).likeButton) == null) ? false : likeButtonItemV22.isSelected();
            ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item4 = (ChannelLargeCoverSingleV9Item) baikeUgcInlineHolder.getData();
            zVarT0.e((channelLargeCoverSingleV9Item4 == null || (likeButtonItemV2 = ((BasePlayerItem) channelLargeCoverSingleV9Item4).likeButton) == null) ? null : likeButtonItemV2.getFormatCount(), zIsSelected);
            long aid = channelLargeCoverSingleV9Item.getAid();
            ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item5 = (ChannelLargeCoverSingleV9Item) baikeUgcInlineHolder.getData();
            if (channelLargeCoverSingleV9Item5 == null || aid != channelLargeCoverSingleV9Item5.getAid() || (gVar = baikeUgcInlineHolder.f75128o) == null) {
                return;
            }
            gVar.updateRepositoryData(channelLargeCoverSingleV9Item5);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/adapter/holder/BaikeUgcInlineHolder$b.class */
    public static final class b implements PanelDetachListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaikeUgcInlineHolder f75133a;

        public b(BaikeUgcInlineHolder baikeUgcInlineHolder) {
            this.f75133a = baikeUgcInlineHolder;
        }

        public final void onDetach(InlinePanel inlinePanel) {
            InlineGestureSeekBarContainer inlineGestureSeekBarContainerS0 = this.f75133a.s0();
            inlineGestureSeekBarContainerS0.resetProgress();
            inlineGestureSeekBarContainerS0.setVisibility(8);
            inlinePanel.removeOnDetachListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaikeUgcInlineHolder(@NotNull final v vVar) {
        super(vVar);
        x.a aVar = x.f78893a;
        this.f75122i = (ViewStub) this.itemView.findViewById(2131299661);
        this.f75123j = (ViewStub) this.itemView.findViewById(2131303685);
        this.f75124k = ListExtentionsKt.lazyUnsafe(new Function0(this, vVar) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.holder.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BaikeUgcInlineHolder f75134a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final v f75135b;

            {
                this.f75134a = this;
                this.f75135b = vVar;
            }

            public final Object invoke() {
                x.a aVar2 = x.f78893a;
                g gVar = this.f75134a;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) gVar.itemView.findViewById(2131315642);
                u uVar = this.f75135b.c;
                TintImageView tintImageView = uVar.f;
                C7368f c7368f = new C7368f(gVar);
                BaikeUgcInlineHolder$mInlineLikeButtonHelper$2$1 baikeUgcInlineHolder$mInlineLikeButtonHelper$2$1 = new BaikeUgcInlineHolder$mInlineLikeButtonHelper$2$1(gVar);
                Fragment fragment = gVar.f116549b;
                return new z(lottieAnimationView, tintImageView, uVar.g, c7368f, baikeUgcInlineHolder$mInlineLikeButtonHelper$2$1, fragment != null ? fragment.getLifecycle() : null);
            }
        });
        this.f75125l = ListExtentionsKt.lazyUnsafe(new e(this, 6));
        this.f75126m = ListExtentionsKt.lazyUnsafe(new cJ.u(this, 3));
        this.f75127n = new a(this);
        this.f75129p = new d(this, 4);
        this.f75130q = new N(this, 4);
        final int i7 = 4;
        this.itemView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: HG0.B1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f8414a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f8415b;

            {
                this.f8414a = i7;
                this.f8415b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.bilibili.upper.module.manuscript.activity.q qVar;
                switch (this.f8414a) {
                    case 0:
                        UpperSimpleDialogFragment upperSimpleDialogFragment = (UpperSimpleDialogFragment) this.f8415b;
                        UpperSimpleDialogFragment.a aVar2 = upperSimpleDialogFragment.b;
                        if (aVar2 != null && (qVar = aVar2.a) != null) {
                            qVar.invoke(upperSimpleDialogFragment);
                            break;
                        }
                        break;
                    case 1:
                        HotCommentListFragment hotCommentListFragment = (HotCommentListFragment) this.f8415b;
                        BiligameHotComment biligameHotComment = (BiligameHotComment) view.getTag();
                        ReportHelper.getHelperInstance(hotCommentListFragment.getContext()).setGadata(hotCommentListFragment.kf() ? "1145902" : "1410102").setModule(hotCommentListFragment.kf() ? "track-ng-nb2-detail" : "track-detail").setValue(String.valueOf(biligameHotComment.gameBaseId)).clickReport();
                        BiligameRouterHelper.openCommentDetail(hotCommentListFragment.getContext(), String.valueOf(biligameHotComment.gameBaseId), biligameHotComment.commentNo, Boolean.TRUE);
                        break;
                    case 2:
                        ((com.bilibili.ad.adview.videodetail.relate.card_play_page.c) this.f8415b).h0();
                        break;
                    case 3:
                        ((IPFragmentV2) this.f8415b).vf();
                        break;
                    case 4:
                        C7367e.c((BaikeUgcInlineHolder) this.f8415b, false, 3);
                        break;
                    default:
                        BiliAuthModifyPersonFragment biliAuthModifyPersonFragment = (BiliAuthModifyPersonFragment) this.f8415b;
                        CheckBox checkBox = biliAuthModifyPersonFragment.w;
                        if (checkBox != null) {
                            checkBox.setChecked(!checkBox.isChecked());
                            boolean zIsChecked = checkBox.isChecked();
                            biliAuthModifyPersonFragment.y = zIsChecked;
                            View view2 = biliAuthModifyPersonFragment.u;
                            if (view2 != null) {
                                view2.setEnabled(zIsChecked);
                            }
                        }
                        break;
                }
            }
        });
        final int i8 = 5;
        vVar.b.setOnClickListener(new View.OnClickListener(this, i8) { // from class: HG0.C1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f8421a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f8422b;

            {
                this.f8421a = i8;
                this.f8422b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:59:0x01c8  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r8) {
                /*
                    Method dump skipped, instruction units count: 834
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: HG0.C1.onClick(android.view.View):void");
            }
        });
        u uVar = vVar.c;
        uVar.h.setOnClickListener(new Ap.a(this, 5));
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener(this) { // from class: do0.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BaikeUgcInlineHolder f116547a;

            {
                this.f116547a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C7367e.b(this.f116547a);
                return true;
            }
        };
        uVar.h.setOnLongClickListener(onLongClickListener);
        vVar.b.setOnLongClickListener(onLongClickListener);
        this.itemView.setOnLongClickListener(onLongClickListener);
        q0().setOnLongClickListener(onLongClickListener);
        this.f75131r = new b(this);
    }

    public final void a(boolean z6) {
        IInlineControl iInlineControl;
        ICardPlayerContext cardPlayerContext;
        if (z6) {
            k kVar = (k) this.f116553e;
            if (((kVar == null || (cardPlayerContext = kVar.getCardPlayerContext()) == null) ? null : cardPlayerContext.getVideoEnvironment()) == VideoEnvironment.MOBILE_DATA) {
                PlayReason playReason = PlayReason.INLINE_MANUAL_PLAY;
                ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item = (ChannelLargeCoverSingleV9Item) getData();
                PlayReason playReason2 = null;
                if (channelLargeCoverSingleV9Item != null) {
                    IInlineProperty cardPlayProperty = channelLargeCoverSingleV9Item.getCardPlayProperty();
                    playReason2 = null;
                    if (cardPlayProperty != null) {
                        playReason2 = cardPlayProperty.getPlayReason();
                    }
                }
                if (playReason == playReason2 || (iInlineControl = this.f116552d) == null) {
                    return;
                }
                iInlineControl.stopPlay(this);
            }
        }
    }

    public final void c(long j7, boolean z6) {
        ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item = (ChannelLargeCoverSingleV9Item) getData();
        if (channelLargeCoverSingleV9Item != null && j7 == channelLargeCoverSingleV9Item.getAid()) {
            channelLargeCoverSingleV9Item.setFavorite(z6);
        }
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineUGCHistoryServiceV2) this.f75125l.getValue());
        InlineExtensionKt.addInlineBehavior(cardPlayTask, (DefaultCardPlayBehaviorWrap) this.f75126m.getValue());
        H.b(cardPlayTask, z6);
        cardPlayTask.setChronosEnable(true);
        ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item = (ChannelLargeCoverSingleV9Item) getData();
        if (channelLargeCoverSingleV9Item != null) {
            com.bilibili.pegasus.channelv2.detail.tab.baike.inline.g gVar = new com.bilibili.pegasus.channelv2.detail.tab.baike.inline.g(channelLargeCoverSingleV9Item);
            gVar.setVideoStateCallback(this.f75129p);
            gVar.setFollowStateCallback(this.f75130q);
            cardPlayTask.setTaskRepository(gVar);
            this.f75128o = gVar;
        }
        return cardPlayTask;
    }

    public final boolean d() {
        ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item = (ChannelLargeCoverSingleV9Item) getData();
        boolean z6 = false;
        if (channelLargeCoverSingleV9Item != null) {
            z6 = false;
            if (channelLargeCoverSingleV9Item.shareMenuEnable()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final BasePlayerItem getData() {
        return (ChannelLargeCoverSingleV9Item) getData();
    }

    @NotNull
    public final Class<? extends k> getPanelType() {
        return k.class;
    }

    public final float getPlaySpeed() {
        ICardPlayerContext cardPlayerContext;
        k kVar = (k) this.f116553e;
        return (kVar == null || (cardPlayerContext = kVar.getCardPlayerContext()) == null) ? 1.0f : cardPlayerContext.getPlaySpeed();
    }

    public final int getPlayerState() {
        ICardPlayerContext cardPlayerContext;
        k kVar = (k) this.f116553e;
        return (kVar == null || (cardPlayerContext = kVar.getCardPlayerContext()) == null) ? 0 : cardPlayerContext.getPlayerState();
    }

    public final boolean isFavorite() {
        ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item = (ChannelLargeCoverSingleV9Item) getData();
        boolean z6 = false;
        if (channelLargeCoverSingleV9Item != null) {
            z6 = false;
            if (channelLargeCoverSingleV9Item.isFavorite()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // do0.m
    public final long n0() {
        ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item = (ChannelLargeCoverSingleV9Item) getData();
        return channelLargeCoverSingleV9Item != null ? channelLargeCoverSingleV9Item.contentNid : -1L;
    }

    @Override // do0.j
    public final void onBind(int i7, @NotNull List<? extends Object> list) {
        final LikeButtonItemV2 likeButtonItemV2;
        super.onBind(i7, list);
        final ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item = (ChannelLargeCoverSingleV9Item) getData();
        if (channelLargeCoverSingleV9Item == null) {
            return;
        }
        q0().setOnLongClickListener(new View.OnLongClickListener(this) { // from class: do0.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BaikeUgcInlineHolder f116548a;

            {
                this.f116548a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C7367e.b(this.f116548a);
                return true;
            }
        });
        x.g(p0().b, ((BasicIndexItem) channelLargeCoverSingleV9Item).cover, this.f75122i, 8);
        ((DefaultCardPlayBehaviorWrap) this.f75126m.getValue()).reset(this);
        ((InlineUGCHistoryServiceV2) this.f75125l.getValue()).reset(channelLargeCoverSingleV9Item.getUri());
        ListExtentionsKt.setTextWithIcon$default(p0().d.c.b, channelLargeCoverSingleV9Item.coverLeftText1, channelLargeCoverSingleV9Item.coverLeftIcon1, R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setTextWithIcon$default(p0().d.c.c, channelLargeCoverSingleV9Item.coverLeftText2, channelLargeCoverSingleV9Item.coverLeftIcon2, R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setText(p0().d.b, channelLargeCoverSingleV9Item.coverRightText);
        x.j(p0().c.e, channelLargeCoverSingleV9Item.rcmdReasonStyle, ((BasicIndexItem) channelLargeCoverSingleV9Item).title, new D(1, this, channelLargeCoverSingleV9Item), channelLargeCoverSingleV9Item.storyCardIcon, x.f78893a, 1656);
        x.t(p0().c.b, p0().c.d, channelLargeCoverSingleV9Item.multiplyDesc, channelLargeCoverSingleV9Item.desc);
        ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item2 = (ChannelLargeCoverSingleV9Item) getData();
        if (channelLargeCoverSingleV9Item2 != null) {
            PendantAvatarFrameLayout pendantAvatarFrameLayout = p0().c.c;
            PendantAvatarFrameLayout.ShowParams showParams = new PendantAvatarFrameLayout.ShowParams();
            showParams.mode(1);
            showParams.defaultAvatar(2131237005);
            Avatar avatar = channelLargeCoverSingleV9Item2.avatar;
            showParams.avatarImgUrl(avatar != null ? avatar.cover : null);
            showParams.borderWidth(0.5f);
            showParams.borderColor(R$color.Ga2);
            showParams.mIsBadgeShow = Boolean.TRUE;
            showParams.badgeImgRes(ListConstKt.getIconRes(channelLargeCoverSingleV9Item2.isAtten ? 24 : channelLargeCoverSingleV9Item2.officialIconV2));
            pendantAvatarFrameLayout.show(showParams);
        }
        final int i8 = 0;
        p0().c.c.setOnClickListener(new View.OnClickListener(i8, this, channelLargeCoverSingleV9Item) { // from class: do0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f116539a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f116540b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f116541c;

            {
                this.f116539a = i8;
                this.f116540b = this;
                this.f116541c = channelLargeCoverSingleV9Item;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Uri uri;
                String str;
                switch (this.f116539a) {
                    case 0:
                        com.bilibili.pegasus.card.base.clickprocessors.g gVar = (BaikeUgcInlineHolder) this.f116540b;
                        Avatar avatar2 = ((ChannelLargeCoverSingleV9Item) this.f116541c).getAvatar();
                        Context context = gVar.itemView.getContext();
                        if (!TeenagersMode.getInstance().isEnable() && !RestrictedMode.isEnable(RestrictedType.LESSONS)) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            ChannelBaikeViewModel channelBaikeViewModel = gVar.f116550c;
                            if (channelBaikeViewModel != null) {
                                C7369g.a(channelBaikeViewModel, linkedHashMap);
                            }
                            AbstractC6962a abstractC6962a = (AbstractC6962a) gVar.getData();
                            if (abstractC6962a != null) {
                                C7369g.b(abstractC6962a, linkedHashMap);
                            }
                            Unit unit = Unit.INSTANCE;
                            Neurons.reportClick(false, "traffic.new-channel-detail-baike.inline.head.click", linkedHashMap);
                            if (avatar2 == null || (str = avatar2.uri) == null) {
                                uri = null;
                            } else {
                                x.a aVar = x.f78893a;
                                uri = Uri.parse(str);
                            }
                            Vp0.b.a(uri, context, "traffic.new-channel-detail-baike.0.0", null);
                            break;
                        }
                        break;
                    default:
                        MallWorkShopGoodBean mallWorkShopGoodBean = (MallWorkShopGoodBean) this.f116540b;
                        lR0.i iVar = (lR0.i) this.f116541c;
                        HashMap map = new HashMap(1);
                        String shopHomePageJumpUrl = mallWorkShopGoodBean.getShopHomePageJumpUrl();
                        map.put("jump_url", shopHomePageJumpUrl == null ? "" : shopHomePageJumpUrl);
                        map.put("itemid", String.valueOf(mallWorkShopGoodBean.getItemsId()));
                        map.put("index", String.valueOf(iVar.o));
                        KQ0.e.e(2131831080, map);
                        MallWorkShopFragment mallWorkShopFragment = iVar.n;
                        if (mallWorkShopFragment != null) {
                            mallWorkShopFragment.startPageBySchema(shopHomePageJumpUrl);
                        }
                        break;
                }
            }
        });
        final ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item3 = (ChannelLargeCoverSingleV9Item) getData();
        if (channelLargeCoverSingleV9Item3 != null && (likeButtonItemV2 = ((BasePlayerItem) channelLargeCoverSingleV9Item3).likeButton) != null) {
            t0().c(likeButtonItemV2, channelLargeCoverSingleV9Item3, "traffic.new-channel-detail-baike.0.0", "traffic.new-channel-detail-baike.0.0", "102");
            p0().c.f.setOnClickListener(new View.OnClickListener(this, likeButtonItemV2, channelLargeCoverSingleV9Item3) { // from class: do0.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BaikeUgcInlineHolder f116544a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final LikeButtonItemV2 f116545b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final ChannelLargeCoverSingleV9Item f116546c;

                {
                    this.f116544a = this;
                    this.f116545b = likeButtonItemV2;
                    this.f116546c = channelLargeCoverSingleV9Item3;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaikeUgcInlineHolder baikeUgcInlineHolder = this.f116544a;
                    z.f(baikeUgcInlineHolder.t0(), this.f116545b, this.f116546c, 4);
                }
            });
        }
        z zVarT0 = t0();
        LikeButtonItemV2 likeButtonItemV22 = ((BasePlayerItem) channelLargeCoverSingleV9Item).likeButton;
        boolean zIsSelected = likeButtonItemV22 != null ? likeButtonItemV22.isSelected() : false;
        LikeButtonItemV2 likeButtonItemV23 = ((BasePlayerItem) channelLargeCoverSingleV9Item).likeButton;
        String formatCount = null;
        if (likeButtonItemV23 != null) {
            formatCount = likeButtonItemV23.getFormatCount();
        }
        zVarT0.e(formatCount, zIsSelected);
        new o(channelLargeCoverSingleV9Item, p0().e, p0().c.f).f78879d = this.f75127n;
        p0().c.h.setVisibility(0);
        ListPlaceHolderImageView listPlaceHolderImageView = p0().b;
        PlayerArgs playerArgs = ((BasicIndexItem) channelLargeCoverSingleV9Item).playerArgs;
        boolean z6 = false;
        if (playerArgs != null) {
            z6 = playerArgs.hidePlayButton;
        }
        listPlaceHolderImageView.showPlaceHolderInnerDrawable(z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBindPanel(InlinePanel inlinePanel) {
        k kVar = (k) inlinePanel;
        r0(kVar);
        ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item = (ChannelLargeCoverSingleV9Item) getData();
        if (channelLargeCoverSingleV9Item == null) {
            return;
        }
        ChannelBaikeInlineMuteWidget channelBaikeInlineMuteWidget = kVar.f75165l;
        if (channelBaikeInlineMuteWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            channelBaikeInlineMuteWidget = null;
        }
        channelBaikeInlineMuteWidget.setOnWidgetClickListener(new f(this, 3));
        kVar.getDanmaku().setOnWidgetClickListener(new s(this, 1));
        kVar.getGestureSeekWidget().setSeekReportListener(new com.bilibili.bilibililive.streaming.pandora.core.whip.d(this));
        kVar.getDanmaku().setVisible(!((BasePlayerItem) channelLargeCoverSingleV9Item).hideDanmakuSwitch);
        kVar.getDanmaku().setVisibility(ListExtentionsKt.toVisibility(!((BasePlayerItem) channelLargeCoverSingleV9Item).hideDanmakuSwitch));
        VectorTextView vectorTextView = kVar.f75162i;
        if (vectorTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            vectorTextView = null;
        }
        H.c(vectorTextView, channelLargeCoverSingleV9Item.coverLeftText1, channelLargeCoverSingleV9Item.coverLeftIcon1);
        VectorTextView vectorTextView2 = kVar.f75163j;
        if (vectorTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            vectorTextView2 = null;
        }
        H.c(vectorTextView2, channelLargeCoverSingleV9Item.coverLeftText2, channelLargeCoverSingleV9Item.coverLeftIcon2);
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerS0 = s0();
        inlineGestureSeekBarContainerS0.setVisibility(0);
        inlineGestureSeekBarContainerS0.resetProgress();
        kVar.getGestureSeekWidget().setGestureSeekBarContainer(inlineGestureSeekBarContainerS0);
        InlineFullScreenWidgetV3 inlineFullScreenWidgetV3 = kVar.f75164k;
        if (inlineFullScreenWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fullScreen");
            inlineFullScreenWidgetV3 = null;
        }
        inlineFullScreenWidgetV3.setVisible(H.a());
        InlineFullScreenWidgetV3 inlineFullScreenWidgetV32 = kVar.f75164k;
        if (inlineFullScreenWidgetV32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fullScreen");
            inlineFullScreenWidgetV32 = null;
        }
        inlineFullScreenWidgetV32.setVisibility(ListExtentionsKt.toVisibility(H.a()));
        if (H.a()) {
            ImageView imageView = kVar.f75164k;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fullScreen");
                imageView = null;
            }
            final int i7 = 0;
            imageView.setOnClickListener(new View.OnClickListener(i7, this) { // from class: do0.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f116542a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final LifecycleOwner f116543b;

                {
                    this.f116542a = i7;
                    this.f116543b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckBox checkBox;
                    switch (this.f116542a) {
                        case 0:
                            C7367e.c((BaikeUgcInlineHolder) this.f116543b, true, 2);
                            break;
                        case 1:
                            ShareFragmentV2 shareFragmentV2 = this.f116543b;
                            int i8 = ShareFragmentV2.b2;
                            View view2 = ((BasePublishFragmentV2) shareFragmentV2).p;
                            if (view2 != null && (checkBox = (CheckBox) view2.findViewById(2131312797)) != null && !checkBox.isEnabled()) {
                                com.bilibili.bplus.followingcard.trace.c.f("share", "comment-item.0.click", W.a(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, "share", ThirdPartyExtraBuilder.KEY_RESULT, "0"));
                                break;
                            }
                            break;
                        case 2:
                            BiliAuthModifyOriginalPersonFragment biliAuthModifyOriginalPersonFragment = this.f116543b;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            long j7 = jCurrentTimeMillis - Qb1.b.a;
                            if (1 > j7 || j7 >= 500) {
                                Qb1.b.a = jCurrentTimeMillis;
                                Pb1.m mVar = biliAuthModifyOriginalPersonFragment.A;
                                if (mVar != null) {
                                    mVar.h = biliAuthModifyOriginalPersonFragment;
                                }
                                if (!biliAuthModifyOriginalPersonFragment.w) {
                                    biliAuthModifyOriginalPersonFragment.w = true;
                                    if (mVar != null) {
                                        mVar.e = false;
                                        mVar.e(new n(biliAuthModifyOriginalPersonFragment.x, biliAuthModifyOriginalPersonFragment.y, "realnameVerify", SceneType.REALNAMEVERIFY, biliAuthModifyOriginalPersonFragment.rf()), biliAuthModifyOriginalPersonFragment.nf());
                                    }
                                }
                            }
                            break;
                        default:
                            this.f116543b.finishAttachedActivity();
                            break;
                    }
                }
            });
        }
        kVar.setOnClickListener(new Fp.b(this, 6));
        kVar.setOnLongClickListener(new com.bilibili.bililive.room.ui.roommanager.j(this, 3));
        kVar.addOnDetachListener(this.f75131r);
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineToastTask(kVar))).execute();
    }

    public final void onScrollStateChanged(int i7) {
        k kVar;
        super/*Z7.c*/.onScrollStateChanged(i7);
        if (i7 != 1 || (kVar = (k) this.f116553e) == null) {
            return;
        }
        kVar.showWidgets();
    }

    @Override // do0.m
    public final long r() {
        ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item = (ChannelLargeCoverSingleV9Item) getData();
        return channelLargeCoverSingleV9Item != null ? channelLargeCoverSingleV9Item.navNid : -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InlineGestureSeekBarContainer s0() {
        this.f75123j.setVisibility(0);
        x.a aVar = x.f78893a;
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerFindViewById = this.itemView.findViewById(2131303684);
        ChannelLargeCoverSingleV9Item channelLargeCoverSingleV9Item = (ChannelLargeCoverSingleV9Item) getData();
        inlineGestureSeekBarContainerFindViewById.setProgressBarData(channelLargeCoverSingleV9Item != null ? channelLargeCoverSingleV9Item.inlineProgressBar : null);
        return inlineGestureSeekBarContainerFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPlaySpeed(float f7) {
        ICardPlayerContext cardPlayerContext;
        PromoToast.showMidToast(this.itemView.getContext(), f7 + "X");
        k kVar = (k) this.f116553e;
        if (kVar == null || (cardPlayerContext = kVar.getCardPlayerContext()) == null) {
            return;
        }
        cardPlayerContext.setPlaySpeed(f7);
    }

    public final z t0() {
        return (z) this.f75124k.getValue();
    }
}
