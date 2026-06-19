package com.bilibili.studio.videoeditor.download;

import UB0.c;
import UB0.g;
import UB0.l;
import UB0.n;
import com.bilibili.studio.videoeditor.download.BiliEditorDownloaderReport;
import com.bilibili.upper.module.honour.utils.d;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/download/b.class */
public final class b implements l {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/download/b$a.class */
    public final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final d f109447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f109448b = System.currentTimeMillis();

        public a(@Nullable d dVar) {
            this.f109447a = dVar;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // UB0.c
        public final void J(long j7) throws NoWhenBranchMatchedException {
            Map<Long, DownloadRequest> map = BiliEditorDownloaderReport.f109432a;
            BiliEditorDownloaderReport.a(j7, BiliEditorDownloaderReport.DownloadType.OLD, BiliEditorDownloaderReport.DownloadState.CANCEL, null, 0L);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // UB0.c
        public final void a(long j7) throws NoWhenBranchMatchedException {
            this.f109448b = System.currentTimeMillis();
            Map<Long, DownloadRequest> map = BiliEditorDownloaderReport.f109432a;
            BiliEditorDownloaderReport.a(j7, BiliEditorDownloaderReport.DownloadType.OLD, BiliEditorDownloaderReport.DownloadState.START, null, 0L);
        }

        @Override // UB0.c
        public final void b(long j7) {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // UB0.c
        public final void c(long j7, long j8, long j9, @Nullable String str) throws NoWhenBranchMatchedException {
            this.f109447a.c(j7, j8, j9, str);
            Map<Long, DownloadRequest> map = BiliEditorDownloaderReport.f109432a;
            BiliEditorDownloaderReport.a(j7, BiliEditorDownloaderReport.DownloadType.OLD, BiliEditorDownloaderReport.DownloadState.FAIL, str, 0L);
        }

        @Override // UB0.c
        public final void d(long j7, float f7, long j8, long j9, int i7) {
        }

        @Override // UB0.c
        public final void e(long j7, long j8, long j9) {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // UB0.c
        public final void f(long j7, @Nullable String str, @Nullable String str2) throws NoWhenBranchMatchedException {
            this.f109447a.f(j7, str, str2);
            Map<Long, DownloadRequest> map = BiliEditorDownloaderReport.f109432a;
            BiliEditorDownloaderReport.a(j7, BiliEditorDownloaderReport.DownloadType.OLD, BiliEditorDownloaderReport.DownloadState.SUCCESS, null, System.currentTimeMillis() - this.f109448b);
        }
    }

    @Override // UB0.l
    public final void a(@NotNull DownloadRequest downloadRequest, @Nullable d dVar) {
        UB0.b.a(downloadRequest, new a(dVar));
        BiliEditorDownloaderReport.f109432a.put(Long.valueOf(downloadRequest.taskId), downloadRequest);
    }

    @Override // UB0.l
    public final void b(long j7) {
        UB0.b.f(j7);
    }

    @Override // UB0.l
    public final void c(long j7) {
        g gVarA = n.a(j7);
        if (gVarA != null) {
            gVarA.f24597a.f24608e = 7;
        }
    }
}
