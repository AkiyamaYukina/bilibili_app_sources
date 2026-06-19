package com.bilibili.search2.halfscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/b.class */
public interface b {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/b$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f86557a;

        public a(boolean z6) {
            this.f86557a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f86557a == ((a) obj).f86557a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f86557a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("ApplyLightStatusBars(lightStatusBars="), this.f86557a, ")");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.halfscreen.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/b$b.class */
    @StabilityInferred(parameters = 1)
    public static final class C0578b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0578b f86558a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof C0578b);
        }

        public final int hashCode() {
            return 2015054743;
        }

        @NotNull
        public final String toString() {
            return "ConsumeHeaderHidden";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/b$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Ns0.f f86559a;

        public c(@NotNull Ns0.f fVar) {
            this.f86559a = fVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f86559a, ((c) obj).f86559a);
        }

        public final int hashCode() {
            return this.f86559a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "EmitSearchEvent(event=" + this.f86559a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/b$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f86560a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1543171625;
        }

        @NotNull
        public final String toString() {
            return "RequestCoreFragmentBack";
        }
    }
}
