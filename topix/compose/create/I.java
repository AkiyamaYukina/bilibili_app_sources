package com.bilibili.topix.compose.create;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/I.class */
@StabilityInferred(parameters = 1)
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.text.input.G f112472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f112473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f112474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f112475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f112476e;

    public I() {
        this(null, 31);
    }

    public /* synthetic */ I(androidx.compose.ui.text.input.G g7, int i7) {
        this((i7 & 1) != 0 ? new androidx.compose.ui.text.input.G((String) null, 0L, 7) : g7, true, "", 0.0d, 300.0d);
    }

    public I(@NotNull androidx.compose.ui.text.input.G g7, boolean z6, @NotNull String str, double d7, double d8) {
        this.f112472a = g7;
        this.f112473b = z6;
        this.f112474c = str;
        this.f112475d = d7;
        this.f112476e = d8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i7 = (I) obj;
        return Intrinsics.areEqual(this.f112472a, i7.f112472a) && this.f112473b == i7.f112473b && Intrinsics.areEqual(this.f112474c, i7.f112474c) && Double.compare(this.f112475d, i7.f112475d) == 0 && Double.compare(this.f112476e, i7.f112476e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f112476e) + androidx.compose.ui.graphics.colorspace.A.a(this.f112475d, I.E.a(androidx.compose.animation.z.a(this.f112472a.hashCode() * 31, 31, this.f112473b), 31, this.f112474c), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TopicDescStatusState(desc=");
        sb.append(this.f112472a);
        sb.append(", isValid=");
        sb.append(this.f112473b);
        sb.append(", statusDesc=");
        sb.append(this.f112474c);
        sb.append(", wordCount=");
        sb.append(this.f112475d);
        sb.append(", descLimit=");
        return z4.b.a(sb, this.f112476e, ")");
    }
}
