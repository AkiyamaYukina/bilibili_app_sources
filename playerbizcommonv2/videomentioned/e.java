package com.bilibili.playerbizcommonv2.videomentioned;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/e.class */
@StabilityInferred(parameters = 1)
public abstract class e {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/e$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f82009a;

        public a(boolean z6) {
            this.f82009a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f82009a == ((a) obj).f82009a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f82009a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("EditStateChange(editing="), this.f82009a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/e$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f82010a;

        public b(boolean z6) {
            this.f82010a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f82010a == ((b) obj).f82010a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f82010a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("HiddenStateChange(hidden="), this.f82010a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/e$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f82011a;

        public c(boolean z6) {
            this.f82011a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f82011a == ((c) obj).f82011a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f82011a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("SelectAll(select="), this.f82011a, ")");
        }
    }
}
