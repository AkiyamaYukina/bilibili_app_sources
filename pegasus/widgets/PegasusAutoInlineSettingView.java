package com.bilibili.pegasus.widgets;

import OS0.F0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.inline.config.pegasus.PegasusInlineConfigKt;
import com.bilibili.inline.reporter.AutoPlayTriggerType;
import com.bilibili.inline.reporter.InlinePlayReporterKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.module.list.IInlineAutoPlayV2Service;
import com.bilibili.moduleservice.list.IPegasusInlineConfig;
import com.bilibili.moduleservice.list.PegasusInlineSwitchState;
import gl.C;
import java.util.HashMap;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/PegasusAutoInlineSettingView.class */
@StabilityInferred(parameters = 0)
public final class PegasusAutoInlineSettingView extends TintLinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ImageView f79186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ImageView f79187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ImageView f79188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final IPegasusInlineConfig f79189f;

    @JvmOverloads
    public PegasusAutoInlineSettingView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public PegasusAutoInlineSettingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public PegasusAutoInlineSettingView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        BLRouter bLRouter = BLRouter.INSTANCE;
        IPegasusInlineConfig iPegasusInlineConfig = (IPegasusInlineConfig) BLRouter.get$default(bLRouter, IPegasusInlineConfig.class, (String) null, 2, (Object) null);
        this.f79189f = iPegasusInlineConfig;
        setOrientation(1);
        C cInflate = C.inflate(LayoutInflater.from(context), this);
        this.f79186c = cInflate.g;
        this.f79187d = cInflate.f;
        this.f79188e = cInflate.e;
        setCurrentValue(iPegasusInlineConfig != null ? iPegasusInlineConfig.getCurrentState() : null);
        IInlineAutoPlayV2Service iInlineAutoPlayV2Service = (IInlineAutoPlayV2Service) bLRouter.get(IInlineAutoPlayV2Service.class, "pegasus_inline_auto_play_service_v2");
        cInflate.j.setText(iInlineAutoPlayV2Service != null ? iInlineAutoPlayV2Service.getAutoPlaySettingText(PegasusInlineSwitchState.ALL_NETWORK) : null);
        cInflate.i.setText(iInlineAutoPlayV2Service != null ? iInlineAutoPlayV2Service.getAutoPlaySettingText(PegasusInlineSwitchState.WIFI_ONLY) : null);
        cInflate.h.setText(iInlineAutoPlayV2Service != null ? iInlineAutoPlayV2Service.getAutoPlaySettingText(PegasusInlineSwitchState.OFF) : null);
        cInflate.d.setOnClickListener(new i(this, 0));
        cInflate.c.setOnClickListener(new F0(this, 2));
        cInflate.b.setOnClickListener(new HT0.l(this, 1));
    }

    public static void c(PegasusAutoInlineSettingView pegasusAutoInlineSettingView) {
        pegasusAutoInlineSettingView.setCurrentValue(PegasusInlineConfigKt.toPegasusInlineSwitchState("1"));
        IPegasusInlineConfig iPegasusInlineConfig = pegasusAutoInlineSettingView.f79189f;
        if ((iPegasusInlineConfig != null ? iPegasusInlineConfig.getCurrentState() : null) == PegasusInlineSwitchState.ALL_NETWORK) {
            return;
        }
        pegasusAutoInlineSettingView.f("1");
    }

    public static void d(PegasusAutoInlineSettingView pegasusAutoInlineSettingView) {
        pegasusAutoInlineSettingView.setCurrentValue(PegasusInlineConfigKt.toPegasusInlineSwitchState("2"));
        IPegasusInlineConfig iPegasusInlineConfig = pegasusAutoInlineSettingView.f79189f;
        if ((iPegasusInlineConfig != null ? iPegasusInlineConfig.getCurrentState() : null) == PegasusInlineSwitchState.WIFI_ONLY) {
            return;
        }
        pegasusAutoInlineSettingView.f("2");
    }

    public static void e(PegasusAutoInlineSettingView pegasusAutoInlineSettingView) {
        pegasusAutoInlineSettingView.setCurrentValue(PegasusInlineConfigKt.toPegasusInlineSwitchState("3"));
        IPegasusInlineConfig iPegasusInlineConfig = pegasusAutoInlineSettingView.f79189f;
        if ((iPegasusInlineConfig != null ? iPegasusInlineConfig.getCurrentState() : null) == PegasusInlineSwitchState.OFF) {
            return;
        }
        pegasusAutoInlineSettingView.f("3");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void setCurrentValue(PegasusInlineSwitchState pegasusInlineSwitchState) {
        String pegasusInlinePrefString = PegasusInlineConfigKt.toPegasusInlinePrefString(PegasusInlineConfigKt.toPegasusInlineDeviceConfigValue(pegasusInlineSwitchState));
        switch (pegasusInlinePrefString.hashCode()) {
            case 49:
                if (pegasusInlinePrefString.equals("1")) {
                    this.f79186c.setVisibility(0);
                    this.f79187d.setVisibility(8);
                    this.f79188e.setVisibility(8);
                    return;
                }
                break;
            case 50:
                if (pegasusInlinePrefString.equals("2")) {
                    this.f79186c.setVisibility(8);
                    this.f79187d.setVisibility(0);
                    this.f79188e.setVisibility(8);
                    return;
                }
                break;
            case 51:
                if (pegasusInlinePrefString.equals("3")) {
                    this.f79186c.setVisibility(8);
                    this.f79187d.setVisibility(8);
                    this.f79188e.setVisibility(0);
                    return;
                }
                break;
        }
        this.f79186c.setVisibility(0);
        this.f79187d.setVisibility(8);
        this.f79188e.setVisibility(8);
    }

    public final void f(@NotNull String str) {
        InlinePlayReporterKt.reportTryAutoPlayEvent$default(AutoPlayTriggerType.INLINE_THREE_POINT, (String) null, PegasusInlineConfigKt.isAutoPlayEnable(PegasusInlineConfigKt.toPegasusInlineSwitchState(str)), 2, (Object) null);
        IPegasusInlineConfig iPegasusInlineConfig = this.f79189f;
        if (iPegasusInlineConfig != null) {
            iPegasusInlineConfig.setInlineSwitchState(PegasusInlineConfigKt.toPegasusInlineSwitchState(str), true, false);
        }
        HashMap map = new HashMap(2);
        map.put("inline_switch", str);
        Neurons.reportClick(true, "player.player.pegasus-play.0.click", map);
        Op0.g.a("autoplay", str);
    }
}
