package com.bilibili.ship.theseus.united.page.toolbar;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.supermenu.share.v2.ShareLoadingDialog;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.screen.adjust.widget.G;
import com.bilibili.app.screen.adjust.widget.a;
import com.bilibili.ship.theseus.united.page.toolbar.MenuService$showNewMenu$2;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$showNewMenu$2.class */
final class MenuService$showNewMenu$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final MenuService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$showNewMenu$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$showNewMenu$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.BooleanRef $cancel;
        final MutableStateFlow<Boolean> $showingFlow;
        int label;
        final MenuService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$showNewMenu$2$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$showNewMenu$2$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final ShareLoadingDialog $loading;
            boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ShareLoadingDialog shareLoadingDialog, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$loading = shareLoadingDialog;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$loading, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0 && this.$loading.isAdded()) {
                    try {
                        this.$loading.dismissAllowingStateLoss();
                    } catch (Exception e7) {
                        com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-united-MenuService$showNewMenu$2$1$2-invokeSuspend] ", e7.getMessage(), "MenuService$showNewMenu$2$1$2-invokeSuspend", (Throwable) null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableStateFlow<Boolean> mutableStateFlow, MenuService menuService, Ref.BooleanRef booleanRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$showingFlow = mutableStateFlow;
            this.this$0 = menuService;
            this.$cancel = booleanRef;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(Ref.BooleanRef booleanRef, MenuService menuService, DialogInterface dialogInterface) {
            booleanRef.element = true;
            menuService.e();
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$showingFlow, this.this$0, this.$cancel, continuation);
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
                if (DelayKt.delay(500L, this) == coroutine_suspended) {
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
            if (((Boolean) this.$showingFlow.getValue()).booleanValue()) {
                BLog.i("MenuService$showNewMenu$2$1-invokeSuspend", "[theseus-united-MenuService$showNewMenu$2$1-invokeSuspend] showNewMenu, dialog is showing");
                return Unit.INSTANCE;
            }
            ShareLoadingDialog shareLoadingDialog = new ShareLoadingDialog();
            shareLoadingDialog.show(this.this$0.f103245c, "showNewMenuLoading");
            final Ref.BooleanRef booleanRef = this.$cancel;
            final MenuService menuService = this.this$0;
            DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener(booleanRef, menuService) { // from class: com.bilibili.ship.theseus.united.page.toolbar.D

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Ref.BooleanRef f103225a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MenuService f103226b;

                {
                    this.f103225a = booleanRef;
                    this.f103226b = menuService;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    MenuService$showNewMenu$2.AnonymousClass1.invokeSuspend$lambda$0(this.f103225a, this.f103226b, dialogInterface);
                }
            };
            Dialog dialog = shareLoadingDialog.getDialog();
            if (dialog != null) {
                dialog.setOnCancelListener(onCancelListener);
            }
            MutableStateFlow<Boolean> mutableStateFlow = this.$showingFlow;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(shareLoadingDialog, null);
            this.label = 2;
            if (FlowKt.collectLatest(mutableStateFlow, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$showNewMenu$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$showNewMenu$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableStateFlow<Boolean> $dismissFlow;
        final List<RunningUIComponent> $list;
        private Object L$0;
        int label;
        final MenuService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MenuService menuService, List<RunningUIComponent> list, MutableStateFlow<Boolean> mutableStateFlow, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = menuService;
            this.$list = list;
            this.$dismissFlow = mutableStateFlow;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$list, this.$dismissFlow, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FragmentActivity fragmentActivity = this.this$0.f103244b;
                com.bilibili.app.screen.adjust.widget.q qVar = new com.bilibili.app.screen.adjust.widget.q(fragmentActivity, com.bilibili.playerbizcommonv2.widget.setting.channel.m.a(fragmentActivity, coroutineScope, this.$list), G.b.a, (String) null, 0.0f, false, false, 0, a.b.a, this.$dismissFlow, 0, 13304);
                this.label = 1;
                if (com.bilibili.app.screen.adjust.widget.t.b(qVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$showNewMenu$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$showNewMenu$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableStateFlow<Boolean> $dismissFlow;
        int label;
        final MenuService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$showNewMenu$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$showNewMenu$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final MenuService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MenuService menuService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = menuService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0) {
                    this.this$0.e();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(MutableStateFlow<Boolean> mutableStateFlow, MenuService menuService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$dismissFlow = mutableStateFlow;
            this.this$0 = menuService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$dismissFlow, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<Boolean> mutableStateFlow = this.$dismissFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public MenuService$showNewMenu$2(MenuService menuService, Continuation<? super MenuService$showNewMenu$2> continuation) {
        super(2, continuation);
        this.this$0 = menuService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MenuService$showNewMenu$2 menuService$showNewMenu$2 = new MenuService$showNewMenu$2(this.this$0, continuation);
        menuService$showNewMenu$2.L$0 = obj;
        return menuService$showNewMenu$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.toolbar.MenuService$showNewMenu$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
