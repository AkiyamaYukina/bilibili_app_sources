package com.bilibili.lib.sharewrapper.online.api;

import com.bilibili.lib.sharewrapper.online.ShareOnlineParams;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Callback;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/ShareServiceManager.class */
public final class ShareServiceManager {

    @NotNull
    public static final ShareServiceManager INSTANCE = new ShareServiceManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Delegate f64436a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/ShareServiceManager$Delegate.class */
    public interface Delegate {
        static /* synthetic */ void clickShare$default(Delegate delegate, String str, String str2, String str3, int i7, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i8, String str11, String str12, String str13, Long l7, String str14, BiliApiDataCallback biliApiDataCallback, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clickShare");
            }
            if ((i9 & 4096) != 0) {
                str11 = null;
            }
            if ((i9 & 8192) != 0) {
                str12 = null;
            }
            if ((i9 & 16384) != 0) {
                str13 = null;
            }
            if ((32768 & i9) != 0) {
                l7 = null;
            }
            if ((i9 & 65536) != 0) {
                str14 = null;
            }
            delegate.clickShare(str, str2, str3, i7, str4, str5, str6, str7, str8, str9, str10, i8, str11, str12, str13, l7, str14, biliApiDataCallback);
        }

        static /* synthetic */ BiliCall getShareChannels$default(Delegate delegate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getShareChannels");
            }
            if ((i7 & 64) != 0) {
                str7 = null;
            }
            if ((i7 & 128) != 0) {
                str8 = null;
            }
            if ((i7 & 256) != 0) {
                str9 = null;
            }
            if ((i7 & 512) != 0) {
                str10 = "";
            }
            return delegate.getShareChannels(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        }

        static /* synthetic */ void getShareChannels$default(Delegate delegate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, BiliApiDataCallback biliApiDataCallback, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getShareChannels");
            }
            if ((i7 & 64) != 0) {
                str7 = null;
            }
            if ((i7 & 128) != 0) {
                str8 = null;
            }
            if ((i7 & 256) != 0) {
                str9 = null;
            }
            if ((i7 & 512) != 0) {
                str10 = "";
            }
            delegate.getShareChannels(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, biliApiDataCallback);
        }

        static /* synthetic */ void quickWord$default(Delegate delegate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, BiliApiDataCallback biliApiDataCallback, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: quickWord");
            }
            if ((i7 & 64) != 0) {
                str7 = null;
            }
            if ((i7 & 128) != 0) {
                str8 = null;
            }
            if ((i7 & 256) != 0) {
                str9 = null;
            }
            if ((i7 & 512) != 0) {
                str10 = "";
            }
            delegate.quickWord(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, biliApiDataCallback);
        }

        static /* synthetic */ void shareFinish$default(Delegate delegate, String str, boolean z6, String str2, String str3, String str4, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shareFinish");
            }
            if ((i7 & 4) != 0) {
                str2 = null;
            }
            if ((i7 & 8) != 0) {
                str3 = null;
            }
            if ((i7 & 16) != 0) {
                str4 = null;
            }
            delegate.shareFinish(str, z6, str2, str3, str4);
        }

        static /* synthetic */ void wordShare$default(Delegate delegate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, BiliApiDataCallback biliApiDataCallback, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: wordShare");
            }
            if ((i7 & 64) != 0) {
                str7 = null;
            }
            if ((i7 & 128) != 0) {
                str8 = null;
            }
            if ((i7 & 256) != 0) {
                str9 = null;
            }
            delegate.wordShare(str, str2, str3, str4, str5, str6, str7, str8, str9, biliApiDataCallback);
        }

        void clickShare(@Nullable String str, @Nullable String str2, @Nullable String str3, int i7, @Nullable String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, int i8, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Long l7, @Nullable String str14, @NotNull BiliApiDataCallback<ShareClickResult> biliApiDataCallback);

        @NotNull
        BiliCall<GeneralResponse<ShareChannels>> getShareChannels(@Nullable String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10);

        void getShareChannels(@Nullable String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @NotNull BiliApiDataCallback<ShareChannels> biliApiDataCallback);

        void placardShare(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull BiliApiDataCallback<PlacardData> biliApiDataCallback);

        void quickWord(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @NotNull BiliApiDataCallback<QuickWordData> biliApiDataCallback);

        void shareFinish(@Nullable String str, boolean z6, @Nullable String str2, @Nullable String str3, @Nullable String str4);

        void shareFinish(boolean z6, @Nullable String str, @Nullable String str2, @Nullable ShareOnlineParams shareOnlineParams, @NotNull Callback<GeneralResponse<FinishResult>> callback);

        void wordShare(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @NotNull BiliApiDataCallback<WordShareData> biliApiDataCallback);
    }

    @JvmStatic
    public static final void clickShare(@Nullable String str, @Nullable String str2, @Nullable String str3, int i7, @Nullable String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, int i8, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Long l7, @Nullable String str14, @NotNull BiliApiDataCallback<ShareClickResult> biliApiDataCallback) {
        Delegate delegate = f64436a;
        if (delegate != null) {
            delegate.clickShare(str, str2, str3, i7, str4, str5, str6, str7, str8, str9, str10, i8, str11, str12, str13, l7, str14, biliApiDataCallback);
        }
    }

    public static /* synthetic */ void clickShare$default(String str, String str2, String str3, int i7, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i8, String str11, String str12, String str13, Long l7, String str14, BiliApiDataCallback biliApiDataCallback, int i9, Object obj) {
        if ((i9 & 4096) != 0) {
            str11 = null;
        }
        if ((i9 & 8192) != 0) {
            str12 = null;
        }
        if ((i9 & 16384) != 0) {
            str13 = null;
        }
        if ((32768 & i9) != 0) {
            l7 = null;
        }
        if ((i9 & 65536) != 0) {
            str14 = null;
        }
        clickShare(str, str2, str3, i7, str4, str5, str6, str7, str8, str9, str10, i8, str11, str12, str13, l7, str14, biliApiDataCallback);
    }

    @JvmStatic
    @NotNull
    public static final BiliCall<GeneralResponse<ShareChannels>> getShareChannels(@Nullable String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        return f64436a.getShareChannels(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    @JvmStatic
    public static final void getShareChannels(@Nullable String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @NotNull BiliApiDataCallback<ShareChannels> biliApiDataCallback) {
        Delegate delegate = f64436a;
        if (delegate != null) {
            delegate.getShareChannels(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, biliApiDataCallback);
        }
    }

    public static /* synthetic */ BiliCall getShareChannels$default(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i7, Object obj) {
        if ((i7 & 64) != 0) {
            str7 = null;
        }
        if ((i7 & 128) != 0) {
            str8 = null;
        }
        if ((i7 & 256) != 0) {
            str9 = null;
        }
        if ((i7 & 512) != 0) {
            str10 = "";
        }
        return getShareChannels(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public static /* synthetic */ void getShareChannels$default(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, BiliApiDataCallback biliApiDataCallback, int i7, Object obj) {
        if ((i7 & 64) != 0) {
            str7 = null;
        }
        if ((i7 & 128) != 0) {
            str8 = null;
        }
        if ((i7 & 256) != 0) {
            str9 = null;
        }
        if ((i7 & 512) != 0) {
            str10 = "";
        }
        getShareChannels(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, biliApiDataCallback);
    }

    @JvmStatic
    public static final void placardShare(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull BiliApiDataCallback<PlacardData> biliApiDataCallback) {
        Delegate delegate = f64436a;
        if (delegate != null) {
            delegate.placardShare(str, str2, str3, str4, biliApiDataCallback);
        }
    }

    @JvmStatic
    public static final void quickWord(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @NotNull BiliApiDataCallback<QuickWordData> biliApiDataCallback) {
        Delegate delegate = f64436a;
        if (delegate != null) {
            delegate.quickWord(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, biliApiDataCallback);
        }
    }

    public static /* synthetic */ void quickWord$default(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, BiliApiDataCallback biliApiDataCallback, int i7, Object obj) {
        if ((i7 & 64) != 0) {
            str7 = null;
        }
        if ((i7 & 128) != 0) {
            str8 = null;
        }
        if ((i7 & 256) != 0) {
            str9 = null;
        }
        if ((i7 & 512) != 0) {
            str10 = "";
        }
        quickWord(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, biliApiDataCallback);
    }

    @JvmStatic
    public static final void setShareAPIManager(@NotNull Delegate delegate) {
        f64436a = delegate;
    }

    @JvmStatic
    public static final void shareFinish(@Nullable String str, boolean z6, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Delegate delegate = f64436a;
        if (delegate != null) {
            delegate.shareFinish(str, z6, str2, str3, str4);
        }
    }

    @JvmStatic
    public static final void shareFinish(boolean z6, @Nullable String str, @Nullable String str2, @Nullable ShareOnlineParams shareOnlineParams, @NotNull Callback<GeneralResponse<FinishResult>> callback) {
        Delegate delegate = f64436a;
        if (delegate != null) {
            delegate.shareFinish(z6, str, str2, shareOnlineParams, callback);
        }
    }

    public static /* synthetic */ void shareFinish$default(String str, boolean z6, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if ((i7 & 16) != 0) {
            str4 = null;
        }
        shareFinish(str, z6, str2, str3, str4);
    }

    @JvmStatic
    public static final void wordShare(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @NotNull BiliApiDataCallback<WordShareData> biliApiDataCallback) {
        Delegate delegate = f64436a;
        if (delegate != null) {
            delegate.wordShare(str, str2, str3, str4, str5, str6, str7, str8, str9, biliApiDataCallback);
        }
    }

    public static /* synthetic */ void wordShare$default(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, BiliApiDataCallback biliApiDataCallback, int i7, Object obj) {
        if ((i7 & 64) != 0) {
            str7 = null;
        }
        if ((i7 & 128) != 0) {
            str8 = null;
        }
        if ((i7 & 256) != 0) {
            str9 = null;
        }
        wordShare(str, str2, str3, str4, str5, str6, str7, str8, str9, biliApiDataCallback);
    }

    @Nullable
    public final Delegate getManagerDelegate() {
        return f64436a;
    }

    public final void setManagerDelegate(@Nullable Delegate delegate) {
        f64436a = delegate;
    }
}
