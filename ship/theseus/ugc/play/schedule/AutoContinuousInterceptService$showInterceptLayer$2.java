package com.bilibili.ship.theseus.ugc.play.schedule;

import android.content.Context;
import com.bilibili.ship.theseus.ugc.endpage.UGCAutoContinuousInterceptWidget;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IFunctionWidgetServiceKt;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$showInterceptLayer$2.class */
final class AutoContinuousInterceptService$showInterceptLayer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final AutoContinuousInterceptService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$showInterceptLayer$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IFunctionContainer.LayoutParams $layoutParams;
        final UGCAutoContinuousInterceptWidget $widget;
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AutoContinuousInterceptService autoContinuousInterceptService, UGCAutoContinuousInterceptWidget uGCAutoContinuousInterceptWidget, IFunctionContainer.LayoutParams layoutParams, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = autoContinuousInterceptService;
            this.$widget = uGCAutoContinuousInterceptWidget;
            this.$layoutParams = layoutParams;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$widget, this.$layoutParams, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AbsFunctionWidgetService absFunctionWidgetService = this.this$0.f98129r;
                UGCAutoContinuousInterceptWidget uGCAutoContinuousInterceptWidget = this.$widget;
                IFunctionContainer.LayoutParams layoutParams = this.$layoutParams;
                this.label = 1;
                if (IFunctionWidgetServiceKt.retainFunctionWidget$default(absFunctionWidgetService, uGCAutoContinuousInterceptWidget, layoutParams, (Function1) null, this, 4, (Object) null) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$showInterceptLayer$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = autoContinuousInterceptService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            com.bilibili.ship.theseus.united.page.screenstate.c cVar;
            String str;
            com.bilibili.ship.theseus.united.page.screenstate.c cVar2;
            String str2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                cVar = this.this$0.h;
                cVar.j("UGCAutoContinuousInterceptService", true);
                try {
                    this.L$0 = cVar;
                    this.L$1 = "UGCAutoContinuousInterceptService";
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = "UGCAutoContinuousInterceptService";
                } catch (Throwable th) {
                    th = th;
                    str = "UGCAutoContinuousInterceptService";
                    cVar2 = cVar;
                    cVar2.j(str, false);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str3 = (String) this.L$1;
                cVar = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
                str = str3;
                cVar2 = cVar;
                try {
                    ResultKt.throwOnFailure(obj);
                    str2 = str3;
                } catch (Throwable th2) {
                    th = th2;
                    cVar2.j(str, false);
                    throw th;
                }
            }
            str = str2;
            cVar2 = cVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$showInterceptLayer$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = autoContinuousInterceptService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            com.bilibili.ship.theseus.united.page.playingarea.i iVar;
            String str;
            com.bilibili.ship.theseus.united.page.playingarea.i iVar2;
            String str2;
            com.bilibili.ship.theseus.united.page.playingarea.i iVar3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                iVar = this.this$0.f98114b;
                iVar.a("UGCAutoContinuousInterceptService");
                try {
                    this.L$0 = iVar;
                    this.L$1 = "UGCAutoContinuousInterceptService";
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = "UGCAutoContinuousInterceptService";
                } catch (Throwable th) {
                    th = th;
                    str = "UGCAutoContinuousInterceptService";
                    iVar2 = iVar;
                    iVar2.c(str);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.L$1;
                com.bilibili.ship.theseus.united.page.playingarea.i iVar4 = (com.bilibili.ship.theseus.united.page.playingarea.i) this.L$0;
                str = str2;
                iVar3 = iVar4;
                try {
                    ResultKt.throwOnFailure(obj);
                    iVar = iVar4;
                } catch (Throwable th2) {
                    iVar2 = iVar3;
                    th = th2;
                    iVar2.c(str);
                    throw th;
                }
            }
            str = str2;
            iVar3 = iVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$showInterceptLayer$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UGCAutoContinuousInterceptWidget $widget;
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$showInterceptLayer$2$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AutoContinuousInterceptService f98151a;

            public a(AutoContinuousInterceptService autoContinuousInterceptService) {
                this.f98151a = autoContinuousInterceptService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                UGCAutoContinuousInterceptWidget.b bVar = (UGCAutoContinuousInterceptWidget.b) obj;
                boolean zAreEqual = Intrinsics.areEqual(bVar, UGCAutoContinuousInterceptWidget.b.C0819b.f96472a);
                AutoContinuousInterceptService autoContinuousInterceptService = this.f98151a;
                if (zAreEqual) {
                    autoContinuousInterceptService.getClass();
                    BuildersKt.launch$default(autoContinuousInterceptService.f98113a, (CoroutineContext) null, (CoroutineStart) null, new AutoContinuousInterceptService$tryToRewind$1(autoContinuousInterceptService, null), 3, (Object) null);
                    PageReportService.g(autoContinuousInterceptService.f98128q, "player.player.endpage.replay.player", AutoContinuousInterceptService.b(autoContinuousInterceptService), 4);
                } else if (Intrinsics.areEqual(bVar, UGCAutoContinuousInterceptWidget.b.a.f96471a)) {
                    autoContinuousInterceptService.f98131t.tryEmit(CancelFrom.CANCEL_BUTTON);
                    PageReportService.g(autoContinuousInterceptService.f98128q, "player.player.endpage.continuous-cancel.player", AutoContinuousInterceptService.b(autoContinuousInterceptService), 4);
                } else if (Intrinsics.areEqual(bVar, UGCAutoContinuousInterceptWidget.b.d.f96474a)) {
                    autoContinuousInterceptService.f98131t.tryEmit(CancelFrom.SHARE_BUTTON);
                    autoContinuousInterceptService.f98122k.f126351b.tryEmit(Unit.INSTANCE);
                    Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                    mapCreateMapBuilder.put("season_type", "6");
                    mapCreateMapBuilder.put("share_button", "1");
                    mapCreateMapBuilder.put("share_detail_type", "1");
                    mapCreateMapBuilder.putAll(AutoContinuousInterceptService.b(autoContinuousInterceptService));
                    PageReportService.g(autoContinuousInterceptService.f98128q, "player.player.half-endpage.share-new.player", MapsKt.build(mapCreateMapBuilder), 4);
                } else {
                    PageReportService.i(autoContinuousInterceptService.f98128q, "player.player.endpage.cover-play.player", AutoContinuousInterceptService.b(autoContinuousInterceptService), 4);
                    AutoContinuousInterceptService.a(autoContinuousInterceptService, true);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(UGCAutoContinuousInterceptWidget uGCAutoContinuousInterceptWidget, AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$widget = uGCAutoContinuousInterceptWidget;
            this.this$0 = autoContinuousInterceptService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$widget, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<UGCAutoContinuousInterceptWidget.b> sharedFlow = this.$widget.f96464f;
                a aVar = new a(this.this$0);
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
    public AutoContinuousInterceptService$showInterceptLayer$2(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AutoContinuousInterceptService$showInterceptLayer$2> continuation) {
        super(2, continuation);
        this.this$0 = autoContinuousInterceptService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutoContinuousInterceptService$showInterceptLayer$2 autoContinuousInterceptService$showInterceptLayer$2 = new AutoContinuousInterceptService$showInterceptLayer$2(this.this$0, continuation);
        autoContinuousInterceptService$showInterceptLayer$2.L$0 = obj;
        return autoContinuousInterceptService$showInterceptLayer$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1] */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        final AutoNextInfo autoNextInfo = this.this$0.f98137z;
        if (autoNextInfo == null) {
            return Unit.INSTANCE;
        }
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
        layoutParams.setEnterAnim(-1);
        layoutParams.setExitAnim(-1);
        layoutParams.setFunctionType(1);
        layoutParams.setLayoutType(32);
        AutoContinuousInterceptService autoContinuousInterceptService = this.this$0;
        Context context = autoContinuousInterceptService.f98130s;
        final MutableStateFlow<Integer> mutableStateFlow = autoContinuousInterceptService.f98132u;
        UGCAutoContinuousInterceptWidget uGCAutoContinuousInterceptWidget = new UGCAutoContinuousInterceptWidget(context, new Flow<UGCAutoContinuousInterceptWidget.c>(mutableStateFlow, autoNextInfo) { // from class: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f98152a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AutoNextInfo f98153b;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f98154a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final AutoNextInfo f98155b;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    Object result;
                    final AnonymousClass2 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                        super(continuation);
                        this.this$0 = anonymousClass2;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, AutoNextInfo autoNextInfo) {
                    this.f98154a = flowCollector;
                    this.f98155b = autoNextInfo;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
                    /*
                        r13 = this;
                        r0 = r15
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r15
                        com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        r17 = r0
                        r0 = r17
                        int r0 = r0.label
                        r16 = r0
                        r0 = r16
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r17
                        r1 = r16
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r17
                        r15 = r0
                        goto L33
                    L29:
                        com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1$2$1
                        r1 = r0
                        r2 = r13
                        r3 = r15
                        r1.<init>(r2, r3)
                        r15 = r0
                    L33:
                        r0 = r15
                        java.lang.Object r0 = r0.result
                        r18 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r17 = r0
                        r0 = r15
                        int r0 = r0.label
                        r16 = r0
                        r0 = r16
                        if (r0 == 0) goto L5e
                        r0 = r16
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r18
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto Lc2
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r18
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r14
                        java.lang.Number r0 = (java.lang.Number) r0
                        int r0 = r0.intValue()
                        r16 = r0
                        r0 = r13
                        com.bilibili.ship.theseus.ugc.play.schedule.AutoNextInfo r0 = r0.f98155b
                        r18 = r0
                        r0 = r18
                        java.lang.String r0 = r0.f98157a
                        r14 = r0
                        r0 = r18
                        java.lang.String r0 = r0.f98159c
                        r19 = r0
                        com.bilibili.ship.theseus.ugc.endpage.UGCAutoContinuousInterceptWidget$c r0 = new com.bilibili.ship.theseus.ugc.endpage.UGCAutoContinuousInterceptWidget$c
                        r1 = r0
                        r2 = r14
                        r3 = r16
                        com.bilibili.ship.theseus.ugc.endpage.UGCAutoContinuousInterceptWidget$a r4 = new com.bilibili.ship.theseus.ugc.endpage.UGCAutoContinuousInterceptWidget$a
                        r5 = r4
                        r6 = r18
                        int r6 = r6.f98160d
                        r7 = r19
                        r8 = r18
                        java.lang.String r8 = r8.f98163g
                        r9 = r18
                        java.lang.String r9 = r9.f98161e
                        r10 = r18
                        java.lang.String r10 = r10.f98162f
                        r11 = r18
                        java.lang.String r11 = r11.h
                        r5.<init>(r6, r7, r8, r9, r10, r11)
                        r1.<init>(r2, r3, r4)
                        r14 = r0
                        r0 = r15
                        r1 = 1
                        r0.label = r1
                        r0 = r13
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f98154a
                        r1 = r14
                        r2 = r15
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r17
                        if (r0 != r1) goto Lc2
                        r0 = r17
                        return r0
                    Lc2:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$showInterceptLayer$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f98152a = mutableStateFlow;
                this.f98153b = autoNextInfo;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f98152a.collect(new AnonymousClass2(flowCollector, this.f98153b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        this.this$0.f98115c.hide();
        this.this$0.f98116d.removeAllToast();
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, uGCAutoContinuousInterceptWidget, layoutParams, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(uGCAutoContinuousInterceptWidget, this.this$0, null), 3, (Object) null);
        AutoContinuousInterceptService autoContinuousInterceptService2 = this.this$0;
        PageReportService.i(autoContinuousInterceptService2.f98128q, "player.player.endpage.0.show", AutoContinuousInterceptService.b(autoContinuousInterceptService2), 4);
        return Unit.INSTANCE;
    }
}
