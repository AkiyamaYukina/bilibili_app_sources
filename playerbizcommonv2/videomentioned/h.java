package com.bilibili.playerbizcommonv2.videomentioned;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/h.class */
@StabilityInferred(parameters = 1)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f82018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f82019b;

    public h(@NotNull String str, @NotNull String str2) {
        this.f82018a = str;
        this.f82019b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f82018a, hVar.f82018a) && Intrinsics.areEqual(this.f82019b, hVar.f82019b);
    }

    public final int hashCode() {
        return this.f82019b.hashCode() + (this.f82018a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMentionMoreBtn(title=");
        sb.append(this.f82018a);
        sb.append(", icon=");
        return C8770a.a(sb, this.f82019b, ")");
    }
}
