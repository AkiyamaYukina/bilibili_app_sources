package com.bilibili.ogv.operation3.module.vcards3x2;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.operation3.module.switchit.CreateSwitchableModel$invoke$1;
import it0.C7615a;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/vcards3x2/h.class */
public final class h implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f71465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f71466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f71467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C7615a f71468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableState f71469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bilibili.ogv.operation3.module.vcards3x2.a f71470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CreateSwitchableModel$invoke$1 f71471g;
    public final KomponentScope h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/vcards3x2/h$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f71472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C7615a f71473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MutableState f71474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.bilibili.ogv.operation3.module.vcards3x2.a f71475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final CreateSwitchableModel$invoke$1 f71476e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final KomponentScope f71477f;

        public a(Modifier modifier, C7615a c7615a, MutableState mutableState, com.bilibili.ogv.operation3.module.vcards3x2.a aVar, CreateSwitchableModel$invoke$1 createSwitchableModel$invoke$1, KomponentScope komponentScope) {
            this.f71472a = modifier;
            this.f71473b = c7615a;
            this.f71474c = mutableState;
            this.f71475d = aVar;
            this.f71476e = createSwitchableModel$invoke$1;
            this.f71477f = komponentScope;
        }

        /* JADX WARN: Removed duplicated region for block: B:60:0x03fb  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x04a2  */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r15, java.lang.Object r16) {
            /*
                Method dump skipped, instruction units count: 1569
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation3.module.vcards3x2.h.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public h(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, C7615a c7615a, MutableState mutableState, com.bilibili.ogv.operation3.module.vcards3x2.a aVar, CreateSwitchableModel$invoke$1 createSwitchableModel$invoke$1, KomponentScope komponentScope2) {
        this.f71466b = vertexContext;
        this.f71467c = komponentScope;
        this.f71468d = c7615a;
        this.f71469e = mutableState;
        this.f71470f = aVar;
        this.f71471g = createSwitchableModel$invoke$1;
        this.h = komponentScope2;
        this.f71465a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(h.class);
    }

    public final Object getKey() {
        return this.f71467c.getKey();
    }

    public final Object getState() {
        return this.f71465a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f71466b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f71468d, this.f71469e, this.f71470f, this.f71471g, this.h), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
