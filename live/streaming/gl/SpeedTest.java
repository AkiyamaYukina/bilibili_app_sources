package com.bilibili.live.streaming.gl;

import android.os.SystemClock;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/SpeedTest.class */
public final class SpeedTest {

    @NotNull
    private final String msg;

    @NotNull
    private final Function0<Unit> run;
    private int runCount;
    private long totalCost;

    public SpeedTest(@NotNull String str, @NotNull Function0<Unit> function0) {
        this.msg = str;
        this.run = function0;
    }

    public final void RunTest() {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.run.invoke();
        long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        int i7 = this.runCount + 1;
        this.runCount = i7;
        long j7 = this.totalCost + (jElapsedRealtimeNanos2 - jElapsedRealtimeNanos);
        this.totalCost = j7;
        Log.e("SpeedTest", aR.b.b((j7 / ((long) i7)) / ((long) 1000), this.msg, " ", " us"));
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final Function0<Unit> getRun() {
        return this.run;
    }

    public final int getRunCount() {
        return this.runCount;
    }

    public final long getTotalCost() {
        return this.totalCost;
    }

    public final void setRunCount(int i7) {
        this.runCount = i7;
    }

    public final void setTotalCost(long j7) {
        this.totalCost = j7;
    }
}
