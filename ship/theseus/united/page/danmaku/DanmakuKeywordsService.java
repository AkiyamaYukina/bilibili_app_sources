package com.bilibili.ship.theseus.united.page.danmaku;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.BiliAccountsKt;
import com.bilibili.okretro.ServiceGenerator;
import javax.inject.Inject;
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
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.widget.function.danmaku.filter.KeywordsBlockApiService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuKeywordsService.class */
@StabilityInferred(parameters = 0)
public final class DanmakuKeywordsService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f99412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f99413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f99414d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuKeywordsService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuKeywordsService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DanmakuKeywordsService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuKeywordsService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuKeywordsService$1$1.class */
        public static final class C09731 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final DanmakuKeywordsService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09731(DanmakuKeywordsService danmakuKeywordsService, Continuation<? super C09731> continuation) {
                super(2, continuation);
                this.this$0 = danmakuKeywordsService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09731 c09731 = new C09731(this.this$0, continuation);
                c09731.Z$0 = ((Boolean) obj).booleanValue();
                return c09731;
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
                if (this.Z$0) {
                    DanmakuKeywordsService danmakuKeywordsService = this.this$0;
                    if (tv.danmaku.biliplayerv2.widget.function.danmaku.filter.e.d(danmakuKeywordsService.f99412b)) {
                        o oVar = new o(danmakuKeywordsService);
                        Context context = danmakuKeywordsService.f99412b;
                        if (context != null) {
                            Context applicationContext = context.getApplicationContext();
                            ((KeywordsBlockApiService) ServiceGenerator.createService(KeywordsBlockApiService.class)).getBlockedData(BiliAccounts.get(applicationContext).getAccessKey()).enqueue(new tv.danmaku.biliplayerv2.widget.function.danmaku.filter.h(applicationContext, oVar));
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DanmakuKeywordsService danmakuKeywordsService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = danmakuKeywordsService;
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
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = BiliAccountsKt.a(this.this$0.f99414d);
                C09731 c09731 = new C09731(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, c09731, this) == coroutine_suspended) {
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

    @Inject
    public DanmakuKeywordsService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull IInteractLayerService iInteractLayerService, @NotNull BiliAccounts biliAccounts) {
        this.f99411a = coroutineScope;
        this.f99412b = context;
        this.f99413c = iInteractLayerService;
        this.f99414d = biliAccounts;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
