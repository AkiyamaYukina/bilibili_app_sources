package com.bilibili.studio.editor.moudle.musicv3.ui;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.studio.editor.moudle.intelligence.music.api.bean.MusicResponse;
import com.bilibili.studio.editor.moudle.musicv3.net.bean.EditorRecommendItemBean;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/x.class */
public final class x extends BiliApiDataCallback<MusicResponse> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliEditorMusicTabListFragment f108063b;

    public x(BiliEditorMusicTabListFragment biliEditorMusicTabListFragment) {
        this.f108063b = biliEditorMusicTabListFragment;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(MusicResponse musicResponse) {
        MusicResponse musicResponse2 = musicResponse;
        if (musicResponse2 != null) {
            String str = Jz0.f.f11746a;
            Jz0.f.f11749d = musicResponse2.getCursorBean();
            StringBuilder sb = new StringBuilder();
            List<MusicResponse.Music> musics = musicResponse2.getMusics();
            if (musics != null) {
                for (MusicResponse.Music music : musics) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(music.getSid());
                }
            }
            if (Jz0.f.f11750e.length() > 0) {
                Jz0.f.f11750e = Jz0.f.f11750e + "," + ((Object) sb);
            } else {
                Jz0.f.f11750e = sb.toString();
            }
            if (sb.toString().length() > 0) {
                String string = sb.toString();
                BiliEditorMusicTabListFragment biliEditorMusicTabListFragment = this.f108063b;
                biliEditorMusicTabListFragment.getClass();
                BiliCall<GeneralResponse<EditorRecommendItemBean>> recommendList = ((Iz0.a) ServiceGenerator.createService(Iz0.a.class)).getRecommendList(string);
                if (recommendList != null) {
                    recommendList.enqueue(new v(biliEditorMusicTabListFragment));
                }
            }
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f108063b.f108000i = false;
    }
}
