package com.bilibili.ship.theseus.united.page.intro.module.season;

import Wq0.u0;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.E;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService.class */
@StabilityInferred(parameters = 0)
public final class UnitedSeasonPanelService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f101591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f101592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C8043a f101593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C7893a f101594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final E f101595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Y f101596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C6356s f101597g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f101598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f101599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f101600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f101601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final PageReportService f101602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f101603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f101604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f101605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f101606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a f101607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public AlertDialog f101608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public u0 f101609t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public Job f101610u;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UnitedSeasonPanelService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$1$1.class */
        public static final class C10531 extends SuspendLambda implements Function2<V, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UnitedSeasonPanelService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$1$1$1.class */
            public static final class C10541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final E.a $data;
                final V $showData;
                Object L$0;
                Object L$1;
                int label;
                final UnitedSeasonPanelService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10541(UnitedSeasonPanelService unitedSeasonPanelService, E.a aVar, V v7, Continuation<? super C10541> continuation) {
                    super(2, continuation);
                    this.this$0 = unitedSeasonPanelService;
                    this.$data = aVar;
                    this.$showData = v7;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10541(this.this$0, this.$data, this.$showData, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) throws Throwable {
                    com.bilibili.ship.theseus.united.page.playingarea.g gVar;
                    Throwable th;
                    String str;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) this.L$1;
                        gVar = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            gVar.j(str);
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                            gVar.j(str);
                            throw th;
                        }
                    }
                    ResultKt.throwOnFailure(obj);
                    UnitedSeasonPanelService unitedSeasonPanelService = this.this$0;
                    com.bilibili.ship.theseus.united.page.playingarea.g gVar2 = unitedSeasonPanelService.f101599j;
                    E.a aVar = this.$data;
                    V v7 = this.$showData;
                    gVar2.f("UgcSeasonPanelService");
                    try {
                        C6353o c6353o = aVar.f101468a;
                        List<C6353o> list = aVar.f101469b;
                        C c7 = aVar.f101470c;
                        AbstractC6342d abstractC6342d = v7.f101632a;
                        this.L$0 = gVar2;
                        this.L$1 = "UgcSeasonPanelService";
                        this.label = 1;
                        if (UnitedSeasonPanelService.a(unitedSeasonPanelService, c6353o, list, c7, abstractC6342d, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = "UgcSeasonPanelService";
                        gVar = gVar2;
                        gVar.j(str);
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        gVar = gVar2;
                        th = th3;
                        str = "UgcSeasonPanelService";
                        gVar.j(str);
                        throw th;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10531(UnitedSeasonPanelService unitedSeasonPanelService, Continuation<? super C10531> continuation) {
                super(2, continuation);
                this.this$0 = unitedSeasonPanelService;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(UnitedSeasonPanelService unitedSeasonPanelService, Throwable th) {
                BLog.i("UnitedSeasonPanelService$1$1-invokeSuspend$lambda$0", "[theseus-united-UnitedSeasonPanelService$1$1-invokeSuspend$lambda$0] panelJob finish");
                E e7 = unitedSeasonPanelService.f101595e;
                e7.f101461k.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10531 c10531 = new C10531(this.this$0, continuation);
                c10531.L$0 = obj;
                return c10531;
            }

            public final Object invoke(V v7, Continuation<? super Unit> continuation) {
                return create(v7, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                V v7 = (V) this.L$0;
                E.a aVar = (E.a) this.this$0.f101595e.f101453b.getValue();
                if (aVar == null) {
                    BLog.i("UnitedSeasonPanelService$1$1-invokeSuspend", "[theseus-united-UnitedSeasonPanelService$1$1-invokeSuspend] show season panel data is null");
                    return Unit.INSTANCE;
                }
                Job job = this.this$0.f101610u;
                if (job != null && job.isActive()) {
                    BLog.i("UnitedSeasonPanelService$1$1-invokeSuspend", "[theseus-united-UnitedSeasonPanelService$1$1-invokeSuspend] show season panel, panel job is active");
                    return Unit.INSTANCE;
                }
                UnitedSeasonPanelService unitedSeasonPanelService = this.this$0;
                unitedSeasonPanelService.f101610u = BuildersKt.launch$default(unitedSeasonPanelService.f101591a, (CoroutineContext) null, (CoroutineStart) null, new C10541(unitedSeasonPanelService, aVar, v7, null), 3, (Object) null);
                final UnitedSeasonPanelService unitedSeasonPanelService2 = this.this$0;
                Job job2 = unitedSeasonPanelService2.f101610u;
                if (job2 != null) {
                    job2.invokeOnCompletion(new Function1(unitedSeasonPanelService2) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.M

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final UnitedSeasonPanelService f101496a;

                        {
                            this.f101496a = unitedSeasonPanelService2;
                        }

                        public final Object invoke(Object obj2) {
                            return UnitedSeasonPanelService.AnonymousClass1.C10531.invokeSuspend$lambda$0(this.f101496a, (Throwable) obj2);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UnitedSeasonPanelService unitedSeasonPanelService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = unitedSeasonPanelService;
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
                UnitedSeasonPanelService unitedSeasonPanelService = this.this$0;
                SharedFlow<V> sharedFlow = unitedSeasonPanelService.f101595e.f101455d;
                C10531 c10531 = new C10531(unitedSeasonPanelService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c10531, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UnitedSeasonPanelService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final UnitedSeasonPanelService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UnitedSeasonPanelService unitedSeasonPanelService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = unitedSeasonPanelService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Job job = this.this$0.f101610u;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.this$0.f101610u = null;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UnitedSeasonPanelService unitedSeasonPanelService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = unitedSeasonPanelService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UnitedSeasonPanelService unitedSeasonPanelService = this.this$0;
                SharedFlow<Unit> sharedFlow = unitedSeasonPanelService.f101595e.f101460j;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(unitedSeasonPanelService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$SeasonShareSid.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class SeasonShareSid {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f101611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f101612b;

        public SeasonShareSid(long j7, long j8) {
            this.f101611a = j7;
            this.f101612b = j8;
        }
    }

    @Inject
    public UnitedSeasonPanelService(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity, @NotNull C8043a c8043a, @NotNull C7893a c7893a, @NotNull E e7, @NotNull Y y6, @NotNull C6356s c6356s, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull ActivityColorRepository activityColorRepository, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull BackActionRepository backActionRepository, @NotNull PageReportService pageReportService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar2) {
        this.f101591a = coroutineScope;
        this.f101592b = componentActivity;
        this.f101593c = c8043a;
        this.f101594d = c7893a;
        this.f101595e = e7;
        this.f101596f = y6;
        this.f101597g = c6356s;
        this.h = cVar;
        this.f101598i = activityColorRepository;
        this.f101599j = gVar;
        this.f101600k = theseusFloatLayerService;
        this.f101601l = backActionRepository;
        this.f101602m = pageReportService;
        this.f101603n = iPlayerSettingService;
        this.f101604o = iPlayerCoreService;
        this.f101605p = aVar;
        this.f101606q = introContentSizeRepository;
        this.f101607r = aVar2;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01ff  */
    /* JADX WARN: Type inference failed for: r0v62, types: [com.bilibili.ship.theseus.united.page.intro.module.season.G] */
    /* JADX WARN: Type inference failed for: r0v64, types: [com.bilibili.ship.theseus.united.page.intro.module.season.H] */
    /* JADX WARN: Type inference failed for: r0v67, types: [com.bilibili.ship.theseus.united.page.intro.module.season.I] */
    /* JADX WARN: Type inference failed for: r0v69, types: [com.bilibili.ship.theseus.united.page.intro.module.season.K] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(final com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService r19, final com.bilibili.ship.theseus.united.page.intro.module.season.C6353o r20, final java.util.List r21, com.bilibili.ship.theseus.united.page.intro.module.season.C r22, com.bilibili.ship.theseus.united.page.intro.module.season.AbstractC6342d r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService.a(com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService, com.bilibili.ship.theseus.united.page.intro.module.season.o, java.util.List, com.bilibili.ship.theseus.united.page.intro.module.season.C, com.bilibili.ship.theseus.united.page.intro.module.season.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = this.f101608s;
        if (alertDialog2 != null && alertDialog2.isShowing() && (alertDialog = this.f101608s) != null) {
            alertDialog.dismiss();
        }
        this.f101608s = null;
        u0 u0Var = this.f101609t;
        if (u0Var != null) {
            u0Var.a();
        }
        this.f101609t = null;
    }

    public final void c(String str) {
        HashMap mapC = O4.b.c("action_type", str);
        Unit unit = Unit.INSTANCE;
        PageReportService.g(this.f101602m, "united.player-video-detail.drama-float.button.click", mapC, 4);
    }
}
