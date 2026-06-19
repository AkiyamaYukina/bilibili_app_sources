package com.bilibili.moduleservice.ugc;

import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/ugc/IUploaderCenterService.class */
public interface IUploaderCenterService {
    static /* synthetic */ void onTabStatusChange$default(IUploaderCenterService iUploaderCenterService, boolean z6, boolean z7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTabStatusChange");
        }
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        iUploaderCenterService.onTabStatusChange(z6, z7);
    }

    @NotNull
    String getTabTitle();

    void invokeWebPanelShow(@NotNull Function1<? super String, Unit> function1);

    void onBind(@NotNull String str);

    default void onContainerFirstExposure() {
    }

    void onMoreClick();

    default void onTabClick() {
    }

    default void onTabStatusChange(boolean z6, boolean z7) {
    }

    void onUnbind();

    @Nullable
    View tabContent(@NotNull Context context);
}
