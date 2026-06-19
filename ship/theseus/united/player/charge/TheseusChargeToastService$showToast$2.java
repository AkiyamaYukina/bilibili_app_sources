package com.bilibili.ship.theseus.united.player.charge;

import android.widget.FrameLayout;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.window.core.layout.WindowSizeClass;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$showToast$2.class */
final class TheseusChargeToastService$showToast$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final FrameLayout $container;
    final PlayerToast $newToast;
    private Object L$0;
    int label;
    final TheseusChargeToastService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$showToast$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$showToast$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final FrameLayout $container;
        int label;
        final TheseusChargeToastService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$showToast$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$showToast$2$1$1.class */
        public static final class C11631 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            final FrameLayout $container;
            int label;
            final TheseusChargeToastService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11631(FrameLayout frameLayout, TheseusChargeToastService theseusChargeToastService, Continuation<? super C11631> continuation) {
                super(2, continuation);
                this.$container = frameLayout;
                this.this$0 = theseusChargeToastService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C11631(this.$container, this.this$0, continuation);
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
                this.$container.removeAllViews();
                FrameLayout frameLayout = this.$container;
                final TheseusChargeToastService theseusChargeToastService = this.this$0;
                int i7 = TheseusChargeToastService.f104395j;
                theseusChargeToastService.getClass();
                ComposeView composeView = new ComposeView(theseusChargeToastService.f104397b, null, 0, 6, null);
                composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-794740322, true, new Function2(theseusChargeToastService) { // from class: com.bilibili.ship.theseus.united.player.charge.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TheseusChargeToastService f104422a;

                    {
                        this.f104422a = theseusChargeToastService;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
                        /*
                            Method dump skipped, instruction units count: 265
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.charge.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }));
                frameLayout.addView(composeView, new FrameLayout.LayoutParams(-2, -2, 80));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusChargeToastService theseusChargeToastService, FrameLayout frameLayout, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusChargeToastService;
            this.$container = frameLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$container, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusChargeToastService theseusChargeToastService = this.this$0;
                StateFlow<WindowSizeClass> stateFlow = theseusChargeToastService.h.f102939c;
                C11631 c11631 = new C11631(this.$container, theseusChargeToastService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c11631, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$showToast$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$showToast$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PlayerToast $newToast;
        int label;
        final TheseusChargeToastService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusChargeToastService theseusChargeToastService, PlayerToast playerToast, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusChargeToastService;
            this.$newToast = playerToast;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$newToast, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.f104401f.showToast(this.$newToast);
                    BLog.i("TheseusChargeToastService$showToast$2$2-invokeSuspend", "[theseus-united-TheseusChargeToastService$showToast$2$2-invokeSuspend] showToast");
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.f104401f.dismissToast(this.$newToast);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusChargeToastService$showToast$2(TheseusChargeToastService theseusChargeToastService, FrameLayout frameLayout, PlayerToast playerToast, Continuation<? super TheseusChargeToastService$showToast$2> continuation) {
        super(2, continuation);
        this.this$0 = theseusChargeToastService;
        this.$container = frameLayout;
        this.$newToast = playerToast;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusChargeToastService$showToast$2 theseusChargeToastService$showToast$2 = new TheseusChargeToastService$showToast$2(this.this$0, this.$container, this.$newToast, continuation);
        theseusChargeToastService$showToast$2.L$0 = obj;
        return theseusChargeToastService$showToast$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$container, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$newToast, null), 3, (Object) null);
    }
}
