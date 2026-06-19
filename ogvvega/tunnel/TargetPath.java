package com.bilibili.ogvvega.tunnel;

import com.bilibili.ogvvega.protobuf.ProtoAny;
import com.bilibili.ogvvega.protobuf.annotation.FieldNumber;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/TargetPath.class */
public final class TargetPath {

    @FieldNumber(1)
    @NotNull
    private final String key;

    @FieldNumber(2)
    @NotNull
    private final ProtoAny subBiz;

    public TargetPath() {
        this("", new ProtoAny());
    }

    public TargetPath(@NotNull String str, @NotNull ProtoAny protoAny) {
        this.key = str;
        this.subBiz = protoAny;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final ProtoAny getSubBiz() {
        return this.subBiz;
    }
}
