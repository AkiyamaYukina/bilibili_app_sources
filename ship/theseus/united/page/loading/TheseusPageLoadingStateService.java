package com.bilibili.ship.theseus.united.page.loading;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.FloatLayerManager;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import com.bilibili.ship.theseus.united.widget.TouchAwareConstraintLayout;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/loading/TheseusPageLoadingStateService.class */
@StabilityInferred(parameters = 0)
public final class TheseusPageLoadingStateService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Flow<a> f102016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f102017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f102018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final FloatLayerManager f102019d = new FloatLayerManager();

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.loading.TheseusPageLoadingStateService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/loading/TheseusPageLoadingStateService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPageLoadingStateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.loading.TheseusPageLoadingStateService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/loading/TheseusPageLoadingStateService$1$1.class */
        public static final class C10691 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusPageLoadingStateService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10691(TheseusPageLoadingStateService theseusPageLoadingStateService, Continuation<? super C10691> continuation) {
                super(2, continuation);
                this.this$0 = theseusPageLoadingStateService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10691 c10691 = new C10691(this.this$0, continuation);
                c10691.L$0 = obj;
                return c10691;
            }

            public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = (a) this.L$0;
                    if (aVar == null) {
                        return Unit.INSTANCE;
                    }
                    FloatLayerManager floatLayerManager = this.this$0.f102019d;
                    TouchAwareConstraintLayout touchAwareConstraintLayout = aVar.f102020a;
                    this.label = 1;
                    if (floatLayerManager.a(touchAwareConstraintLayout, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusPageLoadingStateService theseusPageLoadingStateService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusPageLoadingStateService;
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
                TheseusPageLoadingStateService theseusPageLoadingStateService = this.this$0;
                Flow<a> flow = theseusPageLoadingStateService.f102016a;
                C10691 c10691 = new C10691(theseusPageLoadingStateService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c10691, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/loading/TheseusPageLoadingStateService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TouchAwareConstraintLayout f102020a;

        public a(@NotNull TouchAwareConstraintLayout touchAwareConstraintLayout) {
            this.f102020a = touchAwareConstraintLayout;
        }
    }

    @Inject
    public TheseusPageLoadingStateService(@NotNull CoroutineScope coroutineScope, @NotNull Flow<a> flow, @NotNull ActivityColorRepository activityColorRepository, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository) {
        this.f102016a = flow;
        this.f102017b = activityColorRepository;
        this.f102018c = theseusPageUIStyleRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
