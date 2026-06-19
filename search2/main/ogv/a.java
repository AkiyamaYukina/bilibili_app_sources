package com.bilibili.search2.main.ogv;

import androidx.annotation.ColorInt;
import androidx.compose.animation.core.I;
import androidx.compose.animation.n;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.live.streaming.source.TextSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/a.class */
public interface a {

    /* JADX INFO: renamed from: com.bilibili.search2.main.ogv.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/a$a.class */
    @StabilityInferred(parameters = 1)
    public static final class C0582a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0582a f86856a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof C0582a);
        }

        public final int hashCode() {
            return -571939992;
        }

        @NotNull
        public final String toString() {
            return TextSource.STR_SCROLL_NONE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/a$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f86858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f86859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f86860d;

        public b(@ColorInt int i7, int i8, float f7, float f8) {
            this.f86857a = i7;
            this.f86858b = i8;
            this.f86859c = f7;
            this.f86860d = f8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f86857a == bVar.f86857a && this.f86858b == bVar.f86858b && Float.compare(this.f86859c, bVar.f86859c) == 0 && Float.compare(this.f86860d, bVar.f86860d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f86860d) + n.a(this.f86859c, I.a(this.f86858b, Integer.hashCode(this.f86857a) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Showing(color=");
            sb.append(this.f86857a);
            sb.append(", height=");
            sb.append(this.f86858b);
            sb.append(", startAlpha=");
            sb.append(this.f86859c);
            sb.append(", endAlpha=");
            return C.d.a(this.f86860d, ")", sb);
        }
    }
}
