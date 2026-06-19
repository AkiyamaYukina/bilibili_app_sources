package com.bilibili.ship.theseus.ogv.intro.download.service;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.download.ui.e0;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.united.bean.VideoDimension;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.videodownloader.model.VideoDownloadEntry;
import com.bilibili.videodownloader.model.VideoDownloadSeasonEpEntry;
import com.bilibili.videodownloader.model.season.Episode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.ui.offline.j0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/e.class */
@StabilityInferred(parameters = 0)
public final class e extends SJ0.a<VideoDownloadSeasonEpEntry> implements d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final HashMap<String, LongSparseArray<VideoDownloadEntry<?>>> f92404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayList<String> f92405g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<c> f92406i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/e$a.class */
    public static final class a implements SJ0.b<VideoDownloadSeasonEpEntry> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f92407a;

        public a(e eVar) {
            this.f92407a = eVar;
        }

        public final void a() {
        }

        public final void b(List<VideoDownloadSeasonEpEntry> list) {
            Object value;
            HashMap<String, LongSparseArray<b>> map;
            MutableStateFlow<c> mutableStateFlow = this.f92407a.f92406i;
            do {
                value = mutableStateFlow.getValue();
                map = ((c) value).f92403a;
                for (VideoDownloadSeasonEpEntry videoDownloadSeasonEpEntry : list) {
                    String strQ = videoDownloadSeasonEpEntry.Q();
                    long j7 = videoDownloadSeasonEpEntry.v.e;
                    b bVar = new b(strQ, j7, videoDownloadSeasonEpEntry.G() ? e0.d.f92553a : videoDownloadSeasonEpEntry.r() ? e0.a.f92550a : ((VideoDownloadEntry) videoDownloadSeasonEpEntry).g != 0 ? e0.b.f92551a : new e0.c(videoDownloadSeasonEpEntry.j()));
                    if (!map.containsKey(strQ)) {
                        map.put(strQ, new LongSparseArray<>(0, 1, null));
                    }
                    LongSparseArray<b> longSparseArray = map.get(strQ);
                    if (longSparseArray != null) {
                        longSparseArray.put(j7, bVar);
                    }
                }
            } while (!mutableStateFlow.compareAndSet(value, new c(map)));
        }
    }

    public e() {
        super((j0.c) null);
        this.f92404f = new HashMap<>();
        this.f92405g = new ArrayList<>();
        this.f92406i = StateFlowKt.MutableStateFlow(new c(0));
        ((SJ0.a) this).e = new a(this);
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.download.service.d
    @NotNull
    public final StateFlow<c> a() {
        return FlowKt.asStateFlow(this.f92406i);
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.download.service.d
    public final void d(@NotNull String str) {
        if (this.f92405g.contains(str) || str.length() <= 0) {
            return;
        }
        this.f92405g.add(str);
        if (this.h) {
            s(str);
        }
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.download.service.d
    public final boolean e() {
        return this.h;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.download.service.d
    public final void g(@NotNull List<com.bilibili.ship.theseus.ogv.intro.download.service.a> list) {
        for (com.bilibili.ship.theseus.ogv.intro.download.service.a aVar : list) {
            String str = aVar.f92393a;
            OgvEpisode ogvEpisode = aVar.f92396d;
            long j7 = ogvEpisode.f93557c;
            int i7 = ogvEpisode.f93556b;
            long j8 = i7;
            VideoDimension videoDimension = ogvEpisode.f93546B;
            int i8 = videoDimension.f98734a;
            int i9 = videoDimension.f98735b;
            VideoDownloadSeasonEpEntry videoDownloadSeasonEpEntry = new VideoDownloadSeasonEpEntry(str, aVar.f92394b, new Episode(ogvEpisode.a(), ogvEpisode.f93562i, Long.valueOf(ogvEpisode.f93561g), ogvEpisode.f93555a, ogvEpisode.f93563j, i7 - 1, ogvEpisode.f93564k, ogvEpisode.h, aVar.f92395c.f71782a, i8, i9, 0, ogvEpisode.f93575v, ogvEpisode.f93576w, (j7 * TransitionInfo.DEFAULT_DURATION) + j8));
            ((VideoDownloadEntry) videoDownloadSeasonEpEntry).mPreferredVideoQuality = aVar.f92397e;
            ((VideoDownloadEntry) videoDownloadSeasonEpEntry).i = aVar.f92399g;
            ((VideoDownloadEntry) videoDownloadSeasonEpEntry).mCover = aVar.h;
            ((VideoDownloadEntry) videoDownloadSeasonEpEntry).mPreferredAudioQuality = aVar.f92398f ? 1 : 0;
            j(videoDownloadSeasonEpEntry, true);
        }
    }

    public final void k() {
        this.f92404f.clear();
    }

    public final void n() {
        this.h = true;
        Iterator<String> it = this.f92405g.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
    }

    public final void o(@NotNull ArrayList<VideoDownloadEntry<?>> arrayList) {
        for (VideoDownloadEntry<?> videoDownloadEntry : arrayList) {
            if (videoDownloadEntry instanceof VideoDownloadSeasonEpEntry) {
                VideoDownloadSeasonEpEntry videoDownloadSeasonEpEntry = (VideoDownloadSeasonEpEntry) videoDownloadEntry;
                String str = videoDownloadSeasonEpEntry.mSeasonId;
                if (str == null) {
                    return;
                }
                if (this.f92405g.contains(str)) {
                    if (!this.f92404f.containsKey(str)) {
                        this.f92404f.put(str, new LongSparseArray<>(0, 1, null));
                    }
                    this.f92404f.get(str).put(videoDownloadSeasonEpEntry.v.e, videoDownloadEntry);
                }
            }
        }
        SJ0.b bVar = ((SJ0.a) this).e;
        if (bVar != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                VideoDownloadSeasonEpEntry videoDownloadSeasonEpEntry2 = (VideoDownloadEntry) it.next();
                VideoDownloadSeasonEpEntry videoDownloadSeasonEpEntry3 = videoDownloadSeasonEpEntry2 instanceof VideoDownloadSeasonEpEntry ? videoDownloadSeasonEpEntry2 : null;
                if (videoDownloadSeasonEpEntry3 != null) {
                    arrayList2.add(videoDownloadSeasonEpEntry3);
                }
            }
            bVar.b(arrayList2);
        }
    }

    public final void p(@NotNull VideoDownloadEntry<?> videoDownloadEntry) {
        VideoDownloadSeasonEpEntry videoDownloadSeasonEpEntry;
        String str;
        if ((videoDownloadEntry instanceof VideoDownloadSeasonEpEntry) && (str = (videoDownloadSeasonEpEntry = (VideoDownloadSeasonEpEntry) videoDownloadEntry).mSeasonId) != null && this.f92405g.contains(str)) {
            if (!this.f92404f.containsKey(str)) {
                this.f92404f.put(str, new LongSparseArray<>(0, 1, null));
            }
            this.f92404f.get(str).put(videoDownloadSeasonEpEntry.v.e, videoDownloadEntry);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.videodownloader.model.VideoDownloadEntry r(com.bilibili.videodownloader.model.progress.VideoDownloadProgress r5) {
        /*
            r4 = this;
            r0 = r5
            boolean r0 = r0 instanceof com.bilibili.videodownloader.model.progress.SeasonDownloadProgress
            if (r0 == 0) goto L67
            r0 = r5
            com.bilibili.videodownloader.model.progress.SeasonDownloadProgress r0 = (com.bilibili.videodownloader.model.progress.SeasonDownloadProgress) r0
            r9 = r0
            r0 = r9
            java.lang.String r0 = r0.q
            r5 = r0
            r0 = r9
            long r0 = r0.r
            r6 = r0
            r0 = r4
            java.util.ArrayList<java.lang.String> r0 = r0.f92405g
            r1 = r5
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L67
            r0 = r4
            java.util.HashMap<java.lang.String, androidx.collection.LongSparseArray<com.bilibili.videodownloader.model.VideoDownloadEntry<?>>> r0 = r0.f92404f
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            androidx.collection.LongSparseArray r0 = (androidx.collection.LongSparseArray) r0
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L67
            r0 = r10
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            com.bilibili.videodownloader.model.VideoDownloadSeasonEpEntry r0 = (com.bilibili.videodownloader.model.VideoDownloadSeasonEpEntry) r0
            r8 = r0
            r0 = r8
            r5 = r0
            r0 = r8
            if (r0 == 0) goto L69
            r0 = r8
            r1 = r9
            r0.U(r1)
            r0 = r8
            r5 = r0
            r0 = r8
            boolean r0 = r0.D()
            if (r0 == 0) goto L69
            r0 = r10
            r1 = r6
            r0.remove(r1)
            r0 = r8
            r5 = r0
            goto L69
        L67:
            r0 = 0
            r5 = r0
        L69:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.service.e.r(com.bilibili.videodownloader.model.progress.VideoDownloadProgress):com.bilibili.videodownloader.model.VideoDownloadEntry");
    }

    public final void s(@NotNull String str) {
        if (!this.f92405g.contains(str) && str.length() > 0) {
            this.f92405g.add(str);
        }
        Messenger messenger = ((SJ0.a) this).c;
        if (messenger == null) {
            return;
        }
        try {
            Message messageObtain = Message.obtain(null, 1013, 2, 0);
            messageObtain.getData().putString("entry_key", str);
            messageObtain.replyTo = ((SJ0.a) this).d;
            messenger.send(messageObtain);
        } catch (RemoteException e7) {
            iK0.a.e(e7);
        }
    }
}
