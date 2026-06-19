package com.bilibili.topix.compose.create;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.topix.create.TitleStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/J.class */
@StabilityInferred(parameters = 1)
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.text.input.G f112477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TitleStatus f112478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f112479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f112480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f112481e;

    public J() {
        this(null, 31);
    }

    public /* synthetic */ J(androidx.compose.ui.text.input.G g7, int i7) {
        this((i7 & 1) != 0 ? new androidx.compose.ui.text.input.G((String) null, 0L, 7) : g7, TitleStatus.Init, "", 0.0d, 18.0d);
    }

    public J(@NotNull androidx.compose.ui.text.input.G g7, @NotNull TitleStatus titleStatus, @NotNull String str, double d7, double d8) {
        this.f112477a = g7;
        this.f112478b = titleStatus;
        this.f112479c = str;
        this.f112480d = d7;
        this.f112481e = d8;
    }

    public static J a(J j7, androidx.compose.ui.text.input.G g7, TitleStatus titleStatus, double d7, int i7) {
        if ((i7 & 1) != 0) {
            g7 = j7.f112477a;
        }
        String str = j7.f112479c;
        if ((i7 & 8) != 0) {
            d7 = j7.f112480d;
        }
        double d8 = j7.f112481e;
        j7.getClass();
        return new J(g7, titleStatus, str, d7, d8);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j7 = (J) obj;
        return Intrinsics.areEqual(this.f112477a, j7.f112477a) && this.f112478b == j7.f112478b && Intrinsics.areEqual(this.f112479c, j7.f112479c) && Double.compare(this.f112480d, j7.f112480d) == 0 && Double.compare(this.f112481e, j7.f112481e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f112481e) + androidx.compose.ui.graphics.colorspace.A.a(this.f112480d, I.E.a((this.f112478b.hashCode() + (this.f112477a.hashCode() * 31)) * 31, 31, this.f112479c), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TopicNameStatusState(name=");
        sb.append(this.f112477a);
        sb.append(", nameStatus=");
        sb.append(this.f112478b);
        sb.append(", statusDesc=");
        sb.append(this.f112479c);
        sb.append(", nameCount=");
        sb.append(this.f112480d);
        sb.append(", nameLimit=");
        return z4.b.a(sb, this.f112481e, ")");
    }
}
