package com.bilibili.studio.editor.asr.core.remote;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.lib.okdownloader.BiliDownloader;
import com.bilibili.lib.okdownloader.Dispatchers;
import com.bilibili.lib.okdownloader.DownloadErrorInfo;
import com.bilibili.lib.okdownloader.DownloadListener2;
import com.bilibili.lib.okdownloader.DownloadRequest;
import com.bilibili.lib.okdownloader.Task;
import com.bilibili.mediautils.FileUtils;
import com.bilibili.studio.editor.asr.core.bean.AsrUtterances;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/remote/AsrResultDownload$downloadAsrJson$2.class */
public final class AsrResultDownload$downloadAsrJson$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AsrUtterances>, Object> {
    final String $url;
    Object L$0;
    Object L$1;
    int label;
    final AsrResultDownload this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/remote/AsrResultDownload$downloadAsrJson$2$a.class */
    public static final class a implements DownloadListener2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CancellableContinuationImpl f105539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AsrResultDownload f105540b;

        public a(CancellableContinuationImpl cancellableContinuationImpl, AsrResultDownload asrResultDownload) {
            this.f105539a = cancellableContinuationImpl;
            this.f105540b = asrResultDownload;
        }

        public final void onError2(String str, DownloadErrorInfo downloadErrorInfo) {
            super.onError2(str, downloadErrorInfo);
            int errorCode = downloadErrorInfo.getErrorCode();
            Throwable throwable = downloadErrorInfo.getThrowable();
            androidx.constraintlayout.widget.a.b(errorCode, "[download] error = ", " path = ", throwable != null ? throwable.getMessage() : null, "AsrResultDownload");
            CancellableContinuationImpl cancellableContinuationImpl = this.f105539a;
            if (cancellableContinuationImpl.isActive()) {
                com.bilibili.studio.videoeditor.extension.d.b(null, cancellableContinuationImpl);
            }
        }

        public final void onFinish2(String str, DownloadListener2.DownloadInfo downloadInfo) {
            String filename;
            super.onFinish2(str, downloadInfo);
            com.bilibili.adcommon.utils.i.a("[download] dir = ", downloadInfo.getDir(), " name= ", downloadInfo.getFilename(), "AsrResultDownload");
            CancellableContinuationImpl cancellableContinuationImpl = this.f105539a;
            boolean zIsActive = cancellableContinuationImpl.isActive();
            AsrResultDownload asrResultDownload = this.f105540b;
            if (zIsActive) {
                String dir = downloadInfo.getDir();
                String filename2 = downloadInfo.getFilename();
                asrResultDownload.getClass();
                AsrUtterances asrUtterances = null;
                if (dir != null) {
                    if (dir.length() == 0) {
                        asrUtterances = null;
                    } else {
                        asrUtterances = null;
                        if (filename2 != null) {
                            if (filename2.length() == 0) {
                                asrUtterances = null;
                            } else {
                                File file = new File(dir, filename2);
                                if (file.exists()) {
                                    try {
                                        asrUtterances = (AsrUtterances) JSON.parseObject(FilesKt.h(file), AsrUtterances.class);
                                    } catch (Exception e7) {
                                        M.b("test = ", e7.getMessage(), "AsrResultDownload");
                                        asrUtterances = null;
                                    }
                                } else {
                                    asrUtterances = null;
                                }
                            }
                        }
                    }
                }
                com.bilibili.studio.videoeditor.extension.d.b(asrUtterances, cancellableContinuationImpl);
            }
            asrResultDownload.getClass();
            try {
                String dir2 = downloadInfo.getDir();
                if (dir2 == null || (filename = downloadInfo.getFilename()) == null) {
                    return;
                }
                File file2 = new File(dir2, filename);
                if (file2.exists()) {
                    file2.delete();
                    BLog.e("AsrResultDownload", "[download] JSON file deleted: ".concat(filename));
                }
            } catch (Exception e8) {
                M.b("[download] JSON file delete fail message = ", e8.getMessage(), "AsrResultDownload");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrResultDownload$downloadAsrJson$2(String str, AsrResultDownload asrResultDownload, Continuation<? super AsrResultDownload$downloadAsrJson$2> continuation) {
        super(2, continuation);
        this.$url = str;
        this.this$0 = asrResultDownload;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AsrResultDownload$downloadAsrJson$2(this.$url, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AsrUtterances> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.$url;
            AsrResultDownload asrResultDownload = this.this$0;
            this.L$0 = str;
            this.L$1 = asrResultDownload;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            String strB = com.bilibili.studio.centerplus.util.c.b(str);
            BiliDownloader.Companion companion = BiliDownloader.Companion;
            Foundation.Companion companion2 = Foundation.Companion;
            DownloadRequest downloadRequestFileName = companion.get(companion2.instance().getApp()).create(str, "bili_editor").fileName(strB + FileUtils.SUFFIX_JSON);
            Application app2 = companion2.instance().getApp();
            if (OC0.h.f17804F == null) {
                OC0.h.f17804F = OC0.h.y(app2, "/asr");
            }
            Task taskBuild = downloadRequestFileName.into(OC0.h.f17804F).callbackOn(Dispatchers.UI).addListener(new a(cancellableContinuationImpl, asrResultDownload)).build();
            String taskId = taskBuild.getTaskId();
            asrResultDownload.f105538a = taskId;
            BLog.e("AsrResultDownload", "[download] start currentTaskId = " + taskId);
            taskBuild.enqueue();
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = result;
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
