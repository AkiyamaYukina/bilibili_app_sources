package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import eu0.C6987f;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/M.class */
@StabilityInferred(parameters = 0)
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C6987f f89645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState<a> f89646b = SnapshotStateKt.mutableStateOf$default(a.b.f89648a, null, 2, null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/M$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.M$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/M$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0616a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0616a f89647a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0616a);
            }

            public final int hashCode() {
                return -885981036;
            }

            @NotNull
            public final String toString() {
                return "Error";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/M$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f89648a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 791387336;
            }

            @NotNull
            public final String toString() {
                return "Loading";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/M$a$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final RelatedCoursesDetails f89649a;

            public c(@NotNull RelatedCoursesDetails relatedCoursesDetails) {
                this.f89649a = relatedCoursesDetails;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f89649a, ((c) obj).f89649a);
            }

            public final int hashCode() {
                return this.f89649a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Success(details=" + this.f89649a + ")";
            }
        }
    }

    @Inject
    public M(@NotNull C6987f c6987f) {
        this.f89645a = c6987f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.primary.M.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
