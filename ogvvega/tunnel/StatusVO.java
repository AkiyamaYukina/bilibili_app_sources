package com.bilibili.ogvvega.tunnel;

import I.E;
import c6.N;
import com.bilibili.ogvvega.protobuf.ProtoAny;
import com.bilibili.ogvvega.protobuf.annotation.FieldNumber;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/StatusVO.class */
public final class StatusVO {

    @FieldNumber(1)
    private final int code;

    @FieldNumber(3)
    @NotNull
    private final List<ProtoAny> details;

    @FieldNumber(2)
    @NotNull
    private final String message;

    public StatusVO() {
        this(0, "", new ArrayList());
    }

    public StatusVO(int i7, @NotNull String str, @NotNull List<ProtoAny> list) {
        this.code = i7;
        this.message = str;
        this.details = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatusVO copy$default(StatusVO statusVO, int i7, String str, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = statusVO.code;
        }
        if ((i8 & 2) != 0) {
            str = statusVO.message;
        }
        if ((i8 & 4) != 0) {
            list = statusVO.details;
        }
        return statusVO.copy(i7, str, list);
    }

    public final int component1() {
        return this.code;
    }

    @NotNull
    public final String component2() {
        return this.message;
    }

    @NotNull
    public final List<ProtoAny> component3() {
        return this.details;
    }

    @NotNull
    public final StatusVO copy(int i7, @NotNull String str, @NotNull List<ProtoAny> list) {
        return new StatusVO(i7, str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusVO)) {
            return false;
        }
        StatusVO statusVO = (StatusVO) obj;
        return this.code == statusVO.code && Intrinsics.areEqual(this.message, statusVO.message) && Intrinsics.areEqual(this.details, statusVO.details);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final List<ProtoAny> getDetails() {
        return this.details;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.details.hashCode() + E.a(Integer.hashCode(this.code) * 31, 31, this.message);
    }

    @NotNull
    public String toString() {
        int i7 = this.code;
        String str = this.message;
        return N.a(bilibili.live.app.service.resolver.a.b(i7, "StatusVO(code=", ", message=", str, ", details="), ")", this.details);
    }
}
