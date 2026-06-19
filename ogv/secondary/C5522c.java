package com.bilibili.ogv.secondary;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kntr.base.router.Router;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: renamed from: com.bilibili.ogv.secondary.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/c.class */
public final class C5522c implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f72660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f72661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f72662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PagerState f72663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f72664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Router f72665f;

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.c$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/c$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f72666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PagerState f72667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f72668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Router f72669d;

        public a(Modifier modifier, PagerState pagerState, List list, Router router) {
            this.f72666a = modifier;
            this.f72667b = pagerState;
            this.f72668c = list;
            this.f72669d = router;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            /*
                r7 = this;
                r0 = r8
                androidx.compose.runtime.Composer r0 = (androidx.compose.runtime.Composer) r0
                r12 = r0
                r0 = r9
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r10 = r0
                r0 = r10
                r1 = 3
                r0 = r0 & r1
                r1 = 2
                if (r0 == r1) goto L1b
                r0 = 1
                r11 = r0
                goto L1e
            L1b:
                r0 = 0
                r11 = r0
            L1e:
                r0 = r12
                r1 = r11
                r2 = r10
                r3 = 1
                r2 = r2 & r3
                boolean r0 = r0.shouldExecute(r1, r2)
                if (r0 == 0) goto Lb2
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto L3c
                r0 = 1461546774(0x571d6f16, float:1.7310044E14)
                r1 = r10
                r2 = -1
                java.lang.String r3 = "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)"
                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
            L3c:
                r0 = r12
                r1 = 674466840(0x28338c18, float:9.966874E-15)
                r0.startReplaceGroup(r1)
                r0 = r7
                java.util.List r0 = r0.f72668c
                r13 = r0
                r0 = r7
                kntr.base.router.Router r0 = r0.f72669d
                r14 = r0
                r0 = r12
                r1 = r14
                boolean r0 = r0.changedInstance(r1)
                r11 = r0
                r0 = r12
                java.lang.Object r0 = r0.rememberedValue()
                r9 = r0
                r0 = r11
                if (r0 != 0) goto L75
                r0 = r9
                r8 = r0
                r0 = r9
                androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                java.lang.Object r1 = r1.getEmpty()
                if (r0 != r1) goto L87
            L75:
                com.bilibili.ogv.secondary.b r0 = new com.bilibili.ogv.secondary.b
                r1 = r0
                r2 = r14
                r1.<init>(r2)
                r8 = r0
                r0 = r12
                r1 = r8
                r0.updateRememberedValue(r1)
            L87:
                r0 = r8
                kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
                r9 = r0
                r0 = r7
                androidx.compose.ui.Modifier r0 = r0.f72666a
                r8 = r0
                r0 = r7
                androidx.compose.foundation.pager.PagerState r0 = r0.f72667b
                r1 = r13
                r2 = r9
                r3 = r8
                r4 = r12
                r5 = 0
                com.bilibili.ogv.secondary.q.a(r0, r1, r2, r3, r4, r5)
                r0 = r12
                r0.endReplaceGroup()
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto Lb9
                androidx.compose.runtime.ComposerKt.traceEventEnd()
                goto Lb9
            Lb2:
                r0 = r12
                r0.skipToGroupEnd()
            Lb9:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.secondary.C5522c.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public C5522c(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, PagerState pagerState, List list, Router router) {
        this.f72661b = vertexContext;
        this.f72662c = komponentScope;
        this.f72663d = pagerState;
        this.f72664e = list;
        this.f72665f = router;
        this.f72660a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(C5522c.class);
    }

    public final Object getKey() {
        return this.f72662c.getKey();
    }

    public final Object getState() {
        return this.f72660a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f72661b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f72663d, this.f72664e, this.f72665f), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
