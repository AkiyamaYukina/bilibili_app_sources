package com.bilibili.upper.module.honour.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.upper.module.honour.bean.KingHonourDownloadBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f113335d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static a f113337f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f113332a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static List<KingHonourDownloadBean> f113333b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final List<c> f113334c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final List<KingHonourDownloadBean> f113336e = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/b$a.class */
    public interface a {
        void a(@NotNull List<KingHonourDownloadBean> list);
    }

    public static void b() {
        int i7 = f113335d + 1;
        f113335d = i7;
        if (i7 >= ((ArrayList) f113333b).size()) {
            a aVar = f113337f;
            if (aVar != null) {
                aVar.a(f113336e);
            }
            ((ArrayList) f113336e).clear();
            f113335d = 0;
        }
    }

    public final void a() {
        try {
            Iterator it = ((ArrayList) f113334c).iterator();
            while (it.hasNext()) {
                ((c) it.next()).c();
            }
        } catch (Exception e7) {
        }
        f113337f = null;
        c();
    }

    public final void c() {
        synchronized (this) {
            ((ArrayList) f113334c).clear();
            ((ArrayList) f113336e).clear();
            f113335d = 0;
        }
    }

    @NotNull
    public final void d(@NotNull List list) {
        if (((ArrayList) f113333b).size() > 0) {
            ((ArrayList) f113333b).clear();
        }
        f113333b = list;
    }

    public final void e() {
        try {
            for (c cVar : (ArrayList) f113334c) {
                Object obj = ((LinkedHashMap) cVar.f113341d).get("downloadUrl");
                String str = obj instanceof String ? (String) obj : null;
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                if (str2.length() != 0) {
                    Iterator<T> it = f113333b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.areEqual(str2, ((KingHonourDownloadBean) it.next()).getUrl())) {
                                break;
                            }
                        } else {
                            cVar.c();
                            break;
                        }
                    }
                }
            }
        } catch (Exception e7) {
        }
        c();
        ArrayList<KingHonourDownloadBean> arrayList = (ArrayList) f113333b;
        if (arrayList.isEmpty()) {
            return;
        }
        for (KingHonourDownloadBean kingHonourDownloadBean : arrayList) {
            BLog.e("KingHonourManager", "KING_DEBUG, downloadMaterials, item.url :" + kingHonourDownloadBean.getUrl());
            c cVar2 = new c();
            if (!kingHonourDownloadBean.isPreload()) {
                cVar2.f113339b = new com.bilibili.upper.module.honour.utils.a(cVar2);
                cVar2.f113340c = new com.bilibili.upper.module.honour.utils.a(cVar2);
            }
            BuildersKt.launch$default(cVar2.f113338a, (CoroutineContext) null, (CoroutineStart) null, new KingHonourDownloaderHelper$downloadMaterial$1(kingHonourDownloadBean, cVar2, null), 3, (Object) null);
            ((ArrayList) f113334c).add(cVar2);
        }
    }
}
