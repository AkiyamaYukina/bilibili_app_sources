package com.bilibili.studio.editor.moudle.musicv3.ui;

import TB0.A0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicTabItem;
import com.bilibili.studio.editor.moudle.musicv3.net.bean.EditorFavItemBean;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListContentFragment;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicTabListFragment.class */
public final class BiliEditorMusicTabListFragment extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public A0 f107994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Gz0.d f107995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public EditorMusicTabItem f107996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f107997e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f107998f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public EditorFavItemBean.CursorBean f107999g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f108000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public EditorMusicTabItem f108001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final HashSet<Integer> f108002k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicTabListFragment$a.class */
    public static final class a {
        @JvmStatic
        @NotNull
        public static BiliEditorMusicTabListFragment a(@Nullable EditorMusicTabItem editorMusicTabItem, @NotNull String str, int i7) {
            Bundle bundle = new Bundle();
            String strA = C3751q.a(System.currentTimeMillis() + ((long) i7), "network_music_tab_list_");
            if (editorMusicTabItem != null) {
                com.bilibili.studio.videoeditor.common.intent.b.f109430a.b(editorMusicTabItem, strA);
            }
            bundle.putString("network_music_tab_list_key", strA);
            bundle.putString("editor_list_tab_name", str);
            bundle.putInt("editor_list_tab_position", i7);
            BiliEditorMusicTabListFragment biliEditorMusicTabListFragment = new BiliEditorMusicTabListFragment();
            biliEditorMusicTabListFragment.setArguments(bundle);
            return biliEditorMusicTabListFragment;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicTabListFragment$b.class */
    public static final class b extends BiliApiDataCallback<EditorFavItemBean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiliEditorMusicTabListFragment f108003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f108004c;

        public b(BiliEditorMusicTabListFragment biliEditorMusicTabListFragment, boolean z6) {
            this.f108003b = biliEditorMusicTabListFragment;
            this.f108004c = z6;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0147  */
        @Override // com.bilibili.okretro.BiliApiDataCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onDataSuccess(com.bilibili.studio.editor.moudle.musicv3.net.bean.EditorFavItemBean r7) {
            /*
                Method dump skipped, instruction units count: 591
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicTabListFragment.b.onDataSuccess(java.lang.Object):void");
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            this.f108003b.f108000i = false;
            BLog.e("loadFavList", "load fav error");
        }
    }

    public BiliEditorMusicTabListFragment() {
        EditorFavItemBean.CursorBean cursorBean = new EditorFavItemBean.CursorBean();
        cursorBean.pn = 1;
        cursorBean.ps = 20;
        this.f107999g = cursorBean;
        final UI.c cVar = new UI.c(this, 4);
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(cVar) { // from class: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicTabListFragment$special$$inlined$viewModels$default$1
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = cVar;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10130invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function0 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(Jz0.a.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicTabListFragment$special$$inlined$viewModels$default$2
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10131invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function0, lazy) { // from class: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicTabListFragment$special$$inlined$viewModels$default$3
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function0;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m10132invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicTabListFragment$special$$inlined$viewModels$default$3.m10132invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicTabListFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.ViewModelProvider.Factory m10133invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicTabListFragment$special$$inlined$viewModels$default$4.m10133invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f108002k = new HashSet<>();
    }

    public static void hf(BiliEditorMusicTabListFragment biliEditorMusicTabListFragment, boolean z6, boolean z7, boolean z8, int i7) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        if ((i7 & 4) != 0) {
            z8 = false;
        }
        Gz0.d dVar = biliEditorMusicTabListFragment.f107995c;
        if (dVar != null) {
            dVar.N(z6, z7, z8);
        }
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final Jz0.a m10129if() {
        return (Jz0.a) this.h.getValue();
    }

    public final void jf(boolean z6) {
        if (z6) {
            EditorFavItemBean.CursorBean cursorBean = this.f107999g;
            cursorBean.pn = 1;
            cursorBean.ps = 20;
        }
        Iz0.a aVar = (Iz0.a) ServiceGenerator.createService(Iz0.a.class);
        EditorFavItemBean.CursorBean cursorBean2 = this.f107999g;
        BiliCall<GeneralResponse<EditorFavItemBean>> favList = aVar.getFavList(cursorBean2.pn, cursorBean2.ps);
        if (favList != null) {
            favList.enqueue(new b(this, z6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void kf(boolean r6) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicTabListFragment.kf(boolean):void");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        A0 a0Inflate = A0.inflate(layoutInflater, viewGroup, false);
        this.f107994b = a0Inflate;
        return a0Inflate != null ? a0Inflate.f23464a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (EntryPointKt.getMemleakOptEnable()) {
            this.f107994b = null;
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        List<EditorMusicItem> list;
        List<EditorMusicItem> list2;
        boolean zAreEqual;
        List<EditorMusicItem> list3;
        int i7;
        Gz0.d dVar;
        List<EditorMusicItem> list4;
        com.bilibili.studio.editor.moudle.musicv3.logic.c cVar;
        Ez0.e eVar;
        super.onResume();
        Gz0.d dVar2 = this.f107995c;
        if (dVar2 != null) {
            Boolean value = m10129if().f11738g.getValue();
            dVar2.f7499j = value != null ? value.booleanValue() : true;
        }
        Jz0.c cVar2 = m10129if().h;
        EditorMusicItem editorMusicItem = (cVar2 == null || (cVar = cVar2.h) == null || (eVar = cVar.f107942j) == null) ? null : eVar.f4914e;
        if (editorMusicItem == null) {
            Gz0.d dVar3 = this.f107995c;
            if (dVar3 != null) {
                dVar3.N(false, true, true);
            }
        } else {
            String str = this.f107997e;
            Lazy<String> lazy = BiliEditorMusicListContentFragment.f107971x;
            if (Intrinsics.areEqual(str, BiliEditorMusicListContentFragment.a.a())) {
                if (((HashMap) Jz0.f.f11751f).isEmpty()) {
                    EditorMusicTabItem editorMusicTabItem = this.f108001j;
                    if (editorMusicTabItem != null && (list3 = editorMusicTabItem.filterItems) != null) {
                        for (EditorMusicItem editorMusicItem2 : list3) {
                            boolean z6 = editorMusicItem2.editBgm.sid == editorMusicItem.editBgm.sid;
                            editorMusicItem2.isSelect = z6;
                            if (z6) {
                                editorMusicItem2.downloadStatus = 5;
                            }
                        }
                    }
                    Gz0.d dVar4 = this.f107995c;
                    if (dVar4 != null) {
                        dVar4.notifyDataSetChanged();
                    }
                }
            } else if (Intrinsics.areEqual(this.f107997e, BiliEditorMusicListContentFragment.a.b())) {
                EditorMusicTabItem editorMusicTabItem2 = this.f107996d;
                if (editorMusicTabItem2 != null && (list = editorMusicTabItem2.filterItems) != null) {
                    for (EditorMusicItem editorMusicItem3 : list) {
                        boolean zAreEqual2 = Intrinsics.areEqual(editorMusicItem3.localPath, editorMusicItem.localPath);
                        editorMusicItem3.isSelect = zAreEqual2;
                        if (zAreEqual2) {
                            editorMusicItem3.downloadStatus = 5;
                        }
                    }
                }
                Gz0.d dVar5 = this.f107995c;
                if (dVar5 != null) {
                    dVar5.notifyDataSetChanged();
                }
            } else {
                EditorMusicTabItem editorMusicTabItem3 = this.f107996d;
                if (editorMusicTabItem3 != null && (list2 = editorMusicTabItem3.filterItems) != null) {
                    for (EditorMusicItem editorMusicItem4 : list2) {
                        if (editorMusicItem.isLocalMusic) {
                            String str2 = editorMusicItem.flag;
                            if (str2 == null || str2.length() <= 0) {
                                str2 = null;
                            }
                            zAreEqual = Intrinsics.areEqual(str2, editorMusicItem4.flag);
                        } else {
                            zAreEqual = editorMusicItem4.editBgm.sid == editorMusicItem.editBgm.sid;
                        }
                        editorMusicItem4.isSelect = zAreEqual;
                        if (zAreEqual) {
                            editorMusicItem4.downloadStatus = 5;
                        }
                    }
                }
                Gz0.d dVar6 = this.f107995c;
                if (dVar6 != null) {
                    dVar6.notifyDataSetChanged();
                }
            }
        }
        if (!((HashMap) Jz0.f.f11751f).isEmpty()) {
            String str3 = this.f107997e;
            Lazy<String> lazy2 = BiliEditorMusicListContentFragment.f107971x;
            if (Intrinsics.areEqual(str3, BiliEditorMusicListContentFragment.a.a())) {
                BLog.e("BiliEditorMusicTabListFragment", "refresh fav list");
                jf(true);
            } else if (!Intrinsics.areEqual(this.f107997e, BiliEditorMusicListContentFragment.a.b())) {
                for (Map.Entry entry : ((HashMap) Jz0.f.f11751f).entrySet()) {
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                    EditorMusicTabItem editorMusicTabItem4 = this.f107996d;
                    if (editorMusicTabItem4 == null || (list4 = editorMusicTabItem4.filterItems) == null) {
                        i7 = -1;
                    } else {
                        i7 = 0;
                        for (Object obj : list4) {
                            if (i7 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            Bgm bgm = ((EditorMusicItem) obj).editBgm;
                            if (bgm.sid == jLongValue) {
                                bgm.fav = zBooleanValue ? 1 : 0;
                                break;
                            }
                            i7++;
                        }
                        i7 = -1;
                    }
                    if (i7 != -1 && (dVar = this.f107995c) != null) {
                        dVar.notifyItemChanged(i7);
                    }
                }
            }
        }
        A0 a02 = this.f107994b;
        if (a02 != null) {
            a02.f23469f.post(new u(this, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicTabListFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
