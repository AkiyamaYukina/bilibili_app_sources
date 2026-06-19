package com.bilibili.ogvvega.tunnel;

import com.bilibili.ogvvega.protobuf.annotation.FieldNumber;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/SubscribeReqVO.class */
public final class SubscribeReqVO {

    @FieldNumber(1)
    @NotNull
    private final List<TargetPath> targetPaths;

    private SubscribeReqVO() {
        this(new ArrayList());
    }

    public SubscribeReqVO(@NotNull List<TargetPath> list) {
        this.targetPaths = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscribeReqVO copy$default(SubscribeReqVO subscribeReqVO, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = subscribeReqVO.targetPaths;
        }
        return subscribeReqVO.copy(list);
    }

    @NotNull
    public final List<TargetPath> component1() {
        return this.targetPaths;
    }

    @NotNull
    public final SubscribeReqVO copy(@NotNull List<TargetPath> list) {
        return new SubscribeReqVO(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubscribeReqVO) && Intrinsics.areEqual(this.targetPaths, ((SubscribeReqVO) obj).targetPaths);
    }

    @NotNull
    public final List<TargetPath> getTargetPaths() {
        return this.targetPaths;
    }

    public int hashCode() {
        return this.targetPaths.hashCode();
    }

    @NotNull
    public String toString() {
        return com.bapis.bilibili.account.interfaces.v1.k.a("SubscribeReqVO(targetPaths=", ")", this.targetPaths);
    }
}
