package com.bilibili.ship.theseus.playlist;

import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.uicomponent.D;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$initPlaylist$component$2.class */
final class PlaylistService$initPlaylist$component$2 extends SuspendLambda implements Function2<List<? extends MultiTypeMedia>, Continuation<? super List<D.g.b>>, Object> {
    Object L$0;
    int label;
    final E this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistService$initPlaylist$component$2(E e7, Continuation<? super PlaylistService$initPlaylist$component$2> continuation) {
        super(2, continuation);
        this.this$0 = e7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$0(E e7, MultiTypeMedia multiTypeMedia) {
        e7.getClass();
        PageReportService.i(e7.f94943l, "united.player-video-detail.playlist-video-card.0.show", MapsKt.mapOf(TuplesKt.to("playlist_video_sort", String.valueOf(multiTypeMedia.f95226N + 1))), 4);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistService$initPlaylist$component$2 playlistService$initPlaylist$component$2 = new PlaylistService$initPlaylist$component$2(this.this$0, continuation);
        playlistService$initPlaylist$component$2.L$0 = obj;
        return playlistService$initPlaylist$component$2;
    }

    public final Object invoke(List<MultiTypeMedia> list, Continuation<? super List<D.g.b>> continuation) {
        return create(list, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List list = (List) this.L$0;
        BLog.i("PlaylistService$initPlaylist$component$2-invokeSuspend", "[theseus-playlist-PlaylistService$initPlaylist$component$2-invokeSuspend] list changed");
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        final E e7 = this.this$0;
        int i7 = 0;
        for (Object obj2 : list2) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final MultiTypeMedia multiTypeMedia = (MultiTypeMedia) obj2;
            if (!multiTypeMedia.s()) {
                if (multiTypeMedia.f95227O == null) {
                    multiTypeMedia.f95226N = i7;
                    multiTypeMedia.f95227O = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new Function0(e7, multiTypeMedia) { // from class: com.bilibili.ship.theseus.playlist.M

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final E f94980a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final MultiTypeMedia f94981b;

                        {
                            this.f94980a = e7;
                            this.f94981b = multiTypeMedia;
                        }

                        public final Object invoke() {
                            return PlaylistService$initPlaylist$component$2.invokeSuspend$lambda$0$0(this.f94980a, this.f94981b);
                        }
                    });
                }
                arrayList.add(new D.g.b(multiTypeMedia, 1));
                if (multiTypeMedia.f95250x) {
                    List<Ou0.c> list3 = multiTypeMedia.f95225M;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new D.g.b((Ou0.c) it.next(), 2));
                    }
                    arrayList.addAll(arrayList2);
                }
            }
            i7++;
        }
        return arrayList;
    }
}
