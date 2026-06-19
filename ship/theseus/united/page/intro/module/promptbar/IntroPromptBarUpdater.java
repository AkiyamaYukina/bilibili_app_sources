package com.bilibili.ship.theseus.united.page.intro.module.promptbar;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarUpdater.class */
@StabilityInferred(parameters = 0)
public final class IntroPromptBarUpdater {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f100690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f100691b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarUpdater$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarUpdater$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final IntroPromptBarUpdater this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.promptbar.IntroPromptBarUpdater$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarUpdater$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IntroPromptBarUpdater f100692a;

            public a(IntroPromptBarUpdater introPromptBarUpdater) {
                this.f100692a = introPromptBarUpdater;
            }

            public final Object emit(Object obj, Continuation continuation) {
                ExtraInfo extraInfo = (ExtraInfo) obj;
                this.f100692a.f100690a.f100708l.setValue(extraInfo != null ? (PromptBarVo) vv0.d.f128456d.a(extraInfo) : null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IntroPromptBarUpdater introPromptBarUpdater, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = introPromptBarUpdater;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    IntroPromptBarUpdater introPromptBarUpdater = this.this$0;
                    StateFlow<ExtraInfo> stateFlow = introPromptBarUpdater.f100691b.f99566b;
                    a aVar = new a(introPromptBarUpdater);
                    this.label = 1;
                    if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.f100690a.f100708l.setValue((Object) null);
                throw th;
            }
        }
    }

    @Inject
    public IntroPromptBarUpdater(@NotNull c cVar, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull CoroutineScope coroutineScope) {
        this.f100690a = cVar;
        this.f100691b = episodeExtraInfoRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
