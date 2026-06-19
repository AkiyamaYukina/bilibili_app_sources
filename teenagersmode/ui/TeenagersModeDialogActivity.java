package com.bilibili.teenagersmode.ui;

import OS0.c0;
import Pi0.C2779a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.bililive.biz.currency.LiveCurrencyHelper;
import com.bilibili.bililive.infra.util.app.AppKt;
import com.bilibili.bililive.room.biz.consumption.data.LiveConsumptionManagerData;
import com.bilibili.bililive.room.biz.consumption.ui.LiveConsumptionSetRemindPanel;
import com.bilibili.droid.BundleUtil;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.teenagersmode.c;
import com.bilibili.teenagersmode.utils.TeenagersRouter;
import com.bililive.bililive.infra.hybrid.beans.LiveInputPanelParam;
import com.bililive.bililive.infra.hybrid.widget.LiveBridgeInputPanel;
import java.util.ArrayList;
import java.util.Objects;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.reflect.KProperty;
import tv.danmaku.android.log.BLog;
import up.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModeDialogActivity.class */
public class TeenagersModeDialogActivity extends BaseAppCompatActivity implements Bh0.g {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f110619G = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f110620B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public TextView f110623E;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f110621C = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f110622D = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final i f110624F = new Runnable(this) { // from class: com.bilibili.teenagersmode.ui.i

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TeenagersModeDialogActivity f110675a;

        {
            this.f110675a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TeenagersModeDialogActivity teenagersModeDialogActivity = this.f110675a;
            int i7 = TeenagersModeDialogActivity.f110619G;
            teenagersModeDialogActivity.P6();
        }
    };

    public final void P6() {
        finish();
        c.C1213c.f110575a.f110558c = false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131500139);
        this.f110622D = BundleUtil.getString(getIntent().getExtras(), "special_mode_show_force_popup_window", new String[0]);
        TextView textView = (TextView) findViewById(2131313103);
        this.f110623E = textView;
        this.f110620B = true;
        final int i7 = 0;
        textView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.teenagersmode.ui.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f110676a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f110677b;

            {
                this.f110676a = i7;
                this.f110677b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f110676a) {
                    case 0:
                        TeenagersModeDialogActivity teenagersModeDialogActivity = (TeenagersModeDialogActivity) this.f110677b;
                        teenagersModeDialogActivity.f110620B = false;
                        C2779a.a("main.teenagermodel.teenager-model-window.enter-teenagermodel.click", false);
                        teenagersModeDialogActivity.startActivity(TeenagersModeActivity.Q6(teenagersModeDialogActivity, 0, TeenagersRouter.SourceEvent.DAILY_DIALOG));
                        teenagersModeDialogActivity.P6();
                        break;
                    case 1:
                        ((f.a.a) this.f110677b).q0();
                        break;
                    default:
                        ((LiveConsumptionSetRemindPanel) this.f110677b).c.d(true);
                        break;
                }
            }
        });
        final int i8 = 0;
        ((TextView) findViewById(2131297808)).setOnClickListener(new View.OnClickListener(this, i8) { // from class: com.bilibili.teenagersmode.ui.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f110678a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f110679b;

            {
                this.f110678a = i8;
                this.f110679b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long l7;
                Long l8;
                switch (this.f110678a) {
                    case 0:
                        TeenagersModeDialogActivity teenagersModeDialogActivity = (TeenagersModeDialogActivity) this.f110679b;
                        teenagersModeDialogActivity.f110620B = true;
                        if ("force_entry".equals(teenagersModeDialogActivity.f110622D)) {
                            Neurons.reportClick(false, "main.teenagermodel.teenager-model-window.force-entry-got-it.click");
                        } else if ("force_exit".equals(teenagersModeDialogActivity.f110622D)) {
                            Neurons.reportClick(false, "main.teenagermodel.teenager-model-window.force-entry-closed-got-it.click");
                        } else {
                            C2779a.a("main.teenagermodel.teenager-model-window.got-it.click", false);
                        }
                        com.bilibili.teenagersmode.b.a(teenagersModeDialogActivity).edit().putBoolean("teenagers_mode_dialog_is_appeared", true).apply();
                        teenagersModeDialogActivity.P6();
                        break;
                    default:
                        LiveConsumptionSetRemindPanel liveConsumptionSetRemindPanel = (LiveConsumptionSetRemindPanel) this.f110679b;
                        KProperty[] kPropertyArr = LiveConsumptionSetRemindPanel.l;
                        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(liveConsumptionSetRemindPanel.getContext());
                        if (activityFindActivityOrNull != null) {
                            LiveCurrencyHelper liveCurrencyHelper = LiveCurrencyHelper.INSTANCE;
                            LiveConsumptionManagerData liveConsumptionManagerData = (LiveConsumptionManagerData) liveConsumptionSetRemindPanel.c.a().getValue();
                            long jGoldToRMB = liveCurrencyHelper.goldToRMB((liveConsumptionManagerData == null || (l8 = liveConsumptionManagerData.maxLimitByUser) == null) ? 999999L : l8.longValue());
                            if (jGoldToRMB <= 2147483647L) {
                                LiveInputPanelParam liveInputPanelParam = new LiveInputPanelParam();
                                LiveConsumptionManagerData liveConsumptionManagerData2 = (LiveConsumptionManagerData) liveConsumptionSetRemindPanel.c.a().getValue();
                                long jGoldToRMB2 = liveCurrencyHelper.goldToRMB((liveConsumptionManagerData2 == null || (l7 = liveConsumptionManagerData2.minLimitByUser) == null) ? 1L : l7.longValue());
                                LiveConsumptionManagerData liveConsumptionManagerData3 = (LiveConsumptionManagerData) liveConsumptionSetRemindPanel.c.a().getValue();
                                long jLongValue = 999999;
                                if (liveConsumptionManagerData3 != null) {
                                    Long l9 = liveConsumptionManagerData3.maxLimitByUser;
                                    jLongValue = 999999;
                                    if (l9 != null) {
                                        jLongValue = l9.longValue();
                                    }
                                }
                                liveInputPanelParam.hintMsg = AppKt.formatString(2131853115, new Object[]{Long.valueOf(jGoldToRMB2), Long.valueOf(liveCurrencyHelper.goldToRMB(jLongValue))});
                                liveInputPanelParam.validatorItems = new ArrayList();
                                liveInputPanelParam.maxNumber = (int) jGoldToRMB;
                                new LiveBridgeInputPanel(activityFindActivityOrNull, liveInputPanelParam, new com.bilibili.ad.comm.widget.button.a(liveConsumptionSetRemindPanel, 5)).show();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        if ("force_entry".equals(this.f110622D) || "force_exit".equals(this.f110622D)) {
            TextView textView2 = (TextView) findViewById(2131308958);
            textView2.setVisibility(0);
            ((TextView) findViewById(2131311144)).setText(2131855957);
            if ("force_exit".equals(this.f110622D)) {
                textView2.setText(2131855929);
                this.f110623E.setText(2131855973);
                this.f110623E.setOnClickListener(new c0(this, 1));
            } else if ("force_entry".equals(this.f110622D)) {
                textView2.setText(2131855998);
                this.f110623E.setText(2131855972);
                this.f110623E.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.teenagersmode.ui.l

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TeenagersModeDialogActivity f110680a;

                    {
                        this.f110680a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TeenagersModeDialogActivity teenagersModeDialogActivity = this.f110680a;
                        int i9 = TeenagersModeDialogActivity.f110619G;
                        teenagersModeDialogActivity.getClass();
                        Neurons.reportClick(false, "main.teenagermodel.teenager-model-window.force-entry-close.click");
                        BLRouter.routeTo(new RouteRequest.Builder("bilibili://main/teenagersmode/close").extras(new X50.j(1)).build(), teenagersModeDialogActivity);
                        teenagersModeDialogActivity.P6();
                    }
                });
            }
        }
        Handler handler = HandlerThreads.getHandler(0);
        long j7 = 5000;
        String strDd = DeviceDecision.INSTANCE.dd("teenagers_alert_dismiss_delay_time", String.valueOf(5000L));
        try {
            Objects.requireNonNull(strDd);
            j7 = Long.parseLong(strDd);
        } catch (Exception e7) {
            BLog.e("TeenagersModeDialogActivity", "parse dialog max duration error", e7);
        }
        handler.postDelayed(this.f110624F, j7);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        HandlerThreads.getHandler(0).removeCallbacks(this.f110624F);
        MainDialogManager.showNextDialog("teenager", !this.f110620B, this);
        c.C1213c.f110575a.f110558c = false;
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f110621C) {
            return;
        }
        if ("force_entry".equals(this.f110622D)) {
            Neurons.reportExposure(false, "main.teenagermodel.teenager-model-window.force-entry.show");
            this.f110621C = true;
        } else if ("force_exit".equals(this.f110622D)) {
            Neurons.reportExposure(false, "main.teenagermodel.teenager-model-window.force-closed.show");
            this.f110621C = true;
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
    }
}
