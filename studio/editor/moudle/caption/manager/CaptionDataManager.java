package com.bilibili.studio.editor.moudle.caption.manager;

import G.p;
import OC0.h;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.videoeditor.download.DownloadRequest;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/manager/CaptionDataManager.class */
public final class CaptionDataManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CaptionDataManager f105765a = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/manager/CaptionDataManager$a.class */
    public interface a {
        void a(@NotNull CaptionListItem captionListItem, @Nullable String str);
    }

    public static final Object a(String str, String str2, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        String strO = h.o(str);
        DownloadRequest.a aVar = new DownloadRequest.a();
        aVar.f109436c = str2;
        aVar.f109437d = strO;
        aVar.f109435b = str;
        DownloadRequest downloadRequestA = aVar.a();
        UB0.b.a(downloadRequestA, new f(cancellableContinuationImpl));
        UB0.b.f(downloadRequestA.taskId);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.studio.editor.moudle.caption.manager.CaptionDataManager r6, int r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.manager.CaptionDataManager.b(com.bilibili.studio.editor.moudle.caption.manager.CaptionDataManager, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final String c(String str, String str2) {
        String strSubstring = str2.substring(0, StringsKt.z(str2, '.', 0, 6));
        String strA = p.a(str, str2);
        String strP = h.P(strA, B0.a.a(str, strSubstring, "/"), strSubstring + ".ttf");
        File file = new File(strA);
        if (file.exists()) {
            file.delete();
        }
        return strP;
    }

    public static void d(int i7, @Nullable a aVar) {
        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new CaptionDataManager$installCaption$1(i7, aVar, null), 3, (Object) null);
    }
}
