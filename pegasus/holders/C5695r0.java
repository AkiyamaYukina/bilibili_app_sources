package com.bilibili.pegasus.holders;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import bilibili.live.app.service.constant.CardTypeKt;
import bilibili.live.app.service.provider.LivePlayerDataTracker;
import com.bilibili.app.comm.list.common.inline.SingleColumnInlineProperty;
import com.bilibili.app.comm.list.common.inline.view.RightTopLiveBadge;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineDanmakuWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.inline.widgetV3.PegasusInlineMuteWidget;
import com.bilibili.app.comm.list.common.widget.ListLottieBadgeTagView;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.biz.InlinePlayerTrackerCallbackKt;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.biz.live.LiveContainer;
import com.bilibili.inline.biz.live.LiveInlineBufferingCallback;
import com.bilibili.inline.biz.live.LiveInlineTrackerCallback;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.moduleservice.list.IPegasusLiveInlineCardReportService;
import com.bilibili.pegasus.HolderVisibleState;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.common.inline.InterfaceC5582a;
import com.bilibili.pegasus.common.inline.InterfaceC5583b;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import com.bilibili.pegasus.data.component.ArgsData;
import com.bilibili.pegasus.data.component.AvatarData;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import dp0.C6829b;
import ep0.C6963a;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import op0.C8250b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8339C;
import pp0.C8340D;
import sp0.C8615d;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/r0.class */
@StabilityInferred(parameters = 0)
public final class C5695r0 extends AbstractC5656f<fp0.l, Th.l> implements InterfaceC5582a, InterfaceC5583b<fp0.l>, LiveContainer {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final aq0.B0 f78081k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f78082l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public LiveInlineBufferingCallback f78083m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f78084n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final aq0.S0 f78085o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Jh.q f78086p;

    /* JADX INFO: renamed from: com.bilibili.pegasus.holders.r0$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/r0$a.class */
    public static final class a implements ICardPlaySateChangedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5695r0 f78087a;

        public a(C5695r0 c5695r0) {
            this.f78087a = c5695r0;
        }

        public final void onError(ICardPlayerContext iCardPlayerContext) {
            IInlineControl inlineControl = this.f78087a.getInlineControl();
            if (inlineControl != null) {
                inlineControl.stopPlay();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5695r0(@NotNull aq0.B0 b02) {
        super(b02.f53669a);
        this.f78081k = b02;
        this.f78082l = ListExtentionsKt.lazyUnsafe(new Wq0.K(this, 4));
        this.f78084n = true;
        aq0.S0 s02 = b02.f53671c;
        this.f78085o = s02;
        this.f78086p = Jh.q.bind(s02.f53856a);
        this.itemView.setOnClickListener(new com.bilibili.ogv.misc.timeline.h(this, 1));
        ViewOnLongClickListenerC5692p0 viewOnLongClickListenerC5692p0 = new ViewOnLongClickListenerC5692p0(this, 0);
        ListPlaceHolderImageView listPlaceHolderImageView = b02.f53670b;
        listPlaceHolderImageView.setOnLongClickListener(viewOnLongClickListenerC5692p0);
        this.itemView.setOnLongClickListener(viewOnLongClickListenerC5692p0);
        z0().setOnLongClickListener(viewOnLongClickListenerC5692p0);
        listPlaceHolderImageView.setOnClickListener(new Nn0.u(this, 1));
        b02.f53672d.f53934b.setOnClickListener(new com.bilibili.bplus.followinglist.page.topix.r(this, 1));
    }

    public final Bundle C0() {
        Bundle bundle;
        fp0.l lVar = (fp0.l) getBindData();
        if (lVar != null) {
            Lazy lazy = C6963a.f117350a;
            Bundle bundle2 = new Bundle();
            bundle = bundle2;
            if (lVar.getPlayerArgs() != null) {
                if (lVar.getArgs() == null) {
                    bundle = bundle2;
                } else {
                    C6963a.b(lVar.getArgs(), bundle2);
                    C6963a.d(lVar.getPlayerArgs(), bundle2);
                    AvatarData avatar = lVar.getAvatar();
                    if (avatar != null) {
                        bundle2.putString("avatar", avatar.getCover());
                        bundle2.putString("avatar_text", avatar.getText());
                    }
                    C6963a.c(lVar, bundle2);
                    bundle2.putBoolean("is_manual", false);
                    bundle2.putString("card_goto", lVar.getCardGoto());
                    bundle2.putBoolean("is_atten", lVar.isAtten());
                    bundle2.putInt("play_item_hash_code", lVar.hashCode());
                    bundle2.putInt("official_icon", lVar.getOfficialIconV2());
                    bundle2.putInt("cover_left_icon_1", lVar.getCoverLeftIcon1());
                    int iAccess$getPEGASUS_INLINE_DANMAKU_STATUS$cp = 0;
                    if (!lVar.getDisableDanmaku()) {
                        if (lVar.getHideDanmakuSwitch()) {
                            iAccess$getPEGASUS_INLINE_DANMAKU_STATUS$cp = 0;
                        } else {
                            InlineDanmakuWidgetV3.Companion.getClass();
                            iAccess$getPEGASUS_INLINE_DANMAKU_STATUS$cp = InlineDanmakuWidgetV3.access$getPEGASUS_INLINE_DANMAKU_STATUS$cp();
                        }
                    }
                    bundle2.putInt("liveInlineDanmuOn", iAccess$getPEGASUS_INLINE_DANMAKU_STATUS$cp);
                    bundle2.putString("cover_left_text_1", lVar.getCoverLeftText1());
                    bundle2.putString("cover_left_text_2", lVar.getCoverLeftText2());
                    bundle2.putParcelable("right_top_live_badge", lVar.getRightTopLiveBadge());
                    bundle = bundle2;
                }
            }
        } else {
            bundle = null;
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    @Override // com.bilibili.pegasus.holders.AbstractC5656f, com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0(@org.jetbrains.annotations.NotNull fp0.l r10) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.C5695r0.u0(fp0.l):void");
    }

    public final void E0(String str) {
        IPegasusLiveInlineCardReportService iPegasusLiveInlineCardReportServiceA;
        Bundle bundleC0 = C0();
        if (bundleC0 != null && (iPegasusLiveInlineCardReportServiceA = C8339C.a()) != null) {
            iPegasusLiveInlineCardReportServiceA.onCardClick(bundleC0);
        }
        fp0.l lVar = (fp0.l) getBindData();
        if (lVar != null) {
            C8340D.g(lVar, null, null, str, null, 27);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F0() {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.C5695r0.F0():void");
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
            Th.l r0 = (Th.l) r0
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
            Th.l r0 = (Th.l) r0
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.C5695r0.S():boolean");
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5582a
    public final void U() {
        IPegasusLiveInlineCardReportService iPegasusLiveInlineCardReportServiceA;
        Bundle bundleC0 = C0();
        if (bundleC0 == null || (iPegasusLiveInlineCardReportServiceA = C8339C.a()) == null) {
            return;
        }
        iPegasusLiveInlineCardReportServiceA.onCardShow(bundleC0);
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void a(boolean z6) {
        IInlineControl inlineControl;
        ICardPlayerContext cardPlayerContext;
        if (z6) {
            Th.l lVar = this.f77861g;
            if (((lVar == null || (cardPlayerContext = lVar.getCardPlayerContext()) == null) ? null : cardPlayerContext.getVideoEnvironment()) == VideoEnvironment.MOBILE_DATA) {
                PlayReason playReason = PlayReason.INLINE_MANUAL_PLAY;
                fp0.l lVar2 = (fp0.l) getBindData();
                PlayReason playReason2 = null;
                if (lVar2 != null) {
                    SingleColumnInlineProperty singleColumnInlineProperty = lVar2.f118806b1;
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
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        long tid;
        long rid;
        fp0.l lVar = (fp0.l) getBindData();
        if (lVar == null) {
            return cardPlayTask;
        }
        C8250b.b(cardPlayTask, z6);
        ArgsData args = lVar.getArgs();
        if (args != null) {
            tid = args.getTid();
            rid = args.getRid();
        } else {
            tid = 0;
            rid = 0;
        }
        long oid = lVar.getOid();
        long jH = lVar.h();
        String uri = lVar.getUri();
        String str = uri;
        if (uri == null) {
            str = "";
        }
        InlinePlayerTrackerCallbackKt.addInlineTrackerCallback(cardPlayTask, new LiveInlineTrackerCallback(new LivePlayerDataTracker.TrackerRawData(oid, jH, tid, rid, str, CardTypeKt.getCARD_TYPE_PEGASUS_DOUBLE_LIVE_CARD_INLINE(), 5, lVar.getTrackId())));
        cardPlayTask.setChronosEnable(true);
        cardPlayTask.addPlayerStateChangedCallback(new a(this));
        LiveInlineBufferingCallback liveInlineBufferingCallback = this.f78083m;
        if (liveInlineBufferingCallback != null) {
            cardPlayTask.addPlayerBufferingCallback(liveInlineBufferingCallback);
        }
        return cardPlayTask;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean d() {
        fp0.l lVar = (fp0.l) getBindData();
        boolean z6 = false;
        if (lVar != null) {
            z6 = false;
            if (lVar.getShareMenuEnable()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final BasePegasusPlayerData getData() {
        return (fp0.l) getBindData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.common.inline.InterfaceC5582a
    @NotNull
    public final View getItemView() {
        return this.itemView;
    }

    @NotNull
    public final Class<Th.l> getPanelType() {
        return Th.l.class;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final float getPlaySpeed() {
        return 1.0f;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final int getPlayerState() {
        return 0;
    }

    @NotNull
    public final ViewGroup getVideoContainer() {
        return z0();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean isFavorite() {
        return false;
    }

    public final void onBind(PegasusHolderData pegasusHolderData, List list) {
        fp0.l lVar = (fp0.l) pegasusHolderData;
        if (list.contains("PAYLOAD_UPDATE_TRANSLATE")) {
            F0();
        } else {
            super/*com.bilibili.pegasus.PegasusHolder*/.onBind(lVar, list);
        }
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void onBindPanel(InlinePanel inlinePanel) {
        Th.l lVar = (Th.l) inlinePanel;
        super.onBindPanel(lVar);
        fp0.l lVar2 = (fp0.l) getBindData();
        if (lVar2 == null) {
            return;
        }
        C8339C.e(lVar, lVar2);
        lVar.getDanmaku().setVisible(!lVar2.getHideDanmakuSwitch());
        lVar.getDanmaku().setVisibility(ListExtentionsKt.toVisibility(!lVar2.getHideDanmakuSwitch()));
        C8615d.a(lVar.getCoverLeftText1(), lVar2.getCoverLeftText1(), lVar2.getCoverLeftIcon1());
        C8615d.a(lVar.getCoverLeftText2(), lVar2.getCoverLeftText2(), lVar2.getCoverLeftIcon2());
        lVar.setOnClickListener(new com.bilibili.lib.fasthybrid.uimodule.widget.appvideo.J(this, 1));
        lVar.setOnLongClickListener(new H60.x(this, 2));
        PegasusInlineMuteWidget pegasusInlineMuteWidget = lVar.k;
        if (pegasusInlineMuteWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mute");
            pegasusInlineMuteWidget = null;
        }
        pegasusInlineMuteWidget.setSupportGuidance(true);
        C6829b c6829bB = lVar2.b();
        String strB = c6829bB != null ? c6829bB.b() : null;
        C6829b c6829bB2 = lVar2.b();
        String strC = c6829bB2 != null ? c6829bB2.c() : null;
        C6829b c6829bB3 = lVar2.b();
        Integer numValueOf = c6829bB3 != null ? Integer.valueOf(c6829bB3.a()) : null;
        ListLottieBadgeTagView listLottieBadgeTagView = lVar.s;
        if (listLottieBadgeTagView != null) {
            listLottieBadgeTagView.j0(numValueOf, strB, strC);
        }
        InlineTask inlineToastTask = new InlineToastTask(lVar);
        InlineTask inlineTask = lVar.l;
        if (inlineTask == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inline4GWarningWidget");
            inlineTask = null;
        }
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{inlineTask, inlineToastTask})).execute();
        LiveInlineBufferingCallback liveInlineBufferingCallback = this.f78083m;
        if (liveInlineBufferingCallback != null) {
            liveInlineBufferingCallback.checkLiveCanPlay(lVar2.getOid());
        }
    }

    /* JADX INFO: renamed from: onHolderVisibleStateChanged-9yN0R78, reason: not valid java name */
    public final void m8129onHolderVisibleStateChanged9yN0R78(int i7, int i8) {
        IInlineControl inlineControl;
        super/*com.bilibili.pegasus.PegasusHolder*/.onHolderVisibleStateChanged-9yN0R78(i7, i8);
        if (HolderVisibleState.getAllVisible-impl(i8) || (inlineControl = getInlineControl()) == null) {
            return;
        }
        inlineControl.stopPlay(this);
    }

    public final void onPageScrollStateChanged(@NotNull RecyclerView recyclerView, int i7) {
        Th.l lVar;
        super/*com.bilibili.pegasus.PegasusHolder*/.onPageScrollStateChanged(recyclerView, i7);
        if (i7 != 1 || (lVar = this.f77861g) == null) {
            return;
        }
        lVar.showWidgets();
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void setPlaySpeed(float f7) {
    }

    public final void updateCardLive(boolean z6) {
        VectorTextView coverLeftText2;
        VectorTextView coverLeftText1;
        ListLottieBadgeTagView listLottieBadgeTagView;
        fp0.l lVar = (fp0.l) getBindData();
        if (lVar == null) {
            return;
        }
        boolean z7 = this.f78084n;
        this.f78084n = z6;
        aq0.B0 b02 = this.f78081k;
        Jh.q qVar = this.f78086p;
        if (z7 && !z6) {
            z0().setIconVisible(false);
            ListExtentionsKt.visible(b02.f53671c.f53857b);
            ListExtentionsKt.gone(qVar.c);
            ListExtentionsKt.gone(qVar.d);
        } else if (z7 || !z6) {
            z0().setIconVisible(false);
            Unit unit = Unit.INSTANCE;
        } else {
            ListExtentionsKt.gone(b02.f53671c.f53857b);
            ListExtentionsKt.visible(qVar.c);
            ListExtentionsKt.visible(qVar.d);
        }
        Th.l lVar2 = this.f77861g;
        if (lVar2 != null && (listLottieBadgeTagView = lVar2.s) != null) {
            listLottieBadgeTagView.setVisibility(z6 ? 0 : 8);
        }
        Th.l lVar3 = this.f77861g;
        if (lVar3 != null && (coverLeftText1 = lVar3.getCoverLeftText1()) != null) {
            coverLeftText1.setVisibility(ListExtentionsKt.toVisibility(z6));
        }
        Th.l lVar4 = this.f77861g;
        if (lVar4 != null && (coverLeftText2 = lVar4.getCoverLeftText2()) != null) {
            coverLeftText2.setVisibility(ListExtentionsKt.toVisibility(z6));
        }
        qVar.b.setVisibility(z6 ? 0 : 8);
        this.f78085o.f53861f.setVisibility(z6 ? 0 : 8);
        RightTopLiveBadge rightTopLiveBadge = lVar.getRightTopLiveBadge();
        if (rightTopLiveBadge != null) {
            rightTopLiveBadge.setLiveStatus(z6 ? 1 : 0);
        }
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final long w() {
        ICardPlayerContext cardPlayerContext;
        Th.l lVar = this.f77861g;
        return (lVar == null || (cardPlayerContext = lVar.getCardPlayerContext()) == null) ? 0L : cardPlayerContext.getCurrentPosition();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y0() {
        /*
            r7 = this;
            r0 = r7
            com.bilibili.pegasus.PegasusHolderData r0 = r0.getBindData()
            fp0.l r0 = (fp0.l) r0
            r13 = r0
            r0 = r13
            if (r0 != 0) goto Lf
            return
        Lf:
            r0 = r7
            com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout r0 = r0.z0()
            r12 = r0
            UD.r1 r0 = new UD.r1
            r1 = r0
            r2 = r7
            r3 = 1
            r1.<init>(r2, r3)
            r11 = r0
            VV.d r0 = new VV.d
            r1 = r0
            r2 = r7
            r3 = 3
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r13
            com.bilibili.app.comm.list.common.api.model.PlayerArgs r0 = r0.getPlayerArgs()
            r15 = r0
            r0 = 1
            r10 = r0
            r0 = r15
            if (r0 == 0) goto L46
            r0 = r15
            boolean r0 = r0.hidePlayButton
            if (r0 != 0) goto L46
            r0 = 1
            r8 = r0
            goto L48
        L46:
            r0 = 0
            r8 = r0
        L48:
            r0 = r13
            boolean r0 = r0.isInlinePlayable()
            if (r0 == 0) goto L72
            r0 = r13
            com.bilibili.app.comm.list.common.api.model.PlayerArgs r0 = r0.getPlayerArgs()
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L67
            r0 = r15
            boolean r0 = r0.clickToPlay()
            r9 = r0
            goto L69
        L67:
            r0 = 0
            r9 = r0
        L69:
            r0 = r9
            if (r0 == 0) goto L72
            r0 = r10
            r9 = r0
            goto L74
        L72:
            r0 = 0
            r9 = r0
        L74:
            r0 = r12
            r1 = r11
            r2 = r14
            r3 = r8
            r4 = r9
            r5 = r13
            java.util.Map r5 = pp0.C8340D.d(r5)
            r0.bindViewPlay(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.C5695r0.y0():void");
    }
}
