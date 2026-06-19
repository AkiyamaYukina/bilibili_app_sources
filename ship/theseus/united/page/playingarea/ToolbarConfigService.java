package com.bilibili.ship.theseus.united.page.playingarea;

import android.content.Context;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.widget.LockableCollapsingToolbarLayout;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/ToolbarConfigService.class */
@StabilityInferred(parameters = 0)
public final class ToolbarConfigService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f102345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BaseAppCompatActivity f102346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f102347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Flow<a> f102348e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.ToolbarConfigService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/ToolbarConfigService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ToolbarConfigService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.ToolbarConfigService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/ToolbarConfigService$1$1.class */
        public static final class C11001 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ToolbarConfigService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.ToolbarConfigService$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/ToolbarConfigService$1$1$1.class */
            public static final class C11011 extends SuspendLambda implements Function2<ActivityColorRepository.a, Continuation<? super Unit>, Object> {
                final LockableCollapsingToolbarLayout $collapsingToolbar;
                Object L$0;
                int label;
                final ToolbarConfigService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11011(LockableCollapsingToolbarLayout lockableCollapsingToolbarLayout, ToolbarConfigService toolbarConfigService, Continuation<? super C11011> continuation) {
                    super(2, continuation);
                    this.$collapsingToolbar = lockableCollapsingToolbarLayout;
                    this.this$0 = toolbarConfigService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C11011 c11011 = new C11011(this.$collapsingToolbar, this.this$0, continuation);
                    c11011.L$0 = obj;
                    return c11011;
                }

                public final Object invoke(ActivityColorRepository.a aVar, Continuation<? super Unit> continuation) {
                    return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ActivityColorRepository.a aVar = (ActivityColorRepository.a) this.L$0;
                    Integer numBoxInt = aVar != null ? Boxing.boxInt(aVar.f99194a) : null;
                    if (numBoxInt != null) {
                        this.$collapsingToolbar.setStatusBarScrimColor(numBoxInt.intValue());
                        this.$collapsingToolbar.setContentScrimColor(numBoxInt.intValue());
                    } else {
                        ToolbarConfigService toolbarConfigService = this.this$0;
                        LockableCollapsingToolbarLayout lockableCollapsingToolbarLayout = this.$collapsingToolbar;
                        toolbarConfigService.getClass();
                        Garb curGarb = GarbManager.getCurGarb();
                        if (curGarb.isPure() || curGarb.isPrimaryOnly()) {
                            int colorById = ThemeUtils.getColorById(toolbarConfigService.f102345b, 2131103271);
                            lockableCollapsingToolbarLayout.setStatusBarScrimColor(colorById);
                            lockableCollapsingToolbarLayout.setContentScrimColor(colorById);
                        } else {
                            lockableCollapsingToolbarLayout.setStatusBarScrimColor(curGarb.getSecondaryPageColor());
                            lockableCollapsingToolbarLayout.setContentScrimColor(curGarb.getSecondaryPageColor());
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11001(ToolbarConfigService toolbarConfigService, Continuation<? super C11001> continuation) {
                super(2, continuation);
                this.this$0 = toolbarConfigService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11001 c11001 = new C11001(this.this$0, continuation);
                c11001.L$0 = obj;
                return c11001;
            }

            public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = (a) this.L$0;
                    if (aVar == null) {
                        return Unit.INSTANCE;
                    }
                    ToolbarConfigService toolbarConfigService = this.this$0;
                    toolbarConfigService.getClass();
                    TintToolbar tintToolbar = aVar.f102350b;
                    tintToolbar.setContentInsetsAbsolute(0, 0);
                    BaseAppCompatActivity baseAppCompatActivity = toolbarConfigService.f102346c;
                    baseAppCompatActivity.setSupportActionBar(tintToolbar);
                    ActionBar supportActionBar = baseAppCompatActivity.getSupportActionBar();
                    if (supportActionBar != null) {
                        supportActionBar.setDisplayHomeAsUpEnabled(false);
                    }
                    tintToolbar.setNavigationContentDescription("");
                    LockableCollapsingToolbarLayout lockableCollapsingToolbarLayout = aVar.f102349a;
                    if (lockableCollapsingToolbarLayout == null) {
                        return Unit.INSTANCE;
                    }
                    ToolbarConfigService toolbarConfigService2 = this.this$0;
                    MutableStateFlow mutableStateFlow = toolbarConfigService2.f102347d.f99184e;
                    C11011 c11011 = new C11011(lockableCollapsingToolbarLayout, toolbarConfigService2, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(mutableStateFlow, c11011, this) == coroutine_suspended) {
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
        public AnonymousClass1(ToolbarConfigService toolbarConfigService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = toolbarConfigService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarConfigService toolbarConfigService = this.this$0;
                Flow<a> flow = toolbarConfigService.f102348e;
                C11001 c11001 = new C11001(toolbarConfigService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c11001, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/ToolbarConfigService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final LockableCollapsingToolbarLayout f102349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TintToolbar f102350b;

        public a(@Nullable LockableCollapsingToolbarLayout lockableCollapsingToolbarLayout, @NotNull TintToolbar tintToolbar) {
            this.f102349a = lockableCollapsingToolbarLayout;
            this.f102350b = tintToolbar;
        }
    }

    @Inject
    public ToolbarConfigService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull BaseAppCompatActivity baseAppCompatActivity, @NotNull ActivityColorRepository activityColorRepository, @NotNull Flow<a> flow) {
        this.f102344a = coroutineScope;
        this.f102345b = context;
        this.f102346c = baseAppCompatActivity;
        this.f102347d = activityColorRepository;
        this.f102348e = flow;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
