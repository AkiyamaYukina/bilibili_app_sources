package com.bilibili.upper.module.uppercenter.activity;

import QE0.e;
import Yv0.b;
import Yv0.c;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import bF0.C4947B;
import bolts.Task;
import com.bilibili.common.hilowebview.utils.TimeLineTag;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.videoupload.speeddetect.UploadLineSpeedDetect;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.upper.module.uppercenter.fragment.UpperCenterMainFragmentV4;
import com.bilibili.upper.module.uppercenter.model.UpperCenterViewModel;
import eJ0.r;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import qw0.C8488a;
import rw0.C8554a;
import yW.h;
import yW.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/activity/UpperCenterMainActivityV4.class */
@StabilityInferred(parameters = 0)
public final class UpperCenterMainActivityV4 extends b<UpperCenterViewModel, C4947B> {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f114079F = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public h f114080E;

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewBinding R6() {
        return C4947B.inflate(getLayoutInflater());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c S6() {
        return (UpperCenterViewModel) new ViewModelProvider(this).get(UpperCenterViewModel.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachBaseContext(Context context) {
        super/*androidx.appcompat.app.AppCompatActivity*/.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        UpperCenterViewModel upperCenterViewModel;
        UpperCenterViewModel upperCenterViewModel2;
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i7, i8, intent);
        if (i8 == -1 && i7 == 1000 && (upperCenterViewModel2 = (UpperCenterViewModel) ((b) this).B) != null) {
            upperCenterViewModel2.K0();
        }
        if ((i7 == 101 || i7 == 103) && (upperCenterViewModel = (UpperCenterViewModel) ((b) this).B) != null) {
            upperCenterViewModel.K0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final void onCreate(@Nullable Bundle bundle) {
        ConcurrentHashMap concurrentHashMap = j.a;
        h hVarA = j.a(UUID.randomUUID().toString());
        this.f114080E = hVarA;
        hVarA.c((Long) null, TimeLineTag.ActivityCreate.getValue());
        super.onCreate(bundle);
        if (GA0.b.a(this)) {
            finish();
            return;
        }
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
            if (MultipleThemeUtils.isWhiteTheme(window.getContext())) {
                window.getDecorView().setSystemUiVisibility(9216);
            } else {
                window.getDecorView().setSystemUiVisibility(1280);
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        }
        Uri data = getIntent().getData();
        if (data != null && Intrinsics.areEqual("/audios", data.getFragment())) {
            BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/manuscript-list/")).extras((Function1) new Object()).build(), this);
            finish();
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag("UpperCenterMainFragmentV4");
        UpperCenterMainFragmentV4 upperCenterMainFragmentV4 = null;
        if (fragmentFindFragmentByTag instanceof UpperCenterMainFragmentV4) {
            upperCenterMainFragmentV4 = (UpperCenterMainFragmentV4) fragmentFindFragmentByTag;
        }
        if (upperCenterMainFragmentV4 == null) {
            supportFragmentManager.beginTransaction().replace(2131299396, new UpperCenterMainFragmentV4()).commitAllowingStateLoss();
        }
        Task.callInBackground(new e(this));
        Lazy<C8554a> lazy = C8554a.f127050c;
        C8554a.C1351a.a().a();
        Lazy<C8488a> lazy2 = C8488a.f126360e;
        C8488a.C1345a.a().a();
        UploadLineSpeedDetect.c();
        Lazy<r> lazy3 = r.f117287g;
        if (r.a.b()) {
            r.a.a().g();
        }
    }

    public final void onDestroy() {
        h hVar = this.f114080E;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeLine");
            hVar = null;
        }
        hVar.f("upper.timeline.native", MapsKt.mapOf(TuplesKt.to("page_name", "upper_centermain")), (Function0) null);
        ConcurrentHashMap concurrentHashMap = j.a;
        h hVar2 = this.f114080E;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeLine");
            hVar2 = null;
        }
        j.a.remove(hVar2.a);
        super.onDestroy();
        Lazy<r> lazy = r.f117287g;
        if (r.a.b()) {
            r.a.a().i();
        }
        Xz0.j.d("first_entrance");
        Lazy<C8488a> lazy2 = C8488a.f126360e;
        C8488a.C1345a.a().b();
    }
}
