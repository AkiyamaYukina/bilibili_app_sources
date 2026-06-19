package com.bilibili.studio.videoeditor.util;

import android.content.Context;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/M.class */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f110205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f110206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, String> f110207c = new HashMap<>();

    public static void a(@NotNull Context context) {
        f110205a = System.currentTimeMillis();
        boolean z6 = !context.getDatabasePath("bilibili_draft").exists();
        f110206b = z6;
        long j7 = f110205a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j8 = f110205a;
        StringBuilder sbB = androidx.compose.ui.graphics.colorspace.A.b(j7, "mTimeOpenApp = ", ", mIsFirstInstall = ", z6);
        sbB.append(", take = ");
        sbB.append(jCurrentTimeMillis - j8);
        BLog.d("ModErrorReportHelper", sbB.toString());
    }
}
