package com.bilibili.playerbizcommonv2.widget.subtitle;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import com.bilibili.lib.media.resource.LanguageItem;
import com.bilibili.lib.media.resource.Languages;
import com.bilibili.playerbizcommonv2.widget.setting.C5829a;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiComposeKt$AiSection$1$1.class */
public final class SubtitleAndAiComposeKt$AiSection$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<LanguageItem> $aiLanguageItem$delegate;
    final com.bilibili.playerbizcommonv2.service.ai.a $aiService;
    final MutableState<C5829a> $currentAiSelectData$delegate;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt$AiSection$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiComposeKt$AiSection$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableState<LanguageItem> $aiLanguageItem$delegate;
        final com.bilibili.playerbizcommonv2.service.ai.a $aiService;
        final MutableState<C5829a> $currentAiSelectData$delegate;
        int label;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt$AiSection$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiComposeKt$AiSection$1$1$1$1.class */
        public static final class C05571 extends SuspendLambda implements Function2<LanguageItem, Continuation<? super Unit>, Object> {
            final MutableState<LanguageItem> $aiLanguageItem$delegate;
            final com.bilibili.playerbizcommonv2.service.ai.a $aiService;
            final MutableState<C5829a> $currentAiSelectData$delegate;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05571(com.bilibili.playerbizcommonv2.service.ai.a aVar, MutableState<LanguageItem> mutableState, MutableState<C5829a> mutableState2, Continuation<? super C05571> continuation) {
                super(2, continuation);
                this.$aiService = aVar;
                this.$aiLanguageItem$delegate = mutableState;
                this.$currentAiSelectData$delegate = mutableState2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05571 c05571 = new C05571(this.$aiService, this.$aiLanguageItem$delegate, this.$currentAiSelectData$delegate, continuation);
                c05571.L$0 = obj;
                return c05571;
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
                LanguageItem languageItem = (LanguageItem) this.L$0;
                this.$aiLanguageItem$delegate.setValue(languageItem);
                Languages languagesE0 = this.$aiService.e0();
                int i7 = 0;
                if (languagesE0 != null) {
                    List listH = languagesE0.h();
                    i7 = 0;
                    if (listH != null) {
                        Iterator it = listH.iterator();
                        i7 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i7 = -1;
                                break;
                            }
                            if (sb0.b.b((LanguageItem) it.next(), languageItem)) {
                                break;
                            }
                            i7++;
                        }
                    }
                }
                MutableIntState mutableIntStateMutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(i7);
                MutableState<C5829a> mutableState = this.$currentAiSelectData$delegate;
                mutableState.setValue(new C5829a(mutableState.getValue().f83182a, this.$currentAiSelectData$delegate.getValue().f83183b, mutableIntStateMutableIntStateOf, this.$currentAiSelectData$delegate.getValue().f83185d, this.$currentAiSelectData$delegate.getValue().f83186e, this.$currentAiSelectData$delegate.getValue().f83187f, languageItem != null ? languageItem.c() : null));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.playerbizcommonv2.service.ai.a aVar, MutableState<LanguageItem> mutableState, MutableState<C5829a> mutableState2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$aiService = aVar;
            this.$aiLanguageItem$delegate = mutableState;
            this.$currentAiSelectData$delegate = mutableState2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$aiService, this.$aiLanguageItem$delegate, this.$currentAiSelectData$delegate, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlowB0 = this.$aiService.b0();
                C05571 c05571 = new C05571(this.$aiService, this.$aiLanguageItem$delegate, this.$currentAiSelectData$delegate, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlowB0, c05571, this) == coroutine_suspended) {
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
    public SubtitleAndAiComposeKt$AiSection$1$1(com.bilibili.playerbizcommonv2.service.ai.a aVar, MutableState<LanguageItem> mutableState, MutableState<C5829a> mutableState2, Continuation<? super SubtitleAndAiComposeKt$AiSection$1$1> continuation) {
        super(2, continuation);
        this.$aiService = aVar;
        this.$aiLanguageItem$delegate = mutableState;
        this.$currentAiSelectData$delegate = mutableState2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SubtitleAndAiComposeKt$AiSection$1$1 subtitleAndAiComposeKt$AiSection$1$1 = new SubtitleAndAiComposeKt$AiSection$1$1(this.$aiService, this.$aiLanguageItem$delegate, this.$currentAiSelectData$delegate, continuation);
        subtitleAndAiComposeKt$AiSection$1$1.L$0 = obj;
        return subtitleAndAiComposeKt$AiSection$1$1;
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
        BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$aiService, this.$aiLanguageItem$delegate, this.$currentAiSelectData$delegate, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
