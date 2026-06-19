package com.bilibili.ogvvega.tunnel;

import I.E;
import com.bilibili.ogvvega.protobuf.ProtoAny;
import com.bilibili.ogvvega.protobuf.annotation.FieldNumber;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/VegaFrameVO.class */
public final class VegaFrameVO {

    @FieldNumber(3)
    @NotNull
    private final ProtoAny body;

    @FieldNumber(1)
    @NotNull
    private final FrameOptionVO option;

    @FieldNumber(2)
    @NotNull
    private final String routePath;

    @FieldNumber(4)
    @NotNull
    private final ProtoAny subBiz;

    public VegaFrameVO() {
        this(new FrameOptionVO(), "", new ProtoAny(), new ProtoAny());
    }

    public VegaFrameVO(@NotNull FrameOptionVO frameOptionVO, @NotNull String str, @NotNull ProtoAny protoAny, @NotNull ProtoAny protoAny2) {
        this.option = frameOptionVO;
        this.routePath = str;
        this.body = protoAny;
        this.subBiz = protoAny2;
    }

    public static /* synthetic */ VegaFrameVO copy$default(VegaFrameVO vegaFrameVO, FrameOptionVO frameOptionVO, String str, ProtoAny protoAny, ProtoAny protoAny2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            frameOptionVO = vegaFrameVO.option;
        }
        if ((i7 & 2) != 0) {
            str = vegaFrameVO.routePath;
        }
        if ((i7 & 4) != 0) {
            protoAny = vegaFrameVO.body;
        }
        if ((i7 & 8) != 0) {
            protoAny2 = vegaFrameVO.subBiz;
        }
        return vegaFrameVO.copy(frameOptionVO, str, protoAny, protoAny2);
    }

    @NotNull
    public final FrameOptionVO component1() {
        return this.option;
    }

    @NotNull
    public final String component2() {
        return this.routePath;
    }

    @NotNull
    public final ProtoAny component3() {
        return this.body;
    }

    @NotNull
    public final ProtoAny component4() {
        return this.subBiz;
    }

    @NotNull
    public final VegaFrameVO copy(@NotNull FrameOptionVO frameOptionVO, @NotNull String str, @NotNull ProtoAny protoAny, @NotNull ProtoAny protoAny2) {
        return new VegaFrameVO(frameOptionVO, str, protoAny, protoAny2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VegaFrameVO)) {
            return false;
        }
        VegaFrameVO vegaFrameVO = (VegaFrameVO) obj;
        return Intrinsics.areEqual(this.option, vegaFrameVO.option) && Intrinsics.areEqual(this.routePath, vegaFrameVO.routePath) && Intrinsics.areEqual(this.body, vegaFrameVO.body) && Intrinsics.areEqual(this.subBiz, vegaFrameVO.subBiz);
    }

    @NotNull
    public final ProtoAny getBody() {
        return this.body;
    }

    @NotNull
    public final FrameOptionVO getOption() {
        return this.option;
    }

    @NotNull
    public final String getRoutePath() {
        return this.routePath;
    }

    @NotNull
    public final ProtoAny getSubBiz() {
        return this.subBiz;
    }

    public int hashCode() {
        int iA = E.a(this.option.hashCode() * 31, 31, this.routePath);
        return this.subBiz.hashCode() + ((this.body.hashCode() + iA) * 31);
    }

    @NotNull
    public String toString() {
        return "VegaFrameVO(option=" + this.option + ", routePath=" + this.routePath + ", body=" + this.body + ", subBiz=" + this.subBiz + ")";
    }
}
