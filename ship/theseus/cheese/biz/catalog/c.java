package com.bilibili.ship.theseus.cheese.biz.catalog;

import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import eu0.C6979B;
import eu0.C6983b;
import eu0.C6987f;
import eu0.C6990i;
import eu0.C6992k;
import eu0.C6993l;
import eu0.C7000s;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<C6979B> f89158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C6987f f89159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C6992k f89160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C7000s f89161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f89162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C6990i f89163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C6983b f89164g;

    @NotNull
    public final C6993l h;

    public c(@NotNull List<C6979B> list, @NotNull C6987f c6987f, @NotNull C6992k c6992k, @NotNull C7000s c7000s, boolean z6, @NotNull C6990i c6990i, @NotNull C6983b c6983b, @NotNull C6993l c6993l) {
        this.f89158a = list;
        this.f89159b = c6987f;
        this.f89160c = c6992k;
        this.f89161d = c7000s;
        this.f89162e = z6;
        this.f89163f = c6990i;
        this.f89164g = c6983b;
        this.h = c6993l;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r2 = this;
            r0 = r2
            eu0.s r0 = r0.f89161d
            java.util.List<eu0.r> r0 = r0.f117575a
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La7
            r0 = r2
            eu0.k r0 = r0.f89160c
            java.util.List<eu0.j> r0 = r0.f117548a
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La7
            r0 = r2
            java.util.List<eu0.B> r0 = r0.f89158a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L32:
            r0 = r7
            boolean r0 = r0.hasNext()
            r3 = r0
            r0 = 0
            r4 = r0
            r0 = 0
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L9b
            r0 = r7
            java.lang.Object r0 = r0.next()
            r6 = r0
            r0 = r6
            eu0.B r0 = (eu0.C6979B) r0
            r4 = r0
            r0 = r4
            java.util.List<eu0.j> r0 = r0.f117495d
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L98
            r0 = r4
            java.util.List<eu0.d> r0 = r0.f117496e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L6e:
            r0 = r5
            r4 = r0
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L94
            r0 = r8
            java.lang.Object r0 = r0.next()
            r4 = r0
            r0 = r4
            eu0.d r0 = (eu0.C6985d) r0
            java.util.List<eu0.j> r0 = r0.f117527w
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6e
        L94:
            r0 = r4
            if (r0 == 0) goto L32
        L98:
            r0 = r6
            r4 = r0
        L9b:
            r0 = r4
            if (r0 == 0) goto La2
            goto La7
        La2:
            r0 = 0
            r3 = r0
            goto La9
        La7:
            r0 = 1
            r3 = r0
        La9:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.catalog.c.a():boolean");
    }

    public final boolean b() {
        Object next;
        Iterator<T> it = this.f89158a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C6979B) next).a()) {
                break;
            }
        }
        return next != null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f89158a, cVar.f89158a) && Intrinsics.areEqual(this.f89159b, cVar.f89159b) && Intrinsics.areEqual(this.f89160c, cVar.f89160c) && Intrinsics.areEqual(this.f89161d, cVar.f89161d) && this.f89162e == cVar.f89162e && Intrinsics.areEqual(this.f89163f, cVar.f89163f) && Intrinsics.areEqual(this.f89164g, cVar.f89164g) && Intrinsics.areEqual(this.h, cVar.h);
    }

    public final int hashCode() {
        int iA = z.a(e0.a(e0.a((this.f89159b.hashCode() + (this.f89158a.hashCode() * 31)) * 31, 31, this.f89160c.f117548a), 31, this.f89161d.f117575a), 31, this.f89162e);
        int iHashCode = this.f89163f.hashCode();
        return this.h.hashCode() + ((this.f89164g.hashCode() + ((iHashCode + iA) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "CheeseAllData(seasonSections=" + this.f89158a + ", cheeseSeasonOverview=" + this.f89159b + ", coursewareInfo=" + this.f89160c + ", netdiskCoursewareInfo=" + this.f89161d + ", hasSeasonPaid=" + this.f89162e + ", courseCoach=" + this.f89163f + ", catalogueInfo=" + this.f89164g + ", credentialInfo=" + this.h + ")";
    }
}
