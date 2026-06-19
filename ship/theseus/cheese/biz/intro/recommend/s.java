package com.bilibili.ship.theseus.cheese.biz.intro.recommend;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/s.class */
@StabilityInferred(parameters = 1)
public abstract class s {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/s$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f89993a;

        public a(int i7) {
            this.f89993a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f89993a == ((a) obj).f89993a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f89993a);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f89993a, ")", new StringBuilder("ClickItemIntent(pos="));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/s$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f89994a = new s();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/s$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f89995a = new s();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/s$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final u f89996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f89997b;

        public d(@Nullable u uVar, int i7) {
            this.f89996a = uVar;
            this.f89997b = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f89996a, dVar.f89996a) && this.f89997b == dVar.f89997b;
        }

        public final int hashCode() {
            u uVar = this.f89996a;
            return Integer.hashCode(this.f89997b) + ((uVar == null ? 0 : uVar.hashCode()) * 31);
        }

        @NotNull
        public final String toString() {
            return "ItemExposureIntent(data=" + this.f89996a + ", pos=" + this.f89997b + ")";
        }
    }
}
