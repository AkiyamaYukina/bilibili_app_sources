package com.bilibili.pegasus.holders.oversea;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import aq0.Z0;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.inline.InlineTripleGuideHelper;
import com.bilibili.app.comm.list.common.inline.InlineTripleLikeTask;
import com.bilibili.app.comm.list.common.inline.SingleColumnInlineProperty;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineUGCHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.app.comm.list.widget.utils.ListConstKt;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.router.BiligameRouterHelper;
import com.bilibili.biligame.ui.gamedetail.GameDetailViewModelV4;
import com.bilibili.biligame.ui.gamedetail.action.GameDetailAction;
import com.bilibili.biligame.utils.GameUtils;
import com.bilibili.bililive.biz.livehome.indexfeed.ui.live.address.Address;
import com.bilibili.bililive.biz.livehome.indexfeed.ui.live.address.Country;
import com.bilibili.bililive.biz.livehome.indexfeed.ui.live.address.LiveCountryFragment;
import com.bilibili.bililive.biz.livehome.videofeed.player.LiveVideoFeedUIManager;
import com.bilibili.bililive.biz.livehome.videofeed.widget.LiveVideoFeedAttentionTitleView;
import com.bilibili.bililive.extension.api.home.videofeed.LiveVideoFeedFollowInfo;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import com.bilibili.bililive.shared.router.LiveRouterHelper;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;
import com.bilibili.inline.plugin.DefaultCardPlayBehaviorWrap;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.HolderVisibleState;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.common.inline.InterfaceC5583b;
import com.bilibili.pegasus.common.inline.l;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import com.bilibili.pegasus.data.component.AvatarData;
import com.bilibili.pegasus.data.component.DescButtonData;
import com.bilibili.pegasus.ext.router.SpecialSpmidType;
import com.bilibili.pegasus.ext.view.TagExtKt;
import com.bilibili.pegasus.holders.AbstractC5656f;
import com.bilibili.pegasus.holders.oversea.LargeCoverSingleV12Holder;
import com.bilibili.pegasus.widget.CardFragmentWithScrollContainer;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import com.bilibili.upper.module.contribute.up.dialog.PublishChargeSettingDialog;
import com.bililive.bililive.infra.hybrid.utils.HDLiveUtils;
import com.bililive.bililive.infra.hybrid.widget.LiveWebToolBar;
import com.mall.data.page.sponsor.bean.TopRoleUnitListBean;
import com.mall.ui.page.ip.sponsor.MallCharacterSponsorFragmentV2;
import com.mall.ui.page.ip.sponsor.MallSponsorDialogFragment;
import com.mall.ui.page.ip.sponsor.adapter.CharacterBaseHolder;
import ip0.C7609b;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import op0.C8249a;
import op0.C8250b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8339C;
import pp0.C8340D;
import qp0.C8476b;
import sp0.C8614c;
import sp0.C8615d;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.FixedPopupAnchor;
import tv.danmaku.bili.widget.PendantAvatarFrameLayout;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;
import tv.h;
import vp.p;
import vp.y;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/LargeCoverSingleV12Holder.class */
@StabilityInferred(parameters = 0)
public final class LargeCoverSingleV12Holder extends AbstractC5656f<C7609b, O> implements InterfaceC5583b<C7609b> {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f77934y = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Z0 f77935k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f77936l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77939o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lazy f77940p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.bilibili.pegasus.common.inline.l<C7609b> f77941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final a f77942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lazy f77943s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Lazy f77944t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.common.n f77945u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final c70.f f77946v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final c70.g f77947w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final b f77948x;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/LargeCoverSingleV12Holder$a.class */
    public static final class a implements l.a<C7609b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LargeCoverSingleV12Holder f77949a;

        public a(LargeCoverSingleV12Holder largeCoverSingleV12Holder) {
            this.f77949a = largeCoverSingleV12Holder;
        }

        @Override // com.bilibili.pegasus.common.inline.l.a
        public final void a() {
            jp0.c cVarG;
            LargeCoverSingleV12Holder largeCoverSingleV12Holder = this.f77949a;
            C7609b c7609b = (C7609b) largeCoverSingleV12Holder.getBindData();
            if (c7609b == null || (cVarG = c7609b.g()) == null || cVarG.h()) {
                return;
            }
            com.bilibili.pegasus.common.inline.z.e(largeCoverSingleV12Holder.E0(), cVarG, (BasePegasusData) largeCoverSingleV12Holder.getBindData());
        }

        @Override // com.bilibili.pegasus.common.inline.l.a
        public final void b(BasePegasusPlayerData basePegasusPlayerData) {
            Neurons.reportClick(false, "tm.recommend.inline.triplelike.click", C8340D.d((C7609b) basePegasusPlayerData));
        }

        @Override // com.bilibili.pegasus.common.inline.l.a
        public final void c(BasePegasusPlayerData basePegasusPlayerData) {
            C7609b c7609b = (C7609b) basePegasusPlayerData;
            LargeCoverSingleV12Holder largeCoverSingleV12Holder = this.f77949a;
            C7609b c7609b2 = (C7609b) largeCoverSingleV12Holder.getBindData();
            if (c7609b2 != null && c7609b.getAid() == c7609b2.getAid()) {
                jp0.c cVarG = c7609b2.g();
                if (cVarG != null) {
                    cVarG.j(true);
                }
                com.bilibili.pegasus.common.inline.z zVarE0 = largeCoverSingleV12Holder.E0();
                jp0.c cVarG2 = c7609b2.g();
                boolean zH = cVarG2 != null ? cVarG2.h() : false;
                jp0.c cVarG3 = c7609b2.g();
                zVarE0.d(cVarG3 != null ? cVarG3.d() : null, zH);
                largeCoverSingleV12Holder.F0(c7609b.getAid());
            }
        }

        @Override // com.bilibili.pegasus.common.inline.l.a
        public final void d(BasePegasusPlayerData basePegasusPlayerData) {
            ((InlineTripleGuideHelper) this.f77949a.f77940p.getValue()).stopInlineTripleGuideAnim();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/LargeCoverSingleV12Holder$b.class */
    public static final class b implements PanelDetachListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LargeCoverSingleV12Holder f77950a;

        public b(LargeCoverSingleV12Holder largeCoverSingleV12Holder) {
            this.f77950a = largeCoverSingleV12Holder;
        }

        public final void onDetach(InlinePanel inlinePanel) {
            InlineGestureSeekBarContainer inlineGestureSeekBarContainerD0 = this.f77950a.D0();
            inlineGestureSeekBarContainerD0.resetProgress();
            inlineGestureSeekBarContainerD0.setVisibility(8);
            inlinePanel.removeOnDetachListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LargeCoverSingleV12Holder(@NotNull Z0 z02) {
        super(z02.f53949a);
        this.f77935k = z02;
        this.f77936l = ListExtentionsKt.lazyUnsafe(new Function0(this) { // from class: com.bilibili.pegasus.holders.oversea.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverSingleV12Holder f78055a;

            {
                this.f78055a = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.pegasus.BasePegasusHolder, com.bilibili.pegasus.holders.oversea.LargeCoverSingleV12Holder, java.lang.Object] */
            public final Object invoke() {
                ?? r02 = this.f78055a;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) r02.itemView.findViewById(2131315642);
                Z0 z03 = r02.f77935k;
                TintImageView tintImageView = z03.f53960m;
                LargeCoverSingleV12Holder$mInlineLikeButtonHelper$2$1 largeCoverSingleV12Holder$mInlineLikeButtonHelper$2$1 = new LargeCoverSingleV12Holder$mInlineLikeButtonHelper$2$1(r02);
                Fragment fragment = r02.getFragment();
                return new com.bilibili.pegasus.common.inline.z(lottieAnimationView, tintImageView, z03.f53964q, largeCoverSingleV12Holder$mInlineLikeButtonHelper$2$1, fragment != null ? fragment.getLifecycle() : null);
            }
        });
        this.f77937m = this.itemView.findViewById(2131299631);
        this.f77938n = this.itemView.findViewById(2131299632);
        this.f77939o = this.itemView.findViewById(2131299649);
        this.f77940p = ListExtentionsKt.lazyUnsafe(new c70.d(this, 1));
        this.f77942r = new a(this);
        this.f77943s = ListExtentionsKt.lazyUnsafe(new c70.e(this, 1));
        this.f77944t = ListExtentionsKt.lazyUnsafe(new com.bilibili.biligame.ui.minigame.more.g(this, 3));
        this.f77946v = new c70.f(this, 4);
        this.f77947w = new c70.g(this, 1);
        final int i7 = 2;
        this.itemView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: HG0.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f8631a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f8632b;

            {
                this.f8631a = i7;
                this.f8632b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f8631a) {
                    case 0:
                        ((PublishChargeSettingDialog) this.f8632b).jf();
                        break;
                    case 1:
                        LiveVideoFeedUIManager liveVideoFeedUIManager = (LiveVideoFeedUIManager) this.f8632b;
                        if (!liveVideoFeedUIManager.l) {
                            LiveVideoFeedAttentionTitleView liveVideoFeedAttentionTitleView = liveVideoFeedUIManager.e;
                            if (liveVideoFeedAttentionTitleView == null || liveVideoFeedAttentionTitleView.c == liveVideoFeedAttentionTitleView.a) {
                                liveVideoFeedUIManager.c();
                            } else if (!HDLiveUtils.INSTANCE.isHD()) {
                                LiveVideoFeedFollowInfo liveVideoFeedFollowInfo = liveVideoFeedUIManager.g().p;
                                String totalLink = liveVideoFeedFollowInfo != null ? liveVideoFeedFollowInfo.getTotalLink() : null;
                                if (totalLink == null || StringsKt.isBlank(totalLink)) {
                                    BLog.w("LiveVideoFeedUIManager", "Attention link is null or blank");
                                } else {
                                    String strA = com.bilibili.ad.adview.pegasus.holders.inline.pegasus.m.a(totalLink, "source_event", "2");
                                    defpackage.a.b("Attention link: ", strA, "LiveVideoFeedUIManager");
                                    LiveRouterHelper.startAppLink$default(liveVideoFeedUIManager.a, strA, 0L, 0, 12, (Object) null);
                                }
                            } else {
                                BLog.i("LiveVideoFeedUIManager", "HD Web not support");
                            }
                        } else {
                            BLog.i("LiveVideoFeedUIManager", "Attention panel is expanded. not expand again.");
                        }
                        break;
                    case 2:
                        LargeCoverSingleV12Holder largeCoverSingleV12Holder = (LargeCoverSingleV12Holder) this.f8632b;
                        C8249a.h(largeCoverSingleV12Holder, largeCoverSingleV12Holder, null, null, "0", null, false, false, false, false, null, 2038);
                        break;
                    default:
                        LiveWebToolBar.a aVar = ((LiveWebToolBar) this.f8632b).i;
                        if (aVar != null) {
                            aVar.a();
                        }
                        break;
                }
            }
        });
        final int i8 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(this, i8) { // from class: HG0.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f8635a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f8636b;

            {
                this.f8635a = i8;
                this.f8636b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f8635a) {
                    case 0:
                        PublishChargeSettingDialog publishChargeSettingDialog = (PublishChargeSettingDialog) this.f8636b;
                        Context context = publishChargeSettingDialog.getContext();
                        if (context != null) {
                            String string = publishChargeSettingDialog.getString(2131858392);
                            String strA = C4496a.a("\n\n ", publishChargeSettingDialog.getString(2131858393));
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) strA);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R$color.Text1)), 0, string.length(), 33);
                            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(16, true), 0, string.length(), 33);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R$color.Brand_pink)), string.length(), strA.length() + string.length(), 33);
                            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(12, true), string.length(), strA.length() + string.length(), 33);
                            new AlertDialog.Builder(context).setMessage(spannableStringBuilder).setPositiveButton(2131851216, (DialogInterface.OnClickListener) null).show();
                            break;
                        }
                        break;
                    case 1:
                        com.bilibili.bililive.room.ui.roomv3.watchmovie.h hVar = (com.bilibili.bililive.room.ui.roomv3.watchmovie.h) this.f8636b;
                        if (Intrinsics.areEqual(hVar.o.h.getValue(), Boolean.TRUE)) {
                            hVar.o.N(false);
                        }
                        break;
                    case 2:
                        LargeCoverSingleV12Holder largeCoverSingleV12Holder = (LargeCoverSingleV12Holder) this.f8636b;
                        C8249a.h(largeCoverSingleV12Holder, largeCoverSingleV12Holder, null, null, "1", null, false, false, false, false, null, 2038);
                        break;
                    case 3:
                        LiveWebToolBar.a aVar = ((LiveWebToolBar) this.f8636b).i;
                        if (aVar != null) {
                            aVar.b();
                        }
                        break;
                    default:
                        y.a aVar2 = (y.a) this.f8636b;
                        Object tag = aVar2.itemView.getTag();
                        GameDetailInfo.RelatedPcGame relatedPcGame = tag instanceof GameDetailInfo.RelatedPcGame ? (GameDetailInfo.RelatedPcGame) tag : null;
                        if (relatedPcGame != null) {
                            ReporterV3.reportClick("game-ball.game-detail-page.pc-information.0.click", MapsKt.hashMapOf(new Pair[]{TuplesKt.to("game_base_id", aVar2.l), TuplesKt.to("click_pos", "1")}));
                            if (relatedPcGame.allowPcJump) {
                                String str = relatedPcGame.pcDetailLink;
                                if (str == null || str.length() == 0) {
                                    BiligameRouterHelper.openGameDetail(aVar2.itemView.getContext(), relatedPcGame.gameBaseId);
                                } else {
                                    BiligameRouterHelper.openUrl(aVar2.itemView.getContext(), relatedPcGame.pcDetailLink);
                                }
                            }
                        }
                        break;
                }
            }
        };
        ListPlaceHolderImageView listPlaceHolderImageView = z02.f53953e;
        listPlaceHolderImageView.setOnClickListener(onClickListener);
        View.OnClickListener zVar = new com.bilibili.bplus.followinglist.quick.consume.upmore.z(this, 1);
        FixedPopupAnchor fixedPopupAnchor = z02.f53965r;
        fixedPopupAnchor.setOnClickListener(zVar);
        fixedPopupAnchor.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.oversea.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverSingleV12Holder f78056a;

            {
                this.f78056a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                LargeCoverSingleV12Holder largeCoverSingleV12Holder = this.f78056a;
                rp0.p.c(largeCoverSingleV12Holder, true, ListExtentionsKt.getGlobalRect(largeCoverSingleV12Holder.f77935k.f53965r));
                return true;
            }
        });
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.oversea.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverSingleV12Holder f78061a;

            {
                this.f78061a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                LargeCoverSingleV12Holder largeCoverSingleV12Holder = this.f78061a;
                rp0.p.c(largeCoverSingleV12Holder, true, ListExtentionsKt.getGlobalRect(largeCoverSingleV12Holder.f77935k.f53965r));
                return true;
            }
        };
        listPlaceHolderImageView.setOnLongClickListener(onLongClickListener);
        this.itemView.setOnLongClickListener(onLongClickListener);
        z0().setOnLongClickListener(onLongClickListener);
        this.f77948x = new b(this);
    }

    public static int C0(boolean z6, Rect rect, RecyclerView.ViewHolder viewHolder, Rect rect2) {
        int iHeight;
        if (z6) {
            iHeight = rect.top - rect2.top;
        } else {
            iHeight = rect.top - (rect2.height() + (rect2.top - viewHolder.itemView.getHeight()));
        }
        return iHeight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InlineGestureSeekBarContainer D0() {
        this.f77935k.f53958k.setVisibility(0);
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerFindViewById = this.itemView.findViewById(2131303684);
        C7609b c7609b = (C7609b) getBindData();
        inlineGestureSeekBarContainerFindViewById.setProgressBarData(c7609b != null ? c7609b.getInlineProgressBar() : null);
        return inlineGestureSeekBarContainerFindViewById;
    }

    public final com.bilibili.pegasus.common.inline.z E0() {
        return (com.bilibili.pegasus.common.inline.z) this.f77936l.getValue();
    }

    public final void F0(long j7) {
        com.bilibili.pegasus.common.n nVar;
        C7609b c7609b = (C7609b) getBindData();
        if (c7609b == null || j7 != c7609b.getAid() || (nVar = this.f77945u) == null) {
            return;
        }
        nVar.updateRepositoryData(c7609b);
    }

    public final void G0() {
        C7609b c7609b = (C7609b) getBindData();
        String title = null;
        Z0 z02 = this.f77935k;
        if (c7609b == null || !Intrinsics.areEqual(c7609b.getTranslatedStatus(), "TRANSLATED")) {
            TagSpanTextView tagSpanTextView = z02.f53955g;
            C7609b c7609b2 = (C7609b) getBindData();
            if (c7609b2 != null) {
                title = c7609b2.getTitle();
            }
            ListExtentionsKt.setText(tagSpanTextView, title);
            return;
        }
        TagSpanTextView tagSpanTextView2 = z02.f53955g;
        C7609b c7609b3 = (C7609b) getBindData();
        String strL = null;
        if (c7609b3 != null) {
            strL = c7609b3.l();
        }
        ListExtentionsKt.setText(tagSpanTextView2, strL);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean S() {
        /*
            r3 = this;
            r0 = r3
            P extends com.bilibili.inline.panel.InlinePanel r0 = r0.f77861g
            com.bilibili.pegasus.holders.oversea.O r0 = (com.bilibili.pegasus.holders.oversea.O) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L41
            r0 = r6
            com.bilibili.app.comm.list.common.inline.widgetV3.InlineDanmakuWidgetV3 r0 = r0.getDanmaku()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L41
            r0 = r6
            boolean r0 = r0.isVisible()
            r5 = r0
            r0 = 1
            r4 = r0
            r0 = r5
            r1 = 1
            if (r0 != r1) goto L41
            r0 = r3
            P extends com.bilibili.inline.panel.InlinePanel r0 = r0.f77861g
            com.bilibili.pegasus.holders.oversea.O r0 = (com.bilibili.pegasus.holders.oversea.O) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L41
            r0 = r6
            com.bilibili.app.comm.list.common.inline.widgetV3.InlineDanmakuWidgetV3 r0 = r0.getDanmaku()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L41
            r0 = r6
            boolean r0 = r0.isSelected()
            r1 = 1
            if (r0 != r1) goto L41
            goto L43
        L41:
            r0 = 0
            r4 = r0
        L43:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.oversea.LargeCoverSingleV12Holder.S():boolean");
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void a(boolean z6) {
        IInlineControl inlineControl;
        ICardPlayerContext cardPlayerContext;
        if (z6) {
            O o7 = this.f77861g;
            if (((o7 == null || (cardPlayerContext = o7.getCardPlayerContext()) == null) ? null : cardPlayerContext.getVideoEnvironment()) == VideoEnvironment.MOBILE_DATA) {
                PlayReason playReason = PlayReason.INLINE_MANUAL_PLAY;
                C7609b c7609b = (C7609b) getBindData();
                PlayReason playReason2 = null;
                if (c7609b != null) {
                    SingleColumnInlineProperty singleColumnInlineProperty = c7609b.f122035a1;
                    playReason2 = null;
                    if (singleColumnInlineProperty != null) {
                        playReason2 = singleColumnInlineProperty.getPlayReason();
                    }
                }
                if (playReason == playReason2 || (inlineControl = getInlineControl()) == null) {
                    return;
                }
                inlineControl.stopPlay(this);
            }
        }
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void c(long j7, boolean z6) {
        C7609b c7609b = (C7609b) getBindData();
        if (c7609b != null && j7 == c7609b.getAid()) {
            c7609b.setFav(z6);
            F0(j7);
        }
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineUGCHistoryServiceV2) this.f77943s.getValue());
        InlineExtensionKt.addInlineBehavior(cardPlayTask, (DefaultCardPlayBehaviorWrap) this.f77944t.getValue());
        C8250b.b(cardPlayTask, z6);
        cardPlayTask.setChronosEnable(true);
        com.bilibili.pegasus.common.n nVar = new com.bilibili.pegasus.common.n((BasePegasusPlayerData) getBindData());
        nVar.setVideoStateCallback(this.f77946v);
        nVar.setFollowStateCallback(this.f77947w);
        cardPlayTask.setTaskRepository(nVar);
        this.f77945u = nVar;
        return cardPlayTask;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean d() {
        C7609b c7609b = (C7609b) getBindData();
        boolean z6 = false;
        if (c7609b != null) {
            z6 = false;
            if (c7609b.getShareMenuEnable()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final BasePegasusPlayerData getData() {
        return (C7609b) getBindData();
    }

    @NotNull
    public final Class<? extends O> getPanelType() {
        return O.class;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final float getPlaySpeed() {
        ICardPlayerContext cardPlayerContext;
        O o7 = this.f77861g;
        return (o7 == null || (cardPlayerContext = o7.getCardPlayerContext()) == null) ? 1.0f : cardPlayerContext.getPlaySpeed();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final int getPlayerState() {
        ICardPlayerContext cardPlayerContext;
        O o7 = this.f77861g;
        return (o7 == null || (cardPlayerContext = o7.getCardPlayerContext()) == null) ? 0 : cardPlayerContext.getPlayerState();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean isFavorite() {
        C7609b c7609b = (C7609b) getBindData();
        boolean z6 = false;
        if (c7609b != null) {
            z6 = false;
            if (c7609b.isFav()) {
                z6 = true;
            }
        }
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBind(PegasusHolderData pegasusHolderData, List list) {
        final C7609b c7609b = (C7609b) pegasusHolderData;
        super/*com.bilibili.pegasus.PegasusHolder*/.onBind(c7609b, list);
        if (list.contains("PAYLOAD_UPDATE_TRANSLATE")) {
            G0();
            return;
        }
        z0().setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.oversea.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverSingleV12Holder f78057a;

            {
                this.f78057a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                LargeCoverSingleV12Holder largeCoverSingleV12Holder = this.f78057a;
                rp0.p.c(largeCoverSingleV12Holder, true, ListExtentionsKt.getGlobalRect(largeCoverSingleV12Holder.f77935k.f53965r));
                return true;
            }
        });
        Z0 z02 = this.f77935k;
        int i7 = 8;
        C8614c.d(z02.f53953e, c7609b.getCover(), z02.f53957j.f54049b, null, 8);
        View view = this.itemView;
        String talkBack = c7609b.getTalkBack();
        if (talkBack == null) {
            talkBack = c7609b.getTitle();
        }
        view.setContentDescription(talkBack);
        ((DefaultCardPlayBehaviorWrap) this.f77944t.getValue()).reset(this);
        ((InlineUGCHistoryServiceV2) this.f77943s.getValue()).reset(c7609b.getUri());
        ListExtentionsKt.setTextWithIcon$default(this.f77937m, c7609b.getCoverLeftText1(), c7609b.getCoverLeftIcon1(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setTextWithIcon$default(this.f77938n, c7609b.getCoverLeftText2(), c7609b.getCoverLeftIcon2(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setText(this.f77939o, c7609b.getCoverRightText());
        G0();
        z02.f53950b.setVisibility(0);
        jp0.e eVarH = c7609b.h();
        TagSpanTextView tagSpanTextView = z02.f53961n;
        PendantAvatarFrameLayout pendantAvatarFrameLayout = z02.f53951c;
        if (eVarH != null) {
            tagSpanTextView.setVisibility(0);
            pendantAvatarFrameLayout.setVisibility(8);
            TagExtKt.displaySpanTag$default(tagSpanTextView, c7609b.h(), null, null, false, false, false, null, TagExtKt.toImageTag$default(c7609b.h(), 0, 0, false, 5, null), null, 0, 0, 1406, null);
        } else if (c7609b.getAvatar() != null) {
            tagSpanTextView.setVisibility(8);
            pendantAvatarFrameLayout.setVisibility(0);
            PendantAvatarFrameLayout.ShowParams showParams = new PendantAvatarFrameLayout.ShowParams();
            showParams.mode(2);
            showParams.defaultAvatar(2131237005);
            AvatarData avatar = c7609b.getAvatar();
            showParams.avatarImgUrl(avatar != null ? avatar.getCover() : null);
            showParams.borderWidth(0.5f);
            showParams.borderColor(R$color.Ga2);
            showParams.mIsBadgeShow = Boolean.TRUE;
            showParams.badgeImgRes(ListConstKt.getIconRes(c7609b.getOfficialIconV2()));
            pendantAvatarFrameLayout.show(showParams);
            pendantAvatarFrameLayout.setOnClickListener(new com.bilibili.lib.bilipay.ui.recharge.v2.l(2, this, c7609b));
        } else {
            pendantAvatarFrameLayout.setVisibility(8);
            tagSpanTextView.setVisibility(8);
        }
        if (pendantAvatarFrameLayout.getVisibility() != 0 && tagSpanTextView.getVisibility() != 0) {
            ListExtentionsKt.gone(z02.f53950b);
        }
        String strF = c7609b.f();
        TintTextView tintTextView = z02.f53954f;
        ListExtentionsKt.setText(tintTextView, strF);
        DescButtonData descButton = c7609b.getDescButton();
        String text = descButton != null ? descButton.getText() : null;
        if (text == null || StringsKt.isBlank(text)) {
            ListExtentionsKt.setText(tintTextView, c7609b.f());
            tintTextView.setOnClickListener(null);
        } else {
            DescButtonData descButton2 = c7609b.getDescButton();
            ListExtentionsKt.setText(tintTextView, descButton2 != null ? descButton2.getText() : null);
            tintTextView.setOnClickListener(new UP.c(2, this, c7609b));
        }
        jp0.c cVarG = c7609b.g();
        TintImageView tintImageView = z02.f53960m;
        Group group = z02.f53956i;
        if (cVarG == null) {
            ListExtentionsKt.gone(group);
        } else {
            ListExtentionsKt.visible(group);
            Lazy lazy = C8476b.f126257a;
            String strB = C8476b.b(SpecialSpmidType.DEFAULT);
            com.bilibili.pegasus.common.inline.z.c(E0(), c7609b.g(), c7609b, strB, strB);
            final int i8 = 0;
            tintImageView.setOnClickListener(new View.OnClickListener(i8, this, c7609b) { // from class: com.bilibili.pegasus.holders.oversea.x

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f78062a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f78063b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f78064c;

                {
                    this.f78062a = i8;
                    this.f78063b = this;
                    this.f78064c = c7609b;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                /* JADX WARN: Type inference failed for: r1v7, types: [com.mall.ui.page.ip.sponsor.q, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) throws NoWhenBranchMatchedException {
                    String str;
                    MutableLiveData gameDetailAction;
                    switch (this.f78062a) {
                        case 0:
                            LargeCoverSingleV12Holder largeCoverSingleV12Holder = (LargeCoverSingleV12Holder) this.f78063b;
                            C7609b c7609b2 = (C7609b) this.f78064c;
                            com.bilibili.pegasus.common.inline.z.e(largeCoverSingleV12Holder.E0(), c7609b2.g(), c7609b2);
                            return;
                        case 1:
                            CharacterBaseHolder characterBaseHolder = (CharacterBaseHolder) this.f78063b;
                            Serializable serializable = (TopRoleUnitListBean) this.f78064c;
                            String str2 = characterBaseHolder.b;
                            Bundle bundle = new Bundle();
                            bundle.putString("ipId", str2);
                            bundle.putSerializable("roleInfo", serializable);
                            MallSponsorDialogFragment mallSponsorDialogFragment = new MallSponsorDialogFragment();
                            mallSponsorDialogFragment.setArguments(bundle);
                            mallSponsorDialogFragment.G = new Object();
                            MallCharacterSponsorFragmentV2 mallCharacterSponsorFragmentV2 = characterBaseHolder.a;
                            FragmentManager childFragmentManager = mallCharacterSponsorFragmentV2 != null ? mallCharacterSponsorFragmentV2.getChildFragmentManager() : null;
                            if (childFragmentManager != null) {
                                mallSponsorDialogFragment.show(childFragmentManager, "MallSponsorDialogFragment");
                            }
                            KQ0.e.e(2131830625, MapsKt.emptyMap());
                            return;
                        case 2:
                            tv.g gVar = (tv.g) this.f78063b;
                            Country country = (Country) this.f78064c;
                            tv.h hVar = gVar.d;
                            if (hVar != null) {
                                LiveLog.Companion companion = LiveLog.Companion;
                                LiveCountryFragment liveCountryFragment = hVar.a;
                                String str3 = liveCountryFragment.b;
                                if (companion.matchLevel(3)) {
                                    try {
                                        str = "countryFragment onItemClicked: " + country;
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
                                        LiveLogDelegate.onLog$default(logDelegate, 3, str3, str4, (Throwable) null, 8, (Object) null);
                                    }
                                    BLog.i(str3, str4);
                                    break;
                                }
                                int i9 = h.a.a[country.ordinal()];
                                if (i9 == 1) {
                                    BLRouter.routeTo(new RouteRequest.Builder("bilibili://live/select-province").requestCode(272).build(), liveCountryFragment);
                                    return;
                                }
                                if (i9 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Intent intent = new Intent();
                                Context context = liveCountryFragment.getContext();
                                String string = "";
                                if (context != null) {
                                    string = context.getString(2131857262);
                                    if (string == null) {
                                        string = "";
                                    }
                                }
                                intent.putExtra("extra_address", (Serializable) new Address(string, string, string));
                                intent.putExtra("select_country_type", (Serializable) country);
                                FragmentActivity fragmentActivityP3 = liveCountryFragment.p3();
                                if (fragmentActivityP3 != null) {
                                    fragmentActivityP3.setResult(-1, intent);
                                }
                                FragmentActivity fragmentActivityP32 = liveCountryFragment.p3();
                                if (fragmentActivityP32 != null) {
                                    fragmentActivityP32.finish();
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            p.b bVar = (p.b) this.f78063b;
                            GameDetailInfo.MainGameDetail mainGameDetail = (GameDetailInfo.MainGameDetail) this.f78064c;
                            String string2 = bVar.g.c.getText().toString();
                            GameDetailInfo gameDetailInfoP0 = bVar.p0();
                            ReporterV3.reportClick("game-ball.game-detail-page.order-official-game.button.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("game_base_id", String.valueOf(gameDetailInfoP0 != null ? Integer.valueOf(gameDetailInfoP0.gameBaseId) : null)), TuplesKt.to("button_name", string2)}));
                            if (GameUtils.isBookSkip(mainGameDetail.androidGameStatus, mainGameDetail.androidBookLink)) {
                                BiligameRouterHelper.openBookLink(bVar.itemView.getContext(), mainGameDetail.androidBookLink);
                                return;
                            }
                            Object tag = bVar.itemView.getTag();
                            GameDetailInfo gameDetailInfo = tag instanceof GameDetailInfo ? (GameDetailInfo) tag : null;
                            String strValueOf = gameDetailInfo != null ? String.valueOf(gameDetailInfo.gameBaseId) : null;
                            String str5 = strValueOf;
                            if (strValueOf == null) {
                                str5 = "";
                            }
                            GameDetailViewModelV4 detailViewModel = bVar.h.getDetailViewModel(str5);
                            if (detailViewModel == null || (gameDetailAction = detailViewModel.getGameDetailAction()) == null) {
                                return;
                            }
                            gameDetailAction.setValue(new GameDetailAction(14, mainGameDetail));
                            return;
                    }
                }
            });
        }
        jp0.d dVarK = c7609b.k();
        Group group2 = z02.h;
        if (dVarK == null) {
            ListExtentionsKt.gone(group2);
        } else {
            ListExtentionsKt.visible(group2);
            jp0.d dVarK2 = c7609b.k();
            String strB2 = dVarK2 != null ? dVarK2.b() : null;
            boolean z6 = strB2 == null || StringsKt.isBlank(strB2);
            TintTextView tintTextView2 = z02.f53963p;
            if (!z6) {
                i7 = 0;
            }
            tintTextView2.setVisibility(i7);
            jp0.d dVarK3 = c7609b.k();
            tintTextView2.setText(dVarK3 != null ? dVarK3.b() : null);
            z02.f53959l.setOnClickListener(new UR0.e(this, 4));
            tintTextView2.setOnClickListener(new v(0, this, c7609b));
        }
        com.bilibili.pegasus.common.inline.z zVarE0 = E0();
        jp0.c cVarG2 = c7609b.g();
        boolean zH = cVarG2 != null ? cVarG2.h() : false;
        jp0.c cVarG3 = c7609b.g();
        String strD = null;
        if (cVarG3 != null) {
            strD = cVarG3.d();
        }
        zVarE0.d(strD, zH);
        com.bilibili.pegasus.common.inline.l<C7609b> lVar = new com.bilibili.pegasus.common.inline.l<>(c7609b, (LottieAnimationView) this.itemView.findViewById(2131313890), tintImageView, false);
        lVar.f75575d = this.f77942r;
        this.f77941q = lVar;
        z02.f53965r.setVisibility(0);
        PlayerArgs playerArgs = c7609b.getPlayerArgs();
        boolean z7 = false;
        if (playerArgs != null) {
            z7 = playerArgs.hidePlayButton;
        }
        z02.f53953e.showPlaceHolderInnerDrawable(z7);
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void onBindPanel(InlinePanel inlinePanel) {
        O o7 = (O) inlinePanel;
        super.onBindPanel(o7);
        C7609b c7609b = (C7609b) getBindData();
        if (c7609b == null) {
            return;
        }
        o7.getMute().setSupportGuidance(true);
        o7.resetFromType("large_cover_single_v12");
        C8339C.g(o7, c7609b);
        if (c7609b.getHideDanmakuSwitch()) {
            o7.getDanmaku().setVisible(false);
            o7.getDanmaku().setVisibility(8);
        } else {
            o7.getDanmaku().setVisible(true);
            o7.getDanmaku().setVisibility(0);
        }
        C8615d.a(o7.getCoverLeftText1(), c7609b.getCoverLeftText1(), c7609b.getCoverLeftIcon1());
        C8615d.a(o7.getCoverLeftText2(), c7609b.getCoverLeftText2(), c7609b.getCoverLeftIcon2());
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerD0 = D0();
        inlineGestureSeekBarContainerD0.setVisibility(0);
        inlineGestureSeekBarContainerD0.resetProgress();
        o7.getGestureSeekWidget().setGestureSeekBarContainer(inlineGestureSeekBarContainerD0);
        o7.setOnClickListener(new Vn.r(this, 4));
        o7.setOnLongClickListener(new Vn.s(this, 5));
        o7.addOnDetachListener(this.f77948x);
        InlineTask inlineTripleLikeTask = new InlineTripleLikeTask(new com.bilibili.lib.bilipay.ui.recharge.v2.o(this, 1), new UR0.d(this, 2));
        InlineTask inlineToastTask = new InlineToastTask(o7);
        ((InlineTripleGuideHelper) this.f77940p.getValue()).getTranslateAnim().setAnimationListener(inlineTripleLikeTask.getAnimationListener());
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{inlineTripleLikeTask, o7.getInline4GWarningWidget(), o7.getSeekGuideWidget(), inlineToastTask})).execute();
    }

    /* JADX INFO: renamed from: onHolderVisibleStateChanged-9yN0R78, reason: not valid java name */
    public final void m8125onHolderVisibleStateChanged9yN0R78(int i7, int i8) {
        super/*com.bilibili.pegasus.PegasusHolder*/.onHolderVisibleStateChanged-9yN0R78(i7, i8);
        if (HolderVisibleState.getAllVisible-impl(i8)) {
            return;
        }
        IInlineControl inlineControl = getInlineControl();
        if (inlineControl != null) {
            inlineControl.stopPlay(this);
        }
        ((InlineTripleGuideHelper) this.f77940p.getValue()).stopInlineTripleGuideAnim();
        com.bilibili.pegasus.common.inline.l<C7609b> lVar = this.f77941q;
        com.bilibili.pegasus.common.inline.l<C7609b> lVar2 = lVar;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tripleLikeHelper");
            lVar2 = null;
        }
        lVar2.f75573b.removeAllAnimatorListeners();
        lVar2.f75573b.cancelAnimation();
    }

    public final void onPageScrollStateChanged(@NotNull RecyclerView recyclerView, int i7) {
        O o7;
        super/*com.bilibili.pegasus.PegasusHolder*/.onPageScrollStateChanged(recyclerView, i7);
        if (i7 != 1 || (o7 = this.f77861g) == null) {
            return;
        }
        o7.showWidgets();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void setPlaySpeed(float f7) {
        ICardPlayerContext cardPlayerContext;
        PromoToast.showMidToast(this.itemView.getContext(), f7 + "X");
        O o7 = this.f77861g;
        if (o7 == null || (cardPlayerContext = o7.getCardPlayerContext()) == null) {
            return;
        }
        cardPlayerContext.setPlaySpeed(f7);
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final long w() {
        ICardPlayerContext cardPlayerContext;
        O o7 = this.f77861g;
        return (o7 == null || (cardPlayerContext = o7.getCardPlayerContext()) == null) ? 0L : cardPlayerContext.getCurrentPosition();
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    public final void x0(@Nullable View view) {
        view.setVisibility(0);
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void y0() {
        super.y0();
        BLog.i("LargeCoverSingleV12Card", "bindViewPlay调用了！");
        CardFragmentPlayerContainerLayout cardFragmentPlayerContainerLayoutZ0 = z0();
        CardFragmentWithScrollContainer cardFragmentWithScrollContainer = cardFragmentPlayerContainerLayoutZ0 instanceof CardFragmentWithScrollContainer ? (CardFragmentWithScrollContainer) cardFragmentPlayerContainerLayoutZ0 : null;
        if (cardFragmentWithScrollContainer != null) {
            cardFragmentWithScrollContainer.f79105k = new c70.b(this, 1);
        }
    }
}
