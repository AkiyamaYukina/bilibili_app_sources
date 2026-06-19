package com.bilibili.playerbizcommonv2.widget.ad;

import Kr0.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.playerbizcommon.biliad.AdPanelInfo;
import com.bilibili.playerbizcommon.biliad.BiliAdDanmakuViewModelv2;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.IActivityStateService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/ad/a.class */
@StabilityInferred(parameters = 0)
public class a extends BiliImageView implements IControlWidget, View.OnClickListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f82288v = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f82289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f82290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Integer f82291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Inject
    public Er0.a f82292p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Inject
    public IControlContainerService f82293q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Inject
    public IActivityStateService f82294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final b f82295s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final C0535a f82296t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f82297u;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.ad.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/ad/a$a.class */
    public static final class C0535a implements ControlContainerVisibleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f82298a;

        public C0535a(a aVar) {
            this.f82298a = aVar;
        }

        public final void onControlContainerImmersiveChanged(int i7, boolean z6) {
            if (z6) {
                return;
            }
            a aVar = this.f82298a;
            Integer num = aVar.f82291o;
            if (num != null) {
                aVar.setCustomVisibility(num.intValue());
            }
            aVar.f82291o = null;
        }

        public final void onControlContainerVisibleChanged(boolean z6) {
        }
    }

    @JvmOverloads
    public a(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @JvmOverloads
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f82290n = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Kr0.a(this, 0));
        this.f82295s = new b(this, 0);
        this.f82296t = new C0535a(this);
        this.f82297u = true;
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i7, int i8) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @NotNull
    public final IActivityStateService getActivityStateService() {
        IActivityStateService iActivityStateService = this.f82294r;
        if (iActivityStateService != null) {
            return iActivityStateService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activityStateService");
        return null;
    }

    @Nullable
    public final BiliAdDanmakuViewModelv2 getAdDanmakuViewModel() {
        AdDanmakuViewModelStore adDanmakuViewModelStore = (AdDanmakuViewModelStore) getDelegateStoreService().get(AdDanmakuViewModelStore.Companion);
        return adDanmakuViewModelStore != null ? adDanmakuViewModelStore.getAdDanmakuViewModel() : null;
    }

    @NotNull
    public final IControlContainerService getControlContainerService() {
        IControlContainerService iControlContainerService = this.f82293q;
        if (iControlContainerService != null) {
            return iControlContainerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
        return null;
    }

    @NotNull
    public final Er0.a getDelegateStoreService() {
        Er0.a aVar = this.f82292p;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
        return null;
    }

    @Nullable
    public final BiliAdDanmakuViewModelv2 getMDanmakuViewModel() {
        return (BiliAdDanmakuViewModelv2) this.f82290n.getValue();
    }

    public boolean getMembersInjector() {
        return this.f82297u;
    }

    public final int getWidgetFrom() {
        return this.f82289m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m(int i7, @Nullable String str) {
        switch (i7) {
            case 100:
                setCustomVisibility(8);
                break;
            case 101:
                setCustomVisibility(0);
                Drawable drawable = ContextCompat.getDrawable(getContext(), 2131234325);
                if (drawable != null) {
                    getGenericProperties().setImage(drawable);
                }
                break;
            case 102:
                setCustomVisibility(0);
                ImageRequestBuilder imageRequestBuilderUrl = BiliImageLoader.INSTANCE.with(getContext()).url(str);
                ScaleType scaleType = ScaleType.CENTER_CROP;
                imageRequestBuilderUrl.actualImageScaleType(scaleType).placeholderImageResId(2131234325, scaleType).into(this);
                break;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        MutableLiveData<AdPanelInfo> adPanelInfoData;
        AdPanelInfo adPanelInfo = new AdPanelInfo(null, 0);
        BiliAdDanmakuViewModelv2 mDanmakuViewModel = getMDanmakuViewModel();
        if (mDanmakuViewModel == null || (adPanelInfoData = mDanmakuViewModel.getAdPanelInfoData()) == null) {
            return;
        }
        adPanelInfoData.setValue(adPanelInfo);
    }

    public final void onWidgetActive() {
        MutableLiveData<Bundle> mBundle;
        BiliAdDanmakuViewModelv2 mDanmakuViewModel = getMDanmakuViewModel();
        if (mDanmakuViewModel != null && (mBundle = mDanmakuViewModel.getMBundle()) != null) {
            mBundle.observe(getActivityStateService(), this.f82295s);
        }
        getControlContainerService().registerControlContainerVisible(this.f82296t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWidgetInactive() {
        MutableLiveData<Bundle> mBundle;
        setCustomVisibility(8);
        setOnClickListener(null);
        BiliAdDanmakuViewModelv2 mDanmakuViewModel = getMDanmakuViewModel();
        if (mDanmakuViewModel != null && (mBundle = mDanmakuViewModel.getMBundle()) != null) {
            mBundle.removeObserver(this.f82295s);
        }
        getControlContainerService().unregisterControlContainerVisible(this.f82296t);
    }

    public final void setActivityStateService(@NotNull IActivityStateService iActivityStateService) {
        this.f82294r = iActivityStateService;
    }

    public final void setControlContainerService(@NotNull IControlContainerService iControlContainerService) {
        this.f82293q = iControlContainerService;
    }

    public final void setCustomVisibility(int i7) {
        if (getControlContainerService().isImmersive()) {
            this.f82291o = Integer.valueOf(i7);
        } else {
            setVisibility(i7);
        }
    }

    public final void setDelegateStoreService(@NotNull Er0.a aVar) {
        this.f82292p = aVar;
    }

    public final void setWidgetFrom(int i7) {
        this.f82289m = i7;
    }
}
