package com.bilibili.studio.editor.moudle.musicv3.ui;

import TB0.A0;
import android.app.LoaderManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.base.MainThread;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.studio.editor.base.BiliEditorBaseFragment;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.template.music.BiliEditorMusicListContentFragmentOfTemV3;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicTabItem;
import com.bilibili.studio.editor.moudle.musicv3.logic.BiliEditorMusicBaseLogicV2;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicTabListFragment;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicListContentFragment.class */
public class BiliEditorMusicListContentFragment extends BiliEditorBaseFragment implements Hz0.a, View.OnClickListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final Lazy<String> f107971x = LazyKt.lazy(new Fa1.c(11));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final Lazy<String> f107972y = LazyKt.lazy(new Fa1.d(12));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final Lazy<String> f107973z = LazyKt.lazy(new Fa1.e(10));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ViewBinding f107974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Jz0.c f107975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Jz0.c f107976n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f107979q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f107980r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f107982t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public Jz0.a f107983u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public Kz0.f f107985w;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ArrayList<String> f107977o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ArrayList<BiliEditorMusicTabListFragment> f107978p = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f107981s = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final HashSet<Integer> f107984v = new HashSet<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicListContentFragment$a.class */
    public static final class a {
        @NotNull
        public static String a() {
            return (String) BiliEditorMusicListContentFragment.f107971x.getValue();
        }

        @NotNull
        public static String b() {
            return (String) BiliEditorMusicListContentFragment.f107972y.getValue();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicListContentFragment$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f107986a;

        public b(Function1 function1) {
            this.f107986a = function1;
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
            return this.f107986a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f107986a.invoke(obj);
        }
    }

    public final void Af(boolean z6) {
        Kz0.f fVar;
        com.bilibili.studio.editor.moudle.musicv3.logic.c cVar;
        Ez0.e eVar;
        com.bilibili.studio.editor.moudle.musicv3.logic.c cVar2;
        Ez0.e eVar2;
        Jz0.c cVar3 = this.f107976n;
        List<EditorMusicTabItem> list = (cVar3 == null || (cVar2 = cVar3.h) == null || (eVar2 = cVar2.f107942j) == null) ? null : eVar2.f4910a.f4894d;
        BLog.i("BiliEditorMusicListContentFragment", "refreshMusicList musicTabList=" + (list != null ? Integer.valueOf(list.size()) : null) + ",isLoadSuccess=" + z6);
        if (list == null || list.isEmpty() || !z6) {
            ViewBinding viewBinding = this.f107974l;
            if (viewBinding == null || (fVar = this.f107985w) == null) {
                return;
            }
            fVar.g(viewBinding, new Nx.d(this, 2));
            return;
        }
        Y4.c.b("refreshTabList tabStr=", this.f107977o, "BiliEditorMusicListContentFragment");
        if (this.f107977o.isEmpty()) {
            this.f107977o.add(a.b());
            this.f107977o.add(a.a());
            Jz0.c cVar4 = this.f107975m;
            List<EditorMusicItem> list2 = (cVar4 == null || (cVar = cVar4.h) == null || (eVar = cVar.f107942j) == null) ? null : eVar.f4910a.f4891a;
            if (!TypeIntrinsics.isMutableList(list2)) {
                list2 = null;
            }
            if (list2 != null && (!list2.isEmpty()) && list2.get(0).isImportTutorial) {
                list2.remove(0);
            }
            EditorMusicTabItem editorMusicTabItem = new EditorMusicTabItem();
            editorMusicTabItem.name = a.b();
            editorMusicTabItem.id = 1008;
            editorMusicTabItem.filterItems = list2;
            this.f107978p.add(BiliEditorMusicTabListFragment.a.a(editorMusicTabItem, "本地", 0));
            this.f107978p.add(BiliEditorMusicTabListFragment.a.a(null, "收藏", 1));
            ArrayList arrayList = new ArrayList();
            int i7 = 0;
            for (Object obj : list) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                EditorMusicTabItem editorMusicTabItem2 = (EditorMusicTabItem) obj;
                this.f107977o.add(editorMusicTabItem2.name);
                if (Intrinsics.areEqual((String) f107973z.getValue(), editorMusicTabItem2.name) && Jz0.f.f11750e.length() <= 0) {
                    StringBuilder sb = new StringBuilder();
                    List<EditorMusicItem> list3 = editorMusicTabItem2.filterItems;
                    if (list3 != null) {
                        for (EditorMusicItem editorMusicItem : list3) {
                            Bgm bgm = editorMusicItem.editBgm;
                            if ((bgm != null ? Long.valueOf(bgm.sid) : null) != null) {
                                Bgm bgm2 = editorMusicItem.editBgm;
                                sb.append(bgm2 != null ? Long.valueOf(bgm2.sid) : null);
                                sb.append(",");
                            }
                        }
                    }
                    String str = Jz0.f.f11746a;
                    Jz0.f.f11750e = sb.toString();
                }
                ArrayList<BiliEditorMusicTabListFragment> arrayList2 = this.f107978p;
                String str2 = editorMusicTabItem2.name;
                int i8 = i7 + 2;
                Bundle bundle = new Bundle();
                String strA = C3751q.a(System.currentTimeMillis() + ((long) i8), "network_music_tab_list_");
                com.bilibili.studio.videoeditor.common.intent.b.f109430a.b(editorMusicTabItem2, strA);
                bundle.putString("network_music_tab_list_key", strA);
                bundle.putString("editor_list_tab_name", str2);
                bundle.putInt("editor_list_tab_position", i8);
                BiliEditorMusicTabListFragment biliEditorMusicTabListFragment = new BiliEditorMusicTabListFragment();
                biliEditorMusicTabListFragment.setArguments(bundle);
                if (arrayList2.add(biliEditorMusicTabListFragment)) {
                    arrayList.add(obj);
                }
                i7++;
            }
            ViewBinding viewBinding2 = this.f107974l;
            if (viewBinding2 == null || !isAdded()) {
                return;
            }
            Kz0.f fVar2 = this.f107985w;
            if (fVar2 != null) {
                fVar2.d(viewBinding2, getChildFragmentManager(), this.f107977o, this.f107978p);
            }
            Kz0.f fVar3 = this.f107985w;
            int currentItem = 0;
            if (fVar3 != null) {
                ViewPager viewPagerA = fVar3.a(viewBinding2);
                currentItem = 0;
                if (viewPagerA != null) {
                    currentItem = viewPagerA.getCurrentItem();
                }
            }
            this.f107979q = currentItem;
            this.f107980r = currentItem;
        }
    }

    public final void Bf(boolean z6) {
        int i7 = this.f107979q;
        int i8 = this.f107980r;
        if (i7 != i8) {
            BiliEditorMusicTabListFragment biliEditorMusicTabListFragmentXf = xf(i8);
            if (biliEditorMusicTabListFragmentXf != null) {
                BiliEditorMusicTabListFragment.hf(biliEditorMusicTabListFragmentXf, false, true, true, 1);
            }
            this.f107980r = this.f107979q;
        }
        BiliEditorMusicTabListFragment biliEditorMusicTabListFragmentXf2 = xf(this.f107979q);
        if (biliEditorMusicTabListFragmentXf2 != null) {
            BiliEditorMusicTabListFragment.hf(biliEditorMusicTabListFragmentXf2, z6, false, false, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.studio.editor.moudle.music.model.EditorMusicItem Cf(@org.jetbrains.annotations.NotNull java.util.List<? extends com.bilibili.studio.videoeditor.bean.BMusic> r7) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListContentFragment.Cf(java.util.List):com.bilibili.studio.editor.moudle.music.model.EditorMusicItem");
    }

    public final void Df(boolean z6, boolean z7) {
        Kz0.f fVar;
        TabLayout tabLayoutB;
        if (z7) {
            this.f107984v.clear();
        }
        Runnable iVar = new com.bilibili.lib.accountsui.quick.i(this, 1);
        ViewBinding viewBinding = this.f107974l;
        if (viewBinding == null || (fVar = this.f107985w) == null || (tabLayoutB = fVar.b(viewBinding)) == null) {
            return;
        }
        tabLayoutB.postDelayed(iVar, z6 ? 600L : 0L);
    }

    @Override // Hz0.a
    public final void Ie() {
        dz0.c cVar = ((Yv0.b) this.f105685b.a).B;
        if (cVar != null) {
            cVar.e.c.getClass();
            com.bilibili.studio.editor.moudle.music.manager.b.d().b();
        }
    }

    @Override // Hz0.a
    public final void P9(long j7, boolean z6) {
        com.bilibili.studio.editor.timeline.i iVar = this.f105687d;
        if (iVar != null) {
            iVar.r(j7, 0L);
        }
    }

    @Override // Hz0.a
    public final void Tb(@NotNull BMusic bMusic) {
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment
    /* JADX INFO: renamed from: if */
    public final void mo9869if(boolean z6) {
        Jz0.a aVar;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        Jz0.a aVar2 = this.f107983u;
        if (((aVar2 == null || (mutableLiveData2 = aVar2.f11738g) == null) ? false : Intrinsics.areEqual(Boolean.valueOf(z6), mutableLiveData2.getValue())) || (aVar = this.f107983u) == null || (mutableLiveData = aVar.f11738g) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.valueOf(z6));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l4(long r8) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListContentFragment.l4(long):void");
    }

    @Override // Hz0.a
    public final void ld(boolean z6) {
        if (getContext() == null) {
            return;
        }
        if (z6) {
            ToastHelper.showToastShort(getContext(), 2131841972);
        }
        BiliEditorMusicTabListFragment biliEditorMusicTabListFragmentXf = xf(this.f107979q);
        if (biliEditorMusicTabListFragmentXf != null) {
            BiliEditorMusicTabListFragment.hf(biliEditorMusicTabListFragmentXf, false, true, false, 5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        Bundle extras;
        super.onActivityResult(i7, i8, intent);
        if (18 == i7 && i8 == -1 && this.f105689f != null) {
            ViewBinding viewBinding = this.f107974l;
            if (viewBinding != null) {
                Kz0.f fVar = this.f107985w;
                if (fVar == null || fVar.f(viewBinding)) {
                    BiliEditorMusicTabListFragment biliEditorMusicTabListFragmentXf = xf(this.f107979q);
                    if (biliEditorMusicTabListFragmentXf != null) {
                        A0 a02 = biliEditorMusicTabListFragmentXf.f107994b;
                        if (a02 != null) {
                            a02.f23465b.setVisibility(8);
                        }
                        A0 a03 = biliEditorMusicTabListFragmentXf.f107994b;
                        if (a03 != null) {
                            a03.f23466c.setVisibility(0);
                        }
                    }
                } else {
                    Kz0.f fVar2 = this.f107985w;
                    if (fVar2 != null) {
                        fVar2.h(viewBinding);
                    }
                }
            }
            Jz0.c cVar = this.f107975m;
            if (cVar != null) {
                Context context = this.f105689f;
                if (intent != null && (extras = intent.getExtras()) != null) {
                    String string = extras.getString("key_bgm_path");
                    String string2 = extras.getString("key_bgm_category");
                    long j7 = extras.getLong("key_bgm_start_time", 0L);
                    long j8 = 1000;
                    if (!TextUtils.isEmpty(string) && (cVar.h == null || !BiliEditorMusicBaseLogicV2.h(context, string))) {
                        return;
                    }
                    Bgm bgm = (Bgm) com.bilibili.studio.videoeditor.common.intent.b.f109430a.a("key_bgm_instance");
                    if ((bgm != null ? bgm.category : null) == null && bgm != null) {
                        bgm.category = string2;
                    }
                    if (bgm != null) {
                        bgm.setStartTime(bgm.getStartTime() * 1000);
                    }
                    if (bgm != null) {
                        bgm.formMusicLibrary = true;
                    }
                    com.bilibili.studio.editor.moudle.musicv3.logic.a.b(bgm);
                    com.bilibili.studio.editor.moudle.musicv3.logic.c cVar2 = cVar.h;
                    Unit unit = null;
                    if (cVar2 != null) {
                        com.bilibili.studio.editor.moudle.musicv3.logic.c.k(cVar2, string, j7 * j8, bgm, 0L, null, null, true, false, string2, 256);
                        unit = Unit.INSTANCE;
                    }
                    if (unit != null) {
                        return;
                    }
                }
                BLog.e(cVar.f16452a, "data or extras is null");
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        boolean z6 = true;
        if (numValueOf == null || numValueOf.intValue() != 2131316818) {
            if (numValueOf == null || numValueOf.intValue() != 2131316810 || this.f107975m == null) {
                return;
            }
            String strE = com.bilibili.studio.videoeditor.extension.l.e(this.f105686c);
            boolean z7 = false;
            if (this.f107982t == 3) {
                z7 = true;
            }
            Jz0.c.c(this, true, strE, z7);
            return;
        }
        Xz0.d dVar = Xz0.d.f28458a;
        String strE2 = com.bilibili.studio.videoeditor.extension.l.e(this.f105686c);
        dVar.getClass();
        Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        Xz0.j.c("router_topic_id", Xz0.g.f28463b);
        Map mapB = Xz0.j.b(Xz0.k.f28474a);
        ((HashMap) mapB).put("fast_video", strE2);
        Neurons.reportClick(false, "creation.new-video-editor.choose-music.search.click", mapB);
        if (this.f107975m != null) {
            String strE3 = com.bilibili.studio.videoeditor.extension.l.e(this.f105686c);
            if (this.f107982t != 3) {
                z6 = false;
            }
            Jz0.c.c(this, false, strE3, z6);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f107985w = zf();
        return yf(layoutInflater, viewGroup);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Jz0.c cVar;
        com.bilibili.studio.editor.moudle.musicv3.logic.c cVar2;
        super.onDestroyView();
        if (!EntryPointKt.getMemleakOptEnable() || (cVar = this.f107975m) == null || (cVar2 = cVar.h) == null) {
            return;
        }
        Ez0.e eVar = cVar2.f107942j;
        AL.i iVar = cVar2.f107943k;
        if (eVar != null && iVar != null && eVar.f4911b == iVar) {
            eVar.f4911b = null;
        }
        cVar2.f107943k = null;
        cVar2.f107945m = null;
        cVar2.f107942j = null;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Xz0.d dVar = Xz0.d.f28458a;
        String strE = com.bilibili.studio.videoeditor.extension.l.e(this.f105686c);
        String str = Jz0.f.f11746a;
        int i7 = this.f107982t;
        String str2 = i7 != 2 ? i7 != 3 ? "0" : "2" : "1";
        dVar.getClass();
        Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        Xz0.j.c("router_topic_id", Xz0.g.f28463b);
        Map mapB = Xz0.j.b(Xz0.k.f28474a);
        HashMap map = (HashMap) mapB;
        map.put("fast_video", strE);
        map.put("panel_from", str2);
        Neurons.reportExposure$default(false, "creation.new-video-editor.choose-music.0.show", mapB, (List) null, 8, (Object) null);
        Df(true, true);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [com.bilibili.studio.editor.moudle.musicv3.ui.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [Jz0.c, Mw0.d] */
    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        Kz0.f fVar;
        com.bilibili.studio.editor.moudle.musicv3.logic.c cVar;
        Ez0.e eVar;
        com.bilibili.studio.editor.moudle.musicv3.logic.c cVar2;
        Ez0.e eVar2;
        Kz0.f fVar2;
        super.onViewCreated(view, bundle);
        ViewBinding viewBinding = this.f107974l;
        if (viewBinding != null && (fVar2 = this.f107985w) != null) {
            fVar2.e(viewBinding);
        }
        EditVideoInfo editVideoInfo = this.f105686c;
        if (editVideoInfo != null) {
            ?? dVar = new Mw0.d(this, editVideoInfo);
            dVar.f11741f = this instanceof BiliEditorMusicListContentFragmentOfTemV3;
            this.f107975m = dVar;
            FragmentActivity fragmentActivityP3 = p3();
            if (fragmentActivityP3 != null) {
                Jz0.c cVar3 = this.f107975m;
                if (cVar3 != null) {
                    LoaderManager loaderManager = fragmentActivityP3.getLoaderManager();
                    com.bilibili.studio.editor.moudle.musicv3.logic.c cVar4 = cVar3.h;
                    if (cVar4 != null) {
                        BLog.i("BiliEditorMusicListLogic", "initListMusicProvider 加载音乐列表");
                        Ez0.e eVarB = Ez0.e.b();
                        cVar4.f107942j = eVarB;
                        if (eVarB != null) {
                            String strM = cVar4.m();
                            EditVideoInfo editVideoInfo2 = cVar4.f107929a;
                            List<String> templateMusicList = editVideoInfo2 != null ? editVideoInfo2.getTemplateMusicList() : null;
                            List<String> arrayList = templateMusicList;
                            if (templateMusicList == null) {
                                arrayList = new ArrayList();
                            }
                            eVarB.d(loaderManager, strM, arrayList);
                        }
                        Ez0.e eVar3 = cVar4.f107942j;
                        if (eVar3 != null) {
                            AL.i iVar = new AL.i(cVar4);
                            cVar4.f107943k = iVar;
                            eVar3.f4911b = iVar;
                        }
                    }
                }
                Jz0.c cVar5 = this.f107975m;
                this.f107976n = cVar5;
                if (cVar5 != null) {
                    long jOf = of();
                    com.bilibili.studio.editor.moudle.musicv3.logic.c cVar6 = cVar5.h;
                    if (cVar6 != null) {
                        cVar6.h = jOf;
                    }
                }
                Jz0.a aVar = (Jz0.a) new ViewModelProvider(this).get(Jz0.a.class);
                this.f107983u = aVar;
                if (aVar != null) {
                    aVar.h = this.f107975m;
                }
                Jz0.c cVar7 = this.f107975m;
                if (cVar7 != null && (cVar2 = cVar7.h) != null && (eVar2 = cVar2.f107942j) != null) {
                    eVar2.f4918j = true;
                }
                if (cVar7 != null && (cVar = cVar7.h) != null && (eVar = cVar.f107942j) != null) {
                    Ez0.d dVar2 = eVar.f4910a;
                    if (dVar2.h && dVar2.f4898i && dVar2.f4899j) {
                        MainThread.postOnMainThread(new AN.a(this, 3));
                    }
                }
                int i7 = 0;
                this.f105693k = false;
                Bundle arguments = getArguments();
                if (arguments != null) {
                    i7 = arguments.getInt("key_tab_from");
                }
                this.f107982t = i7;
            }
        }
        ViewBinding viewBinding2 = this.f107974l;
        if (viewBinding2 != null && (fVar = this.f107985w) != null) {
            fVar.c(viewBinding2, this, new p(this, viewBinding2), new Wu0.c(this, 1));
        }
        Jz0.c cVar8 = this.f107975m;
        if (cVar8 != null && (mutableLiveData2 = cVar8.f11742g) != null) {
            mutableLiveData2.observe(getViewLifecycleOwner(), new b(new UD0.n(this, 2)));
        }
        Jz0.a aVar2 = this.f107983u;
        if (aVar2 != null && (mutableLiveData = aVar2.f11738g) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new b(new Vd0.m(this, 2)));
        }
        Jz0.a aVar3 = this.f107983u;
        if (aVar3 != null) {
            ?? obj = new Object();
            o oVar = new o(this);
            bz0.i iVar2 = new bz0.i(this, 2);
            aVar3.f11734c = obj;
            aVar3.f11735d = oVar;
            aVar3.f11736e = iVar2;
        }
        if (aVar3 != null) {
            aVar3.f11737f = new com.bilibili.biligame.ui.minev3.c(this, 2);
        }
    }

    @Override // Hz0.a
    public final void pb(@NotNull BMusic bMusic, int i7) {
    }

    @Override // Hz0.a
    public final void s6() {
        lf(0L);
    }

    @Nullable
    public final BMusic wf() {
        Jz0.c cVar = this.f107975m;
        BMusic bMusic = null;
        if (cVar != null) {
            com.bilibili.studio.editor.moudle.musicv3.logic.c cVar2 = cVar.h;
            bMusic = null;
            if (cVar2 != null) {
                bMusic = cVar2.f107935g;
            }
        }
        return bMusic;
    }

    public final BiliEditorMusicTabListFragment xf(int i7) {
        if (i7 >= this.f107978p.size()) {
            return null;
        }
        return this.f107978p.get(i7);
    }

    @Nullable
    public View yf(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        TB0.A aInflate = TB0.A.inflate(layoutInflater, viewGroup, false);
        this.f107974l = aInflate;
        FrameLayout frameLayout = null;
        if (aInflate == null) {
            aInflate = null;
        }
        if (aInflate != null) {
            frameLayout = aInflate.f23454a;
        }
        return frameLayout;
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.MUSIC;
    }

    @NotNull
    public Kz0.f zf() {
        return new Kz0.f();
    }
}
