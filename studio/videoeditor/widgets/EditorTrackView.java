package com.bilibili.studio.videoeditor.widgets;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.D;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.widgets.track.media.BiliEditorMediaTrackView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/EditorTrackView.class */
public class EditorTrackView extends FrameLayout {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f110309N = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f110310A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f110311B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f110312C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f110313D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f110314E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f110315F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f110316G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f110317H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f110318I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f110319J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f110320K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f110321L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final oD0.a f110322M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f110323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f110324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f110325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f110326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f110327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f110328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f110329g;
    public final Paint h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bitmap f110330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextPaint f110331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f110332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f110333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f110334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final GestureDetector f110335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final BiliEditorMediaTrackView f110336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Scroller f110337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AC0.g f110338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f110339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f110340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f110341t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f110342u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList<TrackEditEntry> f110343v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final StringBuilder f110344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f110345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f110346y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f110347z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/EditorTrackView$a.class */
    public interface a {
        void a(int i7, boolean z6);

        void b(int i7, boolean z6);

        void c(int i7, long j7, int i8, long j8);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/EditorTrackView$b.class */
    public interface b {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/EditorTrackView$c.class */
    public interface c {
    }

    public EditorTrackView(@NonNull Context context) {
        this(context, null);
    }

    public EditorTrackView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f110343v = new ArrayList<>();
        this.f110344w = new StringBuilder();
        this.f110345x = getResources().getColor(2131104346);
        this.f110311B = -1;
        this.f110312C = 10;
        this.f110313D = -1;
        this.f110321L = true;
        this.f110323a = context;
        this.f110315F = context.getResources().getDisplayMetrics().widthPixels;
        this.f110314E = DensityUtil.dp2px(context, 1.0f);
        this.f110317H = this.f110315F / 6;
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f110327e = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f110327e.setColor(-12995355);
        Paint paint2 = new Paint();
        this.f110328f = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f110328f.setStrokeWidth(DensityUtil.dp2px(context, 2.0f));
        TextPaint textPaint = new TextPaint();
        this.f110331j = textPaint;
        textPaint.setAntiAlias(true);
        this.f110331j.setTextSize(DensityUtil.dp2px(context, 10.0f));
        this.f110331j.setColor(getResources().getColor(R.color.white));
        Paint paint3 = new Paint();
        this.h = paint3;
        paint3.setAntiAlias(true);
        this.f110330i = BitmapFactory.decodeResource(context.getResources(), 2131234909);
        Paint paint4 = new Paint();
        this.f110329g = paint4;
        paint4.setStyle(style);
        this.f110329g.setColor(context.getResources().getColor(R.color.black));
        this.f110329g.setAlpha(77);
        Paint.FontMetrics fontMetrics = this.f110331j.getFontMetrics();
        this.f110346y = fontMetrics.bottom - fontMetrics.top;
        this.f110347z = DensityUtil.dp2px(context, 4.0f) / 2;
        this.f110312C = DensityUtil.dp2px(context, this.f110312C);
        this.f110335n = new GestureDetector(context, new d(this));
        this.f110337p = new Scroller(getContext(), new LinearInterpolator());
        this.f110340s = new e(this);
        ImageView imageView = new ImageView(context);
        this.f110324b = imageView;
        imageView.setImageResource(2131234900);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(DensityUtil.dp2px(context, 24.0f), DensityUtil.dp2px(context, 40.0f));
        layoutParams.topMargin = DensityUtil.dp2px(context, 5.0f);
        this.f110324b.setScaleType(ImageView.ScaleType.FIT_END);
        this.f110324b.setLayoutParams(layoutParams);
        ImageView imageView2 = new ImageView(context);
        this.f110325c = imageView2;
        imageView2.setImageResource(2131234933);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(DensityUtil.dp2px(context, 24.0f), DensityUtil.dp2px(context, 40.0f));
        layoutParams2.topMargin = DensityUtil.dp2px(context, 5.0f);
        this.f110325c.setScaleType(ImageView.ScaleType.FIT_START);
        this.f110325c.setLayoutParams(layoutParams2);
        this.f110326d = new ImageView(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(DensityUtil.dp2px(context, 2.0f), -1);
        this.f110326d.setBackgroundResource(2131241480);
        this.f110326d.setX((this.f110315F - r0.getWidth()) / 2);
        this.f110326d.setLayoutParams(layoutParams3);
        this.f110336o = new BiliEditorMediaTrackView(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, DensityUtil.dp2px(context, 44.0f));
        layoutParams4.gravity = 80;
        layoutParams4.bottomMargin = DensityUtil.dp2px(context, 5.0f);
        this.f110336o.setLayoutParams(layoutParams4);
        this.f110336o.setDrawFakeDivider(true);
        this.f110336o.setOnMediaTrackTouchListener(this.f110340s);
        removeAllViews();
        addView(this.f110336o);
        addView(this.f110324b);
        addView(this.f110325c);
        addView(this.f110326d);
        this.f110332k = new Rect();
        this.f110333l = new Rect();
        this.f110334m = new Rect();
        this.f110322M = new oD0.a(context);
    }

    public static boolean c(View view, float f7, float f8) {
        return view.getVisibility() == 0 && f7 >= view.getX() && f7 <= view.getX() + ((float) view.getWidth()) && f8 >= view.getY() && f8 <= view.getY() + ((float) view.getHeight());
    }

    private int getDistanceForNextEditArea() {
        if (this.f110313D != -1) {
            return -1;
        }
        int indicatorNextEditIndex = getIndicatorNextEditIndex();
        return (indicatorNextEditIndex == -1 ? this.f110336o.getContentEnd() : this.f110343v.get(indicatorNextEditIndex).rect.left) - getIndicatorPosition();
    }

    private int getEditIndexFromIndicator() {
        return h((int) (this.f110326d.getX() + getXScrolled()));
    }

    private int getIndicatorNextEditIndex() {
        if (this.f110343v == null) {
            return -1;
        }
        int indicatorPosition = getIndicatorPosition();
        for (int i7 = 0; i7 < this.f110343v.size(); i7++) {
            Rect rect = this.f110343v.get(i7).rect;
            if (rect != null && indicatorPosition < rect.left) {
                return i7;
            }
        }
        return -1;
    }

    private long getLeftHandleTime() {
        return k(getLeftHandlePosition() - this.f110336o.getContentStart());
    }

    private long getRightHandleTime() {
        return k(getRightHandlePosition() - this.f110336o.getContentStart());
    }

    public final void A() {
        TrackEditEntry trackEditEntry = this.f110343v.get(this.f110313D);
        trackEditEntry.rect.left = ((Integer) this.f110324b.getTag()).intValue();
        trackEditEntry.inPoint = k(trackEditEntry.rect.left - this.f110336o.getContentStart());
    }

    public final void B() {
        TrackEditEntry trackEditEntry = this.f110343v.get(this.f110313D);
        trackEditEntry.rect.right = ((Integer) this.f110325c.getTag()).intValue();
        trackEditEntry.outPoint = k(trackEditEntry.rect.right - this.f110336o.getContentStart());
    }

    public final TrackEditEntry a(long j7, long j8, long j9, long j10, long j11, String str) {
        int i7 = i(j8);
        int contentStart = this.f110336o.getContentStart();
        return new TrackEditEntry(str, new Rect(contentStart + i7, getDrawRectTop(), this.f110336o.getContentStart() + i(j9), getDrawRectBottom()), j7, j8, j9, j10, j11);
    }

    public final void b(int i7, long j7) {
        int i8;
        TrackEditEntry trackEditEntry = this.f110343v.get(i7);
        trackEditEntry.rect.right = i(j7) + this.f110336o.getContentStart();
        trackEditEntry.outPoint = j7;
        y(0);
        n(this.f110313D);
        v(this.f110313D);
        invalidate();
        a aVar = this.f110341t;
        if (aVar == null || (i8 = this.f110313D) == -1) {
            return;
        }
        aVar.a(i8, false);
        a aVar2 = this.f110341t;
        int i9 = this.f110313D;
        long j8 = this.f110343v.get(i7).inPoint;
        long j9 = this.f110343v.get(i7).outPoint;
        long j10 = this.f110343v.get(this.f110313D).trimIn;
        long j11 = this.f110343v.get(this.f110313D).trimOut;
        aVar2.c(i9, j8, 0, j9);
    }

    public final boolean d() {
        int distanceForNextEditArea = getDistanceForNextEditArea();
        return distanceForNextEditArea != -1 && k(distanceForNextEditArea) > TransitionInfo.DEFAULT_DURATION;
    }

    public final boolean e(int i7, int i8) {
        ArrayList<TrackEditEntry> arrayList = this.f110343v;
        boolean z6 = false;
        if (arrayList != null) {
            if (i7 == 0) {
                return false;
            }
            z6 = false;
            if (i7 > 0) {
                z6 = false;
                if (arrayList.size() > i7) {
                    z6 = false;
                    if (this.f110343v.get(i7).rect.left + i8 < this.f110343v.get(i7 - 1).rect.right) {
                        z6 = true;
                    }
                }
            }
        }
        return z6;
    }

    public final boolean f(int i7, int i8) {
        ArrayList<TrackEditEntry> arrayList = this.f110343v;
        boolean z6 = false;
        if (arrayList != null) {
            int size = arrayList.size();
            int i9 = i7 + 1;
            if (size == i9) {
                return false;
            }
            z6 = false;
            if (i7 >= 0) {
                z6 = false;
                if (this.f110343v.size() > i9) {
                    z6 = false;
                    if (this.f110343v.get(i7).rect.right + i8 > this.f110343v.get(i9).rect.left) {
                        z6 = true;
                    }
                }
            }
        }
        return z6;
    }

    public final String g(Paint paint, String str, int i7) {
        if (TextUtils.isEmpty(str)) {
            return "...";
        }
        float f7 = i7;
        if (paint.measureText(str) < f7) {
            return str;
        }
        StringBuilder sb = this.f110344w;
        sb.delete(0, sb.length());
        StringBuilder sb2 = this.f110344w;
        sb2.append("...");
        sb2.append(str);
        while (paint.measureText(this.f110344w.toString()) > f7 && this.f110344w.length() > 1) {
            M4.a.a(1, this.f110344w);
        }
        if (this.f110344w.length() > 3) {
            this.f110344w.delete(0, 3).append("...");
        }
        return this.f110344w.toString();
    }

    public int getDrawRectBottom() {
        return DensityUtil.dp2px(this.f110323a, 45.0f);
    }

    public int getDrawRectTop() {
        return DensityUtil.dp2px(this.f110323a, 5.0f);
    }

    public int getIndicatorPosition() {
        return (this.f110315F / 2) + this.f110316G;
    }

    public long getIndicatorTime() {
        return k(getIndicatorPosition() - this.f110336o.getContentStart());
    }

    public ImageView getIndicatorView() {
        return this.f110326d;
    }

    public int getLeftHandlePosition() {
        Object tag = this.f110324b.getTag();
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return 0;
    }

    public int getRightHandlePosition() {
        Object tag = this.f110325c.getTag();
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return 0;
    }

    public long getTotalDuration() {
        return this.f110336o.getTotalDuration();
    }

    public int getXScrolled() {
        return this.f110316G;
    }

    public final int h(int i7) {
        ArrayList<TrackEditEntry> arrayList = this.f110343v;
        if (arrayList == null) {
            return -1;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Rect rect = this.f110343v.get(size).rect;
            if (rect != null && rect.left <= i7 && rect.right >= i7) {
                return size;
            }
        }
        return -1;
    }

    public final int i(long j7) {
        return (int) (((this.f110336o.getContentWidth() * j7) * 1.0f) / this.f110336o.getTimeDuration());
    }

    public final long j(int i7) {
        int i8 = i7 + 1;
        return this.f110343v.size() > i8 ? this.f110343v.get(i8).inPoint : this.f110336o.getTimeDuration();
    }

    public final long k(int i7) {
        return (long) (((i7 * 1.0f) * this.f110336o.getTimeDuration()) / this.f110336o.getContentWidth());
    }

    public final boolean l(float f7, float f8) {
        if (!this.f110337p.isFinished()) {
            if (f7 <= getLeft() + this.f110317H || f7 >= getRight() - this.f110317H) {
                return true;
            }
            this.f110337p.forceFinished(true);
            return true;
        }
        float right = getRight();
        int i7 = this.f110317H;
        if (right - f7 <= i7 && f7 > f8) {
            this.f110319J = this.f110316G;
            int contentEnd = this.f110336o.getContentEnd() - this.f110319J;
            this.f110337p.startScroll(this.f110319J, 0, contentEnd, 0, (int) ((contentEnd * 1000.0f) / getWidth()));
            return true;
        }
        if (f7 > i7 || f7 >= f8) {
            return false;
        }
        int i8 = this.f110316G;
        this.f110319J = i8;
        int i9 = -i8;
        this.f110337p.startScroll(this.f110319J, 0, i9, 0, Math.abs((int) ((i9 * 1000.0f) / getWidth())));
        return true;
    }

    public final boolean m(int i7) {
        boolean z6 = true;
        if (i7 == 0) {
            return true;
        }
        int leftHandlePosition = getLeftHandlePosition();
        if (e(this.f110313D, i7) || leftHandlePosition + i7 < this.f110336o.getContentStart()) {
            return false;
        }
        if (this.f110336o.b(getRightHandlePosition()) - this.f110336o.b(getLeftHandlePosition() + i7) < TransitionInfo.DEFAULT_DURATION) {
            z6 = false;
        }
        return z6;
    }

    public final void n(int i7) {
        if (i7 < 0) {
            this.f110324b.setVisibility(4);
            return;
        }
        this.f110324b.setTag(Integer.valueOf(this.f110343v.get(i7).rect.left));
        this.f110324b.setX((r0 - this.f110316G) - r0.getLayoutParams().width);
    }

    public final void o() {
        int leftHandlePosition = getLeftHandlePosition();
        int i7 = this.f110316G;
        this.f110336o.d(leftHandlePosition - ((this.f110315F / 2) + i7));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean zM;
        boolean z6;
        int contentStart;
        int leftHandlePosition;
        int i7;
        int contentEnd;
        int rightHandlePosition;
        int contentEnd2;
        int i8;
        int contentStart2;
        int i9;
        String str;
        super.onDraw(canvas);
        canvas.clipRect(getLeft(), getTop(), getRight(), getBottom());
        int i10 = 0;
        while (i10 < this.f110343v.size()) {
            TrackEditEntry trackEditEntry = this.f110343v.get(i10);
            Rect rect = trackEditEntry.rect;
            int i11 = rect.left;
            int i12 = this.f110316G;
            int i13 = rect.right;
            Rect rect2 = this.f110332k;
            int i14 = rect.top;
            int i15 = rect.bottom;
            rect2.left = i11 - i12;
            rect2.top = i14;
            rect2.right = i13 - i12;
            rect2.bottom = i15;
            canvas.drawRect(rect2, this.f110327e);
            int i16 = 0;
            while (true) {
                if (i16 < this.f110332k.width() / this.f110330i.getWidth()) {
                    this.f110334m.left = (this.f110330i.getWidth() * i16) + this.f110332k.left;
                    this.f110334m.top = DensityUtil.dp2px(9.0f) + this.f110332k.top;
                    Rect rect3 = this.f110334m;
                    rect3.right = this.f110330i.getWidth() + rect3.left;
                    this.f110334m.bottom = this.f110332k.bottom - DensityUtil.dp2px(9.0f);
                    if (this.f110334m.right >= getLeft()) {
                        if (this.f110334m.left > getRight()) {
                            break;
                        } else {
                            canvas.drawBitmap(this.f110330i, (Rect) null, this.f110334m, this.h);
                        }
                    }
                    i16++;
                } else if (this.f110332k.width() % this.f110330i.getWidth() != 0) {
                    Rect rect4 = this.f110334m;
                    Rect rect5 = this.f110332k;
                    rect4.left = rect5.right - (rect5.width() % this.f110330i.getWidth());
                    this.f110334m.top = DensityUtil.dp2px(9.0f) + this.f110332k.top;
                    Rect rect6 = this.f110334m;
                    Rect rect7 = this.f110332k;
                    rect6.right = rect7.right;
                    rect6.bottom = rect7.bottom - DensityUtil.dp2px(9.0f);
                    Rect rect8 = this.f110333l;
                    rect8.left = 0;
                    rect8.right = this.f110332k.width() % this.f110330i.getWidth();
                    Rect rect9 = this.f110333l;
                    rect9.top = 0;
                    rect9.bottom = this.f110330i.getHeight();
                    canvas.drawBitmap(this.f110330i, this.f110333l, this.f110334m, this.h);
                }
            }
            Rect rect10 = this.f110332k;
            String str2 = trackEditEntry.clipContent;
            long j7 = trackEditEntry.outPoint - trackEditEntry.inPoint;
            long j8 = trackEditEntry.trimOut;
            long j9 = trackEditEntry.trimIn;
            if (rect10.left != rect10.right) {
                StringBuilder sb = new StringBuilder();
                int iRound = (int) Math.round((j7 / 1000.0d) / 1000.0d);
                int i17 = iRound / 60;
                if (iRound == 0) {
                    str = "00:00";
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    str = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i17), Integer.valueOf(iRound % 60)}, 2));
                }
                String strA = D.a(str, "/", str2, sb);
                String strG = g(this.f110331j, strA, (rect10.right - rect10.left) - (this.f110312C * 2));
                if (j7 > j8 - j9) {
                    int i18 = rect10.left;
                    float f7 = i18;
                    float f8 = rect10.top;
                    int i19 = this.f110312C * 2;
                    float f9 = i19 + i18;
                    TextPaint textPaint = this.f110331j;
                    int i20 = rect10.right;
                    float fMeasureText = textPaint.measureText(strA);
                    float f10 = (i20 - i18) - i19;
                    if (fMeasureText < f10) {
                        f10 = fMeasureText;
                    }
                    canvas.drawRect(f7, f8, f10 + f9, rect10.bottom, this.f110329g);
                    canvas.drawText(g(this.f110331j, this.f110323a.getString(2131842427), (rect10.right - rect10.left) - (this.f110312C * 2)), rect10.left + this.f110312C, ((this.f110346y + (rect10.height() / 2)) - this.f110331j.getTextSize()) - this.f110347z, this.f110331j);
                    canvas.drawText(g(this.f110331j, strA, (rect10.right - rect10.left) - (this.f110312C * 2)), rect10.left + this.f110312C, this.f110346y + (rect10.height() / 2) + this.f110347z, this.f110331j);
                } else {
                    float f11 = rect10.left;
                    float fDp2px = DensityUtil.dp2px(this.f110323a, 5.0f) + ((rect10.bottom - rect10.top) >> 1);
                    int i21 = rect10.left;
                    int i22 = this.f110312C * 2;
                    float f12 = i22 + i21;
                    TextPaint textPaint2 = this.f110331j;
                    int i23 = rect10.right;
                    float fMeasureText2 = textPaint2.measureText(strA);
                    float f13 = (i23 - i21) - i22;
                    if (fMeasureText2 < f13) {
                        f13 = fMeasureText2;
                    }
                    canvas.drawRect(f11, fDp2px, f13 + f12, rect10.bottom, this.f110329g);
                    canvas.drawText(strG, rect10.left + this.f110312C, ((this.f110346y + (rect10.height() / 2)) - (this.f110331j.getTextSize() / 2.0f)) + ((rect10.bottom - rect10.top) >> 2), this.f110331j);
                }
            }
            Rect rect11 = this.f110332k;
            boolean z7 = i10 == this.f110313D;
            if (this.f110311B == 3 && z7) {
                this.f110328f.setColor(this.f110345x);
            } else {
                this.f110328f.setColor(0);
            }
            int i24 = rect11.left;
            int i25 = this.f110314E;
            canvas.drawRect(i24 + i25, rect11.top + i25, rect11.right - i25, rect11.bottom - i25, this.f110328f);
            i10++;
        }
        Scroller scroller = this.f110337p;
        if (scroller == null || scroller.isFinished()) {
            return;
        }
        this.f110337p.computeScrollOffset();
        int currX = this.f110337p.getCurrX();
        int i26 = currX - this.f110319J;
        this.f110319J = currX;
        if (i26 != 0) {
            int i27 = this.f110311B;
            if (i27 == 1) {
                zM = m(i26);
            } else if (i27 != 2) {
                if (i27 == 3) {
                    zM = p(i26);
                }
                z6 = false;
            } else {
                zM = u(i26);
            }
            z6 = !zM;
        } else {
            z6 = false;
        }
        int rightHandlePosition2 = i26;
        if (z6) {
            if (i26 == 0) {
                rightHandlePosition2 = 0;
            } else {
                int i28 = this.f110311B;
                if (i28 == 1) {
                    int leftHandlePosition2 = getLeftHandlePosition();
                    if (e(this.f110313D, i26)) {
                        contentStart = this.f110343v.get(this.f110313D - 1).rect.right;
                        leftHandlePosition = this.f110343v.get(this.f110313D).rect.left;
                    } else if (leftHandlePosition2 + i26 <= this.f110336o.getContentStart()) {
                        contentStart = this.f110336o.getContentStart();
                        leftHandlePosition = getLeftHandlePosition();
                    } else {
                        rightHandlePosition2 = k(getRightHandlePosition()) - k(getLeftHandlePosition() + i26) >= TransitionInfo.DEFAULT_DURATION ? i26 : ((getRightHandlePosition() - getLeftHandlePosition()) - i(TransitionInfo.DEFAULT_DURATION)) - 1;
                    }
                    rightHandlePosition2 = (contentStart - leftHandlePosition) + 1;
                } else if (i28 != 2) {
                    if (i28 != 3) {
                        rightHandlePosition2 = i26;
                    } else {
                        int i29 = this.f110313D;
                        rightHandlePosition2 = i26;
                        if (i29 >= 0) {
                            if (i29 >= this.f110343v.size()) {
                                rightHandlePosition2 = i26;
                            } else {
                                TrackEditEntry trackEditEntry2 = this.f110343v.get(this.f110313D);
                                Rect rect12 = trackEditEntry2.rect;
                                int i30 = rect12.right;
                                int i31 = rect12.left;
                                if (e(this.f110313D, i26)) {
                                    contentStart2 = this.f110343v.get(this.f110313D - 1).rect.right;
                                    i9 = trackEditEntry2.rect.left;
                                } else {
                                    if (f(this.f110313D, i26)) {
                                        contentEnd2 = this.f110343v.get(this.f110313D + 1).rect.left;
                                        i8 = trackEditEntry2.rect.right;
                                    } else if (i31 + i26 <= this.f110336o.getContentStart()) {
                                        contentStart2 = this.f110336o.getContentStart();
                                        i9 = trackEditEntry2.rect.left;
                                    } else {
                                        rightHandlePosition2 = i26;
                                        if (i30 + i26 >= this.f110336o.getContentEnd()) {
                                            contentEnd2 = this.f110336o.getContentEnd();
                                            i8 = trackEditEntry2.rect.right;
                                        }
                                    }
                                    rightHandlePosition2 = (contentEnd2 - i8) - 1;
                                }
                                i7 = contentStart2 - i9;
                                rightHandlePosition2 = i7 + 1;
                            }
                        }
                    }
                } else if (i26 == 0) {
                    rightHandlePosition2 = 0;
                } else {
                    if (f(this.f110313D, i26)) {
                        contentEnd = this.f110343v.get(this.f110313D + 1).rect.left;
                        rightHandlePosition = this.f110343v.get(this.f110313D).rect.right;
                    } else if (getRightHandlePosition() + i26 >= this.f110336o.getContentEnd()) {
                        contentEnd = this.f110336o.getContentEnd();
                        rightHandlePosition = getRightHandlePosition();
                    } else if (k(getRightHandlePosition() + i26) - k(getLeftHandlePosition()) >= TransitionInfo.DEFAULT_DURATION) {
                        rightHandlePosition2 = i26;
                    } else {
                        i7 = i(TransitionInfo.DEFAULT_DURATION) + (getLeftHandlePosition() - getRightHandlePosition());
                        rightHandlePosition2 = i7 + 1;
                    }
                    rightHandlePosition2 = (contentEnd - rightHandlePosition) - 1;
                }
            }
        }
        if (rightHandlePosition2 != 0) {
            this.f110336o.d(rightHandlePosition2);
            int i32 = this.f110311B;
            if (i32 == 1) {
                if (rightHandlePosition2 != 0) {
                    this.f110324b.setTag(Integer.valueOf(getLeftHandlePosition() + rightHandlePosition2));
                    this.f110324b.setX((r0 - this.f110316G) - r0.getLayoutParams().width);
                }
                A();
                AC0.g gVar = this.f110338q;
                if (gVar != null) {
                    gVar.k(getLeftHandleTime());
                }
            } else if (i32 == 2) {
                if (rightHandlePosition2 != 0) {
                    this.f110325c.setTag(Integer.valueOf(getRightHandlePosition() + rightHandlePosition2));
                    this.f110325c.setX(r0 - this.f110316G);
                }
                B();
                AC0.g gVar2 = this.f110338q;
                if (gVar2 != null) {
                    gVar2.k(getRightHandleTime());
                }
            } else if (i32 == 3) {
                q(rightHandlePosition2);
                AC0.g gVar3 = this.f110338q;
                if (gVar3 != null) {
                    gVar3.k(getIndicatorTime());
                }
            }
            postInvalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.widgets.EditorTrackView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i7) {
        int i8 = this.f110313D;
        if (i8 < 0 || i8 >= this.f110343v.size()) {
            return false;
        }
        Rect rect = this.f110343v.get(this.f110313D).rect;
        return !e(this.f110313D, i7) && !f(this.f110313D, i7) && rect.left + i7 >= this.f110336o.getContentStart() && rect.right + i7 <= this.f110336o.getContentEnd();
    }

    public final void q(int i7) {
        TrackEditEntry trackEditEntry = this.f110343v.get(this.f110313D);
        Rect rect = trackEditEntry.rect;
        int i8 = rect.left + i7;
        rect.left = i8;
        rect.right += i7;
        trackEditEntry.inPoint = k(i8 - this.f110336o.getContentStart());
        trackEditEntry.outPoint = k(trackEditEntry.rect.right - this.f110336o.getContentStart());
        trackEditEntry.longPressDragOffsetPosition += i7;
    }

    public final void r(MotionEvent motionEvent) {
        if (this.f110320K) {
            return;
        }
        this.f110320K = true;
        this.f110310A = motionEvent.getX();
    }

    public final void s(int i7) {
        if (i7 < 0 || i7 >= this.f110343v.size()) {
            return;
        }
        this.f110313D = -1;
        this.f110343v.remove(i7);
        t();
        y(4);
        a aVar = this.f110341t;
        if (aVar != null) {
            aVar.a(this.f110313D, d());
        }
    }

    public void setOnEditorTrackStateChangedListener(a aVar) {
        this.f110341t = aVar;
    }

    public void setOnSingleClickListener(b bVar) {
        this.f110342u = bVar;
    }

    public void setOnVideoControlListener(AC0.g gVar) {
        this.f110338q = gVar;
    }

    public void setOnZoomListener(c cVar) {
        this.f110339r = cVar;
    }

    public final void t() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ArrayList<TrackEditEntry> arrayList = this.f110343v;
        if (arrayList == null || arrayList.size() == 0) {
            layoutParams.height = DensityUtil.dp2px(this.f110323a, 54.0f);
        } else {
            layoutParams.height = DensityUtil.dp2px(this.f110323a, 104.0f);
        }
        setLayoutParams(layoutParams);
    }

    public final boolean u(int i7) {
        boolean z6 = true;
        if (i7 == 0) {
            return true;
        }
        int rightHandlePosition = getRightHandlePosition();
        if (f(this.f110313D, i7) || rightHandlePosition + i7 > this.f110336o.getContentEnd()) {
            return false;
        }
        if (this.f110336o.b(getRightHandlePosition() + i7) - this.f110336o.b(getLeftHandlePosition()) < TransitionInfo.DEFAULT_DURATION) {
            z6 = false;
        }
        return z6;
    }

    public final void v(int i7) {
        if (i7 < 0) {
            this.f110325c.setVisibility(4);
            return;
        }
        this.f110325c.setTag(Integer.valueOf(this.f110343v.get(i7).rect.right));
        this.f110325c.setX(r0 - this.f110316G);
    }

    public final void w(final int i7) {
        int i8 = this.f110316G;
        if (i8 == 0) {
            post(new Runnable(this, i7) { // from class: com.bilibili.studio.videoeditor.widgets.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final EditorTrackView f110420a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f110421b;

                {
                    this.f110420a = this;
                    this.f110421b = i7;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EditorTrackView editorTrackView = this.f110420a;
                    editorTrackView.f110336o.d(this.f110421b - editorTrackView.f110316G);
                }
            });
        } else {
            this.f110336o.d(i7 - i8);
        }
    }

    public final void x(long j7) {
        w(i(j7));
    }

    public final void y(int i7) {
        if (this.f110321L) {
            this.f110324b.setVisibility(i7);
            this.f110325c.setVisibility(i7);
        }
    }

    public final void z() {
        BiliEditorMediaTrackView biliEditorMediaTrackView = this.f110336o;
        if (biliEditorMediaTrackView != null) {
            oD0.b bVar = biliEditorMediaTrackView.f110528u;
            oD0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scrollZoomGesture");
                bVar2 = null;
            }
            if (bVar2.d.isFinished()) {
                return;
            }
            this.f110336o.f();
        }
    }
}
