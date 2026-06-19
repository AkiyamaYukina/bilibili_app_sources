package com.bilibili.okretro;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bilibili.sistersplayer.httpserver.SimpleBaseClient;
import retrofit2.HttpException;
import retrofit2.Response;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/BiliUnsafeHttpCodeException.class */
public class BiliUnsafeHttpCodeException extends HttpException {
    private static final String DEFAULT_MSG = "由于触发安全风控策略，该次请求被拒绝。";
    public static final int UNSAFE_HTTP_CODE = 412;
    private String displayMsg;

    public BiliUnsafeHttpCodeException(Response<?> response) {
        super(response);
        this.displayMsg = DEFAULT_MSG;
        this.displayMsg = parseDisplayMsg(response);
    }

    public static String parseDisplayMsg(Response<?> response) {
        if (response.raw() == null || response.raw().body() == null) {
            return DEFAULT_MSG;
        }
        try {
            String str = response.headers().get(SimpleBaseClient.CONTENT_TYPE);
            if (str == null || !str.contains("application/json")) {
                return DEFAULT_MSG;
            }
            String string = JSON.parseObject(response.errorBody().string()).getString("message");
            return !TextUtils.isEmpty(string) ? string : DEFAULT_MSG;
        } catch (Exception e7) {
            BLog.w("BiliUnsafeHttpCodeException parse error: ", e7);
            return DEFAULT_MSG;
        }
    }

    public String displayMsg() {
        return this.displayMsg;
    }
}
