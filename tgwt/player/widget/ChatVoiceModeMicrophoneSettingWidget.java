package com.bilibili.tgwt.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.playerbizcommon.features.delegate.DelegateStoreService;
import com.bilibili.tgwt.service.ChatService;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/ChatVoiceModeMicrophoneSettingWidget.class */
@StabilityInferred(parameters = 0)
public final class ChatVoiceModeMicrophoneSettingWidget extends AppCompatImageView implements IControlWidget, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f111735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InjectPlayerService
    private IControlContainerService f111736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InjectPlayerService
    private DelegateStoreService f111737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ChatService f111738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f111739e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/ChatVoiceModeMicrophoneSettingWidget$a.class */
    public static final class a implements ControlContainerVisibleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatVoiceModeMicrophoneSettingWidget f111740a;

        public a(ChatVoiceModeMicrophoneSettingWidget chatVoiceModeMicrophoneSettingWidget) {
            this.f111740a = chatVoiceModeMicrophoneSettingWidget;
        }

        public final void onControlContainerVisibleChanged(boolean z6) {
            if (z6) {
                ChatService chatService = this.f111740a.f111738d;
                ChatService chatService2 = chatService;
                if (chatService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chatService");
                    chatService2 = null;
                }
                Neurons.reportExposure$default(false, "pgc.watch-together-player-voice.side-bar.volume.show", chatService2.f111870S, (List) null, 8, (Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.ChatVoiceModeMicrophoneSettingWidget$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/ChatVoiceModeMicrophoneSettingWidget$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        Object result;
        final ChatVoiceModeMicrophoneSettingWidget this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChatVoiceModeMicrophoneSettingWidget chatVoiceModeMicrophoneSettingWidget, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = chatVoiceModeMicrophoneSettingWidget;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(this);
        }
    }

    public ChatVoiceModeMicrophoneSettingWidget(@NotNull Context context) {
        super(context);
        this.f111739e = new a(this);
        q();
    }

    public ChatVoiceModeMicrophoneSettingWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f111739e = new a(this);
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.player.widget.ChatVoiceModeMicrophoneSettingWidget.bindToView(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(Uj0.c.b(308.0f, getContext()), -1);
        layoutParams.setLayoutType(4);
        AbsFunctionWidgetService absFunctionWidgetService = this.f111735a;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.showWidget(ChatVoiceModeMicrophoneFunctionWidget.class, layoutParams);
        ChatService chatService = this.f111738d;
        if (chatService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatService");
            chatService = null;
        }
        Neurons.reportClick(false, "pgc.watch-together-player-voice.side-bar.volume.click", chatService.f111870S);
    }

    public final void q() {
        setContentDescription("bbplayer_voice_mode_mircophone_setting");
        setImageResource(2131240688);
        setBackgroundResource(2131240735);
        setScaleType(ImageView.ScaleType.CENTER);
    }
}
