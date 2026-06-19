package com.bilibili.playerbizcommonv2.widget.device;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/device/PlayerDateTextWidget.class */
@StabilityInferred(parameters = 0)
public final class PlayerDateTextWidget extends AppCompatTextView implements IControlWidget, ControlContainerVisibleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Inject
    public IControlContainerService f82443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f82444b;

    public PlayerDateTextWidget(@NotNull Context context) {
        super(context);
        this.f82444b = true;
    }

    public PlayerDateTextWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82444b = true;
    }

    @NotNull
    public final IControlContainerService getControlContainerService() {
        IControlContainerService iControlContainerService = this.f82443a;
        if (iControlContainerService != null) {
            return iControlContainerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
        return null;
    }

    public boolean getMembersInjector() {
        return this.f82444b;
    }

    public final void onControlContainerVisibleChanged(boolean z6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        setText(String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12))}, 2)));
    }

    public final void onWidgetActive() {
        getControlContainerService().registerControlContainerVisible(this);
    }

    public final void onWidgetInactive() {
        getControlContainerService().unregisterControlContainerVisible(this);
    }

    public final void setControlContainerService(@NotNull IControlContainerService iControlContainerService) {
        this.f82443a = iControlContainerService;
    }
}
