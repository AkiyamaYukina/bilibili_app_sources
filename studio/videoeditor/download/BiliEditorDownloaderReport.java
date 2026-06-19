package com.bilibili.studio.videoeditor.download;

import F3.C6;
import com.bilibili.adcommon.utils.i;
import com.bilibili.biligame.api.cloudgame.bean.BCGToken;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.live.streaming.service.PlaybackCaptureService;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/download/BiliEditorDownloaderReport.class */
public final class BiliEditorDownloaderReport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Map<Long, DownloadRequest> f109432a = new LinkedHashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/download/BiliEditorDownloaderReport$DownloadState.class */
    public static final class DownloadState {
        private static final EnumEntries $ENTRIES;
        private static final DownloadState[] $VALUES;
        private final int code;

        @Nullable
        private final String msg;
        public static final DownloadState START = new DownloadState("START", 0, 0, "start");
        public static final DownloadState SUCCESS = new DownloadState(BCGToken.SCHEDULE_STATUS_SUCCESS, 1, 1, "success");
        public static final DownloadState FAIL = new DownloadState("FAIL", 2, 2, "fail");
        public static final DownloadState CANCEL = new DownloadState("CANCEL", 3, 3, "cancel");

        private static final /* synthetic */ DownloadState[] $values() {
            return new DownloadState[]{START, SUCCESS, FAIL, CANCEL};
        }

        static {
            DownloadState[] downloadStateArr$values = $values();
            $VALUES = downloadStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(downloadStateArr$values);
        }

        private DownloadState(String str, int i7, int i8, String str2) {
            this.code = i8;
            this.msg = str2;
        }

        @NotNull
        public static EnumEntries<DownloadState> getEntries() {
            return $ENTRIES;
        }

        public static DownloadState valueOf(String str) {
            return (DownloadState) Enum.valueOf(DownloadState.class, str);
        }

        public static DownloadState[] values() {
            return (DownloadState[]) $VALUES.clone();
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final String getMsg() {
            return this.msg;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/download/BiliEditorDownloaderReport$DownloadType.class */
    public static final class DownloadType {
        private static final EnumEntries $ENTRIES;
        private static final DownloadType[] $VALUES;
        private final int code;
        public static final DownloadType OLD = new DownloadType("OLD", 0, 0);
        public static final DownloadType NEW = new DownloadType("NEW", 1, 1);

        private static final /* synthetic */ DownloadType[] $values() {
            return new DownloadType[]{OLD, NEW};
        }

        static {
            DownloadType[] downloadTypeArr$values = $values();
            $VALUES = downloadTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(downloadTypeArr$values);
        }

        private DownloadType(String str, int i7, int i8) {
            this.code = i8;
        }

        @NotNull
        public static EnumEntries<DownloadType> getEntries() {
            return $ENTRIES;
        }

        public static DownloadType valueOf(String str) {
            return (DownloadType) Enum.valueOf(DownloadType.class, str);
        }

        public static DownloadType[] values() {
            return (DownloadType[]) $VALUES.clone();
        }

        public final int getCode() {
            return this.code;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/download/BiliEditorDownloaderReport$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f109433a;

        static {
            int[] iArr = new int[DownloadType.values().length];
            try {
                iArr[DownloadType.OLD.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[DownloadType.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f109433a = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static void a(long j7, @NotNull DownloadType downloadType, @NotNull DownloadState downloadState, @Nullable String str, long j8) throws NoWhenBranchMatchedException {
        Map<Long, DownloadRequest> map = f109432a;
        DownloadRequest downloadRequest = (DownloadRequest) ((LinkedHashMap) map).get(Long.valueOf(j7));
        if (downloadRequest != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("download_type", String.valueOf(downloadType.getCode()));
            String str2 = downloadRequest.materialId;
            linkedHashMap.put("material_id", str2 != null ? str2.toString() : null);
            linkedHashMap.put(PlaybackCaptureService.KEY_RESULT_CODE, String.valueOf(downloadState.getCode()));
            linkedHashMap.put("error_code", str);
            linkedHashMap.put("track_from", downloadRequest.trackFrom);
            linkedHashMap.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(j8));
            if (downloadState != DownloadState.START) {
                map.remove(Long.valueOf(j7));
            }
            Neurons.trackT(false, "editor-basic.material.download.bili", linkedHashMap, 1, new C6(5));
            int i7 = a.f109433a[downloadType.ordinal()];
            if (i7 == 1) {
                i.a("旧组件下载：old downloader:id is ", downloadRequest.materialId, ",  download state is ", downloadState.getMsg(), "reportDownloadStateTag");
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i.a("新组件下载：new downloader:id is ", downloadRequest.materialId, ",  download state is ", downloadState.getMsg(), "reportDownloadStateTag");
            }
        }
    }
}
