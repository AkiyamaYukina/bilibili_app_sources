package com.bilibili.ship.theseus.playlist.selector;

import com.bilibili.app.authorspace.ui.pages.p;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import com.bilibili.ship.theseus.playlist.selector.k;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorService$showSelectorList$2$component$1.class */
public final class PlaylistSelectorService$showSelectorList$2$component$1 extends SuspendLambda implements Function2<List<? extends MultiTypeMedia>, Continuation<? super List<k.d.b>>, Object> {
    Object L$0;
    int label;
    final PlaylistSelectorService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistSelectorService$showSelectorList$2$component$1(PlaylistSelectorService playlistSelectorService, Continuation<? super PlaylistSelectorService$showSelectorList$2$component$1> continuation) {
        super(2, continuation);
        this.this$0 = playlistSelectorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$0(PlaylistSelectorService playlistSelectorService, MultiTypeMedia multiTypeMedia) {
        PlaylistRepository playlistRepository = playlistSelectorService.f95837b;
        PageReportService.i(playlistSelectorService.f95842g, "player.player.option-episode.playlist-video-card-show.player", MapsKt.mapOf(new Pair[]{TuplesKt.to("playlist_sort_type", playlistRepository.f().reportValue()), p.a(multiTypeMedia.f95226N, 1, "playlist_video_sort"), TuplesKt.to("playlist_id", String.valueOf(playlistRepository.f95085H)), TuplesKt.to("playlist_type", String.valueOf(playlistRepository.f95087J))}), 4);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistSelectorService$showSelectorList$2$component$1 playlistSelectorService$showSelectorList$2$component$1 = new PlaylistSelectorService$showSelectorList$2$component$1(this.this$0, continuation);
        playlistSelectorService$showSelectorList$2$component$1.L$0 = obj;
        return playlistSelectorService$showSelectorList$2$component$1;
    }

    public final Object invoke(List<MultiTypeMedia> list, Continuation<? super List<k.d.b>> continuation) {
        return create(list, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List list = (List) this.L$0;
        BLog.i("PlaylistSelectorService$showSelectorList$2$component$1-invokeSuspend", "[theseus-playlist-PlaylistSelectorService$showSelectorList$2$component$1-invokeSuspend] list changed");
        ArrayList arrayList = new ArrayList();
        PlaylistInfo playlistInfoE = this.this$0.f95837b.e();
        MultiTypeMedia multiTypeMedia = (MultiTypeMedia) CollectionsKt.firstOrNull(list);
        if (multiTypeMedia != null && multiTypeMedia.f95236j == 0) {
            arrayList.add(new k.d.b(new k.d.a(playlistInfoE.f95281n, playlistInfoE.f95279l), 3, -1L, null));
        }
        List<MultiTypeMedia> list2 = list;
        final PlaylistSelectorService playlistSelectorService = this.this$0;
        for (final MultiTypeMedia multiTypeMedia2 : list2) {
            if (!multiTypeMedia2.s()) {
                arrayList.add(new k.d.b(multiTypeMedia2, 1, multiTypeMedia2.f95235i, new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new Function0(playlistSelectorService, multiTypeMedia2) { // from class: com.bilibili.ship.theseus.playlist.selector.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PlaylistSelectorService f95871a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final MultiTypeMedia f95872b;

                    {
                        this.f95871a = playlistSelectorService;
                        this.f95872b = multiTypeMedia2;
                    }

                    public final Object invoke() {
                        return PlaylistSelectorService$showSelectorList$2$component$1.invokeSuspend$lambda$0$0(this.f95871a, this.f95872b);
                    }
                })));
                if (multiTypeMedia2.f95250x) {
                    List<Ou0.c> list3 = multiTypeMedia2.f95225M;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    for (Ou0.c cVar : list3) {
                        arrayList2.add(new k.d.b(cVar, 2, cVar.f18089b, null));
                    }
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }
}
