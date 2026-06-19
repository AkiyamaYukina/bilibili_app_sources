package com.bilibili.ship.theseus.united.page.miniplayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.player.MiniPlayerAutoPlaySetting;
import com.bilibili.ship.theseus.united.page.miniplayer.b;
import javax.inject.Inject;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/a.class */
@StabilityInferred(parameters = 0)
public final class a extends yv0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final b.a f102046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow f102047e;

    @Inject
    public a(@Nullable b.a aVar) {
        this.f102046d = aVar;
        if (aVar == null || !aVar.f102070a) {
            BLog.i("inner miniPlayer is disable");
        }
        this.f102047e = this.f129911c;
    }

    public static boolean c() {
        MiniPlayerAutoPlaySetting miniPlayerAutoPlaySetting = (MiniPlayerAutoPlaySetting) BLRouter.get$default(BLRouter.INSTANCE, MiniPlayerAutoPlaySetting.class, (String) null, 2, (Object) null);
        boolean z6 = false;
        if (miniPlayerAutoPlaySetting != null) {
            z6 = false;
            if (miniPlayerAutoPlaySetting.getSpEnableAutoMiniPlay()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final boolean d() {
        MiniPlayerAutoPlaySetting miniPlayerAutoPlaySetting;
        boolean z6 = true;
        b.a aVar = this.f102046d;
        if ((aVar != null && aVar.f102070a) || (miniPlayerAutoPlaySetting = (MiniPlayerAutoPlaySetting) BLRouter.get$default(BLRouter.INSTANCE, MiniPlayerAutoPlaySetting.class, (String) null, 2, (Object) null)) == null || !miniPlayerAutoPlaySetting.getSpEnableInnerAutoMiniPlay()) {
            z6 = false;
        }
        return z6;
    }

    public final boolean e() {
        return ((Boolean) this.f102047e.getValue()).booleanValue();
    }
}
