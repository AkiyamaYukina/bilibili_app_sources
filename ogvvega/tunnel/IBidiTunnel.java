package com.bilibili.ogvvega.tunnel;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/IBidiTunnel.class */
public interface IBidiTunnel {
    void connect();

    void disconnect();

    @NotNull
    <Req> Requester<Req> subscribe(@NotNull TargetPath targetPath, @NotNull Subscriber<?> subscriber);

    void unsubscribe(@NotNull TargetPath targetPath);
}
