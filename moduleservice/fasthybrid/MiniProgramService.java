package com.bilibili.moduleservice.fasthybrid;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/MiniProgramService.class */
public interface MiniProgramService {
    void callNative(@Nullable Fragment fragment, @NotNull JSONObject jSONObject, @NotNull Function1<? super JSONObject, Unit> function1);

    default boolean initializeBeforeLaunch(@NotNull Context context, @NotNull String str, @NotNull Intent intent) {
        return false;
    }

    void onSubscribeEvent(@Nullable Fragment fragment, @NotNull JSONObject jSONObject, @NotNull MiniProgramPipeline miniProgramPipeline);

    void onUnsubscribeEvent(@Nullable Fragment fragment, @NotNull JSONObject jSONObject);

    default boolean onWillLeave(@NotNull String str, int i7) {
        return false;
    }
}
