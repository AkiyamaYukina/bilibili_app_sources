package com.bilibili.playerbizcommon.widget.control;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.alipay.sdk.app.PayTask;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerServiceManager;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.PlayerProgressObserver;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.SeekService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.utils.TimeFormater;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerProgressTextWidget.class */
public final class PlayerProgressTextWidget extends AppCompatTextView implements IControlWidget, PlayerProgressObserver, ControlContainerVisibleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public CharSequence f80511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f80512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public PlayerContainer f80513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public IPlayerCoreService f80514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public IControlContainerService f80515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<SeekService> f80516f;

    public PlayerProgressTextWidget(@NotNull Context context) {
        super(context);
        this.f80512b = true;
        this.f80516f = new PlayerServiceManager.Client<>();
        updateTime(0, 0);
        setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.playerbizcommon.widget.control.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerProgressTextWidget f80571a;

            {
                this.f80571a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                IReporterService reporterService;
                IToastService toastService;
                IControlContainerService controlContainerService;
                PlayerProgressTextWidget playerProgressTextWidget = this.f80571a;
                PlayerContainer playerContainer = playerProgressTextWidget.f80513c;
                boolean z6 = false;
                if (((playerContainer == null || (controlContainerService = playerContainer.getControlContainerService()) == null) ? null : controlContainerService.getScreenModeType()) != null) {
                    Context context2 = playerProgressTextWidget.f80513c.getContext();
                    Object systemService = null;
                    if (context2 != null) {
                        systemService = context2.getSystemService("clipboard");
                    }
                    ClipboardManager clipboardManager = (ClipboardManager) systemService;
                    if (!TextUtils.isEmpty(playerProgressTextWidget.getText())) {
                        try {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText("TIME_STAMP", playerProgressTextWidget.getText().subSequence(0, StringsKt.A(playerProgressTextWidget.getText(), "/", 0, false, 6)).toString()));
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                        PlayerToast playerToastBuild = new PlayerToast.Builder().toastItemType(17).location(33).setExtraString("extra_title", context2.getResources().getString(2131820628)).duration(PayTask.f60018j).build();
                        PlayerContainer playerContainer2 = playerProgressTextWidget.f80513c;
                        if (playerContainer2 != null && (toastService = playerContainer2.getToastService()) != null) {
                            toastService.showToast(playerToastBuild);
                        }
                        PlayerContainer playerContainer3 = playerProgressTextWidget.f80513c;
                        if (playerContainer3 != null && (reporterService = playerContainer3.getReporterService()) != null) {
                            reporterService.report(new NeuronsEvents.NormalEvent("player.player.toast-copytimestamp.show.player", new String[0]));
                        }
                        z6 = true;
                    }
                }
                return z6;
            }
        });
    }

    public PlayerProgressTextWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80512b = true;
        this.f80516f = new PlayerServiceManager.Client<>();
        updateTime(0, 0);
        setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.playerbizcommon.widget.control.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerProgressTextWidget f80571a;

            {
                this.f80571a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                IReporterService reporterService;
                IToastService toastService;
                IControlContainerService controlContainerService;
                PlayerProgressTextWidget playerProgressTextWidget = this.f80571a;
                PlayerContainer playerContainer = playerProgressTextWidget.f80513c;
                boolean z6 = false;
                if (((playerContainer == null || (controlContainerService = playerContainer.getControlContainerService()) == null) ? null : controlContainerService.getScreenModeType()) != null) {
                    Context context2 = playerProgressTextWidget.f80513c.getContext();
                    Object systemService = null;
                    if (context2 != null) {
                        systemService = context2.getSystemService("clipboard");
                    }
                    ClipboardManager clipboardManager = (ClipboardManager) systemService;
                    if (!TextUtils.isEmpty(playerProgressTextWidget.getText())) {
                        try {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText("TIME_STAMP", playerProgressTextWidget.getText().subSequence(0, StringsKt.A(playerProgressTextWidget.getText(), "/", 0, false, 6)).toString()));
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                        PlayerToast playerToastBuild = new PlayerToast.Builder().toastItemType(17).location(33).setExtraString("extra_title", context2.getResources().getString(2131820628)).duration(PayTask.f60018j).build();
                        PlayerContainer playerContainer2 = playerProgressTextWidget.f80513c;
                        if (playerContainer2 != null && (toastService = playerContainer2.getToastService()) != null) {
                            toastService.showToast(playerToastBuild);
                        }
                        PlayerContainer playerContainer3 = playerProgressTextWidget.f80513c;
                        if (playerContainer3 != null && (reporterService = playerContainer3.getReporterService()) != null) {
                            reporterService.report(new NeuronsEvents.NormalEvent("player.player.toast-copytimestamp.show.player", new String[0]));
                        }
                        z6 = true;
                    }
                }
                return z6;
            }
        });
    }

    public PlayerProgressTextWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f80512b = true;
        this.f80516f = new PlayerServiceManager.Client<>();
        updateTime(0, 0);
        setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.playerbizcommon.widget.control.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerProgressTextWidget f80571a;

            {
                this.f80571a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                IReporterService reporterService;
                IToastService toastService;
                IControlContainerService controlContainerService;
                PlayerProgressTextWidget playerProgressTextWidget = this.f80571a;
                PlayerContainer playerContainer = playerProgressTextWidget.f80513c;
                boolean z6 = false;
                if (((playerContainer == null || (controlContainerService = playerContainer.getControlContainerService()) == null) ? null : controlContainerService.getScreenModeType()) != null) {
                    Context context2 = playerProgressTextWidget.f80513c.getContext();
                    Object systemService = null;
                    if (context2 != null) {
                        systemService = context2.getSystemService("clipboard");
                    }
                    ClipboardManager clipboardManager = (ClipboardManager) systemService;
                    if (!TextUtils.isEmpty(playerProgressTextWidget.getText())) {
                        try {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText("TIME_STAMP", playerProgressTextWidget.getText().subSequence(0, StringsKt.A(playerProgressTextWidget.getText(), "/", 0, false, 6)).toString()));
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                        PlayerToast playerToastBuild = new PlayerToast.Builder().toastItemType(17).location(33).setExtraString("extra_title", context2.getResources().getString(2131820628)).duration(PayTask.f60018j).build();
                        PlayerContainer playerContainer2 = playerProgressTextWidget.f80513c;
                        if (playerContainer2 != null && (toastService = playerContainer2.getToastService()) != null) {
                            toastService.showToast(playerToastBuild);
                        }
                        PlayerContainer playerContainer3 = playerProgressTextWidget.f80513c;
                        if (playerContainer3 != null && (reporterService = playerContainer3.getReporterService()) != null) {
                            reporterService.report(new NeuronsEvents.NormalEvent("player.player.toast-copytimestamp.show.player", new String[0]));
                        }
                        z6 = true;
                    }
                }
                return z6;
            }
        });
    }

    public void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f80513c = playerContainer;
    }

    public void onControlContainerVisibleChanged(boolean z6) {
        if (z6) {
            IPlayerCoreService iPlayerCoreService = this.f80514d;
            int duration = 0;
            int currentPosition = iPlayerCoreService != null ? iPlayerCoreService.getCurrentPosition() : 0;
            IPlayerCoreService iPlayerCoreService2 = this.f80514d;
            if (iPlayerCoreService2 != null) {
                duration = iPlayerCoreService2.getDuration();
            }
            updateTime(currentPosition, duration);
        }
    }

    public void onPlayerProgressChange(int i7, int i8) {
        updateTime(i7, i8);
    }

    public void onWidgetActive() {
        IPlayerServiceManager playerServiceManager;
        IPlayerServiceManager playerServiceManager2;
        if (this.f80514d == null) {
            PlayerContainer playerContainer = this.f80513c;
            this.f80514d = playerContainer != null ? playerContainer.getPlayerCoreService() : null;
        }
        if (this.f80515e == null) {
            PlayerContainer playerContainer2 = this.f80513c;
            IControlContainerService controlContainerService = null;
            if (playerContainer2 != null) {
                controlContainerService = playerContainer2.getControlContainerService();
            }
            this.f80515e = controlContainerService;
        }
        if (this.f80516f.getService() == null) {
            PlayerServiceManager.ServiceDescriptor serviceDescriptorObtain = PlayerServiceManager.ServiceDescriptor.Companion.obtain(SeekService.class);
            PlayerContainer playerContainer3 = this.f80513c;
            if (playerContainer3 != null && (playerServiceManager2 = playerContainer3.getPlayerServiceManager()) != null) {
                playerServiceManager2.startService(serviceDescriptorObtain);
            }
            PlayerContainer playerContainer4 = this.f80513c;
            if (playerContainer4 != null && (playerServiceManager = playerContainer4.getPlayerServiceManager()) != null) {
                playerServiceManager.bindService(serviceDescriptorObtain, this.f80516f);
            }
        }
        SeekService service = this.f80516f.getService();
        if (service != null) {
            service.registerPlayerProgressObserver(this);
        }
        IControlContainerService iControlContainerService = this.f80515e;
        if (iControlContainerService != null) {
            iControlContainerService.registerControlContainerVisible(this);
        }
    }

    public void onWidgetInactive() {
        SeekService service = this.f80516f.getService();
        if (service != null) {
            service.unregisterPlayerProgressObserver(this);
        }
        IControlContainerService iControlContainerService = this.f80515e;
        if (iControlContainerService != null) {
            iControlContainerService.unregisterControlContainerVisible(this);
        }
    }

    @Override // android.view.View
    public void requestLayout() {
        if (this.f80512b) {
            this.f80512b = false;
            super.requestLayout();
        }
    }

    @Override // android.widget.TextView
    public void setText(@Nullable CharSequence charSequence, @NotNull TextView.BufferType bufferType) {
        CharSequence charSequence2 = this.f80511a;
        this.f80512b = charSequence2 == null || charSequence == null || charSequence2.length() != charSequence.length();
        this.f80511a = charSequence;
        TextPaint paint = getPaint();
        if (!this.f80512b && charSequence != null && paint != null) {
            this.f80512b = paint.measureText(charSequence, 0, charSequence.length()) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()));
        }
        super.setText(charSequence, bufferType);
    }

    public final void updateTime(int i7, int i8) {
        TimeFormater timeFormater = TimeFormater.INSTANCE;
        String time = timeFormater.formatTime(i7, false, false);
        if (TextUtils.isEmpty(time)) {
            time = "00:00";
        }
        String time2 = timeFormater.formatTime(i8, false, false);
        setText(time + "/" + (TextUtils.isEmpty(time2) ? "00:00" : time2));
    }
}
