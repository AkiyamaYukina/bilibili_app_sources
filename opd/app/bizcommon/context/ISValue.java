package com.bilibili.opd.app.bizcommon.context;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/ISValue.class */
public interface ISValue {
    @Nullable
    String getProbeId();

    @Nullable
    String getSchema();

    boolean sValueEnable();
}
