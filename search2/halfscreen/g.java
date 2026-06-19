package com.bilibili.search2.halfscreen;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.main.data.SearchPageStateModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/g.class */
public interface g {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/g$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f86567b;

        public a(int i7, float f7) {
            this.f86566a = i7;
            this.f86567b = f7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f86566a == aVar.f86566a && Float.compare(this.f86567b, aVar.f86567b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f86567b) + (Integer.hashCode(this.f86566a) * 31);
        }

        @NotNull
        public final String toString() {
            return "BottomSheetHeightChanged(height=" + this.f86566a + ", slideOffset=" + this.f86567b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/g$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.search2.main.ogv.a f86568a;

        public b(@NotNull com.bilibili.search2.main.ogv.a aVar) {
            this.f86568a = aVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f86568a, ((b) obj).f86568a);
        }

        public final int hashCode() {
            return this.f86568a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "BrandAdGradientOverlayChanged(overlay=" + this.f86568a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/g$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f86569a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -239937122;
        }

        @NotNull
        public final String toString() {
            return "ClearSavedOgvState";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/g$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Ns0.b f86570a;

        public d(@NotNull Ns0.b bVar) {
            this.f86570a = bVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f86570a, ((d) obj).f86570a);
        }

        public final int hashCode() {
            return this.f86570a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ContainerCommandReceived(command=" + this.f86570a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/g$e.class */
    @StabilityInferred(parameters = 1)
    public static final class e implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final SearchPageStateModel.DisplayPage f86571a;

        public e(@NotNull SearchPageStateModel.DisplayPage displayPage) {
            this.f86571a = displayPage;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f86571a == ((e) obj).f86571a;
        }

        public final int hashCode() {
            return this.f86571a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "DisplayPageChanged(page=" + this.f86571a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/g$f.class */
    @StabilityInferred(parameters = 1)
    public static final class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f86572a;

        public f(boolean z6) {
            this.f86572a = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f86572a == ((f) obj).f86572a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f86572a);
        }

        @NotNull
        public final String toString() {
            return androidx.appcompat.app.i.a(new StringBuilder("LightStatusBarsChanged(lightStatusBars="), this.f86572a, ")");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.halfscreen.g$g, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/g$g.class */
    @StabilityInferred(parameters = 0)
    public static final class C0579g implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.search2.main.ogv.d f86573a;

        public C0579g(@NotNull com.bilibili.search2.main.ogv.d dVar) {
            this.f86573a = dVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0579g) && Intrinsics.areEqual(this.f86573a, ((C0579g) obj).f86573a);
        }

        public final int hashCode() {
            return this.f86573a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "OgvBackgroundChanged(state=" + this.f86573a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/g$h.class */
    @StabilityInferred(parameters = 1)
    public static final class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86574a;

        public h(int i7) {
            this.f86574a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f86574a == ((h) obj).f86574a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f86574a);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f86574a, ")", new StringBuilder("OgvBackgroundScrolled(distance="));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/g$i.class */
    @StabilityInferred(parameters = 0)
    public static final class i implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.search2.main.ogv.f f86575a;

        public i(@NotNull com.bilibili.search2.main.ogv.f fVar) {
            this.f86575a = fVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.areEqual(this.f86575a, ((i) obj).f86575a);
        }

        public final int hashCode() {
            return this.f86575a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "OgvMaskOverlayChanged(overlay=" + this.f86575a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/g$j.class */
    @StabilityInferred(parameters = 1)
    public static final class j implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f86577b;

        public j(int i7, int i8) {
            this.f86576a = i7;
            this.f86577b = i8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f86576a == jVar.f86576a && this.f86577b == jVar.f86577b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f86577b) + (Integer.hashCode(this.f86576a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("OgvTopBarDrawMetricsChanged(widthPx=");
            sb.append(this.f86576a);
            sb.append(", fixedClipHeightPx=");
            return C4277b.a(this.f86577b, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/g$k.class */
    @StabilityInferred(parameters = 1)
    public static final class k implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f86578a;

        public k(@Nullable String str) {
            this.f86578a = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.areEqual(this.f86578a, ((k) obj).f86578a);
        }

        public final int hashCode() {
            String str = this.f86578a;
            return str == null ? 0 : str.hashCode();
        }

        @NotNull
        public final String toString() {
            return C8770a.a(new StringBuilder("QueryChanged(query="), this.f86578a, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/g$l.class */
    @StabilityInferred(parameters = 1)
    public static final class l implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final l f86579a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1138198706;
        }

        @NotNull
        public final String toString() {
            return "SaveOgvBitmapState";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/g$m.class */
    @StabilityInferred(parameters = 1)
    public static final class m implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final m f86580a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1772989335;
        }

        @NotNull
        public final String toString() {
            return "SearchExitRequested";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/g$n.class */
    @StabilityInferred(parameters = 1)
    public static final class n implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f86581a;

        public n(float f7) {
            this.f86581a = f7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Float.compare(this.f86581a, ((n) obj).f86581a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f86581a);
        }

        @NotNull
        public final String toString() {
            return C.d.a(this.f86581a, ")", new StringBuilder("StatusBarHeightProvided(heightDp="));
        }
    }
}
