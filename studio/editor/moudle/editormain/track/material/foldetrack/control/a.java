package com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.control;

import Mx0.a;
import Tx0.h;
import Tx0.j;
import Xx0.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo;
import com.bilibili.studio.editor.moudle.editormain.track.beans.MaterialState;
import com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.BiliEditorMaterialFoldTrackView;
import com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.control.MaterialFoldTrackModeControl;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nD0.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/material/foldetrack/control/a.class */
public final class a extends j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Context f106213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final h f106214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final BiliEditorMaterialFoldTrackView f106215q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Rx0.a f106216r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Rect f106217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Rect f106218t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public Paint f106219u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Bitmap f106220v;

    public a(@NotNull Context context, @NotNull h hVar, @NotNull BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView, @NotNull Function0 function0) {
        super(context, hVar, biliEditorMaterialFoldTrackView, function0);
        this.f106213o = context;
        this.f106214p = hVar;
        this.f106215q = biliEditorMaterialFoldTrackView;
        this.f106216r = new Rx0.a(context, this.h);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [Tx0.a] */
    @Override // Tx0.j
    public final void a(@NotNull final Canvas canvas, @NotNull final BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo, @Nullable final BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo2, int i7, int i8, int i9) {
        Rect rect = this.f24352c;
        rect.top = 0;
        rect.bottom = i9;
        Mx0.a aVar = Mx0.a.f16457j;
        rect.left = a.C0086a.c(biliEditorMaterialMultiInfo.getLeftPos());
        this.f24352c.right = a.C0086a.c(biliEditorMaterialMultiInfo.getRightPos());
        Rect rect2 = this.f24352c;
        if (rect2.left > i8 || rect2.right < i7) {
            return;
        }
        if (d(biliEditorMaterialMultiInfo, biliEditorMaterialMultiInfo2)) {
            canvas.drawRect(this.f24352c, this.f24355f);
        }
        this.f24352c.inset(0, this.f24361m);
        this.f24353d.set(this.f24352c);
        RectF rectF = this.f24353d;
        ?? r02 = new Function0(this, canvas, biliEditorMaterialMultiInfo, biliEditorMaterialMultiInfo2) { // from class: Tx0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.control.a f24325a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Canvas f24326b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BiliEditorMaterialMultiInfo f24327c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final BiliEditorMaterialMultiInfo f24328d;

            {
                this.f24325a = this;
                this.f24326b = canvas;
                this.f24327c = biliEditorMaterialMultiInfo;
                this.f24328d = biliEditorMaterialMultiInfo2;
            }

            public final Object invoke() {
                Rect rect3;
                Rect rect4;
                Canvas canvas2 = this.f24326b;
                com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.control.a aVar2 = this.f24325a;
                Rx0.b bVar = aVar2.f24359k;
                Rect rect5 = aVar2.f24352c;
                BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo3 = this.f24328d;
                BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo4 = this.f24327c;
                bVar.a(canvas2, rect5, biliEditorMaterialMultiInfo4, biliEditorMaterialMultiInfo3);
                Rect rect6 = aVar2.f24352c;
                if (aVar2.h.f28401m) {
                    h hVar = aVar2.f106214p;
                    nD0.a aVar3 = hVar.f24344g;
                    nD0.a aVar4 = aVar3;
                    if (aVar3 == null) {
                        aVar4 = new nD0.a(new b(aVar2, 0));
                    }
                    hVar.f24344g = aVar4;
                    a.a aVarC = aVar4.c(biliEditorMaterialMultiInfo4);
                    if (aVarC != null) {
                        aVar2.f106216r.a(canvas2, aVar2.f24352c, biliEditorMaterialMultiInfo4, aVarC);
                    } else {
                        Bitmap bitmap = aVar2.f106220v;
                        if (bitmap != null && (rect3 = aVar2.f106218t) != null && (rect4 = aVar2.f106217s) != null) {
                            int iWidth = bitmap.getWidth() == 0 ? 0 : rect6.width() / bitmap.getWidth();
                            int i10 = 0;
                            while (true) {
                                if (i10 < iWidth) {
                                    rect3.left = (bitmap.getWidth() * i10) + rect6.left;
                                    rect3.top = DensityUtil.dp2px(9.0f) + rect6.top;
                                    rect3.right = bitmap.getWidth() + rect3.left;
                                    rect3.bottom = rect6.bottom - DensityUtil.dp2px(9.0f);
                                    if (rect3.right >= aVar2.f106215q.getLeft()) {
                                        if (rect3.left > aVar2.f106215q.getRight()) {
                                            break;
                                        }
                                        canvas2.drawBitmap(bitmap, (Rect) null, rect3, aVar2.f106219u);
                                    }
                                    i10++;
                                } else if (rect6.width() % bitmap.getWidth() != 0) {
                                    rect3.left = rect6.right - (rect6.width() % bitmap.getWidth());
                                    rect3.top = DensityUtil.dp2px(9.0f) + rect6.top;
                                    rect3.right = rect6.right;
                                    rect3.bottom = rect6.bottom - DensityUtil.dp2px(9.0f);
                                    rect4.left = 0;
                                    rect4.right = rect6.width() % bitmap.getWidth();
                                    rect4.top = 0;
                                    rect4.bottom = bitmap.getHeight();
                                    canvas2.drawBitmap(bitmap, rect4, rect3, aVar2.f106219u);
                                }
                            }
                        }
                    }
                }
                aVar2.f24360l.b(canvas2, aVar2.f24352c, biliEditorMaterialMultiInfo4);
                return Unit.INSTANCE;
            }
        };
        Path path = this.f24356g;
        path.reset();
        path.addRect(rectF, Path.Direction.CW);
        path.close();
        canvas.save();
        canvas.clipPath(this.f24356g);
        r02.invoke();
        canvas.restore();
        boolean zAreEqual = Intrinsics.areEqual(biliEditorMaterialMultiInfo2, biliEditorMaterialMultiInfo);
        h hVar = this.f106214p;
        if (!zAreEqual) {
            List<BiliEditorMaterialMultiInfo> list = hVar.f24339b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo3 = (BiliEditorMaterialMultiInfo) obj;
                long inPoint = biliEditorMaterialMultiInfo3.getInPoint();
                long outPoint = biliEditorMaterialMultiInfo3.getOutPoint();
                long outPoint2 = biliEditorMaterialMultiInfo.getOutPoint();
                if (inPoint <= outPoint2 && outPoint2 <= outPoint) {
                    arrayList.add(obj);
                }
            }
            b(canvas, this.f24353d, arrayList.size() < 2);
            return;
        }
        boolean zAreEqual2 = Intrinsics.areEqual(biliEditorMaterialMultiInfo2, biliEditorMaterialMultiInfo);
        int i10 = this.f24357i;
        if (zAreEqual2 && biliEditorMaterialMultiInfo.getState() != MaterialState.LONG_PRESS && hVar.f24338a.f106211e == MaterialFoldTrackModeControl.TrackMode.MODE_WEAK_SELECT) {
            RectF rectF2 = this.f24353d;
            this.f24354e.setColor(i10);
            this.f24354e.setStrokeWidth(DimenUtilsKt.dpToPx(2));
            float f7 = Fx0.a.f6465b;
            canvas.drawRoundRect(rectF2, f7, f7, this.f24354e);
            return;
        }
        if (d(biliEditorMaterialMultiInfo, biliEditorMaterialMultiInfo2)) {
            return;
        }
        RectF rectF3 = this.f24353d;
        this.f24354e.setStrokeWidth(DimenUtilsKt.dpToPx(0.5d));
        Paint paint = this.f24354e;
        int i11 = i10;
        if (Intrinsics.areEqual(biliEditorMaterialMultiInfo, biliEditorMaterialMultiInfo2)) {
            i11 = i10;
            if (biliEditorMaterialMultiInfo2.getState() == MaterialState.LONG_PRESS) {
                i11 = this.f24358j;
            }
        }
        paint.setColor(i11);
        float f8 = Fx0.a.f6465b;
        canvas.drawRoundRect(rectF3, f8, f8, this.f24354e);
    }

    @Override // Tx0.j
    public final void c(@NotNull c cVar) {
        super.c(cVar);
        if (cVar.f28401m) {
            this.f106217s = new Rect();
            this.f106218t = new Rect();
            Paint paint = new Paint();
            this.f106219u = paint;
            paint.setAntiAlias(true);
            Paint paint2 = this.f106219u;
            if (paint2 != null) {
                paint2.setColorFilter(new PorterDuffColorFilter(1275068416, PorterDuff.Mode.SRC_IN));
            }
            this.f106220v = BitmapFactory.decodeResource(this.f106213o.getResources(), 2131234908);
        }
    }

    public final boolean d(BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo, BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo2) {
        return (!Intrinsics.areEqual(biliEditorMaterialMultiInfo2, biliEditorMaterialMultiInfo) || biliEditorMaterialMultiInfo.getState() == MaterialState.LONG_PRESS || this.f106214p.f24338a.f106211e == MaterialFoldTrackModeControl.TrackMode.MODE_WEAK_SELECT) ? false : true;
    }
}
