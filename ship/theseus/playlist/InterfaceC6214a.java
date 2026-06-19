package com.bilibili.ship.theseus.playlist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/a.class */
public interface InterfaceC6214a {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C0771a implements InterfaceC6214a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MultiTypeMedia f95185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Ou0.c f95186b;

        public C0771a(@NotNull MultiTypeMedia multiTypeMedia, @Nullable Ou0.c cVar) {
            this.f95185a = multiTypeMedia;
            this.f95186b = cVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0771a)) {
                return false;
            }
            C0771a c0771a = (C0771a) obj;
            return Intrinsics.areEqual(this.f95185a, c0771a.f95185a) && Intrinsics.areEqual(this.f95186b, c0771a.f95186b);
        }

        public final int hashCode() {
            int iHashCode = this.f95185a.hashCode();
            Ou0.c cVar = this.f95186b;
            return (iHashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        @NotNull
        public final String toString() {
            return "AnotherEpisode(media=" + this.f95185a + ", episode=" + this.f95186b + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.a$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/a$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b implements InterfaceC6214a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MultiTypeMedia f95187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Ou0.c f95188b;

        public b(@NotNull MultiTypeMedia multiTypeMedia, @Nullable Ou0.c cVar) {
            this.f95187a = multiTypeMedia;
            this.f95188b = cVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f95187a, bVar.f95187a) && Intrinsics.areEqual(this.f95188b, bVar.f95188b);
        }

        public final int hashCode() {
            int iHashCode = this.f95187a.hashCode();
            Ou0.c cVar = this.f95188b;
            return (iHashCode * 31) + (cVar == null ? 0 : cVar.hashCode());
        }

        @NotNull
        public final String toString() {
            return "AnotherMedia(media=" + this.f95187a + ", episode=" + this.f95188b + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.a$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/a$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c implements InterfaceC6214a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f95189a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -476271353;
        }

        @NotNull
        public final String toString() {
            return TextSource.STR_SCROLL_NONE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.a$d */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/a$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements InterfaceC6214a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f95190a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1878072825;
        }

        @NotNull
        public final String toString() {
            return "Pause";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.a$e */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/a$e.class */
    @StabilityInferred(parameters = 0)
    public static final class e implements InterfaceC6214a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MultiTypeMedia f95191a;

        public e(@NotNull MultiTypeMedia multiTypeMedia) {
            this.f95191a = multiTypeMedia;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f95191a, ((e) obj).f95191a);
        }

        public final int hashCode() {
            return this.f95191a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "RandomMedia(media=" + this.f95191a + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.a$f */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/a$f.class */
    @StabilityInferred(parameters = 1)
    public static final class f implements InterfaceC6214a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f95192a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1970074538;
        }

        @NotNull
        public final String toString() {
            return "Repeat";
        }
    }
}
