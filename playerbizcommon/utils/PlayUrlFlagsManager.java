package com.bilibili.playerbizcommon.utils;

import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.videoplayer.core.media.ijk.IjkFnHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/PlayUrlFlagsManager.class */
public final class PlayUrlFlagsManager {

    @NotNull
    public static final PlayUrlFlagsManager INSTANCE = new PlayUrlFlagsManager();

    @JvmStatic
    public static final int getFnVal() {
        return IjkFnHelper.INSTANCE.getFnVal();
    }

    @JvmStatic
    public static final int getFnVer() {
        return IjkFnHelper.INSTANCE.getFnVer();
    }

    @JvmStatic
    public static final long getSoftFnVal() {
        return IjkFnHelper.INSTANCE.getSoftFnVal();
    }

    @JvmStatic
    public static final void resetFnVal() {
        IjkFnHelper.INSTANCE.resetFnVal();
    }
}
