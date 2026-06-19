package com.bilibili.ogvvega.tunnel;

import JS0.p;
import JS0.q;
import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/Heartbeat.class */
public final class Heartbeat {

    @NotNull
    private final Handler handler;

    @NotNull
    private final Function0<Unit> onExecuteAction;

    @NotNull
    private final Function0<Unit> onLostAction;
    private int retryTimes;

    @NotNull
    private final HeartbeatConfig config = VegaConfigKt.heartbeatConfig();

    @NotNull
    private Runnable heartbeatRunnable = new p(this, 1);

    @NotNull
    private final Runnable timeoutDetectionRunnable = new q(this, 1);

    public Heartbeat(@NotNull Handler handler, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        this.handler = handler;
        this.onExecuteAction = function0;
        this.onLostAction = function02;
    }

    private final void checkThread() {
        if (Intrinsics.areEqual(this.handler.getLooper().getThread(), Thread.currentThread())) {
            return;
        }
        throw new IllegalStateException("must do this on GRPC thread, current thread is " + Thread.currentThread());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void heartbeatRunnable$lambda$0(Heartbeat heartbeat) {
        heartbeat.onExecuteAction.invoke();
        heartbeat.handler.removeCallbacks(heartbeat.timeoutDetectionRunnable);
        heartbeat.handler.postDelayed(heartbeat.timeoutDetectionRunnable, heartbeat.config.getTimeout());
        heartbeat.next(heartbeat.config.getInterval());
    }

    private final void next(long j7) {
        this.handler.removeCallbacks(this.heartbeatRunnable);
        this.handler.postDelayed(this.heartbeatRunnable, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timeoutDetectionRunnable$lambda$0(Heartbeat heartbeat) {
        if (heartbeat.retryTimes >= heartbeat.config.getMaxRetryTimes()) {
            heartbeat.onLostAction.invoke();
        } else {
            heartbeat.next(0L);
            heartbeat.retryTimes++;
        }
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    @NotNull
    public final Function0<Unit> getOnExecuteAction() {
        return this.onExecuteAction;
    }

    @NotNull
    public final Function0<Unit> getOnLostAction() {
        return this.onLostAction;
    }

    public final void onResp() {
        checkThread();
        this.handler.removeCallbacks(this.timeoutDetectionRunnable);
        this.retryTimes = 0;
    }

    public final void start() {
        checkThread();
        next(this.config.getInterval());
    }

    public final void stop() {
        checkThread();
        this.handler.removeCallbacks(this.heartbeatRunnable);
        this.handler.removeCallbacks(this.timeoutDetectionRunnable);
        this.retryTimes = 0;
    }
}
