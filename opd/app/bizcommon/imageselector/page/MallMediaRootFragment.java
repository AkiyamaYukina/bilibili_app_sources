package com.bilibili.opd.app.bizcommon.imageselector.page;

import Im0.InterfaceC2302b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.opd.app.bizcommon.context.StatusBarMode;
import com.bilibili.opd.app.bizcommon.imageselector.component.ObtainCaptureViewOption;
import com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaParams;
import com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import km0.C7773a;
import km0.C7775c;
import kntr.app.ad.base.IAdInfo;
import kntr.app.ad.base.dto.AdButton;
import kntr.app.ad.base.dto.AdInfoCard;
import kntr.app.ad.base.dto.AdInfoExtra;
import kntr.app.ad.base.protocol.click.ClickArgBuilder;
import kntr.app.ad.base.utils.JsonExtKt;
import kntr.app.ad.base.vm.BaseAdCardModel;
import kntr.base.log.KLog_androidKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaRootFragment.class */
@StabilityInferred(parameters = 0)
public class MallMediaRootFragment extends MallMediaBaseFragment implements TabLayout.OnTabSelectedListener {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();
    public static final int MALL_CAMERA_INDEX = 0;
    public static final int MALL_VIDEO_INDEX = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public TabLayout f73851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public FrameLayout f73852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public MallMediaParams f73853d = MallMediaParams.DEFAULT;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public MallMediaTakePhotoFragment f73854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f73855f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaRootFragment$a.class */
    public static final class a {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [Im0.b] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.bilibili.opd.app.bizcommon.imageselector.page.C] */
    public final Fragment mf(int i7) throws NoWhenBranchMatchedException {
        Fragment fragment;
        Object c7775c;
        IndependentCaptureFragment independentCaptureFragmentB;
        if (i7 == 0) {
            MallMediaParams mallMediaParams = this.f73853d;
            fragment = null;
            if (mallMediaParams != null) {
                if (mallMediaParams.getImageCameraEnable()) {
                    if (this.f73854e == null) {
                        this.f73854e = new MallMediaTakePhotoFragment();
                    }
                    return this.f73854e;
                }
                fragment = null;
                if (C7773a.f122894a != null) {
                }
            }
        } else {
            if (i7 != 1) {
                return null;
            }
            if (this.f73853d.getVersion() <= 0 ? this.f73853d.getVideoEnable() : this.f73853d.getVideoCameraEnable()) {
                BLRouter bLRouter = BLRouter.INSTANCE;
                o00.a.a();
                ?? r02 = (InterfaceC2302b) bLRouter.getServices(InterfaceC2302b.class).get(this.f73853d.getSceneType());
                if (r02 != 0) {
                    final int i8 = 0;
                    independentCaptureFragmentB = r02.b(new ObtainCaptureViewOption(), new B(this, 0), new Function1(this, i8) { // from class: com.bilibili.opd.app.bizcommon.imageselector.page.C

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f73748a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f73749b;

                        {
                            this.f73748a = i8;
                            this.f73749b = this;
                        }

                        public final Object invoke(Object obj) {
                            WeakReference<FragmentActivity> weakReference;
                            FragmentActivity fragmentActivity;
                            Object obj2;
                            AdInfoExtra extra;
                            AdInfoExtra extra2;
                            AdInfoExtra extra3;
                            AdInfoExtra extra4;
                            AdInfoExtra extra5;
                            AdInfoExtra extra6;
                            AdInfoExtra extra7;
                            AdInfoExtra extra8;
                            AdInfoCard card;
                            AdButton button;
                            AdInfoExtra extra9;
                            AdInfoCard card2;
                            AdButton button2;
                            AdInfoExtra extra10;
                            Object obj3 = this.f73749b;
                            switch (this.f73748a) {
                                case 0:
                                    Bundle bundle = (Bundle) obj;
                                    MallMediaRootFragment mallMediaRootFragment = (MallMediaRootFragment) obj3;
                                    if (!mallMediaRootFragment.activityDie()) {
                                        if (bundle != null && (weakReference = Jm0.q.f11566a) != null && (fragmentActivity = weakReference.get()) != null) {
                                            fragmentActivity.setResult(-1, new Intent().putExtras(bundle));
                                            fragmentActivity.finish();
                                        }
                                        mallMediaRootFragment.finishAttachedActivity();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    ClickArgBuilder clickArgBuilder = (ClickArgBuilder) obj;
                                    BaseAdCardModel baseAdCardModel = (BaseAdCardModel) obj3;
                                    IAdInfo iAdInfo = baseAdCardModel.b;
                                    clickArgBuilder.setWxInfo((iAdInfo == null || (extra10 = iAdInfo.getExtra()) == null) ? null : extra10.getWxProgramInfo());
                                    IAdInfo iAdInfo2 = baseAdCardModel.b;
                                    clickArgBuilder.setCallUpUrl((iAdInfo2 == null || (extra9 = iAdInfo2.getExtra()) == null || (card2 = extra9.getCard()) == null || (button2 = card2.getButton()) == null) ? null : button2.getCallupUrl());
                                    clickArgBuilder.setJumpUrl((iAdInfo2 == null || (extra8 = iAdInfo2.getExtra()) == null || (card = extra8.getCard()) == null || (button = card.getButton()) == null) ? null : button.getJumpUrl());
                                    clickArgBuilder.setCancelUrl((iAdInfo2 == null || (extra7 = iAdInfo2.getExtra()) == null) ? null : extra7.getUserCancelJumpUrl());
                                    clickArgBuilder.setEnableCallUpCancelToJumpUrl((iAdInfo2 == null || (extra6 = iAdInfo2.getExtra()) == null || extra6.getUserCancelJumpType() != 1) ? false : true);
                                    clickArgBuilder.setEnableDoubleJump((iAdInfo2 == null || (extra5 = iAdInfo2.getExtra()) == null) ? false : extra5.getEnableDoubleJump());
                                    clickArgBuilder.setUseAdWeb((iAdInfo2 == null || (extra4 = iAdInfo2.getExtra()) == null) ? false : extra4.getUseAdWebV2());
                                    clickArgBuilder.setOpenWhiteList((iAdInfo2 == null || (extra3 = iAdInfo2.getExtra()) == null) ? null : extra3.getOpenWhitelist());
                                    clickArgBuilder.setDownloadWhiteList((iAdInfo2 == null || (extra2 = iAdInfo2.getExtra()) == null) ? null : extra2.getDownloadWhitelist());
                                    clickArgBuilder.setDlSucCallUpUrl((String) null);
                                    boolean z6 = false;
                                    if (iAdInfo2 != null) {
                                        AdInfoExtra extra11 = iAdInfo2.getExtra();
                                        z6 = false;
                                        if (extra11 != null) {
                                            z6 = false;
                                            if (extra11.getEnableMarketDownloadWhenFirstJump()) {
                                                AdInfoExtra extra12 = iAdInfo2.getExtra();
                                                z6 = false;
                                                if (extra12 != null) {
                                                    z6 = false;
                                                    if (extra12.getStoreDirectLaunch() == 1) {
                                                        z6 = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    clickArgBuilder.setEnableAppStore(z6);
                                    clickArgBuilder.setEnableAppDownload(true);
                                    clickArgBuilder.setClickUrls((iAdInfo2 == null || (extra = iAdInfo2.getExtra()) == null) ? null : extra.getClickUrls());
                                    String str = null;
                                    if (iAdInfo2 != null) {
                                        AdInfoExtra extra13 = iAdInfo2.getExtra();
                                        str = null;
                                        if (extra13 != null) {
                                            try {
                                                Result.Companion companion = Result.Companion;
                                                Json adJson = JsonExtKt.getAdJson();
                                                adJson.getSerializersModule();
                                                obj2 = Result.constructor-impl(adJson.encodeToString(AdInfoExtra.Companion.serializer(), extra13));
                                            } catch (Throwable th) {
                                                Result.Companion companion2 = Result.Companion;
                                                obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                                            }
                                            Throwable th2 = Result.exceptionOrNull-impl(obj2);
                                            if (th2 != null) {
                                                KLog_androidKt.getKLog().e("JsonExt", th2.toString());
                                            }
                                            Object obj4 = obj2;
                                            if (Result.isFailure-impl(obj2)) {
                                                obj4 = "";
                                            }
                                            str = (String) obj4;
                                        }
                                        break;
                                    }
                                    clickArgBuilder.setAdExtra(str);
                                    return Unit.INSTANCE;
                                default:
                                    return Boolean.valueOf(StringsKt.Z(((File) obj).getName(), (String) obj3));
                            }
                        }
                    });
                } else {
                    independentCaptureFragmentB = null;
                }
                c7775c = new C7775c(independentCaptureFragmentB);
            } else {
                c7775c = C7773a.f122894a;
            }
            if (c7775c instanceof C7773a) {
                return null;
            }
            if (!(c7775c instanceof C7775c)) {
                throw new NoWhenBranchMatchedException();
            }
            fragment = ((C7775c) c7775c).f122896a;
        }
        return fragment;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void nf(int i7) throws NoWhenBranchMatchedException {
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Iterator<Fragment> it = getChildFragmentManager().getFragments().iterator();
        while (it.hasNext()) {
            fragmentTransactionBeginTransaction.remove(it.next());
        }
        Fragment fragmentMf = mf(i7);
        if (fragmentMf != null) {
            if (fragmentMf.isAdded()) {
                fragmentTransactionBeginTransaction.show(fragmentMf).commitAllowingStateLoss();
            } else {
                fragmentTransactionBeginTransaction.add(2131306823, fragmentMf).commitAllowingStateLoss();
            }
            this.f73855f = i7;
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Window window;
        FragmentActivity fragmentActivityP3;
        Window window2;
        setStatusBarMode(StatusBarMode.IMMERSIVE_FULL_TRANSPARENT);
        super.onCreate(bundle);
        FragmentActivity fragmentActivityP32 = p3();
        if (fragmentActivityP32 == null || (window = fragmentActivityP32.getWindow()) == null) {
            return;
        }
        window.addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT);
        Context context = getContext();
        if (context != null && (fragmentActivityP3 = p3()) != null && (window2 = fragmentActivityP3.getWindow()) != null) {
            window2.setNavigationBarColor(ContextCompat.getColor(context, 2131102934));
        }
        setAutoGenerateToolbar(false);
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        return LayoutInflater.from(getContext()).inflate(2131499027, viewGroup, false);
    }

    public void onTabReselected(@Nullable TabLayout.Tab tab) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void onTabSelected(@Nullable TabLayout.Tab tab) throws NoWhenBranchMatchedException {
        Integer numValueOf = tab != null ? Integer.valueOf(tab.getPosition()) : null;
        if (numValueOf != null) {
            nf(numValueOf.intValue());
        }
    }

    public void onTabUnselected(@Nullable TabLayout.Tab tab) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws NoWhenBranchMatchedException {
        TabLayout tabLayout;
        TabLayout tabLayout2;
        Intent intent;
        Intent intent2;
        super.onViewCreated(view, bundle);
        if (getArguments() == null) {
            FragmentActivity fragmentActivityP3 = p3();
            if (((fragmentActivityP3 == null || (intent2 = fragmentActivityP3.getIntent()) == null) ? null : intent2.getExtras()) != null) {
                FragmentActivity fragmentActivityP32 = p3();
                setArguments((fragmentActivityP32 == null || (intent = fragmentActivityP32.getIntent()) == null) ? null : intent.getExtras());
            }
        }
        if (getArguments() != null) {
            MallMediaParams.a aVar = MallMediaParams.Companion;
            Bundle arguments = getArguments();
            aVar.getClass();
            this.f73853d = MallMediaParams.a.a(arguments);
        }
        this.f73851b = view.findViewById(2131306821);
        this.f73852c = (FrameLayout) view.findViewById(2131306823);
        if (mf(0) != null) {
            TabLayout tabLayout3 = this.f73851b;
            TabLayout.Tab tabNewTab = tabLayout3 != null ? tabLayout3.newTab() : null;
            if (tabNewTab != null) {
                tabNewTab.setText("拍照");
            }
            if (tabNewTab != null && (tabLayout2 = this.f73851b) != null) {
                tabLayout2.addTab(tabNewTab);
            }
        }
        if (mf(1) != null) {
            TabLayout tabLayout4 = this.f73851b;
            TabLayout.Tab tabNewTab2 = null;
            if (tabLayout4 != null) {
                tabNewTab2 = tabLayout4.newTab();
            }
            if (tabNewTab2 != null) {
                tabNewTab2.setText("摄像");
            }
            if (tabNewTab2 != null && (tabLayout = this.f73851b) != null) {
                tabLayout.addTab(tabNewTab2);
            }
        }
        nf(this.f73855f);
        TabLayout tabLayout5 = this.f73851b;
        if (tabLayout5 != null) {
            tabLayout5.addOnTabSelectedListener(this);
        }
    }

    public final void showBottom(boolean z6) {
        if (z6) {
            TabLayout tabLayout = this.f73851b;
            if (tabLayout != null) {
                tabLayout.setVisibility(8);
                return;
            }
            return;
        }
        TabLayout tabLayout2 = this.f73851b;
        if (tabLayout2 != null) {
            tabLayout2.setVisibility(0);
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment
    public boolean supportToolbar() {
        return false;
    }
}
