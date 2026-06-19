package com.bilibili.studio.editor.moudle.musicv3.ui;

import TB0.D;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.studio.editor.base.BiliEditorBaseFragment;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicVolumeFragment;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.util.EditorUsedFunctionUtil;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicListFragment.class */
public class BiliEditorMusicListFragment extends BiliEditorBaseFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f107987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public ViewBinding f107988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final ArrayList<String> f107989n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ArrayList<Fragment> f107990o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Lz0.a f107991p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public Kz0.h f107992q;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/BiliEditorMusicListFragment$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.biligame.ui.minev3.d f107993a;

        public a(com.bilibili.biligame.ui.minev3.d dVar) {
            this.f107993a = dVar;
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
            return this.f107993a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f107993a.invoke(obj);
        }
    }

    @NotNull
    public Kz0.h Af() {
        return new Kz0.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, fz0.InterfaceC7206a
    public final void La(@NotNull Function1<? super Boolean, Unit> function1) {
        com.bilibili.studio.editor.moudle.musicv3.logic.c cVar;
        EditorMusicItem editorMusicItemA;
        EditorMusicItem editorMusicItem;
        jf();
        BiliEditorMusicVolumeFragment biliEditorMusicVolumeFragment = (BiliEditorMusicVolumeFragment) this.f107990o.get(1);
        BiliEditorMusicListContentFragment biliEditorMusicListContentFragment = (BiliEditorMusicListContentFragment) this.f107990o.get(0);
        Jz0.c cVar2 = biliEditorMusicListContentFragment.f107975m;
        BMusic bMusicWf = biliEditorMusicListContentFragment.wf();
        com.bilibili.studio.editor.moudle.musicv3.logic.b.d(bMusicWf);
        BiliEditorMusicVolumeFragment.a aVarXf = biliEditorMusicVolumeFragment.xf();
        if (aVarXf != null) {
            aVarXf.f108018e = bMusicWf != null ? bMusicWf.trimIn : 0L;
            aVarXf.f108019f = bMusicWf != null ? bMusicWf.trimOut : 0L;
            if (biliEditorMusicVolumeFragment.f108008o == null) {
                aVarXf.f108014a = bMusicWf != null ? bMusicWf.fadeIn : false;
                aVarXf.f108015b = bMusicWf != null ? bMusicWf.fadeOut : false;
                aVarXf.f108016c = bMusicWf != null ? bMusicWf.fadeInValue : 0L;
                long j7 = 0;
                if (bMusicWf != null) {
                    j7 = bMusicWf.fadeOutValue;
                }
                aVarXf.f108017d = j7;
                aVarXf.f108020g = bMusicWf != null ? bMusicWf.ratioMusic : 0.0f;
                aVarXf.h = this.f105686c.getUserTrackNativeVolume();
            }
        }
        if (cVar2 == null || (cVar = cVar2.h) == null) {
            return;
        }
        EditVideoInfo editVideoInfo = cVar.f107929a;
        if (editVideoInfo == null) {
            BLog.e("BiliEditorMusicListLogic", "onClickNextStep mEditVideoInfo == null");
            function1.invoke(Boolean.FALSE);
            return;
        }
        Cz0.a aVar = cVar.f107930b;
        ArrayList<BMusic> arrayList = null;
        if (aVarXf != null) {
            if (editVideoInfo.getUserTrackNativeVolume() != aVarXf.h) {
                EditorUsedFunctionUtil.b(editVideoInfo, "音乐");
            }
            editVideoInfo.setUserTrackNativeVolume(aVarXf.h);
            Ez0.e eVar = cVar.f107942j;
            boolean z6 = (eVar == null || (editorMusicItem = eVar.f4914e) == null) ? false : editorMusicItem.isEdit;
            EditorMusicInfo editorMusicInfo = (EditorMusicInfo) aVar.f16451b;
            ArrayList<BMusic> arrayList2 = editorMusicInfo != null ? editorMusicInfo.bMusicList : null;
            if (z6 && arrayList2 != null && (!arrayList2.isEmpty())) {
                BMusic bMusic = arrayList2.get(0);
                bMusic.fadeIn = aVarXf.f108014a;
                bMusic.ratioMusic = aVarXf.f108020g;
                bMusic.fadeInValue = aVarXf.f108016c;
                BMusic bMusic2 = (BMusic) androidx.appcompat.view.menu.d.a(1, arrayList2);
                bMusic2.fadeOut = aVarXf.f108015b;
                bMusic2.fadeOutValue = aVarXf.f108017d;
                bMusic2.ratioMusic = aVarXf.f108020g;
            } else {
                BMusic bMusicB = aVar.b(0);
                if (bMusicB != null) {
                    bMusicB.fadeIn = aVarXf.f108014a;
                    bMusicB.fadeOut = aVarXf.f108015b;
                    bMusicB.ratioMusic = aVarXf.f108020g;
                    bMusicB.trimIn = aVarXf.f108018e;
                    bMusicB.trimOut = aVarXf.f108019f;
                }
            }
        }
        EditorMusicInfo editorMusicInfo2 = editVideoInfo.getEditorMusicInfo();
        aVar.getClass();
        if (Cz0.a.c(editorMusicInfo2) || editVideoInfo.getUserTrackNativeVolume() != 1.0f) {
            editVideoInfo.setIsEdited(true);
        }
        Ez0.e eVar2 = cVar.f107942j;
        if (eVar2 != null) {
            eVar2.f4915f = eVar2.f4914e;
        }
        if (eVar2 != null) {
            EditorMusicInfo editorMusicInfo3 = editVideoInfo.getEditorMusicInfo();
            editorMusicItemA = eVar2.a(editorMusicInfo3 != null ? editorMusicInfo3.bMusicList : null);
        } else {
            editorMusicItemA = null;
        }
        Ez0.e eVar3 = cVar.f107942j;
        if (eVar3 != null) {
            eVar3.g(editorMusicItemA);
        }
        if (!EditorUsedFunctionUtil.d(editVideoInfo, "音乐")) {
            EditorMusicInfo editorMusicInfo4 = (EditorMusicInfo) aVar.f16450a;
            ArrayList<BMusic> arrayList3 = editorMusicInfo4 != null ? editorMusicInfo4.bMusicList : null;
            EditorMusicInfo editorMusicInfo5 = (EditorMusicInfo) aVar.f16451b;
            if (editorMusicInfo5 != null) {
                arrayList = editorMusicInfo5.bMusicList;
            }
            if (EditorUsedFunctionUtil.i(arrayList3, arrayList)) {
                EditorUsedFunctionUtil.a(editVideoInfo, "音乐");
            }
        }
        cVar.g();
        function1.invoke(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ec  */
    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, fz0.InterfaceC7206a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo Q0() {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListFragment.Q0():com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0a9e  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0af7  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0b17  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0b5f  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0b69  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0b83  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0b95  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0b9f  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0bc5  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0bcd  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0bf3  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0bfa  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0c47  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0c5a  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0c61  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0c74  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0c8e  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0c95  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0ca8  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0caf  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0cdd  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0cf4  */
    /* JADX WARN: Removed duplicated region for block: B:437:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(@org.jetbrains.annotations.Nullable android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 3328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListFragment.onClick(android.view.View):void");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f107992q = Af();
        return zf(layoutInflater, viewGroup);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Kz0.h hVar;
        super.onViewCreated(view, bundle);
        this.f107991p = (Lz0.a) new ViewModelProvider(this.f105685b.a).get(Lz0.a.class);
        this.f107989n.add(requireContext().getString(2131842447));
        this.f107989n.add(requireContext().getString(2131841909));
        this.f107990o.add(xf());
        this.f107990o.add(yf());
        ViewBinding viewBinding = this.f107988m;
        if (viewBinding != null) {
            EditVideoInfo editVideoInfo = this.f105686c;
            this.f107987l = Intrinsics.areEqual(editVideoInfo != null ? Float.valueOf(editVideoInfo.getUserTrackNativeVolume()) : null, 0.0f);
            Kz0.h hVar2 = this.f107992q;
            if (hVar2 != null) {
                hVar2.c(viewBinding, getChildFragmentManager(), this.f107989n, this.f107990o, this.f107987l);
            }
            Lz0.a aVar = this.f107991p;
            Lz0.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                aVar2 = null;
            }
            aVar2.f15017c.setValue(this.f107987l ? Float.valueOf(0.0f) : Float.valueOf(100.0f));
        }
        ViewBinding viewBinding2 = this.f107988m;
        if (viewBinding2 != null && (hVar = this.f107992q) != null) {
            hVar.b(viewBinding2, this, new q(this));
        }
        Lz0.a aVar3 = this.f107991p;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            aVar3 = null;
        }
        aVar3.f15016b.observe(getViewLifecycleOwner(), new a(new com.bilibili.biligame.ui.minev3.d(this, 3)));
    }

    public final void wf() {
        ViewPager viewPagerA;
        Kz0.h hVar = this.f107992q;
        FragmentPagerAdapter fragmentPagerAdapter = null;
        PagerAdapter adapter = (hVar == null || (viewPagerA = hVar.a(this.f107988m)) == null) ? null : viewPagerA.getAdapter();
        if (adapter instanceof FragmentPagerAdapter) {
            fragmentPagerAdapter = (FragmentPagerAdapter) adapter;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        if (fragmentPagerAdapter != null) {
            int count = fragmentPagerAdapter.getCount() - 1;
            if (count >= 0) {
                int i7 = 0;
                while (true) {
                    Fragment item = fragmentPagerAdapter.getItem(i7);
                    fragmentTransactionBeginTransaction.remove(item);
                    item.onDestroyView();
                    item.onDestroy();
                    if (i7 == count) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        }
    }

    @NotNull
    public BiliEditorMusicListContentFragment xf() {
        Lazy<String> lazy = BiliEditorMusicListContentFragment.f107971x;
        Bundle bundleB = B1.a.b(2, "key_tab_from");
        BiliEditorMusicListContentFragment biliEditorMusicListContentFragment = new BiliEditorMusicListContentFragment();
        biliEditorMusicListContentFragment.setArguments(bundleB);
        return biliEditorMusicListContentFragment;
    }

    @NotNull
    public BiliEditorMusicVolumeFragment yf() {
        BiliEditorMusicVolumeFragment biliEditorMusicVolumeFragment = new BiliEditorMusicVolumeFragment();
        Bundle bundleA = com.bilibili.biligame.router.k.a(0, 2, "current_select_index", "volume_tab_from");
        bundleA.putSerializable("current_select_music", null);
        biliEditorMusicVolumeFragment.setArguments(bundleA);
        return biliEditorMusicVolumeFragment;
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.MUSIC;
    }

    @Nullable
    public View zf(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        D dInflate = D.inflate(layoutInflater, viewGroup, false);
        this.f107988m = dInflate;
        LinearLayout linearLayout = null;
        if (dInflate == null) {
            dInflate = null;
        }
        if (dInflate != null) {
            linearLayout = dInflate.f23500a;
        }
        return linearLayout;
    }
}
