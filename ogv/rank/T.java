package com.bilibili.ogv.rank;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/T.class */
public interface T {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/T$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements T {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f71893a;

        public a(boolean z6) {
            this.f71893a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f71893a == ((a) obj).f71893a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f71893a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("Failure(isNetworkError="), this.f71893a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/T$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements T {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f71894a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -870485301;
        }

        @NotNull
        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/T$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c implements T {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<com.bilibili.ogv.rank.api.f> f71895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableState f71896b = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

        public c(@NotNull List<com.bilibili.ogv.rank.api.f> list) {
            this.f71895a = list;
        }
    }
}
