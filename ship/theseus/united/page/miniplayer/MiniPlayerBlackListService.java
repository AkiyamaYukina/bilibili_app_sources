package com.bilibili.ship.theseus.united.page.miniplayer;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.mini.player.common.utils.i;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerWindowManager;
import j4.t;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/MiniPlayerBlackListService.class */
@StabilityInferred(parameters = 0)
public final class MiniPlayerBlackListService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lifecycle f102030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f102031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final d f102032d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.LifecycleObserver, com.bilibili.ship.theseus.united.page.miniplayer.d] */
    @Inject
    public MiniPlayerBlackListService(@NotNull CoroutineScope coroutineScope, @NotNull Lifecycle lifecycle) {
        this.f102029a = coroutineScope;
        this.f102030b = lifecycle;
        ?? r02 = new LifecycleEventObserver(this) { // from class: com.bilibili.ship.theseus.united.page.miniplayer.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MiniPlayerBlackListService f102080a;

            {
                this.f102080a = this;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                boolean zContains;
                if (event == Lifecycle.Event.ON_CREATE) {
                    Activity activity = BiliContext.topActivity();
                    if (activity != null) {
                        List list = (List) i.f66107a.getValue();
                        IMiniPlayerContainer iMiniPlayerContainerA = com.bilibili.mini.player.common.manager.b.a(activity);
                        zContains = CollectionsKt.contains(list, iMiniPlayerContainerA != null ? iMiniPlayerContainerA.getMiniPlayerContainerKey() : null);
                    } else {
                        zContains = false;
                    }
                    this.f102080a.f102031c = zContains;
                    t.a("Launched from mini player blacklist: ", "MiniPlayerBlackListService", zContains);
                }
            }
        };
        this.f102032d = r02;
        Lazy lazy = i.f66107a;
        IMiniPlayerWindowManager iMiniPlayerWindowManager = (IMiniPlayerWindowManager) BLRouter.get$default(BLRouter.INSTANCE, IMiniPlayerWindowManager.class, (String) null, 2, (Object) null);
        if (iMiniPlayerWindowManager != null) {
            iMiniPlayerWindowManager.finishMiniPlayer(true);
        }
        lifecycle.addObserver(r02);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MiniPlayerBlackListService$special$$inlined$awaitCancel$1(null, this), 3, (Object) null);
    }
}
