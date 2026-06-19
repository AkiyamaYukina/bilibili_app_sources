package com.bilibili.studio.videoeditor.help.compiler.sdk;

import android.util.Log;
import com.bilibili.studio.videocompile.IBVideoCompileLogger;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/compiler/sdk/VideoCompilerSdk$bvideoInit$1$1$getLogger$1.class */
public final class VideoCompilerSdk$bvideoInit$1$1$getLogger$1 implements IBVideoCompileLogger {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/compiler/sdk/VideoCompilerSdk$bvideoInit$1$1$getLogger$1$a.class */
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            de.a.b("VideoCompileGlobalSetting.upload:", Log.getStackTraceString(th));
        }
    }

    @Override // com.bilibili.studio.videocompile.IBVideoCompileLogger
    public final void d(String str, String str2) {
        BLog.d(str, str2);
    }

    @Override // com.bilibili.studio.videocompile.IBVideoCompileLogger
    public final void e(String str, String str2) {
        BLog.e(str, str2);
    }

    @Override // com.bilibili.studio.videocompile.IBVideoCompileLogger
    public final void i(String str, String str2) {
    }

    @Override // com.bilibili.studio.videocompile.IBVideoCompileLogger
    public final void upload() {
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), new AbstractCoroutineContextElement(CoroutineExceptionHandler.Key), (CoroutineStart) null, new VideoCompilerSdk$bvideoInit$1$1$getLogger$1$upload$1(null), 2, (Object) null);
    }

    @Override // com.bilibili.studio.videocompile.IBVideoCompileLogger
    public final void w(String str, String str2) {
        BLog.w(str, str2);
    }
}
