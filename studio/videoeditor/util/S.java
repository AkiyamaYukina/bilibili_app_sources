package com.bilibili.studio.videoeditor.util;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.media3.common.C4618g;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/S.class */
public final class S {
    public static String a(Context context, int i7) {
        return context.getResources().getString(i7);
    }

    public static boolean b(@NonNull String str) {
        boolean z6;
        try {
            Integer.parseInt(str);
            z6 = true;
        } catch (NumberFormatException e7) {
            z6 = false;
        }
        return z6;
    }

    public static int c(String str) {
        int i7;
        try {
            i7 = Integer.parseInt(str);
        } catch (NumberFormatException e7) {
            i7 = 0;
        }
        return i7;
    }

    public static String d(int i7) {
        return C4618g.a(i7, "%");
    }
}
