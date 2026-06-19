package com.bilibili.live;

import androidx.fragment.app.Fragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/ILiveRouterDispatcherProvider.class */
public interface ILiveRouterDispatcherProvider {
    void closePage(@NotNull Function0<Unit> function0);

    @NotNull
    Map<String, String> getTrackInfo(@NotNull String str);

    void showPage(@NotNull Fragment fragment, @NotNull Function1<? super String, Unit> function1);

    void toast(@NotNull String str);

    void track(int i7, @NotNull String str, @NotNull Map<String, String> map);
}
