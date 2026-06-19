package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.AbstractC6342d;
import com.bilibili.ship.theseus.united.page.intro.module.season.E;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.List;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonService.class */
@StabilityInferred(parameters = 0)
public final class UnitedSeasonService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f101614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final E f101615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f101616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f101617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f101618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C7893a f101619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f101620g;

    @NotNull
    public final C6356s h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IReporterService f101621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f101622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f101623k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final PageReportService f101624l;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UnitedSeasonService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonService$1$1.class */
        public static final class C10551 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            int label;
            final UnitedSeasonService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10551(UnitedSeasonService unitedSeasonService, Continuation<? super C10551> continuation) {
                super(2, continuation);
                this.this$0 = unitedSeasonService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10551(this.this$0, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x0186  */
            /* JADX WARN: Type inference failed for: r8v0, types: [com.bilibili.ship.theseus.united.page.intro.module.season.W] */
            /* JADX WARN: Type inference failed for: r9v1, types: [com.bilibili.ship.theseus.united.page.intro.module.season.X] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                /*
                    Method dump skipped, instruction units count: 538
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonService.AnonymousClass1.C10551.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UnitedSeasonService unitedSeasonService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = unitedSeasonService;
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
                UnitedSeasonService unitedSeasonService = this.this$0;
                SharedFlow<Boolean> sharedFlow = unitedSeasonService.f101615b.f101457f;
                C10551 c10551 = new C10551(unitedSeasonService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c10551, this) == coroutine_suspended) {
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

    @Inject
    public UnitedSeasonService(@NotNull CoroutineScope coroutineScope, @NotNull E e7, @NotNull IControlContainerService iControlContainerService, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull C7893a c7893a, @NotNull ActivityColorRepository activityColorRepository, @NotNull C6356s c6356s, @NotNull IReporterService iReporterService, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull PageReportService pageReportService) {
        this.f101614a = coroutineScope;
        this.f101615b = e7;
        this.f101616c = iControlContainerService;
        this.f101617d = unitedSeasonDetailRepository;
        this.f101618e = aVar;
        this.f101619f = c7893a;
        this.f101620g = activityColorRepository;
        this.h = c6356s;
        this.f101621i = iReporterService;
        this.f101622j = absFunctionWidgetService;
        this.f101623k = dVar;
        this.f101624l = pageReportService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(UnitedSeasonService unitedSeasonService, C6353o c6353o, List list, int i7) {
        if ((i7 & 2) != 0) {
            list = null;
        }
        unitedSeasonService.a(c6353o, list, AbstractC6342d.b.f101652a);
    }

    public final void a(@NotNull C6353o c6353o, @Nullable List<C6353o> list, @NotNull AbstractC6342d abstractC6342d) {
        List<C6353o> listB = list;
        if (list == null) {
            listB = this.f101617d.b();
        }
        com.bilibili.ship.theseus.united.page.view.a aVar = this.f101618e;
        long jA = aVar.a();
        String str = (String) aVar.f104039d.getValue();
        long jC = aVar.c();
        com.bilibili.ship.theseus.united.page.view.d dVar = this.f101623k;
        C c7 = new C(jA, jC, dVar.f(), str, dVar.g());
        E e7 = this.f101615b;
        e7.getClass();
        e7.f101452a.setValue(new E.a(c6353o, listB, c7));
        e7.f101454c.tryEmit(new V(abstractC6342d));
        PageReportService.i(this.f101624l, "united.player-video-detail.drama-float.0.show", null, 6);
    }
}
