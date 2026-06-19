package com.bilibili.studio.editor.moudle.musicv3.ui;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicTabItem;
import com.bilibili.studio.editor.moudle.musicv3.net.bean.EditorRecommendItemBean;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import java.util.Iterator;
import java.util.List;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/v.class */
public final class v extends BiliApiDataCallback<EditorRecommendItemBean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliEditorMusicTabListFragment f108061b;

    public v(BiliEditorMusicTabListFragment biliEditorMusicTabListFragment) {
        this.f108061b = biliEditorMusicTabListFragment;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(EditorRecommendItemBean editorRecommendItemBean) {
        List<Bgm> list;
        EditorMusicTabItem editorMusicTabItem;
        EditorRecommendItemBean editorRecommendItemBean2 = editorRecommendItemBean;
        BLog.e("getRecommendList", "success");
        BiliEditorMusicTabListFragment biliEditorMusicTabListFragment = this.f108061b;
        biliEditorMusicTabListFragment.f108000i = false;
        if (editorRecommendItemBean2 == null || (list = editorRecommendItemBean2.recommendList) == null || !(!list.isEmpty()) || (editorMusicTabItem = biliEditorMusicTabListFragment.f107996d) == null) {
            Gz0.d dVar = biliEditorMusicTabListFragment.f107995c;
            if (dVar != null) {
                dVar.f7498i = false;
                List<EditorMusicItem> list2 = dVar.f7493c;
                if (list2 != null) {
                    dVar.notifyItemInserted(list2.size());
                    return;
                }
                return;
            }
            return;
        }
        List<EditorMusicItem> list3 = editorMusicTabItem.filterItems;
        List<Bgm> list4 = editorRecommendItemBean2.recommendList;
        if (!list4.isEmpty()) {
            Iterator<Bgm> it = list4.iterator();
            while (it.hasNext()) {
                list3.add(new EditorMusicItem(it.next(), biliEditorMusicTabListFragment.f107996d.name));
            }
        }
        Gz0.d dVar2 = biliEditorMusicTabListFragment.f107995c;
        if (dVar2 != null) {
            dVar2.f7493c = biliEditorMusicTabListFragment.f107996d.filterItems;
            dVar2.notifyDataSetChanged();
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f108061b.f108000i = false;
        BLog.e("getRecommendList", "failed");
    }
}
