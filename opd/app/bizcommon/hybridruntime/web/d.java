package com.bilibili.opd.app.bizcommon.hybridruntime.web;

import Fm0.C1900h;
import android.net.http.SslError;
import com.bilibili.app.comm.bhwebview.api.interfaces.ConsoleMessage;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceError;
import com.bilibili.opd.app.bizcommon.hybridruntime.web.WebViewError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/d.class */
public final class d {
    public static Map<String, String> a(ConsoleMessage consoleMessage) {
        HashMap map = new HashMap(16);
        map.put("errorType", WebViewError.Type.WEB_ERROR_CONSOLE.getName());
        if (consoleMessage != null && consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            map.put("desc", consoleMessage.message());
        }
        return map;
    }

    public static Map<String, String> b(SslError sslError) {
        HashMap map = new HashMap(8);
        map.put("errorType", WebViewError.Type.WEB_ERROR_SSL.getName());
        if (sslError != null) {
            map.put("desc", sslError.toString());
        }
        return map;
    }

    public static Map<String, String> c(WebResourceError webResourceError) {
        HashMap map = new HashMap(8);
        map.put("errorType", WebViewError.Type.WEB_ERROR_RESOURCE.getName());
        if (webResourceError != null) {
            map.put("code", C1900h.a(webResourceError.getErrorCode()));
            map.put("desc", "" + ((Object) webResourceError.getDescription()));
        }
        return map;
    }
}
