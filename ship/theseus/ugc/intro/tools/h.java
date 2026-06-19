package com.bilibili.ship.theseus.ugc.intro.tools;

import com.bapis.bilibili.app.viewunite.common.ToolType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/h.class */
public final /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f97225a;

    static {
        int[] iArr = new int[ToolType.values().length];
        try {
            iArr[ToolType.INTERACTIVE_DANMAKU.ordinal()] = 1;
        } catch (NoSuchFieldError e7) {
        }
        try {
            iArr[ToolType.INTERACTIVE_SETTINGS.ordinal()] = 2;
        } catch (NoSuchFieldError e8) {
        }
        try {
            iArr[ToolType.UNIVERSAL.ordinal()] = 3;
        } catch (NoSuchFieldError e9) {
        }
        try {
            iArr[ToolType.UP_VIDEO_MENTIONS.ordinal()] = 4;
        } catch (NoSuchFieldError e10) {
        }
        f97225a = iArr;
    }
}
