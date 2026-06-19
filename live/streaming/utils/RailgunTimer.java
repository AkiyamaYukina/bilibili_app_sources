package com.bilibili.live.streaming.utils;

import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/utils/RailgunTimer.class */
class RailgunTimer {
    private AtomicBoolean mCurrentCancellationToken;
    private TickCallback mCurrentTickCallback;
    private Handler mHandler;
    private AtomicReference<State> mState = new AtomicReference<>(State.STATE_CHAOS);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/utils/RailgunTimer$State.class */
    public enum State {
        STATE_CHAOS,
        STATE_STARTING,
        STATE_START,
        STATE_STOPPING,
        STATE_STOP
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/utils/RailgunTimer$TickCallback.class */
    public interface TickCallback {
        void OnTick();
    }

    public RailgunTimer(Handler handler) {
        this.mHandler = handler;
    }

    public boolean startTimer(int i7, TickCallback tickCallback) {
        AtomicReference<State> atomicReference = this.mState;
        State state = State.STATE_CHAOS;
        State state2 = State.STATE_STARTING;
        while (true) {
            if (atomicReference.compareAndSet(state, state2)) {
                break;
            }
            if (atomicReference.get() != state) {
                AtomicReference<State> atomicReference2 = this.mState;
                State state3 = State.STATE_STOP;
                State state4 = State.STATE_STARTING;
                while (!atomicReference2.compareAndSet(state3, state4)) {
                    if (atomicReference2.get() != state3) {
                        return false;
                    }
                }
            }
        }
        this.mCurrentTickCallback = tickCallback;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mCurrentCancellationToken = atomicBoolean;
        this.mHandler.postAtTime(new Runnable(this, atomicBoolean, i7) { // from class: com.bilibili.live.streaming.utils.RailgunTimer.1
            long mNextTriggeredTimeUs = SystemClock.uptimeMillis() * 1000;
            final RailgunTimer this$0;
            final AtomicBoolean val$cancellationToken;
            final int val$intervalUs;

            {
                this.this$0 = this;
                this.val$cancellationToken = atomicBoolean;
                this.val$intervalUs = i7;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.val$cancellationToken.get()) {
                    return;
                }
                this.mNextTriggeredTimeUs = Math.max(this.mNextTriggeredTimeUs + ((long) this.val$intervalUs), SystemClock.uptimeMillis() * 1000);
                this.this$0.mHandler.postAtTime(this, this.this$0.mCurrentTickCallback, this.mNextTriggeredTimeUs / 1000);
                synchronized (this.this$0.mCurrentTickCallback) {
                    if (this.val$cancellationToken.get()) {
                        return;
                    }
                    this.this$0.mCurrentTickCallback.OnTick();
                }
            }
        }, this.mCurrentTickCallback, SystemClock.uptimeMillis());
        AtomicReference<State> atomicReference3 = this.mState;
        State state5 = State.STATE_STARTING;
        State state6 = State.STATE_START;
        while (!atomicReference3.compareAndSet(state5, state6) && atomicReference3.get() == state5) {
        }
        return true;
    }

    public boolean stopTimerAsync() {
        if (this.mCurrentTickCallback == null) {
            return false;
        }
        AtomicReference<State> atomicReference = this.mState;
        State state = State.STATE_START;
        State state2 = State.STATE_STOPPING;
        while (!atomicReference.compareAndSet(state, state2)) {
            if (atomicReference.get() != state) {
                return false;
            }
        }
        this.mHandler.removeCallbacksAndMessages(this.mCurrentTickCallback);
        this.mCurrentCancellationToken.set(true);
        this.mCurrentCancellationToken = null;
        this.mCurrentTickCallback = null;
        AtomicReference<State> atomicReference2 = this.mState;
        State state3 = State.STATE_STOPPING;
        State state4 = State.STATE_STOP;
        while (!atomicReference2.compareAndSet(state3, state4) && atomicReference2.get() == state3) {
        }
        return true;
    }

    public boolean stopTimerSync() {
        boolean zStopTimerAsync;
        TickCallback tickCallback = this.mCurrentTickCallback;
        if (tickCallback == null) {
            return false;
        }
        synchronized (tickCallback) {
            zStopTimerAsync = stopTimerAsync();
        }
        return zStopTimerAsync;
    }
}
