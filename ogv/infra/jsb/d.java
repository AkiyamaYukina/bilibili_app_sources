package com.bilibili.ogv.infra.jsb;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.common.webview.js.JsBridgeCallHandlerFactoryV2;
import com.bilibili.common.webview.js.JsBridgeCallHandlerV2;
import com.bilibili.common.webview.js.JsbProxy;
import com.bilibili.ogv.infra.jsb.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/jsb/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<g> f67875a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HashMap<String, JsBridgeCallHandlerFactoryV2> f67876b = new HashMap<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/jsb/d$a.class */
    public static final class a extends JsBridgeCallHandlerV2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f67877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CoroutineScope f67878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<g> f67879c;

        /* JADX INFO: renamed from: com.bilibili.ogv.infra.jsb.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/jsb/d$a$a.class */
        public static final class C0394a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
            public final void handleException(CoroutineContext coroutineContext, Throwable th) {
                com.bilibili.ogv.infra.util.e.b(new IllegalStateException("JSB invocation error!", th));
            }
        }

        public a(ArrayList<g> arrayList) {
            this.f67879c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList2, ((g) it.next()).getMethodNames());
            }
            this.f67877a = (String[]) arrayList2.toArray(new String[0]);
            this.f67878b = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(new AbstractCoroutineContextElement(CoroutineExceptionHandler.Key)));
        }

        public final String[] getSupportFunctions() {
            return this.f67877a;
        }

        public final String getTag() {
            return "com.bilibili.ogv.jsb";
        }

        public final void invokeNative(String str, JSONObject jSONObject, String str2) {
            Object next;
            Iterator<T> it = this.f67879c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((HashSet) ((g) next).getMethodNames()).contains(str)) {
                        break;
                    }
                }
            }
            g gVar = (g) next;
            if (gVar != null) {
                gVar.a(this, str, jSONObject, str2, this.f67878b);
                return;
            }
            com.bilibili.ogv.infra.util.e.b(new IllegalStateException(("Method " + str + " not found!").toString()));
        }

        public final void release() {
            CoroutineScopeKt.cancel$default(this.f67878b, (CancellationException) null, 1, (Object) null);
        }
    }

    @NotNull
    public final void a(@NotNull f fVar, @NotNull String str) {
        this.f67875a.add(new e(fVar, str));
    }

    public final void b(@NotNull JsbProxy jsbProxy) {
        for (Map.Entry entry : ((HashMap) c()).entrySet()) {
            jsbProxy.registerBuiltin((String) entry.getKey(), (JsBridgeCallHandlerFactoryV2) entry.getValue());
        }
    }

    @NotNull
    public final Map<String, JsBridgeCallHandlerFactoryV2> c() {
        HashMap map = new HashMap();
        map.putAll(this.f67876b);
        HashMap map2 = new HashMap();
        for (g gVar : this.f67875a) {
            String name = gVar.getName();
            Object obj = map2.get(name);
            Object arrayList = obj;
            if (obj == null) {
                arrayList = new ArrayList();
                map2.put(name, arrayList);
            }
            ((Collection) arrayList).add(gVar);
        }
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            final ArrayList arrayList2 = (ArrayList) entry.getValue();
            map.put(str, new JsBridgeCallHandlerFactoryV2(arrayList2) { // from class: com.bilibili.ogv.infra.jsb.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ArrayList f67874a;

                {
                    this.f67874a = arrayList2;
                }

                public final JsBridgeCallHandlerV2 create() {
                    return new d.a(this.f67874a);
                }
            });
        }
        return map;
    }
}
