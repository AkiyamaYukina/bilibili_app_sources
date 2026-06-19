package com.bilibili.ogv.filmlist;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/s.class */
public interface s {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/s$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements s {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        @NotNull
        public final String toString() {
            return "Failure(isNetworkError=false)";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/s$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f67794a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1854785293;
        }

        @NotNull
        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/s$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ogv.filmlist.api.c f67795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableState f67796b = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

        public c(@NotNull com.bilibili.ogv.filmlist.api.c cVar) {
            this.f67795a = cVar;
        }
    }
}
