package com.bilibili.studio.editor.moudle.editormain.track.material.multitrack;

import Mx0.a;
import Mx0.m;
import Nx0.c;
import US0.E;
import US0.F;
import US0.G;
import US0.H;
import Vx0.e;
import Wx0.c;
import Xx0.a;
import Yx0.b;
import Zx0.g;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import ay0.C4917b;
import ay0.InterfaceC4916a;
import com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo;
import com.bilibili.studio.editor.moudle.editormain.track.beans.MaterialState;
import com.bilibili.studio.editor.moudle.editormain.track.material.multitrack.data.PanelTrackMode;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/material/multitrack/BiliEditorMaterialPanelTrackView.class */
public final class BiliEditorMaterialPanelTrackView extends FrameLayout implements c, b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f106221i = DensityUtil.dp2px(2.0f);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f106222j = DensityUtil.dp2px(36.0f);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f106223k = DensityUtil.dp2px(32.0f);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f106224l = DensityUtil.dp2px(2.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f106225m = DensityUtil.dp2px(8.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e f106226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Wx0.c f106227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Wx0.b f106228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Xx0.b f106229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f106230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Zx0.b f106231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final g f106232g;

    @Nullable
    public Yx0.c h;

    public BiliEditorMaterialPanelTrackView(@NotNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r0v3, types: [Wx0.c, java.lang.Object] */
    public BiliEditorMaterialPanelTrackView(@NotNull Context context, @Nullable AttributeSet attributeSet) throws NoWhenBranchMatchedException {
        super(context, attributeSet, -1);
        e eVar = new e(context);
        this.f106226a = eVar;
        ?? obj = new Object();
        obj.f27427a = true;
        obj.f27428b = true;
        obj.f27429c = true;
        obj.f27430d = true;
        obj.f27431e = true;
        PanelTrackMode panelTrackMode = PanelTrackMode.MODE_NORMAL;
        obj.f27433g = panelTrackMode;
        this.f106227b = obj;
        Wx0.b bVar = new Wx0.b(this, eVar, new Vx0.a(this, 0));
        this.f106228c = bVar;
        Xx0.b bVar2 = new Xx0.b(context, this, bVar, this, new E(this, 1), new F(this, 1));
        this.f106229d = bVar2;
        a aVar = new a(context, this);
        this.f106230e = aVar;
        Zx0.b bVar3 = new Zx0.b(context, new G(this, 1));
        this.f106231f = bVar3;
        this.f106232g = new g(context, this, bVar, obj, aVar, eVar, bVar3, new H(this, 1));
        Vx0.c cVar = new Vx0.c(this);
        setWillNotDraw(false);
        aVar.f28356d = LayoutInflater.from(context).inflate(2131501676, (ViewGroup) this, false);
        aVar.f28354b = (ImageView) aVar.a().findViewById(2131302766);
        int iDp2px = DensityUtil.dp2px(context, 20.0f);
        int i7 = f106222j;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDp2px, i7);
        layoutParams.gravity = 16;
        aVar.a().setLayoutParams(layoutParams);
        aVar.a().setX(-1000.0f);
        aVar.a().setZ(1.2f);
        super.addView(aVar.a());
        aVar.f28357e = LayoutInflater.from(context).inflate(2131501677, (ViewGroup) this, false);
        aVar.f28355c = (ImageView) aVar.b().findViewById(2131302766);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(DensityUtil.dp2px(context, 20.0f), i7);
        layoutParams2.gravity = 16;
        aVar.b().setLayoutParams(layoutParams2);
        aVar.b().setX(-1000.0f);
        aVar.b().setZ(1.2f);
        super.addView(aVar.b());
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        com.bilibili.studio.editor.moudle.editormain.track.cover.a aVar2 = aVar.f28358f;
        addView(aVar2, layoutParams3);
        aVar2.setZ(1.1f);
        aVar2.setOnDrawListener(cVar);
        Rx0.b bVar4 = bVar2.f28386s;
        bVar4.f20994d.setColor(bVar4.f20995e);
        bVar4.f20994d.setStyle(Paint.Style.FILL);
        bVar2.f28387t.a();
        bVar2.f28376i.setColor(bVar2.f28381n);
        Paint paint = bVar2.f28376i;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        bVar2.f28376i.setStrokeWidth(DensityUtil.dp2px(context, 3.0f));
        bVar2.f28377j.setStyle(Paint.Style.FILL_AND_STROKE);
        bVar2.f28378k.setStrokeWidth(bVar2.f28389v);
        bVar2.f28378k.setColor(bVar2.f28384q);
        bVar2.f28378k.setStyle(style);
        obj.f27433g = panelTrackMode;
        int i8 = c.a.f27434a[panelTrackMode.ordinal()];
        if (i8 == 1) {
            obj.f27428b = true;
            obj.f27427a = true;
            obj.f27429c = true;
            obj.f27430d = true;
            obj.f27431e = true;
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            obj.f27428b = false;
            obj.f27427a = false;
            obj.f27429c = false;
            obj.f27430d = false;
            obj.f27431e = false;
        }
        Ak.a aVar3 = obj.f27432f;
        if (aVar3 != null) {
            aVar3.invoke();
        }
        obj.f27432f = new Ak.a(this, 2);
        setLayerType(2, null);
    }

    public static void i(BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView, BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo) {
        if (biliEditorMaterialPanelTrackView.f106228c.c(biliEditorMaterialMultiInfo, true)) {
            if (biliEditorMaterialPanelTrackView.f106227b.f27433g == PanelTrackMode.MODE_NORMAL && biliEditorMaterialMultiInfo != null && biliEditorMaterialPanelTrackView.c(biliEditorMaterialMultiInfo)) {
                biliEditorMaterialPanelTrackView.j(biliEditorMaterialMultiInfo, 0);
            }
            biliEditorMaterialPanelTrackView.g();
        }
    }

    @Override // Nx0.c
    public final void G(int i7, @Nullable Long l7, @Nullable m mVar) {
        Xx0.b bVar = this.f106229d;
        int i8 = bVar.f28373e;
        Wx0.b bVar2 = bVar.f28370b;
        int i9 = 0;
        if (i8 == 1) {
            for (Gx0.b bVar3 : bVar2.f27421d) {
                if (i9 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                for (BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo : bVar3.f7442a) {
                    bVar.f28385r.getClass();
                }
                i9++;
            }
        } else if (i8 == 2) {
            int i10 = 0;
            for (Gx0.b bVar4 : bVar2.f27421d) {
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                for (BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo2 : bVar4.f7442a) {
                    ((BiliEditorMaterialPanelTrackView) bVar.f28372d.b).getClass();
                }
                i10++;
            }
        }
        k();
    }

    @Override // Nx0.c
    public final void P(int i7, int i8, int i9, long j7) {
        Xx0.b bVar = this.f106229d;
        int i10 = bVar.f28373e;
        Wx0.b bVar2 = bVar.f28370b;
        int i11 = 0;
        if (i10 == 1) {
            int i12 = 0;
            for (Gx0.b bVar3 : bVar2.f27421d) {
                if (i12 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                for (BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo : bVar3.f7442a) {
                    Mx0.a aVar = Mx0.a.f16457j;
                    biliEditorMaterialMultiInfo.setLeftPos(a.C0086a.e(biliEditorMaterialMultiInfo.getInPoint()));
                    biliEditorMaterialMultiInfo.setRightPos(a.C0086a.e(biliEditorMaterialMultiInfo.getOutPoint()));
                    bVar.f28375g.left = a.C0086a.c(biliEditorMaterialMultiInfo.getLeftPos());
                    bVar.f28375g.right = a.C0086a.c(biliEditorMaterialMultiInfo.getRightPos());
                    bVar.f28385r.getClass();
                }
                i12++;
            }
        } else if (i10 == 2) {
            int i13 = 0;
            for (Gx0.b bVar4 : bVar2.f27421d) {
                if (i13 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                for (BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo2 : bVar4.f7442a) {
                    Mx0.a aVar2 = Mx0.a.f16457j;
                    biliEditorMaterialMultiInfo2.setLeftPos(a.C0086a.e(biliEditorMaterialMultiInfo2.getInPoint()));
                    biliEditorMaterialMultiInfo2.setRightPos(a.C0086a.e(biliEditorMaterialMultiInfo2.getOutPoint()));
                    ((BiliEditorMaterialPanelTrackView) bVar.f28372d.b).getClass();
                }
                i13++;
            }
        } else {
            for (Gx0.b bVar5 : bVar2.f27421d) {
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                for (BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo3 : bVar5.f7442a) {
                    Mx0.a aVar3 = Mx0.a.f16457j;
                    biliEditorMaterialMultiInfo3.setLeftPos(a.C0086a.e(biliEditorMaterialMultiInfo3.getInPoint()));
                    biliEditorMaterialMultiInfo3.setRightPos(a.C0086a.e(biliEditorMaterialMultiInfo3.getOutPoint()));
                }
                i11++;
            }
        }
        k();
    }

    public final void a() {
        Wx0.b bVar = this.f106228c;
        for (int size = bVar.f27421d.size() - 1; -1 < size && bVar.f27421d.get(size).f7442a.isEmpty(); size--) {
            bVar.f27421d.remove(size);
        }
        g gVar = this.f106232g;
        gVar.f29826l = Math.max(0, Math.min(gVar.f29826l, gVar.g(getHeight())));
        g();
    }

    public final void b() {
        Xx0.b bVar = this.f106229d;
        if (bVar.f28373e == 1) {
            bVar.f28385r.getClass();
        }
    }

    public final boolean c(BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo) {
        int bottom = getBottom();
        int i7 = this.f106232g.f29826l;
        int top = getTop();
        int i8 = this.f106232g.f29826l;
        int bottomPos = (biliEditorMaterialMultiInfo.isMusicMaterial() || biliEditorMaterialMultiInfo.isRecordMaterial()) ? biliEditorMaterialMultiInfo.getBottomPos() : biliEditorMaterialMultiInfo.getTopPos();
        boolean z6 = false;
        if (top - i8 <= bottomPos) {
            z6 = false;
            if (bottomPos <= bottom - i7) {
                z6 = true;
            }
        }
        return !z6;
    }

    public final void d() {
        this.f106226a.d(this.f106228c.f27421d, getBottom() - getTop());
        Yx0.c cVar = this.h;
        if (cVar != null) {
            CopyOnWriteArrayList<BiliEditorMaterialMultiInfo> copyOnWriteArrayList = this.f106228c.f27422e;
            cVar.i();
        }
        k();
        C4917b<BiliEditorMaterialMultiInfo> c4917b = this.f106229d.f28385r;
        CopyOnWriteArrayList<BiliEditorMaterialMultiInfo> copyOnWriteArrayList2 = this.f106228c.f27422e;
        c4917b.getClass();
    }

    public final float e(float f7) {
        return f7 + this.f106232g.f29826l;
    }

    public final int f(int i7) {
        return i7 + this.f106232g.f29826l;
    }

    public final void g() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).invalidate();
        }
        k();
    }

    @NotNull
    public final CopyOnWriteArrayList<BiliEditorMaterialMultiInfo> getAllMaterial() {
        return this.f106228c.f27422e;
    }

    @Nullable
    public final Ox0.a<BiliEditorMaterialMultiInfo> getCustomDrawer() {
        return null;
    }

    @Nullable
    public final BiliEditorMaterialMultiInfo getMaterialSelected() {
        return this.f106228c.f27423f;
    }

    @Nullable
    public final Yx0.c getOnMaterialTouchListener() {
        return this.h;
    }

    @Nullable
    public final Pair<Integer, Integer> getRestrictMaterialXPosition() {
        this.f106229d.getClass();
        return null;
    }

    @Nullable
    public final InterfaceC4916a<BiliEditorMaterialMultiInfo> getViewCreator() {
        this.f106229d.f28385r.getClass();
        return null;
    }

    @Override // Yx0.b
    public int getViewHeight() {
        return getBottom() - getTop();
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.Comparator] */
    public final void h(@NotNull ArrayList<BiliEditorMaterialMultiInfo> arrayList, @Nullable BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo, boolean z6, boolean z7, boolean z8) {
        Iterator<Gx0.b> it;
        this.f106226a.f26020g = !arrayList.isEmpty() ? arrayList.get(0).isAudioMaterial() : false;
        Wx0.b bVar = this.f106228c;
        bVar.getClass();
        int trackIndex = -1;
        for (BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo2 : arrayList) {
            if (trackIndex < biliEditorMaterialMultiInfo2.getTrackIndex()) {
                trackIndex = biliEditorMaterialMultiInfo2.getTrackIndex();
            }
        }
        bVar.f27421d.clear();
        if (trackIndex >= 0) {
            int i7 = 0;
            while (true) {
                bVar.a();
                if (i7 == trackIndex) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        for (BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo3 : arrayList) {
            if (biliEditorMaterialMultiInfo3.getTrackIndex() >= 0 && biliEditorMaterialMultiInfo3.getTrackIndex() < bVar.f27421d.size()) {
                Gx0.b bVar2 = bVar.f27421d.get(biliEditorMaterialMultiInfo3.getTrackIndex());
                Mx0.a aVar = Mx0.a.f16457j;
                int iE = a.C0086a.e(biliEditorMaterialMultiInfo3.getInPoint());
                int iE2 = a.C0086a.e(biliEditorMaterialMultiInfo3.getOutPoint());
                biliEditorMaterialMultiInfo3.setLeftPos(iE);
                biliEditorMaterialMultiInfo3.setRightPos(iE2);
                biliEditorMaterialMultiInfo3.setTopPos(bVar2.f7443b);
                biliEditorMaterialMultiInfo3.setBottomPos(bVar2.f7444c);
                bVar2.f7442a.add(biliEditorMaterialMultiInfo3);
            }
        }
        bVar.f27422e.clear();
        bVar.f27422e.addAll(arrayList);
        bVar.b();
        if (z8) {
            g gVar = this.f106232g;
            gVar.f29826l = Math.max(0, Math.min(gVar.f29826l, gVar.g(getHeight())));
        }
        this.f106228c.c(biliEditorMaterialMultiInfo, z7);
        e eVar = this.f106226a;
        CopyOnWriteArrayList<Gx0.b> copyOnWriteArrayList = this.f106228c.f27421d;
        eVar.getClass();
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        copyOnWriteArrayList2.addAll(copyOnWriteArrayList);
        Iterator<Gx0.b> it2 = copyOnWriteArrayList.iterator();
        int i8 = 0;
        int i9 = 0;
        while (it2.hasNext()) {
            Gx0.b next = it2.next();
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Gx0.b bVar3 = next;
            hashSet.clear();
            List listSortedWith = CollectionsKt.sortedWith(bVar3.f7442a, (Comparator) new Object());
            int i10 = i9;
            for (Object obj : listSortedWith) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo4 = (BiliEditorMaterialMultiInfo) obj;
                if (hashSet.contains(biliEditorMaterialMultiInfo4)) {
                    it = it2;
                } else {
                    hashSet.add(biliEditorMaterialMultiInfo4);
                    int size = listSortedWith.size();
                    int i12 = i11;
                    while (true) {
                        it = it2;
                        if (i12 < size) {
                            BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo5 = (BiliEditorMaterialMultiInfo) listSortedWith.get(i12);
                            if (biliEditorMaterialMultiInfo4.getLeftPos() < biliEditorMaterialMultiInfo5.getRightPos() && biliEditorMaterialMultiInfo4.getRightPos() > biliEditorMaterialMultiInfo5.getLeftPos()) {
                                Gx0.b bVarA = e.a(biliEditorMaterialMultiInfo5.getLeftPos(), biliEditorMaterialMultiInfo5.getRightPos(), copyOnWriteArrayList2);
                                bVarA.f7442a.add(biliEditorMaterialMultiInfo5);
                                bVar3.f7442a.remove(biliEditorMaterialMultiInfo5);
                                biliEditorMaterialMultiInfo5.setTrackIndex(copyOnWriteArrayList2.indexOf(bVarA));
                                hashSet.add(biliEditorMaterialMultiInfo5);
                            }
                            i12++;
                        }
                    }
                }
                it2 = it;
                i10 = i11;
                i9 = 0;
            }
            i8++;
        }
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(copyOnWriteArrayList2);
        b();
        d();
        if (this.f106227b.f27433g == PanelTrackMode.MODE_NORMAL && z8 && z6) {
            if (biliEditorMaterialMultiInfo != null) {
                j(biliEditorMaterialMultiInfo, 0);
            } else {
                j(null, this.f106232g.f29826l);
            }
        }
        g();
    }

    public final void j(BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo, int i7) {
        if (biliEditorMaterialMultiInfo != null) {
            i7 = ((biliEditorMaterialMultiInfo.isMusicMaterial() || biliEditorMaterialMultiInfo.isRecordMaterial()) ? biliEditorMaterialMultiInfo.getBottomPos() : biliEditorMaterialMultiInfo.getTopPos()) - f106221i;
        }
        int iG = this.f106232g.g(getHeight());
        Zx0.b bVar = this.f106231f;
        int i8 = this.f106232g.f29826l;
        bVar.getClass();
        bVar.c(Math.max(0, Math.min(-i7, iG)) - i8, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.track.material.multitrack.BiliEditorMaterialPanelTrackView.k():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        List<TrackAdsorbBean> list = this.f106226a.f26019f;
        if (list != null) {
            list.clear();
        }
        Zx0.b bVar = this.f106231f;
        bVar.f29795g.forceFinished(true);
        bVar.f29791c.forceFinished(true);
        bVar.f29790b.cancel();
        bVar.f29794f.cancel();
        Qx0.e eVar = this.f106229d.f28387t.f21003i;
        eVar.f20238b.f20234a.evictAll();
        eVar.f20240d = null;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        Xx0.b bVar = this.f106229d;
        int left = getLeft();
        int right = getRight();
        int height = getHeight();
        BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo = this.f106228c.f27423f;
        boolean z6 = bVar.f28380m.f28399k;
        Wx0.b bVar2 = bVar.f28370b;
        if (z6) {
            bVar.f28377j.setColor(bVar.f28382o);
            boolean zIsEmpty = bVar2.f27421d.isEmpty();
            BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView = bVar.f28371c;
            if (!zIsEmpty) {
                for (Gx0.b bVar3 : bVar2.f27421d) {
                    Rect rect = bVar.f28374f;
                    Mx0.a aVar = Mx0.a.f16457j;
                    Mx0.a aVar2 = Mx0.a.f16457j;
                    rect.left = a.C0086a.c(aVar2.f16459b);
                    bVar.f28374f.right = a.C0086a.c(aVar2.f16460c);
                    bVar.f28374f.top = biliEditorMaterialPanelTrackView.f(bVar3.f7443b);
                    bVar.f28374f.bottom = biliEditorMaterialPanelTrackView.f(bVar3.f7444c);
                    bVar.h.set(bVar.f28374f);
                    RectF rectF = bVar.h;
                    Path path = bVar.f28379l;
                    path.reset();
                    float f7 = Fx0.a.f6465b;
                    path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                    path.close();
                    canvas.save();
                    canvas.clipPath(bVar.f28379l);
                    canvas.drawRect(bVar.h, bVar.f28377j);
                    Unit unit = Unit.INSTANCE;
                    canvas.restore();
                }
            } else if (bVar.f28380m.f28398j) {
                Rect rect2 = bVar.f28374f;
                Mx0.a aVar3 = Mx0.a.f16457j;
                Mx0.a aVar4 = Mx0.a.f16457j;
                rect2.left = a.C0086a.c(aVar4.f16459b);
                bVar.f28374f.right = a.C0086a.c(aVar4.f16460c);
                bVar.f28374f.top = biliEditorMaterialPanelTrackView.f(0);
                bVar.f28374f.bottom = biliEditorMaterialPanelTrackView.f(height);
                bVar.h.set(bVar.f28374f);
                RectF rectF2 = bVar.h;
                Path path2 = bVar.f28379l;
                path2.reset();
                float f8 = Fx0.a.f6465b;
                path2.addRoundRect(rectF2, f8, f8, Path.Direction.CW);
                path2.close();
                canvas.save();
                canvas.clipPath(bVar.f28379l);
                canvas.drawRect(bVar.h, bVar.f28377j);
                Unit unit2 = Unit.INSTANCE;
                canvas.restore();
            }
        }
        int i7 = bVar.f28373e;
        if (i7 != 0) {
            if (i7 != 2) {
                return;
            }
            Iterator<Gx0.b> it = bVar2.f27421d.iterator();
            while (it.hasNext()) {
                for (BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo2 : it.next().f7442a) {
                    ((BiliEditorMaterialPanelTrackView) bVar.f28372d.b).getClass();
                }
            }
            return;
        }
        Iterator<Gx0.b> it2 = bVar2.f27421d.iterator();
        while (it2.hasNext()) {
            for (BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo3 : it2.next().f7442a) {
                if (biliEditorMaterialMultiInfo3.getState() == MaterialState.FIXED) {
                    bVar.a(canvas, biliEditorMaterialMultiInfo3, biliEditorMaterialMultiInfo, left, right, height);
                }
            }
        }
        if (biliEditorMaterialMultiInfo != null) {
            if (biliEditorMaterialMultiInfo.getState() == MaterialState.LONG_PRESS || biliEditorMaterialMultiInfo.getState() == MaterialState.TRIM_HANDLE) {
                bVar.a(canvas, biliEditorMaterialMultiInfo, biliEditorMaterialMultiInfo, left, right, height);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        Xx0.b bVar = this.f106229d;
        Rect rect = bVar.f28374f;
        int i11 = i10 - i8;
        rect.set(i7, 0, i9, i11);
        bVar.f28375g.set(bVar.f28374f);
        this.f106226a.e(i11, this.f106228c.f27421d);
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:209:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02bd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r22) {
        /*
            Method dump skipped, instruction units count: 3301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.track.material.multitrack.BiliEditorMaterialPanelTrackView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCustomDrawer(@Nullable Ox0.a<BiliEditorMaterialMultiInfo> aVar) {
        this.f106229d.f28373e = 2;
        g();
    }

    public final void setDrawConfig(@NotNull Xx0.c cVar) {
        Xx0.b bVar = this.f106229d;
        bVar.f28380m = cVar;
        Rx0.b bVar2 = bVar.f28386s;
        bVar2.f20992b = cVar;
        Rx0.a aVar = bVar.f28388u;
        aVar.f20988b = cVar;
        bVar.f28387t.f20999d = cVar;
        bVar2.f20995e = ContextCompat.getColor(bVar2.f20991a, cVar.f28390a);
        aVar.f20989c.setColor(ContextCompat.getColor(aVar.f20987a, aVar.f20988b.f28395f));
        ContextCompat.getColor(bVar.f28369a, bVar.f28380m.f28396g);
        bVar.f28381n = ContextCompat.getColor(bVar.f28369a, bVar.f28380m.h);
        bVar.f28382o = ContextCompat.getColor(bVar.f28369a, bVar.f28380m.f28392c);
        ContextCompat.getColor(bVar.f28369a, bVar.f28380m.f28397i);
        bVar.f28383p = ContextCompat.getColor(bVar.f28369a, bVar.f28380m.f28393d);
        bVar.f28384q = ContextCompat.getColor(bVar.f28369a, bVar.f28380m.f28394e);
        int color = ContextCompat.getColor(getContext(), cVar.f28394e);
        Xx0.a aVar2 = this.f106230e;
        ImageView imageView = aVar2.f28354b;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvLeftHandle");
            imageView2 = null;
        }
        imageView2.setColorFilter(color);
        ImageView imageView3 = aVar2.f28355c;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvRightHandle");
            imageView3 = null;
        }
        imageView3.setColorFilter(color);
    }

    public final void setHandlerAdsorbListProvider(@Nullable Yx0.a aVar) {
        this.f106228c.f27424g = aVar;
    }

    public final void setMaterialShowSelectedOnly(boolean z6) {
        this.f106229d.getClass();
    }

    public final void setMoveAdsorbListProvider(@Nullable Yx0.a aVar) {
        this.f106228c.h = aVar;
    }

    public final void setOnMaterialTouchListener(@Nullable Yx0.c cVar) {
        this.h = cVar;
        this.f106232g.f29830p = cVar;
        this.f106228c.f27426j = cVar;
    }

    public final void setViewCreator(@NotNull InterfaceC4916a<BiliEditorMaterialMultiInfo> interfaceC4916a) {
        this.f106229d.f28385r.getClass();
        this.f106229d.f28373e = 1;
        b();
    }
}
