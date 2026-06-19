package com.bilibili.studio.editor.smarttitle;

import J3.A0;
import J3.B0;
import J3.C0;
import J3.D0;
import J3.E0;
import J3.F0;
import ZA0.a;
import androidx.compose.foundation.C3792u0;
import bA0.C4936c;
import bA0.e;
import bA0.g;
import com.bilibili.adcommon.utils.i;
import com.bilibili.studio.editor.smarttitle.constans.SmartTitleFawkesConfig;
import com.bilibili.studio.editor.smarttitle.constans.SmartTitleType;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.upper.module.contribute.up.ai.title.f;
import com.bilibili.upper.module.contribute.up.ai.title.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/c.class */
@Deprecated(message = "智能标题功能去除，后续如有关联代码可逐步删除")
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f108226a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a.C0157a f108227b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C4936c f108228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final e f108229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final g f108230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Lazy f108231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Lazy f108232g;

    @NotNull
    public static final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Lazy f108233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Lazy f108234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Lazy f108235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Lazy f108236l;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.studio.editor.smarttitle.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ZA0.a$a, java.lang.Object] */
    static {
        C4936c c4936c = new C4936c();
        f108228c = c4936c;
        e eVar = new e();
        f108229d = eVar;
        f108230e = new g(c4936c, eVar);
        f108231f = LazyKt.lazy(new A0(10));
        f108232g = LazyKt.lazy(new B0(10));
        h = LazyKt.lazy(new C0(10));
        f108233i = LazyKt.lazy(new D0(10));
        f108234j = LazyKt.lazy(new E0(9));
        f108235k = LazyKt.lazy(new F0(9));
        f108236l = LazyKt.lazy(new AT0.c(13));
    }

    public static boolean a() {
        return ((Boolean) f108231f.getValue()).booleanValue();
    }

    public static boolean b() {
        return ((Boolean) f108233i.getValue()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f108234j.getValue()).booleanValue();
    }

    public static boolean d() {
        return ((Boolean) h.getValue()).booleanValue();
    }

    public static void e(String str, SmartTitleType smartTitleType, String str2, f fVar, com.bilibili.upper.module.contribute.up.ai.title.g gVar) {
        SmartTitleFawkesConfig.SmartTitleConfig smartTitleConfig;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        a aVar = new a(atomicBoolean, str2, gVar, fVar);
        i.a("querySmartTitleByStyle[", str2, "],registerResultCallback,waiting for callback,project=", str, "BiliEditorSmartTitle");
        e eVar = f108229d;
        synchronized (eVar) {
            String str3 = str + "_" + smartTitleType;
            ConcurrentHashMap<String, List<e.a>> concurrentHashMap = eVar.f54461b.get(str3);
            ConcurrentHashMap<String, List<e.a>> concurrentHashMap2 = concurrentHashMap;
            if (concurrentHashMap == null) {
                concurrentHashMap2 = new ConcurrentHashMap<>();
            }
            List<e.a> list = concurrentHashMap2.get(str2);
            List<e.a> listSynchronizedList = list;
            if (list == null) {
                listSynchronizedList = Collections.synchronizedList(new ArrayList());
            }
            listSynchronizedList.add(aVar);
            concurrentHashMap2.put(str2, listSynchronizedList);
            eVar.f54461b.put(str3, concurrentHashMap2);
        }
        SmartTitleFawkesConfig smartTitleFawkesConfig = (SmartTitleFawkesConfig) f108236l.getValue();
        BuildersKt.launch$default(f108227b, Dispatchers.getIO(), (CoroutineStart) null, new BiliEditorSmartTitle$registerCallbackAndWaitingSmartTitle$1((smartTitleFawkesConfig == null || (smartTitleConfig = smartTitleFawkesConfig.smartTitleConfig) == null) ? 10000L : smartTitleConfig.defaultLimitTime, atomicBoolean, str2, str, smartTitleType, aVar, gVar, null), 2, (Object) null);
    }

    public static void f(Zz0.a aVar, SmartTitleType smartTitleType, h hVar, com.bilibili.upper.module.contribute.up.ai.title.i iVar) {
        SmartTitleFawkesConfig.SmartTitleConfig smartTitleConfig;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        b bVar = new b(atomicBoolean, aVar, iVar, hVar);
        BLog.e("BiliEditorSmartTitle", "querySmartTitleStyles[" + smartTitleType + "],registerStyleCallback,waiting for callback");
        String str = aVar.f29846a;
        e eVar = f108229d;
        if (str != null && str.length() != 0) {
            eVar.c(aVar.f29846a, smartTitleType, bVar);
        }
        String str2 = aVar.f29847b;
        if (str2 != null && str2.length() != 0) {
            eVar.c(str2, smartTitleType, bVar);
        }
        String str3 = aVar.f29848c;
        if (str3 != null && str3.length() != 0) {
            eVar.c(str3, smartTitleType, bVar);
        }
        SmartTitleFawkesConfig smartTitleFawkesConfig = (SmartTitleFawkesConfig) f108236l.getValue();
        BuildersKt.launch$default(f108227b, Dispatchers.getIO(), (CoroutineStart) null, new BiliEditorSmartTitle$registerCallbackAndWaitingStyle$1((smartTitleFawkesConfig == null || (smartTitleConfig = smartTitleFawkesConfig.smartTitleConfig) == null) ? 10000L : smartTitleConfig.defaultLimitTime, atomicBoolean, smartTitleType, aVar, bVar, iVar, null), 2, (Object) null);
    }

    public final void g(boolean z6) {
        synchronized (this) {
            CoroutineScopeKt.cancel$default(f108227b, (CancellationException) null, 1, (Object) null);
            C4936c c4936c = f108228c;
            synchronized (c4936c) {
                Iterator<Map.Entry<String, Zz0.b>> it = c4936c.f54459a.entrySet().iterator();
                while (it.hasNext()) {
                    it.next().getValue().d(Boolean.valueOf(z6));
                }
            }
            g gVar = f108230e;
            synchronized (gVar) {
                if (gVar.f54465d.get()) {
                    BiliTemplateEngineManager biliTemplateEngineManager = gVar.f54464c;
                    biliTemplateEngineManager.e(false, false, new C3792u0(biliTemplateEngineManager, 1));
                    gVar.f54464c.k();
                    gVar.f54465d.set(false);
                }
            }
            e eVar = f108229d;
            synchronized (eVar) {
                eVar.f54460a.clear();
                eVar.f54461b.clear();
            }
        }
    }

    public final void h(@NotNull String str, @NotNull SmartTitleType smartTitleType, @NotNull Zz0.e eVar) {
        synchronized (this) {
            if (a() && (!a() || d())) {
                f108230e.a(str, smartTitleType, eVar);
                return;
            }
            BLog.e("BiliEditorSmartTitle", "startSmartTitleTask error,enableSmartTitle=false");
        }
    }
}
