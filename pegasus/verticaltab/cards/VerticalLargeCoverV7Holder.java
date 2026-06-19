package com.bilibili.pegasus.verticaltab.cards;

import Fe1.G;
import I90.j;
import Up0.AbstractC2919h;
import Up0.o;
import Up0.p;
import Up0.r;
import Up0.u;
import Yp0.d;
import Zg0.C3174a;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.bapis.bilibili.dynamic.common.UpPermissionType;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.LikeButtonItemV2;
import com.bilibili.app.comm.list.common.data.PlayerWidget;
import com.bilibili.app.comm.list.common.inline.ListOgvCardPlayBehaviorWrap;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineOGVHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineAvatarWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineMuteWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.image.TintBadgeView;
import com.bilibili.app.comm.list.widget.inline.IInlinePlayBehavior;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.biligame.api.bean.gamedetail.RecommendComment;
import com.bilibili.biligame.ui.comment.tab.CommentTabFragment;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import com.bilibili.bililive.room.ui.roomv3.tab.interaction.LiveRoomInteractionViewModel;
import com.bilibili.bililive.videoliveplayer.danmupool.DanmuPoolCallback;
import com.bilibili.bililive.videoliveplayer.danmupool.LiveDanmuController;
import com.bilibili.bililive.videoliveplayer.danmupool.config.DanmuSpeedChangeData;
import com.bilibili.bililive.videoliveplayer.net.beans.gateway.roominfo.BiliLiveRoomInfo;
import com.bilibili.bplus.followingcard.api.entity.publish.PermissionInfo;
import com.bilibili.freedata.storage.storagers.ActiveInfoStorageV3;
import com.bilibili.gripper.api.ad.core.report.ExtraParams;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.biz.repository.FollowStateMessage;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.Avatar;
import com.bilibili.pegasus.api.modelv2.BasePlayerItem;
import com.bilibili.pegasus.api.modelv2.Tag;
import com.bilibili.pegasus.api.modelv2.UpArgs;
import com.bilibili.pegasus.card.base.H;
import com.bilibili.pegasus.card.base.clickprocessors.g;
import com.bilibili.pegasus.utils.I;
import com.bilibili.pegasus.utils.x;
import com.bilibili.pegasus.utils.z;
import com.bilibili.pegasus.verticaltab.VerticalTabFragment;
import com.bilibili.pegasus.verticaltab.api.model.VerticalLargeCoverV7Item;
import com.bilibili.pegasus.verticaltab.cards.VerticalLargeCoverV7Holder;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import com.bilibili.ship.theseus.ogv.intro.download.ui.c0;
import com.bilibili.studio.material.util.UtilsKt;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.mall.ui.page.home.adapter.holder.f0;
import com.mall.videodetail.vd.mall.comment.purchase.MallPurchaseCommentErrorAndEmptyView;
import gl.E;
import gl.t;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/cards/VerticalLargeCoverV7Holder.class */
@StabilityInferred(parameters = 0)
public final class VerticalLargeCoverV7Holder extends AbstractC2919h<VerticalLargeCoverV7Item, E, d> implements g<VerticalLargeCoverV7Item>, IInlinePlayBehavior {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f78939s = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ViewStub f78940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ViewStub f78941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewStub f78942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f78943m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f78944n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f78945o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Ep0.a f78946p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final j f78947q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final r f78948r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [Up0.r] */
    public VerticalLargeCoverV7Holder(@NotNull final E e7) {
        super(e7);
        x.a aVar = x.f78893a;
        this.f78940j = (ViewStub) this.itemView.findViewById(2131299661);
        this.f78941k = (ViewStub) this.itemView.findViewById(2131303685);
        this.f78942l = (ViewStub) this.itemView.findViewById(2131308192);
        this.f78943m = ListExtentionsKt.lazyUnsafe(new Function0(this, e7) { // from class: com.bilibili.pegasus.verticaltab.cards.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VerticalLargeCoverV7Holder f78960a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final E f78961b;

            {
                this.f78960a = this;
                this.f78961b = e7;
            }

            public final Object invoke() {
                x.a aVar2 = x.f78893a;
                IInlinePlayBehavior iInlinePlayBehavior = this.f78960a;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) iInlinePlayBehavior.itemView.findViewById(2131308211);
                t tVar = this.f78961b.c;
                TintImageView tintImageView = tVar.e;
                I i7 = new I(iInlinePlayBehavior);
                VerticalLargeCoverV7Holder$mInlineLikeButtonHelper$2$1 verticalLargeCoverV7Holder$mInlineLikeButtonHelper$2$1 = new VerticalLargeCoverV7Holder$mInlineLikeButtonHelper$2$1(iInlinePlayBehavior);
                VerticalTabFragment verticalTabFragment = iInlinePlayBehavior.f24825b;
                return new z(lottieAnimationView, tintImageView, tVar.f, i7, verticalLargeCoverV7Holder$mInlineLikeButtonHelper$2$1, verticalTabFragment != null ? verticalTabFragment.getLifecycle() : null);
            }
        });
        this.f78944n = ListExtentionsKt.lazyUnsafe(new p(this, 0));
        final int i7 = 0;
        this.f78945o = ListExtentionsKt.lazyUnsafe(new Function0(this, i7) { // from class: Up0.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f24864a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f24865b;

            {
                this.f24864a = i7;
                this.f24865b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object invoke() {
                switch (this.f24864a) {
                    case 0:
                        VerticalLargeCoverV7Holder verticalLargeCoverV7Holder = (VerticalLargeCoverV7Holder) this.f24865b;
                        IInlineControl iInlineControl = verticalLargeCoverV7Holder.f24836e;
                        VerticalLargeCoverV7Item verticalLargeCoverV7Item = (VerticalLargeCoverV7Item) verticalLargeCoverV7Holder.getData();
                        return new ListOgvCardPlayBehaviorWrap(verticalLargeCoverV7Holder, iInlineControl, (verticalLargeCoverV7Item != null ? verticalLargeCoverV7Item.playerWidget : null) != null);
                    case 1:
                        View view = (View) this.f24865b;
                        View viewFindViewById = view.findViewById(2131310472);
                        if (viewFindViewById != null) {
                            return viewFindViewById;
                        }
                        throw new IllegalStateException(("View with id 2131310472 not found in " + view + UtilsKt.DOT).toString());
                    case 2:
                        return new ActiveInfoStorageV3((Context) this.f24865b, "active-info-unicom-auto-v3");
                    case 3:
                        c0 c0Var = (c0) this.f24865b;
                        c0Var.f92541d.invoke(c0Var);
                        return Unit.INSTANCE;
                    case 4:
                        return ((f0) this.f24865b).itemView.findViewById(2131306380);
                    case 5:
                        return (PermissionInfo) CollectionsKt.getOrNull(((jT.a) this.f24865b).a(CollectionsKt.arrayListOf(new UpPermissionType[]{UpPermissionType.UP_PERMISSION_TYPE_COMMERCIAL})), 0);
                    default:
                        ((MutableState) this.f24865b).setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        return Unit.INSTANCE;
                }
            }
        });
        this.f78947q = new j(this, 1);
        final int i8 = 0;
        this.f78948r = new Function1(this, i8) { // from class: Up0.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f24866a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f24867b;

            {
                this.f24866a = i8;
                this.f24867b = this;
            }

            public final Object invoke(Object obj) {
                UpArgs upArgs;
                switch (this.f24866a) {
                    case 0:
                        FollowStateMessage followStateMessage = (FollowStateMessage) obj;
                        VerticalLargeCoverV7Holder verticalLargeCoverV7Holder = (VerticalLargeCoverV7Holder) this.f24867b;
                        VerticalLargeCoverV7Item verticalLargeCoverV7Item = (VerticalLargeCoverV7Item) verticalLargeCoverV7Holder.getData();
                        if (verticalLargeCoverV7Item != null && (upArgs = ((BasicIndexItem) verticalLargeCoverV7Item).upArgs) != null && followStateMessage.getId().longValue() == upArgs.upId) {
                            verticalLargeCoverV7Item.setInnerFollowingState(0, followStateMessage.getFollowState());
                            Ep0.a aVar2 = verticalLargeCoverV7Holder.f78946p;
                            if (aVar2 != null) {
                                aVar2.updateRepositoryData(verticalLargeCoverV7Item);
                            }
                        }
                        break;
                    case 1:
                        ExtraParams extraParams = (ExtraParams) obj;
                        Function0 function0 = ((Za.h) this.f24867b).b.A;
                        extraParams.ACTION_PROGRESS_TIME(function0 != null ? ((Number) function0.invoke()).intValue() : 0);
                        break;
                    case 2:
                        RecommendComment recommendComment = (RecommendComment) obj;
                        String str = recommendComment != null ? recommendComment.commentNo : null;
                        ((CommentTabFragment) this.f24867b).u = str == null || str.length() == 0;
                        break;
                    case 3:
                        ((LiveRoomInteractionViewModel) this.f24867b).E.setValue((Pair) obj);
                        break;
                    default:
                        nU0.i iVar = (nU0.i) this.f24867b;
                        iVar.b.i = false;
                        iVar.a((C3174a) obj);
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i9 = 0;
        this.itemView.setOnClickListener(new View.OnClickListener(i9, this) { // from class: Up0.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f24868a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LifecycleOwner f24869b;

            {
                this.f24868a = i9;
                this.f24869b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f24868a) {
                    case 0:
                        Vp0.b.d((VerticalLargeCoverV7Holder) this.f24869b, false, false, 3);
                        break;
                    default:
                        com.mall.videodetail.vd.united.page.videoquality.w wVar = this.f24869b;
                        wVar.f.hideWidget(wVar.getToken());
                        BLRouter.routeTo(RouteRequestKt.toRouteRequest(Uri.parse(wVar.i)), wVar.getMContext());
                        wVar.e.report(new NeuronsEvents.NormalEvent("player.player.hdr-intro.sample-click.player", new String[0]));
                        break;
                }
            }
        });
        ListPlaceHolderImageView listPlaceHolderImageView = e7.b;
        listPlaceHolderImageView.setOnClickListener(new View.OnClickListener(this) { // from class: Up0.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VerticalLargeCoverV7Holder f24870a;

            {
                this.f24870a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r6) {
                /*
                    r5 = this;
                    r0 = r5
                    com.bilibili.pegasus.verticaltab.cards.VerticalLargeCoverV7Holder r0 = r0.f24870a
                    r8 = r0
                    r0 = r8
                    java.lang.Object r0 = r0.getData()
                    com.bilibili.pegasus.verticaltab.api.model.VerticalLargeCoverV7Item r0 = (com.bilibili.pegasus.verticaltab.api.model.VerticalLargeCoverV7Item) r0
                    r6 = r0
                    r0 = r6
                    if (r0 == 0) goto L46
                    r0 = r6
                    boolean r0 = r0.isPreview()
                    r1 = 1
                    if (r0 != r1) goto L46
                    r0 = r8
                    java.lang.Object r0 = r0.getData()
                    com.bilibili.pegasus.verticaltab.api.model.VerticalLargeCoverV7Item r0 = (com.bilibili.pegasus.verticaltab.api.model.VerticalLargeCoverV7Item) r0
                    r6 = r0
                    r0 = r6
                    if (r0 == 0) goto L38
                    r0 = r6
                    com.bilibili.inline.card.IInlineProperty r0 = r0.internalInlineProperty
                    r6 = r0
                    r0 = r6
                    if (r0 == 0) goto L38
                    r0 = r6
                    com.bilibili.inline.card.CardPlayState r0 = r0.getState()
                    r6 = r0
                    goto L3a
                L38:
                    r0 = 0
                    r6 = r0
                L3a:
                    r0 = r6
                    com.bilibili.inline.card.CardPlayState r1 = com.bilibili.inline.card.CardPlayState.COMPLETE
                    if (r0 != r1) goto L46
                    r0 = 1
                    r7 = r0
                    goto L48
                L46:
                    r0 = 0
                    r7 = r0
                L48:
                    r0 = r8
                    r1 = 0
                    r2 = r7
                    r3 = 1
                    Vp0.b.d(r0, r1, r2, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Up0.t.onClick(android.view.View):void");
            }
        });
        final int i10 = 0;
        e7.c.g.setOnClickListener(new View.OnClickListener(this, i10) { // from class: Up0.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f24849a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f24850b;

            {
                this.f24849a = i10;
                this.f24850b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f24849a) {
                    case 0:
                        Vp0.b.c((VerticalLargeCoverV7Holder) this.f24850b);
                        break;
                    default:
                        com.mall.videodetail.vd.mall.comment.q qVar = (com.mall.videodetail.vd.mall.comment.q) this.f24850b;
                        int i11 = MallPurchaseCommentErrorAndEmptyView.b;
                        qVar.invoke();
                        break;
                }
            }
        });
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener(this) { // from class: Up0.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VerticalLargeCoverV7Holder f24851a;

            {
                this.f24851a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Vp0.b.c(this.f24851a);
                return true;
            }
        };
        listPlaceHolderImageView.setOnLongClickListener(onLongClickListener);
        this.itemView.setOnLongClickListener(onLongClickListener);
        r0().setOnLongClickListener(onLongClickListener);
    }

    public final void a(boolean z6) {
        IInlineControl iInlineControl;
        ICardPlayerContext cardPlayerContext;
        if (z6) {
            d dVar = (d) this.f24837f;
            if (((dVar == null || (cardPlayerContext = dVar.getCardPlayerContext()) == null) ? null : cardPlayerContext.getVideoEnvironment()) == VideoEnvironment.MOBILE_DATA) {
                PlayReason playReason = PlayReason.INLINE_MANUAL_PLAY;
                VerticalLargeCoverV7Item verticalLargeCoverV7Item = (VerticalLargeCoverV7Item) getData();
                PlayReason playReason2 = null;
                if (verticalLargeCoverV7Item != null) {
                    IInlineProperty cardPlayProperty = verticalLargeCoverV7Item.getCardPlayProperty();
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
        Ep0.a aVar;
        VerticalLargeCoverV7Item verticalLargeCoverV7Item = (VerticalLargeCoverV7Item) getData();
        if (verticalLargeCoverV7Item == null || j7 != verticalLargeCoverV7Item.getAid()) {
            return;
        }
        VerticalLargeCoverV7Item verticalLargeCoverV7Item2 = (VerticalLargeCoverV7Item) getData();
        if (verticalLargeCoverV7Item2 != null) {
            verticalLargeCoverV7Item2.setFavorite(z6);
        }
        VerticalLargeCoverV7Item verticalLargeCoverV7Item3 = (VerticalLargeCoverV7Item) getData();
        if (verticalLargeCoverV7Item3 == null || j7 != verticalLargeCoverV7Item3.getAid() || (aVar = this.f78946p) == null) {
            return;
        }
        aVar.updateRepositoryData(verticalLargeCoverV7Item3);
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        PlayerArgs playerArgs;
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineOGVHistoryServiceV2) this.f78944n.getValue());
        InlineExtensionKt.addInlineBehavior(cardPlayTask, (ListOgvCardPlayBehaviorWrap) this.f78945o.getValue());
        H.b(cardPlayTask, z6);
        VerticalLargeCoverV7Item verticalLargeCoverV7Item = (VerticalLargeCoverV7Item) getData();
        if (verticalLargeCoverV7Item != null && (playerArgs = ((BasicIndexItem) verticalLargeCoverV7Item).playerArgs) != null) {
            cardPlayTask.setCustomFakeDuration(((long) playerArgs.fakeDuration) * 1000);
        }
        cardPlayTask.setChronosEnable(true);
        Ep0.a aVar = new Ep0.a((BasePlayerItem) getData());
        aVar.setVideoStateCallback(this.f78947q);
        aVar.setFollowStateCallback(this.f78948r);
        cardPlayTask.setTaskRepository(aVar);
        this.f78946p = aVar;
        return cardPlayTask;
    }

    public final boolean d() {
        VerticalLargeCoverV7Item verticalLargeCoverV7Item = (VerticalLargeCoverV7Item) getData();
        boolean z6 = false;
        if (verticalLargeCoverV7Item != null) {
            z6 = false;
            if (verticalLargeCoverV7Item.shareMenuEnable()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final BasePlayerItem getData() {
        return (VerticalLargeCoverV7Item) getData();
    }

    @NotNull
    public final Class<d> getPanelType() {
        return d.class;
    }

    public final float getPlaySpeed() {
        ICardPlayerContext cardPlayerContext;
        d dVar = (d) this.f24837f;
        return (dVar == null || (cardPlayerContext = dVar.getCardPlayerContext()) == null) ? -1.0f : cardPlayerContext.getPlaySpeed();
    }

    public final int getPlayerState() {
        ICardPlayerContext cardPlayerContext;
        d dVar = (d) this.f24837f;
        return (dVar == null || (cardPlayerContext = dVar.getCardPlayerContext()) == null) ? 0 : cardPlayerContext.getPlayerState();
    }

    public final boolean isFavorite() {
        VerticalLargeCoverV7Item verticalLargeCoverV7Item = (VerticalLargeCoverV7Item) getData();
        boolean z6 = false;
        if (verticalLargeCoverV7Item != null) {
            z6 = false;
            if (verticalLargeCoverV7Item.isFavorite()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // Up0.AbstractC2919h
    public final void onBind(int i7, @NotNull List<? extends Object> list) {
        final LikeButtonItemV2 likeButtonItemV2;
        super.onBind(i7, list);
        VerticalLargeCoverV7Item verticalLargeCoverV7Item = (VerticalLargeCoverV7Item) getData();
        if (verticalLargeCoverV7Item == null) {
            return;
        }
        x.g(p0().b, ((BasicIndexItem) verticalLargeCoverV7Item).cover, this.f78940j, 8);
        ListExtentionsKt.setTextWithIcon$default(p0().d.c.b, verticalLargeCoverV7Item.coverLeftText1, verticalLargeCoverV7Item.coverLeftIcon1, R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setTextWithIcon$default(p0().d.c.c, verticalLargeCoverV7Item.coverLeftText2, verticalLargeCoverV7Item.coverLeftIcon2, R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setText(p0().d.b, verticalLargeCoverV7Item.coverRightText);
        TagSpanTextView tagSpanTextView = p0().c.d;
        List<Tag> listListOf = CollectionsKt.listOf(new Tag[]{verticalLargeCoverV7Item.commonTag, verticalLargeCoverV7Item.rcmdReasonStyle});
        String str = ((BasicIndexItem) verticalLargeCoverV7Item).title;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        int px = ListExtentionsKt.toPx(6);
        if (x.q(listListOf)) {
            ListExtentionsKt.setText(p0().c.d, ((BasicIndexItem) verticalLargeCoverV7Item).title);
            Unit unit = Unit.INSTANCE;
        } else {
            TagSpanTextView.TagBuilder tagBuilder = tagSpanTextView.tagBuilder();
            tagBuilder.clear();
            for (Tag tag : listListOf) {
                if (tag != null) {
                    int i8 = tag.bgStyle;
                    if (i8 == 1) {
                        tagBuilder.setTagTextSize(tagBuilder.getContext().getResources().getDimensionPixelSize(2131167101));
                        tagBuilder.setTagHeight(tagBuilder.getContext().getResources().getDimensionPixelSize(2131167100));
                    } else if (i8 == 2) {
                        tagBuilder.setTagTextSize(tagBuilder.getContext().getResources().getDimensionPixelSize(2131167103));
                        tagBuilder.setTagHeight(tagBuilder.getContext().getResources().getDimensionPixelSize(2131167102));
                    }
                    tagBuilder.setTagText(tag.text);
                    tagBuilder.setTagTextColor(tag.textColor);
                    tagBuilder.setTagBackgroundColor(tag.bgColor);
                    tagBuilder.setTagBorderColor(tag.borderColor);
                    tagBuilder.setTagNightTextColor(tag.textColorNight);
                    tagBuilder.setTagNightBackgroundColor(tag.bgColorNight);
                    tagBuilder.setTagNightBorderColor(tag.borderColorNight);
                    tagBuilder.setTagBackgroundStyle(tag.bgStyle);
                    tagBuilder.setTagLeftSpacing(0);
                    tagBuilder.setTagRightSpacing(px);
                    tagBuilder.setBorderlessPaddingLeft(0);
                    tagBuilder.setBorderlessPaddingRight(0);
                    TagSpanTextView.TagBuilder.appendTag$default(tagBuilder, false, false, 1, (Object) null);
                }
            }
            tagBuilder.appendText(str2);
            tagBuilder.applyToView(true);
        }
        ListExtentionsKt.setText(p0().c.c, verticalLargeCoverV7Item.desc);
        final VerticalLargeCoverV7Item verticalLargeCoverV7Item2 = (VerticalLargeCoverV7Item) getData();
        Lazy lazy = this.f78943m;
        if (verticalLargeCoverV7Item2 != null && (likeButtonItemV2 = ((BasePlayerItem) verticalLargeCoverV7Item2).likeButton) != null) {
            ((z) lazy.getValue()).c(likeButtonItemV2, verticalLargeCoverV7Item2, "main.composite-tab.0.0.pv", "main.composite-tab.0.0.pv", "7");
            p0().c.e.setOnClickListener(new View.OnClickListener(this, likeButtonItemV2, verticalLargeCoverV7Item2) { // from class: Up0.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final VerticalLargeCoverV7Holder f24852a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final LikeButtonItemV2 f24853b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final VerticalLargeCoverV7Item f24854c;

                {
                    this.f24852a = this;
                    this.f24853b = likeButtonItemV2;
                    this.f24854c = verticalLargeCoverV7Item2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VerticalLargeCoverV7Holder verticalLargeCoverV7Holder = this.f24852a;
                    com.bilibili.pegasus.utils.z.f((com.bilibili.pegasus.utils.z) verticalLargeCoverV7Holder.f78943m.getValue(), this.f24853b, this.f24854c, 4);
                }
            });
            p0().c.e.setOnLongClickListener(new View.OnLongClickListener(this, likeButtonItemV2, verticalLargeCoverV7Item2) { // from class: Up0.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final VerticalLargeCoverV7Holder f24855a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final LikeButtonItemV2 f24856b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final VerticalLargeCoverV7Item f24857c;

                {
                    this.f24855a = this;
                    this.f24856b = likeButtonItemV2;
                    this.f24857c = verticalLargeCoverV7Item2;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    VerticalLargeCoverV7Holder verticalLargeCoverV7Holder = this.f24855a;
                    com.bilibili.pegasus.utils.z.f((com.bilibili.pegasus.utils.z) verticalLargeCoverV7Holder.f78943m.getValue(), this.f24856b, this.f24857c, 4);
                    return true;
                }
            });
        }
        z zVar = (z) lazy.getValue();
        LikeButtonItemV2 likeButtonItemV22 = ((BasePlayerItem) verticalLargeCoverV7Item).likeButton;
        boolean zIsSelected = likeButtonItemV22 != null ? likeButtonItemV22.isSelected() : false;
        LikeButtonItemV2 likeButtonItemV23 = ((BasePlayerItem) verticalLargeCoverV7Item).likeButton;
        zVar.e(likeButtonItemV23 != null ? likeButtonItemV23.getFormatCount() : null, zIsSelected);
        q0(p0().c.g);
        u0(null);
        VerticalLargeCoverV7Item verticalLargeCoverV7Item3 = (VerticalLargeCoverV7Item) getData();
        if (verticalLargeCoverV7Item3 == null) {
            return;
        }
        BiliImageView biliImageView = p0().c.b;
        Avatar avatar = verticalLargeCoverV7Item3.avatar;
        x.d(biliImageView, avatar != null ? avatar.cover : null, avatar != null ? Integer.valueOf(avatar.type) : null, 0.0f, ListExtentionsKt.toPx(0.5d), R$color.Ga2, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBindPanel(InlinePanel inlinePanel) {
        d dVar = (d) inlinePanel;
        s0(dVar);
        VerticalLargeCoverV7Item verticalLargeCoverV7Item = (VerticalLargeCoverV7Item) getData();
        if (verticalLargeCoverV7Item == null) {
            return;
        }
        InlineMuteWidgetV3 inlineMuteWidgetV3 = dVar.f29002m;
        if (inlineMuteWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            inlineMuteWidgetV3 = null;
        }
        inlineMuteWidgetV3.setOnWidgetClickListener(new G(this, 1));
        final int i7 = 0;
        dVar.getDanmaku().setOnWidgetClickListener(new Function2(this, i7) { // from class: Vp0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f25636a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f25637b;

            {
                this.f25636a = i7;
                this.f25637b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                String str;
                String str2;
                String str3;
                switch (this.f25636a) {
                    case 0:
                        e.c((VerticalLargeCoverV7Holder) this.f25637b, "danmaku", ((Boolean) obj).booleanValue() ? "1" : CaptureSchema.OLD_INVALID_ID_STRING, null, 12);
                        break;
                    default:
                        LiveDanmuController liveDanmuController = (LiveDanmuController) this.f25637b;
                        BiliLiveRoomInfo.DanmuSpeedConfig danmuSpeedConfig = (BiliLiveRoomInfo.DanmuSpeedConfig) obj;
                        Integer num = (Integer) obj2;
                        num.getClass();
                        kN.c cVar = liveDanmuController.h;
                        cVar.getClass();
                        LiveLog.Companion companion = LiveLog.Companion;
                        if (companion.matchLevel(3)) {
                            try {
                                str = "startLoopFetch ，config:" + cVar.e;
                            } catch (Exception e7) {
                                BLog.e("LiveLog", "getLogMessage", e7);
                                str = null;
                            }
                            String str4 = str;
                            if (str == null) {
                                str4 = "";
                            }
                            LiveLogDelegate logDelegate = companion.getLogDelegate();
                            if (logDelegate != null) {
                                LiveLogDelegate.onLog$default(logDelegate, 3, "DanmuConsumer", str4, (Throwable) null, 8, (Object) null);
                            }
                            BLog.i("DanmuConsumer", str4);
                        }
                        if (!cVar.a()) {
                            LiveLog.Companion companion2 = LiveLog.Companion;
                            if (companion2.matchLevel(3)) {
                                try {
                                    str3 = "startLoopFetch but CanStartLoop, isFragmentVisible = " + cVar.c + ", onlyPutMsgToQueue= " + cVar.d;
                                } catch (Exception e8) {
                                    BLog.e("LiveLog", "getLogMessage", e8);
                                    str3 = null;
                                }
                                str2 = str3 != null ? str3 : "";
                                LiveLogDelegate logDelegate2 = companion2.getLogDelegate();
                                if (logDelegate2 != null) {
                                    LiveLogDelegate.onLog$default(logDelegate2, 3, "DanmuConsumer", str2, (Throwable) null, 8, (Object) null);
                                }
                                BLog.i("DanmuConsumer", str2);
                            }
                            break;
                        } else {
                            BiliLiveRoomInfo.DanmuSpeedConfig danmuSpeedConfig2 = cVar.e;
                            if (danmuSpeedConfig2 != null && danmuSpeedConfig2.consumeTime == danmuSpeedConfig.consumeTime && danmuSpeedConfig2.consumeCount == danmuSpeedConfig.consumeCount && danmuSpeedConfig2.animationTime == danmuSpeedConfig.animationTime && cVar.d()) {
                                LiveLog.Companion companion3 = LiveLog.Companion;
                                if (companion3.matchLevel(3)) {
                                    str2 = "startLoopFetch but ConfigNotChanged && xloopSubscription is running" != 0 ? "startLoopFetch but ConfigNotChanged && xloopSubscription is running" : "";
                                    LiveLogDelegate logDelegate3 = companion3.getLogDelegate();
                                    if (logDelegate3 != null) {
                                        LiveLogDelegate.onLog$default(logDelegate3, 3, "DanmuConsumer", str2, (Throwable) null, 8, (Object) null);
                                    }
                                    BLog.i("DanmuConsumer", str2);
                                }
                            } else {
                                cVar.e = danmuSpeedConfig;
                                cVar.c(danmuSpeedConfig);
                            }
                        }
                        DanmuPoolCallback danmuPoolCallback = liveDanmuController.a;
                        if (danmuPoolCallback != null) {
                            danmuPoolCallback.onDanmuSpeedChange(new DanmuSpeedChangeData(danmuSpeedConfig.animationTime, num));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        InlineAvatarWidgetV3 inlineAvatarWidgetV3 = dVar.h;
        if (inlineAvatarWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatar");
            inlineAvatarWidgetV3 = null;
        }
        inlineAvatarWidgetV3.setVisibility(0);
        if (((BasePlayerItem) verticalLargeCoverV7Item).hideDanmakuSwitch) {
            dVar.getDanmaku().setVisible(false);
            dVar.getDanmaku().setVisibility(8);
        } else {
            dVar.getDanmaku().setVisible(true);
            dVar.getDanmaku().setVisibility(0);
        }
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerT0 = t0();
        inlineGestureSeekBarContainerT0.setVisibility(0);
        inlineGestureSeekBarContainerT0.resetProgress();
        TagSpanTextView tagSpanTextView = dVar.f29007r;
        if (tagSpanTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ogvBadge");
            tagSpanTextView = null;
        }
        u0(tagSpanTextView);
        boolean zIsPreview = verticalLargeCoverV7Item.isPreview();
        d.a aVar = dVar.f28997B;
        dVar.removeCardPlayStateChangedCallback(aVar);
        if (zIsPreview) {
            dVar.addCardPlayStateChangedCallback(aVar);
        }
        PlayerWidget playerWidget = verticalLargeCoverV7Item.playerWidget;
        String str = playerWidget != null ? playerWidget.title : null;
        if (str != null && !StringsKt.isBlank(str)) {
            TintTextView tintTextView = dVar.f29005p;
            if (tintTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endViewText");
                tintTextView = null;
            }
            PlayerWidget playerWidget2 = verticalLargeCoverV7Item.playerWidget;
            tintTextView.setText(playerWidget2 != null ? playerWidget2.title : null);
        }
        PlayerWidget playerWidget3 = verticalLargeCoverV7Item.playerWidget;
        String str2 = playerWidget3 != null ? playerWidget3.desc : null;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            TintTextView tintTextView2 = dVar.f29006q;
            if (tintTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endViewGoDetail");
                tintTextView2 = null;
            }
            PlayerWidget playerWidget4 = verticalLargeCoverV7Item.playerWidget;
            tintTextView2.setText(playerWidget4 != null ? playerWidget4.desc : null);
        }
        dVar.getGestureSeekWidget().setGestureSeekBarContainer(inlineGestureSeekBarContainerT0);
        dVar.addOnDetachListener(new u(this));
        dVar.setOnClickListener(new LH.u(this, 1));
        final int i8 = 0;
        dVar.setOnLongClickListener(new Function1(i8, this) { // from class: Up0.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f24858a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LifecycleOwner f24859b;

            {
                this.f24858a = i8;
                this.f24859b = this;
            }

            public final Object invoke(Object obj) {
                switch (this.f24858a) {
                    case 0:
                        Vp0.b.c((VerticalLargeCoverV7Holder) this.f24859b);
                        return Boolean.TRUE;
                    default:
                        LiveRoomInteractionViewModel liveRoomInteractionViewModel = this.f24859b;
                        liveRoomInteractionViewModel.N = (bI.a) obj;
                        liveRoomInteractionViewModel.M.setValue(Boolean.TRUE);
                        return Unit.INSTANCE;
                }
            }
        });
        dVar.f29004o.setOnClickListener(new o(this, 0));
        TintBadgeView tintBadgeView = dVar.f28998i;
        if (tintBadgeView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("badge");
            tintBadgeView = null;
        }
        tintBadgeView.setVisibility(0);
        VectorTextView vectorTextView = dVar.f29000k;
        if (vectorTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            vectorTextView = null;
        }
        H.c(vectorTextView, verticalLargeCoverV7Item.coverLeftText1, verticalLargeCoverV7Item.coverLeftIcon1);
        VectorTextView vectorTextView2 = dVar.f29001l;
        if (vectorTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            vectorTextView2 = null;
        }
        H.c(vectorTextView2, verticalLargeCoverV7Item.coverLeftText2, verticalLargeCoverV7Item.coverLeftIcon2);
        InlineTask inlineToastTask = new InlineToastTask(dVar);
        InlineTask inlineTask = dVar.f29008s;
        if (inlineTask == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
            inlineTask = null;
        }
        InlineTask inlineTask2 = dVar.f29010u;
        if (inlineTask2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekGuideWidget");
            inlineTask2 = null;
        }
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{inlineTask, inlineTask2, inlineToastTask})).execute();
    }

    public final void onDetachedFromWindow() {
        super/*Z7.c*/.onDetachedFromWindow();
        IInlineControl iInlineControl = this.f24836e;
        if (iInlineControl != null) {
            iInlineControl.stopPlay(this);
        }
    }

    public final void onScrollStateChanged(int i7) {
        d dVar;
        super/*Z7.c*/.onScrollStateChanged(i7);
        if (i7 != 1 || (dVar = (d) this.f24837f) == null) {
            return;
        }
        dVar.showWidgets();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPlaySpeed(float f7) {
        ICardPlayerContext cardPlayerContext;
        PromoToast.showMidToast(this.itemView.getContext(), f7 + "X");
        d dVar = (d) this.f24837f;
        if (dVar == null || (cardPlayerContext = dVar.getCardPlayerContext()) == null) {
            return;
        }
        cardPlayerContext.setPlaySpeed(f7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InlineGestureSeekBarContainer t0() {
        this.f78941k.setVisibility(0);
        x.a aVar = x.f78893a;
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerFindViewById = this.itemView.findViewById(2131303684);
        VerticalLargeCoverV7Item verticalLargeCoverV7Item = (VerticalLargeCoverV7Item) getData();
        inlineGestureSeekBarContainerFindViewById.setProgressBarData(verticalLargeCoverV7Item != null ? verticalLargeCoverV7Item.inlineProgressBar : null);
        return inlineGestureSeekBarContainerFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(TagSpanTextView tagSpanTextView) {
        Tag tag;
        VerticalLargeCoverV7Item verticalLargeCoverV7Item = (VerticalLargeCoverV7Item) getData();
        String str = (verticalLargeCoverV7Item == null || (tag = verticalLargeCoverV7Item.coverBadgeStyle) == null) ? null : tag.text;
        if (str == null || StringsKt.isBlank(str)) {
            ListExtentionsKt.gone(this.f78942l);
            if (tagSpanTextView != null) {
                x.j(tagSpanTextView, new Tag(), null, null, null, null, 1534);
                return;
            }
            return;
        }
        TagSpanTextView tagSpanTextView2 = tagSpanTextView;
        if (tagSpanTextView == null) {
            ListExtentionsKt.visible(this.f78942l);
            x.a aVar = x.f78893a;
            tagSpanTextView2 = (TagSpanTextView) this.itemView.findViewById(2131303679);
        }
        VerticalLargeCoverV7Item verticalLargeCoverV7Item2 = (VerticalLargeCoverV7Item) getData();
        Tag tag2 = null;
        if (verticalLargeCoverV7Item2 != null) {
            tag2 = verticalLargeCoverV7Item2.coverBadgeStyle;
        }
        x.j(tagSpanTextView2, tag2, null, null, null, null, 1534);
    }
}
