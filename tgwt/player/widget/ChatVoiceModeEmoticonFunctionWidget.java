package com.bilibili.tgwt.player.widget;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.bangumi.player.commonplayer.functionwidget.PGCFunctionWidget;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.tgwt.service.ChatService;
import javax.inject.Inject;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/ChatVoiceModeEmoticonFunctionWidget.class */
@StabilityInferred(parameters = 0)
public final class ChatVoiceModeEmoticonFunctionWidget extends PGCFunctionWidget {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ChatService f111721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f111722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ED0.l f111723e;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public ChatVoiceModeEmoticonFunctionWidget(@NotNull Context context, @NotNull ChatService chatService) {
        super(context);
        this.f111721c = chatService;
        this.f111723e = new ED0.l(new ED0.k(0), new com.bilibili.ad.core.debug.c(1, this));
    }

    public static Unit h(ChatVoiceModeEmoticonFunctionWidget chatVoiceModeEmoticonFunctionWidget, int i7, int i8) {
        Neurons.reportClick(false, "pgc.watch-together-player-voice.experssion.0.click", chatVoiceModeEmoticonFunctionWidget.f111721c.c(MapsKt.mapOf(TuplesKt.to("expression_id", String.valueOf(i8)))));
        chatVoiceModeEmoticonFunctionWidget.f111721c.k(i7);
        AbsFunctionWidgetService absFunctionWidgetService = chatVoiceModeEmoticonFunctionWidget.f111722d;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(chatVoiceModeEmoticonFunctionWidget.getToken());
        return Unit.INSTANCE;
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-106748050, true, new com.bilibili.ad.core.debug.d(this, 1)));
        return composeView;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.player.widget.ChatVoiceModeEmoticonFunctionWidget.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(true, true, true, true, true);
        builderA.changeOrientationDisableWhenShow(true);
        return builderA.build();
    }
}
