package com.bilibili.studio.editor.moudle.editormain.track.cover;

import ET.n;
import Hx0.d;
import Hx0.f;
import Hx0.g;
import Hx0.i;
import Jx0.e;
import Mx0.a;
import Mx0.m;
import Nx0.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import by0.C5172a;
import com.bilibili.bplus.followinglist.detail.bottom.BottomItemPosition;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.studio.editor.moudle.editormain.track.cover.BiliEditorTrackCoverEditViewV2;
import com.bilibili.studio.editor.moudle.editormain.track.cover.a;
import com.bilibili.studio.editor.moudle.editormain.track.cover.decorate.BiliEditorTransitionInfo;
import com.bilibili.studio.editor.moudle.editormain.track.cover.enums.BiliEditorTrackMode;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.util.VibratorUtils;
import java.util.ArrayList;
import java.util.List;
import kntr.app.pegasus.feedbackdialog.model.FeedbackItem;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/cover/BiliEditorTrackCoverEditViewV2.class */
public final class BiliEditorTrackCoverEditViewV2 extends Hx0.a implements c {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f106129P = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final RectF f106130A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f106131B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f106132C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final Lazy f106133D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final Lazy f106134E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final Lazy f106135F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f106136G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public Kx0.c f106137H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final e f106138I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final List<BiliEditorTransitionInfo> f106139J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public a f106140K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final i f106141L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public final Jx0.b f106142M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public final Ix0.c f106143N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public final Lazy f106144O;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ImageView f106145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ImageView f106146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final RectF f106147q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Paint f106148r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Paint f106149s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Paint f106150t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f106151u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f106152v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f106153w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f106154x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Paint f106155y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f106156z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/cover/BiliEditorTrackCoverEditViewV2$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f106157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiliEditorTrackCoverEditViewV2 f106158b;

        public a(BiliEditorTrackCoverEditViewV2 biliEditorTrackCoverEditViewV2) {
            this.f106158b = biliEditorTrackCoverEditViewV2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/cover/BiliEditorTrackCoverEditViewV2$b.class */
    public static final class b implements a.InterfaceC1189a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorTrackCoverEditViewV2 f106159a;

        public b(BiliEditorTrackCoverEditViewV2 biliEditorTrackCoverEditViewV2) {
            this.f106159a = biliEditorTrackCoverEditViewV2;
        }

        @Override // com.bilibili.studio.editor.moudle.editormain.track.cover.a.InterfaceC1189a
        public final void a(Canvas canvas) {
            BiliEditorTrackCoverEditViewV2 biliEditorTrackCoverEditViewV2 = this.f106159a;
            for (C5172a c5172a : biliEditorTrackCoverEditViewV2.getMediaTrackClipList()) {
                if (!c5172a.f57159z) {
                    biliEditorTrackCoverEditViewV2.f106130A.set(0.0f, biliEditorTrackCoverEditViewV2.f106153w, 0.0f, DimenUtilsKt.dpToPx(20));
                    RectF rectF = biliEditorTrackCoverEditViewV2.f106147q;
                    int i7 = c5172a.f57150q;
                    int i8 = biliEditorTrackCoverEditViewV2.f8842m;
                    rectF.left = i7 - i8;
                    rectF.right = c5172a.f57151r - i8;
                    if (Intrinsics.areEqual(c5172a, biliEditorTrackCoverEditViewV2.getClipSelect())) {
                        ImageView mImvLeftHandle = biliEditorTrackCoverEditViewV2.getMImvLeftHandle();
                        float f7 = biliEditorTrackCoverEditViewV2.f106147q.left;
                        float width = biliEditorTrackCoverEditViewV2.getMImvLeftHandle().getWidth();
                        float f8 = biliEditorTrackCoverEditViewV2.f106152v;
                        float f9 = 2;
                        mImvLeftHandle.setX((f8 / f9) + (f7 - width));
                        biliEditorTrackCoverEditViewV2.getMImvRightHandle().setX(biliEditorTrackCoverEditViewV2.f106147q.right - (biliEditorTrackCoverEditViewV2.f106152v / f9));
                        C5172a clipSelect = biliEditorTrackCoverEditViewV2.getClipSelect();
                        if (clipSelect != null && !clipSelect.f57132C) {
                            biliEditorTrackCoverEditViewV2.getMImvLeftHandle().setX(-1000.0f);
                        }
                        C5172a clipSelect2 = biliEditorTrackCoverEditViewV2.getClipSelect();
                        if (clipSelect2 != null && !clipSelect2.f57133D) {
                            biliEditorTrackCoverEditViewV2.getMImvRightHandle().setX(-1000.0f);
                        }
                    }
                    canvas.save();
                    canvas.clipRect(biliEditorTrackCoverEditViewV2.f106147q);
                    boolean z6 = biliEditorTrackCoverEditViewV2.getModeControl().f10500d && Intrinsics.areEqual(c5172a, biliEditorTrackCoverEditViewV2.getClipSelect());
                    if (z6) {
                        canvas.drawRect(biliEditorTrackCoverEditViewV2.f106147q, biliEditorTrackCoverEditViewV2.f106149s);
                    }
                    if (BiliEditorTrackCoverEditViewV2.g(biliEditorTrackCoverEditViewV2, c5172a)) {
                        String strB = AC0.i.b(c5172a.f57141g);
                        float fMeasureText = biliEditorTrackCoverEditViewV2.f106150t.measureText(strB);
                        float f10 = biliEditorTrackCoverEditViewV2.f106147q.left;
                        float f11 = biliEditorTrackCoverEditViewV2.f106153w;
                        float fDpToPx = DimenUtilsKt.dpToPx(8);
                        RectF rectF2 = biliEditorTrackCoverEditViewV2.f106130A;
                        rectF2.left = biliEditorTrackCoverEditViewV2.f106147q.left + biliEditorTrackCoverEditViewV2.f106153w;
                        rectF2.right = f10 + f11 + fMeasureText + fDpToPx;
                        float f12 = biliEditorTrackCoverEditViewV2.f106156z;
                        canvas.drawRoundRect(rectF2, f12, f12, biliEditorTrackCoverEditViewV2.f106155y);
                        canvas.drawText(strB, biliEditorTrackCoverEditViewV2.f106147q.left + biliEditorTrackCoverEditViewV2.f106153w + DimenUtilsKt.dpToPx(4), (biliEditorTrackCoverEditViewV2.f106153w / 2) + biliEditorTrackCoverEditViewV2.f106151u, biliEditorTrackCoverEditViewV2.f106150t);
                    }
                    if (BiliEditorTrackCoverEditViewV2.f(biliEditorTrackCoverEditViewV2, c5172a)) {
                        String strConcat = AC0.i.e(c5172a.f57138d).concat("x");
                        float fMeasureText2 = (3 * biliEditorTrackCoverEditViewV2.f106152v) + biliEditorTrackCoverEditViewV2.f106150t.measureText(strConcat) + biliEditorTrackCoverEditViewV2.f106131B;
                        if (BiliEditorTrackCoverEditViewV2.g(biliEditorTrackCoverEditViewV2, c5172a)) {
                            RectF rectF3 = biliEditorTrackCoverEditViewV2.f106130A;
                            float f13 = rectF3.right + biliEditorTrackCoverEditViewV2.f106154x;
                            rectF3.left = f13;
                            rectF3.right = f13 + fMeasureText2;
                        } else {
                            RectF rectF4 = biliEditorTrackCoverEditViewV2.f106130A;
                            float f14 = biliEditorTrackCoverEditViewV2.f106147q.left + biliEditorTrackCoverEditViewV2.f106153w;
                            rectF4.left = f14;
                            rectF4.right = f14 + fMeasureText2;
                        }
                        RectF rectF5 = biliEditorTrackCoverEditViewV2.f106130A;
                        float f15 = biliEditorTrackCoverEditViewV2.f106156z;
                        canvas.drawRoundRect(rectF5, f15, f15, biliEditorTrackCoverEditViewV2.f106155y);
                        Bitmap mSpeedIcon = biliEditorTrackCoverEditViewV2.getMSpeedIcon();
                        RectF rectF6 = biliEditorTrackCoverEditViewV2.f106130A;
                        canvas.drawBitmap(mSpeedIcon, rectF6.left + biliEditorTrackCoverEditViewV2.f106153w, rectF6.top + biliEditorTrackCoverEditViewV2.f106132C, biliEditorTrackCoverEditViewV2.f106150t);
                        canvas.drawText(strConcat, biliEditorTrackCoverEditViewV2.f106130A.left + DimenUtilsKt.dpToPx(16), (biliEditorTrackCoverEditViewV2.f106153w / 2) + biliEditorTrackCoverEditViewV2.f106151u, biliEditorTrackCoverEditViewV2.f106150t);
                    }
                    if (BiliEditorTrackCoverEditViewV2.e(biliEditorTrackCoverEditViewV2, c5172a)) {
                        float fMeasureText3 = biliEditorTrackCoverEditViewV2.f106150t.measureText(c5172a.f57131B);
                        if (BiliEditorTrackCoverEditViewV2.g(biliEditorTrackCoverEditViewV2, c5172a) || BiliEditorTrackCoverEditViewV2.f(biliEditorTrackCoverEditViewV2, c5172a)) {
                            RectF rectF7 = biliEditorTrackCoverEditViewV2.f106130A;
                            rectF7.left = rectF7.right + biliEditorTrackCoverEditViewV2.f106154x;
                        } else {
                            biliEditorTrackCoverEditViewV2.f106130A.left = biliEditorTrackCoverEditViewV2.f106147q.left + biliEditorTrackCoverEditViewV2.f106153w;
                        }
                        RectF rectF8 = biliEditorTrackCoverEditViewV2.f106130A;
                        rectF8.right = (3 * biliEditorTrackCoverEditViewV2.f106153w) + rectF8.left + fMeasureText3 + DimenUtilsKt.dpToPx(8);
                        RectF rectF9 = biliEditorTrackCoverEditViewV2.f106130A;
                        float f16 = biliEditorTrackCoverEditViewV2.f106156z;
                        canvas.drawRoundRect(rectF9, f16, f16, biliEditorTrackCoverEditViewV2.f106155y);
                        Bitmap mFilterIcon = biliEditorTrackCoverEditViewV2.getMFilterIcon();
                        RectF rectF10 = biliEditorTrackCoverEditViewV2.f106130A;
                        canvas.drawBitmap(mFilterIcon, rectF10.left + biliEditorTrackCoverEditViewV2.f106153w, rectF10.top + biliEditorTrackCoverEditViewV2.f106132C, biliEditorTrackCoverEditViewV2.f106150t);
                        canvas.drawText(c5172a.f57131B, biliEditorTrackCoverEditViewV2.f106130A.left + DimenUtilsKt.dpToPx(16), (biliEditorTrackCoverEditViewV2.f106153w / 2) + biliEditorTrackCoverEditViewV2.f106151u, biliEditorTrackCoverEditViewV2.f106150t);
                    }
                    BClip bClipB = c5172a.b();
                    if ((bClipB == null || bClipB.isVideo()) && biliEditorTrackCoverEditViewV2.getTagCoverList().contains(4)) {
                        BClip bClipB2 = c5172a.b();
                        if (Intrinsics.areEqual(bClipB2 != null ? Float.valueOf(bClipB2.getClipVolume()) : null, 0.0f)) {
                            if (BiliEditorTrackCoverEditViewV2.g(biliEditorTrackCoverEditViewV2, c5172a) || BiliEditorTrackCoverEditViewV2.f(biliEditorTrackCoverEditViewV2, c5172a) || BiliEditorTrackCoverEditViewV2.e(biliEditorTrackCoverEditViewV2, c5172a)) {
                                RectF rectF11 = biliEditorTrackCoverEditViewV2.f106130A;
                                rectF11.left = rectF11.right + biliEditorTrackCoverEditViewV2.f106154x;
                            } else {
                                biliEditorTrackCoverEditViewV2.f106130A.left = biliEditorTrackCoverEditViewV2.f106147q.left + biliEditorTrackCoverEditViewV2.f106153w;
                            }
                            RectF rectF12 = biliEditorTrackCoverEditViewV2.f106130A;
                            rectF12.right = rectF12.left + DimenUtilsKt.dpToPx(14) + biliEditorTrackCoverEditViewV2.f106153w;
                            RectF rectF13 = biliEditorTrackCoverEditViewV2.f106130A;
                            float f17 = biliEditorTrackCoverEditViewV2.f106156z;
                            canvas.drawRoundRect(rectF13, f17, f17, biliEditorTrackCoverEditViewV2.f106155y);
                            Bitmap mMuteIcon = biliEditorTrackCoverEditViewV2.getMMuteIcon();
                            RectF rectF14 = biliEditorTrackCoverEditViewV2.f106130A;
                            canvas.drawBitmap(mMuteIcon, rectF14.left + biliEditorTrackCoverEditViewV2.f106153w, rectF14.top + biliEditorTrackCoverEditViewV2.f106132C, biliEditorTrackCoverEditViewV2.f106150t);
                        }
                    }
                    if (z6) {
                        canvas.drawRect(biliEditorTrackCoverEditViewV2.f106147q, biliEditorTrackCoverEditViewV2.f106148r);
                    }
                    canvas.restore();
                } else if (Intrinsics.areEqual(c5172a, biliEditorTrackCoverEditViewV2.getClipSelect())) {
                    biliEditorTrackCoverEditViewV2.getMImvLeftHandle().setX(-1000.0f);
                    biliEditorTrackCoverEditViewV2.getMImvRightHandle().setX(-1000.0f);
                }
            }
        }
    }

    @JvmOverloads
    public BiliEditorTrackCoverEditViewV2(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public BiliEditorTrackCoverEditViewV2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public BiliEditorTrackCoverEditViewV2(final Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        ImageView imageView = new ImageView(context);
        this.f106145o = imageView;
        ImageView imageView2 = new ImageView(context);
        this.f106146p = imageView2;
        this.f106147q = new RectF();
        Paint paint = new Paint(1);
        this.f106148r = paint;
        Paint paint2 = new Paint(1);
        this.f106149s = paint2;
        Paint paint3 = new Paint(1);
        paint3.setTextSize(DimenUtilsKt.dpToPx(11));
        this.f106150t = paint3;
        this.f106151u = paint3.getFontMetrics().bottom - paint3.getFontMetrics().top;
        float fDp2px = DensityUtil.dp2px(context, 4.0f);
        this.f106152v = fDp2px;
        this.f106153w = DensityUtil.dp2px(context, 6.0f);
        DensityUtil.dp2px(context, 1.5f);
        this.f106154x = DensityUtil.dp2px(context, 2.0f);
        Paint paint4 = new Paint(1);
        paint4.setColor(Color.parseColor("#80000000"));
        this.f106155y = paint4;
        this.f106156z = DimenUtilsKt.dpToPx(3);
        this.f106130A = new RectF();
        this.f106131B = DensityUtil.dp2px(context, 8.0f);
        this.f106132C = DensityUtil.dp2px(context, 3.0f);
        final int i8 = 0;
        this.f106133D = LazyKt.lazy(new Function0(i8, context, this) { // from class: Hx0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f8845a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f8846b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f8847c;

            {
                this.f8845a = i8;
                this.f8846b = context;
                this.f8847c = this;
            }

            public final Object invoke() {
                Object obj = this.f8847c;
                Object obj2 = this.f8846b;
                switch (this.f8845a) {
                    case 0:
                        Context context2 = (Context) obj2;
                        int i9 = BiliEditorTrackCoverEditViewV2.f106129P;
                        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context2.getResources(), 2131243520);
                        int i10 = ((BiliEditorTrackCoverEditViewV2) obj).f106131B;
                        return Bitmap.createScaledBitmap(bitmapDecodeResource, i10, i10, true);
                    default:
                        FeedbackItem feedbackItem = (FeedbackItem) obj2;
                        feedbackItem.getOnClick().invoke(feedbackItem);
                        ((Function1) obj).invoke(feedbackItem.getType());
                        return Unit.INSTANCE;
                }
            }
        });
        final int i9 = 0;
        this.f106134E = LazyKt.lazy(new Function0(i9, context, this) { // from class: Hx0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f8848a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f8849b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f8850c;

            {
                this.f8848a = i9;
                this.f8849b = context;
                this.f8850c = this;
            }

            public final Object invoke() {
                Object obj = this.f8850c;
                Object obj2 = this.f8849b;
                switch (this.f8848a) {
                    case 0:
                        Context context2 = (Context) obj2;
                        int i10 = BiliEditorTrackCoverEditViewV2.f106129P;
                        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context2.getResources(), 2131243514);
                        int i11 = ((BiliEditorTrackCoverEditViewV2) obj).f106131B;
                        return Bitmap.createScaledBitmap(bitmapDecodeResource, i11, i11, true);
                    default:
                        ((Function1) obj2).invoke((BottomItemPosition) obj);
                        return Unit.INSTANCE;
                }
            }
        });
        this.f106135F = LazyKt.lazy(new n(1, context, this));
        e eVar = new e();
        this.f106138I = eVar;
        this.f106139J = new ArrayList();
        this.f106140K = new a(this);
        this.f106141L = new i(context);
        Jx0.b bVar = new Jx0.b(new d(this, 0), new Hx0.e(this, 0));
        this.f106142M = bVar;
        this.f106143N = new Ix0.c();
        this.f106144O = LazyKt.lazy(new f(this));
        a.InterfaceC1189a bVar2 = new b(this);
        getMMediaTrackView().setDrawFakeDivider(true);
        imageView.setImageResource(2131234900);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(DensityUtil.dp2px(getContext(), 24.0f), getMTrackHeight());
        layoutParams.addRule(15, -1);
        imageView.setScaleType(ImageView.ScaleType.FIT_END);
        imageView.setLayoutParams(layoutParams);
        imageView.setX(-1000.0f);
        addView(imageView);
        imageView2.setImageResource(2131234933);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(DensityUtil.dp2px(getContext(), 24.0f), getMTrackHeight());
        layoutParams2.addRule(15, -1);
        imageView2.setScaleType(ImageView.ScaleType.FIT_START);
        imageView2.setLayoutParams(layoutParams2);
        imageView2.setX(-1000.0f);
        addView(imageView2);
        paint.setStrokeWidth(fDp2px);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(ContextCompat.getColor(context, 2131100376));
        paint2.setStrokeWidth(fDp2px);
        paint2.setStyle(Paint.Style.FILL);
        paint3.setStrokeWidth(fDp2px);
        paint3.setColor(-1);
        paint3.setTextSize(DensityUtil.dp2px(context, 10.0f));
        getMCoverDrawView().setOnDrawListener(bVar2);
        bVar.a(this);
        eVar.f11733c = new g(this, 0);
        getMMediaTrackView().setDrawFakeDivider(true);
    }

    public static final boolean e(BiliEditorTrackCoverEditViewV2 biliEditorTrackCoverEditViewV2, C5172a c5172a) {
        return (!biliEditorTrackCoverEditViewV2.getTagCoverList().contains(3) || c5172a.f57131B.length() <= 0) ? false : biliEditorTrackCoverEditViewV2.getTagCoverList().size() == Gx0.c.f7446b.size() ? Intrinsics.areEqual(c5172a, biliEditorTrackCoverEditViewV2.getClipSelect()) : true;
    }

    public static final boolean f(BiliEditorTrackCoverEditViewV2 biliEditorTrackCoverEditViewV2, C5172a c5172a) {
        return biliEditorTrackCoverEditViewV2.getTagCoverList().contains(2) && !Intrinsics.areEqual(Float.valueOf(c5172a.f57138d), 1.0f);
    }

    public static final boolean g(BiliEditorTrackCoverEditViewV2 biliEditorTrackCoverEditViewV2, C5172a c5172a) {
        boolean z6 = true;
        if (!biliEditorTrackCoverEditViewV2.getTagCoverList().contains(1) || !Intrinsics.areEqual(c5172a, biliEditorTrackCoverEditViewV2.getClipSelect())) {
            z6 = false;
        }
        return z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getMFilterIcon() {
        return (Bitmap) this.f106134E.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getMMuteIcon() {
        return (Bitmap) this.f106135F.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getMSpeedIcon() {
        return (Bitmap) this.f106133D.getValue();
    }

    private final Ix0.b getTouchEventControl() {
        return (Ix0.b) this.f106144O.getValue();
    }

    @Override // Nx0.c
    public final void G(int i7, @Nullable Long l7, @Nullable m mVar) {
        setMXScrolled(i7);
        getMMediaTrackView().G(i7, l7, mVar);
        l();
    }

    @Override // Nx0.c
    public final void P(int i7, int i8, int i9, long j7) {
        getMMediaTrackView().P(i7, i8, i9, j7);
        setMXScrolled(i9);
        l();
    }

    @Override // Hx0.a
    public final void a() {
        l();
    }

    @NotNull
    public final a getDraggingHelper() {
        return this.f106140K;
    }

    public final int getLeftHandlePosition() {
        Mx0.a aVar = Mx0.a.f16457j;
        return a.C0086a.f((int) ((this.f106145o.getX() + this.f106145o.getWidth()) - (this.f106152v / 2)));
    }

    public final float getMBackGroundRadius() {
        return this.f106156z;
    }

    @NotNull
    public final ImageView getMImvLeftHandle() {
        return this.f106145o;
    }

    @NotNull
    public final ImageView getMImvRightHandle() {
        return this.f106146p;
    }

    @NotNull
    public final Ix0.c getModeControl() {
        return this.f106143N;
    }

    @Nullable
    public final Kx0.c getOnTrackTouchListener() {
        return this.f106137H;
    }

    public final int getRightHandlePosition() {
        Mx0.a aVar = Mx0.a.f16457j;
        return a.C0086a.f((int) ((this.f106152v / 2) + this.f106146p.getX()));
    }

    public final boolean getToggleClipVibrate() {
        return this.f106136G;
    }

    public final long getTotalDuration() {
        return getMMediaTrackView().getTotalDuration();
    }

    public final void h() {
        if (getClipSelect() != null && !getClipSelect().f57134E) {
            int i7 = getClipSelect().f57150q;
            int i8 = getClipSelect().f57151r;
            int windowMiddlePos = getWindowMiddlePos();
            if (i7 <= windowMiddlePos && windowMiddlePos <= i8) {
                return;
            }
        }
        for (C5172a c5172a : getMediaTrackClipList()) {
            int i9 = c5172a.f57150q;
            int i10 = c5172a.f57151r;
            int windowMiddlePos2 = getWindowMiddlePos();
            if (i9 <= windowMiddlePos2 && windowMiddlePos2 <= i10) {
                if (this.f106136G && getClipSelect() != null && !Intrinsics.areEqual(getClipSelect(), c5172a)) {
                    VibratorUtils.vibrateOnAdsorb(getContext());
                }
                setClipSelect(c5172a);
            }
        }
    }

    public final void i() {
        k();
        if (this.f106143N.f10497a) {
            this.f106145o.setVisibility(0);
            this.f106146p.setVisibility(0);
        } else {
            this.f106145o.setVisibility(8);
            this.f106146p.setVisibility(8);
        }
        Jx0.b bVar = this.f106142M;
        Ix0.c cVar = this.f106143N;
        bVar.c(cVar.f10499c, cVar.f10504i);
        getMCoverDrawView().invalidate();
        getMMediaTrackView().invalidate();
    }

    public final boolean j() {
        return getTouchEventControl().f10490d != null;
    }

    public final void k() {
        if (!this.f106143N.f10498b) {
            this.f106138I.a(this.f106139J);
            return;
        }
        int selectClipIndex = getSelectClipIndex();
        C5172a clipSelect = getClipSelect();
        int i7 = 0;
        int i8 = clipSelect != null ? clipSelect.f57150q : 0;
        int i9 = this.f8842m;
        C5172a clipSelect2 = getClipSelect();
        if (clipSelect2 != null) {
            i7 = clipSelect2.f57151r;
        }
        this.f106138I.d(this, selectClipIndex, this.f106143N.f10497a, j(), Intrinsics.areEqual(getTouchEventControl().f10490d, getTouchEventControl().f10487a.f106145o), i8 - i9, i7 - this.f8842m, this.f106139J, new Bn.a(this, 1));
    }

    public final void l() {
        k();
        if (getTouchEventControl().f10490d == null) {
            h();
        }
        getMCoverDrawView().invalidate();
        this.f106142M.b(getMXScrolled());
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        getMMediaTrackView().onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        this.f106147q.set(getLeft(), getMMediaTrackView().getTop(), getRight(), getMMediaTrackView().getBottom());
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0347  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 1301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.track.cover.BiliEditorTrackCoverEditViewV2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDraggingHelper(@NotNull a aVar) {
        this.f106140K = aVar;
    }

    public final void setHandlerAdsorbListProvider(@Nullable Kx0.d dVar) {
        getTouchEventControl().f10491e = dVar;
    }

    public final void setMBackGroundRadius(float f7) {
        this.f106156z = f7;
    }

    public final void setMoveAdsorbListProvider(@Nullable Kx0.d dVar) {
        getTouchEventControl().getClass();
    }

    public final void setOnTrackTouchListener(@Nullable Kx0.c cVar) {
        this.f106137H = cVar;
    }

    public final void setToggleClipVibrate(boolean z6) {
        this.f106136G = z6;
    }

    @Override // Hx0.a
    public void setTrackData(@NotNull ArrayList<C5172a> arrayList) {
        super.setTrackData(arrayList);
        setClipSelect(null);
        h();
        ArrayList arrayList2 = new ArrayList();
        if (getMediaTrackClipList().size() > 1) {
            int size = getMediaTrackClipList().size();
            int i7 = 0;
            while (i7 < size - 1) {
                C5172a c5172a = getMediaTrackClipList().get(i7);
                BClip bClipB = c5172a.b();
                i7++;
                C5172a c5172a2 = getMediaTrackClipList().get(i7);
                BClip bClipB2 = c5172a2.b();
                BiliEditorTransitionInfo biliEditorTransitionInfo = new BiliEditorTransitionInfo();
                biliEditorTransitionInfo.setPreBClipId(bClipB.id);
                biliEditorTransitionInfo.setNextBClipId(bClipB2.id);
                biliEditorTransitionInfo.setFakeClip(bClipB.isFakeClip());
                biliEditorTransitionInfo.setTimeOutPoint((c5172a.f57144k + c5172a2.f57143j) / ((long) 2));
                arrayList2.add(biliEditorTransitionInfo);
            }
        }
        ((ArrayList) this.f106139J).clear();
        ((ArrayList) this.f106139J).addAll(arrayList2);
        this.f106138I.c(this, this.f106139J);
        this.f106138I.b(this, this.f106139J);
        i();
    }

    public final void setTrackMode(@NotNull BiliEditorTrackMode biliEditorTrackMode) {
        Ix0.c cVar = this.f106143N;
        if (cVar.f10505j == biliEditorTrackMode) {
            return;
        }
        cVar.a(biliEditorTrackMode);
        if (biliEditorTrackMode == BiliEditorTrackMode.TRACK_MODE_EDIT && getLastSelectClip() == null) {
            setLastSelectClip(getClipSelect());
        }
        i();
    }

    public final void setTrackTagList(@NotNull List<Integer> list) {
        getTagCoverList().clear();
        getTagCoverList().addAll(list);
        i();
    }
}
