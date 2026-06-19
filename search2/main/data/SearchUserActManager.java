package com.bilibili.search2.main.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.dd.DeviceDecision;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/SearchUserActManager.class */
@StabilityInferred(parameters = 0)
public final class SearchUserActManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<a> f86794a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Gson f86795b = new Gson();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final CoroutineScope f86796c = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Object f86797d = new Object();

    public static void a(@NotNull a aVar) {
        BuildersKt.launch$default(f86796c, (CoroutineContext) null, (CoroutineStart) null, new SearchUserActManager$addUserAct$1(aVar, null), 3, (Object) null);
    }

    @NotNull
    public static String b() {
        List listC;
        if (!DeviceDecision.INSTANCE.getBoolean("list.search.searching_behavior_report", true)) {
            return "";
        }
        synchronized (f86797d) {
            listC = c();
            Unit unit = Unit.INSTANCE;
        }
        return f86795b.toJson(new n(listC));
    }

    public static List c() {
        List<a> list = f86794a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : (ArrayList) list) {
            c cVar = ((a) obj).f86798a;
            Object obj2 = linkedHashMap.get(cVar);
            Object arrayList = obj2;
            if (obj2 == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVar, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            c cVar2 = (c) entry.getKey();
            List list2 = (List) entry.getValue();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                j jVar = ((a) it.next()).f86799b;
                j jVar2 = null;
                if (jVar != null) {
                    String strB = jVar.b();
                    jVar2 = null;
                    if (!(strB == null || strB.length() == 0)) {
                        jVar2 = null;
                        if (jVar.a() > 0) {
                            jVar2 = jVar;
                        }
                    }
                }
                if (jVar2 != null) {
                    arrayList3.add(jVar2);
                }
            }
            ArrayList arrayList4 = arrayList3;
            if (arrayList3.isEmpty()) {
                arrayList4 = null;
            }
            arrayList2.add(new b(cVar2, arrayList4));
        }
        return arrayList2;
    }
}
