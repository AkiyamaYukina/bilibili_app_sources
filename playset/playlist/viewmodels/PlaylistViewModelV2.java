package com.bilibili.playset.playlist.viewmodels;

import De0.C1571d;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.ToastHelper;
import com.bilibili.okretro.BaseResponse;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playset.api.MultitypePlaylist;
import com.bilibili.playset.api.PlaySetService;
import com.bilibili.playset.playlist.adapters.FavFooterItem$Companion$LoadMoreType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import vs0.InterfaceC8857a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModelV2.class */
@StabilityInferred(parameters = 0)
public final class PlaylistViewModelV2 extends AndroidViewModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<com.bilibili.playset.api.d> f85543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<MultitypePlaylist.Info> f85544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f85545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f85546g;

    @NotNull
    public final MutableLiveData<com.bilibili.playset.playlist.viewmodels.b> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f85547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f85548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f85549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Bundle> f85550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f85551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f85552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f85553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f85554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f85555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f85556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f85557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f85558t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Lazy f85559u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Lazy f85560v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Channel<InterfaceC8857a> f85561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Lazy f85562x;

    /* JADX INFO: renamed from: com.bilibili.playset.playlist.viewmodels.PlaylistViewModelV2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModelV2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistViewModelV2 this$0;

        /* JADX INFO: renamed from: com.bilibili.playset.playlist.viewmodels.PlaylistViewModelV2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModelV2$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistViewModelV2 f85563a;

            public a(PlaylistViewModelV2 playlistViewModelV2) {
                this.f85563a = playlistViewModelV2;
            }

            public final Object emit(Object obj, Continuation continuation) {
                PlaylistViewModelV2 playlistViewModelV2 = this.f85563a;
                playlistViewModelV2.getClass();
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(playlistViewModelV2), (CoroutineContext) null, (CoroutineStart) null, new PlaylistViewModelV2$onAction$1((InterfaceC8857a) obj, playlistViewModelV2, null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistViewModelV2 playlistViewModelV2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistViewModelV2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConsumeAsFlow = FlowKt.consumeAsFlow(this.this$0.f85561w);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowConsumeAsFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModelV2$a.class */
    public static final class a extends BiliApiDataCallback<BaseResponse> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f85564b;

        public a(Context context) {
            this.f85564b = context;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(BaseResponse baseResponse) {
            Context context = this.f85564b;
            ToastHelper.showToast(context, context.getString(2131842512), 0, 17);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModelV2$b.class */
    public static final class b extends BiliApiDataCallback<com.bilibili.playset.api.d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PlaylistViewModelV2 f85565b;

        public b(PlaylistViewModelV2 playlistViewModelV2) {
            this.f85565b = playlistViewModelV2;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(com.bilibili.playset.api.d dVar) {
            com.bilibili.playset.api.d dVar2 = dVar;
            PlaylistViewModelV2 playlistViewModelV2 = this.f85565b;
            Integer value = playlistViewModelV2.f85548j.getValue();
            if (value != null && value.intValue() == 3) {
                return;
            }
            playlistViewModelV2.f85542c++;
            if (dVar2 != null) {
                playlistViewModelV2.f85557s = dVar2.c();
                playlistViewModelV2.f85554p = playlistViewModelV2.f85554p || dVar2.b();
                List<com.bilibili.playset.api.c> listD = dVar2.d();
                MutableLiveData<Integer> mutableLiveData = playlistViewModelV2.f85548j;
                if (listD != null && !listD.isEmpty()) {
                    mutableLiveData.setValue(0);
                    playlistViewModelV2.f85541b++;
                    if (playlistViewModelV2.f85554p && !playlistViewModelV2.f85557s) {
                        dVar2.f84072g = FavFooterItem$Companion$LoadMoreType.LOAD_MORE_CLEAN_INVALID;
                    }
                } else if (playlistViewModelV2.f85554p) {
                    if (playlistViewModelV2.f85541b <= 1) {
                        mutableLiveData.setValue(4);
                    } else if (!playlistViewModelV2.f85557s) {
                        dVar2.f84072g = FavFooterItem$Companion$LoadMoreType.LOAD_MORE_CLEAN_INVALID;
                    }
                } else if (playlistViewModelV2.f85541b > 1) {
                    dVar2.f84072g = FavFooterItem$Companion$LoadMoreType.LOAD_MORE_STATUS_GONE;
                } else {
                    mutableLiveData.setValue(2);
                }
                playlistViewModelV2.f85543d.setValue(dVar2);
            }
            playlistViewModelV2.f85558t = false;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            PlaylistViewModelV2 playlistViewModelV2 = this.f85565b;
            if (playlistViewModelV2.f85541b > 1) {
                playlistViewModelV2.f85549k.setValue(2);
            } else {
                playlistViewModelV2.f85548j.setValue(3);
            }
            playlistViewModelV2.f85558t = false;
        }
    }

    public PlaylistViewModelV2(@NotNull Application application) {
        super(application);
        this.f85541b = 1;
        this.f85542c = 1;
        this.f85543d = new MutableLiveData<>();
        this.f85544e = new MutableLiveData<>();
        this.f85545f = new MutableLiveData<>();
        this.f85546g = new MutableLiveData<>();
        this.h = new MutableLiveData<>();
        this.f85547i = new MutableLiveData<>();
        new MutableLiveData();
        new MutableLiveData();
        this.f85548j = new MutableLiveData<>();
        this.f85549k = new MutableLiveData<>();
        this.f85550l = new MutableLiveData<>();
        this.f85551m = new MutableLiveData<>();
        this.f85552n = new MutableLiveData<>();
        this.f85553o = new MutableLiveData<>();
        this.f85555q = true;
        new ArrayList();
        this.f85556r = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f85557s = true;
        this.f85559u = LazyKt.lazy(new Fa1.g(7));
        this.f85560v = LazyKt.lazy(new Pa0.b(this, 3));
        this.f85561w = ChannelKt.Channel$default(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        this.f85562x = LazyKt.lazy(new C1571d(9));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object I0(com.bilibili.playset.playlist.viewmodels.PlaylistViewModelV2 r5, com.bilibili.playset.api.c r6, java.lang.Long r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.viewmodels.PlaylistViewModelV2.I0(com.bilibili.playset.playlist.viewmodels.PlaylistViewModelV2, com.bilibili.playset.api.c, java.lang.Long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void J0(long j7) {
        Context contextApplication = BiliContext.topActivity();
        if (contextApplication == null) {
            contextApplication = BiliContext.application();
        }
        ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).cleanInvalid(j7).enqueue(new a(contextApplication));
    }

    public final void K0(long j7) {
        this.f85552n.setValue("loading");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PlaylistViewModelV2$clearOfflineMedias$1(this, j7, null), 3, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.bilibili.okretro.converter.IParser, java.lang.Object] */
    public final void L0(long j7) {
        if (this.f85558t) {
            return;
        }
        this.f85558t = true;
        ((PlaySetService) this.f85562x.getValue()).getFolderFullInfo(j7, this.f85542c).setParser(new Object()).enqueue(new b(this));
    }

    public final void M0(@NotNull InterfaceC8857a interfaceC8857a) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PlaylistViewModelV2$sendAction$1(this, interfaceC8857a, null), 3, (Object) null);
    }

    public final void N0(long j7, @NotNull String str) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PlaylistViewModelV2$sortMedias$1(str, j7, this, null), 3, (Object) null);
    }
}
