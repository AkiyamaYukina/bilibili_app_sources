package com.bilibili.ogv.secondary.part;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.window.core.layout.WindowSizeClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/c.class */
public interface InterfaceC5533c {

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.c$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/c$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements InterfaceC5533c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f72808a = new Object();

        @Override // com.bilibili.ogv.secondary.part.InterfaceC5533c
        public final int a(@NotNull WindowSizeClass windowSizeClass) {
            return windowSizeClass.getMinWidthDp() < 600 ? 3 : windowSizeClass.getMinWidthDp() < 840 ? 4 : 6;
        }

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -217605345;
        }

        @NotNull
        public final String toString() {
            return "CommonFeed";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.c$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/c$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements InterfaceC5533c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f72809a = new Object();

        @Override // com.bilibili.ogv.secondary.part.InterfaceC5533c
        public final int a(@NotNull WindowSizeClass windowSizeClass) {
            return windowSizeClass.getMinWidthDp() < 600 ? 2 : windowSizeClass.getMinWidthDp() < 840 ? 3 : 4;
        }

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 99899011;
        }

        @NotNull
        public final String toString() {
            return "FallRegionFeed";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.c$c, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/c$c.class */
    @StabilityInferred(parameters = 1)
    public static final class C0460c implements InterfaceC5533c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0460c f72810a = new Object();

        @Override // com.bilibili.ogv.secondary.part.InterfaceC5533c
        public final int a(@NotNull WindowSizeClass windowSizeClass) {
            return windowSizeClass.getMinWidthDp() < 600 ? 2 : windowSizeClass.getMinWidthDp() < 840 ? 4 : 6;
        }

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof C0460c);
        }

        public final int hashCode() {
            return 272447891;
        }

        @NotNull
        public final String toString() {
            return "ShortVideoFeed";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.c$d */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/c$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements InterfaceC5533c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f72811a = new Object();

        @Override // com.bilibili.ogv.secondary.part.InterfaceC5533c
        public final int a(@NotNull WindowSizeClass windowSizeClass) {
            return 1;
        }

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -156657011;
        }

        @NotNull
        public final String toString() {
            return "Singular";
        }
    }

    int a(@NotNull WindowSizeClass windowSizeClass);
}
