package com.bilibili.playset;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.playset.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/n.class */
public interface InterfaceC5992n {

    /* JADX INFO: renamed from: com.bilibili.playset.n$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/n$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements InterfaceC5992n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f85102a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 777767958;
        }

        @NotNull
        public final String toString() {
            return "CleanInvalidError";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.n$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/n$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements InterfaceC5992n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f85103a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1523008553;
        }

        @NotNull
        public final String toString() {
            return "Empty";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.n$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/n$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c implements InterfaceC5992n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f85104a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 987846936;
        }

        @NotNull
        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.n$d */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/n$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements InterfaceC5992n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f85105a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 548652574;
        }

        @NotNull
        public final String toString() {
            return "NetworkError";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.n$e */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/n$e.class */
    @StabilityInferred(parameters = 1)
    public static final class e implements InterfaceC5992n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f85106a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -782207108;
        }

        @NotNull
        public final String toString() {
            return "OtherError";
        }
    }
}
