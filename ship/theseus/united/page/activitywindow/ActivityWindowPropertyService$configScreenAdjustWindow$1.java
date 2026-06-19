package com.bilibili.ship.theseus.united.page.activitywindow;

import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$configScreenAdjustWindow$1.class */
final class ActivityWindowPropertyService$configScreenAdjustWindow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ViewGroup $content;
    int label;
    final ActivityWindowPropertyService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowPropertyService$configScreenAdjustWindow$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$configScreenAdjustWindow$1$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function4<WindowInsetsCompat, c.a, WindowSizeClass, Continuation<? super Triple<? extends WindowInsetsCompat, ? extends c.a, ? extends WindowSizeClass>>, Object>, SuspendFunction {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(WindowInsetsCompat windowInsetsCompat, c.a aVar, WindowSizeClass windowSizeClass, Continuation<? super Triple<? extends WindowInsetsCompat, c.a, WindowSizeClass>> continuation) {
            return ActivityWindowPropertyService$configScreenAdjustWindow$1.invokeSuspend$lambda$0(windowInsetsCompat, aVar, windowSizeClass, continuation);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowPropertyService$configScreenAdjustWindow$1$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$configScreenAdjustWindow$1$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Triple<? extends WindowInsetsCompat, ? extends c.a, ? extends WindowSizeClass>, Continuation<? super Unit>, Object> {
        final ViewGroup $content;
        Object L$0;
        int label;
        final ActivityWindowPropertyService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ActivityWindowPropertyService activityWindowPropertyService, ViewGroup viewGroup, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = activityWindowPropertyService;
            this.$content = viewGroup;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$content, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(Triple<? extends WindowInsetsCompat, c.a, WindowSizeClass> triple, Continuation<? super Unit> continuation) {
            return create(triple, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Triple triple = (Triple) this.L$0;
            WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) triple.component1();
            c.a aVar = (c.a) triple.component2();
            WindowSizeClass windowSizeClass = (WindowSizeClass) triple.component3();
            Insets insets = windowInsetsCompat != null ? windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()) : null;
            defpackage.a.b("[theseus-united-ActivityWindowPropertyService$configScreenAdjustWindow$1$4-invokeSuspend] ", "from screen size change, insets:" + insets + ", state:" + aVar + " size:" + windowSizeClass, "ActivityWindowPropertyService$configScreenAdjustWindow$1$4-invokeSuspend");
            if (this.this$0.f98850f.f()) {
                this.this$0.f98852i.addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
                this.this$0.f98852i.addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT);
            } else {
                this.this$0.f98852i.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
                this.this$0.f98852i.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT);
            }
            if (insets == null || aVar.f102988b || !this.this$0.f98850f.f()) {
                this.$content.setPadding(0, 0, 0, 0);
            } else {
                this.$content.setPadding(0, insets.top, 0, insets.bottom);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityWindowPropertyService$configScreenAdjustWindow$1(ActivityWindowPropertyService activityWindowPropertyService, ViewGroup viewGroup, Continuation<? super ActivityWindowPropertyService$configScreenAdjustWindow$1> continuation) {
        super(2, continuation);
        this.this$0 = activityWindowPropertyService;
        this.$content = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(WindowInsetsCompat windowInsetsCompat, c.a aVar, WindowSizeClass windowSizeClass, Continuation continuation) {
        return new Triple(windowInsetsCompat, aVar, windowSizeClass);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivityWindowPropertyService$configScreenAdjustWindow$1(this.this$0, this.$content, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ActivityWindowPropertyService activityWindowPropertyService = this.this$0;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(activityWindowPropertyService.h, activityWindowPropertyService.f98846b.c(), this.this$0.f98850f.f102939c, AnonymousClass3.INSTANCE));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$content, null);
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
