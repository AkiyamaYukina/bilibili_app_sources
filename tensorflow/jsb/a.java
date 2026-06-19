package com.bilibili.tensorflow.jsb;

import com.bilibili.app.comm.IJsBridgeContextV2;
import com.bilibili.common.webview.js.JsbDynamicService;
import com.bilibili.common.webview.js.JsbDynamicServiceProvider;
import com.bilibili.lib.gripper.api.Producer;
import javax.inject.Named;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/jsb/a.class */
public final class a implements JsbDynamicServiceProvider {
    @Named("globalVip.mobilePredict")
    @Producer(singleton = true)
    @NotNull
    public final JsbDynamicServiceProvider asProvider() {
        return this;
    }

    @NotNull
    public final JsbDynamicService create(@NotNull IJsBridgeContextV2 iJsBridgeContextV2) {
        return new TfLiteModelService(iJsBridgeContextV2);
    }
}
