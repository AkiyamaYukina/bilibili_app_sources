package com.bilibili.playset.detail.data;

import android.graphics.Rect;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playset.api.MultitypePlaylist;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/d.class */
public interface d {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/d$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.playset.api.c f84458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Rect f84459b;

        public a(@NotNull com.bilibili.playset.api.c cVar, @Nullable Rect rect) {
            this.f84458a = cVar;
            this.f84459b = rect;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f84458a, aVar.f84458a) && Intrinsics.areEqual(this.f84459b, aVar.f84459b);
        }

        public final int hashCode() {
            int iHashCode = this.f84458a.hashCode();
            Rect rect = this.f84459b;
            return (iHashCode * 31) + (rect == null ? 0 : rect.hashCode());
        }

        @NotNull
        public final String toString() {
            return "ClearInvalid(item=" + this.f84458a + ", anchorRect=" + this.f84459b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/d$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.playset.api.c f84460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Rect f84461b;

        public b(@NotNull com.bilibili.playset.api.c cVar, @Nullable Rect rect) {
            this.f84460a = cVar;
            this.f84461b = rect;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f84460a, bVar.f84460a) && Intrinsics.areEqual(this.f84461b, bVar.f84461b);
        }

        public final int hashCode() {
            int iHashCode = this.f84460a.hashCode();
            Rect rect = this.f84461b;
            return (iHashCode * 31) + (rect == null ? 0 : rect.hashCode());
        }

        @NotNull
        public final String toString() {
            return "FavTabArticle(item=" + this.f84460a + ", anchorRect=" + this.f84461b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/d$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f84462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f84463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f84464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final MultitypePlaylist.Info f84465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f84466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final Rect f84467f;

        public c(boolean z6, boolean z7, long j7, @NotNull MultitypePlaylist.Info info, boolean z8, @NotNull Rect rect) {
            this.f84462a = z6;
            this.f84463b = z7;
            this.f84464c = j7;
            this.f84465d = info;
            this.f84466e = z8;
            this.f84467f = rect;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f84462a == cVar.f84462a && this.f84463b == cVar.f84463b && this.f84464c == cVar.f84464c && Intrinsics.areEqual(this.f84465d, cVar.f84465d) && this.f84466e == cVar.f84466e && Intrinsics.areEqual(this.f84467f, cVar.f84467f);
        }

        public final int hashCode() {
            return this.f84467f.hashCode() + z.a((this.f84465d.hashCode() + C3554n0.a(z.a(Boolean.hashCode(this.f84462a) * 31, 31, this.f84463b), 31, this.f84464c)) * 31, 31, this.f84466e);
        }

        @NotNull
        public final String toString() {
            return "Overflow(isPlaylistAuthor=" + this.f84462a + ", isDefaultPlaylist=" + this.f84463b + ", playlistId=" + this.f84464c + ", basicInfo=" + this.f84465d + ", isWideScreen=" + this.f84466e + ", anchorRect=" + this.f84467f + ")";
        }
    }
}
