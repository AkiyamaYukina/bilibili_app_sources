package com.bilibili.studio.comm.material.utils;

import Yv0.e;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blconfig.ConfigManager;
import java.io.File;
import kotlin.Lazy;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import zw0.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/utils/DraftJsonUtils.class */
public final class DraftJsonUtils {
    public static void a(@NotNull String str) {
        Lazy lazy = b.f130950a;
        if (ConfigManager.Companion.ab2().getWithDefault("upper.enable_draftjson_collection", false)) {
            File file = new File(BiliContext.application().getFilesDir(), "draftjson");
            if (file.exists()) {
                BuildersKt.launch$default(new e(), Dispatchers.getIO(), (CoroutineStart) null, new DraftJsonUtils$deleteJsonDirectory$1(file, str, null), 2, (Object) null);
                return;
            }
            a.a(str + " 本地draftjson目录 不存在不需要删除 ");
        }
    }
}
