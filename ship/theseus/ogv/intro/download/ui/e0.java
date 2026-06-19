package com.bilibili.ship.theseus.ogv.intro.download.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.live.streaming.source.TextSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/e0.class */
public interface e0 {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/e0$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f92550a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1480987398;
        }

        @NotNull
        public final String toString() {
            return "Completed";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/e0$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f92551a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1707767863;
        }

        @NotNull
        public final String toString() {
            return "Error";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/e0$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f92552a;

        public c(int i7) {
            this.f92552a = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/e0$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f92553a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 886638377;
        }

        @NotNull
        public final String toString() {
            return TextSource.STR_SCROLL_NONE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/e0$e.class */
    @StabilityInferred(parameters = 1)
    public static final class e implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f92554a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 478380697;
        }

        @NotNull
        public final String toString() {
            return "Reserved";
        }
    }
}
