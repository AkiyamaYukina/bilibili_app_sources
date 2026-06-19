package com.bilibili.ship.theseus.united.page.popupwindow;

import android.app.Activity;
import android.widget.PopupWindow;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import com.bilibili.ship.theseus.united.page.popupwindow.TheseusPopupWindowService;
import java.util.Iterator;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/TheseusPopupWindowService.class */
@StabilityInferred(parameters = 0)
public final class TheseusPopupWindowService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Activity f102422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PopupWindowRepository f102423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final i f102424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommonv2.guideBubble.g f102425e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.popupwindow.TheseusPopupWindowService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/TheseusPopupWindowService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPopupWindowService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.popupwindow.TheseusPopupWindowService$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/TheseusPopupWindowService$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusPopupWindowService f102426a;

            public a(TheseusPopupWindowService theseusPopupWindowService) {
                this.f102426a = theseusPopupWindowService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Unit unit;
                com.bilibili.ship.theseus.united.page.popupwindow.b bVar = (com.bilibili.ship.theseus.united.page.popupwindow.b) obj;
                TheseusPopupWindowService theseusPopupWindowService = this.f102426a;
                if (theseusPopupWindowService.f102422b.isFinishing() || theseusPopupWindowService.f102422b.isDestroyed()) {
                    com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-united-TheseusPopupWindowService$3$1-emit] ", C3259x.a(bVar.getType(), "activity is finishing or destroyed, skip show popup window "), "TheseusPopupWindowService$3$1-emit", (Throwable) null);
                    unit = Unit.INSTANCE;
                } else {
                    final i iVar = theseusPopupWindowService.f102424d;
                    if (iVar.f102453b.size() >= 5) {
                        T7.a.a(iVar.f102453b.size(), "record popup window, can not show more, size: ", "UnitedPopupWindowManager");
                    } else {
                        int type = bVar.getType();
                        boolean zIsEmpty = true;
                        if (type != -1) {
                            Iterator<g> it = iVar.f102453b.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    zIsEmpty = false;
                                    break;
                                }
                                if (it.next().f102440a == type) {
                                    break;
                                }
                            }
                        } else {
                            zIsEmpty = true ^ iVar.f102453b.isEmpty();
                        }
                        if (zIsEmpty) {
                            BLog.i("UnitedPopupWindowManager", "this type window is already show");
                        } else {
                            final g gVarA = bVar.a(iVar.f102452a);
                            PopupWindow.OnDismissListener onDismissListener = new PopupWindow.OnDismissListener(iVar, gVarA) { // from class: com.bilibili.ship.theseus.united.page.popupwindow.h

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final i f102450a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final g f102451b;

                                {
                                    this.f102450a = iVar;
                                    this.f102451b = gVarA;
                                }

                                @Override // android.widget.PopupWindow.OnDismissListener
                                public final void onDismiss() {
                                    i iVar2 = this.f102450a;
                                    g gVar = this.f102451b;
                                    TheseusPopupWindowService.a aVar = iVar2.f102454c;
                                    if (aVar != null) {
                                        aVar.a(gVar.f102440a);
                                    }
                                    iVar2.f102453b.remove(gVar);
                                }
                            };
                            if (!gVarA.f102449k.contains(onDismissListener)) {
                                gVarA.f102449k.add(onDismissListener);
                            }
                            if (!iVar.f102453b.contains(gVarA)) {
                                a aVar = iVar.f102454c;
                                if (aVar != null) {
                                    aVar.f102430a.f102423c.f102420k.add(Integer.valueOf(gVarA.f102440a));
                                }
                                iVar.f102453b.add(gVarA);
                            }
                            bVar.b();
                        }
                    }
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TheseusPopupWindowService theseusPopupWindowService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = theseusPopupWindowService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
                TheseusPopupWindowService theseusPopupWindowService = this.this$0;
                SharedFlow<com.bilibili.ship.theseus.united.page.popupwindow.b> sharedFlow = theseusPopupWindowService.f102423c.f102414d;
                a aVar = new a(theseusPopupWindowService);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.popupwindow.TheseusPopupWindowService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/TheseusPopupWindowService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPopupWindowService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.popupwindow.TheseusPopupWindowService$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/TheseusPopupWindowService$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusPopupWindowService f102427a;

            public a(TheseusPopupWindowService theseusPopupWindowService) {
                this.f102427a = theseusPopupWindowService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Unit unit;
                com.bilibili.playerbizcommonv2.guideBubble.h hVar = (com.bilibili.playerbizcommonv2.guideBubble.h) obj;
                TheseusPopupWindowService theseusPopupWindowService = this.f102427a;
                if (theseusPopupWindowService.f102422b.isFinishing() || theseusPopupWindowService.f102422b.isDestroyed()) {
                    com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-united-TheseusPopupWindowService$4$1-emit] ", C3259x.a(hVar.f81772a.f81755v, "activity is finishing or destroyed, skip show popup window "), "TheseusPopupWindowService$4$1-emit", (Throwable) null);
                    unit = Unit.INSTANCE;
                } else {
                    theseusPopupWindowService.f102425e.a(hVar.f81772a, hVar.f81773b, hVar.f81774c);
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(TheseusPopupWindowService theseusPopupWindowService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = theseusPopupWindowService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
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
                TheseusPopupWindowService theseusPopupWindowService = this.this$0;
                SharedFlow<com.bilibili.playerbizcommonv2.guideBubble.h> sharedFlow = theseusPopupWindowService.f102423c.f102416f;
                a aVar = new a(theseusPopupWindowService);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.popupwindow.TheseusPopupWindowService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/TheseusPopupWindowService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPopupWindowService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.popupwindow.TheseusPopupWindowService$5$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/TheseusPopupWindowService$5$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusPopupWindowService f102428a;

            public a(TheseusPopupWindowService theseusPopupWindowService) {
                this.f102428a = theseusPopupWindowService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                TheseusPopupWindowService theseusPopupWindowService = this.f102428a;
                i iVar = theseusPopupWindowService.f102424d;
                for (g gVar : iVar.f102453b) {
                    if (gVar.f102440a == iIntValue) {
                        a aVar = iVar.f102454c;
                        if (aVar != null) {
                            aVar.a(iIntValue);
                        }
                        gVar.dismiss();
                        iVar.f102453b.remove(gVar);
                    }
                }
                com.bilibili.playerbizcommonv2.guideBubble.g gVar2 = theseusPopupWindowService.f102425e;
                for (BiliGuideBubble biliGuideBubble : gVar2.f81770a) {
                    if (biliGuideBubble.f81755v == iIntValue) {
                        b bVar = gVar2.f81771b;
                        if (bVar != null) {
                            bVar.a(iIntValue);
                        }
                        biliGuideBubble.dismiss();
                        gVar2.f81770a.remove(biliGuideBubble);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(TheseusPopupWindowService theseusPopupWindowService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = theseusPopupWindowService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
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
                TheseusPopupWindowService theseusPopupWindowService = this.this$0;
                SharedFlow<Integer> sharedFlow = theseusPopupWindowService.f102423c.h;
                a aVar = new a(theseusPopupWindowService);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.popupwindow.TheseusPopupWindowService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/TheseusPopupWindowService$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPopupWindowService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.popupwindow.TheseusPopupWindowService$6$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/TheseusPopupWindowService$6$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusPopupWindowService f102429a;

            public a(TheseusPopupWindowService theseusPopupWindowService) {
                this.f102429a = theseusPopupWindowService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                ((Number) obj).intValue();
                TheseusPopupWindowService theseusPopupWindowService = this.f102429a;
                i iVar = theseusPopupWindowService.f102424d;
                for (g gVar : iVar.f102453b) {
                    a aVar = iVar.f102454c;
                    if (aVar != null) {
                        aVar.a(gVar.f102440a);
                    }
                    gVar.dismiss();
                }
                iVar.f102453b.clear();
                com.bilibili.playerbizcommonv2.guideBubble.g gVar2 = theseusPopupWindowService.f102425e;
                for (BiliGuideBubble biliGuideBubble : gVar2.f81770a) {
                    b bVar = gVar2.f81771b;
                    if (bVar != null) {
                        bVar.a(biliGuideBubble.f81755v);
                    }
                    biliGuideBubble.dismiss();
                }
                gVar2.f81770a.clear();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(TheseusPopupWindowService theseusPopupWindowService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = theseusPopupWindowService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, continuation);
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
                TheseusPopupWindowService theseusPopupWindowService = this.this$0;
                SharedFlow<Integer> sharedFlow = theseusPopupWindowService.f102423c.f102419j;
                a aVar = new a(theseusPopupWindowService);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/TheseusPopupWindowService$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusPopupWindowService f102430a;

        public a(TheseusPopupWindowService theseusPopupWindowService) {
            this.f102430a = theseusPopupWindowService;
        }

        public final void a(int i7) {
            this.f102430a.f102423c.f102420k.remove(Integer.valueOf(i7));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/TheseusPopupWindowService$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusPopupWindowService f102431a;

        public b(TheseusPopupWindowService theseusPopupWindowService) {
            this.f102431a = theseusPopupWindowService;
        }

        public final void a(int i7) {
            this.f102431a.f102423c.f102420k.remove(Integer.valueOf(i7));
        }
    }

    @Inject
    public TheseusPopupWindowService(@NotNull CoroutineScope coroutineScope, @NotNull Activity activity, @NotNull PopupWindowRepository popupWindowRepository) {
        this.f102421a = coroutineScope;
        this.f102422b = activity;
        this.f102423c = popupWindowRepository;
        i iVar = new i(activity);
        this.f102424d = iVar;
        com.bilibili.playerbizcommonv2.guideBubble.g gVar = new com.bilibili.playerbizcommonv2.guideBubble.g();
        this.f102425e = gVar;
        iVar.f102454c = new a(this);
        gVar.f81771b = new b(this);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this, null), 3, (Object) null);
    }
}
