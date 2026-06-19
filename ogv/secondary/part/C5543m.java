package com.bilibili.ogv.secondary.part;

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

/* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/m.class */
public final class C5543m implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f72853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f72854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f72855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC5531a f72856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final KomponentScope f72857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableState f72858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CreateCategoryKomponentImpl f72859g;
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f72860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Toaster f72861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.compose.material3.pulltorefresh.t f72862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final UiComposableLike f72863l;

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.m$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/m$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f72864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC5531a f72865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KomponentScope f72866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MutableState f72867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final CreateCategoryKomponentImpl f72868e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f72869f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f72870g;
        public final Toaster h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final androidx.compose.material3.pulltorefresh.t f72871i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final UiComposableLike f72872j;

        public a(Modifier modifier, InterfaceC5531a interfaceC5531a, KomponentScope komponentScope, MutableState mutableState, CreateCategoryKomponentImpl createCategoryKomponentImpl, String str, String str2, Toaster toaster, androidx.compose.material3.pulltorefresh.t tVar, UiComposableLike uiComposableLike) {
            this.f72864a = modifier;
            this.f72865b = interfaceC5531a;
            this.f72866c = komponentScope;
            this.f72867d = mutableState;
            this.f72868e = createCategoryKomponentImpl;
            this.f72869f = str;
            this.f72870g = str2;
            this.h = toaster;
            this.f72871i = tVar;
            this.f72872j = uiComposableLike;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00e4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 380
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.secondary.part.C5543m.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public C5543m(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, InterfaceC5531a interfaceC5531a, KomponentScope komponentScope2, MutableState mutableState, CreateCategoryKomponentImpl createCategoryKomponentImpl, String str, String str2, Toaster toaster, androidx.compose.material3.pulltorefresh.t tVar, UiComposableLike uiComposableLike) {
        this.f72854b = vertexContext;
        this.f72855c = komponentScope;
        this.f72856d = interfaceC5531a;
        this.f72857e = komponentScope2;
        this.f72858f = mutableState;
        this.f72859g = createCategoryKomponentImpl;
        this.h = str;
        this.f72860i = str2;
        this.f72861j = toaster;
        this.f72862k = tVar;
        this.f72863l = uiComposableLike;
        this.f72853a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(C5543m.class);
    }

    public final Object getKey() {
        return this.f72855c.getKey();
    }

    public final Object getState() {
        return this.f72853a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        androidx.compose.material3.pulltorefresh.t tVar = this.f72862k;
        this.f72854b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f72856d, this.f72857e, this.f72858f, this.f72859g, this.h, this.f72860i, this.f72861j, tVar, this.f72863l), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
