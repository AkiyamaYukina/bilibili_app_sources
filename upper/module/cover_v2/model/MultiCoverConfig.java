package com.bilibili.upper.module.cover_v2.model;

import JH0.a;
import KH0.e;
import OH0.b;
import OH0.k;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.upper.module.cover_v2.draft.MultiCoverDraft;
import com.tencent.connect.share.QzonePublish;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Objects;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/MultiCoverConfig.class */
@Keep
public class MultiCoverConfig {

    @JSONField(name = "coverKey")
    private String coverKey;

    @JSONField(name = "inputImagePath")
    private String inputImagePath;

    @JSONField(name = "inputTypeId")
    private String inputTypeId;

    @JSONField(name = "inputVideoPath")
    private String inputVideoPath;

    @JSONField(deserialize = false, serialize = false)
    private b mainStrategy;

    @JSONField(name = "outputImagePath")
    private String outputImagePath;

    @JSONField(name = "pageFrom")
    private String pageFrom;

    @JSONField(name = "selectedPath")
    private String selectedPath;

    @JSONField(name = QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE)
    private int[] videoSize;

    @JSONField(name = "videoRatio")
    private float videoRatio = 1.3333334f;

    @JSONField(name = QzonePublish.PUBLISH_TO_QZONE_VIDEO_DURATION)
    private long videoDuration = 3000000;

    @JSONField(name = "currentSeekTime")
    private long currentSeekTime = TransitionInfo.DEFAULT_DURATION;

    @JSONField(deserialize = false, serialize = false)
    private RectF videoTouchRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    public MultiCoverConfig() {
        int i7 = e.f12733a;
        this.mainStrategy = e.f12737e;
    }

    private int[] calculateVideoSize() {
        getSelectedMaterialSize();
        int i7 = e.f12733a;
        int i8 = e.f12733a;
        return new int[]{(((int) (i8 * 1.3333334f)) + 3) & (-4), (i8 + 1) & (-2)};
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long getSelectedMaterialDuration() throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = r5
            java.lang.String r0 = r0.inputVideoPath
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            r0 = r5
            java.lang.String r0 = r0.inputVideoPath
            long r0 = lJ0.l.b(r0)
            r7 = r0
        L12:
            r0 = r7
            r1 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r1
            r7 = r0
            goto L36
        L1b:
            int r0 = KH0.e.f12733a
            r6 = r0
            r0 = r5
            java.lang.String r0 = r0.selectedPath
            boolean r0 = KH0.e.a(r0)
            if (r0 == 0) goto L34
            r0 = r5
            java.lang.String r0 = r0.selectedPath
            long r0 = lJ0.l.b(r0)
            r7 = r0
            goto L12
        L34:
            r0 = 0
            r7 = r0
        L36:
            r0 = r7
            r9 = r0
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L44
            r0 = 3000000(0x2dc6c0, double:1.482197E-317)
            r9 = r0
        L44:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.cover_v2.model.MultiCoverConfig.getSelectedMaterialDuration():long");
    }

    public static String getSubCoverKey(String str) {
        String strConcat = str;
        if (str != null) {
            strConcat = str.concat("-sub");
        }
        return strConcat;
    }

    private String maskEmpty(String str) {
        if (str == null || str.isEmpty()) {
            str = null;
        }
        return str;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public MultiCoverConfig m10653clone() {
        return (MultiCoverConfig) JSON.parseObject(JSON.toJSONString(this), MultiCoverConfig.class);
    }

    public float cropAspectX() {
        return this.mainStrategy.d();
    }

    public float cropAspectY() {
        return this.mainStrategy.g();
    }

    public float cropRatio() {
        return cropAspectX() / cropAspectY();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MultiCoverConfig)) {
            return false;
        }
        MultiCoverConfig multiCoverConfig = (MultiCoverConfig) obj;
        boolean z6 = false;
        if (this.videoRatio == multiCoverConfig.videoRatio) {
            z6 = false;
            if (Arrays.equals(this.videoSize, multiCoverConfig.videoSize)) {
                z6 = false;
                if (this.videoDuration == multiCoverConfig.videoDuration) {
                    z6 = false;
                    if (Objects.equals(this.inputVideoPath, multiCoverConfig.inputVideoPath)) {
                        z6 = false;
                        if (Objects.equals(this.inputImagePath, multiCoverConfig.inputImagePath)) {
                            z6 = false;
                            if (Objects.equals(this.outputImagePath, multiCoverConfig.outputImagePath)) {
                                z6 = false;
                                if (Objects.equals(this.selectedPath, multiCoverConfig.selectedPath)) {
                                    z6 = false;
                                    if (this.currentSeekTime == multiCoverConfig.currentSeekTime) {
                                        z6 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z6;
    }

    public String getCoverKey() {
        return this.coverKey;
    }

    public long getCurrentSeekTime() {
        return this.currentSeekTime;
    }

    public String getInputImagePath() {
        return this.inputImagePath;
    }

    public String getInputTypeId() {
        return this.inputTypeId;
    }

    public String getInputVideoPath() {
        return this.inputVideoPath;
    }

    public b getMainStrategy() {
        return this.mainStrategy;
    }

    public String getOutputImagePath() {
        return this.outputImagePath;
    }

    public String getPageFrom() {
        return this.pageFrom;
    }

    public int[] getSelectedMaterialSize() {
        boolean z6;
        int attributeInt;
        try {
            int i7 = e.f12733a;
            if (e.a(this.selectedPath)) {
                return SH0.b.a(this.selectedPath);
            }
            String str = this.selectedPath;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            try {
                attributeInt = new ExifInterface(str).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                z6 = true;
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            if (attributeInt != 6) {
                z6 = true;
                if (attributeInt != 8) {
                    z6 = false;
                }
            }
            return new int[]{z6 ? options.outHeight : options.outWidth, z6 ? options.outWidth : options.outHeight};
        } catch (Exception e8) {
            e8.printStackTrace();
            int i8 = e.f12733a;
            return new int[]{i8, i8};
        }
    }

    public String getSelectedPath() {
        return this.selectedPath;
    }

    public String getSubCoverKey() {
        return getSubCoverKey(this.coverKey);
    }

    public long getVideoDuration() {
        return this.videoDuration;
    }

    public float getVideoRatio() {
        return this.videoRatio;
    }

    public int[] getVideoSize() {
        return this.videoSize;
    }

    public RectF getVideoTouchRect() {
        return this.videoTouchRect;
    }

    public boolean isValidate() {
        return (this.inputVideoPath == null && this.inputImagePath == null) ? false : true;
    }

    public void parseIntent(Intent intent, boolean z6) {
        Bundle bundleExtra = intent.getBundleExtra("param_control");
        if (bundleExtra != null) {
            b bVar = (b) ((LinkedHashMap) k.f17857b.f17858a).get(bundleExtra.getString("coverEditStrategyId", "4:3_16:9"));
            this.mainStrategy = bVar;
            if (bVar == null) {
                this.mainStrategy = e.f12737e;
            }
            this.pageFrom = bundleExtra.getString("page_from");
            this.inputTypeId = bundleExtra.getString("input_type_id");
            this.inputVideoPath = bundleExtra.getString("input_video_path");
            this.inputImagePath = bundleExtra.getString("input_image_path");
            this.outputImagePath = bundleExtra.getString("output_image_path");
            this.selectedPath = bundleExtra.getString("input_selected_path");
            this.coverKey = bundleExtra.getString("input_cover_key");
            if (z6) {
                this.currentSeekTime = bundleExtra.getLong("key_cover_pos", 0L);
            } else {
                this.currentSeekTime = bundleExtra.getLong("key_sub_cover_pos", 0L);
            }
            String str = this.coverKey;
            if (str != null) {
                SharedPreferencesHelper sharedPreferencesHelper = a.f11357a;
                MultiCoverDraft multiCoverDraftE = a.e(str);
                if (multiCoverDraftE != null) {
                    a.g(this, multiCoverDraftE.getConfig());
                }
            }
            if (this.selectedPath == null) {
                String str2 = this.inputVideoPath;
                if (str2 == null) {
                    str2 = this.inputImagePath;
                }
                this.selectedPath = str2;
            }
            updateConfigs();
            updateVideoSize();
        }
        BLog.e("MultiCoverConfig", "parseIntent: " + this);
    }

    public void setCoverKey(String str) {
        this.coverKey = str;
    }

    public void setCurrentSeekTime(long j7) {
        this.currentSeekTime = j7;
    }

    public void setInputImagePath(String str) {
        this.inputImagePath = str;
    }

    public void setInputTypeId(String str) {
        this.inputTypeId = str;
    }

    public void setInputVideoPath(String str) {
        this.inputVideoPath = str;
    }

    public void setMainStrategy(b bVar) {
        this.mainStrategy = bVar;
    }

    public void setOutputImagePath(String str) {
        this.outputImagePath = str;
    }

    public void setPageFrom(String str) {
        this.pageFrom = str;
    }

    public void setSelectedPath(String str) {
        this.selectedPath = str;
    }

    public void setVideoDuration(long j7) {
        this.videoDuration = j7;
    }

    public void setVideoRatio(float f7) {
        this.videoRatio = f7;
    }

    public void setVideoSize(int[] iArr) {
        this.videoSize = iArr;
    }

    public void setVideoTouchRect(RectF rectF) {
        this.videoTouchRect = rectF;
    }

    @NonNull
    public String toString() {
        return JSON.toJSONString(this);
    }

    public void updateConfigs() {
        this.inputVideoPath = maskEmpty(this.inputVideoPath);
        this.inputImagePath = maskEmpty(this.inputImagePath);
        this.outputImagePath = maskEmpty(this.outputImagePath);
        this.selectedPath = maskEmpty(this.selectedPath);
        if (this.videoSize == null) {
            calculateVideoSize();
        }
    }

    public void updateVideoSize() {
        this.videoSize = calculateVideoSize();
        this.videoDuration = getSelectedMaterialDuration();
        if (this.videoSize.length == 2) {
            this.videoRatio = r0[0] / r0[1];
        }
    }
}
