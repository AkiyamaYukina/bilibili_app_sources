package com.bilibili.studio.editor.moudle.musicv3.ui;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.editor.moudle.intelligence.music.api.AIMusicService;
import com.bilibili.studio.editor.moudle.musicv3.net.bean.EditorFavItemBean;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListContentFragment;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/w.class */
public final class w extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicTabListFragment f108062a;

    public w(BiliEditorMusicTabListFragment biliEditorMusicTabListFragment) {
        this.f108062a = biliEditorMusicTabListFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        Gz0.d dVar;
        super.onScrollStateChanged(recyclerView, i7);
        T7.a.a(i7, "is here, state is ", "addOnScrollListener");
        BiliEditorMusicTabListFragment biliEditorMusicTabListFragment = this.f108062a;
        if (i7 == 0) {
            biliEditorMusicTabListFragment.getClass();
            Lazy<String> lazy = BiliEditorMusicListContentFragment.f107971x;
            if ((Intrinsics.areEqual(BiliEditorMusicListContentFragment.a.a(), biliEditorMusicTabListFragment.f107997e) || Intrinsics.areEqual((String) BiliEditorMusicListContentFragment.f107973z.getValue(), biliEditorMusicTabListFragment.f107997e)) && (dVar = biliEditorMusicTabListFragment.f107995c) != null) {
                int i8 = 1;
                if (dVar.f7498i && !biliEditorMusicTabListFragment.f108000i) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                    int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    int childCount = linearLayoutManager.getChildCount();
                    int itemCount = linearLayoutManager.getItemCount();
                    if (childCount > 0 && iFindLastVisibleItemPosition >= itemCount - 1) {
                        biliEditorMusicTabListFragment.f108000i = true;
                        if (Intrinsics.areEqual(BiliEditorMusicListContentFragment.a.a(), biliEditorMusicTabListFragment.f107997e)) {
                            biliEditorMusicTabListFragment.jf(false);
                        } else {
                            String str = Jz0.f.f11748c;
                            String str2 = str;
                            if (str == null) {
                                str2 = "";
                            }
                            EditorFavItemBean.CursorBean cursorBean = Jz0.f.f11749d;
                            if (cursorBean != null) {
                                i8 = cursorBean.pn;
                            }
                            ((AIMusicService) ServiceGenerator.createService(AIMusicService.class)).getRecommendMusics(Jz0.f.f11747b, Jz0.f.f11746a, 2, Constant.SDK_OS, str2, Integer.valueOf(i8), Integer.valueOf(cursorBean != null ? cursorBean.ps : 20), Xz0.g.d()).enqueue(new x(biliEditorMusicTabListFragment));
                        }
                    }
                }
            }
        }
        if (i7 == 0) {
            biliEditorMusicTabListFragment.kf(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        n nVar;
        super.onScrolled(recyclerView, i7, i8);
        if (i8 > 0) {
            Lazy<String> lazy = BiliEditorMusicListContentFragment.f107971x;
            String strA = BiliEditorMusicListContentFragment.a.a();
            BiliEditorMusicTabListFragment biliEditorMusicTabListFragment = this.f108062a;
            if (Intrinsics.areEqual(strA, biliEditorMusicTabListFragment.f107997e) || Intrinsics.areEqual(BiliEditorMusicListContentFragment.a.b(), biliEditorMusicTabListFragment.f107997e) || (nVar = biliEditorMusicTabListFragment.m10129if().f11734c) == null) {
                return;
            }
            nVar.invoke(Boolean.TRUE);
        }
    }
}
