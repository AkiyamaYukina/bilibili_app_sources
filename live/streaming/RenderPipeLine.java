package com.bilibili.live.streaming;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/RenderPipeLine.class */
public final class RenderPipeLine {

    @Nullable
    private ConditionVariable currentCancellionResult;

    @Nullable
    private AtomicBoolean currentCancellionToken;

    @NotNull
    private final EncoderManager encoderManager;

    @NotNull
    private final Handler handler;

    @Nullable
    private Function1<? super Long, Unit> runPipeLineOnce_;

    @NotNull
    private final EventHandler<Function1<Long, Unit>> preTickHandler = new EventHandler<>();

    @NotNull
    private final EventHandler<Function1<Long, Unit>> tickHandler = new EventHandler<>();

    @NotNull
    private final EventHandler<Function1<Long, Unit>> postTickHandler = new EventHandler<>();

    @NotNull
    private final EventHandler<Function1<Long, Unit>> preRenderHandler = new EventHandler<>();

    @NotNull
    private final EventHandler<Function1<Long, Unit>> renderHandler = new EventHandler<>();

    @NotNull
    private final EventHandler<Function1<Long, Unit>> postRenderHandler = new EventHandler<>();

    public RenderPipeLine(@NotNull Handler handler, @NotNull EncoderManager encoderManager) {
        this.handler = handler;
        this.encoderManager = encoderManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$9$lambda$8(RenderPipeLine renderPipeLine, final long j7) {
        renderPipeLine.getPreTickEvent().Invoke(new Function1(j7) { // from class: com.bilibili.live.streaming.N

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f65197a;

            {
                this.f65197a = j7;
            }

            public final Object invoke(Object obj) {
                return RenderPipeLine.run$lambda$9$lambda$8$lambda$2(this.f65197a, (Function1) obj);
            }
        });
        renderPipeLine.getTickEvent().Invoke(new Function1(j7) { // from class: com.bilibili.live.streaming.O

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f65198a;

            {
                this.f65198a = j7;
            }

            public final Object invoke(Object obj) {
                return RenderPipeLine.run$lambda$9$lambda$8$lambda$3(this.f65198a, (Function1) obj);
            }
        });
        renderPipeLine.getPostTickEvent().Invoke(new com.bilibili.bplus.followinglist.module.item.playable.B(j7, 1));
        renderPipeLine.getPreRenderEvent().Invoke(new com.bilibili.bplus.followinglist.module.item.playable.C(j7, 1));
        renderPipeLine.getRenderEvent().Invoke(new Function1(j7) { // from class: com.bilibili.live.streaming.P

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f65199a;

            {
                this.f65199a = j7;
            }

            public final Object invoke(Object obj) {
                return RenderPipeLine.run$lambda$9$lambda$8$lambda$6(this.f65199a, (Function1) obj);
            }
        });
        renderPipeLine.getPostRenderEvent().Invoke(new Function1(j7) { // from class: com.bilibili.live.streaming.Q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f65200a;

            {
                this.f65200a = j7;
            }

            public final Object invoke(Object obj) {
                return RenderPipeLine.run$lambda$9$lambda$8$lambda$7(this.f65200a, (Function1) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$9$lambda$8$lambda$2(long j7, Function1 function1) {
        function1.invoke(Long.valueOf(j7));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$9$lambda$8$lambda$3(long j7, Function1 function1) {
        function1.invoke(Long.valueOf(j7));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$9$lambda$8$lambda$4(long j7, Function1 function1) {
        function1.invoke(Long.valueOf(j7));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$9$lambda$8$lambda$5(long j7, Function1 function1) {
        function1.invoke(Long.valueOf(j7));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$9$lambda$8$lambda$6(long j7, Function1 function1) {
        function1.invoke(Long.valueOf(j7));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$9$lambda$8$lambda$7(long j7, Function1 function1) {
        function1.invoke(Long.valueOf(j7));
        return Unit.INSTANCE;
    }

    @NotNull
    public final EventHandler<Function1<Long, Unit>> getPostRenderEvent() {
        return this.postRenderHandler;
    }

    @NotNull
    public final EventHandler<Function1<Long, Unit>> getPostTickEvent() {
        return this.postTickHandler;
    }

    @NotNull
    public final EventHandler<Function1<Long, Unit>> getPreRenderEvent() {
        return this.preRenderHandler;
    }

    @NotNull
    public final EventHandler<Function1<Long, Unit>> getPreTickEvent() {
        return this.preTickHandler;
    }

    @NotNull
    public final EventHandler<Function1<Long, Unit>> getRenderEvent() {
        return this.renderHandler;
    }

    @Nullable
    public final Function1<Long, Unit> getRunPipeLineOnce_() {
        return this.runPipeLineOnce_;
    }

    @NotNull
    public final EventHandler<Function1<Long, Unit>> getTickEvent() {
        return this.tickHandler;
    }

    public final void run() {
        stop();
        synchronized (this) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.currentCancellionToken = atomicBoolean;
            final ConditionVariable conditionVariable = new ConditionVariable(false);
            this.currentCancellionResult = conditionVariable;
            final com.bilibili.app.comment3.ui.view.g gVar = new com.bilibili.app.comment3.ui.view.g(this, 3);
            this.runPipeLineOnce_ = gVar;
            this.handler.post(new Runnable(atomicBoolean, conditionVariable, this, gVar) { // from class: com.bilibili.live.streaming.RenderPipeLine$run$1$task$1
                final ConditionVariable $cancellionResult;
                final AtomicBoolean $cancellionToken;
                final Function1<Long, Unit> $localRunPipelineOnce;
                private long nextCycleTimeUs = SystemClock.uptimeMillis() * ((long) 1000);
                final RenderPipeLine this$0;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.$cancellionToken = atomicBoolean;
                    this.$cancellionResult = conditionVariable;
                    this.this$0 = this;
                    this.$localRunPipelineOnce = gVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (this.$cancellionToken.get()) {
                        this.$cancellionResult.open();
                        return;
                    }
                    int frameRate = PlaybackException.CUSTOM_ERROR_CODE_BASE / this.this$0.encoderManager.getEncoderConfig$BiliLivePushStreaming_release().getFrameRate();
                    long j7 = this.nextCycleTimeUs;
                    long j8 = frameRate;
                    this.nextCycleTimeUs = j7 + j8;
                    long j9 = 1000;
                    if (((SystemClock.uptimeMillis() * j9) - this.nextCycleTimeUs) / j8 >= 1) {
                        this.nextCycleTimeUs = SystemClock.uptimeMillis() * j9;
                    }
                    this.$localRunPipelineOnce.invoke(Long.valueOf(j7));
                    this.this$0.handler.postAtTime(this, this.this$0, this.nextCycleTimeUs / j9);
                }
            });
        }
    }

    public final void runPipeLineOnce(long j7) {
        synchronized (this) {
            Function1<? super Long, Unit> function1 = this.runPipeLineOnce_;
            if (function1 != null) {
                function1.invoke(Long.valueOf(j7));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void setRunPipeLineOnce_(@Nullable Function1<? super Long, Unit> function1) {
        this.runPipeLineOnce_ = function1;
    }

    public final boolean stop() {
        synchronized (this) {
            AtomicBoolean atomicBoolean = this.currentCancellionToken;
            if (atomicBoolean == null) {
                return false;
            }
            if (this.currentCancellionResult == null) {
                return false;
            }
            if (atomicBoolean != null) {
                atomicBoolean.set(true);
            }
            if (this.handler.getLooper().getThread().getId() == Thread.currentThread().getId()) {
                this.handler.removeCallbacksAndMessages(this);
            } else {
                ConditionVariable conditionVariable = this.currentCancellionResult;
                if (conditionVariable != null) {
                    conditionVariable.block();
                }
            }
            this.currentCancellionToken = null;
            this.currentCancellionResult = null;
            this.runPipeLineOnce_ = null;
            return true;
        }
    }
}
