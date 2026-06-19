package com.bilibili.studio.videoeditor;

import com.bilibili.lib.mod.ModErrorInfo;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.lib.mod.request.ModUpdateRequest;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/d.class */
public final class C6596d implements ModResourceClient.OnUpdateCallback {
    public final void onFail(ModUpdateRequest modUpdateRequest, ModErrorInfo modErrorInfo) {
        ModResourceClient.OnUpdateCallback onUpdateCallback = C6597e.f109453a;
        if (onUpdateCallback != null) {
            onUpdateCallback.onFail(modUpdateRequest, modErrorInfo);
        }
    }

    public final void onSuccess(ModResource modResource) {
        ModResourceClient.OnUpdateCallback onUpdateCallback = C6597e.f109453a;
        if (onUpdateCallback != null) {
            onUpdateCallback.onSuccess(modResource);
        }
    }
}
