package com.bilibili.ship.theseus.ugc.interactivevideo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ugc.feature.interactivevideo.e;
import com.bilibili.app.gemini.ugc.feature.interactivevideo.j;
import com.bilibili.app.gemini.ugc.feature.interactivevideo.k;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playerbizcommon.features.interactvideo.InteractVideoApiService;
import com.bilibili.playerbizcommon.features.interactvideo.model.InteractNode;
import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService;
import com.bilibili.ship.theseus.united.page.interactvideo.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/interactivevideo/b.class */
@StabilityInferred(parameters = 0)
public final class b extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TheseusInteractVideoService f96928f;

    public b(@NotNull TheseusInteractVideoService theseusInteractVideoService) {
        this.f96928f = theseusInteractVideoService;
        g(theseusInteractVideoService.f99876M);
    }

    public final long a() {
        return this.f96928f.f99877N.f().getAvid();
    }

    @Nullable
    public final InteractNode b() {
        return this.f96928f.f99866C;
    }

    public final void d(int i7, @NotNull k kVar) {
        TheseusInteractVideoService theseusInteractVideoService = this.f96928f;
        String accessKey = theseusInteractVideoService.f99897n.getAccessKey();
        String str = accessKey;
        if (accessKey == null) {
            str = "";
        }
        ((InteractVideoApiService) ServiceGenerator.createService(InteractVideoApiService.class)).markInteractVideo(str, theseusInteractVideoService.f99906w.getAvid(), i7).enqueue(new u(i7, kVar));
    }

    public final void e(@NotNull j jVar) {
        this.f96928f.j(jVar, null, true);
    }

    public final void f() {
        this.f96928f.k();
    }
}
