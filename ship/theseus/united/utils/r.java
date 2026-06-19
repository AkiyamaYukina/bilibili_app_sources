package com.bilibili.ship.theseus.united.utils;

import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/r.class */
public final class r {
    @Nullable
    public static final String a(@NotNull Uri uri, @NotNull String str) {
        String queryParameter;
        try {
            queryParameter = uri.getQueryParameter(str);
        } catch (NullPointerException | UnsupportedOperationException e7) {
            queryParameter = null;
        }
        return queryParameter;
    }
}
