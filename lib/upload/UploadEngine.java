package com.bilibili.lib.upload;

import G.p;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.autofill.r;
import com.bilibili.lib.upload.UploadTask;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/upload/UploadEngine.class */
public class UploadEngine {
    private static final String TAG = "BILI-UPLOAD";
    private static UploadEngine mEngine;
    private ReportCallback mCallbcak = null;
    private long nativePtr;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/upload/UploadEngine$ReportCallback.class */
    public interface ReportCallback {
        void reportMetrics(String str, Map<String, String> map);
    }

    static {
        UploadLibLoader.getInstance().loadLibrariesOnce();
        mEngine = null;
    }

    private UploadEngine(Map<String, String> map, String str, String str2) {
        this.nativePtr = 0L;
        Log.i(TAG, "UploadEngine profilePath:" + str + " proxy:" + str2);
        this.nativePtr = native_init(map, str, str2);
    }

    public static UploadEngine getInstance() {
        UploadEngine uploadEngine;
        synchronized (UploadEngine.class) {
            try {
                uploadEngine = mEngine;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uploadEngine;
    }

    public static UploadEngine getInstance(Map<String, String> map, String str) {
        UploadEngine uploadEngine;
        synchronized (UploadEngine.class) {
            try {
                if (mEngine == null) {
                    String property = System.getProperty("http.proxyHost");
                    String property2 = System.getProperty("http.proxyPort");
                    String str2 = "";
                    if (!TextUtils.isEmpty(property)) {
                        str2 = "";
                        if (!TextUtils.isEmpty(property2)) {
                            str2 = property + ":" + property2;
                        }
                    }
                    mEngine = new UploadEngine(map, str, str2);
                }
                uploadEngine = mEngine;
            } finally {
            }
        }
        return uploadEngine;
    }

    public static native Map<String, String> getUploadEngineConfig();

    private native long native_init(Map<String, String> map, String str, String str2);

    public static void report(String str, Map<String, String> map) {
        String str2;
        Iterator<String> it = map.keySet().iterator();
        String strA = "";
        while (true) {
            str2 = strA;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            StringBuilder sbA = r.a(p.a(p.a(str2, next), ":"));
            sbA.append(map.get(next));
            strA = p.a(sbA.toString(), " ");
        }
        Log.i(TAG, "report event: " + str + " metrics: " + str2);
        ReportCallback reportCallback = getInstance().mCallbcak;
        if (reportCallback != null) {
            reportCallback.reportMetrics(str, map);
        }
    }

    public native UploadTask createTask(UploadTask.Callback callback, long j7, long j8, int i7);

    public native UploadTask createTask(String str, UploadTask.Callback callback);

    public native void destoryTask(String str);

    public native Map<String, UploadTaskState> getAllTaskState(long j7);

    public void setReport(ReportCallback reportCallback) {
        this.mCallbcak = reportCallback;
    }
}
