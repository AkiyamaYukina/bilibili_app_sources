package com.bilibili.opd.app.core.config.impl;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.BiliApiParseException;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.okretro.utils.ExBilowUtil;
import com.bilibili.opd.app.core.config.ConfigService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import retrofit2.HttpException;
import tv.danmaku.android.log.BLog;
import wn0.InterfaceC8901a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/core/config/impl/BaseBiliConfigService.class */
public abstract class BaseBiliConfigService extends BiliApiDataCallback<JSONObject> implements ConfigService {
    public static final String TAG = "BaseBiliConfigService";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f74671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, ArrayList<InterfaceC8901a>> f74672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f74673d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<ConfigService.a> f74674e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BiliCall<GeneralResponse<JSONObject>> f74675f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f74676g;
    protected volatile String mConfigStr;
    protected volatile JSONObject mRoot;

    public BaseBiliConfigService(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f74671b = context;
        this.f74672c = new HashMap<>();
        this.f74676g = str;
    }

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public void addListener(String str, InterfaceC8901a interfaceC8901a) {
        synchronized (this.f74672c) {
            ArrayList<InterfaceC8901a> arrayList = this.f74672c.get(str);
            ArrayList<InterfaceC8901a> arrayList2 = arrayList;
            if (arrayList == null) {
                arrayList2 = new ArrayList<>();
                this.f74672c.put(str, arrayList2);
            }
            if (!arrayList2.contains(interfaceC8901a)) {
                arrayList2.add(interfaceC8901a);
            }
        }
    }

    public abstract BiliCall<GeneralResponse<JSONObject>> createBiliCall();

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public JSONObject dump() {
        try {
            if (TextUtils.isEmpty(this.mConfigStr)) {
                JSONObject jSONObjectRoot = root();
                if (TextUtils.isEmpty(this.mConfigStr)) {
                    this.mConfigStr = jSONObjectRoot.toString();
                }
            }
            return JSON.parseObject(this.mConfigStr);
        } catch (Exception e7) {
            return new JSONObject();
        }
    }

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public boolean getBoolean(String str, boolean z6) {
        try {
            if (root().containsKey(str)) {
                z6 = root().getBoolean(str).booleanValue();
            }
        } catch (Throwable th) {
        }
        return z6;
    }

    public File getConfigDir() {
        File file = new File(this.f74671b.getFilesDir(), this.f74676g);
        if (!file.isDirectory()) {
            file.delete();
            file.mkdir();
        }
        return file;
    }

    public File getConfigFile() {
        return new File(getConfigDir(), "1");
    }

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public double getDouble(String str, double d7) {
        try {
            if (root().containsKey(str)) {
                d7 = root().getDouble(str).doubleValue();
            }
        } catch (Throwable th) {
        }
        return d7;
    }

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public int getInt(String str, int i7) {
        try {
            if (root().containsKey(str)) {
                i7 = root().getIntValue(str);
            }
        } catch (Throwable th) {
        }
        return i7;
    }

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public JSONArray getJsonArray(String str) {
        return root().getJSONArray(str);
    }

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public JSONObject getJsonObject(String str) {
        return root().getJSONObject(str);
    }

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public Object getObject(String str, Class<?> cls) {
        return JSON.parseObject(root().getString(str), cls);
    }

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public <T> List<T> getObjectArray(String str, Class<T> cls) {
        try {
            return JSON.parseArray(root().getString(str), cls);
        } catch (Throwable th) {
            return null;
        }
    }

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public String getString(String str, String str2) {
        try {
            if (root().containsKey(str)) {
                str2 = root().getString(str);
            }
        } catch (Throwable th) {
        }
        return str2;
    }

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public boolean isValid() {
        return this.f74673d;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public void onDataSuccess(JSONObject jSONObject) {
        boolean z6;
        try {
            if (jSONObject != null) {
                setConfig(jSONObject);
                z6 = true;
            } else {
                BLog.d("config", "success (Config) is null");
                z6 = false;
            }
            synchronized (this.f74674e) {
                Iterator it = ((ArrayList) this.f74674e).iterator();
                while (it.hasNext()) {
                    ((ConfigService.a) it.next()).a();
                }
                ((ArrayList) this.f74674e).clear();
                this.f74675f = null;
            }
            onRequestConfigFinish(z6, jSONObject);
        } catch (Throwable th) {
            synchronized (this.f74674e) {
                Iterator it2 = ((ArrayList) this.f74674e).iterator();
                while (it2.hasNext()) {
                    ((ConfigService.a) it2.next()).a();
                }
                ((ArrayList) this.f74674e).clear();
                this.f74675f = null;
                onRequestConfigFinish(z6, jSONObject);
                throw th;
            }
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public void onError(Throwable th) {
        synchronized (this.f74674e) {
            Iterator it = ((ArrayList) this.f74674e).iterator();
            while (it.hasNext()) {
                ((ConfigService.a) it.next()).a();
            }
            ((ArrayList) this.f74674e).clear();
            this.f74675f = null;
        }
        BLog.i("config", "fail to refresh config");
        onRequestConfigFailed();
    }

    public void onRequestConfigFailed() {
    }

    public void onRequestConfigFinish(boolean z6, JSONObject jSONObject) {
    }

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public void refresh() {
        refresh(true);
    }

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public void refresh(ConfigService.a aVar) {
        synchronized (this) {
            if (aVar == null) {
                refresh(false);
                return;
            }
            synchronized (this.f74674e) {
                if (!((ArrayList) this.f74674e).contains(aVar)) {
                    ((ArrayList) this.f74674e).add(aVar);
                }
                if (this.f74675f != null) {
                    return;
                }
                refresh(false);
            }
        }
    }

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public void refresh(boolean z6) {
        BiliCall<GeneralResponse<JSONObject>> biliCall = this.f74675f;
        if (biliCall != null) {
            if (!z6) {
                return;
            } else {
                biliCall.cancel();
            }
        }
        BiliCall<GeneralResponse<JSONObject>> biliCallCreateBiliCall = createBiliCall();
        this.f74675f = biliCallCreateBiliCall;
        this.f74673d = false;
        if (biliCallCreateBiliCall != null) {
            biliCallCreateBiliCall.enqueue(this);
        } else {
            BLog.w("config", "there is no request supply for the config service, refresh failed");
        }
    }

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public boolean refreshSync() {
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        try {
            JSONObject jSONObject = (JSONObject) ExBilowUtil.extractResponseData(createBiliCall().execute());
            z9 = false;
            if (jSONObject != null) {
                z6 = true;
                z7 = true;
                z8 = true;
                z9 = true;
                setConfig(jSONObject);
                z9 = true;
            }
        } catch (BiliApiException e7) {
            e = e7;
            z9 = z6;
            BLog.w("config", e);
        } catch (BiliApiParseException e8) {
            BLog.w("config", "result is not a json object", e8);
            z9 = z8;
        } catch (IOException e9) {
            e = e9;
            BLog.w("config", e);
        } catch (HttpException e10) {
            e = e10;
            z9 = z7;
            BLog.w("config", e);
        }
        return z9;
    }

    @Override // com.bilibili.opd.app.core.config.ConfigService
    public void removeListener(String str, InterfaceC8901a interfaceC8901a) {
        synchronized (this.f74672c) {
            ArrayList<InterfaceC8901a> arrayList = this.f74672c.get(str);
            if (arrayList != null) {
                arrayList.remove(interfaceC8901a);
                if (arrayList.isEmpty()) {
                    this.f74672c.remove(str);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson.JSONObject root() {
        /*
            r3 = this;
            r0 = r3
            com.alibaba.fastjson.JSONObject r0 = r0.mRoot
            if (r0 != 0) goto L76
            r0 = r3
            java.io.File r0 = r0.getConfigFile()
            r4 = r0
            r0 = r4
            boolean r0 = r0.exists()
            if (r0 == 0) goto L5a
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L7b
            r5 = r0
            r0 = r5
            r1 = r4
            r0.<init>(r1)     // Catch: java.lang.Exception -> L7b
            r0 = r5
            int r0 = r0.available()     // Catch: java.lang.Throwable -> L3d
            r1 = 1000000(0xf4240, float:1.401298E-39)
            if (r0 > r1) goto L41
            r0 = r3
            r1 = r5
            java.lang.String r1 = com.bilibili.commons.io.IOUtils.toString(r1)     // Catch: java.lang.Throwable -> L3d
            r0.mConfigStr = r1     // Catch: java.lang.Throwable -> L3d
            r0 = r3
            java.lang.String r0 = r0.mConfigStr     // Catch: java.lang.Throwable -> L3d
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r0)     // Catch: java.lang.Throwable -> L3d
            r4 = r0
            r0 = r5
            r0.close()     // Catch: java.lang.Exception -> L7b
            goto L5c
        L3d:
            r4 = move-exception
            goto L4b
        L41:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L3d
            r4 = r0
            r0 = r4
            r0.<init>()     // Catch: java.lang.Throwable -> L3d
            r0 = r4
            throw r0     // Catch: java.lang.Throwable -> L3d
        L4b:
            r0 = r5
            r0.close()     // Catch: java.lang.Throwable -> L52
            goto L58
        L52:
            r5 = move-exception
            r0 = r4
            r1 = r5
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L7b
        L58:
            r0 = r4
            throw r0     // Catch: java.lang.Exception -> L7b
        L5a:
            r0 = 0
            r4 = r0
        L5c:
            r0 = r4
            r5 = r0
            r0 = r4
            if (r0 != 0) goto L6a
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            r1 = r0
            r1.<init>()
            r5 = r0
        L6a:
            r0 = r3
            com.alibaba.fastjson.JSONObject r0 = r0.mRoot
            if (r0 != 0) goto L76
            r0 = r3
            r1 = r5
            r0.mRoot = r1
        L76:
            r0 = r3
            com.alibaba.fastjson.JSONObject r0 = r0.mRoot
            return r0
        L7b:
            r4 = move-exception
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.core.config.impl.BaseBiliConfigService.root():com.alibaba.fastjson.JSONObject");
    }

    public void setConfig(JSONObject jSONObject) {
        synchronized (this) {
            if (jSONObject == null) {
                return;
            }
            JSONObject jSONObject2 = this.mRoot;
            this.mRoot = jSONObject;
            try {
                this.mConfigStr = this.mRoot.toString();
                File file = new File(getConfigDir(), new Random(System.currentTimeMillis()).nextInt() + ".tmp");
                String str = this.mConfigStr;
                try {
                    if (!TextUtils.isEmpty(str)) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            fileOutputStream.write(str.getBytes());
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            if (!file.renameTo(getConfigFile())) {
                                BLog.w("config", "fail to move config file " + file);
                                return;
                            }
                            this.f74673d = true;
                            synchronized (this.f74672c) {
                                ArrayList<InterfaceC8901a> arrayList = this.f74672c.get(ConfigService.ANY);
                                if (arrayList != null) {
                                    Iterator<InterfaceC8901a> it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        it.next().a();
                                    }
                                }
                                for (Map.Entry<String, ArrayList<InterfaceC8901a>> entry : this.f74672c.entrySet()) {
                                    String key = entry.getKey();
                                    if (!ConfigService.ANY.equals(key)) {
                                        Object obj = jSONObject2.get(key);
                                        Object obj2 = jSONObject.get(key);
                                        if (!(obj == null ? obj2 == null : obj.equals(obj2))) {
                                            Iterator<InterfaceC8901a> it2 = entry.getValue().iterator();
                                            while (it2.hasNext()) {
                                                it2.next().a();
                                            }
                                        }
                                    }
                                }
                            }
                            return;
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (Exception e7) {
                }
                BLog.w("config", "fail to write config to " + file);
            } catch (OutOfMemoryError e8) {
                BLog.w("config", e8.toString());
            }
        }
    }
}
