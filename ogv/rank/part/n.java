package com.bilibili.ogv.rank.part;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.operation3.module.followable.CreateFavorModel$invoke$1;
import com.bilibili.ogv.operation3.module.followable.CreateFollowableSeasonModel$invoke$1;
import com.bilibili.ogv.rank.api.a;
import it0.C7615a;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import ml0.C8013d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/n.class */
public final class n implements UiComposableLike {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unit f72097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexContext f72098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KomponentScope f72099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a.c f72100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CreateFollowableSeasonModel$invoke$1 f72101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CreateFavorModel$invoke$1 f72102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C7615a f72103g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/n$a.class */
    public static final class a implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Modifier f72104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a.c f72105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CreateFollowableSeasonModel$invoke$1 f72106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CreateFavorModel$invoke$1 f72107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C7615a f72108e;

        public a(Modifier modifier, a.c cVar, CreateFollowableSeasonModel$invoke$1 createFollowableSeasonModel$invoke$1, CreateFavorModel$invoke$1 createFavorModel$invoke$1, C7615a c7615a) {
            this.f72104a = modifier;
            this.f72105b = cVar;
            this.f72106c = createFollowableSeasonModel$invoke$1;
            this.f72107d = createFavorModel$invoke$1;
            this.f72108e = c7615a;
        }

        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461546774, iIntValue, -1, "kntr.common.komponent.setContent.<no name provided>.invoke.<anonymous> (Komponent.kt:79)");
                }
                composer.startReplaceGroup(1917845209);
                A.a(this.f72105b, this.f72106c, this.f72107d, C8013d.a(this.f72104a, this.f72108e), composer, 0);
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

    public n(Unit unit, VertexContext vertexContext, KomponentScope komponentScope, a.c cVar, CreateFollowableSeasonModel$invoke$1 createFollowableSeasonModel$invoke$1, CreateFavorModel$invoke$1 createFavorModel$invoke$1, C7615a c7615a) {
        this.f72098b = vertexContext;
        this.f72099c = komponentScope;
        this.f72100d = cVar;
        this.f72101e = createFollowableSeasonModel$invoke$1;
        this.f72102f = createFavorModel$invoke$1;
        this.f72103g = c7615a;
        this.f72097a = unit;
    }

    public final Object getContentType() {
        return Reflection.getOrCreateKotlinClass(n.class);
    }

    public final Object getKey() {
        return this.f72099c.getKey();
    }

    public final Object getState() {
        return this.f72097a;
    }

    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i7) {
        composer.startReplaceGroup(1906618612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1906618612, i7, -1, "kntr.common.komponent.setContent.<no name provided>.invoke (Komponent.kt:78)");
        }
        CreateFavorModel$invoke$1 createFavorModel$invoke$1 = this.f72102f;
        C7615a c7615a = this.f72103g;
        this.f72098b.ProvideCompositionLocals(ComposableLambdaKt.rememberComposableLambda(1461546774, true, new a(modifier, this.f72100d, this.f72101e, createFavorModel$invoke$1, c7615a), composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
