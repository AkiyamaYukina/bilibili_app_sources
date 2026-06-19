package com.bilibili.ship.theseus.united.page.screensize;

import androidx.fragment.app.FragmentActivity;
import androidx.window.core.layout.WindowSizeClass;
import c6.P;
import c6.Q;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screensize/TheseusWindowSizeRepository$init$1.class */
final class TheseusWindowSizeRepository$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FragmentActivity $activity;
    final Function1<Boolean, Unit> $setContentView;
    final Ref.BooleanRef $useLandscape;
    private Object L$0;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screensize.TheseusWindowSizeRepository$init$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screensize/TheseusWindowSizeRepository$init$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
        final CoroutineScope $$this$launch;
        final Function1<Boolean, Unit> $setContentView;
        final Ref.BooleanRef $useLandscape;
        Object L$0;
        int label;
        final a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(CoroutineScope coroutineScope, a aVar, Ref.BooleanRef booleanRef, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$this$launch = coroutineScope;
            this.this$0 = aVar;
            this.$useLandscape = booleanRef;
            this.$setContentView = function1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$launch, this.this$0, this.$useLandscape, this.$setContentView, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
            return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
            if (!CoroutineScopeKt.isActive(this.$$this$launch)) {
                BLog.w("TheseusWindowSizeRepository$init$1$1-invokeSuspend", "[theseus-united-TheseusWindowSizeRepository$init$1$1-invokeSuspend] not isActive, return", (Throwable) null);
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(this.this$0.f102938b.getValue(), windowSizeClass)) {
                defpackage.a.b("[theseus-united-TheseusWindowSizeRepository$init$1$1-invokeSuspend] ", "screenSizeFlow no change: " + windowSizeClass, "TheseusWindowSizeRepository$init$1$1-invokeSuspend");
                return Unit.INSTANCE;
            }
            boolean zA = b.a(windowSizeClass);
            boolean zD = this.this$0.d();
            boolean z6 = zA && !zD;
            StringBuilder sbA = Q.a("screenSizeFlow useLandscape:", " theseusLargeLandscape:", " isInMagicWindow:", this.$useLandscape.element, zA);
            P.a(" isLargeLandscape:", " changed: ", sbA, zD, z6);
            sbA.append(windowSizeClass);
            defpackage.a.b("[theseus-united-TheseusWindowSizeRepository$init$1$1-invokeSuspend] ", sbA.toString(), "TheseusWindowSizeRepository$init$1$1-invokeSuspend");
            Ref.BooleanRef booleanRef = this.$useLandscape;
            if (booleanRef.element != z6) {
                booleanRef.element = z6;
                this.$setContentView.invoke(Boxing.boxBoolean(z6));
            }
            this.this$0.f102938b.setValue(windowSizeClass);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TheseusWindowSizeRepository$init$1(FragmentActivity fragmentActivity, a aVar, Ref.BooleanRef booleanRef, Function1<? super Boolean, Unit> function1, Continuation<? super TheseusWindowSizeRepository$init$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.this$0 = aVar;
        this.$useLandscape = booleanRef;
        this.$setContentView = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusWindowSizeRepository$init$1 theseusWindowSizeRepository$init$1 = new TheseusWindowSizeRepository$init$1(this.$activity, this.this$0, this.$useLandscape, this.$setContentView, continuation);
        theseusWindowSizeRepository$init$1.L$0 = obj;
        return theseusWindowSizeRepository$init$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BLog.i("TheseusWindowSizeRepository$init$1-invokeSuspend", "[theseus-united-TheseusWindowSizeRepository$init$1-invokeSuspend] collect screenSizeFlow");
            Flow flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(this.$activity);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, this.this$0, this.$useLandscape, this.$setContentView, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowWindowSizeFlow, anonymousClass1, this) == coroutine_suspended) {
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
