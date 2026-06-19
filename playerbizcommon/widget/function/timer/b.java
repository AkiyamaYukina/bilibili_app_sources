package com.bilibili.playerbizcommon.widget.function.timer;

import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.widget.C3259x;
import com.bilibili.playerbizcommon.widget.function.timer.PlayerTimePicker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.business.ShutOffTimingService;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/timer/b.class */
public final class b extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f80792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PlayerTimePicker f80793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PlayerTimePicker f80794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<ShutOffTimingService> f80795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.ServiceDescriptor<ShutOffTimingService> f80796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f80797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C0525b f80798g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/timer/b$a.class */
    public static final class a implements PlayerTimePicker.d {
        @Override // com.bilibili.playerbizcommon.widget.function.timer.PlayerTimePicker.d
        public final String format(int i7) {
            return (i7 < 0 || i7 >= 10) ? String.valueOf(i7) : C3259x.a(i7, "0");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.widget.function.timer.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/timer/b$b.class */
    public static final class C0525b implements PlayerTimePicker.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f80799a;

        public C0525b(b bVar) {
            this.f80799a = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
        @Override // com.bilibili.playerbizcommon.widget.function.timer.PlayerTimePicker.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r3 = this;
                r0 = r3
                com.bilibili.playerbizcommon.widget.function.timer.b r0 = r0.f80799a
                r8 = r0
                r0 = r8
                android.widget.TextView r0 = r0.f80797f
                if (r0 == 0) goto L61
                r0 = r8
                com.bilibili.playerbizcommon.widget.function.timer.PlayerTimePicker r0 = r0.f80793b
                r7 = r0
                r0 = 0
                r6 = r0
                r0 = r7
                r5 = r0
                r0 = r7
                if (r0 != 0) goto L26
                java.lang.String r0 = "mHourPicker"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
                r5 = r0
            L26:
                r0 = r5
                int r0 = r0.getMCurrentValue()
                if (r0 > 0) goto L50
                r0 = r8
                com.bilibili.playerbizcommon.widget.function.timer.PlayerTimePicker r0 = r0.f80794c
                r5 = r0
                r0 = r5
                if (r0 != 0) goto L41
                java.lang.String r0 = "mMinutePicker"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = r6
                r5 = r0
                goto L41
            L41:
                r0 = r5
                int r0 = r0.getMCurrentValue()
                if (r0 <= 0) goto L4b
                goto L50
            L4b:
                r0 = 0
                r4 = r0
                goto L52
            L50:
                r0 = 1
                r4 = r0
            L52:
                r0 = r8
                android.widget.TextView r0 = r0.f80797f
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L61
                r0 = r5
                r1 = r4
                r0.setEnabled(r1)
            L61:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.function.timer.b.C0525b.a():void");
        }
    }

    public b(@NotNull Context context) {
        super(context);
        this.f80795d = new PlayerServiceManager.Client<>();
        this.f80796e = PlayerServiceManager.ServiceDescriptor.Companion.obtain(ShutOffTimingService.class);
        this.f80798g = new C0525b(this);
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f80792a = playerContainer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dc  */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.playerbizcommon.widget.function.timer.PlayerTimePicker$d, java.lang.Object] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View createContentView(@org.jetbrains.annotations.NotNull android.content.Context r7) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.function.timer.b.createContentView(android.content.Context):android.view.View");
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builder = new FunctionWidgetConfig.Builder();
        builder.launchType(1);
        builder.dismissWhenScreenModeChange(true);
        builder.dismissWhenVideoCompleted(true);
        builder.persistent(true);
        builder.dismissWhenVideoChange(true);
        builder.changeOrientationDisableWhenShow(true);
        return builder.build();
    }

    @NotNull
    public final String getTag() {
        return "PlayerTimePickerFunctionWidget";
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        IPlayerContainer iPlayerContainer = this.f80792a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerServiceManager().unbindService(this.f80796e, this.f80795d);
        super.onWidgetDismiss();
    }

    public final void onWidgetShow() {
        super.onWidgetShow();
        IPlayerContainer iPlayerContainer = this.f80792a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerServiceManager().bindService(this.f80796e, this.f80795d);
    }
}
