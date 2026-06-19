package com.bilibili.ship.theseus.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService;
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
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/RecommendServiceConfigurationService.class */
@StabilityInferred(parameters = 1)
public final class RecommendServiceConfigurationService {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.RecommendServiceConfigurationService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/RecommendServiceConfigurationService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final DetailRelateService $recommendService;
        final com.bilibili.ship.theseus.ogv.web.b $webAndExternalBizFloatLayerService;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.RecommendServiceConfigurationService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/RecommendServiceConfigurationService$1$1.class */
        public static final class C06771 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            final com.bilibili.ship.theseus.ogv.web.b $webAndExternalBizFloatLayerService;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06771(com.bilibili.ship.theseus.ogv.web.b bVar, Continuation<? super C06771> continuation) {
                super(2, continuation);
                this.$webAndExternalBizFloatLayerService = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06771 c06771 = new C06771(this.$webAndExternalBizFloatLayerService, continuation);
                c06771.L$0 = obj;
                return c06771;
            }

            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return create(str, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = (String) this.L$0;
                    com.bilibili.ship.theseus.ogv.web.b bVar = this.$webAndExternalBizFloatLayerService;
                    this.label = 1;
                    if (bVar.b(str, false, this) == coroutine_suspended) {
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
        public AnonymousClass1(DetailRelateService detailRelateService, com.bilibili.ship.theseus.ogv.web.b bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$recommendService = detailRelateService;
            this.$webAndExternalBizFloatLayerService = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$recommendService, this.$webAndExternalBizFloatLayerService, continuation);
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
                    this.$recommendService.f100888x = new C06771(this.$webAndExternalBizFloatLayerService, null);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
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
                this.$recommendService.f100888x = null;
                throw th;
            }
        }
    }

    @Inject
    public RecommendServiceConfigurationService(@NotNull CoroutineScope coroutineScope, @NotNull DetailRelateService detailRelateService, @NotNull com.bilibili.ship.theseus.ogv.web.b bVar) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(detailRelateService, bVar, null), 3, (Object) null);
    }
}
