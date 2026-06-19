package com.bilibili.music.podcast.utils;

import com.bilibili.commons.time.FastDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/H.class */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FastDateFormat f66914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FastDateFormat f66915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FastDateFormat f66916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f66917d;

    static {
        Locale locale = Locale.US;
        f66914a = FastDateFormat.getInstance("HH:mm", locale);
        f66915b = FastDateFormat.getInstance("MM-dd HH:mm", locale);
        f66916c = FastDateFormat.getInstance("yyyy-MM-dd HH:mm", locale);
    }
}
