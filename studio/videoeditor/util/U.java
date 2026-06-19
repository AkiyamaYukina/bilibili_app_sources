package com.bilibili.studio.videoeditor.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/U.class */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f110218a = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SimpleDateFormat f110219b = new SimpleDateFormat("M-d HH:mm");

    public static String a(long j7) {
        long j8 = j7 / 1000;
        return String.format(Locale.US, "%02d:%02d", Long.valueOf(j8 / 60), Long.valueOf(j8 % 60));
    }

    public static String b(long j7, SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat.format(new Date(j7 * 1000));
    }

    public static String c(long j7) {
        long j8 = j7 / 1000;
        long j9 = j8 % 60;
        long j10 = (j8 / 60) % 60;
        long j11 = j8 / 3600;
        return j11 > 0 ? String.format(Locale.US, "%02d:%02d:%02d", Long.valueOf(j11), Long.valueOf(j10), Long.valueOf(j9)) : String.format(Locale.US, "%02d:%02d", Long.valueOf(j10), Long.valueOf(j9));
    }
}
