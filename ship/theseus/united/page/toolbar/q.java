package com.bilibili.ship.theseus.united.page.toolbar;

import com.bilibili.playerbizcommonv2.widget.setting.X;
import kntr.base.router.Router;
import kntr.common.router.UrisKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.fullscreen.state.M1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/q.class */
public final /* synthetic */ class q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f103438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f103439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f103440c;

    public /* synthetic */ q(int i7, Object obj, Object obj2) {
        this.f103438a = i7;
        this.f103439b = obj;
        this.f103440c = obj2;
    }

    public final Object invoke() {
        switch (this.f103438a) {
            case 0:
                BLog.i("MenuService-createAutoPlay$lambda$0", "[theseus-united-MenuService-createAutoPlay$lambda$0] click auto play");
                MenuService menuService = (MenuService) this.f103439b;
                boolean zBooleanValue = ((Boolean) menuService.f103241I.getValue()).booleanValue();
                menuService.k(!zBooleanValue ? "1" : "0", ((X) this.f103440c).f83174g);
                menuService.f103241I.setValue(Boolean.valueOf(!zBooleanValue));
                MutableStateFlow<Integer> mutableStateFlow = menuService.f103240H;
                int iIntValue = ((Number) mutableStateFlow.getValue()).intValue();
                if (!zBooleanValue && iIntValue == 0) {
                    mutableStateFlow.setValue(1);
                } else if (zBooleanValue && iIntValue == 1) {
                    mutableStateFlow.setValue(0);
                }
                menuService.i();
                return Unit.INSTANCE;
            case 1:
                return ((Router) this.f103439b).launch(UrisKt.toUri((String) this.f103440c));
            default:
                ((Function1) this.f103439b).invoke((M1) this.f103440c);
                return Unit.INSTANCE;
        }
    }
}
