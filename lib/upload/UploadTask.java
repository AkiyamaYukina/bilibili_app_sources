package com.bilibili.lib.upload;

import com.bilibili.lib.upload.UploadTaskState;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/upload/UploadTask.class */
public class UploadTask {
    private static final String TAG = "BILI-UPLOAD";
    private long nativePtr = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/upload/UploadTask$Callback.class */
    public interface Callback {
        void onBvcMetadata(String str);

        void onDestroy();

        String onGetRuquestUrl(UploadTaskState.UPLOAD_STAGE upload_stage, String str, Map<String, String> map);

        void onProgress(int i7, long j7, long j8);

        void onSpeed(int i7, long j7);

        void onUploadError(UploadTaskState.UPLOAD_STAGE upload_stage, UPLOAD_ERROR upload_error, int i7, String str);

        void onUploadEvent(UploadTaskState.UPLOAD_STAGE upload_stage, UPLOAD_EVENT upload_event);

        void onUploadSuccess();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/upload/UploadTask$UPLOAD_ERROR.class */
    public enum UPLOAD_ERROR {
        UPLOAD_ERROR_UNKNOW,
        UPLOAD_ERROR_FILE_OPEN_FAILED,
        UPLOAD_ERROR_FILE_READ_FAILED,
        UPLOAD_ERROR_HTTP_FAILED,
        UPLOAD_ERROR_HTTP_RESPONSE_PARSE_FAILED
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/upload/UploadTask$UPLOAD_EVENT.class */
    public enum UPLOAD_EVENT {
        UPLOAD_EVENT_UNKNOWN_ERROR,
        UPLOAD_EVENT_NETWORK_UNREACHABLE,
        UPLAOD_EVENT_DNS_FAILD,
        UPLAOD_EVENT_TCP_CONNECT_FAILD,
        UPLAOD_EVENT_HTTP_SEND_DATA_TIMEOUT,
        UPLAOD_EVENT_HTTP_RESPONSE_TIMEOUT,
        UPLAOD_EVENT_HTTP_SENDING_DATA,
        UPLAOD_EVENT_HTTP_RESPONSE_SUCCESS,
        UPLAOD_EVENT_STATE_CHANGE
    }

    static {
        UploadLibLoader.getInstance().loadLibrariesOnce();
    }

    private UploadTask() {
    }

    public native UploadTaskState getTaskState();

    public native boolean isStart();

    public native int setDataSource(int i7);

    public native int setDataSource(String str);

    public native int setFrom(String str);

    public native int setMetaProfile(String str);

    public native int setProfile(String str);

    public native int setResolution(int i7);

    public native int start();

    public native void stop();
}
