package com.bilibili.lib.v8engine.devtools.inspector.jsonrpc.protocol;

import com.bilibili.lib.v8engine.devtools.json.annotation.JsonProperty;
import com.bilibili.lib.v8engine.devtools.json.annotation.JsonValue;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/jsonrpc/protocol/JsonRpcError.class */
public final class JsonRpcError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @JsonProperty(required = true)
    public final ErrorCode f65054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JsonProperty(required = true)
    public final String f65055b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/jsonrpc/protocol/JsonRpcError$ErrorCode.class */
    public enum ErrorCode {
        PARSER_ERROR(-32700),
        INVALID_REQUEST(-32600),
        METHOD_NOT_FOUND(-32601),
        INVALID_PARAMS(-32602),
        INTERNAL_ERROR(-32603);

        private final int mProtocolValue;

        ErrorCode(int i7) {
            this.mProtocolValue = i7;
        }

        @JsonValue
        public int getProtocolValue() {
            return this.mProtocolValue;
        }
    }

    public JsonRpcError(ErrorCode errorCode, String str) {
        this.f65054a = errorCode;
        this.f65055b = str;
    }
}
