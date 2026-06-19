package com.bilibili.studio.kaleidoscope.sdk;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/AssetPackageManager.class */
public interface AssetPackageManager {
    public static final int ASSET_PACKAGE_ASPECT_RATIO_16v9 = 1;
    public static final int ASSET_PACKAGE_ASPECT_RATIO_18v9 = 32;
    public static final int ASSET_PACKAGE_ASPECT_RATIO_1v1 = 2;
    public static final int ASSET_PACKAGE_ASPECT_RATIO_3v4 = 16;
    public static final int ASSET_PACKAGE_ASPECT_RATIO_4v3 = 8;
    public static final int ASSET_PACKAGE_ASPECT_RATIO_9v16 = 4;
    public static final int ASSET_PACKAGE_ASPECT_RATIO_9v18 = 64;
    public static final int ASSET_PACKAGE_MANAGER_ERROR_ALREADY_INSTALLED = 2;
    public static final int ASSET_PACKAGE_MANAGER_ERROR_ASSET_TYPE = 8;
    public static final int ASSET_PACKAGE_MANAGER_ERROR_DECOMPRESSION = 6;
    public static final int ASSET_PACKAGE_MANAGER_ERROR_IMPROPER_STATUS = 5;
    public static final int ASSET_PACKAGE_MANAGER_ERROR_INVALID_PACKAGE = 7;
    public static final int ASSET_PACKAGE_MANAGER_ERROR_IO = 13;
    public static final int ASSET_PACKAGE_MANAGER_ERROR_META_CONTENT = 10;
    public static final int ASSET_PACKAGE_MANAGER_ERROR_NAME = 1;
    public static final int ASSET_PACKAGE_MANAGER_ERROR_NOT_INSTALLED = 4;
    public static final int ASSET_PACKAGE_MANAGER_ERROR_NO_ERROR = 0;
    public static final int ASSET_PACKAGE_MANAGER_ERROR_PERMISSION = 9;
    public static final int ASSET_PACKAGE_MANAGER_ERROR_RESOURCE = 14;
    public static final int ASSET_PACKAGE_MANAGER_ERROR_SDK_VERSION = 11;
    public static final int ASSET_PACKAGE_MANAGER_ERROR_UPGRADE_VERSION = 12;
    public static final int ASSET_PACKAGE_MANAGER_ERROR_WORKING_INPROGRESS = 3;
    public static final int ASSET_PACKAGE_STATUS_INSTALLING = 1;
    public static final int ASSET_PACKAGE_STATUS_NOTINSTALLED = 0;
    public static final int ASSET_PACKAGE_STATUS_READY = 2;
    public static final int ASSET_PACKAGE_STATUS_UPGRADING = 3;
    public static final int ASSET_PACKAGE_TYPE_ANIMATEDSTICKER = 3;
    public static final int ASSET_PACKAGE_TYPE_ANIMATEDSTICKER_ANIMATION = 16;
    public static final int ASSET_PACKAGE_TYPE_ANIMATEDSTICKER_IN_ANIMATION = 17;
    public static final int ASSET_PACKAGE_TYPE_ANIMATEDSTICKER_OUT_ANIMATION = 18;
    public static final int ASSET_PACKAGE_TYPE_ARSCENE = 6;
    public static final int ASSET_PACKAGE_TYPE_AVATAR_MATERIAL = 15;
    public static final int ASSET_PACKAGE_TYPE_AVATAR_MODEL = 14;
    public static final int ASSET_PACKAGE_TYPE_CAPTIONSTYLE = 2;
    public static final int ASSET_PACKAGE_TYPE_CAPTION_ANIMATION = 10;
    public static final int ASSET_PACKAGE_TYPE_CAPTION_CONTEXT = 8;
    public static final int ASSET_PACKAGE_TYPE_CAPTION_IN_ANIMATION = 11;
    public static final int ASSET_PACKAGE_TYPE_CAPTION_OUT_ANIMATION = 12;
    public static final int ASSET_PACKAGE_TYPE_CAPTION_RENDERER = 9;
    public static final int ASSET_PACKAGE_TYPE_CAPTURESCENE = 5;
    public static final int ASSET_PACKAGE_TYPE_COMPOUND_CAPTION = 7;
    public static final int ASSET_PACKAGE_TYPE_FACE_MESH = 20;
    public static final int ASSET_PACKAGE_TYPE_MAKEUP = 19;
    public static final int ASSET_PACKAGE_TYPE_PROJECT = 22;
    public static final int ASSET_PACKAGE_TYPE_TEMPLATE = 13;
    public static final int ASSET_PACKAGE_TYPE_THEME = 4;
    public static final int ASSET_PACKAGE_TYPE_VIDEOFX = 0;
    public static final int ASSET_PACKAGE_TYPE_VIDEOTRANSITION = 1;
    public static final int ASSET_PACKAGE_TYPE_WARP = 21;
    public static final int TEIMPLATE_FOOTAGE_TYPE_AUDIO = 3;
    public static final int TEIMPLATE_FOOTAGE_TYPE_FREEZE_FRAME = 4;
    public static final int TEIMPLATE_FOOTAGE_TYPE_IMAGE = 2;
    public static final int TEIMPLATE_FOOTAGE_TYPE_VIDEO = 1;
    public static final int TEIMPLATE_FOOTAGE_TYPE_VIDEO_IMAGE = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/AssetPackageManager$AssetPackageManagerCallback.class */
    public interface AssetPackageManagerCallback {
        void onFinishAssetPackageInstallation(String str, String str2, int i7, int i8);

        void onFinishAssetPackageUpgrading(String str, String str2, int i7, int i8);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/AssetPackageManager$TemplateCaptionDesc.class */
    public interface TemplateCaptionDesc {
        String getReplaceId();

        Object getTemplateCaptionDesc();

        String getText();

        void setReplaceId(String str);

        void setTemplateCaptionDesc(Object obj);

        void setText(String str);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/AssetPackageManager$TemplateFootageCorrespondingClipInfo.class */
    public interface TemplateFootageCorrespondingClipInfo {
        int getClipIndex();

        long getInpoint();

        long getOutpoint();

        Object getTemplateFootageCorrespondingClipInfo();

        int getTrackIndex();

        void setClipIndex(int i7);

        void setInpoint(long j7);

        void setOutpoint(long j7);

        void setTemplateFootageCorrespondingClipInfo(Object obj);

        void setTrackIndex(int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/AssetPackageManager$TemplateFootageDesc.class */
    public interface TemplateFootageDesc {
        boolean getCanReplace();

        ArrayList<TemplateFootageCorrespondingClipInfo> getCorrespondingClipInfos();

        String getId();

        Object getTemplateFootageDesc();

        int getType();

        void setCanReplace(boolean z6);

        void setCorrespondingClipInfos(ArrayList<TemplateFootageCorrespondingClipInfo> arrayList);

        void setId(String str);

        void setTemplateFootageDesc(Object obj);

        void setType(int i7);
    }

    boolean changeTemplateAspectRatio(String str, int i7);

    Object getAssetPackageManager();

    int getAssetPackageSupportedAspectRatio(String str, int i7);

    List<ExpressionParam> getExpValueList(String str, int i7);

    List<TemplateCaptionDesc> getTemplateCaptions(String str);

    int getTemplateCurrentAspectRatio(String str);

    List<TemplateFootageDesc> getTemplateFootages(String str);

    Hashtable getTranslationMap(String str, int i7);

    int installAssetPackage(String str, String str2, int i7, boolean z6, StringBuilder sb);

    void setAssetPackageManager(Object obj);

    void setCallbackInterface(AssetPackageManagerCallback assetPackageManagerCallback);

    int uninstallAssetPackage(String str, int i7);
}
