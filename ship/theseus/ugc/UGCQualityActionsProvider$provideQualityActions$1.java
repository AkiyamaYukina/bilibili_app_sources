package com.bilibili.ship.theseus.ugc;

import android.content.Context;
import com.bilibili.ship.theseus.ugc.viewingduration.UGCViewingDurationService;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.videoquality.A0;
import com.bilibili.ship.theseus.united.page.videoquality.BuyVipScene;
import com.bilibili.ship.theseus.united.page.videoquality.C6426a;
import com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCQualityActionsProvider$provideQualityActions$1.class */
public final class UGCQualityActionsProvider$provideQualityActions$1 implements InterfaceC6436j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UGCViewingDurationService f96234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f96235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f96236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.ship.theseus.keel.player.h f96237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BackActionRepository f96238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbsFunctionWidgetService f96239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A0 f96240g;
    public final Av0.a h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCQualityActionsProvider$provideQualityActions$1$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f96241a;

        static {
            int[] iArr = new int[BuyVipScene.values().length];
            try {
                iArr[BuyVipScene.SPONSOR_TRIAL_END_TOAST_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BuyVipScene.QUALITY_SWITCH_PANEL.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BuyVipScene.TRIAL_END_TOAST_ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f96241a = iArr;
        }
    }

    public UGCQualityActionsProvider$provideQualityActions$1(UGCViewingDurationService uGCViewingDurationService, CoroutineScope coroutineScope, Context context, com.bilibili.ship.theseus.keel.player.h hVar, BackActionRepository backActionRepository, AbsFunctionWidgetService absFunctionWidgetService, A0 a02, Av0.a aVar) {
        this.f96234a = uGCViewingDurationService;
        this.f96235b = coroutineScope;
        this.f96236c = context;
        this.f96237d = hVar;
        this.f96238e = backActionRepository;
        this.f96239f = absFunctionWidgetService;
        this.f96240g = a02;
        this.h = aVar;
    }

    @Override // com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j
    public final void a(int i7, String str) {
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
        layoutParams.setLayoutType(32);
        BuildersKt.launch$default(this.f96235b, (CoroutineContext) null, (CoroutineStart) null, new UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1(this.f96236c, this.f96237d, this.f96238e, this.f96239f, layoutParams, this.f96240g, str, i7, null), 3, (Object) null);
    }

    @Override // com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j
    public final C6426a c(BuyVipScene buyVipScene, com.bilibili.player.tangram.basic.a aVar) {
        int[] iArr = a.f96241a;
        String str = iArr[buyVipScene.ordinal()] == 1 ? "9" : "29";
        long j7 = this.h.f590a;
        Object obj = aVar;
        if (aVar == null) {
            obj = "qn";
        }
        String str2 = j7 + "-" + obj;
        int i7 = iArr[buyVipScene.ordinal()];
        return new C6426a(str, str2, i7 != 1 ? i7 != 2 ? i7 != 3 ? "" : "player.player.try-to-watch.click.player" : "player.player.vip-guide.click.player" : "player.player.toast-vip-qn-end-pay-btn.click.player", MapsKt.emptyMap());
    }

    @Override // com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j
    public final Object e(long j7, Continuation<? super Unit> continuation) {
        Object objA = this.f96234a.a(j7, (ContinuationImpl) continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Override // com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j
    public final Object f(vk.e eVar, Continuation<? super Unit> continuation) {
        Duration.Companion companion = Duration.Companion;
        Object objA = this.f96234a.a(DurationKt.toDuration(eVar.c, DurationUnit.SECONDS), (ContinuationImpl) continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }
}
