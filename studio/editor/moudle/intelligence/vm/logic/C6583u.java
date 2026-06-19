package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.vm.logic.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/u.class */
public final class C6583u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f107861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f107862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f107864d;

    public C6583u() {
        this((String) null, (String) null, 0, 15);
    }

    public /* synthetic */ C6583u(String str, String str2, int i7, int i8) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? 0 : i7, "");
    }

    public C6583u(@NotNull String str, @NotNull String str2, int i7, @NotNull String str3) {
        this.f107861a = str;
        this.f107862b = str2;
        this.f107863c = i7;
        this.f107864d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6583u)) {
            return false;
        }
        C6583u c6583u = (C6583u) obj;
        return Intrinsics.areEqual(this.f107861a, c6583u.f107861a) && Intrinsics.areEqual(this.f107862b, c6583u.f107862b) && this.f107863c == c6583u.f107863c && Intrinsics.areEqual(this.f107864d, c6583u.f107864d);
    }

    public final int hashCode() {
        return this.f107864d.hashCode() + androidx.compose.animation.core.I.a(this.f107863c, I.E.a(this.f107861a.hashCode() * 31, 31, this.f107862b), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IntelligenceDownloadData(downloadUrl=");
        sb.append(this.f107861a);
        sb.append(", materialId=");
        sb.append(this.f107862b);
        sb.append(", materialType=");
        sb.append(this.f107863c);
        sb.append(", downloadName=");
        return C8770a.a(sb, this.f107864d, ")");
    }
}
