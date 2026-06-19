package com.bilibili.tgwt.ui;

import io.reactivex.rxjava3.functions.Consumer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/e.class */
public final class e implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f112295b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f112294a = i7;
        this.f112295b = obj;
    }

    public final void accept(Object obj) throws Exception {
        switch (this.f112294a) {
            case 0:
                Long l7 = (Long) obj;
                TogetherWatchDetailPageActivity togetherWatchDetailPageActivity = (TogetherWatchDetailPageActivity) this.f112295b;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = togetherWatchDetailPageActivity.f112214D;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
                if (togetherWatchDetailPageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    togetherWatchDetailPageViewModel2 = null;
                }
                togetherWatchDetailPageViewModel2.getActivityContextParamsService().mockIntent(l7.longValue());
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = togetherWatchDetailPageActivity.f112214D;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
                if (togetherWatchDetailPageViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    togetherWatchDetailPageViewModel4 = null;
                }
                togetherWatchDetailPageViewModel4.getPlayControlService().stop();
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = togetherWatchDetailPageActivity.f112214D;
                if (togetherWatchDetailPageViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    togetherWatchDetailPageViewModel5 = null;
                }
                togetherWatchDetailPageViewModel5.getPlayControlService().resetSwitchState();
                return;
            default:
                if (!((Boolean) ((Function0) this.f112295b).invoke()).booleanValue()) {
                    throw new Exception();
                }
                return;
        }
    }
}
