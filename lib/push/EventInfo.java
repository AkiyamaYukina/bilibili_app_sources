package com.bilibili.lib.push;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/EventInfo.class */
public class EventInfo {

    @NonNull
    public String mErrorCode;

    @Nullable
    public String mErrorMsg;

    @Nullable
    public Map<String, String> mExtra;

    @Nullable
    public String mPushToken;
    public int mPushType;

    public EventInfo(int i7, long j7, @Nullable String str) {
        this.mPushType = i7;
        this.mErrorCode = String.valueOf(j7);
        this.mErrorMsg = str;
    }

    public EventInfo(@Nullable String str, int i7) {
        this.mPushToken = str;
        this.mPushType = i7;
    }

    public void addExtraInfo(String str, String str2) {
        if (this.mExtra == null) {
            this.mExtra = new HashMap();
        }
        this.mExtra.put(str, str2);
    }
}
