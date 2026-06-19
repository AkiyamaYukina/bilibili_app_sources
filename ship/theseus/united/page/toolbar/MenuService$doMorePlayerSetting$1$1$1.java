package com.bilibili.ship.theseus.united.page.toolbar;

import androidx.fragment.app.Fragment;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$doMorePlayerSetting$1$1$1.class */
public final class MenuService$doMorePlayerSetting$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Fragment $fragment;
    int label;
    final MenuService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$doMorePlayerSetting$1$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$doMorePlayerSetting$1$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final Fragment $fragment;
        int label;
        final MenuService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MenuService menuService, Fragment fragment, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = menuService;
            this.$fragment = fragment;
        }

        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$fragment, continuation);
        }

        public final Object invoke(Continuation<? super Unit> continuation) {
            return create(continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusFloatLayerService theseusFloatLayerService = this.this$0.f103260s;
                com.bilibili.ship.theseus.united.page.floatlayer.centersheet.b bVar = new com.bilibili.ship.theseus.united.page.floatlayer.centersheet.b(this.this$0.f103245c, this.$fragment.getClass());
                this.label = 1;
                if (theseusFloatLayerService.f(bVar, null, this) == coroutine_suspended) {
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
    public MenuService$doMorePlayerSetting$1$1$1(MenuService menuService, Fragment fragment, Continuation<? super MenuService$doMorePlayerSetting$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = menuService;
        this.$fragment = fragment;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MenuService$doMorePlayerSetting$1$1$1(this.this$0, this.$fragment, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MenuService menuService = this.this$0;
            BackActionRepository backActionRepository = menuService.f103248f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(menuService, this.$fragment, null);
            this.label = 1;
            if (backActionRepository.a(anonymousClass1, this) == coroutine_suspended) {
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
