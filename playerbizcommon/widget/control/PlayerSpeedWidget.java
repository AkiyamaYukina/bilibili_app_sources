package com.bilibili.playerbizcommon.widget.control;

import android.content.Context;
import android.util.AttributeSet;
import com.bilibili.playerbizcommon.view.FromTextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.ControlWidgetChangedObserver;
import tv.danmaku.biliplayerv2.service.IPlayerSpeedChangedObserver;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSpeedWidget.class */
public final class PlayerSpeedWidget extends FromTextView implements IControlWidget {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f80562f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PlayerContainer f80563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f80564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c f80565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f80566e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSpeedWidget$a.class */
    public static final class a implements ControlContainerVisibleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerSpeedWidget f80567a;

        public a(PlayerSpeedWidget playerSpeedWidget) {
            this.f80567a = playerSpeedWidget;
        }

        public final void onControlContainerVisibleChanged(boolean z6) {
            if (z6) {
                int i7 = PlayerSpeedWidget.f80562f;
                this.f80567a.J();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSpeedWidget$b.class */
    public static final class b implements ControlWidgetChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerSpeedWidget f80568a;

        public b(PlayerSpeedWidget playerSpeedWidget) {
            this.f80568a = playerSpeedWidget;
        }

        public final void onControllerWidgetChanged() {
            int i7 = PlayerSpeedWidget.f80562f;
            this.f80568a.K();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSpeedWidget$c.class */
    public static final class c implements IPlayerSpeedChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerSpeedWidget f80569a;

        public c(PlayerSpeedWidget playerSpeedWidget) {
            this.f80569a = playerSpeedWidget;
        }

        public final void onChanged(float f7) {
            int i7 = PlayerSpeedWidget.f80562f;
            this.f80569a.J();
        }
    }

    public PlayerSpeedWidget(@NotNull Context context) {
        super(context);
        this.f80564c = new b(this);
        this.f80565d = new c(this);
        this.f80566e = new a(this);
    }

    public PlayerSpeedWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80564c = new b(this);
        this.f80565d = new c(this);
        this.f80566e = new a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J() {
        /*
            r8 = this;
            r0 = r8
            tv.danmaku.biliplayerv2.PlayerContainer r0 = r0.f80563b
            r12 = r0
            r0 = r12
            r11 = r0
            r0 = r12
            if (r0 != 0) goto L15
            java.lang.String r0 = "mPlayerContainer"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r11 = r0
        L15:
            r0 = r11
            tv.danmaku.biliplayerv2.service.IPlayerCoreService r0 = r0.getPlayerCoreService()
            r1 = 0
            r2 = 1
            r3 = 0
            float r0 = tv.danmaku.biliplayerv2.service.IPlayerCoreService.getPlaySpeed$default(r0, r1, r2, r3)
            r10 = r0
            r0 = r10
            r1 = 1073657938(0x3ffeb852, float:1.99)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L2e
        L29:
            r0 = 1073741824(0x40000000, float:2.0)
            r9 = r0
            goto L39
        L2e:
            r0 = r10
            r9 = r0
            r0 = r10
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L39
            goto L29
        L39:
            r0 = r9
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5c
            r0 = r8
            r1 = r8
            android.content.Context r1 = r1.getContext()
            r2 = 2131845530(0x7f11619a, float:1.9324484E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setText(r1)
            r0 = r8
            r1 = r8
            android.content.Context r1 = r1.getContext()
            r2 = 2131847174(0x7f116806, float:1.9327818E38)
            java.lang.String r1 = r1.getString(r2)
            r0.setContentDescription(r1)
            goto L8c
        L5c:
            r0 = r8
            r1 = r8
            android.content.Context r1 = r1.getContext()
            r2 = 2131832781(0x7f112fcd, float:1.9298626E38)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r9
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r4[r5] = r6
            java.lang.String r1 = r1.getString(r2, r3)
            r0.setText(r1)
            r0 = r8
            r1 = r8
            android.content.Context r1 = r1.getContext()
            r2 = 2131845723(0x7f11625b, float:1.9324875E38)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = r3
            r5 = 0
            r6 = r9
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r4[r5] = r6
            java.lang.String r1 = r1.getString(r2, r3)
            r0.setContentDescription(r1)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.control.PlayerSpeedWidget.J():void");
    }

    public final void K() {
        if (getWidgetFrom() == 1) {
            IPlayerContainer iPlayerContainer = this.f80563b;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            Oi1.d cloudConfig = iPlayerContainer2.getPlayerSettingService().getCloudConfig();
            setVisibility((cloudConfig.p() && cloudConfig.L()) ? 0 : 8);
        }
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f80563b = playerContainer;
    }

    public final void onWidgetActive() {
        IPlayerContainer iPlayerContainer = this.f80563b;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getControlContainerService().registerWidgetChangedObserver(this.f80564c);
        J();
        K();
        IPlayerContainer iPlayerContainer3 = this.f80563b;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        iPlayerContainer4.getPlayerCoreService().addPlayerSpeedChangedObserver(this.f80565d);
        IPlayerContainer iPlayerContainer5 = this.f80563b;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer5 = null;
        }
        iPlayerContainer5.getControlContainerService().registerControlContainerVisible(this.f80566e);
        setOnClickListener(new XD.b(this, 2));
    }

    public final void onWidgetInactive() {
        setOnClickListener(null);
        IPlayerContainer iPlayerContainer = this.f80563b;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerCoreService().removePlayerSpeedChangedObserver(this.f80565d);
        IPlayerContainer iPlayerContainer3 = this.f80563b;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        iPlayerContainer4.getControlContainerService().unregisterControlContainerVisible(this.f80566e);
        IPlayerContainer iPlayerContainer5 = this.f80563b;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer5 = null;
        }
        iPlayerContainer5.getControlContainerService().registerWidgetChangedObserver(this.f80564c);
    }
}
