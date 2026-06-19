package com.bilibili.pegasus.holders;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.adcommon.utils.ext.ViewExtKt;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.inline.panel.LiveSmallInlinePanel;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagTintTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.biz.InlinePlayerTrackerCallbackKt;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.biz.live.LiveContainer;
import com.bilibili.inline.biz.live.LiveInlineBufferingCallback;
import com.bilibili.inline.biz.live.LiveInlineTrackerCallback;
import com.bilibili.inline.card.IMuteInlineCard;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.reporter.AutoPlayTriggerType;
import com.bilibili.inline.reporter.InlinePlayReporterKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.HolderVisibleState;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.common.inline.InterfaceC5582a;
import com.bilibili.pegasus.common.inline.InterfaceC5583b;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import op0.C8250b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8340D;
import sp0.C8614c;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.IPlayerRenderCallback;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/c1.class */
@StabilityInferred(parameters = 0)
public final class c1 extends AbstractC5656f<fp0.w, LiveSmallInlinePanel> implements InterfaceC5582a, InterfaceC5583b<fp0.w>, LiveContainer, com.bilibili.pegasus.common.inlineplay.d, IMuteInlineCard, ICardPlaySateChangedCallback, IPlayerRenderCallback {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final aq0.P0 f77844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final View f77845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public LiveInlineBufferingCallback f77846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f77847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final TintTextView f77848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final VectorTextView f77850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final TagTintTextView f77851r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/c1$a.class */
    public static final class a implements ICardPlaySateChangedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c1 f77852a;

        public a(c1 c1Var) {
            this.f77852a = c1Var;
        }

        public final void onError(ICardPlayerContext iCardPlayerContext) {
            InlinePlayReporterKt.reportTryAutoPlayEvent(AutoPlayTriggerType.PLAYER_ERROR, "cover_v9", false);
            IInlineControl inlineControl = this.f77852a.getInlineControl();
            if (inlineControl != null) {
                inlineControl.stopPlay();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c1(@NotNull aq0.P0 p02) {
        super(p02.f53808a);
        this.f77844k = p02;
        this.f77845l = this.itemView.findViewById(2131299323);
        this.f77847n = ListExtentionsKt.lazyUnsafe(new De.j(this, 3));
        p02.f53826t.setUrlGetter(C8614c.f127321c);
        this.itemView.setOnClickListener(new a1(this, 0));
        this.itemView.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.b1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c1 f77672a;

            {
                this.f77672a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                c1 c1Var = this.f77672a;
                rp0.p.c(c1Var, true, ListExtentionsKt.getGlobalRect(c1Var.f77844k.f53828v));
                return true;
            }
        });
        p02.f53811d.setOnClickListener(new W0(this, 0));
        p02.f53828v.setOnClickListener(new bu0.v(this, 2));
        if (!androidx.appcompat.app.n.a(Thread.currentThread())) {
            p02.f53832z.inflate();
        }
        this.f77848o = p02.f53807A;
        this.f77849p = p02.f53815i;
        this.f77850q = p02.f53816j;
        this.f77851r = p02.f53819m;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void B0(InlinePanel inlinePanel) {
        ICardPlayerContext cardPlayerContext;
        LiveSmallInlinePanel liveSmallInlinePanel = (LiveSmallInlinePanel) inlinePanel;
        liveSmallInlinePanel.removeCardPlayStateChangedCallback(this);
        liveSmallInlinePanel.removePlayerRenderCallback(this);
        LiveSmallInlinePanel liveSmallInlinePanel2 = this.f77861g;
        if (liveSmallInlinePanel2 == null || (cardPlayerContext = liveSmallInlinePanel2.getCardPlayerContext()) == null) {
            return;
        }
        cardPlayerContext.setAspectRatio(AspectRatio.RATIO_ADJUST_CONTENT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0144  */
    @Override // com.bilibili.pegasus.holders.AbstractC5656f, com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0(@org.jetbrains.annotations.NotNull final fp0.w r16) {
        /*
            Method dump skipped, instruction units count: 1267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.c1.u0(fp0.w):void");
    }

    public final void D0(int i7, int i8) {
        ICardPlayerContext cardPlayerContext;
        ICardPlayerContext cardPlayerContext2;
        PlayerArgs playerArgs;
        com.bilibili.bplus.im.protobuf.a.b(i7, i8, "setAspectRatio videoWidth:", " videoHeight:", "SmallCoverV9Card");
        if (i7 < 1 || i8 < 1) {
            return;
        }
        fp0.w wVar = (fp0.w) getBindData();
        if (((wVar == null || (playerArgs = wVar.getPlayerArgs()) == null) ? 0 : playerArgs.contentMode) != 1 || i7 / i8 > ((Number) e1.f77859b.getValue()).floatValue()) {
            LiveSmallInlinePanel liveSmallInlinePanel = this.f77861g;
            if (liveSmallInlinePanel == null || (cardPlayerContext = liveSmallInlinePanel.getCardPlayerContext()) == null) {
                return;
            }
            cardPlayerContext.setAspectRatio(AspectRatio.RATIO_ADJUST_CONTENT);
            return;
        }
        LiveSmallInlinePanel liveSmallInlinePanel2 = this.f77861g;
        if (liveSmallInlinePanel2 == null || (cardPlayerContext2 = liveSmallInlinePanel2.getCardPlayerContext()) == null) {
            return;
        }
        cardPlayerContext2.setAspectRatio(AspectRatio.RATIO_CENTER_CROP);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0(fp0.w wVar) {
        String translatedText;
        String title = (!Intrinsics.areEqual(wVar.getTranslatedStatus(), "TRANSLATED") || (translatedText = wVar.getTranslatedText()) == null || StringsKt.isBlank(translatedText)) ? wVar.getTitle() : wVar.getTranslatedText();
        this.f77844k.f53807A.setText(title);
        View view = this.itemView;
        String talkBack = wVar.getTalkBack();
        if (talkBack != null) {
            title = talkBack;
        }
        view.setContentDescription(title);
    }

    public final void F0(boolean z6) {
        fp0.w wVar = (fp0.w) getBindData();
        aq0.P0 p02 = this.f77844k;
        if (wVar == null || !wVar.u()) {
            p02.f53825s.setVisibility(4);
            p02.f53810c.setVisibility(4);
        }
        Lazy lazy = this.f77847n;
        if (((Animator) lazy.getValue()).isRunning()) {
            ((Animator) lazy.getValue()).cancel();
        }
        this.f77845l.setAlpha(z6 ? 0.0f : 1.0f);
        ViewExtKt.visible(this.f77845l);
        ListExtentionsKt.gone(p02.f53827u);
        if (z6) {
            ((Animator) lazy.getValue()).start();
        }
        ViewExtKt.visible(p02.f53814g.f54017b);
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean S() {
        return true;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5582a
    public final void U() {
    }

    @Override // com.bilibili.pegasus.common.inlineplay.d
    public final void X() {
        fp0.w wVar = (fp0.w) getBindData();
        if (wVar != null) {
            C8340D.k(wVar, 4);
        }
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void a(boolean z6) {
        ICardPlayerContext cardPlayerContext;
        fp0.w wVar = (fp0.w) getBindData();
        if (wVar != null && z6) {
            LiveSmallInlinePanel liveSmallInlinePanel = this.f77861g;
            if (((liveSmallInlinePanel == null || (cardPlayerContext = liveSmallInlinePanel.getCardPlayerContext()) == null) ? null : cardPlayerContext.getVideoEnvironment()) != VideoEnvironment.MOBILE_DATA || PlayReason.INLINE_MANUAL_PLAY == wVar.f119102h1.getPlayReason()) {
                return;
            }
            InlinePlayReporterKt.reportTryAutoPlayEvent(AutoPlayTriggerType.DISABLE_MOBILE, "cover_v9", false);
            IInlineControl inlineControl = getInlineControl();
            if (inlineControl != null) {
                inlineControl.stopPlay(this);
            }
        }
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void c(long j7, boolean z6) {
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        C8250b.b(cardPlayTask, z6);
        fp0.w wVar = (fp0.w) getBindData();
        if (wVar != null) {
            InlinePlayerTrackerCallbackKt.addInlineTrackerCallback(cardPlayTask, new LiveInlineTrackerCallback(wVar.n()));
        }
        cardPlayTask.setChronosEnable(true);
        cardPlayTask.addPlayerStateChangedCallback(new a(this));
        cardPlayTask.setMute(true);
        LiveInlineBufferingCallback liveInlineBufferingCallback = this.f77846m;
        if (liveInlineBufferingCallback != null) {
            cardPlayTask.addPlayerBufferingCallback(liveInlineBufferingCallback);
        }
        return cardPlayTask;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean d() {
        fp0.w wVar = (fp0.w) getBindData();
        boolean z6 = false;
        if (wVar != null) {
            z6 = false;
            if (wVar.getShareMenuEnable()) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final BasePegasusPlayerData getData() {
        return (fp0.w) getBindData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.common.inline.InterfaceC5582a
    @NotNull
    public final View getItemView() {
        return this.itemView;
    }

    @NotNull
    public final Class<? extends LiveSmallInlinePanel> getPanelType() {
        return LiveSmallInlinePanel.class;
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

    @Override // com.bilibili.pegasus.common.inlineplay.d
    public final void i() {
        fp0.w wVar = (fp0.w) getBindData();
        if (wVar != null) {
            C8340D.k(wVar, 3);
        }
    }

    public final boolean isCardMute() {
        return true;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final boolean isFavorite() {
        return false;
    }

    public final void onBind(PegasusHolderData pegasusHolderData, List list) {
        fp0.w wVar = (fp0.w) pegasusHolderData;
        if (list.contains("PAYLOAD_UPDATE_TRANSLATE")) {
            E0(wVar);
        } else {
            super/*com.bilibili.pegasus.PegasusHolder*/.onBind(wVar, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void onBindPanel(InlinePanel inlinePanel) {
        LiveSmallInlinePanel liveSmallInlinePanel = (LiveSmallInlinePanel) inlinePanel;
        super.onBindPanel(liveSmallInlinePanel);
        liveSmallInlinePanel.addCardPlayStateChangedCallback(this);
        liveSmallInlinePanel.addPlayerRenderCallback(this);
        fp0.w wVar = (fp0.w) getBindData();
        if (wVar == null) {
            return;
        }
        ListExtentionsKt.setTextWithIcon$default(liveSmallInlinePanel.getMCoverLeftText1(), wVar.getCoverLeftText1(), wVar.getCoverLeftIcon1(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setTextWithIcon$default(liveSmallInlinePanel.getMCoverLeftText2(), wVar.getCoverLeftText2(), wVar.getCoverLeftIcon2(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        boolean z6 = false;
        if (TextUtils.isEmpty(wVar.getCoverRightText())) {
            ListExtentionsKt.gone(liveSmallInlinePanel.getMCoverRightText());
        } else {
            liveSmallInlinePanel.getMCoverRightText().setText(this.f77844k.f53819m.tagBuilder().setTagText(wVar.getCoverRightText()).setTagTextSize(this.itemView.getResources().getDimensionPixelSize(2131166065)).setTagTextColorRes(R$color.Wh0_u).setTagBackgroundStyle(4).setTagLeftSpacing(0).setTagHorizontalPadding(0).setTagVerticalPadding(0).build(true));
            ViewExtKt.visible(liveSmallInlinePanel.getMCoverRightText());
        }
        ViewExtKt.visible(liveSmallInlinePanel.getMCoverRightContainer());
        C8614c.e(liveSmallInlinePanel.getMCoverRightIcon(), null, wVar.h(), "pegasus-android-gif", 0, 0, null, null, null, null, 1016);
        BiliImageView mCoverRightIcon = liveSmallInlinePanel.getMCoverRightIcon();
        String strH = wVar.h();
        if (strH == null || StringsKt.isBlank(strH)) {
            z6 = true;
        }
        mCoverRightIcon.setVisibility(ListExtentionsKt.toVisibility(true ^ z6));
        final int i7 = 0;
        liveSmallInlinePanel.setOnClickListener(new Function1(this, i7) { // from class: com.bilibili.pegasus.holders.Z0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77657a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f77658b;

            {
                this.f77657a = i7;
                this.f77658b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:326:0x0733  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r10) {
                /*
                    Method dump skipped, instruction units count: 2251
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.Z0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        liveSmallInlinePanel.setOnLongClickListener(new Vd0.j(this, 1));
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineToastTask(liveSmallInlinePanel))).execute();
        LiveInlineBufferingCallback liveInlineBufferingCallback = this.f77846m;
        if (liveInlineBufferingCallback != null) {
            liveInlineBufferingCallback.checkLiveCanPlay(wVar.p());
        }
    }

    /* JADX INFO: renamed from: onHolderVisibleStateChanged-9yN0R78, reason: not valid java name */
    public final void m8122onHolderVisibleStateChanged9yN0R78(int i7, int i8) {
        super/*com.bilibili.pegasus.PegasusHolder*/.onHolderVisibleStateChanged-9yN0R78(i7, i8);
        if (Lh.i.b() && HolderVisibleState.getAllVisible-impl(i7) && !HolderVisibleState.getAllVisible-impl(i8)) {
            InlinePlayReporterKt.reportTryAutoPlayEvent(AutoPlayTriggerType.PAGE_INVISIBLE, "cover_v9", false);
            IInlineControl inlineControl = getInlineControl();
            if (inlineControl != null) {
                inlineControl.stopPlay(this);
            }
        }
    }

    public final void onPageVisibleStateChanged(boolean z6) {
        super/*com.bilibili.pegasus.PegasusHolder*/.onPageVisibleStateChanged(z6);
        if (Lh.i.b() || z6) {
            return;
        }
        InlinePlayReporterKt.reportTryAutoPlayEvent(AutoPlayTriggerType.PAGE_INVISIBLE, "cover_v9", false);
        IInlineControl inlineControl = getInlineControl();
        if (inlineControl != null) {
            inlineControl.stopPlay(this);
        }
    }

    public final void onPrepared(@NotNull ICardPlayerContext iCardPlayerContext) {
        super.onPrepared(iCardPlayerContext);
        BLog.i("SmallCoverV9Card", "onPrepared");
        D0(iCardPlayerContext.getVideoWidth(), iCardPlayerContext.getVideoHeight());
    }

    public final void onRecycle() {
        LiveInlineBufferingCallback liveInlineBufferingCallback = this.f77846m;
        if (liveInlineBufferingCallback != null) {
            liveInlineBufferingCallback.onViewRecycled();
        }
        super/*com.bilibili.pegasus.PegasusHolder*/.onRecycle();
    }

    public final void onVideoSizeChanged(int i7, int i8) {
        super.onVideoSizeChanged(i7, i8);
        com.bilibili.bplus.im.protobuf.a.b(i7, i8, "onVideoSizeChanged width:", " height:", "SmallCoverV9Card");
        D0(i7, i8);
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @NotNull
    public final TextView q0() {
        return this.f77849p;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @NotNull
    public final TextView r0() {
        return this.f77850q;
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @NotNull
    public final TextView s0() {
        return this.f77851r;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final void setPlaySpeed(float f7) {
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @NotNull
    public final TextView t0() {
        return this.f77848o;
    }

    public final void updateCardLive(boolean z6) {
        fp0.w wVar = (fp0.w) getBindData();
        if (wVar == null) {
            return;
        }
        q4.Q.a("updateCardLive ", " ", "SmallCoverV9Card", z6, wVar.f119101g1);
        boolean z7 = wVar.f119101g1;
        if (z7 && !z6) {
            F0(true);
        } else if (!z7 && z6) {
            fp0.w wVar2 = (fp0.w) getBindData();
            aq0.P0 p02 = this.f77844k;
            if (wVar2 == null || !wVar2.u()) {
                p02.f53825s.setVisibility(0);
                p02.f53810c.setVisibility(0);
            }
            Lazy lazy = this.f77847n;
            if (((Animator) lazy.getValue()).isRunning()) {
                ((Animator) lazy.getValue()).cancel();
            }
            ListExtentionsKt.gone(this.f77845l);
            ViewExtKt.visible(p02.f53827u);
            ListExtentionsKt.gone(p02.f53814g.f54017b);
        }
        if (!z6) {
            C8340D.k(wVar, 2);
        }
        wVar.f119101g1 = z6;
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5583b
    public final long w() {
        ICardPlayerContext cardPlayerContext;
        LiveSmallInlinePanel liveSmallInlinePanel = this.f77861g;
        return (liveSmallInlinePanel == null || (cardPlayerContext = liveSmallInlinePanel.getCardPlayerContext()) == null) ? 0L : cardPlayerContext.getCurrentPosition();
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5656f
    public final void y0() {
        fp0.w wVar = (fp0.w) getBindData();
        if (wVar == null) {
            return;
        }
        z0().bindViewPlay(new X0(0, wVar, this), new Pa.J(this, 5), false, false, C8340D.d(wVar));
    }
}
