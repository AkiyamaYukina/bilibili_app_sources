package com.bilibili.opd.app.bizcommon.context;

import android.app.Application;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.opd.app.bizcommon.context.configservice.HomeDowngradeConfig;
import com.bilibili.opd.app.core.accountservice.OAuthAccountService;
import com.bilibili.opd.app.core.config.ConfigService;
import com.bilibili.opd.app.sentinel.SentinelXXX;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/ServiceManager.class */
public abstract class ServiceManager {
    public static final String HOME_DOWNGRADE = "homeDowngrade";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConfigService f73524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OAuthAccountService f73525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SentinelXXX f73526c;
    protected final Application context;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HomeDowngradeConfig f73527d;

    public ServiceManager(Application application) {
        this.context = application;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.opd.app.bizcommon.context.configservice.HomeDowngradeConfig$a, java.lang.Object] */
    public final HomeDowngradeConfig a() {
        String str;
        String str2;
        String str3;
        String string;
        String string2;
        JSONObject jsonObject = getConfigService().getJsonObject(HOME_DOWNGRADE);
        boolean z6 = false;
        String str4 = "";
        if (jsonObject != null) {
            z6 = false;
            boolean z7 = false;
            try {
                if (jsonObject.containsKey("enableDowngrade")) {
                    z7 = false;
                    if (jsonObject.getIntValue("enableDowngrade") == 1) {
                        z7 = true;
                    }
                }
                if (jsonObject.containsKey("mainHomeUrl")) {
                    z6 = z7;
                    string2 = jsonObject.getString("mainHomeUrl");
                } else {
                    string2 = "";
                }
                try {
                    String string3 = jsonObject.containsKey("secondHomeUrl") ? jsonObject.getString("secondHomeUrl") : "";
                    str2 = string3;
                    str3 = string2;
                    z6 = z7;
                    string = str4;
                    try {
                        if (jsonObject.containsKey("entryList")) {
                            string = jsonObject.getString("entryList");
                            z6 = z7;
                            str3 = string2;
                            str2 = string3;
                        }
                    } catch (Exception e7) {
                        str2 = string3;
                        str3 = string2;
                        z6 = z7;
                        string = str4;
                    }
                } catch (Exception e8) {
                    str2 = "";
                    str3 = string2;
                    z6 = z7;
                    string = str4;
                }
            } catch (Exception e9) {
                str2 = "";
                str3 = "";
                string = str4;
            }
            str = string;
            str4 = str3;
        } else {
            str = "";
            str2 = "";
        }
        ?? obj = new Object();
        obj.f73532a = Boolean.valueOf(z6);
        obj.f73533b = str4;
        obj.f73534c = str2;
        obj.f73535d = str;
        return new HomeDowngradeConfig(obj, null);
    }

    public void clearServiceCache() {
        synchronized (this) {
            this.f73526c = null;
            this.f73527d = null;
        }
    }

    public abstract OAuthAccountService createAccountService();

    public abstract ConfigService createConfigService();

    public abstract SentinelXXX createSentinelService();

    public OAuthAccountService getAccountService() {
        return (OAuthAccountService) getService("account");
    }

    public ConfigService getConfigService() {
        return (ConfigService) getService("config");
    }

    public HomeDowngradeConfig getHomeDowngradeConfig() {
        return (HomeDowngradeConfig) getService(HOME_DOWNGRADE);
    }

    public SentinelXXX getSentinelService() {
        return (SentinelXXX) getService("sentinel");
    }

    public Object getService(String str) {
        synchronized (this) {
            if ("config".equals(str)) {
                if (this.f73524a == null) {
                    this.f73524a = createConfigService();
                }
                return this.f73524a;
            }
            if ("account".equals(str)) {
                if (this.f73525b == null) {
                    this.f73525b = createAccountService();
                }
                return this.f73525b;
            }
            if ("sentinel".equals(str)) {
                if (this.f73526c == null) {
                    this.f73526c = createSentinelService();
                }
                return this.f73526c;
            }
            if (HOME_DOWNGRADE.equals(str)) {
                if (this.f73527d == null) {
                    this.f73527d = a();
                }
                return this.f73527d;
            }
            BLog.e("unknown service \"" + str + "\"");
            return null;
        }
    }

    public abstract void stop();
}
