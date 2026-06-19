package com.bilibili.pegasus.kmm.keywordblocker;

import androidx.compose.runtime.C4277b;
import com.bilibili.pegasus.keywordblocker.n;
import kntr.kotlin.native.ObjCExport;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/kmm/keywordblocker/b.class */
public interface b {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/kmm/keywordblocker/b$a.class */
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final n f78252a;

        @ObjCExport
        public a(@NotNull n nVar) {
            this.f78252a = nVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f78252a, ((a) obj).f78252a);
        }

        public final int hashCode() {
            return this.f78252a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "CheckKeyword(keyword=" + this.f78252a + ")";
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.kmm.keywordblocker.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/kmm/keywordblocker/b$b.class */
    public static final class C0506b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f78253a;

        @ObjCExport
        public C0506b(int i7) {
            this.f78253a = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0506b) && this.f78253a == ((C0506b) obj).f78253a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f78253a);
        }

        @NotNull
        public final String toString() {
            return C4277b.a(this.f78253a, ")", new StringBuilder("DeleteKeyword(index="));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/kmm/keywordblocker/b$c.class */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f78254a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 23270600;
        }

        @NotNull
        public final String toString() {
            return "GetAllKeywords";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/kmm/keywordblocker/b$d.class */
    public static final class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f78255a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 870732817;
        }

        @NotNull
        public final String toString() {
            return "GoOutAddMode";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/kmm/keywordblocker/b$e.class */
    public static final class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f78256a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -217618880;
        }

        @NotNull
        public final String toString() {
            return "GoOutEditMode";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/kmm/keywordblocker/b$f.class */
    public static final class f implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final com.bilibili.pegasus.kmm.keywordblocker.a f78257a;

        @ObjCExport
        public f() {
            this(null);
        }

        @ObjCExport
        public f(@Nullable com.bilibili.pegasus.kmm.keywordblocker.a aVar) {
            this.f78257a = aVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.f78257a, ((f) obj).f78257a);
        }

        public final int hashCode() {
            com.bilibili.pegasus.kmm.keywordblocker.a aVar = this.f78257a;
            return aVar == null ? 0 : aVar.hashCode();
        }

        @NotNull
        public final String toString() {
            return "GotoAddMode(keyword=" + this.f78257a + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/kmm/keywordblocker/b$g.class */
    public static final class g implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final g f78258a = new Object();

        public final boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 997565347;
        }

        @NotNull
        public final String toString() {
            return "GotoEditMode";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/kmm/keywordblocker/b$h.class */
    public static final class h implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final n f78259a;

        @ObjCExport
        public h(@NotNull n nVar) {
            this.f78259a = nVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.areEqual(this.f78259a, ((h) obj).f78259a);
        }

        public final int hashCode() {
            return this.f78259a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "InsertKeyword(keyword=" + this.f78259a + ")";
        }
    }
}
