package com.bilibili.playerbizcommonv2.danmaku.widget;

import android.widget.PopupWindow;
import androidx.window.core.layout.WindowSizeClass;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import lr0.C7886c;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/PlayerDanmakuListFunctionWidget$startMonitoringWindowSize$1.class */
final class PlayerDanmakuListFunctionWidget$startMonitoringWindowSize$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.playerbizcommonv2.utils.r $delegate;
    int label;
    final q this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/PlayerDanmakuListFunctionWidget$startMonitoringWindowSize$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f81617a;

        public a(q qVar) {
            this.f81617a = qVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            WindowSizeClass windowSizeClass = (WindowSizeClass) obj;
            q qVar = this.f81617a;
            if (!Intrinsics.areEqual(qVar.f81688v, windowSizeClass)) {
                PlayerLog.i("BiliPlayerV2", "[player] window size changed: " + qVar.f81688v + " -> " + windowSizeClass);
                qVar.f81688v = windowSizeClass;
                or0.c cVar = qVar.f81685s;
                if (cVar != null) {
                    PopupWindow popupWindow = cVar.f124904f;
                    if (popupWindow != null) {
                        or0.c.a(popupWindow);
                    }
                    C7886c c7886c = cVar.f124899a;
                    if (c7886c != null) {
                        c7886c.f123326b = 256;
                    }
                    if (c7886c != null) {
                        c7886c.notifyDataSetChanged();
                    }
                    PlayerLog.i("BiliPlayerV2", "[player] dismissed danmaku op helper due to window size change");
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerDanmakuListFunctionWidget$startMonitoringWindowSize$1(com.bilibili.playerbizcommonv2.utils.r rVar, q qVar, Continuation<? super PlayerDanmakuListFunctionWidget$startMonitoringWindowSize$1> continuation) {
        super(2, continuation);
        this.$delegate = rVar;
        this.this$0 = qVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayerDanmakuListFunctionWidget$startMonitoringWindowSize$1(this.$delegate, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<WindowSizeClass> windowSizeFlow = this.$delegate.getWindowSizeFlow();
            a aVar = new a(this.this$0);
            this.label = 1;
            if (windowSizeFlow.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
