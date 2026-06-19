package com.bilibili.ship.theseus.ogv.toolbar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import tv.danmaku.bili.splash.ad.button.card.CarouselSlot;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/toolbar/a.class */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94581a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f94583c;

    public /* synthetic */ a(int i7, State state) {
        this.f94582b = i7;
        this.f94583c = state;
    }

    public /* synthetic */ a(ToolbarTogetherWatchRepository toolbarTogetherWatchRepository, int i7) {
        this.f94583c = toolbarTogetherWatchRepository;
        this.f94582b = i7;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.f94581a) {
            case 0:
                ((Integer) obj2).intValue();
                ((ToolbarTogetherWatchRepository) this.f94583c).a((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f94582b | 1));
                break;
            default:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1576668075, iIntValue, -1, "tv.danmaku.bili.splash.ad.button.card.CarouselContent.<anonymous>.<anonymous> (VerticalLoopImageCarousel.kt:411)");
                    }
                    ((Function5) ((State) this.f94583c).getValue()).invoke(Integer.valueOf(this.f94582b), Boolean.FALSE, CarouselSlot.Peek, composer, Integer.valueOf(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
