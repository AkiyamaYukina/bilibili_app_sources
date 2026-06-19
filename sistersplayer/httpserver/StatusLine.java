package com.bilibili.sistersplayer.httpserver;

import androidx.compose.runtime.ComposerKt;
import com.alipay.alipaysecuritysdk.common.exception.ErrorCode;
import com.bilibili.mobile.BLHumanActionParamsType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/httpserver/StatusLine.class */
public enum StatusLine {
    SWITCH_PROTOCOL(101, "Switching Protocols"),
    OK(200, "OK"),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    NO_CONTENT(ComposerKt.providerMapsKey, "No Content"),
    PARTIAL_CONTENT(ComposerKt.referenceKey, "Partial Content"),
    MULTI_STATUS(ComposerKt.reuseKey, "Multi-Status"),
    MOVED_PERMANENTLY(301, "Moved Permanently"),
    MOVED_TEMPORARILY(302, "Moved Temporarily"),
    REDIRECT_SEE_OTHER(303, "See Other"),
    NOT_MODIFIED(304, "Not Modified"),
    TEMPORARY_REDIRECT(ErrorCode.E_OPERATIONTYPE_EMPTY, "Temporary Redirect"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    NOT_ACCEPTABLE(ErrorCode.E_T0_INIT_FAILED, "Not Acceptable"),
    REQUEST_TIMEOUT(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_BACKGROUND_SEGMENT_USE_TEMPERATURE, "Request Timeout"),
    CONFLICT(409, "Conflict"),
    GONE(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAIR_MAX_SIZE, "Gone"),
    LENGTH_REQUIRED(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAIR_BLUR_STRENGTH, "Length Required"),
    PRECONDITION_FAILED(412, "Precondition Failed"),
    PAYLOAD_TOO_LARGE(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAIR_PROCESS_INTERVAL, "Payload Too Large"),
    UNSUPPORTED_MEDIA_TYPE(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAIR_SEGMENT_MIN_THRESHOLD, "Unsupported Media Type"),
    RANGE_NOT_SATISFIABLE(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAIR_SEGMENT_RESULT_BLUR, "Requested Range Not Satisfiable"),
    EXPECTATION_FAILED(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAIR_SEGMENT_USE_TEMPERATURE, "Expectation Failed"),
    TOO_MANY_REQUESTS(429, "Too Many Requests"),
    INTERNAL_ERROR(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),
    UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");

    public final int code;
    public final String description;

    StatusLine(int i7, String str) {
        this.code = i7;
        this.description = str;
    }

    public static StatusLine lookup(int i7) {
        for (StatusLine statusLine : values()) {
            if (statusLine.code == i7) {
                return statusLine;
            }
        }
        return null;
    }

    public static StatusLine parse(String str) {
        int iIndexOf = str.indexOf(32);
        int length = iIndexOf;
        if (iIndexOf < 0) {
            length = str.length();
        }
        return lookup(Integer.parseInt(str.substring(0, length)));
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.code) + ' ' + this.description;
    }
}
