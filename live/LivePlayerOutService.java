package com.bilibili.live;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/LivePlayerOutService.class */
public interface LivePlayerOutService {

    @NotNull
    public static final a Companion = a.f65138a;
    public static final int DISABLE_WINDOW = 1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/LivePlayerOutService$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f65138a = new Object();
    }

    boolean floatWindowIsShown();

    long getFloatWindowRoomId();

    int getTimeShift(long j7);

    void stopFloatLiveWindow();

    boolean updateWindowSize();

    void windowControl(int i7);
}
