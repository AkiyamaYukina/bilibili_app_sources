package com.bilibili.studio.editor.asr.zip2ai;

import com.bilibili.lib.fileupload.FileUploadManager;
import com.bilibili.lib.fileupload.FileUploadTask;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/zip2ai/d.class */
public final class d implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileUploadTask f105682a;

    public d(FileUploadTask fileUploadTask) {
        this.f105682a = fileUploadTask;
    }

    public final Object invoke(Object obj) {
        if (((Throwable) obj) instanceof CancellationException) {
            FileUploadManager.Companion.getInstance().cancelUploadTask(this.f105682a);
        }
        return Unit.INSTANCE;
    }
}
