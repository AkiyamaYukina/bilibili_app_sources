package com.bilibili.ship.theseus.united.player.mediaplay;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.ArcType;
import com.bilibili.ship.theseus.united.page.interactvideo.w;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ev0.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/h.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.MediaScope")
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.di.MediaCoroutineScope"})
public final class h implements Factory<com.bilibili.ship.theseus.keel.player.j> {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static com.bilibili.ship.theseus.keel.player.j a(CoroutineScope coroutineScope, j.a aVar, i iVar, w wVar, p pVar, com.bilibili.ship.theseus.united.player.history.d dVar, q qVar) throws NoWhenBranchMatchedException {
        com.bilibili.ship.theseus.keel.player.j jVarA;
        f fVar = aVar.f117660d;
        boolean z6 = false;
        if (fVar instanceof f.e) {
            jVarA = iVar.d(((f.e) fVar).f104523a);
        } else if (fVar instanceof f.b) {
            jVarA = iVar.b(((f.b) fVar).f104515a, aVar);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MediaPlayableModule$providePlayable$playable$1$1(pVar, aVar, jVarA, null), 3, (Object) null);
        } else if (fVar instanceof f.a) {
            jVarA = iVar.c(((f.a) fVar).f104514a, aVar);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MediaPlayableModule$providePlayable$playable$2$1(pVar, aVar, jVarA, null), 3, (Object) null);
        } else if (fVar instanceof f.c) {
            f.c cVar = (f.c) fVar;
            ArcType arcType = cVar.f104516a.getPlayArc().getArcType();
            ArcType arcType2 = ArcType.ARC_TYPE_INTERACT;
            PlayViewUniteReply playViewUniteReply = cVar.f104516a;
            if (arcType == arcType2) {
                jVarA = wVar.a(iVar.e(aVar, cVar), playViewUniteReply, new MediaPlayableModule$runInteractiveVideo$service$1(dVar, null)).f99877N;
                z6 = true;
            } else {
                jVarA = iVar.a(aVar, cVar);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MediaPlayableModule$providePlayable$enforceStartPosition$1(pVar, aVar, CompletableDeferredKt.CompletableDeferred(playViewUniteReply), jVarA, null), 3, (Object) null);
            }
        } else {
            if (!(fVar instanceof f.d)) {
                throw new NoWhenBranchMatchedException();
            }
            f.d dVar2 = (f.d) fVar;
            if (dVar2.f104521a.getInteract() != null) {
                jVarA = wVar.a(dVar2.f104521a, null, new MediaPlayableModule$runInteractiveVideo$service$1(dVar, null)).f99877N;
                z6 = true;
            } else {
                jVarA = q.a(qVar, dVar2.f104521a, null, null, null, null, null, aVar.f117668m, 62);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MediaPlayableModule$providePlayable$enforceStartPosition$1(pVar, aVar, BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MediaPlayableModule$providePlayable$playable$4$1(jVarA, null), 3, (Object) null), jVarA, null), 3, (Object) null);
            }
        }
        if (!z6) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MediaPlayableModule$providePlayable$1(aVar, jVarA, dVar, null), 3, (Object) null);
        }
        return (com.bilibili.ship.theseus.keel.player.j) Preconditions.checkNotNullFromProvides(jVarA);
    }
}
