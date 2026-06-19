package com.bilibili.studio.editor.moudle.editormain.track.material.addview;

import Mx0.a;
import Mx0.m;
import Nx0.c;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.base.BiliContext;
import com.bilibili.bplus.baseplus.activity.ImagesViewerActivity;
import com.bilibili.studio.editor.moudle.editormain.track.material.addview.BiliEditorMaterialAddView;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import oi.b;
import oi.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/material/addview/BiliEditorMaterialAddView.class */
public final class BiliEditorMaterialAddView extends ConstraintLayout implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f106184l = DensityUtil.dp2px(10.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f106185m = DensityUtil.dp2px(5.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float f106186n = DensityUtil.dp2px(4.0f);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f106187o = DensityUtil.getDevicesWidthPixels(BiliContext.application()) / 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f106188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final View f106189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f106190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ImageView f106191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f106192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final RectF f106193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Paint f106194g;

    @Nullable
    public Function0<Unit> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Function1<? super Boolean, Unit> f106195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f106196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final GestureDetector f106197k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/material/addview/BiliEditorMaterialAddView$a.class */
    public final class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorMaterialAddView f106198a;

        public a(BiliEditorMaterialAddView biliEditorMaterialAddView) {
            this.f106198a = biliEditorMaterialAddView;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            Function0<Unit> function0;
            BiliEditorMaterialAddView biliEditorMaterialAddView = this.f106198a;
            int i7 = BiliEditorMaterialAddView.f106184l;
            biliEditorMaterialAddView.getClass();
            float x6 = motionEvent.getX();
            if (biliEditorMaterialAddView.f106192e == 1) {
                Function1<? super Boolean, Unit> function1 = biliEditorMaterialAddView.f106195i;
                if (function1 == null) {
                    return true;
                }
                function1.invoke(Boolean.valueOf(x6 >= biliEditorMaterialAddView.f106189b.getX() && x6 <= biliEditorMaterialAddView.f106189b.getX() + ((float) biliEditorMaterialAddView.f106189b.getWidth())));
                return true;
            }
            RectF rectF = biliEditorMaterialAddView.f106193f;
            if (x6 < rectF.left || x6 > rectF.right || (function0 = biliEditorMaterialAddView.h) == null) {
                return true;
            }
            function0.invoke();
            return true;
        }
    }

    @JvmOverloads
    public BiliEditorMaterialAddView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public BiliEditorMaterialAddView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public BiliEditorMaterialAddView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f106192e = 2;
        this.f106193f = new RectF();
        Paint paint = new Paint(1);
        this.f106194g = paint;
        this.f106197k = new GestureDetector(context, new a(this));
        ViewGroup.inflate(context, 2131501711, this);
        this.f106188a = findViewById(2131318558);
        this.f106189b = findViewById(2131318565);
        this.f106190c = (TextView) findViewById(2131314129);
        this.f106191d = (ImageView) findViewById(2131302821);
        paint.setColor(getResources().getColor(2131104152));
        setWillNotDraw(false);
    }

    @Override // Nx0.c
    public final void G(int i7, @Nullable Long l7, @Nullable m mVar) {
        j0();
        k0(true);
        invalidate();
    }

    @Override // Nx0.c
    public final void P(int i7, int i8, int i9, long j7) {
        j0();
        k0(true);
        if (this.f106196j == 0) {
            this.f106196j = this.f106188a.getWidth();
        }
        RectF rectF = this.f106193f;
        float f7 = rectF.right - rectF.left;
        if (f7 < this.f106196j) {
            ViewGroup.LayoutParams layoutParams = this.f106188a.getLayoutParams();
            layoutParams.width = (int) f7;
            this.f106188a.setLayoutParams(layoutParams);
        } else if (this.f106188a.getWidth() != this.f106196j) {
            ViewGroup.LayoutParams layoutParams2 = this.f106188a.getLayoutParams();
            layoutParams2.width = this.f106196j;
            this.f106188a.setLayoutParams(layoutParams2);
        }
        invalidate();
    }

    @Nullable
    public final Function0<Unit> getOnMaterialAddClick() {
        return this.h;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnMaterialRecognitionClick() {
        return this.f106195i;
    }

    public final void j0() {
        if (this.f106192e != 2) {
            return;
        }
        int width = this.f106188a.getWidth();
        int i7 = f106184l;
        int i8 = width + i7;
        Mx0.a aVar = Mx0.a.f16457j;
        int i9 = aVar.f16460c - f106187o;
        int iMin = Math.min(i9, aVar.f16458a) - (i9 - i8);
        if (iMin >= 0 && iMin <= i8) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f106188a.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (aVar.f16459b + i7) - iMin;
            this.f106188a.setLayoutParams(layoutParams);
        } else if (iMin < 0) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f106188a.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = i7 + aVar.f16459b;
            this.f106188a.setLayoutParams(layoutParams2);
        }
    }

    public final void k0(boolean z6) {
        if (this.f106192e != 1) {
            return;
        }
        if (this.f106189b.getWidth() == 0 && z6) {
            final int i7 = 0;
            this.f106189b.post(new Runnable(this, i7) { // from class: Px0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f19391a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f19392b;

                {
                    this.f19391a = i7;
                    this.f19392b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f19391a) {
                        case 0:
                            BiliEditorMaterialAddView biliEditorMaterialAddView = (BiliEditorMaterialAddView) this.f19392b;
                            int i8 = BiliEditorMaterialAddView.f106184l;
                            biliEditorMaterialAddView.k0(false);
                            break;
                        case 1:
                            ImagesViewerActivity.ImageViewerFragment.jf((ImagesViewerActivity.ImageViewerFragment) this.f19392b);
                            break;
                        default:
                            f fVar = (f) this.f19392b;
                            StringBuilder sb = new StringBuilder("Successfully added ");
                            String str = fVar.d;
                            sb.append(str);
                            sb.append(" boot to the main dialog management.");
                            BLog.i("HomeTabGuidance", sb.toString());
                            MainDialogManager.DialogManagerInfo dialogManagerInfo = new MainDialogManager.DialogManagerInfo(str, new b(fVar), fVar.e);
                            View view = (View) fVar.b.get();
                            MainDialogManager.addDialog(dialogManagerInfo, view != null ? view.getContext() : null);
                            Function1 function1 = fVar.g;
                            if (function1 != null) {
                                function1.invoke(0);
                            }
                            break;
                    }
                }
            });
        }
        int width = this.f106189b.getWidth();
        int i8 = f106185m;
        int i9 = width + i8;
        Mx0.a aVar = Mx0.a.f16457j;
        int i10 = aVar.f16460c - f106187o;
        int iMin = Math.min(aVar.f16458a, i10) - (i10 - i9);
        if (1 <= iMin && iMin <= i9) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f106189b.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (aVar.f16459b + i8) - iMin;
            this.f106189b.setLayoutParams(layoutParams);
        } else if (iMin < 0) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f106189b.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = i8 + aVar.f16459b;
            this.f106189b.setLayoutParams(layoutParams2);
        }
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f106193f;
        Mx0.a aVar = Mx0.a.f16457j;
        Mx0.a aVar2 = Mx0.a.f16457j;
        rectF.left = a.C0086a.c(aVar2.f16459b);
        this.f106193f.right = a.C0086a.c(aVar2.f16460c);
        canvas.save();
        canvas.clipRect(this.f106193f);
        RectF rectF2 = this.f106193f;
        float f7 = f106186n;
        canvas.drawRoundRect(rectF2, f7, f7, this.f106194g);
        canvas.restore();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        this.f106193f.set(i7, 0.0f, i9, i10 - i8);
        if (this.f106196j == 0) {
            this.f106196j = this.f106188a.getWidth();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent == null) {
            return true;
        }
        this.f106197k.onTouchEvent(motionEvent);
        return true;
    }

    public final void setAddTitle(@NotNull String str) {
        this.f106190c.setText(str);
    }

    public final void setOnMaterialAddClick(@Nullable Function0<Unit> function0) {
        this.h = function0;
    }

    public final void setOnMaterialRecognitionClick(@Nullable Function1<? super Boolean, Unit> function1) {
        this.f106195i = function1;
    }
}
