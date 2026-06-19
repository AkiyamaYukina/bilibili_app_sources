package com.bilibili.playset.detail.data;

import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/r.class */
public interface r {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/r$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f84556a;

        public a(boolean z6) {
            this.f84556a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f84556a == ((a) obj).f84556a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f84556a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("ClearAllInvalidVideo(success="), this.f84556a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/r$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f84557a;

        public b(boolean z6) {
            this.f84557a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f84557a == ((b) obj).f84557a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f84557a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("ClearInvalidVideo(success="), this.f84557a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/r$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f84558a;

        public c(boolean z6) {
            this.f84558a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f84558a == ((c) obj).f84558a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f84558a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("DeleteMedia(success="), this.f84558a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/r$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f84559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f84560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f84561c;

        public d(long j7, boolean z6, boolean z7) {
            this.f84559a = z6;
            this.f84560b = j7;
            this.f84561c = z7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f84559a == dVar.f84559a && this.f84560b == dVar.f84560b && this.f84561c == dVar.f84561c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f84561c) + z.a(C3554n0.a(Boolean.hashCode(this.f84559a) * 31, 31, this.f84560b), 31, true);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("DeletePlaylist(success=");
            sb.append(this.f84559a);
            sb.append(", playlistId=");
            sb.append(this.f84560b);
            sb.append(", isDelete=true, isCreateNewFolder=");
            return androidx.appcompat.app.i.a(sb, this.f84561c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/r$e.class */
    @StabilityInferred(parameters = 0)
    public static final class e implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f84562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Throwable f84563b;

        public e(@Nullable Throwable th, boolean z6) {
            this.f84562a = z6;
            this.f84563b = th;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f84562a == eVar.f84562a && Intrinsics.areEqual(this.f84563b, eVar.f84563b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f84562a);
            Throwable th = this.f84563b;
            return (iHashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        @NotNull
        public final String toString() {
            return "FavPlaylist(success=" + this.f84562a + ", t=" + this.f84563b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/r$f.class */
    @StabilityInferred(parameters = 1)
    public static final class f implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f84564a;

        public f(boolean z6) {
            this.f84564a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f84564a == ((f) obj).f84564a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f84564a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("LikePlaylist(success="), this.f84564a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/r$g.class */
    @StabilityInferred(parameters = 1)
    public static final class g implements r {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        @NotNull
        public final String toString() {
            return "ToTop(success=true)";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/r$h.class */
    @StabilityInferred(parameters = 1)
    public static final class h implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f84565a;

        public h(boolean z6) {
            this.f84565a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f84565a == ((h) obj).f84565a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f84565a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("UnFavPlaylist(success="), this.f84565a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/r$i.class */
    @StabilityInferred(parameters = 1)
    public static final class i implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f84566a;

        public i(boolean z6) {
            this.f84566a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f84566a == ((i) obj).f84566a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f84566a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("UnLikePlaylist(success="), this.f84566a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/r$j.class */
    @StabilityInferred(parameters = 1)
    public static final class j implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final j f84567a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 533870444;
        }

        @NotNull
        public final String toString() {
            return "UnSupportFavSelfFolder";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/r$k.class */
    @StabilityInferred(parameters = 1)
    public static final class k implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final k f84568a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -2107318794;
        }

        @NotNull
        public final String toString() {
            return "UnSupportShare";
        }
    }
}
