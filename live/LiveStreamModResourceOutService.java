package com.bilibili.live;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/LiveStreamModResourceOutService.class */
public interface LiveStreamModResourceOutService {
    boolean checkBlinkBeautyResExisits(@NotNull String str);

    @Nullable
    String getBlinkBeautyResFilePath(@NotNull String str);

    @NotNull
    String getBlinkBeautyResSaveDir();

    @NotNull
    String getBlinkBeautyResSaveRootPath();

    @NotNull
    String getEffectSdkType();

    void initEffectSdkType();

    boolean isByteEffect();

    void requestBlinkBeautyResList(@NotNull Function1<? super HashMap<String, String>, Unit> function1);
}
