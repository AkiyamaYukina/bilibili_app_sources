package com.bilibili.lib.v8engine.devtools.inspector;

import androidx.compose.ui.input.pointer.k;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8engine/devtools/inspector/MismatchedResponseException.class */
public class MismatchedResponseException extends MessageHandlingException {
    public long mRequestId;

    public MismatchedResponseException(long j7) {
        super(k.a(j7, "Response for request id ", ", but no such request is pending"));
        this.mRequestId = j7;
    }

    public long getRequestId() {
        return this.mRequestId;
    }
}
