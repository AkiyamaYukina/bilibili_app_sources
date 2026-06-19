package com.bilibili.tgwt.im.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ad.core.click.K;
import com.bilibili.droid.ToastHelper;
import com.bilibili.live.streaming.LiveConstants;
import com.bilibili.studio.videoeditor.nvsstreaming.EditNvsTimelineInfoBase;
import com.bilibili.tgwt.service.ChatService;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/BangumiVoiceSendBtnTouchListener.class */
@StabilityInferred(parameters = 0)
public final class BangumiVoiceSendBtnTouchListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C6661g f111339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ChatService f111340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f111341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f111342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f111343e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f111344f = K.a((Job) null, 1, (Object) null, Dispatchers.getMain().getImmediate());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Job f111345g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ValueAnimator f111346i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/BangumiVoiceSendBtnTouchListener$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f111347a;

        static {
            int[] iArr = new int[BangumiVoiceRecordState.values().length];
            try {
                iArr[BangumiVoiceRecordState.PREV_RECORD.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BangumiVoiceRecordState.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BangumiVoiceRecordState.ENTER_CANCEL_RECORD.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[BangumiVoiceRecordState.PREV_CANCEL_RECORD.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f111347a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.widget.BangumiVoiceSendBtnTouchListener$onTouch$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/BangumiVoiceSendBtnTouchListener$onTouch$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final View $view;
        int label;
        final BangumiVoiceSendBtnTouchListener this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BangumiVoiceSendBtnTouchListener bangumiVoiceSendBtnTouchListener, View view, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bangumiVoiceSendBtnTouchListener;
            this.$view = view;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$view, continuation);
        }

        public final Object invoke(int i7, Continuation<? super Unit> continuation) {
            return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                BangumiVoiceSendBtnTouchListener bangumiVoiceSendBtnTouchListener = this.this$0;
                long j7 = (jCurrentTimeMillis - bangumiVoiceSendBtnTouchListener.h) / ((long) 1000);
                if (j7 > 60) {
                    bangumiVoiceSendBtnTouchListener.a(true);
                } else if (j7 >= 50) {
                    C6661g c6661g = bangumiVoiceSendBtnTouchListener.f111339a;
                    if (true != c6661g.h) {
                        c6661g.h = true;
                        c6661g.notifyPropertyChanged(103);
                    }
                    C6661g c6661g2 = this.this$0.f111339a;
                    Context context = this.$view.getContext();
                    BangumiVoiceSendBtnTouchListener bangumiVoiceSendBtnTouchListener2 = this.this$0;
                    int i8 = bangumiVoiceSendBtnTouchListener2.f111343e;
                    bangumiVoiceSendBtnTouchListener2.f111343e = i8 - 1;
                    String string = context.getString(2131836344, Boxing.boxInt(i8));
                    if (!Intrinsics.areEqual(string, c6661g2.f111422i)) {
                        c6661g2.f111422i = string;
                        c6661g2.notifyPropertyChanged(733);
                    }
                }
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public BangumiVoiceSendBtnTouchListener(@NotNull C6661g c6661g, @NotNull ChatService chatService) {
        this.f111339a = c6661g;
        this.f111340b = chatService;
    }

    public final void a(boolean z6) {
        this.f111343e = 10;
        this.f111339a.n(BangumiVoiceRecordState.PREV_RECORD);
        C6661g c6661g = this.f111339a;
        if (c6661g.h) {
            c6661g.h = false;
            c6661g.notifyPropertyChanged(103);
        }
        C6661g c6661g2 = this.f111339a;
        float f7 = c6661g2.f111415a ? 30.0f : 40.0f;
        if (f7 != c6661g2.f111421g) {
            c6661g2.f111421g = f7;
            c6661g2.notifyPropertyChanged(732);
        }
        Job job = this.f111345g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f111340b.f111874W = z6;
        db0.f.a().c();
        C6661g c6661g3 = this.f111339a;
        float f8 = 40.0f;
        if (c6661g3.f111415a) {
            f8 = 30.0f;
        }
        if (f8 != c6661g3.f111421g) {
            c6661g3.f111421g = f8;
            c6661g3.notifyPropertyChanged(732);
        }
        ValueAnimator valueAnimator = this.f111346i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) throws NoWhenBranchMatchedException {
        Context context = view.getContext();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f111341c = motionEvent.getY();
            this.f111342d = motionEvent.getX();
            this.f111339a.n(BangumiVoiceRecordState.RECORDING);
            this.h = System.currentTimeMillis();
            this.f111345g = FlowKt.launchIn(FlowKt.onEach(FlowKt.asFlow(new IntRange(1, Integer.MAX_VALUE)), new AnonymousClass1(this, view, null)), this.f111344f);
            boolean z6 = this.f111339a.f111415a;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z6 ? 30.0f : 40.0f, z6 ? 128.0f : 156.0f);
            valueAnimatorOfFloat.setDuration(9000L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bilibili.tgwt.im.widget.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiVoiceSendBtnTouchListener f111425a;

                {
                    this.f111425a = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C6661g c6661g = this.f111425a.f111339a;
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (fFloatValue == c6661g.f111421g) {
                        return;
                    }
                    c6661g.f111421g = fFloatValue;
                    c6661g.notifyPropertyChanged(732);
                }
            });
            valueAnimatorOfFloat.start();
            this.f111346i = valueAnimatorOfFloat;
            ChatService chatService = this.f111340b;
            chatService.getClass();
            db0.f.a().b = chatService.f111876Y;
            db0.f.a().b(EditNvsTimelineInfoBase.DEFAULT_SAMPLE_RATE, LiveConstants.AUDIO_BITRATE_128, db0.g.a(chatService.f111878a));
            return true;
        }
        if (action == 1) {
            int i7 = a.f111347a[this.f111339a.f111420f.ordinal()];
            if (i7 == 1) {
                return true;
            }
            if (i7 != 2 && i7 != 3) {
                if (i7 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                ToastHelper.showToastShort(context, 2131836343);
                a(false);
                return true;
            }
            if (System.currentTimeMillis() - this.h >= 1000) {
                a(true);
                return true;
            }
            ToastHelper.showToastShort(context, 2131836345);
            a(false);
            return true;
        }
        if (action != 2) {
            if (action != 3 || this.f111339a.f111420f == BangumiVoiceRecordState.PREV_RECORD) {
                return true;
            }
            a(false);
            return true;
        }
        if (this.f111339a.f111420f == BangumiVoiceRecordState.PREV_RECORD) {
            return true;
        }
        float fAbs = Math.abs(motionEvent.getY() - this.f111341c);
        float x6 = this.f111342d - motionEvent.getX();
        if (fAbs >= Uj0.c.a(25, context)) {
            this.f111339a.n(BangumiVoiceRecordState.RECORDING);
            return true;
        }
        float fA = Uj0.c.a(7, context);
        float f7 = 63;
        if (x6 <= Uj0.c.a(f7, context) && fA <= x6) {
            this.f111339a.n(BangumiVoiceRecordState.ENTER_CANCEL_RECORD);
            return true;
        }
        if (x6 > Uj0.c.a(f7, context)) {
            this.f111339a.n(BangumiVoiceRecordState.PREV_CANCEL_RECORD);
            return true;
        }
        this.f111339a.n(BangumiVoiceRecordState.RECORDING);
        return true;
    }
}
