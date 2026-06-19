package com.bilibili.lib.videoupload.utils;

import F3.G0;
import F3.H0;
import O4.b;
import androidx.annotation.Keep;
import androidx.compose.runtime.snapshots.z;
import androidx.fragment.app.A;
import androidx.room.B;
import bvc_sdk.xcode_tools.BvcXcodeKeyFrames;
import bvc_sdk.xcode_tools.BvcXcodeProbeMeta;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y3.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/utils/VideoProbeHelper.class */
public final class VideoProbeHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy<Boolean> f65129a = LazyKt.lazy(new G0(13));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy<Boolean> f65130b = LazyKt.lazy(new H0(13));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/utils/VideoProbeHelper$BvcXcodeMoov.class */
    @Keep
    public static final class BvcXcodeMoov {
        private final long offset;
        private final long size;

        public BvcXcodeMoov(long j7, long j8) {
            this.offset = j7;
            this.size = j8;
        }

        public static /* synthetic */ BvcXcodeMoov copy$default(BvcXcodeMoov bvcXcodeMoov, long j7, long j8, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j7 = bvcXcodeMoov.offset;
            }
            if ((i7 & 2) != 0) {
                j8 = bvcXcodeMoov.size;
            }
            return bvcXcodeMoov.copy(j7, j8);
        }

        public final long component1() {
            return this.offset;
        }

        public final long component2() {
            return this.size;
        }

        @NotNull
        public final BvcXcodeMoov copy(long j7, long j8) {
            return new BvcXcodeMoov(j7, j8);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BvcXcodeMoov)) {
                return false;
            }
            BvcXcodeMoov bvcXcodeMoov = (BvcXcodeMoov) obj;
            return this.offset == bvcXcodeMoov.offset && this.size == bvcXcodeMoov.size;
        }

        public final long getOffset() {
            return this.offset;
        }

        public final long getSize() {
            return this.size;
        }

        public int hashCode() {
            return Long.hashCode(this.size) + (Long.hashCode(this.offset) * 31);
        }

        @NotNull
        public String toString() {
            long j7 = this.offset;
            return android.support.v4.media.session.a.a(z.a(j7, "BvcXcodeMoov(offset=", ", size="), this.size, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/utils/VideoProbeHelper$Meta.class */
    @Keep
    public static final class Meta {

        @Nullable
        private final BvcXcodeProbeMeta.BvcXcodeAudioMeta audio_meta;

        @Nullable
        private final BvcXcodeProbeMeta.BvcXcodeCheckResult check_result;

        @Nullable
        private final BvcXcodeProbeMeta.BvcXcodeContainerMeta container_meta;

        @Nullable
        private final BvcXcodeProbeMeta.BvcXcodeVideoMeta video_meta;

        public Meta() {
            this(null, null, null, null, 15, null);
        }

        public Meta(@Nullable BvcXcodeProbeMeta.BvcXcodeVideoMeta bvcXcodeVideoMeta, @Nullable BvcXcodeProbeMeta.BvcXcodeAudioMeta bvcXcodeAudioMeta, @Nullable BvcXcodeProbeMeta.BvcXcodeContainerMeta bvcXcodeContainerMeta, @Nullable BvcXcodeProbeMeta.BvcXcodeCheckResult bvcXcodeCheckResult) {
            this.video_meta = bvcXcodeVideoMeta;
            this.audio_meta = bvcXcodeAudioMeta;
            this.container_meta = bvcXcodeContainerMeta;
            this.check_result = bvcXcodeCheckResult;
        }

        public /* synthetic */ Meta(BvcXcodeProbeMeta.BvcXcodeVideoMeta bvcXcodeVideoMeta, BvcXcodeProbeMeta.BvcXcodeAudioMeta bvcXcodeAudioMeta, BvcXcodeProbeMeta.BvcXcodeContainerMeta bvcXcodeContainerMeta, BvcXcodeProbeMeta.BvcXcodeCheckResult bvcXcodeCheckResult, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : bvcXcodeVideoMeta, (i7 & 2) != 0 ? null : bvcXcodeAudioMeta, (i7 & 4) != 0 ? null : bvcXcodeContainerMeta, (i7 & 8) != 0 ? null : bvcXcodeCheckResult);
        }

        public static /* synthetic */ Meta copy$default(Meta meta, BvcXcodeProbeMeta.BvcXcodeVideoMeta bvcXcodeVideoMeta, BvcXcodeProbeMeta.BvcXcodeAudioMeta bvcXcodeAudioMeta, BvcXcodeProbeMeta.BvcXcodeContainerMeta bvcXcodeContainerMeta, BvcXcodeProbeMeta.BvcXcodeCheckResult bvcXcodeCheckResult, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                bvcXcodeVideoMeta = meta.video_meta;
            }
            if ((i7 & 2) != 0) {
                bvcXcodeAudioMeta = meta.audio_meta;
            }
            if ((i7 & 4) != 0) {
                bvcXcodeContainerMeta = meta.container_meta;
            }
            if ((i7 & 8) != 0) {
                bvcXcodeCheckResult = meta.check_result;
            }
            return meta.copy(bvcXcodeVideoMeta, bvcXcodeAudioMeta, bvcXcodeContainerMeta, bvcXcodeCheckResult);
        }

        @Nullable
        public final BvcXcodeProbeMeta.BvcXcodeVideoMeta component1() {
            return this.video_meta;
        }

        @Nullable
        public final BvcXcodeProbeMeta.BvcXcodeAudioMeta component2() {
            return this.audio_meta;
        }

        @Nullable
        public final BvcXcodeProbeMeta.BvcXcodeContainerMeta component3() {
            return this.container_meta;
        }

        @Nullable
        public final BvcXcodeProbeMeta.BvcXcodeCheckResult component4() {
            return this.check_result;
        }

        @NotNull
        public final Meta copy(@Nullable BvcXcodeProbeMeta.BvcXcodeVideoMeta bvcXcodeVideoMeta, @Nullable BvcXcodeProbeMeta.BvcXcodeAudioMeta bvcXcodeAudioMeta, @Nullable BvcXcodeProbeMeta.BvcXcodeContainerMeta bvcXcodeContainerMeta, @Nullable BvcXcodeProbeMeta.BvcXcodeCheckResult bvcXcodeCheckResult) {
            return new Meta(bvcXcodeVideoMeta, bvcXcodeAudioMeta, bvcXcodeContainerMeta, bvcXcodeCheckResult);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Meta)) {
                return false;
            }
            Meta meta = (Meta) obj;
            return Intrinsics.areEqual(this.video_meta, meta.video_meta) && Intrinsics.areEqual(this.audio_meta, meta.audio_meta) && Intrinsics.areEqual(this.container_meta, meta.container_meta) && Intrinsics.areEqual(this.check_result, meta.check_result);
        }

        @Nullable
        public final BvcXcodeProbeMeta.BvcXcodeAudioMeta getAudio_meta() {
            return this.audio_meta;
        }

        @Nullable
        public final BvcXcodeProbeMeta.BvcXcodeCheckResult getCheck_result() {
            return this.check_result;
        }

        @Nullable
        public final BvcXcodeProbeMeta.BvcXcodeContainerMeta getContainer_meta() {
            return this.container_meta;
        }

        @Nullable
        public final BvcXcodeProbeMeta.BvcXcodeVideoMeta getVideo_meta() {
            return this.video_meta;
        }

        public int hashCode() {
            BvcXcodeProbeMeta.BvcXcodeVideoMeta bvcXcodeVideoMeta = this.video_meta;
            int iHashCode = 0;
            int iHashCode2 = bvcXcodeVideoMeta == null ? 0 : bvcXcodeVideoMeta.hashCode();
            BvcXcodeProbeMeta.BvcXcodeAudioMeta bvcXcodeAudioMeta = this.audio_meta;
            int iHashCode3 = bvcXcodeAudioMeta == null ? 0 : bvcXcodeAudioMeta.hashCode();
            BvcXcodeProbeMeta.BvcXcodeContainerMeta bvcXcodeContainerMeta = this.container_meta;
            int iHashCode4 = bvcXcodeContainerMeta == null ? 0 : bvcXcodeContainerMeta.hashCode();
            BvcXcodeProbeMeta.BvcXcodeCheckResult bvcXcodeCheckResult = this.check_result;
            if (bvcXcodeCheckResult != null) {
                iHashCode = bvcXcodeCheckResult.hashCode();
            }
            return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        }

        @NotNull
        public String toString() {
            return "Meta(video_meta=" + this.video_meta + ", audio_meta=" + this.audio_meta + ", container_meta=" + this.container_meta + ", check_result=" + this.check_result + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/utils/VideoProbeHelper$VideoMetaInfo.class */
    @Keep
    public static final class VideoMetaInfo {

        @Nullable
        private final String app_version;

        @Nullable
        private final Integer code;

        @Nullable
        private final String error;

        @Nullable
        private final Long filesize;

        @Nullable
        private final String ijkffmpeg_version;

        @Nullable
        private final List<BvcXcodeKeyFrames.BvcXcodeKeyFrame> key_frames;

        @Nullable
        private final Meta meta;

        @Nullable
        private final Integer meta_status;

        @Nullable
        private final Integer probe_code;

        @Nullable
        private final String version;

        /* JADX WARN: Multi-variable type inference failed */
        public VideoMetaInfo(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Meta meta, @Nullable Long l7, @Nullable List<? extends BvcXcodeKeyFrames.BvcXcodeKeyFrame> list) {
            this.code = num;
            this.probe_code = num2;
            this.meta_status = num3;
            this.version = str;
            this.app_version = str2;
            this.ijkffmpeg_version = str3;
            this.error = str4;
            this.meta = meta;
            this.filesize = l7;
            this.key_frames = list;
        }

        public /* synthetic */ VideoMetaInfo(Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, Meta meta, Long l7, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, num2, num3, str, str2, str3, str4, (i7 & 128) != 0 ? null : meta, (i7 & 256) != 0 ? 0L : l7, (i7 & 512) != 0 ? null : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VideoMetaInfo copy$default(VideoMetaInfo videoMetaInfo, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, Meta meta, Long l7, List list, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                num = videoMetaInfo.code;
            }
            if ((i7 & 2) != 0) {
                num2 = videoMetaInfo.probe_code;
            }
            if ((i7 & 4) != 0) {
                num3 = videoMetaInfo.meta_status;
            }
            if ((i7 & 8) != 0) {
                str = videoMetaInfo.version;
            }
            if ((i7 & 16) != 0) {
                str2 = videoMetaInfo.app_version;
            }
            if ((i7 & 32) != 0) {
                str3 = videoMetaInfo.ijkffmpeg_version;
            }
            if ((i7 & 64) != 0) {
                str4 = videoMetaInfo.error;
            }
            if ((i7 & 128) != 0) {
                meta = videoMetaInfo.meta;
            }
            if ((i7 & 256) != 0) {
                l7 = videoMetaInfo.filesize;
            }
            if ((i7 & 512) != 0) {
                list = videoMetaInfo.key_frames;
            }
            return videoMetaInfo.copy(num, num2, num3, str, str2, str3, str4, meta, l7, list);
        }

        @Nullable
        public final Integer component1() {
            return this.code;
        }

        @Nullable
        public final List<BvcXcodeKeyFrames.BvcXcodeKeyFrame> component10() {
            return this.key_frames;
        }

        @Nullable
        public final Integer component2() {
            return this.probe_code;
        }

        @Nullable
        public final Integer component3() {
            return this.meta_status;
        }

        @Nullable
        public final String component4() {
            return this.version;
        }

        @Nullable
        public final String component5() {
            return this.app_version;
        }

        @Nullable
        public final String component6() {
            return this.ijkffmpeg_version;
        }

        @Nullable
        public final String component7() {
            return this.error;
        }

        @Nullable
        public final Meta component8() {
            return this.meta;
        }

        @Nullable
        public final Long component9() {
            return this.filesize;
        }

        @NotNull
        public final VideoMetaInfo copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Meta meta, @Nullable Long l7, @Nullable List<? extends BvcXcodeKeyFrames.BvcXcodeKeyFrame> list) {
            return new VideoMetaInfo(num, num2, num3, str, str2, str3, str4, meta, l7, list);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoMetaInfo)) {
                return false;
            }
            VideoMetaInfo videoMetaInfo = (VideoMetaInfo) obj;
            return Intrinsics.areEqual(this.code, videoMetaInfo.code) && Intrinsics.areEqual(this.probe_code, videoMetaInfo.probe_code) && Intrinsics.areEqual(this.meta_status, videoMetaInfo.meta_status) && Intrinsics.areEqual(this.version, videoMetaInfo.version) && Intrinsics.areEqual(this.app_version, videoMetaInfo.app_version) && Intrinsics.areEqual(this.ijkffmpeg_version, videoMetaInfo.ijkffmpeg_version) && Intrinsics.areEqual(this.error, videoMetaInfo.error) && Intrinsics.areEqual(this.meta, videoMetaInfo.meta) && Intrinsics.areEqual(this.filesize, videoMetaInfo.filesize) && Intrinsics.areEqual(this.key_frames, videoMetaInfo.key_frames);
        }

        @Nullable
        public final String getApp_version() {
            return this.app_version;
        }

        @Nullable
        public final Integer getCode() {
            return this.code;
        }

        @Nullable
        public final String getError() {
            return this.error;
        }

        @Nullable
        public final Long getFilesize() {
            return this.filesize;
        }

        @Nullable
        public final String getIjkffmpeg_version() {
            return this.ijkffmpeg_version;
        }

        @Nullable
        public final List<BvcXcodeKeyFrames.BvcXcodeKeyFrame> getKey_frames() {
            return this.key_frames;
        }

        @Nullable
        public final Meta getMeta() {
            return this.meta;
        }

        @Nullable
        public final Integer getMeta_status() {
            return this.meta_status;
        }

        @Nullable
        public final Integer getProbe_code() {
            return this.probe_code;
        }

        @Nullable
        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            Integer num = this.code;
            int iHashCode = 0;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            Integer num2 = this.probe_code;
            int iHashCode3 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.meta_status;
            int iHashCode4 = num3 == null ? 0 : num3.hashCode();
            String str = this.version;
            int iHashCode5 = str == null ? 0 : str.hashCode();
            String str2 = this.app_version;
            int iHashCode6 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.ijkffmpeg_version;
            int iHashCode7 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.error;
            int iHashCode8 = str4 == null ? 0 : str4.hashCode();
            Meta meta = this.meta;
            int iHashCode9 = meta == null ? 0 : meta.hashCode();
            Long l7 = this.filesize;
            int iHashCode10 = l7 == null ? 0 : l7.hashCode();
            List<BvcXcodeKeyFrames.BvcXcodeKeyFrame> list = this.key_frames;
            if (list != null) {
                iHashCode = list.hashCode();
            }
            return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode;
        }

        @NotNull
        public String toString() {
            Integer num = this.code;
            Integer num2 = this.probe_code;
            Integer num3 = this.meta_status;
            String str = this.version;
            String str2 = this.app_version;
            String str3 = this.ijkffmpeg_version;
            String str4 = this.error;
            Meta meta = this.meta;
            Long l7 = this.filesize;
            List<BvcXcodeKeyFrames.BvcXcodeKeyFrame> list = this.key_frames;
            StringBuilder sbB = A.b("VideoMetaInfo(code=", num, ", probe_code=", num2, ", meta_status=");
            c.a(num3, ", version=", str, ", app_version=", sbB);
            B.a(str2, ", ijkffmpeg_version=", str3, ", error=", sbB);
            sbB.append(str4);
            sbB.append(", meta=");
            sbB.append(meta);
            sbB.append(", filesize=");
            sbB.append(l7);
            sbB.append(", key_frames=");
            sbB.append(list);
            sbB.append(")");
            return sbB.toString();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/utils/VideoProbeHelper$a.class */
    public static final class a {
        public static boolean a() {
            Boolean bool = (Boolean) ConfigManager.Companion.ab().get("uper.use_videocloud_sdk_v3", Boolean.FALSE);
            return bool != null ? bool.booleanValue() : false;
        }

        @JvmStatic
        public static void b(@NotNull String str, int i7, int i8, int i9, @Nullable String str2, long j7, @NotNull String str3, @Nullable String str4, @Nullable String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
            HashMap mapC = b.c("type", str);
            P4.b.a(i7, mapC, "defenderCod", i8, "probe_code");
            mapC.put("meta_status", String.valueOf(i9));
            String str10 = str2;
            if (str2 == null) {
                str10 = "";
            }
            mapC.put("bvcVersion", str10);
            mapC.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(j7));
            mapC.put("fileSize", str3);
            String str11 = str4;
            if (str4 == null) {
                str11 = "";
            }
            mapC.put("ijkffmpegVersion", str11);
            String str12 = str5;
            if (str5 == null) {
                str12 = "";
            }
            mapC.put("error", str12);
            mapC.put("path", str6);
            mapC.put("cid", str7);
            mapC.put("filename", str8);
            mapC.put("metaData", str9);
            Neurons.trackT(false, "creation.upload.bvc-meta-probe-key-frames.track", mapC, 1, new AT0.c(8));
        }

        public static void d(@NotNull String str, @Nullable Long l7, @Nullable Long l8, long j7, @Nullable String str2, @NotNull String str3, @Nullable String str4) {
            HashMap mapC = b.c("type", str);
            mapC.put("moovSize", String.valueOf(l7 != null ? l7.longValue() : 0L));
            long jLongValue = 0;
            if (l8 != null) {
                jLongValue = l8.longValue();
            }
            mapC.put("moovOffset", String.valueOf(jLongValue));
            mapC.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(j7));
            String str5 = str2;
            if (str2 == null) {
                str5 = "";
            }
            mapC.put("error", str5);
            mapC.put("path", str3);
            String str6 = str4;
            if (str4 == null) {
                str6 = "";
            }
            mapC.put("cid", str6);
            Neurons.trackT(false, "creation.upload.bvc-meta-moov.track", mapC, 1, new AT0.c(8));
        }
    }
}
