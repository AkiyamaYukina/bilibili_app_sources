package com.bilibili.module.main.innerpush;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/main/innerpush/BizParams.class */
@Keep
public final class BizParams {

    @SerializedName("type")
    @Nullable
    private final String type;

    @SerializedName("resource")
    @Nullable
    private final Map<String, String> value;

    public BizParams() {
        this(null, null, 3, null);
    }

    public BizParams(@Nullable String str, @Nullable Map<String, String> map) {
        this.type = str;
        this.value = map;
    }

    public /* synthetic */ BizParams(String str, Map map, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BizParams copy$default(BizParams bizParams, String str, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bizParams.type;
        }
        if ((i7 & 2) != 0) {
            map = bizParams.value;
        }
        return bizParams.copy(str, map);
    }

    @Nullable
    public final String component1() {
        return this.type;
    }

    @Nullable
    public final Map<String, String> component2() {
        return this.value;
    }

    @NotNull
    public final BizParams copy(@Nullable String str, @Nullable Map<String, String> map) {
        return new BizParams(str, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizParams)) {
            return false;
        }
        BizParams bizParams = (BizParams) obj;
        return Intrinsics.areEqual(this.type, bizParams.type) && Intrinsics.areEqual(this.value, bizParams.value);
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Map<String, String> getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Map<String, String> map = this.value;
        if (map != null) {
            iHashCode = map.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public String toString() {
        return "BizParams(type=" + this.type + ", value=" + this.value + ")";
    }
}
