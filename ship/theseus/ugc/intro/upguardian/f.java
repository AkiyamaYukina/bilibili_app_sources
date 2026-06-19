package com.bilibili.ship.theseus.ugc.intro.upguardian;

import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/f.class */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97619a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f97620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f97621c;

    public /* synthetic */ f(Ref.BooleanRef booleanRef, UpGuardianService upGuardianService) {
        this.f97620b = booleanRef;
        this.f97621c = upGuardianService;
    }

    public /* synthetic */ f(Ref.FloatRef floatRef, Function0 function0) {
        this.f97620b = floatRef;
        this.f97621c = function0;
    }

    public final Object invoke() {
        switch (this.f97619a) {
            case 0:
                UpGuardianService upGuardianService = (UpGuardianService) this.f97621c;
                ((Ref.BooleanRef) this.f97620b).element = CompoundPlayStateProviderKt.c(upGuardianService.f97588j);
                BLog.i("UpGuardianService-showUpGuardianSignLayer$lambda$1", "[theseus-ugc-UpGuardianService-showUpGuardianSignLayer$lambda$1] UpGuardian call player pause");
                upGuardianService.f97588j.pause();
                break;
            default:
                if (((Ref.FloatRef) this.f97620b).element > 20.0f) {
                    ((Function0) this.f97621c).invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
