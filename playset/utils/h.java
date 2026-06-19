package com.bilibili.playset.utils;

import androidx.compose.foundation.gestures.C3392f;
import com.bilibili.studio.material.util.UtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/utils/h.class */
public final class h {
    public static String a(long j7) {
        String string;
        String string2;
        if (j7 < 0) {
            return "-";
        }
        if (j7 < 10000) {
            return String.valueOf(j7);
        }
        if (j7 < 10000 || j7 >= 100000000) {
            int iRound = Math.round((j7 % 100000000) / 1.0E7f);
            if (iRound >= 10) {
                string = android.support.v4.media.session.a.a(new StringBuilder(), (j7 / 100000000) + 1, "万");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(j7 / 100000000);
                sb.append(iRound != 0 ? C3392f.a(iRound, UtilsKt.DOT, "亿") : "亿");
                string = sb.toString();
            }
            return string;
        }
        int iRound2 = Math.round((j7 % 10000) / 1000.0f);
        if (iRound2 >= 10) {
            string2 = android.support.v4.media.session.a.a(new StringBuilder(), (j7 / 10000) + 1, "万");
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j7 / 10000);
            sb2.append(iRound2 != 0 ? C3392f.a(iRound2, UtilsKt.DOT, "万") : "万");
            string2 = sb2.toString();
        }
        return string2;
    }
}
