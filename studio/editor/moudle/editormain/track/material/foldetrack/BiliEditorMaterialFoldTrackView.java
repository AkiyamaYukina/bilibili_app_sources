package com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack;

import Mx0.a;
import Mx0.m;
import Nx0.c;
import Rx0.b;
import Tx0.h;
import Tx0.i;
import Tx0.j;
import Tx0.n;
import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo;
import com.bilibili.studio.editor.moudle.editormain.track.enums.BiliEditorMaterialType;
import com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.control.MaterialFoldTrackModeControl;
import com.bilibili.studio.editor.moudle.editormain.track.material.multitrack.BiliEditorMaterialPanelTrackView;
import com.bilibili.studio.editor.moudle.editormain.track.material.multitrack.TrackAdsorbBean;
import com.bilibili.studio.editor.moudle.editormain.ui.panels.control.MainPanelMaterialTrackType;
import com.bilibili.studio.editor.moudle.editormain.uistate.mainpanel.MainPanelMaterialFoldTrackUiState;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/material/foldetrack/BiliEditorMaterialFoldTrackView.class */
public final class BiliEditorMaterialFoldTrackView extends FrameLayout implements c {
    public static final int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MaterialFoldTrackModeControl f106199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f106200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final i f106201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Tx0.c f106202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final n f106203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public j f106204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Ux0.a f106205g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/material/foldetrack/BiliEditorMaterialFoldTrackView$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f106206a;

        static {
            int[] iArr = new int[MainPanelMaterialTrackType.values().length];
            try {
                iArr[MainPanelMaterialTrackType.TRACK_AUDIO_FOLD.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[MainPanelMaterialTrackType.TRACK_CAPTION_FOLD.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f106206a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.BiliEditorMaterialFoldTrackView$setDrawControl$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/material/foldetrack/BiliEditorMaterialFoldTrackView$setDrawControl$1.class */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, BiliEditorMaterialFoldTrackView.class, "updateView", "updateView()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m9913invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m9913invoke() {
            BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView = (BiliEditorMaterialFoldTrackView) ((CallableReference) this).receiver;
            int i7 = BiliEditorMaterialFoldTrackView.h;
            biliEditorMaterialFoldTrackView.d();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.BiliEditorMaterialFoldTrackView$setDrawControl$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/material/foldetrack/BiliEditorMaterialFoldTrackView$setDrawControl$2.class */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
        public AnonymousClass2(Object obj) {
            super(0, obj, BiliEditorMaterialFoldTrackView.class, "updateView", "updateView()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m9914invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m9914invoke() {
            BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView = (BiliEditorMaterialFoldTrackView) ((CallableReference) this).receiver;
            int i7 = BiliEditorMaterialFoldTrackView.h;
            biliEditorMaterialFoldTrackView.d();
        }
    }

    @JvmOverloads
    public BiliEditorMaterialFoldTrackView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public BiliEditorMaterialFoldTrackView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [Tx0.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.control.MaterialFoldTrackModeControl, java.lang.Object] */
    public BiliEditorMaterialFoldTrackView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        ?? obj = new Object();
        obj.f106207a = true;
        obj.f106208b = true;
        obj.f106209c = true;
        obj.f106210d = true;
        obj.f106211e = MaterialFoldTrackModeControl.TrackMode.MODE_SHOW;
        this.f106199a = obj;
        h hVar = new h(obj);
        this.f106200b = hVar;
        ?? obj2 = new Object();
        this.f106201c = obj2;
        Tx0.c cVar = new Tx0.c(context);
        this.f106202d = cVar;
        this.f106203e = new n(context, obj, hVar, obj2, cVar, new BiliEditorMaterialFoldTrackView$eventControl$1(this));
        setWillNotDraw(false);
        Context context2 = getContext();
        obj2.f24348c = LayoutInflater.from(context2).inflate(2131501676, (ViewGroup) this, false);
        obj2.f24346a = (ImageView) obj2.a().findViewById(2131302766);
        int iDp2px = DensityUtil.dp2px(context2, 20.0f);
        int i8 = BiliEditorMaterialPanelTrackView.f106222j;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDp2px, i8);
        layoutParams.gravity = 16;
        obj2.a().setLayoutParams(layoutParams);
        obj2.a().setX(-1000.0f);
        obj2.a().setZ(1.2f);
        addView(obj2.a());
        obj2.f24349d = LayoutInflater.from(context2).inflate(2131501677, (ViewGroup) this, false);
        obj2.f24347b = (ImageView) obj2.b().findViewById(2131302766);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(DensityUtil.dp2px(context2, 20.0f), i8);
        layoutParams2.gravity = 16;
        obj2.b().setLayoutParams(layoutParams2);
        obj2.b().setX(-1000.0f);
        obj2.b().setZ(1.2f);
        addView(obj2.b());
        setLayerType(2, null);
    }

    private final void setDrawControl(MainPanelMaterialTrackType mainPanelMaterialTrackType) {
        j aVar = (mainPanelMaterialTrackType == MainPanelMaterialTrackType.TRACK_MUSIC_FOLD || mainPanelMaterialTrackType == MainPanelMaterialTrackType.TRACK_RECORD_FOLD || mainPanelMaterialTrackType == MainPanelMaterialTrackType.TRACK_AUDIO_FOLD) ? new com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.control.a(getContext(), this.f106200b, this, new AnonymousClass1(this)) : new j(getContext(), this.f106200b, this, new AnonymousClass2(this));
        this.f106204f = aVar;
        b bVar = aVar.f24359k;
        bVar.f20994d.setColor(bVar.f20995e);
        Paint paint = bVar.f20994d;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        aVar.f24360l.a();
        Paint paint2 = aVar.f24354e;
        int i7 = aVar.f24357i;
        paint2.setColor(i7);
        aVar.f24354e.setStyle(Paint.Style.STROKE);
        aVar.f24354e.setStrokeWidth(DensityUtil.dp2px(aVar.f24350a, 0.5f));
        aVar.f24355f.setColor(i7);
        aVar.f24355f.setStyle(style);
    }

    @Override // Nx0.c
    public final void G(int i7, @Nullable Long l7, @Nullable m mVar) {
        d();
    }

    @Override // Nx0.c
    public final void P(int i7, int i8, int i9, long j7) {
        j jVar = this.f106204f;
        if (jVar != null) {
            for (BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo : jVar.f24351b.f24339b) {
                Mx0.a aVar = Mx0.a.f16457j;
                biliEditorMaterialMultiInfo.setLeftPos(a.C0086a.e(biliEditorMaterialMultiInfo.getInPoint()));
                biliEditorMaterialMultiInfo.setRightPos(a.C0086a.e(biliEditorMaterialMultiInfo.getOutPoint()));
            }
        }
        d();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(@NotNull MainPanelMaterialTrackType mainPanelMaterialTrackType) throws NoWhenBranchMatchedException {
        setTrackMode(MaterialFoldTrackModeControl.TrackMode.MODE_EDIT);
        setDrawControl(mainPanelMaterialTrackType);
        setDrawConfig(new Xx0.c(2131104721, null, 0, 0, false, false, 16382));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void b(@NotNull MainPanelMaterialFoldTrackUiState mainPanelMaterialFoldTrackUiState, @NotNull MainPanelMaterialTrackType mainPanelMaterialTrackType, boolean z6) throws NoWhenBranchMatchedException {
        MaterialFoldTrackModeControl.TrackMode trackMode = mainPanelMaterialFoldTrackUiState.f107122c != null ? MaterialFoldTrackModeControl.TrackMode.MODE_WEAK_SELECT : MaterialFoldTrackModeControl.TrackMode.MODE_SHOW;
        boolean z7 = mainPanelMaterialTrackType == MainPanelMaterialTrackType.TRACK_AUDIO_FOLD;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i7 = a.f106206a[mainPanelMaterialTrackType.ordinal()];
        layoutParams.height = (i7 == 1 || i7 == 2) ? DimenUtilsKt.dpToPx(28.0f) : DimenUtilsKt.dpToPx(36.0f);
        requestLayout();
        setDrawControl(mainPanelMaterialTrackType);
        setTrackMode(trackMode);
        EnumMap enumMap = new EnumMap(BiliEditorMaterialType.class);
        BiliEditorMaterialType biliEditorMaterialType = BiliEditorMaterialType.TYPE_CAPTION;
        HashMap map = new HashMap();
        Application application = BiliContext.application();
        if (application != null) {
            map.put(0, Integer.valueOf(ContextCompat.getColor(application, 2131104721)));
            map.put(1, Integer.valueOf(ContextCompat.getColor(application, 2131104721)));
            map.put(2, Integer.valueOf(ContextCompat.getColor(application, 2131104721)));
            map.put(3, Integer.valueOf(ContextCompat.getColor(application, 2131104721)));
        }
        enumMap.put(biliEditorMaterialType, map);
        BiliEditorMaterialType biliEditorMaterialType2 = BiliEditorMaterialType.TYPE_STICKER;
        HashMap map2 = new HashMap();
        Application application2 = BiliContext.application();
        if (application2 != null) {
            map2.put(0, Integer.valueOf(ContextCompat.getColor(application2, 2131104721)));
        }
        enumMap.put(biliEditorMaterialType2, map2);
        enumMap.put(BiliEditorMaterialType.TYPE_RECORD, xy0.c.b(z7));
        BiliEditorMaterialType biliEditorMaterialType3 = BiliEditorMaterialType.TYPE_MUSIC;
        HashMap map3 = new HashMap();
        Application application3 = BiliContext.application();
        if (application3 != null) {
            map3.put(2, Integer.valueOf(ContextCompat.getColor(application3, 2131104820)));
        }
        enumMap.put(biliEditorMaterialType3, map3);
        setDrawConfig(new Xx0.c(2131104721, enumMap, 0, 0, z6, z7, 4092));
    }

    public final void c(@Nullable List<BiliEditorMaterialMultiInfo> list, @Nullable BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo) {
        h hVar = this.f106200b;
        hVar.f24340c = null;
        List<BiliEditorMaterialMultiInfo> arrayList = list;
        if (list == null) {
            arrayList = new ArrayList();
        }
        hVar.f24339b = arrayList;
        for (BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo2 : arrayList) {
            Mx0.a aVar = Mx0.a.f16457j;
            biliEditorMaterialMultiInfo2.setLeftPos(a.C0086a.e(biliEditorMaterialMultiInfo2.getInPoint()));
            biliEditorMaterialMultiInfo2.setRightPos(a.C0086a.e(biliEditorMaterialMultiInfo2.getOutPoint()));
            biliEditorMaterialMultiInfo2.setLabelResId(null);
            biliEditorMaterialMultiInfo2.setLabelFilePath(null);
        }
        CollectionsKt.sortWith(hVar.f24339b, hVar.f24345i);
        this.f106200b.b(biliEditorMaterialMultiInfo, true);
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r4 = this;
            r0 = r4
            Tx0.h r0 = r0.f106200b
            com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo r0 = r0.f24340c
            r8 = r0
            r0 = r4
            com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.control.MaterialFoldTrackModeControl r0 = r0.f106199a
            boolean r0 = r0.f106209c
            if (r0 == 0) goto L6c
            r0 = r8
            if (r0 == 0) goto L6c
            r0 = r4
            Tx0.n r0 = r0.f106203e
            r7 = r0
            r0 = r7
            boolean r0 = r0.f24386n
            if (r0 != 0) goto L6c
            r0 = r7
            com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo r0 = r0.f24383k
            if (r0 == 0) goto L2e
            goto L6c
        L2e:
            r0 = r4
            Tx0.i r0 = r0.f106201c
            r7 = r0
            r0 = r8
            int r0 = r0.getLeftPos()
            r6 = r0
            r0 = r8
            int r0 = r0.getRightPos()
            r5 = r0
            r0 = r7
            android.view.View r0 = r0.a()
            r8 = r0
            Mx0.a r0 = Mx0.a.f16457j
            r9 = r0
            r0 = r8
            r1 = r6
            int r1 = Mx0.a.C0086a.c(r1)
            float r1 = (float) r1
            r2 = r7
            android.view.View r2 = r2.a()
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r1 = r1 - r2
            r0.setX(r1)
            r0 = r7
            android.view.View r0 = r0.b()
            r1 = r5
            int r1 = Mx0.a.C0086a.c(r1)
            float r1 = (float) r1
            r0.setX(r1)
            goto L83
        L6c:
            r0 = r4
            Tx0.i r0 = r0.f106201c
            r7 = r0
            r0 = r7
            android.view.View r0 = r0.a()
            r1 = -998637568(0xffffffffc47a0000, float:-1000.0)
            r0.setX(r1)
            r0 = r7
            android.view.View r0 = r0.b()
            r1 = -998637568(0xffffffffc47a0000, float:-1000.0)
            r0.setX(r1)
        L83:
            r0 = r4
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.BiliEditorMaterialFoldTrackView.d():void");
    }

    @NotNull
    public final List<BiliEditorMaterialMultiInfo> getAllMaterial() {
        return this.f106200b.f24339b;
    }

    @Nullable
    public final BiliEditorMaterialMultiInfo getMaterialSelected() {
        return this.f106200b.f24340c;
    }

    @Nullable
    public final Ux0.a getOnMaterialTouchListener() {
        return this.f106205g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f106200b.f24340c = null;
        List<TrackAdsorbBean> list = this.f106203e.f24387o.f23136f;
        if (list != null) {
            list.clear();
        }
        Tx0.c cVar = this.f106202d;
        cVar.f24333c.forceFinished(true);
        cVar.f24332b.cancel();
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        j jVar = this.f106204f;
        if (jVar != null) {
            int left = getLeft();
            int right = getRight();
            int height = getHeight();
            BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo = this.f106200b.f24340c;
            for (BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo2 : jVar.f24351b.f24339b) {
                if (!Intrinsics.areEqual(biliEditorMaterialMultiInfo2, biliEditorMaterialMultiInfo)) {
                    jVar.a(canvas, biliEditorMaterialMultiInfo2, biliEditorMaterialMultiInfo, left, right, height);
                }
            }
            if (biliEditorMaterialMultiInfo != null) {
                jVar.a(canvas, biliEditorMaterialMultiInfo, biliEditorMaterialMultiInfo, left, right, height);
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
        d();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r23) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.BiliEditorMaterialFoldTrackView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDrawConfig(@NotNull Xx0.c cVar) {
        j jVar = this.f106204f;
        if (jVar != null) {
            jVar.c(cVar);
        }
        int color = ContextCompat.getColor(getContext(), cVar.f28394e);
        i iVar = this.f106201c;
        ImageView imageView = iVar.f24346a;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvLeftHandle");
            imageView2 = null;
        }
        imageView2.setColorFilter(color);
        ImageView imageView3 = iVar.f24347b;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvRightHandle");
            imageView3 = null;
        }
        imageView3.setColorFilter(color);
    }

    public final void setHandlerAdsorbListProvider(@Nullable Yx0.a aVar) {
        this.f106200b.f24341d = aVar;
    }

    public final void setMaterialSelected(@Nullable BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo) {
        if (this.f106200b.b(biliEditorMaterialMultiInfo, true)) {
            d();
        }
    }

    public final void setMoveAdsorbListProvider(@Nullable Yx0.a aVar) {
        this.f106200b.f24342e = aVar;
    }

    public final void setOnMaterialTouchListener(@Nullable Ux0.a aVar) {
        this.f106205g = aVar;
        this.f106203e.f24382j = aVar;
        this.f106200b.f24343f = aVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setTrackMode(@NotNull MaterialFoldTrackModeControl.TrackMode trackMode) throws NoWhenBranchMatchedException {
        MaterialFoldTrackModeControl materialFoldTrackModeControl = this.f106199a;
        materialFoldTrackModeControl.f106211e = trackMode;
        int i7 = MaterialFoldTrackModeControl.a.f106212a[trackMode.ordinal()];
        if (i7 == 1) {
            materialFoldTrackModeControl.f106208b = true;
            materialFoldTrackModeControl.f106207a = true;
            materialFoldTrackModeControl.f106209c = true;
            materialFoldTrackModeControl.f106210d = true;
            return;
        }
        if (i7 == 2) {
            materialFoldTrackModeControl.f106208b = false;
            materialFoldTrackModeControl.f106207a = true;
            materialFoldTrackModeControl.f106209c = false;
            materialFoldTrackModeControl.f106210d = false;
            return;
        }
        if (i7 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        materialFoldTrackModeControl.f106208b = false;
        materialFoldTrackModeControl.f106207a = false;
        materialFoldTrackModeControl.f106209c = false;
        materialFoldTrackModeControl.f106210d = true;
    }
}
