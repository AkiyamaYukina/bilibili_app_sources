package com.bilibili.playerbizcommon.widget.control;

import ES0.H;
import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bilibili.base.connectivity.Connectivity;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.playerbizcommon.features.network.PlayerNetworkService;
import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import com.bilibili.playerbizcommon.features.network.VideoEnvironmentObserver;
import com.bilibili.playerbizcommon.utils.PlayerExtensionsKt;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.ConnectivityManagerHelper;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerServiceManager;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerNetworkTextWidget.class */
public final class PlayerNetworkTextWidget extends AppCompatTextView implements IControlWidget, ControlContainerVisibleObserver {

    @NotNull
    public static final a Companion = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public PlayerContainer f80504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<PlayerNetworkService> f80505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.ServiceDescriptor<PlayerNetworkService> f80506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f80507d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerNetworkTextWidget$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerNetworkTextWidget$b.class */
    public static final class b implements VideoEnvironmentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerNetworkTextWidget f80508a;

        public b(PlayerNetworkTextWidget playerNetworkTextWidget) {
            this.f80508a = playerNetworkTextWidget;
        }

        @Override // com.bilibili.playerbizcommon.features.network.VideoEnvironmentObserver
        public final void onVideoEnvironmentChanged(VideoEnvironment videoEnvironment) {
            PlayerNetworkTextWidget playerNetworkTextWidget = this.f80508a;
            playerNetworkTextWidget.K(playerNetworkTextWidget.getContext());
        }
    }

    public PlayerNetworkTextWidget(@NotNull Context context) {
        super(context);
        this.f80505b = new PlayerServiceManager.Client<>();
        this.f80506c = PlayerServiceManager.ServiceDescriptor.Companion.obtain(PlayerNetworkService.class);
        this.f80507d = LazyKt.lazy(LazyThreadSafetyMode.NONE, new H(this, 3));
        J(context);
    }

    public PlayerNetworkTextWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80505b = new PlayerServiceManager.Client<>();
        this.f80506c = PlayerServiceManager.ServiceDescriptor.Companion.obtain(PlayerNetworkService.class);
        this.f80507d = LazyKt.lazy(LazyThreadSafetyMode.NONE, new H(this, 3));
        J(context);
    }

    public PlayerNetworkTextWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f80505b = new PlayerServiceManager.Client<>();
        this.f80506c = PlayerServiceManager.ServiceDescriptor.Companion.obtain(PlayerNetworkService.class);
        this.f80507d = LazyKt.lazy(LazyThreadSafetyMode.NONE, new H(this, 3));
        J(context);
    }

    private final b getMEnvironmentObserver() {
        return (b) this.f80507d.getValue();
    }

    public final void J(Context context) {
        setGravity(17);
        setBackgroundDrawable(PlayerExtensionsKt.createFillBorderDrawable(context, 7, 2131103712, 4));
    }

    public final void K(Context context) {
        if (ConnectivityMonitor.getInstance().isNetworkActive()) {
            PlayerNetworkService playerNetworkService = (PlayerNetworkService) this.f80505b.getService();
            VideoEnvironment videoEnvironment = playerNetworkService != null ? playerNetworkService.getVideoEnvironment() : null;
            BLog.i("PlayerNetworkTextWidget", "videoEnvironment is " + videoEnvironment);
            if (videoEnvironment == VideoEnvironment.FREE_DATA_SUCCESS) {
                setText(2131846782);
                return;
            }
        }
        NetworkInfo activeNetworkInfo = Connectivity.getActiveNetworkInfo(context.getApplicationContext());
        if (activeNetworkInfo == null) {
            setText(2131841541);
            return;
        }
        String networkClassName = ConnectivityManagerHelper.getNetworkClassName(activeNetworkInfo);
        if (TextUtils.isEmpty(networkClassName)) {
            setText(2131841475);
        } else {
            setText(networkClassName.toUpperCase(Locale.US));
        }
    }

    public void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f80504a = playerContainer;
    }

    public void onControlContainerVisibleChanged(boolean z6) {
        if (z6) {
            K(getContext());
        }
    }

    public void onWidgetActive() {
        IControlContainerService controlContainerService;
        IPlayerServiceManager playerServiceManager;
        PlayerContainer playerContainer = this.f80504a;
        if (playerContainer != null && (playerServiceManager = playerContainer.getPlayerServiceManager()) != null) {
            playerServiceManager.bindService(this.f80506c, this.f80505b);
        }
        PlayerNetworkService playerNetworkService = (PlayerNetworkService) this.f80505b.getService();
        if (playerNetworkService != null) {
            playerNetworkService.registerVideoEnvironmentObserver(getMEnvironmentObserver());
        }
        PlayerContainer playerContainer2 = this.f80504a;
        if (playerContainer2 == null || (controlContainerService = playerContainer2.getControlContainerService()) == null) {
            return;
        }
        controlContainerService.registerControlContainerVisible(this);
    }

    public void onWidgetInactive() {
        IControlContainerService controlContainerService;
        IPlayerServiceManager playerServiceManager;
        PlayerNetworkService playerNetworkService = (PlayerNetworkService) this.f80505b.getService();
        if (playerNetworkService != null) {
            playerNetworkService.unregisterVideoEnvironmentObserver(getMEnvironmentObserver());
        }
        PlayerContainer playerContainer = this.f80504a;
        if (playerContainer != null && (playerServiceManager = playerContainer.getPlayerServiceManager()) != null) {
            playerServiceManager.unbindService(this.f80506c, this.f80505b);
        }
        PlayerContainer playerContainer2 = this.f80504a;
        if (playerContainer2 == null || (controlContainerService = playerContainer2.getControlContainerService()) == null) {
            return;
        }
        controlContainerService.unregisterControlContainerVisible(this);
    }
}
