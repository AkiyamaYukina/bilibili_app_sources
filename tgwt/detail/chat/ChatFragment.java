package com.bilibili.tgwt.detail.chat;

import DD0.A;
import DD0.j0;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ObservableField;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.TransitionManager;
import com.alipay.sdk.app.PayTask;
import com.bilibili.app.comm.supermenu.core.IMenuPanel;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuItemClickListenerV2;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuVisibilityChangeListenerV2;
import com.bilibili.bangumi.data.page.detail.entity.BangumiModule;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiPopFragmentService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiPopPageType;
import com.bilibili.bangumi.logic.page.detail.service.refactor.FetchShareMenuCallback;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewShareService;
import com.bilibili.bangumi.module.chatroom.ChatConfigType;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfig;
import com.bilibili.bangumi.module.chatroom.ChatRoomConfigValue;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.bangumi.ui.page.detail.introduction.fragment.BangumiPopFragmentShowType;
import com.bilibili.bplus.followingpublish.fragments.y0;
import com.bilibili.chatroom.widget.userDialog.ChatUserFollowStatus;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.homepage.startdust.secondary.BasePrimaryMultiPageFragment;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.detail.chat.ChatFragment;
import com.bilibili.tgwt.im.ui.ChatMsgFragment;
import com.bilibili.tgwt.im.ui.CinemaSettingsDialog;
import com.bilibili.tgwt.service.ChatService;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import hm.c;
import io.reactivex.rxjava3.internal.observers.CallbackCompletableObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment.class */
@StabilityInferred(parameters = 0)
public final class ChatFragment extends BaseFragment {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public ValueAnimator f111010A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f111012C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f111013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Long f111014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f111015d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f111017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f111018g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TogetherWatchDetailPageViewModel f111019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public A f111020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f111021k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f111023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f111024n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f111025o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f111026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f111027q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f111016e = 30000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Handler f111022l = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final ChatRoomOperationService f111028r = (ChatRoomOperationService) ServiceGenerator.createService(ChatRoomOperationService.class);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final gV.b f111029s = new gV.b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final JT0.b f111030t = new JT0.b(this, 1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Yb.d f111031u = new Yb.d(this, 3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public List<ChatRoomMember> f111032v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final d f111033w = new d(this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final f f111034x = new View.OnClickListener(this) { // from class: com.bilibili.tgwt.detail.chat.f

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatFragment f111061a;

        {
            this.f111061a = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ChatFragment chatFragment = this.f111061a;
            List<ChatRoomMember> list = chatFragment.f111032v;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ChatRoomMember) obj).getMid() == com.bilibili.ogv.infra.account.a.f67852b.mid()) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatFragment.f111019i;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            togetherWatchDetailPageViewModel2.getDetailChatService().a((ChatRoomMember) arrayList.get(0));
        }
    };

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final OV.a f111035y = new OV.a(this, 2);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final g f111036z = new View.OnLongClickListener(this) { // from class: com.bilibili.tgwt.detail.chat.g

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatFragment f111062a;

        {
            this.f111062a = this;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            ChatFragment chatFragment = this.f111062a;
            List<ChatRoomMember> list = chatFragment.f111032v;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ChatRoomMember) obj).getMid() != com.bilibili.ogv.infra.account.a.f67852b.mid()) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatFragment.f111019i;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            ChatRoomManagerService chatRoomManagerService = togetherWatchDetailPageViewModel2.getChatRoomManagerService();
            long mid = ((ChatRoomMember) arrayList.get(0)).getMid();
            String nickname = ((ChatRoomMember) arrayList.get(0)).getNickname();
            String str = nickname;
            if (nickname == null) {
                str = "";
            }
            chatRoomManagerService.f110888B.setValue(new Pair(Long.valueOf(mid), str));
            return false;
        }
    };

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f111011B = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends ListAdapter<n, b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final C1217a f111037d = new DiffUtil.ItemCallback();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public BJ.i f111038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Se.b f111039c;

        /* JADX INFO: renamed from: com.bilibili.tgwt.detail.chat.ChatFragment$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$a$a.class */
        public static final class C1217a extends DiffUtil.ItemCallback<n> {
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public final boolean areContentsTheSame(n nVar, n nVar2) {
                return nVar.f111083b.get() == nVar2.f111083b.get();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public final boolean areItemsTheSame(n nVar, n nVar2) {
                return nVar.f111082a == nVar2.f111082a;
            }
        }

        public a(@NotNull Context context) {
            super(f111037d);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            b bVar = (b) viewHolder;
            bVar.f111040a.q(getItem(i7));
            j0 j0Var = bVar.f111040a;
            j0Var.executePendingBindings();
            final View view = bVar.itemView;
            n nVar = j0Var.f2541x;
            view.setTag(2131304650, nVar != null ? Long.valueOf(nVar.f111082a) : null);
            view.setOnClickListener(new OV.e(1, this, view));
            view.setOnLongClickListener(new View.OnLongClickListener(this, view) { // from class: com.bilibili.tgwt.detail.chat.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ChatFragment.a f111064a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final View f111065b;

                {
                    this.f111064a = this;
                    this.f111065b = view;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    ChatFragment.a aVar = this.f111064a;
                    View view3 = this.f111065b;
                    Se.b bVar2 = aVar.f111039c;
                    if (bVar2 == null) {
                        return false;
                    }
                    bVar2.invoke((Long) view3.getTag(2131304650));
                    return false;
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(j0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final j0 f111040a;

        public b(@NotNull j0 j0Var) {
            super(j0Var.getRoot());
            this.f111040a = j0Var;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$c.class */
    public static final class c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatFragment f111041a;

        public c(ChatFragment chatFragment) {
            this.f111041a = chatFragment;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0151  */
        @Override // android.animation.Animator.AnimatorListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onAnimationEnd(android.animation.Animator r8) {
            /*
                Method dump skipped, instruction units count: 556
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.detail.chat.ChatFragment.c.onAnimationEnd(android.animation.Animator):void");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f111041a.f111012C = true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$d.class */
    public static final class d implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatFragment f111042a;

        public d(ChatFragment chatFragment) {
            this.f111042a = chatFragment;
        }

        @Override // com.bilibili.tgwt.detail.chat.v
        public final void a() {
            ChatFragment chatFragment = this.f111042a;
            p pVar = chatFragment.f111021k;
            p pVar2 = pVar;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar2 = null;
            }
            ChatRoomConfig chatRoomConfig = pVar2.f111109U;
            ChatRoomConfigValue chatRoomConfigValueB = chatRoomConfig != null ? chatRoomConfig.b() : null;
            if ((chatRoomConfigValueB != null ? chatRoomConfigValueB.a() : null) != ChatConfigType.UNAVAILABLE_AND_VISIBLE) {
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(chatFragment.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new ChatFragment$roomEventListener$1$onChangeRoomClick$1(chatFragment, null), 3, (Object) null);
                Neurons.reportClick$default(false, "pgc.watch-together-cinema.cinema-audience.change-room.click", (Map) null, 4, (Object) null);
                return;
            }
            Context context = chatFragment.getContext();
            String strB = chatRoomConfigValueB.b();
            String str = strB;
            if (strB == null) {
                str = "";
            }
            ToastHelper.showToastShort(context, str);
        }

        @Override // com.bilibili.tgwt.detail.chat.v
        public final void b() {
            ChatFragment chatFragment = this.f111042a;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatFragment.f111019i;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            cf.p.b("is_full_screen", !togetherWatchDetailPageViewModel2.getScreenStateService().getScreenStateHelper().a().b ? "0" : "1", "pgc.watch-together-cinema.cinema-im.im-message.click", false);
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = chatFragment.f111019i;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
            if (togetherWatchDetailPageViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel4 = null;
            }
            ChatService chatService = togetherWatchDetailPageViewModel4.getChatService();
            p pVar = chatFragment.f111021k;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar = null;
            }
            chatService.t(!pVar.f111121g);
        }

        @Override // com.bilibili.tgwt.detail.chat.v
        public final void c() {
            Neurons.reportClick$default(false, "pgc.watch-together-cinema.cinema-im.notice.click", (Map) null, 4, (Object) null);
            new com.bilibili.tgwt.im.ui.l(this.f111042a.requireContext()).show();
        }

        @Override // com.bilibili.tgwt.detail.chat.v
        public final void d() {
            List list;
            BangumiModule bangumiModule;
            ChatFragment chatFragment = this.f111042a;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatFragment.f111019i;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            BangumiUniformSeason season = togetherWatchDetailPageViewModel2.getSeasonService().getSeason();
            if (season == null || (list = season.B) == null) {
                return;
            }
            BangumiModule.Type type = BangumiModule.Type.EP_LIST;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bangumiModule = null;
                    break;
                }
                BangumiModule bangumiModule2 = (BangumiModule) it.next();
                if ((bangumiModule2 != null ? bangumiModule2.a : null) == type) {
                    bangumiModule = bangumiModule2;
                    break;
                }
            }
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = chatFragment.f111019i;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
            if (togetherWatchDetailPageViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel4 = null;
            }
            BangumiPopFragmentService popFragmentService = togetherWatchDetailPageViewModel4.getPopFragmentService();
            BangumiPopPageType bangumiPopPageType = BangumiPopPageType.FEATURE_EP_PAGE_TYPE;
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("show_type", BangumiPopFragmentShowType.MODULE_STYLE.getValue());
            Long lValueOf = null;
            if (bangumiModule != null) {
                lValueOf = Long.valueOf(bangumiModule.b);
            }
            mapCreateMapBuilder.put("module_id", String.valueOf(lValueOf));
            Unit unit = Unit.INSTANCE;
            BangumiPopFragmentService.showPopFragment$default(popFragmentService, bangumiPopPageType, MapsKt.build(mapCreateMapBuilder), 0, 4, (Object) null);
        }

        @Override // com.bilibili.tgwt.detail.chat.v
        public final void e(View view) {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            ChatFragment chatFragment = this.f111042a;
            p pVar = chatFragment.f111021k;
            p pVar2 = pVar;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar2 = null;
            }
            mapCreateMapBuilder.put("room_state", pVar2.f111120f.get() ? "0" : "1");
            Unit unit = Unit.INSTANCE;
            Neurons.reportClick(false, "pgc.watch-together-cinema.cinema-audience.public-room.click", MapsKt.build(mapCreateMapBuilder));
            if (System.currentTimeMillis() - chatFragment.f111015d < PayTask.f60018j) {
                ToastHelper.showToastShort(chatFragment.getContext(), 2131836336);
                return;
            }
            A a7 = chatFragment.f111020j;
            A a8 = a7;
            if (a7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a8 = null;
            }
            if (a8.f2196Z.isChecked()) {
                ChatFragment.jf(chatFragment, false);
                return;
            }
            c.a aVar = new c.a(view.getContext());
            aVar.b = chatFragment.getString(2131836260);
            aVar.b(chatFragment.getString(2131836253), (Function1) null);
            aVar.c(chatFragment.getString(2131836318), new HY0.i(chatFragment, 3));
            aVar.a().show();
        }

        @Override // com.bilibili.tgwt.detail.chat.v
        public final void f(View view) {
            p pVar = this.f111042a.f111021k;
            p pVar2 = pVar;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar2 = null;
            }
            if (pVar2.f111131r.get() == 6) {
                Neurons.reportClick$default(false, "pgc.watch-together-cinema.cinema-audience.settings.click", (Map) null, 4, (Object) null);
                new CinemaSettingsDialog(view.getContext()).show();
            }
        }
    }

    public static final void jf(ChatFragment chatFragment, boolean z6) {
        A a7 = chatFragment.f111020j;
        A a8 = a7;
        if (a7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a8 = null;
        }
        a8.f2198a0.setClickable(false);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(chatFragment), (CoroutineContext) null, (CoroutineStart) null, new ChatFragment$requestChatSettingPublicChange$1(chatFragment, z6, null), 3, (Object) null);
    }

    public final void kf() {
        if (this.f111012C) {
            return;
        }
        A a7 = this.f111020j;
        A a8 = a7;
        if (a7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a8 = null;
        }
        a8.f2177I.measure(0, 0);
        A a9 = this.f111020j;
        A a10 = a9;
        if (a9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a10 = null;
        }
        final int height = a10.f2169A.getHeight();
        A a11 = this.f111020j;
        if (a11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a11 = null;
        }
        int iB = Uj0.c.b(16, requireContext()) + a11.f2177I.getMeasuredHeight();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, iB);
        valueAnimatorOfInt.setDuration(200L);
        final int i7 = height - iB;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(height, i7, this) { // from class: com.bilibili.tgwt.detail.chat.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f111052a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f111053b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ChatFragment f111054c;

            {
                this.f111052a = height;
                this.f111053b = i7;
                this.f111054c = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i8 = this.f111052a;
                int i9 = this.f111053b;
                ChatFragment chatFragment = this.f111054c;
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                float f7 = (i8 - iIntValue) / i9;
                A a12 = chatFragment.f111020j;
                A a13 = a12;
                if (a12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a13 = null;
                }
                ViewGroup.LayoutParams layoutParams = a13.f2173E.getLayoutParams();
                layoutParams.height = iIntValue;
                A a14 = chatFragment.f111020j;
                A a15 = a14;
                if (a14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a15 = null;
                }
                a15.f2173E.setLayoutParams(layoutParams);
                A a16 = chatFragment.f111020j;
                A a17 = a16;
                if (a16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a17 = null;
                }
                a17.f2177I.setVisibility(0);
                A a18 = chatFragment.f111020j;
                A a19 = a18;
                if (a18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a19 = null;
                }
                a19.f2176H.setVisibility(0);
                A a20 = chatFragment.f111020j;
                A a21 = a20;
                if (a20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a21 = null;
                }
                a21.f2177I.setAlpha(f7);
                A a22 = chatFragment.f111020j;
                if (a22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a22 = null;
                }
                a22.f2176H.setAlpha(1 - f7);
            }
        });
        valueAnimatorOfInt.addListener(new c(this));
        valueAnimatorOfInt.start();
        this.f111010A = valueAnimatorOfInt;
    }

    public final void lf() {
        ChatRoomInfo chatRoomInfo;
        ChatRoomConfig chatRoomConfigS;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        togetherWatchDetailPageViewModel2.getPageReportService().e("pgc.watch-together-cinema.cinema-audience.invite.click", (Map) null);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
        if (togetherWatchDetailPageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel4 = null;
        }
        BangumiUniformSeason season = togetherWatchDetailPageViewModel4.getSeasonService().getSeason();
        ChatRoomConfigValue chatRoomConfigValueF = (season == null || (chatRoomInfo = season.E) == null || (chatRoomConfigS = chatRoomInfo.s()) == null) ? null : chatRoomConfigS.f();
        if ((chatRoomConfigValueF != null ? chatRoomConfigValueF.a() : null) == null || chatRoomConfigValueF.a() == ChatConfigType.AVAILABLE_AND_VISIBLE) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = this.f111019i;
            if (togetherWatchDetailPageViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel5 = null;
            }
            NewShareService.showMenu$default(togetherWatchDetailPageViewModel5.getShareService(), requireContext(), "ogv_video_detail_member_list_invite_together_watch_share", (FetchShareMenuCallback) null, (OnMenuItemClickListenerV2) null, (IMenuPanel) null, (OnMenuVisibilityChangeListenerV2) null, 60, (Object) null);
            return;
        }
        Context context = getContext();
        String strB = chatRoomConfigValueF.b();
        String str = strB;
        if (strB == null) {
            str = "";
        }
        ToastHelper.showToastShort(context, str);
    }

    public final void mf() {
        p pVar = this.f111021k;
        p pVar2 = pVar;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar2 = null;
        }
        if (pVar2.h.get() && getResources().getConfiguration().orientation == 1 && !this.f111025o) {
            p pVar3 = this.f111021k;
            p pVar4 = pVar3;
            if (pVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar4 = null;
            }
            if (pVar4.f111131r.get() != 1) {
                Neurons.reportExposure$default(false, "pgc.watch-together-cinema.cinema-audience.public-room.show", (Map) null, (List) null, 12, (Object) null);
                this.f111025o = true;
            }
        }
        p pVar5 = this.f111021k;
        p pVar6 = pVar5;
        if (pVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar6 = null;
        }
        if (!pVar6.h.get() && getResources().getConfiguration().orientation == 1 && !this.f111026p) {
            p pVar7 = this.f111021k;
            p pVar8 = pVar7;
            if (pVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                pVar8 = null;
            }
            if (pVar8.f111131r.get() != 1) {
                Neurons.reportExposure$default(false, "pgc.watch-together-cinema.cinema-audience.change-room.show", (Map) null, (List) null, 12, (Object) null);
                this.f111026p = true;
            }
        }
        p pVar9 = this.f111021k;
        p pVar10 = pVar9;
        if (pVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar10 = null;
        }
        if (pVar10.h.get()) {
            return;
        }
        p pVar11 = this.f111021k;
        if (pVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar11 = null;
        }
        if (pVar11.f111131r.get() == 6 && getResources().getConfiguration().orientation == 1 && !this.f111027q) {
            Neurons.reportExposure$default(false, "pgc.watch-together-cinema.cinema-im.im-message.show", MapsKt.mapOf(TuplesKt.to("is_full_screen", "0")), (List) null, 8, (Object) null);
            this.f111027q = true;
        }
    }

    public final void nf(int i7) {
        int i8 = this.f111023m;
        if (i8 != i7) {
            if (i8 == 62) {
                this.f111022l.removeCallbacks(this.f111030t);
                if (i7 == 46) {
                    this.f111022l.postDelayed(this.f111031u, PayTask.f60018j);
                } else {
                    this.f111022l.postDelayed(new JS0.q(this, 2), 200L);
                }
            } else if (i7 == 62) {
                this.f111022l.removeCallbacks(this.f111031u);
                p pVar = this.f111021k;
                p pVar2 = pVar;
                if (pVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar2 = null;
                }
                pVar2.f111136w.set(true);
                p pVar3 = this.f111021k;
                if (pVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar3 = null;
                }
                pVar3.f111136w.notifyChange();
                final int i9 = 0;
                this.f111022l.postDelayed(new Runnable(this, i9) { // from class: com.bilibili.tgwt.detail.chat.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f111059a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final BaseFragment f111060b;

                    {
                        this.f111059a = i9;
                        this.f111060b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (this.f111059a) {
                            case 0:
                                ChatFragment chatFragment = (ChatFragment) this.f111060b;
                                if (chatFragment.getView() instanceof ViewGroup) {
                                    TransitionManager.beginDelayedTransition((ViewGroup) chatFragment.getView());
                                }
                                p pVar4 = chatFragment.f111021k;
                                p pVar5 = pVar4;
                                if (pVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                                    pVar5 = null;
                                }
                                pVar5.f111133t.set(true);
                                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatFragment.f111019i;
                                if (togetherWatchDetailPageViewModel == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                    togetherWatchDetailPageViewModel = null;
                                }
                                togetherWatchDetailPageViewModel.getChatRoomManagerService().l(ChatRoomManagerService.HalfScreenChatPopLayerType.WAIT_PEOPLE_POP_LAYER, true);
                                break;
                            default:
                                ((BasePrimaryMultiPageFragment) this.f111060b).k.setVisibility(8);
                                break;
                        }
                    }
                }, 200L);
                this.f111022l.postDelayed(this.f111030t, this.f111018g == 0 ? this.f111016e : this.f111016e * ((long) 2));
            }
            this.f111023m = i7;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            mf();
        }
        if (configuration.orientation == 2 && this.f111020j != null && this.f111011B) {
            kf();
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = (TogetherWatchDetailPageViewModel) new ViewModelProvider(requireActivity()).get(TogetherWatchDetailPageViewModel.class);
        this.f111019i = togetherWatchDetailPageViewModel;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        p pVar = new p(togetherWatchDetailPageViewModel2.getChatRoomManagerService(), this.f111033w);
        pVar.f111123j.set(8);
        pVar.f111125l.set(false);
        this.f111021k = pVar;
        gV.b bVar = this.f111029s;
        bVar.d = new Function0(this) { // from class: com.bilibili.tgwt.detail.chat.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatFragment f111063a;

            {
                this.f111063a = this;
            }

            public final Object invoke() {
                ChatRoomInfo chatRoomInfo;
                ChatFragment chatFragment = this.f111063a;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = chatFragment.f111019i;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
                if (togetherWatchDetailPageViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel4 = null;
                }
                BangumiUniformSeason season = togetherWatchDetailPageViewModel4.getSeasonService().getSeason();
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(chatFragment), (CoroutineContext) null, (CoroutineStart) null, new ChatFragment$onCreate$1$1(chatFragment, (season == null || (chatRoomInfo = season.E) == null) ? 0L : chatRoomInfo.t(), null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        };
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.f111019i;
        if (togetherWatchDetailPageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel3 = null;
        }
        bVar.b(togetherWatchDetailPageViewModel3.getActivityContextParamsService().getImmutable().getChatValidDauReportTime());
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        A aInflate = A.inflate(layoutInflater, viewGroup, false);
        p pVar = this.f111021k;
        p pVar2 = pVar;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar2 = null;
        }
        aInflate.q(pVar2);
        this.f111020j = aInflate;
        aInflate.f2203d1.setSelected(true);
        A a7 = this.f111020j;
        if (a7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7 = null;
        }
        return a7.f2192X;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        gV.b bVar = this.f111029s;
        CallbackCompletableObserver callbackCompletableObserver = bVar.a;
        if (callbackCompletableObserver != null) {
            callbackCompletableObserver.dispose();
        }
        bVar.c.clear();
        super.onDestroy();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f111022l.removeCallbacksAndMessages(null);
        super.onDestroyView();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f111024n) {
            int i7 = this.f111018g;
            if (i7 < 2) {
                this.f111018g = i7 + 1;
            }
            this.f111024n = false;
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        A a7 = this.f111020j;
        A a8 = a7;
        if (a7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a8 = null;
        }
        RecyclerView recyclerView = a8.f2170B;
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration());
        a aVar = new a(recyclerView.getContext());
        aVar.f111038b = new BJ.i(this, 1);
        aVar.f111039c = new Se.b(this, 2);
        this.f111013b = aVar;
        recyclerView.setAdapter(aVar);
        A a9 = this.f111020j;
        A a10 = a9;
        if (a9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a10 = null;
        }
        a10.f2184P.setOnClickListener(new BF0.g(2, this));
        A a11 = this.f111020j;
        A a12 = a11;
        if (a11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a12 = null;
        }
        a12.f2185Q.setOnClickListener(new Kf1.i(this, 3));
        p pVar = this.f111021k;
        p pVar2 = pVar;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar2 = null;
        }
        pVar2.f111113Y.set(new k(this));
        p pVar3 = this.f111021k;
        p pVar4 = pVar3;
        if (pVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar4 = null;
        }
        l lVar = new l(this);
        if (!Intrinsics.areEqual(lVar, pVar4.f111114Z)) {
            pVar4.f111114Z = lVar;
            pVar4.notifyPropertyChanged(554);
        }
        A a13 = this.f111020j;
        A a14 = a13;
        if (a13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a14 = null;
        }
        a14.f2181M.setOnClickListener(new Kf1.j(this, 3));
        A a15 = this.f111020j;
        A a16 = a15;
        if (a15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a16 = null;
        }
        a16.f2191W.setOnClickListener(new y0(this, 1));
        A a17 = this.f111020j;
        A a18 = a17;
        if (a17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a18 = null;
        }
        a18.f2191W.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.tgwt.detail.chat.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatFragment f111055a;

            {
                this.f111055a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                ChatFragment chatFragment = this.f111055a;
                List<ChatRoomMember> list = chatFragment.f111032v;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    p pVar5 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ChatRoomMember chatRoomMember = (ChatRoomMember) next;
                    p pVar6 = chatFragment.f111021k;
                    if (pVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    } else {
                        pVar5 = pVar6;
                    }
                    n nVar = pVar5.f111119e.get();
                    if (nVar != null && chatRoomMember.getMid() == nVar.f111082a) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.isEmpty()) {
                    return false;
                }
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatFragment.f111019i;
                if (togetherWatchDetailPageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel = null;
                }
                ChatRoomManagerService chatRoomManagerService = togetherWatchDetailPageViewModel.getChatRoomManagerService();
                long mid = ((ChatRoomMember) arrayList.get(0)).getMid();
                String nickname = ((ChatRoomMember) arrayList.get(0)).getNickname();
                String str = nickname;
                if (nickname == null) {
                    str = "";
                }
                chatRoomManagerService.f110888B.setValue(new Pair(Long.valueOf(mid), str));
                return false;
            }
        });
        A a19 = this.f111020j;
        A a20 = a19;
        if (a19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a20 = null;
        }
        a20.f2193X0.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.tgwt.detail.chat.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatFragment f111056a;

            {
                this.f111056a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatFragment chatFragment = this.f111056a;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatFragment.f111019i;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
                if (togetherWatchDetailPageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel2 = null;
                }
                ChatUserFollowStatus chatUserFollowStatus = (ChatUserFollowStatus) togetherWatchDetailPageViewModel2.getDetailChatService().c.getValue();
                if (chatUserFollowStatus == ChatUserFollowStatus.TYPE_I_FOLLOWED_OTHER || chatUserFollowStatus == ChatUserFollowStatus.TYPE_FOLLOW_EACH_OTHER) {
                    return;
                }
                List<ChatRoomMember> list = chatFragment.f111032v;
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
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.put("follow_status", String.valueOf(chatUserFollowStatus));
                mapCreateMapBuilder.put("to_mid", String.valueOf(chatRoomMember.getMid()));
                Unit unit = Unit.INSTANCE;
                Neurons.reportClick(false, "pgc.watch-together-cinema.cinema-audience.follow.click", MapsKt.build(mapCreateMapBuilder));
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(chatFragment), (CoroutineContext) null, (CoroutineStart) null, new ChatFragment$initView$9$2(chatFragment, chatRoomMember, null), 3, (Object) null);
            }
        });
        A a21 = this.f111020j;
        A a22 = a21;
        if (a21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a22 = null;
        }
        a22.f2175G.setOnClickListener(this.f111035y);
        A a23 = this.f111020j;
        A a24 = a23;
        if (a23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a24 = null;
        }
        a24.f2175G.setOnLongClickListener(this.f111036z);
        A a25 = this.f111020j;
        A a26 = a25;
        if (a25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a26 = null;
        }
        a26.f2179K.setOnClickListener(this.f111035y);
        A a27 = this.f111020j;
        A a28 = a27;
        if (a27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a28 = null;
        }
        a28.f2179K.setOnLongClickListener(this.f111036z);
        A a29 = this.f111020j;
        A a30 = a29;
        if (a29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a30 = null;
        }
        a30.f2174F.setOnClickListener(this.f111034x);
        A a31 = this.f111020j;
        A a32 = a31;
        if (a31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a32 = null;
        }
        a32.f2178J.setOnClickListener(this.f111034x);
        A a33 = this.f111020j;
        A a34 = a33;
        if (a33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a34 = null;
        }
        a34.f2186R.setOnClickListener(new com.bilibili.tgwt.detail.chat.d(this, 0));
        ChatMsgFragment chatMsgFragment = new ChatMsgFragment();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (chatMsgFragment.isAdded()) {
            parentFragmentManager.beginTransaction().show(chatMsgFragment).commitAllowingStateLoss();
        } else {
            parentFragmentManager.beginTransaction().add(2131298710, chatMsgFragment).commitAllowingStateLoss();
        }
        p pVar5 = this.f111021k;
        p pVar6 = pVar5;
        if (pVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar6 = null;
        }
        ObservableField<Typeface> observableField = pVar6.f111090B;
        Context context = getContext();
        observableField.set(Typeface.createFromAsset(context != null ? context.getAssets() : null, "ott-Regular.otf"));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(togetherWatchDetailPageViewModel2.getChatRoomManagerService().f110925r), new ChatFragment$subscribeData$1(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
        if (togetherWatchDetailPageViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel4 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(togetherWatchDetailPageViewModel4.getChatRoomManagerService().f110924q), new ChatFragment$subscribeData$2(this, null)), LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
        if (togetherWatchDetailPageViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel6 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel6.getChatRoomManagerService().f110929v, new ChatFragment$subscribeData$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel7 = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel8 = togetherWatchDetailPageViewModel7;
        if (togetherWatchDetailPageViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel8 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel8.getChatRoomManagerService().f110930w, new ChatFragment$subscribeData$4(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel9 = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel10 = togetherWatchDetailPageViewModel9;
        if (togetherWatchDetailPageViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel10 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel10.getDetailChatService().c, new ChatFragment$subscribeData$5(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel11 = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel12 = togetherWatchDetailPageViewModel11;
        if (togetherWatchDetailPageViewModel11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel12 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel12.getDetailChatService().a, new ChatFragment$subscribeData$6(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel13 = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel14 = togetherWatchDetailPageViewModel13;
        if (togetherWatchDetailPageViewModel13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel14 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel14.getDetailChatService().b, new ChatFragment$subscribeData$7(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel15 = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel16 = togetherWatchDetailPageViewModel15;
        if (togetherWatchDetailPageViewModel15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel16 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel16.getPlayControlService().getCurrentEpisodeFlow(), new ChatFragment$subscribeData$8(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel17 = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel18 = togetherWatchDetailPageViewModel17;
        if (togetherWatchDetailPageViewModel17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel18 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel18.getSeasonService().getSeasonObservable(), new ChatFragment$subscribeData$9(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel19 = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel20 = togetherWatchDetailPageViewModel19;
        if (togetherWatchDetailPageViewModel19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel20 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel20.getChatRoomManagerService().f110889C, new ChatFragment$subscribeData$10(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel21 = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel22 = togetherWatchDetailPageViewModel21;
        if (togetherWatchDetailPageViewModel21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel22 = null;
        }
        MutableStateFlow<Boolean> mutableStateFlow = togetherWatchDetailPageViewModel22.getChatRoomManagerService().f110890D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel23 = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel24 = togetherWatchDetailPageViewModel23;
        if (togetherWatchDetailPageViewModel23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel24 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(FlowKt.combine(mutableStateFlow, togetherWatchDetailPageViewModel24.getChatRoomManagerService().f110930w, ChatFragment$subscribeData$13.INSTANCE), new ChatFragment$subscribeData$14(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel25 = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel26 = togetherWatchDetailPageViewModel25;
        if (togetherWatchDetailPageViewModel25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel26 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel26.getChatRoomManagerService().f110891E, new ChatFragment$subscribeData$15(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel27 = this.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel28 = togetherWatchDetailPageViewModel27;
        if (togetherWatchDetailPageViewModel27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel28 = null;
        }
        FlowKt.launchIn(FlowKt.onEach(togetherWatchDetailPageViewModel28.getChatService().f111883c0, new ChatFragment$subscribeData$16(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }
}
