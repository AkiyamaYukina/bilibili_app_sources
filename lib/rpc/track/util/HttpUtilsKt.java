package com.bilibili.lib.rpc.track.util;

import android.net.Uri;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/track/util/HttpUtilsKt.class */
public final class HttpUtilsKt {
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String encodedQuery(@org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r0 = r2
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2 = r0
            r0 = r2
            if (r0 == 0) goto L14
            r0 = r2
            java.lang.String r0 = r0.getEncodedQuery()
            r3 = r0
            r0 = r3
            r2 = r0
            r0 = r3
            if (r0 != 0) goto L17
        L14:
            java.lang.String r0 = ""
            r2 = r0
        L17:
            r0 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.rpc.track.util.HttpUtilsKt.encodedQuery(java.lang.String):java.lang.String");
    }

    @NotNull
    public static final String errorMsg(@NotNull String str, @NotNull Throwable th) {
        StringBuilder sb = new StringBuilder(str);
        if (th.getCause() != null) {
            sb.append(th.getCause().getMessage());
        } else {
            sb.append(th.getMessage());
        }
        return sb.toString();
    }

    public static /* synthetic */ String errorMsg$default(String str, Throwable th, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = "";
        }
        return errorMsg(str, th);
    }

    public static final boolean httpError(int i7) {
        boolean z6 = false;
        if (200 <= i7) {
            z6 = false;
            if (i7 < 400) {
                z6 = true;
            }
        }
        return !z6;
    }

    @NotNull
    public static final String url(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return new Uri.Builder().scheme(str).authority(str2).path(str3).build().toString();
    }

    @NotNull
    public static final String urlRemoveQuery(@NotNull String str) {
        return Uri.parse(str).buildUpon().clearQuery().build().toString();
    }
}
