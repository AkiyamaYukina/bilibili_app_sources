package com.bilibili.ogv.operation2.inlinevideo;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineMuteWidgetV3;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.list.IInlineVolumeService;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/OGVInlineMuteWidget.class */
@StabilityInferred(parameters = 0)
public final class OGVInlineMuteWidget extends InlineMuteWidgetV3 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f70894l = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final IInlineVolumeService f70895k;

    @JvmOverloads
    public OGVInlineMuteWidget(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public OGVInlineMuteWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public OGVInlineMuteWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f70895k = (IInlineVolumeService) BLRouter.INSTANCE.get(IInlineVolumeService.class, "pegasus_inline_volume_key");
    }

    public /* synthetic */ OGVInlineMuteWidget(Context context, AttributeSet attributeSet, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i7);
    }

    @Nullable
    public IInlineVolumeService getMuteService() {
        return this.f70895k;
    }
}
