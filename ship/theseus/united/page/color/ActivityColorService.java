package com.bilibili.ship.theseus.united.page.color;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.widget.TouchAwareConstraintLayout;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/color/ActivityColorService.class */
@StabilityInferred(parameters = 0)
public final class ActivityColorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f99198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f99199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Flow<a> f99200d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.color.ActivityColorService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/color/ActivityColorService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ActivityColorService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.color.ActivityColorService$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/color/ActivityColorService$1$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function4<a, ActivityColorRepository.a, ActivityColorRepository.a, Continuation<? super Triple<? extends a, ? extends ActivityColorRepository.a, ? extends ActivityColorRepository.a>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(a aVar, ActivityColorRepository.a aVar2, ActivityColorRepository.a aVar3, Continuation<? super Triple<a, ActivityColorRepository.a, ActivityColorRepository.a>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$0(aVar, aVar2, aVar3, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.color.ActivityColorService$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/color/ActivityColorService$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Triple<? extends a, ? extends ActivityColorRepository.a, ? extends ActivityColorRepository.a>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ActivityColorService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(ActivityColorService activityColorService, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = activityColorService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Triple<a, ActivityColorRepository.a, ActivityColorRepository.a> triple, Continuation<? super Unit> continuation) {
                return create(triple, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Triple triple = (Triple) this.L$0;
                a aVar = (a) triple.component1();
                ActivityColorRepository.a aVar2 = (ActivityColorRepository.a) triple.component2();
                ActivityColorRepository.a aVar3 = (ActivityColorRepository.a) triple.component3();
                TouchAwareConstraintLayout touchAwareConstraintLayout = null;
                View view = aVar != null ? aVar.f99202b : null;
                if (aVar != null) {
                    touchAwareConstraintLayout = aVar.f99201a;
                }
                if (view != null) {
                    view.setBackgroundColor(aVar3 != null ? aVar3.f99194a : ContextCompat.getColor(this.this$0.f99198b, R$color.Ga2));
                }
                if (touchAwareConstraintLayout != null) {
                    touchAwareConstraintLayout.setBackgroundColor(aVar2 != null ? aVar2.f99194a : ContextCompat.getColor(this.this$0.f99198b, R$color.f64616Wh0));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityColorService activityColorService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityColorService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(a aVar, ActivityColorRepository.a aVar2, ActivityColorRepository.a aVar3, Continuation continuation) {
            return new Triple(aVar, aVar2, aVar3);
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
                ActivityColorService activityColorService = this.this$0;
                Flow<a> flow = activityColorService.f99200d;
                ActivityColorRepository activityColorRepository = activityColorService.f99199c;
                Flow flowCombine = FlowKt.combine(flow, activityColorRepository.f99184e, activityColorRepository.f99193o, AnonymousClass3.INSTANCE);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/color/ActivityColorService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TouchAwareConstraintLayout f99201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final View f99202b;

        public a(@NotNull TouchAwareConstraintLayout touchAwareConstraintLayout, @NotNull View view) {
            this.f99201a = touchAwareConstraintLayout;
            this.f99202b = view;
        }
    }

    @Inject
    public ActivityColorService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull ActivityColorRepository activityColorRepository, @NotNull Flow<a> flow) {
        this.f99197a = coroutineScope;
        this.f99198b = context;
        this.f99199c = activityColorRepository;
        this.f99200d = flow;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
