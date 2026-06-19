package com.bilibili.lib.rpc.report;

import com.bilibili.lib.rpc.track.model.NetworkEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/report/HttpReporter.class */
public interface HttpReporter {
    void report(@NotNull NetworkEvent networkEvent);
}
