package com.bilibili.ship.theseus.playlist;

import android.util.ArrayMap;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/v.class */
public final class v<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlaylistLoadService f96128a;

    public v(PlaylistLoadService playlistLoadService) {
        this.f96128a = playlistLoadService;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
        Unit unit;
        PlaylistRepository.c cVar = (PlaylistRepository.c) obj;
        boolean z6 = cVar instanceof PlaylistRepository.c.b;
        PlaylistLoadService playlistLoadService = this.f96128a;
        if (z6) {
            PlaylistRepository.c.b bVar = (PlaylistRepository.c.b) cVar;
            MultiTypeMedia multiTypeMedia = bVar.f95134a;
            int iA = (multiTypeMedia.f95236j / com.bilibili.ship.theseus.playlist.util.d.a()) + 1;
            List<MultiTypeMedia> list = playlistLoadService.h.get(Boxing.boxInt(iA));
            if (list == null) {
                unit = Unit.INSTANCE;
            } else {
                ArrayMap<Integer, List<MultiTypeMedia>> arrayMap = playlistLoadService.h;
                Integer numBoxInt = Boxing.boxInt(iA);
                List<MultiTypeMedia> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (MultiTypeMedia multiTypeMedia2 : list2) {
                    MultiTypeMedia multiTypeMediaW = multiTypeMedia2;
                    if (multiTypeMedia2.d() == multiTypeMedia.d()) {
                        multiTypeMediaW = bVar.f95135b ? multiTypeMedia2.w() : multiTypeMedia2.c();
                    }
                    arrayList.add(multiTypeMediaW);
                }
                arrayMap.put(numBoxInt, arrayList);
                unit = Unit.INSTANCE;
            }
        } else {
            if (!(cVar instanceof PlaylistRepository.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            PlaylistRepository.c.a aVar = (PlaylistRepository.c.a) cVar;
            MultiTypeMedia multiTypeMedia3 = aVar.f95132a;
            int iA2 = (multiTypeMedia3.f95236j / com.bilibili.ship.theseus.playlist.util.d.a()) + 1;
            List<MultiTypeMedia> list3 = playlistLoadService.h.get(Boxing.boxInt(iA2));
            if (list3 == null) {
                unit = Unit.INSTANCE;
            } else {
                ArrayMap<Integer, List<MultiTypeMedia>> arrayMap2 = playlistLoadService.h;
                Integer numBoxInt2 = Boxing.boxInt(iA2);
                List<MultiTypeMedia> list4 = list3;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                for (MultiTypeMedia multiTypeMedia4 : list4) {
                    MultiTypeMedia multiTypeMediaX = multiTypeMedia4;
                    if (multiTypeMedia4.d() == multiTypeMedia3.d()) {
                        multiTypeMediaX = multiTypeMedia4.x(aVar.f95133b);
                    }
                    arrayList2.add(multiTypeMediaX);
                }
                arrayMap2.put(numBoxInt2, arrayList2);
                unit = Unit.INSTANCE;
            }
        }
        return unit;
    }
}
