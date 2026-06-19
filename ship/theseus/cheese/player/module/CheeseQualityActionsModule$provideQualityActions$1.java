package com.bilibili.ship.theseus.cheese.player.module;

import android.content.Context;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.videoquality.BuyVipScene;
import com.bilibili.ship.theseus.united.page.videoquality.C6426a;
import com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j;
import eu0.C6985d;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/CheeseQualityActionsModule$provideQualityActions$1.class */
public final class CheeseQualityActionsModule$provideQualityActions$1 implements InterfaceC6436j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6985d f90655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f90656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f90657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.ship.theseus.keel.player.h f90658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BackActionRepository f90659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbsFunctionWidgetService f90660f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/CheeseQualityActionsModule$provideQualityActions$1$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f90661a;

        static {
            int[] iArr = new int[BuyVipScene.values().length];
            try {
                iArr[BuyVipScene.QUALITY_SWITCH_PANEL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BuyVipScene.TRIAL_END_TOAST_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f90661a = iArr;
        }
    }

    public CheeseQualityActionsModule$provideQualityActions$1(C6985d c6985d, CoroutineScope coroutineScope, Context context, com.bilibili.ship.theseus.keel.player.h hVar, BackActionRepository backActionRepository, AbsFunctionWidgetService absFunctionWidgetService) {
        this.f90655a = c6985d;
        this.f90656b = coroutineScope;
        this.f90657c = context;
        this.f90658d = hVar;
        this.f90659e = backActionRepository;
        this.f90660f = absFunctionWidgetService;
    }

    @Override // com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j
    public final void a(int i7, String str) {
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
        layoutParams.setLayoutType(32);
        BuildersKt.launch$default(this.f90656b, (CoroutineContext) null, (CoroutineStart) null, new CheeseQualityActionsModule$provideQualityActions$1$limitedForVip$1(this.f90657c, this.f90658d, this.f90659e, this.f90660f, layoutParams, str, i7, null), 3, (Object) null);
    }

    @Override // com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j
    public final C6426a c(BuyVipScene buyVipScene, com.bilibili.player.tangram.basic.a aVar) {
        long j7 = this.f90655a.f117510e;
        Object obj = aVar;
        if (aVar == null) {
            obj = "qn";
        }
        String str = j7 + "-" + obj;
        int i7 = a.f90661a[buyVipScene.ordinal()];
        return new C6426a("29", str, i7 != 1 ? i7 != 2 ? "" : "player.player.try-to-watch.click.player" : "player.player.vip-guide.click.player", MapsKt.emptyMap());
    }

    @Override // com.bilibili.ship.theseus.united.page.videoquality.InterfaceC6436j
    public final boolean g() {
        return !this.f90655a.f117518n;
    }
}
