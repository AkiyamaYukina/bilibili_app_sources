package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import android.content.Context;
import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent;
import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService$keepLayerShowing$2;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import com.bilibili.ship.theseus.cheese.player.playselect.c;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import eu0.C6985d;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$keepLayerShowing$2.class */
public final class CheeseStudyCompletedLayerService$keepLayerShowing$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final long $duration;
    final hu0.e $studyRecordConfig;
    private Object L$0;
    int label;
    final CheeseStudyCompletedLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService$keepLayerShowing$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$keepLayerShowing$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $duration;
        final hu0.e $studyRecordConfig;
        private Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        final CheeseStudyCompletedLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService, hu0.e eVar, long j7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseStudyCompletedLayerService;
            this.$studyRecordConfig = eVar;
            this.$duration = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$studyRecordConfig, this.$duration, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            com.bilibili.ship.theseus.keel.player.h hVar;
            com.bilibili.ship.theseus.united.page.playingarea.i iVar;
            String str;
            Throwable th;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar;
            String str2;
            String str3;
            Throwable th2;
            CheeseStudyCompletedFunctionWidget cheeseStudyCompletedFunctionWidget;
            String str4;
            CheeseStudyCompletedFunctionWidget cheeseStudyCompletedFunctionWidget2;
            String str5;
            com.bilibili.ship.theseus.united.page.playingarea.i iVar2;
            CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService;
            CoroutineScope coroutineScope3;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar3;
            CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService2;
            com.bilibili.ship.theseus.united.page.playingarea.i iVar3;
            String str6;
            com.bilibili.player.tangram.basic.d dVar;
            com.bilibili.player.tangram.basic.d dVar2;
            String str7;
            com.bilibili.player.tangram.basic.d dVar3;
            String str8;
            com.bilibili.player.tangram.basic.d dVar4;
            com.bilibili.player.tangram.basic.d dVar5;
            String str9 = "CheeseStudyCompletedLayer";
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService3 = this.this$0;
                com.bilibili.ship.theseus.keel.player.h hVar2 = cheeseStudyCompletedLayerService3.f90171c;
                hu0.e eVar = this.$studyRecordConfig;
                long j7 = this.$duration;
                hVar2.h(coroutineScope);
                coroutineScope2 = coroutineScope;
                hVar = hVar2;
                try {
                    iVar = cheeseStudyCompletedLayerService3.f90185r;
                    iVar.a("CheeseStudyCompletedLayer");
                    try {
                        com.bilibili.ship.theseus.united.page.playingarea.g gVar4 = cheeseStudyCompletedLayerService3.f90173e;
                        gVar4.f("CheeseStudyCompletedLayer");
                        try {
                            IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
                            layoutParams.setLayoutType(32);
                            layoutParams.setExitAnim(-1);
                            layoutParams.setEnterAnim(-1);
                            layoutParams.setFunctionType(0);
                            Context context = cheeseStudyCompletedLayerService3.f90169a;
                            CheeseStudyCompletedComponent.a aVar = cheeseStudyCompletedLayerService3.f90190w;
                            aVar.f90147g.setValue(eVar.f121500c.f121502b);
                            aVar.h.setValue(eVar.f121500c.f121501a);
                            aVar.f90149j.setValue(Duration.box-impl(j7));
                            cheeseStudyCompletedFunctionWidget = new CheeseStudyCompletedFunctionWidget(context, new CheeseStudyCompletedComponent(aVar));
                            try {
                                cheeseStudyCompletedLayerService3.f90182o.showWidget(cheeseStudyCompletedFunctionWidget, layoutParams);
                                this.L$0 = hVar2;
                                this.L$1 = coroutineScope;
                                this.L$2 = cheeseStudyCompletedLayerService3;
                                this.L$3 = iVar;
                                this.L$4 = "CheeseStudyCompletedLayer";
                                this.L$5 = gVar4;
                                this.L$6 = "CheeseStudyCompletedLayer";
                                this.L$7 = cheeseStudyCompletedFunctionWidget;
                                this.label = 1;
                                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                gVar3 = gVar4;
                                coroutineScope3 = coroutineScope;
                                cheeseStudyCompletedLayerService2 = cheeseStudyCompletedLayerService3;
                                iVar3 = iVar;
                                str6 = "CheeseStudyCompletedLayer";
                                dVar5 = hVar2;
                            } catch (Throwable th3) {
                                th = th3;
                                str4 = "CheeseStudyCompletedLayer";
                                cheeseStudyCompletedFunctionWidget2 = cheeseStudyCompletedFunctionWidget;
                                str5 = "CheeseStudyCompletedLayer";
                                iVar2 = iVar;
                                cheeseStudyCompletedLayerService = cheeseStudyCompletedLayerService3;
                                coroutineScope3 = coroutineScope;
                                gVar2 = gVar4;
                                dVar4 = hVar2;
                                str7 = str5;
                                gVar = gVar2;
                                str8 = str4;
                                dVar3 = dVar4;
                                cheeseStudyCompletedLayerService.f90182o.hideWidget(cheeseStudyCompletedFunctionWidget2);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            gVar = gVar4;
                            str2 = "CheeseStudyCompletedLayer";
                            str3 = str9;
                            th2 = th4;
                            dVar2 = hVar2;
                            gVar.j(str3);
                            throw th2;
                        }
                    } catch (Throwable th5) {
                        str = str9;
                        th = th5;
                        dVar = hVar2;
                        iVar.c(str);
                        coroutineScope2 = coroutineScope;
                        hVar = dVar == true ? 1 : 0;
                        throw th;
                    }
                } catch (Throwable th6) {
                    hVar.i(coroutineScope2);
                    throw th6;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CheeseStudyCompletedFunctionWidget cheeseStudyCompletedFunctionWidget3 = (CheeseStudyCompletedFunctionWidget) this.L$7;
                str7 = (String) this.L$6;
                gVar = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$5;
                String str10 = (String) this.L$4;
                iVar2 = (com.bilibili.ship.theseus.united.page.playingarea.i) this.L$3;
                CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService4 = (CheeseStudyCompletedLayerService) this.L$2;
                coroutineScope3 = (CoroutineScope) this.L$1;
                com.bilibili.player.tangram.basic.d dVar6 = (com.bilibili.player.tangram.basic.d) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    cheeseStudyCompletedFunctionWidget = cheeseStudyCompletedFunctionWidget3;
                    str9 = str7;
                    str6 = str10;
                    iVar3 = iVar2;
                    cheeseStudyCompletedLayerService2 = cheeseStudyCompletedLayerService4;
                    gVar3 = gVar;
                    dVar5 = dVar6;
                } catch (Throwable th7) {
                    th = th7;
                    cheeseStudyCompletedFunctionWidget2 = cheeseStudyCompletedFunctionWidget3;
                    str8 = str10;
                    cheeseStudyCompletedLayerService = cheeseStudyCompletedLayerService4;
                    dVar3 = dVar6;
                    try {
                        cheeseStudyCompletedLayerService.f90182o.hideWidget(cheeseStudyCompletedFunctionWidget2);
                        throw th;
                    } catch (Throwable th8) {
                        th2 = th8;
                        com.bilibili.ship.theseus.united.page.playingarea.i iVar4 = iVar2;
                        str3 = str7;
                        str2 = str8;
                        coroutineScope = coroutineScope3;
                        iVar = iVar4;
                        dVar2 = dVar3;
                        try {
                            gVar.j(str3);
                            throw th2;
                        } catch (Throwable th9) {
                            th = th9;
                            str = str2;
                            dVar = dVar2;
                            iVar.c(str);
                            coroutineScope2 = coroutineScope;
                            hVar = dVar == true ? 1 : 0;
                            throw th;
                        }
                    }
                }
            }
            try {
                throw new KotlinNothingValueException();
            } catch (Throwable th10) {
                th = th10;
                String str11 = str9;
                CheeseStudyCompletedFunctionWidget cheeseStudyCompletedFunctionWidget4 = cheeseStudyCompletedFunctionWidget;
                gVar2 = gVar3;
                cheeseStudyCompletedLayerService = cheeseStudyCompletedLayerService2;
                iVar2 = iVar3;
                str4 = str6;
                str5 = str11;
                cheeseStudyCompletedFunctionWidget2 = cheeseStudyCompletedFunctionWidget4;
                dVar4 = dVar5;
                str7 = str5;
                gVar = gVar2;
                str8 = str4;
                dVar3 = dVar4;
                cheeseStudyCompletedLayerService.f90182o.hideWidget(cheeseStudyCompletedFunctionWidget2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService$keepLayerShowing$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$keepLayerShowing$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseStudyCompletedLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService$keepLayerShowing$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$keepLayerShowing$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
            int label;
            final CheeseStudyCompletedLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseStudyCompletedLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService = this.this$0;
                    CheeseStudyCompletedComponent.a aVar = cheeseStudyCompletedLayerService.f90190w;
                    this.label = 1;
                    cheeseStudyCompletedLayerService.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseStudyCompletedLayerService$playAnimation$2(aVar, null), this);
                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCoroutineScope = Unit.INSTANCE;
                    }
                    if (objCoroutineScope == coroutine_suspended) {
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
        public AnonymousClass2(CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheeseStudyCompletedLayerService;
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
                Flow flowTake = FlowKt.take(this.this$0.f90174f.c(), 2);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService$keepLayerShowing$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$keepLayerShowing$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $duration;
        final hu0.e $studyRecordConfig;
        int I$0;
        int label;
        final CheeseStudyCompletedLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(long j7, CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService, hu0.e eVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$duration = j7;
            this.this$0 = cheeseStudyCompletedLayerService;
            this.$studyRecordConfig = eVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$duration, this.this$0, this.$studyRecordConfig, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            int i7;
            CheeseStudyCompletedComponent.a.c cVar;
            CheeseStudyCompletedComponent.a aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i8 = this.label;
            if (i8 == 0) {
                ResultKt.throwOnFailure(obj);
                long j7 = this.$duration;
                Duration.Companion companion = Duration.Companion;
                i7 = Duration.compareTo-LRDsOJo(j7, DurationKt.toDuration(1, DurationUnit.MINUTES)) < 0 ? 1 : 0;
                C c7 = (C) ServiceGenerator.createService(C.class);
                CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService = this.this$0;
                long j8 = cheeseStudyCompletedLayerService.h.f117531a;
                long j9 = cheeseStudyCompletedLayerService.f90176i.f117521q;
                long j10 = cheeseStudyCompletedLayerService.f90188u;
                long j11 = Duration.getInWholeSeconds-impl(this.$duration);
                this.I$0 = i7;
                this.label = 1;
                obj = c7.getStudyCompleted(j8, j11, j9, j10, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i7 = this.I$0;
                ResultKt.throwOnFailure(obj);
            }
            BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
            CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService2 = this.this$0;
            hu0.e eVar = this.$studyRecordConfig;
            long j12 = this.$duration;
            if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
                BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
                new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
                CheeseStudyCompletedComponent.a aVar2 = cheeseStudyCompletedLayerService2.f90190w;
                aVar = aVar2;
                cVar = new CheeseStudyCompletedComponent.a.c(j12, i7 != 0 ? eVar.f121500c.f121503c : eVar.f121500c.f121504d, null);
            } else {
                if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                    if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    StudyEndingPageInfo studyEndingPageInfo = (StudyEndingPageInfo) ((BiliApiResponse.Success) biliApiResponse).getData();
                    cheeseStudyCompletedLayerService2.f90179l.f90289a.setValue(studyEndingPageInfo.b());
                    cheeseStudyCompletedLayerService2.f90190w.f90148i.setValue(new CheeseStudyCompletedComponent.a.c(j12, i7 != 0 ? eVar.f121500c.f121503c : eVar.f121500c.f121504d, studyEndingPageInfo.a()));
                    return Unit.INSTANCE;
                }
                ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
                CheeseStudyCompletedComponent.a aVar3 = cheeseStudyCompletedLayerService2.f90190w;
                cVar = new CheeseStudyCompletedComponent.a.c(j12, i7 != 0 ? eVar.f121500c.f121503c : eVar.f121500c.f121504d, null);
                aVar = aVar3;
            }
            aVar.f90148i.setValue(cVar);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService$keepLayerShowing$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$keepLayerShowing$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseStudyCompletedLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService$keepLayerShowing$2$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$keepLayerShowing$2$4$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f90192a;

            static {
                int[] iArr = new int[PlaybackMode.values().length];
                try {
                    iArr[PlaybackMode.AUTO_CONTINUOUS.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[PlaybackMode.LIST_LOOP.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[PlaybackMode.PAUSE_WHEN_ENDED.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[PlaybackMode.SINGLE_EPISODE_LOOP.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                f90192a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = cheeseStudyCompletedLayerService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService, String str) {
            cheeseStudyCompletedLayerService.f90190w.f90150k.setValue(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService, String str) {
            cheeseStudyCompletedLayerService.f90190w.f90150k.setValue(str);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlaybackMode.a aVar = PlaybackMode.Companion;
                int i8 = this.this$0.f90175g.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
                aVar.getClass();
                PlaybackMode playbackModeA = PlaybackMode.a.a(i8);
                CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService = this.this$0;
                com.bilibili.ship.theseus.cheese.player.playselect.c cVarA = cheeseStudyCompletedLayerService.f90184q.a(new c.a(cheeseStudyCompletedLayerService.f90176i));
                String str = cVarA == null ? "播放第一集" : "播放下一集";
                int i9 = a.f90192a[playbackModeA.ordinal()];
                if (i9 == 1 || i9 == 2) {
                    if (cVarA == null && playbackModeA == PlaybackMode.AUTO_CONTINUOUS) {
                        this.this$0.f90190w.f90150k.setValue(str);
                    } else {
                        final CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService2 = this.this$0;
                        Function1 function1 = new Function1(cheeseStudyCompletedLayerService2) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.m

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final CheeseStudyCompletedLayerService f90256a;

                            {
                                this.f90256a = cheeseStudyCompletedLayerService2;
                            }

                            public final Object invoke(Object obj2) {
                                return CheeseStudyCompletedLayerService$keepLayerShowing$2.AnonymousClass4.invokeSuspend$lambda$0(this.f90256a, (String) obj2);
                            }
                        };
                        this.label = 1;
                        if (cheeseStudyCompletedLayerService2.b(str, 5, function1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.this$0.f90178k.b(true);
                    }
                } else if (i9 == 3) {
                    this.this$0.f90190w.f90150k.setValue(str);
                } else {
                    if (i9 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService3 = this.this$0;
                    Function1 function12 = new Function1(cheeseStudyCompletedLayerService3) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.n

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final CheeseStudyCompletedLayerService f90257a;

                        {
                            this.f90257a = cheeseStudyCompletedLayerService3;
                        }

                        public final Object invoke(Object obj2) {
                            return CheeseStudyCompletedLayerService$keepLayerShowing$2.AnonymousClass4.invokeSuspend$lambda$1(this.f90257a, (String) obj2);
                        }
                    };
                    this.label = 2;
                    if (cheeseStudyCompletedLayerService3.b("重播", 5, function12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService4 = this.this$0;
                    CheesePlayRepository cheesePlayRepository = cheeseStudyCompletedLayerService4.f90186s;
                    C6985d c6985d = cheeseStudyCompletedLayerService4.f90176i;
                    CheesePlayRepository.e(cheesePlayRepository, c6985d.f117510e, c6985d.f117511f, 99, 12);
                }
            } else if (i7 == 1) {
                ResultKt.throwOnFailure(obj);
                this.this$0.f90178k.b(true);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService42 = this.this$0;
                CheesePlayRepository cheesePlayRepository2 = cheeseStudyCompletedLayerService42.f90186s;
                C6985d c6985d2 = cheeseStudyCompletedLayerService42.f90176i;
                CheesePlayRepository.e(cheesePlayRepository2, c6985d2.f117510e, c6985d2.f117511f, 99, 12);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService$keepLayerShowing$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$keepLayerShowing$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseStudyCompletedLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = cheeseStudyCompletedLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
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
                    this.this$0.f90172d.setToastAvailable(false);
                    this.this$0.f90172d.removeAllToast();
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
                this.this$0.f90172d.setToastAvailable(true);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseStudyCompletedLayerService$keepLayerShowing$2(CheeseStudyCompletedLayerService cheeseStudyCompletedLayerService, hu0.e eVar, long j7, Continuation<? super CheeseStudyCompletedLayerService$keepLayerShowing$2> continuation) {
        super(2, continuation);
        this.this$0 = cheeseStudyCompletedLayerService;
        this.$studyRecordConfig = eVar;
        this.$duration = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseStudyCompletedLayerService$keepLayerShowing$2 cheeseStudyCompletedLayerService$keepLayerShowing$2 = new CheeseStudyCompletedLayerService$keepLayerShowing$2(this.this$0, this.$studyRecordConfig, this.$duration, continuation);
        cheeseStudyCompletedLayerService$keepLayerShowing$2.L$0 = obj;
        return cheeseStudyCompletedLayerService$keepLayerShowing$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$studyRecordConfig, this.$duration, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$duration, this.this$0, this.$studyRecordConfig, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, null), 3, (Object) null);
    }
}
