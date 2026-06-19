package com.bilibili.ship.theseus.united.page.report;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.DeviceInfo;
import com.bilibili.lib.coroutineextension.j;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.oaid.MsaHelper;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/PVReportService.class */
@StabilityInferred(parameters = 0)
public final class PVReportService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f102479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Activity f102480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f102481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7893a f102482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IReporterService f102483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f102484g;

    @NotNull
    public final Bundle h = new Bundle();

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.report.PVReportService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/PVReportService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PVReportService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.report.PVReportService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/PVReportService$1$1.class */
        public static final class C11051 extends SuspendLambda implements Function2<C7893a.b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PVReportService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11051(PVReportService pVReportService, Continuation<? super C11051> continuation) {
                super(2, continuation);
                this.this$0 = pVReportService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11051 c11051 = new C11051(this.this$0, continuation);
                c11051.L$0 = obj;
                return c11051;
            }

            public final Object invoke(C7893a.b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C7893a.b bVar = (C7893a.b) this.L$0;
                C7893a.C1318a c1318a = bVar.f123399a;
                if (c1318a == null) {
                    BLog.w("PVReportService$1$1-invokeSuspend", "[theseus-united-PVReportService$1$1-invokeSuspend] episode changed but is null", (Throwable) null);
                    return Unit.INSTANCE;
                }
                long j7 = c1318a.f123395a.f123398b;
                C7893a.C1318a c1318a2 = bVar.f123400b;
                long j8 = c1318a2 != null ? c1318a2.f123395a.f123398b : 0L;
                StringBuilder sbA = z.a(j7, "episode changed: ", " -> ");
                sbA.append(j8);
                defpackage.a.b("[theseus-united-PVReportService$1$1-invokeSuspend] ", sbA.toString(), "PVReportService$1$1-invokeSuspend");
                if (j7 > 0 && j7 != j8) {
                    PVReportService pVReportService = this.this$0;
                    ComponentCallbacks2 componentCallbacks2 = pVReportService.f102480c;
                    IPvTracker iPvTracker = componentCallbacks2 instanceof IPvTracker ? (IPvTracker) componentCallbacks2 : null;
                    if (iPvTracker == null) {
                        BLog.e("PVReportService", "reportEnd, tracker is null");
                    } else {
                        HashMap map = new HashMap();
                        map.put("oaid", MsaHelper.getOaid());
                        map.put("android_id", DeviceInfo.getAndroidId(FoundationAlias.getFapp()));
                        for (Map.Entry<String, String> entry : pVReportService.f102481d.a(null).entrySet()) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                        BLog.i("PVReportService", "reportEnd, " + map);
                        PageViewTracker.end(iPvTracker, map);
                    }
                    ComponentCallbacks2 componentCallbacks22 = this.this$0.f102480c;
                    IPvTracker iPvTracker2 = componentCallbacks22 instanceof IPvTracker ? (IPvTracker) componentCallbacks22 : null;
                    if (iPvTracker2 == null) {
                        BLog.e("PVReportService", "reportStart, tracker is null");
                    } else {
                        PageViewTracker.start(iPvTracker2, MapsKt.emptyMap());
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PVReportService pVReportService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pVReportService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PVReportService pVReportService = this.this$0;
                SharedFlow<C7893a.b> sharedFlow = pVReportService.f102482e.h;
                C11051 c11051 = new C11051(pVReportService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c11051, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.report.PVReportService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/PVReportService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final PVReportService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.report.PVReportService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/PVReportService$2$a.class */
        public static final class a implements PlayerStateObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PVReportService f102485a;

            public a(PVReportService pVReportService) {
                this.f102485a = pVReportService;
            }

            public final void onPlayerStateChanged(int i7) {
                if (i7 == 3) {
                    PVReportService pVReportService = this.f102485a;
                    pVReportService.h.putString("player_session_id", pVReportService.f102483f.getSession());
                }
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.report.PVReportService$2$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/PVReportService$2$b.class */
        public static final class b implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PVReportService f102486a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final a f102487b;

            public b(PVReportService pVReportService, a aVar) {
                this.f102486a = pVReportService;
                this.f102487b = aVar;
            }

            public final void invoke() {
                this.f102486a.f102484g.unregisterState(this.f102487b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PVReportService pVReportService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = pVReportService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            j bVar;
            j jVar;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PVReportService pVReportService = this.this$0;
                a aVar = new a(pVReportService);
                pVReportService.f102484g.registerState(aVar, new int[]{3});
                bVar = new b(pVReportService, aVar);
                try {
                    this.L$0 = bVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    jVar = bVar;
                    th = th2;
                    jVar.invoke();
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j jVar2 = (j) this.L$0;
                jVar = jVar2;
                try {
                    ResultKt.throwOnFailure(obj);
                    bVar = jVar2;
                } catch (Throwable th3) {
                    th = th3;
                    jVar.invoke();
                    throw th;
                }
            }
            j jVar3 = bVar;
            jVar = bVar;
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public PVReportService(@NotNull CoroutineScope coroutineScope, @NotNull String str, @NotNull Activity activity, @NotNull PageReportService pageReportService, @NotNull C7893a c7893a, @NotNull IReporterService iReporterService, @NotNull IPlayerCoreService iPlayerCoreService) {
        this.f102478a = coroutineScope;
        this.f102479b = str;
        this.f102480c = activity;
        this.f102481d = pageReportService;
        this.f102482e = c7893a;
        this.f102483f = iReporterService;
        this.f102484g = iPlayerCoreService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    @NotNull
    public final Bundle a() {
        Bundle bundle = this.h;
        bundle.putString("oaid", MsaHelper.getOaid());
        bundle.putString("android_id", DeviceInfo.getAndroidId(FoundationAlias.getFapp()));
        bundle.putString("is_night_follow", MultipleThemeUtils.isNightFollowSystem(BiliContext.application()) ? "1" : "0");
        bundle.putString("sys_mode", MultipleThemeUtils.isContextModeNight(BiliContext.application()) ? "1" : "2");
        bundle.putString("app_mode", MultipleThemeUtils.isNightTheme(BiliContext.application()) ? "1" : "2");
        for (Map.Entry<String, String> entry : this.f102481d.a(null).entrySet()) {
            this.h.putString(entry.getKey(), entry.getValue());
        }
        BLog.i("PVReportService", "getPvExtra, " + this.h);
        return this.h;
    }
}
