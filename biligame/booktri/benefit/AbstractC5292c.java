package com.bilibili.biligame.booktri.benefit;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.biligame.booktri.benefit.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/c.class */
@StabilityInferred(parameters = 1)
public abstract class AbstractC5292c {

    /* JADX INFO: renamed from: com.bilibili.biligame.booktri.benefit.c$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/c$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends AbstractC5292c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C5290a f62362a;

        public a(@NotNull C5290a c5290a) {
            this.f62362a = c5290a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f62362a, ((a) obj).f62362a);
        }

        public final int hashCode() {
            this.f62362a.getClass();
            return 665846579;
        }

        @NotNull
        public final String toString() {
            return "AlreadyBooked(data=" + this.f62362a + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.biligame.booktri.benefit.c$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/c$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends AbstractC5292c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C5293d f62363a;

        public b(@NotNull C5293d c5293d) {
            this.f62363a = c5293d;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f62363a, ((b) obj).f62363a);
        }

        public final int hashCode() {
            return this.f62363a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Error(data=" + this.f62363a + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.biligame.booktri.benefit.c$c, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/c$c.class */
    @StabilityInferred(parameters = 1)
    public static final class C0343c extends AbstractC5292c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0343c f62364a = new AbstractC5292c();
    }

    /* JADX INFO: renamed from: com.bilibili.biligame.booktri.benefit.c$d */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/c$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d extends AbstractC5292c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f62365a = new AbstractC5292c();
    }

    /* JADX INFO: renamed from: com.bilibili.biligame.booktri.benefit.c$e */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/c$e.class */
    @StabilityInferred(parameters = 0)
    public static final class e extends AbstractC5292c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C5294e f62366a;

        public e(@NotNull C5294e c5294e) {
            this.f62366a = c5294e;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f62366a, ((e) obj).f62366a);
        }

        public final int hashCode() {
            return this.f62366a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Success(data=" + this.f62366a + ")";
        }
    }
}
