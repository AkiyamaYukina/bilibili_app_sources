package com.bilibili.opd.app.bizcommon.imageselector.page;

import Mm0.DialogC2679a;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.boxing.model.entity.BaseMedia;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.opd.app.bizcommon.imageselector.component.IMallMediaExternalService;
import com.bilibili.opd.app.bizcommon.imageselector.component.MallMediaUploadOption;
import com.bilibili.opd.app.bizcommon.imageselector.media.MallImageMedia;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/I.class */
public final class I implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.LongRef f73763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f73764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MallMediaTakePhotoFragment f73765c;

    public I(Ref.LongRef longRef, View view, MallMediaTakePhotoFragment mallMediaTakePhotoFragment) {
        this.f73763a = longRef;
        this.f73764b = view;
        this.f73765c = mallMediaTakePhotoFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        File file;
        FragmentActivity fragmentActivity;
        String sceneType;
        String domainUpType;
        String videoProfile;
        String bossKey;
        String domain;
        String bossUploadUrl;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.LongRef longRef = this.f73763a;
        long j7 = longRef.element;
        longRef.element = System.currentTimeMillis();
        if (jCurrentTimeMillis - j7 >= BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE && (file = this.f73765c.f73864k) != null && file.exists()) {
            ArrayList<BaseMedia> arrayListArrayListOf = CollectionsKt.arrayListOf(new BaseMedia[]{new MallImageMedia(file)});
            if (!this.f73765c.f73866m.isNeedUpload()) {
                Jm0.B.f11518a = arrayListArrayListOf;
                Jm0.B.f11519b = this.f73765c.f73866m;
                WeakReference<FragmentActivity> weakReference = Jm0.q.f11566a;
                if (weakReference != null && (fragmentActivity = weakReference.get()) != null) {
                    fragmentActivity.finish();
                }
                this.f73765c.finishAttachedActivity();
                return;
            }
            FragmentActivity fragmentActivityP3 = this.f73765c.p3();
            if (fragmentActivityP3 != null) {
                this.f73765c.f73862i = new DialogC2679a(fragmentActivityP3);
                DialogC2679a dialogC2679a = this.f73765c.f73862i;
                if (dialogC2679a != null) {
                    dialogC2679a.show();
                }
                MallMediaParams mallMediaParams = this.f73765c.f73866m;
                if (mallMediaParams != null) {
                    sceneType = mallMediaParams.getSceneType();
                    domain = mallMediaParams.getDomain();
                    domainUpType = mallMediaParams.getDomainUpType();
                    videoProfile = mallMediaParams.getVideoProfile();
                    bossUploadUrl = mallMediaParams.getBossUploadUrl();
                    bossKey = mallMediaParams.getBossKey();
                } else {
                    sceneType = "";
                    domainUpType = "mall";
                    videoProfile = MallMediaParams.VIDEO_PROFILE_DEF;
                    bossKey = "";
                    domain = "";
                    bossUploadUrl = domain;
                }
                boolean zIsSync = this.f73765c.f73866m.isSync();
                MallMediaUploadOption mallMediaUploadOption = new MallMediaUploadOption();
                mallMediaUploadOption.setSceneType(sceneType);
                mallMediaUploadOption.setDomain(domain);
                mallMediaUploadOption.setDomainUpType(domainUpType);
                mallMediaUploadOption.setVideoProfile(videoProfile);
                mallMediaUploadOption.setMedias(arrayListArrayListOf);
                mallMediaUploadOption.setOriginal(true);
                mallMediaUploadOption.setSync(zIsSync);
                mallMediaUploadOption.setBossKey(bossKey);
                mallMediaUploadOption.setBossUploadUrl(bossUploadUrl);
                WeakReference weakReference2 = new WeakReference(this.f73765c);
                try {
                    BLRouter bLRouter = BLRouter.INSTANCE;
                    o00.a.a();
                    IMallMediaExternalService iMallMediaExternalService = (IMallMediaExternalService) bLRouter.getServices(IMallMediaExternalService.class).get(mallMediaUploadOption.getSceneType());
                    if (iMallMediaExternalService == null) {
                        return;
                    }
                    iMallMediaExternalService.uploadMedia(mallMediaUploadOption, new Jm0.p(weakReference2, 0));
                } catch (Exception e7) {
                    BLog.e("MallMediaFinishHelper", e7.getMessage());
                }
            }
        }
    }
}
