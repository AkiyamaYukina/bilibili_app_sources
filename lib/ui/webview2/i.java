package com.bilibili.lib.ui.webview2;

import android.webkit.JavascriptInterface;
import androidx.annotation.VisibleForTesting;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/i.class */
public final class i extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, List<b>> f64989c = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Set<Class<? extends b>>> f64988b = new HashMap();

    public static boolean f(Method method) {
        Class<?>[] parameterTypes;
        if (method.isAnnotationPresent(JavascriptInterface.class)) {
            return (method.getReturnType() == JSONObject.class || method.getReturnType() == JSONArray.class) && (parameterTypes = method.getParameterTypes()) != null && parameterTypes.length == 1 && parameterTypes[0] == JSONObject.class;
        }
        return false;
    }

    @Override // com.bilibili.lib.ui.webview2.b
    public final void a() {
        Iterator it = ((HashMap) this.f64989c).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).a();
            }
        }
    }

    @Override // com.bilibili.lib.ui.webview2.b
    public final void b() {
        Iterator it = ((HashMap) this.f64989c).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).b();
            }
        }
    }

    @Override // com.bilibili.lib.ui.webview2.b
    public final void d() {
        Iterator it = ((HashMap) this.f64989c).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).d();
            }
        }
    }

    @VisibleForTesting
    public final void e(String str, b bVar) {
        List list = (List) ((HashMap) this.f64989c).get(str);
        List arrayList = list;
        if (list == null) {
            arrayList = new ArrayList();
            ((HashMap) this.f64989c).put(str, arrayList);
        }
        arrayList.add(bVar);
    }
}
