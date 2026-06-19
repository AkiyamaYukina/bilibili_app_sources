package com.bilibili.lib.projection;

import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.gripper.api.PreTrigger;
import com.bilibili.lib.gripper.api.Producer;
import com.bilibili.lib.gripper.api.RestrictedProcesses;
import com.bilibili.lib.performance.EntryPointKt;
import ie0.C7564c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/c.class */
public final class c {
    @PreTrigger(awaitComplete = true, trigger = "OnPrivacyAllowed")
    @RestrictedProcesses({"main"})
    @Producer(id = "projection.initProjectionModule", singleton = true)
    public static final void initProjectionModule(@NotNull Application application) {
        if (BiliContext.isMainProcess() && EntryPointKt.getBootOptEnable()) {
            C7564c.f121625a.init(application);
        }
    }
}
