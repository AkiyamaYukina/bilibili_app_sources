package com.bilibili.ship.theseus.united.player.gesture;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.playerbizcommon.gesture.IGestureService;
import com.bilibili.playerbizcommon.gesture.RotateGestureDetector;
import com.bilibili.playerbizcommon.gesture.d;
import com.bilibili.ship.theseus.united.page.screenstate.c;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/gesture/TheseusLargeScreenGestureResizeService.class */
@StabilityInferred(parameters = 0)
public final class TheseusLargeScreenGestureResizeService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IGestureService f104458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f104459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f104460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f104461e = new a(this);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.gesture.TheseusLargeScreenGestureResizeService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/gesture/TheseusLargeScreenGestureResizeService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusLargeScreenGestureResizeService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.gesture.TheseusLargeScreenGestureResizeService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/gesture/TheseusLargeScreenGestureResizeService$1$1.class */
        public static final class C11641 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            int label;
            final TheseusLargeScreenGestureResizeService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11641(TheseusLargeScreenGestureResizeService theseusLargeScreenGestureResizeService, Continuation<? super C11641> continuation) {
                super(2, continuation);
                this.this$0 = theseusLargeScreenGestureResizeService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C11641(this.this$0, continuation);
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
                if (this.this$0.f104460d.f()) {
                    TheseusLargeScreenGestureResizeService theseusLargeScreenGestureResizeService = this.this$0;
                    IGestureService.setResizableGestureListener$default(theseusLargeScreenGestureResizeService.f104458b, theseusLargeScreenGestureResizeService.f104461e, false, 2, null);
                } else {
                    this.this$0.f104458b.setResizableGestureListener(null, true);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusLargeScreenGestureResizeService theseusLargeScreenGestureResizeService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusLargeScreenGestureResizeService;
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
                TheseusLargeScreenGestureResizeService theseusLargeScreenGestureResizeService = this.this$0;
                StateFlow<WindowSizeClass> stateFlow = theseusLargeScreenGestureResizeService.f104460d.f102939c;
                C11641 c11641 = new C11641(theseusLargeScreenGestureResizeService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c11641, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/gesture/TheseusLargeScreenGestureResizeService$a.class */
    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusLargeScreenGestureResizeService f104462a;

        public a(TheseusLargeScreenGestureResizeService theseusLargeScreenGestureResizeService) {
            this.f104462a = theseusLargeScreenGestureResizeService;
        }

        @Override // com.bilibili.playerbizcommon.gesture.d
        public final void a() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
        }

        @Override // com.bilibili.playerbizcommon.gesture.RotateGestureDetector.OnRotateGestureListener
        public final boolean onRotate(RotateGestureDetector rotateGestureDetector) {
            return true;
        }

        @Override // com.bilibili.playerbizcommon.gesture.RotateGestureDetector.OnRotateGestureListener
        public final boolean onRotateBegin(RotateGestureDetector rotateGestureDetector) {
            return true;
        }

        @Override // com.bilibili.playerbizcommon.gesture.RotateGestureDetector.OnRotateGestureListener
        public final void onRotateEnd(RotateGestureDetector rotateGestureDetector) {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (scaleGestureDetector.getScaleFactor() > 1.0f) {
                this.f104462a.f104459c.e();
                return true;
            }
            if (scaleGestureDetector.getScaleFactor() >= 1.0f) {
                return true;
            }
            this.f104462a.f104459c.g();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f8) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    @Inject
    public TheseusLargeScreenGestureResizeService(@NotNull CoroutineScope coroutineScope, @NotNull IGestureService iGestureService, @NotNull c cVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f104457a = coroutineScope;
        this.f104458b = iGestureService;
        this.f104459c = cVar;
        this.f104460d = aVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
