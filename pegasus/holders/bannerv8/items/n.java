package com.bilibili.pegasus.holders.bannerv8.items;

import Th.b;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.PlayerWidget;
import com.bilibili.app.comm.list.common.inline.serviceV2.InlineOGVHistoryServiceV2;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTask;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineTaskScheduler;
import com.bilibili.app.comm.list.common.widget.ListLottieBadgeTagView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.magicasakura.widgets.TintTextView;
import dp0.C6829b;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8339C;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/n.class */
@StabilityInferred(parameters = 0)
public final class n extends g<Th.b> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f77798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final String f77799q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Lazy f77800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.common.h f77801s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final com.bilibili.bililive.room.ui.roomv3.voice.e f77802t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final HF.c f77803u;

    public n(@NotNull View view, boolean z6) {
        super(view);
        this.f77798p = z6;
        this.f77799q = "OgvInlineBannerHolder";
        this.f77800r = ListExtentionsKt.lazyUnsafe(new com.bilibili.ad.adview.videodetail.panel.mall.k(this, 1));
        this.f77802t = new com.bilibili.bililive.room.ui.roomv3.voice.e(this, 1);
        this.f77803u = new HF.c(this, 2);
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    public final void bind() {
        super.bind();
        q0();
        ((InlineOGVHistoryServiceV2) this.f77800r.getValue()).resetUri(s0().getUri());
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    @NotNull
    public final BiliCardPlayerScene.CardPlayTask configCustomTaskBehavior(@NotNull BiliCardPlayerScene.CardPlayTask cardPlayTask, boolean z6) {
        InlineExtensionKt.addHistoryPlugin(cardPlayTask, (InlineOGVHistoryServiceV2) this.f77800r.getValue());
        PlayerArgs playerArgs = s0().getPlayerArgs();
        if (playerArgs != null) {
            cardPlayTask.setCustomFakeDuration(((long) playerArgs.fakeDuration) * 1000);
        }
        cardPlayTask.setChronosEnable(true);
        com.bilibili.pegasus.common.h hVar = new com.bilibili.pegasus.common.h(s0());
        hVar.setVideoStateCallback(this.f77802t);
        hVar.setFollowStateCallback(this.f77803u);
        cardPlayTask.setTaskRepository(hVar);
        this.f77801s = hVar;
        super.configCustomTaskBehavior(cardPlayTask, z6);
        return cardPlayTask;
    }

    @NotNull
    public final Class<? extends Th.b> getPanelType() {
        return this.f77798p ? Th.b.class : Th.d.class;
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    public final void releaseCurrentPlayer() {
        super.releaseCurrentPlayer();
        this.f77801s = null;
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    public final long t0() {
        return (!s0().isPreview() || s0().getPlayerWidget() == null) ? 0L : 2000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u0() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.app.comm.list.widget.banneradapter.BannerController r0 = r0.f77758e
            r7 = r0
            r0 = 0
            r6 = r0
            r0 = r7
            if (r0 == 0) goto L16
            r0 = r7
            int r0 = r0.getItemCount()
            r4 = r0
            goto L18
        L16:
            r0 = 0
            r4 = r0
        L18:
            r0 = r6
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L3b
            r0 = r3
            gp0.d r0 = r0.s0()
            boolean r0 = r0.isPreview()
            if (r0 == 0) goto L39
            r0 = r6
            r5 = r0
            r0 = r3
            gp0.d r0 = r0.s0()
            com.bilibili.app.comm.list.common.data.PlayerWidget r0 = r0.getPlayerWidget()
            if (r0 != 0) goto L3b
        L39:
            r0 = 1
            r5 = r0
        L3b:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.bannerv8.items.n.u0():boolean");
    }

    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    @NotNull
    public final String v0() {
        return this.f77799q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.pegasus.holders.bannerv8.items.g
    /* JADX INFO: renamed from: w0 */
    public final void onBindPanel(@NotNull Th.b bVar) {
        super.onBindPanel(bVar);
        C8339C.d(bVar, s0());
        bVar.getAvatar().displayAvatar(s0().getPendantAvatar());
        boolean zIsPreview = s0().isPreview();
        bVar.t = zIsPreview;
        b.a aVar = bVar.x;
        bVar.removeCardPlayStateChangedCallback(aVar);
        if (zIsPreview) {
            bVar.addCardPlayStateChangedCallback(aVar);
        }
        if (s0().getHideDanmakuSwitch()) {
            bVar.getDanmaku().setVisible(false);
            bVar.getDanmaku().setVisibility(8);
        } else {
            bVar.getDanmaku().setVisible(true);
            bVar.getDanmaku().setVisibility(0);
        }
        View view = bVar.n;
        Integer numValueOf = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ogvPreviewEndView");
            view = null;
        }
        view.setOnClickListener(new AS.b(1, this));
        bVar.m().setText(s0().getTitle());
        if (bVar instanceof Th.d) {
            PlayerWidget playerWidget = s0().getPlayerWidget();
            String str = playerWidget != null ? playerWidget.title : null;
            if (str != null && !StringsKt.isBlank(str)) {
                TintTextView tintTextView = bVar.o;
                if (tintTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("endViewText");
                    tintTextView = null;
                }
                PlayerWidget playerWidget2 = s0().getPlayerWidget();
                tintTextView.setText(playerWidget2 != null ? playerWidget2.title : null);
            }
            PlayerWidget playerWidget3 = s0().getPlayerWidget();
            String str2 = playerWidget3 != null ? playerWidget3.desc : null;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                TintTextView tintTextView2 = bVar.p;
                if (tintTextView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("endViewGoDetail");
                    tintTextView2 = null;
                }
                PlayerWidget playerWidget4 = s0().getPlayerWidget();
                tintTextView2.setText(playerWidget4 != null ? playerWidget4.desc : null);
            }
            Th.d dVar = (Th.d) bVar;
            C6829b c6829bB = s0().b();
            String strB = c6829bB != null ? c6829bB.b() : null;
            C6829b c6829bB2 = s0().b();
            String strC = c6829bB2 != null ? c6829bB2.c() : null;
            C6829b c6829bB3 = s0().b();
            if (c6829bB3 != null) {
                numValueOf = Integer.valueOf(c6829bB3.a());
            }
            ListLottieBadgeTagView listLottieBadgeTagView = dVar.y;
            if (listLottieBadgeTagView != null) {
                listLottieBadgeTagView.j0(numValueOf, strB, strC);
            }
        }
        new InlineTaskScheduler(CollectionsKt.listOf(new InlineTask[]{bVar.getInline4GWarningWidget(), new InlineToastTask(bVar)})).execute();
    }
}
