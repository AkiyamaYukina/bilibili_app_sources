package com.bilibili.playerbizcommonv2.danmaku.postpanel;

import androidx.compose.foundation.Q;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.community.service.dm.v1.ClickButtonV2;
import com.bapis.bilibili.community.service.dm.v1.PostPanelBizType;
import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import com.bilibili.ship.theseus.united.page.videopiece.DanmakuTimerDelegateService;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.collection.Collections;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.IDanmakuParamsChangeObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.s;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/postpanel/DanmakuTimerService.class */
@StabilityInferred(parameters = 0)
public final class DanmakuTimerService implements IPlayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public PlayerContainer f81210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Job f81211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public PostPanelV2 f81212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public d f81213d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InjectPlayerService
    private IInteractLayerService f81216g;

    @InjectPlayerService
    private IPlayDirector h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerCoreService f81217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public DanmakuTimerDelegateService.AnonymousClass1.a f81218j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final HashMap<Long, List<PostPanelV2>> f81214e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Collections.SafeIteratorList<s> f81215f = Q.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final DanmakuTimerService$dmViewObserver$1 f81219k = new IDanmakuParamsChangeObserver(this) { // from class: com.bilibili.playerbizcommonv2.danmaku.postpanel.DanmakuTimerService$dmViewObserver$1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DanmakuTimerService f81220a;

        {
            this.f81220a = this;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onChanged(tv.danmaku.biliplayerv2.service.interact.core.model.DanmakuParams r10) {
            /*
                Method dump skipped, instruction units count: 310
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.postpanel.DanmakuTimerService$dmViewObserver$1.onChanged(tv.danmaku.biliplayerv2.service.interact.core.model.DanmakuParams):void");
        }
    };

    public static final void a(DanmakuTimerService danmakuTimerService, List list) {
        danmakuTimerService.getClass();
        e(danmakuTimerService, null);
        d dVar = danmakuTimerService.f81213d;
        if (dVar != null) {
            IPlayerCoreService iPlayerCoreService = danmakuTimerService.f81217i;
            IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
            if (iPlayerCoreService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
                iPlayerCoreService2 = null;
            }
            iPlayerCoreService2.unregisterPlayerProgressObserver(dVar);
        }
        if (list.isEmpty()) {
            return;
        }
        d dVar2 = new d(danmakuTimerService, list);
        danmakuTimerService.f81213d = dVar2;
        IPlayerCoreService iPlayerCoreService3 = danmakuTimerService.f81217i;
        if (iPlayerCoreService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService3 = null;
        }
        iPlayerCoreService3.registerPlayerProgressObserver(dVar2);
    }

    public static void e(DanmakuTimerService danmakuTimerService, final PostPanelV2 postPanelV2) {
        final PostPanelV2 postPanelV22 = danmakuTimerService.f81212c;
        if (Intrinsics.areEqual(postPanelV22, postPanelV2)) {
            return;
        }
        PostPanelBizType bizType = postPanelV2 != null ? postPanelV2.getBizType() : null;
        if (postPanelV2 != null) {
            postPanelV2.getStart();
        }
        if (postPanelV2 != null) {
            postPanelV2.getEnd();
        }
        List portraitTextList = null;
        if (postPanelV2 != null) {
            ClickButtonV2 clickButton = postPanelV2.getClickButton();
            portraitTextList = null;
            if (clickButton != null) {
                portraitTextList = clickButton.getPortraitTextList();
            }
        }
        Objects.toString(bizType);
        Objects.toString(portraitTextList);
        danmakuTimerService.f81212c = postPanelV2;
        Collections.SafeIteratorList<s> safeIteratorList = danmakuTimerService.f81215f;
        if (postPanelV2 != null) {
            BLog.i("DanmakuTimerService", "active -> " + postPanelV2.getBizType());
            final int i7 = -1;
            safeIteratorList.forEach(new Collections.IteratorAction(i7, postPanelV2) { // from class: com.bilibili.playerbizcommonv2.danmaku.postpanel.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f81223a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PostPanelV2 f81224b;

                {
                    this.f81223a = i7;
                    this.f81224b = postPanelV2;
                }

                public final void run(Object obj) {
                    ((s) obj).onPostPanelActive(this.f81223a, this.f81224b);
                }
            });
            return;
        }
        if (postPanelV22 == null) {
            return;
        }
        BLog.i("DanmakuTimerService", "inactive -> " + postPanelV22.getBizType());
        final int i8 = -1;
        safeIteratorList.forEach(new Collections.IteratorAction(i8, postPanelV22) { // from class: com.bilibili.playerbizcommonv2.danmaku.postpanel.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f81221a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PostPanelV2 f81222b;

            {
                this.f81221a = i8;
                this.f81222b = postPanelV22;
            }

            public final void run(Object obj) {
                ((s) obj).onPostPanelInactive(this.f81221a, this.f81222b);
            }
        });
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f81210a = playerContainer;
    }

    public final void c(@NotNull s sVar) {
        Collections.SafeIteratorList<s> safeIteratorList = this.f81215f;
        if (safeIteratorList.contains(sVar)) {
            return;
        }
        safeIteratorList.add(sVar);
    }

    public final void d(@NotNull s sVar) {
        Collections.SafeIteratorList<s> safeIteratorList = this.f81215f;
        if (safeIteratorList.contains(sVar)) {
            safeIteratorList.remove(sVar);
        }
    }

    public final void onStart(@Nullable PlayerSharingBundle playerSharingBundle) {
        IInteractLayerService iInteractLayerService = this.f81216g;
        IInteractLayerService iInteractLayerService2 = iInteractLayerService;
        if (iInteractLayerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("interactLayerService");
            iInteractLayerService2 = null;
        }
        iInteractLayerService2.addDanmakuParamsChangedObserver(this.f81219k);
    }

    public final void onStop() {
        Job job = this.f81211b;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f81211b = null;
        IInteractLayerService iInteractLayerService = this.f81216g;
        IInteractLayerService iInteractLayerService2 = iInteractLayerService;
        if (iInteractLayerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("interactLayerService");
            iInteractLayerService2 = null;
        }
        iInteractLayerService2.removeDanmakuParamsChangedObserver(this.f81219k);
        d dVar = this.f81213d;
        if (dVar != null) {
            IPlayerCoreService iPlayerCoreService = this.f81217i;
            IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
            if (iPlayerCoreService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
                iPlayerCoreService2 = null;
            }
            iPlayerCoreService2.unregisterPlayerProgressObserver(dVar);
        }
        e(this, null);
    }
}
