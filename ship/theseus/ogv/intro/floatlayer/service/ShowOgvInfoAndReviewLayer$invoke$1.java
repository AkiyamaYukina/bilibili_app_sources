package com.bilibili.ship.theseus.ogv.intro.floatlayer.service;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.u;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.uicomponent.c;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/ShowOgvInfoAndReviewLayer$invoke$1.class */
final class ShowOgvInfoAndReviewLayer$invoke$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $tabPosition;
    private Object L$0;
    int label;
    final i this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.service.ShowOgvInfoAndReviewLayer$invoke$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/ShowOgvInfoAndReviewLayer$invoke$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RunningUIComponent $runningUIComponent;
        Object L$0;
        Object L$1;
        int label;
        final i this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(i iVar, RunningUIComponent runningUIComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = iVar;
            this.$runningUIComponent = runningUIComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$runningUIComponent, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            com.bilibili.ship.theseus.united.page.playingarea.g gVar;
            String str;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$1;
                com.bilibili.ship.theseus.united.page.playingarea.g gVar3 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    gVar = gVar3;
                    gVar.j(str);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    gVar2 = gVar3;
                    gVar2.j(str);
                    throw th;
                }
            }
            ResultKt.throwOnFailure(obj);
            i iVar = this.this$0;
            gVar = iVar.h;
            RunningUIComponent runningUIComponent = this.$runningUIComponent;
            gVar.f("DetailInfoAndReviewLayer");
            try {
                TheseusFloatLayerService theseusFloatLayerService = iVar.f93005c;
                UIComponent<?> uIComponent = runningUIComponent.a;
                this.L$0 = gVar;
                this.L$1 = "DetailInfoAndReviewLayer";
                this.label = 1;
                if (theseusFloatLayerService.h(uIComponent, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = "DetailInfoAndReviewLayer";
                gVar.j(str);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                str = "DetailInfoAndReviewLayer";
                gVar2 = gVar;
                th = th3;
                gVar2.j(str);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.service.ShowOgvInfoAndReviewLayer$invoke$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/ShowOgvInfoAndReviewLayer$invoke$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RunningUIComponent $runningUIComponent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RunningUIComponent runningUIComponent, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$runningUIComponent = runningUIComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$runningUIComponent, continuation);
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
                RunningUIComponent runningUIComponent = this.$runningUIComponent;
                this.label = 1;
                if (runningUIComponent.a(this) == coroutine_suspended) {
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
    public ShowOgvInfoAndReviewLayer$invoke$1(i iVar, int i7, Continuation<? super ShowOgvInfoAndReviewLayer$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$tabPosition = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CoroutineScope coroutineScope) {
        CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShowOgvInfoAndReviewLayer$invoke$1 showOgvInfoAndReviewLayer$invoke$1 = new ShowOgvInfoAndReviewLayer$invoke$1(this.this$0, this.$tabPosition, continuation);
        showOgvInfoAndReviewLayer$invoke$1.L$0 = obj;
        return showOgvInfoAndReviewLayer$invoke$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [com.bilibili.ship.theseus.ogv.intro.floatlayer.service.e] */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        final i iVar = this.this$0;
        int i7 = this.$tabPosition;
        g gVar = new g(coroutineScope);
        OgvSeason ogvSeason = iVar.f93009g;
        c.b bVar = new c.b(ogvSeason.f94454f, ogvSeason.f94455g.c(), ogvSeason.f94449a, ogvSeason.f94450b, new d(iVar), new Function1(iVar) { // from class: com.bilibili.ship.theseus.ogv.intro.floatlayer.service.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final i f92998a;

            {
                this.f92998a = iVar;
            }

            public final Object invoke(Object obj2) {
                i iVar2 = this.f92998a;
                c cVar = iVar2.f93007e;
                long j7 = ((u) obj2).f93012a;
                cVar.getClass();
                BuildersKt.launch$default(cVar.f92993d, (CoroutineContext) null, (CoroutineStart) null, new ShowActorsLayer$invoke$1(cVar, j7, null), 3, (Object) null);
                PageReportService.g(iVar2.f93008f, "united.player-video-detail.info-detail-page.actor.click", null, 6);
                return Unit.INSTANCE;
            }
        }, new Cr.b(iVar, 3), new R60.b(iVar, 5), gVar);
        RunningUIComponent runningUIComponent = new RunningUIComponent(new com.bilibili.ship.theseus.ogv.intro.floatlayer.uicomponent.c(bVar, iVar.f93004b, i7, new f(bVar, iVar), !ogvSeason.b().b(), iVar.f93010i.f100020a), 0, new ShowOgvInfoAndReviewLayer$newInfoAndReviewLayer$2(iVar, bVar, null), 2);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, runningUIComponent, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(runningUIComponent, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
