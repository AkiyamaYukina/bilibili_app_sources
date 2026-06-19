package com.bilibili.ogvvega.tunnel;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.bilibili.upper.module.contribute.up.web.trans.UperTransparentWebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/HandlersKt.class */
public final class HandlersKt {
    public static Handler handler;

    @NotNull
    private static final String THREAD_NAME = "ogv_grpc_thread";

    @NotNull
    private static final HandlerThread handlerThread = new HandlerThread(THREAD_NAME);

    public static final void checkThread() {
        if (Intrinsics.areEqual(Thread.currentThread(), getHandler().getLooper().getThread())) {
            return;
        }
        com.bilibili.ogv.infra.util.e.b(new IllegalStateException("must invoke in grpc thread"));
    }

    @NotNull
    public static final Handler getHandler() {
        Handler handler2 = handler;
        if (handler2 != null) {
            return handler2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("handler");
        return null;
    }

    public static final void init() {
        HandlerThread handlerThread2 = handlerThread;
        handlerThread2.start();
        setHandler(new Handler(handlerThread2.getLooper()));
    }

    public static final void runOnGRPCThread(@NotNull final Function0<Unit> function0) {
        if (Intrinsics.areEqual(Thread.currentThread(), getHandler().getLooper().getThread())) {
            function0.invoke();
        } else {
            final int i7 = 1;
            getHandler().post(new Runnable(function0, i7) { // from class: BH0.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f738a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f739b;

                {
                    this.f738a = i7;
                    this.f739b = function0;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate;
                    switch (this.f738a) {
                        case 0:
                            UperTransparentWebActivity uperTransparentWebActivity = (UperTransparentWebActivity) this.f739b;
                            if (!uperTransparentWebActivity.c0) {
                                ImageView imageView = uperTransparentWebActivity.Y;
                                ViewPropertyAnimator viewPropertyAnimatorAlpha = (imageView == null || (viewPropertyAnimatorAnimate = imageView.animate()) == null) ? null : viewPropertyAnimatorAnimate.alpha(1.0f);
                                uperTransparentWebActivity.a0 = viewPropertyAnimatorAlpha;
                                if (viewPropertyAnimatorAlpha != null) {
                                    viewPropertyAnimatorAlpha.start();
                                }
                                break;
                            }
                            break;
                        default:
                            ((Function0) this.f739b).invoke();
                            break;
                    }
                }
            });
        }
    }

    public static final void setHandler(@NotNull Handler handler2) {
        handler = handler2;
    }
}
