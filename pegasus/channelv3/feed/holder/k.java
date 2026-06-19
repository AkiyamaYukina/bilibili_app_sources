package com.bilibili.pegasus.channelv3.feed.holder;

import H11.Z;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.foundation.text.selection.X0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.ad.imax.IMaxRepository;
import com.bilibili.ad.imax.b;
import com.bilibili.ad.imax.player.widget.IMaxPlayerPlayerDislikeWidget;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineUGCHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineGestureSeekWidgetV3;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;
import com.bilibili.inline.plugin.DefaultCardPlayBehaviorWrap;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.pegasus.api.modelv2.BasePlayerItem;
import com.bilibili.pegasus.card.base.H;
import com.bilibili.pegasus.channelv3.feed.item.ChannelDetailLargeCoverItem;
import com.bilibili.pegasus.utils.x;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import com.bilibili.upper.module.aicollection.fragment.CPAICollectionFragment;
import com.bilibili.upper.module.aicollection.fragment.TabAICollectionFragment;
import com.bilibili.video.story.action.widget.O;
import com.bilibili.video.story.helper.N;
import gl.z;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.VectorTextView;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;
import uo0.C8747d;
import uo0.n;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/holder/k.class */
@StabilityInferred(parameters = 0)
public final class k extends d<ChannelDetailLargeCoverItem, z, com.bilibili.pegasus.channelv3.feed.inline.i> implements com.bilibili.pegasus.card.base.clickprocessors.g<ChannelDetailLargeCoverItem> {

    @NotNull
    public final ViewStub h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f75311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final a f75312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f75313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f75314l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/holder/k$a.class */
    public static final class a implements PanelDetachListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f75315a;

        public a(k kVar) {
            this.f75315a = kVar;
        }

        public final void onDetach(InlinePanel inlinePanel) {
            InlineGestureSeekBarContainer inlineGestureSeekBarContainerS0 = this.f75315a.s0();
            inlineGestureSeekBarContainerS0.resetProgress();
            ListExtentionsKt.gone(inlineGestureSeekBarContainerS0);
            inlinePanel.removeOnDetachListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@NotNull final z zVar) {
        super(zVar);
        x.a aVar = x.f78893a;
        this.h = (ViewStub) this.itemView.findViewById(2131303685);
        final int i7 = 0;
        this.f75311i = ListExtentionsKt.lazyUnsafe(new Function0(i7, zVar, this) { // from class: com.bilibili.pegasus.channelv3.feed.holder.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f75304a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f75305b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f75306c;

            {
                this.f75304a = i7;
                this.f75305b = zVar;
                this.f75306c = this;
            }

            public final Object invoke() {
                switch (this.f75304a) {
                    case 0:
                        gl.k kVar = ((z) this.f75305b).f;
                        LottieAnimationView lottieAnimationView = kVar.e;
                        k kVar2 = (k) this.f75306c;
                        n nVar = new n(kVar2);
                        BaseFragment baseFragment = kVar2.f75293b;
                        break;
                    case 1:
                        ((Function1) this.f75305b).invoke((Z) this.f75306c);
                        break;
                    default:
                        ((Function1) this.f75305b).invoke((fd1.g) this.f75306c);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        this.f75312j = new a(this);
        this.f75313k = ListExtentionsKt.lazyUnsafe(new Ex.a(this, 4));
        final int i8 = 0;
        this.f75314l = ListExtentionsKt.lazyUnsafe(new Function0(this, i8) { // from class: com.bilibili.pegasus.channelv3.feed.holder.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f75307a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f75308b;

            {
                this.f75307a = i8;
                this.f75308b = this;
            }

            public final Object invoke() {
                Object obj = this.f75308b;
                switch (this.f75307a) {
                    case 0:
                        k kVar = (k) obj;
                        return new DefaultCardPlayBehaviorWrap(kVar, kVar.f75297c);
                    case 1:
                        CPAICollectionFragment cPAICollectionFragment = ((TabAICollectionFragment) obj).s;
                        if (cPAICollectionFragment != null) {
                            cPAICollectionFragment.onShow();
                        }
                        return Unit.INSTANCE;
                    case 2:
                        int i9 = O.t;
                        String string = ((O) obj).getContext().getString(2131848659);
                        if (N.a == null) {
                            N.a = DeviceDecision.INSTANCE.dd("dd.story_danmaku_input_hint", string);
                        }
                        String str = N.a;
                        if (str == null) {
                            str = string;
                        }
                        return str;
                    case 3:
                        ((Function1) obj).invoke(0);
                        return Unit.INSTANCE;
                    default:
                        int i10 = IMaxPlayerPlayerDislikeWidget.o;
                        IMaxRepository iMaxRepository = com.bilibili.ad.imax.b.g;
                        PlayerContainer playerContainer = ((IMaxPlayerPlayerDislikeWidget) obj).d;
                        PlayerContainer playerContainer2 = playerContainer;
                        if (playerContainer == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                            playerContainer2 = null;
                        }
                        return b.a.a(ContextUtilKt.requireFragmentActivity(playerContainer2.getContext()));
                }
            }
        });
        zVar.a.setOnClickListener(new ZR.d(this, 2));
        gl.k kVar = zVar.f;
        kVar.g.setOnClickListener(new j(0, this));
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.channelv3.feed.holder.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final k f75302a;

            {
                this.f75302a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C8747d.b(this.f75302a);
                return true;
            }
        };
        kVar.g.setOnLongClickListener(onLongClickListener);
        zVar.b.setOnLongClickListener(onLongClickListener);
        this.itemView.setOnLongClickListener(onLongClickListener);
        q0().setOnLongClickListener(onLongClickListener);
    }

    public final void a(boolean z6) {
        IInlineControl iInlineControl;
        ICardPlayerContext cardPlayerContext;
        if (z6) {
            com.bilibili.pegasus.channelv3.feed.inline.i iVar = (com.bilibili.pegasus.channelv3.feed.inline.i) this.f75298d;
            if (((iVar == null || (cardPlayerContext = iVar.getCardPlayerContext()) == null) ? null : cardPlayerContext.getVideoEnvironment()) == VideoEnvironment.MOBILE_DATA) {
                PlayReason playReason = PlayReason.INLINE_MANUAL_PLAY;
                ChannelDetailLargeCoverItem channelDetailLargeCoverItem = (ChannelDetailLargeCoverItem) getData();
                PlayReason playReason2 = null;
                if (channelDetailLargeCoverItem != null) {
                    IInlineProperty cardPlayProperty = channelDetailLargeCoverItem.getCardPlayProperty();
                    playReason2 = null;
                    if (cardPlayProperty != null) {
                        playReason2 = cardPlayProperty.getPlayReason();
                    }
                }
                if (playReason == playReason2 || (iInlineControl = this.f75297c) == null) {
                    return;
                }
                iInlineControl.stopPlay(this);
            }
        }
    }

    public final void c(long j7, boolean z6) {
        ChannelDetailLargeCoverItem channelDetailLargeCoverItem = (ChannelDetailLargeCoverItem) getData();
        if (channelDetailLargeCoverItem != null && j7 == channelDetailLargeCoverItem.getAid()) {
            channelDetailLargeCoverItem.setFavorite(z6);
        }
    }

    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineUGCHistoryServiceV2) this.f75313k.getValue());
        InlineExtensionKt.addInlineBehavior(cardPlayTask, (DefaultCardPlayBehaviorWrap) this.f75314l.getValue());
        H.b(cardPlayTask, z6);
        cardPlayTask.setChronosEnable(false);
        return cardPlayTask;
    }

    public final boolean d() {
        ChannelDetailLargeCoverItem channelDetailLargeCoverItem = (ChannelDetailLargeCoverItem) getData();
        boolean z6 = false;
        if (channelDetailLargeCoverItem != null) {
            z6 = false;
            if (channelDetailLargeCoverItem.shareMenuEnable()) {
                z6 = true;
            }
        }
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    @Override // com.bilibili.pegasus.channelv3.feed.holder.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.feed.holder.k.f():void");
    }

    public final BasePlayerItem getData() {
        return (ChannelDetailLargeCoverItem) getData();
    }

    @NotNull
    public final Class<? extends com.bilibili.pegasus.channelv3.feed.inline.i> getPanelType() {
        return com.bilibili.pegasus.channelv3.feed.inline.i.class;
    }

    public final float getPlaySpeed() {
        ICardPlayerContext cardPlayerContext;
        com.bilibili.pegasus.channelv3.feed.inline.i iVar = (com.bilibili.pegasus.channelv3.feed.inline.i) this.f75298d;
        return (iVar == null || (cardPlayerContext = iVar.getCardPlayerContext()) == null) ? 1.0f : cardPlayerContext.getPlaySpeed();
    }

    public final int getPlayerState() {
        ICardPlayerContext cardPlayerContext;
        com.bilibili.pegasus.channelv3.feed.inline.i iVar = (com.bilibili.pegasus.channelv3.feed.inline.i) this.f75298d;
        return (iVar == null || (cardPlayerContext = iVar.getCardPlayerContext()) == null) ? 0 : cardPlayerContext.getPlayerState();
    }

    public final boolean isFavorite() {
        ChannelDetailLargeCoverItem channelDetailLargeCoverItem = (ChannelDetailLargeCoverItem) getData();
        boolean z6 = false;
        if (channelDetailLargeCoverItem != null) {
            z6 = false;
            if (channelDetailLargeCoverItem.isFavorite()) {
                z6 = true;
            }
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b5  */
    @Override // com.bilibili.pegasus.channelv3.feed.holder.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBind(int r10, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Object> r11) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.feed.holder.k.onBind(int, java.util.List):void");
    }

    public final void onBindPanel(InlinePanel inlinePanel) {
        com.bilibili.pegasus.channelv3.feed.inline.i iVar = (com.bilibili.pegasus.channelv3.feed.inline.i) inlinePanel;
        r0(iVar);
        ChannelDetailLargeCoverItem channelDetailLargeCoverItem = (ChannelDetailLargeCoverItem) getData();
        if (channelDetailLargeCoverItem == null) {
            return;
        }
        r0(iVar);
        VectorTextView vectorTextView = iVar.h;
        if (vectorTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText1");
            vectorTextView = null;
        }
        H.c(vectorTextView, channelDetailLargeCoverItem.getCoverLeftText1(), channelDetailLargeCoverItem.getCoverLeftIcon1());
        VectorTextView vectorTextView2 = iVar.f75333i;
        if (vectorTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coverLeftText2");
            vectorTextView2 = null;
        }
        H.c(vectorTextView2, channelDetailLargeCoverItem.getCoverLeftText2(), channelDetailLargeCoverItem.getCoverLeftIcon2());
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerS0 = s0();
        ListExtentionsKt.visible(inlineGestureSeekBarContainerS0);
        inlineGestureSeekBarContainerS0.resetProgress();
        InlineGestureSeekWidgetV3 inlineGestureSeekWidgetV3 = iVar.f75335k;
        if (inlineGestureSeekWidgetV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureSeekWidget");
            inlineGestureSeekWidgetV3 = null;
        }
        inlineGestureSeekWidgetV3.setGestureSeekBarContainer(inlineGestureSeekBarContainerS0);
        iVar.setOnClickListener(new C61.z(this, 4));
        iVar.setOnLongClickListener(new X0(this, 2));
        iVar.addOnDetachListener(this.f75312j);
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineToastTask(iVar))).execute();
    }

    public final void onScrollStateChanged(int i7) {
        com.bilibili.pegasus.channelv3.feed.inline.i iVar;
        super/*Z7.c*/.onScrollStateChanged(i7);
        if (i7 != 1 || (iVar = (com.bilibili.pegasus.channelv3.feed.inline.i) this.f75298d) == null) {
            return;
        }
        iVar.showWidgets();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InlineGestureSeekBarContainer s0() {
        ListExtentionsKt.visible(this.h);
        x.a aVar = x.f78893a;
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerFindViewById = this.itemView.findViewById(2131303684);
        ChannelDetailLargeCoverItem channelDetailLargeCoverItem = (ChannelDetailLargeCoverItem) getData();
        inlineGestureSeekBarContainerFindViewById.setProgressBarData(channelDetailLargeCoverItem != null ? channelDetailLargeCoverItem.getInlineProgressBar() : null);
        return inlineGestureSeekBarContainerFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPlaySpeed(float f7) {
        ICardPlayerContext cardPlayerContext;
        PromoToast.showMidToast(this.itemView.getContext(), f7 + "X");
        com.bilibili.pegasus.channelv3.feed.inline.i iVar = (com.bilibili.pegasus.channelv3.feed.inline.i) this.f75298d;
        if (iVar == null || (cardPlayerContext = iVar.getCardPlayerContext()) == null) {
            return;
        }
        cardPlayerContext.setPlaySpeed(f7);
    }
}
