package com.bilibili.studio.comm.manager;

import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/IGVEntranceManager.class */
public final class IGVEntranceManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static List<Function0<Unit>> f105375b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final IGVEntranceManager f105374a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ConcurrentHashMap<String, String> f105376c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @JvmField
    @NotNull
    public static String f105377d = CaptureSchema.OLD_INVALID_ID_STRING;

    public static final void a() {
        synchronized (f105374a) {
            List<Function0<Unit>> list = f105375b;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
            }
            f105375b = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(com.bilibili.studio.comm.manager.IGVEntranceManager r4, java.lang.String r5) {
        /*
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = com.bilibili.studio.comm.manager.IGVEntranceManager.f105376c
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L26
            r0 = r6
            int r0 = r0.length()
            if (r0 <= 0) goto L1e
            goto L20
        L1e:
            r0 = 0
            r6 = r0
        L20:
            r0 = r6
            r4 = r0
            r0 = r6
            if (r0 != 0) goto L3f
        L26:
            android.app.Application r0 = com.bilibili.base.BiliContext.application()
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L34
            java.lang.String r0 = ""
            r4 = r0
            goto L3f
        L34:
            r0 = r4
            com.bilibili.base.BiliGlobalPreferenceHelper r0 = com.bilibili.base.BiliGlobalPreferenceHelper.getInstance(r0)
            r1 = r5
            java.lang.String r2 = ""
            java.lang.String r0 = r0.optString(r1, r2)
            r4 = r0
        L3f:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.comm.manager.IGVEntranceManager.b(com.bilibili.studio.comm.manager.IGVEntranceManager, java.lang.String):java.lang.String");
    }

    public static void c() {
        BuildersKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), (CoroutineStart) null, new IGVEntranceManager$init$1(null), 2, (Object) null);
    }
}
