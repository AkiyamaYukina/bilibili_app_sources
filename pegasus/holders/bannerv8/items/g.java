package com.bilibili.pegasus.holders.bannerv8.items;

import Jh.s;
import Th.b;
import aj0.C3227d;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.inline.anim.InlineAlphaAnim;
import com.bilibili.app.comm.list.common.inline.widgetV3.BannerGestureFrameLayout;
import com.bilibili.app.comm.list.common.widget.ListLottieBadgeTagView;
import com.bilibili.app.comm.list.widget.banneradapter.BannerController;
import com.bilibili.app.comm.list.widget.banneradapter.VideoBannerHolder;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.ViewAttachScopeKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.bililive.listplayer.ListPlayerManager;
import com.bilibili.bplus.followinglist.quick.consume.C;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.inline.card.IInlineCard;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.CardScrollStateObserver;
import com.bilibili.inline.panel.listeners.PanelDetachListener;
import com.bilibili.ogv.operation2.inlinevideo.v;
import com.bilibili.pegasus.FontSizeStrategy;
import com.bilibili.pegasus.ext.router.SpecialSpmidType;
import dp0.C6829b;
import j4.t;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import op0.C8249a;
import op0.C8250b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8340D;
import sp0.C8614c;
import tv.danmaku.android.log.BLog;
import tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.ICardPlayerInfoListener;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;
import zo0.C9208a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/g.class */
@StabilityInferred(parameters = 0)
public abstract class g<P extends Th.b> extends VideoBannerHolder implements IInlineCard<P>, CardScrollStateObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Fragment f77754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public IInlineControl f77755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gp0.d f77756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f77757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public BannerController f77758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ListPlaceHolderImageView f77759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f77760g;

    @Nullable
    public final ListLottieBadgeTagView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final CardFragmentPlayerContainerLayout f77761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public P f77762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final View f77763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final c f77764l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f77765m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public com.bilibili.ad.adview.videodetail.panel.mall.a f77766n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Job f77767o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/g$a.class */
    public final class a implements ICardPlaySateChangedCallback, ICardPlayerInfoListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g<P> f77768a;

        public a(g gVar) {
            this.f77768a = gVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.inline.card.IInlineCard, com.bilibili.pegasus.holders.bannerv8.items.g, com.bilibili.pegasus.holders.bannerv8.items.g<P extends Th.b>, java.lang.Object] */
        public final void onCompleted(@NotNull ICardPlayerContext iCardPlayerContext) {
            Job job;
            IInlineControl iInlineControl;
            g<P> gVar = this.f77768a;
            if (gVar.u0() && (iInlineControl = gVar.f77755b) != null) {
                iInlineControl.stopPlay(gVar);
            }
            C9208a.f130340a.getClass();
            if (!C9208a.a()) {
                long jT0 = gVar.t0();
                HandlerThreads.remove(0, gVar.f77766n);
                BLog.i(gVar.v0(), "card player call completed and post delay notify banner start loop");
                com.bilibili.ad.adview.videodetail.panel.mall.a aVar = new com.bilibili.ad.adview.videodetail.panel.mall.a(gVar, 2);
                gVar.f77766n = aVar;
                HandlerThreads.postDelayed(0, aVar, jT0);
                return;
            }
            long jT02 = gVar.t0();
            Job job2 = gVar.f77767o;
            if (job2 != null && job2.isActive() && (job = gVar.f77767o) != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            BLog.i(gVar.v0(), "card player call completed and post delay notify banner start loop");
            gVar.f77767o = BuildersKt.launch$default(ViewAttachScopeKt.getAttachScope(gVar.itemView), (CoroutineContext) null, (CoroutineStart) null, new BaseVideoBannerHolder$BannerInlineBehaviorWrap$delayBannerLoop2$1(jT02, gVar, null), 3, (Object) null);
        }

        public final void onInfo(int i7, @Nullable Object obj) {
            g<P> gVar = this.f77768a;
            if (i7 != 1) {
                if (i7 == 2) {
                    BannerController bannerController = gVar.f77758e;
                    if (bannerController == null || bannerController.getBannerScrollState() != 0) {
                        BLog.i(gVar.v0(), "banner card player call play start but banner is scrolling");
                        IInlineControl iInlineControl = gVar.f77755b;
                        if (iInlineControl != null) {
                            iInlineControl.stopPlay(gVar);
                            return;
                        }
                        return;
                    }
                    BLog.i(gVar.v0(), "banner card player call play start and banner is idle");
                    t.a("holder to notify banner stop to loop hasStartPlaySuccess = ", gVar.v0(), gVar.f77757d);
                    gVar.f77757d = true;
                    BannerController bannerController2 = gVar.f77758e;
                    if (bannerController2 != null) {
                        bannerController2.stopAutoLoop();
                    }
                    BannerController bannerController3 = gVar.f77758e;
                    if (bannerController3 != null) {
                        bannerController3.setIndicatorVisible(false);
                        return;
                    }
                    return;
                }
                if (i7 != 3) {
                    return;
                }
            }
            g.p0(gVar);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/g$b.class */
    public final class b extends Nh.a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/g$c.class */
    public static final class c implements PanelDetachListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g<P> f77769a;

        public c(g<P> gVar) {
            this.f77769a = gVar;
        }

        public final void onDetach(InlinePanel inlinePanel) {
            g<P> gVar = this.f77769a;
            P p7 = gVar.f77762j;
            if (p7 != null) {
                p7.removeOnDetachListener(gVar.f77764l);
            }
            gVar.f77762j = null;
        }
    }

    public g(@NotNull View view) {
        super(view);
        this.f77759f = view.findViewById(2131298941);
        this.f77760g = (TextView) view.findViewById(2131308958);
        this.h = view.findViewById(2131318540);
        this.f77761i = view.findViewWithTag(ListPlayerManager.AUTO_PLAY_VIEW_TAG);
        View viewFindViewById = view.findViewById(2131298956);
        this.f77763k = viewFindViewById == null ? null : viewFindViewById;
        this.f77764l = new c(this);
        this.f77765m = ListExtentionsKt.lazyUnsafe(new C(view, 2));
        view.setOnClickListener(new AR0.j(this, 2));
    }

    public static final void p0(g gVar) {
        t.a("holder to notify banner start to loop hasStartPlaySuccess = ", gVar.v0(), gVar.f77757d);
        if (gVar.f77757d) {
            gVar.f77757d = false;
            BannerController bannerController = gVar.f77758e;
            if (bannerController != null) {
                BannerController.startAutoLoop$default(bannerController, 0L, 1, (Object) null);
            }
            BannerController bannerController2 = gVar.f77758e;
            if (bannerController2 != null) {
                bannerController2.setIndicatorVisible(true);
            }
        }
    }

    public static void z0(Th.b bVar, WindowSizeClass windowSizeClass) {
        ListLottieBadgeTagView listLottieBadgeTagView;
        s binding;
        TextView textViewM;
        if (bVar != null && (textViewM = bVar.m()) != null) {
            textViewM.setTextSize(FontSizeStrategy.INLINE_CARD_TITLE.get(windowSizeClass));
        }
        Th.d dVar = bVar instanceof Th.d ? (Th.d) bVar : null;
        if (dVar == null || (listLottieBadgeTagView = dVar.y) == null || (binding = listLottieBadgeTagView.getBinding()) == null) {
            return;
        }
        binding.c.setTextSize(FontSizeStrategy.INLINE_CARD_SUBTITLE.get(windowSizeClass));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    public void bind() {
        Integer numValueOf = null;
        ListPlaceHolderImageView listPlaceHolderImageView = this.f77759f;
        if (listPlaceHolderImageView != null) {
            C8614c.d(listPlaceHolderImageView, s0().getCover(), null, null, 14);
        }
        this.f77761i.setId(ViewCompat.generateViewId());
        TextView textView = this.f77760g;
        if (textView != null) {
            textView.setText(s0().getTitle());
        }
        TextView textView2 = this.f77760g;
        if (textView2 != null) {
            textView2.setTextSize(FontSizeStrategy.INLINE_CARD_TITLE.get(ScreenAdjustUtilsKt.windowSize(this.itemView.getContext())));
        }
        C8614c.h(s0().getAvatar(), (ViewStub) this.f77765m.getValue(), this.itemView, s0().isAtten(), s0().getOfficialIconV2());
        ListLottieBadgeTagView listLottieBadgeTagView = this.h;
        if (listLottieBadgeTagView != null) {
            C6829b c6829bB = s0().b();
            String strB = c6829bB != null ? c6829bB.b() : null;
            C6829b c6829bB2 = s0().b();
            String strC = c6829bB2 != null ? c6829bB2.c() : null;
            C6829b c6829bB3 = s0().b();
            if (c6829bB3 != null) {
                numValueOf = Integer.valueOf(c6829bB3.a());
            }
            listLottieBadgeTagView.j0(numValueOf, strB, strC);
        }
        PlayerArgs playerArgs = s0().getPlayerArgs();
        listPlaceHolderImageView.showPlaceHolderInnerDrawable(playerArgs != null ? playerArgs.hidePlayButton : false);
        String title = s0().getTitle();
        String str = title;
        if (title == null) {
            str = "";
        }
        h.b(this, str);
    }

    @CallSuper
    @NotNull
    public BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        a aVar = new a(this);
        cardPlayTask.addCardPlayInfoListener(aVar);
        cardPlayTask.addPlayerStateChangedCallback(aVar);
        C8250b.b(cardPlayTask, z6);
        return cardPlayTask;
    }

    @NotNull
    public final IInlineCardData getCardData() {
        return s0();
    }

    @Nullable
    public final ViewGroup getInlineContainer() {
        return this.f77761i;
    }

    public final void onParentScrollStateChanged(int i7) {
        P p7;
        if (i7 != 1 || (p7 = this.f77762j) == null) {
            return;
        }
        InlineAlphaAnim inlineAlphaAnim = ((Th.b) p7).v;
        if (inlineAlphaAnim == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTransparentAnimation");
            inlineAlphaAnim = null;
        }
        inlineAlphaAnim.startShowAnim();
        Runnable runnable = ((Th.b) p7).w;
        if (runnable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAnimationRunnable");
            runnable = null;
        }
        HandlerThreads.remove(0, runnable);
        Runnable runnable2 = ((Th.b) p7).w;
        if (runnable2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAnimationRunnable");
            runnable2 = null;
        }
        HandlerThreads.postDelayed(0, runnable2, v.f70979a);
    }

    public final void onWindowSizeChanged(@NotNull WindowSizeClass windowSizeClass) {
        super.onWindowSizeChanged(windowSizeClass);
        TextView textView = this.f77760g;
        if (textView != null) {
            textView.setTextSize(FontSizeStrategy.INLINE_CARD_TITLE.get(windowSizeClass));
        }
        z0(this.f77762j, windowSizeClass);
    }

    public final void q0() {
        C3227d c3227d = new C3227d(this, 1);
        f fVar = new f(this, 0);
        PlayerArgs playerArgs = s0().getPlayerArgs();
        boolean z6 = (playerArgs == null || playerArgs.hidePlayButton) ? false : true;
        boolean z7 = false;
        if (s0().isInlinePlayable()) {
            PlayerArgs playerArgs2 = s0().getPlayerArgs();
            z7 = false;
            if (playerArgs2 != null ? playerArgs2.clickToPlay() : false) {
                z7 = true;
            }
        }
        this.f77761i.bindViewPlay(c3227d, fVar, z6, z7, C8340D.d(s0()));
    }

    public final void r0() {
        Job job;
        C9208a.f130340a.getClass();
        if (!C9208a.a()) {
            HandlerThreads.remove(0, this.f77766n);
            this.f77766n = null;
            return;
        }
        Job job2 = this.f77767o;
        if (job2 != null && job2.isActive() && (job = this.f77767o) != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f77767o = null;
    }

    public void releaseCurrentPlayer() {
        IInlineControl iInlineControl = this.f77755b;
        if (iInlineControl != null) {
            iInlineControl.stopPlay(this);
        }
        this.f77757d = false;
        r0();
    }

    @NotNull
    public final gp0.d s0() {
        gp0.d dVar = this.f77756c;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("data");
        return null;
    }

    public long t0() {
        return 0L;
    }

    public abstract boolean u0();

    @NotNull
    public abstract String v0();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // 
    @CallSuper
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public void onBindPanel(@NotNull P p7) {
        com.bilibili.pegasus.holders.bannerv8.items.c cVar = new com.bilibili.pegasus.holders.bannerv8.items.c(this, 0);
        BannerGestureFrameLayout bannerGestureFrameLayout = ((Th.b) p7).r;
        if (bannerGestureFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureView");
            bannerGestureFrameLayout = null;
        }
        bannerGestureFrameLayout.setOnDoubleClickListener(cVar);
        P p8 = this.f77762j;
        c cVar2 = this.f77764l;
        if (p8 != null) {
            p8.removeOnDetachListener(cVar2);
        }
        this.f77762j = p7;
        p7.addOnDetachListener(cVar2);
        P p9 = this.f77762j;
        if (p9 != null) {
            p9.setOnClickListener(new d(this, 0));
        }
        z0(p7, ScreenAdjustUtilsKt.windowSize(this.itemView.getContext()));
    }

    public final void x0() {
        long id = s0().getId();
        int index = s0().getIndex();
        gp0.d dVarS0 = s0();
        String type = s0().getType();
        s0().getIndex();
        h.a(dVarS0, type, String.valueOf(id), String.valueOf(index), true, null, false);
        y0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void y0() {
        C8249a.j(s0(), this.itemView.getContext(), s0().getExtraUri(), s0().getCardType(), this.f77754a, this, s0(), SpecialSpmidType.TYPE_BANNER);
    }
}
