package com.bilibili.ogv.filmlist.part;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.ogv.filmlist.api.c;
import com.bilibili.ogv.filmlist.favorite.CreateFavoriteModel$invoke$1;
import com.bilibili.ogv.filmlist.r;
import com.bilibili.ogv.operation3.module.followable.CreateFollowUpperModel$invoke$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kntr.base.config.SerializableSharedPreferencesProperty;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kntr.common.pv.compose.PvTriggerEntranceKt;
import kntr.common.share.domain.model.ShareParams;
import kntr.common.trio.toast.Toaster;
import kntr.common.trio.toast.ToasterKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.serialization.internal.BooleanSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xj0.C8982c;
import xj0.C8983d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/part/PartReadyUiService.class */
@StabilityInferred(parameters = 0)
public final class PartReadyUiService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KomponentScope<Unit> f67748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.filmlist.api.c f67749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f67750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<g> f67751d = SnapshotStateKt.mutableStateListOf();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final LazyListState f67752e = new LazyListState(0, 0, 3, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f67753f = "pgc.operation-playlist";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final e f67754g;

    /* JADX INFO: renamed from: com.bilibili.ogv.filmlist.part.PartReadyUiService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/part/PartReadyUiService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PartReadyUiService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PartReadyUiService partReadyUiService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = partReadyUiService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PartReadyUiService partReadyUiService = this.this$0;
            SnapshotStateList<g> snapshotStateList = partReadyUiService.f67751d;
            c cVar = partReadyUiService.f67750c;
            List<c.C0393c> list = partReadyUiService.f67749b.f67640b;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new g(partReadyUiService.f67748a.embed(KomponentKt.Komponent(new com.bilibili.tgwt.search.b(1, cVar.f67757a, (c.C0393c) it.next()))), a.f67755a));
            }
            snapshotStateList.addAll(arrayList);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public PartReadyUiService(@NotNull KomponentScope<? super Unit> komponentScope, @NotNull com.bilibili.ogv.filmlist.api.c cVar, @NotNull d dVar, @NotNull c cVar2) {
        CreateFollowUpperModel$invoke$1 createFollowUpperModel$invoke$1;
        this.f67748a = komponentScope;
        this.f67749b = cVar;
        this.f67750c = cVar2;
        CreateFavoriteModel$invoke$1 createFavoriteModel$invoke$1 = new CreateFavoriteModel$invoke$1(cVar.f67641c, komponentScope, dVar.f67758a, cVar.f67639a);
        com.bilibili.ogv.filmlist.api.d dVar2 = cVar.f67652o;
        if (dVar2 != null) {
            com.bilibili.ogv.operation3.module.followable.d dVar3 = dVar.f67759b;
            com.bilibili.ogv.operation3.module.community.k kVar = dVar3.f71338a;
            long j7 = dVar2.f67677b;
            kVar.b(j7, dVar2.f67679d);
            createFollowUpperModel$invoke$1 = new CreateFollowUpperModel$invoke$1(komponentScope, dVar3, j7, (Toaster) komponentScope.getContext().getCompositionLocal(ToasterKt.getLocalToaster()));
        } else {
            createFollowUpperModel$invoke$1 = null;
        }
        com.bilibili.ogv.filmlist.share.c cVar3 = new com.bilibili.ogv.filmlist.share.c(new ShareParams("pgc.operation-playlist.list.share.click", cVar.h, "", "", (ShareParams.PageInfo) null, (List) null, 48, (DefaultConstructorMarker) null), komponentScope, SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null), cVar);
        com.bilibili.ogv.filmlist.guide.b bVar = new com.bilibili.ogv.filmlist.guide.b(SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(!((Boolean) r0.getValue((Object) null, com.bilibili.ogv.filmlist.guide.d.f67711a[0])).booleanValue()), null, 2, null), new com.bilibili.ogv.filmlist.guide.c(new SerializableSharedPreferencesProperty("bangumi_pref", false, BooleanSerializer.INSTANCE, "pref_ogv_film_list_square_guide_popup_showed", new Cy.a(9), (Function2) null)));
        Map<String, String> map = cVar.f67653p;
        A50.d dVar4 = new A50.d(createFavoriteModel$invoke$1, 2);
        C8983d c8983d = dVar.f67760c;
        this.f67754g = new e(new C8982c(dVar4, c8983d, "pgc.operation-playlist.list.collect.click", map, "pgc.operation-playlist.list.collect.show"), new C8982c(new A50.e(createFollowUpperModel$invoke$1, 3), c8983d, "pgc.operation-playlist.list.upfollow.click", cVar.f67653p, "pgc.operation-playlist.list.upfollow.show"), new C8982c(new A50.f(cVar3, 4), c8983d, "pgc.operation-playlist.list.share.click", cVar.f67653p, "pgc.operation-playlist.list.share.show"), new C8982c(new Ig.f(1, dVar, cVar), c8983d, "pgc.operation-playlist.list.comment.click", cVar.f67653p, "pgc.operation-playlist.list.comment.show"), new C8982c(new Ig.h(1, dVar, cVar), c8983d, "pgc.operation-playlist.list.plaza.click", cVar.f67653p, "pgc.operation-playlist.list.plaza.show"), new C8982c(new Ig.g(dVar, cVar), c8983d, "pgc.operation-playlist.list.up.click", cVar.f67653p, "pgc.operation-playlist.list.up.show"), createFavoriteModel$invoke$1, createFollowUpperModel$invoke$1, cVar3, bVar);
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void a(@Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1516111782);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1516111782, i9, -1, "com.bilibili.ogv.filmlist.part.PartReadyUiService.Content (PartReadyUiService.kt:44)");
            }
            PvTriggerEntranceKt.rememberPvEventTrigger(this.f67753f + ".0.0.pv", composerStartRestartGroup, 0);
            final WindowSizeClass windowSizeClass = androidx.compose.material3.adaptive.f.a(composerStartRestartGroup).f40806a;
            r.d(this.f67749b, this.f67754g, modifier, ComposableLambdaKt.rememberComposableLambda(-405022263, true, new Function4(this, windowSizeClass) { // from class: com.bilibili.ogv.filmlist.part.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PartReadyUiService f67777a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final WindowSizeClass f67778b;

                {
                    this.f67777a = this;
                    this.f67778b = windowSizeClass;
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18) {
                    /*
                        Method dump skipped, instruction units count: 320
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.filmlist.part.h.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i9 << 6) & 896) | 3072);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, modifier, i7) { // from class: com.bilibili.ogv.filmlist.part.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PartReadyUiService f67779a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f67780b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f67781c;

                {
                    this.f67779a = this;
                    this.f67780b = modifier;
                    this.f67781c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f67781c | 1);
                    this.f67779a.a(this.f67780b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
