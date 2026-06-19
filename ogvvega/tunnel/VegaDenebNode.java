package com.bilibili.ogvvega.tunnel;

import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/VegaDenebNode.class */
@Bson
public final class VegaDenebNode {

    @NotNull
    private final String host;
    private final int port;

    public VegaDenebNode(@NotNull String str, int i7) {
        this.host = str;
        this.port = i7;
    }

    public static /* synthetic */ VegaDenebNode copy$default(VegaDenebNode vegaDenebNode, String str, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = vegaDenebNode.host;
        }
        if ((i8 & 2) != 0) {
            i7 = vegaDenebNode.port;
        }
        return vegaDenebNode.copy(str, i7);
    }

    @NotNull
    public final String component1() {
        return this.host;
    }

    public final int component2() {
        return this.port;
    }

    @NotNull
    public final VegaDenebNode copy(@NotNull String str, int i7) {
        return new VegaDenebNode(str, i7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VegaDenebNode)) {
            return false;
        }
        VegaDenebNode vegaDenebNode = (VegaDenebNode) obj;
        return Intrinsics.areEqual(this.host, vegaDenebNode.host) && this.port == vegaDenebNode.port;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    public final int getPort() {
        return this.port;
    }

    public int hashCode() {
        return Integer.hashCode(this.port) + (this.host.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return androidx.constraintlayout.widget.c.a(this.port, "VegaDenebNode(host=", this.host, ", port=", ")");
    }
}
