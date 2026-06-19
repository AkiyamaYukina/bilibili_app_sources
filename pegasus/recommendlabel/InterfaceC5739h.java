package com.bilibili.pegasus.recommendlabel;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.recommendlabel.data.Label;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/h.class */
public interface InterfaceC5739h {

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.h$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/h$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a implements InterfaceC5739h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final K f78721a;

        public a(@NotNull K k7) {
            this.f78721a = k7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f78721a, ((a) obj).f78721a);
        }

        public final int hashCode() {
            return hashCode();
        }

        @NotNull
        public final String toString() {
            return "BatchAdd(callback=" + this.f78721a + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.h$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/h$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b implements InterfaceC5739h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Label f78722a;

        public b(@NotNull Label label) {
            this.f78722a = label;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f78722a, ((b) obj).f78722a);
        }

        public final int hashCode() {
            return this.f78722a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "DelFavFromPin(label=" + this.f78722a + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.h$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/h$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c implements InterfaceC5739h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Label f78723a;

        public c(@NotNull Label label) {
            this.f78723a = label;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f78723a, ((c) obj).f78723a);
        }

        public final int hashCode() {
            return this.f78723a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "DelFavFromUnpin(label=" + this.f78723a + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.h$d */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/h$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d implements InterfaceC5739h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final I f78724a;

        public d(@NotNull I i7) {
            this.f78724a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f78724a, ((d) obj).f78724a);
        }

        public final int hashCode() {
            return this.f78724a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "GetMore(callback=" + this.f78724a + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.h$e */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/h$e.class */
    @StabilityInferred(parameters = 1)
    public static final class e implements InterfaceC5739h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f78725a;

        public e() {
            this(1);
        }

        public e(int i7) {
            this.f78725a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f78725a == ((e) obj).f78725a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f78725a);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f78725a, ")", new StringBuilder("GetMyFavorites(needAllLabel="));
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.h$f */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/h$f.class */
    @StabilityInferred(parameters = 1)
    public static final class f implements InterfaceC5739h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f78726a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 642956407;
        }

        @NotNull
        public final String toString() {
            return "GoOutEditMode";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.h$g */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/h$g.class */
    @StabilityInferred(parameters = 0)
    public static final class g implements InterfaceC5739h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Context f78727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ActivityResultLauncher<Intent> f78728b;

        public g(@NotNull Context context, @NotNull ActivityResultLauncher<Intent> activityResultLauncher) {
            this.f78727a = context;
            this.f78728b = activityResultLauncher;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.areEqual(this.f78727a, gVar.f78727a) && Intrinsics.areEqual(this.f78728b, gVar.f78728b);
        }

        public final int hashCode() {
            return this.f78728b.hashCode() + (this.f78727a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "GotoEditMode(context=" + this.f78727a + ", launcher=" + this.f78728b + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.h$h, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/h$h.class */
    @StabilityInferred(parameters = 0)
    public static final class C0507h implements InterfaceC5739h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Label f78729a;

        public C0507h(@NotNull Label label) {
            this.f78729a = label;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0507h) && Intrinsics.areEqual(this.f78729a, ((C0507h) obj).f78729a);
        }

        public final int hashCode() {
            return this.f78729a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "PinFavFromUnpin(label=" + this.f78729a + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.h$i */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/h$i.class */
    @StabilityInferred(parameters = 0)
    public static final class i implements InterfaceC5739h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Label f78730a;

        public i(@NotNull Label label) {
            this.f78730a = label;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.areEqual(this.f78730a, ((i) obj).f78730a);
        }

        public final int hashCode() {
            return this.f78730a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "PinFavorite(label=" + this.f78730a + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.h$j */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/h$j.class */
    @StabilityInferred(parameters = 1)
    public static final class j implements InterfaceC5739h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final G f78731a;

        public j(@NotNull G g7) {
            this.f78731a = g7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f78731a, ((j) obj).f78731a);
        }

        public final int hashCode() {
            return hashCode();
        }

        @NotNull
        public final String toString() {
            return "Rollback(callback=" + this.f78731a + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.h$k */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/h$k.class */
    @StabilityInferred(parameters = 1)
    public static final class k implements InterfaceC5739h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C5740i f78732a;

        public k(@NotNull C5740i c5740i) {
            this.f78732a = c5740i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.areEqual(this.f78732a, ((k) obj).f78732a);
        }

        public final int hashCode() {
            return this.f78732a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "SelectMoreLabel(label=" + this.f78732a + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.h$l */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/h$l.class */
    @StabilityInferred(parameters = 0)
    public static final class l implements InterfaceC5739h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Label f78733a;

        public l(@NotNull Label label) {
            this.f78733a = label;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Intrinsics.areEqual(this.f78733a, ((l) obj).f78733a);
        }

        public final int hashCode() {
            return this.f78733a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "UnpinFavorite(label=" + this.f78733a + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.h$m */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/h$m.class */
    @StabilityInferred(parameters = 1)
    public static final class m implements InterfaceC5739h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f78734a;

        public m(int i7) {
            this.f78734a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f78734a == ((m) obj).f78734a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f78734a);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f78734a, ")", new StringBuilder("UpdateNavigation(height="));
        }
    }
}
