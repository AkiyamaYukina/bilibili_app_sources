package com.bilibili.lib.videoupload.internal;

import com.bilibili.lib.blconfig.ConfigManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/p.class */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f65109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f65110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f65111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f65112d;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f65109a = iAvailableProcessors;
        f65110b = Math.max(2, Math.min(4, iAvailableProcessors));
        f65111c = (iAvailableProcessors * 2) + 1;
        f65112d = "1".equals(ConfigManager.config().get("upper.video_upos_delete", "0"));
    }
}
