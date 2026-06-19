package com.bilibili.studio.videoeditor.extension;

import android.net.Uri;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/m.class */
public final class m {
    @Nullable
    public static final String a(@Nullable String str, @NotNull String str2, @NotNull String str3) {
        Uri uriC = com.bilibili.studio.videoeditor.editor.editdata.b.c(str);
        if (uriC == null) {
            return null;
        }
        Uri.Builder builderBuildUpon = uriC.buildUpon();
        Set<String> queryParameterNames = uriC.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String str4 : queryParameterNames) {
                if (!Intrinsics.areEqual(str4, str2)) {
                    builderBuildUpon.appendQueryParameter(str4, uriC.getQueryParameter(str4));
                }
            }
        }
        builderBuildUpon.appendQueryParameter(str2, str3);
        return builderBuildUpon.build().toString();
    }

    public static final long b(@Nullable String str, long j7) {
        long jLongValue = j7;
        if (str != null) {
            Long longOrNull = StringsKt.toLongOrNull(str);
            jLongValue = j7;
            if (longOrNull != null) {
                jLongValue = longOrNull.longValue();
            }
        }
        return jLongValue;
    }
}
