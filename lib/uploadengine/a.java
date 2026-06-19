package com.bilibili.lib.uploadengine;

import G.p;
import WQ.K;
import Xf0.C3107m;
import Xf0.C3108n;
import Xf0.InterfaceC3111q;
import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.upload.UploadEngine;
import com.bilibili.lib.upload.UploadTaskState;
import com.bilibili.lib.uploadengine.BiliUploadTask;
import com.bilibili.search2.api.SearchBangumiItem;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ng0.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg0.C8808b;
import vg0.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/uploadengine/a.class */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f65023c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f65021a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final AtomicBoolean f65022b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C3107m f65024d = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.lib.uploadengine.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [Xf0.m, java.lang.Object] */
    static {
        f65023c = "";
        f65023c = p.a(BiliContext.application().getFilesDir().toString(), File.separator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC3111q b(String str, int i7, String str2, String str3, Function1 function1) {
        a aVar = f65021a;
        if ((i7 & 16) != 0) {
            function1 = null;
        }
        return aVar.a(str, str2, str3, "", function1);
    }

    public static void c(String str) {
        if (((Boolean) c.f128205I.getValue()).booleanValue()) {
            for (InterfaceC3111q interfaceC3111q : BiliUploadTask.Companion.b()) {
                if (str.length() != 0 && str.equals(interfaceC3111q.getTaskId())) {
                    C8808b.a("[Upload SDK] deleteNewTaskById from cache and db");
                    interfaceC3111q.delete();
                    return;
                }
            }
            C8808b.a("[Upload SDK] deleteNewTaskById from db");
            BiliUploadTask biliUploadTaskA = BiliUploadTask.Companion.a(new BiliUploadTask.a(null, str, null, null, null, 0, null, SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY));
            if (biliUploadTaskA == null || !biliUploadTaskA.isTaskValid()) {
                return;
            }
            biliUploadTaskA.delete();
        }
    }

    public static void d(String str) {
        Object obj;
        for (f fVar : f.f124147r.values()) {
            if (fVar != null && Intrinsics.areEqual(String.valueOf(fVar.f124149b.f124196a), str)) {
                C8808b.a("deleteOldTaskById from cache，taskId=" + str);
                fVar.delete();
                return;
            }
        }
        C8808b.a("deleteOldTaskById from db,taskId=" + str);
        try {
            Result.Companion companion = Result.Companion;
            f.c cVar = new f.c(BiliContext.application(), Long.parseLong(str));
            Unit unit = null;
            f fVarA = f.a(cVar, null);
            if (fVarA != null) {
                fVarA.delete();
                unit = Unit.INSTANCE;
            }
            obj = Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            th2.getMessage();
        }
    }

    @NotNull
    public static Collection f() {
        Collection<f> collectionValues = f.f124147r.values();
        Collection<InterfaceC3111q> collectionB = BiliUploadTask.Companion.b();
        C8808b.a("getUploadTaskList oldTaskCount=" + collectionValues.size() + ",newTaskCount=" + collectionB.size());
        return CollectionsKt.plus(collectionValues, collectionB);
    }

    public static boolean g() {
        boolean z6;
        boolean z7;
        Collection<f> collectionValues = f.f124147r.values();
        if (collectionValues.isEmpty()) {
            z6 = false;
        } else {
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((f) it.next()).f124153f) {
                    z6 = true;
                    break;
                }
            }
            z6 = false;
        }
        Collection<InterfaceC3111q> collectionB = BiliUploadTask.Companion.b();
        if ((collectionB instanceof Collection) && collectionB.isEmpty()) {
            z7 = false;
        } else {
            Iterator<T> it2 = collectionB.iterator();
            while (it2.hasNext()) {
                if (((InterfaceC3111q) it2.next()).isRunning()) {
                    z7 = true;
                    break;
                }
            }
            z7 = false;
        }
        boolean z8 = true;
        if (!z6) {
            z8 = z7;
        }
        return z8;
    }

    @Nullable
    public final InterfaceC3111q a(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String str4, @Nullable Function1<? super String, Unit> function1) {
        Application application;
        InterfaceC3111q interfaceC3111qA;
        if (str == null || str.length() == 0 || (application = BiliContext.application()) == null) {
            return null;
        }
        if (((Boolean) c.f128204H.getValue()).booleanValue() && ((Boolean) c.f128205I.getValue()).booleanValue()) {
            BiliUploadTask.a aVar = new BiliUploadTask.a(str, null, str2, str3, str4, 0, new K(function1, 1), 34);
            h();
            interfaceC3111qA = BiliUploadTask.Companion.a(aVar);
        } else {
            f.c cVar = new f.c(application, str);
            cVar.f124168c = str3;
            cVar.f124167b = str2;
            cVar.f124171f = str4;
            interfaceC3111qA = f.a(cVar, new C3108n(function1));
        }
        return interfaceC3111qA;
    }

    public final void e(@NotNull String str, boolean z6) {
        synchronized (this) {
            if (str.length() != 0 && !Intrinsics.areEqual(str, "0")) {
                if (z6) {
                    c(str);
                } else {
                    d(str);
                }
            }
        }
    }

    public final void h() {
        synchronized (this) {
            if (((Boolean) c.f128205I.getValue()).booleanValue() && !f65022b.get()) {
                Map<String, String> uploadEngineConfig = UploadEngine.getUploadEngineConfig();
                String str = f65023c + "upload_task";
                if (uploadEngineConfig == null || uploadEngineConfig.isEmpty()) {
                    UploadEngine.getInstance(uploadEngineConfig, str);
                } else {
                    HashMap map = new HashMap();
                    for (String str2 : uploadEngineConfig.keySet()) {
                        String strDd = DeviceDecision.INSTANCE.dd(str2, uploadEngineConfig.get(str2));
                        String str3 = strDd;
                        if (strDd == null) {
                            str3 = "";
                        }
                        map.put(str2, str3);
                    }
                    UploadEngine.getInstance(map, str);
                }
                UploadEngine.getInstance().setReport(f65024d);
                long jMid = BiliAccounts.get(BiliContext.application()).mid();
                Map<String, UploadTaskState> allTaskState = UploadEngine.getInstance().getAllTaskState(jMid);
                C8808b.a("[Upload SDK] initUploadSDK mid=" + jMid + ",allTaskState=" + (allTaskState != null ? Integer.valueOf(allTaskState.size()) : null));
                if (allTaskState != null && !allTaskState.isEmpty()) {
                    Iterator<String> it = allTaskState.keySet().iterator();
                    while (it.hasNext()) {
                        UploadTaskState uploadTaskState = allTaskState.get(it.next());
                        C8808b.a("[Upload SDK] initUploadSDK taskState=" + (uploadTaskState != null ? uploadTaskState.task_id_ : null) + "," + (uploadTaskState != null ? Long.valueOf(uploadTaskState.context_id_) : null));
                    }
                }
                f65022b.set(true);
            }
        }
    }

    @Nullable
    public final InterfaceC3111q i(@NotNull String str, boolean z6) {
        Application application;
        InterfaceC3111q interfaceC3111qA;
        if (str.length() == 0 || (application = BiliContext.application()) == null) {
            return null;
        }
        if (!z6) {
            interfaceC3111qA = f.a(new f.c(application, Long.parseLong(str)), null);
        } else if (((Boolean) c.f128205I.getValue()).booleanValue()) {
            h();
            interfaceC3111qA = BiliUploadTask.Companion.a(new BiliUploadTask.a(null, str, null, null, null, 0, null, SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY));
        } else {
            interfaceC3111qA = null;
        }
        return interfaceC3111qA;
    }
}
