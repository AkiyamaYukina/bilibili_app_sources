package com.bilibili.playerbizcommon.widget.control;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerDateTextWidget.class */
public final class PlayerDateTextWidget extends AppCompatTextView implements IControlWidget, ControlContainerVisibleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f80498a;

    public PlayerDateTextWidget(@NotNull Context context) {
        super(context);
    }

    public PlayerDateTextWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlayerDateTextWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    public void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f80498a = playerContainer;
    }

    public void onControlContainerVisibleChanged(boolean z6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        setText(String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12))}, 2)));
    }

    public void onWidgetActive() {
        IPlayerContainer iPlayerContainer = this.f80498a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getControlContainerService().registerControlContainerVisible(this);
    }

    public void onWidgetInactive() {
        IPlayerContainer iPlayerContainer = this.f80498a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getControlContainerService().unregisterControlContainerVisible(this);
    }
}
