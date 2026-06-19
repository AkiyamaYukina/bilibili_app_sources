package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/w.class */
@StabilityInferred(parameters = 1)
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f89349a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/w$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends w {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f89350b;

        public a(@NotNull String str) {
            super(str);
            this.f89350b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f89350b, ((a) obj).f89350b);
        }

        public final int hashCode() {
            return this.f89350b.hashCode();
        }

        @NotNull
        public final String toString() {
            return C8770a.a(new StringBuilder("ClickBonus(activityUrl="), this.f89350b, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/w$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends w {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f89351b;

        public b(@NotNull String str) {
            super(str);
            this.f89351b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f89351b, ((b) obj).f89351b);
        }

        public final int hashCode() {
            return this.f89351b.hashCode();
        }

        @NotNull
        public final String toString() {
            return C8770a.a(new StringBuilder("ClickItem(activityUrl="), this.f89351b, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/w$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c extends w {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f89352b = new w(null);

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 229365310;
        }

        @NotNull
        public final String toString() {
            return "ClickShare";
        }
    }

    public w(String str) {
        this.f89349a = str;
    }
}
