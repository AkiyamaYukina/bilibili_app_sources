package com.bilibili.lib.sharewrapper.Bshare;

import com.bilibili.lib.gripper.api.AllowMissing;
import com.bilibili.lib.gripper.api.PreTrigger;
import com.bilibili.lib.gripper.api.Producer;
import com.bilibili.lib.gripper.api.RestrictedProcesses;
import com.bilibili.lib.sharewrapper.ShareHelper;
import com.bilibili.opd.app.bizcommon.hybridruntime.KFCHybridV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/d.class */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.bilibili.lib.sharewrapper.Bshare.BShareDelegate] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.lib.sharewrapper.ShareHelper] */
    @RestrictedProcesses({"main", "web", KFCHybridV2.Configuration.MALL_DOWNLOAD_DOMAIN})
    @Nullable
    @PreTrigger(trigger = "OnPrivacyAllowed")
    @Producer(dependsOn = {"infra.initShare"}, id = "app.startShare", singleton = true)
    public final Object setShareImpl(@AllowMissing @Nullable ShareHelper shareHelper, @NotNull Continuation<? super Unit> continuation) {
        Object obj = shareHelper;
        if (shareHelper == null) {
            obj = new Object();
        }
        new BShareDelegate().setShareHelper(obj);
        return Unit.INSTANCE;
    }
}
