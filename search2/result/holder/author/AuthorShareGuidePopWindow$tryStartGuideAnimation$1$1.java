package com.bilibili.search2.result.holder.author;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bilibili.app.dialogmanager2.PageDialogManager;
import com.bilibili.search2.dialogmanager.SearchPageDialogs;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/AuthorShareGuidePopWindow$tryStartGuideAnimation$1$1.class */
final class AuthorShareGuidePopWindow$tryStartGuideAnimation$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final View $anchor;
    final Function0<Boolean> $canShow;
    final Fragment $hostFragment;
    final int $xOff;
    final int $yOff;
    int label;
    final n this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.result.holder.author.AuthorShareGuidePopWindow$tryStartGuideAnimation$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/AuthorShareGuidePopWindow$tryStartGuideAnimation$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final View $anchor;
        final Function0<Boolean> $canShow;
        final PageDialogManager $dialogManager;
        final int $xOff;
        final int $yOff;
        int label;
        final n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PageDialogManager pageDialogManager, n nVar, View view, int i7, int i8, Function0<Boolean> function0, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$dialogManager = pageDialogManager;
            this.this$0 = nVar;
            this.$anchor = view;
            this.$xOff = i7;
            this.$yOff = i8;
            this.$canShow = function0;
        }

        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$dialogManager, this.this$0, this.$anchor, this.$xOff, this.$yOff, this.$canShow, continuation);
        }

        public final Object invoke(Continuation<? super Unit> continuation) {
            return create(continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x01a9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 566
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.author.AuthorShareGuidePopWindow$tryStartGuideAnimation$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorShareGuidePopWindow$tryStartGuideAnimation$1$1(Fragment fragment, n nVar, View view, int i7, int i8, Function0<Boolean> function0, Continuation<? super AuthorShareGuidePopWindow$tryStartGuideAnimation$1$1> continuation) {
        super(2, continuation);
        this.$hostFragment = fragment;
        this.this$0 = nVar;
        this.$anchor = view;
        this.$xOff = i7;
        this.$yOff = i8;
        this.$canShow = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AuthorShareGuidePopWindow$tryStartGuideAnimation$1$1(this.$hostFragment, this.this$0, this.$anchor, this.$xOff, this.$yOff, this.$canShow, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PageDialogManager pageDialogManagerFind = PageDialogManager.Companion.find(this.$hostFragment);
            if (pageDialogManagerFind == null) {
                return Unit.INSTANCE;
            }
            SearchPageDialogs searchPageDialogs = SearchPageDialogs.AUTHOR_SHARE_BUBBLE;
            String key = searchPageDialogs.getKey();
            int priority = searchPageDialogs.getPriority();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pageDialogManagerFind, this.this$0, this.$anchor, this.$xOff, this.$yOff, this.$canShow, null);
            this.label = 1;
            if (PageDialogManager.showWithSuspendClose$default(pageDialogManagerFind, key, priority, false, anonymousClass1, this, 4, (Object) null) == coroutine_suspended) {
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
