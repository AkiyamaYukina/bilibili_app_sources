package com.bilibili.studio.upper.publish;

import com.bilibili.lib.videoupload.UploadSubStatus;
import com.bilibili.studio.upper.publish.model.ArchiveCheckStatus;
import og0.C8213a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sg0.C8591d;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/g.class */
public final class g extends C8213a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IA0.b f108680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f108681b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/publish/g$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f108682a;

        static {
            int[] iArr = new int[UploadSubStatus.values().length];
            try {
                iArr[UploadSubStatus.STATUS_WAITING.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[UploadSubStatus.STATUS_LOW_SPEED.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f108682a = iArr;
        }
    }

    public g(@NotNull IA0.b bVar, @NotNull c cVar) {
        this.f108680a = bVar;
        this.f108681b = cVar;
        com.bilibili.studio.upper.broadcast.b.b(new f(this));
    }

    @Override // og0.C8213a, og0.f
    public final void a(@Nullable ng0.g gVar) {
        synchronized (this) {
            BLog.d("PublishDynamicObserverCallback", "PUBLISH_DEBUG, onCancel, id: " + gVar.f124196a + ", progress: " + gVar.p());
            this.f108681b.invoke(Long.valueOf(gVar.f124196a), UploadConfig$Status.UPLOAD_CANCEL);
            IA0.b bVar = this.f108680a;
            bVar.f10090a.remove(IA0.b.c(String.valueOf(gVar.f124196a)));
            bVar.d();
        }
    }

    @Override // og0.f
    public final void c(@Nullable ng0.g gVar) {
        if (gVar == null) {
            return;
        }
        BLog.d("PublishDynamicObserverCallback", "PUBLISH_DEBUG, onPending, id: " + gVar.f124196a + ", progress: " + gVar.p());
        this.f108680a.e(String.valueOf(gVar.f124196a), ArchiveCheckStatus.uploading);
        this.f108681b.invoke(Long.valueOf(gVar.f124196a), UploadConfig$Status.UPLOAD_PROGRESS);
    }

    @Override // og0.C8213a, og0.f
    public final void d(@Nullable ng0.g gVar, @Nullable UploadSubStatus uploadSubStatus, @NotNull C8591d c8591d) {
        int i7 = uploadSubStatus == null ? -1 : a.f108682a[uploadSubStatus.ordinal()];
        c cVar = this.f108681b;
        IA0.b bVar = this.f108680a;
        if (i7 == 1) {
            bVar.e(String.valueOf(gVar.f124196a), ArchiveCheckStatus.uploadWaitingNetConnect);
            cVar.invoke(Long.valueOf(gVar.f124196a), UploadConfig$Status.UPLOAD_PROGRESS);
            return;
        }
        if (i7 == 2) {
            bVar.e(String.valueOf(gVar.f124196a), ArchiveCheckStatus.uploadSpeedSlowly);
            cVar.invoke(Long.valueOf(gVar.f124196a), UploadConfig$Status.UPLOAD_PROGRESS);
            return;
        }
        String strValueOf = String.valueOf(gVar.f124196a);
        float fP = gVar.p();
        IA0.a aVarA = bVar.a(strValueOf);
        if (aVarA != null) {
            aVarA.f10088e = fP;
        }
        IA0.a aVarA2 = bVar.a(strValueOf);
        if (aVarA2 != null) {
            aVarA2.f10087d = ArchiveCheckStatus.uploading;
        }
        bVar.d();
        cVar.invoke(Long.valueOf(gVar.f124196a), UploadConfig$Status.UPLOAD_PROGRESS);
    }

    @Override // og0.C8213a, og0.f
    public final void e(@Nullable ng0.g gVar) {
        synchronized (this) {
            if (gVar == null) {
                return;
            }
            BLog.d("PublishDynamicObserverCallback", "PUBLISH_DEBUG, onPause, id: " + gVar.f124196a + ", progress: " + gVar.p());
            this.f108680a.e(String.valueOf(gVar.f124196a), ArchiveCheckStatus.uploadPaused);
            this.f108681b.invoke(Long.valueOf(gVar.f124196a), UploadConfig$Status.UPLOAD_PAUSE);
        }
    }

    @Override // og0.C8213a, og0.f
    public final void g(@Nullable ng0.g gVar, long j7, long j8) {
    }

    @Override // og0.C8213a, og0.f
    public final void i(@Nullable ng0.g gVar, @Nullable String str) {
        synchronized (this) {
            if (gVar == null) {
                return;
            }
            BLog.d("PublishDynamicObserverCallback", "PUBLISH_DEBUG, onSuccess, id: " + gVar.f124196a + ", cid: " + gVar.e() + ", progress: " + gVar.p());
            IA0.a aVarA = this.f108680a.a(String.valueOf(gVar.f124196a));
            if (aVarA != null) {
                aVarA.f10086c = gVar.e();
            }
            this.f108680a.e(String.valueOf(gVar.f124196a), ArchiveCheckStatus.uploadFinished);
            this.f108681b.invoke(Long.valueOf(gVar.f124196a), UploadConfig$Status.UPLOAD_SUCCESS);
        }
    }

    @Override // og0.C8213a, og0.f
    public final void k(int i7, @Nullable ng0.g gVar) {
        synchronized (this) {
            if (gVar == null) {
                return;
            }
            BLog.d("PublishDynamicObserverCallback", "PUBLISH_DEBUG, onFail, id: " + gVar.f124196a + ", progress: " + gVar.p() + ", error: " + i7);
            IA0.b bVar = this.f108680a;
            long j7 = gVar.f124196a;
            ArchiveCheckStatus archiveCheckStatus = ArchiveCheckStatus.uploadError;
            gVar.w();
            IA0.a aVarA = bVar.a(String.valueOf(j7));
            if (aVarA != null) {
                aVarA.f10087d = archiveCheckStatus;
            }
            bVar.d();
            this.f108681b.invoke(Long.valueOf(gVar.f124196a), UploadConfig$Status.UPLOAD_FAILED);
        }
    }

    @Override // og0.C8213a, og0.f
    public final void l(@Nullable ng0.g gVar) {
    }

    @Override // og0.C8213a, og0.f
    public final void m(@Nullable ng0.g gVar, float f7) {
        synchronized (this) {
            BLog.d("PublishDynamicObserverCallback", "PUBLISH_DEBUG, onProgress, id: " + gVar.f124196a + ", progress: " + f7);
            IA0.b bVar = this.f108680a;
            String strValueOf = String.valueOf(gVar.f124196a);
            IA0.a aVarA = bVar.a(strValueOf);
            if (aVarA != null) {
                aVarA.f10088e = f7;
            }
            IA0.a aVarA2 = bVar.a(strValueOf);
            if (aVarA2 != null) {
                aVarA2.f10087d = ArchiveCheckStatus.uploading;
            }
            bVar.d();
            this.f108681b.invoke(Long.valueOf(gVar.f124196a), UploadConfig$Status.UPLOAD_PROGRESS);
        }
    }

    @Override // og0.C8213a, og0.f
    public final void n(@Nullable ng0.g gVar) {
    }
}
