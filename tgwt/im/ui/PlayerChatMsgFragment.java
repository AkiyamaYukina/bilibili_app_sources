package com.bilibili.tgwt.im.ui;

import DD0.M;
import HD0.B;
import HD0.E;
import HD0.x;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatConfigType;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfig;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfigValue;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.chatroomsdk.ChatMsg;
import com.bilibili.chatroomsdk.ChatMsgResp;
import com.bilibili.chatroomsdk.ClearEvent;
import com.bilibili.chatroomsdk.EnterSpecialEvent;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.image2.common.AbstractDataHolder;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.im.widget.D;
import com.bilibili.tgwt.im.widget.InterfaceC6660f;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import com.mall.ui.page.category.MallCategoryFragment;
import com.mall.ui.page.category.data.CategoryBean;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatMsgFragment.class */
@StabilityInferred(parameters = 0)
public final class PlayerChatMsgFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M f111261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TogetherWatchDetailPageViewModel f111262c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f111264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public D f111265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f111266g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f111263d = true;

    @NotNull
    public final ChatRoomOperationService h = (ChatRoomOperationService) ServiceGenerator.createService(ChatRoomOperationService.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final X8.c f111267i = new X8.c(this, 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Hg1.b f111268j = new Hg1.b(this, 5);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.search2.result.holder.collection.b f111269k = new com.bilibili.search2.result.holder.collection.b(this, 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final d f111270l = new d(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final a f111271m = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatMsgFragment$a.class */
    public static final class a implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerChatMsgFragment f111272a;

        public a(PlayerChatMsgFragment playerChatMsgFragment) {
            this.f111272a = playerChatMsgFragment;
        }

        @Override // HD0.x.b
        public final void a() {
            final PlayerChatMsgFragment playerChatMsgFragment = this.f111272a;
            M m7 = playerChatMsgFragment.f111261b;
            M m8 = m7;
            if (m7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                m8 = null;
            }
            final int i7 = 0;
            m8.f2318E.post(new Runnable(playerChatMsgFragment, i7) { // from class: com.bilibili.tgwt.im.ui.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f111315a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f111316b;

                {
                    this.f111315a = i7;
                    this.f111316b = playerChatMsgFragment;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f111315a) {
                        case 0:
                            ((PlayerChatMsgFragment) this.f111316b).kf();
                            break;
                        case 1:
                            MallCategoryFragment mallCategoryFragment = (MallCategoryFragment) this.f111316b;
                            if (!mallCategoryFragment.xf()) {
                                mallCategoryFragment.q = null;
                                break;
                            } else {
                                mallCategoryFragment.q = null;
                                if (mallCategoryFragment.xf()) {
                                    int i8 = 0;
                                    for (Object obj : mallCategoryFragment.i) {
                                        if (i8 < 0) {
                                            CollectionsKt.throwIndexOverflow();
                                        }
                                        CategoryBean categoryBean = (CategoryBean) obj;
                                        if (categoryBean != null) {
                                            categoryBean.setEventDisplayState((MallCategoryFragment.wf(categoryBean) && MallCategoryFragment.vf(categoryBean)) ? 2 : 0);
                                            categoryBean.setEventAnimStarted(false);
                                            categoryBean.setEventAnimToken((String) null);
                                        }
                                        i8++;
                                    }
                                    mallCategoryFragment.f.notifyDataSetChanged();
                                    break;
                                }
                            }
                            break;
                        default:
                            AbstractDataHolder abstractDataHolder = (AbstractDataHolder) this.f111316b;
                            abstractDataHolder.a.removeObserver(abstractDataHolder.d);
                            AbstractDataHolder.a aVar = abstractDataHolder.e;
                            if (aVar != null) {
                                aVar.onDetach();
                            }
                            break;
                    }
                }
            });
        }

        @Override // HD0.x.b
        public final void b() {
            ChatRoomConfig chatRoomConfigS;
            PlayerChatMsgFragment playerChatMsgFragment = this.f111272a;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = playerChatMsgFragment.f111262c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            BangumiUniformSeason season = togetherWatchDetailPageViewModel2.getSeasonService().getSeason();
            if (season != null) {
                ChatRoomInfo chatRoomInfo = season.E;
                ChatRoomConfigValue chatRoomConfigValueF = (chatRoomInfo == null || (chatRoomConfigS = chatRoomInfo.s()) == null) ? null : chatRoomConfigS.f();
                if ((chatRoomConfigValueF != null ? chatRoomConfigValueF.a() : null) == null || chatRoomConfigValueF.a() == ChatConfigType.AVAILABLE_AND_VISIBLE) {
                    Context contextRequireContext = playerChatMsgFragment.requireContext();
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = playerChatMsgFragment.f111262c;
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
                    if (togetherWatchDetailPageViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        togetherWatchDetailPageViewModel4 = null;
                    }
                    new v(contextRequireContext, "ogv_video_detail_together_watch_full_pic_share", togetherWatchDetailPageViewModel4.getShareService()).show();
                } else {
                    Context context = playerChatMsgFragment.getContext();
                    String strB = chatRoomConfigValueF.b();
                    String str = strB;
                    if (strB == null) {
                        str = "";
                    }
                    ToastHelper.showToastShort(context, str);
                }
                Neurons.reportClick$default(false, "pgc.watch-together-fullscreen-cinema.system-messages.invite.click", (Map) null, 4, (Object) null);
            }
        }

        @Override // HD0.x.b
        public final void c() {
            this.f111272a.f111263d = true;
        }

        @Override // HD0.x.b
        public final void d(Context context, String str) {
            ChatRoomInfo chatRoomInfo;
            E e7;
            PlayerChatMsgFragment playerChatMsgFragment = this.f111272a;
            playerChatMsgFragment.f111263d = true;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - playerChatMsgFragment.f111266g >= 500) {
                playerChatMsgFragment.f111266g = jCurrentTimeMillis;
                Uri uri = Uri.parse(str);
                if (Intrinsics.areEqual(uri.getHost(), "pgc") && Intrinsics.areEqual(uri.getPath(), "/theater/say_hi")) {
                    ArrayMap arrayMap = new ArrayMap();
                    Ej0.a.a(uri, arrayMap);
                    if (Intrinsics.areEqual(uri.getQueryParameter("type"), NotificationCompat.CATEGORY_CALL)) {
                        M m7 = playerChatMsgFragment.f111261b;
                        M m8 = m7;
                        if (m7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            m8 = null;
                        }
                        HD0.x xVar = m8.f2321H;
                        if (xVar != null && (e7 = xVar.f8337m) != null) {
                            M m9 = playerChatMsgFragment.f111261b;
                            M m10 = m9;
                            if (m9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                m10 = null;
                            }
                            E.n(e7, m10.f2317D.getRoot());
                        }
                        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = playerChatMsgFragment.f111262c;
                        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
                        if (togetherWatchDetailPageViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                            togetherWatchDetailPageViewModel2 = null;
                        }
                        Neurons.reportClick$default(false, !togetherWatchDetailPageViewModel2.getScreenStateService().getScreenStateHelper().a().b ? "pgc.watch-together-cinema.cinema-im.welcome.click" : "pgc.watch-together-fullscreen-cinema.chat-zone.welcome.click", (Map) null, 4, (Object) null);
                        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = playerChatMsgFragment.f111262c;
                        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
                        if (togetherWatchDetailPageViewModel3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                            togetherWatchDetailPageViewModel4 = null;
                        }
                        BangumiUniformSeason season = togetherWatchDetailPageViewModel4.getSeasonService().getSeason();
                        arrayMap.put("room_id", String.valueOf((season == null || (chatRoomInfo = season.E) == null) ? null : Long.valueOf(chatRoomInfo.t())));
                        arrayMap.put("action_type", "3");
                        arrayMap.put("action_id", String.valueOf(System.currentTimeMillis()));
                        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(playerChatMsgFragment), (CoroutineContext) null, (CoroutineStart) null, new PlayerChatMsgFragment$clickMsg$1(playerChatMsgFragment, arrayMap, context, null), 3, (Object) null);
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatMsgFragment$b.class */
    public static final class b extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f111273a;

        public b(Context context) {
            this.f111273a = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.top = Uj0.c.b(5.0f, this.f111273a) * 2;
                rect.bottom = Uj0.c.b(5.0f, this.f111273a);
                return;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (childAdapterPosition == (layoutManager != null ? layoutManager.getItemCount() : 0) - 1) {
                rect.top = Uj0.c.b(5.0f, this.f111273a);
                rect.bottom = Uj0.c.b(5.0f, this.f111273a) * 2;
            } else {
                int iB = Uj0.c.b(5.0f, this.f111273a);
                rect.top = iB;
                rect.bottom = iB;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatMsgFragment$c.class */
    public static final class c extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerChatMsgFragment f111274a;

        public c(PlayerChatMsgFragment playerChatMsgFragment) {
            this.f111274a = playerChatMsgFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            super.onScrollStateChanged(recyclerView, i7);
            PlayerChatMsgFragment playerChatMsgFragment = this.f111274a;
            M m7 = playerChatMsgFragment.f111261b;
            M m8 = m7;
            if (m7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                m8 = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) m8.f2318E.getLayoutManager();
            if (i7 == 0) {
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = playerChatMsgFragment.f111262c;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
                if (togetherWatchDetailPageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel2 = null;
                }
                if (iFindLastVisibleItemPosition == togetherWatchDetailPageViewModel2.getChatService().g().size() - 1) {
                    M m9 = playerChatMsgFragment.f111261b;
                    M m10 = m9;
                    if (m9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        m10 = null;
                    }
                    m10.f2321H.v("");
                    playerChatMsgFragment.f111264e = 0;
                }
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = playerChatMsgFragment.f111262c;
                if (togetherWatchDetailPageViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel3 = null;
                }
                B b7 = (B) CollectionsKt.getOrNull(togetherWatchDetailPageViewModel3.getChatService().g(), iFindLastVisibleItemPosition);
                if (b7 != null) {
                    playerChatMsgFragment.f111263d = b7.f8170g;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatMsgFragment$d.class */
    public static final class d implements InterfaceC6660f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerChatMsgFragment f111275a;

        public d(PlayerChatMsgFragment playerChatMsgFragment) {
            this.f111275a = playerChatMsgFragment;
        }

        @Override // com.bilibili.tgwt.im.widget.InterfaceC6660f
        public final void a() {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111275a.f111262c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            togetherWatchDetailPageViewModel2.getChatService().e();
        }

        @Override // com.bilibili.tgwt.im.widget.InterfaceC6660f
        public final void b() {
            PlayerChatMsgFragment playerChatMsgFragment = this.f111275a;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = playerChatMsgFragment.f111262c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            togetherWatchDetailPageViewModel2.getChatService().e();
            D d7 = playerChatMsgFragment.f111265f;
            if (d7 != null) {
                d7.d(true);
            }
        }

        @Override // com.bilibili.tgwt.im.widget.InterfaceC6660f
        public final void c() {
            PlayerChatMsgFragment playerChatMsgFragment = this.f111275a;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = playerChatMsgFragment.f111262c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            togetherWatchDetailPageViewModel2.getChatService().e();
            D d7 = playerChatMsgFragment.f111265f;
            if (d7 != null) {
                d7.d(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.PlayerChatMsgFragment$onViewCreated$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatMsgFragment$onViewCreated$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<ChatMsg, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final PlayerChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PlayerChatMsgFragment playerChatMsgFragment, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = playerChatMsgFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invoke(ChatMsg chatMsg, Continuation<? super Unit> continuation) {
            return create(chatMsg, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 329
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.im.ui.PlayerChatMsgFragment.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.PlayerChatMsgFragment$onViewCreated$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatMsgFragment$onViewCreated$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        int I$0;
        int label;
        final PlayerChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PlayerChatMsgFragment playerChatMsgFragment, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = playerChatMsgFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
            anonymousClass4.I$0 = ((Number) obj).intValue();
            return anonymousClass4;
        }

        public final Object invoke(int i7, Continuation<? super Unit> continuation) {
            return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            E e7;
            LinkedHashMap<Long, EnterSpecialEvent> linkedHashMap;
            E e8;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i7 = this.I$0;
            M m7 = null;
            if (i7 == 1) {
                M m8 = this.this$0.f111261b;
                if (m8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    m7 = m8;
                }
                RecyclerView recyclerView = m7.f2318E;
                final PlayerChatMsgFragment playerChatMsgFragment = this.this$0;
                recyclerView.postDelayed(new Runnable(playerChatMsgFragment) { // from class: com.bilibili.tgwt.im.ui.s

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PlayerChatMsgFragment f111317a;

                    {
                        this.f111317a = playerChatMsgFragment;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PlayerChatMsgFragment.jf(this.f111317a);
                    }
                }, 200L);
            } else if (i7 == 2) {
                M m9 = this.this$0.f111261b;
                M m10 = m9;
                if (m9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    m10 = null;
                }
                RecyclerView recyclerView2 = m10.f2318E;
                final PlayerChatMsgFragment playerChatMsgFragment2 = this.this$0;
                recyclerView2.postDelayed(new Runnable(playerChatMsgFragment2) { // from class: com.bilibili.tgwt.im.ui.t

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PlayerChatMsgFragment f111318a;

                    {
                        this.f111318a = playerChatMsgFragment2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f111318a.kf();
                    }
                }, 200L);
                M m11 = this.this$0.f111261b;
                M m12 = m11;
                if (m11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    m12 = null;
                }
                HD0.x xVar = m12.f2321H;
                if (xVar != null && (e8 = xVar.f8338n) != null) {
                    M m13 = this.this$0.f111261b;
                    M m14 = m13;
                    if (m13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        m14 = null;
                    }
                    E.n(e8, m14.f2317D.getRoot());
                }
                M m15 = this.this$0.f111261b;
                if (m15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    m15 = null;
                }
                HD0.x xVar2 = m15.f2321H;
                if (xVar2 != null && (e7 = xVar2.f8338n) != null && (linkedHashMap = e7.f8183b) != null) {
                    linkedHashMap.clear();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.PlayerChatMsgFragment$onViewCreated$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatMsgFragment$onViewCreated$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<EnterSpecialEvent, Continuation<? super Unit>, Object> {
        final Context $context;
        Object L$0;
        int label;
        final PlayerChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(PlayerChatMsgFragment playerChatMsgFragment, Context context, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = playerChatMsgFragment;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, this.$context, continuation);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        public final Object invoke(EnterSpecialEvent enterSpecialEvent, Continuation<? super Unit> continuation) {
            return create(enterSpecialEvent, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            E e7;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EnterSpecialEvent enterSpecialEvent = (EnterSpecialEvent) this.L$0;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111262c;
            if (togetherWatchDetailPageViewModel != null) {
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
                if (togetherWatchDetailPageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel2 = null;
                }
                if (!togetherWatchDetailPageViewModel2.getScreenStateService().getScreenStateHelper().a().a) {
                    M m7 = this.this$0.f111261b;
                    M m8 = m7;
                    if (m7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        m8 = null;
                    }
                    HD0.x xVar = m8.f2321H;
                    if (xVar != null && (e7 = xVar.f8338n) != null) {
                        Context context = this.$context;
                        M m9 = this.this$0.f111261b;
                        if (m9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            m9 = null;
                        }
                        e7.m(context, m9.f2317D.getRoot(), false, enterSpecialEvent);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.PlayerChatMsgFragment$onViewCreated$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatMsgFragment$onViewCreated$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<ClearEvent, Continuation<? super Unit>, Object> {
        int label;
        final PlayerChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(PlayerChatMsgFragment playerChatMsgFragment, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = playerChatMsgFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, continuation);
        }

        public final Object invoke(ClearEvent clearEvent, Continuation<? super Unit> continuation) {
            return create(clearEvent, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            M m7 = this.this$0.f111261b;
            M m8 = m7;
            if (m7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                m8 = null;
            }
            HD0.x xVar = m8.f2321H;
            xVar.f8328c.clear();
            xVar.f8331f.clear();
            xVar.f8332g.clear();
            xVar.u("");
            xVar.v("");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.PlayerChatMsgFragment$onViewCreated$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatMsgFragment$onViewCreated$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;
        final PlayerChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(PlayerChatMsgFragment playerChatMsgFragment, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = playerChatMsgFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.this$0, continuation);
        }

        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PlayerChatMsgFragment playerChatMsgFragment = this.this$0;
            playerChatMsgFragment.f111263d = true;
            PlayerChatMsgFragment.jf(playerChatMsgFragment);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.PlayerChatMsgFragment$onViewCreated$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatMsgFragment$onViewCreated$8.class */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        int label;
        final PlayerChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(PlayerChatMsgFragment playerChatMsgFragment, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.this$0 = playerChatMsgFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass8(this.this$0, continuation);
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
            PlayerChatMsgFragment playerChatMsgFragment = this.this$0;
            playerChatMsgFragment.f111263d = true;
            PlayerChatMsgFragment.jf(playerChatMsgFragment);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.PlayerChatMsgFragment$onViewCreated$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatMsgFragment$onViewCreated$9.class */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<ChatMsgResp, Continuation<? super Unit>, Object> {
        int label;
        final PlayerChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(PlayerChatMsgFragment playerChatMsgFragment, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = playerChatMsgFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass9(this.this$0, continuation);
        }

        public final Object invoke(ChatMsgResp chatMsgResp, Continuation<? super Unit> continuation) {
            return create(chatMsgResp, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            D d7 = this.this$0.f111265f;
            if (d7 != null) {
                d7.f111356g.setText("");
            }
            M m7 = this.this$0.f111261b;
            M m8 = m7;
            if (m7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                m8 = null;
            }
            m8.f2314A.setText("");
            this.this$0.kf();
            return Unit.INSTANCE;
        }
    }

    public static final void jf(PlayerChatMsgFragment playerChatMsgFragment) {
        if (playerChatMsgFragment.f111261b != null) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = playerChatMsgFragment.f111262c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            int size = togetherWatchDetailPageViewModel2.getChatService().g().size();
            if (size > 0) {
                M m7 = playerChatMsgFragment.f111261b;
                M m8 = m7;
                if (m7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    m8 = null;
                }
                m8.f2318E.scrollToPosition(size - 1);
                playerChatMsgFragment.f111264e = 0;
                M m9 = playerChatMsgFragment.f111261b;
                if (m9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    m9 = null;
                }
                HD0.x xVar = m9.f2321H;
                if (xVar != null) {
                    xVar.v("");
                }
            }
        }
    }

    public final void kf() {
        if (this.f111261b != null) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111262c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            int size = togetherWatchDetailPageViewModel2.getChatService().g().size();
            if (size > 0) {
                M m7 = this.f111261b;
                M m8 = m7;
                if (m7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    m8 = null;
                }
                m8.f2318E.smoothScrollToPosition(size - 1);
                this.f111264e = 0;
                M m9 = this.f111261b;
                if (m9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    m9 = null;
                }
                HD0.x xVar = m9.f2321H;
                if (xVar != null) {
                    xVar.v("");
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        M m7;
        HD0.x xVar;
        E e7;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != 2 || (m7 = this.f111261b) == null || (xVar = m7.f2321H) == null || (e7 = xVar.f8338n) == null) {
            return;
        }
        M m8 = m7;
        if (m7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            m8 = null;
        }
        E.n(e7, m8.f2317D.getRoot());
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f111262c = (TogetherWatchDetailPageViewModel) new ViewModelProvider(requireActivity()).get(TogetherWatchDetailPageViewModel.class);
        this.f111261b = M.inflate(layoutInflater, viewGroup, false);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111262c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        HD0.x xVar = togetherWatchDetailPageViewModel2.getChatService().f111861J;
        M m7 = this.f111261b;
        M m8 = m7;
        if (m7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            m8 = null;
        }
        m8.q(xVar);
        xVar.getClass();
        a aVar = this.f111271m;
        xVar.f8338n.f8193m = aVar;
        xVar.f8340p = aVar;
        xVar.f8341q = this.f111267i;
        xVar.f8342r = this.f111268j;
        xVar.f8343s = this.f111269k;
        Context context = layoutInflater.getContext();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.f111262c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
        if (togetherWatchDetailPageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel4 = null;
        }
        ChatRoomManagerService chatRoomManagerService = togetherWatchDetailPageViewModel4.getChatRoomManagerService();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = this.f111262c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
        if (togetherWatchDetailPageViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel6 = null;
        }
        D d7 = new D(context, chatRoomManagerService, togetherWatchDetailPageViewModel6.getChatService(), this.f111270l);
        this.f111265f = d7;
        M m9 = this.f111261b;
        M m10 = m9;
        if (m9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            m10 = null;
        }
        d7.f111361m = m10.f2323x;
        d7.f111368t = this;
        D d8 = this.f111265f;
        if (d8 != null) {
            M m11 = this.f111261b;
            M m12 = m11;
            if (m11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                m12 = null;
            }
            d8.f111362n = m12.f2322w;
        }
        M m13 = this.f111261b;
        if (m13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            m13 = null;
        }
        return m13.getRoot();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            return;
        }
        M m7 = this.f111261b;
        M m8 = m7;
        if (m7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            m8 = null;
        }
        m8.f2318E.setNestedScrollingEnabled(false);
        int iA = Kl.d.a(requireActivity().getWindow());
        M m9 = this.f111261b;
        M m10 = m9;
        if (m9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            m10 = null;
        }
        m10.f2318E.setPadding(0, 0, iA, 0);
        M m11 = this.f111261b;
        M m12 = m11;
        if (m11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            m12 = null;
        }
        ((ViewGroup.MarginLayoutParams) m12.f2315B.getLayoutParams()).rightMargin = iA;
        M m13 = this.f111261b;
        M m14 = m13;
        if (m13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            m14 = null;
        }
        ((ViewGroup.MarginLayoutParams) m14.f2324y.getLayoutParams()).rightMargin = iA;
        M m15 = this.f111261b;
        M m16 = m15;
        if (m15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            m16 = null;
        }
        m16.f2315B.requestLayout();
        M m17 = this.f111261b;
        M m18 = m17;
        if (m17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            m18 = null;
        }
        m18.f2324y.requestLayout();
        M m19 = this.f111261b;
        M m20 = m19;
        if (m19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            m20 = null;
        }
        m20.f2318E.addItemDecoration(new b(context));
        M m21 = this.f111261b;
        M m22 = m21;
        if (m21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            m22 = null;
        }
        m22.f2318E.addOnScrollListener(new c(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111262c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel2.getChatRoomManagerService().f110926s, new AnonymousClass3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.f111262c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
        if (togetherWatchDetailPageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel4 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel4.getChatRoomManagerService().f110932y, new AnonymousClass4(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = this.f111262c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
        if (togetherWatchDetailPageViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel6 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel6.getChatRoomManagerService().f110892F, new AnonymousClass5(this, context, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel7 = this.f111262c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel8 = togetherWatchDetailPageViewModel7;
        if (togetherWatchDetailPageViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel8 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel8.getChatRoomManagerService().f110893G, new AnonymousClass6(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel9 = this.f111262c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel10 = togetherWatchDetailPageViewModel9;
        if (togetherWatchDetailPageViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel10 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel10.getChatService().f111885d0, new AnonymousClass7(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel11 = this.f111262c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel12 = togetherWatchDetailPageViewModel11;
        if (togetherWatchDetailPageViewModel11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel12 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel12.getChatService().f111883c0, new AnonymousClass8(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel13 = this.f111262c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel14 = togetherWatchDetailPageViewModel13;
        if (togetherWatchDetailPageViewModel13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel14 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel14.getChatService().f111906y, new AnonymousClass9(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }
}
