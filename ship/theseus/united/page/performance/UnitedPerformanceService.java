package com.bilibili.ship.theseus.united.page.performance;

import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.performance.BootOpt;
import com.bilibili.lib.performance.Scene;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.keel.player.j;
import com.tencent.map.geolocation.TencentLocation;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.videopage.common.performance.PerformanceTracerImpl;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/performance/UnitedPerformanceService.class */
@StabilityInferred(parameters = 1)
public final class UnitedPerformanceService {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.performance.UnitedPerformanceService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/performance/UnitedPerformanceService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final h $keelPlayer;
        final com.bilibili.ship.theseus.united.page.performance.a $performanceTracker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(h hVar, com.bilibili.ship.theseus.united.page.performance.a aVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$keelPlayer = hVar;
            this.$performanceTracker = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$keelPlayer, this.$performanceTracker, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(this.$keelPlayer.f91111e);
                this.label = 1;
                Object objA = com.bilibili.ogv.infra.coroutine.b.a(stateFlowAsStateFlow, this);
                obj = objA;
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    long jLongValue = ((Number) obj).longValue();
                    this.$performanceTracker.a(Boxing.boxInt(ConnectivityMonitor.getInstance().isWifiActive() ? 1 : 0), TencentLocation.NETWORK_PROVIDER);
                    this.$performanceTracker.c(PerformanceTracerImpl.Entry.ON_PLAYER_FIRST_FRAME.attach(jLongValue));
                    BootOpt.INSTANCE.reportAwakeTime(Scene.UGC_VIDEO_FIRST_FRAME, Boxing.boxLong(jLongValue));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            this.label = 2;
            Object objU = ((j) obj).u(this);
            obj = objU;
            if (objU == coroutine_suspended) {
                return coroutine_suspended;
            }
            long jLongValue2 = ((Number) obj).longValue();
            this.$performanceTracker.a(Boxing.boxInt(ConnectivityMonitor.getInstance().isWifiActive() ? 1 : 0), TencentLocation.NETWORK_PROVIDER);
            this.$performanceTracker.c(PerformanceTracerImpl.Entry.ON_PLAYER_FIRST_FRAME.attach(jLongValue2));
            BootOpt.INSTANCE.reportAwakeTime(Scene.UGC_VIDEO_FIRST_FRAME, Boxing.boxLong(jLongValue2));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.performance.UnitedPerformanceService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/performance/UnitedPerformanceService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final h $keelPlayer;
        final com.bilibili.ship.theseus.united.page.performance.a $performanceTracker;
        final IPlayerCoreService $playCoreService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(h hVar, IPlayerCoreService iPlayerCoreService, com.bilibili.ship.theseus.united.page.performance.a aVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$keelPlayer = hVar;
            this.$playCoreService = iPlayerCoreService;
            this.$performanceTracker = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$keelPlayer, this.$playCoreService, this.$performanceTracker, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(2:6|(7:8|20|27|21|22|23|24)(2:9|10))(1:11))(2:12|(2:14|15))|16|(2:18|19)|20|27|21|22|23|24) */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.performance.UnitedPerformanceService.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/performance/UnitedPerformanceService$a.class */
    public static final class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.ship.theseus.united.page.performance.a f102230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C7893a f102231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C8043a f102232c;

        public a(com.bilibili.ship.theseus.united.page.performance.a aVar, C7893a c7893a, C8043a c8043a) {
            this.f102230a = aVar;
            this.f102231b = c7893a;
            this.f102232c = c8043a;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            super.onResume(lifecycleOwner);
            this.f102230a.b(PerformanceTracerImpl.Entry.ON_RESUME.attach(SystemClock.elapsedRealtime()));
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onStop(androidx.lifecycle.LifecycleOwner r5) {
            /*
                Method dump skipped, instruction units count: 203
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.performance.UnitedPerformanceService.a.onStop(androidx.lifecycle.LifecycleOwner):void");
        }
    }

    @Inject
    public UnitedPerformanceService(@NotNull CoroutineScope coroutineScope, @NotNull Lifecycle lifecycle, @NotNull com.bilibili.ship.theseus.united.page.performance.a aVar, @NotNull C7893a c7893a, @NotNull C8043a c8043a, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull h hVar) {
        lifecycle.addObserver(new a(aVar, c7893a, c8043a));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(hVar, aVar, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(hVar, iPlayerCoreService, aVar, null), 3, (Object) null);
    }
}
