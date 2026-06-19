package com.bilibili.lib.ui.webview2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/WebError.class */
final class WebError extends Exception {
    public final int code;

    public WebError(int i7) {
        this.code = i7;
    }

    public WebError(Exception exc, int i7) {
        super(exc);
        this.code = i7;
    }

    public WebError(String str, int i7) {
        super(str);
        this.code = i7;
    }

    public WebError(String str, Exception exc, int i7) {
        super(str, exc);
        this.code = i7;
    }
}
