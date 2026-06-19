package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.graphics.Rect;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/o.class */
public final /* synthetic */ class C6328o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DetailRelateService f101313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f101314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.ObjectRef f101315c;

    public /* synthetic */ C6328o(DetailRelateService detailRelateService, o0 o0Var, Ref.ObjectRef objectRef) {
        this.f101313a = detailRelateService;
        this.f101314b = o0Var;
        this.f101315c = objectRef;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        final DetailRelateService detailRelateService = this.f101313a;
        final o0 o0Var = this.f101314b;
        detailRelateService.s(o0Var, zBooleanValue);
        X9.j jVar = new X9.j(detailRelateService, 1);
        final Ref.ObjectRef objectRef = this.f101315c;
        detailRelateService.j((Rect) obj, o0Var, zBooleanValue, jVar, new Function1(detailRelateService, o0Var, objectRef) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DetailRelateService f101361a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.ObjectRef f101362b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final o0 f101363c;

            {
                this.f101361a = detailRelateService;
                this.f101362b = objectRef;
                this.f101363c = o0Var;
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
            public final Object invoke(Object obj3) {
                com.bilibili.ship.theseus.united.page.intro.module.relate.history.c cVar;
                Unit unit;
                DetailRelateService.b bVar = (DetailRelateService.b) obj3;
                DetailRelateService detailRelateService2 = this.f101361a;
                IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) detailRelateService2.f100875k.get();
                if (introRecycleViewService == null || (cVar = (com.bilibili.ship.theseus.united.page.intro.module.relate.history.c) this.f101362b.element) == null) {
                    unit = Unit.INSTANCE;
                } else {
                    introRecycleViewService.e(detailRelateService2.f(this.f101363c, bVar, 1, new Object()), cVar);
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }, null);
        return Unit.INSTANCE;
    }
}
