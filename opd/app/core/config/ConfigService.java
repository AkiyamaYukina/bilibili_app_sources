package com.bilibili.opd.app.core.config;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.List;
import wn0.InterfaceC8901a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/core/config/ConfigService.class */
public interface ConfigService {
    public static final String ANY = "*";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/core/config/ConfigService$a.class */
    public interface a {
        void a();
    }

    void addListener(String str, InterfaceC8901a interfaceC8901a);

    JSONObject dump();

    boolean getBoolean(String str, boolean z6);

    double getDouble(String str, double d7);

    int getInt(String str, int i7);

    JSONArray getJsonArray(String str);

    JSONObject getJsonObject(String str);

    Object getObject(String str, Class<?> cls);

    <T> List<T> getObjectArray(String str, Class<T> cls);

    String getString(String str, String str2);

    boolean isValid();

    void refresh();

    void refresh(a aVar);

    void refresh(boolean z6);

    boolean refreshSync();

    void removeListener(String str, InterfaceC8901a interfaceC8901a);
}
