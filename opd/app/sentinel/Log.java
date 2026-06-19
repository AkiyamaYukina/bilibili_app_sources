package com.bilibili.opd.app.sentinel;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;
import yn0.C9066a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/sentinel/Log.class */
public class Log {
    public static final int LOG_MONITOR_COUNT = 2;
    public static final int LOG_MONITOR_SUCRATE = 4;
    public static final int LOG_PERF_DURATION = 1;
    public static final int LOG_RUNTIME_DEBUG = 16;
    public static final int LOG_RUNTIME_ERROR = 8;
    public long createTime;
    public Map<String, String> httpCode;
    private String localBuvid;

    @JSONField(serialize = false)
    public Context mContext;
    public String mDesc;
    public String mDuid;
    public long mDuration;
    public String mEvent;
    public Map<String, String> mExtras;
    int mFlag;
    private boolean mForceReport;
    public JSONObject mJsonExtra;
    int mLocked;
    public int mLogType;
    public String mMid;
    public String mMsg;
    public int mNetwork;
    public String mProductKey;

    @JSONField(serialize = false)
    public Reporter mReporter;
    public String mResult;
    public String mSubEvent;

    @JSONField(serialize = false)
    public Throwable mTr;
    public String mTraceId;
    public String subProduct;
    public String traceIdEnd;
    public static final Log EMPTY = new Log();
    public static C9066a<Log> mLogPool = new C9066a<>(new Object());
    private boolean repportImmdiate = false;
    public boolean mNeedTruncation = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/sentinel/Log$a.class */
    public final class a extends Log {
        @Override // com.bilibili.opd.app.sentinel.Log
        public final void report() {
        }
    }

    public static Log customLog(Context context, Reporter reporter, String str, String str2, String str3, String str4, String str5, Map<String, String> map, JSONObject jSONObject) {
        Log logA = mLogPool.a();
        logA.init(context, reporter, str, str2, str3, str4, str5, map, jSONObject);
        return logA;
    }

    public static Log debugLog(Context context, Reporter reporter, String str, String str2, String str3, Throwable th, String str4, String str5, Map<String, String> map, JSONObject jSONObject) {
        Log logA = mLogPool.a();
        logA.init(context, reporter, str, str2, null, str4, str5, map, jSONObject);
        logA.mLogType = 16;
        logA.mMsg = str3;
        logA.mTr = th;
        return logA;
    }

    public static Log errorLog(Context context, Reporter reporter, String str, String str2, String str3, Throwable th, String str4, String str5, Map<String, String> map, JSONObject jSONObject) {
        Log logA = mLogPool.a();
        logA.init(context, reporter, str, str2, null, str4, str5, map, jSONObject);
        logA.mLogType = 8;
        logA.mMsg = str3;
        logA.mTr = th;
        return logA;
    }

    public static Log monitorLogByCount(Context context, Reporter reporter, String str, String str2, String str3, String str4, String str5, Map<String, String> map, JSONObject jSONObject) {
        Log logA = mLogPool.a();
        logA.init(context, reporter, str, str2, str3, str4, str5, map, jSONObject);
        logA.mLogType = 2;
        return logA;
    }

    public static Log monitorLogBySucRate(Context context, Reporter reporter, String str, String str2, String str3, boolean z6, String str4, String str5, Map<String, String> map, JSONObject jSONObject) {
        Log logA = mLogPool.a();
        logA.init(context, reporter, str, str2, str3, str4, str5, map, jSONObject);
        logA.mLogType = 4;
        logA.mResult = z6 ? "1" : "0";
        return logA;
    }

    private void putLocalBuvid() {
        if (TextUtils.isEmpty(this.localBuvid)) {
            return;
        }
        JSONObject jSONObject = this.mJsonExtra;
        if (jSONObject == null) {
            putExtraString("local_buvid", this.localBuvid);
            return;
        }
        try {
            jSONObject.put("local_buvid", this.localBuvid);
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }

    public static Log traceLog(Context context, Reporter reporter, String str, String str2, String str3, long j7, String str4, String str5, Map<String, String> map, JSONObject jSONObject) {
        Log logA = mLogPool.a();
        logA.init(context, reporter, str, str2, str3, str4, str5, map, jSONObject);
        logA.mDuration = j7;
        logA.mLogType = 1;
        return logA;
    }

    public boolean containsType(int i7) {
        return (i7 & this.mLogType) != 0;
    }

    public Log debug(String str, Throwable th) {
        this.mMsg = str;
        this.mTr = th;
        this.mLogType = (this.mLogType & (-9)) | 16;
        return this;
    }

    public Log description(String str) {
        this.mDesc = str;
        return this;
    }

    public Log divide(int i7) {
        if (!containsType(i7)) {
            return null;
        }
        Log logA = mLogPool.a();
        logA.init(this.mContext, this.mReporter, this.mProductKey, this.mEvent, this.mSubEvent, this.mMid, this.mDuid, this.mExtras, this.mJsonExtra);
        if (i7 == 1) {
            this.mLogType &= -2;
            logA.duration(this.mDuration);
            this.mDuration = 0L;
        } else if (i7 == 2) {
            this.mLogType &= -3;
            logA.monitorByCount();
        } else if (i7 == 4) {
            this.mLogType &= -5;
            logA.monitorBySucRate("1".equals(this.mResult));
            this.mResult = null;
        } else if (i7 == 8) {
            this.mLogType &= -9;
            logA.error(this.mMsg, this.mTr);
            this.mMsg = null;
            this.mTr = null;
        } else if (i7 == 16) {
            this.mLogType &= -17;
            logA.debug(this.mMsg, this.mTr);
            this.mMsg = null;
            this.mTr = null;
        }
        return logA;
    }

    public Log duration(long j7) {
        this.mDuration = j7;
        this.mLogType |= 1;
        return this;
    }

    public Log error(String str, Throwable th) {
        this.mMsg = str;
        this.mTr = th;
        this.mLogType = (this.mLogType & (-17)) | 8;
        return this;
    }

    public void forceReport(boolean z6) {
        this.mForceReport = z6;
    }

    public Log httpCode(Map<String, String> map) {
        this.httpCode = map;
        return this;
    }

    public void init(Context context, Reporter reporter, String str, String str2, String str3, String str4, String str5, Map<String, String> map, JSONObject jSONObject) {
        this.mReporter = reporter;
        this.mProductKey = str;
        this.mEvent = str2;
        this.mSubEvent = str3;
        this.mMid = str4;
        this.mDuid = str5;
        this.mExtras = map;
        this.mJsonExtra = jSONObject;
        this.createTime = System.currentTimeMillis();
        this.mContext = context;
        if (context != null) {
            this.mNetwork = Bn0.a.a(context);
        }
    }

    public boolean isForceReport() {
        return this.mForceReport;
    }

    public boolean isReported() {
        return this.mFlag == 2;
    }

    public boolean isWhiteList() {
        boolean z6 = true;
        if (this.mFlag != 1) {
            z6 = false;
        }
        return z6;
    }

    public void lock(boolean z6) {
        this.mLocked = z6 ? 1 : 0;
    }

    public Log monitorByCount() {
        this.mLogType = (this.mLogType & (-5)) | 2;
        return this;
    }

    public Log monitorBySucRate(boolean z6) {
        this.mResult = z6 ? "1" : "0";
        this.mLogType = (this.mLogType & (-3)) | 4;
        return this;
    }

    public Log needTruncation(boolean z6) {
        this.mNeedTruncation = z6;
        return this;
    }

    public Log productKey(String str) {
        this.mProductKey = str;
        return this;
    }

    public Log putExtraJson(JSONObject jSONObject) {
        this.mJsonExtra = jSONObject;
        return this;
    }

    public Log putExtraString(String str, String str2) {
        if (this.mExtras == null) {
            this.mExtras = new HashMap();
        }
        this.mExtras.put(str, str2);
        return this;
    }

    public Log putExtras(Map<String, String> map) {
        if (this.mExtras == null) {
            this.mExtras = new HashMap();
        }
        if (map != null) {
            this.mExtras.putAll(map);
        }
        return this;
    }

    public void report() {
        putLocalBuvid();
        if (this.mReporter == null) {
            return;
        }
        if (this.mForceReport) {
            whiteList();
        }
        if (this.repportImmdiate) {
            new HightPriorityLog(this).report();
        }
        this.mReporter.report(this);
    }

    public void reset() {
        this.mLogType = 0;
        this.mProductKey = null;
        this.mEvent = null;
        this.mSubEvent = null;
        this.mDuration = 0L;
        this.mResult = null;
        this.mMsg = null;
        this.mTr = null;
        this.mExtras = null;
        this.mJsonExtra = null;
        this.createTime = 0L;
        this.mReporter = null;
        this.mForceReport = false;
        this.mFlag = 0;
        this.mMid = null;
        this.mDuid = null;
        this.mDesc = null;
        this.mTraceId = null;
        this.mLocked = 0;
        this.mNeedTruncation = true;
    }

    public void setLocalBuvid(String str) {
        this.localBuvid = str;
    }

    public void setReported() {
        this.mFlag = 2;
    }

    public void setRepportImmdiate() {
        this.repportImmdiate = true;
    }

    public Log subEvent(String str) {
        this.mSubEvent = str;
        return this;
    }

    public Log subProduct(String str) {
        this.subProduct = str;
        return this;
    }

    public Log traceId(String str) {
        this.mTraceId = str;
        return this;
    }

    public Log traceIdEnd(String str) {
        this.traceIdEnd = str;
        return this;
    }

    public void tryRelease() {
        if (this.mLocked == 1) {
            return;
        }
        C9066a<Log> c9066a = mLogPool;
        com.bilibili.opd.app.sentinel.a aVar = c9066a.f129741b;
        if (((LinkedBlockingQueue) c9066a.f129740a).offer(this)) {
            return;
        }
        reset();
    }

    public Log whiteList() {
        if (isReported()) {
            return this;
        }
        this.mFlag = 1;
        return this;
    }
}
