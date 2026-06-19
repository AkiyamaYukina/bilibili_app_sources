package com.bilibili.studio.videoeditor.util;

import L50.a;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import com.bilibili.studio.videoeditor.exception.FileNotExistedError;
import com.bilibili.studio.videoeditor.ms.EditorEngineSDKLoadManager;
import java.util.Iterator;
import java.util.List;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/W.class */
public final class W {
    public static long a(@NonNull Context context, @Nullable String str) {
        try {
            EditorEngineSDKLoadManager.init(context.getApplicationContext(), "VideoEditUtils");
            R50.a aVarS = null;
            R50.r rVarU = a.a.a.a != null ? R50.r.u() : null;
            if (rVarU != null) {
                aVarS = rVarU.s(str);
            }
            if (aVarS != null) {
                return aVarS.a.getDuration();
            }
            return -1L;
        } catch (FileNotExistedError e7) {
            BLog.e("VideoEditUtils", e7.getMessage());
            return -1L;
        } catch (NullPointerException e8) {
            BLog.e("VideoEditUtils", "onCreate start ms init sdk nvsStreamingContext null");
            return -1L;
        } catch (UnsatisfiedLinkError e9) {
            BLog.e("VideoEditUtils", "onCreate start ms init sdk error: " + e9.getLocalizedMessage());
            return -1L;
        }
    }

    public static void b(Context context, String str, List list) {
        if (V.e(list)) {
            return;
        }
        J j7 = new J();
        j7.d(context);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j7.e(Long.parseLong(str), ((SelectVideo) it.next()).videoPath);
        }
        j7.f(context);
    }

    public static void c(long j7, String str, Context context) {
        if (TextUtils.isEmpty(str) || context == null) {
            return;
        }
        J j8 = new J();
        j8.d(context);
        if (!j8.c(str)) {
            q4.M.b("removeFileReferenceByTask no filePath=", str, "VideoEditUtils");
        } else {
            j8.e(j7, str);
            j8.f(context);
        }
    }
}
