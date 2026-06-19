package com.bilibili.search2.eastereggs;

import Di0.C1600d;
import I1.C2157f0;
import J1.z;
import android.app.Application;
import android.content.SharedPreferences;
import androidx.appcompat.widget.C3259x;
import androidx.compose.animation.core.C3308a0;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.O;
import com.alibaba.fastjson.JSON;
import com.bapis.bilibili.app.search.v2.SearchEggInfos;
import com.bilibili.base.BiliContext;
import com.bilibili.base.connectivity.Connectivity;
import com.bilibili.fd_service.FreeDataManager;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.resmanager.DownloadBizType;
import com.bilibili.lib.resmanager.ResCallback;
import com.bilibili.lib.resmanager.ResDownloadRequest;
import com.bilibili.lib.resmanager.ResManager;
import com.bilibili.lib.resmanager.ResRequest;
import com.bilibili.lib.stagger.KeyType;
import com.bilibili.search2.api.SearchEasterEggConfig;
import com.bilibili.search2.api.SearchEasterEggItem;
import com.bilibili.search2.utils.B;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import mf0.C7993h;
import mf0.InterfaceC7988c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/SearchLocalDataManager.class */
@StabilityInferred(parameters = 0)
public final class SearchLocalDataManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static final SharedPrefX f86501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static volatile Job f86502b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/SearchLocalDataManager$a.class */
    public static final class a implements ResCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchEasterEggItem f86503a;

        public a(SearchEasterEggItem searchEasterEggItem) {
            this.f86503a = searchEasterEggItem;
        }

        @Override // com.bilibili.lib.resmanager.ResCallback
        public final void onFailure(int i7, String str) {
            SharedPreferences.Editor editorEdit;
            k.a("res download Failed", str == null ? "" : str);
            Xs0.b.f(String.valueOf(i7), str);
            SharedPrefX sharedPrefX = SearchLocalDataManager.f86501a;
            int id = this.f86503a.getId();
            SharedPrefX sharedPrefX2 = SearchLocalDataManager.f86501a;
            if (sharedPrefX2 == null || (editorEdit = sharedPrefX2.edit()) == null) {
                return;
            }
            String strA = C3259x.a(id, "prefix_egg_download_failed_count_");
            SharedPrefX sharedPrefX3 = SearchLocalDataManager.f86501a;
            int i8 = 0;
            if (sharedPrefX3 != null) {
                i8 = sharedPrefX3.getInt("prefix_egg_download_failed_count_" + id, 0);
            }
            SharedPreferences.Editor editorPutInt = editorEdit.putInt(strA, i8 + 1);
            if (editorPutInt != null) {
                editorPutInt.apply();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
        @Override // com.bilibili.lib.resmanager.ResCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onSuccess(com.bilibili.lib.resmanager.ResResponse r14) {
            /*
                r13 = this;
                r0 = r14
                java.lang.String r0 = r0.getPath()
                r16 = r0
                java.lang.String r0 = ""
                r15 = r0
                r0 = r16
                r14 = r0
                r0 = r16
                if (r0 != 0) goto L11
                java.lang.String r0 = ""
                r14 = r0
            L11:
                java.lang.String r0 = "res download success"
                r1 = r14
                com.bilibili.search2.eastereggs.k.a(r0, r1)
                com.bilibili.lib.blkv.SharedPrefX r0 = com.bilibili.search2.eastereggs.SearchLocalDataManager.f86501a
                r14 = r0
                java.util.List r0 = com.bilibili.search2.eastereggs.SearchLocalDataManager.f()
                r14 = r0
                r0 = r14
                if (r0 == 0) goto L31
                r0 = r14
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r0)
                r16 = r0
                r0 = r16
                r14 = r0
                r0 = r16
                if (r0 != 0) goto L39
            L31:
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r14 = r0
            L39:
                r0 = r13
                com.bilibili.search2.api.SearchEasterEggItem r0 = r0.f86503a
                r16 = r0
                r0 = r14
                r1 = r16
                boolean r0 = r0.add(r1)
                r0 = r14
                com.bilibili.search2.eastereggs.SearchLocalDataManager.m(r0)
                r0 = r16
                java.lang.String r0 = com.bilibili.search2.eastereggs.SearchLocalDataManager.e(r0)
                r1 = r16
                java.lang.String r1 = r1.getHash()
                com.bilibili.search2.eastereggs.q r0 = com.bilibili.search2.eastereggs.SearchLocalDataManager.j(r0, r1)
                r16 = r0
                java.lang.String r0 = "switch4GUnable"
                boolean r1 = com.bilibili.search2.eastereggs.s.f86534b
                java.lang.String r1 = java.lang.String.valueOf(r1)
                kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
                r17 = r0
                android.app.Application r0 = com.bilibili.base.BiliContext.application()
                r14 = r0
                r0 = r14
                if (r0 != 0) goto L70
                r0 = r15
                r14 = r0
                goto L8c
            L70:
                com.bilibili.fd_service.FreeDataManager r0 = com.bilibili.fd_service.FreeDataManager.getInstance()
                boolean r0 = r0.isTf()
                if (r0 == 0) goto L89
                r0 = r14
                android.net.NetworkInfo r0 = com.bilibili.base.connectivity.Connectivity.getWifiNetworkInfo(r0)
                boolean r0 = com.bilibili.base.connectivity.Connectivity.isConnected(r0)
                if (r0 == 0) goto L89
                java.lang.String r0 = "2"
                r14 = r0
                goto L8c
            L89:
                java.lang.String r0 = "1"
                r14 = r0
            L8c:
                java.lang.String r0 = "list.search.egg.downloadSuccess"
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 3
                kotlin.Pair[] r7 = new kotlin.Pair[r7]
                r8 = r7
                r9 = 0
                r10 = r17
                r8[r9] = r10
                r8 = r7
                r9 = 1
                java.lang.String r10 = "network"
                r11 = r14
                kotlin.Pair r10 = kotlin.TuplesKt.to(r10, r11)
                r8[r9] = r10
                r8 = r7
                r9 = 2
                java.lang.String r10 = "fileExist"
                r11 = r16
                boolean r11 = r11.f86527c
                java.lang.String r11 = java.lang.String.valueOf(r11)
                kotlin.Pair r10 = kotlin.TuplesKt.to(r10, r11)
                r8[r9] = r10
                java.util.Map r7 = kotlin.collections.MapsKt.mapOf(r7)
                AT0.c r8 = new AT0.c
                r9 = r8
                r10 = 8
                r9.<init>(r10)
                r9 = 126(0x7e, float:1.77E-43)
                r10 = 0
                com.bilibili.lib.neuron.api.Neurons.trackCustom$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.eastereggs.SearchLocalDataManager.a.onSuccess(com.bilibili.lib.resmanager.ResResponse):void");
        }
    }

    static {
        Application application = BiliContext.application();
        if (application != null) {
            f86501a = BLKV.getBLSharedPreferences(application, "search_instance", true, 4096);
        }
    }

    public static final void a(SearchEggInfos searchEggInfos) {
        BLog.i("SearchLocalDataManager", "start download res");
        if (androidx.appcompat.app.n.a(Thread.currentThread())) {
            throw new IllegalStateException("Check failed.");
        }
        List eggInfoOrBuilderList = searchEggInfos.getEggInfoOrBuilderList();
        if (eggInfoOrBuilderList == null) {
            return;
        }
        for (com.bapis.bilibili.app.search.v2.k kVar : SequencesKt.filter(SequencesKt.filterNotNull(CollectionsKt.asSequence(eggInfoOrBuilderList)), new C3308a0(1))) {
            if (ResManager.isFileExist(new ResRequest(kVar.getUrl(), kVar.getMd5()))) {
                j4.o.a("download cancel file is exist, url:", kVar.getUrl(), " hash:", kVar.getMd5(), "SearchLocalDataManager");
            } else {
                boolean zDownloadSync = ResManager.downloadSync(new ResDownloadRequest(kVar.getUrl(), kVar.getMd5()).bizType(DownloadBizType.SearchEgg).md5(kVar.getMd5()).downloadTag("search_egg"));
                String url = kVar.getUrl();
                bilibili.live.app.service.resolver.b.a(C1600d.b("download success:", " url:", url, " hash:", zDownloadSync), kVar.getMd5(), "SearchLocalDataManager");
            }
        }
    }

    @JvmStatic
    public static final void b(@NotNull SearchEasterEggItem searchEasterEggItem) {
        SharedPreferences.Editor editorEdit;
        if (FreeDataManager.getInstance().isTf() || Connectivity.isConnected(Connectivity.getWifiNetworkInfo(BiliContext.application())) || searchEasterEggItem.canPrefetch()) {
            int id = searchEasterEggItem.getId();
            SharedPrefX sharedPrefX = f86501a;
            if (sharedPrefX != null && (editorEdit = sharedPrefX.edit()) != null) {
                SharedPreferences.Editor editorPutBoolean = editorEdit.putBoolean("prefix_egg_has_pre_download_" + id, true);
                if (editorPutBoolean != null) {
                    editorPutBoolean.apply();
                }
            }
            String strE = e(searchEasterEggItem);
            int id2 = searchEasterEggItem.getId();
            DownloadBizType downloadBizType = DownloadBizType.SearchEgg;
            long maxSize = downloadBizType.getMaxSize();
            long maxSize2 = downloadBizType.getMaxSize();
            long totalSize = ResManager.getTotalSize(downloadBizType);
            long size = searchEasterEggItem.getSize();
            StringBuilder sbA = C2157f0.a(id2, maxSize, "egg id = ", " , egg maxSize = ");
            z.a(maxSize2 - totalSize, " ,restSize == ", " ,egg need size = ", sbA);
            BLog.i("eggPreDownloadCheck", O.a(size, ",can download ", strE, sbA));
            ResDownloadRequest resDownloadRequestDownloadTag = new ResDownloadRequest(strE, searchEasterEggItem.getHash()).encrypted(true).bizType(downloadBizType).downloadTag("search_egg");
            if (searchEasterEggItem.withMd5Verify()) {
                resDownloadRequestDownloadTag.md5(searchEasterEggItem.getHash());
            }
            ResManager.download(resDownloadRequestDownloadTag, new a(searchEasterEggItem));
        }
    }

    public static void c(int i7, boolean z6) {
        List listF = f();
        Iterator it = null;
        List mutableList = listF != null ? CollectionsKt.toMutableList(listF) : null;
        if (mutableList != null) {
            it = mutableList.iterator();
        }
        boolean z7 = false;
        while (it != null && it.hasNext()) {
            if (((SearchEasterEggItem) it.next()).getId() == i7) {
                it.remove();
                z7 = true;
            }
        }
        if (z7) {
            m(mutableList);
            if (z6) {
                Xs0.b.f("9", "local res info contain this egg, but file isn't exist");
            }
        }
    }

    public static int d(int i7) {
        SharedPrefX sharedPrefX = f86501a;
        int i8 = 0;
        if (sharedPrefX != null) {
            i8 = sharedPrefX.getInt("prefix_egg_close_count_" + i7, 0);
        }
        return i8;
    }

    public static String e(SearchEasterEggItem searchEasterEggItem) {
        String url;
        String str = searchEasterEggItem.isStaticImg() ? "search-android-eggsingle" : searchEasterEggItem.isAnimImg() ? "search-android-egggif" : "";
        if (StringsKt.isBlank(str)) {
            url = searchEasterEggItem.getUrl();
        } else {
            String url2 = searchEasterEggItem.getUrl();
            if (url2 == null) {
                url2 = "";
            }
            url = BiliImageLoaderHelper.concatStyleUrl$default(str, url2, B.C(280.0f), B.C(380.0f), !searchEasterEggItem.isAnimImg(), false, 32, (Object) null);
        }
        return url;
    }

    @Nullable
    public static List f() {
        SharedPrefX sharedPrefX = f86501a;
        String string = "";
        if (sharedPrefX != null) {
            string = sharedPrefX.getString("egg_res_list", "");
            if (string == null) {
                string = "";
            }
        }
        List array = null;
        if (!StringsKt.isBlank(string)) {
            try {
                array = JSON.parseArray(string, SearchEasterEggItem.class);
            } catch (Exception e7) {
                Xs0.b.f(Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, e7.getMessage());
                m(new ArrayList());
                array = null;
            }
        }
        return array;
    }

    public static int g(int i7) {
        SharedPrefX sharedPrefX = f86501a;
        int i8 = 0;
        if (sharedPrefX != null) {
            i8 = sharedPrefX.getInt("prefix_egg_view_count_" + i7, 0);
        }
        return i8;
    }

    public static void h(int i7) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutInt;
        SharedPrefX sharedPrefX = f86501a;
        if (sharedPrefX == null || (editorEdit = sharedPrefX.edit()) == null || (editorPutInt = editorEdit.putInt(C3259x.a(i7, "prefix_egg_close_count_"), d(i7) + 1)) == null) {
            return;
        }
        editorPutInt.apply();
    }

    public static void i(int i7) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutInt;
        SharedPrefX sharedPrefX = f86501a;
        if (sharedPrefX == null || (editorEdit = sharedPrefX.edit()) == null || (editorPutInt = editorEdit.putInt(C3259x.a(i7, "prefix_egg_view_count_"), g(i7) + 1)) == null) {
            return;
        }
        editorPutInt.apply();
    }

    @NotNull
    public static q j(@Nullable String str, @Nullable String str2) {
        String str3;
        if (str2 != null) {
            str3 = str2;
        } else {
            if (str == null) {
                return new q(null, null, false, false);
            }
            str3 = str;
        }
        try {
            if (ResManager.isFileExist(new ResRequest(str, str2))) {
                BLog.d("SearchLocalDataManager", "isResourceAvailable found in resManager " + str2);
                return new q(str, str2, true, false);
            }
            InterfaceC7988c interfaceC7988cT0 = C7993h.f123760b.getResources().t0("egg", str3, KeyType.HASH);
            if (interfaceC7988cT0 == null || !interfaceC7988cT0.a()) {
                BLog.d("SearchLocalDataManager", "isResourceAvailable not found " + str2);
                return new q(str, str2, false, false);
            }
            BLog.d("SearchLocalDataManager", "isResourceAvailable found in stagger " + str2);
            return new q(str, str2, true, true);
        } catch (Exception e7) {
            BLog.e("SearchLocalDataManager", "isResourceAvailable exp " + str2);
            return new q(str, str2, false, false);
        }
    }

    public static void k(@NotNull SearchEasterEggConfig searchEasterEggConfig) {
        try {
            String version = searchEasterEggConfig.getVersion();
            SharedPrefX sharedPrefX = f86501a;
            if (sharedPrefX != null) {
                sharedPrefX.getString("egg_config_version", version == null ? "0" : version);
            }
            String str = version;
            if (version == null) {
                str = "";
            }
            k.a("config ver changed", str);
            List<SearchEasterEggItem> list = searchEasterEggConfig.getList();
            if (list == null) {
                return;
            }
            n(list);
        } catch (Exception e7) {
            BLog.e("SearchLocalDataManager", "onConfigUpdated exp", e7);
        }
    }

    public static void l() {
        Job job = f86502b;
        if (job == null || !job.isActive()) {
            f86502b = BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new SearchLocalDataManager$updateEggResV2$1(null), 2, (Object) null);
        } else {
            BLog.i("SearchLocalDataManager", "res is downloading, cancel this request");
        }
    }

    public static void m(@Nullable List list) {
        SharedPrefX sharedPrefX;
        if (list == null || (sharedPrefX = f86501a) == null) {
            return;
        }
        sharedPrefX.edit().putString("egg_res_list", JSON.toJSONString(list)).apply();
        List<SearchEasterEggItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (SearchEasterEggItem searchEasterEggItem : list2) {
            arrayList.add(TuplesKt.to(Integer.valueOf(searchEasterEggItem.getId()), searchEasterEggItem));
        }
        k.a("res available list", MapsKt.toMap(arrayList).keySet().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n(java.util.List r5) {
        /*
            Method dump skipped, instruction units count: 743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.eastereggs.SearchLocalDataManager.n(java.util.List):void");
    }
}
