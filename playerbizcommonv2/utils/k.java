package com.bilibili.playerbizcommonv2.utils;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/k.class */
@StabilityInferred(parameters = 1)
public final class k {
    public static boolean a(@NotNull String str) {
        boolean zAreEqual = Intrinsics.areEqual(Uri.parse(str).getQueryParameter("na_close_hide"), "1");
        q4.r.a("url[", str, "]", "H5Const");
        return !zAreEqual;
    }

    public static boolean b(@NotNull String str) {
        boolean zAreEqual = Intrinsics.areEqual(Uri.parse(str).getQueryParameter("hidden_na_nav_bar"), "1");
        q4.r.a("url[", str, "]", "H5Const");
        return !zAreEqual;
    }
}
