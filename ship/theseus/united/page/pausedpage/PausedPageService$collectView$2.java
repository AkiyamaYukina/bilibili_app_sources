package com.bilibili.ship.theseus.united.page.pausedpage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;
import com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService;
import com.bilibili.ship.theseus.united.widget.TouchAwareConstraintLayout;
import com.bilibili.ship.theseus.united.widget.TouchAwareToolbar;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$collectView$2.class */
final class PausedPageService$collectView$2 extends SuspendLambda implements Function2<PausedPageService.c, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final PausedPageService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausedPageService$collectView$2(PausedPageService pausedPageService, Continuation<? super PausedPageService$collectView$2> continuation) {
        super(2, continuation);
        this.this$0 = pausedPageService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(PausedPageService pausedPageService, MotionEvent motionEvent) {
        if (pausedPageService.f102171z == PausedPageService.FlowState.PANEL_VISIBLE) {
            BLog.i("PausedPageService", "ignoreUnderPlayerTouch reason=panel_visible");
            return Unit.INSTANCE;
        }
        pausedPageService.r(AdPausedPageTriggerReason.CLICK_UNDER_PLAYER);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(PausedPageService pausedPageService, TouchAwareToolbar touchAwareToolbar, PausedPageService.c cVar, MotionEvent motionEvent) {
        boolean zContains;
        if (pausedPageService.f102171z == PausedPageService.FlowState.IDLE) {
            return Unit.INSTANCE;
        }
        View view = cVar.f102186c;
        if (view == null || motionEvent == null) {
            zContains = false;
        } else {
            zContains = false;
            if (view.isShown()) {
                zContains = false;
                if (view.getWidth() > 0) {
                    if (view.getHeight() <= 0) {
                        zContains = false;
                    } else {
                        View view2 = view;
                        while (true) {
                            View view3 = view2;
                            zContains = false;
                            if (view3 == null) {
                                break;
                            }
                            if (view3 == touchAwareToolbar) {
                                Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
                                touchAwareToolbar.offsetDescendantRectToMyCoords(view, rect);
                                zContains = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
                                break;
                            }
                            Object parent = view3.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        if (zContains) {
            return Unit.INSTANCE;
        }
        pausedPageService.r(AdPausedPageTriggerReason.CLICK_PLAYER_TOPBAR);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PausedPageService$collectView$2 pausedPageService$collectView$2 = new PausedPageService$collectView$2(this.this$0, continuation);
        pausedPageService$collectView$2.L$0 = obj;
        return pausedPageService$collectView$2;
    }

    public final Object invoke(PausedPageService.c cVar, Continuation<? super Unit> continuation) {
        return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        TouchAwareConstraintLayout touchAwareConstraintLayout;
        final TouchAwareToolbar touchAwareToolbar;
        TouchAwareToolbar touchAwareToolbar2;
        TouchAwareConstraintLayout touchAwareConstraintLayout2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final PausedPageService.c cVar = (PausedPageService.c) this.L$0;
            if (cVar == null) {
                return Unit.INSTANCE;
            }
            touchAwareConstraintLayout = cVar.f102184a;
            touchAwareToolbar = cVar.f102185b;
            try {
                final PausedPageService pausedPageService = this.this$0;
                touchAwareConstraintLayout.setTouchDownEventAware(new Function1(pausedPageService) { // from class: com.bilibili.ship.theseus.united.page.pausedpage.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PausedPageService f102222a;

                    {
                        this.f102222a = pausedPageService;
                    }

                    public final Object invoke(Object obj2) {
                        return PausedPageService$collectView$2.invokeSuspend$lambda$0(this.f102222a, (MotionEvent) obj2);
                    }
                });
                final PausedPageService pausedPageService2 = this.this$0;
                touchAwareToolbar.setTouchDownEventAware(new Function1(pausedPageService2, touchAwareToolbar, cVar) { // from class: com.bilibili.ship.theseus.united.page.pausedpage.r

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PausedPageService f102223a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final TouchAwareToolbar f102224b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final PausedPageService.c f102225c;

                    {
                        this.f102223a = pausedPageService2;
                        this.f102224b = touchAwareToolbar;
                        this.f102225c = cVar;
                    }

                    public final Object invoke(Object obj2) {
                        TouchAwareToolbar touchAwareToolbar3 = this.f102224b;
                        return PausedPageService$collectView$2.invokeSuspend$lambda$1(this.f102223a, touchAwareToolbar3, this.f102225c, (MotionEvent) obj2);
                    }
                });
                this.L$0 = touchAwareConstraintLayout;
                this.L$1 = touchAwareToolbar;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                touchAwareToolbar2 = touchAwareToolbar;
                touchAwareConstraintLayout.setTouchDownEventAware(null);
                touchAwareToolbar2.setTouchDownEventAware(null);
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TouchAwareToolbar touchAwareToolbar3 = (TouchAwareToolbar) this.L$1;
            touchAwareConstraintLayout = (TouchAwareConstraintLayout) this.L$0;
            touchAwareToolbar2 = touchAwareToolbar3;
            touchAwareConstraintLayout2 = touchAwareConstraintLayout;
            try {
                ResultKt.throwOnFailure(obj);
                touchAwareToolbar = touchAwareToolbar3;
            } catch (Throwable th2) {
                touchAwareConstraintLayout = touchAwareConstraintLayout2;
                th = th2;
                touchAwareConstraintLayout.setTouchDownEventAware(null);
                touchAwareToolbar2.setTouchDownEventAware(null);
                throw th;
            }
        }
        touchAwareToolbar2 = touchAwareToolbar;
        touchAwareConstraintLayout2 = touchAwareConstraintLayout;
        throw new KotlinNothingValueException();
    }
}
