package com.bilibili.ship.theseus.keel.player;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.protobuf.Any;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/c.class */
public interface c {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/c$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f91085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Any f91086b;

        public a(int i7, @Nullable Any any) {
            this.f91085a = i7;
            this.f91086b = any;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/c$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f91087a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1563456614;
        }

        @NotNull
        public final String toString() {
            return "Malformed";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.c$c, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/c$c.class */
    @StabilityInferred(parameters = 1)
    public static final class C0674c implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Integer f91088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Any f91089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Any f91090c;

        public C0674c() {
            this(null, null, null);
        }

        public C0674c(@Nullable Integer num, @Nullable Any any, @Nullable Any any2) {
            this.f91088a = num;
            this.f91089b = any;
            this.f91090c = any2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0674c)) {
                return false;
            }
            C0674c c0674c = (C0674c) obj;
            return Intrinsics.areEqual(this.f91088a, c0674c.f91088a) && Intrinsics.areEqual(this.f91089b, c0674c.f91089b) && Intrinsics.areEqual(this.f91090c, c0674c.f91090c);
        }

        public final int hashCode() {
            int iHashCode = 0;
            Integer num = this.f91088a;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            Any any = this.f91089b;
            int iHashCode3 = any == null ? 0 : any.hashCode();
            Any any2 = this.f91090c;
            if (any2 != null) {
                iHashCode = any2.hashCode();
            }
            return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        }

        @NotNull
        public final String toString() {
            return "MasterPiece(adPieceIndex=" + this.f91088a + ", supplement=" + this.f91089b + ", sourceContent=" + this.f91090c + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/c$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f91091a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1447822287;
        }

        @NotNull
        public final String toString() {
            return "OGVPiece";
        }
    }
}
