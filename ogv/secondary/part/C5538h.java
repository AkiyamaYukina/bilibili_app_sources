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

/* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/h.class */
public final class C5538h implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f72823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f72824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f72825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC5531a f72826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final KomponentScope f72827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableState f72828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CreateCategoryKomponentImpl f72829g;
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f72830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Toaster f72831j;

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.h$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/h$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f72832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC5531a f72833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final KomponentScope f72834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MutableState f72835d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final CreateCategoryKomponentImpl f72836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f72837f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f72838g;
        public final Toaster h;

        public a(Modifier modifier, InterfaceC5531a interfaceC5531a, KomponentScope komponentScope, MutableState mutableState, CreateCategoryKomponentImpl createCategoryKomponentImpl, String str, String str2, Toaster toaster) {
            this.f72832a = modifier;
            this.f72833b = interfaceC5531a;
            this.f72834c = komponentScope;
            this.f72835d = mutableState;
            this.f72836e = createCategoryKomponentImpl;
            this.f72837f = str;
            this.f72838g = str2;
            this.h = toaster;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x010f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 363
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.secondary.part.C5538h.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public C5538h(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, InterfaceC5531a interfaceC5531a, KomponentScope komponentScope2, MutableState mutableState, CreateCategoryKomponentImpl createCategoryKomponentImpl, String str, String str2, Toaster toaster) {
        this.f72824b = vertexContext;
        this.f72825c = komponentScope;
        this.f72826d = interfaceC5531a;
        this.f72827e = komponentScope2;
        this.f72828f = mutableState;
        this.f72829g = createCategoryKomponentImpl;
        this.h = str;
        this.f72830i = str2;
        this.f72831j = toaster;
        this.f72823a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(C5538h.class);
    }

    public final Object getKey() {
        return this.f72825c.getKey();
    }

    public final Object getState() {
        return this.f72823a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f72824b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f72826d, this.f72827e, this.f72828f, this.f72829g, this.h, this.f72830i, this.f72831j), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
