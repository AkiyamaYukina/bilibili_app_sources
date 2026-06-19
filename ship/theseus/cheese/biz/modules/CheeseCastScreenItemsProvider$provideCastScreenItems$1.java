package com.bilibili.ship.theseus.cheese.biz.modules;

import au0.C4911a;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import eu0.C6985d;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheeseCastScreenItemsProvider$provideCastScreenItems$1.class */
final class CheeseCastScreenItemsProvider$provideCastScreenItems$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C4911a $cheeseBaseDataRepository;
    final List<C6985d> $cheeseEpisodes;
    final List<ProjectionItemData> $episodeList;
    final C8043a $extraRepo;
    final UnitedSeasonDetailRepository $unitedSeasonDetailRepository;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.CheeseCastScreenItemsProvider$provideCastScreenItems$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheeseCastScreenItemsProvider$provideCastScreenItems$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends C6353o>, Continuation<? super Unit>, Object> {
        final C4911a $cheeseBaseDataRepository;
        final List<C6985d> $cheeseEpisodes;
        final List<ProjectionItemData> $episodeList;
        final C8043a $extraRepo;
        final UnitedSeasonDetailRepository $unitedSeasonDetailRepository;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<ProjectionItemData> list, UnitedSeasonDetailRepository unitedSeasonDetailRepository, C8043a c8043a, List<C6985d> list2, C4911a c4911a, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$episodeList = list;
            this.$unitedSeasonDetailRepository = unitedSeasonDetailRepository;
            this.$extraRepo = c8043a;
            this.$cheeseEpisodes = list2;
            this.$cheeseBaseDataRepository = c4911a;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$episodeList, this.$unitedSeasonDetailRepository, this.$extraRepo, this.$cheeseEpisodes, this.$cheeseBaseDataRepository, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(List<C6353o> list, Continuation<? super Unit> continuation) {
            return create(list, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            this.$episodeList.clear();
            if (list.isEmpty()) {
                this.$episodeList.addAll(C6116a.a(this.$cheeseEpisodes, this.$cheeseBaseDataRepository));
            } else {
                this.$episodeList.addAll(C6116a.b(this.$unitedSeasonDetailRepository.b(), this.$extraRepo));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCastScreenItemsProvider$provideCastScreenItems$1(UnitedSeasonDetailRepository unitedSeasonDetailRepository, List<ProjectionItemData> list, C8043a c8043a, List<C6985d> list2, C4911a c4911a, Continuation<? super CheeseCastScreenItemsProvider$provideCastScreenItems$1> continuation) {
        super(2, continuation);
        this.$unitedSeasonDetailRepository = unitedSeasonDetailRepository;
        this.$episodeList = list;
        this.$extraRepo = c8043a;
        this.$cheeseEpisodes = list2;
        this.$cheeseBaseDataRepository = c4911a;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseCastScreenItemsProvider$provideCastScreenItems$1(this.$unitedSeasonDetailRepository, this.$episodeList, this.$extraRepo, this.$cheeseEpisodes, this.$cheeseBaseDataRepository, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UnitedSeasonDetailRepository unitedSeasonDetailRepository = this.$unitedSeasonDetailRepository;
            StateFlow<List<C6353o>> stateFlow = unitedSeasonDetailRepository.f101572c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$episodeList, unitedSeasonDetailRepository, this.$extraRepo, this.$cheeseEpisodes, this.$cheeseBaseDataRepository, null);
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
