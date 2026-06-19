package com.bilibili.tgwt.match.ui;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.image2.bean.AnimationInfo;
import com.bilibili.lib.image2.bean.BiliAnimatable;
import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.tgwt.match.ui.TogetherWatchMatchFragment;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/e.class */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TogetherWatchMatchFragment f111503a;

    public /* synthetic */ e(TogetherWatchMatchFragment togetherWatchMatchFragment) {
        this.f111503a = togetherWatchMatchFragment;
    }

    public final Object invoke() {
        AnimationInfo animateInfo;
        BiliAnimatable animatable;
        AnimationInfo animateInfo2;
        BiliAnimatable animatable2;
        TogetherWatchMatchFragment togetherWatchMatchFragment = this.f111503a;
        JD0.d dVar = togetherWatchMatchFragment.f111478b;
        JD0.d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar2 = null;
        }
        dVar2.f11251e = true;
        JD0.d dVar3 = togetherWatchMatchFragment.f111478b;
        JD0.d dVar4 = dVar3;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar4 = null;
        }
        ImageInfo imageInfo = dVar4.f11249c;
        if (imageInfo != null && (animateInfo2 = imageInfo.getAnimateInfo()) != null && (animatable2 = animateInfo2.getAnimatable()) != null) {
            animatable2.start();
        }
        JD0.d dVar5 = togetherWatchMatchFragment.f111478b;
        JD0.d dVar6 = dVar5;
        if (dVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar6 = null;
        }
        ImageInfo imageInfo2 = dVar6.f11250d;
        if (imageInfo2 != null && (animateInfo = imageInfo2.getAnimateInfo()) != null && (animatable = animateInfo.getAnimatable()) != null) {
            animatable.start();
        }
        JD0.d dVar7 = togetherWatchMatchFragment.f111478b;
        JD0.d dVar8 = dVar7;
        if (dVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar8 = null;
        }
        if (dVar8.f11257l) {
            dVar8.f11257l = false;
            dVar8.notifyPropertyChanged(396);
        }
        switch (TogetherWatchMatchFragment.a.f111498a[togetherWatchMatchFragment.h.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchMatchFragment), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchMatchFragment$onMatchAndJoinClick$1(togetherWatchMatchFragment, Long.valueOf(togetherWatchMatchFragment.f111481e), Long.valueOf(togetherWatchMatchFragment.f111482f), null), 3, (Object) null);
                JD0.d dVar9 = togetherWatchMatchFragment.f111478b;
                if (dVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    dVar9 = null;
                }
                dVar9.q("正在为你匹配放映室...");
                break;
            case 8:
            case 9:
            case 10:
            default:
                ToastHelper.showToastShort(togetherWatchMatchFragment.getContext(), 2131836261);
                FragmentActivity fragmentActivityP3 = togetherWatchMatchFragment.p3();
                if (fragmentActivityP3 != null) {
                    fragmentActivityP3.finish();
                }
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchMatchFragment), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchMatchFragment$onCreateRoomClick$1(togetherWatchMatchFragment, null), 3, (Object) null);
                JD0.d dVar10 = togetherWatchMatchFragment.f111478b;
                if (dVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    dVar10 = null;
                }
                dVar10.q("正在创建放映室...");
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchMatchFragment), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchMatchFragment$onFromShareAndJoinClick$1(togetherWatchMatchFragment, null), 3, (Object) null);
                JD0.d dVar11 = togetherWatchMatchFragment.f111478b;
                if (dVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    dVar11 = null;
                }
                dVar11.q("正在进入放映室...");
                break;
        }
        return Unit.INSTANCE;
    }
}
