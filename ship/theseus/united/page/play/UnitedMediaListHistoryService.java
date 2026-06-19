package com.bilibili.ship.theseus.united.page.play;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/play/UnitedMediaListHistoryService.class */
@StabilityInferred(parameters = 0)
public final class UnitedMediaListHistoryService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f102240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f102241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C7893a f102242d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.play.UnitedMediaListHistoryService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/play/UnitedMediaListHistoryService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final UnitedMediaListHistoryService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.play.UnitedMediaListHistoryService$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/play/UnitedMediaListHistoryService$1$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<C7893a.C1318a, Long, Continuation<? super Pair<? extends C7893a.C1318a, ? extends Long>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((C7893a.C1318a) obj, ((Number) obj2).longValue(), (Continuation<? super Pair<C7893a.C1318a, Long>>) obj3);
            }

            public final Object invoke(C7893a.C1318a c1318a, long j7, Continuation<? super Pair<C7893a.C1318a, Long>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$0(c1318a, j7, continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UnitedMediaListHistoryService unitedMediaListHistoryService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = unitedMediaListHistoryService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(C7893a.C1318a c1318a, long j7, Continuation continuation) {
            return new Pair(c1318a, Boxing.boxLong(j7));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 372
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.play.UnitedMediaListHistoryService.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public UnitedMediaListHistoryService(@NotNull CoroutineScope coroutineScope, @NotNull BiliAccounts biliAccounts, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository, @NotNull C7893a c7893a) {
        this.f102239a = coroutineScope;
        this.f102240b = biliAccounts;
        this.f102241c = unitedSeasonDetailRepository;
        this.f102242d = c7893a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
