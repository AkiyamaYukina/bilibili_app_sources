package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.MontageAssetPackageManager;
import com.bilibili.montage.avinfo.MontageExpressionParam;
import com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager;
import com.bilibili.studio.kaleidoscope.sdk.ExpressionParam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonAssetPackageManagerImpl.class */
public final class MonAssetPackageManagerImpl implements AssetPackageManager {
    private static final String TAG = "Mon.APM.Impl";
    private MontageAssetPackageManager mMontageAssetPackageManager;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonAssetPackageManagerImpl$MonTemplateCaptionDescImpl.class */
    public static final class MonTemplateCaptionDescImpl implements AssetPackageManager.TemplateCaptionDesc {
        private static final String TAG = "Mon.TCD.Impl";

        private MonTemplateCaptionDescImpl(@NonNull Object obj) {
            throw new IllegalStateException("Montage doesn't support TemplateCaptionDesc");
        }

        @NonNull
        public static AssetPackageManager.TemplateCaptionDesc box(@NonNull Object obj) {
            return null;
        }

        @NonNull
        public static Object unbox(@NonNull AssetPackageManager.TemplateCaptionDesc templateCaptionDesc) {
            return null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateCaptionDesc
        public String getReplaceId() {
            return null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateCaptionDesc
        public Object getTemplateCaptionDesc() {
            return null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateCaptionDesc
        public String getText() {
            return null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateCaptionDesc
        public void setReplaceId(String str) {
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateCaptionDesc
        public void setTemplateCaptionDesc(Object obj) {
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateCaptionDesc
        public void setText(String str) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonAssetPackageManagerImpl$MonTemplateFootageCorrespondingClipInfoImpl.class */
    public static final class MonTemplateFootageCorrespondingClipInfoImpl implements AssetPackageManager.TemplateFootageCorrespondingClipInfo {
        private static final String TAG = "Mon.TFCCI.Impl";
        private MontageAssetPackageManager.MontageTemplateFootageCorrespondingClipInfo mMonTemplateFootageCorrespondingClipInfo;

        private MonTemplateFootageCorrespondingClipInfoImpl(@NonNull MontageAssetPackageManager.MontageTemplateFootageCorrespondingClipInfo montageTemplateFootageCorrespondingClipInfo) {
            this.mMonTemplateFootageCorrespondingClipInfo = montageTemplateFootageCorrespondingClipInfo;
        }

        @NonNull
        public static AssetPackageManager.TemplateFootageCorrespondingClipInfo box(@NonNull MontageAssetPackageManager.MontageTemplateFootageCorrespondingClipInfo montageTemplateFootageCorrespondingClipInfo) {
            return new MonTemplateFootageCorrespondingClipInfoImpl(montageTemplateFootageCorrespondingClipInfo);
        }

        @NonNull
        public static MontageAssetPackageManager.MontageTemplateFootageCorrespondingClipInfo unbox(@NonNull AssetPackageManager.TemplateFootageCorrespondingClipInfo templateFootageCorrespondingClipInfo) {
            return (MontageAssetPackageManager.MontageTemplateFootageCorrespondingClipInfo) templateFootageCorrespondingClipInfo.getTemplateFootageCorrespondingClipInfo();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageCorrespondingClipInfo
        public int getClipIndex() {
            return this.mMonTemplateFootageCorrespondingClipInfo.clipIndex;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageCorrespondingClipInfo
        public long getInpoint() {
            return this.mMonTemplateFootageCorrespondingClipInfo.inpoint;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageCorrespondingClipInfo
        public long getOutpoint() {
            return this.mMonTemplateFootageCorrespondingClipInfo.outpoint;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageCorrespondingClipInfo
        public Object getTemplateFootageCorrespondingClipInfo() {
            return this.mMonTemplateFootageCorrespondingClipInfo;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageCorrespondingClipInfo
        public int getTrackIndex() {
            return this.mMonTemplateFootageCorrespondingClipInfo.trackIndex;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageCorrespondingClipInfo
        public void setClipIndex(int i7) {
            this.mMonTemplateFootageCorrespondingClipInfo.clipIndex = i7;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageCorrespondingClipInfo
        public void setInpoint(long j7) {
            this.mMonTemplateFootageCorrespondingClipInfo.inpoint = j7;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageCorrespondingClipInfo
        public void setOutpoint(long j7) {
            this.mMonTemplateFootageCorrespondingClipInfo.outpoint = j7;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageCorrespondingClipInfo
        public void setTemplateFootageCorrespondingClipInfo(Object obj) {
            this.mMonTemplateFootageCorrespondingClipInfo = (MontageAssetPackageManager.MontageTemplateFootageCorrespondingClipInfo) obj;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageCorrespondingClipInfo
        public void setTrackIndex(int i7) {
            this.mMonTemplateFootageCorrespondingClipInfo.trackIndex = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonAssetPackageManagerImpl$MonTemplateFootageDescImpl.class */
    public static final class MonTemplateFootageDescImpl implements AssetPackageManager.TemplateFootageDesc {
        private static final String TAG = "Mon.TFD.Impl";
        private MontageAssetPackageManager.MontageTemplateFootageDesc mMontageTemplateFootageDesc;

        private MonTemplateFootageDescImpl(@NonNull MontageAssetPackageManager.MontageTemplateFootageDesc montageTemplateFootageDesc) {
            this.mMontageTemplateFootageDesc = montageTemplateFootageDesc;
        }

        @NonNull
        public static AssetPackageManager.TemplateFootageDesc box(@NonNull MontageAssetPackageManager.MontageTemplateFootageDesc montageTemplateFootageDesc) {
            return new MonTemplateFootageDescImpl(montageTemplateFootageDesc);
        }

        @NonNull
        public static MontageAssetPackageManager.MontageTemplateFootageDesc unbox(@NonNull AssetPackageManager.TemplateFootageDesc templateFootageDesc) {
            return (MontageAssetPackageManager.MontageTemplateFootageDesc) templateFootageDesc.getTemplateFootageDesc();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageDesc
        public boolean getCanReplace() {
            return this.mMontageTemplateFootageDesc.canReplace;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageDesc
        public ArrayList<AssetPackageManager.TemplateFootageCorrespondingClipInfo> getCorrespondingClipInfos() {
            ArrayList<MontageAssetPackageManager.MontageTemplateFootageCorrespondingClipInfo> arrayList = this.mMontageTemplateFootageDesc.correspondingClipInfos;
            ArrayList<AssetPackageManager.TemplateFootageCorrespondingClipInfo> arrayList2 = new ArrayList<>();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<MontageAssetPackageManager.MontageTemplateFootageCorrespondingClipInfo> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(MonTemplateFootageCorrespondingClipInfoImpl.box(it.next()));
                }
            }
            return arrayList2;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageDesc
        public String getId() {
            return this.mMontageTemplateFootageDesc.id;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageDesc
        public Object getTemplateFootageDesc() {
            return this.mMontageTemplateFootageDesc;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageDesc
        public int getType() {
            return this.mMontageTemplateFootageDesc.type;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageDesc
        public void setCanReplace(boolean z6) {
            this.mMontageTemplateFootageDesc.canReplace = z6;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageDesc
        public void setCorrespondingClipInfos(ArrayList<AssetPackageManager.TemplateFootageCorrespondingClipInfo> arrayList) {
            Objects.toString(arrayList);
            ArrayList<MontageAssetPackageManager.MontageTemplateFootageCorrespondingClipInfo> arrayList2 = new ArrayList<>(arrayList.size());
            Iterator<AssetPackageManager.TemplateFootageCorrespondingClipInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(MonTemplateFootageCorrespondingClipInfoImpl.unbox(it.next()));
            }
            this.mMontageTemplateFootageDesc.correspondingClipInfos = arrayList2;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageDesc
        public void setId(String str) {
            this.mMontageTemplateFootageDesc.id = str;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageDesc
        public void setTemplateFootageDesc(Object obj) {
            this.mMontageTemplateFootageDesc = (MontageAssetPackageManager.MontageTemplateFootageDesc) obj;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager.TemplateFootageDesc
        public void setType(int i7) {
            this.mMontageTemplateFootageDesc.type = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonAssetPackageManagerImpl$a.class */
    public static final class a implements MontageAssetPackageManager.AssetPackageManagerCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetPackageManager.AssetPackageManagerCallback f108385a;

        public a(@NonNull AssetPackageManager.AssetPackageManagerCallback assetPackageManagerCallback) {
            this.f108385a = assetPackageManagerCallback;
        }

        @Override // com.bilibili.montage.MontageAssetPackageManager.AssetPackageManagerCallback
        public final void onFinishAssetPackageInstallation(String str, String str2, int i7, int i8) {
            this.f108385a.onFinishAssetPackageInstallation(str, str2, i7, i8);
        }

        @Override // com.bilibili.montage.MontageAssetPackageManager.AssetPackageManagerCallback
        public final void onFinishAssetPackageUpgrading(String str, String str2, int i7, int i8) {
            this.f108385a.onFinishAssetPackageUpgrading(str, str2, i7, i8);
        }
    }

    private MonAssetPackageManagerImpl(@NonNull MontageAssetPackageManager montageAssetPackageManager) {
        this.mMontageAssetPackageManager = montageAssetPackageManager;
    }

    @NonNull
    public static AssetPackageManager box(@NonNull MontageAssetPackageManager montageAssetPackageManager) {
        return new MonAssetPackageManagerImpl(montageAssetPackageManager);
    }

    @NonNull
    public static MontageAssetPackageManager unbox(@NonNull AssetPackageManager assetPackageManager) {
        return (MontageAssetPackageManager) assetPackageManager.getAssetPackageManager();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager
    public boolean changeTemplateAspectRatio(String str, int i7) {
        return this.mMontageAssetPackageManager.changeTemplateAspectRatio(str, i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager
    public Object getAssetPackageManager() {
        return this.mMontageAssetPackageManager;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager
    public int getAssetPackageSupportedAspectRatio(String str, int i7) {
        return this.mMontageAssetPackageManager.getAssetPackageSupportedAspectRatio(str, i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager
    public List<ExpressionParam> getExpValueList(String str, int i7) {
        List<MontageExpressionParam> expValueList = this.mMontageAssetPackageManager.getExpValueList(str, i7);
        ArrayList arrayList = new ArrayList();
        if (expValueList != null && expValueList.size() > 0) {
            Iterator<MontageExpressionParam> it = expValueList.iterator();
            while (it.hasNext()) {
                arrayList.add(MonExpressionParamImpl.box(it.next()));
            }
        }
        return arrayList;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager
    public List<AssetPackageManager.TemplateCaptionDesc> getTemplateCaptions(String str) {
        return Collections.emptyList();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager
    public int getTemplateCurrentAspectRatio(String str) {
        return this.mMontageAssetPackageManager.getTemplateCurrentAspectRatio(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager
    public List<AssetPackageManager.TemplateFootageDesc> getTemplateFootages(String str) {
        List<MontageAssetPackageManager.MontageTemplateFootageDesc> templateFootages = this.mMontageAssetPackageManager.getTemplateFootages(str);
        ArrayList arrayList = new ArrayList();
        if (templateFootages != null && !templateFootages.isEmpty()) {
            Iterator<MontageAssetPackageManager.MontageTemplateFootageDesc> it = templateFootages.iterator();
            while (it.hasNext()) {
                arrayList.add(MonTemplateFootageDescImpl.box(it.next()));
            }
        }
        return arrayList;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager
    public Hashtable getTranslationMap(String str, int i7) {
        return this.mMontageAssetPackageManager.getTranslationMap(str, i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager
    public int installAssetPackage(String str, String str2, int i7, boolean z6, StringBuilder sb) {
        return this.mMontageAssetPackageManager.installAssetPackage(str, str2, i7, z6, sb);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager
    public void setAssetPackageManager(Object obj) {
        this.mMontageAssetPackageManager = (MontageAssetPackageManager) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager
    public void setCallbackInterface(AssetPackageManager.AssetPackageManagerCallback assetPackageManagerCallback) {
        Objects.toString(assetPackageManagerCallback);
        this.mMontageAssetPackageManager.setCallbackInterface(assetPackageManagerCallback != null ? new a(assetPackageManagerCallback) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AssetPackageManager
    public int uninstallAssetPackage(String str, int i7) {
        return this.mMontageAssetPackageManager.uninstallAssetPackage(str, i7);
    }
}
