package com.bilibili.studio.module.tuwen.callback;

import com.bilibili.studio.module.tuwen.model.BCutModResources;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/callback/IBCutSoLoader.class */
public interface IBCutSoLoader {
    @Nullable
    BCutModResources getModResources();

    boolean initEditorEngineSDK();

    boolean initVideoCompilerSdk();

    boolean loadCSharedSo();
}
