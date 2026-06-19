package com.bilibili.music.podcast.data;

import androidx.annotation.Keep;
import com.bapis.bilibili.app.interfaces.v1.DeviceType;
import com.bapis.bilibili.app.listener.v1.EventTracking;
import com.bapis.bilibili.app.listener.v1.PlayInfo;
import com.bapis.bilibili.app.listener.v1.PlayItem;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.music.podcast.collection.data.FavFolderItem;
import com.bilibili.music.podcast.data.MusicPlayItem;
import com.bilibili.music.podcast.utils.InterfaceC5423c;
import com.bilibili.music.podcast.utils.InterfaceC5425e;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MusicPlayVideo.class */
@Keep
public final class MusicPlayVideo implements InterfaceC5425e, InterfaceC5423c {

    @Nullable
    private DeviceType deviceLogo;

    @Nullable
    private EventTracking eventTracking;

    @Nullable
    private Map<Long, PlayInfo> flashPlayInfoMap;
    private boolean isMiniReported;
    private long lastPart;
    private long lastPlayTime;
    private boolean mIsReported;

    @Nullable
    private PlayItem musicAssociatedItem;

    @Nullable
    private String notPlayMessage;
    private long oid;

    @Nullable
    private MusicPlayItem.Author owner;

    @Nullable
    private MusicPlayItem.MusicPlayArchive playArchive;
    private int playScene;
    private int playable;
    private long progress;
    private int reportPosition;

    @Nullable
    private MusicPlayItem.State state;

    @Nullable
    private FavFolderItem ugcSeasonInfo;
    private int itemType = -1;

    @NotNull
    private List<MusicPlayItem> parts = CollectionsKt.emptyList();

    @NotNull
    private String timeTag = "";

    public static /* synthetic */ void getItemType$annotations() {
    }

    public static /* synthetic */ void getPlayScene$annotations() {
    }

    public final boolean enableTwoCoins() {
        MusicPlayItem.MusicPlayArchive musicPlayArchive;
        MusicPlayItem.MusicPlayArchive musicPlayArchive2 = this.playArchive;
        boolean z6 = true;
        if ((musicPlayArchive2 == null || musicPlayArchive2.getCopyright() != 1) && ((musicPlayArchive = this.playArchive) == null || musicPlayArchive.getCopyright() != 3)) {
            z6 = false;
        }
        return z6;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(MusicPlayVideo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        MusicPlayVideo musicPlayVideo = (MusicPlayVideo) obj;
        return this.itemType == musicPlayVideo.itemType && this.oid == musicPlayVideo.oid;
    }

    @Nullable
    public final DeviceType getDeviceLogo() {
        return this.deviceLogo;
    }

    @Nullable
    public final EventTracking getEventTracking() {
        return this.eventTracking;
    }

    @Nullable
    public final Map<Long, PlayInfo> getFlashPlayInfoMap() {
        return this.flashPlayInfoMap;
    }

    public final int getItemType() {
        return this.itemType;
    }

    public final long getLastPart() {
        return this.lastPart;
    }

    public final long getLastPlayTime() {
        return this.lastPlayTime;
    }

    @Nullable
    public final PlayItem getMusicAssociatedItem() {
        return this.musicAssociatedItem;
    }

    @Nullable
    public final String getNotPlayMessage() {
        return this.notPlayMessage;
    }

    public final long getOid() {
        return this.oid;
    }

    @Nullable
    public final MusicPlayItem.Author getOwner() {
        return this.owner;
    }

    @NotNull
    public final List<MusicPlayItem> getParts() {
        return this.parts;
    }

    @Nullable
    public final MusicPlayItem.MusicPlayArchive getPlayArchive() {
        return this.playArchive;
    }

    public final int getPlayScene() {
        return this.playScene;
    }

    public final int getPlayable() {
        return this.playable;
    }

    public final long getProgress() {
        return this.progress;
    }

    public final int getReportPosition() {
        return this.reportPosition;
    }

    @Nullable
    public final MusicPlayItem.State getState() {
        return this.state;
    }

    @NotNull
    public final String getTimeTag() {
        return this.timeTag;
    }

    @Nullable
    public final FavFolderItem getUgcSeasonInfo() {
        return this.ugcSeasonInfo;
    }

    public int hashCode() {
        return Long.hashCode(this.oid) + (this.itemType * 31);
    }

    @Override // com.bilibili.music.podcast.utils.InterfaceC5423c
    public boolean isMiniReported() {
        return this.isMiniReported;
    }

    public final boolean isOriginalVideo() {
        MusicPlayItem.MusicPlayArchive musicPlayArchive = this.playArchive;
        boolean z6 = false;
        if (musicPlayArchive != null) {
            z6 = false;
            if (musicPlayArchive.getCopyright() == 1) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // com.bilibili.music.podcast.utils.InterfaceC5425e
    public boolean isReported() {
        return this.mIsReported;
    }

    public final boolean isShowSeasonInfo() {
        return (this.ugcSeasonInfo == null || !ConfigManager.Companion.isHitFF("podcast.listening.session.entry.show") || this.playScene == 3) ? false : true;
    }

    public final boolean isUpSpaceJumpToList() {
        return ConfigManager.Companion.isHitFF("podcast.listening.session.entry.show") && this.playScene != 3;
    }

    public final void setDeviceLogo(@Nullable DeviceType deviceType) {
        this.deviceLogo = deviceType;
    }

    public final void setEventTracking(@Nullable EventTracking eventTracking) {
        this.eventTracking = eventTracking;
    }

    public final void setFlashPlayInfoMap(@Nullable Map<Long, PlayInfo> map) {
        this.flashPlayInfoMap = map;
    }

    public final void setItemType(int i7) {
        this.itemType = i7;
    }

    public final void setLastPart(long j7) {
        this.lastPart = j7;
    }

    public final void setLastPlayTime(long j7) {
        this.lastPlayTime = j7;
    }

    @Override // com.bilibili.music.podcast.utils.InterfaceC5423c
    public void setMiniReported(boolean z6) {
        this.isMiniReported = z6;
    }

    public final void setMusicAssociatedItem(@Nullable PlayItem playItem) {
        this.musicAssociatedItem = playItem;
    }

    public final void setNotPlayMessage(@Nullable String str) {
        this.notPlayMessage = str;
    }

    public final void setOid(long j7) {
        this.oid = j7;
    }

    public final void setOwner(@Nullable MusicPlayItem.Author author) {
        this.owner = author;
    }

    public final void setParts(@NotNull List<MusicPlayItem> list) {
        this.parts = list;
    }

    public final void setPlayArchive(@Nullable MusicPlayItem.MusicPlayArchive musicPlayArchive) {
        this.playArchive = musicPlayArchive;
    }

    public final void setPlayScene(int i7) {
        this.playScene = i7;
    }

    public final void setPlayable(int i7) {
        this.playable = i7;
    }

    public final void setProgress(long j7) {
        this.progress = j7;
    }

    public final void setReportPosition(int i7) {
        this.reportPosition = i7;
    }

    @Override // com.bilibili.music.podcast.utils.InterfaceC5425e
    public void setReported(boolean z6) {
        this.mIsReported = z6;
    }

    public final void setState(@Nullable MusicPlayItem.State state) {
        this.state = state;
    }

    public final void setTimeTag(@NotNull String str) {
        this.timeTag = str;
    }

    public final void setUgcSeasonInfo(@Nullable FavFolderItem favFolderItem) {
        this.ugcSeasonInfo = favFolderItem;
    }
}
