package com.bilibili.playerbizcommonv2.widget.base;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bililive.room.ui.roomv3.player.controller.widget.i1;
import com.bilibili.playerbizcommonv2.utils.o;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.PlayerProgressObserver;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.z;
import tv.danmaku.biliplayerv2.utils.TimeFormater;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerProgressTextWidget.class */
@StabilityInferred(parameters = 0)
public final class PlayerProgressTextWidget extends AppCompatTextView implements IControlWidget, PlayerProgressObserver, ControlContainerVisibleObserver {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f82368j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public CharSequence f82369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f82370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Inject
    public IPlayerCoreService f82371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Inject
    public IControlContainerService f82372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Inject
    public z f82373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Inject
    public IToastService f82374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Inject
    public IReporterService f82375g;

    @Inject
    public Er0.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f82376i;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.base.PlayerProgressTextWidget$bindToView$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerProgressTextWidget$bindToView$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        private Object L$0;
        int label;
        final PlayerProgressTextWidget this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.base.PlayerProgressTextWidget$bindToView$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerProgressTextWidget$bindToView$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlayerProgressTextWidget this$0;

            /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.base.PlayerProgressTextWidget$bindToView$2$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerProgressTextWidget$bindToView$2$1$a.class */
            public static final class a implements PlayerProgressObserver {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlayerProgressTextWidget f82377a;

                public a(PlayerProgressTextWidget playerProgressTextWidget) {
                    this.f82377a = playerProgressTextWidget;
                }

                public final void onPlayerProgressChange(int i7, int i8) {
                    int i9 = PlayerProgressTextWidget.f82368j;
                    this.f82377a.K(i7, i8);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayerProgressTextWidget playerProgressTextWidget, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playerProgressTextWidget;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                a aVar;
                a aVar2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                try {
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            throw new KotlinNothingValueException();
                        }
                        a aVar3 = (a) this.L$0;
                        aVar2 = aVar3;
                        try {
                            ResultKt.throwOnFailure(obj);
                            aVar = aVar3;
                            aVar2 = aVar;
                            throw new KotlinNothingValueException();
                        } catch (Throwable th) {
                            th = th;
                            this.this$0.getPlayerCoreService().unregisterPlayerProgressObserver(aVar2);
                            throw th;
                        }
                    }
                    ResultKt.throwOnFailure(obj);
                    o uiStyleDelegate = this.this$0.getUiStyleDelegate();
                    if (uiStyleDelegate == null || !uiStyleDelegate.b()) {
                        this.this$0.getSeekService().registerPlayerProgressObserver(this.this$0);
                        this.label = 2;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw new KotlinNothingValueException();
                    }
                    PlayerProgressTextWidget playerProgressTextWidget = this.this$0;
                    aVar = new a(playerProgressTextWidget);
                    playerProgressTextWidget.getPlayerCoreService().registerPlayerProgressObserver(aVar);
                    try {
                        this.L$0 = aVar;
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar2 = aVar;
                        throw new KotlinNothingValueException();
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar;
                        this.this$0.getPlayerCoreService().unregisterPlayerProgressObserver(aVar2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    this.this$0.getSeekService().unregisterPlayerProgressObserver(this.this$0);
                    throw th3;
                }
            }
        }

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.base.PlayerProgressTextWidget$bindToView$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerProgressTextWidget$bindToView$2$2.class */
        public static final class C05392 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final PlayerProgressTextWidget this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05392(PlayerProgressTextWidget playerProgressTextWidget, Continuation<? super C05392> continuation) {
                super(2, continuation);
                this.this$0 = playerProgressTextWidget;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05392(this.this$0, continuation);
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
                        this.this$0.getControlContainerService().registerControlContainerVisible(this.this$0);
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
                    this.this$0.getControlContainerService().unregisterControlContainerVisible(this.this$0);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlayerProgressTextWidget playerProgressTextWidget, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playerProgressTextWidget;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
            return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C05392(this.this$0, null), 3, (Object) null);
        }
    }

    public PlayerProgressTextWidget(@NotNull Context context) {
        super(context);
        this.f82370b = true;
        this.f82376i = true;
        K(0L, 0L);
        setOnLongClickListener(new i1(this, 1));
    }

    public PlayerProgressTextWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82370b = true;
        this.f82376i = true;
        K(0L, 0L);
        setOnLongClickListener(new i1(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o getUiStyleDelegate() {
        return (o) getDelegateStoreService().get(o.a.f81942a);
    }

    public final void K(long j7, long j8) {
        TimeFormater timeFormater = TimeFormater.INSTANCE;
        String time = timeFormater.formatTime(j7, false, false);
        if (TextUtils.isEmpty(time)) {
            time = "00:00";
        }
        String time2 = timeFormater.formatTime(j8, false, false);
        setText(time + "/" + (TextUtils.isEmpty(time2) ? "00:00" : time2));
    }

    @Nullable
    public final Object bindToView(@NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(this, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @NotNull
    public final IControlContainerService getControlContainerService() {
        IControlContainerService iControlContainerService = this.f82372d;
        if (iControlContainerService != null) {
            return iControlContainerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
        return null;
    }

    @NotNull
    public final Er0.a getDelegateStoreService() {
        Er0.a aVar = this.h;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
        return null;
    }

    public boolean getMembersInjector() {
        return this.f82376i;
    }

    @NotNull
    public final IPlayerCoreService getPlayerCoreService() {
        IPlayerCoreService iPlayerCoreService = this.f82371c;
        if (iPlayerCoreService != null) {
            return iPlayerCoreService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
        return null;
    }

    @NotNull
    public final IReporterService getReporterService() {
        IReporterService iReporterService = this.f82375g;
        if (iReporterService != null) {
            return iReporterService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reporterService");
        return null;
    }

    @NotNull
    public final z getSeekService() {
        z zVar = this.f82373e;
        if (zVar != null) {
            return zVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("seekService");
        return null;
    }

    @NotNull
    public final IToastService getToastService() {
        IToastService iToastService = this.f82374f;
        if (iToastService != null) {
            return iToastService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("toastService");
        return null;
    }

    public final void onControlContainerVisibleChanged(boolean z6) {
        if (z6) {
            K(getPlayerCoreService().getCurrentPosition(), getPlayerCoreService().getDuration());
        }
    }

    public final void onPlayerProgressChange(int i7, int i8) {
        K(i7, i8);
    }

    @Override // android.view.View
    public final void requestLayout() {
        if (this.f82370b) {
            this.f82370b = false;
            super.requestLayout();
        }
    }

    public final void setControlContainerService(@NotNull IControlContainerService iControlContainerService) {
        this.f82372d = iControlContainerService;
    }

    public final void setDelegateStoreService(@NotNull Er0.a aVar) {
        this.h = aVar;
    }

    public final void setPlayerCoreService(@NotNull IPlayerCoreService iPlayerCoreService) {
        this.f82371c = iPlayerCoreService;
    }

    public final void setReporterService(@NotNull IReporterService iReporterService) {
        this.f82375g = iReporterService;
    }

    public final void setSeekService(@NotNull z zVar) {
        this.f82373e = zVar;
    }

    @Override // android.widget.TextView
    public final void setText(@Nullable CharSequence charSequence, @NotNull TextView.BufferType bufferType) {
        CharSequence charSequence2 = this.f82369a;
        this.f82370b = charSequence2 == null || charSequence == null || charSequence2.length() != charSequence.length();
        this.f82369a = charSequence;
        TextPaint paint = getPaint();
        if (!this.f82370b && charSequence != null && paint != null) {
            this.f82370b = paint.measureText(charSequence, 0, charSequence.length()) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()));
        }
        super.setText(charSequence, bufferType);
    }

    public final void setToastService(@NotNull IToastService iToastService) {
        this.f82374f = iToastService;
    }
}
