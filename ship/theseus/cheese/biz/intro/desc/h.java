package com.bilibili.ship.theseus.cheese.biz.intro.desc;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/h.class */
@StabilityInferred(parameters = 1)
public abstract class h {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/h$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f89407a = new h();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2145591886;
        }

        @NotNull
        public final String toString() {
            return "ExpandButtonExposureIntent";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/h$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f89408a = new h();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -984317039;
        }

        @NotNull
        public final String toString() {
            return "ExpandImagesIntent";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/h$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f89409a;

        public c(int i7) {
            this.f89409a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f89409a == ((c) obj).f89409a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f89409a);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f89409a, ")", new StringBuilder("ItemExposureIntent(pos="));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/h$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f89410a = new h();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1103197512;
        }

        @NotNull
        public final String toString() {
            return "TitleExposureIntent";
        }
    }
}
