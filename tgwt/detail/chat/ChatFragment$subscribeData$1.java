package com.bilibili.tgwt.detail.chat;

import android.content.Context;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.tgwt.detail.chat.ChatFragment;
import com.bilibili.tgwt.detail.chat.n;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$subscribeData$1.class */
final class ChatFragment$subscribeData$1 extends SuspendLambda implements Function2<List<? extends ChatRoomMember>, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$subscribeData$1(ChatFragment chatFragment, Continuation<? super ChatFragment$subscribeData$1> continuation) {
        super(2, continuation);
        this.this$0 = chatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatFragment$subscribeData$1 chatFragment$subscribeData$1 = new ChatFragment$subscribeData$1(this.this$0, continuation);
        chatFragment$subscribeData$1.L$0 = obj;
        return chatFragment$subscribeData$1;
    }

    public final Object invoke(List<ChatRoomMember> list, Continuation<? super Unit> continuation) {
        return create(list, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ChatRoomInfo chatRoomInfo;
        Boolean boolBoxBoolean;
        ChatRoomInfo chatRoomInfo2;
        ChatRoomInfo chatRoomInfo3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<ChatRoomMember> list = (List) this.L$0;
        this.this$0.f111032v = list;
        ArrayList arrayList = new ArrayList();
        List<ChatRoomMember> list2 = list;
        ChatFragment chatFragment = this.this$0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean z6 = true;
            if (!it.hasNext()) {
                break;
            }
            ChatRoomMember chatRoomMember = (ChatRoomMember) it.next();
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatFragment.f111019i;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            BangumiUniformSeason season = togetherWatchDetailPageViewModel2.getSeasonService().getSeason();
            if (season == null || (chatRoomInfo3 = season.E) == null || !chatRoomInfo3.G() || chatRoomMember.isAudienceMember()) {
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = chatFragment.f111019i;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
                if (togetherWatchDetailPageViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel4 = null;
                }
                BangumiUniformSeason season2 = togetherWatchDetailPageViewModel4.getSeasonService().getSeason();
                if (season2 == null || (chatRoomInfo2 = season2.E) == null || !chatRoomInfo2.G()) {
                    Context contextRequireContext = chatFragment.requireContext();
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = chatFragment.f111019i;
                    if (togetherWatchDetailPageViewModel5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        togetherWatchDetailPageViewModel5 = null;
                    }
                    com.bilibili.tgwt.chatroom.c cVarH = togetherWatchDetailPageViewModel5.getChatRoomManagerService().h();
                    boolBoxBoolean = Boxing.boxBoolean(arrayList.add(n.a.a(contextRequireContext, chatRoomMember, cVarH != null && chatRoomMember.getMid() == cVarH.f110974c)));
                } else {
                    boolBoxBoolean = Unit.INSTANCE;
                }
            } else {
                Context contextRequireContext2 = chatFragment.requireContext();
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = chatFragment.f111019i;
                if (togetherWatchDetailPageViewModel6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel6 = null;
                }
                com.bilibili.tgwt.chatroom.c cVarH2 = togetherWatchDetailPageViewModel6.getChatRoomManagerService().h();
                if (cVarH2 == null || chatRoomMember.getMid() != cVarH2.f110974c) {
                    z6 = false;
                }
                boolBoxBoolean = Boxing.boxBoolean(arrayList.add(n.a.a(contextRequireContext2, chatRoomMember, z6)));
            }
            arrayList2.add(boolBoxBoolean);
        }
        p pVar = this.this$0.f111021k;
        p pVar2 = pVar;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar2 = null;
        }
        pVar2.f111118d = arrayList.isEmpty() ? new ArrayList() : new ArrayList(arrayList);
        p pVar3 = this.this$0.f111021k;
        p pVar4 = pVar3;
        if (pVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar4 = null;
        }
        if (pVar4.f111118d.size() > 0) {
            p pVar5 = this.this$0.f111021k;
            p pVar6 = pVar5;
            if (pVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar6 = null;
            }
            ObservableField<n> observableField = pVar6.f111119e;
            p pVar7 = this.this$0.f111021k;
            p pVar8 = pVar7;
            if (pVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar8 = null;
            }
            observableField.set(pVar8.f111118d.get(0));
        }
        ChatFragment chatFragment2 = this.this$0;
        if (chatFragment2.f111013b != null) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel7 = chatFragment2.f111019i;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel8 = togetherWatchDetailPageViewModel7;
            if (togetherWatchDetailPageViewModel7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel8 = null;
            }
            togetherWatchDetailPageViewModel8.getSeasonService().getSeason();
        }
        ChatFragment chatFragment3 = this.this$0;
        ChatFragment.a aVar = chatFragment3.f111013b;
        if (aVar != null) {
            p pVar9 = chatFragment3.f111021k;
            p pVar10 = pVar9;
            if (pVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar10 = null;
            }
            aVar.submitList(pVar10.f111118d);
        }
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel9 = this.this$0.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel10 = togetherWatchDetailPageViewModel9;
        if (togetherWatchDetailPageViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel10 = null;
        }
        BangumiUniformSeason season3 = togetherWatchDetailPageViewModel10.getSeasonService().getSeason();
        if (season3 != null && (chatRoomInfo = season3.E) != null && !chatRoomInfo.G()) {
            p pVar11 = this.this$0.f111021k;
            p pVar12 = pVar11;
            if (pVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar12 = null;
            }
            ObservableInt observableInt = pVar12.f111127n;
            p pVar13 = this.this$0.f111021k;
            p pVar14 = pVar13;
            if (pVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar14 = null;
            }
            observableInt.set(pVar14.f111118d.size());
        }
        if (this.this$0.f111032v.size() == 1) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel11 = this.this$0.f111019i;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel12 = togetherWatchDetailPageViewModel11;
            if (togetherWatchDetailPageViewModel11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel12 = null;
            }
            com.bilibili.tgwt.chatroom.c cVarH3 = togetherWatchDetailPageViewModel12.getChatRoomManagerService().h();
            if (cVarH3 != null && this.this$0.f111032v.get(0).getMid() == cVarH3.f110974c && this.this$0.f111032v.get(0).getMid() == com.bilibili.ogv.infra.account.a.f67852b.mid()) {
                p pVar15 = this.this$0.f111021k;
                if (pVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar15 = null;
                }
                pVar15.f111134u.set(this.this$0.f111032v.get(0).getFace());
                ChatFragment chatFragment4 = this.this$0;
                chatFragment4.nf(chatFragment4.f111023m | 16);
            } else {
                ChatFragment chatFragment5 = this.this$0;
                chatFragment5.nf(chatFragment5.f111023m & (-17));
            }
        } else {
            p pVar16 = this.this$0.f111021k;
            p pVar17 = pVar16;
            if (pVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar17 = null;
            }
            pVar17.f111133t.get();
            ChatFragment chatFragment6 = this.this$0;
            Iterator<T> it2 = chatFragment6.f111032v.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ChatRoomMember chatRoomMember2 = (ChatRoomMember) it2.next();
                if (chatRoomMember2.getMid() != com.bilibili.ogv.infra.account.a.f67852b.mid()) {
                    p pVar18 = chatFragment6.f111021k;
                    if (pVar18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                        pVar18 = null;
                    }
                    pVar18.f111135v.set(chatRoomMember2);
                }
            }
            ChatFragment chatFragment7 = this.this$0;
            chatFragment7.nf(chatFragment7.f111023m & (-17));
        }
        return Unit.INSTANCE;
    }
}
