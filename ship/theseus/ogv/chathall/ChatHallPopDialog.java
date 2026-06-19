package com.bilibili.ship.theseus.ogv.chathall;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponentKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
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
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import zu0.C9233i;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallPopDialog.class */
@StabilityInferred(parameters = 0)
public final class ChatHallPopDialog extends Wj0.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Context f91699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final TheseusWebUIComponent f91700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final C9233i f91701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final ViewGroup f91702n;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallPopDialog$onStart$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallPopDialog$onStart$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChatHallPopDialog this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallPopDialog$onStart$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallPopDialog$onStart$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<UIComponent.ViewEntry, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ChatHallPopDialog this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChatHallPopDialog chatHallPopDialog, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = chatHallPopDialog;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(UIComponent.ViewEntry viewEntry, Continuation<? super Unit> continuation) {
                return create(viewEntry, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f91702n.addView(((UIComponent.ViewEntry) this.L$0).getRoot());
                ViewGroup viewGroup = this.this$0.f91702n;
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = DimenUtilsKt.dpToPx(400);
                viewGroup.setLayoutParams(layoutParams);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChatHallPopDialog chatHallPopDialog, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = chatHallPopDialog;
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
                ChatHallPopDialog chatHallPopDialog = this.this$0;
                TheseusWebUIComponent theseusWebUIComponent = chatHallPopDialog.f91700l;
                Context context = chatHallPopDialog.f91699k;
                ViewGroup viewGroup = chatHallPopDialog.f91702n;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(chatHallPopDialog, null);
                this.label = 1;
                if (UIComponentKt.b(theseusWebUIComponent, context, viewGroup, anonymousClass1, this, 4) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallPopDialog$onStart$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallPopDialog$onStart$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChatHallPopDialog this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallPopDialog$onStart$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallPopDialog$onStart$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatHallPopDialog f91703a;

            public a(ChatHallPopDialog chatHallPopDialog) {
                this.f91703a = chatHallPopDialog;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f91703a.dismiss();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ChatHallPopDialog chatHallPopDialog, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = chatHallPopDialog;
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
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ChatHallPopDialog chatHallPopDialog = this.this$0;
                MutableSharedFlow mutableSharedFlow = chatHallPopDialog.f91700l.f104195o;
                a aVar = new a(chatHallPopDialog);
                this.label = 1;
                if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    public ChatHallPopDialog(@NotNull Context context, @NotNull TheseusWebUIComponent theseusWebUIComponent) {
        super(context);
        this.f91699k = context;
        this.f91700l = theseusWebUIComponent;
        C9233i c9233iInflate = C9233i.inflate(LayoutInflater.from(context), null, false);
        this.f91701m = c9233iInflate;
        this.f91702n = c9233iInflate.f130728b;
    }

    @NotNull
    public final View onCreateView() {
        return this.f91701m.f130727a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Wj0.a, Wj0.d
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setFlags(1024, 1024);
            window.setBackgroundDrawableResource(R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = 1.0f;
            attributes.dimAmount = 0.5f;
            attributes.width = -1;
            attributes.height = DimenUtilsKt.dpToPx(400);
            window.setAttributes(attributes);
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    public final void setUiBeforeShow() {
    }
}
