package com.bilibili.ship.theseus.united.page.opporelay;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliContextKt;
import com.bilibili.lib.avatar.layers.internal.UtilsKt;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.relay.opporelay.BiliOppoRelay;
import com.oplus.synergy.engine.IRelayService;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kntr.base.utils.foundation.RomUtils;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import uV0.d;
import uV0.e;
import uV0.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/opporelay/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f102131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f102132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f102133c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.opporelay.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/opporelay/a$a.class */
    public static final class C1078a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f102134a;

        public C1078a(a aVar) {
            this.f102134a = aVar;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onPause(LifecycleOwner lifecycleOwner) {
            super.onPause(lifecycleOwner);
            BiliOppoRelay.f64267a = null;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            d dVar;
            super.onResume(lifecycleOwner);
            f fVarA = e.a(FoundationAlias.getFapp());
            if (fVarA != null && fVarA.i && (dVar = f.n) != null) {
                IRelayService iRelayService = dVar.c;
                if (iRelayService == null) {
                    Log.e("Synergy_OCS_RelayProxy", "");
                } else {
                    try {
                        if (1 == iRelayService.checkChannelStatus()) {
                            fVarA.c(BiliContextKt.getPackageName(BiliContext.INSTANCE));
                        }
                    } catch (RemoteException e7) {
                        e7.printStackTrace();
                    }
                }
            }
            BiliOppoRelay.f64267a = new com.bilibili.ad.adview.comment.component.dialog.a(this.f102134a, 2);
        }
    }

    @Inject
    public a(@NotNull Context context, @NotNull PlayerContainer playerContainer, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull IControlContainerService iControlContainerService) {
        Context context2;
        Lifecycle lifecycle;
        this.f102131a = playerContainer;
        this.f102132b = iPlayerCoreService;
        this.f102133c = iControlContainerService;
        if ((RomUtils.isOppoRom() || RomUtils.isOnePlusRom() || RomUtils.isRealmeRom()) && Build.VERSION.SDK_INT >= 33 && DeviceDecision.INSTANCE.getBoolean("ff_oppo_relay", false) && (context2 = (Context) new WeakReference(context).get()) != null && (lifecycle = UtilsKt.getLifecycle(context2)) != null) {
            lifecycle.addObserver(new C1078a(this));
        }
    }
}
