package com.bilibili.lib.v8engine.devtools.inspector.jsonrpc;

import com.bilibili.lib.v8engine.devtools.inspector.jsonrpc.protocol.JsonRpcError;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/jsonrpc/JsonRpcException.class */
public class JsonRpcException extends Exception {
    private final JsonRpcError mErrorMessage;

    public JsonRpcException(JsonRpcError jsonRpcError) {
        super(jsonRpcError.f65054a + ": " + jsonRpcError.f65055b);
        this.mErrorMessage = jsonRpcError;
    }

    public JsonRpcError getErrorMessage() {
        return this.mErrorMessage;
    }
}
