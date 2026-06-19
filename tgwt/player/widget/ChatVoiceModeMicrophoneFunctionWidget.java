package com.bilibili.tgwt.player.widget;

import DD0.d0;
import HD0.C2048a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SeekBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.playerbizcommon.features.delegate.DelegateStoreService;
import com.bilibili.tgwt.service.ChatService;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/ChatVoiceModeMicrophoneFunctionWidget.class */
@StabilityInferred(parameters = 0)
public final class ChatVoiceModeMicrophoneFunctionWidget extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ChatService f111728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InjectPlayerService
    private DelegateStoreService f111729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2048a f111730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f111731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Job f111732e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/ChatVoiceModeMicrophoneFunctionWidget$a.class */
    public static final class a implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatVoiceModeMicrophoneFunctionWidget f111733a;

        public a(ChatVoiceModeMicrophoneFunctionWidget chatVoiceModeMicrophoneFunctionWidget) {
            this.f111733a = chatVoiceModeMicrophoneFunctionWidget;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
            C2048a c2048a = this.f111733a.f111730c;
            C2048a c2048a2 = c2048a;
            if (c2048a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                c2048a2 = null;
            }
            c2048a2.m(i7);
            ChatService chatService = this.f111733a.f111728a;
            if (chatService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatService");
                chatService = null;
            }
            chatService.n(i7);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/ChatVoiceModeMicrophoneFunctionWidget$b.class */
    public static final class b implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatVoiceModeMicrophoneFunctionWidget f111734a;

        public b(ChatVoiceModeMicrophoneFunctionWidget chatVoiceModeMicrophoneFunctionWidget) {
            this.f111734a = chatVoiceModeMicrophoneFunctionWidget;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
            C2048a c2048a = this.f111734a.f111730c;
            C2048a c2048a2 = c2048a;
            if (c2048a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                c2048a2 = null;
            }
            c2048a2.n(i7);
            ChatService chatService = this.f111734a.f111728a;
            if (chatService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatService");
                chatService = null;
            }
            chatService.m(i7 / 100);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.ChatVoiceModeMicrophoneFunctionWidget$onWidgetShow$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/ChatVoiceModeMicrophoneFunctionWidget$onWidgetShow$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final ChatVoiceModeMicrophoneFunctionWidget this$0;

        /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.ChatVoiceModeMicrophoneFunctionWidget$onWidgetShow$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/ChatVoiceModeMicrophoneFunctionWidget$onWidgetShow$1$1.class */
        public static final class C12181 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
            float F$0;
            int label;
            final ChatVoiceModeMicrophoneFunctionWidget this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12181(ChatVoiceModeMicrophoneFunctionWidget chatVoiceModeMicrophoneFunctionWidget, Continuation<? super C12181> continuation) {
                super(2, continuation);
                this.this$0 = chatVoiceModeMicrophoneFunctionWidget;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C12181 c12181 = new C12181(this.this$0, continuation);
                c12181.F$0 = ((Number) obj).floatValue();
                return c12181;
            }

            public final Object invoke(float f7, Continuation<? super Unit> continuation) {
                return create(Float.valueOf(f7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).floatValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                float f7 = this.F$0;
                C2048a c2048a = this.this$0.f111730c;
                C2048a c2048a2 = c2048a;
                if (c2048a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    c2048a2 = null;
                }
                c2048a2.n((int) (f7 * 100));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.ChatVoiceModeMicrophoneFunctionWidget$onWidgetShow$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/ChatVoiceModeMicrophoneFunctionWidget$onWidgetShow$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            int I$0;
            int label;
            final ChatVoiceModeMicrophoneFunctionWidget this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ChatVoiceModeMicrophoneFunctionWidget chatVoiceModeMicrophoneFunctionWidget, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = chatVoiceModeMicrophoneFunctionWidget;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.I$0 = ((Number) obj).intValue();
                return anonymousClass2;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                C2048a c2048a = this.this$0.f111730c;
                C2048a c2048a2 = c2048a;
                if (c2048a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    c2048a2 = null;
                }
                c2048a2.m(i7);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.ChatVoiceModeMicrophoneFunctionWidget$onWidgetShow$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/ChatVoiceModeMicrophoneFunctionWidget$onWidgetShow$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final ChatVoiceModeMicrophoneFunctionWidget this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ChatVoiceModeMicrophoneFunctionWidget chatVoiceModeMicrophoneFunctionWidget, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = chatVoiceModeMicrophoneFunctionWidget;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass3;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                C2048a c2048a = this.this$0.f111730c;
                C2048a c2048a2 = c2048a;
                if (c2048a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    c2048a2 = null;
                }
                if (z6 != c2048a2.f8274e) {
                    c2048a2.f8274e = z6;
                    c2048a2.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAIR_BLUR_STRENGTH);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChatVoiceModeMicrophoneFunctionWidget chatVoiceModeMicrophoneFunctionWidget, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatVoiceModeMicrophoneFunctionWidget;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ChatService chatService = this.this$0.f111728a;
            ChatService chatService2 = chatService;
            if (chatService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatService");
                chatService2 = null;
            }
            FlowKt.launchIn(FlowKt.onEach(chatService2.f111852A, new C12181(this.this$0, null)), coroutineScope);
            ChatService chatService3 = this.this$0.f111728a;
            ChatService chatService4 = chatService3;
            if (chatService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatService");
                chatService4 = null;
            }
            FlowKt.launchIn(FlowKt.onEach(chatService4.f111853B, new AnonymousClass2(this.this$0, null)), coroutineScope);
            ChatService chatService5 = this.this$0.f111728a;
            ChatService chatService6 = chatService5;
            if (chatService5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatService");
                chatService6 = null;
            }
            FlowKt.launchIn(FlowKt.onEach(chatService6.f111855D, new AnonymousClass3(this.this$0, null)), coroutineScope);
            return Unit.INSTANCE;
        }
    }

    public ChatVoiceModeMicrophoneFunctionWidget(@NotNull Context context) {
        super(context);
        this.f111731d = "PgcChatVoiceModeEmoticonFunctionWidget";
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        DelegateStoreService delegateStoreService = this.f111729b;
        DelegateStoreService delegateStoreService2 = delegateStoreService;
        if (delegateStoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
            delegateStoreService2 = null;
        }
        this.f111728a = (ChatService) dm.d.b(delegateStoreService2, ChatService.class);
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        d0 d0Var = (d0) DataBindingUtil.inflate(LayoutInflater.from(context), 2131500203, null, false);
        ChatService chatService = this.f111728a;
        ChatService chatService2 = chatService;
        if (chatService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatService");
            chatService2 = null;
        }
        C2048a c2048a = new C2048a(chatService2, null);
        this.f111730c = c2048a;
        d0Var.q(c2048a);
        d0Var.f2466w.setOnSeekBarChangeListener(new a(this));
        d0Var.f2467x.setOnSeekBarChangeListener(new b(this));
        return d0Var.getRoot();
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(true, true, true, true, true);
        builderA.changeOrientationDisableWhenShow(true);
        return builderA.build();
    }

    @NotNull
    public final String getTag() {
        return this.f111731d;
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        Job job = this.f111732e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f111732e = null;
    }

    public final void onWidgetShow() {
        super.onWidgetShow();
        C2048a c2048a = this.f111730c;
        C2048a c2048a2 = c2048a;
        if (c2048a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            c2048a2 = null;
        }
        ChatService chatService = this.f111728a;
        ChatService chatService2 = chatService;
        if (chatService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatService");
            chatService2 = null;
        }
        c2048a2.n((int) (((Number) chatService2.f111852A.getValue()).floatValue() * 100));
        C2048a c2048a3 = this.f111730c;
        C2048a c2048a4 = c2048a3;
        if (c2048a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            c2048a4 = null;
        }
        ChatService chatService3 = this.f111728a;
        ChatService chatService4 = chatService3;
        if (chatService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatService");
            chatService4 = null;
        }
        c2048a4.m(((Number) chatService4.f111853B.getValue()).intValue());
        this.f111732e = BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), (CoroutineStart) null, new AnonymousClass1(this, null), 2, (Object) null);
    }
}
