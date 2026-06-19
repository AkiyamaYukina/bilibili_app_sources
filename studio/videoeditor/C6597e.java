package com.bilibili.studio.videoeditor;

import com.bilibili.base.BiliContext;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.lib.mod.request.ModUpdateRequest;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/e.class */
public final class C6597e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ModResourceClient.OnUpdateCallback f109453a;

    /* JADX WARN: Type inference failed for: r3v4, types: [com.bilibili.lib.mod.ModResourceClient$OnUpdateCallback, java.lang.Object] */
    @Nullable
    public static String a(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable ModResourceClient.OnUpdateCallback onUpdateCallback) {
        String strA;
        f109453a = onUpdateCallback;
        ModResource modResource = ModResourceClient.getInstance().get(BiliContext.application(), str, str2);
        if (modResource.isAvailable() && FC0.a.a(modResource)) {
            strA = B0.a.a(modResource.getResourceDirPath(), File.separator, str3);
        } else {
            ModResourceClient.getInstance().update(BiliContext.application(), new ModUpdateRequest.Builder(str, str2).isForce(true).isImmediate(true).build(), (ModResourceClient.OnUpdateCallback) new Object());
            strA = null;
        }
        return strA;
    }
}
