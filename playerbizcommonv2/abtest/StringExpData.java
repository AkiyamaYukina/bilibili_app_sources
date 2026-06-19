package com.bilibili.playerbizcommonv2.abtest;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/abtest/StringExpData.class */
@StabilityInferred(parameters = 1)
@Bson
public final class StringExpData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("data")
    @Nullable
    private final String f80812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("success")
    private final boolean f80813b;

    public StringExpData(@Nullable String str, boolean z6) {
        this.f80812a = str;
        this.f80813b = z6;
    }

    @Nullable
    public final String a() {
        return this.f80812a;
    }

    public final boolean b() {
        return this.f80813b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringExpData)) {
            return false;
        }
        StringExpData stringExpData = (StringExpData) obj;
        return Intrinsics.areEqual(this.f80812a, stringExpData.f80812a) && this.f80813b == stringExpData.f80813b;
    }

    public final int hashCode() {
        String str = this.f80812a;
        return Boolean.hashCode(this.f80813b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "StringExpData(data=" + this.f80812a + ", success=" + this.f80813b + ")";
    }
}
