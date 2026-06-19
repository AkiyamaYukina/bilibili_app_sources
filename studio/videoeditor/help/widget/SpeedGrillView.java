package com.bilibili.studio.videoeditor.help.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/widget/SpeedGrillView.class */
public class SpeedGrillView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f109710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f109711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f109713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f109714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f109715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f109716g;
    public final float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f109717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f109718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f109719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f109720l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f109721m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final FrameLayout f109722n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RelativeLayout f109723o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f109724p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f109725q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f109726r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/widget/SpeedGrillView$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SpeedGrillView f109727a;

        public a(SpeedGrillView speedGrillView) {
            this.f109727a = speedGrillView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f109727a.f109723o.setX((r0.getWidth() / 2.0f) - (this.f109727a.f109723o.getWidth() / 2.0f));
            this.f109727a.getLocationOnScreen(new int[2]);
            this.f109727a.f109723o.setY(((r0[1] - r0.f109725q) - r0.getHeight()) + this.f109727a.f109726r);
            this.f109727a.f109723o.setVisibility(0);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/widget/SpeedGrillView$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f109728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f109729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f109730c;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/widget/SpeedGrillView$c.class */
    public interface c {
    }

    public SpeedGrillView(Context context) {
        this(context, null);
    }

    public SpeedGrillView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f109710a = new ArrayList();
        this.f109715f = new RectF();
        this.f109719k = new Rect();
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f109711b = paint;
        paint.setAntiAlias(true);
        this.f109712c = ContextCompat.getColor(context, 2131101449);
        this.f109713d = ContextCompat.getColor(context, 2131102728);
        this.f109716g = a(context, 4.0f);
        this.f109717i = a(context, 0.8f);
        this.f109718j = a(context, 1.0f);
        this.h = a(context, 4.5f);
        this.f109714e = a(context, 10.0f);
        this.f109726r = a(context, 14.0f);
        Activity activityRequireActivity = ContextUtilKt.requireActivity(context);
        this.f109722n = (FrameLayout) activityRequireActivity.getWindow().getDecorView();
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(2131498472, (ViewGroup) this.f109722n, false);
        this.f109723o = relativeLayout;
        this.f109724p = (TextView) relativeLayout.findViewById(2131311977);
        View view = new View(context);
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        view.setBackgroundResource(2131241272);
        Rect rect = new Rect();
        activityRequireActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        this.f109725q = rect.top;
    }

    public static int a(Context context, float f7) {
        return (int) ((f7 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        List<b> list = this.f109710a;
        if (list == null || ((ArrayList) list).size() == 0) {
            return;
        }
        for (int i7 = 0; i7 < ((ArrayList) this.f109710a).size(); i7++) {
            b bVar = (b) ((ArrayList) this.f109710a).get(i7);
            this.f109711b.setColor(this.f109712c);
            RectF rectF = this.f109715f;
            float f7 = bVar.f109728a;
            float f8 = this.f109717i;
            rectF.left = f7 - (f8 / 2.0f);
            rectF.right = (f8 / 2.0f) + f7;
            rectF.bottom = getHeight();
            RectF rectF2 = this.f109715f;
            rectF2.top = rectF2.bottom - this.f109716g;
            canvas.drawRoundRect(rectF2, 1.0f, 1.0f, this.f109711b);
            if (i7 % 5 == 0) {
                this.f109711b.setColor(-1);
                RectF rectF3 = this.f109715f;
                float f9 = bVar.f109728a;
                float f10 = this.f109717i;
                rectF3.left = f9 - f10;
                rectF3.right = f9 + f10;
                rectF3.bottom = getHeight();
                RectF rectF4 = this.f109715f;
                rectF4.top = rectF4.bottom - (this.f109716g * 2.0f);
                canvas.drawRoundRect(rectF4, 1.0f, 1.0f, this.f109711b);
                this.f109711b.setTextSize(this.f109714e);
                Paint paint = this.f109711b;
                String str = bVar.f109730c;
                paint.getTextBounds(str, 0, str.length(), this.f109719k);
                canvas.drawText(str, bVar.f109728a - (this.f109719k.width() / 2.0f), this.f109715f.top - this.f109719k.height(), this.f109711b);
            }
        }
        this.f109711b.setColor(this.f109713d);
        this.f109715f.left = (getWidth() / 2.0f) - this.f109718j;
        this.f109715f.right = (getWidth() / 2.0f) + this.f109718j;
        this.f109715f.bottom = getHeight();
        RectF rectF5 = this.f109715f;
        rectF5.top = rectF5.bottom - (this.h * 2.0f);
        canvas.drawRoundRect(rectF5, 1.0f, 1.0f, this.f109711b);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f6  */
    /* JADX WARN: Type inference failed for: r0v39, types: [com.bilibili.studio.videoeditor.help.widget.SpeedGrillView$b, java.lang.Object] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.help.widget.SpeedGrillView.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.help.widget.SpeedGrillView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setNowSelect(float f7) {
        List<b> list = this.f109710a;
        if (list != null) {
            float fAbs = Float.MAX_VALUE;
            b bVar = null;
            for (b bVar2 : (ArrayList) list) {
                if (Math.abs(bVar2.f109729b - f7) < fAbs) {
                    fAbs = Math.abs(bVar2.f109729b - f7);
                    bVar = bVar2;
                }
            }
            float f8 = bVar != null ? bVar.f109728a : 0.0f;
            float width = getWidth() / 2;
            Iterator it = ((ArrayList) this.f109710a).iterator();
            while (it.hasNext()) {
                ((b) it.next()).f109728a += width - f8;
            }
            this.f109721m = bVar;
            postInvalidate();
        }
    }

    public void setOnSpeedListener(c cVar) {
    }
}
