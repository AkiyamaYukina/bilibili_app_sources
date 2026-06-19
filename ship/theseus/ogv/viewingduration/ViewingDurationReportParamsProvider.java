package com.bilibili.ship.theseus.ogv.viewingduration;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.viewingduration.ViewingDurationReportParamsProvider;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/viewingduration/ViewingDurationReportParamsProvider.class */
@StabilityInferred(parameters = 0)
public final class ViewingDurationReportParamsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f94817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ViewingDurationService f94818c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.viewingduration.ViewingDurationReportParamsProvider$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/viewingduration/ViewingDurationReportParamsProvider$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ViewingDurationReportParamsProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ViewingDurationReportParamsProvider viewingDurationReportParamsProvider, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = viewingDurationReportParamsProvider;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0(ViewingDurationReportParamsProvider viewingDurationReportParamsProvider) {
            return String.valueOf(Duration.getInWholeSeconds-impl(viewingDurationReportParamsProvider.f94818c.f94821c.a()));
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
                final ViewingDurationReportParamsProvider viewingDurationReportParamsProvider = this.this$0;
                PageReportService pageReportService = viewingDurationReportParamsProvider.f94817b;
                Pair pair = new Pair("pgc_ep_duration", new Function0(viewingDurationReportParamsProvider) { // from class: com.bilibili.ship.theseus.ogv.viewingduration.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ViewingDurationReportParamsProvider f94827a;

                    {
                        this.f94827a = viewingDurationReportParamsProvider;
                    }

                    public final Object invoke() {
                        return ViewingDurationReportParamsProvider.AnonymousClass1.invokeSuspend$lambda$0(this.f94827a);
                    }
                });
                this.label = 1;
                if (pageReportService.b(pair, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.viewingduration.ViewingDurationReportParamsProvider$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/viewingduration/ViewingDurationReportParamsProvider$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ViewingDurationReportParamsProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ViewingDurationReportParamsProvider viewingDurationReportParamsProvider, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = viewingDurationReportParamsProvider;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0(ViewingDurationReportParamsProvider viewingDurationReportParamsProvider) {
            return String.valueOf(Duration.getInWholeSeconds-impl(viewingDurationReportParamsProvider.f94818c.f94822d.a()));
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
                final ViewingDurationReportParamsProvider viewingDurationReportParamsProvider = this.this$0;
                PageReportService pageReportService = viewingDurationReportParamsProvider.f94817b;
                Pair pair = new Pair("pgc_season_duration", new Function0(viewingDurationReportParamsProvider) { // from class: com.bilibili.ship.theseus.ogv.viewingduration.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ViewingDurationReportParamsProvider f94828a;

                    {
                        this.f94828a = viewingDurationReportParamsProvider;
                    }

                    public final Object invoke() {
                        return ViewingDurationReportParamsProvider.AnonymousClass2.invokeSuspend$lambda$0(this.f94828a);
                    }
                });
                this.label = 1;
                if (pageReportService.b(pair, this) == coroutine_suspended) {
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
    public ViewingDurationReportParamsProvider(@NotNull CoroutineScope coroutineScope, @NotNull PageReportService pageReportService, @NotNull ViewingDurationService viewingDurationService) {
        this.f94816a = coroutineScope;
        this.f94817b = pageReportService;
        this.f94818c = viewingDurationService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
