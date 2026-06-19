package com.bilibili.tgwt.im.ui;

import DD0.AbstractC1528a;
import HD0.C2048a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SeekBar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ad.core.click.K;
import com.bilibili.tgwt.service.ChatService;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/AdjustVoiceDialog.class */
@StabilityInferred(parameters = 0)
public final class AdjustVoiceDialog extends Wj0.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ChatService f111212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2048a f111213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f111214m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/AdjustVoiceDialog$a.class */
    public static final class a implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AdjustVoiceDialog f111215a;

        public a(AdjustVoiceDialog adjustVoiceDialog) {
            this.f111215a = adjustVoiceDialog;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
            C2048a c2048a = this.f111215a.f111213l;
            C2048a c2048a2 = c2048a;
            if (c2048a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                c2048a2 = null;
            }
            c2048a2.m(i7);
            this.f111215a.f111212k.n(i7);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/AdjustVoiceDialog$b.class */
    public static final class b implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AdjustVoiceDialog f111216a;

        public b(AdjustVoiceDialog adjustVoiceDialog) {
            this.f111216a = adjustVoiceDialog;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
            C2048a c2048a = this.f111216a.f111213l;
            C2048a c2048a2 = c2048a;
            if (c2048a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                c2048a2 = null;
            }
            c2048a2.n(i7);
            this.f111216a.f111212k.m(i7 / 100);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.AdjustVoiceDialog$setUiBeforeShow$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/AdjustVoiceDialog$setUiBeforeShow$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
        float F$0;
        int label;
        final AdjustVoiceDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdjustVoiceDialog adjustVoiceDialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = adjustVoiceDialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.F$0 = ((Number) obj).floatValue();
            return anonymousClass1;
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
            C2048a c2048a = this.this$0.f111213l;
            C2048a c2048a2 = c2048a;
            if (c2048a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                c2048a2 = null;
            }
            c2048a2.n((int) (f7 * 100));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.AdjustVoiceDialog$setUiBeforeShow$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/AdjustVoiceDialog$setUiBeforeShow$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        int I$0;
        int label;
        final AdjustVoiceDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdjustVoiceDialog adjustVoiceDialog, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = adjustVoiceDialog;
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
            C2048a c2048a = this.this$0.f111213l;
            C2048a c2048a2 = c2048a;
            if (c2048a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                c2048a2 = null;
            }
            c2048a2.m(i7);
            return Unit.INSTANCE;
        }
    }

    public AdjustVoiceDialog(@NotNull Context context, @NotNull ChatService chatService) {
        super(context);
        this.f111212k = chatService;
        this.f111214m = K.a((Job) null, 1, (Object) null, Dispatchers.getMain().getImmediate());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final View onCreateView() {
        AbstractC1528a abstractC1528aInflate = AbstractC1528a.inflate(LayoutInflater.from(getContext()), null, false);
        C2048a c2048a = new C2048a(this.f111212k, new X61.d(this, 3));
        this.f111213l = c2048a;
        abstractC1528aInflate.q(c2048a);
        abstractC1528aInflate.f2425x.setOnSeekBarChangeListener(new a(this));
        abstractC1528aInflate.f2426y.setOnSeekBarChangeListener(new b(this));
        return abstractC1528aInflate.getRoot();
    }

    @Override // Wj0.d
    public final void onStop() {
        super.onStop();
        CoroutineScopeKt.cancel$default(this.f111214m, (CancellationException) null, 1, (Object) null);
    }

    public final void setUiBeforeShow() {
        C2048a c2048a = this.f111213l;
        C2048a c2048a2 = c2048a;
        if (c2048a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            c2048a2 = null;
        }
        c2048a2.n((int) (((Number) this.f111212k.f111852A.getValue()).floatValue() * 100));
        C2048a c2048a3 = this.f111213l;
        C2048a c2048a4 = c2048a3;
        if (c2048a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            c2048a4 = null;
        }
        c2048a4.m(((Number) this.f111212k.f111853B.getValue()).intValue());
        FlowKt.launchIn(FlowKt.onEach(this.f111212k.f111852A, new AnonymousClass1(this, null)), this.f111214m);
        FlowKt.launchIn(FlowKt.onEach(this.f111212k.f111853B, new AnonymousClass2(this, null)), this.f111214m);
    }
}
