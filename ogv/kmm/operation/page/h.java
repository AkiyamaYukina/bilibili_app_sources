package com.bilibili.ogv.kmm.operation.page;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.kmm.operation.page.p;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/h.class */
public final class h implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f68588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f68589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f68590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f68591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final KomponentScope f68592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ref.ObjectRef f68593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f68594g;
    public final Ref.ObjectRef h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MutableState f68595i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/h$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f68596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p f68597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KomponentScope f68598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ref.ObjectRef f68599d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final o f68600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Ref.ObjectRef f68601f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final MutableState f68602g;

        public a(Modifier modifier, p pVar, KomponentScope komponentScope, Ref.ObjectRef objectRef, o oVar, Ref.ObjectRef objectRef2, MutableState mutableState) {
            this.f68596a = modifier;
            this.f68597b = pVar;
            this.f68598c = komponentScope;
            this.f68599d = objectRef;
            this.f68600e = oVar;
            this.f68601f = objectRef2;
            this.f68602g = mutableState;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(-1573855415);
                boolean z6 = ((p.b) this.f68597b).f68643a;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(154800400, 0, -1, "com.bilibili.ogv.kmm.operation.page.PageModel.komponent.<anonymous>.Failure (PageModel.kt:156)");
                }
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(this.f68596a, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                Ref.ObjectRef objectRef = this.f68599d;
                o oVar = this.f68600e;
                Ref.ObjectRef objectRef2 = this.f68601f;
                KomponentScope komponentScope = this.f68598c;
                MutableState mutableState = this.f68602g;
                if (z6) {
                    composer.startReplaceGroup(-1135843705);
                    com.bilibili.ogv.bdesign.placeholder.m.b(new PageModel$komponent$1$Failure$1(komponentScope, objectRef, oVar, objectRef2, mutableState), modifierVerticalScroll$default, null, null, null, null, composer, 0, 60);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1135731640);
                    com.bilibili.ogv.bdesign.placeholder.e.a(new PageModel$komponent$1$Failure$2(komponentScope, objectRef, oVar, objectRef2, mutableState), modifierVerticalScroll$default, null, null, null, null, composer, 0, 60);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public h(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, p pVar, KomponentScope komponentScope2, Ref.ObjectRef objectRef, o oVar, Ref.ObjectRef objectRef2, MutableState mutableState) {
        this.f68589b = vertexContext;
        this.f68590c = komponentScope;
        this.f68591d = pVar;
        this.f68592e = komponentScope2;
        this.f68593f = objectRef;
        this.f68594g = oVar;
        this.h = objectRef2;
        this.f68595i = mutableState;
        this.f68588a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(h.class);
    }

    public final Object getKey() {
        return this.f68590c.getKey();
    }

    public final Object getState() {
        return this.f68588a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        Ref.ObjectRef objectRef = this.h;
        this.f68589b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f68591d, this.f68592e, this.f68593f, this.f68594g, objectRef, this.f68595i), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
