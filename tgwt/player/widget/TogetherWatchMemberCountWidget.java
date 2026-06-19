package com.bilibili.tgwt.player.widget;

import G.p;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.playerbizcommon.features.delegate.DelegateStoreService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchMemberCountWidget.class */
@StabilityInferred(parameters = 0)
public final class TogetherWatchMemberCountWidget extends LinearLayout implements IControlWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InjectPlayerService
    private DelegateStoreService f111767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f111768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ChatRoomManagerService f111769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NewSeasonService f111770d;

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.TogetherWatchMemberCountWidget$bindToView$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchMemberCountWidget$bindToView$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final TogetherWatchMemberCountWidget this$0;

        /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.TogetherWatchMemberCountWidget$bindToView$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchMemberCountWidget$bindToView$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.tgwt.chatroom.c, Continuation<? super Unit>, Object> {
            int label;
            final TogetherWatchMemberCountWidget this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TogetherWatchMemberCountWidget togetherWatchMemberCountWidget, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = togetherWatchMemberCountWidget;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(com.bilibili.tgwt.chatroom.c cVar, Continuation<? super Unit> continuation) {
                return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                TogetherWatchMemberCountWidget.b(this.this$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.TogetherWatchMemberCountWidget$bindToView$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchMemberCountWidget$bindToView$2$2.class */
        public static final class C12192 extends SuspendLambda implements Function2<List<? extends ChatRoomMember>, Continuation<? super Unit>, Object> {
            int label;
            final TogetherWatchMemberCountWidget this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12192(TogetherWatchMemberCountWidget togetherWatchMemberCountWidget, Continuation<? super C12192> continuation) {
                super(2, continuation);
                this.this$0 = togetherWatchMemberCountWidget;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C12192(this.this$0, continuation);
            }

            public final Object invoke(List<ChatRoomMember> list, Continuation<? super Unit> continuation) {
                return create(list, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                TogetherWatchMemberCountWidget.b(this.this$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TogetherWatchMemberCountWidget togetherWatchMemberCountWidget, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = togetherWatchMemberCountWidget;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            TogetherWatchMemberCountWidget togetherWatchMemberCountWidget = this.this$0;
            DelegateStoreService delegateStoreService = togetherWatchMemberCountWidget.f111767a;
            DelegateStoreService delegateStoreService2 = delegateStoreService;
            if (delegateStoreService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
                delegateStoreService2 = null;
            }
            togetherWatchMemberCountWidget.f111769c = (ChatRoomManagerService) dm.d.b(delegateStoreService2, ChatRoomManagerService.class);
            TogetherWatchMemberCountWidget togetherWatchMemberCountWidget2 = this.this$0;
            DelegateStoreService delegateStoreService3 = togetherWatchMemberCountWidget2.f111767a;
            DelegateStoreService delegateStoreService4 = delegateStoreService3;
            if (delegateStoreService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
                delegateStoreService4 = null;
            }
            togetherWatchMemberCountWidget2.f111770d = (NewSeasonService) dm.d.b(delegateStoreService4, NewSeasonService.class);
            ChatRoomManagerService chatRoomManagerService = this.this$0.f111769c;
            ChatRoomManagerService chatRoomManagerService2 = chatRoomManagerService;
            if (chatRoomManagerService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatRoomManagerService");
                chatRoomManagerService2 = null;
            }
            FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(chatRoomManagerService2.f110924q), new AnonymousClass1(this.this$0, null)), coroutineScope);
            ChatRoomManagerService chatRoomManagerService3 = this.this$0.f111769c;
            ChatRoomManagerService chatRoomManagerService4 = chatRoomManagerService3;
            if (chatRoomManagerService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatRoomManagerService");
                chatRoomManagerService4 = null;
            }
            FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(chatRoomManagerService4.f110925r), new C12192(this.this$0, null)), coroutineScope);
            return Unit.INSTANCE;
        }
    }

    @JvmOverloads
    public TogetherWatchMemberCountWidget(@NotNull Context context) {
        this(context, null);
    }

    @JvmOverloads
    public TogetherWatchMemberCountWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        LayoutInflater.from(context).inflate(2131500531, (ViewGroup) this, true);
        this.f111768b = (TextView) findViewById(2131307356);
    }

    public static final void b(TogetherWatchMemberCountWidget togetherWatchMemberCountWidget) {
        String string;
        ChatRoomInfo chatRoomInfo;
        ChatRoomInfo chatRoomInfo2;
        ChatRoomManagerService chatRoomManagerService = togetherWatchMemberCountWidget.f111769c;
        ChatRoomManagerService chatRoomManagerService2 = chatRoomManagerService;
        if (chatRoomManagerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatRoomManagerService");
            chatRoomManagerService2 = null;
        }
        com.bilibili.tgwt.chatroom.c cVarH = chatRoomManagerService2.h();
        int size = 0;
        int i7 = cVarH != null ? cVarH.f110977f : 0;
        ChatRoomManagerService chatRoomManagerService3 = togetherWatchMemberCountWidget.f111769c;
        ChatRoomManagerService chatRoomManagerService4 = chatRoomManagerService3;
        if (chatRoomManagerService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatRoomManagerService");
            chatRoomManagerService4 = null;
        }
        List<ChatRoomMember> listJ = chatRoomManagerService4.j();
        if (listJ != null) {
            size = listJ.size();
        }
        ChatRoomManagerService chatRoomManagerService5 = togetherWatchMemberCountWidget.f111769c;
        ChatRoomManagerService chatRoomManagerService6 = chatRoomManagerService5;
        if (chatRoomManagerService5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatRoomManagerService");
            chatRoomManagerService6 = null;
        }
        com.bilibili.tgwt.chatroom.c cVarH2 = chatRoomManagerService6.h();
        String str = cVarH2 != null ? cVarH2.f110979i : null;
        ChatRoomManagerService chatRoomManagerService7 = togetherWatchMemberCountWidget.f111769c;
        ChatRoomManagerService chatRoomManagerService8 = chatRoomManagerService7;
        if (chatRoomManagerService7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatRoomManagerService");
            chatRoomManagerService8 = null;
        }
        com.bilibili.tgwt.chatroom.c cVarH3 = chatRoomManagerService8.h();
        String str2 = cVarH3 != null ? cVarH3.f110980j : null;
        TextView textView = togetherWatchMemberCountWidget.f111768b;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMemberCountTV");
            textView2 = null;
        }
        NewSeasonService newSeasonService = togetherWatchMemberCountWidget.f111770d;
        NewSeasonService newSeasonService2 = newSeasonService;
        if (newSeasonService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seasonService");
            newSeasonService2 = null;
        }
        BangumiUniformSeason season = newSeasonService2.getSeason();
        if (season == null || (chatRoomInfo2 = season.E) == null || chatRoomInfo2.u() != 1) {
            NewSeasonService newSeasonService3 = togetherWatchMemberCountWidget.f111770d;
            if (newSeasonService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("seasonService");
                newSeasonService3 = null;
            }
            BangumiUniformSeason season2 = newSeasonService3.getSeason();
            string = (season2 == null || (chatRoomInfo = season2.E) == null || !chatRoomInfo.G()) ? togetherWatchMemberCountWidget.getContext().getString(2131836334, String.valueOf(size)) : p.a(str, str2);
        } else {
            string = togetherWatchMemberCountWidget.getContext().getString(2131836249, Integer.valueOf(size), Integer.valueOf(i7));
        }
        textView2.setText(string);
    }

    @Nullable
    public final Object bindToView(@NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(this, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
