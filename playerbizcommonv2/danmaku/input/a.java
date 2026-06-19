package com.bilibili.playerbizcommonv2.danmaku.input;

import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import com.bilibili.playerbizcommonv2.danmaku.input.widget.PlayerDanmakuEditText;
import com.bilibili.playerbizcommonv2.danmaku.input.widget.PlayerDanmakuExpressionView;
import com.bilibili.playerbizcommonv2.danmaku.input.widget.PlayerInputPlaceholderView;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pr0.InterfaceC8347a;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;
import tv.danmaku.biliplayerv2.service.interact.core.sender.DanmakuSendParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/a.class */
public interface a {
    static /* synthetic */ void a(a aVar, String str, Integer num, Integer num2, Integer num3, Integer num4, int i7) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            num = null;
        }
        if ((i7 & 4) != 0) {
            num2 = null;
        }
        if ((i7 & 8) != 0) {
            num3 = null;
        }
        if ((i7 & 16) != 0) {
            num4 = null;
        }
        aVar.j(str, num, num2, num3, num4);
    }

    static /* synthetic */ void q(a aVar, CommandsPanel commandsPanel, DmViewReply dmViewReply, String str, Long l7, int i7) {
        DmViewReply dmViewReply2 = (i7 & 2) != 0 ? null : dmViewReply;
        String str2 = (i7 & 4) != 0 ? null : str;
        if ((i7 & 128) != 0) {
            l7 = null;
        }
        aVar.r(dmViewReply2, str2, null, null, null, 0, l7);
    }

    void b(@NotNull List<CommandsDanmaku> list);

    @NotNull
    List<CommandsDanmaku> c();

    void d(@NotNull PlayerDanmakuEditText playerDanmakuEditText);

    @NotNull
    InterfaceC8347a e();

    @Nullable
    PlayerInputPlaceholderView f();

    default void g(boolean z6) {
    }

    @NotNull
    String getCurrentRecommendWord();

    @Nullable
    InputPanelContainer getPanelContainer();

    @Nullable
    InputPanelContainer h();

    void i();

    void j(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4);

    boolean k();

    @Nullable
    Object l(@NotNull ContinuationImpl continuationImpl);

    @Nullable
    com.bilibili.playerbizcommonv2.danmaku.input.panel.a m();

    @NotNull
    qr0.c n();

    @Nullable
    default qr0.d o() {
        return null;
    }

    void onBackPressed();

    void p(@NotNull DanmakuSendParams danmakuSendParams);

    default void r(@Nullable DmViewReply dmViewReply, @Nullable String str, @Nullable PlayerDanmakuExpressionView.a aVar, @Nullable String str2, @Nullable String str3, int i7, @Nullable Long l7) {
    }

    void s(@NotNull PlayerDanmakuEditText playerDanmakuEditText);

    @NotNull
    qr0.b t();
}
