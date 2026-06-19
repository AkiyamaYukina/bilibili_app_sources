package com.bilibili.studio.videoeditor.download;

import UB0.c;
import UB0.l;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.okdownloader.BiliDownloader;
import com.bilibili.lib.okdownloader.Dispatchers;
import com.bilibili.lib.okdownloader.DownloadListener;
import com.bilibili.lib.okdownloader.Task;
import com.bilibili.studio.videoeditor.download.BiliEditorDownloaderReport;
import com.bilibili.upper.module.honour.utils.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/download/a.class */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, Long> f109441a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<Task> f109442b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<Task, C1207a> f109443c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.bilibili.studio.videoeditor.download.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/download/a$a.class */
    public final class C1207a implements DownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final List<c> f109444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f109445b = System.currentTimeMillis();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f109446c;

        public C1207a(@Nullable a aVar, List<c> list) {
            this.f109446c = aVar;
            this.f109444a = list;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final void onCancel(@NotNull String str) throws NoWhenBranchMatchedException {
            a aVar = this.f109446c;
            Long lD = a.d(aVar, str);
            if (lD != null) {
                long jLongValue = lD.longValue();
                List<c> list = this.f109444a;
                if (list != null) {
                    for (c cVar : list) {
                        if (cVar != null) {
                            cVar.J(jLongValue);
                        }
                    }
                }
                Map<Long, DownloadRequest> map = BiliEditorDownloaderReport.f109432a;
                BiliEditorDownloaderReport.a(jLongValue, BiliEditorDownloaderReport.DownloadType.NEW, BiliEditorDownloaderReport.DownloadState.CANCEL, null, 0L);
                Task taskE = aVar.e(jLongValue);
                if (taskE != null) {
                    aVar.f109442b.remove(taskE);
                }
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final void onError(@NotNull String str, @Nullable List<Integer> list, long j7, long j8) throws NoWhenBranchMatchedException {
            a aVar = this.f109446c;
            Long lD = a.d(aVar, str);
            if (lD != null) {
                long jLongValue = lD.longValue();
                List<c> list2 = this.f109444a;
                if (list2 != null) {
                    for (c cVar : list2) {
                        if (cVar != null) {
                            cVar.c(jLongValue, j7, j8, "");
                        }
                    }
                }
                Map<Long, DownloadRequest> map = BiliEditorDownloaderReport.f109432a;
                BiliEditorDownloaderReport.a(jLongValue, BiliEditorDownloaderReport.DownloadType.NEW, BiliEditorDownloaderReport.DownloadState.FAIL, null, 0L);
                Task taskE = aVar.e(jLongValue);
                if (taskE != null) {
                    aVar.f109442b.remove(taskE);
                }
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final void onFinish(@NotNull String str, @Nullable String str2, @Nullable String str3) throws NoWhenBranchMatchedException {
            a aVar = this.f109446c;
            Long lD = a.d(aVar, str);
            if (lD != null) {
                long jLongValue = lD.longValue();
                List<c> list = this.f109444a;
                if (list != null) {
                    for (c cVar : list) {
                        if (cVar != null) {
                            cVar.f(jLongValue, str2, str3);
                        }
                    }
                }
                Map<Long, DownloadRequest> map = BiliEditorDownloaderReport.f109432a;
                BiliEditorDownloaderReport.a(jLongValue, BiliEditorDownloaderReport.DownloadType.NEW, BiliEditorDownloaderReport.DownloadState.SUCCESS, null, System.currentTimeMillis() - this.f109445b);
                Task taskE = aVar.e(jLongValue);
                if (taskE != null) {
                    aVar.f109442b.remove(taskE);
                }
            }
        }

        public final void onLoading(@NotNull String str, long j7, long j8, long j9, int i7) {
            Long lD = a.d(this.f109446c, str);
            if (lD != null) {
                long jLongValue = lD.longValue();
                List<c> list = this.f109444a;
                if (list != null) {
                    for (c cVar : list) {
                        if (cVar != null) {
                            cVar.d(jLongValue, j7, j8, j9, i7);
                        }
                    }
                }
            }
        }

        public final void onPause(@NotNull String str, long j7, long j8) {
            Long lD = a.d(this.f109446c, str);
            if (lD != null) {
                long jLongValue = lD.longValue();
                List<c> list = this.f109444a;
                if (list != null) {
                    for (c cVar : list) {
                        if (cVar != null) {
                            cVar.e(jLongValue, j7, j8);
                        }
                    }
                }
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final void onStart(@NotNull String str) throws NoWhenBranchMatchedException {
            Long lD = a.d(this.f109446c, str);
            if (lD != null) {
                long jLongValue = lD.longValue();
                List<c> list = this.f109444a;
                if (list != null) {
                    for (c cVar : list) {
                        if (cVar != null) {
                            cVar.a(jLongValue);
                        }
                    }
                }
                this.f109445b = System.currentTimeMillis();
                Map<Long, DownloadRequest> map = BiliEditorDownloaderReport.f109432a;
                BiliEditorDownloaderReport.a(jLongValue, BiliEditorDownloaderReport.DownloadType.NEW, BiliEditorDownloaderReport.DownloadState.START, null, 0L);
            }
        }
    }

    public static final Long d(a aVar, String str) {
        Object next;
        Iterator it = MapsKt.toList(aVar.f109441a).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Pair) next).getFirst(), str)) {
                break;
            }
        }
        Pair pair = (Pair) next;
        Long l7 = null;
        if (pair != null) {
            l7 = (Long) pair.getSecond();
        }
        return l7;
    }

    @Override // UB0.l
    public final void a(@NotNull DownloadRequest downloadRequest, @Nullable d dVar) {
        Task taskBuild;
        synchronized (this) {
            C1207a c1207a = new C1207a(this, CollectionsKt.mutableListOf(new c[]{dVar}));
            taskBuild = BiliDownloader.Companion.get(FoundationAlias.getFapp().getApplicationContext()).create(downloadRequest.url).into(downloadRequest.dir).fileName(downloadRequest.fileName).callbackOn(Dispatchers.UNCONFINED).retryTime(6).tag(downloadRequest.trackFrom).disallowPersistent().addListener(c1207a).build();
            downloadRequest.taskId2 = taskBuild.getTaskId();
            this.f109443c.put(taskBuild, c1207a);
            this.f109441a.put(downloadRequest.taskId2, Long.valueOf(downloadRequest.taskId));
        }
        this.f109442b.add(taskBuild);
        BiliEditorDownloaderReport.f109432a.put(Long.valueOf(downloadRequest.taskId), downloadRequest);
    }

    @Override // UB0.l
    public final void b(long j7) {
        Task taskE = e(j7);
        if (taskE != null) {
            taskE.enqueue();
        }
    }

    @Override // UB0.l
    public final void c(long j7) {
        ConcurrentHashMap<String, Long> concurrentHashMap = this.f109441a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Long> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue().longValue() == j7) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            BiliDownloader.Companion.getInstance(FoundationAlias.getFapp().getApplicationContext()).cancel((String) ((Map.Entry) it.next()).getKey());
        }
    }

    public final Task e(long j7) {
        Object next;
        Task next2;
        Iterator it = MapsKt.toList(this.f109441a).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Number) ((Pair) next).getSecond()).longValue() == j7) {
                break;
            }
        }
        Pair pair = (Pair) next;
        String str = pair != null ? (String) pair.getFirst() : null;
        if (str == null) {
            return null;
        }
        Iterator<Task> it2 = this.f109442b.iterator();
        do {
            next2 = null;
            if (!it2.hasNext()) {
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.areEqual(next2.getTaskId(), str));
        return next2;
    }
}
