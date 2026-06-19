package com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C3259x;
import com.bilibili.lib.fileupload.bean.FileUploadInfo;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d;
import java.io.File;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/upload/c.class */
public final class c extends M90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d.a f107339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f107340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107341c;

    public c(int i7, d.a aVar, File file) {
        this.f107339a = aVar;
        this.f107340b = file;
        this.f107341c = i7;
    }

    public final void onCancel(@Nullable FileUploadInfo fileUploadInfo) {
        super.onCancel(fileUploadInfo);
        d.a aVar = this.f107339a;
        if (aVar != null) {
            aVar.b(2, "uploadTask onCancel", this.f107340b.getAbsolutePath());
            aVar.a();
        }
    }

    public final void onFail(@Nullable FileUploadInfo fileUploadInfo, int i7) {
        super.onFail(fileUploadInfo, i7);
        d.a aVar = this.f107339a;
        if (aVar != null) {
            aVar.b(2, C3259x.a(i7, "uploadTask onFail error="), this.f107340b.getAbsolutePath());
            aVar.a();
        }
    }

    public final void onSuccess(@NonNull FileUploadInfo fileUploadInfo, @NonNull String str) {
        super.onSuccess(fileUploadInfo, str);
        d.a aVar = this.f107339a;
        if (aVar != null) {
            aVar.c(this.f107341c, this.f107340b.length() / 1024, fileUploadInfo.getUposUri());
            aVar.a();
        }
    }
}
