package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.I;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.r;
import com.bilibili.playerbizcommonv2.view.PlayerSwitch;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DanmakuSettingsSwitchComponent$bind$2.class */
final class DanmakuSettingsSwitchComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Dr0.d $binding;
    private Object L$0;
    int label;
    final I this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.setting.v2.DanmakuSettingsSwitchComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DanmakuSettingsSwitchComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PlayerSwitch $switch;
        int label;
        final I this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.setting.v2.DanmakuSettingsSwitchComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DanmakuSettingsSwitchComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final PlayerSwitch $switch;
            boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayerSwitch playerSwitch, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$switch = playerSwitch;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$switch, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
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
                this.$switch.setChecked(this.Z$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(I i7, PlayerSwitch playerSwitch, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = i7;
            this.$switch = playerSwitch;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$switch, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlow = this.this$0.f81349a.f81353c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$switch, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuSettingsSwitchComponent$bind$2(Dr0.d dVar, I i7, Continuation<? super DanmakuSettingsSwitchComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = dVar;
        this.this$0 = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(I i7, View view) {
        i7.f81350b.invoke();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DanmakuSettingsSwitchComponent$bind$2 danmakuSettingsSwitchComponent$bind$2 = new DanmakuSettingsSwitchComponent$bind$2(this.$binding, this.this$0, continuation);
        danmakuSettingsSwitchComponent$bind$2.L$0 = obj;
        return danmakuSettingsSwitchComponent$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        float[] fArr;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        ConstraintLayout constraintLayout = this.$binding.f3050a;
        Context context = constraintLayout.getContext();
        Dr0.d dVar = this.$binding;
        AppCompatTextView appCompatTextView = dVar.f3054e;
        AppCompatTextView appCompatTextView2 = dVar.f3052c;
        PlayerSwitch playerSwitch = dVar.f3053d;
        View view = dVar.f3051b;
        appCompatTextView.setText(this.this$0.f81349a.f81351a);
        appCompatTextView.setTextColor(ContextCompat.getColor(context, this.this$0.f81349a.f81354d));
        if (this.this$0.f81349a.f81352b.length() == 0) {
            appCompatTextView2.setVisibility(8);
        } else {
            appCompatTextView2.setText(this.this$0.f81349a.f81352b);
            appCompatTextView2.setTextColor(ContextCompat.getColor(context, this.this$0.f81349a.f81355e));
            appCompatTextView2.setVisibility(0);
        }
        playerSwitch.a(ContextCompat.getColor(context, this.this$0.f81349a.h), ContextCompat.getColor(context, this.this$0.f81349a.f81358i), ContextCompat.getColor(context, this.this$0.f81349a.f81357g), ContextCompat.getColor(context, this.this$0.f81349a.f81357g));
        view.setBackgroundResource(this.this$0.f81349a.f81359j);
        view.setVisibility(r.b(this.this$0.f81349a.f81360k) ? 0 : 8);
        I.a aVar = this.this$0.f81349a;
        DanmakuSettingsStyle danmakuSettingsStyle = aVar.f81360k;
        int color = ContextCompat.getColor(context, aVar.f81356f);
        float fDpToPx = DimenUtilsKt.dpToPx(8.0f);
        switch (r.a.f81465a[danmakuSettingsStyle.ordinal()]) {
            case 1:
            case 2:
                fArr = new float[]{fDpToPx, fDpToPx, fDpToPx, fDpToPx, 0.0f, 0.0f, 0.0f, 0.0f};
                break;
            case 3:
            case 4:
                fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                break;
            case 5:
                fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, fDpToPx, fDpToPx, fDpToPx, fDpToPx};
                break;
            case 6:
                float[] fArr2 = new float[8];
                int i7 = 0;
                while (true) {
                    fArr = fArr2;
                    if (i7 < 8) {
                        fArr2[i7] = fDpToPx;
                        i7++;
                    }
                    break;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setShape(0);
        if (color != 0) {
            gradientDrawable.setColor(color);
        }
        constraintLayout.setBackground(gradientDrawable);
        final I i8 = this.this$0;
        playerSwitch.setOnClickListener(new View.OnClickListener(i8) { // from class: com.bilibili.playerbizcommonv2.danmaku.setting.v2.J

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final I f81361a;

            {
                this.f81361a = i8;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DanmakuSettingsSwitchComponent$bind$2.invokeSuspend$lambda$0(this.f81361a, view2);
            }
        });
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, playerSwitch, null), 3, (Object) null);
    }
}
