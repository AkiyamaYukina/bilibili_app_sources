package com.bilibili.studio.editor.moudle.music.model;

import android.support.v4.media.session.a;
import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.editor.common.PreviewItem;
import com.bilibili.studio.videoeditor.picker.bean.AudioItem;
import com.bilibili.studio.videoeditor.util.V;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/model/EditorMusicItem.class */
@Keep
public class EditorMusicItem implements Cloneable, Serializable {
    public static final int TYPE_FIRST_REC = 1;
    public static final int TYPE_NOT_REC = 0;
    public static final int TYPE_OTHER_REC = 2;
    public int aiRecType;
    public AudioItem audioItem;
    public BMusic bMusic;
    public long bgmId;
    public List<BMusic> bindMusic;
    public String category;
    public int downloadStatus;
    public Bgm editBgm;
    public String flag;
    public long id;
    public boolean isAIRec;
    public boolean isDownloading;
    public boolean isEdit;
    public boolean isImportTutorial;
    public boolean isLocalMusic;
    public boolean isMusicLibrary;
    public boolean isRecommend;
    public boolean isSelect;
    public boolean isTemplateBind;
    public boolean isUsing;
    public String localPath;
    public String originalName;
    public int prePosition;
    public PreviewItem previewItem;

    public EditorMusicItem() {
        this.isMusicLibrary = false;
        this.isLocalMusic = false;
        this.isUsing = false;
        this.isRecommend = false;
        this.isDownloading = false;
        this.isImportTutorial = false;
        this.isEdit = false;
        this.isSelect = false;
        this.bMusic = null;
        this.isAIRec = false;
        this.isTemplateBind = false;
        this.aiRecType = 0;
        this.downloadStatus = 1;
        this.editBgm = new Bgm();
        this.previewItem = new PreviewItem();
        this.audioItem = new AudioItem();
        this.bindMusic = new ArrayList();
    }

    public EditorMusicItem(Bgm bgm, String str) {
        this();
        if (bgm != null) {
            this.previewItem = new PreviewItem(1, bgm.cover);
            this.editBgm = bgm;
            long j7 = bgm.id;
            this.id = j7;
            this.bgmId = j7;
            this.flag = a.a(new StringBuilder(), bgm.id, "");
            this.originalName = bgm.name;
            this.category = str;
            this.editBgm.category = str;
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditorMusicItem m10123clone() {
        try {
            EditorMusicItem editorMusicItem = (EditorMusicItem) super.clone();
            Bgm bgm = this.editBgm;
            if (bgm != null) {
                editorMusicItem.editBgm = bgm.m10406clone();
            }
            PreviewItem previewItem = this.previewItem;
            if (previewItem != null) {
                editorMusicItem.previewItem = previewItem.m10444clone();
            }
            AudioItem audioItem = this.audioItem;
            if (audioItem != null) {
                editorMusicItem.audioItem = audioItem.m10490clone();
            }
            BMusic bMusic = this.bMusic;
            if (bMusic != null) {
                editorMusicItem.bMusic = bMusic.mo9886clone();
            }
            if (!V.e(this.bindMusic)) {
                editorMusicItem.bindMusic = new ArrayList();
                Iterator<BMusic> it = this.bindMusic.iterator();
                while (it.hasNext()) {
                    editorMusicItem.bindMusic.add(it.next().mo9886clone());
                }
            }
            return editorMusicItem;
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public String getName() {
        return this.editBgm.name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EditorMusicItem{name=");
        sb.append(getName());
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", flag='");
        sb.append(this.flag);
        sb.append("', localPath='");
        sb.append(this.localPath);
        sb.append("', downloadStatus='");
        sb.append(this.downloadStatus);
        sb.append("', isRecommend='");
        return i.a(sb, this.isRecommend, "'}");
    }
}
