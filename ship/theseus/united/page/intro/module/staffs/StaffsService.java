package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.droid.WindowManagerHelper;
import com.bilibili.lib.avatar.widget.RoundBorderImageView;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService.class */
@StabilityInferred(parameters = 0)
public final class StaffsService {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public B f101826A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final ArrayList<Long> f101827B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final ArrayList<Long> f101828C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final ArrayList<Long> f101829D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f101830E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final Lazy f101831F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f101832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f101833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BusinessType f101834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Flow<TheseusCommentService.e> f101835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f101836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8043a f101837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f101838g;

    @NotNull
    public final C7893a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final C8043a f101839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f101840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final D f101841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f101842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final rW0.a<IntroRecycleViewService> f101843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final PageReportService f101844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f101845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f101846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f101847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.t f101848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final InterfaceC6364a f101849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f101850t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f101851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a f101852v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final E f101853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public UIComponent<?> f101854x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final List<Staff> f101855y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public t f101856z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Point $screenSizes;
        int label;
        final StaffsService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$1$1.class */
        public static final class C10601 extends SuspendLambda implements Function2<TheseusCommentService.e, Continuation<? super Unit>, Object> {
            final Point $screenSizes;
            Object L$0;
            int label;
            final StaffsService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10601(StaffsService staffsService, Point point, Continuation<? super C10601> continuation) {
                super(2, continuation);
                this.this$0 = staffsService;
                this.$screenSizes = point;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10601 c10601 = new C10601(this.this$0, this.$screenSizes, continuation);
                c10601.L$0 = obj;
                return c10601;
            }

            public final Object invoke(TheseusCommentService.e eVar, Continuation<? super Unit> continuation) {
                return create(eVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                int width;
                ViewGroup viewGroup;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                TheseusCommentService.e eVar = (TheseusCommentService.e) this.L$0;
                StaffsService staffsService = this.this$0;
                if (eVar == null || (viewGroup = eVar.f99288a) == null) {
                    Point point = this.$screenSizes;
                    int i7 = point.x;
                    width = point.y;
                    if (i7 <= width) {
                        width = i7;
                    }
                } else {
                    width = viewGroup.getWidth();
                }
                staffsService.f101830E = width;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StaffsService staffsService, Point point, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = staffsService;
            this.$screenSizes = point;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$screenSizes, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StaffsService staffsService = this.this$0;
                Flow<TheseusCommentService.e> flow = staffsService.f101835d;
                C10601 c10601 = new C10601(staffsService, this.$screenSizes, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c10601, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final StaffsService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C6369f, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final StaffsService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StaffsService staffsService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = staffsService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C6369f c6369f, Continuation<? super Unit> continuation) {
                return create(c6369f, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C6369f c6369f = (C6369f) this.L$0;
                StaffsService staffsService = this.this$0;
                UIComponent<?> uIComponent = staffsService.f101854x;
                int i7 = 0;
                if (c6369f == null) {
                    ((IntroRecycleViewService) staffsService.f101843m.get()).e(new RunningUIComponent(this.this$0.f101853w, 0, (Function1) null, 6), uIComponent);
                    StaffsService staffsService2 = this.this$0;
                    staffsService2.f101854x = staffsService2.f101853w;
                } else {
                    List<Staff> list = c6369f.f101867b;
                    List<Staff> list2 = staffsService.f101855y;
                    int size = list.size();
                    ArrayList arrayList = (ArrayList) list2;
                    if (size != arrayList.size()) {
                        ((IntroRecycleViewService) this.this$0.f101843m.get()).e(this.this$0.e(), uIComponent);
                        break;
                    }
                    for (Object obj2 : list) {
                        if (i7 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Staff staff = (Staff) obj2;
                        Staff staff2 = (Staff) CollectionsKt.getOrNull(arrayList, i7);
                        if (staff2 != null) {
                            if (staff2.f101786a == staff.f101786a && Intrinsics.areEqual(staff2.f101788c, staff.f101788c)) {
                                i7++;
                            }
                        }
                        ((IntroRecycleViewService) this.this$0.f101843m.get()).e(this.this$0.e(), uIComponent);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StaffsService staffsService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = staffsService;
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
                this.label = 1;
                if (YieldKt.yield(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            StaffsService staffsService = this.this$0;
            StateFlow<C6369f> stateFlow = staffsService.f101841k.f101764b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(staffsService, null);
            this.label = 2;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final StaffsService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(StaffsService staffsService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = staffsService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
                StaffsService staffsService = this.this$0;
                staffsService.f101856z = null;
                staffsService.f101826A = null;
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$a.class */
    public static final class a {
        public static final void a(RoundBorderImageView roundBorderImageView, Context context, int i7) {
            roundBorderImageView.setVisibility(0);
            Drawable drawable = AppCompatResources.getDrawable(context, i7);
            if (drawable != null) {
                roundBorderImageView.getImageView().getGenericProperties().setImage(drawable);
            }
            int color = 0;
            if (Cj0.a.a(context)) {
                color = ContextCompat.getColor(context, R$color.f64616Wh0);
            }
            roundBorderImageView.getImageView().getGenericProperties().setRoundingParams(RoundingParams.Companion.asCircle().setBorder(color, sh1.c.a(1.5f)));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StaffsService f101857a;

        public b(StaffsService staffsService) {
            this.f101857a = staffsService;
        }

        public final void a(Staff staff, StaffsNewComponent.StaffArea staffArea) {
            StaffsService staffsService = this.f101857a;
            staffsService.f(staff, staffArea);
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("area", staffArea == StaffsNewComponent.StaffArea.HEAD ? "1" : "2");
            mapCreateMapBuilder.put("page_area", "2");
            Unit unit = Unit.INSTANCE;
            PageReportService.g(staffsService.f101844n, "united.player-video-detail.up-joint-submission.head.click", MapsKt.build(mapCreateMapBuilder), 4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [com.bilibili.app.gemini.ui.UIComponent<?>, com.bilibili.ship.theseus.united.page.intro.module.staffs.E, java.lang.Object] */
    @Inject
    public StaffsService(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull BusinessType businessType, @NotNull Flow<TheseusCommentService.e> flow, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull C7893a c7893a, @NotNull C8043a c8043a2, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull D d7, @NotNull ActivityColorRepository activityColorRepository, @NotNull rW0.a<IntroRecycleViewService> aVar2, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull BackActionRepository backActionRepository, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull com.bilibili.ship.theseus.united.page.view.t tVar, @NotNull InterfaceC6364a interfaceC6364a, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar3, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar4) {
        this.f101832a = context;
        this.f101833b = coroutineScope;
        this.f101834c = businessType;
        this.f101835d = flow;
        this.f101836e = dVar;
        this.f101837f = c8043a;
        this.f101838g = aVar;
        this.h = c7893a;
        this.f101839i = c8043a2;
        this.f101840j = theseusFloatLayerService;
        this.f101841k = d7;
        this.f101842l = activityColorRepository;
        this.f101843m = aVar2;
        this.f101844n = pageReportService;
        this.f101845o = gVar;
        this.f101846p = backActionRepository;
        this.f101847q = cVar;
        this.f101848r = tVar;
        this.f101849s = interfaceC6364a;
        this.f101850t = aVar3;
        this.f101851u = introContentSizeRepository;
        this.f101852v = aVar4;
        ?? obj = new Object();
        this.f101853w = obj;
        this.f101854x = obj;
        this.f101855y = new ArrayList();
        this.f101827B = new ArrayList<>();
        this.f101828C = new ArrayList<>();
        this.f101829D = new ArrayList<>();
        Point displayRealSize = WindowManagerHelper.getDisplayRealSize(context);
        int i7 = displayRealSize.x;
        int i8 = displayRealSize.y;
        this.f101830E = i7 > i8 ? i8 : i7;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, displayRealSize, null), 3, (Object) null);
        this.f101831F = LazyKt.lazy(new com.bilibili.app.comment3.push.b(this, 2));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    public static final void a(Staff staff, StaffsService staffsService, Ref.ObjectRef objectRef, long j7, Boolean bool) {
        if (bool == null) {
            return;
        }
        if (staff.f101786a == j7) {
            boolean zBooleanValue = bool.booleanValue();
            if (zBooleanValue != staff.f101787b) {
                staff.f101787b = zBooleanValue ? 1 : 0;
            }
            staffsService.f101836e.i(bool.booleanValue());
            InterfaceC6365b interfaceC6365b = (InterfaceC6365b) objectRef.element;
            if (interfaceC6365b != null) {
                interfaceC6365b.a();
            }
        }
        com.bilibili.community.follow.f fVar = com.bilibili.community.follow.f.a;
        com.bilibili.community.follow.f.c.a(com.bilibili.community.follow.f.f(j7), bool);
    }

    public static final void b(StaffsService staffsService, long j7, long j8, boolean z6) {
        t tVar;
        if (CoroutineScopeKt.isActive(staffsService.f101833b)) {
            if (!((ArrayList) staffsService.f101855y).isEmpty()) {
                Iterator it = ((ArrayList) staffsService.f101855y).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Staff staff = (Staff) it.next();
                    if (j8 == staff.f101786a) {
                        if (z6 != staff.f101787b) {
                            staff.f101787b = z6 ? 1 : 0;
                        }
                    }
                }
            }
            t tVar2 = staffsService.f101856z;
            if (tVar2 != null) {
                tVar2.a();
            }
            Iterator it2 = ((ArrayList) staffsService.f101855y).iterator();
            int i7 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i7 = -1;
                    break;
                } else if (((Staff) it2.next()).f101786a == j8) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 != -1 && z6 && (tVar = staffsService.f101856z) != null) {
                tVar.b(i7, j8);
            }
            if (j7 == j8) {
                staffsService.f101836e.i(z6);
            }
            com.bilibili.community.follow.f fVar = com.bilibili.community.follow.f.a;
            com.bilibili.community.follow.f.g(j8, z6);
        }
    }

    public final HashMap<String, String> c(Staff staff) {
        boolean z6 = true;
        if (staff.f101787b != 1) {
            z6 = false;
        }
        String strC = UR0.D.c(z6, false);
        HashMap<String, String> map = new HashMap<>();
        map.putAll(this.f101844n.a(null));
        map.put("spmid", "united.player-video-detail.joint-submission.0");
        map.put(EditCustomizeSticker.TAG_MID, String.valueOf(staff.f101786a));
        map.put(NotificationCompat.CATEGORY_STATUS, strC);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap<java.lang.String, java.lang.String> d() {
        /*
            r4 = this;
            r0 = r4
            lv0.a r0 = r0.h
            lv0.a$a r0 = r0.c()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L1d
            r0 = r6
            lv0.a$a$a r0 = r0.f123395a
            long r0 = r0.f123398b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L25
        L1d:
            r0 = r4
            com.bilibili.ship.theseus.united.page.view.a r0 = r0.f101838g
            java.lang.String r0 = r0.d()
            r6 = r0
        L25:
            r0 = r4
            com.bilibili.ship.theseus.united.di.BusinessType r0 = r0.f101834c
            com.bilibili.ship.theseus.united.di.BusinessType r1 = com.bilibili.ship.theseus.united.di.BusinessType.OGV
            if (r0 != r1) goto L34
            r0 = 1
            r5 = r0
            goto L36
        L34:
            r0 = 0
            r5 = r0
        L36:
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r5
            if (r0 == 0) goto L4a
            java.lang.String r0 = "ep"
            r7 = r0
            goto L4e
        L4a:
            java.lang.String r0 = "video"
            r7 = r0
        L4e:
            r0 = r8
            java.lang.String r1 = "entity"
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r8
            java.lang.String r1 = "entity_id"
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService.d():java.util.HashMap");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.app.gemini.ui.RunningUIComponent e() {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsService.e():com.bilibili.app.gemini.ui.RunningUIComponent");
    }

    public final void f(Staff staff, StaffsNewComponent.StaffArea staffArea) {
        this.f101849s.a(staff.f101786a, staff.f101789d, staffArea);
    }
}
