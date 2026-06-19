package com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker;

import Mx0.a;
import Nz0.r;
import TB0.I;
import TB0.X;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.base.MainThread;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.editor.moudle.sticker.v1.EditFxSticker;
import com.bilibili.studio.editor.moudle.sticker.v1.EditStickerItem;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoUtils;
import com.bilibili.studio.videoeditor.util.V;
import com.google.android.material.tabs.TabLayout;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/sticker/BiliEditorStickerListFragment.class */
@AndroidEntryPoint
public final class BiliEditorStickerListFragment extends Hilt_BiliEditorStickerListFragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public X f106952g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f106953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public r.a f106954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final HashSet<String> f106955k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/sticker/BiliEditorStickerListFragment$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f106956a;

        public a(Function1 function1) {
            this.f106956a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f106956a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f106956a.invoke(obj);
        }
    }

    public BiliEditorStickerListFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.BiliEditorStickerListFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m10064invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.BiliEditorStickerListFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10065invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.vm.a.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.BiliEditorStickerListFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10066invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.BiliEditorStickerListFragment$special$$inlined$viewModels$default$4
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m10067invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
                    r3 = r0
                    r0 = r3
                    if (r0 == 0) goto L19
                    r0 = r3
                    java.lang.Object r0 = r0.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L44
                L19:
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L30
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L32
                L30:
                    r0 = 0
                    r3 = r0
                L32:
                    r0 = r3
                    if (r0 == 0) goto L40
                    r0 = r3
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                    goto L44
                L40:
                    androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                    r3 = r0
                L44:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.BiliEditorStickerListFragment$special$$inlined$viewModels$default$4.m10067invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.BiliEditorStickerListFragment$special$$inlined$viewModels$default$5
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m10068invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L17
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L19
                L17:
                    r0 = 0
                    r3 = r0
                L19:
                    r0 = r3
                    if (r0 == 0) goto L2a
                    r0 = r3
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L32
                L2a:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_viewModels
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r3 = r0
                L32:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.BiliEditorStickerListFragment$special$$inlined$viewModels$default$5.m10068invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f106955k = new HashSet<>();
    }

    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, fz0.InterfaceC7206a
    public final void La(@NotNull Function1<? super Boolean, Unit> function1) {
        com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.vm.a aVarKf = kf();
        if (aVarKf.f106983i == 0) {
            Yy0.g gVar = aVarKf.f106978c;
            P50.g gVar2 = aVarKf.f106980e;
            gVar.f29354d.getClass();
            BiliEditorStickerInfo biliEditorStickerInfoN = Yy0.b.n(gVar2);
            if (biliEditorStickerInfoN != null) {
                gVar.f29354d.i(gVar.f29352b.f4806b, biliEditorStickerInfoN);
            }
            P50.g gVar3 = aVarKf.f106980e;
            Object objA = gVar3 != null ? com.bilibili.studio.videoeditor.extension.h.a(gVar3, "key_sticker_object") : null;
            BiliEditorStickerInfo biliEditorStickerInfo = objA instanceof BiliEditorStickerInfo ? (BiliEditorStickerInfo) objA : null;
            BiliEditorStickerInfo biliEditorStickerInfoMo9886clone = biliEditorStickerInfo != null ? biliEditorStickerInfo.mo9886clone() : null;
            aVarKf.f106981f = biliEditorStickerInfoMo9886clone;
            if (biliEditorStickerInfoMo9886clone != null) {
                biliEditorStickerInfoMo9886clone.setIFx(null);
            }
        }
        function1.invoke(Boolean.TRUE);
    }

    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, fz0.InterfaceC7206a
    @Nullable
    public final EditVideoInfo Q0() {
        com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.vm.a aVarKf = kf();
        EditVideoInfo editVideoInfoM10450clone = null;
        if (aVarKf.f106983i == 0) {
            Yy0.g gVar = aVarKf.f106978c;
            P50.g gVar2 = aVarKf.f106980e;
            gVar.f29354d.getClass();
            BiliEditorStickerInfo biliEditorStickerInfoN = Yy0.b.n(gVar2);
            if (biliEditorStickerInfoN == null) {
                editVideoInfoM10450clone = null;
            } else {
                EditVideoInfo editVideoInfo = gVar.f29352b.f4806b;
                editVideoInfoM10450clone = null;
                if (editVideoInfo != null) {
                    editVideoInfoM10450clone = editVideoInfo.m10450clone();
                    if (editVideoInfoM10450clone == null) {
                        editVideoInfoM10450clone = null;
                    } else {
                        gVar.f29354d.i(editVideoInfoM10450clone, biliEditorStickerInfoN);
                    }
                }
            }
        }
        return editVideoInfoM10450clone;
    }

    public final com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.vm.a kf() {
        return (com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.vm.a) this.h.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void lf() {
        /*
            r7 = this;
            r0 = r7
            Nz0.r r0 = r0.f106953i
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L12
            java.lang.String r0 = "mStickerPagerAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r8 = r0
        L12:
            r0 = r8
            java.util.HashSet<java.lang.String> r0 = r0.f17607k
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 62
            java.lang.String r0 = kotlin.collections.CollectionsKt.p(r0, r1, r2, r3, r4, r5)
            r9 = r0
            r0 = r7
            java.util.HashSet<java.lang.String> r0 = r0.f106955k
            r8 = r0
            r0 = r8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L30
            goto L32
        L30:
            r0 = 0
            r8 = r0
        L32:
            r0 = r8
            if (r0 == 0) goto L48
            r0 = r8
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 62
            java.lang.String r0 = kotlin.collections.CollectionsKt.p(r0, r1, r2, r3, r4, r5)
            r10 = r0
            r0 = r10
            r8 = r0
            r0 = r10
            if (r0 != 0) goto L4b
        L48:
            java.lang.String r0 = ""
            r8 = r0
        L4b:
            java.lang.String r0 = "sdk_type"
            java.lang.String r1 = "Mon"
            Xz0.j.c(r0, r1)
            java.lang.String r0 = "router_topic_id"
            java.lang.String r1 = Xz0.g.f28463b
            Xz0.j.c(r0, r1)
            java.lang.String[] r0 = Xz0.k.f28475b
            java.util.Map r0 = Xz0.j.b(r0)
            r10 = r0
            r0 = r10
            java.util.HashMap r0 = (java.util.HashMap) r0
            r11 = r0
            r0 = r11
            java.lang.String r1 = "sticker_class"
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L79
            java.lang.String r0 = ""
            r8 = r0
        L79:
            r0 = r11
            java.lang.String r1 = "sticker_id"
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = 0
            java.lang.String r1 = "creation.new-video-editor.sticker-panel.list-tab.show"
            r2 = r10
            r3 = 0
            r4 = 8
            r5 = 0
            com.bilibili.lib.neuron.api.Neurons.reportExposure$default(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.BiliEditorStickerListFragment.lf():void");
    }

    public final void mf(boolean z6) {
        TabLayout tabLayout;
        TabLayout.TabView tabView;
        X x6 = this.f106952g;
        if (x6 == null || (tabLayout = x6.f23704c) == null || this.f106953i == null) {
            return;
        }
        if (z6) {
            this.f106955k.clear();
        }
        int scrollX = tabLayout.getScrollX();
        r rVar = this.f106953i;
        r rVar2 = rVar;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStickerPagerAdapter");
            rVar2 = null;
        }
        int size = rVar2.f17598a.size();
        tabLayout.measure(0, 0);
        int width = tabLayout.getWidth();
        for (int i7 = 0; i7 < size; i7++) {
            TabLayout.Tab tabAt = tabLayout.getTabAt(i7);
            if (tabAt != null && (tabView = tabAt.view) != null && tabView.getLeft() < scrollX + width && tabView.getRight() > scrollX) {
                r rVar3 = this.f106953i;
                r rVar4 = rVar3;
                if (rVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStickerPagerAdapter");
                    rVar4 = null;
                }
                CharSequence pageTitle = rVar4.getPageTitle(i7);
                if (pageTitle != null) {
                    this.f106955k.add(pageTitle.toString());
                }
            }
        }
    }

    public final void nf(@NotNull r.a aVar, @Nullable EditStickerItem editStickerItem) {
        EditFxSticker editFxSticker;
        r rVar = this.f106953i;
        r rVar2 = rVar;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStickerPagerAdapter");
            rVar2 = null;
        }
        rVar2.f17604g = editStickerItem;
        r rVar3 = this.f106953i;
        r rVar4 = rVar3;
        if (rVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStickerPagerAdapter");
            rVar4 = null;
        }
        rVar4.b();
        r rVar5 = this.f106953i;
        r rVar6 = rVar5;
        if (rVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStickerPagerAdapter");
            rVar6 = null;
        }
        r rVar7 = this.f106953i;
        r rVar8 = rVar7;
        if (rVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStickerPagerAdapter");
            rVar8 = null;
        }
        int size = rVar8.f17605i.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (Intrinsics.areEqual(rVar8.f17605i.get(i7), aVar)) {
                break;
            } else {
                i7++;
            }
        }
        rVar6.h = i7;
        if (editStickerItem == null || (editFxSticker = editStickerItem.getEditFxSticker()) == null) {
            return;
        }
        r rVar9 = this.f106953i;
        r rVar10 = rVar9;
        if (rVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStickerPagerAdapter");
            rVar10 = null;
        }
        int i8 = rVar10.h;
        String strValueOf = null;
        if (i8 >= 0) {
            strValueOf = null;
            if (i8 < rVar10.f17598a.size()) {
                strValueOf = String.valueOf(rVar10.getPageTitle(rVar10.h));
            }
        }
        String strValueOf2 = String.valueOf(editFxSticker.getId());
        Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        Xz0.j.c("router_topic_id", Xz0.g.f28463b);
        Map mapB = Xz0.j.b(Xz0.k.f28475b);
        String str = strValueOf;
        if (strValueOf == null) {
            str = "";
        }
        HashMap map = (HashMap) mapB;
        map.put("sticker_class", str);
        String str2 = strValueOf2;
        if (strValueOf2 == null) {
            str2 = "";
        }
        map.put(EditCustomizeSticker.TAG_ID, str2);
        Neurons.reportClick(false, "creation.video-editor.sticker-panel.sticker.click", mapB);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r8, int r9, @org.jetbrains.annotations.Nullable android.content.Intent r10) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.BiliEditorStickerListFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        X xInflate = X.inflate(layoutInflater, viewGroup, false);
        this.f106952g = xInflate;
        if (xInflate != null) {
            I i7 = xInflate.f23703b;
            i7.f23525d.setText(2131841983);
            i7.f23523b.setVisibility(8);
            i7.f23523b.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorStickerListFragment f106967a;

                {
                    this.f106967a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i8;
                    UC0.g gVarO;
                    BiliEditorStickerListFragment biliEditorStickerListFragment = this.f106967a;
                    if (V.f()) {
                        return;
                    }
                    biliEditorStickerListFragment.lf();
                    com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.vm.a aVarKf = biliEditorStickerListFragment.kf();
                    aVarKf.getClass();
                    Xz0.d.f28458a.getClass();
                    Xz0.d.r("贴纸", null);
                    int i9 = aVarKf.f106983i;
                    boolean z6 = false;
                    if (i9 == 0) {
                        Yy0.g gVar = aVarKf.f106978c;
                        P50.g gVar2 = aVarKf.f106980e;
                        BiliEditorStickerInfo biliEditorStickerInfo = aVarKf.f106981f;
                        if (biliEditorStickerInfo == null) {
                            biliEditorStickerInfo = null;
                        } else {
                            aVarKf.f106981f = null;
                        }
                        gVar.f29351a.j();
                        Object objA = gVar2 != null ? com.bilibili.studio.videoeditor.extension.h.a(gVar2, "key_sticker_object") : null;
                        BiliEditorStickerInfo biliEditorStickerInfo2 = objA instanceof BiliEditorStickerInfo ? (BiliEditorStickerInfo) objA : null;
                        if (biliEditorStickerInfo2 != null && (gVarO = gVar.f29354d.o()) != null) {
                            gVarO.k(biliEditorStickerInfo2);
                        }
                        if (biliEditorStickerInfo != null) {
                            UC0.g gVarO2 = gVar.f29354d.o();
                            P50.f fVarL = gVarO2 == null ? null : gVarO2.l(biliEditorStickerInfo);
                            if (fVarL != null) {
                                com.bilibili.studio.videoeditor.extension.h.c(fVarL, "key_sticker_object", biliEditorStickerInfo);
                            }
                            EditVideoInfo editVideoInfo = gVar.f29352b.f4806b;
                            ArrayList<BiliEditorStickerInfo> biliEditorStickerInfoList = editVideoInfo != null ? editVideoInfo.getBiliEditorStickerInfoList() : null;
                            if (biliEditorStickerInfoList != null) {
                                Iterator<BiliEditorStickerInfo> it = biliEditorStickerInfoList.iterator();
                                i8 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i8 = -1;
                                        break;
                                    } else if (Intrinsics.areEqual(it.next().getStickerUUID(), biliEditorStickerInfo.getStickerUUID())) {
                                        break;
                                    } else {
                                        i8++;
                                    }
                                }
                            } else {
                                i8 = -10086;
                            }
                            if (i8 < 0) {
                                EditVideoInfoUtils.throwDebugException("点击下一步时储存的贴纸未找到, index=" + i8 + "，不符合预期！");
                            } else if (biliEditorStickerInfoList != null) {
                                biliEditorStickerInfoList.set(i8, biliEditorStickerInfo);
                            }
                            EditFxSticker editFxSticker = biliEditorStickerInfo.getEditFxSticker();
                            com.bilibili.app.authorspace.ui.pages.V.a(i8, "替换点击下一步时储存的贴纸, ", ", ", editFxSticker != null ? editFxSticker.getName() : null, "StickerModuleRepository");
                        }
                        gVar.n(biliEditorStickerInfo != null ? biliEditorStickerInfo.getIFx() : null, "点击取消按钮");
                        gVar.l();
                        aVarKf.f106980e = null;
                    } else if (i9 == 2 || i9 == 1) {
                        Yy0.g gVar3 = aVarKf.f106978c;
                        P50.g gVar4 = aVarKf.f106980e;
                        BiliEditorStickerInfo biliEditorStickerInfo3 = aVarKf.f106985k;
                        if (i9 == 1) {
                            z6 = true;
                        }
                        gVar3.f29351a.j();
                        Object objA2 = gVar4 != null ? com.bilibili.studio.videoeditor.extension.h.a(gVar4, "key_sticker_object") : null;
                        BiliEditorStickerInfo biliEditorStickerInfo4 = objA2 instanceof BiliEditorStickerInfo ? (BiliEditorStickerInfo) objA2 : null;
                        Yy0.b bVar = gVar3.f29354d;
                        if (biliEditorStickerInfo4 != null) {
                            UC0.g gVarO3 = bVar.o();
                            if (gVarO3 != null) {
                                gVarO3.k(biliEditorStickerInfo4);
                            }
                            bVar.v(biliEditorStickerInfo4);
                        }
                        if (biliEditorStickerInfo3 != null) {
                            UC0.g gVarO4 = bVar.o();
                            if (gVarO4 != null) {
                                gVarO4.l(biliEditorStickerInfo3);
                            }
                            bVar.j(biliEditorStickerInfo3);
                        }
                        bVar.w();
                        gVar3.m();
                        gVar3.h = null;
                        gVar3.f29353c.s(new Runnable(gVar3, z6) { // from class: Yy0.e

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final g f29343a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final boolean f29344b;

                            {
                                this.f29343a = gVar3;
                                this.f29344b = z6;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                g gVar5 = this.f29343a;
                                gVar5.f29356f.i(false, true, this.f29344b);
                            }
                        });
                        aVarKf.f106980e = null;
                    }
                    aVarKf.f106986l = true;
                }
            });
            i7.f23524c.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorStickerListFragment f106968a;

                {
                    this.f106968a = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.lang.Runnable] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EditFxSticker editFxSticker;
                    BiliEditorStickerInfo biliEditorStickerInfo;
                    Object next;
                    BiliEditorStickerListFragment biliEditorStickerListFragment = this.f106968a;
                    if (V.f()) {
                        return;
                    }
                    biliEditorStickerListFragment.lf();
                    com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.vm.a aVarKf = biliEditorStickerListFragment.kf();
                    r rVar = biliEditorStickerListFragment.f106953i;
                    r rVar2 = rVar;
                    if (rVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mStickerPagerAdapter");
                        rVar2 = null;
                    }
                    int i8 = rVar2.h;
                    String strValueOf = (i8 < 0 || i8 >= rVar2.f17598a.size()) ? null : String.valueOf(rVar2.getPageTitle(rVar2.h));
                    r rVar3 = biliEditorStickerListFragment.f106953i;
                    r rVar4 = rVar3;
                    if (rVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mStickerPagerAdapter");
                        rVar4 = null;
                    }
                    EditStickerItem editStickerItem = rVar4.f17604g;
                    Integer numValueOf = editStickerItem != null ? Integer.valueOf(editStickerItem.getStickerType()) : null;
                    boolean z6 = false;
                    int id = (numValueOf != null && numValueOf.intValue() == 2) ? -1 : (((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 5)) && (editFxSticker = editStickerItem.getEditFxSticker()) != null) ? editFxSticker.getId() : 0;
                    aVarKf.getClass();
                    Xz0.d.f28458a.getClass();
                    Map mapE = Xz0.d.e();
                    String str = strValueOf;
                    if (strValueOf == null) {
                        str = "null";
                    }
                    HashMap map = (HashMap) mapE;
                    map.put("sticker_class", str);
                    if (id != 0) {
                        map.put(EditCustomizeSticker.TAG_ID, String.valueOf(id));
                    }
                    Neurons.reportClick(false, "creation.video-editor.sticker-panel.choose-confirm.click", mapE);
                    int i9 = aVarKf.f106983i;
                    if (i9 == 0) {
                        Yy0.g gVar = aVarKf.f106978c;
                        P50.g gVar2 = aVarKf.f106980e;
                        BiliEditorStickerInfo biliEditorStickerInfo2 = aVarKf.f106981f;
                        if (biliEditorStickerInfo2 == null) {
                            biliEditorStickerInfo2 = null;
                        } else {
                            aVarKf.f106981f = null;
                        }
                        gVar.f29351a.j();
                        gVar.f29354d.w();
                        if (gVar2 != null) {
                            Mx0.a aVar = Mx0.a.f16457j;
                            gVar.f29354d.f29329d.w(a.C0086a.e(UC0.h.a(gVar2)), Long.valueOf(UC0.h.a(gVar2) + 33000));
                        }
                        if (biliEditorStickerInfo2 != null) {
                            EditVideoInfo editVideoInfo = gVar.f29352b.f4806b;
                            ArrayList<BiliEditorStickerInfo> biliEditorStickerInfoList = editVideoInfo != null ? editVideoInfo.getBiliEditorStickerInfoList() : null;
                            if (biliEditorStickerInfoList != null) {
                                Iterator<T> it = biliEditorStickerInfoList.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    } else {
                                        next = it.next();
                                        if (Intrinsics.areEqual(((BiliEditorStickerInfo) next).getStickerUUID(), biliEditorStickerInfo2.getStickerUUID())) {
                                            break;
                                        }
                                    }
                                }
                                biliEditorStickerInfo = (BiliEditorStickerInfo) next;
                            } else {
                                biliEditorStickerInfo = null;
                            }
                            if (biliEditorStickerInfo != null) {
                                biliEditorStickerInfoList.remove(biliEditorStickerInfo);
                            }
                            EditFxSticker editFxSticker2 = biliEditorStickerInfo2.getEditFxSticker();
                            BLog.i("StickerModuleRepository", "移除点击下一步时储存的贴纸, " + biliEditorStickerInfo + ", " + (editFxSticker2 != null ? editFxSticker2.getName() : null));
                        }
                        gVar.f29354d.getClass();
                        BiliEditorStickerInfo biliEditorStickerInfoN = Yy0.b.n(gVar2);
                        if (biliEditorStickerInfoN == null) {
                            gVar.l();
                        } else {
                            gVar.f29354d.j(biliEditorStickerInfoN);
                            com.bilibili.studio.editor.timeline.i iVar = gVar.f29351a.f4833c;
                            if (iVar != null) {
                                iVar.a(gVar.f29352b.f4806b, BackUpTag.STICKER_ADD);
                            }
                            gVar.f29354d.f29332g.i(biliEditorStickerInfoN, "StickerModuleRepository.handleDoneEvent", true, null);
                            gVar.h = null;
                            gVar.f29353c.s(new Object());
                            gVar.m();
                        }
                        aVarKf.f106980e = null;
                    } else if (i9 == 2 || i9 == 1) {
                        Yy0.g gVar3 = aVarKf.f106978c;
                        P50.g gVar4 = aVarKf.f106980e;
                        if (i9 == 1) {
                            z6 = true;
                        }
                        gVar3.f29351a.j();
                        gVar3.f29354d.w();
                        gVar3.f29354d.f29329d.y();
                        gVar3.f29354d.getClass();
                        BiliEditorStickerInfo biliEditorStickerInfoN2 = Yy0.b.n(gVar4);
                        if (biliEditorStickerInfoN2 == null) {
                            gVar3.l();
                        } else {
                            gVar3.f29354d.j(biliEditorStickerInfoN2);
                            com.bilibili.studio.editor.timeline.i iVar2 = gVar3.f29351a.f4833c;
                            if (iVar2 != null) {
                                iVar2.a(gVar3.f29352b.f4806b, BackUpTag.STICKER_CHANGE);
                            }
                            gVar3.f29354d.f29332g.i(biliEditorStickerInfoN2, "StickerModuleRepository.handleBatchDoneEvent", true, null);
                            gVar3.h = null;
                            gVar3.f29353c.s(new Runnable(gVar3, z6) { // from class: Yy0.d

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final g f29341a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final boolean f29342b;

                                {
                                    this.f29341a = gVar3;
                                    this.f29342b = z6;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    g gVar5 = this.f29341a;
                                    gVar5.f29356f.i(false, true, this.f29342b);
                                }
                            });
                        }
                        aVarKf.f106980e = null;
                    }
                    aVarKf.f106986l = true;
                }
            });
        }
        X x6 = this.f106952g;
        return x6 != null ? x6.f23702a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MainThread.postOnMainThread(new Is.e(this, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026d  */
    /* JADX WARN: Type inference failed for: r0v374, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r10, @org.jetbrains.annotations.Nullable android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 1606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.sticker.BiliEditorStickerListFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.STICKER;
    }
}
