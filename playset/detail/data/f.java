package com.bilibili.playset.detail.data;

import android.graphics.Rect;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import com.bilibili.playset.playlist.adapters.FavFooterItem$Companion$LoadMoreType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f.class */
public interface f {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f84469a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 453288142;
        }

        @NotNull
        public final String toString() {
            return "ChangeFavStatePlayList";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f84470a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1045155174;
        }

        @NotNull
        public final String toString() {
            return "ChangeLikeStatePlaylist";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f84471a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -460157532;
        }

        @NotNull
        public final String toString() {
            return "CleanInvalid";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f84472a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -752005330;
        }

        @NotNull
        public final String toString() {
            return "ClearAllInvalidVideo";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$e.class */
    @StabilityInferred(parameters = 0)
    public static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.playset.api.c f84473a;

        public e(@NotNull com.bilibili.playset.api.c cVar) {
            this.f84473a = cVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f84473a, ((e) obj).f84473a);
        }

        public final int hashCode() {
            return this.f84473a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ClearInvalidVideo(item=" + this.f84473a + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.detail.data.f$f, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$f.class */
    @StabilityInferred(parameters = 0)
    public static final class C0567f implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.playset.api.c f84474a;

        public C0567f(@NotNull com.bilibili.playset.api.c cVar) {
            this.f84474a = cVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0567f) && Intrinsics.areEqual(this.f84474a, ((C0567f) obj).f84474a);
        }

        public final int hashCode() {
            return this.f84474a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ClickClearInvalidVideo(item=" + this.f84474a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$g.class */
    @StabilityInferred(parameters = 0)
    public static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.playset.api.c f84475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f84476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Rect f84477c;

        public g(@NotNull com.bilibili.playset.api.c cVar, int i7, @Nullable Rect rect) {
            this.f84475a = cVar;
            this.f84476b = i7;
            this.f84477c = rect;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.areEqual(this.f84475a, gVar.f84475a) && this.f84476b == gVar.f84476b && Intrinsics.areEqual(this.f84477c, gVar.f84477c);
        }

        public final int hashCode() {
            int iA = I.a(this.f84476b, this.f84475a.hashCode() * 31, 31);
            Rect rect = this.f84477c;
            return iA + (rect == null ? 0 : rect.hashCode());
        }

        @NotNull
        public final String toString() {
            return "ClickFavItem(item=" + this.f84475a + ", index=" + this.f84476b + ", anchorRect=" + this.f84477c + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$h.class */
    @StabilityInferred(parameters = 0)
    public static final class h implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.playset.api.c f84478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Rect f84479b;

        public h(@NotNull com.bilibili.playset.api.c cVar, @Nullable Rect rect) {
            this.f84478a = cVar;
            this.f84479b = rect;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.areEqual(this.f84478a, hVar.f84478a) && Intrinsics.areEqual(this.f84479b, hVar.f84479b);
        }

        public final int hashCode() {
            int iHashCode = this.f84478a.hashCode();
            Rect rect = this.f84479b;
            return (iHashCode * 31) + (rect == null ? 0 : rect.hashCode());
        }

        @NotNull
        public final String toString() {
            return "ClickFavItemMore(item=" + this.f84478a + ", anchorRect=" + this.f84479b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$i.class */
    @StabilityInferred(parameters = 0)
    public static final class i implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.playset.api.c f84480a;

        public i(@NotNull com.bilibili.playset.api.c cVar) {
            this.f84480a = cVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.areEqual(this.f84480a, ((i) obj).f84480a);
        }

        public final int hashCode() {
            return this.f84480a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "DeleteMedia(item=" + this.f84480a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$j.class */
    @StabilityInferred(parameters = 1)
    public static final class j implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f84481a;

        public j(long j7) {
            this.f84481a = j7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f84481a == ((j) obj).f84481a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f84481a);
        }

        @NotNull
        public final String toString() {
            return android.support.v4.media.session.a.a(new StringBuilder("DeletePlaylist(playlistId="), this.f84481a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$k.class */
    @StabilityInferred(parameters = 1)
    public static final class k implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final k f84482a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1166798269;
        }

        @NotNull
        public final String toString() {
            return "ExpandedIntro";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$l.class */
    @StabilityInferred(parameters = 1)
    public static final class l implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f84483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f84484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f84485c;

        public l(long j7, long j8, int i7) {
            this.f84483a = j7;
            this.f84484b = j8;
            this.f84485c = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f84483a == lVar.f84483a && this.f84484b == lVar.f84484b && this.f84485c == lVar.f84485c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f84485c) + C3554n0.a(Long.hashCode(this.f84483a) * 31, 31, this.f84484b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Initial(playlistId=");
            sb.append(this.f84483a);
            sb.append(", folderMid=");
            sb.append(this.f84484b);
            sb.append(", contentMode=");
            return C4277b.a(this.f84485c, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$m.class */
    @StabilityInferred(parameters = 0)
    public static final class m implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.playset.api.c f84486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f84487b;

        public m(@NotNull com.bilibili.playset.api.c cVar, int i7) {
            this.f84486a = cVar;
            this.f84487b = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Intrinsics.areEqual(this.f84486a, mVar.f84486a) && this.f84487b == mVar.f84487b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f84487b) + (this.f84486a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "ItemExposed(item=" + this.f84486a + ", position=" + this.f84487b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$n.class */
    @StabilityInferred(parameters = 1)
    public static final class n implements f {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            ((n) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        @NotNull
        public final String toString() {
            return "LoadData(isLoadFirstPage=true)";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$o.class */
    @StabilityInferred(parameters = 1)
    public static final class o implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final o f84488a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 1199360657;
        }

        @NotNull
        public final String toString() {
            return "LoadMore";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$p.class */
    @StabilityInferred(parameters = 1)
    public static final class p implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final p f84489a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -2079662533;
        }

        @NotNull
        public final String toString() {
            return "PlaylistBatchManager";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$q.class */
    @StabilityInferred(parameters = 0)
    public static final class q implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f84490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Rect f84491b;

        public q(boolean z6, @NotNull Rect rect) {
            this.f84490a = z6;
            this.f84491b = rect;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.f84490a == qVar.f84490a && Intrinsics.areEqual(this.f84491b, qVar.f84491b);
        }

        public final int hashCode() {
            return this.f84491b.hashCode() + (Boolean.hashCode(this.f84490a) * 31);
        }

        @NotNull
        public final String toString() {
            return "PlaylistOverflow(isWideScreen=" + this.f84490a + ", anchorRect=" + this.f84491b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$r.class */
    @StabilityInferred(parameters = 1)
    public static final class r implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final r f84492a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return 2120066768;
        }

        @NotNull
        public final String toString() {
            return "PlaylistSearch";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$s.class */
    @StabilityInferred(parameters = 1)
    public static final class s implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f84493a;

        public s(long j7) {
            this.f84493a = j7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s) {
                return this.f84493a == ((s) obj).f84493a && Intrinsics.areEqual(SocializeMedia.BILI_DYNAMIC, SocializeMedia.BILI_DYNAMIC);
            }
            return false;
        }

        public final int hashCode() {
            return (Long.hashCode(this.f84493a) * 31) + 1002702747;
        }

        @NotNull
        public final String toString() {
            return android.support.v4.media.session.a.a(new StringBuilder("ReportShareSuccess(playlistId="), this.f84493a, ", target=biliDynamic)");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$t.class */
    @StabilityInferred(parameters = 1)
    public static final class t implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final t f84494a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 1894186843;
        }

        @NotNull
        public final String toString() {
            return "SharePlaylist";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$u.class */
    @StabilityInferred(parameters = 1)
    public static final class u implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f84495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f84496b;

        public u(long j7, @NotNull String str) {
            this.f84495a = j7;
            this.f84496b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return this.f84495a == uVar.f84495a && Intrinsics.areEqual(this.f84496b, uVar.f84496b);
        }

        public final int hashCode() {
            return this.f84496b.hashCode() + (Long.hashCode(this.f84495a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("SortMedias(playlistId=");
            sb.append(this.f84495a);
            sb.append(", sortOps=");
            return C8770a.a(sb, this.f84496b, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$v.class */
    @StabilityInferred(parameters = 1)
    public static final class v implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final v f84497a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof v);
        }

        public final int hashCode() {
            return -902213966;
        }

        @NotNull
        public final String toString() {
            return "SwitchEmptyPage";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$w.class */
    @StabilityInferred(parameters = 0)
    public static final class w implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.playset.api.c f84498a;

        public w(@NotNull com.bilibili.playset.api.c cVar) {
            this.f84498a = cVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && Intrinsics.areEqual(this.f84498a, ((w) obj).f84498a);
        }

        public final int hashCode() {
            return this.f84498a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "SwitchTranslate(item=" + this.f84498a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$x.class */
    @StabilityInferred(parameters = 1)
    public static final class x implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f84499a;

        public x(long j7) {
            this.f84499a = j7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof x) {
                return this.f84499a == ((x) obj).f84499a;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (Long.hashCode(this.f84499a) * 31);
        }

        @NotNull
        public final String toString() {
            return android.support.v4.media.session.a.a(new StringBuilder("ToTopPlaylist(playlistId="), this.f84499a, ", addTop=true)");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$y.class */
    @StabilityInferred(parameters = 1)
    public static final class y implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f84500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f84501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f84502c;

        public y(@Nullable String str, @Nullable String str2, boolean z6) {
            this.f84500a = str;
            this.f84501b = str2;
            this.f84502c = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return Intrinsics.areEqual(this.f84500a, yVar.f84500a) && Intrinsics.areEqual(this.f84501b, yVar.f84501b) && this.f84502c == yVar.f84502c;
        }

        public final int hashCode() {
            int iHashCode = 0;
            String str = this.f84500a;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.f84501b;
            if (str2 != null) {
                iHashCode = str2.hashCode();
            }
            return Boolean.hashCode(this.f84502c) + (((iHashCode2 * 31) + iHashCode) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateFolderInfo(title=");
            sb.append(this.f84500a);
            sb.append(", intro=");
            sb.append(this.f84501b);
            sb.append(", isPrivate=");
            return androidx.appcompat.app.i.a(sb, this.f84502c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/f$z.class */
    @StabilityInferred(parameters = 1)
    public static final class z implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final FavFooterItem$Companion$LoadMoreType f84503a;

        public z(@NotNull FavFooterItem$Companion$LoadMoreType favFooterItem$Companion$LoadMoreType) {
            this.f84503a = favFooterItem$Companion$LoadMoreType;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && this.f84503a == ((z) obj).f84503a;
        }

        public final int hashCode() {
            return this.f84503a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "UpdateFooter(loadMoreType=" + this.f84503a + ")";
        }
    }
}
