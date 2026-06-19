package com.bilibili.ship.theseus.ugc.intro.iframe;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.ugc.intro.iframe.b;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/UgcIntroIframeService.class */
@StabilityInferred(parameters = 0)
public final class UgcIntroIframeService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f97018a;

    @Inject
    public UgcIntroIframeService(@NotNull ActivityColorRepository activityColorRepository) {
        this.f97018a = activityColorRepository;
    }

    @NotNull
    public final RunningUIComponent a(@NotNull a aVar) {
        BLog.i("UgcIntroIframeService-create", "[theseus-ugc-UgcIntroIframeService-create] " + ("iframeHeight: " + aVar.f97019a + " " + aVar.f97020b));
        ActivityColorRepository activityColorRepository = this.f97018a;
        b bVar = new b(new b.a(aVar.f97019a, aVar.f97020b, activityColorRepository.a(), activityColorRepository.h(), activityColorRepository.a(), activityColorRepository.c()));
        return new RunningUIComponent(bVar, 0, new UgcIntroIframeService$create$1(bVar, null), 2);
    }
}
