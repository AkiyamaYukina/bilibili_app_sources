package com.bilibili.playerbizcommonv2.danmaku.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.PopupWindow;
import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.projection.internal.utils.ProjectionDanmakuSendHelper;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playerbizcommonv2.danmaku.widget.q;
import com.bilibili.playerbizcommonv2.utils.r;
import com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import lr0.C7886c;
import or0.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.model.comment.CommentItem;
import tv.danmaku.biliplayerv2.service.interact.core.api.InteractApiService;
import tv.danmaku.biliplayerv2.service.interact.core.model.DanmakuConfig;
import tv.danmaku.biliplayerv2.service.interact.core.model.DanmakuParams;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.function.danmaku.filter.KeywordsBlockApiService;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/q.class */
@StabilityInferred(parameters = 0)
public final class q extends RightInsetWithShadowFunctionWidget {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final Lazy<String> f81673x = LazyKt.lazy(new Ea1.g(7));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PlayerContainer f81674g;

    @InjectPlayerService
    private IControlContainerService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InjectPlayerService
    private IReporterService f81675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f81676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @InjectPlayerService
    private IInteractLayerService f81677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InjectPlayerService
    private IToastService f81678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @InjectPlayerService
    private IPlayDirector f81679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @InjectPlayerService
    private Er0.a f81680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f81681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public RecyclerView f81682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public C7886c f81683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final ArrayList<CommentItem> f81684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public or0.c f81685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f81686t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public Job f81687u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public WindowSizeClass f81688v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final o f81689w;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/q$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/q$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final List<? extends CommentItem> f81690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81691b;

        public b(@Nullable List<? extends CommentItem> list, int i7) {
            this.f81690a = list;
            this.f81691b = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/q$c.class */
    public static final class c<TTaskResult, TContinuationResult> implements Continuation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f81692a;

        public c(q qVar) {
            this.f81692a = qVar;
        }

        @Override // bolts.Continuation
        public final Object then(Task task) {
            AccountInfo accountInfoFromCache;
            Lazy<String> lazy = q.f81673x;
            q qVar = this.f81692a;
            Context mContext = qVar.getMContext();
            Video.DisplayParams displayParamsO = qVar.o();
            long mid = displayParamsO != null ? displayParamsO.getMid() : 0L;
            boolean z6 = false;
            if (mContext != null && BiliAccounts.get(mContext).isLogin() && (accountInfoFromCache = BiliAccountInfo.Companion.get().getAccountInfoFromCache()) != null && mid == accountInfoFromCache.getMid()) {
                z6 = true;
            }
            if (!z6) {
                return null;
            }
            AbsFunctionWidgetService absFunctionWidgetService = qVar.f81676j;
            AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
            if (absFunctionWidgetService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService2 = null;
            }
            absFunctionWidgetService2.hideWidget(qVar.getToken());
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.bilibili.playerbizcommonv2.danmaku.widget.o] */
    public q(@NotNull Context context) {
        super(context);
        this.f81684r = new ArrayList<>();
        this.f81686t = 3;
        this.f81689w = new PassportObserver(this) { // from class: com.bilibili.playerbizcommonv2.danmaku.widget.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final q f81672a;

            {
                this.f81672a = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Callable] */
            public final void onChange(Topic topic) {
                Lazy<String> lazy = q.f81673x;
                if (topic == Topic.SIGN_IN) {
                    Task.callInBackground(new Object()).continueWith(new q.c(this.f81672a), Task.UI_THREAD_EXECUTOR);
                }
            }
        };
    }

    public static Unit i(q qVar) {
        IInteractLayerService iInteractLayerService = qVar.f81677k;
        IInteractLayerService iInteractLayerService2 = iInteractLayerService;
        if (iInteractLayerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danmakuService");
            iInteractLayerService2 = null;
        }
        IRemoteHandler remoteHandler = iInteractLayerService2.getRemoteHandler();
        if (remoteHandler != null) {
            IRemoteHandler.onBusinessDataChanged$default(remoteHandler, "interaction_resume", (Object) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static String m(CommentItem commentItem) {
        String strA;
        if (commentItem != null) {
            strA = androidx.constraintlayout.widget.c.a(commentItem.weight, "[", commentItem.mRemoteDmId, ",", "]");
        } else {
            strA = "";
        }
        return strA;
    }

    public final void A(boolean z6) {
        C7886c c7886c;
        if (this.f81682p == null || (c7886c = this.f81683q) == null) {
            return;
        }
        if (!z6) {
            c7886c.f123326b = 256;
        }
        c7886c.notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x014d  */
    /* JADX WARN: Type inference failed for: r0v37, types: [Ar0.a$a, tv.danmaku.biliplayerv2.widget.AbsFunctionWidget$Configuration] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(@org.jetbrains.annotations.NotNull tv.danmaku.biliplayerv2.service.interact.biz.model.comment.CommentItem r12) {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.widget.q.B(tv.danmaku.biliplayerv2.service.interact.biz.model.comment.CommentItem):void");
    }

    public final <T> void C(@NotNull DanmakuConfig.DanmakuOptionName danmakuOptionName, @NotNull T... tArr) {
        IInteractLayerService iInteractLayerService = this.f81677k;
        IInteractLayerService iInteractLayerService2 = iInteractLayerService;
        if (iInteractLayerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danmakuService");
            iInteractLayerService2 = null;
        }
        iInteractLayerService2.setDanmakuOptions(danmakuOptionName, Arrays.copyOf(tArr, tArr.length));
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f81674g = playerContainer;
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final View contentView(@NotNull Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(this.f81683q);
        this.f81682p = recyclerView;
        return recyclerView;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builder = new FunctionWidgetConfig.Builder();
        builder.dismissWhenActivityStop(true);
        builder.dismissWhenScreenModeChange(true);
        builder.dismissWhenVideoChange(true);
        builder.dismissWhenVideoCompleted(true);
        builder.changeOrientationDisableWhenShow(true);
        builder.persistent(true);
        return builder.build();
    }

    @NotNull
    public final String getTag() {
        return "PlayerDanmakuListFunctionWidget";
    }

    public final void l(@NotNull List<? extends CommentItem> list) {
        IInteractLayerService iInteractLayerService = this.f81677k;
        IInteractLayerService iInteractLayerService2 = iInteractLayerService;
        if (iInteractLayerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danmakuService");
            iInteractLayerService2 = null;
        }
        IRemoteHandler remoteHandler = iInteractLayerService2.getRemoteHandler();
        if (remoteHandler != null) {
            List<? extends CommentItem> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((CommentItem) it.next()).getDmId());
            }
            IRemoteHandler.deleteDanmaku$default(remoteHandler, (String[]) arrayList.toArray(new String[0]), (String[]) null, (String[]) null, 6, (Object) null);
        }
    }

    @Nullable
    public final DanmakuParams n() {
        IInteractLayerService iInteractLayerService = this.f81677k;
        IInteractLayerService iInteractLayerService2 = iInteractLayerService;
        if (iInteractLayerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danmakuService");
            iInteractLayerService2 = null;
        }
        return iInteractLayerService2.getDanmakuParams();
    }

    public final Video.DisplayParams o() {
        IPlayDirector iPlayDirector = this.f81679m;
        IPlayDirector iPlayDirector2 = iPlayDirector;
        if (iPlayDirector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playDirector");
            iPlayDirector2 = null;
        }
        Video.PlayableParams currentPlayableParams = iPlayDirector2.getCurrentPlayableParams();
        Video.DisplayParams displayParams = null;
        if (currentPlayableParams != null) {
            displayParams = currentPlayableParams.getDisplayParams();
        }
        return displayParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onConfigurationChanged(@org.jetbrains.annotations.NotNull tv.danmaku.biliplayerv2.widget.AbsFunctionWidget.Configuration r10) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.widget.q.onConfigurationChanged(tv.danmaku.biliplayerv2.widget.AbsFunctionWidget$Configuration):void");
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        Job job = this.f81687u;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f81687u = null;
        this.f81688v = null;
        PlayerLog.i("BiliPlayerV2", "[player] stopped monitoring window size");
        if (this.f81681o) {
            try {
                BiliAccounts.get(getMContext()).unsubscribe(Topic.SIGN_IN, this.f81689w);
            } catch (Exception e7) {
            }
            this.f81681o = false;
        }
        or0.c cVar = this.f81685s;
        if (cVar != null) {
            PopupWindow popupWindow = cVar.f124904f;
            if (popupWindow != null) {
                or0.c.a(popupWindow);
            }
            C7886c c7886c = cVar.f124899a;
            if (c7886c != null) {
                c7886c.f123326b = 256;
            }
            if (c7886c != null) {
                c7886c.notifyDataSetChanged();
            }
        }
        this.f81683q = null;
        this.f81685s = null;
        PlayerLog.i("BiliPlayerV2", "[player] danmaku list widget dismiss");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.recyclerview.widget.RecyclerView$Adapter, lr0.c] */
    public final void onWidgetShow() {
        AccountInfo accountInfoFromCache;
        super.onWidgetShow();
        boolean z6 = true;
        if (!this.f81681o) {
            BiliAccounts.get(getMContext()).subscribe(Topic.SIGN_IN, this.f81689w);
            this.f81681o = true;
        }
        ?? adapter = new RecyclerView.Adapter();
        adapter.f123326b = 256;
        this.f81683q = adapter;
        Video.DisplayParams displayParamsO = o();
        C7886c c7886c = this.f81683q;
        Context mContext = getMContext();
        long mid = 0;
        long cid = displayParamsO != null ? displayParamsO.getCid() : 0L;
        long avid = displayParamsO != null ? displayParamsO.getAvid() : 0L;
        IToastService iToastService = this.f81678l;
        IToastService iToastService2 = iToastService;
        if (iToastService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toastService");
            iToastService2 = null;
        }
        Context mContext2 = getMContext();
        Video.DisplayParams displayParamsO2 = o();
        if (displayParamsO2 != null) {
            mid = displayParamsO2.getMid();
        }
        if (mContext2 == null || !BiliAccounts.get(mContext2).isLogin() || (accountInfoFromCache = BiliAccountInfo.Companion.get().getAccountInfoFromCache()) == null || mid != accountInfoFromCache.getMid()) {
            z6 = false;
        }
        or0.c cVar = new or0.c(c7886c, mContext, cid, avid, iToastService2, z6);
        this.f81685s = cVar;
        cVar.f124910m = this;
        RecyclerView recyclerView = this.f81682p;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
        Er0.a aVar = this.f81680n;
        Er0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
            aVar2 = null;
        }
        com.bilibili.playerbizcommonv2.utils.r rVar = (com.bilibili.playerbizcommonv2.utils.r) aVar2.get(r.a.f81944a);
        if (rVar == null) {
            PlayerLog.w("BiliPlayerV2", "[player] PlayerWindowSizeDelegate is null, skip window size monitoring");
        } else {
            this.f81688v = (WindowSizeClass) rVar.getWindowSizeFlow().getValue();
            this.f81687u = BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new PlayerDanmakuListFunctionWidget$startMonitoringWindowSize$1(rVar, this, null), 3, (Object) null);
            PlayerLog.i("BiliPlayerV2", "[player] started monitoring window size, initial size: " + this.f81688v);
        }
        PlayerLog.i("BiliPlayerV2", "[player] danmaku list widget show");
    }

    public final void p(@NotNull CommentItem commentItem) {
        Context mContext = getMContext();
        Video.DisplayParams displayParamsO = o();
        long cid = displayParamsO != null ? displayParamsO.getCid() : 0L;
        Long longOrNull = StringsKt.toLongOrNull(commentItem.mRemoteDmId);
        long jLongValue = longOrNull != null ? longOrNull.longValue() : 0L;
        String str = commentItem.mDamakuSenderHash;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        IInteractLayerService iInteractLayerService = this.f81677k;
        if (iInteractLayerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danmakuService");
            iInteractLayerService = null;
        }
        IToastService iToastService = this.f81678l;
        if (iToastService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toastService");
            iToastService = null;
        }
        com.bilibili.playerbizcommonv2.danmaku.feedback.h.e(mContext, cid, jLongValue, str2, iInteractLayerService, iToastService, true);
        IReporterService iReporterService = this.f81675i;
        if (iReporterService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reporterService");
            iReporterService = null;
        }
        iReporterService.report(new NeuronsEvents.NormalEvent("player.player.danmaku-list.add-block.player", new String[]{"dmid", commentItem.mRemoteDmId, NotificationCompat.CATEGORY_MESSAGE, commentItem.mText, "flag", m(commentItem), "weight", String.valueOf(commentItem.weight)}));
    }

    public final void q(boolean z6) {
        if (z6) {
            IPlayerContainer iPlayerContainer = this.f81674g;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerController");
                iPlayerContainer2 = null;
            }
            IPlayerSettingService playerSettingService = iPlayerContainer2.getPlayerSettingService();
            if (!playerSettingService.getBoolean("pref_key_player_enable_keywords_block", true)) {
                playerSettingService.putBoolean("pref_key_player_enable_keywords_block", true);
                Ii1.a.b(Boolean.TRUE, "pref_key_player_enable_keywords_block");
            }
        }
        IInteractLayerService iInteractLayerService = this.f81677k;
        if (iInteractLayerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danmakuService");
            iInteractLayerService = null;
        }
        IRemoteHandler remoteHandler = iInteractLayerService.getRemoteHandler();
        if (remoteHandler != null) {
            remoteHandler.filtersChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(@NotNull CommentItem commentItem) {
        List listListOf;
        d.a aVar;
        or0.c cVar = this.f81685s;
        if (cVar != null && (listListOf = CollectionsKt.listOf(commentItem)) != null) {
            or0.d dVar = cVar.f124909l;
            long j7 = cVar.f124901c;
            dVar.getClass();
            List list = listListOf;
            if (!list.isEmpty()) {
                Iterator it = listListOf.iterator();
                while (it.hasNext()) {
                    ((CommentItem) it.next()).mExtras.putInt("comment_delete_state", 1);
                }
            }
            if (dVar.f124913a != null) {
                if (list.isEmpty()) {
                    aVar = new d.a("", "", "");
                } else {
                    CommentItem commentItem2 = (CommentItem) listListOf.get(0);
                    if (listListOf.size() == 1) {
                        String str = commentItem2.mRemoteDmId;
                        aVar = new d.a(str, str, androidx.constraintlayout.widget.c.a(commentItem2.weight, "[", str, ",", "]"));
                    } else {
                        StringBuilder sb = new StringBuilder(32);
                        StringBuilder sb2 = new StringBuilder(32);
                        StringBuilder sb3 = new StringBuilder(32);
                        sb.append(commentItem2.mRemoteDmId);
                        sb2.append(commentItem2.mRemoteDmId);
                        sb3.append("[");
                        sb3.append(commentItem2.mRemoteDmId);
                        sb3.append(",");
                        sb3.append(commentItem2.weight);
                        sb3.append("]");
                        int size = listListOf.size();
                        for (int i7 = 1; i7 < size; i7++) {
                            sb.append(",");
                            sb2.append(":");
                            sb3.append(":[");
                            CommentItem commentItem3 = (CommentItem) listListOf.get(i7);
                            sb.append(commentItem3.mRemoteDmId);
                            sb2.append(commentItem3.mRemoteDmId);
                            sb3.append(commentItem3.mRemoteDmId);
                            sb3.append(",");
                            sb3.append(commentItem3.weight);
                            sb3.append("]");
                        }
                        aVar = new d.a(sb.toString(), sb2.toString(), sb3.toString());
                    }
                }
                ((KeywordsBlockApiService) ServiceGenerator.createService(KeywordsBlockApiService.class)).up_delete(BiliAccounts.get(dVar.f124913a).getAccessKey(), String.valueOf(j7), (String) aVar.f124915a).enqueue(new or0.e(dVar, listListOf));
            } else if (!list.isEmpty()) {
                Iterator it2 = listListOf.iterator();
                while (it2.hasNext()) {
                    ((CommentItem) it2.next()).mExtras.putInt("comment_delete_state", 0);
                }
            }
            C7886c c7886c = cVar.f124899a;
            if (c7886c != null) {
                c7886c.notifyDataSetChanged();
            }
            q qVar = cVar.f124910m;
            if (qVar != null) {
                qVar.x(new NeuronsEvents.NormalEvent("player.player.danmaku-list.manager-delete.player", new String[]{GameCardButton.extraParamSource, String.valueOf(cVar.f124912o)}));
            }
        }
        IReporterService iReporterService = this.f81675i;
        IReporterService iReporterService2 = iReporterService;
        if (iReporterService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reporterService");
            iReporterService2 = null;
        }
        iReporterService2.report(new NeuronsEvents.NormalEvent("player.player.danmaku-list.delete.player", new String[]{GameCardButton.extraParamSource, String.valueOf(this.f81686t), "dmid", commentItem.mRemoteDmId, NotificationCompat.CATEGORY_MESSAGE, commentItem.mText, "flag", m(commentItem), "weight", String.valueOf(commentItem.weight)}));
    }

    public final void s(@Nullable CommentItem commentItem) {
        boolean z6 = commentItem.mRecommended;
        int iMax = !z6 ? commentItem.likes + 1 : Math.max(commentItem.likes - 1, 0);
        IInteractLayerService iInteractLayerService = this.f81677k;
        IInteractLayerService iInteractLayerService2 = iInteractLayerService;
        if (iInteractLayerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danmakuService");
            iInteractLayerService2 = null;
        }
        IRemoteHandler remoteHandler = iInteractLayerService2.getRemoteHandler();
        if (remoteHandler != null) {
            Video.DisplayParams displayParamsO = o();
            remoteHandler.likeDanmaku(String.valueOf(displayParamsO != null ? displayParamsO.getCid() : 0L), !z6, commentItem.getDmId(), iMax, commentItem.mReplyCount);
        }
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final RightInsetWithShadowFunctionWidget.ShadowSize shadowSize() {
        return RightInsetWithShadowFunctionWidget.ShadowSize.MEDIUM;
    }

    public final void u(@NotNull CommentItem commentItem) {
        or0.c cVar = this.f81685s;
        IReporterService iReporterService = null;
        if (cVar != null && !TextUtils.isEmpty(commentItem.mRemoteDmId)) {
            or0.b bVar = new or0.b(cVar, commentItem);
            if (StringsKt.Z(commentItem.mRemoteDmId, ProjectionDanmakuSendHelper.FAKE_PREFIX)) {
                if (cVar.f124911n == null) {
                    cVar.f124911n = new LongSparseArray<>(0, 1, null);
                }
                cVar.f124911n.put(commentItem.mTimeMilli, bVar);
            } else {
                or0.i iVar = cVar.f124908k;
                ((InteractApiService) ServiceGenerator.createService(InteractApiService.class)).recall(BiliAccounts.get(iVar.f124925a).getAccessKey(), String.valueOf(cVar.f124901c), commentItem.mRemoteDmId.toString(), 1).enqueue(new or0.g(iVar, bVar, commentItem));
            }
        }
        IReporterService iReporterService2 = this.f81675i;
        if (iReporterService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reporterService");
        } else {
            iReporterService = iReporterService2;
        }
        iReporterService.report(new NeuronsEvents.NormalEvent("player.player.danmaku-list.recall.player", new String[]{GameCardButton.extraParamSource, String.valueOf(this.f81686t), "dmid", commentItem.mRemoteDmId, NotificationCompat.CATEGORY_MESSAGE, commentItem.mText, "flag", m(commentItem), "weight", String.valueOf(commentItem.weight)}));
    }

    public final void v(@Nullable CommentItem commentItem) {
        IInteractLayerService iInteractLayerService = this.f81677k;
        IInteractLayerService iInteractLayerService2 = iInteractLayerService;
        if (iInteractLayerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danmakuService");
            iInteractLayerService2 = null;
        }
        IRemoteHandler remoteHandler = iInteractLayerService2.getRemoteHandler();
        if (remoteHandler != null) {
            remoteHandler.reCallDanmaku(commentItem.getDmId());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(@org.jetbrains.annotations.NotNull android.view.View r10, @org.jetbrains.annotations.NotNull tv.danmaku.biliplayerv2.service.interact.biz.model.comment.CommentItem r11) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.widget.q.w(android.view.View, tv.danmaku.biliplayerv2.service.interact.biz.model.comment.CommentItem):void");
    }

    public final void x(@NotNull NeuronsEvents.NormalEvent normalEvent) {
        IReporterService iReporterService = this.f81675i;
        IReporterService iReporterService2 = iReporterService;
        if (iReporterService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reporterService");
            iReporterService2 = null;
        }
        iReporterService2.report(normalEvent);
    }

    public final void y() {
        if (this.f81684r.isEmpty()) {
            RecyclerView recyclerView = this.f81682p;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.f81682p;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
    }

    public final void z(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        PlayerToast playerToastBuild = qb.g.a(32, 17, "extra_title", str).duration(5000L).build();
        IToastService iToastService = this.f81678l;
        IToastService iToastService2 = iToastService;
        if (iToastService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toastService");
            iToastService2 = null;
        }
        iToastService2.showToast(playerToastBuild);
    }
}
