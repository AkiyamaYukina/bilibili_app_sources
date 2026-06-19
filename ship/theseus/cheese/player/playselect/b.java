package com.bilibili.ship.theseus.cheese.player.playselect;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.cheese.player.playselect.CheeseEpisodeListRepository;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import com.bilibili.ship.theseus.cheese.player.playselect.c;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import eu0.C6985d;
import ev0.InterfaceC7008a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playselect/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final h f90741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f90742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CheeseEpisodeListRepository f90743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f90744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterfaceC7008a f90745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8043a f90746f;

    @Inject
    public b(@NotNull h hVar, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull CheeseEpisodeListRepository cheeseEpisodeListRepository, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull InterfaceC7008a interfaceC7008a, @NotNull C8043a c8043a) {
        this.f90741a = hVar;
        this.f90742b = cheesePlayRepository;
        this.f90743c = cheeseEpisodeListRepository;
        this.f90744d = pageBackgroundPlayRepository;
        this.f90745e = interfaceC7008a;
        this.f90746f = c8043a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws kotlin.NoWhenBranchMatchedException, kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.player.playselect.b.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b(boolean z6) {
        CheesePlayRepository cheesePlayRepository = this.f90742b;
        if (cheesePlayRepository.a() == null) {
            return;
        }
        c cVarD = this.f90743c.d(new c.a(cheesePlayRepository.a()), z6);
        if (cVarD == null) {
            return;
        }
        boolean z7 = cVarD instanceof c.a;
        PageBackgroundPlayRepository pageBackgroundPlayRepository = this.f90744d;
        if (z7) {
            C6985d c6985d = ((c.a) cVarD).f90747a;
            if (c6985d.f117517m) {
                CheesePlayRepository.e(this.f90742b, c6985d.f117510e, c6985d.f117511f, pageBackgroundPlayRepository.d() ? 99 : 0, 12);
                return;
            }
            return;
        }
        if (!(cVarD instanceof c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        Av0.a aVar = ((c.b) cVarD).f90748a;
        InterfaceC7008a.e(this.f90745e, aVar.f590a, aVar.f591b, null, this.f90746f.a().f123881c, pageBackgroundPlayRepository.f(), pageBackgroundPlayRepository.d() ? 99 : 0, null, true, 138);
    }

    public final void c() {
        c cVar;
        CheesePlayRepository cheesePlayRepository = this.f90742b;
        if (cheesePlayRepository.a() == null) {
            return;
        }
        c.a aVar = new c.a(cheesePlayRepository.a());
        CheeseEpisodeListRepository cheeseEpisodeListRepository = this.f90743c;
        Iterator<c> it = cheeseEpisodeListRepository.c().iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (a.b(it.next()) == a.b(aVar)) {
                break;
            } else {
                i7++;
            }
        }
        PlaybackMode.a aVar2 = PlaybackMode.Companion;
        int i8 = cheeseEpisodeListRepository.f90737b.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
        aVar2.getClass();
        if (CheeseEpisodeListRepository.a.f90740a[PlaybackMode.a.a(i8).ordinal()] == 3) {
            List<c> listC = cheeseEpisodeListRepository.c();
            int i9 = i7 - 1;
            cVar = (i9 < 0 || i9 >= listC.size()) ? (c) CollectionsKt.last(cheeseEpisodeListRepository.c()) : listC.get(i9);
        } else {
            List<c> listC2 = cheeseEpisodeListRepository.c();
            int i10 = i7 - 1;
            cVar = (i10 < 0 || i10 >= listC2.size()) ? null : listC2.get(i10);
        }
        if (cVar == null) {
            return;
        }
        boolean z6 = cVar instanceof c.a;
        PageBackgroundPlayRepository pageBackgroundPlayRepository = this.f90744d;
        if (z6) {
            C6985d c6985d = ((c.a) cVar).f90747a;
            if (c6985d.f117517m) {
                CheesePlayRepository.e(this.f90742b, c6985d.f117510e, c6985d.f117511f, pageBackgroundPlayRepository.d() ? 99 : 0, 12);
                return;
            }
            return;
        }
        if (!(cVar instanceof c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        Av0.a aVar3 = ((c.b) cVar).f90748a;
        InterfaceC7008a.e(this.f90745e, aVar3.f590a, aVar3.f591b, null, this.f90746f.a().f123881c, pageBackgroundPlayRepository.f(), pageBackgroundPlayRepository.d() ? 99 : 0, null, true, 138);
    }
}
