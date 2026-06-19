package com.bilibili.pegasus.holders.bannerv8.items;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineUGCHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.widget.banneradapter.BannerController;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.biligame.ui.minev3.z;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.utils.InlineExtensionKt;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8339C;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/p.class */
@StabilityInferred(parameters = 0)
public final class p extends g<Th.b> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final String f77807p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f77808q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.common.n f77809r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final z f77810s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Vk0.e f77811t;

    public p(@NotNull View view) {
        super(view);
        this.f77807p = "UgcInlineBannerHolder";
        this.f77808q = ListExtentionsKt.lazyUnsafe(new Df.i(this, 2));
        this.f77810s = new z(this, 2);
        this.f77811t = new Vk0.e(this, 2);
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    public final void bind() {
        super.bind();
        q0();
        ((InlineUGCHistoryServiceV2) this.f77808q.getValue()).reset(s0().getUri());
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineUGCHistoryServiceV2) this.f77808q.getValue());
        cardPlayTask.setChronosEnable(true);
        com.bilibili.pegasus.common.n nVar = new com.bilibili.pegasus.common.n(s0());
        nVar.setVideoStateCallback(this.f77810s);
        nVar.setFollowStateCallback(this.f77811t);
        cardPlayTask.setTaskRepository(nVar);
        this.f77809r = nVar;
        super.configCustomTaskBehavior(cardPlayTask, z6);
        return cardPlayTask;
    }

    @NotNull
    public final Class<? extends Th.b> getPanelType() {
        return Th.b.class;
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    public final void releaseCurrentPlayer() {
        super.releaseCurrentPlayer();
        this.f77809r = null;
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    public final boolean u0() {
        BannerController bannerController = this.f77758e;
        boolean z6 = false;
        if ((bannerController != null ? bannerController.getItemCount() : 0) == 1) {
            z6 = true;
        }
        return z6;
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    @NotNull
    public final String v0() {
        return this.f77807p;
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    /* JADX INFO: renamed from: w0 */
    public final void onBindPanel(@NotNull Th.b bVar) {
        super.onBindPanel(bVar);
        C8339C.d(bVar, s0());
        bVar.getAvatar().displayAvatar(s0().getPendantAvatar());
        if (s0().getHideDanmakuSwitch()) {
            bVar.getDanmaku().setVisible(false);
            bVar.getDanmaku().setVisibility(8);
        } else {
            bVar.getDanmaku().setVisible(true);
            bVar.getDanmaku().setVisibility(0);
        }
        bVar.m().setText(s0().getTitle());
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{bVar.getInline4GWarningWidget(), new InlineToastTask(bVar)})).execute();
    }
}
