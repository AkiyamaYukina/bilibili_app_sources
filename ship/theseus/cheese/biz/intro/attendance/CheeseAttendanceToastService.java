package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import android.content.Context;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.cheese.biz.additional.CheeseActivityProgress;
import com.bilibili.ship.theseus.cheese.biz.additional.CheeseAdditionalInfo;
import com.bilibili.ship.theseus.cheese.biz.additional.CheeseAdditionalRepo;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kntr.app.ad.base.utils.TimeKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IToastService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceToastService.class */
@StabilityInferred(parameters = 0)
public final class CheeseAttendanceToastService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f89271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CheeseAdditionalRepo f89272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final i f89273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IToastService f89274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final l f89275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f89276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageReportService f89277g;

    @NotNull
    public final Context h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f89278i = LazyKt.lazy(new Ea1.d(8));

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceToastService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceToastService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseAttendanceToastService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseAttendanceToastService cheeseAttendanceToastService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseAttendanceToastService;
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
                StateFlow<CheeseAdditionalInfo> stateFlow = this.this$0.f89272b.f88999f;
                this.label = 1;
                Object objA = com.bilibili.ogv.infra.coroutine.b.a(stateFlow, this);
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
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            CheeseActivityProgress cheeseActivityProgressA = ((CheeseAdditionalInfo) obj).a();
            Long lBoxLong = cheeseActivityProgressA != null ? Boxing.boxLong(cheeseActivityProgressA.c()) : null;
            if (lBoxLong != null && lBoxLong.longValue() > 0) {
                CheeseAttendanceToastService cheeseAttendanceToastService = this.this$0;
                Duration.Companion companion = Duration.Companion;
                long duration = DurationKt.toDuration(lBoxLong.longValue(), DurationUnit.SECONDS);
                this.label = 2;
                cheeseAttendanceToastService.getClass();
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new CheeseAttendanceToastService$scheduleRefreshTask$2(duration, cheeseAttendanceToastService, null), this);
                if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objWithContext = Unit.INSTANCE;
                }
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceToastService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceToastService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseAttendanceToastService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceToastService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceToastService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CheeseAdditionalInfo, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseAttendanceToastService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceToastService$2$1$2, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceToastService$2$1$2.class */
            public static final class C06052 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final CheeseAttendanceToastService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06052(CheeseAttendanceToastService cheeseAttendanceToastService, Continuation<? super C06052> continuation) {
                    super(2, continuation);
                    this.this$0 = cheeseAttendanceToastService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C06052(this.this$0, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ((tv.danmaku.bili.widget.preference.a) this.this$0.f89278i.getValue()).o("attendance_toast_last_show_time", TimeKt.getCurrentTimeMillis());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseAttendanceToastService cheeseAttendanceToastService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseAttendanceToastService;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(CheeseAttendanceToastService cheeseAttendanceToastService) {
                l lVar = cheeseAttendanceToastService.f89275e;
                lVar.getClass();
                BuildersKt.launch$default(lVar.f89323b, (CoroutineContext) null, (CoroutineStart) null, new CheeseAttendanceService$share$1(lVar, "pugv.detail.player.activity-enrolled-share.click", null), 3, (Object) null);
                PageReportService.g(cheeseAttendanceToastService.f89277g, "pugv.detail.player.activity-enrolled-share.click", cheeseAttendanceToastService.f89273c.a(), 4);
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(CheeseAdditionalInfo cheeseAdditionalInfo, Continuation<? super Unit> continuation) {
                return create(cheeseAdditionalInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:41:0x0130  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0187  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x01ad  */
            /* JADX WARN: Type inference failed for: r4v1, types: [com.bilibili.ship.theseus.cheese.biz.intro.attendance.t] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 554
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceToastService.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheeseAttendanceToastService cheeseAttendanceToastService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheeseAttendanceToastService;
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
                CheeseAttendanceToastService cheeseAttendanceToastService = this.this$0;
                StateFlow<CheeseAdditionalInfo> stateFlow = cheeseAttendanceToastService.f89272b.f88999f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseAttendanceToastService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceToastService$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f89279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f89280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f89281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Function0<Unit> f89282d;

        public a() {
            throw null;
        }

        public a(String str, String str2, t tVar, int i7) {
            str2 = (i7 & 4) != 0 ? null : str2;
            tVar = (i7 & 8) != 0 ? null : tVar;
            this.f89279a = str;
            this.f89280b = 5000L;
            this.f89281c = str2;
            this.f89282d = tVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f89279a, aVar.f89279a) && this.f89280b == aVar.f89280b && Intrinsics.areEqual(this.f89281c, aVar.f89281c) && Intrinsics.areEqual(this.f89282d, aVar.f89282d);
        }

        public final int hashCode() {
            int iA = C3554n0.a(this.f89279a.hashCode() * 31, 31, this.f89280b);
            int iHashCode = 0;
            String str = this.f89281c;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            Function0<Unit> function0 = this.f89282d;
            if (function0 != null) {
                iHashCode = function0.hashCode();
            }
            return ((iA + iHashCode2) * 31) + iHashCode;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ToastInfo(text=");
            sb.append(this.f89279a);
            sb.append(", duration=");
            sb.append(this.f89280b);
            sb.append(", actionText=");
            sb.append(this.f89281c);
            sb.append(", onAction=");
            return Y0.c.a(sb, this.f89282d, ")");
        }
    }

    @Inject
    public CheeseAttendanceToastService(@NotNull CoroutineScope coroutineScope, @NotNull CheeseAdditionalRepo cheeseAdditionalRepo, @NotNull i iVar, @NotNull IToastService iToastService, @NotNull l lVar, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull PageReportService pageReportService, @NotNull Context context) {
        this.f89271a = coroutineScope;
        this.f89272b = cheeseAdditionalRepo;
        this.f89273c = iVar;
        this.f89274d = iToastService;
        this.f89275e = lVar;
        this.f89276f = hVar;
        this.f89277g = pageReportService;
        this.h = context;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceToastService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceToastService.a(com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceToastService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceToastService r5, com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceToastService.a r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceToastService.b(com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceToastService, com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceToastService$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
