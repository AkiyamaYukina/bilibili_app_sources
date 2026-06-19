package com.bilibili.studio.comm.manager;

import android.text.TextUtils;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.studio.comm.api.bean.ABData;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/p.class */
public final class p extends BiliApiCallback<GeneralResponse<ABData>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f105419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f105421d;

    public p(n nVar, String str, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.f105419b = nVar;
        this.f105420c = str;
        this.f105421d = copyOnWriteArrayList;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        BLog.e("UpperABTestManager", "initAb onError");
        if (this.f105421d.isEmpty()) {
            return;
        }
        this.f105421d.remove(0).a("0");
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onSuccess(GeneralResponse<ABData> generalResponse) {
        ABData aBData;
        GeneralResponse<ABData> generalResponse2 = generalResponse;
        HashMap<String, String> map = (generalResponse2 == null || (aBData = generalResponse2.data) == null) ? null : aBData.map;
        if (map == null || map.isEmpty()) {
            BLog.e("UpperABTestManager", "initAb fail empty");
            if (this.f105421d.isEmpty()) {
                return;
            }
            this.f105421d.remove(0).a("0");
            return;
        }
        BLog.e("UpperABTestManager", "initAb success map=" + map);
        n nVar = this.f105419b;
        nVar.f105413c.putAll(map);
        String str = map.get(this.f105420c);
        nVar.f105414d.putAll(map);
        n.a(nVar);
        if (TextUtils.isEmpty(str)) {
            if (this.f105421d.isEmpty()) {
                return;
            }
            this.f105421d.remove(0).a("0");
        } else {
            if (this.f105421d.isEmpty()) {
                return;
            }
            this.f105421d.remove(0).a(str);
        }
    }
}
