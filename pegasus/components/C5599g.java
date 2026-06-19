package com.bilibili.pegasus.components;

import com.bilibili.base.BiliContext;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.moduleservice.main.MainCommonService;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusVisibleState;
import dp0.C6828a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/g.class */
public final class C5599g implements com.bilibili.pegasus.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasePegasusComponent f75961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6828a f75962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CommonConfigComponent f75963c;

    public C5599g(BasePegasusComponent basePegasusComponent, C6828a c6828a, CommonConfigComponent commonConfigComponent) {
        this.f75961a = basePegasusComponent;
        this.f75962b = c6828a;
        this.f75963c = commonConfigComponent;
    }

    /* JADX INFO: renamed from: onVisibleStateChanged-9haIX0A, reason: not valid java name */
    public final void m8009onVisibleStateChanged9haIX0A(int i7, int i8) {
        if (PegasusVisibleState.isVisible-impl(i8)) {
            if (this.f75962b.C() == 2) {
                BLog.i("PegasusCommonConfigPlugin", "page visible, showNightFollowSystemSnackbar");
                if (MultipleThemeUtils.isContextModeNight(BiliContext.application()) != MultipleThemeUtils.isNightTheme(BiliContext.application())) {
                    MainCommonService mainCommonService = (MainCommonService) w8.d.a(BLRouter.INSTANCE, MainCommonService.class, "default");
                    CommonConfigComponent commonConfigComponent = this.f75963c;
                    if (mainCommonService != null) {
                        mainCommonService.changeNightMode(commonConfigComponent.getContext(), true);
                    }
                    CommonConfigComponent.c(commonConfigComponent);
                }
            }
            this.f75961a.removeVisibleStateChangeListener(this);
        }
    }
}
