package com.bilibili.studio.editor.moudle.danmaku.setting.ui;

import BK.s;
import Bx0.i;
import Bx0.l;
import Bx0.n;
import Bx0.o;
import Di0.C1602f;
import M3.C2592k;
import OC0.h;
import Pb.F;
import UC0.n;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax0.c;
import com.bilibili.adcommon.data.model.AdRelateItem;
import com.bilibili.adcommon.utils.ext.JSONObjectCreator;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.bililive.blps.playerwrapper.adapter.PlayerScreenMode;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuSettingFragment;
import com.bilibili.studio.editor.moudle.danmaku.v1.DanmakuItemList;
import com.bilibili.studio.editor.moudle.danmaku.v1.DanmakuTypeItem;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.videoeditor.bean.EditorMaterialEntity;
import com.bilibili.studio.videoeditor.download.DownloadRequest;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.util.K;
import fz0.InterfaceC7206a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kntr.app.ad.biz.videodetail.pausedpage.ui.AdPausedPageScreenKt;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImageRequest;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.compose.resources.StringResource;
import org.jetbrains.compose.resources.StringResourcesKt;
import tv.danmaku.android.log.BLog;
import v.C8770a;
import vx0.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/setting/ui/BiliEditorDanmakuSettingFragment.class */
public class BiliEditorDanmakuSettingFragment extends BaseFragment implements IPvTracker, InterfaceC7206a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f106091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<? extends DanmakuTypeItem> f106092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public o f106093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public a f106094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Ax0.b f106095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public HashMap<Integer, DanmakuItemList> f106096g;

    @Nullable
    public List<? extends DanmakuTypeItem> h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/setting/ui/BiliEditorDanmakuSettingFragment$a.class */
    public interface a {
        void a(@NotNull DanmakuTypeItem danmakuTypeItem, int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, long j7);

        void b(boolean z6, int i7, @NotNull String str, @Nullable DanmakuTypeItem danmakuTypeItem);
    }

    @Override // fz0.InterfaceC7206a
    public final void La(@NotNull Function1<? super Boolean, Unit> function1) {
        function1.invoke(Boolean.TRUE);
    }

    @Override // fz0.InterfaceC7206a
    @Nullable
    public final EditVideoInfo Q0() {
        return null;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "creation.interact-impeach.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void jf() {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuSettingFragment.jf():void");
    }

    public void kf() {
    }

    public final void lf() {
        HashMap<Integer, DanmakuItemList> map;
        File[] fileArrListFiles;
        File file;
        File[] fileArrListFiles2;
        List<? extends DanmakuTypeItem> list = this.h;
        if (list == null || list.size() == 0 || (map = this.f106096g) == null || map.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = h.f17810a;
        HashMap map2 = new HashMap();
        File file2 = new File(C8770a.a(new StringBuilder(), h.f17813d, "template"));
        if (file2.exists() && (fileArrListFiles = file2.listFiles()) != null) {
            for (int i7 = 0; i7 < fileArrListFiles.length; i7++) {
                if (fileArrListFiles[i7].isDirectory() && (fileArrListFiles2 = (file = fileArrListFiles[i7]).listFiles()) != null) {
                    String strQ = h.q(file.getName());
                    DanmakuTypeItem danmakuTypeItem = new DanmakuTypeItem();
                    for (File file3 : fileArrListFiles2) {
                        String path = file3.getPath();
                        String name = file3.getName();
                        Locale locale = Locale.US;
                        if (name.toLowerCase(locale).endsWith("compoundcaption")) {
                            danmakuTypeItem.setAssetPath(path);
                        } else if (name.toLowerCase(locale).endsWith("lic")) {
                            danmakuTypeItem.setAssetLic(path);
                        } else if (name.toLowerCase(locale).endsWith("template.json")) {
                            danmakuTypeItem.setAssetPath(file3.getParent());
                            danmakuTypeItem.setAssetLic(file3.getParent());
                        }
                    }
                    if (danmakuTypeItem.getAssetPath() != null && !danmakuTypeItem.getAssetPath().isEmpty() && danmakuTypeItem.getAssetLic() != null && !danmakuTypeItem.getAssetLic().isEmpty()) {
                        map2.put(strQ, danmakuTypeItem);
                    }
                }
            }
        }
        List<? extends DanmakuTypeItem> list2 = this.h;
        if (list2 != null) {
            int i8 = 0;
            for (Object obj : list2) {
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                DanmakuTypeItem danmakuTypeItem2 = (DanmakuTypeItem) obj;
                String strQ2 = h.q(h.o(danmakuTypeItem2.downloadUrl));
                if (map2.containsKey(strQ2)) {
                    danmakuTypeItem2.setDownloaded(true);
                    danmakuTypeItem2.assetLic = ((DanmakuTypeItem) map2.get(strQ2)).assetLic;
                    danmakuTypeItem2.assetPath = ((DanmakuTypeItem) map2.get(strQ2)).assetPath;
                } else {
                    danmakuTypeItem2.setDownloaded(false);
                }
                HashMap<Integer, DanmakuItemList> map3 = this.f106096g;
                DanmakuItemList danmakuItemList = map3 != null ? map3.get(Integer.valueOf(danmakuTypeItem2.type)) : null;
                if (!(danmakuItemList != null ? Intrinsics.areEqual(danmakuItemList.show, Boolean.FALSE) : false)) {
                    danmakuTypeItem2.danmakuItemList = danmakuItemList;
                    arrayList.add(danmakuTypeItem2);
                }
                i8++;
            }
        }
        this.f106092c = arrayList;
        o oVar = this.f106093d;
        if (oVar != null) {
            oVar.f54261a = arrayList;
            oVar.notifyDataSetChanged();
        }
    }

    public void mf() {
        Ax0.b bVar = this.f106095f;
        if (bVar != null) {
            if ((bVar.f608c == null && bVar.f607b == null) ? false : true) {
                View view = this.f106091b;
                View view2 = view;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mConfirmView");
                    view2 = null;
                }
                view2.setAlpha(1.0f);
                View view3 = this.f106091b;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mConfirmView");
                    view3 = null;
                }
                view3.setEnabled(true);
                return;
            }
        }
        View view4 = this.f106091b;
        View view5 = view4;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConfirmView");
            view5 = null;
        }
        view5.setAlpha(0.6f);
        View view6 = this.f106091b;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConfirmView");
            view6 = null;
        }
        view6.setEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494056, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Ax0.b bVar = this.f106095f;
        if (bVar != null) {
            bVar.f607b = null;
            bVar.f608c = null;
        }
        this.f106095f = null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Bx0.o, androidx.recyclerview.widget.RecyclerView$Adapter, ax0.c] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f106095f = new Ax0.b();
        final ?? cVar = new c();
        cVar.setHasStableIds(true);
        cVar.f54261a = this.f106092c;
        cVar.f54262b = 2131495065;
        final int i7 = 0;
        cVar.f54263c = new Function3(i7) { // from class: Bx0.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1028a;

            {
                this.f1028a = i7;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (this.f1028a) {
                    case 0:
                        View view2 = (View) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        DanmakuTypeItem danmakuTypeItem = (DanmakuTypeItem) obj3;
                        BiliImageView biliImageViewFindViewById = view2.findViewById(2131299881);
                        ImageView imageView = (ImageView) view2.findViewById(2131299880);
                        ProgressBar progressBar = (ProgressBar) view2.findViewById(2131300295);
                        if (biliImageViewFindViewById.getTag() == null || !biliImageViewFindViewById.getTag().equals(danmakuTypeItem.cover)) {
                            K.e(biliImageViewFindViewById, danmakuTypeItem.cover);
                            biliImageViewFindViewById.setTag(danmakuTypeItem.cover);
                        }
                        if (danmakuTypeItem.isDownloaded()) {
                            imageView.setVisibility(8);
                        } else {
                            imageView.setVisibility(0);
                        }
                        if (danmakuTypeItem.isDownloading()) {
                            progressBar.setVisibility(0);
                            imageView.setVisibility(8);
                        } else {
                            progressBar.setVisibility(8);
                        }
                        ((TextView) view2.findViewById(2131315440)).setText(danmakuTypeItem.name);
                        view2.setSelected(danmakuTypeItem.isSelected());
                        Xz0.d dVar = Xz0.d.f28458a;
                        int i8 = danmakuTypeItem.type;
                        String str = danmakuTypeItem.name;
                        dVar.getClass();
                        Map mapE = Xz0.d.e();
                        HashMap map = (HashMap) mapE;
                        map.put("type_id", String.valueOf(i8));
                        P4.a.a(iIntValue, "type_name", str, "type_location", map);
                        Neurons.reportExposure$default(false, "creation.interact-impeach.barrage-type.0.show", mapE, (List) null, 8, (Object) null);
                        break;
                    default:
                        Composer composer = (Composer) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        if (composer.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1892238796, iIntValue2, -1, "kntr.app.tribee.steam.page.ComposableSingletons$TribeeSteamListKt.lambda$-1892238796.<anonymous> (TribeeSteamList.kt:524)");
                            }
                            Modifier.Companion companion = Modifier.Companion;
                            Modifier modifierM1344paddingVpY3zN4$default = PaddingKt.m1344paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3880constructorimpl(16), 0.0f, 2, null);
                            MeasurePolicy measurePolicyA = F.a(6, Arrangement.INSTANCE, Alignment.Companion.getCenterHorizontally(), composer, 54);
                            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1344paddingVpY3zN4$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM2296constructorimpl = Updater.m2296constructorimpl(composer);
                            O4.d.c(companion2, composerM2296constructorimpl, measurePolicyA, composerM2296constructorimpl, currentCompositionLocalMap);
                            Updater.m2304setimpl(composerM2296constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) C1602f.b(companion2, composerM2296constructorimpl, Integer.valueOf(iHashCode), composerM2296constructorimpl));
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer.startReplaceGroup(430169998);
                            ImageRequest imageRequest = new ImageRequest(kntr.common.compose.res.d.a());
                            ColorFilter.Companion companion3 = ColorFilter.Companion;
                            BiliTheme biliTheme = BiliTheme.INSTANCE;
                            int i9 = BiliTheme.$stable;
                            BiliImageKt.BiliImage(com.bilibili.pegasus.components.recover.h.a(imageRequest, ColorFilter.Companion.m2671tintxETnrds$default(companion3, biliTheme.getColors(composer, i9).getBrand_pink-0d7_KjU(), 0, 2, null), composer), SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(companion, 0.0f, Dp.m3880constructorimpl(80), 0.0f, 0.0f, 13, null), Dp.m3880constructorimpl(24)), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composer, 48, 1020);
                            TextKt.m2186TextNvy7gAk(StringResourcesKt.stringResource((StringResource) Z3.a.f29501u.getValue(), composer, 0), null, biliTheme.getColors(composer, i9).getText3-0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, biliTheme.getTextStyle(composer, i9).getT14(), composer, 0, 0, 131066);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        cVar.f54264d = new Function2(cVar, this) { // from class: Bx0.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o f1029a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliEditorDanmakuSettingFragment f1030b;

            {
                this.f1029a = cVar;
                this.f1030b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                DanmakuTypeItem danmakuTypeItem = (DanmakuTypeItem) obj2;
                Iterable<DanmakuTypeItem> iterable = this.f1029a.f54261a;
                BiliEditorDanmakuSettingFragment biliEditorDanmakuSettingFragment = this.f1030b;
                if (iterable != null) {
                    int i8 = 0;
                    for (DanmakuTypeItem danmakuTypeItem2 : iterable) {
                        danmakuTypeItem2.setSelected(Intrinsics.areEqual(danmakuTypeItem2, danmakuTypeItem));
                        if (danmakuTypeItem2.isSelected()) {
                            biliEditorDanmakuSettingFragment.getClass();
                            Xz0.d dVar = Xz0.d.f28458a;
                            String str = danmakuTypeItem2.name;
                            String str2 = danmakuTypeItem2.id;
                            dVar.getClass();
                            Map mapE = Xz0.d.e();
                            HashMap map = (HashMap) mapE;
                            map.put("book_type", str);
                            P4.a.a(i8, "book_id", str2, "book_location", map);
                            Neurons.reportClick(false, "creation.interact-impeach.barrage-type.button.click", mapE);
                            Ax0.b bVar = biliEditorDanmakuSettingFragment.f106095f;
                            if (bVar != null) {
                                bVar.f608c = null;
                            }
                            if (bVar != null) {
                                p pVar = new p(biliEditorDanmakuSettingFragment, danmakuTypeItem2);
                                Tz0.d dVar2 = bVar.f606a;
                                dVar2.getClass();
                                if (!danmakuTypeItem2.isDownloading()) {
                                    if (danmakuTypeItem2.isDownloaded()) {
                                        danmakuTypeItem2.setDownloaded(true);
                                        danmakuTypeItem2.setDownloading(false);
                                        Ax0.b bVar2 = biliEditorDanmakuSettingFragment.f106095f;
                                        if (bVar2 != null) {
                                            bVar2.f608c = danmakuTypeItem2;
                                        }
                                        o oVar = biliEditorDanmakuSettingFragment.f106093d;
                                        if (oVar != null) {
                                            oVar.notifyDataSetChanged();
                                        }
                                        biliEditorDanmakuSettingFragment.mf();
                                        biliEditorDanmakuSettingFragment.jf();
                                    } else {
                                        danmakuTypeItem2.setDownloading(true);
                                        String str3 = danmakuTypeItem2.downloadUrl;
                                        Tz0.e eVar = new Tz0.e(dVar2, danmakuTypeItem2, pVar);
                                        String str4 = Tz0.d.f24405a;
                                        File file = new File(str4);
                                        if (!file.exists()) {
                                            file.mkdirs();
                                        }
                                        String strO = OC0.h.o(str3);
                                        DownloadRequest.a aVar = new DownloadRequest.a();
                                        aVar.f109436c = str4;
                                        aVar.f109437d = strO;
                                        aVar.f109435b = str3;
                                        DownloadRequest downloadRequestA = aVar.a();
                                        UB0.b.a(downloadRequestA, eVar);
                                        UB0.b.f(downloadRequestA.taskId);
                                    }
                                }
                            }
                        }
                        i8++;
                    }
                }
                o oVar2 = biliEditorDanmakuSettingFragment.f106093d;
                if (oVar2 != null) {
                    oVar2.notifyDataSetChanged();
                }
                return Unit.INSTANCE;
            }
        };
        this.f106093d = cVar;
        ((TextView) view.findViewById(2131309694)).setText(2131842046);
        view.findViewById(2131302459).setOnClickListener(new Bx0.h(this, 0));
        View viewFindViewById = view.findViewById(2131302460);
        this.f106091b = viewFindViewById;
        View view2 = viewFindViewById;
        if (viewFindViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConfirmView");
            view2 = null;
        }
        view2.setOnClickListener(new i(this, 0));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310630);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 5, 1, false));
        recyclerView.setAdapter(this.f106093d);
        mf();
        d dVarB = d.b();
        n nVar = new n(this);
        HashMap map = dVarB.b;
        if (map == null || map.size() == 0) {
            dVarB.a(nVar);
        } else {
            nVar.a(dVarB.b);
        }
        Lazy<UC0.n> lazy = UC0.n.f24629b;
        final int i8 = 0;
        n.a.a().d(new C2592k(2), new l(0), new Function1(this, i8) { // from class: Bx0.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1032a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f1033b;

            {
                this.f1032a = i8;
                this.f1033b = this;
            }

            public final Object invoke(Object obj) {
                MH.h hVar;
                MH.a aVarL;
                Unit unit;
                boolean z6 = false;
                Object obj2 = this.f1033b;
                switch (this.f1032a) {
                    case 0:
                        List<DanmakuTypeItem> list = ((EditorMaterialEntity) obj).danmakuTypeList;
                        if (list != null) {
                            BiliEditorDanmakuSettingFragment biliEditorDanmakuSettingFragment = (BiliEditorDanmakuSettingFragment) obj2;
                            biliEditorDanmakuSettingFragment.h = list;
                            biliEditorDanmakuSettingFragment.lf();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        if (((s) obj).a.a == 36 && (aVarL = (hVar = (MH.h) obj2).L()) != null) {
                            if (((com.bilibili.bililive.room.ui.roomv3.base.viewmodel.f) hVar).f.getValue() == PlayerScreenMode.VERTICAL_FULLSCREEN) {
                                z6 = true;
                            }
                            aVarL.handleBottomIconClick(z6);
                        }
                        return Unit.INSTANCE;
                    case 2:
                        float f7 = AdPausedPageScreenKt.a;
                        ((MutableIntState) obj2).setIntValue((int) (((IntSize) obj).m3976unboximpl() & 4294967295L));
                        return Unit.INSTANCE;
                    case 3:
                        JE.c cVar2 = (JE.c) obj;
                        boolean z7 = cVar2.b;
                        vL.b bVar = (vL.b) obj2;
                        if (z7) {
                            LiveLog.Companion companion = LiveLog.Companion;
                            String logTag = bVar.getLogTag();
                            if (companion.matchLevel(3)) {
                                String str = "isFromP2ApiData return" == 0 ? "" : "isFromP2ApiData return";
                                LiveLogDelegate logDelegate = companion.getLogDelegate();
                                if (logDelegate != null) {
                                    LiveLogDelegate.onLog$default(logDelegate, 3, logTag, str, (Throwable) null, 8, (Object) null);
                                }
                                BLog.i(logTag, str);
                            }
                            unit = Unit.INSTANCE;
                        } else {
                            bVar.l.setValue(Boolean.valueOf(cVar2.a));
                            unit = Unit.INSTANCE;
                        }
                        return unit;
                    default:
                        JSONObjectCreator jSONObjectCreator = (JSONObjectCreator) obj;
                        jSONObjectCreator.to("nature_ad", "0");
                        zc.d dVar = (zc.d) obj2;
                        AdRelateItem adRelateItemR = dVar.R();
                        jSONObjectCreator.to(GameCardButton.extraAvid, adRelateItemR != null ? Long.valueOf(adRelateItemR.getAvId()) : null);
                        AdRelateItem adRelateItemR2 = dVar.R();
                        Long lValueOf = null;
                        if (adRelateItemR2 != null) {
                            lValueOf = Long.valueOf(adRelateItemR2.getUpperMid());
                        }
                        jSONObjectCreator.to("upmid", lValueOf);
                        jSONObjectCreator.to("cm_reason_id", 0);
                        jSONObjectCreator.to("event_from", "video_relate");
                        return Unit.INSTANCE;
                }
            }
        });
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.DANMAKU;
    }
}
