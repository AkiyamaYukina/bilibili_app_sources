package com.bilibili.ship.theseus.united.page.intro.module.relate.game;

import com.bilibili.app.comm.list.common.widget.ListGameCardButton;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.droid.DimenUtilsKt;
import java.util.HashMap;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.bili.widget.ForegroundConstraintLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/game/RelateGameComponent$bind$11.class */
final class RelateGameComponent$bind$11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final ListGameCardButton $gameButton;
    final ForegroundConstraintLayout $root;
    private Object L$0;
    int label;
    final d this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.game.RelateGameComponent$bind$11$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/game/RelateGameComponent$bind$11$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ForegroundConstraintLayout $root;
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.game.RelateGameComponent$bind$11$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/game/RelateGameComponent$bind$11$1$1.class */
        public static final class C10471 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final ForegroundConstraintLayout $root;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10471(ForegroundConstraintLayout foregroundConstraintLayout, Continuation<? super C10471> continuation) {
                super(2, continuation);
                this.$root = foregroundConstraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10471 c10471 = new C10471(this.$root, continuation);
                c10471.I$0 = ((Number) obj).intValue();
                return c10471;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                this.$root.setPadding(DimenUtilsKt.dpToPx(i7), this.$root.getPaddingTop(), DimenUtilsKt.dpToPx(i7 - 12), this.$root.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, ForegroundConstraintLayout foregroundConstraintLayout, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$root = foregroundConstraintLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$root, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Integer> flow = this.this$0.f101222b;
                C10471 c10471 = new C10471(this.$root, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c10471, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.game.RelateGameComponent$bind$11$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/game/RelateGameComponent$bind$11$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ListGameCardButton $gameButton;
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.game.RelateGameComponent$bind$11$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/game/RelateGameComponent$bind$11$2$a.class */
        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ListGameCardButton f101215a;

            public a(ListGameCardButton listGameCardButton) {
                this.f101215a = listGameCardButton;
            }

            @Override // com.bilibili.ship.theseus.united.page.intro.module.relate.game.c
            public final void a(int i7, long j7) {
                HashMap map = new HashMap();
                map.put(GameCardButton.extraAvid, String.valueOf(j7));
                ListGameCardButton.a(this.f101215a, i7, map, (String) null, 4);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d dVar, ListGameCardButton listGameCardButton, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$gameButton = listGameCardButton;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$gameButton, continuation);
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
                    this.this$0.f101221a.f101058a.element = new a(this.$gameButton);
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
                this.this$0.f101221a.f101058a.element = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelateGameComponent$bind$11(d dVar, ForegroundConstraintLayout foregroundConstraintLayout, ListGameCardButton listGameCardButton, Continuation<? super RelateGameComponent$bind$11> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$root = foregroundConstraintLayout;
        this.$gameButton = listGameCardButton;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RelateGameComponent$bind$11 relateGameComponent$bind$11 = new RelateGameComponent$bind$11(this.this$0, this.$root, this.$gameButton, continuation);
        relateGameComponent$bind$11.L$0 = obj;
        return relateGameComponent$bind$11;
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
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$root, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$gameButton, null), 3, (Object) null);
    }
}
