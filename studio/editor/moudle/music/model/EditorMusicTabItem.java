package com.bilibili.studio.editor.moudle.music.model;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.bgm.BgmTab;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/model/EditorMusicTabItem.class */
@Keep
public class EditorMusicTabItem implements Comparable<EditorMusicTabItem>, Cloneable, Serializable {
    public List<EditorMusicItem> filterItems;
    public int id;
    public String name;
    public int rank;
    public int startPosition;
    public int type;

    public EditorMusicTabItem() {
        this.name = "";
        this.filterItems = new ArrayList();
        this.startPosition = 0;
    }

    public EditorMusicTabItem(BgmTab bgmTab) {
        this();
        update(bgmTab);
        ArrayList<Bgm> arrayList = bgmTab.children;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        for (Bgm bgm : arrayList) {
            if (bgm != null) {
                this.filterItems.add(new EditorMusicItem(bgm, this.name));
            }
        }
    }

    private void update(BgmTab bgmTab) {
        this.id = (int) bgmTab.id;
        String str = bgmTab.name;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        this.name = str2;
    }

    public void add(int i7, EditorMusicItem editorMusicItem) {
        this.filterItems.add(i7, editorMusicItem);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditorMusicTabItem m10124clone() {
        try {
            return (EditorMusicTabItem) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull EditorMusicTabItem editorMusicTabItem) {
        return this.rank - editorMusicTabItem.rank;
    }
}
