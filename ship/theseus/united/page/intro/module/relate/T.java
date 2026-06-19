package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.graphics.Rect;
import com.bilibili.framework.exposure.core.ExposureEntryV;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/T.class */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<com.bilibili.ship.theseus.united.page.intro.module.relate.game.c> f101058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f101059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A0 f101060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0 f101061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DetailRelateService f101062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExposureEntryV f101063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ref.ObjectRef<com.bilibili.ship.theseus.united.page.intro.module.relate.game.d> f101064g;

    public T(Ref.ObjectRef<com.bilibili.ship.theseus.united.page.intro.module.relate.game.c> objectRef, o0 o0Var, A0 a02, p0 p0Var, DetailRelateService detailRelateService, ExposureEntryV exposureEntryV, Ref.ObjectRef<com.bilibili.ship.theseus.united.page.intro.module.relate.game.d> objectRef2) {
        this.f101058a = objectRef;
        this.f101059b = o0Var;
        this.f101060c = a02;
        this.f101061d = p0Var;
        this.f101062e = detailRelateService;
        this.f101063f = exposureEntryV;
        this.f101064g = objectRef2;
    }

    public final long a() {
        return this.f101062e.f100870e.a();
    }

    public final String b() {
        return this.f101062e.h.a().f123881c;
    }

    public final void c(Rect rect, boolean z6) {
        this.f101062e.s(this.f101059b, z6);
        final DetailRelateService detailRelateService = this.f101062e;
        Jf1.f fVar = new Jf1.f(detailRelateService, 3);
        final Ref.ObjectRef<com.bilibili.ship.theseus.united.page.intro.module.relate.game.d> objectRef = this.f101064g;
        final o0 o0Var = this.f101059b;
        detailRelateService.j(rect, o0Var, z6, fVar, new Function1(detailRelateService, o0Var, objectRef) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.S

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DetailRelateService f101055a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.ObjectRef f101056b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final o0 f101057c;

            {
                this.f101055a = detailRelateService;
                this.f101056b = objectRef;
                this.f101057c = o0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final Object invoke(Object obj) {
                com.bilibili.ship.theseus.united.page.intro.module.relate.game.d dVar;
                Unit unit;
                DetailRelateService.b bVar = (DetailRelateService.b) obj;
                DetailRelateService detailRelateService2 = this.f101055a;
                IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) detailRelateService2.f100875k.get();
                if (introRecycleViewService == null || (dVar = (com.bilibili.ship.theseus.united.page.intro.module.relate.game.d) this.f101056b.element) == null) {
                    unit = Unit.INSTANCE;
                } else {
                    introRecycleViewService.e(detailRelateService2.f(this.f101057c, bVar, 2, new Object()), dVar);
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }, null);
    }
}
