package com.bilibili.lib.rpc.flowcontrol;

import com.bilibili.lib.rpc.track.model.NetworkEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/flowcontrol/FlowControl.class */
public interface FlowControl {
    boolean onRequest(@NotNull String str, @NotNull String str2);

    void onResponse(@NotNull NetworkEvent networkEvent);
}
