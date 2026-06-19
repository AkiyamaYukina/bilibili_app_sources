package com.bilibili.ogv.rank.part;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/r.class */
public interface r {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/r$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements r {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/r$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f72118a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -886367570;
        }

        @NotNull
        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/r$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ogv.rank.api.a f72119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableState f72120b = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

        public c(@NotNull com.bilibili.ogv.rank.api.a aVar) {
            this.f72119a = aVar;
        }
    }
}
