package com.bilibili.ship.theseus.cheese.biz.intro.pack;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/v.class */
@StabilityInferred(parameters = 1)
public abstract class v {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/v$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f89578a;

        public a(int i7) {
            this.f89578a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f89578a == ((a) obj).f89578a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f89578a);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f89578a, ")", new StringBuilder("OnClickItem(pos="));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/v$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f89579a = new v();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/v$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f89580a;

        public c(int i7) {
            this.f89580a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f89580a == ((c) obj).f89580a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f89580a);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f89580a, ")", new StringBuilder("OnExposureItem(pos="));
        }
    }
}
