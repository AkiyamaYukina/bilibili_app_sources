package com.bilibili.studio.comm.ab;

import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/ab/ABManager.class */
public final class ABManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Map<String, String> f105341a = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(@org.jetbrains.annotations.NotNull com.bilibili.studio.comm.ab.a r3) {
        /*
            java.util.Map<java.lang.String, java.lang.String> r0 = com.bilibili.studio.comm.ab.ABManager.f105341a
            r4 = r0
            r0 = r3
            java.lang.String r0 = r0.a()
            r5 = r0
            r0 = r4
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L22
            r0 = r5
            r4 = r0
            r0 = r5
            int r0 = r0.length()
            if (r0 != 0) goto L27
        L22:
            r0 = r3
            java.lang.String r0 = r0.f105344c
            r4 = r0
        L27:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.comm.ab.ABManager.a(com.bilibili.studio.comm.ab.a):java.lang.String");
    }

    public static void b(a[] aVarArr) {
        Application application = BiliContext.application();
        if (application == null) {
            return;
        }
        BiliGlobalPreferenceHelper biliGlobalPreferenceHelper = BiliGlobalPreferenceHelper.getInstance(application);
        for (a aVar : aVarArr) {
            String strA = aVar.a();
            String str = "";
            String strOptString = biliGlobalPreferenceHelper.optString(aVar.a(), "");
            Map<String, String> map = f105341a;
            if (strOptString != null) {
                str = strOptString;
            }
            map.put(strA, str);
        }
    }

    public static void c(a[] aVarArr, List list) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : aVarArr) {
            arrayList.add(aVar.f105342a);
        }
        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new ABManager$getDataFromNet$1(arrayList, list, aVarArr, null), 3, (Object) null);
    }

    public static void d(@NotNull a[] aVarArr) {
        b(aVarArr);
        c(aVarArr, CollectionsKt.emptyList());
    }

    public static boolean e(@NotNull a aVar) {
        return Intrinsics.areEqual(ArraysKt.getOrNull(aVar.f105343b, 0), a(aVar));
    }

    public static boolean f(@NotNull a aVar) {
        return Intrinsics.areEqual(ArraysKt.getOrNull(aVar.f105343b, 1), a(aVar));
    }

    public static boolean g(@NotNull a aVar) {
        return Intrinsics.areEqual(ArraysKt.getOrNull(aVar.f105343b, 2), a(aVar));
    }
}
