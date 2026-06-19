package com.bilibili.studio.editor.moudle.editormain.ui.panels;

import Mx0.a;
import Mx0.f;
import Mx0.g;
import Mx0.h;
import Mx0.i;
import Mx0.j;
import Mx0.k;
import Mx0.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import by0.C5172a;
import com.bilibili.studio.editor.moudle.editormain.track.beans.BiliEditorMaterialMultiInfo;
import com.bilibili.studio.editor.moudle.editormain.track.cover.BiliEditorTrackCoverEditViewV2;
import com.bilibili.studio.editor.moudle.editormain.track.cover.enums.BiliEditorTrackMode;
import com.bilibili.studio.editor.moudle.editormain.track.material.addview.BiliEditorMaterialAddView;
import com.bilibili.studio.editor.moudle.editormain.track.material.foldetrack.BiliEditorMaterialFoldTrackView;
import com.bilibili.studio.editor.moudle.editormain.track.material.multitrack.BiliEditorMaterialPanelTrackView;
import com.bilibili.studio.editor.moudle.editormain.track.material.multitrack.TrackAdsorbBean;
import com.bilibili.studio.editor.moudle.editormain.track.panel.EditorMainTrackPanel;
import com.bilibili.studio.editor.moudle.editormain.track.timeaxis.EditorMainTimeAxisZoomView;
import com.bilibili.studio.editor.moudle.editormain.ui.toolbar.BiliEditorToolBarView;
import com.bilibili.studio.editor.moudle.editormain.ui.toolbar.a;
import com.bilibili.studio.editor.moudle.editormain.ui.toolbar.beans.EditorToolBar;
import com.bilibili.studio.editor.moudle.editormain.uistate.mainpanel.MainPanelMaterialEditableFoldTrackUiState;
import com.bilibili.studio.editor.moudle.editormain.uistate.mainpanel.MainPanelTransitionUiState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/panels/BiliEditorMainPanel.class */
public final class BiliEditorMainPanel extends ConstraintLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f107067m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BiliEditorTrackCoverEditViewV2 f107068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final EditorMainTimeAxisZoomView f107069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BiliEditorToolBarView f107070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final EditorMainTrackPanel f107071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BiliEditorMaterialFoldTrackView f107072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BiliEditorMaterialFoldTrackView f107073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final BiliEditorMaterialPanelTrackView f107074g;

    @Nullable
    public final g h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final xy0.a f107075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final View f107076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final View f107077k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f107078l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/panels/BiliEditorMainPanel$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f107079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f107080b;

        static {
            int[] iArr = new int[MainPanelTransitionUiState.UpdateMode.values().length];
            try {
                iArr[MainPanelTransitionUiState.UpdateMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[MainPanelTransitionUiState.UpdateMode.ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[MainPanelTransitionUiState.UpdateMode.SELECT.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f107079a = iArr;
            int[] iArr2 = new int[MainPanelMaterialEditableFoldTrackUiState.UpdateMode.values().length];
            try {
                iArr2[MainPanelMaterialEditableFoldTrackUiState.UpdateMode.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[MainPanelMaterialEditableFoldTrackUiState.UpdateMode.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr2[MainPanelMaterialEditableFoldTrackUiState.UpdateMode.SELECT.ordinal()] = 3;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr2[MainPanelMaterialEditableFoldTrackUiState.UpdateMode.UPDATE.ordinal()] = 4;
            } catch (NoSuchFieldError e13) {
            }
            f107080b = iArr2;
        }
    }

    @JvmOverloads
    public BiliEditorMainPanel(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public BiliEditorMainPanel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, xy0.a] */
    public BiliEditorMainPanel(Context context, AttributeSet attributeSet, int i7, int i8) throws NoWhenBranchMatchedException {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        ?? obj = new Object();
        this.f107075i = obj;
        this.f107078l = true;
        ViewGroup.inflate(context, 2131501710, this);
        BiliEditorTrackCoverEditViewV2 biliEditorTrackCoverEditViewV2 = (BiliEditorTrackCoverEditViewV2) findViewById(2131313851);
        this.f107068a = biliEditorTrackCoverEditViewV2;
        EditorMainTimeAxisZoomView editorMainTimeAxisZoomView = (EditorMainTimeAxisZoomView) findViewById(2131318568);
        this.f107069b = editorMainTimeAxisZoomView;
        EditorMainTrackPanel editorMainTrackPanel = (EditorMainTrackPanel) findViewById(2131318569);
        this.f107071d = editorMainTrackPanel;
        View viewFindViewById = findViewById(2131319423);
        this.f107076j = viewFindViewById;
        View viewFindViewById2 = findViewById(2131319422);
        this.f107077k = viewFindViewById2;
        BiliEditorMaterialAddView biliEditorMaterialAddView = (BiliEditorMaterialAddView) viewFindViewById.findViewById(2131318570);
        BiliEditorMaterialAddView biliEditorMaterialAddView2 = (BiliEditorMaterialAddView) viewFindViewById2.findViewById(2131318570);
        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView = (BiliEditorMaterialFoldTrackView) viewFindViewById.findViewById(2131318571);
        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView2 = (BiliEditorMaterialFoldTrackView) viewFindViewById2.findViewById(2131318571);
        this.f107072e = biliEditorMaterialFoldTrackView2;
        final BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView = (BiliEditorMaterialPanelTrackView) viewFindViewById.findViewById(2131318573);
        this.f107074g = biliEditorMaterialPanelTrackView;
        final BiliEditorMaterialPanelTrackView biliEditorMaterialPanelTrackView2 = (BiliEditorMaterialPanelTrackView) viewFindViewById2.findViewById(2131318573);
        final BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView3 = (BiliEditorMaterialFoldTrackView) viewFindViewById.findViewById(2131318572);
        this.f107073f = biliEditorMaterialFoldTrackView3;
        BiliEditorMaterialFoldTrackView biliEditorMaterialFoldTrackView4 = (BiliEditorMaterialFoldTrackView) viewFindViewById2.findViewById(2131318572);
        this.f107070c = (BiliEditorToolBarView) findViewById(2131318541);
        biliEditorTrackCoverEditViewV2.setTrackMode(BiliEditorTrackMode.TRACK_MODE_EASY_EDIT);
        biliEditorMaterialAddView2.setAddTitle(getContext().getString(2131842437));
        final g gVar = new g(getContext());
        gVar.f16488a = editorMainTimeAxisZoomView;
        gVar.f16489b = biliEditorTrackCoverEditViewV2;
        f fVar = gVar.f16492e;
        fVar.f16483b = biliEditorTrackCoverEditViewV2;
        fVar.f16484c = biliEditorMaterialPanelTrackView;
        gVar.f(gVar.f16491d, false, null);
        Mx0.a aVar = Mx0.a.f16457j;
        a.C0086a.d(editorMainTimeAxisZoomView);
        a.C0086a.d(biliEditorTrackCoverEditViewV2);
        a.C0086a.d(biliEditorMaterialFoldTrackView);
        a.C0086a.d(biliEditorMaterialFoldTrackView2);
        a.C0086a.d(biliEditorMaterialPanelTrackView);
        a.C0086a.d(biliEditorMaterialPanelTrackView2);
        a.C0086a.d(biliEditorMaterialAddView);
        a.C0086a.d(biliEditorMaterialAddView2);
        a.C0086a.d(biliEditorMaterialFoldTrackView3);
        a.C0086a.d(biliEditorMaterialFoldTrackView4);
        a.C0086a.d(new i(gVar));
        j jVar = new j(gVar);
        Mx0.a aVar2 = Mx0.a.f16457j;
        if (!aVar2.f16463f.contains(jVar)) {
            aVar2.f16463f.add(jVar);
        }
        editorMainTrackPanel.setOnTrackPanelTouchListener(new k(gVar));
        biliEditorTrackCoverEditViewV2.setOnTrackTouchListener(new l(gVar, biliEditorTrackCoverEditViewV2, editorMainTimeAxisZoomView));
        Yx0.a aVar3 = new Yx0.a(gVar, biliEditorMaterialPanelTrackView) { // from class: com.bilibili.studio.editor.moudle.editormain.track.manager.EditorTrackManager$initMultiTrackAdsorbProvider$provider$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f106180a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliEditorMaterialPanelTrackView f106181b;

            {
                this.f106180a = gVar;
                this.f106181b = biliEditorMaterialPanelTrackView;
            }

            @Override // Yx0.a
            public final List<TrackAdsorbBean> a(BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo) {
                ArrayList arrayList = new ArrayList();
                g gVar2 = this.f106180a;
                arrayList.add(g.b(gVar2));
                ArrayList<C5172a> mediaTrackClipList = gVar2.e().getMediaTrackClipList();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = mediaTrackClipList.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList2, g.a(gVar2, (C5172a) it.next()));
                }
                arrayList.addAll(arrayList2);
                SequencesKt.toCollection(SequencesKt.flatMapIterable(SequencesKt.filter(CollectionsKt.asSequence(this.f106181b.getAllMaterial()), new L9.a(biliEditorMaterialMultiInfo, 1)), new EditorTrackManager$initMultiTrackAdsorbProvider$provider$1$provideAdsorbList$3(gVar2)), arrayList);
                return arrayList;
            }
        };
        biliEditorMaterialPanelTrackView.setMoveAdsorbListProvider(aVar3);
        biliEditorMaterialPanelTrackView.setHandlerAdsorbListProvider(aVar3);
        Yx0.a aVar4 = new Yx0.a(gVar, biliEditorMaterialFoldTrackView3) { // from class: com.bilibili.studio.editor.moudle.editormain.track.manager.EditorTrackManager$initEditableFoldTrackAdsorbProvider$provider$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f106178a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliEditorMaterialFoldTrackView f106179b;

            {
                this.f106178a = gVar;
                this.f106179b = biliEditorMaterialFoldTrackView3;
            }

            @Override // Yx0.a
            public final List<TrackAdsorbBean> a(BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo) {
                ArrayList arrayList = new ArrayList();
                g gVar2 = this.f106178a;
                arrayList.add(g.b(gVar2));
                ArrayList<C5172a> mediaTrackClipList = gVar2.e().getMediaTrackClipList();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = mediaTrackClipList.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList2, g.a(gVar2, (C5172a) it.next()));
                }
                arrayList.addAll(arrayList2);
                SequencesKt.toCollection(SequencesKt.flatMapIterable(SequencesKt.filter(CollectionsKt.asSequence(this.f106179b.getAllMaterial()), new h(biliEditorMaterialMultiInfo, 0)), new EditorTrackManager$initEditableFoldTrackAdsorbProvider$provider$1$provideAdsorbList$3(gVar2)), arrayList);
                return arrayList;
            }
        };
        biliEditorMaterialFoldTrackView3.setMoveAdsorbListProvider(aVar4);
        biliEditorMaterialFoldTrackView3.setHandlerAdsorbListProvider(aVar4);
        com.bilibili.studio.editor.moudle.editormain.track.manager.a aVar5 = new com.bilibili.studio.editor.moudle.editormain.track.manager.a(gVar, biliEditorMaterialPanelTrackView);
        biliEditorTrackCoverEditViewV2.setMoveAdsorbListProvider(aVar5);
        biliEditorTrackCoverEditViewV2.setHandlerAdsorbListProvider(aVar5);
        Yx0.a aVar6 = new Yx0.a(gVar, biliEditorMaterialPanelTrackView2) { // from class: com.bilibili.studio.editor.moudle.editormain.track.manager.EditorTrackManager$initMultiTrackAdsorbProvider$provider$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f106180a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliEditorMaterialPanelTrackView f106181b;

            {
                this.f106180a = gVar;
                this.f106181b = biliEditorMaterialPanelTrackView2;
            }

            @Override // Yx0.a
            public final List<TrackAdsorbBean> a(BiliEditorMaterialMultiInfo biliEditorMaterialMultiInfo) {
                ArrayList arrayList = new ArrayList();
                g gVar2 = this.f106180a;
                arrayList.add(g.b(gVar2));
                ArrayList<C5172a> mediaTrackClipList = gVar2.e().getMediaTrackClipList();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = mediaTrackClipList.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList2, g.a(gVar2, (C5172a) it.next()));
                }
                arrayList.addAll(arrayList2);
                SequencesKt.toCollection(SequencesKt.flatMapIterable(SequencesKt.filter(CollectionsKt.asSequence(this.f106181b.getAllMaterial()), new L9.a(biliEditorMaterialMultiInfo, 1)), new EditorTrackManager$initMultiTrackAdsorbProvider$provider$1$provideAdsorbList$3(gVar2)), arrayList);
                return arrayList;
            }
        };
        biliEditorMaterialPanelTrackView2.setMoveAdsorbListProvider(aVar6);
        biliEditorMaterialPanelTrackView2.setHandlerAdsorbListProvider(aVar6);
        this.h = gVar;
        ((xy0.a) obj).a = biliEditorMaterialAddView;
        ((xy0.a) obj).b = biliEditorMaterialAddView2;
        ((xy0.a) obj).c = biliEditorMaterialFoldTrackView;
        ((xy0.a) obj).d = biliEditorMaterialFoldTrackView2;
        ((xy0.a) obj).e = biliEditorMaterialPanelTrackView;
        ((xy0.a) obj).f = biliEditorMaterialPanelTrackView2;
        ((xy0.a) obj).g = biliEditorMaterialFoldTrackView3;
        ((xy0.a) obj).h = biliEditorMaterialFoldTrackView4;
    }

    @Nullable
    public final EditorToolBar getCurToolBar() {
        a.C1192a curToolBarData = this.f107070c.getCurToolBarData();
        return curToolBarData != null ? curToolBarData.f107089a : null;
    }

    public final boolean getMAllowBottomTabClick() {
        return this.f107078l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public final void setEditorTrackListener(@NotNull Nx0.a aVar) {
        g gVar = this.h;
        if (gVar != null) {
            gVar.f16490c = aVar;
        }
    }

    public final void setMAllowBottomTabClick(boolean z6) {
        this.f107078l = z6;
    }

    public final void setVideoControlListener(@NotNull AC0.g gVar) {
        this.f107068a.setOnVideoControlListener(gVar);
    }
}
