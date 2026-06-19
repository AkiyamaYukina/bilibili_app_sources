package com.bilibili.montage;

import android.os.Handler;
import android.os.Looper;
import com.bilibili.montage.avinfo.MontageExpressionParam;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageAssetPackageManager.class */
public class MontageAssetPackageManager {
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
    public static final int ASSET_PACKAGE_TYPE_OVERLAP_VIDEOTRANSITION = 23;
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
    private AssetPackageManagerCallback mAssetPackageManagerCallback;
    private long mInternalObj = 0;
    private long mInternalCallbackObj = 0;
    private long mInternalTemplateCallbackObj = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageAssetPackageManager$AssetPackageManagerCallback.class */
    public interface AssetPackageManagerCallback {
        void onFinishAssetPackageInstallation(String str, String str2, int i7, int i8);

        void onFinishAssetPackageUpgrading(String str, String str2, int i7, int i8);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageAssetPackageManager$AssetPackageManagerError.class */
    public enum AssetPackageManagerError {
        NO_ERROR,
        ERROR_NAME,
        ALREADY_INSTALLED,
        ERROR_DECOMPRESSION,
        ERROR_INVALID_PACKAGE,
        ERROR_ASSET_TYPE,
        ERROR_SDK_VERSION,
        ERROR_IO,
        ERROR_RESOURCE,
        ERROR_UNKNOWN
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageAssetPackageManager$AssetPackageType.class */
    public enum AssetPackageType {
        THEME,
        TEMPLATE
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageAssetPackageManager$MontageTemplateCaptionDesc.class */
    public static class MontageTemplateCaptionDesc {
        public int clipIndex;
        public String replaceId;
        public ArrayList<MontageTemplateCaptionDesc> subCaptions;
        public String text;
        public int trackIndex;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageAssetPackageManager$MontageTemplateFootageCorrespondingClipInfo.class */
    public static class MontageTemplateFootageCorrespondingClipInfo {
        public boolean canReplace;
        public int clipIndex;
        public long inpoint;
        public boolean needReverse;
        public long outpoint;
        public int trackIndex;
        public long trimIn;
        public long trimOut;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageAssetPackageManager$MontageTemplateFootageDesc.class */
    public static class MontageTemplateFootageDesc {
        public boolean canReplace;
        public ArrayList<MontageTemplateFootageCorrespondingClipInfo> correspondingClipInfos;
        public String id;
        public String innerAssetFilePath;
        public ArrayList<String> tags;
        public ArrayList<MontageTemplateFootageDesc> timelineClipFootages;
        public int type;
    }

    public MontageAssetPackageManager() {
    }

    public MontageAssetPackageManager(boolean z6) {
    }

    private native int nativeGetAssetSupportAspect(long j7, String str, int i7);

    private native List<MontageExpressionParam> nativeGetExpValueList(long j7, String str, int i7);

    private native Hashtable nativeGetTranslationMap(long j7, String str, int i7);

    private native int nativeInstallAssetPackage(long j7, String str, String str2, int i7, boolean z6, StringBuilder sb);

    private native int nativeUninstallAssetPackage(long j7, String str, int i7);

    public boolean changeTemplateAspectRatio(String str, int i7) {
        return false;
    }

    public int getAssetPackageSupportedAspectRatio(String str, int i7) {
        return nativeGetAssetSupportAspect(this.mInternalObj, str, i7);
    }

    public List<MontageExpressionParam> getExpValueList(String str, int i7) {
        return nativeGetExpValueList(this.mInternalObj, str, i7);
    }

    public List<MontageTemplateCaptionDesc> getTemplateCaptions(String str) {
        return null;
    }

    public int getTemplateCurrentAspectRatio(String str) {
        return 0;
    }

    public List<MontageTemplateFootageDesc> getTemplateFootages(String str) {
        return new ArrayList();
    }

    public Hashtable getTranslationMap(String str, int i7) {
        return nativeGetTranslationMap(this.mInternalObj, str, i7);
    }

    public int installAssetPackage(String str, String str2, int i7, boolean z6, StringBuilder sb) {
        int iNativeInstallAssetPackage = nativeInstallAssetPackage(this.mInternalObj, str, str2, i7, z6, sb);
        if (!z6) {
            new Handler(Looper.getMainLooper()).post(new Runnable(this, sb, str, i7, iNativeInstallAssetPackage) { // from class: com.bilibili.montage.MontageAssetPackageManager.1
                final MontageAssetPackageManager this$0;
                final String val$assetPackageFilePath;
                final StringBuilder val$assetPackageId;
                final int val$error;
                final int val$type;

                {
                    this.this$0 = this;
                    this.val$assetPackageId = sb;
                    this.val$assetPackageFilePath = str;
                    this.val$type = i7;
                    this.val$error = iNativeInstallAssetPackage;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (this.this$0.mAssetPackageManagerCallback != null) {
                        this.this$0.mAssetPackageManagerCallback.onFinishAssetPackageInstallation(this.val$assetPackageId.toString(), this.val$assetPackageFilePath, this.val$type, this.val$error);
                    }
                }
            });
        }
        return iNativeInstallAssetPackage;
    }

    public boolean isThemeContainMusic(String str) {
        return false;
    }

    public void setCallbackInterface(AssetPackageManagerCallback assetPackageManagerCallback) {
        this.mAssetPackageManagerCallback = assetPackageManagerCallback;
    }

    public int uninstallAssetPackage(String str, int i7) {
        return nativeUninstallAssetPackage(this.mInternalObj, str, i7);
    }
}
