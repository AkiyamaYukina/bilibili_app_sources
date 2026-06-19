package com.bilibili.opd.app.bizcommon.hybridruntime.web;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/WebViewError.class */
public final class WebViewError {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/WebViewError$Type.class */
    public enum Type {
        WEB_ERROR_UNKOWN("web_error_unkown"),
        WEB_ERROR_RESOURCE("web_error_resoure"),
        WEB_ERROR_SSL("web_error_ssl"),
        WEB_ERROR_CONSOLE("web_error_console");

        private String name;

        Type(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }
}
