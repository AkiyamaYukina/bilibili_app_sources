package com.bilibili.ship.theseus.playlist;

import androidx.paging.Y;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectListExposureEffect$2.class */
final class PlaylistService$collectListExposureEffect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final com.bilibili.ship.theseus.playlist.uicomponent.D $component;
    private Object L$0;
    int label;
    final E this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistService$collectListExposureEffect$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectListExposureEffect$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.playlist.uicomponent.D $component;
        int label;
        final E this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistService$collectListExposureEffect$2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectListExposureEffect$2$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Ref.BooleanRef f95171a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final E f95172b;

            public a(Ref.BooleanRef booleanRef, E e7) {
                this.f95171a = booleanRef;
                this.f95172b = e7;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Unit unit;
                Ref.BooleanRef booleanRef = this.f95171a;
                if (booleanRef.element) {
                    unit = Unit.INSTANCE;
                } else {
                    booleanRef.element = true;
                    E e7 = this.f95172b;
                    PlaylistInfo playlistInfoE = e7.f94937e.e();
                    Pair pair = TuplesKt.to("is_collect_show", ((playlistInfoE.f95275g >> 6) & 1) == 1 ? "1" : "0");
                    int i7 = playlistInfoE.f95275g;
                    PageReportService.i(e7.f94943l, "united.player-video-detail.playlist.0.show", MapsKt.mapOf(new Pair[]{pair, TuplesKt.to("is_share_show", ((i7 >> 7) & 1) == 1 ? "1" : "0"), TuplesKt.to("is_like_show", ((i7 >> 5) & 1) == 1 ? "1" : "0")}), 4);
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ship.theseus.playlist.uicomponent.D d7, E e7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$component = d7;
            this.this$0 = e7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$component, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                Ref.BooleanRef booleanRefA = Y.a(obj);
                SharedFlow<Unit> sharedFlow = this.$component.f95929d;
                a aVar = new a(booleanRefA, this.this$0);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistService$collectListExposureEffect$2(com.bilibili.ship.theseus.playlist.uicomponent.D d7, E e7, Continuation<? super PlaylistService$collectListExposureEffect$2> continuation) {
        super(2, continuation);
        this.$component = d7;
        this.this$0 = e7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistService$collectListExposureEffect$2 playlistService$collectListExposureEffect$2 = new PlaylistService$collectListExposureEffect$2(this.$component, this.this$0, continuation);
        playlistService$collectListExposureEffect$2.L$0 = obj;
        return playlistService$collectListExposureEffect$2;
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
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$component, this.this$0, null), 3, (Object) null);
    }
}
