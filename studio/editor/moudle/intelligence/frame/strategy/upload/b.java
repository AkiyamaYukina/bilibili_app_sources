package com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload;

import androidx.appcompat.widget.C3259x;
import com.bilibili.bangumi.logic.page.detail.service.n;
import com.bilibili.lib.videoupload.internal.r;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d;
import com.bilibili.upos.videoupload.UpOSTask;
import com.bilibili.upos.videoupload.UploadTaskInfo;
import com.bilibili.upos.videoupload.callback.DefaultUploadCallback;
import java.io.File;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/upload/b.class */
public final class b extends DefaultUploadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d.a f107335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f107336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f107338d;

    public b(d dVar, d.a aVar, File file, int i7) {
        this.f107338d = dVar;
        this.f107335a = aVar;
        this.f107336b = file;
        this.f107337c = i7;
    }

    @Override // com.bilibili.upos.videoupload.callback.DefaultUploadCallback, com.bilibili.upos.videoupload.callback.UploadCallback
    public final void onCancel(UploadTaskInfo uploadTaskInfo) {
        super.onCancel(uploadTaskInfo);
        UpOSTask upOSTask = this.f107338d.f107343b;
        if (upOSTask != null) {
            r.a(new n(upOSTask, 2));
        }
        d.a aVar = this.f107335a;
        aVar.b(2, "task onCancel", this.f107336b.getAbsolutePath());
        aVar.a();
    }

    @Override // com.bilibili.upos.videoupload.callback.DefaultUploadCallback, com.bilibili.upos.videoupload.callback.UploadCallback
    public final void onFail(UploadTaskInfo uploadTaskInfo, int i7) {
        UpOSTask upOSTask = this.f107338d.f107343b;
        if (upOSTask != null) {
            r.a(new n(upOSTask, 2));
        }
        d.a aVar = this.f107335a;
        aVar.b(2, C3259x.a(i7, "task onFail error="), this.f107336b.getAbsolutePath());
        aVar.a();
    }

    @Override // com.bilibili.upos.videoupload.callback.DefaultUploadCallback, com.bilibili.upos.videoupload.callback.UploadCallback
    public final void onSuccess(UploadTaskInfo uploadTaskInfo, String str) {
        UpOSTask upOSTask = this.f107338d.f107343b;
        if (upOSTask != null) {
            r.a(new n(upOSTask, 2));
        }
        d.a aVar = this.f107335a;
        aVar.c(this.f107337c, this.f107336b.length() / 1024, uploadTaskInfo.getUposUri());
        aVar.a();
    }
}
