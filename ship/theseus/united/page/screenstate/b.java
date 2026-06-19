package com.bilibili.ship.theseus.united.page.screenstate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.AutoFullscreenService;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import javax.inject.Inject;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final h f102983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C7893a f102984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AutoFullscreenService f102985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c f102986d;

    @Inject
    public b(@NotNull h hVar, @NotNull C7893a c7893a, @NotNull AutoFullscreenService autoFullscreenService, @NotNull c cVar) {
        this.f102983a = hVar;
        this.f102984b = c7893a;
        this.f102985c = autoFullscreenService;
        this.f102986d = cVar;
    }

    @Nullable
    public final PageRestoredState a() {
        j jVarJ = this.f102983a.j();
        Long longOrNull = null;
        if (jVarJ == null) {
            return null;
        }
        long j7 = Duration.getInWholeMilliseconds-impl(jVarJ.F());
        long cid = jVarJ.f().getCid();
        long avid = jVarJ.f().getAvid();
        String bvId = jVarJ.f().getBvId();
        String str = (String) jVarJ.f().getExtraContentForResolve().get("season_id");
        if (str != null) {
            longOrNull = StringsKt.toLongOrNull(str);
        }
        return new PageRestoredState(j7, cid, avid, bvId, longOrNull, this.f102985c.f98785a ? AutoFullscreenService.FullscreenMode.ForcedInFullscreen : this.f102986d.h().f102988b ? AutoFullscreenService.FullscreenMode.AutoFullscreen : AutoFullscreenService.FullscreenMode.UserSpecified, (PlayingAreaDescription) this.f102984b.f123389b.getValue());
    }
}
