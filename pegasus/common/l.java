package com.bilibili.pegasus.common;

import com.bilibili.lib.gripper.api.Producer;
import com.bilibili.lib.gripper.api.RestrictedProcesses;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/l.class */
public final class l {
    @RestrictedProcesses({"main"})
    @Producer(singleton = true)
    @NotNull
    public static final u00.o providePegasusServiceImpl() {
        return new k();
    }
}
