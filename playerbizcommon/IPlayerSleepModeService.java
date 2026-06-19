package com.bilibili.playerbizcommon;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IPlayerSleepModeService.class */
public interface IPlayerSleepModeService {
    void continueTimerInBackground(boolean z6);

    long getLeftTimeInMillis();

    long getTotalTime();

    boolean isRunning();

    void start(long j7);
}
