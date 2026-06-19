package com.bilibili.ship.theseus.united.page.intro.module.relate.history;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/history/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SimpleDateFormat f101244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SimpleDateFormat f101245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final SimpleDateFormat f101246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f101247d;

    static {
        Locale locale = Locale.CHINA;
        f101244a = new SimpleDateFormat("HH:mm", locale);
        f101245b = new SimpleDateFormat("MM-dd HH:mm", locale);
        f101246c = new SimpleDateFormat("yyyy-MM-dd HH:mm", locale);
    }

    public static long a(int i7) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(11, 0);
        gregorianCalendar.add(6, i7);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }
}
