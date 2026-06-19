package com.bilibili.studio.videoeditor.generalrender.bean;

import X0.c;
import androidx.annotation.Keep;
import bilibili.live.app.service.resolver.a;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRJsbResult.class */
@Keep
public final class GRJsbResult<T> {
    private int code;

    @Nullable
    private T data;

    @Nullable
    private String message;

    @JSONCreator
    public GRJsbResult() {
        this(0, null, null, 7, null);
    }

    @JSONCreator
    public GRJsbResult(@JSONField(name = "code") int i7, @JSONField(name = "message") @Nullable String str, @JSONField(name = "data") @Nullable T t7) {
        this.code = i7;
        this.message = str;
        this.data = t7;
    }

    public /* synthetic */ GRJsbResult(int i7, String str, Object obj, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GRJsbResult copy$default(GRJsbResult gRJsbResult, int i7, String str, Object obj, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            i7 = gRJsbResult.code;
        }
        if ((i8 & 2) != 0) {
            str = gRJsbResult.message;
        }
        if ((i8 & 4) != 0) {
            obj = gRJsbResult.data;
        }
        return gRJsbResult.copy(i7, str, obj);
    }

    public final int component1() {
        return this.code;
    }

    @Nullable
    public final String component2() {
        return this.message;
    }

    @Nullable
    public final T component3() {
        return this.data;
    }

    @NotNull
    public final GRJsbResult<T> copy(@JSONField(name = "code") int i7, @JSONField(name = "message") @Nullable String str, @JSONField(name = "data") @Nullable T t7) {
        return new GRJsbResult<>(i7, str, t7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GRJsbResult)) {
            return false;
        }
        GRJsbResult gRJsbResult = (GRJsbResult) obj;
        return this.code == gRJsbResult.code && Intrinsics.areEqual(this.message, gRJsbResult.message) && Intrinsics.areEqual(this.data, gRJsbResult.data);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code);
        String str = this.message;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        T t7 = this.data;
        if (t7 != null) {
            iHashCode2 = t7.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public final void setCode(int i7) {
        this.code = i7;
    }

    public final void setData(@Nullable T t7) {
        this.data = t7;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    @NotNull
    public String toString() {
        int i7 = this.code;
        String str = this.message;
        return c.b(a.b(i7, "GRJsbResult(code=", ", message=", str, ", data="), this.data, ")");
    }
}
