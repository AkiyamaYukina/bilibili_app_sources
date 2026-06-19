package com.bilibili.tgwt.player.widget;

import ES0.S;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.tgwt.service.ChatService;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/ChatVoiceModeEmoticonWidget.class */
@StabilityInferred(parameters = 0)
public final class ChatVoiceModeEmoticonWidget extends AppCompatImageView implements IControlWidget, View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f111724d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f111725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ChatService f111726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Provider<ChatVoiceModeEmoticonFunctionWidget> f111727c;

    @JvmOverloads
    public ChatVoiceModeEmoticonWidget(@NotNull Context context) {
        this(context, null);
    }

    @JvmOverloads
    public ChatVoiceModeEmoticonWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentDescription("bbplayer_voice_mode_emotion");
        setImageResource(2131240687);
        setBackgroundResource(2131240739);
        setScaleType(ImageView.ScaleType.CENTER);
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this, new ExposureEntry(Pl0.b.f19035a, new S(this, 5)));
    }

    @Nullable
    public final Object bindToView(@NotNull Continuation<? super Unit> continuation) {
        setOnClickListener(this);
        return Unit.INSTANCE;
    }

    @NotNull
    public final ChatService getChatService() {
        ChatService chatService = this.f111726b;
        if (chatService != null) {
            return chatService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chatService");
        return null;
    }

    @NotNull
    public final Provider<ChatVoiceModeEmoticonFunctionWidget> getChatVoiceModeEmoticonFunctionWidgetProvider() {
        Provider<ChatVoiceModeEmoticonFunctionWidget> provider = this.f111727c;
        if (provider != null) {
            return provider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chatVoiceModeEmoticonFunctionWidgetProvider");
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(Uj0.c.b(251.0f, getContext()), -1);
        layoutParams.setLayoutType(4);
        AbsFunctionWidgetService absFunctionWidgetService = this.f111725a;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.showWidget((AbsFunctionWidget) getChatVoiceModeEmoticonFunctionWidgetProvider().get(), layoutParams);
        Neurons.reportClick(false, "pgc.watch-together-player-voice.side-bar.expression.click", getChatService().f111870S);
    }

    @Inject
    public final void setChatService(@NotNull ChatService chatService) {
        this.f111726b = chatService;
    }

    @Inject
    public final void setChatVoiceModeEmoticonFunctionWidgetProvider(@NotNull Provider<ChatVoiceModeEmoticonFunctionWidget> provider) {
        this.f111727c = provider;
    }
}
