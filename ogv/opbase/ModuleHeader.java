package com.bilibili.ogv.opbase;

import a5.C3188c;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.C8711a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/ModuleHeader.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ModuleHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f69862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f69863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f69864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("is_expand")
    private boolean f69865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f69866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public transient String f69867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public transient String f69868g;

    @NotNull
    public transient String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public transient String f69869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient boolean f69870j;

    public ModuleHeader() {
        this(null, 31, null, null, false, null);
    }

    public ModuleHeader(String str, int i7, String str2, Map map, boolean z6, String str3) {
        str = (i7 & 1) != 0 ? null : str;
        str2 = (i7 & 2) != 0 ? null : str2;
        str3 = (i7 & 4) != 0 ? null : str3;
        z6 = (i7 & 8) != 0 ? false : z6;
        map = (i7 & 16) != 0 ? null : map;
        this.f69862a = str;
        this.f69863b = str2;
        this.f69864c = str3;
        this.f69865d = z6;
        this.f69866e = map;
        this.f69867f = "";
        this.f69868g = "";
        this.h = "";
        this.f69869i = "";
    }

    public final boolean a() {
        return this.f69865d;
    }

    public final void b(boolean z6) {
        this.f69865d = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleHeader)) {
            return false;
        }
        ModuleHeader moduleHeader = (ModuleHeader) obj;
        return Intrinsics.areEqual(this.f69862a, moduleHeader.f69862a) && Intrinsics.areEqual(this.f69863b, moduleHeader.f69863b) && Intrinsics.areEqual(this.f69864c, moduleHeader.f69864c) && this.f69865d == moduleHeader.f69865d && Intrinsics.areEqual(this.f69866e, moduleHeader.f69866e);
    }

    public final int hashCode() {
        String str = this.f69862a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f69863b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f69864c;
        int iA = z.a(((((iHashCode * 31) + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f69865d);
        Map<String, String> map = this.f69866e;
        return iA + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f69865d;
        Map<String, String> map = this.f69866e;
        StringBuilder sb = new StringBuilder("ModuleHeader(icon=");
        sb.append(this.f69862a);
        sb.append(", title=");
        sb.append(this.f69863b);
        sb.append(", url=");
        C3188c.a(this.f69864c, ", expand=", ", report=", sb, z6);
        return C8711a.a(sb, map, ")");
    }
}
