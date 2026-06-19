package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import com.bilibili.base.util.NumberFormat;
import com.bilibili.framework.exposure.core.ExposureEntryV;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.InterfaceC6308d;
import com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import ev0.InterfaceC7008a;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/F.class */
public final class F implements RelateAvComponent.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<RelateAvComponent.a.InterfaceC1039a> f100990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f100991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C6319i0 f100992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExposureEntryV f100993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DetailRelateService f100994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p0 f100995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ref.ObjectRef<RelateAvComponent> f100996g;

    public F(Ref.ObjectRef<RelateAvComponent.a.InterfaceC1039a> objectRef, o0 o0Var, C6319i0 c6319i0, ExposureEntryV exposureEntryV, DetailRelateService detailRelateService, p0 p0Var, Ref.ObjectRef<RelateAvComponent> objectRef2) {
        this.f100990a = objectRef;
        this.f100991b = o0Var;
        this.f100992c = c6319i0;
        this.f100993d = exposureEntryV;
        this.f100994e = detailRelateService;
        this.f100995f = p0Var;
        this.f100996g = objectRef2;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final boolean a() {
        return this.f100991b.f101319d != null;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final String b() {
        return this.f100991b.f101318c.f101344a;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final ExposureEntryV c() {
        return this.f100993d;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final ActivityColorRepository d() {
        return this.f100994e.f100871f;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final String duration() {
        C6319i0 c6319i0 = this.f100992c;
        Long l7 = c6319i0.f101259a;
        return l7 != null ? (l7 != null && l7.longValue() == 0) ? "" : NumberFormat.formatPlayTime(c6319i0.f101259a.longValue() * ((long) 1000), false, false, false) : "";
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final StatInfoData e() {
        return this.f100992c.f101261c.b();
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final void f(Rect rect, boolean z6) {
        this.f100994e.s(this.f100991b, z6);
        final DetailRelateService detailRelateService = this.f100994e;
        com.bilibili.opd.app.bizcommon.mangapaysdk.view.f fVar = new com.bilibili.opd.app.bizcommon.mangapaysdk.view.f(detailRelateService, 1);
        final Ref.ObjectRef<RelateAvComponent> objectRef = this.f100996g;
        final o0 o0Var = this.f100991b;
        detailRelateService.j(rect, o0Var, z6, fVar, new Function1(detailRelateService, o0Var, objectRef) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.E

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DetailRelateService f100982a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.ObjectRef f100983b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final o0 f100984c;

            {
                this.f100982a = detailRelateService;
                this.f100983b = objectRef;
                this.f100984c = o0Var;
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
                RelateAvComponent relateAvComponent;
                Unit unit;
                DetailRelateService.b bVar = (DetailRelateService.b) obj;
                DetailRelateService detailRelateService2 = this.f100982a;
                IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) detailRelateService2.f100875k.get();
                if (introRecycleViewService == null || (relateAvComponent = (RelateAvComponent) this.f100983b.element) == null) {
                    unit = Unit.INSTANCE;
                } else {
                    introRecycleViewService.e(detailRelateService2.f(this.f100984c, bVar, 1, new Object()), relateAvComponent);
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }, null);
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final String g() {
        return this.f100991b.f101318c.f101358p;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final boolean h() {
        return false;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final C6306c i() {
        DetailRelateService detailRelateService = this.f100994e;
        C6306c c6306c = detailRelateService.f100872g.f100863n;
        C6306c c6306cA = c6306c;
        if (c6306c == null) {
            InterfaceC6308d.a aVar = InterfaceC6308d.f101173a;
            Context context = detailRelateService.f100867b;
            aVar.getClass();
            c6306cA = InterfaceC6308d.a.a(context);
        }
        return c6306cA;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final String j() {
        return this.f100991b.f101318c.f101346c;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final void k() {
        DetailRelateService detailRelateService = this.f100994e;
        boolean zC = detailRelateService.f100873i.c();
        o0 o0Var = this.f100991b;
        if (zC) {
            InterfaceC7008a interfaceC7008a = (InterfaceC7008a) detailRelateService.f100876l.get();
            p0 p0Var = o0Var.f101318c;
            InterfaceC7008a.e(interfaceC7008a, p0Var.f101354l, 0L, null, o0Var.f101338x, null, 0, p0Var.f101348e, false, 366);
        } else {
            o0Var.f101334t = true;
            RelateAvComponent.a.InterfaceC1039a interfaceC1039a = (RelateAvComponent.a.InterfaceC1039a) this.f100990a.element;
            if (interfaceC1039a != null) {
                interfaceC1039a.b();
            }
            p0 p0Var2 = this.f100995f;
            String str = p0Var2.f101347d;
            if (StringsKt.isBlank(str)) {
                Context context = detailRelateService.f100867b;
                sh1.e.b(p0Var2.f101354l, o0Var.f101338x, context);
            } else {
                sh1.e.c(detailRelateService.f100867b, Uri.parse(sh1.k.a(str, o0Var.f101338x)));
            }
        }
        detailRelateService.o(o0Var, "card", new HashMap<>());
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final String l() {
        return this.f100991b.f101318c.f101352j;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final C6302a m() {
        return null;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final boolean n() {
        return this.f100991b.f101334t;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final String o() {
        return this.f100992c.f101261c.f104020b.f104028b;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final void p(RelateAvComponent.b bVar) {
        this.f100990a.element = bVar;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final boolean q() {
        return true;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final String r() {
        return null;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final String s() {
        return this.f100991b.f101318c.f101353k.f104061d;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final boolean t() {
        return true;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final boolean u() {
        return false;
    }
}
