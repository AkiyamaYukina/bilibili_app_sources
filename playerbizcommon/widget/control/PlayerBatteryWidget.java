package com.bilibili.playerbizcommon.widget.control;

import android.R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerBatteryWidget.class */
public final class PlayerBatteryWidget extends AppCompatImageView implements IControlWidget {

    @NotNull
    public static final a Companion = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f80463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Rect f80464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public b f80465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Paint f80466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f80467f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerBatteryWidget$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerBatteryWidget$b.class */
    public static final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerBatteryWidget f80468a;

        public b(PlayerBatteryWidget playerBatteryWidget) {
            this.f80468a = playerBatteryWidget;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            this.f80468a.q(intent);
        }
    }

    public PlayerBatteryWidget(@NotNull Context context) {
        super(context);
        this.f80464c = new Rect();
        this.f80466e = new Paint();
        this.f80467f = getResources().getColor(R.color.white);
    }

    public PlayerBatteryWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80464c = new Rect();
        this.f80466e = new Paint();
        this.f80467f = getResources().getColor(R.color.white);
    }

    public PlayerBatteryWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f80464c = new Rect();
        this.f80466e = new Paint();
        this.f80467f = getResources().getColor(R.color.white);
    }

    public void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f80465d != null) {
            PlayerLog.w("PlayerBatteryWidget", "BatteryReceiver may be already registered!");
            return;
        }
        this.f80465d = new b(this);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Context applicationContext = getContext().getApplicationContext();
        b bVar = this.f80465d;
        q(Build.VERSION.SDK_INT >= 34 ? applicationContext.registerReceiver(bVar, intentFilter, 4) : applicationContext.registerReceiver(bVar, intentFilter));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        Context applicationContext = getContext().getApplicationContext();
        b bVar = this.f80465d;
        if (bVar != null && applicationContext != null) {
            try {
                applicationContext.unregisterReceiver(bVar);
            } catch (IllegalArgumentException e7) {
                PlayerLog.w("PlayerBatteryWidget", e7);
            }
            this.f80465d = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        if (this.f80462a == 0 || this.f80463b) {
            super.onDraw(canvas);
            return;
        }
        Rect bounds = getDrawable().getBounds();
        int px = NewPlayerUtilsKt.toPx(7.0f);
        int iWidth = (int) ((((bounds.width() - (px * 2)) - NewPlayerUtilsKt.toPx(1.5f)) / 100.0f) * this.f80462a);
        Rect rect = this.f80464c;
        int i7 = bounds.left;
        rect.set(i7 + px, bounds.top + px, i7 + px + iWidth, bounds.bottom - px);
        this.f80466e.setColor(this.f80462a < 15 ? -428947 : this.f80467f);
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.concat(getImageMatrix());
        canvas.drawRect(this.f80464c, this.f80466e);
        canvas.restoreToCount(saveCount);
        super.onDraw(canvas);
    }

    public void onWidgetActive() {
    }

    public void onWidgetInactive() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(android.content.Intent r5) {
        /*
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r5
            java.lang.String r1 = "level"
            r2 = 100
            int r0 = r0.getIntExtra(r1, r2)
            r10 = r0
            r0 = 0
            r8 = r0
            r0 = r5
            java.lang.String r1 = "plugged"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r6 = r0
            r0 = 1
            r9 = r0
            r0 = r6
            if (r0 == 0) goto L27
            r0 = 1
            r11 = r0
            goto L2a
        L27:
            r0 = 0
            r11 = r0
        L2a:
            r0 = r4
            r1 = r11
            r0.f80463b = r1
            r0 = r11
            if (r0 == 0) goto L43
            r0 = 2131238442(0x7f081e2a, float:1.8093163E38)
            r6 = r0
        L38:
            r0 = 0
            r8 = r0
            r0 = r6
            r7 = r0
            r0 = r8
            r6 = r0
        L40:
            goto L6b
        L43:
            r0 = 2131238443(0x7f081e2b, float:1.8093165E38)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r10
            if (r0 == 0) goto L38
            r0 = r10
            r1 = 15
            if (r0 < r1) goto L59
            r0 = r7
            r6 = r0
            goto L38
        L59:
            r0 = r10
            r1 = 15
            if (r0 >= r1) goto L66
            r0 = r9
            r6 = r0
            goto L40
        L66:
            r0 = 0
            r6 = r0
            r0 = r8
            r7 = r0
        L6b:
            r0 = r4
            r1 = r7
            super.setImageResource(r1)
            r0 = r4
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L97
            r0 = r6
            if (r0 == 0) goto L8c
            r0 = r5
            java.lang.String r1 = "#F9746D"
            int r1 = android.graphics.Color.parseColor(r1)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.setColorFilter(r1, r2)
            goto L97
        L8c:
            r0 = r5
            r1 = r4
            int r1 = r1.f80467f
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.setColorFilter(r1, r2)
        L97:
            r0 = r4
            int r0 = r0.f80462a
            r1 = r10
            if (r0 == r1) goto Laa
            r0 = r4
            r1 = r10
            r0.f80462a = r1
            r0 = r4
            r0.invalidate()
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.control.PlayerBatteryWidget.q(android.content.Intent):void");
    }
}
