package com.bilibili.studio.videoeditor.mediav3.base;

import androidx.annotation.NonNull;
import com.bilibili.lib.mod.ModErrorInfo;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.lib.mod.request.ModUpdateRequest;
import com.bilibili.studio.videoeditor.capturev3.viewmodel.d;
import com.bilibili.studio.videoeditor.mediav3.base.ConfigV3;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/mediav3/base/a.class */
public final class a implements ModResourceClient.OnUpdateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfigV3 f109851a;

    public a(ConfigV3 configV3) {
        this.f109851a = configV3;
    }

    public final void onFail(ModUpdateRequest modUpdateRequest, ModErrorInfo modErrorInfo) {
        BLog.e("ConfigV3", "mod name = " + modUpdateRequest.getModName() + ", version = " + modErrorInfo.getModVersion() + ", error code = " + modErrorInfo.getErrorCode());
        ConfigV3 configV3 = this.f109851a;
        d dVar = configV3.f109848e;
        if (dVar != null) {
            dVar.onFail(modUpdateRequest, modErrorInfo);
            configV3.f109848e = null;
        }
    }

    public final void onSuccess(@NonNull ModResource modResource) {
        d dVar;
        if (!modResource.isAvailable()) {
            BLog.e("ConfigV3", "download success but resource is not available: modName = " + modResource.getModName());
            return;
        }
        String modName = modResource.getModName();
        ConfigV3 configV3 = this.f109851a;
        String strL = configV3.l(modName, false);
        if (modResource.getModName().contains("lic")) {
            configV3.f109844a.put(modResource.getModName(), strL);
        } else if (modResource.getModName().contains("cv_model")) {
            if ("android_cv_model_4".equals(modResource.getModName())) {
                configV3.f109846c.put(modResource.getModName(), strL);
            } else {
                configV3.f109847d.put(modResource.getModName(), strL);
            }
        } else if (modResource.getModName().contains(ConfigV3.c()) || modResource.getModName().contains(ConfigV3.f()) || modResource.getModName().contains(ConfigV3.e()) || modResource.getModName().contains(ConfigV3.d()) || modResource.getModName().contains("android_aurora_thirdparty") || modResource.getModName().contains(ConfigV3.h())) {
            configV3.f109845b.put(modResource.getModName(), strL);
        } else {
            modResource.getModName().contains(ConfigV3.j());
        }
        BLog.d("ConfigV3", "download success: modName = " + modResource.getModName() + "; filePath = " + strL);
        if (configV3.o(ConfigV3.ModFlagV3.LIC) && configV3.o(ConfigV3.ModFlagV3.SO) && (dVar = configV3.f109848e) != null) {
            dVar.onSuccess(modResource);
            configV3.f109848e = null;
        }
    }
}
