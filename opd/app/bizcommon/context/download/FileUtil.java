package com.bilibili.opd.app.bizcommon.context.download;

import G.p;
import android.app.Application;
import android.net.Uri;
import android.os.Environment;
import com.bilibili.base.BiliContext;
import com.bilibili.commons.security.DigestUtils;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/download/FileUtil.class */
public final class FileUtil {

    @NotNull
    public static final FileUtil INSTANCE = new FileUtil();

    @NotNull
    public static final String cacheDir = "mall_file_cache/";

    public static String a() {
        Application application = BiliContext.application();
        String path = ((!Intrinsics.areEqual("mounted", Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable()) || application == null || application.getExternalCacheDir() == null) ? null : application.getExternalCacheDir().getPath();
        String path2 = path;
        if (path == null) {
            path2 = path;
            if (application != null) {
                path2 = path;
                if (application.getCacheDir() != null) {
                    path2 = application.getCacheDir().getPath();
                }
            }
        }
        String str = null;
        if (path2 != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("%s%s%s", Arrays.copyOf(new Object[]{path2, File.separator, cacheDir}, 3));
        }
        return str;
    }

    public final boolean checkMd5(@NotNull File file, @NotNull String str) {
        return Intrinsics.areEqual(DigestUtils.md5(file), str);
    }

    @NotNull
    public final String getFileCacheDirPath(@NotNull String str) {
        return p.a(a(), Uri.encode(str));
    }

    @NotNull
    public final String getFileCacheDirPathNoEncode(@NotNull String str) {
        return p.a(a(), str);
    }

    @Nullable
    public final String getFileCacheRootDir() {
        return a();
    }
}
