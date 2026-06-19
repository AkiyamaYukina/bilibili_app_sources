package com.bilibili.playerbizcommon.biliad;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/biliad/BiliAdDanmakuViewModelv2.class */
public final class BiliAdDanmakuViewModelv2 extends ViewModel {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<AdDanmakuInfo> f79555a = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<AdPanelInfo> f79556b = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public MutableLiveData<AdPanelShowing> f79557c = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<AdPanelInfo> f79558d = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public MutableLiveData<Bundle> f79559e = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public MutableLiveData<Boolean> f79560f = new MutableLiveData<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/biliad/BiliAdDanmakuViewModelv2$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @Nullable
        public final BiliAdDanmakuViewModelv2 get(@Nullable Activity activity) {
            if (activity instanceof FragmentActivity) {
                return (BiliAdDanmakuViewModelv2) new ViewModelProvider((ViewModelStoreOwner) activity).get(BiliAdDanmakuViewModelv2.class);
            }
            return null;
        }

        @JvmStatic
        @Nullable
        public final AdDanmakuInfo getAdDanmakuInfo(@Nullable Activity activity) {
            MutableLiveData<AdDanmakuInfo> adDanmakuInfoData;
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2 = get(activity);
            return (biliAdDanmakuViewModelv2 == null || (adDanmakuInfoData = biliAdDanmakuViewModelv2.getAdDanmakuInfoData()) == null) ? null : adDanmakuInfoData.getValue();
        }

        @JvmStatic
        public final void hideAdPanel(@Nullable Activity activity, @NotNull AdPanelInfo adPanelInfo) {
            MutableLiveData<AdPanelInfo> adPanelHideInfoData;
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2 = get(activity);
            if (biliAdDanmakuViewModelv2 == null || (adPanelHideInfoData = biliAdDanmakuViewModelv2.getAdPanelHideInfoData()) == null) {
                return;
            }
            adPanelHideInfoData.setValue(adPanelInfo);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final void observeAdDanmakuLiveData(@Nullable Activity activity, @NotNull Observer<AdDanmakuInfo> observer) {
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2;
            MutableLiveData<AdDanmakuInfo> adDanmakuInfoData;
            if (!(activity instanceof FragmentActivity) || (biliAdDanmakuViewModelv2 = get(activity)) == null || (adDanmakuInfoData = biliAdDanmakuViewModelv2.getAdDanmakuInfoData()) == null) {
                return;
            }
            adDanmakuInfoData.observe((LifecycleOwner) activity, observer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final void observeAdPanelShowing(@Nullable Activity activity, @NotNull Observer<AdPanelShowing> observer) {
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2;
            MutableLiveData<AdPanelShowing> adPanelShowing;
            if (!(activity instanceof FragmentActivity) || (biliAdDanmakuViewModelv2 = get(activity)) == null || (adPanelShowing = biliAdDanmakuViewModelv2.getAdPanelShowing()) == null) {
                return;
            }
            adPanelShowing.observe((LifecycleOwner) activity, observer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final void observeHideAdPanel(@Nullable Activity activity, @NotNull Observer<AdPanelInfo> observer) {
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2;
            MutableLiveData<AdPanelInfo> adPanelHideInfoData;
            if (!(activity instanceof FragmentActivity) || (biliAdDanmakuViewModelv2 = get(activity)) == null || (adPanelHideInfoData = biliAdDanmakuViewModelv2.getAdPanelHideInfoData()) == null) {
                return;
            }
            adPanelHideInfoData.observe((LifecycleOwner) activity, observer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final void observeIconBundle(@Nullable Activity activity, @NotNull Observer<Bundle> observer) {
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2;
            MutableLiveData<Bundle> mBundle;
            if (!(activity instanceof FragmentActivity) || (biliAdDanmakuViewModelv2 = get(activity)) == null || (mBundle = biliAdDanmakuViewModelv2.getMBundle()) == null) {
                return;
            }
            mBundle.observe((LifecycleOwner) activity, observer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final void observeIconShowing(@Nullable Activity activity, @NotNull Observer<Boolean> observer) {
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2;
            MutableLiveData<Boolean> mIconShowing;
            if (!(activity instanceof FragmentActivity) || (biliAdDanmakuViewModelv2 = get(activity)) == null || (mIconShowing = biliAdDanmakuViewModelv2.getMIconShowing()) == null) {
                return;
            }
            mIconShowing.observe((LifecycleOwner) activity, observer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final void observeShowAdPanel(@Nullable Activity activity, @NotNull Observer<AdPanelInfo> observer) {
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2;
            MutableLiveData<AdPanelInfo> adPanelInfoData;
            if (!(activity instanceof FragmentActivity) || (biliAdDanmakuViewModelv2 = get(activity)) == null || (adPanelInfoData = biliAdDanmakuViewModelv2.getAdPanelInfoData()) == null) {
                return;
            }
            adPanelInfoData.observe((LifecycleOwner) activity, observer);
        }

        @JvmStatic
        public final void removeAdDanmakuLiveDataObserver(@Nullable Activity activity, @NotNull Observer<AdDanmakuInfo> observer) {
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2;
            MutableLiveData<AdDanmakuInfo> adDanmakuInfoData;
            if (!(activity instanceof FragmentActivity) || (biliAdDanmakuViewModelv2 = get(activity)) == null || (adDanmakuInfoData = biliAdDanmakuViewModelv2.getAdDanmakuInfoData()) == null) {
                return;
            }
            adDanmakuInfoData.removeObserver(observer);
        }

        @JvmStatic
        public final void removeHideAdPanelObserver(@Nullable Activity activity, @NotNull Observer<AdPanelInfo> observer) {
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2;
            MutableLiveData<AdPanelInfo> adPanelHideInfoData;
            if (!(activity instanceof FragmentActivity) || (biliAdDanmakuViewModelv2 = get(activity)) == null || (adPanelHideInfoData = biliAdDanmakuViewModelv2.getAdPanelHideInfoData()) == null) {
                return;
            }
            adPanelHideInfoData.removeObserver(observer);
        }

        @JvmStatic
        public final void removeIconBundleObserver(@Nullable Activity activity, @NotNull Observer<Bundle> observer) {
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2;
            MutableLiveData<Bundle> mBundle;
            if (!(activity instanceof FragmentActivity) || (biliAdDanmakuViewModelv2 = get(activity)) == null || (mBundle = biliAdDanmakuViewModelv2.getMBundle()) == null) {
                return;
            }
            mBundle.removeObserver(observer);
        }

        @JvmStatic
        public final void removeIconShowingObserver(@Nullable Activity activity, @NotNull Observer<Boolean> observer) {
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2;
            MutableLiveData<Boolean> mIconShowing;
            if (!(activity instanceof FragmentActivity) || (biliAdDanmakuViewModelv2 = get(activity)) == null || (mIconShowing = biliAdDanmakuViewModelv2.getMIconShowing()) == null) {
                return;
            }
            mIconShowing.removeObserver(observer);
        }

        @JvmStatic
        public final void removeShowAdPanelObserver(@Nullable Activity activity, @NotNull Observer<AdPanelInfo> observer) {
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2;
            MutableLiveData<AdPanelInfo> adPanelInfoData;
            if (!(activity instanceof FragmentActivity) || (biliAdDanmakuViewModelv2 = get(activity)) == null || (adPanelInfoData = biliAdDanmakuViewModelv2.getAdPanelInfoData()) == null) {
                return;
            }
            adPanelInfoData.removeObserver(observer);
        }

        @JvmStatic
        public final void setAdDanmakuInfo(@Nullable Activity activity, @NotNull AdDanmakuInfo adDanmakuInfo) {
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2;
            MutableLiveData<AdDanmakuInfo> adDanmakuInfoData;
            if (!(activity instanceof FragmentActivity) || (biliAdDanmakuViewModelv2 = get(activity)) == null || (adDanmakuInfoData = biliAdDanmakuViewModelv2.getAdDanmakuInfoData()) == null) {
                return;
            }
            adDanmakuInfoData.setValue(adDanmakuInfo);
        }

        @JvmStatic
        public final void setAdPanelShowing(@Nullable Activity activity, @NotNull AdPanelShowing adPanelShowing) {
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2;
            MutableLiveData<AdPanelShowing> adPanelShowing2;
            if (!(activity instanceof FragmentActivity) || (biliAdDanmakuViewModelv2 = get(activity)) == null || (adPanelShowing2 = biliAdDanmakuViewModelv2.getAdPanelShowing()) == null) {
                return;
            }
            adPanelShowing2.postValue(adPanelShowing);
        }

        @JvmStatic
        public final void setIconBundle(@Nullable Activity activity, @NotNull Bundle bundle) {
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2;
            MutableLiveData<Bundle> mBundle;
            if (!(activity instanceof FragmentActivity) || (biliAdDanmakuViewModelv2 = get(activity)) == null || (mBundle = biliAdDanmakuViewModelv2.getMBundle()) == null) {
                return;
            }
            mBundle.postValue(bundle);
        }

        @JvmStatic
        public final void setIconShowing(@Nullable Activity activity, boolean z6) {
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2;
            MutableLiveData<Boolean> mIconShowing;
            if (!(activity instanceof FragmentActivity) || (biliAdDanmakuViewModelv2 = get(activity)) == null || (mIconShowing = biliAdDanmakuViewModelv2.getMIconShowing()) == null) {
                return;
            }
            mIconShowing.postValue(Boolean.valueOf(z6));
        }

        @JvmStatic
        public final void showAdPanel(@Nullable Activity activity, @NotNull AdPanelInfo adPanelInfo) {
            MutableLiveData<AdPanelInfo> adPanelInfoData;
            BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2 = get(activity);
            if (biliAdDanmakuViewModelv2 == null || (adPanelInfoData = biliAdDanmakuViewModelv2.getAdPanelInfoData()) == null) {
                return;
            }
            adPanelInfoData.setValue(adPanelInfo);
        }
    }

    @JvmStatic
    @Nullable
    public static final BiliAdDanmakuViewModelv2 get(@Nullable Activity activity) {
        return Companion.get(activity);
    }

    @JvmStatic
    @Nullable
    public static final AdDanmakuInfo getAdDanmakuInfo(@Nullable Activity activity) {
        return Companion.getAdDanmakuInfo(activity);
    }

    @JvmStatic
    public static final void hideAdPanel(@Nullable Activity activity, @NotNull AdPanelInfo adPanelInfo) {
        Companion.hideAdPanel(activity, adPanelInfo);
    }

    @JvmStatic
    public static final void observeAdDanmakuLiveData(@Nullable Activity activity, @NotNull Observer<AdDanmakuInfo> observer) {
        Companion.observeAdDanmakuLiveData(activity, observer);
    }

    @JvmStatic
    public static final void observeAdPanelShowing(@Nullable Activity activity, @NotNull Observer<AdPanelShowing> observer) {
        Companion.observeAdPanelShowing(activity, observer);
    }

    @JvmStatic
    public static final void observeHideAdPanel(@Nullable Activity activity, @NotNull Observer<AdPanelInfo> observer) {
        Companion.observeHideAdPanel(activity, observer);
    }

    @JvmStatic
    public static final void observeIconBundle(@Nullable Activity activity, @NotNull Observer<Bundle> observer) {
        Companion.observeIconBundle(activity, observer);
    }

    @JvmStatic
    public static final void observeIconShowing(@Nullable Activity activity, @NotNull Observer<Boolean> observer) {
        Companion.observeIconShowing(activity, observer);
    }

    @JvmStatic
    public static final void observeShowAdPanel(@Nullable Activity activity, @NotNull Observer<AdPanelInfo> observer) {
        Companion.observeShowAdPanel(activity, observer);
    }

    @JvmStatic
    public static final void removeAdDanmakuLiveDataObserver(@Nullable Activity activity, @NotNull Observer<AdDanmakuInfo> observer) {
        Companion.removeAdDanmakuLiveDataObserver(activity, observer);
    }

    @JvmStatic
    public static final void removeHideAdPanelObserver(@Nullable Activity activity, @NotNull Observer<AdPanelInfo> observer) {
        Companion.removeHideAdPanelObserver(activity, observer);
    }

    @JvmStatic
    public static final void removeIconBundleObserver(@Nullable Activity activity, @NotNull Observer<Bundle> observer) {
        Companion.removeIconBundleObserver(activity, observer);
    }

    @JvmStatic
    public static final void removeIconShowingObserver(@Nullable Activity activity, @NotNull Observer<Boolean> observer) {
        Companion.removeIconShowingObserver(activity, observer);
    }

    @JvmStatic
    public static final void removeShowAdPanelObserver(@Nullable Activity activity, @NotNull Observer<AdPanelInfo> observer) {
        Companion.removeShowAdPanelObserver(activity, observer);
    }

    @JvmStatic
    public static final void setAdDanmakuInfo(@Nullable Activity activity, @NotNull AdDanmakuInfo adDanmakuInfo) {
        Companion.setAdDanmakuInfo(activity, adDanmakuInfo);
    }

    @JvmStatic
    public static final void setAdPanelShowing(@Nullable Activity activity, @NotNull AdPanelShowing adPanelShowing) {
        Companion.setAdPanelShowing(activity, adPanelShowing);
    }

    @JvmStatic
    public static final void setIconBundle(@Nullable Activity activity, @NotNull Bundle bundle) {
        Companion.setIconBundle(activity, bundle);
    }

    @JvmStatic
    public static final void setIconShowing(@Nullable Activity activity, boolean z6) {
        Companion.setIconShowing(activity, z6);
    }

    @JvmStatic
    public static final void showAdPanel(@Nullable Activity activity, @NotNull AdPanelInfo adPanelInfo) {
        Companion.showAdPanel(activity, adPanelInfo);
    }

    @NotNull
    public final MutableLiveData<AdDanmakuInfo> getAdDanmakuInfoData() {
        return this.f79555a;
    }

    @NotNull
    public final MutableLiveData<AdPanelInfo> getAdPanelHideInfoData() {
        return this.f79558d;
    }

    @NotNull
    public final MutableLiveData<AdPanelInfo> getAdPanelInfoData() {
        return this.f79556b;
    }

    @Nullable
    public final MutableLiveData<AdPanelShowing> getAdPanelShowing() {
        return this.f79557c;
    }

    @Nullable
    public final MutableLiveData<Bundle> getMBundle() {
        return this.f79559e;
    }

    @Nullable
    public final MutableLiveData<Boolean> getMIconShowing() {
        return this.f79560f;
    }

    public final void setAdPanelShowing(@Nullable MutableLiveData<AdPanelShowing> mutableLiveData) {
        this.f79557c = mutableLiveData;
    }

    public final void setMBundle(@Nullable MutableLiveData<Bundle> mutableLiveData) {
        this.f79559e = mutableLiveData;
    }

    public final void setMIconShowing(@Nullable MutableLiveData<Boolean> mutableLiveData) {
        this.f79560f = mutableLiveData;
    }
}
