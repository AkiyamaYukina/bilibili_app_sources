package com.bilibili.search2.discover;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/j.class */
@StabilityInferred(parameters = 1)
public abstract class j {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/j$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f86445a = new j();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -859858119;
        }

        @NotNull
        public final String toString() {
            return "Change";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/j$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f86446a = new j();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 343423705;
        }

        @NotNull
        public final String toString() {
            return "Init";
        }
    }
}
