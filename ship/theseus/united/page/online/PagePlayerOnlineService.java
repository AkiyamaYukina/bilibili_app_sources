package com.bilibili.ship.theseus.united.page.online;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.playerbizcommon.features.online.OnlineScheme;
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
import tv.danmaku.biliplayerv2.service.Video;
import wq0.C8912c;
import wq0.InterfaceC8910a;
import wq0.InterfaceC8911b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/online/PagePlayerOnlineService.class */
@StabilityInferred(parameters = 0)
public final class PagePlayerOnlineService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC8910a f102098b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.online.PagePlayerOnlineService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/online/PagePlayerOnlineService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PagePlayerOnlineService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.online.PagePlayerOnlineService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/online/PagePlayerOnlineService$1$a.class */
        public static final class a implements InterfaceC8911b {
            @Override // wq0.InterfaceC8911b
            public final C8912c a(Video.PlayableParams playableParams) {
                GeminiCommonPlayableParams geminiCommonPlayableParams = playableParams instanceof GeminiCommonPlayableParams ? (GeminiCommonPlayableParams) playableParams : null;
                if (geminiCommonPlayableParams == null) {
                    return null;
                }
                C8912c c8912c = new C8912c(OnlineScheme.UGC, 30);
                c8912c.f128955b = geminiCommonPlayableParams.getAvid();
                c8912c.f128956c = geminiCommonPlayableParams.getCid();
                return c8912c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PagePlayerOnlineService pagePlayerOnlineService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pagePlayerOnlineService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wq0.b] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.f102098b.y(new Object());
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
                this.this$0.f102098b.y(null);
                throw th;
            }
        }
    }

    @Inject
    public PagePlayerOnlineService(@NotNull CoroutineScope coroutineScope, @NotNull InterfaceC8910a interfaceC8910a) {
        this.f102097a = coroutineScope;
        this.f102098b = interfaceC8910a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
