package com.bilibili.search2.result.base;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.result.base.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/u.class */
@StabilityInferred(parameters = 1)
public abstract class u {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/u$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.search2.result.base.h f87626a;

        public a(@NotNull com.bilibili.search2.result.base.h hVar) {
            this.f87626a = hVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f87626a, ((a) obj).f87626a);
        }

        public final int hashCode() {
            return this.f87626a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "BatchChange(params=" + this.f87626a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/u$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f87627a = new b();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -544897262;
        }

        @NotNull
        public final String toString() {
            return "CleanFoldedData";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/u$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final t f87628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f87629b;

        public c(@NotNull t tVar, boolean z6) {
            this.f87628a = tVar;
            this.f87629b = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f87628a, cVar.f87628a) && this.f87629b == cVar.f87629b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f87629b) + (this.f87628a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Init(initParams=" + this.f87628a + ", isWideScreen=" + this.f87629b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/u$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final m f87630a;

        public d(@NotNull m mVar) {
            this.f87630a = mVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f87630a, ((d) obj).f87630a);
        }

        public final int hashCode() {
            return this.f87630a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ItemChange(params=" + this.f87630a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/u$e.class */
    @StabilityInferred(parameters = 0)
    public static final class e extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final v f87631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f87632b;

        public e(@NotNull v vVar, boolean z6) {
            this.f87631a = vVar;
            this.f87632b = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f87631a, eVar.f87631a) && this.f87632b == eVar.f87632b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f87632b) + (this.f87631a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "More(moreParams=" + this.f87631a + ", isWideScreen=" + this.f87632b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/u$f.class */
    @StabilityInferred(parameters = 0)
    public static final class f extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.search2.result.ogv.aggregate.a f87633a;

        public f(@NotNull com.bilibili.search2.result.ogv.aggregate.a aVar) {
            this.f87633a = aVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.f87633a, ((f) obj).f87633a);
        }

        public final int hashCode() {
            return this.f87633a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "OGVAggregateSearch(params=" + this.f87633a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/u$g.class */
    @StabilityInferred(parameters = 0)
    public static final class g extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final o f87634a;

        public g(@NotNull o oVar) {
            this.f87634a = oVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.areEqual(this.f87634a, ((g) obj).f87634a);
        }

        public final int hashCode() {
            return this.f87634a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "RecAfterClick(params=" + this.f87634a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/u$h.class */
    @StabilityInferred(parameters = 0)
    public static final class h extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final p f87635a;

        public h(@NotNull p pVar) {
            this.f87635a = pVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.areEqual(this.f87635a, ((h) obj).f87635a);
        }

        public final int hashCode() {
            return this.f87635a.f87573a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "RemoveItem(params=" + this.f87635a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/u$i.class */
    @StabilityInferred(parameters = 1)
    public static final class i extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final i.b f87636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f87637b;

        public i(@NotNull i.b bVar, boolean z6) {
            this.f87636a = bVar;
            this.f87637b = z6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Intrinsics.areEqual(this.f87636a, iVar.f87636a) && this.f87637b == iVar.f87637b;
        }

        public final int hashCode() {
            i.b bVar = this.f87636a;
            bVar.getClass();
            return Boolean.hashCode(this.f87637b) + (System.identityHashCode(bVar) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("SendErrorState(errorState=");
            sb.append(this.f87636a);
            sb.append(", father=");
            return androidx.appcompat.app.i.a(sb, this.f87637b, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/u$j.class */
    @StabilityInferred(parameters = 1)
    public static final class j extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.search2.result.base.k f87638a;

        public j(@NotNull com.bilibili.search2.result.base.k kVar) {
            this.f87638a = kVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f87638a, ((j) obj).f87638a);
        }

        public final int hashCode() {
            com.bilibili.search2.result.base.k kVar = this.f87638a;
            kVar.getClass();
            return System.identityHashCode(kVar);
        }

        @NotNull
        public final String toString() {
            return "SendFooterState(footerState=" + this.f87638a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/u$k.class */
    @StabilityInferred(parameters = 1)
    public static final class k extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final x f87639a;

        public k(@NotNull x xVar) {
            this.f87639a = xVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.areEqual(this.f87639a, ((k) obj).f87639a);
        }

        public final int hashCode() {
            return this.f87639a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Vertical(searchParams=" + this.f87639a + ")";
        }
    }
}
