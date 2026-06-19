package com.bilibili.pegasus.components.videomode;

import Vn.A;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/c.class */
@StabilityInferred(parameters = 1)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("timeoutForDismiss")
    private final int f77202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("timeoutForClick")
    private final int f77203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("storyGuide")
    @Nullable
    private final a f77204c;

    public c() {
        this(0);
    }

    public c(int i7) {
        this.f77202a = 0;
        this.f77203b = 0;
        this.f77204c = null;
    }

    @Nullable
    public final a a() {
        return this.f77204c;
    }

    public final int b() {
        return this.f77203b;
    }

    public final int c() {
        return this.f77202a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f77202a == cVar.f77202a && this.f77203b == cVar.f77203b && Intrinsics.areEqual(this.f77204c, cVar.f77204c);
    }

    public final int hashCode() {
        int iA = I.a(this.f77203b, Integer.hashCode(this.f77202a) * 31, 31);
        a aVar = this.f77204c;
        return iA + (aVar == null ? 0 : aVar.hashCode());
    }

    @NotNull
    public final String toString() {
        int i7 = this.f77202a;
        int i8 = this.f77203b;
        a aVar = this.f77204c;
        StringBuilder sbB = A.b(i7, i8, "VideoModeGuidanceConfigV2(timeoutForDismiss=", ", timeoutForClick=", ", storyGuide=");
        sbB.append(aVar);
        sbB.append(")");
        return sbB.toString();
    }
}
