package com.bilibili.studio.videoeditor.capturev3.schema;

import B0.b;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.graphics.O;
import androidx.fragment.app.z;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureStickerTopicBean;
import com.bilibili.studio.videoeditor.util.S;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/schema/CaptureSchema.class */
@Keep
public class CaptureSchema implements Serializable {
    private static final String COOPERATE_ID = "cooperate_id";
    private static final String FILTER_ID = "filter_id";
    public static final int INVALID_ID = 0;
    public static final String INVALID_ID_STRING = "";
    public static final String JUMP_PARAMS_EXTRA = "extra";
    private static final String JUMP_PARAMS_FROM = "from";
    public static final String JUMP_PARAMS_MATERIAL_FROM = "material_from";
    public static final String JUMP_PARAMS_RELATION_FROM = "relation_from";
    public static final String MATERIAL_INDEX = "material_index";
    private static final String MISSION_ACTIVITY_NAME = "activity_name";
    private static final String MISSION_BGM_ID = "bgm_id";
    private static final String MISSION_BGM_NAME = "bgm_name";
    public static final String MISSION_ID = "mission_id";
    public static final String MISSION_NAME = "mission_name";
    private static final String MISSION_STICKER_ID = "sticker_id";
    private static final String MISSION_STICKER_ID_V2 = "sticker_id_v2";

    @Deprecated
    public static final String OLD_INVALID_ID_STRING = "-1";
    private static final String ORIGIN_TOPIC_ID = "origin_tid";
    public static final String POST_CONFIG = "post_config";
    private static final String RELATION_FROM_COOPERATE = "cooperate";
    public static final String TOPIC_ID = "topic_id";
    public static final String TOPIC_NAME = "topic_name";
    public static final String TOPIC_PARENT = "topic_parent";

    @Nullable
    private PostConfig mPostConfig;

    @Nullable
    private SchemaInfo mSchemaInfo;
    private int mFrom = 0;
    private boolean isDraftSchemaUseCooperateTopicId = false;
    private int mMaterialIndex = 0;
    private int mFilterId = 0;
    private Map<String, String> mKeyValues = new HashMap(4);

    @NonNull
    private MissionInfo mMissionInfo = new MissionInfo();

    @NonNull
    private CaptureCooperate mCaptureCooperate = new CaptureCooperate();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/schema/CaptureSchema$CaptureCooperate.class */
    @Keep
    public static class CaptureCooperate implements Serializable {
        private long mCoorperateId = 0;
        private boolean mShouldResetCorporate = false;

        public long getCoorperateId() {
            return this.mCoorperateId;
        }

        public boolean getShouldResetCorporate() {
            return this.mShouldResetCorporate;
        }

        public void setCoorperateId(long j7) {
            this.mCoorperateId = j7;
        }

        public void setShouldResetCorporate(boolean z6) {
            this.mShouldResetCorporate = z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/schema/CaptureSchema$MissionInfo.class */
    @Keep
    public static class MissionInfo implements Serializable {
        private boolean fromCooperate;
        private boolean isCooperateTopicId;
        private boolean isStickerTopicId;

        @Nullable
        private String mActivityName;
        private long mBgmId;

        @Nullable
        private String mBgmName;
        private boolean mChangedBgm;

        @Nullable
        private String mJumpParams;
        private int mMissionId;

        @Nullable
        private String mMissionName;
        private long mStartTime;
        private int mStickerId;
        private int mStickerIdV2;
        private int mTopicId;

        @Nullable
        private String mTopicName;
        private int originTopicId;

        public MissionInfo() {
            this.mActivityName = "";
            this.mMissionName = "";
            this.mMissionId = 0;
            this.mBgmId = 0L;
            this.mTopicName = "";
            this.mTopicId = 0;
            this.mBgmName = "";
            this.mStickerId = 0;
            this.mStickerIdV2 = 0;
            this.mStartTime = 0L;
            this.fromCooperate = false;
            this.isCooperateTopicId = false;
            this.isStickerTopicId = false;
            this.originTopicId = 0;
        }

        public MissionInfo(int i7, @Nullable String str, int i8, long j7, @Nullable String str2) {
            this.mActivityName = "";
            this.mTopicName = "";
            this.mTopicId = 0;
            this.mStickerId = 0;
            this.mStickerIdV2 = 0;
            this.mStartTime = 0L;
            this.fromCooperate = false;
            this.isCooperateTopicId = false;
            this.isStickerTopicId = false;
            this.originTopicId = 0;
            this.mMissionId = i8;
            this.mMissionName = str;
            this.mBgmId = j7;
            this.mBgmName = str2;
        }

        @Nullable
        public String getActivityName() {
            String str = this.mActivityName;
            return (str == null || str.length() <= 0) ? this.mMissionName : this.mActivityName;
        }

        public long getBgmId() {
            return this.mBgmId;
        }

        @Nullable
        public String getBgmName() {
            return this.mBgmName;
        }

        @Nullable
        public String getJumpParam() {
            return this.mJumpParams;
        }

        public int getMissionId() {
            return this.mMissionId;
        }

        @Nullable
        public String getMissionName() {
            return this.mMissionName;
        }

        public int getOriginTopicId() {
            return this.originTopicId;
        }

        public long getStartTime() {
            return this.mStartTime;
        }

        public int getStickerId() {
            return this.mStickerId;
        }

        public int getStickerIdV2() {
            return this.mStickerIdV2;
        }

        public int getTopicId() {
            return this.mTopicId;
        }

        @Nullable
        public String getTopicName() {
            return this.mTopicName;
        }

        public boolean isChangedBgm() {
            return this.mChangedBgm;
        }

        public boolean isCooperateTopicId() {
            return this.isCooperateTopicId;
        }

        public boolean isFromCooperate() {
            return this.fromCooperate;
        }

        public boolean isStickerTopicId() {
            return this.isStickerTopicId;
        }

        public void resetByTopicId(int i7) {
            setTopicId(i7);
            setTopicName("");
            setMissionId(0);
            setMissionName("");
        }

        public void resetJumpParamsTopicId(int i7) {
            String str = this.mJumpParams;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            this.mJumpParams = str2.replaceAll("topic_id=[0-9]*", "topic_id=" + i7);
        }

        public void setActivityName(@Nullable String str) {
            this.mActivityName = str;
        }

        public void setBgmId(long j7) {
            this.mBgmId = j7;
        }

        public void setBgmName(@Nullable String str) {
            this.mBgmName = str;
        }

        public void setCooperateTopicId(boolean z6) {
            this.isCooperateTopicId = z6;
        }

        public void setFromCooperate(boolean z6) {
            this.fromCooperate = z6;
        }

        public void setIsChangedBgm(boolean z6) {
            this.mChangedBgm = z6;
        }

        public void setJumpParams(@Nullable String str) {
            this.mJumpParams = str;
        }

        public void setMissionId(int i7) {
            this.mMissionId = i7;
        }

        public void setMissionName(@Nullable String str) {
            this.mMissionName = str;
        }

        public void setOriginTopicId(int i7) {
            this.originTopicId = i7;
        }

        public void setStartTime(long j7) {
            this.mStartTime = j7;
        }

        public void setStickerId(int i7) {
            this.mStickerId = i7;
        }

        public void setStickerIdV2(int i7) {
            this.mStickerIdV2 = i7;
        }

        public void setStickerTopicId(boolean z6) {
            this.isStickerTopicId = z6;
        }

        public void setTopicId(int i7) {
            this.mTopicId = i7;
        }

        public void setTopicName(@Nullable String str) {
            this.mTopicName = str;
        }

        public String toString() {
            return "missionInfo : mMissionId = " + this.mMissionId + ", mMissionName = " + this.mMissionName + ", mTopicId = " + this.mTopicId + ", mTopicName = " + this.mTopicName;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/schema/CaptureSchema$PostConfig.class */
    @Keep
    public static class PostConfig implements Serializable {

        @Nullable
        @JSONField(name = "first_entrance")
        private String firstEntrance;

        @Nullable
        @JSONField(name = "send_channel")
        private String sendChannel;

        @Nullable
        @JSONField(name = "send_type")
        private String sendType;

        public PostConfig() {
        }

        public PostConfig(@Nullable String str) {
            this.firstEntrance = str;
        }

        @Nullable
        public String getFirstEntrance() {
            return this.firstEntrance;
        }

        @Nullable
        public String getSendChannel() {
            return this.sendChannel;
        }

        @Nullable
        public String getSendType() {
            return this.sendType;
        }

        public void setFirstEntrance(@Nullable String str) {
            this.firstEntrance = str;
        }

        public void setSendChannel(@Nullable String str) {
            this.sendChannel = str;
        }

        public void setSendType(@Nullable String str) {
            this.sendType = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/schema/CaptureSchema$SchemaInfo.class */
    @Keep
    public static class SchemaInfo implements Serializable {

        @Nullable
        private String mOriginRelationFrom;

        @Nullable
        private String mRelationFrom;

        public SchemaInfo() {
        }

        public SchemaInfo(@Nullable String str, @Nullable String str2) {
            this.mRelationFrom = str;
            this.mOriginRelationFrom = str2;
        }

        @Nullable
        public String getOriginRelationFrom() {
            return this.mOriginRelationFrom;
        }

        @Nullable
        public String getRelationFrom() {
            return this.mRelationFrom;
        }

        public void setOriginRelationFrom(@Nullable String str) {
            this.mOriginRelationFrom = str;
        }

        public void setRelationFrom(@Nullable String str) {
            this.mRelationFrom = str;
        }
    }

    private boolean checkValid(String str) {
        return (str == null || TextUtils.isEmpty(str.trim()) || str.equals("undefined") || str.equals("null") || str.equals("0")) ? false : true;
    }

    private void concatScheme(Uri uri) {
        StringBuilder sb = new StringBuilder();
        String scheme = uri.getScheme();
        String host = uri.getHost();
        String path = uri.getPath();
        sb.append(scheme);
        sb.append("://");
        sb.append(host);
        b.b("/", path, "?from=", sb);
        sb.append(this.mFrom);
        sb.append("&mission_name=");
        sb.append(missionNameAvailable() ? this.mMissionInfo.getMissionName() : "");
        sb.append("&mission_id=");
        sb.append(missionIdAvailable() ? Integer.valueOf(this.mMissionInfo.getMissionId()) : "");
        sb.append("&topic_id=");
        sb.append(topicAvailable() ? Integer.valueOf(this.mMissionInfo.getTopicId()) : "");
        sb.append("&topic_name=");
        sb.append(topicNameAvailable() ? this.mMissionInfo.getTopicName() : "");
        if (schemeStickerAvailable()) {
            sb.append("&sticker_id=");
            sb.append(this.mMissionInfo.getStickerId());
        }
        if (schemeStickerV2Available()) {
            sb.append("&sticker_id_v2=");
            sb.append(this.mMissionInfo.getStickerIdV2());
        }
        if (schemeMusicAvailable()) {
            sb.append("&bgm_id=");
            sb.append(this.mMissionInfo.getBgmId());
            sb.append("&bgm_name=");
            sb.append(this.mMissionInfo.getBgmName());
        }
        if (schemeCooperateAvailable()) {
            sb.append("&cooperate_id=");
            sb.append(this.mCaptureCooperate.getCoorperateId());
        }
        if (schemeFilterAvailable()) {
            sb.append("&filter_id=");
            sb.append(this.mFilterId);
        }
        if (this.mSchemaInfo != null) {
            sb.append("&relation_from=");
            sb.append(Uri.encode(this.mSchemaInfo.mRelationFrom));
        }
        PostConfig postConfig = this.mPostConfig;
        if (postConfig != null) {
            String jSONString = JSON.toJSONString(postConfig);
            sb.append("&post_config=");
            sb.append(jSONString);
        }
        if (this.mMaterialIndex != 0) {
            sb.append("&material_index=");
            sb.append(this.mMaterialIndex);
        }
        for (Map.Entry<String, String> entry : this.mKeyValues.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append("&");
            sb.append((Object) key);
            sb.append("=");
            sb.append((Object) value);
        }
        BLog.d("jumpParams", "jumpParams = " + sb.toString());
        this.mMissionInfo.setJumpParams(sb.toString());
    }

    @Nullable
    public CaptureCooperate getCaptureCooperate() {
        return this.mCaptureCooperate;
    }

    public int getFilterId() {
        return this.mFilterId;
    }

    @NonNull
    public MissionInfo getFinalMissionInfo(boolean z6, CaptureStickerTopicBean captureStickerTopicBean) {
        int i7;
        if (this.mMissionInfo.isStickerTopicId() && ((captureStickerTopicBean == null || captureStickerTopicBean.topicId == 0) && (!z6 || !this.mMissionInfo.isCooperateTopicId()))) {
            MissionInfo missionInfo = this.mMissionInfo;
            missionInfo.resetByTopicId(missionInfo.getOriginTopicId());
        }
        if (this.mMissionInfo.isCooperateTopicId() && !z6) {
            MissionInfo missionInfo2 = this.mMissionInfo;
            missionInfo2.resetByTopicId(missionInfo2.getOriginTopicId());
            MissionInfo missionInfo3 = this.mMissionInfo;
            missionInfo3.resetJumpParamsTopicId(missionInfo3.getOriginTopicId());
        }
        if (z6 && topicAvailable() && this.mMissionInfo.isCooperateTopicId()) {
            return this.mMissionInfo;
        }
        if (captureStickerTopicBean != null && (i7 = captureStickerTopicBean.topicId) > 0) {
            this.mMissionInfo.setTopicId(i7);
            this.mMissionInfo.setTopicName(captureStickerTopicBean.topicName);
            this.mMissionInfo.setMissionId(captureStickerTopicBean.missionId);
            this.mMissionInfo.setStickerTopicId(true);
            return this.mMissionInfo;
        }
        if (topicAvailable() || missionAvailable()) {
            return this.mMissionInfo;
        }
        this.mMissionInfo.resetByTopicId(0);
        this.mMissionInfo.setStickerId(0);
        return this.mMissionInfo;
    }

    public int getFrom() {
        return this.mFrom;
    }

    @Nullable
    public String getJumpParams() {
        return this.mMissionInfo.getJumpParam();
    }

    public int getMaterialIndex() {
        return this.mMaterialIndex;
    }

    @Nullable
    public MissionInfo getMissionInfo() {
        return this.mMissionInfo;
    }

    @Nullable
    public PostConfig getPostConfig() {
        return this.mPostConfig;
    }

    @Nullable
    public SchemaInfo getSchemaInfo() {
        return this.mSchemaInfo;
    }

    public void invalidMission() {
        this.mMissionInfo.setMissionId(0);
        this.mMissionInfo.setMissionName("");
        this.mMissionInfo.setActivityName("");
        this.mMissionInfo.setJumpParams("");
    }

    public boolean missionAvailable() {
        return (this.mMissionInfo.getMissionId() == 0 || "".equals(this.mMissionInfo.getMissionName()) || OLD_INVALID_ID_STRING.equals(this.mMissionInfo.getMissionName())) ? false : true;
    }

    public boolean missionAvailable_v2() {
        return this.mMissionInfo.getMissionId() != 0;
    }

    public boolean missionIdAvailable() {
        return this.mMissionInfo.getMissionId() != 0;
    }

    public boolean missionNameAvailable() {
        return ("".equals(this.mMissionInfo.getMissionName()) || OLD_INVALID_ID_STRING.equals(this.mMissionInfo.getMissionName())) ? false : true;
    }

    public void parseJson(@Nullable String str) {
        parseJson(str, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0286  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parseJson(@androidx.annotation.Nullable java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 955
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema.parseJson(java.lang.String, java.lang.String):void");
    }

    public void parseJumpParams(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mMissionInfo.setJumpParams(str);
        this.mCaptureCooperate.setShouldResetCorporate(str.contains(COOPERATE_ID));
        Uri uri = Uri.parse(str);
        if (uri.isOpaque()) {
            return;
        }
        String queryParameter = uri.getQueryParameter(JUMP_PARAMS_RELATION_FROM);
        this.mMissionInfo.setFromCooperate(RELATION_FROM_COOPERATE.equals(queryParameter));
        if (this.isDraftSchemaUseCooperateTopicId) {
            this.mMissionInfo.setFromCooperate(true);
            this.isDraftSchemaUseCooperateTopicId = false;
        }
        if (RELATION_FROM_COOPERATE.equals(queryParameter)) {
            this.mMissionInfo.setCooperateTopicId(false);
            MissionInfo missionInfo = this.mMissionInfo;
            missionInfo.resetByTopicId(missionInfo.getOriginTopicId());
        }
        for (String str2 : uri.getQueryParameterNames()) {
            String queryParameter2 = uri.getQueryParameter(str2);
            if (queryParameter2 == null || TextUtils.isEmpty(queryParameter2.trim()) || queryParameter2.equals("undefined") || queryParameter2.equals("null") || queryParameter2.equals("0")) {
                if (this.mMissionInfo.getJumpParam() != null) {
                    MissionInfo missionInfo2 = this.mMissionInfo;
                    missionInfo2.setJumpParams(missionInfo2.getJumpParam().replace(z.a("&", str2, "=", queryParameter2), ""));
                }
            } else if (JUMP_PARAMS_FROM.equals(str2)) {
                if (S.b(queryParameter2)) {
                    this.mFrom = Integer.parseInt(queryParameter2);
                }
            } else if (MISSION_ACTIVITY_NAME.equals(str2)) {
                this.mMissionInfo.setActivityName(queryParameter2);
            } else if (MISSION_ID.equals(str2)) {
                if (S.b(queryParameter2)) {
                    this.mMissionInfo.setMissionId(Integer.parseInt(queryParameter2));
                }
            } else if (MISSION_BGM_ID.equals(str2)) {
                if (S.b(queryParameter2)) {
                    this.mMissionInfo.setBgmId(Integer.parseInt(queryParameter2));
                }
            } else if (MISSION_BGM_NAME.equals(str2)) {
                this.mMissionInfo.setBgmName(queryParameter2);
            } else if ("sticker_id".equals(str2)) {
                if (S.b(queryParameter2)) {
                    this.mMissionInfo.setStickerId(Integer.parseInt(queryParameter2));
                }
            } else if (MISSION_STICKER_ID_V2.equals(str2)) {
                if (S.b(queryParameter2)) {
                    this.mMissionInfo.setStickerIdV2(Integer.parseInt(queryParameter2));
                }
            } else if (MISSION_NAME.equals(str2)) {
                this.mMissionInfo.setMissionName(queryParameter2);
            } else if (COOPERATE_ID.equals(str2)) {
                if (S.b(queryParameter2)) {
                    this.mCaptureCooperate.setCoorperateId(Long.parseLong(queryParameter2));
                }
            } else if (FILTER_ID.equals(str2)) {
                this.mFilterId = S.c(queryParameter2);
            } else if (JUMP_PARAMS_RELATION_FROM.equals(str2)) {
                if (this.mSchemaInfo == null) {
                    this.mSchemaInfo = new SchemaInfo(queryParameter2, queryParameter2);
                } else if (!RELATION_FROM_COOPERATE.equals(queryParameter2)) {
                    this.mSchemaInfo.setRelationFrom(queryParameter2);
                }
            } else if (TOPIC_ID.equals(str2)) {
                if (S.b(queryParameter2)) {
                    this.mMissionInfo.setTopicId(Integer.parseInt(queryParameter2));
                    MissionInfo missionInfo3 = this.mMissionInfo;
                    missionInfo3.setCooperateTopicId(missionInfo3.isFromCooperate());
                    if (!this.mMissionInfo.isFromCooperate()) {
                        MissionInfo missionInfo4 = this.mMissionInfo;
                        missionInfo4.setOriginTopicId(missionInfo4.getTopicId());
                        this.mKeyValues.put(ORIGIN_TOPIC_ID, String.valueOf(this.mMissionInfo.getTopicId()));
                    }
                }
            } else if (TOPIC_NAME.equals(str2)) {
                this.mMissionInfo.setTopicName(queryParameter2);
            } else if (POST_CONFIG.equals(str2)) {
                try {
                    this.mPostConfig = (PostConfig) JSON.parseObject(queryParameter2, PostConfig.class);
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            } else if (MATERIAL_INDEX.equals(str2)) {
                try {
                    this.mMaterialIndex = Integer.parseInt(queryParameter2);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            } else {
                this.mKeyValues.put(str2, queryParameter2);
            }
            O.a("key = ", str2, "; value = ", queryParameter2, "jumpParams");
        }
        concatScheme(uri);
    }

    public void reset() {
        this.mMissionInfo.setMissionName("");
        this.mMissionInfo.setMissionId(0);
        this.mMissionInfo.setStickerId(0);
        this.mMissionInfo.setStickerIdV2(0);
        this.mMissionInfo.setBgmId(0L);
        this.mMissionInfo.setBgmName("");
        this.mCaptureCooperate.setCoorperateId(0L);
    }

    public void resetMissionInfoByCooperateTopicId(int i7) {
        this.mMissionInfo.resetByTopicId(i7);
        this.mMissionInfo.setCooperateTopicId(true);
        this.mMissionInfo.resetJumpParamsTopicId(i7);
    }

    public boolean schemeCooperateAvailable() {
        return this.mCaptureCooperate.getCoorperateId() != 0;
    }

    public boolean schemeFilterAvailable() {
        return this.mFilterId != 0;
    }

    public boolean schemeMusicAvailable() {
        return (this.mCaptureCooperate.getCoorperateId() != 0 || this.mMissionInfo.getBgmId() == 0 || TextUtils.isEmpty(this.mMissionInfo.getBgmName())) ? false : true;
    }

    public boolean schemeStickerAvailable() {
        return this.mMissionInfo.getStickerId() != 0;
    }

    public boolean schemeStickerV2Available() {
        return this.mMissionInfo.getStickerIdV2() != 0;
    }

    public void setDraftSchemaUseCooperateTopicId(boolean z6) {
        this.isDraftSchemaUseCooperateTopicId = z6;
    }

    public void setPostConfig(@Nullable PostConfig postConfig) {
        this.mPostConfig = postConfig;
    }

    public void setSchemaInfo(@Nullable SchemaInfo schemaInfo) {
        this.mSchemaInfo = schemaInfo;
    }

    public boolean topicAvailable() {
        return this.mMissionInfo.getTopicId() != 0;
    }

    public boolean topicNameAvailable() {
        return ("".equals(this.mMissionInfo.getTopicName()) || OLD_INVALID_ID_STRING.equals(this.mMissionInfo.getMissionName())) ? false : true;
    }
}
