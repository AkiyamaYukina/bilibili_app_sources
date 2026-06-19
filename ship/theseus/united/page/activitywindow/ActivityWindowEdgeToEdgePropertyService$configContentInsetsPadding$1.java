package com.bilibili.ship.theseus.united.page.activitywindow;

import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowEdgeToEdgePropertyService$configContentInsetsPadding$1.class */
final class ActivityWindowEdgeToEdgePropertyService$configContentInsetsPadding$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ViewGroup $content;
    int label;
    final ActivityWindowEdgeToEdgePropertyService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowEdgeToEdgePropertyService$configContentInsetsPadding$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowEdgeToEdgePropertyService$configContentInsetsPadding$1$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<WindowInsetsCompat, c.a, Continuation<? super Pair<? extends WindowInsetsCompat, ? extends c.a>>, Object>, SuspendFunction {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(WindowInsetsCompat windowInsetsCompat, c.a aVar, Continuation<? super Pair<? extends WindowInsetsCompat, c.a>> continuation) {
            return ActivityWindowEdgeToEdgePropertyService$configContentInsetsPadding$1.invokeSuspend$lambda$0(windowInsetsCompat, aVar, continuation);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowEdgeToEdgePropertyService$configContentInsetsPadding$1$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowEdgeToEdgePropertyService$configContentInsetsPadding$1$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends WindowInsetsCompat, ? extends c.a>, Continuation<? super Unit>, Object> {
        final ViewGroup $content;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ViewGroup viewGroup, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$content = viewGroup;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$content, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(Pair<? extends WindowInsetsCompat, c.a> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.L$0;
            WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) pair.component1();
            c.a aVar = (c.a) pair.component2();
            Insets insetsC = windowInsetsCompat != null ? ((s) r.f98884a.getValue()).c(windowInsetsCompat) : null;
            defpackage.a.b("[theseus-united-ActivityWindowEdgeToEdgePropertyService$configContentInsetsPadding$1$4-invokeSuspend] ", "edge-to-edge content insets change, insets:" + insetsC + ", state:" + aVar, "ActivityWindowEdgeToEdgePropertyService$configContentInsetsPadding$1$4-invokeSuspend");
            if (insetsC == null || aVar.f102988b) {
                this.$content.setPadding(0, 0, 0, 0);
            } else {
                this.$content.setPadding(insetsC.left, insetsC.top, insetsC.right, insetsC.bottom);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityWindowEdgeToEdgePropertyService$configContentInsetsPadding$1(ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService, ViewGroup viewGroup, Continuation<? super ActivityWindowEdgeToEdgePropertyService$configContentInsetsPadding$1> continuation) {
        super(2, continuation);
        this.this$0 = activityWindowEdgeToEdgePropertyService;
        this.$content = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(WindowInsetsCompat windowInsetsCompat, c.a aVar, Continuation continuation) {
        return new Pair(windowInsetsCompat, aVar);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivityWindowEdgeToEdgePropertyService$configContentInsetsPadding$1(this.this$0, this.$content, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService = this.this$0;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(activityWindowEdgeToEdgePropertyService.h, activityWindowEdgeToEdgePropertyService.f98834b.c(), AnonymousClass3.INSTANCE));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$content, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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
