package com.bilibili.relation;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/A.class */
@StabilityInferred(parameters = 1)
public abstract class A {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/A$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f85874a = new A();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1056094233;
        }

        @NotNull
        public final String toString() {
            return "FullMenu";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/A$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f85875a = new A();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1913017200;
        }

        @NotNull
        public final String toString() {
            return "GroupUnfollow";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/A$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c extends A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f85876a = new A();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -729016017;
        }

        @NotNull
        public final String toString() {
            return "UnfollowOnly";
        }
    }
}
