package com.bilibili.ship.theseus.united.page.ad;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.adcommon.data.model.AdGameInfo;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import com.bilibili.gripper.api.ad.biz.comment.AdCommentPanelData;
import com.bilibili.gripper.api.ad.biz.panel.IPanelController;
import com.bilibili.gripper.api.ad.biz.panel.StatusCallback;
import com.bilibili.gripper.api.ad.biz.videodetail.AbsAdPanel;
import com.bilibili.gripper.api.ad.biz.videodetail.IAdPanelListener;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelData;
import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;
import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.AdPausedPagePanelData;
import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.AdUnderPlayerPanelData;
import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.AdUpperPanelData;
import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.BrandPausePageType;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdPanelHelper.class */
@StabilityInferred(parameters = 0)
public final class AdPanelHelper implements IPanelController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f98893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final IPanelData f98895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final IAdPanelListener f98896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final FunctionReferenceImpl f98897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final FunctionReferenceImpl f98898g;

    @NotNull
    public final AdPanelRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f98899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final a<?> f98900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Job f98901k;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.ad.AdPanelHelper$showPanel$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdPanelHelper$showPanel$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a<?> $panelComponent;
        int label;
        final AdPanelHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdPanelHelper adPanelHelper, a<?> aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = adPanelHelper;
            this.$panelComponent = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$0() {
            return 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$1(AdPanelHelper adPanelHelper) {
            return adPanelHelper.f98899i.f() ? 3 : 1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$panelComponent, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #0 {all -> 0x0024, blocks: (B:10:0x001d, B:16:0x0036, B:18:0x0046, B:23:0x0058, B:25:0x0071, B:27:0x007a, B:32:0x008d, B:37:0x009a, B:30:0x0088, B:39:0x00a3, B:41:0x00b1, B:45:0x00e1, B:51:0x0101, B:55:0x0133), top: B:70:0x000b }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 404
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.ad.AdPanelHelper.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AdPanelHelper(@NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull TheseusFloatLayerService theseusFloatLayerService, int i7, @Nullable IPanelData iPanelData, @Nullable IAdPanelListener iAdPanelListener, @NotNull Function1 function1, @NotNull Function1 function12, @NotNull AdPanelRepository adPanelRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        AbsAdPanel brandPausedPagePanel;
        AdGameInfo adGameInfo;
        this.f98892a = coroutineScope;
        this.f98893b = theseusFloatLayerService;
        this.f98894c = i7;
        this.f98895d = iPanelData;
        this.f98896e = iAdPanelListener;
        this.f98897f = (FunctionReferenceImpl) function1;
        this.f98898g = (FunctionReferenceImpl) function12;
        this.h = adPanelRepository;
        this.f98899i = aVar;
        b bVar = new b(this);
        Integer numValueOf = iPanelData != null ? Integer.valueOf(iPanelData.getAdScene()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            if (i7 == 0) {
                AdPanelUIType adPanelUIType = AdPanelUIType.Normal;
                AbsAdPanel upperH5Panel = GAdBizKt.getGAdVideoDetail().getPanel().getUpperH5Panel(fragmentActivity);
                a<?> aVar2 = null;
                if (upperH5Panel != null) {
                    upperH5Panel.setMWrapperPanel(bVar);
                    upperH5Panel.setController(this);
                    aVar2 = new a<>(upperH5Panel, (AdUpperPanelData) (iPanelData instanceof AdUpperPanelData ? iPanelData : null));
                    aVar2.f98954c = adPanelUIType;
                }
                this.f98900j = aVar2;
                return;
            }
            if (i7 == 1) {
                AdPanelUIType adPanelUIType2 = AdPanelUIType.Normal;
                AbsAdPanel upperGamePanel = GAdBizKt.getGAdVideoDetail().getPanel().getUpperGamePanel(fragmentActivity);
                a<?> aVar3 = null;
                if (upperGamePanel != null) {
                    upperGamePanel.setMWrapperPanel(bVar);
                    upperGamePanel.setController(this);
                    aVar3 = new a<>(upperGamePanel, (AdUpperPanelData) (iPanelData instanceof AdUpperPanelData ? iPanelData : null));
                    aVar3.f98954c = adPanelUIType2;
                }
                this.f98900j = aVar3;
                return;
            }
            if (i7 != 2) {
                return;
            }
            AdPanelUIType adPanelUIType3 = AdPanelUIType.Normal;
            AbsAdPanel upperMallPanel = GAdBizKt.getGAdVideoDetail().getPanel().getUpperMallPanel(fragmentActivity);
            a<?> aVar4 = null;
            if (upperMallPanel != null) {
                upperMallPanel.setMWrapperPanel(bVar);
                upperMallPanel.setController(this);
                aVar4 = new a<>(upperMallPanel, (AdUpperPanelData) (iPanelData instanceof AdUpperPanelData ? iPanelData : null));
                aVar4.f98954c = adPanelUIType3;
            }
            this.f98900j = aVar4;
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            if (i7 == 0) {
                AdPanelUIType adPanelUIType4 = AdPanelUIType.Normal;
                AbsAdPanel commentH5Panel = GAdBizKt.getGAdVideoDetail().getPanel().getCommentH5Panel(fragmentActivity);
                a<?> aVar5 = null;
                if (commentH5Panel != null) {
                    commentH5Panel.setMWrapperPanel(bVar);
                    commentH5Panel.setController(this);
                    aVar5 = new a<>(commentH5Panel, (AdCommentPanelData) (iPanelData instanceof AdCommentPanelData ? iPanelData : null));
                    aVar5.f98954c = adPanelUIType4;
                }
                this.f98900j = aVar5;
                return;
            }
            if (i7 == 1) {
                AdPanelUIType adPanelUIType5 = AdPanelUIType.Normal;
                AbsAdPanel commentGamePanel = GAdBizKt.getGAdVideoDetail().getPanel().getCommentGamePanel(fragmentActivity);
                a<?> aVar6 = null;
                if (commentGamePanel != null) {
                    commentGamePanel.setMWrapperPanel(bVar);
                    commentGamePanel.setController(this);
                    aVar6 = new a<>(commentGamePanel, (AdCommentPanelData) (iPanelData instanceof AdCommentPanelData ? iPanelData : null));
                    aVar6.f98954c = adPanelUIType5;
                }
                this.f98900j = aVar6;
                return;
            }
            if (i7 != 2) {
                return;
            }
            AdPanelUIType adPanelUIType6 = AdPanelUIType.Normal;
            AbsAdPanel commentMallPanel = GAdBizKt.getGAdVideoDetail().getPanel().getCommentMallPanel(fragmentActivity);
            a<?> aVar7 = null;
            if (commentMallPanel != null) {
                commentMallPanel.setMWrapperPanel(bVar);
                commentMallPanel.setController(this);
                aVar7 = new a<>(commentMallPanel, (AdCommentPanelData) (iPanelData instanceof AdCommentPanelData ? iPanelData : null));
                aVar7.f98954c = adPanelUIType6;
            }
            this.f98900j = aVar7;
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != 1) {
            if ((numValueOf != null && numValueOf.intValue() == 4) || (numValueOf != null && numValueOf.intValue() == 5)) {
                if (i7 == 2) {
                    AdPanelUIType adPanelUIType7 = AdPanelUIType.Normal;
                    AbsAdPanel merchandiseMallPanel = GAdBizKt.getGAdVideoDetail().getPanel().getMerchandiseMallPanel(fragmentActivity, iPanelData != null ? iPanelData.getAdScene() : 0);
                    a<?> aVar8 = null;
                    if (merchandiseMallPanel != null) {
                        merchandiseMallPanel.setMWrapperPanel(bVar);
                        merchandiseMallPanel.setController(this);
                        aVar8 = new a<>(merchandiseMallPanel, (AdUpperPanelData) (iPanelData instanceof AdUpperPanelData ? iPanelData : null));
                        aVar8.f98954c = adPanelUIType7;
                    }
                    this.f98900j = aVar8;
                    return;
                }
                return;
            }
            if ((numValueOf != null && numValueOf.intValue() == 7) || (numValueOf != null && numValueOf.intValue() == 8)) {
                if (i7 == 3 || i7 == 4) {
                    boolean z6 = iPanelData instanceof AdPausedPagePanelData;
                    AdPausedPagePanelData adPausedPagePanelData = z6 ? (AdPausedPagePanelData) iPanelData : null;
                    if (adPausedPagePanelData == null || !adPausedPagePanelData.isBrand()) {
                        AdPanelUIType adPanelUIType8 = AdPanelUIType.PageCoverType;
                        AbsAdPanel pausedPagePanel = GAdBizKt.getGAdVideoDetail().getPanel().getPausedPagePanel(fragmentActivity);
                        a<?> aVar9 = null;
                        if (pausedPagePanel != null) {
                            pausedPagePanel.setMWrapperPanel(bVar);
                            pausedPagePanel.setController(this);
                            aVar9 = new a<>(pausedPagePanel, (AdPausedPagePanelData) (z6 ? iPanelData : null));
                            aVar9.f98954c = adPanelUIType8;
                        }
                        this.f98900j = aVar9;
                        return;
                    }
                    BrandPausePageType brandType = adPausedPagePanelData.getBrandType();
                    if (brandType == null || (brandPausedPagePanel = GAdBizKt.getGAdVideoDetail().getPanel().getBrandPausedPagePanel(fragmentActivity, brandType)) == null) {
                        return;
                    }
                    AdPanelUIType adPanelUIType9 = AdPanelUIType.PageCoverType;
                    brandPausedPagePanel.setMWrapperPanel(bVar);
                    brandPausedPagePanel.setController(this);
                    a<?> aVar10 = new a<>(brandPausedPagePanel, (AdPausedPagePanelData) (z6 ? iPanelData : null));
                    aVar10.f98954c = adPanelUIType9;
                    this.f98900j = aVar10;
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 0) {
            if (iPanelData == null || iPanelData.getAdPageCoverType() != 1) {
                AdPanelUIType adPanelUIType10 = AdPanelUIType.UnderType;
                AbsAdPanel nestedH5Panel = GAdBizKt.getGAdVideoDetail().getPanel().getNestedH5Panel(fragmentActivity, false, iPanelData != null ? iPanelData.getNewStyleVersion() : 0);
                a<?> aVar11 = null;
                if (nestedH5Panel != null) {
                    nestedH5Panel.setMWrapperPanel(bVar);
                    nestedH5Panel.setController(this);
                    aVar11 = new a<>(nestedH5Panel, (AdUnderPlayerPanelData) (iPanelData instanceof AdUnderPlayerPanelData ? iPanelData : null));
                    aVar11.f98954c = adPanelUIType10;
                }
                this.f98900j = aVar11;
                return;
            }
            AdPanelUIType adPanelUIType11 = AdPanelUIType.PageCoverType;
            AbsAdPanel nestedH5Panel2 = GAdBizKt.getGAdVideoDetail().getPanel().getNestedH5Panel(fragmentActivity, true, iPanelData.getNewStyleVersion());
            a<?> aVar12 = null;
            if (nestedH5Panel2 != null) {
                nestedH5Panel2.setMWrapperPanel(bVar);
                nestedH5Panel2.setController(this);
                aVar12 = new a<>(nestedH5Panel2, (AdUnderPlayerPanelData) (iPanelData instanceof AdUnderPlayerPanelData ? iPanelData : null));
                aVar12.f98954c = adPanelUIType11;
            }
            this.f98900j = aVar12;
            return;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                return;
            }
            if (iPanelData == null || iPanelData.getAdPageCoverType() != 1) {
                AdPanelUIType adPanelUIType12 = AdPanelUIType.UnderType;
                AbsAdPanel nestedMallPanel = GAdBizKt.getGAdVideoDetail().getPanel().getNestedMallPanel(fragmentActivity, false, iPanelData != null ? iPanelData.getNewStyleVersion() : 0);
                a<?> aVar13 = null;
                if (nestedMallPanel != null) {
                    nestedMallPanel.setMWrapperPanel(bVar);
                    nestedMallPanel.setController(this);
                    aVar13 = new a<>(nestedMallPanel, (AdUnderPlayerPanelData) (iPanelData instanceof AdUnderPlayerPanelData ? iPanelData : null));
                    aVar13.f98954c = adPanelUIType12;
                }
                this.f98900j = aVar13;
                return;
            }
            AdPanelUIType adPanelUIType13 = AdPanelUIType.PageCoverType;
            AbsAdPanel nestedMallPanel2 = GAdBizKt.getGAdVideoDetail().getPanel().getNestedMallPanel(fragmentActivity, true, iPanelData.getNewStyleVersion());
            a<?> aVar14 = null;
            if (nestedMallPanel2 != null) {
                nestedMallPanel2.setMWrapperPanel(bVar);
                nestedMallPanel2.setController(this);
                aVar14 = new a<>(nestedMallPanel2, (AdUnderPlayerPanelData) (iPanelData instanceof AdUnderPlayerPanelData ? iPanelData : null));
                aVar14.f98954c = adPanelUIType13;
            }
            this.f98900j = aVar14;
            return;
        }
        if (iPanelData == null || (adGameInfo = iPanelData.getAdGameInfo()) == null || !adGameInfo.isEffectiveGame()) {
            AdPanelUIType adPanelUIType14 = AdPanelUIType.UnderType;
            AbsAdPanel nestedGamePanel = GAdBizKt.getGAdVideoDetail().getPanel().getNestedGamePanel(fragmentActivity);
            a<?> aVar15 = null;
            if (nestedGamePanel != null) {
                nestedGamePanel.setMWrapperPanel(bVar);
                nestedGamePanel.setController(this);
                aVar15 = new a<>(nestedGamePanel, (AdUnderPlayerPanelData) (iPanelData instanceof AdUnderPlayerPanelData ? iPanelData : null));
                aVar15.f98954c = adPanelUIType14;
            }
            this.f98900j = aVar15;
            return;
        }
        if (iPanelData.getAdPageCoverType() == 1) {
            AdPanelUIType adPanelUIType15 = AdPanelUIType.PageCoverType;
            AbsAdPanel nestedGame2Panel = GAdBizKt.getGAdVideoDetail().getPanel().getNestedGame2Panel(fragmentActivity, true, iPanelData.getNewStyleVersion());
            a<?> aVar16 = null;
            if (nestedGame2Panel != null) {
                nestedGame2Panel.setMWrapperPanel(bVar);
                nestedGame2Panel.setController(this);
                aVar16 = new a<>(nestedGame2Panel, (AdUnderPlayerPanelData) (iPanelData instanceof AdUnderPlayerPanelData ? iPanelData : null));
                aVar16.f98954c = adPanelUIType15;
            }
            this.f98900j = aVar16;
            return;
        }
        AdPanelUIType adPanelUIType16 = AdPanelUIType.UnderType;
        AbsAdPanel nestedGame2Panel2 = GAdBizKt.getGAdVideoDetail().getPanel().getNestedGame2Panel(fragmentActivity, false, iPanelData.getNewStyleVersion());
        a<?> aVar17 = null;
        if (nestedGame2Panel2 != null) {
            nestedGame2Panel2.setMWrapperPanel(bVar);
            nestedGame2Panel2.setController(this);
            aVar17 = new a<>(nestedGame2Panel2, (AdUnderPlayerPanelData) (iPanelData instanceof AdUnderPlayerPanelData ? iPanelData : null));
            aVar17.f98954c = adPanelUIType16;
        }
        this.f98900j = aVar17;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.Nullable com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.ad.AdPanelHelper.a(com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason, boolean):void");
    }

    public final boolean b() {
        Job job = this.f98901k;
        boolean z6 = false;
        if (job != null) {
            z6 = false;
            if (job.isActive()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final boolean c(boolean z6) {
        if (!b()) {
            return false;
        }
        int i7 = this.f98894c;
        if (i7 == 3 || i7 == 4) {
            a(z6 ? AdPausedPageTriggerReason.CLICK_PLAYER_TOPBAR : AdPausedPageTriggerReason.BACK_PRESSED, true);
            return true;
        }
        a<?> aVar = this.f98900j;
        if (aVar != null) {
            aVar.f98952a.onBackPressed();
        }
        IPanelController.hidePanel$default(this, false, 1, (Object) null);
        return true;
    }

    public final void hidePanel(boolean z6) {
        a(null, z6);
    }

    public final void listenPanelStatus(@NotNull StatusCallback statusCallback) {
        AbsAdPanel<T> absAdPanel;
        a<?> aVar = this.f98900j;
        if (aVar == null || (absAdPanel = aVar.f98952a) == 0) {
            return;
        }
        absAdPanel.listenPanelStatus(statusCallback);
    }

    public final void releasePanel() {
        AbsAdPanel<T> absAdPanel;
        a<?> aVar = this.f98900j;
        if (aVar == null || (absAdPanel = aVar.f98952a) == 0) {
            return;
        }
        absAdPanel.onRelease();
    }

    public final void showPanel() {
        a<?> aVar = this.f98900j;
        if (aVar == null) {
            return;
        }
        this.f98901k = BuildersKt.launch$default(this.f98892a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, aVar, null), 3, (Object) null);
    }
}
