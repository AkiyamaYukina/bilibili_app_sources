package com.bilibili.playerbizcommonv2.web;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/w.class */
public interface w {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/w$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f82266a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 159868058;
        }

        @NotNull
        public final String toString() {
            return "Error";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/w$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f82267a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 830019406;
        }

        @NotNull
        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/w$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f82268a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1373800939;
        }

        @NotNull
        public final String toString() {
            return "Success";
        }
    }
}
