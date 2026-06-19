package com.bilibili.ship.theseus.cheese.biz.catalog;

import androidx.compose.runtime.internal.StabilityInferred;
import eu0.C6985d;
import eu0.C6991j;
import eu0.C6999r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/a.class */
@StabilityInferred(parameters = 1)
public abstract class a {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.catalog.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C0600a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final C6985d f89144a;

        public C0600a(@Nullable C6985d c6985d) {
            this.f89144a = c6985d;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0600a) && Intrinsics.areEqual(this.f89144a, ((C0600a) obj).f89144a);
        }

        public final int hashCode() {
            C6985d c6985d = this.f89144a;
            return c6985d == null ? 0 : c6985d.hashCode();
        }

        @NotNull
        public final String toString() {
            return "CatalogLivingClick(epData=" + this.f89144a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/a$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f89145a = new a();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 343589022;
        }

        @NotNull
        public final String toString() {
            return "CourseGroupClick";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/a$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C6991j f89146a;

        public c(@NotNull C6991j c6991j) {
            this.f89146a = c6991j;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f89146a, ((c) obj).f89146a);
        }

        public final int hashCode() {
            return this.f89146a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "CoursewareDownloadClick(courseware=" + this.f89146a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/a$d.class */
    @StabilityInferred(parameters = 1)
    public static final class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f89147a = new a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/a$e.class */
    @StabilityInferred(parameters = 1)
    public static final class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C6991j f89148a;

        public e(@NotNull C6991j c6991j) {
            this.f89148a = c6991j;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f89148a, ((e) obj).f89148a);
        }

        public final int hashCode() {
            return this.f89148a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "CoursewarePreviewClick(courseware=" + this.f89148a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/a$f.class */
    @StabilityInferred(parameters = 1)
    public static final class f extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f89149a = new a();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 510301271;
        }

        @NotNull
        public final String toString() {
            return "CredentialClick";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/a$g.class */
    @StabilityInferred(parameters = 0)
    public static final class g extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C6985d f89150a;

        public g(@NotNull C6985d c6985d) {
            this.f89150a = c6985d;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.areEqual(this.f89150a, ((g) obj).f89150a);
        }

        public final int hashCode() {
            return this.f89150a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "EpItemClick(epData=" + this.f89150a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/a$h.class */
    @StabilityInferred(parameters = 1)
    public static final class h extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C6999r f89151a;

        public h(@NotNull C6999r c6999r) {
            this.f89151a = c6999r;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.areEqual(this.f89151a, ((h) obj).f89151a);
        }

        public final int hashCode() {
            return this.f89151a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "NetdiskCoursewareExtractClick(courseware=" + this.f89151a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/a$i.class */
    @StabilityInferred(parameters = 0)
    public static final class i extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final C6985d f89152a;

        public i(@Nullable C6985d c6985d) {
            this.f89152a = c6985d;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Intrinsics.areEqual(this.f89152a, ((i) obj).f89152a);
        }

        public final int hashCode() {
            C6985d c6985d = this.f89152a;
            return c6985d == null ? 0 : c6985d.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ShowLivingPanel(epData=" + this.f89152a + ")";
        }
    }
}
