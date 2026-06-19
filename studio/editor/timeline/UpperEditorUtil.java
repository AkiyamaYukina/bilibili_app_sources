package com.bilibili.studio.editor.timeline;

import android.util.Base64;
import com.bilibili.commons.Charsets;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.zip.GZIPOutputStream;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/UpperEditorUtil.class */
public final class UpperEditorUtil {
    @NotNull
    public static String a(@Nullable String str) {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream2;
        if (str == null || str.length() == 0 || Intrinsics.areEqual(str, "null")) {
            return "";
        }
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = null;
                }
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream2, Charsets.UTF_8), 8192);
                    try {
                        bufferedWriter.write(str);
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(bufferedWriter, (Throwable) null);
                        gZIPOutputStream2.close();
                        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                        byteArrayOutputStream.close();
                        gZIPOutputStream2.close();
                        str = strEncodeToString;
                    } finally {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    try {
                        BLog.e("dealEditorJson error" + th.getMessage());
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        str = "";
                        if (gZIPOutputStream != null) {
                            gZIPOutputStream.close();
                            str = "";
                        }
                        return str;
                    } catch (Throwable th3) {
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                                throw th3;
                            }
                        }
                        if (gZIPOutputStream != null) {
                            gZIPOutputStream.close();
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                gZIPOutputStream = null;
                byteArrayOutputStream = null;
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b() {
        /*
            android.app.Application r0 = com.bilibili.lib.foundation.FoundationAlias.getFapp()
            android.content.Context r0 = r0.getApplicationContext()
            r4 = r0
            r0 = r4
            java.lang.String r0 = com.bilibili.studio.videoeditor.ms.EditorEngineSDKLoadManager.getBMMAuroraSoDirPath(r0)
            r3 = r0
            r0 = r4
            java.lang.String r0 = com.bilibili.studio.videoeditor.ms.EditorEngineSDKLoadManager.getBMMSoDirPath(r0)
            r10 = r0
            java.lang.String r0 = com.bilibili.studio.videoeditor.ms.EditorEngineSDKLoadManager.getAuroraResourcesDirPath()
            r9 = r0
            r0 = r4
            java.lang.String r0 = com.bilibili.studio.videoeditor.ms.EditorEngineSDKLoadManager.getAuroraThirdPartPath(r0)
            r8 = r0
            r0 = r4
            java.lang.String r0 = com.bilibili.studio.videoeditor.ms.EditorEngineSDKLoadManager.getCVSoDirPath(r0)
            r7 = r0
            r0 = r4
            java.lang.String r0 = com.bilibili.studio.videoeditor.ms.EditorEngineSDKLoadManager.getMonSoDirPath(r0)
            r6 = r0
            r0 = r4
            java.lang.String r0 = com.bilibili.studio.videoeditor.ms.EditorEngineSDKLoadManager.getMonThirdPartySoDirPath(r0)
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L41
            r0 = r3
            int r0 = r0.length()
            if (r0 != 0) goto L3b
            goto L41
        L3b:
            java.lang.String r0 = ""
            r4 = r0
            goto L44
        L41:
            java.lang.String r0 = "bmmAuroraSoPath so sdk path is empty "
            r4 = r0
        L44:
            r0 = r10
            if (r0 == 0) goto L53
            r0 = r4
            r3 = r0
            r0 = r10
            int r0 = r0.length()
            if (r0 != 0) goto L5a
        L53:
            r0 = r4
            java.lang.String r1 = "bmmSoPath so sdk path is empty "
            java.lang.String r0 = r0.concat(r1)
            r3 = r0
        L5a:
            r0 = r9
            if (r0 == 0) goto L69
            r0 = r3
            r4 = r0
            r0 = r9
            int r0 = r0.length()
            if (r0 != 0) goto L70
        L69:
            r0 = r3
            java.lang.String r1 = "auroraSoPath so sdk path is empty "
            java.lang.String r0 = G.p.a(r0, r1)
            r4 = r0
        L70:
            r0 = r8
            if (r0 == 0) goto L7f
            r0 = r4
            r3 = r0
            r0 = r8
            int r0 = r0.length()
            if (r0 != 0) goto L86
        L7f:
            r0 = r4
            java.lang.String r1 = "auroraThirdPart so sdk path is empty "
            java.lang.String r0 = G.p.a(r0, r1)
            r3 = r0
        L86:
            r0 = r7
            if (r0 == 0) goto L95
            r0 = r3
            r4 = r0
            r0 = r7
            int r0 = r0.length()
            if (r0 != 0) goto L9c
        L95:
            r0 = r3
            java.lang.String r1 = "cv so sdk path is empty "
            java.lang.String r0 = G.p.a(r0, r1)
            r4 = r0
        L9c:
            r0 = r6
            if (r0 == 0) goto La9
            r0 = r4
            r3 = r0
            r0 = r6
            int r0 = r0.length()
            if (r0 != 0) goto Lb0
        La9:
            r0 = r4
            java.lang.String r1 = "montageSoPath so sdk path is empty "
            java.lang.String r0 = G.p.a(r0, r1)
            r3 = r0
        Lb0:
            r0 = r5
            if (r0 == 0) goto Lbd
            r0 = r3
            r4 = r0
            r0 = r5
            int r0 = r0.length()
            if (r0 != 0) goto Lc4
        Lbd:
            r0 = r3
            java.lang.String r1 = "montageThirdPartySoPath so sdk path is empty "
            java.lang.String r0 = G.p.a(r0, r1)
            r4 = r0
        Lc4:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.timeline.UpperEditorUtil.b():java.lang.String");
    }

    public static void c() {
        BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new UpperEditorUtil$startScanSDCards$1(null), 2, (Object) null);
    }
}
