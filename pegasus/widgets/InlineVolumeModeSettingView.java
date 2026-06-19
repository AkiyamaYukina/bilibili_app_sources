package com.bilibili.pegasus.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.pegasus.PegasusInlineVolumeMode;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/InlineVolumeModeSettingView.class */
@StabilityInferred(parameters = 0)
public final class InlineVolumeModeSettingView extends TintLinearLayout {
    public static final int h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final View f79174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final View f79175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ImageView f79176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ImageView f79177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final com.bilibili.pegasus.k f79178g;

    @JvmOverloads
    public InlineVolumeModeSettingView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public InlineVolumeModeSettingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public InlineVolumeModeSettingView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        com.bilibili.pegasus.k kVar = (com.bilibili.pegasus.k) BLRouter.get$default(BLRouter.INSTANCE, com.bilibili.pegasus.k.class, (String) null, 2, (Object) null);
        this.f79178g = kVar;
        setOrientation(1);
        View viewInflate = LayoutInflater.from(context).inflate(2131496254, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(2131298882);
        this.f79174c = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(2131298881);
        this.f79175d = viewFindViewById2;
        ImageView imageView = (ImageView) viewInflate.findViewById(2131309889);
        this.f79176e = imageView;
        ImageView imageView2 = (ImageView) viewInflate.findViewById(2131309888);
        this.f79177f = imageView2;
        imageView.setVisibility(c(kVar != null ? kVar.a() : null) ? 0 : 8);
        imageView2.setVisibility(c(kVar != null ? kVar.a() : null) ? 8 : 0);
        viewFindViewById.setOnClickListener(new g(this, 0));
        viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.pegasus.widgets.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InlineVolumeModeSettingView f79238a;

            {
                this.f79238a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InlineVolumeModeSettingView inlineVolumeModeSettingView = this.f79238a;
                int i9 = InlineVolumeModeSettingView.h;
                com.bilibili.pegasus.promo.setting.c.a();
                inlineVolumeModeSettingView.f79176e.setVisibility(8);
                inlineVolumeModeSettingView.f79177f.setVisibility(0);
                com.bilibili.pegasus.k kVar2 = inlineVolumeModeSettingView.f79178g;
                if (InlineVolumeModeSettingView.c(kVar2 != null ? kVar2.a() : null)) {
                    com.bilibili.pegasus.k kVar3 = inlineVolumeModeSettingView.f79178g;
                    if (kVar3 != null) {
                        kVar3.b(PegasusInlineVolumeMode.MODE_USER_CLOSE);
                    }
                    InlineVolumeModeSettingView.d(false);
                }
            }
        });
    }

    public static boolean c(PegasusInlineVolumeMode pegasusInlineVolumeMode) {
        return pegasusInlineVolumeMode == PegasusInlineVolumeMode.MODE_USER_OPEN || pegasusInlineVolumeMode == PegasusInlineVolumeMode.MODE_SERVER_OPEN;
    }

    public static void d(boolean z6) {
        Neurons.reportClick(false, "main.detail-setting-layout.layoutstyle.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("layoutstyle", "volume"), TuplesKt.to("layoutcontent", z6 ? "1" : "2")}));
    }
}
