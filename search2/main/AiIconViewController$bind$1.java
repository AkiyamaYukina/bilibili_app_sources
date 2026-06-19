package com.bilibili.search2.main;

import Bl.x1;
import com.bapis.bilibili.app.search.v2.GetChatAuthReply;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatAuthItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/AiIconViewController$bind$1.class */
final class AiIconViewController$bind$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final x1 $searchBinding;
    final C6042i $searchFragmentManager;
    int label;
    final C6035b this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.main.AiIconViewController$bind$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/AiIconViewController$bind$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        final GetChatAuthReply $result;
        final x1 $searchBinding;
        final C6042i $searchFragmentManager;
        int label;
        final C6035b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GetChatAuthReply getChatAuthReply, C6035b c6035b, x1 x1Var, C6042i c6042i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$result = getChatAuthReply;
            this.this$0 = c6035b;
            this.$searchBinding = x1Var;
            this.$searchFragmentManager = c6042i;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$result, this.this$0, this.$searchBinding, this.$searchFragmentManager, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Unit unitGone;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GetChatAuthReply getChatAuthReply = this.$result;
            if (getChatAuthReply != null) {
                final C6035b c6035b = this.this$0;
                final x1 x1Var = this.$searchBinding;
                final C6042i c6042i = this.$searchFragmentManager;
                final SearchChatAuthItem searchChatAuthItem = new SearchChatAuthItem(getChatAuthReply);
                c6035b.f86747c = searchChatAuthItem;
                if (searchChatAuthItem.getDisplay()) {
                    ListExtentionsKt.visible(x1Var.e);
                    ListExtentionsKt.visible(x1Var.d);
                    C6035b.a(x1Var.a.getContext());
                    boolean z6 = c6035b.f86749e;
                    BiliImageView biliImageView = x1Var.e;
                    com.bilibili.search2.utils.extension.c.a(biliImageView, z6 ? searchChatAuthItem.getIcon() : searchChatAuthItem.getIconNight(), null, false, null, null, 0, 0, 254);
                    biliImageView.setOnClickListener(new com.bilibili.bililive.room.ui.official.views.widgets.e(new Function1(c6035b, searchChatAuthItem, c6042i, x1Var) { // from class: com.bilibili.search2.main.a

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final C6035b f86741a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final SearchChatAuthItem f86742b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final C6042i f86743c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final x1 f86744d;

                        {
                            this.f86741a = c6035b;
                            this.f86742b = searchChatAuthItem;
                            this.f86743c = c6042i;
                            this.f86744d = x1Var;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
                        /* JADX WARN: Removed duplicated region for block: B:76:0x01c1  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r9) throws java.lang.Exception {
                            /*
                                Method dump skipped, instruction units count: 584
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.main.C6034a.invoke(java.lang.Object):java.lang.Object");
                        }
                    }, 2));
                    int px = ListExtentionsKt.toPx(10);
                    com.bilibili.search2.utils.B.j(biliImageView, px, px, px, px);
                    unitGone = Unit.INSTANCE;
                } else {
                    ListExtentionsKt.gone(x1Var.e);
                    unitGone = ListExtentionsKt.gone(x1Var.d);
                }
            } else {
                unitGone = null;
            }
            return unitGone;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiIconViewController$bind$1(C6035b c6035b, x1 x1Var, C6042i c6042i, Continuation<? super AiIconViewController$bind$1> continuation) {
        super(2, continuation);
        this.this$0 = c6035b;
        this.$searchBinding = x1Var;
        this.$searchFragmentManager = c6042i;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiIconViewController$bind$1(this.this$0, this.$searchBinding, this.$searchFragmentManager, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AiIconViewController$bind$1$result$1 aiIconViewController$bind$1$result$1 = new AiIconViewController$bind$1$result$1(null);
            this.label = 1;
            Object objWithContext = BuildersKt.withContext(io2, aiIconViewController$bind$1$result$1, this);
            obj = objWithContext;
            if (objWithContext == coroutine_suspended) {
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
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((GetChatAuthReply) obj, this.this$0, this.$searchBinding, this.$searchFragmentManager, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
