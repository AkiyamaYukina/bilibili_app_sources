package com.bilibili.ogv.rank.part;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.toast.Toaster;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/e.class */
public final class e implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f72046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f72047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f72048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f72049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final KomponentScope f72050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableState f72051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f72052g;
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f72053i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MutableStateFlow f72054j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Toaster f72055k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/e$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f72056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f72057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KomponentScope f72058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MutableState f72059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final l f72060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f72061f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f72062g;
        public final MutableStateFlow h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Toaster f72063i;

        public a(Modifier modifier, r rVar, KomponentScope komponentScope, MutableState mutableState, l lVar, String str, String str2, MutableStateFlow mutableStateFlow, Toaster toaster) {
            this.f72056a = modifier;
            this.f72057b = rVar;
            this.f72058c = komponentScope;
            this.f72059d = mutableState;
            this.f72060e = lVar;
            this.f72061f = str;
            this.f72062g = str2;
            this.h = mutableStateFlow;
            this.f72063i = toaster;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0123  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 385
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.rank.part.e.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public e(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, r rVar, KomponentScope komponentScope2, MutableState mutableState, l lVar, String str, String str2, MutableStateFlow mutableStateFlow, Toaster toaster) {
        this.f72047b = vertexContext;
        this.f72048c = komponentScope;
        this.f72049d = rVar;
        this.f72050e = komponentScope2;
        this.f72051f = mutableState;
        this.f72052g = lVar;
        this.h = str;
        this.f72053i = str2;
        this.f72054j = mutableStateFlow;
        this.f72055k = toaster;
        this.f72046a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(e.class);
    }

    public final Object getKey() {
        return this.f72048c.getKey();
    }

    public final Object getState() {
        return this.f72046a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f72047b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f72049d, this.f72050e, this.f72051f, this.f72052g, this.h, this.f72053i, this.f72054j, this.f72055k), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
