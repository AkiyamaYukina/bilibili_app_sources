package com.bilibili.search2.main.ogv;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.i;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.live.streaming.source.TextSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/f.class */
public interface f {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/f$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f86884a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1449397688;
        }

        @NotNull
        public final String toString() {
            return TextSource.STR_SCROLL_NONE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/f$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f86886b;

        public b(@ColorInt int i7, boolean z6) {
            this.f86885a = i7;
            this.f86886b = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f86885a == bVar.f86885a && this.f86886b == bVar.f86886b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f86886b) + (Integer.hashCode(this.f86885a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Showing(color=");
            sb.append(this.f86885a);
            sb.append(", isOver=");
            return i.a(sb, this.f86886b, ")");
        }
    }
}
