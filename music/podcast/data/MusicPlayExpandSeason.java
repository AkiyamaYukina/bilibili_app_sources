package com.bilibili.music.podcast.data;

import androidx.annotation.Keep;
import gi0.InterfaceC7299C;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MusicPlayExpandSeason.class */
@Keep
public final class MusicPlayExpandSeason implements InterfaceC7299C<MusicPlayItem> {
    private boolean mIsExpandable;
    private boolean mIsSelected;

    @NotNull
    private final MusicPlayVideo video;

    public MusicPlayExpandSeason(@NotNull MusicPlayVideo musicPlayVideo) {
        this.video = musicPlayVideo;
    }

    @Override // gi0.InterfaceC7299C
    public int getItemCount() {
        return this.video.getParts().size();
    }

    @NotNull
    public List<MusicPlayItem> getItems() {
        return this.video.getParts();
    }

    public long getOId() {
        return this.video.getOid();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getTitle() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.music.podcast.data.MusicPlayVideo r0 = r0.video
            com.bilibili.music.podcast.data.MusicPlayItem$MusicPlayArchive r0 = r0.getPlayArchive()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L17
            r0 = r3
            java.lang.String r0 = r0.getTitle()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1a
        L17:
            java.lang.String r0 = ""
            r3 = r0
        L1a:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.data.MusicPlayExpandSeason.getTitle():java.lang.String");
    }

    @NotNull
    public final MusicPlayVideo getVideo() {
        return this.video;
    }

    @Override // gi0.InterfaceC7299C
    public boolean isCanExpand() {
        boolean z6 = true;
        if (getItemCount() <= 1) {
            z6 = false;
        }
        return z6;
    }

    @Override // gi0.InterfaceC7299C
    public boolean isExpanded() {
        return isCanExpand() ? this.mIsExpandable : false;
    }

    @Override // gi0.InterfaceC7299C
    public boolean isSelected() {
        return this.mIsSelected;
    }

    @Override // gi0.InterfaceC7299C
    public void setExpanded(boolean z6) {
        if (isCanExpand()) {
            this.mIsExpandable = z6;
        }
    }

    @Override // gi0.InterfaceC7299C
    public void setSelected(boolean z6) {
        this.mIsSelected = z6;
    }
}
