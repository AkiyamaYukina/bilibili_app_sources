package com.bilibili.tgwt.square;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/ModuleHeader.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ModuleHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f112041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f112042b;

    public ModuleHeader() {
        this(null, null, 3);
    }

    public ModuleHeader(String str, String str2, int i7) {
        str = (i7 & 1) != 0 ? null : str;
        str2 = (i7 & 2) != 0 ? null : str2;
        this.f112041a = str;
        this.f112042b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleHeader)) {
            return false;
        }
        ModuleHeader moduleHeader = (ModuleHeader) obj;
        return Intrinsics.areEqual(this.f112041a, moduleHeader.f112041a) && Intrinsics.areEqual(this.f112042b, moduleHeader.f112042b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f112041a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f112042b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ModuleHeader(title=");
        sb.append(this.f112041a);
        sb.append(", url=");
        return C8770a.a(sb, this.f112042b, ")");
    }
}
