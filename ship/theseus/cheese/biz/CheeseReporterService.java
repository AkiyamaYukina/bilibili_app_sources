package com.bilibili.ship.theseus.cheese.biz;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.account.interfaces.v1.g;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.cheese.player.playviewextra.a;
import com.bilibili.ship.theseus.united.page.toolbar.j;
import com.google.gson.JsonObject;
import eu0.C6985d;
import hu0.C7504b;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/CheeseReporterService.class */
@StabilityInferred(parameters = 0)
public final class CheeseReporterService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f88980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f88981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C6985d f88982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final j f88983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f88984e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.CheeseReporterService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/CheeseReporterService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseReporterService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.CheeseReporterService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/CheeseReporterService$1$1.class */
        public static final class C05981 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final CheeseReporterService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05981(CheeseReporterService cheeseReporterService, Continuation<? super C05981> continuation) {
                super(2, continuation);
                this.this$0 = cheeseReporterService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05981(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CheeseReporterService cheeseReporterService = this.this$0;
                long j7 = cheeseReporterService.f88982c.f117510e;
                if (BiliAccounts.get(cheeseReporterService.f88981b).isLogin()) {
                    sh1.j.a(cheeseReporterService.f88981b, new Uri.Builder().scheme("https://www.bilibili.com").appendPath("appeal").appendQueryParameter(GameCardButton.extraAvid, String.valueOf(j7)).build().toString());
                } else {
                    g.a(null, "activity://main/login/", 2, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseReporterService cheeseReporterService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseReporterService;
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
                CheeseReporterService cheeseReporterService = this.this$0;
                SharedFlow<Unit> sharedFlow = cheeseReporterService.f88983d.f103401e;
                C05981 c05981 = new C05981(cheeseReporterService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c05981, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.CheeseReporterService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/CheeseReporterService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseReporterService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.CheeseReporterService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/CheeseReporterService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7504b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseReporterService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseReporterService cheeseReporterService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseReporterService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C7504b c7504b, Continuation<? super Unit> continuation) {
                return create(c7504b, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C7504b c7504b = (C7504b) this.L$0;
                CheeseReporterService cheeseReporterService = this.this$0;
                j jVar = cheeseReporterService.f88983d;
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("epid", c7504b != null ? String.valueOf(c7504b.f121484b) : null);
                jsonObject.addProperty("cid", String.valueOf(cheeseReporterService.f88982c.f117511f));
                jVar.f103398b = JsonUtilKt.toJson(jsonObject);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheeseReporterService cheeseReporterService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheeseReporterService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CheeseReporterService cheeseReporterService = this.this$0;
                StateFlow<C7504b> stateFlow = cheeseReporterService.f88984e.f90751a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseReporterService, null);
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

    @Inject
    public CheeseReporterService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull C6985d c6985d, @NotNull j jVar, @NotNull a aVar) {
        this.f88980a = coroutineScope;
        this.f88981b = context;
        this.f88982c = c6985d;
        this.f88983d = jVar;
        this.f88984e = aVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
