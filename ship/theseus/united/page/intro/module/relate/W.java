package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import com.bilibili.framework.exposure.core.ExposureEntryV;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.InterfaceC6308d;
import com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/W.class */
public final class W implements RelateAvComponent.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<RelateAvComponent.a.InterfaceC1039a> f101073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f101074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D0 f101075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExposureEntryV f101076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DetailRelateService f101077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p0 f101078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ref.LongRef f101079g;
    public final Ref.ObjectRef<RelateAvComponent> h;

    public W(Ref.ObjectRef<RelateAvComponent.a.InterfaceC1039a> objectRef, o0 o0Var, D0 d02, ExposureEntryV exposureEntryV, DetailRelateService detailRelateService, p0 p0Var, Ref.LongRef longRef, Ref.ObjectRef<RelateAvComponent> objectRef2) {
        this.f101073a = objectRef;
        this.f101074b = o0Var;
        this.f101075c = d02;
        this.f101076d = exposureEntryV;
        this.f101077e = detailRelateService;
        this.f101078f = p0Var;
        this.f101079g = longRef;
        this.h = objectRef2;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final boolean a() {
        return this.f101074b.f101319d != null;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final String b() {
        return this.f101074b.f101318c.f101344a;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final ExposureEntryV c() {
        return this.f101076d;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final ActivityColorRepository d() {
        return this.f101077e.f100871f;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final String duration() {
        return "";
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final StatInfoData e() {
        return this.f101075c.f100834a.b();
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final void f(Rect rect, boolean z6) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.LongRef longRef = this.f101079g;
        long j7 = longRef.element;
        if (jCurrentTimeMillis - j7 < 300) {
            StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(jCurrentTimeMillis, "click more ", " ");
            sbA.append(j7);
            defpackage.a.b("[theseus-united-DetailRelateService$createMiniProgramComponent$contract$1-onClickMore] ", sbA.toString(), "DetailRelateService$createMiniProgramComponent$contract$1-onClickMore");
            return;
        }
        longRef.element = jCurrentTimeMillis;
        this.f101077e.s(this.f101074b, z6);
        final DetailRelateService detailRelateService = this.f101077e;
        G80.e eVar = new G80.e(detailRelateService, 3);
        final Ref.ObjectRef<RelateAvComponent> objectRef = this.h;
        final o0 o0Var = this.f101074b;
        detailRelateService.j(rect, o0Var, z6, eVar, new Function1(detailRelateService, o0Var, objectRef) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.V

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DetailRelateService f101070a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.ObjectRef f101071b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final o0 f101072c;

            {
                this.f101070a = detailRelateService;
                this.f101071b = objectRef;
                this.f101072c = o0Var;
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
                DetailRelateService detailRelateService2 = this.f101070a;
                IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) detailRelateService2.f100875k.get();
                if (introRecycleViewService == null || (relateAvComponent = (RelateAvComponent) this.f101071b.element) == null) {
                    unit = Unit.INSTANCE;
                } else {
                    introRecycleViewService.e(detailRelateService2.f(this.f101072c, bVar, 1, new Object()), relateAvComponent);
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }, null);
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final String g() {
        return this.f101074b.f101318c.f101358p;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final boolean h() {
        return false;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final C6306c i() {
        DetailRelateService detailRelateService = this.f101077e;
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
        return this.f101074b.f101318c.f101346c;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final void k() {
        o0 o0Var = this.f101074b;
        o0Var.f101334t = true;
        Ref.ObjectRef<RelateAvComponent.a.InterfaceC1039a> objectRef = this.f101073a;
        RelateAvComponent.a.InterfaceC1039a interfaceC1039a = (RelateAvComponent.a.InterfaceC1039a) objectRef.element;
        if (interfaceC1039a != null) {
            interfaceC1039a.b();
        }
        RelateAvComponent.a.InterfaceC1039a interfaceC1039a2 = (RelateAvComponent.a.InterfaceC1039a) objectRef.element;
        if (interfaceC1039a2 != null) {
            interfaceC1039a2.b();
        }
        String str = this.f101078f.f101347d;
        boolean zIsBlank = StringsKt.isBlank(str);
        DetailRelateService detailRelateService = this.f101077e;
        if (!zIsBlank) {
            sh1.e.c(detailRelateService.f100867b, Uri.parse(sh1.k.a(str, o0Var.f101338x)));
        }
        detailRelateService.o(o0Var, "card", new HashMap<>());
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final String l() {
        return this.f101074b.f101318c.f101352j;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final C6302a m() {
        return null;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final boolean n() {
        return this.f101074b.f101334t;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final String o() {
        return this.f101075c.f100834a.f104020b.f104028b;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final void p(RelateAvComponent.b bVar) {
        this.f101073a.element = bVar;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final boolean q() {
        return false;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final String r() {
        return null;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final String s() {
        return "";
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final boolean t() {
        return false;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.av.RelateAvComponent.a
    public final boolean u() {
        return false;
    }
}
