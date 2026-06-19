package com.bilibili.playerbizcommonv2.danmaku.feedback;

import M3.C2614r1;
import M3.C2620t1;
import M3.C2629w1;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.tf.TfCode;
import com.bilibili.lib.theme.R$color;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playerbizcommonv2.danmaku.feedback.k;
import com.bilibili.playerbizcommonv2.danmaku.feedback.n;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.DanmakuSettingsStyle;
import com.bilibili.playerbizcommonv2.danmaku.widget.A;
import com.bilibili.playerbizcommonv2.widget.setting.channel.w;
import java.util.ArrayList;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import q4.M;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.model.DanmakuFeedbackInfo;
import tv.danmaku.biliplayerv2.service.interact.biz.model.DanmakuFeedbackScene;
import tv.danmaku.biliplayerv2.service.interact.biz.widget.ChronosDanmakuReportBottomSheet;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.function.danmaku.filter.KeywordsBlockApiService;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/feedback/h.class */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f80882a = LazyKt.lazy(new C2614r1(6));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f80883b = LazyKt.lazy(new C2620t1(7));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/feedback/h$a.class */
    public static final class a implements Callback<GeneralResponse<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IInteractLayerService f80884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IToastService f80886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f80887d;

        public a(IInteractLayerService iInteractLayerService, String str, IToastService iToastService, Context context) {
            this.f80884a = iInteractLayerService;
            this.f80885b = str;
            this.f80886c = iToastService;
            this.f80887d = context;
        }

        public final void onFailure(Call<GeneralResponse<String>> call, Throwable th) {
            M.b("Delete danmaku failed: ", th.getMessage(), "DanmakuFeedbackDialogHelper");
        }

        public final void onResponse(Call<GeneralResponse<String>> call, Response<GeneralResponse<String>> response) {
            IRemoteHandler remoteHandler;
            GeneralResponse generalResponse = (GeneralResponse) response.body();
            if (generalResponse != null && generalResponse.code == 0 && (remoteHandler = this.f80884a.getRemoteHandler()) != null) {
                IRemoteHandler.deleteDanmaku$default(remoteHandler, new String[]{this.f80885b}, (String[]) null, (String[]) null, 6, (Object) null);
            }
            this.f80886c.showToast(h.h(this.f80887d.getString(2131847245)));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/feedback/h$b.class */
    public static final class b extends BiliApiDataCallback<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IInteractLayerService f80888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f80889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f80890d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final IToastService f80891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Context f80892f;

        public b(IInteractLayerService iInteractLayerService, long j7, String str, IToastService iToastService, Context context) {
            this.f80888b = iInteractLayerService;
            this.f80889c = j7;
            this.f80890d = str;
            this.f80891e = iToastService;
            this.f80892f = context;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(String str) {
            IRemoteHandler remoteHandler = this.f80888b.getRemoteHandler();
            if (remoteHandler != null) {
                IRemoteHandler.deleteDanmaku$default(remoteHandler, new String[]{String.valueOf(this.f80889c)}, new String[]{this.f80890d}, (String[]) null, 4, (Object) null);
            }
            this.f80891e.showToast(h.h(this.f80892f.getString(2131854333)));
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            M.b("changeRelation error: ", th.getMessage(), "DanmakuFeedbackDialogHelper");
            IRemoteHandler remoteHandler = this.f80888b.getRemoteHandler();
            if (remoteHandler != null) {
                IRemoteHandler.deleteDanmaku$default(remoteHandler, new String[]{String.valueOf(this.f80889c)}, new String[]{this.f80890d}, (String[]) null, 4, (Object) null);
            }
            if ((th instanceof BiliApiException) && ((BiliApiException) th).mCode == 22120) {
                this.f80891e.showToast(h.h(this.f80892f.getString(2131854333)));
            }
        }
    }

    public static final void a(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull IInteractLayerService iInteractLayerService, @NotNull IToastService iToastService) {
        if (str.length() == 0 || str2.length() == 0) {
            BLog.e("DanmakuFeedbackDialogHelper", "cid or dmId is empty, cannot delete danmaku");
        } else {
            ((KeywordsBlockApiService) ServiceGenerator.createService(KeywordsBlockApiService.class)).up_delete(BiliAccounts.get(context).getAccessKey(), str, str2).enqueue(new a(iInteractLayerService, str2, iToastService, context));
        }
    }

    public static final void b(@NotNull IReporterService iReporterService, int i7, @NotNull String str, @NotNull String str2, boolean z6) {
        iReporterService.report(new NeuronsEvents.NormalEvent("player.player.dm-menu-more.0.player", new String[]{"button_type", String.valueOf(i7), "dmid", str, NotificationCompat.CATEGORY_MESSAGE, str2, "is_updm", z6 ? "1" : "0"}));
    }

    public static final void c(long j7) {
        if (j7 == 0) {
            BLog.e("DanmakuFeedbackDialogHelper", "aid is 0, cannot route to interactive page");
            return;
        }
        BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(((String) f80882a.getValue()) + "&aid=" + j7), (Context) null, 2, (Object) null);
    }

    public static final void d(long j7) {
        if (j7 == 0) {
            BLog.e("DanmakuFeedbackDialogHelper", "mid is 0, cannot route to user space");
            return;
        }
        BLRouter.routeTo$default(RouteRequestKt.toRouteRequest("bilibili://space/" + j7 + "?defaultTab=video"), (Context) null, 2, (Object) null);
    }

    public static final void e(@NotNull final Context context, final long j7, final long j8, @NotNull final String str, @NotNull final IInteractLayerService iInteractLayerService, @NotNull final IToastService iToastService, boolean z6) {
        new A(context, context.getString(2131854363), CollectionsKt.p(CollectionsKt.listOf(new Integer[]{2131854374, 2131854296, 2131854330}), "\n", (CharSequence) null, (CharSequence) null, new XD0.l(context, 1), 30), null, null, z6 ? 2131104549 : R$color.Bg1_float, z6 ? R$color.Text_white : R$color.Text1, z6 ? 2131104716 : R$color.Line_regular, new Function0(j8, j7, iInteractLayerService, str, iToastService, context) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f80849a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f80850b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final IInteractLayerService f80851c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f80852d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final IToastService f80853e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final Context f80854f;

            {
                this.f80849a = j8;
                this.f80850b = j7;
                this.f80851c = iInteractLayerService;
                this.f80852d = str;
                this.f80853e = iToastService;
                this.f80854f = context;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() {
                /*
                    r10 = this;
                    r0 = r10
                    android.content.Context r0 = r0.f80854f
                    r18 = r0
                    r0 = r10
                    long r0 = r0.f80849a
                    r11 = r0
                    r0 = r11
                    r1 = 0
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 == 0) goto L5c
                    r0 = r10
                    long r0 = r0.f80850b
                    r13 = r0
                    r0 = r13
                    r1 = 0
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 != 0) goto L1f
                    goto L5c
                L1f:
                    java.lang.Class<tv.danmaku.biliplayerv2.widget.function.danmaku.filter.KeywordsBlockApiService> r0 = tv.danmaku.biliplayerv2.widget.function.danmaku.filter.KeywordsBlockApiService.class
                    java.lang.Object r0 = com.bilibili.okretro.ServiceGenerator.createService(r0)
                    tv.danmaku.biliplayerv2.widget.function.danmaku.filter.KeywordsBlockApiService r0 = (tv.danmaku.biliplayerv2.widget.function.danmaku.filter.KeywordsBlockApiService) r0
                    r1 = 1
                    r2 = r13
                    r3 = r11
                    com.bilibili.okretro.call.BiliCall r0 = r0.upAddBlacklist(r1, r2, r3)
                    r15 = r0
                    r0 = r10
                    java.lang.String r0 = r0.f80852d
                    r16 = r0
                    r0 = r10
                    tv.danmaku.biliplayerv2.service.IToastService r0 = r0.f80853e
                    r17 = r0
                    r0 = r15
                    com.bilibili.playerbizcommonv2.danmaku.feedback.h$b r1 = new com.bilibili.playerbizcommonv2.danmaku.feedback.h$b
                    r2 = r1
                    r3 = r10
                    tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService r3 = r3.f80851c
                    r4 = r11
                    r5 = r16
                    r6 = r17
                    r7 = r18
                    r2.<init>(r3, r4, r5, r6, r7)
                    r0.enqueue(r1)
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    r15 = r0
                    goto L68
                L5c:
                    java.lang.String r0 = "DanmakuFeedbackDialogHelper"
                    java.lang.String r1 = "mid or dmId is empty, failed to add to blacklist"
                    tv.danmaku.android.log.BLog.e(r0, r1)
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    r15 = r0
                L68:
                    r0 = r15
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.feedback.b.invoke():java.lang.Object");
            }
        }, new C2629w1(6), 664).show();
    }

    public static void f(final Context context, final DanmakuFeedbackInfo danmakuFeedbackInfo, final long j7, final IPlayerSettingService iPlayerSettingService, final IInteractLayerService iInteractLayerService, final IToastService iToastService, final IReporterService iReporterService, DanmakuFeedbackScene danmakuFeedbackScene, final Function0 function0, com.bilibili.ad.adview.videodetail.upper.common.g gVar, int i7) {
        if ((i7 & 256) != 0) {
            danmakuFeedbackScene = DanmakuFeedbackScene.Detail;
        }
        if ((i7 & 1024) != 0) {
            gVar = null;
        }
        final MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RunningUIComponent(new k(new k.a(danmakuFeedbackInfo.getContent(), danmakuFeedbackInfo.getNickname(), 0, 58), new Function0(danmakuFeedbackInfo, iReporterService, j7) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DanmakuFeedbackInfo f80855a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final IReporterService f80856b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f80857c;

            {
                this.f80855a = danmakuFeedbackInfo;
                this.f80856b = iReporterService;
                this.f80857c = j7;
            }

            public final Object invoke() {
                DanmakuFeedbackInfo danmakuFeedbackInfo2 = this.f80855a;
                h.d(danmakuFeedbackInfo2.getMid());
                h.g(this.f80856b, danmakuFeedbackInfo2, this.f80857c, 0);
                return Unit.INSTANCE;
            }
        }), 0, (Function1) null, 6));
        arrayList.add(new RunningUIComponent(new n(new n.a(2131239016, context.getString(2131845799), null, -1, DanmakuSettingsStyle.TOP, 0, 0, 0, 1948), new Function0(MutableStateFlow, context, danmakuFeedbackInfo, iInteractLayerService, iToastService, iReporterService, j7) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f80858a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f80859b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final DanmakuFeedbackInfo f80860c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final IInteractLayerService f80861d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final IToastService f80862e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final IReporterService f80863f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final long f80864g;

            {
                this.f80858a = MutableStateFlow;
                this.f80859b = context;
                this.f80860c = danmakuFeedbackInfo;
                this.f80861d = iInteractLayerService;
                this.f80862e = iToastService;
                this.f80863f = iReporterService;
                this.f80864g = j7;
            }

            public final Object invoke() {
                Context context2 = this.f80859b;
                this.f80858a.setValue(Boolean.TRUE);
                DanmakuFeedbackInfo danmakuFeedbackInfo2 = this.f80860c;
                h.a(context2, danmakuFeedbackInfo2.getOid(), danmakuFeedbackInfo2.getDmId(), this.f80861d, this.f80862e);
                h.g(this.f80863f, danmakuFeedbackInfo2, this.f80864g, 1);
                return Unit.INSTANCE;
            }
        }), 0, (Function1) null, 6));
        arrayList.add(new RunningUIComponent(new n(new n.a(2131239043, context.getString(2131846932), null, 0, null, 0, 0, 0, TfCode.UNICOM_CDN_MEDIA_URL_EMPTY_VALUE), new Function0(MutableStateFlow, function0, danmakuFeedbackInfo, context, iPlayerSettingService, iInteractLayerService, iReporterService, j7) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f80865a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Function0 f80866b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final DanmakuFeedbackInfo f80867c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Context f80868d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final IPlayerSettingService f80869e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final IInteractLayerService f80870f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final IReporterService f80871g;
            public final long h;

            {
                this.f80865a = MutableStateFlow;
                this.f80866b = function0;
                this.f80867c = danmakuFeedbackInfo;
                this.f80868d = context;
                this.f80869e = iPlayerSettingService;
                this.f80870f = iInteractLayerService;
                this.f80871g = iReporterService;
                this.h = j7;
            }

            public final Object invoke() {
                Context context2 = this.f80868d;
                this.f80865a.setValue(Boolean.TRUE);
                int length = ((String) h.f80883b.getValue()).length();
                DanmakuFeedbackInfo danmakuFeedbackInfo2 = this.f80867c;
                if (length > 0) {
                    this.f80866b.invoke();
                } else if (danmakuFeedbackInfo2.getType() == 0) {
                    boolean z6 = this.f80869e.getBoolean("key_shield_checked", true);
                    ChronosDanmakuReportBottomSheet chronosDanmakuReportBottomSheet = new ChronosDanmakuReportBottomSheet(context2, new G91.e(this.f80870f));
                    String dmId = danmakuFeedbackInfo2.getDmId();
                    danmakuFeedbackInfo2.getType();
                    String content = danmakuFeedbackInfo2.getContent();
                    danmakuFeedbackInfo2.getAppearanceTime();
                    danmakuFeedbackInfo2.getDuration();
                    chronosDanmakuReportBottomSheet.k(dmId, content, danmakuFeedbackInfo2.getUserHash(), danmakuFeedbackInfo2.getOid(), z6);
                    chronosDanmakuReportBottomSheet.show();
                }
                h.g(this.f80871g, danmakuFeedbackInfo2, this.h, 2);
                return Unit.INSTANCE;
            }
        }), 0, (Function1) null, 6));
        arrayList.add(new RunningUIComponent(new n(new n.a(2131238941, context.getString(2131854372), null, 0, null, 0, 0, 0, TfCode.UNICOM_CDN_MEDIA_URL_EMPTY_VALUE), new Function0(MutableStateFlow, context, danmakuFeedbackInfo, iInteractLayerService, iToastService, iReporterService, j7) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f80872a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f80873b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final DanmakuFeedbackInfo f80874c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final IInteractLayerService f80875d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final IToastService f80876e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final IReporterService f80877f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final long f80878g;

            {
                this.f80872a = MutableStateFlow;
                this.f80873b = context;
                this.f80874c = danmakuFeedbackInfo;
                this.f80875d = iInteractLayerService;
                this.f80876e = iToastService;
                this.f80877f = iReporterService;
                this.f80878g = j7;
            }

            public final Object invoke() {
                Context context2 = this.f80873b;
                this.f80872a.setValue(Boolean.TRUE);
                DanmakuFeedbackInfo danmakuFeedbackInfo2 = this.f80874c;
                Long longOrNull = StringsKt.toLongOrNull(danmakuFeedbackInfo2.getOid());
                long jLongValue = longOrNull != null ? longOrNull.longValue() : 0L;
                Long longOrNull2 = StringsKt.toLongOrNull(danmakuFeedbackInfo2.getDmId());
                h.e(context2, jLongValue, longOrNull2 != null ? longOrNull2.longValue() : 0L, danmakuFeedbackInfo2.getUserHash(), this.f80875d, this.f80876e, false);
                h.g(this.f80877f, danmakuFeedbackInfo2, this.f80878g, 3);
                return Unit.INSTANCE;
            }
        }), 0, (Function1) null, 6));
        arrayList.add(new RunningUIComponent(new n(new n.a(2131238811, context.getString(2131854355), context.getString(2131854287), 0, DanmakuSettingsStyle.BOTTOM, 0, 0, 0, 1972), new Function0(danmakuFeedbackInfo, iReporterService, j7) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DanmakuFeedbackInfo f80879a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final IReporterService f80880b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f80881c;

            {
                this.f80879a = danmakuFeedbackInfo;
                this.f80880b = iReporterService;
                this.f80881c = j7;
            }

            public final Object invoke() {
                DanmakuFeedbackInfo danmakuFeedbackInfo2 = this.f80879a;
                h.c(danmakuFeedbackInfo2.getAid());
                h.g(this.f80880b, danmakuFeedbackInfo2, this.f80881c, 4);
                return Unit.INSTANCE;
            }
        }), 0, (Function1) null, 6));
        if (danmakuFeedbackScene == DanmakuFeedbackScene.Detail) {
            arrayList.add(new RunningUIComponent(new w(12), 0, (Function1) null, 6));
            final com.bilibili.ad.adview.videodetail.upper.common.g gVar2 = gVar;
            arrayList.add(new RunningUIComponent(new n(new n.a(2131244391, context.getString(2131854375), null, 0, DanmakuSettingsStyle.SINGLE, 0, 0, 0, 1980), new Function0(MutableStateFlow, gVar2, iReporterService, danmakuFeedbackInfo, j7) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MutableStateFlow f80844a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f80845b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final IReporterService f80846c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final DanmakuFeedbackInfo f80847d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final long f80848e;

                {
                    this.f80844a = MutableStateFlow;
                    this.f80845b = gVar2;
                    this.f80846c = iReporterService;
                    this.f80847d = danmakuFeedbackInfo;
                    this.f80848e = j7;
                }

                public final Object invoke() {
                    this.f80844a.setValue(Boolean.TRUE);
                    Function0 function02 = this.f80845b;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    h.g(this.f80846c, this.f80847d, this.f80848e, 5);
                    return Unit.INSTANCE;
                }
            }), 0, (Function1) null, 6));
        }
        arrayList.add(new RunningUIComponent(new w(46), 0, (Function1) null, 6));
        FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(context);
        if (fragmentActivityFindFragmentActivityOrNull == null) {
            BLog.e("DanmakuFeedbackDialogHelper", "showDanmakuFeedbackDialog failed: activity is null");
        } else {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivityFindFragmentActivityOrNull), (CoroutineContext) null, (CoroutineStart) null, new DanmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8(fragmentActivityFindFragmentActivityOrNull, arrayList, MutableStateFlow, iInteractLayerService, null), 3, (Object) null);
        }
    }

    public static final void g(IReporterService iReporterService, DanmakuFeedbackInfo danmakuFeedbackInfo, long j7, int i7) {
        b(iReporterService, i7, danmakuFeedbackInfo.getDmId(), danmakuFeedbackInfo.getContent(), danmakuFeedbackInfo.getMid() == j7);
    }

    @NotNull
    public static final PlayerToast h(@NotNull String str) {
        return qb.g.a(32, 17, "extra_title", str).duration(5000L).build();
    }
}
