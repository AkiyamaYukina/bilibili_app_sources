package com.bilibili.tgwt.player.widget;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.panel.IPlayerLayer;
import tv.danmaku.biliplayerv2.service.B;
import tv.danmaku.biliplayerv2.service.WindowInset;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/m.class */
@StabilityInferred(parameters = 0)
public final class m extends View implements IPlayerLayer<View>, View.OnClickListener, B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BangumiPlayerContainerService f111839a;

    public m(@NotNull Context context, @NotNull com.bilibili.tgwt.watermark.b bVar, @NotNull BangumiPlayerContainerService bangumiPlayerContainerService) {
        super(context);
        this.f111839a = bangumiPlayerContainerService;
        bVar.a(this);
    }

    @NotNull
    public View getView() {
        return this;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        if (this.f111839a.getPlayerServiceController().p()) {
            this.f111839a.getPlayerServiceController().n();
        } else {
            this.f111839a.getPlayerServiceController().c().show();
        }
    }

    public final void onWindowInsetChanged(@NotNull WindowInset windowInset) {
        setPadding(windowInset.getLeftPadding(), windowInset.getTopPadding(), windowInset.getRightPadding(), windowInset.getBottomPadding());
    }
}
