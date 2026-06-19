package com.bilibili.ship.theseus.ugc.play.schedule;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Av0.a f98180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f98181b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/e$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/e$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0911a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0911a f98182a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0911a);
            }

            public final int hashCode() {
                return -1562190280;
            }

            @NotNull
            public final String toString() {
                return "FromEndedPause";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/e$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f98183a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -950351241;
            }

            @NotNull
            public final String toString() {
                return "FromRepeat";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/e$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f98184a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 316710086;
            }

            @NotNull
            public final String toString() {
                return "FromUGCVideo";
            }
        }
    }

    public e(@NotNull Av0.a aVar, @NotNull a aVar2) {
        this.f98180a = aVar;
        this.f98181b = aVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f98180a, eVar.f98180a) && Intrinsics.areEqual(this.f98181b, eVar.f98181b);
    }

    public final int hashCode() {
        return this.f98181b.hashCode() + (this.f98180a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "EpisodeInDiverse(episode=" + this.f98180a + ", playFrom=" + this.f98181b + ")";
    }
}
