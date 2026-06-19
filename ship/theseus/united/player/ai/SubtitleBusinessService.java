package com.bilibili.ship.theseus.united.player.ai;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.widget.subtitle.K0;
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
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/SubtitleBusinessService.class */
@StabilityInferred(parameters = 0)
public final class SubtitleBusinessService implements K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f104335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommonv2.service.ai.a f104336c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.ai.SubtitleBusinessService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/SubtitleBusinessService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Er0.a $delegateStoreService;
        int label;
        final SubtitleBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Er0.a aVar, SubtitleBusinessService subtitleBusinessService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$delegateStoreService = aVar;
            this.this$0 = subtitleBusinessService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$delegateStoreService, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            K0.a aVar = K0.a.f83532a;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$delegateStoreService.put(aVar, this.this$0);
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
                this.$delegateStoreService.remove(aVar);
                throw th;
            }
        }
    }

    @Inject
    public SubtitleBusinessService(@NotNull CoroutineScope coroutineScope, @NotNull Er0.a aVar, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull com.bilibili.playerbizcommonv2.service.ai.a aVar2) {
        this.f104334a = coroutineScope;
        this.f104335b = iPlayerSettingService;
        this.f104336c = aVar2;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(aVar, this, null), 3, (Object) null);
    }

    @Override // com.bilibili.playerbizcommonv2.widget.subtitle.K0
    public final void b() {
        this.f104335b.putBoolean("key_ai_guide_shown_this_video", true);
        com.bilibili.playerbizcommonv2.service.ai.b.d(this.f104336c.e0());
    }

    @Override // com.bilibili.playerbizcommonv2.widget.subtitle.K0
    public final boolean d() {
        return !this.f104335b.getBoolean("key_ai_guide_shown_this_video", false) && com.bilibili.playerbizcommonv2.service.ai.b.b(this.f104336c.e0());
    }
}
