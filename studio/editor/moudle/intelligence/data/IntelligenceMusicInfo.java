package com.bilibili.studio.editor.moudle.intelligence.data;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/data/IntelligenceMusicInfo.class */
@Keep
public class IntelligenceMusicInfo {
    public String downloadUrl;
    public String localMarkPointPath;
    public String localPath;
    public String markPointDownloadUrl;
    public BgmMissionInfo missionInfo;
    public long musicId;
    public MusicMarker musicMarker;
    public int isMusicDownload = 0;
    public float volume = 1.0f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/data/IntelligenceMusicInfo$MusicMarker.class */
    @Keep
    public static class MusicMarker implements Cloneable, Serializable {
        public List<Long> markers;

        @NonNull
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public MusicMarker m10097clone() throws CloneNotSupportedException {
            try {
                MusicMarker musicMarker = (MusicMarker) super.clone();
                musicMarker.markers = new ArrayList(this.markers);
                return musicMarker;
            } catch (Exception e7) {
                e7.printStackTrace();
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MusicMarker) {
                return Objects.equals(this.markers, ((MusicMarker) obj).markers);
            }
            return false;
        }
    }
}
