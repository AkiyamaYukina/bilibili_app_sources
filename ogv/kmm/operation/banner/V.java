package com.bilibili.ogv.kmm.operation.banner;

import com.bilibili.mediautils.FileUtils;
import kntr.base.mod.ModBundle;
import kotlinx.io.files.FileSystemJvmKt;
import kotlinx.io.files.Path;
import kotlinx.io.files.PathsJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/V.class */
public final class V {
    @Nullable
    public static final String a(@NotNull ModBundle modBundle, @NotNull String str) {
        Path Path = PathsJvmKt.Path(modBundle.getFilePath() + "/" + str);
        if (!FileSystemJvmKt.SystemFileSystem.exists(Path)) {
            return null;
        }
        return FileUtils.SCHEME_FILE + Path;
    }
}
