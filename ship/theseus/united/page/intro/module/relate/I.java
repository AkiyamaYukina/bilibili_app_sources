package com.bilibili.ship.theseus.united.page.intro.module.relate;

import Ky0.C2461c;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import com.bilibili.framework.exposure.core.ExposureEntryV;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.InterfaceC6308d;
import com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import ev0.InterfaceC7008a;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/I.class */
public final class I implements a.InterfaceC1041a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f101013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6325l0 f101014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExposureEntryV f101015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DetailRelateService f101016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ref.ObjectRef<com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a> f101017e;

    public I(o0 o0Var, C6325l0 c6325l0, ExposureEntryV exposureEntryV, DetailRelateService detailRelateService, Ref.ObjectRef<com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a> objectRef) {
        this.f101013a = o0Var;
        this.f101014b = c6325l0;
        this.f101015c = exposureEntryV;
        this.f101016d = detailRelateService;
        this.f101017e = objectRef;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    public final Flow<String> A() {
        return FlowKt.flowOf(this.f101013a.f101318c.f101344a);
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    public final C6302a B() {
        return this.f101014b.f101284f;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    public final String C() {
        C6302a c6302a = this.f101014b.f101285g;
        return c6302a != null ? c6302a.f101094i : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String D() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.ship.theseus.united.page.intro.module.relate.l0 r0 = r0.f101014b
            com.bilibili.ship.theseus.united.page.intro.module.relate.h0 r0 = r0.f101283e
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L17
            r0 = r3
            java.lang.String r0 = r0.f101223a
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1a
        L17:
            java.lang.String r0 = ""
            r3 = r0
        L1a:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.I.D():java.lang.String");
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    public final long E() {
        return this.f101014b.f101282d.h;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    public final int F() {
        C6317h0 c6317h0 = this.f101014b.f101283e;
        return c6317h0 != null ? c6317h0.f101224b : 0;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    public final boolean a() {
        return this.f101013a.f101319d != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.ship.theseus.united.page.intro.module.relate.l0 r0 = r0.f101014b
            com.bilibili.ship.theseus.united.page.intro.module.relate.e0 r0 = r0.f101281c
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L17
            r0 = r3
            java.lang.String r0 = r0.f101186g
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1a
        L17:
            java.lang.String r0 = ""
            r3 = r0
        L1a:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.I.b():java.lang.String");
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    public final ExposureEntryV c() {
        return this.f101015c;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    public final ActivityColorRepository d() {
        return this.f101016d.f100871f;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    public final StatInfoData e() {
        return this.f101014b.f101282d.b();
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    public final void f(Rect rect, boolean z6) {
        this.f101016d.s(this.f101013a, z6);
        final DetailRelateService detailRelateService = this.f101016d;
        C2461c c2461c = new C2461c(detailRelateService, 4);
        final Ref.ObjectRef<com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a> objectRef = this.f101017e;
        final o0 o0Var = this.f101013a;
        detailRelateService.j(rect, o0Var, z6, c2461c, new Function1(detailRelateService, o0Var, objectRef) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.H

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DetailRelateService f101008a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.ObjectRef f101009b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final o0 f101010c;

            {
                this.f101008a = detailRelateService;
                this.f101009b = objectRef;
                this.f101010c = o0Var;
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
                com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a aVar;
                Unit unit;
                DetailRelateService.b bVar = (DetailRelateService.b) obj;
                DetailRelateService detailRelateService2 = this.f101008a;
                IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) detailRelateService2.f100875k.get();
                if (introRecycleViewService == null || (aVar = (com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a) this.f101009b.element) == null) {
                    unit = Unit.INSTANCE;
                } else {
                    introRecycleViewService.e(detailRelateService2.f(this.f101010c, bVar, 1, new Object()), aVar);
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }, null);
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    public final String g() {
        return this.f101013a.f101318c.f101358p;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    public final boolean h() {
        return false;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    public final C6306c i() {
        DetailRelateService detailRelateService = this.f101016d;
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

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    public final String j() {
        return this.f101013a.f101318c.f101346c;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi.a.InterfaceC1041a
    public final void k() {
        DetailRelateService detailRelateService = this.f101016d;
        boolean zC = detailRelateService.f100873i.c();
        o0 o0Var = this.f101013a;
        if (zC) {
            InterfaceC7008a interfaceC7008a = (InterfaceC7008a) detailRelateService.f100876l.get();
            p0 p0Var = o0Var.f101318c;
            InterfaceC7008a.C1258a c1258a = new InterfaceC7008a.C1258a(0L, null, 0L, null, p0Var.f101356n, null, p0Var.f101348e, null, null, null, null, null, 0L, false, 0, false, 65455);
            c1258a.m10991setTagpIAwiHE(com.bilibili.ship.theseus.united.bean.e.f98758a.a, new com.bilibili.ship.theseus.united.bean.d(Long.valueOf(o0Var.f101318c.f101354l), null, null, null, null, 62));
            InterfaceC7008a.c(interfaceC7008a, c1258a, null, null, null, false, 0, 30);
        } else {
            sh1.e.c(detailRelateService.f100867b, Uri.parse(o0Var.f101318c.f101347d).buildUpon().appendQueryParameter("intentFrom", "4").appendQueryParameter("from_spmid", o0Var.f101338x).appendQueryParameter("from_module", "relatedvideo").build());
        }
        detailRelateService.o(o0Var, "card", new HashMap<>());
    }
}
