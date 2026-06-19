package com.bilibili.live.streaming;

import com.bilibili.live.streaming.log.LivePusherLog;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/BiliLivePushLoader.class */
public final class BiliLivePushLoader {

    @NotNull
    private static final String TAG = "BiliLivePushLoader";
    private static boolean libraryLoaded;

    @NotNull
    public static final BiliLivePushLoader INSTANCE = new BiliLivePushLoader();

    @NotNull
    private static final Object lock = new Object();

    private BiliLivePushLoader() {
    }

    public final boolean isLoaded() {
        boolean z6;
        synchronized (lock) {
            z6 = libraryLoaded;
        }
        return z6;
    }

    public final boolean load() {
        LivePusherLog.i$default(TAG, "load....", null, 4, null);
        if (isLoaded()) {
            return true;
        }
        synchronized (this) {
            System.loadLibrary("blive_pandora");
            libraryLoaded = true;
            Unit unit = Unit.INSTANCE;
        }
        LivePusherLog.i$default(TAG, "load done!", null, 4, null);
        return true;
    }
}
