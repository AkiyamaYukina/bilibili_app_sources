package com.bilibili.playerbizcommonv2.widget.dowanload;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.live.streaming.source.TextSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/s.class */
public interface s {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/s$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f82591a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -835722474;
        }

        @NotNull
        public final String toString() {
            return "Completed";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/s$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f82592a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1879563347;
        }

        @NotNull
        public final String toString() {
            return "Error";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/s$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f82593a;

        public c(int i7) {
            this.f82593a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f82593a == ((c) obj).f82593a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f82593a);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f82593a, ")", new StringBuilder("Loading(progress="));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/s$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f82594a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1047482483;
        }

        @NotNull
        public final String toString() {
            return TextSource.STR_SCROLL_NONE;
        }
    }
}
