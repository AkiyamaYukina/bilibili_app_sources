package com.bilibili.studio.videoeditor.help.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/widget/SpeedGrillViewV2.class */
public class SpeedGrillViewV2 extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f109731A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f109732B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public c f109733C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f109734D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f109735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f109736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f109738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f109739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f109740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f109741g;
    public final RectF h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f109742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f109743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f109744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f109745l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f109746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f109747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f109748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f109749p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f109750q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f109751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f109752s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FrameLayout f109753t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinearLayout f109754u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Drawable f109755v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Drawable f109756w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f109757x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f109758y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ImageView f109759z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/widget/SpeedGrillViewV2$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SpeedGrillViewV2 f109760a;

        public a(SpeedGrillViewV2 speedGrillViewV2) {
            this.f109760a = speedGrillViewV2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f109760a.f109754u.setX((r0.getWidth() / 2.0f) - (this.f109760a.f109754u.getWidth() / 2.0f));
            this.f109760a.getLocationOnScreen(new int[2]);
            this.f109760a.f109754u.setY((r0[1] - r0.f109731A) - r0.f109732B);
            this.f109760a.f109754u.setVisibility(0);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/widget/SpeedGrillViewV2$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f109761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f109762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f109763c;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/help/widget/SpeedGrillViewV2$c.class */
    public interface c {
        void a(float f7);

        void b();
    }

    public SpeedGrillViewV2(Context context) {
        this(context, null);
    }

    public SpeedGrillViewV2(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f109735a = new ArrayList();
        this.h = new RectF();
        this.f109747n = new Rect();
        this.f109734D = 0;
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f109736b = paint;
        paint.setAntiAlias(true);
        this.f109737c = ContextCompat.getColor(context, 2131104793);
        this.f109738d = ContextCompat.getColor(context, 2131102728);
        this.f109740f = ContextCompat.getColor(context, 2131104794);
        this.f109739e = ContextCompat.getColor(context, 2131104719);
        this.f109742i = a(context, 8.0f);
        this.f109743j = a(context, 12.0f);
        this.f109750q = a(context, 12.0f);
        this.f109745l = a(context, 0.8f);
        this.f109746m = a(context, 1.0f);
        this.f109744k = a(context, 30.0f);
        this.f109741g = a(context, 10.0f);
        this.f109732B = a(context, 15.0f);
        this.f109749p = a(context, 17.0f);
        this.f109750q = a(context, 15.0f);
        this.f109751r = a(context, 6.0f);
        Activity activityRequireActivity = ContextUtilKt.requireActivity(context);
        this.f109753t = (FrameLayout) activityRequireActivity.getWindow().getDecorView();
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(2131501871, (ViewGroup) this.f109753t, false);
        this.f109754u = linearLayout;
        this.f109757x = (TextView) linearLayout.findViewById(2131311977);
        this.f109758y = (ImageView) this.f109754u.findViewById(2131318999);
        this.f109759z = (ImageView) this.f109754u.findViewById(2131319001);
        this.f109755v = ResourcesCompat.getDrawable(getResources(), 2131243490, null);
        this.f109756w = ResourcesCompat.getDrawable(getResources(), 2131243491, null);
        Rect rect = new Rect();
        activityRequireActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        this.f109731A = rect.top;
    }

    public static int a(Context context, float f7) {
        return (int) ((f7 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        List<b> list = this.f109735a;
        if (list == null || ((ArrayList) list).size() == 0) {
            return;
        }
        for (int i8 = 0; i8 < ((ArrayList) this.f109735a).size(); i8++) {
            b bVar = (b) ((ArrayList) this.f109735a).get(i8);
            this.f109736b.setColor(this.f109737c);
            RectF rectF = this.h;
            float f7 = bVar.f109761a;
            float f8 = this.f109745l;
            rectF.left = f7 - (f8 / 2.0f);
            rectF.right = (f8 / 2.0f) + f7;
            rectF.bottom = (getHeight() - this.f109749p) - this.f109741g;
            RectF rectF2 = this.h;
            rectF2.top = rectF2.bottom - this.f109742i;
            canvas.drawRoundRect(rectF2, 1.0f, 1.0f, this.f109736b);
            if (i8 % 5 == 0) {
                this.f109736b.setColor(this.f109740f);
                RectF rectF3 = this.h;
                float f9 = bVar.f109761a;
                float f10 = this.f109745l;
                rectF3.left = f9 - f10;
                rectF3.right = f9 + f10;
                rectF3.bottom = (getHeight() - this.f109750q) - this.f109741g;
                RectF rectF4 = this.h;
                rectF4.top = rectF4.bottom - this.f109743j;
                canvas.drawRoundRect(rectF4, 1.0f, 1.0f, this.f109736b);
                this.f109736b.setTextSize(this.f109741g);
                this.f109736b.setColor(this.f109739e);
                Paint paint = this.f109736b;
                String str = bVar.f109763c;
                paint.getTextBounds(str, 0, str.length(), this.f109747n);
                float fWidth = this.f109747n.width();
                this.f109747n.height();
                canvas.drawText(str, bVar.f109761a - (fWidth / 2.0f), getHeight(), this.f109736b);
            }
        }
        this.f109736b.setColor(this.f109738d);
        this.h.left = (getWidth() / 2.0f) - this.f109746m;
        this.h.right = (getWidth() / 2.0f) + this.f109746m;
        this.h.bottom = (getHeight() - this.f109741g) - this.f109751r;
        RectF rectF5 = this.h;
        rectF5.top = rectF5.bottom - this.f109744k;
        canvas.drawRoundRect(rectF5, 1.0f, 1.0f, this.f109736b);
        b bVar2 = this.f109752s;
        if (bVar2 == null || (i7 = this.f109734D) <= 0) {
            return;
        }
        float f11 = bVar2.f109762b;
        if (f11 > 1.0f) {
            float f12 = f11 > 3.0f ? 10.0f : (f11 - 1.0f) / 0.2f;
            Drawable drawable = this.f109755v;
            RectF rectF6 = this.h;
            float f13 = rectF6.left;
            drawable.setBounds((int) (f13 - (f12 * i7)), (int) rectF6.top, (int) f13, (int) rectF6.bottom);
            this.f109755v.draw(canvas);
            return;
        }
        if (f11 < 1.0f) {
            float f14 = (1.0f - f11) / 0.075f;
            Drawable drawable2 = this.f109756w;
            RectF rectF7 = this.h;
            float f15 = rectF7.right;
            drawable2.setBounds((int) f15, (int) rectF7.top, (int) ((f14 * i7) + f15), (int) rectF7.bottom);
            this.f109756w.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fb  */
    /* JADX WARN: Type inference failed for: r0v40, types: [com.bilibili.studio.videoeditor.help.widget.SpeedGrillViewV2$b, java.lang.Object] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.help.widget.SpeedGrillViewV2.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.help.widget.SpeedGrillViewV2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setNowSelect(float f7) {
        List<b> list = this.f109735a;
        if (list != null) {
            float fAbs = Float.MAX_VALUE;
            b bVar = null;
            for (b bVar2 : (ArrayList) list) {
                if (Math.abs(bVar2.f109762b - f7) < fAbs) {
                    fAbs = Math.abs(bVar2.f109762b - f7);
                    bVar = bVar2;
                }
            }
            float f8 = bVar != null ? bVar.f109761a : 0.0f;
            float width = getWidth() / 2;
            Iterator it = ((ArrayList) this.f109735a).iterator();
            while (it.hasNext()) {
                ((b) it.next()).f109761a += width - f8;
            }
            this.f109752s = bVar;
            postInvalidate();
        }
    }

    public void setOnSpeedListener(c cVar) {
        this.f109733C = cVar;
    }
}
