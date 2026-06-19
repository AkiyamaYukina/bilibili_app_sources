package com.bilibili.mediautils;

import C0.d;
import com.bilibili.studio.material.util.UtilsKt;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediautils/TimeUtils.class */
public class TimeUtils {
    public static String milliSecond2DateFormat(long j7) {
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(j7));
    }

    public static String milliSecond2LogTimeFormat(long j7) {
        StringBuilder sbA = d.a(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(j7)), UtilsKt.DOT);
        sbA.append(String.valueOf(j7).substring(10));
        return sbA.toString();
    }
}
