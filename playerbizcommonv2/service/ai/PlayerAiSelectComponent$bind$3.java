package com.bilibili.playerbizcommonv2.service.ai;

import android.content.Context;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.media.resource.LanguageItem;
import com.bilibili.lib.theme.R$color;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/ai/PlayerAiSelectComponent$bind$3.class */
final class PlayerAiSelectComponent$bind$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Context $context;
    final TextView $title;
    private Object L$0;
    int label;
    final PlayerAiSelectComponent this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.service.ai.PlayerAiSelectComponent$bind$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/ai/PlayerAiSelectComponent$bind$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final TextView $title;
        int label;
        final PlayerAiSelectComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.service.ai.PlayerAiSelectComponent$bind$3$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/ai/PlayerAiSelectComponent$bind$3$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerAiSelectComponent f81831a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TextView f81832b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Context f81833c;

            public a(PlayerAiSelectComponent playerAiSelectComponent, TextView textView, Context context) {
                this.f81831a = playerAiSelectComponent;
                this.f81832b = textView;
                this.f81833c = context;
            }

            public final Object emit(Object obj, Continuation continuation) {
                LanguageItem languageItem = (LanguageItem) obj;
                String strC = languageItem != null ? languageItem.c() : null;
                PlayerAiSelectComponent playerAiSelectComponent = this.f81831a;
                this.f81832b.setTextColor(Intrinsics.areEqual(strC, playerAiSelectComponent.f81823a.f81827b) && languageItem.h() == playerAiSelectComponent.f81823a.f81828c ? ContextCompat.getColor(this.f81833c, R$color.Pi5) : ContextCompat.getColor(this.f81833c, R$color.Text1));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayerAiSelectComponent playerAiSelectComponent, TextView textView, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playerAiSelectComponent;
            this.$title = textView;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$title, this.$context, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlayerAiSelectComponent playerAiSelectComponent = this.this$0;
                Flow<LanguageItem> flow = playerAiSelectComponent.f81824b;
                a aVar = new a(playerAiSelectComponent, this.$title, this.$context);
                this.label = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
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
    public PlayerAiSelectComponent$bind$3(PlayerAiSelectComponent playerAiSelectComponent, TextView textView, Context context, Continuation<? super PlayerAiSelectComponent$bind$3> continuation) {
        super(2, continuation);
        this.this$0 = playerAiSelectComponent;
        this.$title = textView;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerAiSelectComponent$bind$3 playerAiSelectComponent$bind$3 = new PlayerAiSelectComponent$bind$3(this.this$0, this.$title, this.$context, continuation);
        playerAiSelectComponent$bind$3.L$0 = obj;
        return playerAiSelectComponent$bind$3;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$title, this.$context, null), 3, (Object) null);
    }
}
