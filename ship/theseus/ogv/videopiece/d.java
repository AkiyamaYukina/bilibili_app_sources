package com.bilibili.ship.theseus.ogv.videopiece;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.adcommon.data.model.AdBrandData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/d.class */
@StabilityInferred(parameters = 1)
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f94814a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/d$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a extends d {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return Duration.equals-impl0(this.f94814a, ((a) obj).f94814a);
        }

        public final int hashCode() {
            return Duration.hashCode-impl(this.f94814a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/d$b.class */
    @StabilityInferred(parameters = 1)
    public static abstract class b extends d {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/d$b$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a extends b {
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/d$b$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0752b extends b {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/d$b$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c extends b {
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.d$b$d, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/d$b$d.class */
        @StabilityInferred(parameters = 1)
        public static final class C0753d extends b {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/d$b$e.class */
        @StabilityInferred(parameters = 1)
        public static final class e extends b {
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return Duration.equals-impl0(this.f94814a, ((b) obj).f94814a);
        }

        public final int hashCode() {
            return Duration.hashCode-impl(this.f94814a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/d$c.class */
    @StabilityInferred(parameters = 1)
    public static abstract class c extends d {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/d$c$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a extends c {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/d$c$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends c {
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.d$c$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/d$c$c.class */
        @StabilityInferred(parameters = 1)
        public static final class C0754c extends c {
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.d$c$d, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/d$c$d.class */
        @StabilityInferred(parameters = 1)
        public static final class C0755d extends c {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f7, long j7) {
            super(DurationKt.toDuration((long) (j7 * f7), DurationUnit.MILLISECONDS));
            Duration.Companion companion = Duration.Companion;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return Duration.equals-impl0(this.f94814a, ((c) obj).f94814a);
        }

        public final int hashCode() {
            return Duration.hashCode-impl(this.f94814a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.d$d, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/d$d.class */
    @StabilityInferred(parameters = 0)
    public static final class C0756d extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final AdBrandData f94815b;

        public C0756d(AdBrandData adBrandData, long j7) {
            super(j7);
            this.f94815b = adBrandData;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean z6 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0756d)) {
                return false;
            }
            C0756d c0756d = (C0756d) obj;
            if (!Duration.equals-impl0(this.f94814a, c0756d.f94814a) || !Intrinsics.areEqual(this.f94815b, c0756d.f94815b)) {
                z6 = false;
            }
            return z6;
        }

        public final int hashCode() {
            return Duration.hashCode-impl(this.f94814a);
        }
    }

    public d(long j7) {
        this.f94814a = j7;
    }
}
