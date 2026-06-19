package com.bilibili.ship.theseus.ogv.bridge;

import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.logic.page.detail.service.f;
import com.bilibili.ship.theseus.ogv.bridge.JumpByCidService;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import ev0.i;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/bridge/JumpByCidService.class */
@StabilityInferred(parameters = 0)
public final class JumpByCidService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b f91608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f91609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Gu0.a f91610c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.bridge.JumpByCidService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/bridge/JumpByCidService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final JumpByCidService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JumpByCidService jumpByCidService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = jumpByCidService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(JumpByCidService jumpByCidService, long j7, i iVar, com.bilibili.ship.theseus.united.report.b bVar) {
            OgvEpisode ogvEpisodeH = jumpByCidService.f91610c.h(j7);
            if (ogvEpisodeH == null) {
                f.a("[theseus-ogv-JumpByCidService$1-invokeSuspend$lambda$0] ", C3751q.a(j7, "Ep not found! cid: "), "JumpByCidService$1-invokeSuspend$lambda$0", (Throwable) null);
                return Unit.INSTANCE;
            }
            OgvCurrentEpisodeRepository.h(jumpByCidService.f91609b, ogvEpisodeH, iVar, null, null, bVar.f104838a, 12);
            return Unit.INSTANCE;
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
                    final JumpByCidService jumpByCidService = this.this$0;
                    jumpByCidService.f91608a.f91612b = new Function3(jumpByCidService) { // from class: com.bilibili.ship.theseus.ogv.bridge.c

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final JumpByCidService f91613a;

                        {
                            this.f91613a = jumpByCidService;
                        }

                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            return JumpByCidService.AnonymousClass1.invokeSuspend$lambda$0(this.f91613a, ((Long) obj2).longValue(), (i) obj3, (com.bilibili.ship.theseus.united.report.b) obj4);
                        }
                    };
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
                b bVar = this.this$0.f91608a;
                bVar.f91612b = bVar.f91611a;
                throw th;
            }
        }
    }

    @Inject
    public JumpByCidService(@NotNull b bVar, @NotNull CoroutineScope coroutineScope, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull Gu0.a aVar) {
        this.f91608a = bVar;
        this.f91609b = ogvCurrentEpisodeRepository;
        this.f91610c = aVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
