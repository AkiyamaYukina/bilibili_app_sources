package com.bilibili.lib.sharewrapper.Bshare;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/GShare.class */
public interface GShare {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/GShare$Account.class */
    public interface Account {
        @Nullable
        String getAccessKey(@Nullable Context context);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/GShare$Buvid.class */
    public interface Buvid {
        @NotNull
        String getBuvid();

        @NotNull
        String getLocalBuvid();

        @NotNull
        String getRemoteBuvid();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/GShare$Config.class */
    public interface Config {
        boolean ab(@NotNull String str);

        default boolean ab2(@NotNull String str, boolean z6) {
            return true;
        }

        @Nullable
        String config(@NotNull String str, @Nullable String str2);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/GShare$Foundation.class */
    public interface Foundation {
        @NotNull
        Application getFapp();

        @NotNull
        Bundle getMetadata();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/GShare$Log.class */
    public interface Log {
        void d(@Nullable String str, @Nullable String str2);

        void d(@Nullable String str, @Nullable String str2, @NotNull Throwable th);

        void dfmt(@Nullable String str, @Nullable String str2, @NotNull Object... objArr);

        void e(@Nullable String str, @Nullable String str2);

        void e(@Nullable String str, @Nullable String str2, @NotNull Throwable th);

        void e(@NotNull String str, @Nullable Throwable th);

        void i(@Nullable String str, @Nullable String str2);

        void v(@Nullable String str, @Nullable String str2);

        void w(@Nullable String str, @Nullable String str2);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/GShare$Neurons.class */
    public interface Neurons {
        void reportClick(boolean z6, @NotNull String str, @NotNull Map<String, String> map);

        void reportExposure(boolean z6, @NotNull String str, @NotNull Map<String, String> map);

        void trackT(boolean z6, @NotNull String str, @NotNull Map<String, String> map, @NotNull Function0<Boolean> function0);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/GShare$PVAction.class */
    public interface PVAction {
        @Nullable
        String getActionId();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/GShare$ThirdAppKey.class */
    public interface ThirdAppKey {
        @NotNull
        String getQQAppId();

        @NotNull
        String getRedirectUrl();

        @NotNull
        String getSinaAppKey();

        @NotNull
        String getWXAppId();

        void setQQAppId(@NotNull String str);

        void setRedirectUrl(@NotNull String str);

        void setSinaAppKey(@NotNull String str);

        void setWXAppId(@NotNull String str);
    }
}
