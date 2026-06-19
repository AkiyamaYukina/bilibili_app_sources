package com.bilibili.ship.theseus.ugc.play.schedule;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.ugc.play.schedule.e;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import ev0.InterfaceC7008a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/k.class */
@StabilityInferred(parameters = 0)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f98191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f98192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f98193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final UGCEpisodeListRepository f98194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f98195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8043a f98196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Av0.a f98197g;

    @Inject
    public k(@NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull UGCPlaybackRepository uGCPlaybackRepository, @NotNull rW0.a<InterfaceC7008a> aVar, @NotNull UGCEpisodeListRepository uGCEpisodeListRepository, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull C8043a c8043a) {
        this.f98191a = hVar;
        this.f98192b = uGCPlaybackRepository;
        this.f98193c = aVar;
        this.f98194d = uGCEpisodeListRepository;
        this.f98195e = pageBackgroundPlayRepository;
        this.f98196f = c8043a;
    }

    @Nullable
    public final e a() {
        e eVar;
        Av0.a aVarC = this.f98192b.c();
        Av0.a aVar = aVarC;
        if (aVarC == null) {
            aVar = this.f98197g;
        }
        UGCEpisodeListRepository uGCEpisodeListRepository = this.f98194d;
        Iterator<e> it = uGCEpisodeListRepository.a().iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (c.a(it.next(), aVar)) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-ugc-UGCEpisodeListRepository-nextEpisodeManually] ", "current episode not found " + (aVar != null ? Long.valueOf(aVar.f590a) : null) + " " + (aVar != null ? Long.valueOf(aVar.f591b) : null), "UGCEpisodeListRepository-nextEpisodeManually", (Throwable) null);
            eVar = null;
        } else if (uGCEpisodeListRepository.b().toStrategy() instanceof f) {
            List<e> listA = uGCEpisodeListRepository.a();
            int i8 = i7 + 1;
            eVar = (i8 < 0 || i8 >= listA.size()) ? (e) CollectionsKt.getOrNull(uGCEpisodeListRepository.a(), 0) : listA.get(i8);
        } else {
            List<e> listA2 = uGCEpisodeListRepository.a();
            int i9 = i7 + 1;
            e eVar2 = null;
            if (i9 >= 0) {
                eVar2 = null;
                if (i9 < listA2.size()) {
                    eVar2 = listA2.get(i9);
                }
            }
            eVar = eVar2;
        }
        return eVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws kotlin.NoWhenBranchMatchedException, kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.play.schedule.k.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c(int i7) {
        e eVarA = a();
        if (eVarA == null) {
            return;
        }
        Av0.a aVar = eVarA.f98180a;
        this.f98197g = aVar;
        if (eVarA.f98181b instanceof e.a.c) {
            Av0.a aVarC = this.f98192b.c();
            if (aVarC != null) {
                long j7 = aVar.f590a;
                if (aVarC.f590a == j7) {
                    UGCPlaybackRepository.g(this.f98192b, j7, aVar.f591b, null, null, i7, 12);
                    return;
                }
            }
            InterfaceC7008a interfaceC7008a = (InterfaceC7008a) this.f98193c.get();
            long j8 = aVar.f590a;
            String strF = this.f98195e.f();
            InterfaceC7008a.e(interfaceC7008a, j8, aVar.f591b, null, this.f98196f.a().f123881c, strF, i7, null, true, 138);
        }
    }

    public final void d(int i7) {
        e eVar;
        UGCPlaybackRepository uGCPlaybackRepository = this.f98192b;
        Av0.a aVarC = uGCPlaybackRepository.c();
        Av0.a aVar = aVarC;
        if (aVarC == null) {
            aVar = this.f98197g;
        }
        UGCEpisodeListRepository uGCEpisodeListRepository = this.f98194d;
        Iterator<e> it = uGCEpisodeListRepository.a().iterator();
        int i8 = 0;
        while (true) {
            if (!it.hasNext()) {
                i8 = -1;
                break;
            } else if (c.a(it.next(), aVar)) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 == -1) {
            com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-ugc-UGCEpisodeListRepository-previousEpisodeManually] ", "current episode not found " + (aVar != null ? Long.valueOf(aVar.f590a) : null) + " " + (aVar != null ? Long.valueOf(aVar.f591b) : null), "UGCEpisodeListRepository-previousEpisodeManually", (Throwable) null);
            eVar = null;
        } else if (uGCEpisodeListRepository.b().toStrategy() instanceof f) {
            List<e> listA = uGCEpisodeListRepository.a();
            int i9 = i8 - 1;
            eVar = (i9 < 0 || i9 >= listA.size()) ? (e) CollectionsKt.last(uGCEpisodeListRepository.a()) : listA.get(i9);
        } else {
            List<e> listA2 = uGCEpisodeListRepository.a();
            int i10 = i8 - 1;
            e eVar2 = null;
            if (i10 >= 0) {
                eVar2 = null;
                if (i10 < listA2.size()) {
                    eVar2 = listA2.get(i10);
                }
            }
            eVar = eVar2;
        }
        if (eVar == null) {
            return;
        }
        Av0.a aVar2 = eVar.f98180a;
        this.f98197g = aVar2;
        if (eVar.f98181b instanceof e.a.c) {
            Av0.a aVarC2 = uGCPlaybackRepository.c();
            if (aVarC2 != null) {
                long j7 = aVar2.f590a;
                if (aVarC2.f590a == j7) {
                    UGCPlaybackRepository.g(this.f98192b, j7, aVar2.f591b, null, null, i7, 12);
                    return;
                }
            }
            InterfaceC7008a.e((InterfaceC7008a) this.f98193c.get(), aVar2.f590a, aVar2.f591b, null, this.f98196f.a().f123881c, this.f98195e.f(), i7, null, true, 138);
        }
    }
}
