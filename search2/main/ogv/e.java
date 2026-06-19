package com.bilibili.search2.main.ogv;

import android.graphics.Bitmap;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/e.class */
public interface e {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/e$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f86874a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1375028950;
        }

        @NotNull
        public final String toString() {
            return "CancelDraw";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/e$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Bitmap f86875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f86876b;

        public b(@NotNull Bitmap bitmap, int i7) {
            this.f86875a = bitmap;
            this.f86876b = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f86875a, bVar.f86875a) && this.f86876b == bVar.f86876b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f86876b) + (this.f86875a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "FlingBitmap(bitmap=" + this.f86875a + ", distance=" + this.f86876b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/e$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f86877a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1086500416;
        }

        @NotNull
        public final String toString() {
            return "InitOgvData";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/e$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f86878a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1478887725;
        }

        @NotNull
        public final String toString() {
            return "InitTop";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.main.ogv.e$e, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/e$e.class */
    @StabilityInferred(parameters = 0)
    public static final class C0583e implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Bitmap f86879a;

        public C0583e(@Nullable Bitmap bitmap) {
            this.f86879a = bitmap;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0583e) && Intrinsics.areEqual(this.f86879a, ((C0583e) obj).f86879a);
        }

        public final int hashCode() {
            Bitmap bitmap = this.f86879a;
            return bitmap == null ? 0 : bitmap.hashCode();
        }

        @NotNull
        public final String toString() {
            return "RestoreBitmap(bitmap=" + this.f86879a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/e$f.class */
    @StabilityInferred(parameters = 1)
    public static final class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f86880a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 511210377;
        }

        @NotNull
        public final String toString() {
            return "RestoreDrawColor";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/e$g.class */
    @StabilityInferred(parameters = 1)
    public static final class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f86881a;

        public g(float f7) {
            this.f86881a = f7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Float.compare(this.f86881a, ((g) obj).f86881a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f86881a);
        }

        @NotNull
        public final String toString() {
            return C.d.a(this.f86881a, ")", new StringBuilder("SetMaxShowDistanceExtra(distance="));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/e$h.class */
    @StabilityInferred(parameters = 0)
    public static final class h implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Bitmap f86882a;

        public h(@NotNull Bitmap bitmap) {
            this.f86882a = bitmap;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.areEqual(this.f86882a, ((h) obj).f86882a);
        }

        public final int hashCode() {
            return this.f86882a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "StartDrawBitmap(bitmap=" + this.f86882a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/e$i.class */
    @StabilityInferred(parameters = 1)
    public static final class i implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86883a;

        public i(int i7) {
            this.f86883a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f86883a == ((i) obj).f86883a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f86883a);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f86883a, ")", new StringBuilder("StartDrawColor(color="));
        }
    }
}
