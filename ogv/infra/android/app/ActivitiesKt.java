package com.bilibili.ogv.infra.android.app;

import android.content.res.Configuration;
import androidx.activity.ComponentActivity;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/android/app/ActivitiesKt.class */
public final class ActivitiesKt {
    @NotNull
    public static final Flow a(@NotNull BaseAppCompatActivity baseAppCompatActivity) {
        return FlowKt.callbackFlow(new ActivitiesKt$multiWindowStateFlow$1(baseAppCompatActivity, null));
    }

    @NotNull
    public static final Flow<Configuration> b(@NotNull ComponentActivity componentActivity) {
        return FlowKt.callbackFlow(new ActivitiesKt$resourceConfigurationFlow$1(componentActivity, null));
    }
}
