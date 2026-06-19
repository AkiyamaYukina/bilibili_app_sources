package com.bilibili.tgwt.im.ui;

import DD0.AbstractC1534g;
import HD0.B;
import HD0.E;
import HD0.x;
import Pb.F;
import Pb.G;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.emoticon.model.Emote;
import com.bilibili.app.comm.supermenu.core.IMenuPanel;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuItemClickListenerV2;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuVisibilityChangeListenerV2;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.service.refactor.FetchShareMenuCallback;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewShareService;
import com.bilibili.bangumi.module.chatroom.ChatConfigType;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfig;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfigValue;
import com.bilibili.bangumi.module.chatroom.ChatRoomExtraInfo;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.chatroom.vo.ChatEmote;
import com.bilibili.chatroom.vo.ChatMessageVo;
import com.bilibili.chatroom.widget.userDialog.ChatUserFollowStatus;
import com.bilibili.chatroomsdk.ChatMsg;
import com.bilibili.chatroomsdk.ChatMsgResp;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.chatroomsdk.ClearEvent;
import com.bilibili.chatroomsdk.EnterSpecialEvent;
import com.bilibili.chatroomsdk.MessagePro;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.im.ui.ChatMsgFragment;
import com.bilibili.tgwt.im.widget.BangumiFakeInputBar;
import com.bilibili.tgwt.im.widget.InterfaceC6660f;
import com.bilibili.tgwt.im.widget.RealInputBar;
import com.bilibili.tgwt.im.widget.m;
import com.bilibili.tgwt.service.ChatService;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import lV.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment.class */
@StabilityInferred(parameters = 0)
public final class ChatMsgFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.bilibili.tgwt.im.widget.m f111217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f111218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC1534g f111219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TogetherWatchDetailPageViewModel f111220e;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f111223i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ChatRoomOperationService f111221f = (ChatRoomOperationService) ServiceGenerator.createService(ChatRoomOperationService.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f111222g = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final b f111224j = new b(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final h f111225k = new h(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final c f111226l = new c(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final d f111227m = new d(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final e f111228n = new e(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final a f111229o = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$a.class */
    public static final class a implements m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatMsgFragment f111230a;

        public a(ChatMsgFragment chatMsgFragment) {
            this.f111230a = chatMsgFragment;
        }

        @Override // com.bilibili.tgwt.im.widget.m.a
        public final void a(Emote emote) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111230a.f111220e;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            togetherWatchDetailPageViewModel2.getChatService().f111907z.put(emote.name, ChatEmote.a.a(emote));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$b.class */
    public static final class b implements BangumiFakeInputBar.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatMsgFragment f111231a;

        public b(ChatMsgFragment chatMsgFragment) {
            this.f111231a = chatMsgFragment;
        }

        @Override // com.bilibili.tgwt.im.widget.BangumiFakeInputBar.a
        public final void a() {
            Neurons.reportClick$default(false, "pgc.watch-together-cinema.cinema-im.emoji.click", (Map) null, 4, (Object) null);
            ChatMsgFragment.lf(this.f111231a, true);
        }

        @Override // com.bilibili.tgwt.im.widget.BangumiFakeInputBar.a
        public final void b() {
            ChatMsgFragment chatMsgFragment = this.f111231a;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatMsgFragment.f111220e;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            ChatService chatService = togetherWatchDetailPageViewModel2.getChatService();
            AbstractC1534g abstractC1534g = chatMsgFragment.f111219d;
            if (abstractC1534g == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                abstractC1534g = null;
            }
            chatService.r(abstractC1534g.f2507x.getText(), chatMsgFragment.f111225k);
        }

        @Override // com.bilibili.tgwt.im.widget.BangumiFakeInputBar.a
        public final void c(String str) {
            try {
                ChatMessageVo chatMessageVo = (ChatMessageVo) JsonUtilKt.parseJson(str, new com.bilibili.tgwt.im.ui.b().getType());
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111231a.f111220e;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
                if (togetherWatchDetailPageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel2 = null;
                }
                togetherWatchDetailPageViewModel2.getChatService().l(chatMessageVo.a, chatMessageVo.b(), false);
            } catch (Exception e7) {
                com.bilibili.ogv.infra.util.e.b(e7);
            }
        }

        @Override // com.bilibili.tgwt.im.widget.BangumiFakeInputBar.a
        public final void d() {
            ChatMsgFragment.lf(this.f111231a, false);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$c.class */
    public static final class c implements x.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatMsgFragment f111232a;

        public c(ChatMsgFragment chatMsgFragment) {
            this.f111232a = chatMsgFragment;
        }

        @Override // HD0.x.a
        public final void a() {
            final ChatMsgFragment chatMsgFragment = this.f111232a;
            AbstractC1534g abstractC1534g = chatMsgFragment.f111219d;
            AbstractC1534g abstractC1534g2 = abstractC1534g;
            if (abstractC1534g == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                abstractC1534g2 = null;
            }
            abstractC1534g2.f2509z.post(new Runnable(chatMsgFragment) { // from class: com.bilibili.tgwt.im.ui.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ChatMsgFragment f111293a;

                {
                    this.f111293a = chatMsgFragment;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f111293a.mf();
                }
            });
        }

        @Override // HD0.x.a
        public final void b(long j7, String str, Context context) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ChatMsgFragment chatMsgFragment = this.f111232a;
            if (jCurrentTimeMillis - chatMsgFragment.f111223i >= 500) {
                chatMsgFragment.f111223i = jCurrentTimeMillis;
                ChatMsgFragment.jf(chatMsgFragment, context, str, j7);
            }
        }

        @Override // HD0.x.a
        public final void c(long j7, String str, Context context) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ChatMsgFragment chatMsgFragment = this.f111232a;
            if (jCurrentTimeMillis - chatMsgFragment.f111223i >= 500) {
                chatMsgFragment.f111223i = jCurrentTimeMillis;
                ChatMsgFragment.jf(chatMsgFragment, context, str, j7);
            }
        }

        @Override // HD0.x.a
        public final void d(ChatRoomMember chatRoomMember) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111232a.f111220e;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            togetherWatchDetailPageViewModel2.getDetailChatService().a(chatRoomMember);
            Neurons.reportClick$default(false, "pgc.watch-together-cinema.cinema-im.head.click", (Map) null, 4, (Object) null);
        }

        @Override // HD0.x.a
        public final void e(B b7) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111232a.f111220e;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            togetherWatchDetailPageViewModel2.getChatService().d(b7);
        }

        @Override // HD0.x.a
        public final void f(final View view, final ChatMsg chatMsg) {
            Integer contentType;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111232a.f111220e;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            final ChatService chatService = togetherWatchDetailPageViewModel2.getChatService();
            chatService.getClass();
            ArrayList arrayList = new ArrayList();
            final String string = view.getContext().getString(2131836340);
            final String string2 = view.getContext().getString(2131836339);
            final String string3 = view.getContext().getString(2131836262);
            MessagePro message = chatMsg.getMessage();
            boolean z6 = true;
            boolean z7 = (message == null || (contentType = message.getContentType()) == null || contentType.intValue() != 3) ? false : true;
            if (chatMsg.getOid() != chatService.f111898q.mid()) {
                z6 = false;
            }
            if (!z7) {
                arrayList.add(string);
                if (!z6) {
                    arrayList.add(string2);
                }
            } else if (!z6) {
                return;
            } else {
                arrayList.add(string3);
            }
            final lV.j jVar = new lV.j(view.getContext(), arrayList);
            jVar.c = new j.a(chatService, string, view, chatMsg, string2, string3, jVar) { // from class: com.bilibili.tgwt.service.ChatService$msgLongClick$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ChatService f111912a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f111913b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final View f111914c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final ChatMsg f111915d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final String f111916e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final String f111917f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final lV.j f111918g;

                {
                    this.f111912a = chatService;
                    this.f111913b = string;
                    this.f111914c = view;
                    this.f111915d = chatMsg;
                    this.f111916e = string2;
                    this.f111917f = string3;
                    this.f111918g = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void a(java.lang.String r10) {
                    /*
                        Method dump skipped, instruction units count: 421
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.service.ChatService$msgLongClick$1.a(java.lang.String):void");
                }
            };
            jVar.getContentView().measure(0, 0);
            jVar.showAsDropDown(view, 0 - ((jVar.getContentView().getMeasuredWidth() - view.getWidth()) / 2), (Uj0.c.b(12.0f, view.getContext()) - view.getHeight()) - jVar.getContentView().getMeasuredHeight());
        }

        @Override // HD0.x.a
        public final void g(View view) {
            ChatRoomConfig chatRoomConfigS;
            ChatMsgFragment chatMsgFragment = this.f111232a;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatMsgFragment.f111220e;
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
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = chatMsgFragment.f111220e;
                    if (togetherWatchDetailPageViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        togetherWatchDetailPageViewModel3 = null;
                    }
                    NewShareService.showMenu$default(togetherWatchDetailPageViewModel3.getShareService(), view.getContext(), "ogv_video_detail_chat_together_watch_pic_share", (FetchShareMenuCallback) null, (OnMenuItemClickListenerV2) null, (IMenuPanel) null, (OnMenuVisibilityChangeListenerV2) null, 60, (Object) null);
                    return;
                }
                Context context = chatMsgFragment.getContext();
                String strB = chatRoomConfigValueF.b();
                String str = strB;
                if (strB == null) {
                    str = "";
                }
                ToastHelper.showToastShort(context, str);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$d.class */
    public static final class d implements RealInputBar.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatMsgFragment f111233a;

        public d(ChatMsgFragment chatMsgFragment) {
            this.f111233a = chatMsgFragment;
        }

        @Override // com.bilibili.tgwt.im.widget.RealInputBar.d
        public final void a(String str) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111233a.f111220e;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            togetherWatchDetailPageViewModel2.getChatService().l(str, null, false);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$e.class */
    public static final class e implements RealInputBar.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatMsgFragment f111234a;

        public e(ChatMsgFragment chatMsgFragment) {
            this.f111234a = chatMsgFragment;
        }

        @Override // com.bilibili.tgwt.im.widget.RealInputBar.e
        public final void a(boolean z6) {
            ChatMsgFragment chatMsgFragment = this.f111234a;
            Context context = chatMsgFragment.getContext();
            if (context != null && z6 && chatMsgFragment.f111218c) {
                AbstractC1534g abstractC1534g = chatMsgFragment.f111219d;
                AbstractC1534g abstractC1534g2 = abstractC1534g;
                if (abstractC1534g == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    abstractC1534g2 = null;
                }
                abstractC1534g2.f2507x.setEmoticonBadgeVisible(false);
                com.bilibili.tgwt.im.widget.m mVar = chatMsgFragment.f111217b;
                if (mVar != null) {
                    mVar.f111444j = false;
                    RealInputBar realInputBar = mVar.f111442g;
                    if (realInputBar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
                        realInputBar = null;
                    }
                    realInputBar.setEmoticonBadgeVisible(false);
                }
                jK0.a.j(context, "reply", false);
                chatMsgFragment.f111218c = false;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$f.class */
    public static final class f extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f111235a;

        public f(Context context) {
            this.f111235a = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.top = Uj0.c.b(8.0f, this.f111235a) * 2;
                rect.bottom = Uj0.c.b(8.0f, this.f111235a);
                return;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (childAdapterPosition == (layoutManager != null ? layoutManager.getItemCount() : 0) - 1) {
                rect.top = Uj0.c.b(8.0f, this.f111235a);
                rect.bottom = Uj0.c.b(8.0f, this.f111235a) * 2;
            } else {
                int iB = Uj0.c.b(8.0f, this.f111235a);
                rect.top = iB;
                rect.bottom = iB;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$g.class */
    public static final class g extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatMsgFragment f111236a;

        public g(ChatMsgFragment chatMsgFragment) {
            this.f111236a = chatMsgFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            super.onScrollStateChanged(recyclerView, i7);
            ChatMsgFragment chatMsgFragment = this.f111236a;
            AbstractC1534g abstractC1534g = chatMsgFragment.f111219d;
            AbstractC1534g abstractC1534g2 = abstractC1534g;
            if (abstractC1534g == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                abstractC1534g2 = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC1534g2.f2509z.getLayoutManager();
            if (i7 == 0) {
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatMsgFragment.f111220e;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
                if (togetherWatchDetailPageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel2 = null;
                }
                if (iFindLastVisibleItemPosition == togetherWatchDetailPageViewModel2.getChatService().g().size() - 1) {
                    AbstractC1534g abstractC1534g3 = chatMsgFragment.f111219d;
                    AbstractC1534g abstractC1534g4 = abstractC1534g3;
                    if (abstractC1534g3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        abstractC1534g4 = null;
                    }
                    abstractC1534g4.f2505B.u("");
                    chatMsgFragment.h = 0;
                }
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = chatMsgFragment.f111220e;
                if (togetherWatchDetailPageViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel3 = null;
                }
                B b7 = (B) CollectionsKt.getOrNull(togetherWatchDetailPageViewModel3.getChatService().g(), iFindLastVisibleItemPosition);
                if (b7 != null) {
                    chatMsgFragment.f111222g = b7.f8170g;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$h.class */
    public static final class h implements InterfaceC6660f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatMsgFragment f111237a;

        public h(ChatMsgFragment chatMsgFragment) {
            this.f111237a = chatMsgFragment;
        }

        @Override // com.bilibili.tgwt.im.widget.InterfaceC6660f
        public final void a() {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111237a.f111220e;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            togetherWatchDetailPageViewModel2.getChatService().e();
        }

        @Override // com.bilibili.tgwt.im.widget.InterfaceC6660f
        public final void b() {
            ChatMsgFragment chatMsgFragment = this.f111237a;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatMsgFragment.f111220e;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            togetherWatchDetailPageViewModel2.getChatService().e();
            ChatMsgFragment.lf(chatMsgFragment, true);
        }

        @Override // com.bilibili.tgwt.im.widget.InterfaceC6660f
        public final void c() {
            ChatMsgFragment chatMsgFragment = this.f111237a;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatMsgFragment.f111220e;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            togetherWatchDetailPageViewModel2.getChatService().e();
            ChatMsgFragment.lf(chatMsgFragment, false);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.ChatMsgFragment$onViewCreated$10, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$onViewCreated$10.class */
    public static final class AnonymousClass10 extends SuspendLambda implements Function2<BangumiUniformSeason, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(ChatMsgFragment chatMsgFragment, Continuation<? super AnonymousClass10> continuation) {
            super(2, continuation);
            this.this$0 = chatMsgFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass10 anonymousClass10 = new AnonymousClass10(this.this$0, continuation);
            anonymousClass10.L$0 = obj;
            return anonymousClass10;
        }

        public final Object invoke(BangumiUniformSeason bangumiUniformSeason, Continuation<? super Unit> continuation) {
            return create(bangumiUniformSeason, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 381
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.im.ui.ChatMsgFragment.AnonymousClass10.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.ChatMsgFragment$onViewCreated$11, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$onViewCreated$11.class */
    public static final class AnonymousClass11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChatMsgFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.ChatMsgFragment$onViewCreated$11$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$onViewCreated$11$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatMsgFragment f111238a;

            public a(ChatMsgFragment chatMsgFragment) {
                this.f111238a = chatMsgFragment;
            }

            public final Object emit(Object obj, Continuation continuation) {
                ChatRoomExtraInfo chatRoomExtraInfo = (ChatRoomExtraInfo) obj;
                if (chatRoomExtraInfo != null) {
                    AbstractC1534g abstractC1534g = this.f111238a.f111219d;
                    AbstractC1534g abstractC1534g2 = abstractC1534g;
                    if (abstractC1534g == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        abstractC1534g2 = null;
                    }
                    abstractC1534g2.f2507x.setQuickMsgData(chatRoomExtraInfo.a);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(ChatMsgFragment chatMsgFragment, Continuation<? super AnonymousClass11> continuation) {
            super(2, continuation);
            this.this$0 = chatMsgFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass11(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111220e;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
                if (togetherWatchDetailPageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel2 = null;
                }
                MutableStateFlow mutableStateFlow = togetherWatchDetailPageViewModel2.getChatService().f111904w;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.ChatMsgFragment$onViewCreated$12, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$onViewCreated$12.class */
    public static final class AnonymousClass12 extends SuspendLambda implements Function2<ChatMsgResp, Continuation<? super Unit>, Object> {
        int label;
        final ChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(ChatMsgFragment chatMsgFragment, Continuation<? super AnonymousClass12> continuation) {
            super(2, continuation);
            this.this$0 = chatMsgFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass12(this.this$0, continuation);
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
            com.bilibili.tgwt.im.widget.m mVar = this.this$0.f111217b;
            if (mVar != null) {
                RealInputBar realInputBar = mVar.f111442g;
                RealInputBar realInputBar2 = realInputBar;
                if (realInputBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
                    realInputBar2 = null;
                }
                if (realInputBar2 != null) {
                    realInputBar2.setText("");
                }
            }
            AbstractC1534g abstractC1534g = this.this$0.f111219d;
            if (abstractC1534g == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                abstractC1534g = null;
            }
            abstractC1534g.f2507x.setText("");
            this.this$0.mf();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.ChatMsgFragment$onViewCreated$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$onViewCreated$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;
        final ChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ChatMsgFragment chatMsgFragment, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = chatMsgFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
            ChatMsgFragment chatMsgFragment = this.this$0;
            chatMsgFragment.f111222g = true;
            ChatMsgFragment.kf(chatMsgFragment);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.ChatMsgFragment$onViewCreated$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$onViewCreated$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        int label;
        final ChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ChatMsgFragment chatMsgFragment, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = chatMsgFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
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
            ChatMsgFragment chatMsgFragment = this.this$0;
            chatMsgFragment.f111222g = true;
            ChatMsgFragment.kf(chatMsgFragment);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.ChatMsgFragment$onViewCreated$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$onViewCreated$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<ChatMsg, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ChatMsgFragment chatMsgFragment, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = chatMsgFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        public final Object invoke(ChatMsg chatMsg, Continuation<? super Unit> continuation) {
            return create(chatMsg, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 307
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.im.ui.ChatMsgFragment.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.ChatMsgFragment$onViewCreated$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$onViewCreated$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final Context $context;
        int I$0;
        int label;
        final ChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(ChatMsgFragment chatMsgFragment, Context context, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = chatMsgFragment;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(final ChatMsgFragment chatMsgFragment, int i7, Context context) {
            E e7;
            LinkedHashMap<Long, EnterSpecialEvent> linkedHashMap;
            E e8;
            AbstractC1534g abstractC1534g = chatMsgFragment.f111219d;
            AbstractC1534g abstractC1534g2 = abstractC1534g;
            if (abstractC1534g == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                abstractC1534g2 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) abstractC1534g2.f2509z.getLayoutParams();
            if (i7 == 0) {
                marginLayoutParams.bottomMargin = Uj0.c.b(12, context);
                AbstractC1534g abstractC1534g3 = chatMsgFragment.f111219d;
                AbstractC1534g abstractC1534g4 = abstractC1534g3;
                if (abstractC1534g3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    abstractC1534g4 = null;
                }
                abstractC1534g4.f2509z.postDelayed(new Runnable(chatMsgFragment) { // from class: com.bilibili.tgwt.im.ui.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ChatMsgFragment f111294a;

                    {
                        this.f111294a = chatMsgFragment;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f111294a.mf();
                    }
                }, 200L);
            } else {
                marginLayoutParams.bottomMargin = Uj0.c.b(56, context) + i7;
                AbstractC1534g abstractC1534g5 = chatMsgFragment.f111219d;
                AbstractC1534g abstractC1534g6 = abstractC1534g5;
                if (abstractC1534g5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    abstractC1534g6 = null;
                }
                abstractC1534g6.f2509z.postDelayed(new Runnable(chatMsgFragment) { // from class: com.bilibili.tgwt.im.ui.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ChatMsgFragment f111295a;

                    {
                        this.f111295a = chatMsgFragment;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f111295a.mf();
                    }
                }, 200L);
                AbstractC1534g abstractC1534g7 = chatMsgFragment.f111219d;
                AbstractC1534g abstractC1534g8 = abstractC1534g7;
                if (abstractC1534g7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    abstractC1534g8 = null;
                }
                HD0.x xVar = abstractC1534g8.f2505B;
                if (xVar != null && (e8 = xVar.f8337m) != null) {
                    AbstractC1534g abstractC1534g9 = chatMsgFragment.f111219d;
                    AbstractC1534g abstractC1534g10 = abstractC1534g9;
                    if (abstractC1534g9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        abstractC1534g10 = null;
                    }
                    E.n(e8, abstractC1534g10.f2508y.getRoot());
                }
                AbstractC1534g abstractC1534g11 = chatMsgFragment.f111219d;
                AbstractC1534g abstractC1534g12 = abstractC1534g11;
                if (abstractC1534g11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    abstractC1534g12 = null;
                }
                HD0.x xVar2 = abstractC1534g12.f2505B;
                if (xVar2 != null && (e7 = xVar2.f8337m) != null && (linkedHashMap = e7.f8183b) != null) {
                    linkedHashMap.clear();
                }
            }
            AbstractC1534g abstractC1534g13 = chatMsgFragment.f111219d;
            if (abstractC1534g13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                abstractC1534g13 = null;
            }
            abstractC1534g13.f2509z.requestLayout();
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.this$0, this.$context, continuation);
            anonymousClass6.I$0 = ((Number) obj).intValue();
            return anonymousClass6;
        }

        public final Object invoke(int i7, Continuation<? super Unit> continuation) {
            return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final int i7 = this.I$0;
            AbstractC1534g abstractC1534g = this.this$0.f111219d;
            AbstractC1534g abstractC1534g2 = abstractC1534g;
            if (abstractC1534g == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                abstractC1534g2 = null;
            }
            RecyclerView recyclerView = abstractC1534g2.f2509z;
            final ChatMsgFragment chatMsgFragment = this.this$0;
            final Context context = this.$context;
            recyclerView.postDelayed(new Runnable(chatMsgFragment, i7, context) { // from class: com.bilibili.tgwt.im.ui.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ChatMsgFragment f111296a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f111297b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Context f111298c;

                {
                    this.f111296a = chatMsgFragment;
                    this.f111297b = i7;
                    this.f111298c = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatMsgFragment.AnonymousClass6.invokeSuspend$lambda$0(this.f111296a, this.f111297b, this.f111298c);
                }
            }, 100L);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.ChatMsgFragment$onViewCreated$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$onViewCreated$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<Pair<? extends Long, ? extends String>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final ChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(ChatMsgFragment chatMsgFragment, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = chatMsgFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.this$0, continuation);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        public final Object invoke(Pair<Long, String> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Editable text;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.L$0;
            if (com.bilibili.ogv.infra.account.a.f67852b.mid() != ((Number) pair.getFirst()).longValue() && ((CharSequence) pair.getSecond()).length() > 0) {
                ChatMsgFragment.lf(this.this$0, false);
                com.bilibili.tgwt.im.widget.m mVar = this.this$0.f111217b;
                RealInputBar realInputBar = null;
                if (mVar != null) {
                    realInputBar = mVar.f111442g;
                    if (realInputBar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
                        realInputBar = null;
                    }
                }
                if (realInputBar != null && ((text = realInputBar.getText()) == null || !StringsKt.n(text, (CharSequence) pair.getSecond()))) {
                    realInputBar.c("@" + pair.getSecond() + " ");
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.ChatMsgFragment$onViewCreated$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$onViewCreated$8.class */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<EnterSpecialEvent, Continuation<? super Unit>, Object> {
        final Context $context;
        Object L$0;
        int label;
        final ChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(ChatMsgFragment chatMsgFragment, Context context, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.this$0 = chatMsgFragment;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass8 anonymousClass8 = new AnonymousClass8(this.this$0, this.$context, continuation);
            anonymousClass8.L$0 = obj;
            return anonymousClass8;
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
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111220e;
            if (togetherWatchDetailPageViewModel != null) {
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
                if (togetherWatchDetailPageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel2 = null;
                }
                if (!togetherWatchDetailPageViewModel2.getScreenStateService().getScreenStateHelper().a().b) {
                    AbstractC1534g abstractC1534g = this.this$0.f111219d;
                    AbstractC1534g abstractC1534g2 = abstractC1534g;
                    if (abstractC1534g == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        abstractC1534g2 = null;
                    }
                    HD0.x xVar = abstractC1534g2.f2505B;
                    if (xVar != null && (e7 = xVar.f8337m) != null) {
                        Context context = this.$context;
                        AbstractC1534g abstractC1534g3 = this.this$0.f111219d;
                        if (abstractC1534g3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            abstractC1534g3 = null;
                        }
                        e7.m(context, abstractC1534g3.f2508y.getRoot(), true, enterSpecialEvent);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.ChatMsgFragment$onViewCreated$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$onViewCreated$9.class */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<ClearEvent, Continuation<? super Unit>, Object> {
        int label;
        final ChatMsgFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(ChatMsgFragment chatMsgFragment, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = chatMsgFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass9(this.this$0, continuation);
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
            AbstractC1534g abstractC1534g = this.this$0.f111219d;
            AbstractC1534g abstractC1534g2 = abstractC1534g;
            if (abstractC1534g == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                abstractC1534g2 = null;
            }
            HD0.x xVar = abstractC1534g2.f2505B;
            if (xVar != null) {
                xVar.f8328c.clear();
                xVar.f8331f.clear();
                xVar.f8332g.clear();
                xVar.u("");
                xVar.v("");
            }
            return Unit.INSTANCE;
        }
    }

    public static final void jf(ChatMsgFragment chatMsgFragment, Context context, String str, long j7) {
        ChatRoomInfo chatRoomInfo;
        E e7;
        chatMsgFragment.getClass();
        Uri uri = Uri.parse(str);
        if (Intrinsics.areEqual(uri.getHost(), "pgc") && Intrinsics.areEqual(uri.getPath(), "/theater/merge_room")) {
            Activity activityRequireActivity = ContextUtilKt.requireActivity(context);
            Contract contractAb = ConfigManager.Companion.ab();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                Thread threadCurrentThread = Thread.currentThread();
                if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                    IllegalStateException illegalStateException = new IllegalStateException(F.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                    Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
                }
            }
            activityRequireActivity.finish();
            gm.a.b(context, SearchBangumiItem.TYPE_FULLNET_VARIETY, str, (String) null);
            return;
        }
        if (Intrinsics.areEqual(uri.getHost(), "pgc") && Intrinsics.areEqual(uri.getPath(), "/theater/say_hi")) {
            ArrayMap arrayMap = new ArrayMap();
            Ej0.a.a(uri, arrayMap);
            String queryParameter = uri.getQueryParameter("type");
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatMsgFragment.f111220e;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            BangumiUniformSeason season = togetherWatchDetailPageViewModel2.getSeasonService().getSeason();
            long jT = 0;
            if (season != null) {
                ChatRoomInfo chatRoomInfo2 = season.E;
                jT = 0;
                if (chatRoomInfo2 != null) {
                    jT = chatRoomInfo2.t();
                }
            }
            if (queryParameter != null) {
                int iHashCode = queryParameter.hashCode();
                if (iHashCode == 3500) {
                    if (queryParameter.equals("my")) {
                        arrayMap.put("room_id", String.valueOf(jT));
                        arrayMap.put("action_type", "1");
                        arrayMap.put("action_id", String.valueOf(System.currentTimeMillis()));
                        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(chatMsgFragment), (CoroutineContext) null, (CoroutineStart) null, new ChatMsgFragment$clickMsg$1(chatMsgFragment, arrayMap, context, j7, null), 3, (Object) null);
                        return;
                    }
                    return;
                }
                if (iHashCode != 3045982) {
                    if (iHashCode == 106069776 && queryParameter.equals("other")) {
                        arrayMap.put("room_id", String.valueOf(jT));
                        arrayMap.put("action_type", "2");
                        arrayMap.put("action_id", String.valueOf(System.currentTimeMillis()));
                        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(chatMsgFragment), (CoroutineContext) null, (CoroutineStart) null, new ChatMsgFragment$clickMsg$2(chatMsgFragment, arrayMap, context, j7, null), 3, (Object) null);
                        return;
                    }
                    return;
                }
                if (queryParameter.equals(NotificationCompat.CATEGORY_CALL)) {
                    AbstractC1534g abstractC1534g = chatMsgFragment.f111219d;
                    AbstractC1534g abstractC1534g2 = abstractC1534g;
                    if (abstractC1534g == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        abstractC1534g2 = null;
                    }
                    HD0.x xVar = abstractC1534g2.f2505B;
                    if (xVar != null && (e7 = xVar.f8337m) != null) {
                        AbstractC1534g abstractC1534g3 = chatMsgFragment.f111219d;
                        AbstractC1534g abstractC1534g4 = abstractC1534g3;
                        if (abstractC1534g3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            abstractC1534g4 = null;
                        }
                        E.n(e7, abstractC1534g4.f2508y.getRoot());
                    }
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = chatMsgFragment.f111220e;
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
                    if (togetherWatchDetailPageViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        togetherWatchDetailPageViewModel4 = null;
                    }
                    Neurons.reportClick$default(false, !togetherWatchDetailPageViewModel4.getScreenStateService().getScreenStateHelper().a().b ? "pgc.watch-together-cinema.cinema-im.welcome.click" : "pgc.watch-together-fullscreen-cinema.chat-zone.welcome.click", (Map) null, 4, (Object) null);
                    arrayMap.put("room_id", String.valueOf(jT));
                    arrayMap.put("action_type", "3");
                    arrayMap.put("action_id", String.valueOf(System.currentTimeMillis()));
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(chatMsgFragment), (CoroutineContext) null, (CoroutineStart) null, new ChatMsgFragment$clickMsg$3(chatMsgFragment, arrayMap, context, null), 3, (Object) null);
                    return;
                }
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(uri.getHost(), "pgc") || !Intrinsics.areEqual(uri.getPath(), "/theater/follow_other")) {
            if (!Intrinsics.areEqual(uri.getHost(), "pgc") || !Intrinsics.areEqual(uri.getPath(), "/theater/syncProcess")) {
                gm.a.b(context, SearchBangumiItem.TYPE_FULLNET_VARIETY, str, (String) null);
                return;
            }
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = chatMsgFragment.f111220e;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
            if (togetherWatchDetailPageViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel6 = null;
            }
            togetherWatchDetailPageViewModel6.getChatService().w();
            AbstractC1534g abstractC1534g5 = chatMsgFragment.f111219d;
            if (abstractC1534g5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                abstractC1534g5 = null;
            }
            HD0.x xVar2 = abstractC1534g5.f2505B;
            if (xVar2 != null) {
                xVar2.r(j7);
                return;
            }
            return;
        }
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel7 = chatMsgFragment.f111220e;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel8 = togetherWatchDetailPageViewModel7;
        if (togetherWatchDetailPageViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel8 = null;
        }
        BangumiUniformSeason season2 = togetherWatchDetailPageViewModel8.getSeasonService().getSeason();
        long jT2 = (season2 == null || (chatRoomInfo = season2.E) == null) ? 0L : chatRoomInfo.t();
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel9 = chatMsgFragment.f111220e;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel10 = togetherWatchDetailPageViewModel9;
        if (togetherWatchDetailPageViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel10 = null;
        }
        List<ChatRoomMember> listJ = togetherWatchDetailPageViewModel10.getChatRoomManagerService().j();
        if (listJ != null) {
            List<ChatRoomMember> list = listJ;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ChatRoomMember) obj).getMid() != com.bilibili.ogv.infra.account.a.f67852b.mid()) {
                    arrayList.add(obj);
                }
            }
            ChatRoomMember chatRoomMember = (ChatRoomMember) CollectionsKt.getOrNull(arrayList, 0);
            if (chatRoomMember == null) {
                return;
            }
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel11 = chatMsgFragment.f111220e;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel12 = togetherWatchDetailPageViewModel11;
            if (togetherWatchDetailPageViewModel11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel12 = null;
            }
            if (((ChatUserFollowStatus) togetherWatchDetailPageViewModel12.getDetailChatService().c.getValue()) != ChatUserFollowStatus.TYPE_NO_FOLLOW_EACH_OTHER) {
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel13 = chatMsgFragment.f111220e;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel14 = togetherWatchDetailPageViewModel13;
                if (togetherWatchDetailPageViewModel13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel14 = null;
                }
                if (((ChatUserFollowStatus) togetherWatchDetailPageViewModel14.getDetailChatService().c.getValue()) != ChatUserFollowStatus.TYPE_OTHER_FOLLOWED_ME) {
                    AbstractC1534g abstractC1534g6 = chatMsgFragment.f111219d;
                    if (abstractC1534g6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        abstractC1534g6 = null;
                    }
                    HD0.x xVar3 = abstractC1534g6.f2505B;
                    if (xVar3 != null) {
                        xVar3.r(j7);
                    }
                    ToastHelper.showToastShort(context, 2131836287);
                    return;
                }
            }
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(chatMsgFragment), (CoroutineContext) null, (CoroutineStart) null, new ChatMsgFragment$clickMsg$4(chatMsgFragment, chatRoomMember, jT2, j7, context, null), 3, (Object) null);
        }
    }

    public static final void kf(ChatMsgFragment chatMsgFragment) {
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatMsgFragment.f111220e;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        int size = togetherWatchDetailPageViewModel2.getChatService().g().size();
        if (size > 0) {
            AbstractC1534g abstractC1534g = chatMsgFragment.f111219d;
            AbstractC1534g abstractC1534g2 = abstractC1534g;
            if (abstractC1534g == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                abstractC1534g2 = null;
            }
            abstractC1534g2.f2509z.scrollToPosition(size - 1);
            chatMsgFragment.h = 0;
            AbstractC1534g abstractC1534g3 = chatMsgFragment.f111219d;
            if (abstractC1534g3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                abstractC1534g3 = null;
            }
            HD0.x xVar = abstractC1534g3.f2505B;
            if (xVar != null) {
                xVar.u("");
            }
        }
    }

    public static final void lf(ChatMsgFragment chatMsgFragment, boolean z6) {
        if (chatMsgFragment.f111217b == null && chatMsgFragment.getContext() != null) {
            Context contextRequireContext = chatMsgFragment.requireContext();
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatMsgFragment.f111220e;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            ChatRoomManagerService chatRoomManagerService = togetherWatchDetailPageViewModel2.getChatRoomManagerService();
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = chatMsgFragment.f111220e;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
            if (togetherWatchDetailPageViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel4 = null;
            }
            chatMsgFragment.f111217b = new com.bilibili.tgwt.im.widget.m(contextRequireContext, chatRoomManagerService, togetherWatchDetailPageViewModel4.getChatService(), chatMsgFragment.f111225k);
            jK0.a.g(chatMsgFragment.requireContext(), "reply", false, new com.bilibili.tgwt.im.ui.a(chatMsgFragment));
        }
        com.bilibili.tgwt.im.widget.m mVar = chatMsgFragment.f111217b;
        mVar.f111435C = chatMsgFragment.f111229o;
        AbstractC1534g abstractC1534g = chatMsgFragment.f111219d;
        AbstractC1534g abstractC1534g2 = abstractC1534g;
        if (abstractC1534g == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1534g2 = null;
        }
        mVar.f111443i = abstractC1534g2.f2507x;
        com.bilibili.tgwt.im.widget.m mVar2 = chatMsgFragment.f111217b;
        if (mVar2 != null) {
            mVar2.f111445k = z6;
            mVar2.show();
            com.bilibili.tgwt.im.widget.m mVar3 = chatMsgFragment.f111217b;
            e eVar = chatMsgFragment.f111228n;
            if (!((ArrayList) mVar3.f111447m).contains(eVar)) {
                ((ArrayList) mVar3.f111447m).add(eVar);
            }
            RealInputBar realInputBar = chatMsgFragment.f111217b.f111442g;
            if (realInputBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputBar");
                realInputBar = null;
            }
            realInputBar.setOnSentListener(chatMsgFragment.f111227m);
        }
    }

    public final void mf() {
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111220e;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        int size = togetherWatchDetailPageViewModel2.getChatService().g().size();
        if (size > 0) {
            AbstractC1534g abstractC1534g = this.f111219d;
            AbstractC1534g abstractC1534g2 = abstractC1534g;
            if (abstractC1534g == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                abstractC1534g2 = null;
            }
            abstractC1534g2.f2509z.smoothScrollToPosition(size - 1);
            this.h = 0;
            AbstractC1534g abstractC1534g3 = this.f111219d;
            if (abstractC1534g3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                abstractC1534g3 = null;
            }
            HD0.x xVar = abstractC1534g3.f2505B;
            if (xVar != null) {
                xVar.u("");
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        AbstractC1534g abstractC1534g;
        E e7;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != 1 || (abstractC1534g = this.f111219d) == null) {
            return;
        }
        abstractC1534g.f2509z.postDelayed(new BQ0.a(this, 2), 100L);
        AbstractC1534g abstractC1534g2 = this.f111219d;
        AbstractC1534g abstractC1534g3 = abstractC1534g2;
        if (abstractC1534g2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1534g3 = null;
        }
        HD0.x xVar = abstractC1534g3.f2505B;
        if (xVar == null || (e7 = xVar.f8337m) == null) {
            return;
        }
        AbstractC1534g abstractC1534g4 = this.f111219d;
        if (abstractC1534g4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1534g4 = null;
        }
        E.n(e7, abstractC1534g4.f2508y.getRoot());
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f111220e = (TogetherWatchDetailPageViewModel) R0.k.a(requireActivity(), TogetherWatchDetailPageViewModel.class);
        AbstractC1534g abstractC1534gInflate = AbstractC1534g.inflate(layoutInflater, viewGroup, false);
        this.f111219d = abstractC1534gInflate;
        AbstractC1534g abstractC1534g = abstractC1534gInflate;
        if (abstractC1534gInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1534g = null;
        }
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111220e;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        abstractC1534g.q(togetherWatchDetailPageViewModel2.getChatService().f111861J);
        AbstractC1534g abstractC1534g2 = this.f111219d;
        AbstractC1534g abstractC1534g3 = abstractC1534g2;
        if (abstractC1534g2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1534g3 = null;
        }
        abstractC1534g3.f2505B.getClass();
        AbstractC1534g abstractC1534g4 = this.f111219d;
        AbstractC1534g abstractC1534g5 = abstractC1534g4;
        if (abstractC1534g4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1534g5 = null;
        }
        abstractC1534g5.f2505B.f8337m.f8192l = this.f111226l;
        AbstractC1534g abstractC1534g6 = this.f111219d;
        AbstractC1534g abstractC1534g7 = abstractC1534g6;
        if (abstractC1534g6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1534g7 = null;
        }
        abstractC1534g7.f2505B.f8339o = this.f111226l;
        AbstractC1534g abstractC1534g8 = this.f111219d;
        AbstractC1534g abstractC1534g9 = abstractC1534g8;
        if (abstractC1534g8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1534g9 = null;
        }
        abstractC1534g9.f2507x.setOnInputBarClickListener(this.f111224j);
        AbstractC1534g abstractC1534g10 = this.f111219d;
        if (abstractC1534g10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1534g10 = null;
        }
        return abstractC1534g10.getRoot();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        AbstractC1534g abstractC1534g = this.f111219d;
        AbstractC1534g abstractC1534g2 = abstractC1534g;
        if (abstractC1534g == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1534g2 = null;
        }
        abstractC1534g2.unbind();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            return;
        }
        AbstractC1534g abstractC1534g = this.f111219d;
        AbstractC1534g abstractC1534g2 = abstractC1534g;
        if (abstractC1534g == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1534g2 = null;
        }
        abstractC1534g2.f2509z.addItemDecoration(new f(context));
        AbstractC1534g abstractC1534g3 = this.f111219d;
        AbstractC1534g abstractC1534g4 = abstractC1534g3;
        if (abstractC1534g3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1534g4 = null;
        }
        abstractC1534g4.f2509z.addOnScrollListener(new g(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111220e;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel2.getChatService().f111885d0, new AnonymousClass3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.f111220e;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
        if (togetherWatchDetailPageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel4 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel4.getChatService().f111883c0, new AnonymousClass4(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = this.f111220e;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
        if (togetherWatchDetailPageViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel6 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel6.getChatRoomManagerService().f110926s, new AnonymousClass5(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel7 = this.f111220e;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel8 = togetherWatchDetailPageViewModel7;
        if (togetherWatchDetailPageViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel8 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel8.getChatRoomManagerService().f110930w, new AnonymousClass6(this, context, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel9 = this.f111220e;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel10 = togetherWatchDetailPageViewModel9;
        if (togetherWatchDetailPageViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel10 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel10.getChatRoomManagerService().f110888B, new AnonymousClass7(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel11 = this.f111220e;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel12 = togetherWatchDetailPageViewModel11;
        if (togetherWatchDetailPageViewModel11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel12 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel12.getChatRoomManagerService().f110892F, new AnonymousClass8(this, context, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel13 = this.f111220e;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel14 = togetherWatchDetailPageViewModel13;
        if (togetherWatchDetailPageViewModel13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel14 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel14.getChatRoomManagerService().f110893G, new AnonymousClass9(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel15 = this.f111220e;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel16 = togetherWatchDetailPageViewModel15;
        if (togetherWatchDetailPageViewModel15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel16 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel16.getSeasonService().getSeasonObservable(), new AnonymousClass10(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        BuildersKt.launch$default(LifecycleKt.getCoroutineScope(getLifecycle()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass11(this, null), 3, (Object) null);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel17 = this.f111220e;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel18 = togetherWatchDetailPageViewModel17;
        if (togetherWatchDetailPageViewModel17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel18 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel18.getChatService().f111906y, new AnonymousClass12(this, null)), LifecycleKt.getCoroutineScope(getLifecycle()));
    }
}
