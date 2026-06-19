package com.bilibili.playset.utils;

import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/utils/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f85648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SimpleDateFormat f85649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SimpleDateFormat f85650c;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        f85648a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT+0"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("mm:ss", Locale.getDefault());
        f85649b = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("GMT+0"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        f85650c = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    }

    public static String a(long j7) {
        return j7 < 3600000 ? Z.a(j7, f85649b) : Z.a(j7, f85648a);
    }

    public static String b(long j7) {
        return Z.a(j7, f85650c);
    }
}
