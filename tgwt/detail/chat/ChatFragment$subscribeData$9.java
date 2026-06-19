package com.bilibili.tgwt.detail.chat;

import androidx.databinding.ObservableField;
import com.bilibili.bangumi.data.page.detail.entity.BangumiModule;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatConfigType;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfig;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfigValue;
import com.bilibili.bangumi.module.chatroom.ChatRoomFateLabel;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.bangumi.module.chatroom.ChatRoomMatchRes;
import com.bilibili.bangumi.module.chatroom.RoomPendant;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.tgwt.service.ChatService;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.bili.widget.PendantAvatarFrameLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$subscribeData$9.class */
final class ChatFragment$subscribeData$9 extends SuspendLambda implements Function2<BangumiUniformSeason, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ChatFragment this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$subscribeData$9$a.class */
    public static final class a implements ImageLoadingListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatFragment f111043a;

        public a(ChatFragment chatFragment) {
            this.f111043a = chatFragment;
        }

        public final void onImageLoadFailed(Throwable th) {
            p pVar = this.f111043a.f111021k;
            p pVar2 = pVar;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar2 = null;
            }
            pVar2.f111106R.set(false);
        }

        public final void onImageSet(ImageInfo imageInfo) {
            ChatRoomInfo chatRoomInfo;
            super.onImageSet(imageInfo);
            ChatFragment chatFragment = this.f111043a;
            p pVar = chatFragment.f111021k;
            p pVar2 = pVar;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar2 = null;
            }
            pVar2.f111106R.set(true);
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatFragment.f111019i;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            ChatService chatService = togetherWatchDetailPageViewModel2.getChatService();
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = chatFragment.f111019i;
            if (togetherWatchDetailPageViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel3 = null;
            }
            BangumiUniformSeason season = togetherWatchDetailPageViewModel3.getSeasonService().getSeason();
            Neurons.reportExposure$default(false, "pgc.watch-together-cinema.pendant.0.show", chatService.c(MapsKt.mapOf(TuplesKt.to("wtgt_scene", (season == null || (chatRoomInfo = season.E) == null || chatRoomInfo.u() != 6) ? "3" : "2"))), (List) null, 8, (Object) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$subscribeData$9(ChatFragment chatFragment, Continuation<? super ChatFragment$subscribeData$9> continuation) {
        super(2, continuation);
        this.this$0 = chatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatFragment$subscribeData$9 chatFragment$subscribeData$9 = new ChatFragment$subscribeData$9(this.this$0, continuation);
        chatFragment$subscribeData$9.L$0 = obj;
        return chatFragment$subscribeData$9;
    }

    public final Object invoke(BangumiUniformSeason bangumiUniformSeason, Continuation<? super Unit> continuation) {
        return create(bangumiUniformSeason, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        BangumiModule bangumiModule;
        ChatRoomInfo chatRoomInfo;
        ChatRoomInfo chatRoomInfo2;
        RoomPendant roomPendant;
        ChatRoomConfigValue chatRoomConfigValueG;
        ChatRoomMember chatRoomMember;
        ChatRoomMember chatRoomMember2;
        List<ChatRoomFateLabel> listSubList;
        List listA;
        List listA2;
        List listA3;
        Object next;
        Object next2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BangumiUniformSeason bangumiUniformSeason = (BangumiUniformSeason) this.L$0;
        if (bangumiUniformSeason == null) {
            return Unit.INSTANCE;
        }
        List<BangumiModule> list = bangumiUniformSeason.B;
        BangumiModule.Type type = BangumiModule.Type.EP_LIST;
        if (list == null) {
            bangumiModule = null;
        } else {
            for (BangumiModule bangumiModule2 : list) {
                if ((bangumiModule2 != null ? bangumiModule2.a : null) == type) {
                    bangumiModule = bangumiModule2;
                    break;
                }
            }
            bangumiModule = null;
        }
        p pVar = this.this$0.f111021k;
        p pVar2 = pVar;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar2 = null;
        }
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        boolean z6 = togetherWatchDetailPageViewModel2.getSectionService().getIndexedModuleExcludeSeasonList(bangumiModule != null ? bangumiModule.b : 0L) != null;
        if (z6 != pVar2.f111122i) {
            pVar2.f111122i = z6;
            pVar2.notifyPropertyChanged(94);
        }
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.this$0.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
        if (togetherWatchDetailPageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel4 = null;
        }
        BangumiUniformSeason season = togetherWatchDetailPageViewModel4.getSeasonService().getSeason();
        if (season != null && (chatRoomInfo = season.E) != null) {
            ChatFragment chatFragment = this.this$0;
            p pVar3 = chatFragment.f111021k;
            p pVar4 = pVar3;
            if (pVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar4 = null;
            }
            pVar4.f111131r.set(chatRoomInfo.u());
            p pVar5 = chatFragment.f111021k;
            p pVar6 = pVar5;
            if (pVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar6 = null;
            }
            pVar6.h.set(chatRoomInfo.n() == com.bilibili.ogv.infra.account.a.f67852b.mid());
            if (chatRoomInfo.s() != null) {
                p pVar7 = chatFragment.f111021k;
                p pVar8 = pVar7;
                if (pVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar8 = null;
                }
                ChatRoomConfig chatRoomConfigS = chatRoomInfo.s();
                if (!Intrinsics.areEqual(chatRoomConfigS, pVar8.f111109U)) {
                    pVar8.f111109U = chatRoomConfigS;
                    pVar8.notifyPropertyChanged(97);
                }
            }
            if (chatRoomInfo.u() == 1) {
                chatFragment.nf(chatFragment.f111023m & (-5));
                List listM = chatRoomInfo.m();
                if (listM != null) {
                    Iterator it = listM.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        if (((ChatRoomMember) next2).getMid() != com.bilibili.ogv.infra.account.a.f67852b.mid()) {
                            break;
                        }
                    }
                    chatRoomMember = (ChatRoomMember) next2;
                } else {
                    chatRoomMember = null;
                }
                List listM2 = chatRoomInfo.m();
                if (listM2 != null) {
                    Iterator it2 = listM2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (((ChatRoomMember) next).getMid() == com.bilibili.ogv.infra.account.a.f67852b.mid()) {
                            break;
                        }
                    }
                    chatRoomMember2 = (ChatRoomMember) next;
                } else {
                    chatRoomMember2 = null;
                }
                p pVar9 = chatFragment.f111021k;
                p pVar10 = pVar9;
                if (pVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar10 = null;
                }
                pVar10.f111096H.set(chatRoomMember != null ? chatRoomMember.getNickname() : null);
                p pVar11 = chatFragment.f111021k;
                p pVar12 = pVar11;
                if (pVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar12 = null;
                }
                ObservableField<String> observableField = pVar12.f111094F;
                ChatRoomMatchRes chatRoomMatchResL = chatRoomInfo.l();
                observableField.set(chatRoomMatchResL != null ? String.valueOf(chatRoomMatchResL.b()) : null);
                ChatRoomMatchRes chatRoomMatchResL2 = chatRoomInfo.l();
                if ((chatRoomMatchResL2 != null ? chatRoomMatchResL2.b() : 0) > 0) {
                    p pVar13 = chatFragment.f111021k;
                    p pVar14 = pVar13;
                    if (pVar13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                        pVar14 = null;
                    }
                    ObservableField<String> observableField2 = pVar14.f111095G;
                    ChatRoomMatchRes chatRoomMatchResL3 = chatRoomInfo.l();
                    observableField2.set((chatRoomMatchResL3 != null ? String.valueOf(chatRoomMatchResL3.b()) : null) + "%");
                }
                p pVar15 = chatFragment.f111021k;
                p pVar16 = pVar15;
                if (pVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar16 = null;
                }
                pVar16.f111093E.set("http://i0.hdslb.com/bfs/bangumi/593870fb864e443c93124847574acac00a597752.png");
                p pVar17 = chatFragment.f111021k;
                p pVar18 = pVar17;
                if (pVar17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar18 = null;
                }
                ObservableField<PendantAvatarFrameLayout.ShowParams> observableField3 = pVar18.f111137x;
                p pVar19 = chatFragment.f111021k;
                p pVar20 = pVar19;
                if (pVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar20 = null;
                }
                pVar20.getClass();
                observableField3.set(p.k0(chatRoomMember2, true));
                p pVar21 = chatFragment.f111021k;
                p pVar22 = pVar21;
                if (pVar21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar22 = null;
                }
                ObservableField<PendantAvatarFrameLayout.ShowParams> observableField4 = pVar22.f111138y;
                p pVar23 = chatFragment.f111021k;
                p pVar24 = pVar23;
                if (pVar23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar24 = null;
                }
                pVar24.getClass();
                observableField4.set(p.k0(chatRoomMember, true));
                p pVar25 = chatFragment.f111021k;
                p pVar26 = pVar25;
                if (pVar25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar26 = null;
                }
                ObservableField<PendantAvatarFrameLayout.ShowParams> observableField5 = pVar26.f111139z;
                p pVar27 = chatFragment.f111021k;
                p pVar28 = pVar27;
                if (pVar27 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar28 = null;
                }
                pVar28.getClass();
                observableField5.set(p.k0(chatRoomMember2, false));
                p pVar29 = chatFragment.f111021k;
                p pVar30 = pVar29;
                if (pVar29 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar30 = null;
                }
                ObservableField<PendantAvatarFrameLayout.ShowParams> observableField6 = pVar30.f111089A;
                p pVar31 = chatFragment.f111021k;
                p pVar32 = pVar31;
                if (pVar31 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar32 = null;
                }
                pVar32.getClass();
                observableField6.set(p.k0(chatRoomMember, false));
                ChatRoomMatchRes chatRoomMatchResL4 = chatRoomInfo.l();
                int size = (chatRoomMatchResL4 == null || (listA3 = chatRoomMatchResL4.a()) == null) ? 0 : listA3.size();
                if (size <= 4) {
                    p pVar33 = chatFragment.f111021k;
                    p pVar34 = pVar33;
                    if (pVar33 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                        pVar34 = null;
                    }
                    ObservableField<List<ChatRoomFateLabel>> observableField7 = pVar34.f111091C;
                    ChatRoomMatchRes chatRoomMatchResL5 = chatRoomInfo.l();
                    observableField7.set(chatRoomMatchResL5 != null ? chatRoomMatchResL5.a() : null);
                } else {
                    p pVar35 = chatFragment.f111021k;
                    p pVar36 = pVar35;
                    if (pVar35 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                        pVar36 = null;
                    }
                    ObservableField<List<ChatRoomFateLabel>> observableField8 = pVar36.f111091C;
                    ChatRoomMatchRes chatRoomMatchResL6 = chatRoomInfo.l();
                    observableField8.set((chatRoomMatchResL6 == null || (listA2 = chatRoomMatchResL6.a()) == null) ? null : listA2.subList(0, 4));
                    p pVar37 = chatFragment.f111021k;
                    p pVar38 = pVar37;
                    if (pVar37 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                        pVar38 = null;
                    }
                    ObservableField<List<ChatRoomFateLabel>> observableField9 = pVar38.f111092D;
                    ChatRoomMatchRes chatRoomMatchResL7 = chatRoomInfo.l();
                    if (chatRoomMatchResL7 == null || (listA = chatRoomMatchResL7.a()) == null) {
                        listSubList = null;
                    } else {
                        int i7 = size;
                        if (size > 8) {
                            i7 = 8;
                        }
                        listSubList = listA.subList(4, i7);
                    }
                    observableField9.set(listSubList);
                }
                p pVar39 = chatFragment.f111021k;
                p pVar40 = pVar39;
                if (pVar39 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar40 = null;
                }
                ObservableField<List<String>> observableField10 = pVar40.f111097I;
                ChatRoomMatchRes chatRoomMatchResL8 = chatRoomInfo.l();
                observableField10.set(chatRoomMatchResL8 != null ? chatRoomMatchResL8.c() : null);
            } else {
                chatFragment.nf(chatFragment.f111023m | 4);
            }
            p pVar41 = chatFragment.f111021k;
            p pVar42 = pVar41;
            if (pVar41 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar42 = null;
            }
            ChatRoomConfig chatRoomConfig = pVar42.f111109U;
            if (((chatRoomConfig == null || (chatRoomConfigValueG = chatRoomConfig.g()) == null) ? null : chatRoomConfigValueG.a()) != ChatConfigType.UNAVAILABLE_AND_INVISIBLE) {
                chatFragment.nf(chatFragment.f111023m | 32);
            } else {
                chatFragment.nf(chatFragment.f111023m & (-33));
            }
            if (chatRoomInfo.F() > 0) {
                chatFragment.f111016e = ((long) chatRoomInfo.F()) * 1000;
            }
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = chatFragment.f111019i;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
            if (togetherWatchDetailPageViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel6 = null;
            }
            BangumiUniformSeason season2 = togetherWatchDetailPageViewModel6.getSeasonService().getSeason();
            if (season2 != null && (chatRoomInfo2 = season2.E) != null && (roomPendant = chatRoomInfo2.E) != null) {
                p pVar43 = chatFragment.f111021k;
                p pVar44 = pVar43;
                if (pVar43 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar44 = null;
                }
                ObservableField<String> observableField11 = pVar44.f111104P;
                String strB = roomPendant.b();
                String str = strB;
                if (strB == null) {
                    str = "";
                }
                observableField11.set(str);
                p pVar45 = chatFragment.f111021k;
                p pVar46 = pVar45;
                if (pVar45 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar46 = null;
                }
                ObservableField<String> observableField12 = pVar46.f111103O;
                String strA = roomPendant.a();
                if (strA == null) {
                    strA = "";
                }
                observableField12.set(strA);
                p pVar47 = chatFragment.f111021k;
                if (pVar47 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar47 = null;
                }
                pVar47.f111105Q.set(new a(chatFragment));
            }
        }
        return Unit.INSTANCE;
    }
}
