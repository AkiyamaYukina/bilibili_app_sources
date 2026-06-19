package com.bilibili.ship.theseus.ugc.intro.ugcseason;

import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import com.bilibili.ship.theseus.united.page.intro.module.season.Z;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/h.class */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<a> f97490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.ObjectRef<C6353o> f97491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.IntRef f97492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ref.IntRef f97493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ref.ObjectRef<C6355q> f97494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ref.ObjectRef<Z> f97495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UgcSeasonService f97496g;
    public final Set<Long> h;

    public h(Ref.ObjectRef<a> objectRef, Ref.ObjectRef<C6353o> objectRef2, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.ObjectRef<C6355q> objectRef3, Ref.ObjectRef<Z> objectRef4, UgcSeasonService ugcSeasonService, Set<Long> set) {
        this.f97490a = objectRef;
        this.f97491b = objectRef2;
        this.f97492c = intRef;
        this.f97493d = intRef2;
        this.f97494e = objectRef3;
        this.f97495f = objectRef4;
        this.f97496g = ugcSeasonService;
        this.h = set;
    }

    public final Z a() {
        Z z6 = (Z) this.f97495f.element;
        Z z7 = z6;
        if (z6 == null) {
            z7 = (Z) CollectionsKt.firstOrNull(b());
        }
        return z7;
    }

    public final List<Z> b() {
        return ((C6353o) this.f97491b.element).h;
    }

    public final String c() {
        String str = ((C6353o) this.f97491b.element).f101676i;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }
}
