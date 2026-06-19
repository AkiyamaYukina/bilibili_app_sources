package com.bilibili.search2.eastereggs;

import Wh0.InterfaceC3041a;
import android.app.Application;
import androidx.compose.animation.core.C3310b0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.StringUtil;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import androidx.work.c;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.BiliContext;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.fd_service.FreeDataManager;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.lib.resmanager.DownloadBizType;
import com.bilibili.lib.tf.TfChangeCallback;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.search2.api.SearchEasterEggConfig;
import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.search2.api.SearchService;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import javax.inject.Named;
import javax.inject.Singleton;
import m3.C7907c;
import mf0.C7993h;
import mf0.C7994i;
import mf0.InterfaceC7991f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import v3.F;
import x3.C8954a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/r.class */
@Singleton
@StabilityInferred(parameters = 0)
@Named("search")
public final class r implements InterfaceC3041a, Observer<WorkInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f86529a = new a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public SearchEasterEggConfig f86530b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/r$a.class */
    public static final class a extends TfChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f86531a;

        public a(r rVar) {
            this.f86531a = rVar;
        }

        @Override // com.bilibili.lib.tf.TfChangeCallback
        public final void OnTfChange() {
            if (!FreeDataManager.getInstance().isTf()) {
                k.a("onFreeDataDeActive", "");
                return;
            }
            k.a("onFreeDataActive", FreeDataManager.getInstance().getIsp().name());
            r rVar = this.f86531a;
            SearchEasterEggConfig searchEasterEggConfig = rVar.f86530b;
            if (searchEasterEggConfig != null) {
                SharedPrefX sharedPrefX = SearchLocalDataManager.f86501a;
                SearchLocalDataManager.k(searchEasterEggConfig);
                if (s.f86535c != 0) {
                    FreeDataManager.getInstance().removeTfChangeCallback(s.f86535c);
                    s.f86535c = 0L;
                }
                rVar.f86530b = null;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/r$b.class */
    public static final class b extends BiliApiDataCallback<SearchEasterEggConfig> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f86532b;

        public b(r rVar) {
            this.f86532b = rVar;
        }

        /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, m3.b] */
        /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Object, n3.l] */
        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(SearchEasterEggConfig searchEasterEggConfig) throws Throwable {
            SearchEasterEggConfig searchEasterEggConfig2 = searchEasterEggConfig;
            boolean z6 = s.f86534b;
            k.a("search_egg_process_log", O4.b.b("config api success ,current4G enable == ", ",wifiActive == ", " ", !z6, ConnectivityMonitor.getInstance().isWifiActive()));
            if (searchEasterEggConfig2 == null) {
                return;
            }
            if (!z6) {
                SharedPrefX sharedPrefX = SearchLocalDataManager.f86501a;
                SearchLocalDataManager.k(searchEasterEggConfig2);
                return;
            }
            if (ConnectivityMonitor.getInstance().isWifiActive() || FreeDataManager.getInstance().isTf()) {
                SharedPrefX sharedPrefX2 = SearchLocalDataManager.f86501a;
                SearchLocalDataManager.k(searchEasterEggConfig2);
                return;
            }
            if (s.f86533a) {
                r rVar = this.f86532b;
                rVar.f86530b = searchEasterEggConfig2;
                s.f86535c = FreeDataManager.getInstance().addTfChangeCallback(rVar.f86529a);
                HashMap map = new HashMap();
                map.put("search_egg_key", JSON.toJSONString(searchEasterEggConfig2));
                androidx.work.b bVar = new androidx.work.b(map);
                androidx.work.b.b(bVar);
                Application application = BiliContext.application();
                if (application != null) {
                    c.a aVar = new c.a(SearchEggWork.class);
                    ((HashSet) aVar.f53416c).add("SEARCH_EGG_DOWNLOAD");
                    NetworkType networkType = NetworkType.NOT_REQUIRED;
                    C7907c c7907c = new C7907c();
                    NetworkType networkType2 = NetworkType.UNMETERED;
                    ?? obj = new Object();
                    obj.f123449a = NetworkType.NOT_REQUIRED;
                    obj.f123454f = -1L;
                    obj.f123455g = -1L;
                    new C7907c();
                    obj.f123450b = false;
                    obj.f123451c = false;
                    obj.f123449a = networkType2;
                    obj.f123452d = false;
                    obj.f123453e = false;
                    obj.h = c7907c;
                    obj.f123454f = -1L;
                    obj.f123455g = -1L;
                    aVar.f53415b.f128147j = obj;
                    aVar.f53415b.f128143e = bVar;
                    androidx.work.c cVarA = aVar.a();
                    n3.m mVarD = n3.m.d(application);
                    mVarD.getClass();
                    mVarD.f123989d.a(new w3.b(mVarD));
                    mVarD.a(cVarA);
                    UUID uuid = cVarA.f53411a;
                    v3.u uVarJ = mVarD.f123988c.j();
                    List<String> listSingletonList = Collections.singletonList(uuid.toString());
                    F f7 = (F) uVarJ;
                    f7.getClass();
                    StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
                    sbNewStringBuilder.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
                    int size = listSingletonList.size();
                    StringUtil.appendPlaceholders(sbNewStringBuilder, size);
                    sbNewStringBuilder.append(")");
                    RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
                    int i7 = 1;
                    for (String str : listSingletonList) {
                        if (str == null) {
                            roomSQLiteQueryAcquire.bindNull(i7);
                        } else {
                            roomSQLiteQueryAcquire.bindString(i7, str);
                        }
                        i7++;
                    }
                    LiveData liveDataCreateLiveData = f7.f128102a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, (Callable) new v3.v(f7, roomSQLiteQueryAcquire));
                    ?? obj2 = new Object();
                    C8954a c8954a = mVarD.f123989d;
                    Object obj3 = new Object();
                    MediatorLiveData mediatorLiveData = new MediatorLiveData();
                    mediatorLiveData.addSource(liveDataCreateLiveData, new w3.g(c8954a, obj3, obj2, mediatorLiveData));
                    mediatorLiveData.observeForever(rVar);
                }
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            k.a("search_egg_process_log", "config api failed");
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.bilibili.okretro.converter.IParser, java.lang.Object] */
    @Override // Wh0.InterfaceC3041a
    public final void a() {
        k.a("search_egg_process_log", "config api call");
        C7993h c7993h = C7993h.f123760b;
        if (C7994i.a()) {
            k.a("search_egg_process_log", "StaggerManager enable, quit updateStaticResConfig");
            return;
        }
        SharedPrefX sharedPrefX = SearchLocalDataManager.f86501a;
        String string = "0";
        if (sharedPrefX != null) {
            string = sharedPrefX.getString("egg_config_version", "0");
            if (string == null) {
                string = "0";
            }
        }
        ((SearchService) ServiceGenerator.createService(SearchService.class)).getEasterEggs(string).setParser(new Object()).enqueue(new b(this));
    }

    @Override // Wh0.InterfaceC3041a
    public final void b() {
        InterfaceC7991f interfaceC7991f = C7993h.f123760b;
        if (!C7994i.a()) {
            k.a("search_egg_process_log", "StaggerManager not enable, quit registerStaggerConfig");
            return;
        }
        InterfaceC7991f.c.a aVar = new InterfaceC7991f.c.a();
        aVar.f123744d = "egg";
        aVar.f123741a = new C3310b0(1);
        aVar.f123745e = DownloadBizType.SearchEgg;
        aVar.h = false;
        aVar.f123747g = true;
        aVar.f123751l = true;
        aVar.f123749j = SearchResultAll.EasterEgg.preFetchSize;
        InterfaceC7991f.c cVar = new InterfaceC7991f.c(aVar);
        BLog.d("SearchEggModuleService", "registerStaggerConfig");
        interfaceC7991f.g(interfaceC7991f, cVar);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(WorkInfo workInfo) {
        k.a("SearchEggWork", workInfo.f53386b.name());
    }
}
