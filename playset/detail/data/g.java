package com.bilibili.playset.detail.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playset.api.MultitypePlaylist;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/g.class */
public interface g {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/g$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.playset.detail.data.e f84504a;

        public a(@NotNull com.bilibili.playset.detail.data.e eVar) {
            this.f84504a = eVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f84504a, ((a) obj).f84504a);
        }

        public final int hashCode() {
            this.f84504a.getClass();
            return 896048180;
        }

        @NotNull
        public final String toString() {
            return "DismissDialog(type=" + this.f84504a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/g$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final l f84505a;

        public b(@NotNull l lVar) {
            this.f84505a = lVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f84505a, ((b) obj).f84505a);
        }

        public final int hashCode() {
            return this.f84505a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Route(type=" + this.f84505a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/g$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final k f84506a;

        public c(@NotNull k kVar) {
            this.f84506a = kVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f84506a, ((c) obj).f84506a);
        }

        public final int hashCode() {
            return this.f84506a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "SetResult(type=" + this.f84506a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/g$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MultitypePlaylist.Info f84507a;

        public d(@NotNull MultitypePlaylist.Info info) {
            this.f84507a = info;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f84507a, ((d) obj).f84507a);
        }

        public final int hashCode() {
            return this.f84507a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ShareFolder(playInfo=" + this.f84507a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/g$e.class */
    @StabilityInferred(parameters = 0)
    public static final class e implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.playset.detail.data.d f84508a;

        public e(@NotNull com.bilibili.playset.detail.data.d dVar) {
            this.f84508a = dVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f84508a, ((e) obj).f84508a);
        }

        public final int hashCode() {
            return this.f84508a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ShowBottomSheet(type=" + this.f84508a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/g$f.class */
    @StabilityInferred(parameters = 1)
    public static final class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f84509a;

        public f(long j7) {
            this.f84509a = j7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f84509a == ((f) obj).f84509a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f84509a);
        }

        @NotNull
        public final String toString() {
            return android.support.v4.media.session.a.a(new StringBuilder("ShowClearAllInvalidVideoDialog(playlistId="), this.f84509a, ")");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.detail.data.g$g, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/g$g.class */
    @StabilityInferred(parameters = 0)
    public static final class C0568g implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.playset.detail.data.e f84510a;

        public C0568g(@NotNull com.bilibili.playset.detail.data.e eVar) {
            this.f84510a = eVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0568g) && Intrinsics.areEqual(this.f84510a, ((C0568g) obj).f84510a);
        }

        public final int hashCode() {
            this.f84510a.getClass();
            return 896048180;
        }

        @NotNull
        public final String toString() {
            return "ShowDialog(type=" + this.f84510a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/g$h.class */
    @StabilityInferred(parameters = 0)
    public static final class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.playset.api.c f84511a;

        public h(@NotNull com.bilibili.playset.api.c cVar) {
            this.f84511a = cVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.areEqual(this.f84511a, ((h) obj).f84511a);
        }

        public final int hashCode() {
            return this.f84511a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ShowShareDialog(item=" + this.f84511a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/g$i.class */
    @StabilityInferred(parameters = 0)
    public static final class i implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final r f84512a;

        public i(@NotNull r rVar) {
            this.f84512a = rVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.areEqual(this.f84512a, ((i) obj).f84512a);
        }

        public final int hashCode() {
            return this.f84512a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ShowToast(type=" + this.f84512a + ")";
        }
    }
}
