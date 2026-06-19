package com.bilibili.lib.push;

import androidx.compose.animation.core.I;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/PushPermissionResult.class */
public final class PushPermissionResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f64227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f64230d;

    public PushPermissionResult(boolean z6, boolean z7, int i7, @Nullable String str) {
        this.f64227a = z6;
        this.f64228b = z7;
        this.f64229c = i7;
        this.f64230d = str;
    }

    public /* synthetic */ PushPermissionResult(boolean z6, boolean z7, int i7, String str, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(z6, z7, (i8 & 4) != 0 ? 0 : i7, (i8 & 8) != 0 ? "" : str);
    }

    public static /* synthetic */ PushPermissionResult copy$default(PushPermissionResult pushPermissionResult, boolean z6, boolean z7, int i7, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z6 = pushPermissionResult.f64227a;
        }
        if ((i8 & 2) != 0) {
            z7 = pushPermissionResult.f64228b;
        }
        if ((i8 & 4) != 0) {
            i7 = pushPermissionResult.f64229c;
        }
        if ((i8 & 8) != 0) {
            str = pushPermissionResult.f64230d;
        }
        return pushPermissionResult.copy(z6, z7, i7, str);
    }

    public final boolean component1() {
        return this.f64227a;
    }

    public final boolean component2() {
        return this.f64228b;
    }

    public final int component3() {
        return this.f64229c;
    }

    @Nullable
    public final String component4() {
        return this.f64230d;
    }

    @NotNull
    public final PushPermissionResult copy(boolean z6, boolean z7, int i7, @Nullable String str) {
        return new PushPermissionResult(z6, z7, i7, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushPermissionResult)) {
            return false;
        }
        PushPermissionResult pushPermissionResult = (PushPermissionResult) obj;
        return this.f64227a == pushPermissionResult.f64227a && this.f64228b == pushPermissionResult.f64228b && this.f64229c == pushPermissionResult.f64229c && Intrinsics.areEqual(this.f64230d, pushPermissionResult.f64230d);
    }

    public final int getCode() {
        return this.f64229c;
    }

    public final boolean getHasShow() {
        return this.f64228b;
    }

    @Nullable
    public final String getMsg() {
        return this.f64230d;
    }

    public final boolean getSuccess() {
        return this.f64227a;
    }

    public int hashCode() {
        int iA = I.a(this.f64229c, androidx.compose.animation.z.a(Boolean.hashCode(this.f64227a) * 31, 31, this.f64228b), 31);
        String str = this.f64230d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PushPermissionResult(success=");
        sb.append(this.f64227a);
        sb.append(", hasShow=");
        sb.append(this.f64228b);
        sb.append(", code=");
        sb.append(this.f64229c);
        sb.append(", msg=");
        return C8770a.a(sb, this.f64230d, ")");
    }
}
