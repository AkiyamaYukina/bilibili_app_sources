package com.bilibili.studio.videoeditor;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/s.class */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f109899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f109900b;

    public /* synthetic */ s(String str) {
        this(str, "");
    }

    public s(@NotNull String str, @NotNull String str2) {
        this.f109899a = str;
        this.f109900b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f109899a, sVar.f109899a) && Intrinsics.areEqual(this.f109900b, sVar.f109900b);
    }

    public final int hashCode() {
        return this.f109900b.hashCode() + (this.f109899a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ModLoadResource(modName=");
        sb.append(this.f109899a);
        sb.append(", fileName=");
        return C8770a.a(sb, this.f109900b, ")");
    }
}
