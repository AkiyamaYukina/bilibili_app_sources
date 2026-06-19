package com.bilibili.ship.theseus.playlist;

import F3.K6;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.playlist.InterfaceC6214a;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.ugc.play.schedule.PlaybackMode;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/z.class */
@StabilityInferred(parameters = 0)
public final class z implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f96143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistLoadService f96144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f96145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f96146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f96147e = LazyKt.lazy(new K6(8));

    @Inject
    public z(@NotNull PlaylistRepository playlistRepository, @NotNull PlaylistLoadService playlistLoadService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository) {
        this.f96143a = playlistRepository;
        this.f96144b = playlistLoadService;
        this.f96145c = iPlayerSettingService;
        this.f96146d = pageBackgroundPlayRepository;
    }

    @Override // com.bilibili.ship.theseus.playlist.u
    @Nullable
    public final Object a(@NotNull Continuation<? super InterfaceC6214a> continuation) {
        MultiTypeMedia multiTypeMedia = (MultiTypeMedia) CollectionsKt.first(this.f96143a.d());
        return new InterfaceC6214a.b(multiTypeMedia, (Ou0.c) CollectionsKt.firstOrNull(multiTypeMedia.f95225M));
    }

    @Override // com.bilibili.ship.theseus.playlist.u
    @Nullable
    public final Object b(boolean z6, boolean z7, boolean z8, @NotNull ContinuationImpl continuationImpl) {
        PlaylistRepository.e eVarC = this.f96143a.c();
        MultiTypeMedia multiTypeMedia = eVarC.f95137a;
        int i7 = 0;
        if (!z6) {
            PlaybackMode.a aVar = PlaybackMode.Companion;
            IPlayerSettingService iPlayerSettingService = this.f96145c;
            int i8 = iPlayerSettingService.getInt(com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
            aVar.getClass();
            if (PlaybackMode.a.a(i8) == PlaybackMode.PAUSE_WHEN_ENDED) {
                return InterfaceC6214a.d.f95190a;
            }
            int i9 = iPlayerSettingService.getInt(com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
            aVar.getClass();
            if (PlaybackMode.a.a(i9) == PlaybackMode.SINGLE_EPISODE_LOOP) {
                return InterfaceC6214a.f.f95192a;
            }
        }
        Ou0.c cVar = eVarC.f95138b;
        if (cVar == null || z7) {
            return d(z6, z8, continuationImpl);
        }
        Iterator<Ou0.c> it = multiTypeMedia.f95225M.iterator();
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (it.next().f18089b == cVar.f18089b) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            BLog.e("PlaylistNormalIterator-next", "[theseus-playlist-PlaylistNormalIterator-next] Failed to play next, can not find playing page in current media!", (Throwable) null);
            return InterfaceC6214a.c.f95189a;
        }
        int i10 = i7 + 1;
        return i10 < multiTypeMedia.f95225M.size() ? new InterfaceC6214a.C0771a(multiTypeMedia, f(multiTypeMedia, i10)) : d(z6, z8, continuationImpl);
    }

    @Override // com.bilibili.ship.theseus.playlist.u
    @Nullable
    public final Object c(boolean z6, @NotNull Continuation continuation) {
        PlaylistRepository.e eVarC = this.f96143a.c();
        MultiTypeMedia multiTypeMedia = eVarC.f95137a;
        Ou0.c cVar = eVarC.f95138b;
        if (cVar == null || z6) {
            return e();
        }
        Iterator<Ou0.c> it = multiTypeMedia.f95225M.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (it.next().f18089b == cVar.f18089b) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            BLog.e("PlaylistNormalIterator-previous", "[theseus-playlist-PlaylistNormalIterator-previous] Failed to play previous, can not find playing page in current media!", (Throwable) null);
            return InterfaceC6214a.c.f95189a;
        }
        int i8 = i7 - 1;
        return i8 >= 0 ? new InterfaceC6214a.C0771a(multiTypeMedia, f(multiTypeMedia, i8)) : e();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(boolean r6, boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.z.d(boolean, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final InterfaceC6214a e() {
        PlaylistRepository playlistRepository = this.f96143a;
        PlaylistRepository.e eVarC = playlistRepository.c();
        List<MultiTypeMedia> listD = playlistRepository.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (!((MultiTypeMedia) obj).s()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (((MultiTypeMedia) it.next()).d() == eVarC.f95137a.d()) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            BLog.e("PlaylistNormalIterator-fetchListPrevious", "[theseus-playlist-PlaylistNormalIterator-fetchListPrevious] Invalid index!", (Throwable) null);
            return InterfaceC6214a.c.f95189a;
        }
        MultiTypeMedia multiTypeMediaG = g(i7 - 1, arrayList, false);
        return (multiTypeMediaG == null && ((Boolean) this.f96147e.getValue()).booleanValue() && this.f96146d.d()) ? InterfaceC6214a.d.f95190a : multiTypeMediaG == null ? InterfaceC6214a.c.f95189a : multiTypeMediaG.d() == eVarC.f95137a.d() ? InterfaceC6214a.f.f95192a : new InterfaceC6214a.b(multiTypeMediaG, multiTypeMediaG.b());
    }

    @Nullable
    public final Ou0.c f(@NotNull MultiTypeMedia multiTypeMedia, int i7) {
        Object next;
        if (!((Boolean) this.f96147e.getValue()).booleanValue() || !this.f96146d.d()) {
            return (Ou0.c) CollectionsKt.getOrNull(multiTypeMedia.f95225M, i7);
        }
        List<Ou0.c> list = multiTypeMedia.f95225M;
        Iterator it = CollectionsKt.reversed(list.subList(0, Math.min(Math.max(-1, i7) + 1, list.size()))).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Ou0.c) next).f18103q) {
                break;
            }
        }
        return (Ou0.c) next;
    }

    @Nullable
    public final MultiTypeMedia g(int i7, @NotNull List list, boolean z6) {
        List<Ou0.c> list2;
        if (!((Boolean) this.f96147e.getValue()).booleanValue() || !this.f96146d.d()) {
            return (MultiTypeMedia) CollectionsKt.getOrNull(list, i7 % ((ArrayList) list).size());
        }
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return null;
        }
        boolean zH = h();
        if (i7 < 0 && !zH && !z6) {
            return null;
        }
        if (i7 >= arrayList.size() && !zH && z6) {
            return null;
        }
        int i8 = z6 ? 1 : -1;
        if (i7 < 0) {
            i7 = z6 ? 0 : arrayList.size() - 1;
        } else if (i7 < 0 || i7 >= list.size()) {
            i7 %= arrayList.size();
        }
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            MultiTypeMedia multiTypeMedia = (MultiTypeMedia) CollectionsKt.getOrNull(list, i7);
            if (multiTypeMedia != null && (list2 = multiTypeMedia.f95225M) != null) {
                List<Ou0.c> list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        if (((Ou0.c) it.next()).f18103q) {
                        }
                    }
                }
                int i10 = i7 + i8;
                int i11 = i9 + 1;
                if (zH) {
                    if (i10 >= size) {
                        i7 = 0;
                        i9 = i11;
                    } else {
                        i9 = i11;
                        i7 = i10;
                        if (i10 < 0) {
                            i7 = size - 1;
                            i9 = i11;
                        }
                    }
                } else {
                    if (i10 < 0 || i10 >= list.size()) {
                        return null;
                    }
                    i9 = i11;
                    i7 = i10;
                }
            }
            return (MultiTypeMedia) CollectionsKt.getOrNull(list, i7);
        }
        return null;
    }

    public final boolean h() {
        PlaybackMode.a aVar = PlaybackMode.Companion;
        boolean z6 = false;
        int i7 = this.f96145c.getInt(com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
        aVar.getClass();
        if (PlaybackMode.a.a(i7) == PlaybackMode.LIST_LOOP) {
            z6 = true;
        }
        return z6;
    }

    @Override // com.bilibili.ship.theseus.playlist.u
    public final boolean hasNext() {
        boolean z6 = true;
        if (h()) {
            return true;
        }
        PlaylistRepository playlistRepository = this.f96143a;
        MultiTypeMedia multiTypeMedia = playlistRepository.c().f95137a;
        Ou0.c cVar = playlistRepository.c().f95138b;
        Iterator<MultiTypeMedia> it = playlistRepository.d().iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (it.next().d() == multiTypeMedia.d()) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            BLog.e("PlaylistNormalIterator-hasNext", "[theseus-playlist-PlaylistNormalIterator-hasNext] Invalid index!", (Throwable) null);
            return false;
        }
        if (i7 < CollectionsKt.getLastIndex(playlistRepository.d())) {
            return true;
        }
        Iterator<Ou0.c> it2 = multiTypeMedia.f95225M.iterator();
        int i8 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i8 = -1;
                break;
            }
            Ou0.c next = it2.next();
            if (cVar != null && next.f18089b == cVar.f18089b) {
                break;
            }
            i8++;
        }
        if (i8 == -1) {
            BLog.e("PlaylistNormalIterator-hasNext", "[theseus-playlist-PlaylistNormalIterator-hasNext] Failed to play next, can not find playing page in current media!", (Throwable) null);
            return false;
        }
        if (i8 >= CollectionsKt.getLastIndex(multiTypeMedia.f95225M)) {
            z6 = false;
        }
        return z6;
    }

    @Override // com.bilibili.ship.theseus.playlist.u
    public final boolean hasPrevious() {
        boolean z6 = true;
        if (h()) {
            return true;
        }
        PlaylistRepository playlistRepository = this.f96143a;
        MultiTypeMedia multiTypeMedia = playlistRepository.c().f95137a;
        Ou0.c cVar = playlistRepository.c().f95138b;
        Iterator<MultiTypeMedia> it = playlistRepository.d().iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (it.next().d() == multiTypeMedia.d()) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            BLog.e("PlaylistNormalIterator-hasPrevious", "[theseus-playlist-PlaylistNormalIterator-hasPrevious] Invalid index!", (Throwable) null);
            return false;
        }
        if (i7 > 0) {
            return true;
        }
        Iterator<Ou0.c> it2 = multiTypeMedia.f95225M.iterator();
        int i8 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i8 = -1;
                break;
            }
            Ou0.c next = it2.next();
            if (cVar != null && next.f18089b == cVar.f18089b) {
                break;
            }
            i8++;
        }
        if (i8 == -1) {
            BLog.e("PlaylistNormalIterator-hasPrevious", "[theseus-playlist-PlaylistNormalIterator-hasPrevious] Failed to play next, can not find playing page in current media!", (Throwable) null);
            return false;
        }
        if (i8 <= 0) {
            z6 = false;
        }
        return z6;
    }
}
