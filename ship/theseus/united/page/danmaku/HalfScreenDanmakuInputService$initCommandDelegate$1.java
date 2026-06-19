package com.bilibili.ship.theseus.united.page.danmaku;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.player.widget.danmaku.i;
import com.bilibili.playerbizcommonv2.delegate.DelegateStoreKey;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.biliplayerv2.ScreenModeType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$initCommandDelegate$1.class */
final class HalfScreenDanmakuInputService$initCommandDelegate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final HalfScreenDanmakuInputService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$initCommandDelegate$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$initCommandDelegate$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
        int label;
        final HalfScreenDanmakuInputService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService$initCommandDelegate$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuInputService$initCommandDelegate$1$1$a.class */
        public static final class a implements com.bilibili.app.gemini.player.widget.danmaku.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final HalfScreenDanmakuInputService f99503a;

            public a(HalfScreenDanmakuInputService halfScreenDanmakuInputService) {
                this.f99503a = halfScreenDanmakuInputService;
            }

            public final boolean a() {
                HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.f99503a;
                if (halfScreenDanmakuInputService.f99457g.getScreenModeType() != ScreenModeType.THUMB) {
                    return false;
                }
                HalfScreenDanmakuInputService.i(halfScreenDanmakuInputService, null, 7);
                return true;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = halfScreenDanmakuInputService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
            return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            DelegateStoreKey<?> delegateStoreKey = i.a.a;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.this$0.f99472w.f()) {
                        return Unit.INSTANCE;
                    }
                    HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.this$0;
                    halfScreenDanmakuInputService.h.put(delegateStoreKey, new a(halfScreenDanmakuInputService));
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
                this.this$0.h.remove(delegateStoreKey);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HalfScreenDanmakuInputService$initCommandDelegate$1(HalfScreenDanmakuInputService halfScreenDanmakuInputService, Continuation<? super HalfScreenDanmakuInputService$initCommandDelegate$1> continuation) {
        super(2, continuation);
        this.this$0 = halfScreenDanmakuInputService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HalfScreenDanmakuInputService$initCommandDelegate$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            HalfScreenDanmakuInputService halfScreenDanmakuInputService = this.this$0;
            StateFlow<WindowSizeClass> stateFlow = halfScreenDanmakuInputService.f99472w.f102939c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(halfScreenDanmakuInputService, null);
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
