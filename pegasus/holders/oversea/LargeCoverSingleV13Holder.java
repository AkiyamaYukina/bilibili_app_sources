package com.bilibili.pegasus.holders.oversea;

import android.view.View;
import androidx.compose.material3.S8;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import aq0.a1;
import aq0.e1;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.PlayerWidget;
import com.bilibili.app.comm.list.common.inline.ListOgvCardPlayBehaviorWrap;
import com.bilibili.app.comm.list.common.inline.SingleColumnInlineProperty;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineOGVHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.common.inline.widgetV3.Inline4GWarningWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineAvatarWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineMuteWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.inline.widgetV3.PegasusInlineMuteWidget;
import com.bilibili.app.comm.list.common.widget.ListLottieBadgeTagView;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.image.TintBadgeView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.HolderVisibleState;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.common.inline.InterfaceC5583b;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import com.bilibili.pegasus.ext.view.TagExtKt;
import com.bilibili.pegasus.holders.AbstractC5656f;
import com.bilibili.pegasus.holders.oversea.N;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import dp0.C6829b;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import op0.C8250b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8338B;
import pp0.C8340D;
import sp0.C8615d;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/LargeCoverSingleV13Holder.class */
@StabilityInferred(parameters = 0)
public final class LargeCoverSingleV13Holder extends AbstractC5656f<ip0.c, N> implements InterfaceC5583b<ip0.c> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f77951v = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final a1 f77952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77954m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77955n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f77956o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ListLottieBadgeTagView f77957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f77958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Lazy f77959r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.common.h f77960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final com.bilibili.bililive.room.ui.top.g f77961t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Pg.l f77962u;

    /* JADX WARN: Multi-variable type inference failed */
    public LargeCoverSingleV13Holder(@NotNull a1 a1Var) {
        super(a1Var.f53976a);
        this.f77952k = a1Var;
        this.f77953l = this.itemView.findViewById(2131299631);
        this.f77954m = this.itemView.findViewById(2131299632);
        this.f77955n = this.itemView.findViewById(2131299649);
        this.f77956o = ListExtentionsKt.lazyUnsafe(new Function0(this) { // from class: com.bilibili.pegasus.holders.oversea.G

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverSingleV13Holder f77919a;

            {
                this.f77919a = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.pegasus.BasePegasusHolder, com.bilibili.pegasus.holders.oversea.LargeCoverSingleV13Holder, java.lang.Object] */
            public final Object invoke() {
                ?? r02 = this.f77919a;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) r02.itemView.findViewById(2131308211);
                e1 e1Var = r02.f77952k.f53980e;
                TintImageView tintImageView = e1Var.h;
                LargeCoverSingleV13Holder$mInlineLikeButtonHelper$2$1 largeCoverSingleV13Holder$mInlineLikeButtonHelper$2$1 = new LargeCoverSingleV13Holder$mInlineLikeButtonHelper$2$1(r02);
                Fragment fragment = r02.getFragment();
                return new com.bilibili.pegasus.common.inline.z(lottieAnimationView, tintImageView, e1Var.f54025i, largeCoverSingleV13Holder$mInlineLikeButtonHelper$2$1, fragment != null ? fragment.getLifecycle() : null);
            }
        });
        this.f77957p = this.itemView.findViewById(2131318539);
        this.f77958q = ListExtentionsKt.lazyUnsafe(new O41.j(this, 2));
        this.f77959r = ListExtentionsKt.lazyUnsafe(new com.bilibili.bililive.room.ui.multivoicelink.ui.f(this, 1));
        this.f77961t = new com.bilibili.bililive.room.ui.top.g(this, 2);
        this.f77962u = new Pg.l(this, 2);
        this.itemView.setOnClickListener(new Ff.b(this, 1));
        View.OnClickListener cVar = new com.bilibili.app.screen.adjust.widget.c(this, 2);
        ListPlaceHolderImageView listPlaceHolderImageView = a1Var.f53977b;
        listPlaceHolderImageView.setOnClickListener(cVar);
        a1Var.f53980e.f54026j.setOnClickListener(new Aa.c(this, 3));
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.oversea.H

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LargeCoverSingleV13Holder f77920a;

            {
                this.f77920a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                LargeCoverSingleV13Holder largeCoverSingleV13Holder = this.f77920a;
                rp0.p.c(largeCoverSingleV13Holder, true, ListExtentionsKt.getGlobalRect(largeCoverSingleV13Holder.f77952k.f53980e.f54026j));
                return true;
            }
        };
        listPlaceHolderImageView.setOnLongClickListener(onLongClickListener);
        this.itemView.setOnLongClickListener(onLongClickListener);
        z0().setOnLongClickListener(onLongClickListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InlineGestureSeekBarContainer C0() {
        this.f77952k.f53979d.setVisibility(0);
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerFindViewById = this.itemView.findViewById(2131303684);
        ip0.c cVar = (ip0.c) getBindData();
        inlineGestureSeekBarContainerFindViewById.setProgressBarData(cVar != null ? cVar.getInlineProgressBar() : null);
        return inlineGestureSeekBarContainerFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x027c  */
    @Override // com.bilibili.pegasus.holders.AbstractC5656f, com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0(@org.jetbrains.annotations.NotNull ip0.c r10) {
        /*
            Method dump skipped, instruction units count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.oversea.LargeCoverSingleV13Holder.u0(ip0.c):void");
    }

    public final void E0() {
        ip0.c cVar = (ip0.c) getBindData();
        if (cVar == null) {
            return;
        }
        String strL = Intrinsics.areEqual(cVar.getTranslatedStatus(), "TRANSLATED") ? cVar.l() : cVar.getTitle();
        String str = strL;
        if (strL == null) {
            str = "";
        }
        final int i7 = 0;
        final String str2 = str;
        TagExtKt.displaySpanTags$default(this.f77952k.f53980e.f54022e, CollectionsKt.listOf(cVar.h()), str, 0, ListExtentionsKt.toPx(6), false, false, false, new Function0(i7, this, str2) { // from class: com.bilibili.pegasus.holders.oversea.C

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77910a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f77911b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f77912c;

            {
                this.f77910a = i7;
                this.f77911b = this;
                this.f77912c = str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object invoke() {
                switch (this.f77910a) {
                    case 0:
                        ListExtentionsKt.setText(((LargeCoverSingleV13Holder) this.f77911b).f77952k.f53980e.f54022e, (String) this.f77912c);
                        break;
                    default:
                        MutableState mutableState = (MutableState) this.f77912c;
                        MutableState mutableState2 = (MutableState) this.f77911b;
                        if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                            mutableState2.setValue(Boolean.TRUE);
                            mutableState.setValue(Boolean.FALSE);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, null, true, 372, null);
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
            com.bilibili.pegasus.holders.oversea.N r0 = (com.bilibili.pegasus.holders.oversea.N) r0
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
            com.bilibili.pegasus.holders.oversea.N r0 = (com.bilibili.pegasus.holders.oversea.N) r0
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.oversea.LargeCoverSingleV13Holder.S():boolean");
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void a(boolean z6) {
        IInlineControl inlineControl;
        ICardPlayerContext cardPlayerContext;
        if (z6) {
            N n7 = (N) this.f77861g;
            if (((n7 == null || (cardPlayerContext = n7.getCardPlayerContext()) == null) ? null : cardPlayerContext.getVideoEnvironment()) == VideoEnvironment.MOBILE_DATA) {
                PlayReason playReason = PlayReason.INLINE_MANUAL_PLAY;
                ip0.c cVar = (ip0.c) getBindData();
                PlayReason playReason2 = null;
                if (cVar != null) {
                    SingleColumnInlineProperty singleColumnInlineProperty = cVar.f122091Y0;
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
        com.bilibili.pegasus.common.h hVar;
        ip0.c cVar = (ip0.c) getBindData();
        if (cVar != null && j7 == cVar.getAid()) {
            cVar.setFav(z6);
            ip0.c cVar2 = (ip0.c) getBindData();
            if (cVar2 == null || j7 != cVar2.getAid() || (hVar = this.f77960s) == null) {
                return;
            }
            hVar.updateRepositoryData(cVar2);
        }
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        PlayerArgs playerArgs;
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineOGVHistoryServiceV2) this.f77958q.getValue());
        InlineExtensionKt.addInlineBehavior(cardPlayTask, (ListOgvCardPlayBehaviorWrap) this.f77959r.getValue());
        C8250b.b(cardPlayTask, z6);
        ip0.c cVar = (ip0.c) getBindData();
        if (cVar != null && (playerArgs = cVar.getPlayerArgs()) != null) {
            cardPlayTask.setCustomFakeDuration(((long) playerArgs.fakeDuration) * 1000);
        }
        cardPlayTask.setChronosEnable(true);
        com.bilibili.pegasus.common.h hVar = new com.bilibili.pegasus.common.h((BasePegasusPlayerData) getBindData());
        hVar.setVideoStateCallback(this.f77961t);
        hVar.setFollowStateCallback(this.f77962u);
        cardPlayTask.setTaskRepository(hVar);
        this.f77960s = hVar;
        return cardPlayTask;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean d() {
        ip0.c cVar = (ip0.c) getBindData();
        boolean z6 = false;
        if (cVar != null) {
            z6 = false;
            if (cVar.getShareMenuEnable()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final BasePegasusPlayerData getData() {
        return (ip0.c) getBindData();
    }

    @NotNull
    public final Class<N> getPanelType() {
        return N.class;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final float getPlaySpeed() {
        ICardPlayerContext cardPlayerContext;
        N n7 = (N) this.f77861g;
        return (n7 == null || (cardPlayerContext = n7.getCardPlayerContext()) == null) ? -1.0f : cardPlayerContext.getPlaySpeed();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final int getPlayerState() {
        ICardPlayerContext cardPlayerContext;
        N n7 = (N) this.f77861g;
        return (n7 == null || (cardPlayerContext = n7.getCardPlayerContext()) == null) ? 0 : cardPlayerContext.getPlayerState();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean isFavorite() {
        ip0.c cVar = (ip0.c) getBindData();
        boolean z6 = false;
        if (cVar != null) {
            z6 = false;
            if (cVar.isFav()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void onBind(PegasusHolderData pegasusHolderData, List list) {
        super/*com.bilibili.pegasus.PegasusHolder*/.onBind((ip0.c) pegasusHolderData, list);
        if (list.contains("PAYLOAD_UPDATE_TRANSLATE")) {
            E0();
        }
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void onBindPanel(InlinePanel inlinePanel) {
        N n7 = (N) inlinePanel;
        super.onBindPanel(n7);
        PegasusInlineMuteWidget pegasusInlineMuteWidget = n7.f77972m;
        if (pegasusInlineMuteWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            pegasusInlineMuteWidget = null;
        }
        pegasusInlineMuteWidget.setSupportGuidance(true);
        ip0.c cVar = (ip0.c) getBindData();
        if (cVar != null) {
            Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("from_type", cVar.getFromType()), TuplesKt.to("goto", cVar.getCardGoto()), TuplesKt.to("param", cVar.getParam()), TuplesKt.to("card_type", cVar.getCardType()), TuplesKt.to("style", C8340D.e())});
            InlineMuteWidgetV3 inlineMuteWidgetV3 = n7.f77972m;
            if (inlineMuteWidgetV3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mute");
                inlineMuteWidgetV3 = null;
            }
            inlineMuteWidgetV3.setVolumeGuidanceListener(new pp0.g(cVar));
            InlineMuteWidgetV3 inlineMuteWidgetV32 = n7.f77972m;
            if (inlineMuteWidgetV32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mute");
                inlineMuteWidgetV32 = null;
            }
            inlineMuteWidgetV32.setMuteStateChangeListener(new C8338B(cVar, null));
            n7.getDanmaku().setOnWidgetClickListener(new com.bilibili.bplus.followinglist.opus.x(1, cVar, (Object) null));
            n7.getGestureSeekWidget().setSeekReportListener(new pp0.j(mapMutableMapOf));
            Inline4GWarningWidgetV3 inline4GWarningWidgetV3 = n7.f77978s;
            if (inline4GWarningWidgetV3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
                inline4GWarningWidgetV3 = null;
            }
            inline4GWarningWidgetV3.setOnWidgetClickListener(new pp0.k(mapMutableMapOf));
            InlineAvatarWidgetV3 inlineAvatarWidgetV3 = n7.h;
            if (inlineAvatarWidgetV3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avatar");
                inlineAvatarWidgetV3 = null;
            }
            inlineAvatarWidgetV3.setVisibility(0);
            if (cVar.getHideDanmakuSwitch()) {
                n7.getDanmaku().setVisible(false);
                n7.getDanmaku().setVisibility(8);
            } else {
                n7.getDanmaku().setVisible(true);
                n7.getDanmaku().setVisibility(0);
            }
            InlineGestureSeekBarContainer inlineGestureSeekBarContainerC0 = C0();
            inlineGestureSeekBarContainerC0.setVisibility(0);
            inlineGestureSeekBarContainerC0.resetProgress();
            boolean zIsPreview = cVar.isPreview();
            N.a aVar = n7.f77967B;
            n7.removeCardPlayStateChangedCallback(aVar);
            if (zIsPreview) {
                n7.addCardPlayStateChangedCallback(aVar);
            }
            PlayerWidget playerWidget = cVar.getPlayerWidget();
            String str = playerWidget != null ? playerWidget.title : null;
            if (str != null && !StringsKt.isBlank(str)) {
                TintTextView tintTextView = n7.f77975p;
                if (tintTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("endViewText");
                    tintTextView = null;
                }
                PlayerWidget playerWidget2 = cVar.getPlayerWidget();
                tintTextView.setText(playerWidget2 != null ? playerWidget2.title : null);
            }
            PlayerWidget playerWidget3 = cVar.getPlayerWidget();
            String str2 = playerWidget3 != null ? playerWidget3.desc : null;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                TintTextView tintTextView2 = n7.f77976q;
                if (tintTextView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("endViewGoDetail");
                    tintTextView2 = null;
                }
                PlayerWidget playerWidget4 = cVar.getPlayerWidget();
                tintTextView2.setText(playerWidget4 != null ? playerWidget4.desc : null);
            }
            n7.getGestureSeekWidget().setGestureSeekBarContainer(inlineGestureSeekBarContainerC0);
            n7.addOnDetachListener(new I(this));
            ListLottieBadgeTagView listLottieBadgeTagView = n7.f77977r;
            if (listLottieBadgeTagView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ogvBadge");
                listLottieBadgeTagView = null;
            }
            C6829b c6829bB = cVar.b();
            String strB = c6829bB != null ? c6829bB.b() : null;
            C6829b c6829bB2 = cVar.b();
            String strC = c6829bB2 != null ? c6829bB2.c() : null;
            C6829b c6829bB3 = cVar.b();
            listLottieBadgeTagView.j0(c6829bB3 != null ? Integer.valueOf(c6829bB3.a()) : null, strB, strC);
            n7.setOnClickListener(new S8(this, 2));
            n7.setOnLongClickListener(new Fe1.E(this, 5));
            n7.f77974o.setOnClickListener(new com.bilibili.bililive.biz.livehome.videofeed.widget.g(this, 2));
            TintBadgeView tintBadgeView = n7.f77968i;
            if (tintBadgeView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("badge");
                tintBadgeView = null;
            }
            tintBadgeView.setVisibility(0);
            VectorTextView vectorTextView = n7.f77970k;
            if (vectorTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
                vectorTextView = null;
            }
            C8615d.a(vectorTextView, cVar.getCoverLeftText1(), cVar.getCoverLeftIcon1());
            VectorTextView vectorTextView2 = n7.f77971l;
            if (vectorTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
                vectorTextView2 = null;
            }
            C8615d.a(vectorTextView2, cVar.getCoverLeftText2(), cVar.getCoverLeftIcon2());
            InlineTask inlineToastTask = new InlineToastTask(n7);
            InlineTask inlineTask = n7.f77978s;
            if (inlineTask == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
                inlineTask = null;
            }
            InlineTask inlineTask2 = n7.f77980u;
            if (inlineTask2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seekGuideWidget");
                inlineTask2 = null;
            }
            new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{inlineTask, inlineTask2, inlineToastTask})).execute();
        }
    }

    /* JADX INFO: renamed from: onHolderVisibleStateChanged-9yN0R78, reason: not valid java name */
    public final void m8126onHolderVisibleStateChanged9yN0R78(int i7, int i8) {
        IInlineControl inlineControl;
        super/*com.bilibili.pegasus.PegasusHolder*/.onHolderVisibleStateChanged-9yN0R78(i7, i8);
        if (HolderVisibleState.getAllVisible-impl(i8) || (inlineControl = getInlineControl()) == null) {
            return;
        }
        inlineControl.stopPlay(this);
    }

    public final void onPageScrollStateChanged(@NotNull RecyclerView recyclerView, int i7) {
        N n7;
        super/*com.bilibili.pegasus.PegasusHolder*/.onPageScrollStateChanged(recyclerView, i7);
        if (i7 != 1 || (n7 = (N) this.f77861g) == null) {
            return;
        }
        n7.showWidgets();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void setPlaySpeed(float f7) {
        ICardPlayerContext cardPlayerContext;
        PromoToast.showMidToast(this.itemView.getContext(), f7 + "X");
        N n7 = (N) this.f77861g;
        if (n7 == null || (cardPlayerContext = n7.getCardPlayerContext()) == null) {
            return;
        }
        cardPlayerContext.setPlaySpeed(f7);
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final long w() {
        ICardPlayerContext cardPlayerContext;
        N n7 = (N) this.f77861g;
        return (n7 == null || (cardPlayerContext = n7.getCardPlayerContext()) == null) ? 0L : cardPlayerContext.getCurrentPosition();
    }
}
