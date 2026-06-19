package com.bilibili.lib.resmanager.core;

import android.content.Context;
import android.text.TextUtils;
import com.bilibili.commons.security.DigestUtils;
import com.bilibili.lib.resmanager.ResRequest;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/core/r.class */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static String f64332a;

    @Nullable
    public static final String a(@NotNull ResRequest resRequest) {
        return !TextUtils.isEmpty(resRequest.getKey$resmanager_release()) ? resRequest.getKey$resmanager_release() : !TextUtils.isEmpty(resRequest.getUrl$resmanager_release()) ? DigestUtils.md5(resRequest.getUrl$resmanager_release()) : "";
    }

    public static final String[] b(Context context) {
        String strC = c(context);
        String absolutePath = context.getFilesDir().getAbsolutePath();
        String str = File.separator;
        return new String[]{strC, B0.a.a(absolutePath, str, "resmanager_resource_1"), B0.a.a(context.getFilesDir().getAbsolutePath(), str, "resmanager_resource_2"), B0.a.a(context.getFilesDir().getAbsolutePath(), str, "resmanager_resource_3")};
    }

    public static final String c(Context context) {
        return B0.a.a(context.getFilesDir().getAbsolutePath(), File.separator, "res_cache");
    }
}
