package com.bilibili.pegasus.components;

import com.bilibili.bililive.infra.arch.jetpack.liveData.SafeMutableLiveData;
import com.bilibili.bililive.videoliveplayer.net.beans.praise.LiveCollectionPraiseProcess;
import com.bilibili.inline.reporter.AutoPlayTriggerType;
import com.bilibili.inline.reporter.InlinePlayReporterKt;
import com.bilibili.lib.homepage.splash.SplashViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/J.class */
public final /* synthetic */ class J implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f75814b;

    public /* synthetic */ J(Object obj, int i7) {
        this.f75813a = i7;
        this.f75814b = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.f75813a) {
            case 0:
                SplashViewModel.SplashExitInfo splashExitInfo = (SplashViewModel.SplashExitInfo) obj;
                if (splashExitInfo != null && splashExitInfo.getAnimState() == 1) {
                    InlineComponent inlineComponent = (InlineComponent) this.f75814b;
                    inlineComponent.f75806z = null;
                    InlinePlayReporterKt.reportTryAutoPlayEvent$default(AutoPlayTriggerType.SPLASH_ANIM_START, (String) null, true, 2, (Object) null);
                    InlineComponent.d(inlineComponent, true, 2);
                }
                break;
            default:
                ((SafeMutableLiveData) ((jI.b) this.f75814b).j.getValue()).setValue((LiveCollectionPraiseProcess) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
