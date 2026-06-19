package com.bilibili.lib.projection;

import com.bilibili.base.BiliContext;
import com.bilibili.lib.blrouter.ModuleApi;
import com.bilibili.lib.blrouter.ModuleContext;
import com.bilibili.lib.blrouter.ModuleDescriptor;
import com.bilibili.lib.performance.EntryPointKt;
import ie0.C7564c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/b.class */
@ModuleDescriptor(dependsOn = {"nirvana"}, name = "projection")
public final class b extends ModuleApi {
    public final void onCreate(@NotNull ModuleContext moduleContext) {
        super.onCreate(moduleContext);
        if (!BiliContext.isMainProcess() || EntryPointKt.getBootOptEnable()) {
            return;
        }
        C7564c.f121625a.init(moduleContext.getApp());
    }
}
