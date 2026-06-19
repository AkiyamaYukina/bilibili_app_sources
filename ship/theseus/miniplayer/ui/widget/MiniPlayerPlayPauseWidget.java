package com.bilibili.ship.theseus.miniplayer.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bilibili.magicasakura.widgets.TintImageView;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;
import vh0.AbstractC8809a;
import vh0.InterfaceC8810b;
import wh0.C8887d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/ui/widget/MiniPlayerPlayPauseWidget.class */
public final class MiniPlayerPlayPauseWidget extends TintImageView implements InterfaceC8810b, View.OnClickListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f91197g = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public AbstractC8809a f91198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final a f91199f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/ui/widget/MiniPlayerPlayPauseWidget$a.class */
    public final class a implements ICardPlaySateChangedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MiniPlayerPlayPauseWidget f91200a;

        public a(MiniPlayerPlayPauseWidget miniPlayerPlayPauseWidget) {
            this.f91200a = miniPlayerPlayPauseWidget;
        }

        public final void onCompleted(ICardPlayerContext iCardPlayerContext) {
            super.onCompleted(iCardPlayerContext);
            int i7 = MiniPlayerPlayPauseWidget.f91197g;
            this.f91200a.setImageLevel(0);
        }

        public final void onPause(ICardPlayerContext iCardPlayerContext) {
            super.onPause(iCardPlayerContext);
            int i7 = MiniPlayerPlayPauseWidget.f91197g;
            this.f91200a.setImageLevel(0);
        }

        public final void onResume(ICardPlayerContext iCardPlayerContext) {
            super.onResume(iCardPlayerContext);
            int i7 = MiniPlayerPlayPauseWidget.f91197g;
            this.f91200a.setImageLevel(1);
        }

        public final void onStop(ICardPlayerContext iCardPlayerContext) {
            super.onStop(iCardPlayerContext);
            int i7 = MiniPlayerPlayPauseWidget.f91197g;
            this.f91200a.setImageLevel(0);
        }
    }

    @JvmOverloads
    public MiniPlayerPlayPauseWidget(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public MiniPlayerPlayPauseWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public MiniPlayerPlayPauseWidget(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f91199f = new a(this);
        setOnClickListener(this);
        setImageResource(2131240937);
    }

    @Override // vh0.InterfaceC8810b
    @Nullable
    public AbstractC8809a getPanel() {
        return this.f91198e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        com.bilibili.ship.theseus.miniplayer.ui.a.a(this, 200L, 2);
        AbstractC8809a panel = getPanel();
        BiliCardPlayerScene.CardPlayTask.Token token = panel != null ? panel.f128251b : null;
        Integer numValueOf = token != null ? Integer.valueOf(token.getPlayerState()) : null;
        Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("switch", (numValueOf != null && numValueOf.intValue() == 4) ? "2" : "1"), TuplesKt.to("type", "lite")});
        AbstractC8809a panel2 = getPanel();
        BiliCardPlayerScene.CardPlayTask.Token token2 = panel2 != null ? panel2.f128251b : null;
        if (token2 != null) {
            token2.report(new NeuronsEvents.b("player.miniplayer.miniplayer-board.start-stop.player", mapMapOf));
        }
        if (numValueOf == null || numValueOf.intValue() != 4) {
            AbstractC8809a panel3 = getPanel();
            BiliCardPlayerScene.CardPlayTask.Token token3 = null;
            if (panel3 != null) {
                token3 = panel3.f128251b;
            }
            if (token3 != null) {
                token3.resume();
                return;
            }
            return;
        }
        AbstractC8809a panel4 = getPanel();
        BiliCardPlayerScene.CardPlayTask.Token token4 = panel4 != null ? panel4.f128251b : null;
        if (token4 != null) {
            token4.reportPauseByUser();
        }
        AbstractC8809a panel5 = getPanel();
        BiliCardPlayerScene.CardPlayTask.Token token5 = null;
        if (panel5 != null) {
            token5 = panel5.f128251b;
        }
        if (token5 != null) {
            token5.pause();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // vh0.InterfaceC8810b
    public final void onPanelAttach() {
        setImageLevel(0);
        AbstractC8809a panel = getPanel();
        if (panel != null) {
            ((C8887d) panel.f128250a.f128669a.getValue()).f128668a.add((T) this.f91199f);
        }
    }

    @Override // vh0.InterfaceC8810b
    public final void onPanelDetach() {
        AbstractC8809a panel = getPanel();
        if (panel != null) {
            ((C8887d) panel.f128250a.f128669a.getValue()).f128668a.remove(this.f91199f);
        }
    }

    @Override // vh0.InterfaceC8810b
    public void setPanel(@Nullable AbstractC8809a abstractC8809a) {
        this.f91198e = abstractC8809a;
    }
}
