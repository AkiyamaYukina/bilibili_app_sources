package com.bilibili.ship.theseus.united.page.uistyle;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommon.gesture.IGestureService;
import com.bilibili.playerbizcommon.gesture.OnSingleTapListener;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
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
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUiGestureService.class */
@StabilityInferred(parameters = 0)
public final class TheseusPageUiGestureService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f103535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f103536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IGestureService f103537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageNestedScrollFusionRepository f103538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f103539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f103540g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a h;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUiGestureService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUiGestureService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final TheseusPageUiGestureService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUiGestureService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUiGestureService$1$a.class */
        public static final class a implements OnSingleTapListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusPageUiGestureService f103541a;

            public a(TheseusPageUiGestureService theseusPageUiGestureService) {
                this.f103541a = theseusPageUiGestureService;
            }

            @Override // com.bilibili.playerbizcommon.gesture.OnSingleTapListener
            public final boolean onTap(MotionEvent motionEvent) {
                TheseusPageUiGestureService theseusPageUiGestureService = this.f103541a;
                boolean z6 = theseusPageUiGestureService.f103536c.getState() == 4;
                com.bilibili.ship.theseus.united.page.playingarea.a aVar = theseusPageUiGestureService.h;
                int i7 = aVar.c().f102352b;
                int iH = aVar.h();
                int i8 = theseusPageUiGestureService.f103535b.f103507q;
                PageNestedScrollFusionRepository pageNestedScrollFusionRepository = theseusPageUiGestureService.f103538e;
                if (((Number) pageNestedScrollFusionRepository.f102254e.getValue()).intValue() + i7 >= iH + i8 || z6 || theseusPageUiGestureService.f103539f.getScreenModeType() != ScreenModeType.THUMB) {
                    return false;
                }
                pageNestedScrollFusionRepository.e(true, false);
                theseusPageUiGestureService.f103540g.p();
                return false;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusPageUiGestureService theseusPageUiGestureService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusPageUiGestureService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            Throwable th;
            a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusPageUiGestureService theseusPageUiGestureService = this.this$0;
                if (!theseusPageUiGestureService.f103535b.f103504n) {
                    return Unit.INSTANCE;
                }
                aVar = new a(theseusPageUiGestureService);
                IGestureService.addOnSingleTapListener$default(theseusPageUiGestureService.f103537d, aVar, 0, 2, null);
                try {
                    this.L$0 = aVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar;
                    this.this$0.f103537d.removeOnSingleTapListener(aVar2);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a aVar3 = (a) this.L$0;
                aVar2 = aVar3;
                try {
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar3;
                } catch (Throwable th3) {
                    th = th3;
                    this.this$0.f103537d.removeOnSingleTapListener(aVar2);
                    throw th;
                }
            }
            aVar2 = aVar;
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public TheseusPageUiGestureService(@NotNull CoroutineScope coroutineScope, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull IGestureService iGestureService, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull IControlContainerService iControlContainerService, @NotNull h hVar, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar) {
        this.f103534a = coroutineScope;
        this.f103535b = theseusPageUIStyleRepository;
        this.f103536c = iPlayerCoreService;
        this.f103537d = iGestureService;
        this.f103538e = pageNestedScrollFusionRepository;
        this.f103539f = iControlContainerService;
        this.f103540g = hVar;
        this.h = aVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
