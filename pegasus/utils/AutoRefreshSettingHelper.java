package com.bilibili.pegasus.utils;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/AutoRefreshSettingHelper.class */
@StabilityInferred(parameters = 0)
public final class AutoRefreshSettingHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AutoRefreshInfo f78846a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/AutoRefreshSettingHelper$AutoRefreshInfo.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class AutoRefreshInfo {
        public static final int $stable = 8;

        @Nullable
        private String title = getContext().getString(2131845309);

        @Nullable
        private String open = getContext().getString(2131851796);

        @Nullable
        private String close = getContext().getString(2131851797);

        @Nullable
        public final String getClose() {
            return this.close;
        }

        @NotNull
        public final Context getContext() {
            Context contextApplication = BiliContext.topActivity();
            if (contextApplication == null) {
                contextApplication = BiliContext.application();
            }
            return contextApplication;
        }

        @Nullable
        public final String getOpen() {
            return this.open;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setClose(@Nullable String str) {
            this.close = str;
        }

        public final void setOpen(@Nullable String str) {
            this.open = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    static {
        AutoRefreshInfo autoRefreshInfo = null;
        try {
            autoRefreshInfo = (AutoRefreshInfo) JSON.parseObject((String) Contract.get$default(ConfigManager.Companion.config(), "pegasus.auto_refresh_setting_text", (Object) null, 2, (Object) null), AutoRefreshInfo.class);
        } catch (Exception e7) {
        }
        AutoRefreshInfo autoRefreshInfo2 = autoRefreshInfo;
        if (autoRefreshInfo == null) {
            autoRefreshInfo2 = new AutoRefreshInfo();
        }
        f78846a = autoRefreshInfo2;
    }
}
