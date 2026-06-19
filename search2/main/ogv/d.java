package com.bilibili.search2.main.ogv;

import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.live.streaming.source.TextSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/d.class */
public interface d {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/d$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f86868a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 653203929;
        }

        @NotNull
        public final String toString() {
            return TextSource.STR_SCROLL_NONE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/d$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Bitmap f86869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f86870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Integer f86871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Float f86872d;

        public b(@NotNull Bitmap bitmap, int i7, @ColorInt @Nullable Integer num, @Nullable Float f7) {
            this.f86869a = bitmap;
            this.f86870b = i7;
            this.f86871c = num;
            this.f86872d = f7;
        }

        public static b a(b bVar, int i7, Integer num, Float f7, int i8) {
            Bitmap bitmap = bVar.f86869a;
            if ((i8 & 2) != 0) {
                i7 = bVar.f86870b;
            }
            if ((i8 & 4) != 0) {
                num = bVar.f86871c;
            }
            if ((i8 & 8) != 0) {
                f7 = bVar.f86872d;
            }
            bVar.getClass();
            return new b(bitmap, i7, num, f7);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f86869a, bVar.f86869a) && this.f86870b == bVar.f86870b && Intrinsics.areEqual(this.f86871c, bVar.f86871c) && Intrinsics.areEqual(this.f86872d, bVar.f86872d);
        }

        public final int hashCode() {
            int iA = I.a(this.f86870b, this.f86869a.hashCode() * 31, 31);
            int iHashCode = 0;
            Integer num = this.f86871c;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            Float f7 = this.f86872d;
            if (f7 != null) {
                iHashCode = f7.hashCode();
            }
            return ((iA + iHashCode2) * 31) + iHashCode;
        }

        @NotNull
        public final String toString() {
            return "OgvBitmapBackground(bitmap=" + this.f86869a + ", scrollOffset=" + this.f86870b + ", overlayColor=" + this.f86871c + ", overlayAlpha=" + this.f86872d + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/d$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86873a;

        public c(@ColorInt int i7) {
            this.f86873a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f86873a == ((c) obj).f86873a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f86873a);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f86873a, ")", new StringBuilder("ThemeColor(color="));
        }
    }
}
