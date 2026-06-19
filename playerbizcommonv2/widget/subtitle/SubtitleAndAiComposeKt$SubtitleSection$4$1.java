package com.bilibili.playerbizcommonv2.widget.subtitle;

import androidx.compose.runtime.MutableState;
import com.bilibili.lib.media.resource.LanguageItem;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiComposeKt$SubtitleSection$4$1.class */
public final class SubtitleAndAiComposeKt$SubtitleSection$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<LanguageItem> $aiLanguageItem$delegate;
    final com.bilibili.playerbizcommonv2.service.ai.a $aiService;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt$SubtitleSection$4$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiComposeKt$SubtitleSection$4$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableState<LanguageItem> $aiLanguageItem$delegate;
        final com.bilibili.playerbizcommonv2.service.ai.a $aiService;
        int label;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt$SubtitleSection$4$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiComposeKt$SubtitleSection$4$1$1$1.class */
        public static final class C05581 extends SuspendLambda implements Function2<LanguageItem, Continuation<? super Unit>, Object> {
            final MutableState<LanguageItem> $aiLanguageItem$delegate;
            final com.bilibili.playerbizcommonv2.service.ai.a $aiService;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05581(com.bilibili.playerbizcommonv2.service.ai.a aVar, MutableState<LanguageItem> mutableState, Continuation<? super C05581> continuation) {
                super(2, continuation);
                this.$aiService = aVar;
                this.$aiLanguageItem$delegate = mutableState;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05581(this.$aiService, this.$aiLanguageItem$delegate, continuation);
            }

            public final Object invoke(LanguageItem languageItem, Continuation<? super Unit> continuation) {
                return create(languageItem, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$aiLanguageItem$delegate.setValue(this.$aiService.n0());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.playerbizcommonv2.service.ai.a aVar, MutableState<LanguageItem> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$aiService = aVar;
            this.$aiLanguageItem$delegate = mutableState;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$aiService, this.$aiLanguageItem$delegate, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDrop = FlowKt.drop(this.$aiService.b0(), 1);
                C05581 c05581 = new C05581(this.$aiService, this.$aiLanguageItem$delegate, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDrop, c05581, this) == coroutine_suspended) {
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
    public SubtitleAndAiComposeKt$SubtitleSection$4$1(com.bilibili.playerbizcommonv2.service.ai.a aVar, MutableState<LanguageItem> mutableState, Continuation<? super SubtitleAndAiComposeKt$SubtitleSection$4$1> continuation) {
        super(2, continuation);
        this.$aiService = aVar;
        this.$aiLanguageItem$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SubtitleAndAiComposeKt$SubtitleSection$4$1 subtitleAndAiComposeKt$SubtitleSection$4$1 = new SubtitleAndAiComposeKt$SubtitleSection$4$1(this.$aiService, this.$aiLanguageItem$delegate, continuation);
        subtitleAndAiComposeKt$SubtitleSection$4$1.L$0 = obj;
        return subtitleAndAiComposeKt$SubtitleSection$4$1;
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
        BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$aiService, this.$aiLanguageItem$delegate, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
