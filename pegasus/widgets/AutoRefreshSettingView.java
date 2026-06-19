package com.bilibili.pegasus.widgets;

import OS0.A0;
import OS0.B0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.pegasus.PegasusAutoRefreshMode;
import com.bilibili.pegasus.utils.AutoRefreshSettingHelper;
import gl.D;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/AutoRefreshSettingView.class */
@StabilityInferred(parameters = 0)
public final class AutoRefreshSettingView extends TintLinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ImageView f79160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ImageView f79161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final com.bilibili.pegasus.f f79162e;

    @JvmOverloads
    public AutoRefreshSettingView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public AutoRefreshSettingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public AutoRefreshSettingView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        com.bilibili.pegasus.f fVar = (com.bilibili.pegasus.f) BLRouter.get$default(BLRouter.INSTANCE, com.bilibili.pegasus.f.class, (String) null, 2, (Object) null);
        this.f79162e = fVar;
        boolean z6 = true;
        setOrientation(1);
        D dInflate = D.inflate(LayoutInflater.from(context), this);
        ImageView imageView = dInflate.e;
        this.f79160c = imageView;
        ImageView imageView2 = dInflate.d;
        this.f79161d = imageView2;
        AutoRefreshSettingHelper.AutoRefreshInfo autoRefreshInfo = AutoRefreshSettingHelper.f78846a;
        dInflate.f.setText(autoRefreshInfo.getTitle());
        dInflate.h.setText(autoRefreshInfo.getOpen());
        dInflate.g.setText(autoRefreshInfo.getClose());
        PegasusAutoRefreshMode pegasusAutoRefreshModeB = fVar != null ? fVar.b() : null;
        PegasusAutoRefreshMode pegasusAutoRefreshMode = PegasusAutoRefreshMode.MODE_USER_CLOSE;
        imageView.setVisibility((pegasusAutoRefreshModeB == pegasusAutoRefreshMode || pegasusAutoRefreshModeB == PegasusAutoRefreshMode.MODE_SERVER_CLOSE) ? false : z6 ? 0 : 8);
        PegasusAutoRefreshMode pegasusAutoRefreshModeB2 = fVar != null ? fVar.b() : null;
        int i9 = 0;
        if (pegasusAutoRefreshModeB2 != pegasusAutoRefreshMode) {
            i9 = 0;
            if (pegasusAutoRefreshModeB2 != PegasusAutoRefreshMode.MODE_SERVER_CLOSE) {
                i9 = 8;
            }
        }
        imageView2.setVisibility(i9);
        dInflate.c.setOnClickListener(new A0(this, 2));
        dInflate.b.setOnClickListener(new B0(this, 1));
    }

    public static void c(boolean z6) {
        Neurons.reportClick(false, "main.detail-setting-layout.layoutstyle.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("layoutstyle", "refresh"), TuplesKt.to("layoutcontent", z6 ? "1" : "2")}));
    }
}
