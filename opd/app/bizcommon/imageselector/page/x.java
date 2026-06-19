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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/x.class */
public final class x implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.LongRef f73939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f73940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MallMediaPreviewFragment f73941c;

    public x(Ref.LongRef longRef, View view, MallMediaPreviewFragment mallMediaPreviewFragment) {
        this.f73939a = longRef;
        this.f73940b = view;
        this.f73941c = mallMediaPreviewFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        FragmentActivity fragmentActivity;
        String sceneType;
        String domainUpType;
        String videoProfile;
        String bossKey;
        String domain;
        String bossUploadUrl;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.LongRef longRef = this.f73939a;
        long j7 = longRef.element;
        longRef.element = System.currentTimeMillis();
        if (jCurrentTimeMillis - j7 < BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE || (arrayList = this.f73941c.f73844o) == null || arrayList.isEmpty()) {
            return;
        }
        if (!this.f73941c.f73846q.isNeedUpload()) {
            ArrayList<MallImageMedia> arrayList2 = Jm0.B.f11518a;
            Jm0.B.f11518a = this.f73941c.f73844o;
            Jm0.B.f11519b = this.f73941c.f73846q;
            WeakReference<FragmentActivity> weakReference = Jm0.q.f11566a;
            if (weakReference != null && (fragmentActivity = weakReference.get()) != null) {
                fragmentActivity.finish();
            }
            this.f73941c.finishAttachedActivity();
            return;
        }
        FragmentActivity fragmentActivityP3 = this.f73941c.p3();
        if (fragmentActivityP3 != null) {
            this.f73941c.f73842m = new DialogC2679a(fragmentActivityP3);
            DialogC2679a dialogC2679a = this.f73941c.f73842m;
            if (dialogC2679a != null) {
                dialogC2679a.show();
            }
            MallMediaParams mallMediaParams = this.f73941c.f73846q;
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
            ArrayList<BaseMedia> arrayList3 = this.f73941c.f73844o;
            boolean zIsOriginalMedia = this.f73941c.f73846q.isOriginalMedia();
            boolean zIsSync = this.f73941c.f73846q.isSync();
            MallMediaUploadOption mallMediaUploadOption = new MallMediaUploadOption();
            mallMediaUploadOption.setSceneType(sceneType);
            mallMediaUploadOption.setDomain(domain);
            mallMediaUploadOption.setDomainUpType(domainUpType);
            mallMediaUploadOption.setVideoProfile(videoProfile);
            mallMediaUploadOption.setMedias(arrayList3);
            mallMediaUploadOption.setOriginal(zIsOriginalMedia);
            mallMediaUploadOption.setSync(zIsSync);
            mallMediaUploadOption.setBossKey(bossKey);
            mallMediaUploadOption.setBossUploadUrl(bossUploadUrl);
            WeakReference weakReference2 = new WeakReference(this.f73941c);
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
