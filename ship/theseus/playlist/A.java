package com.bilibili.ship.theseus.playlist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.playlist.InterfaceC6214a;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.ugc.play.schedule.PlaybackMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/A.class */
@StabilityInferred(parameters = 0)
public final class A implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f94925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistLoadService f94926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f94927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList<Integer> f94928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f94929e = -1;

    @Inject
    public A(@NotNull PlaylistRepository playlistRepository, @NotNull PlaylistLoadService playlistLoadService, @NotNull IPlayerSettingService iPlayerSettingService) {
        this.f94925a = playlistRepository;
        this.f94926b = playlistLoadService;
        this.f94927c = iPlayerSettingService;
        int i7 = playlistRepository.e().f95279l;
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f94928d = arrayList;
        int iA = 0;
        while (true) {
            int i8 = iA;
            if (i8 >= i7) {
                Collections.shuffle(arrayList);
                defpackage.a.b("[theseus-playlist-PlaylistRandomIterator-<init>] ", "Random list init size:" + i7, "PlaylistRandomIterator-<init>");
                return;
            }
            iA = F1.b.a(i8, arrayList, i8, 1);
        }
    }

    @Override // com.bilibili.ship.theseus.playlist.u
    @Nullable
    public final Object a(@NotNull Continuation<? super InterfaceC6214a> continuation) {
        Collections.shuffle(this.f94928d);
        this.f94929e = -1;
        return b(true, true, true, (ContinuationImpl) continuation);
    }

    @Override // com.bilibili.ship.theseus.playlist.u
    @Nullable
    public final Object b(boolean z6, boolean z7, boolean z8, @NotNull ContinuationImpl continuationImpl) {
        InterfaceC6214a interfaceC6214a;
        Object c0771a;
        PlaylistRepository playlistRepository = this.f94925a;
        MultiTypeMedia multiTypeMedia = playlistRepository.c().f95137a;
        Ou0.c cVar = playlistRepository.c().f95138b;
        int i7 = 0;
        if (!z6) {
            PlaybackMode.a aVar = PlaybackMode.Companion;
            IPlayerSettingService iPlayerSettingService = this.f94927c;
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
        if (cVar == null || z7) {
            if (z8) {
                Object objD = d(continuationImpl);
                if (objD == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return objD;
                }
                interfaceC6214a = (InterfaceC6214a) objD;
            } else {
                BLog.i("PlaylistRandomIterator-next", "[theseus-playlist-PlaylistRandomIterator-next] never find in list, ignore");
                interfaceC6214a = InterfaceC6214a.c.f95189a;
            }
            return interfaceC6214a;
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
            BLog.e("PlaylistRandomIterator-next", "[theseus-playlist-PlaylistRandomIterator-next] Failed to play next, can not find playing page in current media!", (Throwable) null);
            return InterfaceC6214a.c.f95189a;
        }
        int i10 = i7 + 1;
        if (i10 < multiTypeMedia.f95225M.size()) {
            c0771a = new InterfaceC6214a.C0771a(multiTypeMedia, multiTypeMedia.f95225M.get(i10));
        } else {
            if (z8) {
                return d(continuationImpl);
            }
            c0771a = InterfaceC6214a.c.f95189a;
        }
        return c0771a;
    }

    @Override // com.bilibili.ship.theseus.playlist.u
    @Nullable
    public final Object c(boolean z6, @NotNull Continuation continuation) {
        PlaylistRepository.e eVarC = this.f94925a.c();
        MultiTypeMedia multiTypeMedia = eVarC.f95137a;
        Ou0.c cVar = eVarC.f95138b;
        if (cVar == null || z6) {
            return e((ContinuationImpl) continuation);
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
            BLog.e("PlaylistRandomIterator-previous", "[theseus-playlist-PlaylistRandomIterator-previous] Failed to play previous, can not find playing page in current media!", (Throwable) null);
            return InterfaceC6214a.c.f95189a;
        }
        int i8 = i7 - 1;
        return i8 >= 0 ? new InterfaceC6214a.C0771a(multiTypeMedia, multiTypeMedia.f95225M.get(i8)) : e((ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.A.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.A.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.ship.theseus.playlist.u
    public final boolean hasNext() {
        PlaybackMode.a aVar = PlaybackMode.Companion;
        boolean z6 = false;
        int i7 = this.f94927c.getInt(com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
        aVar.getClass();
        if ((PlaybackMode.a.a(i7) == PlaybackMode.LIST_LOOP) || this.f94929e < CollectionsKt.getLastIndex(this.f94928d)) {
            return true;
        }
        PlaylistRepository playlistRepository = this.f94925a;
        MultiTypeMedia multiTypeMedia = playlistRepository.c().f95137a;
        Ou0.c cVar = playlistRepository.c().f95138b;
        Iterator<Ou0.c> it = multiTypeMedia.f95225M.iterator();
        int i8 = 0;
        while (true) {
            if (!it.hasNext()) {
                i8 = -1;
                break;
            }
            Ou0.c next = it.next();
            if (cVar != null && next.f18089b == cVar.f18089b) {
                break;
            }
            i8++;
        }
        if (i8 == -1) {
            BLog.e("PlaylistRandomIterator-hasNext", "[theseus-playlist-PlaylistRandomIterator-hasNext] Failed to check next, can not find playing page in current media!", (Throwable) null);
            return false;
        }
        if (i8 < CollectionsKt.getLastIndex(multiTypeMedia.f95225M)) {
            z6 = true;
        }
        return z6;
    }

    @Override // com.bilibili.ship.theseus.playlist.u
    public final boolean hasPrevious() {
        PlaybackMode.a aVar = PlaybackMode.Companion;
        boolean z6 = false;
        int i7 = this.f94927c.getInt(com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
        aVar.getClass();
        if ((PlaybackMode.a.a(i7) == PlaybackMode.LIST_LOOP) || this.f94929e > 0) {
            return true;
        }
        PlaylistRepository playlistRepository = this.f94925a;
        MultiTypeMedia multiTypeMedia = playlistRepository.c().f95137a;
        Ou0.c cVar = playlistRepository.c().f95138b;
        Iterator<Ou0.c> it = multiTypeMedia.f95225M.iterator();
        int i8 = 0;
        while (true) {
            if (!it.hasNext()) {
                i8 = -1;
                break;
            }
            Ou0.c next = it.next();
            if (cVar != null && next.f18089b == cVar.f18089b) {
                break;
            }
            i8++;
        }
        if (i8 == -1) {
            BLog.e("PlaylistRandomIterator-hasPrevious", "[theseus-playlist-PlaylistRandomIterator-hasPrevious] Failed to check next, can not find playing page in current media!", (Throwable) null);
            return false;
        }
        if (i8 > 0) {
            z6 = true;
        }
        return z6;
    }
}
