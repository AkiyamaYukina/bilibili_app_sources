package com.bilibili.opd.app.bizcommon.imageselector.page;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.boxing.model.entity.BaseMedia;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.opd.app.bizcommon.imageselector.component.IMallMediaExternalService;
import com.bilibili.opd.app.bizcommon.imageselector.component.MallMediaUploadOption;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.imageselector.page.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/o.class */
public final class ViewOnClickListenerC5562o implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.LongRef f73917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f73918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MallMediaFragment f73919c;

    public ViewOnClickListenerC5562o(Ref.LongRef longRef, View view, MallMediaFragment mallMediaFragment) {
        this.f73917a = longRef;
        this.f73918b = view;
        this.f73919c = mallMediaFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String sceneType;
        String domainUpType;
        String videoProfile;
        String bossKey;
        String domain;
        String bossUploadUrl;
        ArrayList<BaseMedia> arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.LongRef longRef = this.f73917a;
        long j7 = longRef.element;
        longRef.element = System.currentTimeMillis();
        if (jCurrentTimeMillis - j7 < BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE) {
            return;
        }
        ArrayList<BaseMedia> arrayList2 = new ArrayList<>();
        Jm0.f fVar = this.f73919c.f73797t;
        if (fVar != null && (arrayList = fVar.f11537d) != null) {
            Iterator<BaseMedia> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next());
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        MallMediaFragment.access$getMSubmitSelectedListener$p(this.f73919c);
        if (!this.f73919c.getMmParams().isNeedUpload()) {
            Jm0.B.f11518a = arrayList2;
            Jm0.B.f11519b = this.f73919c.getMmParams();
            this.f73919c.finishAttachedActivity();
            return;
        }
        FragmentActivity fragmentActivityP3 = this.f73919c.p3();
        if (fragmentActivityP3 != null) {
            this.f73919c.mf(fragmentActivityP3);
            MallMediaParams mmParams = this.f73919c.getMmParams();
            if (mmParams != null) {
                sceneType = mmParams.getSceneType();
                domain = mmParams.getDomain();
                domainUpType = mmParams.getDomainUpType();
                videoProfile = mmParams.getVideoProfile();
                bossUploadUrl = mmParams.getBossUploadUrl();
                bossKey = mmParams.getBossKey();
            } else {
                sceneType = "";
                domainUpType = "mall";
                videoProfile = MallMediaParams.VIDEO_PROFILE_DEF;
                bossKey = "";
                domain = "";
                bossUploadUrl = domain;
            }
            boolean zIsOriginalMedia = this.f73919c.getMmParams().isOriginalMedia();
            boolean zIsSync = this.f73919c.getMmParams().isSync();
            MallMediaUploadOption mallMediaUploadOption = new MallMediaUploadOption();
            mallMediaUploadOption.setSceneType(sceneType);
            mallMediaUploadOption.setDomain(domain);
            mallMediaUploadOption.setDomainUpType(domainUpType);
            mallMediaUploadOption.setVideoProfile(videoProfile);
            mallMediaUploadOption.setMedias(arrayList2);
            mallMediaUploadOption.setOriginal(zIsOriginalMedia);
            mallMediaUploadOption.setSync(zIsSync);
            mallMediaUploadOption.setBossKey(bossKey);
            mallMediaUploadOption.setBossUploadUrl(bossUploadUrl);
            WeakReference weakReference = new WeakReference(this.f73919c);
            try {
                BLRouter bLRouter = BLRouter.INSTANCE;
                o00.a.a();
                IMallMediaExternalService iMallMediaExternalService = (IMallMediaExternalService) bLRouter.getServices(IMallMediaExternalService.class).get(mallMediaUploadOption.getSceneType());
                if (iMallMediaExternalService == null) {
                    return;
                }
                iMallMediaExternalService.uploadMedia(mallMediaUploadOption, new Jm0.p(weakReference, 0));
            } catch (Exception e7) {
                BLog.e("MallMediaFinishHelper", e7.getMessage());
            }
        }
    }
}
