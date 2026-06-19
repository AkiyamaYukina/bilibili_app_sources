package com.bilibili.pegasus.holders.bannerv8.items;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.inline.widgetV3.PegasusInlineMuteWidget;
import com.bilibili.app.comm.list.common.widget.ListLottieBadgeTagView;
import com.bilibili.app.comm.list.widget.banneradapter.BannerController;
import com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.biz.InlinePlayerTrackerCallbackKt;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.biz.live.LiveContainer;
import com.bilibili.inline.biz.live.LiveInlineBufferingCallback;
import com.bilibili.inline.biz.live.LiveInlineTrackerCallback;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.moduleservice.list.IPegasusLiveInlineCardReportService;
import com.bilibili.pegasus.common.inline.InterfaceC5582a;
import dp0.C6829b;
import ep0.C6963a;
import kotlin.collections.CollectionsKt;
import op0.C8250b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8339C;
import tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/m.class */
@StabilityInferred(parameters = 0)
public final class m extends g<Th.b> implements LiveContainer, InterfaceC5582a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f77793p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public LiveInlineBufferingCallback f77794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f77795r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final String f77796s;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/m$a.class */
    public static final class a implements ICardPlaySateChangedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f77797a;

        public a(m mVar) {
            this.f77797a = mVar;
        }

        public final void onError(ICardPlayerContext iCardPlayerContext) {
            IInlineControl iInlineControl = this.f77797a.f77755b;
            if (iInlineControl != null) {
                iInlineControl.stopPlay();
            }
        }
    }

    public m(@NotNull View view, boolean z6) {
        super(view);
        this.f77793p = z6;
        this.f77795r = true;
        this.f77796s = "LiveInlineBannerHolder";
    }

    public static Bundle A0(m mVar) {
        return C6963a.e(mVar.s0(), false, true, mVar.s0().getCardGoto());
    }

    @Override // com.bilibili.pegasus.common.inline.InterfaceC5582a
    public final void U() {
        IPegasusLiveInlineCardReportService iPegasusLiveInlineCardReportServiceA = C8339C.a();
        if (iPegasusLiveInlineCardReportServiceA != null) {
            iPegasusLiveInlineCardReportServiceA.onCardShow(A0(this));
        }
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    public final void bind() {
        super.bind();
        this.f77794q = new LiveInlineBufferingCallback(this, this.f77755b, ((gp0.e) s0()).getOid(), Lh.i.a());
        q0();
        View view = this.f77763k;
        if (view != null) {
            ListExtentionsKt.gone(view);
        }
        this.f77795r = true;
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        super.configCustomTaskBehavior(cardPlayTask, z6);
        C8250b.b(cardPlayTask, z6);
        InlinePlayerTrackerCallbackKt.addInlineTrackerCallback(cardPlayTask, new LiveInlineTrackerCallback(((gp0.e) s0()).h()));
        cardPlayTask.setChronosEnable(false);
        cardPlayTask.addPlayerStateChangedCallback(new a(this));
        LiveInlineBufferingCallback liveInlineBufferingCallback = this.f77794q;
        if (liveInlineBufferingCallback != null) {
            cardPlayTask.addPlayerBufferingCallback(liveInlineBufferingCallback);
        }
        return cardPlayTask;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.common.inline.InterfaceC5582a
    @NotNull
    public final View getItemView() {
        return this.itemView;
    }

    @NotNull
    public final Class<? extends Th.b> getPanelType() {
        return this.f77793p ? Th.b.class : Th.d.class;
    }

    @NotNull
    public final ViewGroup getVideoContainer() {
        return this.f77761i;
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    public final boolean u0() {
        BannerController bannerController = this.f77758e;
        boolean z6 = false;
        if ((bannerController != null ? bannerController.getItemCount() : 0) == 1) {
            z6 = true;
        }
        return z6;
    }

    public final void updateCardLive(boolean z6) {
        PegasusInlineMuteWidget mute;
        ListLottieBadgeTagView listLottieBadgeTagView;
        boolean z7 = this.f77795r;
        this.f77795r = z6;
        CardFragmentPlayerContainerLayout cardFragmentPlayerContainerLayout = this.f77761i;
        if (z7 && !z6) {
            View view = this.f77763k;
            if (view != null) {
                ListExtentionsKt.visible(view);
            }
            cardFragmentPlayerContainerLayout.setIconVisible(false);
        } else if (!z7 && z6) {
            View view2 = this.f77763k;
            if (view2 != null) {
                ListExtentionsKt.gone(view2);
            }
        } else if (z6) {
            cardFragmentPlayerContainerLayout.setIconVisible(false);
        }
        Th.d dVar = this.f77762j;
        if ((dVar instanceof Th.d) && (listLottieBadgeTagView = dVar.y) != null) {
            listLottieBadgeTagView.setVisibility(z6 ? 0 : 8);
        }
        P p7 = this.f77762j;
        if (p7 == 0 || (mute = p7.getMute()) == null) {
            return;
        }
        mute.setVisibility(z6 ? 0 : 8);
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    @NotNull
    public final String v0() {
        return this.f77796s;
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    /* JADX INFO: renamed from: w0 */
    public final void onBindPanel(@NotNull Th.b bVar) {
        super.onBindPanel(bVar);
        C8339C.d(bVar, s0());
        bVar.getAvatar().displayAvatar(s0().getPendantAvatar());
        bVar.getDanmaku().setVisible(false);
        bVar.getDanmaku().setVisibility(8);
        bVar.m().setText(s0().getTitle());
        if (bVar instanceof Th.d) {
            Th.d dVar = (Th.d) bVar;
            C6829b c6829bB = s0().b();
            Integer numValueOf = null;
            String strB = c6829bB != null ? c6829bB.b() : null;
            C6829b c6829bB2 = s0().b();
            String strC = c6829bB2 != null ? c6829bB2.c() : null;
            C6829b c6829bB3 = s0().b();
            if (c6829bB3 != null) {
                numValueOf = Integer.valueOf(c6829bB3.a());
            }
            ListLottieBadgeTagView listLottieBadgeTagView = dVar.y;
            if (listLottieBadgeTagView != null) {
                listLottieBadgeTagView.j0(numValueOf, strB, strC);
            }
        }
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{bVar.getInline4GWarningWidget(), new InlineToastTask(bVar)})).execute();
        LiveInlineBufferingCallback liveInlineBufferingCallback = this.f77794q;
        if (liveInlineBufferingCallback != null) {
            liveInlineBufferingCallback.checkLiveCanPlay(((gp0.e) s0()).getOid());
        }
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    public final void y0() {
        IPegasusLiveInlineCardReportService iPegasusLiveInlineCardReportServiceA = C8339C.a();
        if (iPegasusLiveInlineCardReportServiceA != null) {
            iPegasusLiveInlineCardReportServiceA.onCardClick(A0(this));
        }
    }
}
