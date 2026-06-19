package com.bilibili.ogv.kmm.operation.vippreview;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.C6542t;
import java.util.List;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/j.class */
public final class j implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f68944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f68945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f68946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VipOfflinePreviewActiveCard f68947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C6542t f68948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f68949f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/j$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f68950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final VipOfflinePreviewActiveCard f68951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C6542t f68952c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f68953d;

        public a(Modifier modifier, VipOfflinePreviewActiveCard vipOfflinePreviewActiveCard, C6542t c6542t, List list) {
            this.f68950a = modifier;
            this.f68951b = vipOfflinePreviewActiveCard;
            this.f68952c = c6542t;
            this.f68953d = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x010f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 337
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.vippreview.j.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public j(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, VipOfflinePreviewActiveCard vipOfflinePreviewActiveCard, C6542t c6542t, List list) {
        this.f68945b = vertexContext;
        this.f68946c = komponentScope;
        this.f68947d = vipOfflinePreviewActiveCard;
        this.f68948e = c6542t;
        this.f68949f = list;
        this.f68944a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(j.class);
    }

    public final Object getKey() {
        return this.f68946c.getKey();
    }

    public final Object getState() {
        return this.f68944a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        this.f68945b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f68947d, this.f68948e, this.f68949f), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
