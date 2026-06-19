package com.bilibili.playerbizcommonv2.danmaku.setting;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playerbizcommon.view.BubbleContainer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.core.api.InteractApiService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/a.class */
@StabilityInferred(parameters = 0)
public final class a extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InjectPlayerService
    private IPlayDirector f81249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f81250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InjectPlayerService
    private IControlContainerService f81251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InjectPlayerService
    private IReporterService f81252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerSettingService f81253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f81254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BubbleContainer f81255g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final b f81256i;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.setting.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C0529a extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f81257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Rect f81258b;

        public C0529a(@NotNull Rect rect, @NotNull String str) {
            this.f81257a = str;
            this.f81258b = rect;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/a$b.class */
    public static final class b implements ControlContainerVisibleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f81259a;

        public b(a aVar) {
            this.f81259a = aVar;
        }

        public final void onControlContainerVisibleChanged(boolean z6) {
            if (z6) {
                return;
            }
            a.g(this.f81259a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/a$c.class */
    public static final class c implements Callback<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f81260a;

        public c(a aVar) {
            this.f81260a = aVar;
        }

        public final void onFailure(Call<Void> call, Throwable th) {
            this.f81260a.getClass();
            BLog.i("PlayerDanmakuSettingGuideWidget", "report onFailure");
        }

        public final void onResponse(Call<Void> call, Response<Void> response) {
            this.f81260a.getClass();
            BLog.i("PlayerDanmakuSettingGuideWidget", "report onResponse");
        }
    }

    public a(@NotNull Context context) {
        super(context);
        this.h = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Br0.a(this, 0));
        this.f81256i = new b(this);
    }

    public static final void g(a aVar) {
        AbsFunctionWidgetService absFunctionWidgetService = aVar.f81250b;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFunctionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(aVar.getToken());
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        View viewInflate = LayoutInflater.from(getMContext()).inflate(2131496644, (ViewGroup) null);
        this.f81254f = (TextView) viewInflate.findViewById(2131312693);
        this.f81255g = (BubbleContainer) viewInflate.findViewById(2131312691);
        return viewInflate;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builder = new FunctionWidgetConfig.Builder();
        builder.dismissWhenScreenModeChange(true);
        builder.dismissWhenVideoChange(true);
        builder.dismissWhenVideoCompleted(true);
        builder.persistent(false);
        return builder.build();
    }

    @NotNull
    public final String getTag() {
        return "PlayerDanmakuSettingGuideWidget";
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        IControlContainerService iControlContainerService = this.f81251c;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mControlContainerservice");
            iControlContainerService2 = null;
        }
        iControlContainerService2.unregisterControlContainerVisible(this.f81256i);
    }

    public final void onWidgetShow(@Nullable AbsFunctionWidget.Configuration configuration) {
        super.onWidgetShow(configuration);
        IControlContainerService iControlContainerService = this.f81251c;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mControlContainerservice");
            iControlContainerService2 = null;
        }
        iControlContainerService2.registerControlContainerVisible(this.f81256i);
        if (configuration instanceof C0529a) {
            TextView textView = this.f81254f;
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mText");
                textView2 = null;
            }
            C0529a c0529a = (C0529a) configuration;
            textView2.setText(c0529a.f81257a);
            getView().measure(0, 0);
            Rect rect = c0529a.f81258b;
            int measuredWidth = getView().getMeasuredWidth() / 2;
            int i7 = (rect.left + rect.right) / 2;
            int i8 = i7 - measuredWidth;
            if (i8 > 0) {
                getView().setPadding(i8, 0, 0, 0);
                BubbleContainer bubbleContainer = this.f81255g;
                BubbleContainer bubbleContainer2 = bubbleContainer;
                if (bubbleContainer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBubble");
                    bubbleContainer2 = null;
                }
                bubbleContainer2.setAnchorX(measuredWidth);
            } else {
                getView().setPadding(0, 0, 0, 0);
                BubbleContainer bubbleContainer3 = this.f81255g;
                BubbleContainer bubbleContainer4 = bubbleContainer3;
                if (bubbleContainer3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBubble");
                    bubbleContainer4 = null;
                }
                bubbleContainer4.setAnchorX(i7);
            }
            IReporterService iReporterService = this.f81252d;
            IReporterService iReporterService2 = iReporterService;
            if (iReporterService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mReporterService");
                iReporterService2 = null;
            }
            iReporterService2.report(new NeuronsEvents.NormalEvent("player.player.danmaku-bubble.show.player", new String[0]));
            long jMid = BiliAccounts.get(getMContext()).mid();
            IPlayDirector iPlayDirector = this.f81249a;
            IPlayDirector iPlayDirector2 = iPlayDirector;
            if (iPlayDirector == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayDirectorService");
                iPlayDirector2 = null;
            }
            Video.PlayableParams currentPlayableParams = iPlayDirector2.getCurrentPlayableParams();
            Video.DisplayParams displayParams = currentPlayableParams != null ? currentPlayableParams.getDisplayParams() : null;
            long cid = 0;
            long avid = displayParams != null ? displayParams.getAvid() : 0L;
            if (displayParams != null) {
                cid = displayParams.getCid();
            }
            IPlayerSettingService iPlayerSettingService = this.f81253e;
            if (iPlayerSettingService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerSettingService");
                iPlayerSettingService = null;
            }
            iPlayerSettingService.putLong("danmaku_spoiler_bubble_show", jMid);
            ((InteractApiService) ServiceGenerator.createService(InteractApiService.class)).exposureReport("spoiler", jMid, avid, cid).enqueue((Callback) this.h.getValue());
        }
    }
}
