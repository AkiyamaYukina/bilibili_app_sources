package com.bilibili.ogv.pub.reserve;

import android.app.Application;
import androidx.collection.LongSparseArray;
import androidx.media3.common.PlaybackException;
import com.bilibili.videodownloader.model.VideoDownloadEntry;
import com.bilibili.videodownloader.model.VideoDownloadSeasonEpEntry;
import com.bilibili.videodownloader.model.progress.SeasonDownloadProgress;
import com.bilibili.videodownloader.model.progress.VideoDownloadProgress;
import com.bilibili.videodownloader.model.season.Episode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.offline.j0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveDownloadProcessor.class */
public final class VipReserveDownloadProcessor extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public AnonymousClass1.a f71660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LongSparseArray<VideoDownloadEntry<?>> f71661b = new LongSparseArray<>(0, 1, null);

    /* JADX INFO: renamed from: com.bilibili.ogv.pub.reserve.VipReserveDownloadProcessor$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveDownloadProcessor$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final VipReserveDownloadProcessor this$0;

        /* JADX INFO: renamed from: com.bilibili.ogv.pub.reserve.VipReserveDownloadProcessor$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveDownloadProcessor$1$a.class */
        public static final class a extends SJ0.a<VideoDownloadSeasonEpEntry> {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final VipReserveDownloadProcessor f71662f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(VipReserveDownloadProcessor vipReserveDownloadProcessor) {
                super((j0.c) null);
                this.f71662f = vipReserveDownloadProcessor;
            }

            public final void k() {
                this.f71662f.f71661b.clear();
            }

            public final void n() {
            }

            public final void o(ArrayList<VideoDownloadEntry<?>> arrayList) {
                Iterator<VideoDownloadEntry<?>> it = arrayList.iterator();
                while (it.hasNext()) {
                    VideoDownloadSeasonEpEntry videoDownloadSeasonEpEntry = (VideoDownloadEntry) it.next();
                    if (videoDownloadSeasonEpEntry instanceof VideoDownloadSeasonEpEntry) {
                        this.f71662f.f71661b.put(videoDownloadSeasonEpEntry.v.e, videoDownloadSeasonEpEntry);
                    }
                }
            }

            public final void p(VideoDownloadEntry<?> videoDownloadEntry) {
                if (videoDownloadEntry instanceof VideoDownloadSeasonEpEntry) {
                    this.f71662f.f71661b.put(((VideoDownloadSeasonEpEntry) videoDownloadEntry).v.e, videoDownloadEntry);
                }
            }

            public final VideoDownloadEntry r(VideoDownloadProgress videoDownloadProgress) {
                VideoDownloadSeasonEpEntry videoDownloadSeasonEpEntry;
                if (videoDownloadProgress instanceof SeasonDownloadProgress) {
                    SeasonDownloadProgress seasonDownloadProgress = (SeasonDownloadProgress) videoDownloadProgress;
                    long j7 = seasonDownloadProgress.r;
                    VideoDownloadSeasonEpEntry videoDownloadSeasonEpEntry2 = this.f71662f.f71661b.get(j7);
                    videoDownloadSeasonEpEntry = videoDownloadSeasonEpEntry2;
                    if (videoDownloadSeasonEpEntry2 != null) {
                        videoDownloadSeasonEpEntry2.U(seasonDownloadProgress);
                        videoDownloadSeasonEpEntry = videoDownloadSeasonEpEntry2;
                        if (videoDownloadSeasonEpEntry2.D()) {
                            this.f71662f.f71661b.delete(j7);
                            videoDownloadSeasonEpEntry = videoDownloadSeasonEpEntry2;
                        }
                    }
                } else {
                    videoDownloadSeasonEpEntry = null;
                }
                return videoDownloadSeasonEpEntry;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VipReserveDownloadProcessor vipReserveDownloadProcessor, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = vipReserveDownloadProcessor;
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
            VipReserveDownloadProcessor vipReserveDownloadProcessor = this.this$0;
            vipReserveDownloadProcessor.f71660a = new a(vipReserveDownloadProcessor);
            VipReserveDownloadProcessor vipReserveDownloadProcessor2 = this.this$0;
            Application application = Aj0.a.f317a;
            a aVar = vipReserveDownloadProcessor2.f71660a;
            if (aVar != null && !((SJ0.a) aVar).b) {
                aVar.h(application);
            }
            return Unit.INSTANCE;
        }
    }

    public VipReserveDownloadProcessor(@NotNull CoroutineScope coroutineScope) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.ogv.pub.reserve.a
    @Nullable
    public final Object a(@NotNull List list, int i7, boolean z6, @NotNull Continuation continuation) {
        String str;
        int i8;
        int i9;
        boolean z7;
        Dimension dimension;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ReserveEpisode reserveEpisode = ((l) it.next()).f71683f;
                String str2 = reserveEpisode != null ? reserveEpisode.f71629b : null;
                if (str2 != null) {
                    str = str2;
                    if (str2.length() != 0) {
                        break;
                    }
                }
            }
            str = "";
        } else {
            str = "";
        }
        ArrayList<VideoDownloadSeasonEpEntry> arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            l lVar = (l) it2.next();
            ReserveEpisode reserveEpisode2 = lVar.f71683f;
            if (reserveEpisode2 == null || (dimension = reserveEpisode2.f71635i) == null) {
                i8 = 0;
                i9 = 0;
                z7 = false;
            } else {
                i8 = dimension.f71624a;
                i9 = dimension.f71625b;
                z7 = dimension.f71626c;
            }
            if (reserveEpisode2 != null) {
                int i10 = reserveEpisode2.f71633f;
                VideoDownloadSeasonEpEntry videoDownloadSeasonEpEntry = new VideoDownloadSeasonEpEntry(String.valueOf(lVar.f71685i), lVar.f71686j, new Episode(reserveEpisode2.a(), reserveEpisode2.f71629b, Long.valueOf(reserveEpisode2.f71630c), lVar.f71679b, reserveEpisode2.f71631d, reserveEpisode2.f71632e - 1, reserveEpisode2.f71634g, reserveEpisode2.h, lVar.h, i8, i9, z7 ? 1 : 0, reserveEpisode2.f71636j, reserveEpisode2.f71637k, (i10 * PlaybackException.CUSTOM_ERROR_CODE_BASE) + r0));
                ((VideoDownloadEntry) videoDownloadSeasonEpEntry).mPreferredVideoQuality = lVar.f71684g;
                ((VideoDownloadEntry) videoDownloadSeasonEpEntry).i = i7;
                ((VideoDownloadEntry) videoDownloadSeasonEpEntry).mCover = str;
                arrayList.add(videoDownloadSeasonEpEntry);
            }
        }
        if (list.size() > 100) {
            Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new VipReserveDownloadProcessor$realDownload$2(this, arrayList, z6, null), continuation);
            return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
        }
        for (VideoDownloadSeasonEpEntry videoDownloadSeasonEpEntry2 : arrayList) {
            AnonymousClass1.a aVar = this.f71660a;
            if (aVar != null) {
                aVar.j(videoDownloadSeasonEpEntry2, z6);
            }
        }
        return Unit.INSTANCE;
    }
}
