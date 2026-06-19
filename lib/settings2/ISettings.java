package com.bilibili.lib.settings2;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/settings2/ISettings.class */
public interface ISettings {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/settings2/ISettings$IOther.class */
    public interface IOther {
        boolean getClipAutoJump(boolean z6);

        int getImageQuality(int i7);

        @Nullable
        String getImageWatermarkType(@Nullable String str);

        boolean getScreenshotShare(boolean z6);

        boolean getWifiAutoUpdate(boolean z6);

        void setClipAutoJump(boolean z6);

        void setImageQuality(int i7);

        void setImageWatermarkType(@Nullable String str);

        void setScreenshotShare(boolean z6);

        void setWifiAutoUpdate(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/settings2/ISettings$a.class */
    public interface a {
        boolean b(boolean z6);

        void d(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/settings2/ISettings$b.class */
    public interface b {
        void a(boolean z6);

        boolean c(boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/settings2/ISettings$c.class */
    public interface c {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/settings2/ISettings$d.class */
    public interface d {
        boolean e();
    }

    @NotNull
    a download(@NotNull Context context);

    @NotNull
    b night(@NotNull Context context);

    @NotNull
    IOther other(@NotNull Context context);

    @NotNull
    c play(@NotNull Context context);

    @NotNull
    d privacy(@NotNull Context context);
}
