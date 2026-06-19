package com.bilibili.studio.editor.tts.base;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/base/TtsErrorCode.class */
@Keep
public final class TtsErrorCode {
    public static final int CHECK_CONTEXT_IS_NULL = 300004;
    public static final int CHECK_ENCODE_TYPE_NULL = 300006;
    public static final int CHECK_MODEL_ID_ILLEGAL = 300001;
    public static final int CHECK_NECESSARY_PARAM_LACK = 300005;
    public static final int CHECK_PITCH_RATE_INVALIDATE = 300010;
    public static final int CHECK_SAMPLE_RATE_INVALIDATE = 300007;
    public static final int CHECK_SPEECH_RATE_INVALIDATE = 300009;
    public static final int CHECK_TASK_PARAM_BATCH_TEXT_IS_NULL = 300003;
    public static final int CHECK_TASK_PARAM_TASK_ID_NULL = 300002;
    public static final int CHECK_VOLUME_INVALIDATE = 300008;
    public static final int DOWNLOAD_CONNECTION_EXCEPTION = 300111;
    public static final int DOWNLOAD_CREATE_CLIENT_FAILED = 300101;
    public static final int DOWNLOAD_FILE_NAME_OR_PATH_NULL = 300109;
    public static final int DOWNLOAD_IO_EXCEPTION = 300102;
    public static final int DOWNLOAD_OTHER_ERROR = 300108;
    public static final int DOWNLOAD_REQUEST_CANCEL = 300107;
    public static final int DOWNLOAD_RESPONSE_BODY_NULL = 300104;
    public static final int DOWNLOAD_RESPONSE_CODE_NOT_ZERO = 300103;
    public static final int DOWNLOAD_SAVE_FILE_FAILED = 300106;
    public static final int DOWNLOAD_SINGLE_BYTE_ARRAY_TO_LARGE = 300110;
    public static final int DOWNLOAD_TIME_OUT = 300105;
    public static final int DOWNLOAD_URL_ILLEGAL = 300100;
    public static final int FORMAT_BUILD_PARAM_ERROR = 300012;
    public static final int FORMAT_TEXT_LIST_SIZE_NOT_EQUALS_LINKS_SIZE = 300013;
    public static final int FORMAT_TICKET_TO_JSON_OBJ_ERROR = 300011;

    @NotNull
    public static final TtsErrorCode INSTANCE = new TtsErrorCode();
    public static final int SUCCESS = 0;

    private TtsErrorCode() {
    }
}
